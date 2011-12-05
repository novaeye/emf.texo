package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentBalancingListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentBalancingListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtDebtPaymentBalancingType> financialMgmtDebtPaymentBalancing = new ArrayList<FinancialMgmtDebtPaymentBalancingType>();

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalancing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalancing</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentBalancingType> getFinancialMgmtDebtPaymentBalancing() {
		return financialMgmtDebtPaymentBalancing;
	}

	/**
	 * Adds to the <em>financialMgmtDebtPaymentBalancing</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtDebtPaymentBalancing(
			FinancialMgmtDebtPaymentBalancingType financialMgmtDebtPaymentBalancingValue) {
		if (!financialMgmtDebtPaymentBalancing
				.contains(financialMgmtDebtPaymentBalancingValue)) {

			financialMgmtDebtPaymentBalancing
					.add(financialMgmtDebtPaymentBalancingValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtDebtPaymentBalancing</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtDebtPaymentBalancing(
			FinancialMgmtDebtPaymentBalancingType financialMgmtDebtPaymentBalancingValue) {
		if (financialMgmtDebtPaymentBalancing
				.contains(financialMgmtDebtPaymentBalancingValue)) {
			financialMgmtDebtPaymentBalancing
					.remove(financialMgmtDebtPaymentBalancingValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtDebtPaymentBalancing</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtDebtPaymentBalancing() {
		while (!financialMgmtDebtPaymentBalancing.isEmpty()) {
			removeFromFinancialMgmtDebtPaymentBalancing(financialMgmtDebtPaymentBalancing
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentBalancingListType#getFinancialMgmtDebtPaymentBalancing() <em>financialMgmtDebtPaymentBalancing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentBalancingListType#getFinancialMgmtDebtPaymentBalancing() financialMgmtDebtPaymentBalancing}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalancing(
			List<FinancialMgmtDebtPaymentBalancingType> newFinancialMgmtDebtPaymentBalancing) {
		financialMgmtDebtPaymentBalancing = newFinancialMgmtDebtPaymentBalancing;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtDebtPaymentBalancingListType ";
	}
}
