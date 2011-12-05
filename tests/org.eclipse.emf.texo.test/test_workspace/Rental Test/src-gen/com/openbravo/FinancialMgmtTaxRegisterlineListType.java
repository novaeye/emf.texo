package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxRegisterlineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxRegisterlineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxRegisterlineType> financialMgmtTaxRegisterline = new ArrayList<FinancialMgmtTaxRegisterlineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterline</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterline</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterlineType> getFinancialMgmtTaxRegisterline() {
		return financialMgmtTaxRegisterline;
	}

	/**
	 * Adds to the <em>financialMgmtTaxRegisterline</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxRegisterline(
			FinancialMgmtTaxRegisterlineType financialMgmtTaxRegisterlineValue) {
		if (!financialMgmtTaxRegisterline
				.contains(financialMgmtTaxRegisterlineValue)) {

			financialMgmtTaxRegisterline.add(financialMgmtTaxRegisterlineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxRegisterline</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxRegisterline(
			FinancialMgmtTaxRegisterlineType financialMgmtTaxRegisterlineValue) {
		if (financialMgmtTaxRegisterline
				.contains(financialMgmtTaxRegisterlineValue)) {
			financialMgmtTaxRegisterline
					.remove(financialMgmtTaxRegisterlineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxRegisterline</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxRegisterline() {
		while (!financialMgmtTaxRegisterline.isEmpty()) {
			removeFromFinancialMgmtTaxRegisterline(financialMgmtTaxRegisterline
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRegisterlineListType#getFinancialMgmtTaxRegisterline() <em>financialMgmtTaxRegisterline</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRegisterlineListType#getFinancialMgmtTaxRegisterline() financialMgmtTaxRegisterline}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterline(
			List<FinancialMgmtTaxRegisterlineType> newFinancialMgmtTaxRegisterline) {
		financialMgmtTaxRegisterline = newFinancialMgmtTaxRegisterline;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxRegisterlineListType ";
	}
}
