package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxRateAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxRateAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxRateAccountsType> financialMgmtTaxRateAccounts = new ArrayList<FinancialMgmtTaxRateAccountsType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRateAccountsType> getFinancialMgmtTaxRateAccounts() {
		return financialMgmtTaxRateAccounts;
	}

	/**
	 * Adds to the <em>financialMgmtTaxRateAccounts</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxRateAccounts(
			FinancialMgmtTaxRateAccountsType financialMgmtTaxRateAccountsValue) {
		if (!financialMgmtTaxRateAccounts
				.contains(financialMgmtTaxRateAccountsValue)) {

			financialMgmtTaxRateAccounts.add(financialMgmtTaxRateAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxRateAccounts</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxRateAccounts(
			FinancialMgmtTaxRateAccountsType financialMgmtTaxRateAccountsValue) {
		if (financialMgmtTaxRateAccounts
				.contains(financialMgmtTaxRateAccountsValue)) {
			financialMgmtTaxRateAccounts
					.remove(financialMgmtTaxRateAccountsValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxRateAccounts</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxRateAccounts() {
		while (!financialMgmtTaxRateAccounts.isEmpty()) {
			removeFromFinancialMgmtTaxRateAccounts(financialMgmtTaxRateAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateAccountsListType1#getFinancialMgmtTaxRateAccounts() <em>financialMgmtTaxRateAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateAccountsListType1#getFinancialMgmtTaxRateAccounts() financialMgmtTaxRateAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccounts(
			List<FinancialMgmtTaxRateAccountsType> newFinancialMgmtTaxRateAccounts) {
		financialMgmtTaxRateAccounts = newFinancialMgmtTaxRateAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxRateAccountsListType1 ";
	}
}
