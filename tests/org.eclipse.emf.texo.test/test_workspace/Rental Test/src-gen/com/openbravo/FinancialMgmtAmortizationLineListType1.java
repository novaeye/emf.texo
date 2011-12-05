package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAmortizationLineListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAmortizationLineListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAmortizationLineType> financialMgmtAmortizationLine = new ArrayList<FinancialMgmtAmortizationLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAmortizationLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortizationLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAmortizationLineType> getFinancialMgmtAmortizationLine() {
		return financialMgmtAmortizationLine;
	}

	/**
	 * Adds to the <em>financialMgmtAmortizationLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAmortizationLine(
			FinancialMgmtAmortizationLineType financialMgmtAmortizationLineValue) {
		if (!financialMgmtAmortizationLine
				.contains(financialMgmtAmortizationLineValue)) {

			financialMgmtAmortizationLine
					.add(financialMgmtAmortizationLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAmortizationLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAmortizationLine(
			FinancialMgmtAmortizationLineType financialMgmtAmortizationLineValue) {
		if (financialMgmtAmortizationLine
				.contains(financialMgmtAmortizationLineValue)) {
			financialMgmtAmortizationLine
					.remove(financialMgmtAmortizationLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAmortizationLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAmortizationLine() {
		while (!financialMgmtAmortizationLine.isEmpty()) {
			removeFromFinancialMgmtAmortizationLine(financialMgmtAmortizationLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAmortizationLineListType1#getFinancialMgmtAmortizationLine() <em>financialMgmtAmortizationLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAmortizationLineListType1#getFinancialMgmtAmortizationLine() financialMgmtAmortizationLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortizationLine(
			List<FinancialMgmtAmortizationLineType> newFinancialMgmtAmortizationLine) {
		financialMgmtAmortizationLine = newFinancialMgmtAmortizationLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAmortizationLineListType1 ";
	}
}
