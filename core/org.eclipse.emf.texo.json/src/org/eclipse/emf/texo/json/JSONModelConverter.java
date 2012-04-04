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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.ComponentProvider;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.resolver.DefaultObjectResolver;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.eclipse.emf.texo.utils.Check;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Converts a JSONObject to a model object managed by a {@link ModelPackage} instance.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class JSONModelConverter {

  private Map<String, Object> resolvedObjects = new HashMap<String, Object>();

  private ObjectResolver objectResolver = ComponentProvider.getInstance().newInstance(DefaultObjectResolver.class);

  private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  private final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ssZZZZZ");
  private final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");

  /**
   * Converts a JSONArray to a list of equivalent model objects.
   * 
   * @param jsonArray
   *          the jsonArray to convert
   * @return the model object
   */
  public List<Object> convert(final JSONArray jsonArray) {
    resolvedObjects.clear();
    return doConvert(jsonArray);
  }

  protected List<Object> doConvert(final JSONArray jsonArray) {
    try {
      final List<Object> result = new ArrayList<Object>();
      for (int i = 0; i < jsonArray.length(); i++) {
        final Object o = jsonArray.get(i);
        if (o instanceof JSONArray) {
          result.addAll(convert((JSONArray) o));
        } else if (o instanceof JSONObject) {
          result.add(doConvert((JSONObject) o));
        }
      }
      return result;
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts a JSONObject to its equivalent model object.
   * 
   * @param jsonObject
   *          the jsonObject to convert
   * @return the model object
   */
  public Object convert(final JSONObject jsonObject) {
    resolvedObjects.clear();
    return doConvert(jsonObject);
  }

  protected Object doConvert(JSONObject source) {
    final Object target = resolveObject(source);
    convertContent(source, target);
    return target;
  }

  protected Object resolveObject(JSONObject jsonObject) {
    try {
      if (jsonObject.has(ModelJSONConstants.URI_PROPERTY)) {
        final String uriString = jsonObject.getString(ModelJSONConstants.URI_PROPERTY);
        if (resolvedObjects.containsKey(uriString)) {
          return resolvedObjects.get(uriString);
        }
        final Object object = getUriResolver().fromUri(URI.createURI(uriString));
        resolvedObjects.put(uriString, object);
        return object;
      }
      if (jsonObject.has(ModelJSONConstants.ECLASS_PROPERTY)) {
        final EClass eClass = ModelUtils.getEClassFromQualifiedName(jsonObject
            .getString(ModelJSONConstants.ECLASS_PROPERTY));
        if (eClass == null) {
          throw new IllegalArgumentException("No eclass found for jsonObject " + jsonObject); //$NON-NLS-1$
        }
        if (hasValue(jsonObject, ModelJSONConstants.ID_PROPERTY)) {
          final String idString = jsonObject.getString(ModelJSONConstants.ID_PROPERTY);
          final URI uri = getUriResolver().toURI(eClass, idString);
          final String uriString = uri.toString();
          if (resolvedObjects.containsKey(uriString)) {
            return resolvedObjects.get(uriString);
          }

          final Object object = getUriResolver().fromUri(URI.createURI(uriString));
          resolvedObjects.put(uriString, object);
          return object;
        }
        return ModelResolver.getInstance().getModelPackage(eClass.getEPackage().getNsURI()).getModelFactory()
            .create(eClass);
      }
      throw new IllegalArgumentException("No eClass property in jsonObject " + jsonObject); //$NON-NLS-1$
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  private boolean hasValue(JSONObject jsonObject, String propertyName) throws JSONException {
    if (!jsonObject.has(propertyName)) {
      return false;
    }
    final Object id = jsonObject.get(propertyName);
    if (id == null || id == JSONObject.NULL) {
      return false;
    }
    if (id instanceof String && ((String) id).trim().length() == 0) {
      return false;
    }
    return true;
  }

  protected void convertContent(JSONObject source, Object target) {
    @SuppressWarnings("unchecked")
    final ModelObject<Object> modelObject = (ModelObject<Object>) ModelResolver.getInstance().getModelObject(target);
    @SuppressWarnings("unchecked")
    final Iterator<Object> keyIterator = source.keys();
    try {
      while (keyIterator.hasNext()) {
        final String key = (String) keyIterator.next();
        final Object value = source.get(key);

        final EStructuralFeature eStructuralFeature = getEFeatureFromPropertyName(modelObject.eClass(), key);

        // there can be many properties in a jsonobject, just ignore the illegal ones
        if (eStructuralFeature == null) {
          continue;
        }

        if (!eStructuralFeature.isChangeable() || eStructuralFeature.isVolatile()) {
          continue;
        }

        if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
          convertFeatureMap(source, value, modelObject, eStructuralFeature);
        } else if (eStructuralFeature.isMany()) {
          if (eStructuralFeature instanceof EAttribute) {
            final EAttribute eAttribute = (EAttribute) eStructuralFeature;
            convertManyEAttribute(source, value, modelObject, eAttribute);
          } else {
            final EReference eReference = (EReference) eStructuralFeature;
            convertManyEReference(source, value, modelObject, eReference);
          }
        } else {
          if (eStructuralFeature instanceof EAttribute) {
            final EAttribute eAttribute = (EAttribute) eStructuralFeature;
            convertSingleEAttribute(source, value, modelObject, eAttribute);
          } else {
            final EReference eReference = (EReference) eStructuralFeature;
            convertSingleEReference(source, value, modelObject, eReference);
          }
        }
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected EStructuralFeature getEFeatureFromPropertyName(EClass eClass, String propertyName) {
    return eClass.getEStructuralFeature(propertyName);
  }

  /**
   * Converts the value of an EReference with isMany==false
   * 
   * @param source
   *          the JSONObject from which the value is read
   * @param modelObject
   *          the Object in which the value is to be set
   * @param eReference
   *          the eReference which is converted
   */
  protected void convertSingleEReference(final JSONObject jsonObject, Object value, final ModelObject<?> modelObject,
      final EReference eReference) {
    // bidirectional one-to-many are always set from the many side to preserve the order
    if (!eReference.isMany() && eReference.getEOpposite() != null && eReference.getEOpposite().isMany()) {
      return;
    }
    if (value == null || value == JSONObject.NULL) {
      modelObject.eSet(eReference, null);
    } else {
      modelObject.eSet(eReference, doConvert((JSONObject) value));
    }
  }

  /**
   * Converts the value of an EReference with isMany==true, the values of the collection are converted to Objects and
   * added to the list in the correct feature in the {@link ModelObject}.
   * 
   * @param source
   *          the JSONObject from which the value is read
   * @param value
   *          the value in the JSONObject, must be a JSONArray
   * @param modelObject
   *          the Object in which the value is set
   * @param eReference
   *          the eReference which is converted
   */
  protected void convertManyEReference(final JSONObject source, Object featureValue, final ModelObject<?> modelObject,
      final EReference eReference) {
    final JSONArray jValues = (JSONArray) featureValue;
    if (ModelUtils.isEMap(eReference)) {
      final EObject mapEntryEObject = EcoreUtil.create(eReference.getEReferenceType());
      final EStructuralFeature valueFeature = mapEntryEObject.eClass().getEStructuralFeature("value"); //$NON-NLS-1$
      final EStructuralFeature keyFeature = mapEntryEObject.eClass().getEStructuralFeature("key"); //$NON-NLS-1$

      @SuppressWarnings("unchecked")
      final Map<Object, Object> mValues = (Map<Object, Object>) modelObject.eGet(eReference);

      // clear as there can be current values if the target is read from the db
      mValues.clear();

      try {
        for (int i = 0; i < jValues.length(); i++) {
          if (jValues.isNull(i)) {
            continue;
          }
          final JSONObject jValue = jValues.getJSONObject(i);
          final Object jEntryKey = jValue.get(ModelJSONConstants.KEY_PROPERTY);
          final Object jEntryValue = jValue.get(ModelJSONConstants.VALUE_PROPERTY);

          // key and value can also be an EObject
          final Object key;
          if (jEntryKey instanceof JSONObject) {
            key = doConvert((JSONObject) jEntryKey);
          } else {
            key = convertPrimitiveValue(jEntryKey, ((EAttribute) keyFeature).getEAttributeType());
          }
          final Object value;
          if (jEntryValue instanceof JSONObject) {
            value = doConvert((JSONObject) jEntryValue);
          } else {
            value = convertPrimitiveValue(jEntryValue, ((EAttribute) valueFeature).getEAttributeType());
          }

          mValues.put(key, value);
        }
      } catch (JSONException e) {
        throw new RuntimeException(e);
      }
    } else {
      final Collection<?> mValues = (Collection<?>) modelObject.eGet(eReference);

      // clear as there can be current values if the target is read from the db
      // use forloop as the collection can be unmodifiable
      for (Object o : new ArrayList<Object>(mValues)) {
        modelObject.eRemoveFrom(eReference, o);
      }

      for (int i = 0; i < jValues.length(); i++) {
        if (jValues.isNull(i)) {
          mValues.add(null);
          continue;
        }
        try {
          if (jValues.isNull(i) || jValues.get(i) == null) {
            modelObject.eAddTo(eReference, null);
            continue;
          }

          // special case, queries can return arrays of data
          if (jValues.get(i) instanceof JSONArray) {
            final JSONArray objects = (JSONArray) jValues.get(i);
            final Object[] target = new Object[objects.length()];
            for (int j = 0; j < objects.length(); j++) {
              final Object object = objects.get(j);
              if (object instanceof JSONObject) {
                target[j] = doConvert((JSONObject) object);
              } else {
                target[j] = object;
              }
            }
            modelObject.eAddTo(eReference, target);
            continue;
          }

          final JSONObject jValue = jValues.getJSONObject(i);

          final Object target = doConvert(jValue);

          // first add to the many reference
          modelObject.eAddTo(eReference, target);

          // add to the other side, this is needed because the bi-directional
          // api is not always generated
          if (eReference.getEOpposite() != null && !eReference.getEOpposite().isMany()) {
            final ModelObject<?> modelObjectTarget = ModelResolver.getInstance().getModelObject(target);
            if (eReference.getEOpposite().isMany()) {
              modelObjectTarget.eAddTo(eReference.getEOpposite(), modelObject.getTarget());
            } else {
              modelObjectTarget.eSet(eReference.getEOpposite(), modelObject.getTarget());
            }
          }
        } catch (JSONException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

  /**
   * Converts the value of an EAttribute with isMany==false, the value is converted (
   * {@link #convertPrimitiveValue(Object, EDataType)}) and set in the correct feature in the {@link ModelObject}.
   * 
   * @param source
   *          the JSONObject from which the value is read
   * @param value
   *          the value in the JSONObject
   * @param modelObject
   *          the @[link ModelObject} in which the value is to be set
   * @param eAttribute
   *          the EAttribute which is converted
   * @see #convertPrimitiveValue(Object, EDataType)
   */
  protected void convertSingleEAttribute(final JSONObject jsonObject, Object value, final ModelObject<?> modelObject,
      final EAttribute eAttribute) {
    modelObject.eSet(eAttribute, convertPrimitiveValue(value, eAttribute.getEAttributeType()));
  }

  /**
   * Converts the values of an FeatureMap, the values of the collection are converted to and added to the list in the
   * correct feature in the modelObject.
   * 
   * @param source
   *          the JSONObject from which the value is read
   * @param value
   *          the value
   * @param modelObject
   *          the {@link ModelObject} in which the value is to be set
   * @param eFeature
   *          the eFeature which is converted
   */
  protected void convertFeatureMap(final JSONObject jsonObject, Object value, final ModelObject<?> modelObject,
      final EStructuralFeature eFeature) {
    final JSONArray jValues = (JSONArray) value;

    @SuppressWarnings("unchecked")
    final Collection<Object> values = (Collection<Object>) modelObject.eGet(eFeature);

    // clear as the object may have been read from the db
    values.clear();

    try {
      for (int i = 0; i < jValues.length(); i++) {
        final JSONObject jValue = jValues.getJSONObject(i);

        final Object featureMapEntry = ModelResolver.getInstance().createFeatureMapEntry(eFeature);
        final ModelFeatureMapEntry<?> mEntry = ModelResolver.getInstance().getModelFeatureMapEntry(eFeature,
            featureMapEntry);
        final EStructuralFeature entryFeature = ModelUtils.getEStructuralFeatureFromQualifiedName(jValue
            .getString(ModelJSONConstants.EFEATURE_PROPERTY));

        mEntry.setEStructuralFeature(entryFeature);

        final Object convertedValue;
        if (mEntry.getEStructuralFeature() instanceof EAttribute) {
          convertedValue = convertPrimitiveValue(jValue.get(ModelJSONConstants.VALUE_PROPERTY),
              ((EAttribute) entryFeature).getEAttributeType());
        } else {
          convertedValue = doConvert(jValue.getJSONObject(ModelJSONConstants.VALUE_PROPERTY));
        }

        mEntry.setValue(convertedValue);
        values.add(featureMapEntry);
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts the value of an EAttribute with isMany==true, the values of the collection are converted to and added to
   * the list in the correct feature in the eObject.
   * 
   * @param source
   *          the JSONObject from which the value is read
   * @param value
   *          the value to convert
   * @param modelObject
   *          the {@link ModelObject} in which the value is to be set
   * @param eAttribute
   *          the EAttribute which is converted
   * @see #convertPrimitiveValue(Object, EDataType)
   */
  protected void convertManyEAttribute(final JSONObject source, Object value, final ModelObject<?> modelObject,
      final EAttribute eAttribute) {
    final JSONArray jValues = (JSONArray) value;
    final EDataType eDataType = eAttribute.getEAttributeType();

    @SuppressWarnings("unchecked")
    final Collection<Object> values = (Collection<Object>) modelObject.eGet(eAttribute);
    // clear as the target may have been read from the db
    for (Object val : new ArrayList<Object>(values)) {
      modelObject.eRemoveFrom(eAttribute, val);
    }

    try {
      for (int i = 0; i < jValues.length(); i++) {
        values.add(convertPrimitiveValue(jValues.get(i), eDataType));
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Converts a primitive type value, this implementation only converts an EEnum to an Enum value.
   * 
   * @param value
   *          the value to convert
   * @param eDataType
   *          its EDataType
   * @return the converted value
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  protected Object convertPrimitiveValue(final Object value, final EDataType eDataType) {
    if (eDataType instanceof EEnum) {
      final EDataType enumDataType = getDataTypeOrBaseType(eDataType);
      Check.isInstanceOf(enumDataType, EEnum.class);
      final ModelPackage modelPackage = ModelResolver.getInstance().getModelPackage(
          enumDataType.getEPackage().getNsURI());
      final Class<? extends Enum> enumClass = (Class<? extends Enum>) modelPackage.getEClassifierClass(enumDataType);
      return Enum.valueOf(enumClass, (String) value);
    }

    if (eDataType == XMLTypePackage.eINSTANCE.getDate()) {
      return convertDateTime(value, true, false, false);
    }

    if (eDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
      return convertDateTime(value, false, true, false);
    }

    if (eDataType == XMLTypePackage.eINSTANCE.getTime()) {
      return convertDateTime(value, false, false, true);
    }

    if (eDataType.getInstanceClass() != null && Date.class.isAssignableFrom(eDataType.getInstanceClass())) {
      return convertDateTime(value, false, true, false);
    }

    if (value instanceof Integer) {
      // cast to the correct number type
      if (eDataType.getInstanceClass() == long.class || eDataType.getInstanceClass() == Long.class) {
        return ((Integer) value).longValue();
      }
      if (eDataType.getInstanceClass() == byte.class || eDataType.getInstanceClass() == Byte.class) {
        return ((Integer) value).byteValue();
      }
      if (eDataType.getInstanceClass() == short.class || eDataType.getInstanceClass() == Short.class) {
        return ((Integer) value).shortValue();
      }
    }

    return value;
  }

  public Date convertDateTime(Object value, boolean isDate, boolean isDateTime, boolean isTime) {
    try {
      if (isDate) {
        return dateFormat.parse((String) value);
      }
      if (isDateTime) {
        return dateTimeFormat.parse((String) value);
      }
      if (isTime) {
        return timeFormat.parse((String) value);
      }
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    throw new IllegalArgumentException("The value must be a date, a datetime or a time");
  }

  /**
   * See the javadoc in the {@link ModelUtils#getEnumBaseDataTypeIfObject(EDataType)} for details.
   * 
   * @param eDataType
   * @return the passed EDataType or its base type if the base type is an EEnum
   */
  private EDataType getDataTypeOrBaseType(EDataType eDataType) {
    final EDataType baseType = ModelUtils.getEnumBaseDataTypeIfObject(eDataType);
    if (baseType != null) {
      return baseType;
    }
    return eDataType;
  }

  public ObjectResolver getUriResolver() {
    return objectResolver;
  }

  public void setUriResolver(ObjectResolver uriResolver) {
    this.objectResolver = uriResolver;
  }

  public Map<String, Object> getResolvedObjects() {
    return resolvedObjects;
  }

  public void setResolvedObjects(Map<String, Object> resolvedObjects) {
    this.resolvedObjects = resolvedObjects;
  }
}