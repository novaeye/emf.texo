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
 * $Id: EMFModelConverter.java,v 1.23 2011/08/29 05:16:04 mtaal Exp $
 */

package org.eclipse.emf.texo.json;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Converts a JSONObject to an {@link EObject}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class JSONEMFConverter extends BaseJSONModelConverter<EObject> {

  @Override
  protected EObject fromUri(String uriString) {
    return getUriResolver().getEObject(URI.createURI(uriString));
  }

  @Override
  protected EObject create(EClass eClass) {
    return EcoreUtil.create(eClass);
  }

  @Override
  protected EClass eClass(EObject target) {
    return target.eClass();
  }

  @Override
  protected void eSet(EObject target, EStructuralFeature eFeature, Object value) {
    target.eSet(eFeature, value);
  }

  @Override
  protected Object eGet(EObject target, EStructuralFeature eFeature) {
    return target.eGet(eFeature);
  }

  @Override
  protected Object createFeatureMapEntry(EObject target, EStructuralFeature eFeature, JSONObject jValue) {
    try {
      final EStructuralFeature entryFeature = ModelUtils.getEStructuralFeatureFromQualifiedName(jValue
          .getString(ModelJSONConstants.EFEATURE_PROPERTY));
      final Object convertedValue;
      if (entryFeature instanceof EAttribute) {
        convertedValue = getJSONValueConverter().fromJSON(target, jValue.get(ModelJSONConstants.VALUE_PROPERTY),
            ((EAttribute) entryFeature).getEAttributeType());
      } else {
        convertedValue = doConvert(jValue.getJSONObject(ModelJSONConstants.VALUE_PROPERTY));
      }
      return FeatureMapUtil.createEntry(entryFeature, convertedValue);
    } catch (JSONException e) {
      throw new IllegalStateException(e);
    }
  }

  @Override
  protected void eRemoveFrom(EObject target, EStructuralFeature eFeature, Object value) {
    ((Collection<?>) target.eGet(eFeature)).remove(value);
  }

  @SuppressWarnings("unchecked")
  @Override
  protected void eAddTo(EObject target, EStructuralFeature eFeature, Object value) {
    ((Collection<Object>) target.eGet(eFeature)).add(value);
  }

}