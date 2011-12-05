package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtGLChargeAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtGLChargeAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtGLChargeAccountsType> financialMgmtGLChargeAccounts = new ArrayList<FinancialMgmtGLChargeAccountsType>();

	/**
	 * Returns the value of '<em><b>financialMgmtGLChargeAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLChargeAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLChargeAccountsType> getFinancialMgmtGLChargeAccounts() {
		return financialMgmtGLChargeAccounts;
	}

	/**
	 * Adds to the <em>financialMgmtGLChargeAccounts</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtGLChargeAccounts(
			FinancialMgmtGLChargeAccountsType financialMgmtGLChargeAccountsValue) {
		if (!financialMgmtGLChargeAccounts
				.contains(financialMgmtGLChargeAccountsValue)) {

			financialMgmtGLChargeAccounts
					.add(financialMgmtGLChargeAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtGLChargeAccounts</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtGLChargeAccounts(
			FinancialMgmtGLChargeAccountsType financialMgmtGLChargeAccountsValue) {
		if (financialMgmtGLChargeAccounts
				.contains(financialMgmtGLChargeAccountsValue)) {
			financialMgmtGLChargeAccounts
					.remove(financialMgmtGLChargeAccountsValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtGLChargeAccounts</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtGLChargeAccounts() {
		while (!financialMgmtGLChargeAccounts.isEmpty()) {
			removeFromFinancialMgmtGLChargeAccounts(financialMgmtGLChargeAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtGLChargeAccountsListType1#getFinancialMgmtGLChargeAccounts() <em>financialMgmtGLChargeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtGLChargeAccountsListType1#getFinancialMgmtGLChargeAccounts() financialMgmtGLChargeAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLChargeAccounts(
			List<FinancialMgmtGLChargeAccountsType> newFinancialMgmtGLChargeAccounts) {
		financialMgmtGLChargeAccounts = newFinancialMgmtGLChargeAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtGLChargeAccountsListType1 ";
	}
}
