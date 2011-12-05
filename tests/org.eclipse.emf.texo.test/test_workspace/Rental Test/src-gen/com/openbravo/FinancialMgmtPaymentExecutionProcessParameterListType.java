package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentExecutionProcessParameterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentExecutionProcessParameterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPaymentExecutionProcessParameterType> financialMgmtPaymentExecutionProcessParameter = new ArrayList<FinancialMgmtPaymentExecutionProcessParameterType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionProcessParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionProcessParameter</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentExecutionProcessParameterType> getFinancialMgmtPaymentExecutionProcessParameter() {
		return financialMgmtPaymentExecutionProcessParameter;
	}

	/**
	 * Adds to the <em>financialMgmtPaymentExecutionProcessParameter</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPaymentExecutionProcessParameter(
			FinancialMgmtPaymentExecutionProcessParameterType financialMgmtPaymentExecutionProcessParameterValue) {
		if (!financialMgmtPaymentExecutionProcessParameter
				.contains(financialMgmtPaymentExecutionProcessParameterValue)) {

			financialMgmtPaymentExecutionProcessParameter
					.add(financialMgmtPaymentExecutionProcessParameterValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPaymentExecutionProcessParameter</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPaymentExecutionProcessParameter(
			FinancialMgmtPaymentExecutionProcessParameterType financialMgmtPaymentExecutionProcessParameterValue) {
		if (financialMgmtPaymentExecutionProcessParameter
				.contains(financialMgmtPaymentExecutionProcessParameterValue)) {
			financialMgmtPaymentExecutionProcessParameter
					.remove(financialMgmtPaymentExecutionProcessParameterValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPaymentExecutionProcessParameter</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPaymentExecutionProcessParameter() {
		while (!financialMgmtPaymentExecutionProcessParameter.isEmpty()) {
			removeFromFinancialMgmtPaymentExecutionProcessParameter(financialMgmtPaymentExecutionProcessParameter
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentExecutionProcessParameterListType#getFinancialMgmtPaymentExecutionProcessParameter() <em>financialMgmtPaymentExecutionProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentExecutionProcessParameterListType#getFinancialMgmtPaymentExecutionProcessParameter() financialMgmtPaymentExecutionProcessParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionProcessParameter(
			List<FinancialMgmtPaymentExecutionProcessParameterType> newFinancialMgmtPaymentExecutionProcessParameter) {
		financialMgmtPaymentExecutionProcessParameter = newFinancialMgmtPaymentExecutionProcessParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPaymentExecutionProcessParameterListType ";
	}
}
