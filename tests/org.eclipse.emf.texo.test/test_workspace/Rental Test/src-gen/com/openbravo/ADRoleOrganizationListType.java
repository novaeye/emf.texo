package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADRoleOrganizationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADRoleOrganizationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADRoleOrganizationType> aDRoleOrganization = new ArrayList<ADRoleOrganizationType>();

	/**
	 * Returns the value of '<em><b>aDRoleOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRoleOrganization</b></em>' feature
	 * @generated
	 */
	public List<ADRoleOrganizationType> getADRoleOrganization() {
		return aDRoleOrganization;
	}

	/**
	 * Adds to the <em>aDRoleOrganization</em> feature.
	 * @generated
	 */
	public void addToADRoleOrganization(
			ADRoleOrganizationType aDRoleOrganizationValue) {
		if (!aDRoleOrganization.contains(aDRoleOrganizationValue)) {

			aDRoleOrganization.add(aDRoleOrganizationValue);
		}

	}

	/**			
	 * Removes from the <em>aDRoleOrganization</em> feature.
	 * @generated
	 */
	public void removeFromADRoleOrganization(
			ADRoleOrganizationType aDRoleOrganizationValue) {
		if (aDRoleOrganization.contains(aDRoleOrganizationValue)) {
			aDRoleOrganization.remove(aDRoleOrganizationValue);
		}
	}

	/**			
	 * Clears the <em>aDRoleOrganization</em> feature.
	 * @generated
	 */
	public void clearADRoleOrganization() {
		while (!aDRoleOrganization.isEmpty()) {
			removeFromADRoleOrganization(aDRoleOrganization.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADRoleOrganizationListType#getADRoleOrganization() <em>aDRoleOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleOrganizationListType#getADRoleOrganization() aDRoleOrganization}' feature.
	 * @generated
	 */
	public void setADRoleOrganization(
			List<ADRoleOrganizationType> newADRoleOrganization) {
		aDRoleOrganization = newADRoleOrganization;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADRoleOrganizationListType ";
	}
}
