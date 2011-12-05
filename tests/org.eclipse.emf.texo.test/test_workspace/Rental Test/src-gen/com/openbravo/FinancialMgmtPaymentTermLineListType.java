package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentTermLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentTermLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPaymentTermLineType> financialMgmtPaymentTermLine = new ArrayList<FinancialMgmtPaymentTermLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentTermLineType> getFinancialMgmtPaymentTermLine() {
		return financialMgmtPaymentTermLine;
	}

	/**
	 * Adds to the <em>financialMgmtPaymentTermLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPaymentTermLine(
			FinancialMgmtPaymentTermLineType financialMgmtPaymentTermLineValue) {
		if (!financialMgmtPaymentTermLine
				.contains(financialMgmtPaymentTermLineValue)) {

			financialMgmtPaymentTermLine.add(financialMgmtPaymentTermLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPaymentTermLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPaymentTermLine(
			FinancialMgmtPaymentTermLineType financialMgmtPaymentTermLineValue) {
		if (financialMgmtPaymentTermLine
				.contains(financialMgmtPaymentTermLineValue)) {
			financialMgmtPaymentTermLine
					.remove(financialMgmtPaymentTermLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPaymentTermLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPaymentTermLine() {
		while (!financialMgmtPaymentTermLine.isEmpty()) {
			removeFromFinancialMgmtPaymentTermLine(financialMgmtPaymentTermLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineListType#getFinancialMgmtPaymentTermLine() <em>financialMgmtPaymentTermLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineListType#getFinancialMgmtPaymentTermLine() financialMgmtPaymentTermLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermLine(
			List<FinancialMgmtPaymentTermLineType> newFinancialMgmtPaymentTermLine) {
		financialMgmtPaymentTermLine = newFinancialMgmtPaymentTermLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPaymentTermLineListType ";
	}
}
