package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtElementValueListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtElementValueListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtElementValueType> financialMgmtElementValue = new ArrayList<FinancialMgmtElementValueType>();

	/**
	 * Returns the value of '<em><b>financialMgmtElementValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValue</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementValueType> getFinancialMgmtElementValue() {
		return financialMgmtElementValue;
	}

	/**
	 * Adds to the <em>financialMgmtElementValue</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtElementValue(
			FinancialMgmtElementValueType financialMgmtElementValueValue) {
		if (!financialMgmtElementValue.contains(financialMgmtElementValueValue)) {

			financialMgmtElementValue.add(financialMgmtElementValueValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtElementValue</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtElementValue(
			FinancialMgmtElementValueType financialMgmtElementValueValue) {
		if (financialMgmtElementValue.contains(financialMgmtElementValueValue)) {
			financialMgmtElementValue.remove(financialMgmtElementValueValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtElementValue</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtElementValue() {
		while (!financialMgmtElementValue.isEmpty()) {
			removeFromFinancialMgmtElementValue(financialMgmtElementValue
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueListType#getFinancialMgmtElementValue() <em>financialMgmtElementValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueListType#getFinancialMgmtElementValue() financialMgmtElementValue}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValue(
			List<FinancialMgmtElementValueType> newFinancialMgmtElementValue) {
		financialMgmtElementValue = newFinancialMgmtElementValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtElementValueListType ";
	}
}
