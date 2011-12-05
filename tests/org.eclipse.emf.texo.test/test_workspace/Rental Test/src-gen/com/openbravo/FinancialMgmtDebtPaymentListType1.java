package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtDebtPaymentType> financialMgmtDebtPayment = new ArrayList<FinancialMgmtDebtPaymentType>();

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPayment</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentType> getFinancialMgmtDebtPayment() {
		return financialMgmtDebtPayment;
	}

	/**
	 * Adds to the <em>financialMgmtDebtPayment</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtDebtPayment(
			FinancialMgmtDebtPaymentType financialMgmtDebtPaymentValue) {
		if (!financialMgmtDebtPayment.contains(financialMgmtDebtPaymentValue)) {

			financialMgmtDebtPayment.add(financialMgmtDebtPaymentValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtDebtPayment</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtDebtPayment(
			FinancialMgmtDebtPaymentType financialMgmtDebtPaymentValue) {
		if (financialMgmtDebtPayment.contains(financialMgmtDebtPaymentValue)) {
			financialMgmtDebtPayment.remove(financialMgmtDebtPaymentValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtDebtPayment</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtDebtPayment() {
		while (!financialMgmtDebtPayment.isEmpty()) {
			removeFromFinancialMgmtDebtPayment(financialMgmtDebtPayment
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentListType1#getFinancialMgmtDebtPayment() <em>financialMgmtDebtPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentListType1#getFinancialMgmtDebtPayment() financialMgmtDebtPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPayment(
			List<FinancialMgmtDebtPaymentType> newFinancialMgmtDebtPayment) {
		financialMgmtDebtPayment = newFinancialMgmtDebtPayment;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtDebtPaymentListType1 ";
	}
}
