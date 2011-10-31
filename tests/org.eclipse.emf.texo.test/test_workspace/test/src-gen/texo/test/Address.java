package texo.test;

/** 
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Address {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private java.lang.String street = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private java.lang.String city = null;

	/**
	 * Returns the value of '<em><b>street</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>street</b></em>' feature
	 * @generated
	 */
	public java.lang.String getStreet() {
		return street;
	}

	/**
	 * Sets the '{@link Address#getStreet() <em>street</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Address#getStreet() street}' feature.
	 * @generated
	 */
	public void setStreet(java.lang.String newStreet) {
		street = newStreet;
	}

	/**
	 * Returns the value of '<em><b>city</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>city</b></em>' feature
	 * @generated
	 */
	public java.lang.String getCity() {
		return city;
	}

	/**
	 * Sets the '{@link Address#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Address#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(java.lang.String newCity) {
		city = newCity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Address " + " [street: " + getStreet() + "]" + " [city: "
				+ getCity() + "]";
	}
}
