package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPeriodListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPeriodListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPeriodType> financialMgmtPeriod = new ArrayList<FinancialMgmtPeriodType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPeriod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriod</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPeriodType> getFinancialMgmtPeriod() {
		return financialMgmtPeriod;
	}

	/**
	 * Adds to the <em>financialMgmtPeriod</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPeriod(
			FinancialMgmtPeriodType financialMgmtPeriodValue) {
		if (!financialMgmtPeriod.contains(financialMgmtPeriodValue)) {

			financialMgmtPeriod.add(financialMgmtPeriodValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPeriod</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPeriod(
			FinancialMgmtPeriodType financialMgmtPeriodValue) {
		if (financialMgmtPeriod.contains(financialMgmtPeriodValue)) {
			financialMgmtPeriod.remove(financialMgmtPeriodValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPeriod</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPeriod() {
		while (!financialMgmtPeriod.isEmpty()) {
			removeFromFinancialMgmtPeriod(financialMgmtPeriod.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodListType#getFinancialMgmtPeriod() <em>financialMgmtPeriod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodListType#getFinancialMgmtPeriod() financialMgmtPeriod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriod(
			List<FinancialMgmtPeriodType> newFinancialMgmtPeriod) {
		financialMgmtPeriod = newFinancialMgmtPeriod;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPeriodListType ";
	}
}
