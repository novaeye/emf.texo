package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctRptGroupListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctRptGroupListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAcctRptGroupType> financialMgmtAcctRptGroup = new ArrayList<FinancialMgmtAcctRptGroupType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptGroup</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctRptGroupType> getFinancialMgmtAcctRptGroup() {
		return financialMgmtAcctRptGroup;
	}

	/**
	 * Adds to the <em>financialMgmtAcctRptGroup</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAcctRptGroup(
			FinancialMgmtAcctRptGroupType financialMgmtAcctRptGroupValue) {
		if (!financialMgmtAcctRptGroup.contains(financialMgmtAcctRptGroupValue)) {

			financialMgmtAcctRptGroup.add(financialMgmtAcctRptGroupValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAcctRptGroup</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAcctRptGroup(
			FinancialMgmtAcctRptGroupType financialMgmtAcctRptGroupValue) {
		if (financialMgmtAcctRptGroup.contains(financialMgmtAcctRptGroupValue)) {
			financialMgmtAcctRptGroup.remove(financialMgmtAcctRptGroupValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAcctRptGroup</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAcctRptGroup() {
		while (!financialMgmtAcctRptGroup.isEmpty()) {
			removeFromFinancialMgmtAcctRptGroup(financialMgmtAcctRptGroup
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctRptGroupListType#getFinancialMgmtAcctRptGroup() <em>financialMgmtAcctRptGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctRptGroupListType#getFinancialMgmtAcctRptGroup() financialMgmtAcctRptGroup}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptGroup(
			List<FinancialMgmtAcctRptGroupType> newFinancialMgmtAcctRptGroup) {
		financialMgmtAcctRptGroup = newFinancialMgmtAcctRptGroup;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAcctRptGroupListType ";
	}
}
