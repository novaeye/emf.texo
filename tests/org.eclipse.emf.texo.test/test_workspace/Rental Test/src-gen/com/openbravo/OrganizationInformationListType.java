package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrganizationInformationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrganizationInformationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrganizationInformationType> organizationInformation = new ArrayList<OrganizationInformationType>();

	/**
	 * Returns the value of '<em><b>organizationInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformation</b></em>' feature
	 * @generated
	 */
	public List<OrganizationInformationType> getOrganizationInformation() {
		return organizationInformation;
	}

	/**
	 * Adds to the <em>organizationInformation</em> feature.
	 * @generated
	 */
	public void addToOrganizationInformation(
			OrganizationInformationType organizationInformationValue) {
		if (!organizationInformation.contains(organizationInformationValue)) {

			organizationInformation.add(organizationInformationValue);
		}

	}

	/**			
	 * Removes from the <em>organizationInformation</em> feature.
	 * @generated
	 */
	public void removeFromOrganizationInformation(
			OrganizationInformationType organizationInformationValue) {
		if (organizationInformation.contains(organizationInformationValue)) {
			organizationInformation.remove(organizationInformationValue);
		}
	}

	/**			
	 * Clears the <em>organizationInformation</em> feature.
	 * @generated
	 */
	public void clearOrganizationInformation() {
		while (!organizationInformation.isEmpty()) {
			removeFromOrganizationInformation(organizationInformation
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrganizationInformationListType#getOrganizationInformation() <em>organizationInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrganizationInformationListType#getOrganizationInformation() organizationInformation}' feature.
	 * @generated
	 */
	public void setOrganizationInformation(
			List<OrganizationInformationType> newOrganizationInformation) {
		organizationInformation = newOrganizationInformation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrganizationInformationListType ";
	}
}
