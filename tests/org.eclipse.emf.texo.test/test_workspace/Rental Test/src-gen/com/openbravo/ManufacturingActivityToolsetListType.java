package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingActivityToolsetListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingActivityToolsetListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingActivityToolsetType> manufacturingActivityToolset = new ArrayList<ManufacturingActivityToolsetType>();

	/**
	 * Returns the value of '<em><b>manufacturingActivityToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingActivityToolset</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingActivityToolsetType> getManufacturingActivityToolset() {
		return manufacturingActivityToolset;
	}

	/**
	 * Adds to the <em>manufacturingActivityToolset</em> feature.
	 * @generated
	 */
	public void addToManufacturingActivityToolset(
			ManufacturingActivityToolsetType manufacturingActivityToolsetValue) {
		if (!manufacturingActivityToolset
				.contains(manufacturingActivityToolsetValue)) {

			manufacturingActivityToolset.add(manufacturingActivityToolsetValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingActivityToolset</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingActivityToolset(
			ManufacturingActivityToolsetType manufacturingActivityToolsetValue) {
		if (manufacturingActivityToolset
				.contains(manufacturingActivityToolsetValue)) {
			manufacturingActivityToolset
					.remove(manufacturingActivityToolsetValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingActivityToolset</em> feature.
	 * @generated
	 */
	public void clearManufacturingActivityToolset() {
		while (!manufacturingActivityToolset.isEmpty()) {
			removeFromManufacturingActivityToolset(manufacturingActivityToolset
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingActivityToolsetListType#getManufacturingActivityToolset() <em>manufacturingActivityToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingActivityToolsetListType#getManufacturingActivityToolset() manufacturingActivityToolset}' feature.
	 * @generated
	 */
	public void setManufacturingActivityToolset(
			List<ManufacturingActivityToolsetType> newManufacturingActivityToolset) {
		manufacturingActivityToolset = newManufacturingActivityToolset;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingActivityToolsetListType ";
	}
}
