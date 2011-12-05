package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentCancelVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentCancelVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtDebtPaymentCancelVType> financialMgmtDebtPaymentCancelV = new ArrayList<FinancialMgmtDebtPaymentCancelVType>();

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentCancelVType> getFinancialMgmtDebtPaymentCancelV() {
		return financialMgmtDebtPaymentCancelV;
	}

	/**
	 * Adds to the <em>financialMgmtDebtPaymentCancelV</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtDebtPaymentCancelV(
			FinancialMgmtDebtPaymentCancelVType financialMgmtDebtPaymentCancelVValue) {
		if (!financialMgmtDebtPaymentCancelV
				.contains(financialMgmtDebtPaymentCancelVValue)) {

			financialMgmtDebtPaymentCancelV
					.add(financialMgmtDebtPaymentCancelVValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtDebtPaymentCancelV</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtDebtPaymentCancelV(
			FinancialMgmtDebtPaymentCancelVType financialMgmtDebtPaymentCancelVValue) {
		if (financialMgmtDebtPaymentCancelV
				.contains(financialMgmtDebtPaymentCancelVValue)) {
			financialMgmtDebtPaymentCancelV
					.remove(financialMgmtDebtPaymentCancelVValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtDebtPaymentCancelV</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtDebtPaymentCancelV() {
		while (!financialMgmtDebtPaymentCancelV.isEmpty()) {
			removeFromFinancialMgmtDebtPaymentCancelV(financialMgmtDebtPaymentCancelV
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVListType#getFinancialMgmtDebtPaymentCancelV() <em>financialMgmtDebtPaymentCancelV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVListType#getFinancialMgmtDebtPaymentCancelV() financialMgmtDebtPaymentCancelV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelV(
			List<FinancialMgmtDebtPaymentCancelVType> newFinancialMgmtDebtPaymentCancelV) {
		financialMgmtDebtPaymentCancelV = newFinancialMgmtDebtPaymentCancelV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtDebtPaymentCancelVListType ";
	}
}
