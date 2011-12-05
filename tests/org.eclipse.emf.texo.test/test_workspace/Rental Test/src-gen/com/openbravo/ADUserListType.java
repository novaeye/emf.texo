package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADUserListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADUserListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADUserType> aDUser = new ArrayList<ADUserType>();

	/**
	 * Returns the value of '<em><b>aDUser</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUser</b></em>' feature
	 * @generated
	 */
	public List<ADUserType> getADUser() {
		return aDUser;
	}

	/**
	 * Adds to the <em>aDUser</em> feature.
	 * @generated
	 */
	public void addToADUser(ADUserType aDUserValue) {
		if (!aDUser.contains(aDUserValue)) {

			aDUser.add(aDUserValue);
		}

	}

	/**			
	 * Removes from the <em>aDUser</em> feature.
	 * @generated
	 */
	public void removeFromADUser(ADUserType aDUserValue) {
		if (aDUser.contains(aDUserValue)) {
			aDUser.remove(aDUserValue);
		}
	}

	/**			
	 * Clears the <em>aDUser</em> feature.
	 * @generated
	 */
	public void clearADUser() {
		while (!aDUser.isEmpty()) {
			removeFromADUser(aDUser.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADUserListType#getADUser() <em>aDUser</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserListType#getADUser() aDUser}' feature.
	 * @generated
	 */
	public void setADUser(List<ADUserType> newADUser) {
		aDUser = newADUser;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADUserListType ";
	}
}
