package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAssetListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAssetListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAssetType> financialMgmtAsset = new ArrayList<FinancialMgmtAssetType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAsset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAsset</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetType> getFinancialMgmtAsset() {
		return financialMgmtAsset;
	}

	/**
	 * Adds to the <em>financialMgmtAsset</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAsset(
			FinancialMgmtAssetType financialMgmtAssetValue) {
		if (!financialMgmtAsset.contains(financialMgmtAssetValue)) {

			financialMgmtAsset.add(financialMgmtAssetValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAsset</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAsset(
			FinancialMgmtAssetType financialMgmtAssetValue) {
		if (financialMgmtAsset.contains(financialMgmtAssetValue)) {
			financialMgmtAsset.remove(financialMgmtAssetValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAsset</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAsset() {
		while (!financialMgmtAsset.isEmpty()) {
			removeFromFinancialMgmtAsset(financialMgmtAsset.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAssetListType#getFinancialMgmtAsset() <em>financialMgmtAsset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAssetListType#getFinancialMgmtAsset() financialMgmtAsset}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAsset(
			List<FinancialMgmtAssetType> newFinancialMgmtAsset) {
		financialMgmtAsset = newFinancialMgmtAsset;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAssetListType ";
	}
}
