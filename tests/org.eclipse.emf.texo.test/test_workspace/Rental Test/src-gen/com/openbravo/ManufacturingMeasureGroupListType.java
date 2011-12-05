package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMeasureGroupListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMeasureGroupListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMeasureGroupType> manufacturingMeasureGroup = new ArrayList<ManufacturingMeasureGroupType>();

	/**
	 * Returns the value of '<em><b>manufacturingMeasureGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureGroup</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureGroupType> getManufacturingMeasureGroup() {
		return manufacturingMeasureGroup;
	}

	/**
	 * Adds to the <em>manufacturingMeasureGroup</em> feature.
	 * @generated
	 */
	public void addToManufacturingMeasureGroup(
			ManufacturingMeasureGroupType manufacturingMeasureGroupValue) {
		if (!manufacturingMeasureGroup.contains(manufacturingMeasureGroupValue)) {

			manufacturingMeasureGroup.add(manufacturingMeasureGroupValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMeasureGroup</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMeasureGroup(
			ManufacturingMeasureGroupType manufacturingMeasureGroupValue) {
		if (manufacturingMeasureGroup.contains(manufacturingMeasureGroupValue)) {
			manufacturingMeasureGroup.remove(manufacturingMeasureGroupValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMeasureGroup</em> feature.
	 * @generated
	 */
	public void clearManufacturingMeasureGroup() {
		while (!manufacturingMeasureGroup.isEmpty()) {
			removeFromManufacturingMeasureGroup(manufacturingMeasureGroup
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMeasureGroupListType#getManufacturingMeasureGroup() <em>manufacturingMeasureGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMeasureGroupListType#getManufacturingMeasureGroup() manufacturingMeasureGroup}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureGroup(
			List<ManufacturingMeasureGroupType> newManufacturingMeasureGroup) {
		manufacturingMeasureGroup = newManufacturingMeasureGroup;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMeasureGroupListType ";
	}
}
