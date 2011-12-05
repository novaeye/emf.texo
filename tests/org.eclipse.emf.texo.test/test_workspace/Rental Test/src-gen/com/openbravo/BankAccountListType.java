package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BankAccountListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BankAccountListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BankAccountType> bankAccount = new ArrayList<BankAccountType>();

	/**
	 * Returns the value of '<em><b>bankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccount</b></em>' feature
	 * @generated
	 */
	public List<BankAccountType> getBankAccount() {
		return bankAccount;
	}

	/**
	 * Adds to the <em>bankAccount</em> feature.
	 * @generated
	 */
	public void addToBankAccount(BankAccountType bankAccountValue) {
		if (!bankAccount.contains(bankAccountValue)) {

			bankAccount.add(bankAccountValue);
		}

	}

	/**			
	 * Removes from the <em>bankAccount</em> feature.
	 * @generated
	 */
	public void removeFromBankAccount(BankAccountType bankAccountValue) {
		if (bankAccount.contains(bankAccountValue)) {
			bankAccount.remove(bankAccountValue);
		}
	}

	/**			
	 * Clears the <em>bankAccount</em> feature.
	 * @generated
	 */
	public void clearBankAccount() {
		while (!bankAccount.isEmpty()) {
			removeFromBankAccount(bankAccount.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BankAccountListType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountListType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(List<BankAccountType> newBankAccount) {
		bankAccount = newBankAccount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BankAccountListType ";
	}
}
