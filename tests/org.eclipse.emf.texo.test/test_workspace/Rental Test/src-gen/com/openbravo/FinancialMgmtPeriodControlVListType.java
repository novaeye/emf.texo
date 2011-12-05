package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPeriodControlVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPeriodControlVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPeriodControlVType> financialMgmtPeriodControlV = new ArrayList<FinancialMgmtPeriodControlVType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControlV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControlV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPeriodControlVType> getFinancialMgmtPeriodControlV() {
		return financialMgmtPeriodControlV;
	}

	/**
	 * Adds to the <em>financialMgmtPeriodControlV</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPeriodControlV(
			FinancialMgmtPeriodControlVType financialMgmtPeriodControlVValue) {
		if (!financialMgmtPeriodControlV
				.contains(financialMgmtPeriodControlVValue)) {

			financialMgmtPeriodControlV.add(financialMgmtPeriodControlVValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPeriodControlV</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPeriodControlV(
			FinancialMgmtPeriodControlVType financialMgmtPeriodControlVValue) {
		if (financialMgmtPeriodControlV
				.contains(financialMgmtPeriodControlVValue)) {
			financialMgmtPeriodControlV
					.remove(financialMgmtPeriodControlVValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPeriodControlV</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPeriodControlV() {
		while (!financialMgmtPeriodControlV.isEmpty()) {
			removeFromFinancialMgmtPeriodControlV(financialMgmtPeriodControlV
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodControlVListType#getFinancialMgmtPeriodControlV() <em>financialMgmtPeriodControlV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodControlVListType#getFinancialMgmtPeriodControlV() financialMgmtPeriodControlV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControlV(
			List<FinancialMgmtPeriodControlVType> newFinancialMgmtPeriodControlV) {
		financialMgmtPeriodControlV = newFinancialMgmtPeriodControlV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPeriodControlVListType ";
	}
}
