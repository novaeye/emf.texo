package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctSchemaTableListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctSchemaTableListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAcctSchemaTableType> financialMgmtAcctSchemaTable = new ArrayList<FinancialMgmtAcctSchemaTableType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaTable</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaTableType> getFinancialMgmtAcctSchemaTable() {
		return financialMgmtAcctSchemaTable;
	}

	/**
	 * Adds to the <em>financialMgmtAcctSchemaTable</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAcctSchemaTable(
			FinancialMgmtAcctSchemaTableType financialMgmtAcctSchemaTableValue) {
		if (!financialMgmtAcctSchemaTable
				.contains(financialMgmtAcctSchemaTableValue)) {

			financialMgmtAcctSchemaTable.add(financialMgmtAcctSchemaTableValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAcctSchemaTable</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAcctSchemaTable(
			FinancialMgmtAcctSchemaTableType financialMgmtAcctSchemaTableValue) {
		if (financialMgmtAcctSchemaTable
				.contains(financialMgmtAcctSchemaTableValue)) {
			financialMgmtAcctSchemaTable
					.remove(financialMgmtAcctSchemaTableValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAcctSchemaTable</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAcctSchemaTable() {
		while (!financialMgmtAcctSchemaTable.isEmpty()) {
			removeFromFinancialMgmtAcctSchemaTable(financialMgmtAcctSchemaTable
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaTableListType#getFinancialMgmtAcctSchemaTable() <em>financialMgmtAcctSchemaTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaTableListType#getFinancialMgmtAcctSchemaTable() financialMgmtAcctSchemaTable}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaTable(
			List<FinancialMgmtAcctSchemaTableType> newFinancialMgmtAcctSchemaTable) {
		financialMgmtAcctSchemaTable = newFinancialMgmtAcctSchemaTable;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAcctSchemaTableListType ";
	}
}
