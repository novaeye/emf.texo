/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ModelEMFConverter.java,v 1.27 2011/09/14 15:35:53 mtaal Exp $
 */

package org.eclipse.emf.texo.converter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.ComponentProvider;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.resolver.DefaultObjectResolver;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Base class for model to another format converter.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public abstract class ModelToConverter {

  // list of objects that are to be proxied
  private List<Object> proxyObjects = new ArrayList<Object>();
  private List<Object> nonProxiedObjects = new ArrayList<Object>();

  /**
   * If true then referenced non contained objects are also converted and added to the conversion stack.
   */
  private boolean convertNonContainedReferencedObjects = false;

  /**
   * How many levels of child objects should be traversed before using proxy objects and stop converting
   */
  private int maxChildLevelsToConvert = Integer.MAX_VALUE;

  /**
   * The object resolver responsible for creating uri's and objects.
   */
  private ObjectResolver objectResolver = ComponentProvider.getInstance().newInstance(DefaultObjectResolver.class);

  protected void doBaseActions(List<Object> objects) {
    if (objectResolver != null
        && (!convertNonContainedReferencedObjects || maxChildLevelsToConvert < Integer.MAX_VALUE)) {
      computeProxyObjects(objects);
    }
    // make sure that the non proxied objects don't get proxied
    proxyObjects.removeAll(nonProxiedObjects);
  }

  protected void computeProxyObjects(final List<Object> objects) {
    for (Object o : objects) {
      traverseEReferencesForProxyDetermination(o, 0);
    }
  }

  protected void traverseEReferencesForProxyDetermination(Object object, int level) {

    // special case, a query can return an array, allows jsonizing this
    // to be send to the client
    if (object.getClass().isArray()) {
      for (int i = 0; i < Array.getLength(object); i++) {
        final Object value = Array.get(object, i);
        if (ModelResolver.getInstance().isModelEnabled(value)) {
          traverseEReferencesForProxyDetermination(value, level);
        }
      }
      return;
    }

    nonProxiedObjects.add(object);

    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
    final boolean proxyChildObjects = level == maxChildLevelsToConvert;
    for (EReference eReference : modelObject.eClass().getEAllReferences()) {
      if (eReference.isVolatile() || eReference.isTransient()) {
        continue;
      }
      final Object value = modelObject.eGet(eReference);
      if (value == null) {
        continue;
      }
      if (eReference.isContainment()) {
        if (!proxyChildObjects) {
          if (value instanceof Collection<?>) {
            for (Object o : (Collection<?>) value) {
              traverseEReferencesForProxyDetermination(o, level + 1);
            }
          } else if (value instanceof Map<?, ?>) {
            final Map<?, ?> map = (Map<?, ?>) value;
            for (Object key : map.keySet()) {
              final Object keyValue = map.get(key);
              if (ModelResolver.getInstance().isModelEnabled(key)) {
                traverseEReferencesForProxyDetermination(key, level + 1);
              }
              if (ModelResolver.getInstance().isModelEnabled(keyValue)) {
                traverseEReferencesForProxyDetermination(keyValue, level + 1);
              }
            }
          } else {
            traverseEReferencesForProxyDetermination(value, level + 1);
          }
          continue;
        }
      } else if (convertNonContainedReferencedObjects) {
        if (value instanceof Collection<?>) {
          for (Object o : (Collection<?>) value) {
            traverseEReferencesForProxyDetermination(o, level);
          }
        } else if (value instanceof Map<?, ?>) {
          final Map<?, ?> map = (Map<?, ?>) value;
          for (Object key : map.keySet()) {
            final Object keyValue = map.get(key);
            if (ModelResolver.getInstance().isModelEnabled(key)) {
              traverseEReferencesForProxyDetermination(key, level + 1);
            }
            if (ModelResolver.getInstance().isModelEnabled(keyValue)) {
              traverseEReferencesForProxyDetermination(keyValue, level + 1);
            }
          }
        } else {
          traverseEReferencesForProxyDetermination(value, level);
        }
        continue;
      }
      if (value instanceof Collection<?>) {
        proxyObjects.addAll((Collection<?>) value);
      } else {
        proxyObjects.add(value);
      }
    }
  }

  /**
   * If a non-null value is returned then the content of the modelObject is not converted.
   * 
   * The default implementation returns null.
   * 
   * @param modelObject
   *          the modelObject to get the proxy id for
   * @return the proxy uri, should encode the type of the object as well as its id
   */
  protected org.eclipse.emf.common.util.URI getProxyId(final ModelObject<?> modelObject) {
    return objectResolver.toUri(modelObject.getTarget());
  }

  // if the value is a featuregroup then walk through the structure to
  // find the deepest one
  protected Object findValue(ModelFeatureMapEntry<?> modelFeatureMap) {
    if (FeatureMapUtil.isFeatureMap(modelFeatureMap.getEStructuralFeature())) {
      final ModelFeatureMapEntry<?> modelFeatureMapEntry = ModelResolver.getInstance().getModelFeatureMapEntry(
          modelFeatureMap.getEStructuralFeature(), modelFeatureMap.getValue());

      return findValue(modelFeatureMapEntry);
    }
    return modelFeatureMap.getValue();
  }

  protected EStructuralFeature findFeature(ModelFeatureMapEntry<?> modelFeatureMap) {
    if (FeatureMapUtil.isFeatureMap(modelFeatureMap.getEStructuralFeature())) {
      final ModelFeatureMapEntry<?> modelFeatureMapEntry = ModelResolver.getInstance().getModelFeatureMapEntry(
          modelFeatureMap.getEStructuralFeature(), modelFeatureMap.getValue());

      return findFeature(modelFeatureMapEntry);
    }
    return modelFeatureMap.getEStructuralFeature();
  }

  /**
   * See the javadoc in the {@link ModelUtils#getEnumBaseDataTypeIfObject(EDataType)} for details.
   * 
   * @param eDataType
   * @return the passed EDataType or its base type if the base type is an EEnum
   */
  protected EDataType getDataTypeOrBaseType(EDataType eDataType) {
    final EDataType baseType = ModelUtils.getEnumBaseDataTypeIfObject(eDataType);
    if (baseType != null) {
      return baseType;
    }
    return eDataType;
  }

  public boolean isConvertNonContainedReferencedObjects() {
    return convertNonContainedReferencedObjects;
  }

  public void setConvertNonContainedReferencedObjects(boolean convertNonContainedReferencedObjects) {
    this.convertNonContainedReferencedObjects = convertNonContainedReferencedObjects;
  }

  public int getMaxChildLevelsToConvert() {
    return maxChildLevelsToConvert;
  }

  public void setMaxChildLevelsToConvert(int maxChildLevelsToConvert) {
    this.maxChildLevelsToConvert = maxChildLevelsToConvert;
  }

  public ObjectResolver getUriResolver() {
    return objectResolver;
  }

  public void setUriResolver(ObjectResolver uriResolver) {
    objectResolver = uriResolver;
  }

  public List<Object> getProxyObjects() {
    return proxyObjects;
  }

  public void setProxyObjects(List<Object> proxyObjects) {
    this.proxyObjects = proxyObjects;
  }

  public List<Object> getNonProxiedObjects() {
    return nonProxiedObjects;
  }

  public void setNonProxiedObjects(List<Object> nonProxiedObjects) {
    this.nonProxiedObjects = nonProxiedObjects;
  }

}