package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtYearListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtYearListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtYearType> financialMgmtYear = new ArrayList<FinancialMgmtYearType>();

	/**
	 * Returns the value of '<em><b>financialMgmtYear</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtYear</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtYearType> getFinancialMgmtYear() {
		return financialMgmtYear;
	}

	/**
	 * Adds to the <em>financialMgmtYear</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtYear(
			FinancialMgmtYearType financialMgmtYearValue) {
		if (!financialMgmtYear.contains(financialMgmtYearValue)) {

			financialMgmtYear.add(financialMgmtYearValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtYear</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtYear(
			FinancialMgmtYearType financialMgmtYearValue) {
		if (financialMgmtYear.contains(financialMgmtYearValue)) {
			financialMgmtYear.remove(financialMgmtYearValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtYear</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtYear() {
		while (!financialMgmtYear.isEmpty()) {
			removeFromFinancialMgmtYear(financialMgmtYear.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtYearListType#getFinancialMgmtYear() <em>financialMgmtYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtYearListType#getFinancialMgmtYear() financialMgmtYear}' feature.
	 * @generated
	 */
	public void setFinancialMgmtYear(
			List<FinancialMgmtYearType> newFinancialMgmtYear) {
		financialMgmtYear = newFinancialMgmtYear;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtYearListType ";
	}
}
