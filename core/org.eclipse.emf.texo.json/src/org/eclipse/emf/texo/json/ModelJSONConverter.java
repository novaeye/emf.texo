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

package org.eclipse.emf.texo.json;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.converter.ModelToConverter;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.provider.TitleProvider;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Converts a Texo object to a JSON object.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class ModelJSONConverter extends ModelToConverter {

  private final HashSet<Object> hasConverted = new HashSet<Object>();

  private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  private final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ssZZZZZ");
  private final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");

  /**
   * Converts an object to a json object.
   * 
   * @param the
   *          {@link ModelObject} to convert
   * @return the {@link JSONObject}
   */
  public JSONObject convert(Object object) {
    doBaseActions(Collections.singletonList(object));

    hasConverted.clear();

    return doConvert(object);
  }

  protected JSONObject doConvert(Object object) {
    // if there are cycles then use proxies
    if (hasConverted.contains(object) && !getProxyObjects().contains(object)) {
      getProxyObjects().add(object);
      getNonProxiedObjects().remove(object);
      // just continue
    } else {
      hasConverted.add(object);
    }
    final JSONObject target = createJSONObject(object);
    convertContent(object, target);
    return target;
  }

  protected JSONObject createJSONObject(Object source) {
    final JSONObject jsonObject = new JSONObject();
    setObjectProperties(source, jsonObject);
    setProxyProperties(source, jsonObject);
    return jsonObject;
  }

  protected void convertContent(Object source, JSONObject target) {

    if (getProxyObjects().contains(source)) {
      return;
    }

    final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(source);

    for (final EStructuralFeature eStructuralFeature : modelObject.eClass().getEAllStructuralFeatures()) {
      if (!eStructuralFeature.isChangeable() || eStructuralFeature.isVolatile()) {
        continue;
      }

      if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
        convertFeatureMap(modelObject, target, eStructuralFeature);
      } else if (eStructuralFeature.isMany()) {
        if (eStructuralFeature instanceof EAttribute) {
          final EAttribute eAttribute = (EAttribute) eStructuralFeature;
          convertManyEAttribute(modelObject, target, eAttribute);
        } else {
          final EReference eReference = (EReference) eStructuralFeature;
          convertManyEReference(modelObject, target, eReference);
        }
      } else {
        if (eStructuralFeature instanceof EAttribute) {
          final EAttribute eAttribute = (EAttribute) eStructuralFeature;
          convertSingleEAttribute(modelObject, target, eAttribute);
        } else {
          final EReference eReference = (EReference) eStructuralFeature;
          convertSingleEReference(modelObject, target, eReference);
        }
      }
    }
  }

  protected void setProxyProperties(Object object, JSONObject jsonObject) {
    try {
      if (!ModelResolver.getInstance().isModelEnabled(object)) {
        return;
      }
      final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
      final org.eclipse.emf.common.util.URI uri = getProxyId(modelObject);
      if (uri != null) {
        if (getProxyObjects().contains(object)) {
          jsonObject.put(ModelJSONConstants.PROXY_PROPERTY, true);
        }
        jsonObject.put(ModelJSONConstants.URI_PROPERTY, uri.toString());
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected void setObjectProperties(Object object, JSONObject jsonObject) {
    try {
      if (!ModelResolver.getInstance().isModelEnabled(object)) {
        return;
      }
      final ModelObject<?> modelObject = ModelResolver.getInstance().getModelObject(object);
      if (IdProvider.getInstance().hasIdEAttribute(object)) {
        final String idAsString  = IdProvider.getInstance().getIdAsString(object);
        if (idAsString != null && idAsString.trim().length() > 0) {
          final EAttribute idEAttribute = IdProvider.getInstance().getIdEAttribute(modelObject.eClass());
          jsonObject.put(ModelJSONConstants.ID_PROPERTY, idAsString);
          jsonObject.put(getJSONPropertyName(idEAttribute),
              convertPrimitiveValue(modelObject.eGet(idEAttribute), idEAttribute.getEAttributeType()));
        }
      }
      jsonObject.put(ModelJSONConstants.TITLE_PROPERTY, TitleProvider.getInstance().getTitle(object));
      jsonObject.put(ModelJSONConstants.ECLASS_PROPERTY, ModelUtils.getQualifiedNameFromEClass(modelObject.eClass()));
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the values of an FeatureMap, the values of the collection are converted to and added to the list in the
   * correct feature in the modelObject.
   * 
   * @param modelObject
   *          the source from which the value is read
   * @param target
   *          the {@link JSONObject} in which the value is to be set
   * @param eFeature
   *          the eFeature which is converted
   */
  protected void convertFeatureMap(final ModelObject<?> modelObject, final JSONObject target,
      final EStructuralFeature eFeature) {
    try {
      final Collection<?> mValues = (Collection<?>) modelObject.eGet(eFeature);

      final List<JSONObject> values = new ArrayList<JSONObject>();
      for (final Object mValue : mValues) {
        final ModelFeatureMapEntry<?> mEntry = ModelResolver.getInstance().getModelFeatureMapEntry(eFeature, mValue);
        EStructuralFeature entryFeature = mEntry.getEStructuralFeature();
        Object entryValue = mEntry.getValue();

        // flatten the tree of feature map entries, feature maps maybe nested
        // EMF uses a flattened api, while Texo builds this actual tree of
        // featuremaps, the findFeature and findValue find the deepest featureMap entry
        if (FeatureMapUtil.isFeatureMap(entryFeature)) {
          final ModelFeatureMapEntry<?> modelFeatureMapEntry = ModelResolver.getInstance().getModelFeatureMapEntry(
              entryFeature, entryValue);
          entryFeature = findFeature(modelFeatureMapEntry);
          entryValue = findValue(modelFeatureMapEntry);
        }

        final Object convertedValue;
        if (entryFeature instanceof EAttribute) {
          convertedValue = convertPrimitiveValue(entryValue, ((EAttribute) entryFeature).getEAttributeType());
        } else {
          convertedValue = doConvert(entryValue);
        }
        final JSONObject featureMapJSON = new JSONObject();
        featureMapJSON.put(ModelJSONConstants.VALUE_PROPERTY, convertedValue);
        featureMapJSON.put(ModelJSONConstants.EFEATURE_PROPERTY,
            ModelUtils.getQualifiedNameFromEStructuralFeature(eFeature));
        featureMapJSON.put(ModelJSONConstants.KEY_PROPERTY, eFeature.getName());
        values.add(featureMapJSON);
      }
      target.put(getJSONPropertyName(eFeature), new JSONArray(values));
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the value of an EReference with isMany==false
   * 
   * @param modelObject
   *          the modelObject from which the value is retrieved.
   * @param target
   *          the JSONObject in which the value is set (after it has been converted)
   * @param eReference
   *          the eReference which is converted
   */
  protected void convertSingleEReference(final ModelObject<?> modelObject, final JSONObject target,
      final EReference eReference) {
    try {

      final String jsonPropName = getJSONPropertyName(eReference);

      if (target.has(jsonPropName)) {
        return;
      }

      final Object value = modelObject.eGet(eReference);
      if (value == null) {
        target.put(jsonPropName, JSONObject.NULL);
      } else {
        final JSONObject jsonObject = doConvert(value);
        target.put(jsonPropName, jsonObject);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected String getJSONPropertyName(EStructuralFeature eFeature) {
    return eFeature.getName();
  }

  /**
   * Converts the value of an EReference with isMany==true
   * 
   * @param modelObject
   *          the modelObject from which the value is retrieved.
   * @param eObject
   *          the eObject in which the value is set (after it has been converted)
   * @param eReference
   *          the eReference which is converted
   */
  protected void convertManyEReference(final ModelObject<?> modelObject, final JSONObject target,
      final EReference eReference) {

    try {
      final String jsonPropName = getJSONPropertyName(eReference);

      if (target.has(jsonPropName)) {
        return;
      }

      final Object manyValue = modelObject.eGet(eReference);
      if (Map.class.isAssignableFrom(manyValue.getClass())) {
        Check.isTrue(ModelUtils.isEMap(eReference), "Expected emap EReference, but the case for EReference " //$NON-NLS-1$
            + eReference);
        final List<JSONObject> values = new ArrayList<JSONObject>();
        final Map<?, ?> map = (Map<?, ?>) manyValue;

        final EObject mapEntryEObject = EcoreUtil.create(eReference.getEReferenceType());
        final EStructuralFeature valueFeature = mapEntryEObject.eClass().getEStructuralFeature("value"); //$NON-NLS-1$
        final EStructuralFeature keyFeature = mapEntryEObject.eClass().getEStructuralFeature("key"); //$NON-NLS-1$

        for (final Object key : map.keySet()) {
          final Object value = map.get(key);
          final JSONObject entry = new JSONObject();

          // key and value maybe primitive types but can also be
          // references to model objects.
          if (ModelResolver.getInstance().isModelEnabled(value)) {
            entry.put(ModelJSONConstants.VALUE_PROPERTY, doConvert(value));
          } else {
            entry.put(ModelJSONConstants.VALUE_PROPERTY,
                convertPrimitiveValue(value, ((EAttribute) valueFeature).getEAttributeType()));
          }
          if (ModelResolver.getInstance().isModelEnabled(key)) {
            entry.put(ModelJSONConstants.KEY_PROPERTY, doConvert(key));
          } else {
            entry.put(ModelJSONConstants.KEY_PROPERTY,
                convertPrimitiveValue(key, ((EAttribute) keyFeature).getEAttributeType()));
          }
          values.add(entry);
        }
        target.put(getJSONPropertyName(eReference), values);
      } else {

        @SuppressWarnings("unchecked")
        final Collection<Object> sourceValues = (Collection<Object>) manyValue;
        final List<Object> targetValues = new ArrayList<Object>();

        for (final Object value : sourceValues) {
          if (value == null) {
            targetValues.add(JSONObject.NULL);
          } else {
            targetValues.add(doConvert(value));
          }
        }
        target.put(getJSONPropertyName(eReference), targetValues);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the value of an EAttribute with isMany==false, the value is converted (
   * {@link #convertPrimitiveValue(Object, EDataType)}).
   * 
   * @param modelObject
   *          the modelObject from which the value is retrieved.
   * @param target
   *          the JSONObject in which the value is set (after it has been converted)
   * @param eAttribute
   *          the EAttribute which is converted
   * @see #convertPrimitiveValue(Object, EDataType)
   */
  protected void convertSingleEAttribute(final ModelObject<?> modelObject, final JSONObject target,
      final EAttribute eAttribute) {
    try {
      final Object value = modelObject.eGet(eAttribute);
      final String propName = getJSONPropertyName(eAttribute);
      target.put(propName, convertPrimitiveValue(value, eAttribute.getEAttributeType()));

      // also add the textual value of the bigdecimal for precision reasons
      if (value instanceof BigDecimal) {
        target.put(propName + "_text", value.toString());
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the value of an EAttribute with isMany==true, the values of the collection are converted and set in the
   * json object.
   * 
   * @param modelObject
   *          the modelObject from which the value is retrieved.
   * @param target
   *          the JSONObject in which the value is set (after it has been converted)
   * @param eAttribute
   *          the EAttribute which is converted
   * @see #convertPrimitiveValue(Object, EDataType)
   */
  protected void convertManyEAttribute(final ModelObject<?> modelObject, final JSONObject target,
      final EAttribute eAttribute) {
    try {
      final Collection<?> values = (Collection<?>) modelObject.eGet(eAttribute);
      final EDataType eDataType = eAttribute.getEAttributeType();

      final List<Object> targetValues = new ArrayList<Object>();

      boolean bigDecimalsPresent = false;
      for (final Object value : values) {
        bigDecimalsPresent |= value instanceof BigDecimal;
        targetValues.add(convertPrimitiveValue(value, eDataType));
      }
      target.put(getJSONPropertyName(eAttribute), targetValues);
      if (bigDecimalsPresent) {
        final List<Object> bdValues = new ArrayList<Object>();
        for (final Object value : values) {
          bigDecimalsPresent |= value instanceof BigDecimal;
          if (value == null) {
            bdValues.add("");
          } else {
            bdValues.add(value.toString());
          }
        }
        target.put(getJSONPropertyName(eAttribute) + "_text", bdValues);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts a primitive type value to a format acceptable by JSON. Only handles these ones:
   * <p>
   * EEnum: For EEnum: uses the name
   * </p>
   * <p>
   * Date: converts to a xml schema format
   * </p>
   * 
   * @param value
   *          the value to convert
   * @param eDataType
   *          its EDataType
   * @return the converted value
   */
  protected Object convertPrimitiveValue(final Object value, final EDataType eDataType) {
    if (value instanceof Enum<?>) {
      return ((Enum<?>) value).name();
    }
    if (value instanceof Date && eDataType == XMLTypePackage.eINSTANCE.getDate()) {
      return convertDateTime(value, true, false, false);
    }

    if (value instanceof Date && eDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
      return convertDateTime(value, false, true, false);
    }

    if (value instanceof Date && eDataType == XMLTypePackage.eINSTANCE.getTime()) {
      return convertDateTime(value, false, false, true);
    }

    if (value instanceof Date) {
      return convertDateTime(value, false, true, false);
    }

    return value;
  }

  protected String convertDateTime(Object value, boolean isDate, boolean isDateTime, boolean isTime) {
    if (isDate) {
      return dateFormat.format((Date) value);
    }
    if (isDateTime) {
      return dateTimeFormat.format((Date) value);
    }
    if (isTime) {
      return timeFormat.format((Date) value);
    }
    throw new IllegalArgumentException("The value must be a date, a datetime or a time");
  }
}