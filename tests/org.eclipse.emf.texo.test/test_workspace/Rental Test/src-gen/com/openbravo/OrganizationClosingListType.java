package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrganizationClosingListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrganizationClosingListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrganizationClosingType> organizationClosing = new ArrayList<OrganizationClosingType>();

	/**
	 * Returns the value of '<em><b>organizationClosing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationClosing</b></em>' feature
	 * @generated
	 */
	public List<OrganizationClosingType> getOrganizationClosing() {
		return organizationClosing;
	}

	/**
	 * Adds to the <em>organizationClosing</em> feature.
	 * @generated
	 */
	public void addToOrganizationClosing(
			OrganizationClosingType organizationClosingValue) {
		if (!organizationClosing.contains(organizationClosingValue)) {

			organizationClosing.add(organizationClosingValue);
		}

	}

	/**			
	 * Removes from the <em>organizationClosing</em> feature.
	 * @generated
	 */
	public void removeFromOrganizationClosing(
			OrganizationClosingType organizationClosingValue) {
		if (organizationClosing.contains(organizationClosingValue)) {
			organizationClosing.remove(organizationClosingValue);
		}
	}

	/**			
	 * Clears the <em>organizationClosing</em> feature.
	 * @generated
	 */
	public void clearOrganizationClosing() {
		while (!organizationClosing.isEmpty()) {
			removeFromOrganizationClosing(organizationClosing.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrganizationClosingListType#getOrganizationClosing() <em>organizationClosing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrganizationClosingListType#getOrganizationClosing() organizationClosing}' feature.
	 * @generated
	 */
	public void setOrganizationClosing(
			List<OrganizationClosingType> newOrganizationClosing) {
		organizationClosing = newOrganizationClosing;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrganizationClosingListType ";
	}
}
