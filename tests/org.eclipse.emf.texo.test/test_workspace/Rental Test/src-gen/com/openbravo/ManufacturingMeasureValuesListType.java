package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMeasureValuesListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMeasureValuesListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMeasureValuesType> manufacturingMeasureValues = new ArrayList<ManufacturingMeasureValuesType>();

	/**
	 * Returns the value of '<em><b>manufacturingMeasureValues</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureValues</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureValuesType> getManufacturingMeasureValues() {
		return manufacturingMeasureValues;
	}

	/**
	 * Adds to the <em>manufacturingMeasureValues</em> feature.
	 * @generated
	 */
	public void addToManufacturingMeasureValues(
			ManufacturingMeasureValuesType manufacturingMeasureValuesValue) {
		if (!manufacturingMeasureValues
				.contains(manufacturingMeasureValuesValue)) {

			manufacturingMeasureValues.add(manufacturingMeasureValuesValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMeasureValues</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMeasureValues(
			ManufacturingMeasureValuesType manufacturingMeasureValuesValue) {
		if (manufacturingMeasureValues
				.contains(manufacturingMeasureValuesValue)) {
			manufacturingMeasureValues.remove(manufacturingMeasureValuesValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMeasureValues</em> feature.
	 * @generated
	 */
	public void clearManufacturingMeasureValues() {
		while (!manufacturingMeasureValues.isEmpty()) {
			removeFromManufacturingMeasureValues(manufacturingMeasureValues
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMeasureValuesListType#getManufacturingMeasureValues() <em>manufacturingMeasureValues</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMeasureValuesListType#getManufacturingMeasureValues() manufacturingMeasureValues}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureValues(
			List<ManufacturingMeasureValuesType> newManufacturingMeasureValues) {
		manufacturingMeasureValues = newManufacturingMeasureValues;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMeasureValuesListType ";
	}
}
