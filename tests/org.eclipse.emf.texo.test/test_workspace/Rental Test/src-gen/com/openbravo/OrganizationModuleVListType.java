package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrganizationModuleVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrganizationModuleVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrganizationModuleVType> organizationModuleV = new ArrayList<OrganizationModuleVType>();

	/**
	 * Returns the value of '<em><b>organizationModuleV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationModuleV</b></em>' feature
	 * @generated
	 */
	public List<OrganizationModuleVType> getOrganizationModuleV() {
		return organizationModuleV;
	}

	/**
	 * Adds to the <em>organizationModuleV</em> feature.
	 * @generated
	 */
	public void addToOrganizationModuleV(
			OrganizationModuleVType organizationModuleVValue) {
		if (!organizationModuleV.contains(organizationModuleVValue)) {

			organizationModuleV.add(organizationModuleVValue);
		}

	}

	/**			
	 * Removes from the <em>organizationModuleV</em> feature.
	 * @generated
	 */
	public void removeFromOrganizationModuleV(
			OrganizationModuleVType organizationModuleVValue) {
		if (organizationModuleV.contains(organizationModuleVValue)) {
			organizationModuleV.remove(organizationModuleVValue);
		}
	}

	/**			
	 * Clears the <em>organizationModuleV</em> feature.
	 * @generated
	 */
	public void clearOrganizationModuleV() {
		while (!organizationModuleV.isEmpty()) {
			removeFromOrganizationModuleV(organizationModuleV.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrganizationModuleVListType#getOrganizationModuleV() <em>organizationModuleV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrganizationModuleVListType#getOrganizationModuleV() organizationModuleV}' feature.
	 * @generated
	 */
	public void setOrganizationModuleV(
			List<OrganizationModuleVType> newOrganizationModuleV) {
		organizationModuleV = newOrganizationModuleV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrganizationModuleVListType ";
	}
}
