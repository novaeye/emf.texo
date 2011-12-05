package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtGLItemAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtGLItemAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtGLItemAccountsType> financialMgmtGLItemAccounts = new ArrayList<FinancialMgmtGLItemAccountsType>();

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLItemAccountsType> getFinancialMgmtGLItemAccounts() {
		return financialMgmtGLItemAccounts;
	}

	/**
	 * Adds to the <em>financialMgmtGLItemAccounts</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtGLItemAccounts(
			FinancialMgmtGLItemAccountsType financialMgmtGLItemAccountsValue) {
		if (!financialMgmtGLItemAccounts
				.contains(financialMgmtGLItemAccountsValue)) {

			financialMgmtGLItemAccounts.add(financialMgmtGLItemAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtGLItemAccounts</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtGLItemAccounts(
			FinancialMgmtGLItemAccountsType financialMgmtGLItemAccountsValue) {
		if (financialMgmtGLItemAccounts
				.contains(financialMgmtGLItemAccountsValue)) {
			financialMgmtGLItemAccounts
					.remove(financialMgmtGLItemAccountsValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtGLItemAccounts</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtGLItemAccounts() {
		while (!financialMgmtGLItemAccounts.isEmpty()) {
			removeFromFinancialMgmtGLItemAccounts(financialMgmtGLItemAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtGLItemAccountsListType#getFinancialMgmtGLItemAccounts() <em>financialMgmtGLItemAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtGLItemAccountsListType#getFinancialMgmtGLItemAccounts() financialMgmtGLItemAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemAccounts(
			List<FinancialMgmtGLItemAccountsType> newFinancialMgmtGLItemAccounts) {
		financialMgmtGLItemAccounts = newFinancialMgmtGLItemAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtGLItemAccountsListType ";
	}
}
