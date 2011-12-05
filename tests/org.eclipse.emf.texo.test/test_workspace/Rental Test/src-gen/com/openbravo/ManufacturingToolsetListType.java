package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingToolsetListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingToolsetListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingToolsetType> manufacturingToolset = new ArrayList<ManufacturingToolsetType>();

	/**
	 * Returns the value of '<em><b>manufacturingToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingToolset</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingToolsetType> getManufacturingToolset() {
		return manufacturingToolset;
	}

	/**
	 * Adds to the <em>manufacturingToolset</em> feature.
	 * @generated
	 */
	public void addToManufacturingToolset(
			ManufacturingToolsetType manufacturingToolsetValue) {
		if (!manufacturingToolset.contains(manufacturingToolsetValue)) {

			manufacturingToolset.add(manufacturingToolsetValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingToolset</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingToolset(
			ManufacturingToolsetType manufacturingToolsetValue) {
		if (manufacturingToolset.contains(manufacturingToolsetValue)) {
			manufacturingToolset.remove(manufacturingToolsetValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingToolset</em> feature.
	 * @generated
	 */
	public void clearManufacturingToolset() {
		while (!manufacturingToolset.isEmpty()) {
			removeFromManufacturingToolset(manufacturingToolset.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingToolsetListType#getManufacturingToolset() <em>manufacturingToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingToolsetListType#getManufacturingToolset() manufacturingToolset}' feature.
	 * @generated
	 */
	public void setManufacturingToolset(
			List<ManufacturingToolsetType> newManufacturingToolset) {
		manufacturingToolset = newManufacturingToolset;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingToolsetListType ";
	}
}
