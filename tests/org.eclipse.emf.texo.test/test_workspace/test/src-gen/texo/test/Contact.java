package texo.test;

/** 
 * A representation of the model object '<em><b>Contact</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Contact {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private java.lang.String value = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private texo.test.ContactType type = texo.test.ContactType.PHONE;

	/**
	 * Returns the value of '<em><b>value</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>value</b></em>' feature
	 * @generated
	 */
	public java.lang.String getValue() {
		return value;
	}

	/**
	 * Sets the '{@link Contact#getValue() <em>value</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Contact#getValue() value}' feature.
	 * @generated
	 */
	public void setValue(java.lang.String newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public texo.test.ContactType getType() {
		return type;
	}

	/**
	 * Sets the '{@link Contact#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Contact#getType() type}' feature.
	 * @generated
	 */
	public void setType(texo.test.ContactType newType) {
		type = newType;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Contact " + " [value: " + getValue() + "]" + " [type: "
				+ getType() + "]";
	}
}
