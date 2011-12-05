package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingCheckPointShiftListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingCheckPointShiftListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingCheckPointShiftType> manufacturingCheckPointShift = new ArrayList<ManufacturingCheckPointShiftType>();

	/**
	 * Returns the value of '<em><b>manufacturingCheckPointShift</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPointShift</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCheckPointShiftType> getManufacturingCheckPointShift() {
		return manufacturingCheckPointShift;
	}

	/**
	 * Adds to the <em>manufacturingCheckPointShift</em> feature.
	 * @generated
	 */
	public void addToManufacturingCheckPointShift(
			ManufacturingCheckPointShiftType manufacturingCheckPointShiftValue) {
		if (!manufacturingCheckPointShift
				.contains(manufacturingCheckPointShiftValue)) {

			manufacturingCheckPointShift.add(manufacturingCheckPointShiftValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingCheckPointShift</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingCheckPointShift(
			ManufacturingCheckPointShiftType manufacturingCheckPointShiftValue) {
		if (manufacturingCheckPointShift
				.contains(manufacturingCheckPointShiftValue)) {
			manufacturingCheckPointShift
					.remove(manufacturingCheckPointShiftValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingCheckPointShift</em> feature.
	 * @generated
	 */
	public void clearManufacturingCheckPointShift() {
		while (!manufacturingCheckPointShift.isEmpty()) {
			removeFromManufacturingCheckPointShift(manufacturingCheckPointShift
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingCheckPointShiftListType#getManufacturingCheckPointShift() <em>manufacturingCheckPointShift</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingCheckPointShiftListType#getManufacturingCheckPointShift() manufacturingCheckPointShift}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPointShift(
			List<ManufacturingCheckPointShiftType> newManufacturingCheckPointShift) {
		manufacturingCheckPointShift = newManufacturingCheckPointShift;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingCheckPointShiftListType ";
	}
}
