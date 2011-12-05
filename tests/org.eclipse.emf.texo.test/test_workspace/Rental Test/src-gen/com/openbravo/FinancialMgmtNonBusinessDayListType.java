package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtNonBusinessDayListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtNonBusinessDayListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtNonBusinessDayType> financialMgmtNonBusinessDay = new ArrayList<FinancialMgmtNonBusinessDayType>();

	/**
	 * Returns the value of '<em><b>financialMgmtNonBusinessDay</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtNonBusinessDay</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtNonBusinessDayType> getFinancialMgmtNonBusinessDay() {
		return financialMgmtNonBusinessDay;
	}

	/**
	 * Adds to the <em>financialMgmtNonBusinessDay</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtNonBusinessDay(
			FinancialMgmtNonBusinessDayType financialMgmtNonBusinessDayValue) {
		if (!financialMgmtNonBusinessDay
				.contains(financialMgmtNonBusinessDayValue)) {

			financialMgmtNonBusinessDay.add(financialMgmtNonBusinessDayValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtNonBusinessDay</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtNonBusinessDay(
			FinancialMgmtNonBusinessDayType financialMgmtNonBusinessDayValue) {
		if (financialMgmtNonBusinessDay
				.contains(financialMgmtNonBusinessDayValue)) {
			financialMgmtNonBusinessDay
					.remove(financialMgmtNonBusinessDayValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtNonBusinessDay</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtNonBusinessDay() {
		while (!financialMgmtNonBusinessDay.isEmpty()) {
			removeFromFinancialMgmtNonBusinessDay(financialMgmtNonBusinessDay
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtNonBusinessDayListType#getFinancialMgmtNonBusinessDay() <em>financialMgmtNonBusinessDay</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtNonBusinessDayListType#getFinancialMgmtNonBusinessDay() financialMgmtNonBusinessDay}' feature.
	 * @generated
	 */
	public void setFinancialMgmtNonBusinessDay(
			List<FinancialMgmtNonBusinessDayType> newFinancialMgmtNonBusinessDay) {
		financialMgmtNonBusinessDay = newFinancialMgmtNonBusinessDay;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtNonBusinessDayListType ";
	}
}
