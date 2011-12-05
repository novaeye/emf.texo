package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINBankStatementLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINBankStatementLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINBankStatementLineType> fINBankStatementLine = new ArrayList<FINBankStatementLineType>();

	/**
	 * Returns the value of '<em><b>fINBankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatementLine</b></em>' feature
	 * @generated
	 */
	public List<FINBankStatementLineType> getFINBankStatementLine() {
		return fINBankStatementLine;
	}

	/**
	 * Adds to the <em>fINBankStatementLine</em> feature.
	 * @generated
	 */
	public void addToFINBankStatementLine(
			FINBankStatementLineType fINBankStatementLineValue) {
		if (!fINBankStatementLine.contains(fINBankStatementLineValue)) {

			fINBankStatementLine.add(fINBankStatementLineValue);
		}

	}

	/**			
	 * Removes from the <em>fINBankStatementLine</em> feature.
	 * @generated
	 */
	public void removeFromFINBankStatementLine(
			FINBankStatementLineType fINBankStatementLineValue) {
		if (fINBankStatementLine.contains(fINBankStatementLineValue)) {
			fINBankStatementLine.remove(fINBankStatementLineValue);
		}
	}

	/**			
	 * Clears the <em>fINBankStatementLine</em> feature.
	 * @generated
	 */
	public void clearFINBankStatementLine() {
		while (!fINBankStatementLine.isEmpty()) {
			removeFromFINBankStatementLine(fINBankStatementLine.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FINBankStatementLineListType#getFINBankStatementLine() <em>fINBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINBankStatementLineListType#getFINBankStatementLine() fINBankStatementLine}' feature.
	 * @generated
	 */
	public void setFINBankStatementLine(
			List<FINBankStatementLineType> newFINBankStatementLine) {
		fINBankStatementLine = newFINBankStatementLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINBankStatementLineListType ";
	}
}
