package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtGLJournalListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtGLJournalListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtGLJournalType> financialMgmtGLJournal = new ArrayList<FinancialMgmtGLJournalType>();

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournal</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLJournalType> getFinancialMgmtGLJournal() {
		return financialMgmtGLJournal;
	}

	/**
	 * Adds to the <em>financialMgmtGLJournal</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtGLJournal(
			FinancialMgmtGLJournalType financialMgmtGLJournalValue) {
		if (!financialMgmtGLJournal.contains(financialMgmtGLJournalValue)) {

			financialMgmtGLJournal.add(financialMgmtGLJournalValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtGLJournal</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtGLJournal(
			FinancialMgmtGLJournalType financialMgmtGLJournalValue) {
		if (financialMgmtGLJournal.contains(financialMgmtGLJournalValue)) {
			financialMgmtGLJournal.remove(financialMgmtGLJournalValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtGLJournal</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtGLJournal() {
		while (!financialMgmtGLJournal.isEmpty()) {
			removeFromFinancialMgmtGLJournal(financialMgmtGLJournal.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtGLJournalListType#getFinancialMgmtGLJournal() <em>financialMgmtGLJournal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtGLJournalListType#getFinancialMgmtGLJournal() financialMgmtGLJournal}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournal(
			List<FinancialMgmtGLJournalType> newFinancialMgmtGLJournal) {
		financialMgmtGLJournal = newFinancialMgmtGLJournal;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtGLJournalListType ";
	}
}
