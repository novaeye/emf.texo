package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctRptNodeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctRptNodeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAcctRptNodeType> financialMgmtAcctRptNode = new ArrayList<FinancialMgmtAcctRptNodeType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptNode</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctRptNodeType> getFinancialMgmtAcctRptNode() {
		return financialMgmtAcctRptNode;
	}

	/**
	 * Adds to the <em>financialMgmtAcctRptNode</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAcctRptNode(
			FinancialMgmtAcctRptNodeType financialMgmtAcctRptNodeValue) {
		if (!financialMgmtAcctRptNode.contains(financialMgmtAcctRptNodeValue)) {

			financialMgmtAcctRptNode.add(financialMgmtAcctRptNodeValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAcctRptNode</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAcctRptNode(
			FinancialMgmtAcctRptNodeType financialMgmtAcctRptNodeValue) {
		if (financialMgmtAcctRptNode.contains(financialMgmtAcctRptNodeValue)) {
			financialMgmtAcctRptNode.remove(financialMgmtAcctRptNodeValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAcctRptNode</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAcctRptNode() {
		while (!financialMgmtAcctRptNode.isEmpty()) {
			removeFromFinancialMgmtAcctRptNode(financialMgmtAcctRptNode
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctRptNodeListType#getFinancialMgmtAcctRptNode() <em>financialMgmtAcctRptNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctRptNodeListType#getFinancialMgmtAcctRptNode() financialMgmtAcctRptNode}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptNode(
			List<FinancialMgmtAcctRptNodeType> newFinancialMgmtAcctRptNode) {
		financialMgmtAcctRptNode = newFinancialMgmtAcctRptNode;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAcctRptNodeListType ";
	}
}
