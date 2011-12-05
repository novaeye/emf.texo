package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentBalReplaceListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentBalReplaceListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtDebtPaymentBalReplaceType> financialMgmtDebtPaymentBalReplace = new ArrayList<FinancialMgmtDebtPaymentBalReplaceType>();

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalReplace</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalReplace</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentBalReplaceType> getFinancialMgmtDebtPaymentBalReplace() {
		return financialMgmtDebtPaymentBalReplace;
	}

	/**
	 * Adds to the <em>financialMgmtDebtPaymentBalReplace</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtDebtPaymentBalReplace(
			FinancialMgmtDebtPaymentBalReplaceType financialMgmtDebtPaymentBalReplaceValue) {
		if (!financialMgmtDebtPaymentBalReplace
				.contains(financialMgmtDebtPaymentBalReplaceValue)) {

			financialMgmtDebtPaymentBalReplace
					.add(financialMgmtDebtPaymentBalReplaceValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtDebtPaymentBalReplace</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtDebtPaymentBalReplace(
			FinancialMgmtDebtPaymentBalReplaceType financialMgmtDebtPaymentBalReplaceValue) {
		if (financialMgmtDebtPaymentBalReplace
				.contains(financialMgmtDebtPaymentBalReplaceValue)) {
			financialMgmtDebtPaymentBalReplace
					.remove(financialMgmtDebtPaymentBalReplaceValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtDebtPaymentBalReplace</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtDebtPaymentBalReplace() {
		while (!financialMgmtDebtPaymentBalReplace.isEmpty()) {
			removeFromFinancialMgmtDebtPaymentBalReplace(financialMgmtDebtPaymentBalReplace
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentBalReplaceListType#getFinancialMgmtDebtPaymentBalReplace() <em>financialMgmtDebtPaymentBalReplace</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentBalReplaceListType#getFinancialMgmtDebtPaymentBalReplace() financialMgmtDebtPaymentBalReplace}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalReplace(
			List<FinancialMgmtDebtPaymentBalReplaceType> newFinancialMgmtDebtPaymentBalReplace) {
		financialMgmtDebtPaymentBalReplace = newFinancialMgmtDebtPaymentBalReplace;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtDebtPaymentBalReplaceListType ";
	}
}
