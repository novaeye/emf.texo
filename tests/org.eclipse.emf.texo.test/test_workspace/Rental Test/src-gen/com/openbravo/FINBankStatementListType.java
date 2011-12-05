package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINBankStatementListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINBankStatementListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINBankStatementType> fINBankStatement = new ArrayList<FINBankStatementType>();

	/**
	 * Returns the value of '<em><b>fINBankStatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatement</b></em>' feature
	 * @generated
	 */
	public List<FINBankStatementType> getFINBankStatement() {
		return fINBankStatement;
	}

	/**
	 * Adds to the <em>fINBankStatement</em> feature.
	 * @generated
	 */
	public void addToFINBankStatement(FINBankStatementType fINBankStatementValue) {
		if (!fINBankStatement.contains(fINBankStatementValue)) {

			fINBankStatement.add(fINBankStatementValue);
		}

	}

	/**			
	 * Removes from the <em>fINBankStatement</em> feature.
	 * @generated
	 */
	public void removeFromFINBankStatement(
			FINBankStatementType fINBankStatementValue) {
		if (fINBankStatement.contains(fINBankStatementValue)) {
			fINBankStatement.remove(fINBankStatementValue);
		}
	}

	/**			
	 * Clears the <em>fINBankStatement</em> feature.
	 * @generated
	 */
	public void clearFINBankStatement() {
		while (!fINBankStatement.isEmpty()) {
			removeFromFINBankStatement(fINBankStatement.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINBankStatementListType#getFINBankStatement() <em>fINBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINBankStatementListType#getFINBankStatement() fINBankStatement}' feature.
	 * @generated
	 */
	public void setFINBankStatement(
			List<FINBankStatementType> newFINBankStatement) {
		fINBankStatement = newFINBankStatement;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINBankStatementListType ";
	}
}
