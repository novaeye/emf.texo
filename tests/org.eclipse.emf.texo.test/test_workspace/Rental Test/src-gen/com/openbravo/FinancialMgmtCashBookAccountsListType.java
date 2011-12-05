package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtCashBookAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtCashBookAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtCashBookAccountsType> financialMgmtCashBookAccounts = new ArrayList<FinancialMgmtCashBookAccountsType>();

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtCashBookAccountsType> getFinancialMgmtCashBookAccounts() {
		return financialMgmtCashBookAccounts;
	}

	/**
	 * Adds to the <em>financialMgmtCashBookAccounts</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtCashBookAccounts(
			FinancialMgmtCashBookAccountsType financialMgmtCashBookAccountsValue) {
		if (!financialMgmtCashBookAccounts
				.contains(financialMgmtCashBookAccountsValue)) {

			financialMgmtCashBookAccounts
					.add(financialMgmtCashBookAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtCashBookAccounts</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtCashBookAccounts(
			FinancialMgmtCashBookAccountsType financialMgmtCashBookAccountsValue) {
		if (financialMgmtCashBookAccounts
				.contains(financialMgmtCashBookAccountsValue)) {
			financialMgmtCashBookAccounts
					.remove(financialMgmtCashBookAccountsValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtCashBookAccounts</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtCashBookAccounts() {
		while (!financialMgmtCashBookAccounts.isEmpty()) {
			removeFromFinancialMgmtCashBookAccounts(financialMgmtCashBookAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtCashBookAccountsListType#getFinancialMgmtCashBookAccounts() <em>financialMgmtCashBookAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtCashBookAccountsListType#getFinancialMgmtCashBookAccounts() financialMgmtCashBookAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccounts(
			List<FinancialMgmtCashBookAccountsType> newFinancialMgmtCashBookAccounts) {
		financialMgmtCashBookAccounts = newFinancialMgmtCashBookAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtCashBookAccountsListType ";
	}
}
