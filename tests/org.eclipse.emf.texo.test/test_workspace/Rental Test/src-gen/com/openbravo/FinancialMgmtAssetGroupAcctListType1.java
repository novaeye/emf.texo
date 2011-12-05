package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAssetGroupAcctListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAssetGroupAcctListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAssetGroupAcctType> financialMgmtAssetGroupAcct = new ArrayList<FinancialMgmtAssetGroupAcctType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcct</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetGroupAcctType> getFinancialMgmtAssetGroupAcct() {
		return financialMgmtAssetGroupAcct;
	}

	/**
	 * Adds to the <em>financialMgmtAssetGroupAcct</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAssetGroupAcct(
			FinancialMgmtAssetGroupAcctType financialMgmtAssetGroupAcctValue) {
		if (!financialMgmtAssetGroupAcct
				.contains(financialMgmtAssetGroupAcctValue)) {

			financialMgmtAssetGroupAcct.add(financialMgmtAssetGroupAcctValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAssetGroupAcct</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAssetGroupAcct(
			FinancialMgmtAssetGroupAcctType financialMgmtAssetGroupAcctValue) {
		if (financialMgmtAssetGroupAcct
				.contains(financialMgmtAssetGroupAcctValue)) {
			financialMgmtAssetGroupAcct
					.remove(financialMgmtAssetGroupAcctValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAssetGroupAcct</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAssetGroupAcct() {
		while (!financialMgmtAssetGroupAcct.isEmpty()) {
			removeFromFinancialMgmtAssetGroupAcct(financialMgmtAssetGroupAcct
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAssetGroupAcctListType1#getFinancialMgmtAssetGroupAcct() <em>financialMgmtAssetGroupAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAssetGroupAcctListType1#getFinancialMgmtAssetGroupAcct() financialMgmtAssetGroupAcct}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcct(
			List<FinancialMgmtAssetGroupAcctType> newFinancialMgmtAssetGroupAcct) {
		financialMgmtAssetGroupAcct = newFinancialMgmtAssetGroupAcct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAssetGroupAcctListType1 ";
	}
}
