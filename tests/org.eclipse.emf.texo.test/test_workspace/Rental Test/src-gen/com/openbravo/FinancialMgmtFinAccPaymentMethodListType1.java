package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtFinAccPaymentMethodListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtFinAccPaymentMethodListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtFinAccPaymentMethodType> financialMgmtFinAccPaymentMethod = new ArrayList<FinancialMgmtFinAccPaymentMethodType>();

	/**
	 * Returns the value of '<em><b>financialMgmtFinAccPaymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtFinAccPaymentMethod</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtFinAccPaymentMethodType> getFinancialMgmtFinAccPaymentMethod() {
		return financialMgmtFinAccPaymentMethod;
	}

	/**
	 * Adds to the <em>financialMgmtFinAccPaymentMethod</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtFinAccPaymentMethod(
			FinancialMgmtFinAccPaymentMethodType financialMgmtFinAccPaymentMethodValue) {
		if (!financialMgmtFinAccPaymentMethod
				.contains(financialMgmtFinAccPaymentMethodValue)) {

			financialMgmtFinAccPaymentMethod
					.add(financialMgmtFinAccPaymentMethodValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtFinAccPaymentMethod</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtFinAccPaymentMethod(
			FinancialMgmtFinAccPaymentMethodType financialMgmtFinAccPaymentMethodValue) {
		if (financialMgmtFinAccPaymentMethod
				.contains(financialMgmtFinAccPaymentMethodValue)) {
			financialMgmtFinAccPaymentMethod
					.remove(financialMgmtFinAccPaymentMethodValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtFinAccPaymentMethod</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtFinAccPaymentMethod() {
		while (!financialMgmtFinAccPaymentMethod.isEmpty()) {
			removeFromFinancialMgmtFinAccPaymentMethod(financialMgmtFinAccPaymentMethod
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodListType1#getFinancialMgmtFinAccPaymentMethod() <em>financialMgmtFinAccPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodListType1#getFinancialMgmtFinAccPaymentMethod() financialMgmtFinAccPaymentMethod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtFinAccPaymentMethod(
			List<FinancialMgmtFinAccPaymentMethodType> newFinancialMgmtFinAccPaymentMethod) {
		financialMgmtFinAccPaymentMethod = newFinancialMgmtFinAccPaymentMethod;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtFinAccPaymentMethodListType1 ";
	}
}
