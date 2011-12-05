package com.openbravo;

/** 
 * A representation of the model object '<em><b>String</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class String {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String value = null;

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
	public String getValue() {
		return value;
	}

	/**
	 * Sets the '{@link String#getValue() <em>value</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link String#getValue() value}' feature.
	 * @generated
	 */
	public void setValue(String newValue) {
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
	 * Sets the '{@link String#isInactive() <em>inactive</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link String#isInactive() inactive}' feature.
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
	 * Sets the '{@link String#isTransient() <em>transient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link String#isTransient() transient}' feature.
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
		return "String " + " [value: " + getValue() + "]" + " [inactive: "
				+ isInactive() + "]" + " [transient: " + isTransient() + "]";
	}
}
