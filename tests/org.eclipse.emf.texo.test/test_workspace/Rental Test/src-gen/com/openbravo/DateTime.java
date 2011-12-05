package com.openbravo;

import java.util.Date;

/** 
 * A representation of the model object '<em><b>DateTime</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DateTime {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Date value = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private boolean inactive = false;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private boolean transient_ = false;

	/**
	 * Returns the value of '<em><b>value</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>value</b></em>' feature
	 * @generated
	 */
	public Date getValue() {
		return value;
	}

	/**
	 * Sets the '{@link DateTime#getValue() <em>value</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DateTime#getValue() value}' feature.
	 * @generated
	 */
	public void setValue(Date newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of '<em><b>inactive</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>inactive</b></em>' feature
	 * @generated
	 */
	public boolean isInactive() {
		return inactive;
	}

	/**
	 * Sets the '{@link DateTime#isInactive() <em>inactive</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DateTime#isInactive() inactive}' feature.
	 * @generated
	 */
	public void setInactive(boolean newInactive) {
		inactive = newInactive;
	}

	/**
	 * Returns the value of '<em><b>transient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transient</b></em>' feature
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * Sets the '{@link DateTime#isTransient() <em>transient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DateTime#isTransient() transient}' feature.
	 * @generated
	 */
	public void setTransient(boolean newTransient_) {
		transient_ = newTransient_;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DateTime " + " [value: " + getValue() + "]" + " [inactive: "
				+ isInactive() + "]" + " [transient: " + isTransient() + "]";
	}
}
