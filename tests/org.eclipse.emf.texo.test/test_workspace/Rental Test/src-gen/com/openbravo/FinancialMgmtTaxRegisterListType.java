package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxRegisterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxRegisterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxRegisterType> financialMgmtTaxRegister = new ArrayList<FinancialMgmtTaxRegisterType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegister</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegister</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterType> getFinancialMgmtTaxRegister() {
		return financialMgmtTaxRegister;
	}

	/**
	 * Adds to the <em>financialMgmtTaxRegister</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxRegister(
			FinancialMgmtTaxRegisterType financialMgmtTaxRegisterValue) {
		if (!financialMgmtTaxRegister.contains(financialMgmtTaxRegisterValue)) {

			financialMgmtTaxRegister.add(financialMgmtTaxRegisterValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxRegister</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxRegister(
			FinancialMgmtTaxRegisterType financialMgmtTaxRegisterValue) {
		if (financialMgmtTaxRegister.contains(financialMgmtTaxRegisterValue)) {
			financialMgmtTaxRegister.remove(financialMgmtTaxRegisterValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxRegister</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxRegister() {
		while (!financialMgmtTaxRegister.isEmpty()) {
			removeFromFinancialMgmtTaxRegister(financialMgmtTaxRegister
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRegisterListType#getFinancialMgmtTaxRegister() <em>financialMgmtTaxRegister</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRegisterListType#getFinancialMgmtTaxRegister() financialMgmtTaxRegister}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegister(
			List<FinancialMgmtTaxRegisterType> newFinancialMgmtTaxRegister) {
		financialMgmtTaxRegister = newFinancialMgmtTaxRegister;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxRegisterListType ";
	}
}
