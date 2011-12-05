package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtJournalLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtJournalLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtJournalLineType> financialMgmtJournalLine = new ArrayList<FinancialMgmtJournalLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtJournalLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtJournalLineType> getFinancialMgmtJournalLine() {
		return financialMgmtJournalLine;
	}

	/**
	 * Adds to the <em>financialMgmtJournalLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtJournalLine(
			FinancialMgmtJournalLineType financialMgmtJournalLineValue) {
		if (!financialMgmtJournalLine.contains(financialMgmtJournalLineValue)) {

			financialMgmtJournalLine.add(financialMgmtJournalLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtJournalLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtJournalLine(
			FinancialMgmtJournalLineType financialMgmtJournalLineValue) {
		if (financialMgmtJournalLine.contains(financialMgmtJournalLineValue)) {
			financialMgmtJournalLine.remove(financialMgmtJournalLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtJournalLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtJournalLine() {
		while (!financialMgmtJournalLine.isEmpty()) {
			removeFromFinancialMgmtJournalLine(financialMgmtJournalLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtJournalLineListType#getFinancialMgmtJournalLine() <em>financialMgmtJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtJournalLineListType#getFinancialMgmtJournalLine() financialMgmtJournalLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtJournalLine(
			List<FinancialMgmtJournalLineType> newFinancialMgmtJournalLine) {
		financialMgmtJournalLine = newFinancialMgmtJournalLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtJournalLineListType ";
	}
}
