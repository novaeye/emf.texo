package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDPManagementLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDPManagementLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtDPManagementLineType> financialMgmtDPManagementLine = new ArrayList<FinancialMgmtDPManagementLineType>();

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagementLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDPManagementLineType> getFinancialMgmtDPManagementLine() {
		return financialMgmtDPManagementLine;
	}

	/**
	 * Adds to the <em>financialMgmtDPManagementLine</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtDPManagementLine(
			FinancialMgmtDPManagementLineType financialMgmtDPManagementLineValue) {
		if (!financialMgmtDPManagementLine
				.contains(financialMgmtDPManagementLineValue)) {

			financialMgmtDPManagementLine
					.add(financialMgmtDPManagementLineValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtDPManagementLine</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtDPManagementLine(
			FinancialMgmtDPManagementLineType financialMgmtDPManagementLineValue) {
		if (financialMgmtDPManagementLine
				.contains(financialMgmtDPManagementLineValue)) {
			financialMgmtDPManagementLine
					.remove(financialMgmtDPManagementLineValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtDPManagementLine</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtDPManagementLine() {
		while (!financialMgmtDPManagementLine.isEmpty()) {
			removeFromFinancialMgmtDPManagementLine(financialMgmtDPManagementLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtDPManagementLineListType#getFinancialMgmtDPManagementLine() <em>financialMgmtDPManagementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDPManagementLineListType#getFinancialMgmtDPManagementLine() financialMgmtDPManagementLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagementLine(
			List<FinancialMgmtDPManagementLineType> newFinancialMgmtDPManagementLine) {
		financialMgmtDPManagementLine = newFinancialMgmtDPManagementLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtDPManagementLineListType ";
	}
}
