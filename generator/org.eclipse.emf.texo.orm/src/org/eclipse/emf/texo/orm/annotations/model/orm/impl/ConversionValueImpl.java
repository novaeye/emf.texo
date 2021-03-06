/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConversionValueImpl.java,v 1.5 2011/10/25 13:21:27 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Conversion Value</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ConversionValueImpl#getDataValue <em>Data Value</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ConversionValueImpl#getObjectValue <em>Object Value
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ConversionValueImpl extends BaseOrmAnnotationImpl implements ConversionValue {
  /**
	 * The default value of the '{@link #getDataValue() <em>Data Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
  protected static final String DATA_VALUE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDataValue() <em>Data Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getDataValue()
	 * @generated
	 * @ordered
	 */
  protected String dataValue = DATA_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #getObjectValue() <em>Object Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getObjectValue()
	 * @generated
	 * @ordered
	 */
  protected static final String OBJECT_VALUE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getObjectValue() <em>Object Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getObjectValue()
	 * @generated
	 * @ordered
	 */
  protected String objectValue = OBJECT_VALUE_EDEFAULT;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected ConversionValueImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getConversionValue();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getDataValue() {
		return dataValue;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataValue(String newDataValue) {
		String oldDataValue = dataValue;
		dataValue = newDataValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CONVERSION_VALUE__DATA_VALUE, oldDataValue, dataValue));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getObjectValue() {
		return objectValue;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setObjectValue(String newObjectValue) {
		String oldObjectValue = objectValue;
		objectValue = newObjectValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.CONVERSION_VALUE__OBJECT_VALUE, oldObjectValue, objectValue));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.CONVERSION_VALUE__DATA_VALUE:
				return getDataValue();
			case OrmPackage.CONVERSION_VALUE__OBJECT_VALUE:
				return getObjectValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.CONVERSION_VALUE__DATA_VALUE:
				setDataValue((String)newValue);
				return;
			case OrmPackage.CONVERSION_VALUE__OBJECT_VALUE:
				setObjectValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case OrmPackage.CONVERSION_VALUE__DATA_VALUE:
				setDataValue(DATA_VALUE_EDEFAULT);
				return;
			case OrmPackage.CONVERSION_VALUE__OBJECT_VALUE:
				setObjectValue(OBJECT_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrmPackage.CONVERSION_VALUE__DATA_VALUE:
				return DATA_VALUE_EDEFAULT == null ? dataValue != null : !DATA_VALUE_EDEFAULT.equals(dataValue);
			case OrmPackage.CONVERSION_VALUE__OBJECT_VALUE:
				return OBJECT_VALUE_EDEFAULT == null ? objectValue != null : !OBJECT_VALUE_EDEFAULT.equals(objectValue);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dataValue: ");
		result.append(dataValue);
		result.append(", objectValue: ");
		result.append(objectValue);
		result.append(')');
		return result.toString();
	}

} // ConversionValueImpl
