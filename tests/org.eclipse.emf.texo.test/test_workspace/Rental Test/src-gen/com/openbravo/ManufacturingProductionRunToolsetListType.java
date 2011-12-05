package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingProductionRunToolsetListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingProductionRunToolsetListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingProductionRunToolsetType> manufacturingProductionRunToolset = new ArrayList<ManufacturingProductionRunToolsetType>();

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunToolset</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunToolsetType> getManufacturingProductionRunToolset() {
		return manufacturingProductionRunToolset;
	}

	/**
	 * Adds to the <em>manufacturingProductionRunToolset</em> feature.
	 * @generated
	 */
	public void addToManufacturingProductionRunToolset(
			ManufacturingProductionRunToolsetType manufacturingProductionRunToolsetValue) {
		if (!manufacturingProductionRunToolset
				.contains(manufacturingProductionRunToolsetValue)) {

			manufacturingProductionRunToolset
					.add(manufacturingProductionRunToolsetValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingProductionRunToolset</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingProductionRunToolset(
			ManufacturingProductionRunToolsetType manufacturingProductionRunToolsetValue) {
		if (manufacturingProductionRunToolset
				.contains(manufacturingProductionRunToolsetValue)) {
			manufacturingProductionRunToolset
					.remove(manufacturingProductionRunToolsetValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingProductionRunToolset</em> feature.
	 * @generated
	 */
	public void clearManufacturingProductionRunToolset() {
		while (!manufacturingProductionRunToolset.isEmpty()) {
			removeFromManufacturingProductionRunToolset(manufacturingProductionRunToolset
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingProductionRunToolsetListType#getManufacturingProductionRunToolset() <em>manufacturingProductionRunToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingProductionRunToolsetListType#getManufacturingProductionRunToolset() manufacturingProductionRunToolset}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunToolset(
			List<ManufacturingProductionRunToolsetType> newManufacturingProductionRunToolset) {
		manufacturingProductionRunToolset = newManufacturingProductionRunToolset;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingProductionRunToolsetListType ";
	}
}
