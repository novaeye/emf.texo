package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentGenerateVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentGenerateVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtDebtPaymentGenerateVType> financialMgmtDebtPaymentGenerateV = new ArrayList<FinancialMgmtDebtPaymentGenerateVType>();

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentGenerateVType> getFinancialMgmtDebtPaymentGenerateV() {
		return financialMgmtDebtPaymentGenerateV;
	}

	/**
	 * Adds to the <em>financialMgmtDebtPaymentGenerateV</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtDebtPaymentGenerateV(
			FinancialMgmtDebtPaymentGenerateVType financialMgmtDebtPaymentGenerateVValue) {
		if (!financialMgmtDebtPaymentGenerateV
				.contains(financialMgmtDebtPaymentGenerateVValue)) {

			financialMgmtDebtPaymentGenerateV
					.add(financialMgmtDebtPaymentGenerateVValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtDebtPaymentGenerateV</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtDebtPaymentGenerateV(
			FinancialMgmtDebtPaymentGenerateVType financialMgmtDebtPaymentGenerateVValue) {
		if (financialMgmtDebtPaymentGenerateV
				.contains(financialMgmtDebtPaymentGenerateVValue)) {
			financialMgmtDebtPaymentGenerateV
					.remove(financialMgmtDebtPaymentGenerateVValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtDebtPaymentGenerateV</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtDebtPaymentGenerateV() {
		while (!financialMgmtDebtPaymentGenerateV.isEmpty()) {
			removeFromFinancialMgmtDebtPaymentGenerateV(financialMgmtDebtPaymentGenerateV
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentGenerateVListType#getFinancialMgmtDebtPaymentGenerateV() <em>financialMgmtDebtPaymentGenerateV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentGenerateVListType#getFinancialMgmtDebtPaymentGenerateV() financialMgmtDebtPaymentGenerateV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateV(
			List<FinancialMgmtDebtPaymentGenerateVType> newFinancialMgmtDebtPaymentGenerateV) {
		financialMgmtDebtPaymentGenerateV = newFinancialMgmtDebtPaymentGenerateV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtDebtPaymentGenerateVListType ";
	}
}
