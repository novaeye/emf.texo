package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtElementValueOperandListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtElementValueOperandListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtElementValueOperandType> financialMgmtElementValueOperand = new ArrayList<FinancialMgmtElementValueOperandType>();

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueOperand</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueOperand</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementValueOperandType> getFinancialMgmtElementValueOperand() {
		return financialMgmtElementValueOperand;
	}

	/**
	 * Adds to the <em>financialMgmtElementValueOperand</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtElementValueOperand(
			FinancialMgmtElementValueOperandType financialMgmtElementValueOperandValue) {
		if (!financialMgmtElementValueOperand
				.contains(financialMgmtElementValueOperandValue)) {

			financialMgmtElementValueOperand
					.add(financialMgmtElementValueOperandValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtElementValueOperand</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtElementValueOperand(
			FinancialMgmtElementValueOperandType financialMgmtElementValueOperandValue) {
		if (financialMgmtElementValueOperand
				.contains(financialMgmtElementValueOperandValue)) {
			financialMgmtElementValueOperand
					.remove(financialMgmtElementValueOperandValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtElementValueOperand</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtElementValueOperand() {
		while (!financialMgmtElementValueOperand.isEmpty()) {
			removeFromFinancialMgmtElementValueOperand(financialMgmtElementValueOperand
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueOperandListType#getFinancialMgmtElementValueOperand() <em>financialMgmtElementValueOperand</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueOperandListType#getFinancialMgmtElementValueOperand() financialMgmtElementValueOperand}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueOperand(
			List<FinancialMgmtElementValueOperandType> newFinancialMgmtElementValueOperand) {
		financialMgmtElementValueOperand = newFinancialMgmtElementValueOperand;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtElementValueOperandListType ";
	}
}
