package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtGLJournalLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtGLJournalLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtGLJournalLineType> financialMgmtGLJournalLine = new ArrayList<FinancialMgmtGLJournalLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLJournalLineType> getFinancialMgmtGLJournalLine() {
		return financialMgmtGLJournalLine;
	}

	/**
	 * Adds to the <em>financialMgmtGLJournalLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtGLJournalLine(
			FinancialMgmtGLJournalLineType financialMgmtGLJournalLineValue) {
		if (!financialMgmtGLJournalLine
				.contains(financialMgmtGLJournalLineValue)) {

			financialMgmtGLJournalLine.add(financialMgmtGLJournalLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtGLJournalLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtGLJournalLine(
			FinancialMgmtGLJournalLineType financialMgmtGLJournalLineValue) {
		if (financialMgmtGLJournalLine
				.contains(financialMgmtGLJournalLineValue)) {
			financialMgmtGLJournalLine.remove(financialMgmtGLJournalLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtGLJournalLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtGLJournalLine() {
		while (!financialMgmtGLJournalLine.isEmpty()) {
			removeFromFinancialMgmtGLJournalLine(financialMgmtGLJournalLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtGLJournalLineListType#getFinancialMgmtGLJournalLine() <em>financialMgmtGLJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtGLJournalLineListType#getFinancialMgmtGLJournalLine() financialMgmtGLJournalLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLine(
			List<FinancialMgmtGLJournalLineType> newFinancialMgmtGLJournalLine) {
		financialMgmtGLJournalLine = newFinancialMgmtGLJournalLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtGLJournalLineListType ";
	}
}
