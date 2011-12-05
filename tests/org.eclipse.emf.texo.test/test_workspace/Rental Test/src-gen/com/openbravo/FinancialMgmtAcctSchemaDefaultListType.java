package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctSchemaDefaultListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctSchemaDefaultListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAcctSchemaDefaultType> financialMgmtAcctSchemaDefault = new ArrayList<FinancialMgmtAcctSchemaDefaultType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefault</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefault</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaDefaultType> getFinancialMgmtAcctSchemaDefault() {
		return financialMgmtAcctSchemaDefault;
	}

	/**
	 * Adds to the <em>financialMgmtAcctSchemaDefault</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAcctSchemaDefault(
			FinancialMgmtAcctSchemaDefaultType financialMgmtAcctSchemaDefaultValue) {
		if (!financialMgmtAcctSchemaDefault
				.contains(financialMgmtAcctSchemaDefaultValue)) {

			financialMgmtAcctSchemaDefault
					.add(financialMgmtAcctSchemaDefaultValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAcctSchemaDefault</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAcctSchemaDefault(
			FinancialMgmtAcctSchemaDefaultType financialMgmtAcctSchemaDefaultValue) {
		if (financialMgmtAcctSchemaDefault
				.contains(financialMgmtAcctSchemaDefaultValue)) {
			financialMgmtAcctSchemaDefault
					.remove(financialMgmtAcctSchemaDefaultValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAcctSchemaDefault</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAcctSchemaDefault() {
		while (!financialMgmtAcctSchemaDefault.isEmpty()) {
			removeFromFinancialMgmtAcctSchemaDefault(financialMgmtAcctSchemaDefault
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaDefaultListType#getFinancialMgmtAcctSchemaDefault() <em>financialMgmtAcctSchemaDefault</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaDefaultListType#getFinancialMgmtAcctSchemaDefault() financialMgmtAcctSchemaDefault}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefault(
			List<FinancialMgmtAcctSchemaDefaultType> newFinancialMgmtAcctSchemaDefault) {
		financialMgmtAcctSchemaDefault = newFinancialMgmtAcctSchemaDefault;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAcctSchemaDefaultListType ";
	}
}
