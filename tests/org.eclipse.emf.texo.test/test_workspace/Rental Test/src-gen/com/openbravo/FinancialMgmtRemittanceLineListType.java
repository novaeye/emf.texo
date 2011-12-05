package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtRemittanceLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtRemittanceLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtRemittanceLineType> financialMgmtRemittanceLine = new ArrayList<FinancialMgmtRemittanceLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtRemittanceLineType> getFinancialMgmtRemittanceLine() {
		return financialMgmtRemittanceLine;
	}

	/**
	 * Adds to the <em>financialMgmtRemittanceLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtRemittanceLine(
			FinancialMgmtRemittanceLineType financialMgmtRemittanceLineValue) {
		if (!financialMgmtRemittanceLine
				.contains(financialMgmtRemittanceLineValue)) {

			financialMgmtRemittanceLine.add(financialMgmtRemittanceLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtRemittanceLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtRemittanceLine(
			FinancialMgmtRemittanceLineType financialMgmtRemittanceLineValue) {
		if (financialMgmtRemittanceLine
				.contains(financialMgmtRemittanceLineValue)) {
			financialMgmtRemittanceLine
					.remove(financialMgmtRemittanceLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtRemittanceLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtRemittanceLine() {
		while (!financialMgmtRemittanceLine.isEmpty()) {
			removeFromFinancialMgmtRemittanceLine(financialMgmtRemittanceLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtRemittanceLineListType#getFinancialMgmtRemittanceLine() <em>financialMgmtRemittanceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtRemittanceLineListType#getFinancialMgmtRemittanceLine() financialMgmtRemittanceLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceLine(
			List<FinancialMgmtRemittanceLineType> newFinancialMgmtRemittanceLine) {
		financialMgmtRemittanceLine = newFinancialMgmtRemittanceLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtRemittanceLineListType ";
	}
}
