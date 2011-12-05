package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtBankStatementLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtBankStatementLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtBankStatementLineType> financialMgmtBankStatementLine = new ArrayList<FinancialMgmtBankStatementLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatementLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBankStatementLineType> getFinancialMgmtBankStatementLine() {
		return financialMgmtBankStatementLine;
	}

	/**
	 * Adds to the <em>financialMgmtBankStatementLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtBankStatementLine(
			FinancialMgmtBankStatementLineType financialMgmtBankStatementLineValue) {
		if (!financialMgmtBankStatementLine
				.contains(financialMgmtBankStatementLineValue)) {

			financialMgmtBankStatementLine
					.add(financialMgmtBankStatementLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtBankStatementLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtBankStatementLine(
			FinancialMgmtBankStatementLineType financialMgmtBankStatementLineValue) {
		if (financialMgmtBankStatementLine
				.contains(financialMgmtBankStatementLineValue)) {
			financialMgmtBankStatementLine
					.remove(financialMgmtBankStatementLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtBankStatementLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtBankStatementLine() {
		while (!financialMgmtBankStatementLine.isEmpty()) {
			removeFromFinancialMgmtBankStatementLine(financialMgmtBankStatementLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtBankStatementLineListType#getFinancialMgmtBankStatementLine() <em>financialMgmtBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtBankStatementLineListType#getFinancialMgmtBankStatementLine() financialMgmtBankStatementLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatementLine(
			List<FinancialMgmtBankStatementLineType> newFinancialMgmtBankStatementLine) {
		financialMgmtBankStatementLine = newFinancialMgmtBankStatementLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtBankStatementLineListType ";
	}
}
