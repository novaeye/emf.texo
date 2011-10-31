package texo.test;

/** 
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class Person {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private java.lang.String firstname = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private java.lang.String lastname = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private texo.test.Address address = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private java.util.List<texo.test.Contact> contacts = new java.util.ArrayList<texo.test.Contact>();

	/**
	 * Returns the value of '<em><b>firstname</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>firstname</b></em>' feature
	 * @generated
	 */
	public java.lang.String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the '{@link Person#getFirstname() <em>firstname</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Person#getFirstname() firstname}' feature.
	 * @generated
	 */
	public void setFirstname(java.lang.String newFirstname) {
		firstname = newFirstname;
	}

	/**
	 * Returns the value of '<em><b>lastname</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastname</b></em>' feature
	 * @generated
	 */
	public java.lang.String getLastname() {
		return lastname;
	}

	/**
	 * Sets the '{@link Person#getLastname() <em>lastname</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Person#getLastname() lastname}' feature.
	 * @generated
	 */
	public void setLastname(java.lang.String newLastname) {
		lastname = newLastname;
	}

	/**
	 * Returns the value of '<em><b>address</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToAddress(texo.test.Address value)}
	 * and {@link #removeFromAddress(texo.test.Address value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>address</b></em>' feature
	 * @generated
	 */
	public texo.test.Address getAddress() {
		return address;
	}

	/**
	 * Sets the '{@link Person#getAddress() <em>address</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Person#getAddress() address}' feature.
	 * @generated
	 */
	public void setAddress(texo.test.Address newAddress) {
		address = newAddress;
	}

	/**
	 * Returns the value of '<em><b>contacts</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToContacts(texo.test.Contact value)}
	 * and {@link #removeFromContacts(texo.test.Contact value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contacts</b></em>' feature
	 * @generated
	 */
	public java.util.List<texo.test.Contact> getContacts() {
		return java.util.Collections.unmodifiableList(contacts);
	}

	/**
	 * Adds to the <em>contacts</em> feature.
	 * @generated
	 */
	public void addToContacts(texo.test.Contact value) {
		if (!contacts.contains(value)) {
			contacts.add(value);
		}
	}

	/**			
	 * Removes from the <em>contacts</em> feature.
	 * @generated
	 */
	public void removeFromContacts(texo.test.Contact value) {
		if (contacts.contains(value)) {
			contacts.remove(value);
		}
	}

	/**			
	 * Clears the <em>contacts</em> feature.
	 * @generated
	 */
	public void clearContacts() {
		for (texo.test.Contact value : contacts) {
			removeFromContacts(value);
		}
	}

	/**
	 * Sets the '{@link Person#getContacts() <em>contacts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Person#getContacts() contacts}' feature.
	 * @generated
	 */
	public void setContacts(java.util.List<texo.test.Contact> newContacts) {
		clearContacts();
		for (texo.test.Contact value : newContacts) {
			addToContacts(value);
		}
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Person " + " [firstname: " + getFirstname() + "]"
				+ " [lastname: " + getLastname() + "]";
	}
}
