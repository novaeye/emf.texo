package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxRegisterTypeLinesListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxRegisterTypeLinesListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxRegisterTypeLinesType> financialMgmtTaxRegisterTypeLines = new ArrayList<FinancialMgmtTaxRegisterTypeLinesType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterTypeLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterTypeLines</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterTypeLinesType> getFinancialMgmtTaxRegisterTypeLines() {
		return financialMgmtTaxRegisterTypeLines;
	}

	/**
	 * Adds to the <em>financialMgmtTaxRegisterTypeLines</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxRegisterTypeLines(
			FinancialMgmtTaxRegisterTypeLinesType financialMgmtTaxRegisterTypeLinesValue) {
		if (!financialMgmtTaxRegisterTypeLines
				.contains(financialMgmtTaxRegisterTypeLinesValue)) {

			financialMgmtTaxRegisterTypeLines
					.add(financialMgmtTaxRegisterTypeLinesValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxRegisterTypeLines</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxRegisterTypeLines(
			FinancialMgmtTaxRegisterTypeLinesType financialMgmtTaxRegisterTypeLinesValue) {
		if (financialMgmtTaxRegisterTypeLines
				.contains(financialMgmtTaxRegisterTypeLinesValue)) {
			financialMgmtTaxRegisterTypeLines
					.remove(financialMgmtTaxRegisterTypeLinesValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxRegisterTypeLines</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxRegisterTypeLines() {
		while (!financialMgmtTaxRegisterTypeLines.isEmpty()) {
			removeFromFinancialMgmtTaxRegisterTypeLines(financialMgmtTaxRegisterTypeLines
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRegisterTypeLinesListType#getFinancialMgmtTaxRegisterTypeLines() <em>financialMgmtTaxRegisterTypeLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRegisterTypeLinesListType#getFinancialMgmtTaxRegisterTypeLines() financialMgmtTaxRegisterTypeLines}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterTypeLines(
			List<FinancialMgmtTaxRegisterTypeLinesType> newFinancialMgmtTaxRegisterTypeLines) {
		financialMgmtTaxRegisterTypeLines = newFinancialMgmtTaxRegisterTypeLines;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxRegisterTypeLinesListType ";
	}
}
