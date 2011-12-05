package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADUserRolesListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADUserRolesListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADUserRolesType> aDUserRoles = new ArrayList<ADUserRolesType>();

	/**
	 * Returns the value of '<em><b>aDUserRoles</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserRoles</b></em>' feature
	 * @generated
	 */
	public List<ADUserRolesType> getADUserRoles() {
		return aDUserRoles;
	}

	/**
	 * Adds to the <em>aDUserRoles</em> feature.
	 * @generated
	 */
	public void addToADUserRoles(ADUserRolesType aDUserRolesValue) {
		if (!aDUserRoles.contains(aDUserRolesValue)) {

			aDUserRoles.add(aDUserRolesValue);
		}

	}

	/**			
	 * Removes from the <em>aDUserRoles</em> feature.
	 * @generated
	 */
	public void removeFromADUserRoles(ADUserRolesType aDUserRolesValue) {
		if (aDUserRoles.contains(aDUserRolesValue)) {
			aDUserRoles.remove(aDUserRolesValue);
		}
	}

	/**			
	 * Clears the <em>aDUserRoles</em> feature.
	 * @generated
	 */
	public void clearADUserRoles() {
		while (!aDUserRoles.isEmpty()) {
			removeFromADUserRoles(aDUserRoles.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADUserRolesListType#getADUserRoles() <em>aDUserRoles</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserRolesListType#getADUserRoles() aDUserRoles}' feature.
	 * @generated
	 */
	public void setADUserRoles(List<ADUserRolesType> newADUserRoles) {
		aDUserRoles = newADUserRoles;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADUserRolesListType ";
	}
}
