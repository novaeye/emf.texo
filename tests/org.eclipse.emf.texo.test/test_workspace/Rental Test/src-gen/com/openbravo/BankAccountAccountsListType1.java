package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BankAccountAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BankAccountAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BankAccountAccountsType> bankAccountAccounts = new ArrayList<BankAccountAccountsType>();

	/**
	 * Returns the value of '<em><b>bankAccountAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccounts</b></em>' feature
	 * @generated
	 */
	public List<BankAccountAccountsType> getBankAccountAccounts() {
		return bankAccountAccounts;
	}

	/**
	 * Adds to the <em>bankAccountAccounts</em> feature.
	 * @generated
	 */
	public void addToBankAccountAccounts(
			BankAccountAccountsType bankAccountAccountsValue) {
		if (!bankAccountAccounts.contains(bankAccountAccountsValue)) {

			bankAccountAccounts.add(bankAccountAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>bankAccountAccounts</em> feature.
	 * @generated
	 */
	public void removeFromBankAccountAccounts(
			BankAccountAccountsType bankAccountAccountsValue) {
		if (bankAccountAccounts.contains(bankAccountAccountsValue)) {
			bankAccountAccounts.remove(bankAccountAccountsValue);
		}
	}

	/**			
	 * Clears the <em>bankAccountAccounts</em> feature.
	 * @generated
	 */
	public void clearBankAccountAccounts() {
		while (!bankAccountAccounts.isEmpty()) {
			removeFromBankAccountAccounts(bankAccountAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BankAccountAccountsListType1#getBankAccountAccounts() <em>bankAccountAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsListType1#getBankAccountAccounts() bankAccountAccounts}' feature.
	 * @generated
	 */
	public void setBankAccountAccounts(
			List<BankAccountAccountsType> newBankAccountAccounts) {
		bankAccountAccounts = newBankAccountAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BankAccountAccountsListType1 ";
	}
}
