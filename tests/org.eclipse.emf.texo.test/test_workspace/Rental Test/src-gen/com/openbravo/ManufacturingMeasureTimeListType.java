package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMeasureTimeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMeasureTimeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMeasureTimeType> manufacturingMeasureTime = new ArrayList<ManufacturingMeasureTimeType>();

	/**
	 * Returns the value of '<em><b>manufacturingMeasureTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureTime</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureTimeType> getManufacturingMeasureTime() {
		return manufacturingMeasureTime;
	}

	/**
	 * Adds to the <em>manufacturingMeasureTime</em> feature.
	 * @generated
	 */
	public void addToManufacturingMeasureTime(
			ManufacturingMeasureTimeType manufacturingMeasureTimeValue) {
		if (!manufacturingMeasureTime.contains(manufacturingMeasureTimeValue)) {

			manufacturingMeasureTime.add(manufacturingMeasureTimeValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMeasureTime</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMeasureTime(
			ManufacturingMeasureTimeType manufacturingMeasureTimeValue) {
		if (manufacturingMeasureTime.contains(manufacturingMeasureTimeValue)) {
			manufacturingMeasureTime.remove(manufacturingMeasureTimeValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMeasureTime</em> feature.
	 * @generated
	 */
	public void clearManufacturingMeasureTime() {
		while (!manufacturingMeasureTime.isEmpty()) {
			removeFromManufacturingMeasureTime(manufacturingMeasureTime
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMeasureTimeListType#getManufacturingMeasureTime() <em>manufacturingMeasureTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMeasureTimeListType#getManufacturingMeasureTime() manufacturingMeasureTime}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureTime(
			List<ManufacturingMeasureTimeType> newManufacturingMeasureTime) {
		manufacturingMeasureTime = newManufacturingMeasureTime;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMeasureTimeListType ";
	}
}
