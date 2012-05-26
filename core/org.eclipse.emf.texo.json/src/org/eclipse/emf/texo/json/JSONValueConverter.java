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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Is used to convert model primitive values to JSON primitive values.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class JSONValueConverter implements TexoComponent {

  private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  private final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ssZZZZZ");
  private final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ");

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
  protected Object toJSON(Object target, final Object value, final EDataType eDataType) {
    if (target instanceof EObject && ModelUtils.isEEnum(eDataType)) {
      return eDataType.getEPackage().getEFactoryInstance().convertToString(eDataType, value);
    }

    if (value instanceof Enum<?>) {
      return ((Enum<?>) value).name();
    }
    if (value instanceof Date && eDataType == XMLTypePackage.eINSTANCE.getDate()) {
      return convertDateTimeToJSON(value, true, false, false);
    }

    if (value instanceof Date && eDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
      return convertDateTimeToJSON(value, false, true, false);
    }

    if (value instanceof Date && eDataType == XMLTypePackage.eINSTANCE.getTime()) {
      return convertDateTimeToJSON(value, false, false, true);
    }

    if (value instanceof Date) {
      return convertDateTimeToJSON(value, false, true, false);
    }

    return value;
  }

  public String convertDateTimeToJSON(Object value, boolean isDate, boolean isDateTime, boolean isTime) {
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
  protected Object fromJSON(Object target, final Object value, final EDataType eDataType) {
    if (ModelUtils.isEEnum(eDataType)) {
      final EDataType enumDataType = getDataTypeOrBaseType(eDataType);
      
      if (!(value instanceof String)) {
        // hopefully already the correct value...
        return value;
      }

      if (target instanceof EObject) {
        return eDataType.getEPackage().getEFactoryInstance().createFromString(eDataType, (String) value);
      }

      // modelobject
      final ModelPackage modelPackage = ModelResolver.getInstance().getModelPackage(
          enumDataType.getEPackage().getNsURI());
      final Class<? extends Enum> enumClass = (Class<? extends Enum>) modelPackage.getEClassifierClass(enumDataType);
      return Enum.valueOf(enumClass, (String) value);
    }

    if (eDataType == XMLTypePackage.eINSTANCE.getDate()) {
      return convertDateTimeFromJSON(value, true, false, false);
    }

    if (eDataType == XMLTypePackage.eINSTANCE.getDateTime()) {
      return convertDateTimeFromJSON(value, false, true, false);
    }

    if (eDataType == XMLTypePackage.eINSTANCE.getTime()) {
      return convertDateTimeFromJSON(value, false, false, true);
    }

    if (eDataType.getInstanceClass() != null && Date.class.isAssignableFrom(eDataType.getInstanceClass())) {
      return convertDateTimeFromJSON(value, false, true, false);
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

  public Date convertDateTimeFromJSON(Object value, boolean isDate, boolean isDateTime, boolean isTime) {
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

}