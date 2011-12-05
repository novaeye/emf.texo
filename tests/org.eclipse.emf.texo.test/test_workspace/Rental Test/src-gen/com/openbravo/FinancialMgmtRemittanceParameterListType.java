package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtRemittanceParameterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtRemittanceParameterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtRemittanceParameterType> financialMgmtRemittanceParameter = new ArrayList<FinancialMgmtRemittanceParameterType>();

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceParameter</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtRemittanceParameterType> getFinancialMgmtRemittanceParameter() {
		return financialMgmtRemittanceParameter;
	}

	/**
	 * Adds to the <em>financialMgmtRemittanceParameter</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtRemittanceParameter(
			FinancialMgmtRemittanceParameterType financialMgmtRemittanceParameterValue) {
		if (!financialMgmtRemittanceParameter
				.contains(financialMgmtRemittanceParameterValue)) {

			financialMgmtRemittanceParameter
					.add(financialMgmtRemittanceParameterValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtRemittanceParameter</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtRemittanceParameter(
			FinancialMgmtRemittanceParameterType financialMgmtRemittanceParameterValue) {
		if (financialMgmtRemittanceParameter
				.contains(financialMgmtRemittanceParameterValue)) {
			financialMgmtRemittanceParameter
					.remove(financialMgmtRemittanceParameterValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtRemittanceParameter</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtRemittanceParameter() {
		while (!financialMgmtRemittanceParameter.isEmpty()) {
			removeFromFinancialMgmtRemittanceParameter(financialMgmtRemittanceParameter
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtRemittanceParameterListType#getFinancialMgmtRemittanceParameter() <em>financialMgmtRemittanceParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtRemittanceParameterListType#getFinancialMgmtRemittanceParameter() financialMgmtRemittanceParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceParameter(
			List<FinancialMgmtRemittanceParameterType> newFinancialMgmtRemittanceParameter) {
		financialMgmtRemittanceParameter = newFinancialMgmtRemittanceParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtRemittanceParameterListType ";
	}
}
