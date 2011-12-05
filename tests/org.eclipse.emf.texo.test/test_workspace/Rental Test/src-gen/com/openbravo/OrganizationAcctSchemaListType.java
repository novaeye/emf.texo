package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrganizationAcctSchemaListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrganizationAcctSchemaListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrganizationAcctSchemaType> organizationAcctSchema = new ArrayList<OrganizationAcctSchemaType>();

	/**
	 * Returns the value of '<em><b>organizationAcctSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationAcctSchema</b></em>' feature
	 * @generated
	 */
	public List<OrganizationAcctSchemaType> getOrganizationAcctSchema() {
		return organizationAcctSchema;
	}

	/**
	 * Adds to the <em>organizationAcctSchema</em> feature.
	 * @generated
	 */
	public void addToOrganizationAcctSchema(
			OrganizationAcctSchemaType organizationAcctSchemaValue) {
		if (!organizationAcctSchema.contains(organizationAcctSchemaValue)) {

			organizationAcctSchema.add(organizationAcctSchemaValue);
		}

	}

	/**			
	 * Removes from the <em>organizationAcctSchema</em> feature.
	 * @generated
	 */
	public void removeFromOrganizationAcctSchema(
			OrganizationAcctSchemaType organizationAcctSchemaValue) {
		if (organizationAcctSchema.contains(organizationAcctSchemaValue)) {
			organizationAcctSchema.remove(organizationAcctSchemaValue);
		}
	}

	/**			
	 * Clears the <em>organizationAcctSchema</em> feature.
	 * @generated
	 */
	public void clearOrganizationAcctSchema() {
		while (!organizationAcctSchema.isEmpty()) {
			removeFromOrganizationAcctSchema(organizationAcctSchema.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OrganizationAcctSchemaListType#getOrganizationAcctSchema() <em>organizationAcctSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrganizationAcctSchemaListType#getOrganizationAcctSchema() organizationAcctSchema}' feature.
	 * @generated
	 */
	public void setOrganizationAcctSchema(
			List<OrganizationAcctSchemaType> newOrganizationAcctSchema) {
		organizationAcctSchema = newOrganizationAcctSchema;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrganizationAcctSchemaListType ";
	}
}
