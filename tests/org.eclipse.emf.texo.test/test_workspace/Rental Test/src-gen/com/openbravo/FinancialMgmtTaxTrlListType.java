package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxTrlType> financialMgmtTaxTrl = new ArrayList<FinancialMgmtTaxTrlType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxTrlType> getFinancialMgmtTaxTrl() {
		return financialMgmtTaxTrl;
	}

	/**
	 * Adds to the <em>financialMgmtTaxTrl</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxTrl(
			FinancialMgmtTaxTrlType financialMgmtTaxTrlValue) {
		if (!financialMgmtTaxTrl.contains(financialMgmtTaxTrlValue)) {

			financialMgmtTaxTrl.add(financialMgmtTaxTrlValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxTrl</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxTrl(
			FinancialMgmtTaxTrlType financialMgmtTaxTrlValue) {
		if (financialMgmtTaxTrl.contains(financialMgmtTaxTrlValue)) {
			financialMgmtTaxTrl.remove(financialMgmtTaxTrlValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxTrl</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxTrl() {
		while (!financialMgmtTaxTrl.isEmpty()) {
			removeFromFinancialMgmtTaxTrl(financialMgmtTaxTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxTrlListType#getFinancialMgmtTaxTrl() <em>financialMgmtTaxTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxTrlListType#getFinancialMgmtTaxTrl() financialMgmtTaxTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxTrl(
			List<FinancialMgmtTaxTrlType> newFinancialMgmtTaxTrl) {
		financialMgmtTaxTrl = newFinancialMgmtTaxTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxTrlListType ";
	}
}
