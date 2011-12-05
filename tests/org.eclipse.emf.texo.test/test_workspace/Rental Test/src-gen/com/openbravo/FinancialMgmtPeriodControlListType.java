package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPeriodControlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPeriodControlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPeriodControlType> financialMgmtPeriodControl = new ArrayList<FinancialMgmtPeriodControlType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPeriodControlType> getFinancialMgmtPeriodControl() {
		return financialMgmtPeriodControl;
	}

	/**
	 * Adds to the <em>financialMgmtPeriodControl</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPeriodControl(
			FinancialMgmtPeriodControlType financialMgmtPeriodControlValue) {
		if (!financialMgmtPeriodControl
				.contains(financialMgmtPeriodControlValue)) {

			financialMgmtPeriodControl.add(financialMgmtPeriodControlValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPeriodControl</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPeriodControl(
			FinancialMgmtPeriodControlType financialMgmtPeriodControlValue) {
		if (financialMgmtPeriodControl
				.contains(financialMgmtPeriodControlValue)) {
			financialMgmtPeriodControl.remove(financialMgmtPeriodControlValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPeriodControl</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPeriodControl() {
		while (!financialMgmtPeriodControl.isEmpty()) {
			removeFromFinancialMgmtPeriodControl(financialMgmtPeriodControl
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodControlListType#getFinancialMgmtPeriodControl() <em>financialMgmtPeriodControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodControlListType#getFinancialMgmtPeriodControl() financialMgmtPeriodControl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControl(
			List<FinancialMgmtPeriodControlType> newFinancialMgmtPeriodControl) {
		financialMgmtPeriodControl = newFinancialMgmtPeriodControl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPeriodControlListType ";
	}
}
