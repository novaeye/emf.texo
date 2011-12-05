package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtWithholdingAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtWithholdingAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtWithholdingAccountsType> financialMgmtWithholdingAccounts = new ArrayList<FinancialMgmtWithholdingAccountsType>();

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtWithholdingAccountsType> getFinancialMgmtWithholdingAccounts() {
		return financialMgmtWithholdingAccounts;
	}

	/**
	 * Adds to the <em>financialMgmtWithholdingAccounts</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtWithholdingAccounts(
			FinancialMgmtWithholdingAccountsType financialMgmtWithholdingAccountsValue) {
		if (!financialMgmtWithholdingAccounts
				.contains(financialMgmtWithholdingAccountsValue)) {

			financialMgmtWithholdingAccounts
					.add(financialMgmtWithholdingAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtWithholdingAccounts</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtWithholdingAccounts(
			FinancialMgmtWithholdingAccountsType financialMgmtWithholdingAccountsValue) {
		if (financialMgmtWithholdingAccounts
				.contains(financialMgmtWithholdingAccountsValue)) {
			financialMgmtWithholdingAccounts
					.remove(financialMgmtWithholdingAccountsValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtWithholdingAccounts</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtWithholdingAccounts() {
		while (!financialMgmtWithholdingAccounts.isEmpty()) {
			removeFromFinancialMgmtWithholdingAccounts(financialMgmtWithholdingAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingAccountsListType1#getFinancialMgmtWithholdingAccounts() <em>financialMgmtWithholdingAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingAccountsListType1#getFinancialMgmtWithholdingAccounts() financialMgmtWithholdingAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingAccounts(
			List<FinancialMgmtWithholdingAccountsType> newFinancialMgmtWithholdingAccounts) {
		financialMgmtWithholdingAccounts = newFinancialMgmtWithholdingAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtWithholdingAccountsListType1 ";
	}
}
