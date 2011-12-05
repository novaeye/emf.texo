package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CustomerAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CustomerAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CustomerAccountsType> customerAccounts = new ArrayList<CustomerAccountsType>();

	/**
	 * Returns the value of '<em><b>customerAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccounts</b></em>' feature
	 * @generated
	 */
	public List<CustomerAccountsType> getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * Adds to the <em>customerAccounts</em> feature.
	 * @generated
	 */
	public void addToCustomerAccounts(CustomerAccountsType customerAccountsValue) {
		if (!customerAccounts.contains(customerAccountsValue)) {

			customerAccounts.add(customerAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>customerAccounts</em> feature.
	 * @generated
	 */
	public void removeFromCustomerAccounts(
			CustomerAccountsType customerAccountsValue) {
		if (customerAccounts.contains(customerAccountsValue)) {
			customerAccounts.remove(customerAccountsValue);
		}
	}

	/**			
	 * Clears the <em>customerAccounts</em> feature.
	 * @generated
	 */
	public void clearCustomerAccounts() {
		while (!customerAccounts.isEmpty()) {
			removeFromCustomerAccounts(customerAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CustomerAccountsListType#getCustomerAccounts() <em>customerAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CustomerAccountsListType#getCustomerAccounts() customerAccounts}' feature.
	 * @generated
	 */
	public void setCustomerAccounts(
			List<CustomerAccountsType> newCustomerAccounts) {
		customerAccounts = newCustomerAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CustomerAccountsListType ";
	}
}
