package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtBudgetLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtBudgetLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtBudgetLineType> financialMgmtBudgetLine = new ArrayList<FinancialMgmtBudgetLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtBudgetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudgetLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBudgetLineType> getFinancialMgmtBudgetLine() {
		return financialMgmtBudgetLine;
	}

	/**
	 * Adds to the <em>financialMgmtBudgetLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtBudgetLine(
			FinancialMgmtBudgetLineType financialMgmtBudgetLineValue) {
		if (!financialMgmtBudgetLine.contains(financialMgmtBudgetLineValue)) {

			financialMgmtBudgetLine.add(financialMgmtBudgetLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtBudgetLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtBudgetLine(
			FinancialMgmtBudgetLineType financialMgmtBudgetLineValue) {
		if (financialMgmtBudgetLine.contains(financialMgmtBudgetLineValue)) {
			financialMgmtBudgetLine.remove(financialMgmtBudgetLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtBudgetLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtBudgetLine() {
		while (!financialMgmtBudgetLine.isEmpty()) {
			removeFromFinancialMgmtBudgetLine(financialMgmtBudgetLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtBudgetLineListType#getFinancialMgmtBudgetLine() <em>financialMgmtBudgetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtBudgetLineListType#getFinancialMgmtBudgetLine() financialMgmtBudgetLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLine(
			List<FinancialMgmtBudgetLineType> newFinancialMgmtBudgetLine) {
		financialMgmtBudgetLine = newFinancialMgmtBudgetLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtBudgetLineListType ";
	}
}
