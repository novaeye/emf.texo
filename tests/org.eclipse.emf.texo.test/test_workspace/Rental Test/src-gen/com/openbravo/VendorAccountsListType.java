package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>VendorAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class VendorAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<VendorAccountsType> vendorAccounts = new ArrayList<VendorAccountsType>();

	/**
	 * Returns the value of '<em><b>vendorAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccounts</b></em>' feature
	 * @generated
	 */
	public List<VendorAccountsType> getVendorAccounts() {
		return vendorAccounts;
	}

	/**
	 * Adds to the <em>vendorAccounts</em> feature.
	 * @generated
	 */
	public void addToVendorAccounts(VendorAccountsType vendorAccountsValue) {
		if (!vendorAccounts.contains(vendorAccountsValue)) {

			vendorAccounts.add(vendorAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>vendorAccounts</em> feature.
	 * @generated
	 */
	public void removeFromVendorAccounts(VendorAccountsType vendorAccountsValue) {
		if (vendorAccounts.contains(vendorAccountsValue)) {
			vendorAccounts.remove(vendorAccountsValue);
		}
	}

	/**			
	 * Clears the <em>vendorAccounts</em> feature.
	 * @generated
	 */
	public void clearVendorAccounts() {
		while (!vendorAccounts.isEmpty()) {
			removeFromVendorAccounts(vendorAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link VendorAccountsListType#getVendorAccounts() <em>vendorAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link VendorAccountsListType#getVendorAccounts() vendorAccounts}' feature.
	 * @generated
	 */
	public void setVendorAccounts(List<VendorAccountsType> newVendorAccounts) {
		vendorAccounts = newVendorAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "VendorAccountsListType ";
	}
}
