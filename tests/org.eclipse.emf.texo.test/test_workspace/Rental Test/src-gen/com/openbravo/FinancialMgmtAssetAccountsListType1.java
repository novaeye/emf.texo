package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAssetAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAssetAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAssetAccountsType> financialMgmtAssetAccounts = new ArrayList<FinancialMgmtAssetAccountsType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetAccountsType> getFinancialMgmtAssetAccounts() {
		return financialMgmtAssetAccounts;
	}

	/**
	 * Adds to the <em>financialMgmtAssetAccounts</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAssetAccounts(
			FinancialMgmtAssetAccountsType financialMgmtAssetAccountsValue) {
		if (!financialMgmtAssetAccounts
				.contains(financialMgmtAssetAccountsValue)) {

			financialMgmtAssetAccounts.add(financialMgmtAssetAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAssetAccounts</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAssetAccounts(
			FinancialMgmtAssetAccountsType financialMgmtAssetAccountsValue) {
		if (financialMgmtAssetAccounts
				.contains(financialMgmtAssetAccountsValue)) {
			financialMgmtAssetAccounts.remove(financialMgmtAssetAccountsValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAssetAccounts</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAssetAccounts() {
		while (!financialMgmtAssetAccounts.isEmpty()) {
			removeFromFinancialMgmtAssetAccounts(financialMgmtAssetAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAssetAccountsListType1#getFinancialMgmtAssetAccounts() <em>financialMgmtAssetAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAssetAccountsListType1#getFinancialMgmtAssetAccounts() financialMgmtAssetAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccounts(
			List<FinancialMgmtAssetAccountsType> newFinancialMgmtAssetAccounts) {
		financialMgmtAssetAccounts = newFinancialMgmtAssetAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAssetAccountsListType1 ";
	}
}
