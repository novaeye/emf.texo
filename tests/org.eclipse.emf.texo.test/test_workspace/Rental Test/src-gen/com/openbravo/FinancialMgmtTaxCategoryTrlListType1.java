package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxCategoryTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxCategoryTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxCategoryTrlType> financialMgmtTaxCategoryTrl = new ArrayList<FinancialMgmtTaxCategoryTrlType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxCategoryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxCategoryTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxCategoryTrlType> getFinancialMgmtTaxCategoryTrl() {
		return financialMgmtTaxCategoryTrl;
	}

	/**
	 * Adds to the <em>financialMgmtTaxCategoryTrl</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxCategoryTrl(
			FinancialMgmtTaxCategoryTrlType financialMgmtTaxCategoryTrlValue) {
		if (!financialMgmtTaxCategoryTrl
				.contains(financialMgmtTaxCategoryTrlValue)) {

			financialMgmtTaxCategoryTrl.add(financialMgmtTaxCategoryTrlValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxCategoryTrl</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxCategoryTrl(
			FinancialMgmtTaxCategoryTrlType financialMgmtTaxCategoryTrlValue) {
		if (financialMgmtTaxCategoryTrl
				.contains(financialMgmtTaxCategoryTrlValue)) {
			financialMgmtTaxCategoryTrl
					.remove(financialMgmtTaxCategoryTrlValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxCategoryTrl</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxCategoryTrl() {
		while (!financialMgmtTaxCategoryTrl.isEmpty()) {
			removeFromFinancialMgmtTaxCategoryTrl(financialMgmtTaxCategoryTrl
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxCategoryTrlListType1#getFinancialMgmtTaxCategoryTrl() <em>financialMgmtTaxCategoryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxCategoryTrlListType1#getFinancialMgmtTaxCategoryTrl() financialMgmtTaxCategoryTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxCategoryTrl(
			List<FinancialMgmtTaxCategoryTrlType> newFinancialMgmtTaxCategoryTrl) {
		financialMgmtTaxCategoryTrl = newFinancialMgmtTaxCategoryTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxCategoryTrlListType1 ";
	}
}
