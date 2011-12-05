package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentRunParameterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentRunParameterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPaymentRunParameterType> financialMgmtPaymentRunParameter = new ArrayList<FinancialMgmtPaymentRunParameterType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunParameter</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentRunParameterType> getFinancialMgmtPaymentRunParameter() {
		return financialMgmtPaymentRunParameter;
	}

	/**
	 * Adds to the <em>financialMgmtPaymentRunParameter</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPaymentRunParameter(
			FinancialMgmtPaymentRunParameterType financialMgmtPaymentRunParameterValue) {
		if (!financialMgmtPaymentRunParameter
				.contains(financialMgmtPaymentRunParameterValue)) {

			financialMgmtPaymentRunParameter
					.add(financialMgmtPaymentRunParameterValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPaymentRunParameter</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPaymentRunParameter(
			FinancialMgmtPaymentRunParameterType financialMgmtPaymentRunParameterValue) {
		if (financialMgmtPaymentRunParameter
				.contains(financialMgmtPaymentRunParameterValue)) {
			financialMgmtPaymentRunParameter
					.remove(financialMgmtPaymentRunParameterValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPaymentRunParameter</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPaymentRunParameter() {
		while (!financialMgmtPaymentRunParameter.isEmpty()) {
			removeFromFinancialMgmtPaymentRunParameter(financialMgmtPaymentRunParameter
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentRunParameterListType#getFinancialMgmtPaymentRunParameter() <em>financialMgmtPaymentRunParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentRunParameterListType#getFinancialMgmtPaymentRunParameter() financialMgmtPaymentRunParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunParameter(
			List<FinancialMgmtPaymentRunParameterType> newFinancialMgmtPaymentRunParameter) {
		financialMgmtPaymentRunParameter = newFinancialMgmtPaymentRunParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPaymentRunParameterListType ";
	}
}
