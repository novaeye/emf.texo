package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentRunPaymentListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentRunPaymentListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPaymentRunPaymentType> financialMgmtPaymentRunPayment = new ArrayList<FinancialMgmtPaymentRunPaymentType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunPayment</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentRunPaymentType> getFinancialMgmtPaymentRunPayment() {
		return financialMgmtPaymentRunPayment;
	}

	/**
	 * Adds to the <em>financialMgmtPaymentRunPayment</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPaymentRunPayment(
			FinancialMgmtPaymentRunPaymentType financialMgmtPaymentRunPaymentValue) {
		if (!financialMgmtPaymentRunPayment
				.contains(financialMgmtPaymentRunPaymentValue)) {

			financialMgmtPaymentRunPayment
					.add(financialMgmtPaymentRunPaymentValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPaymentRunPayment</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPaymentRunPayment(
			FinancialMgmtPaymentRunPaymentType financialMgmtPaymentRunPaymentValue) {
		if (financialMgmtPaymentRunPayment
				.contains(financialMgmtPaymentRunPaymentValue)) {
			financialMgmtPaymentRunPayment
					.remove(financialMgmtPaymentRunPaymentValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPaymentRunPayment</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPaymentRunPayment() {
		while (!financialMgmtPaymentRunPayment.isEmpty()) {
			removeFromFinancialMgmtPaymentRunPayment(financialMgmtPaymentRunPayment
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentRunPaymentListType#getFinancialMgmtPaymentRunPayment() <em>financialMgmtPaymentRunPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentRunPaymentListType#getFinancialMgmtPaymentRunPayment() financialMgmtPaymentRunPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunPayment(
			List<FinancialMgmtPaymentRunPaymentType> newFinancialMgmtPaymentRunPayment) {
		financialMgmtPaymentRunPayment = newFinancialMgmtPaymentRunPayment;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPaymentRunPaymentListType ";
	}
}
