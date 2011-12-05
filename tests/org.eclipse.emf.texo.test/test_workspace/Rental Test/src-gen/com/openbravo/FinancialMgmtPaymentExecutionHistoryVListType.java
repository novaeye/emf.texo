package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentExecutionHistoryVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentExecutionHistoryVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPaymentExecutionHistoryVType> financialMgmtPaymentExecutionHistoryV = new ArrayList<FinancialMgmtPaymentExecutionHistoryVType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionHistoryV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionHistoryV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentExecutionHistoryVType> getFinancialMgmtPaymentExecutionHistoryV() {
		return financialMgmtPaymentExecutionHistoryV;
	}

	/**
	 * Adds to the <em>financialMgmtPaymentExecutionHistoryV</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPaymentExecutionHistoryV(
			FinancialMgmtPaymentExecutionHistoryVType financialMgmtPaymentExecutionHistoryVValue) {
		if (!financialMgmtPaymentExecutionHistoryV
				.contains(financialMgmtPaymentExecutionHistoryVValue)) {

			financialMgmtPaymentExecutionHistoryV
					.add(financialMgmtPaymentExecutionHistoryVValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPaymentExecutionHistoryV</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPaymentExecutionHistoryV(
			FinancialMgmtPaymentExecutionHistoryVType financialMgmtPaymentExecutionHistoryVValue) {
		if (financialMgmtPaymentExecutionHistoryV
				.contains(financialMgmtPaymentExecutionHistoryVValue)) {
			financialMgmtPaymentExecutionHistoryV
					.remove(financialMgmtPaymentExecutionHistoryVValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPaymentExecutionHistoryV</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPaymentExecutionHistoryV() {
		while (!financialMgmtPaymentExecutionHistoryV.isEmpty()) {
			removeFromFinancialMgmtPaymentExecutionHistoryV(financialMgmtPaymentExecutionHistoryV
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentExecutionHistoryVListType#getFinancialMgmtPaymentExecutionHistoryV() <em>financialMgmtPaymentExecutionHistoryV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentExecutionHistoryVListType#getFinancialMgmtPaymentExecutionHistoryV() financialMgmtPaymentExecutionHistoryV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionHistoryV(
			List<FinancialMgmtPaymentExecutionHistoryVType> newFinancialMgmtPaymentExecutionHistoryV) {
		financialMgmtPaymentExecutionHistoryV = newFinancialMgmtPaymentExecutionHistoryV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPaymentExecutionHistoryVListType ";
	}
}
