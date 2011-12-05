package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingValueListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingValueListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingValueType> manufacturingValue = new ArrayList<ManufacturingValueType>();

	/**
	 * Returns the value of '<em><b>manufacturingValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingValue</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingValueType> getManufacturingValue() {
		return manufacturingValue;
	}

	/**
	 * Adds to the <em>manufacturingValue</em> feature.
	 * @generated
	 */
	public void addToManufacturingValue(
			ManufacturingValueType manufacturingValueValue) {
		if (!manufacturingValue.contains(manufacturingValueValue)) {

			manufacturingValue.add(manufacturingValueValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingValue</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingValue(
			ManufacturingValueType manufacturingValueValue) {
		if (manufacturingValue.contains(manufacturingValueValue)) {
			manufacturingValue.remove(manufacturingValueValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingValue</em> feature.
	 * @generated
	 */
	public void clearManufacturingValue() {
		while (!manufacturingValue.isEmpty()) {
			removeFromManufacturingValue(manufacturingValue.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingValueListType#getManufacturingValue() <em>manufacturingValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingValueListType#getManufacturingValue() manufacturingValue}' feature.
	 * @generated
	 */
	public void setManufacturingValue(
			List<ManufacturingValueType> newManufacturingValue) {
		manufacturingValue = newManufacturingValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingValueListType ";
	}
}
