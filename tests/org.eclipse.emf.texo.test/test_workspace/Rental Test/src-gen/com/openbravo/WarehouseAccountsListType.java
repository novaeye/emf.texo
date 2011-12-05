package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>WarehouseAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class WarehouseAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<WarehouseAccountsType> warehouseAccounts = new ArrayList<WarehouseAccountsType>();

	/**
	 * Returns the value of '<em><b>warehouseAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccounts</b></em>' feature
	 * @generated
	 */
	public List<WarehouseAccountsType> getWarehouseAccounts() {
		return warehouseAccounts;
	}

	/**
	 * Adds to the <em>warehouseAccounts</em> feature.
	 * @generated
	 */
	public void addToWarehouseAccounts(
			WarehouseAccountsType warehouseAccountsValue) {
		if (!warehouseAccounts.contains(warehouseAccountsValue)) {

			warehouseAccounts.add(warehouseAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>warehouseAccounts</em> feature.
	 * @generated
	 */
	public void removeFromWarehouseAccounts(
			WarehouseAccountsType warehouseAccountsValue) {
		if (warehouseAccounts.contains(warehouseAccountsValue)) {
			warehouseAccounts.remove(warehouseAccountsValue);
		}
	}

	/**			
	 * Clears the <em>warehouseAccounts</em> feature.
	 * @generated
	 */
	public void clearWarehouseAccounts() {
		while (!warehouseAccounts.isEmpty()) {
			removeFromWarehouseAccounts(warehouseAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link WarehouseAccountsListType#getWarehouseAccounts() <em>warehouseAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseAccountsListType#getWarehouseAccounts() warehouseAccounts}' feature.
	 * @generated
	 */
	public void setWarehouseAccounts(
			List<WarehouseAccountsType> newWarehouseAccounts) {
		warehouseAccounts = newWarehouseAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "WarehouseAccountsListType ";
	}
}
