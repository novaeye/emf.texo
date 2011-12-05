package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>WarehouseShipperListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class WarehouseShipperListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<WarehouseShipperType> warehouseShipper = new ArrayList<WarehouseShipperType>();

	/**
	 * Returns the value of '<em><b>warehouseShipper</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseShipper</b></em>' feature
	 * @generated
	 */
	public List<WarehouseShipperType> getWarehouseShipper() {
		return warehouseShipper;
	}

	/**
	 * Adds to the <em>warehouseShipper</em> feature.
	 * @generated
	 */
	public void addToWarehouseShipper(WarehouseShipperType warehouseShipperValue) {
		if (!warehouseShipper.contains(warehouseShipperValue)) {

			warehouseShipper.add(warehouseShipperValue);
		}

	}

	/**			
	 * Removes from the <em>warehouseShipper</em> feature.
	 * @generated
	 */
	public void removeFromWarehouseShipper(
			WarehouseShipperType warehouseShipperValue) {
		if (warehouseShipper.contains(warehouseShipperValue)) {
			warehouseShipper.remove(warehouseShipperValue);
		}
	}

	/**			
	 * Clears the <em>warehouseShipper</em> feature.
	 * @generated
	 */
	public void clearWarehouseShipper() {
		while (!warehouseShipper.isEmpty()) {
			removeFromWarehouseShipper(warehouseShipper.iterator().next());
		}
	}

	/**
	 * Sets the '{@link WarehouseShipperListType1#getWarehouseShipper() <em>warehouseShipper</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseShipperListType1#getWarehouseShipper() warehouseShipper}' feature.
	 * @generated
	 */
	public void setWarehouseShipper(
			List<WarehouseShipperType> newWarehouseShipper) {
		warehouseShipper = newWarehouseShipper;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "WarehouseShipperListType1 ";
	}
}
