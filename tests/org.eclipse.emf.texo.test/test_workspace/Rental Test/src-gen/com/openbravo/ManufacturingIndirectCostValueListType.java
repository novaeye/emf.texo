package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingIndirectCostValueListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingIndirectCostValueListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingIndirectCostValueType> manufacturingIndirectCostValue = new ArrayList<ManufacturingIndirectCostValueType>();

	/**
	 * Returns the value of '<em><b>manufacturingIndirectCostValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIndirectCostValue</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingIndirectCostValueType> getManufacturingIndirectCostValue() {
		return manufacturingIndirectCostValue;
	}

	/**
	 * Adds to the <em>manufacturingIndirectCostValue</em> feature.
	 * @generated
	 */
	public void addToManufacturingIndirectCostValue(
			ManufacturingIndirectCostValueType manufacturingIndirectCostValueValue) {
		if (!manufacturingIndirectCostValue
				.contains(manufacturingIndirectCostValueValue)) {

			manufacturingIndirectCostValue
					.add(manufacturingIndirectCostValueValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingIndirectCostValue</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingIndirectCostValue(
			ManufacturingIndirectCostValueType manufacturingIndirectCostValueValue) {
		if (manufacturingIndirectCostValue
				.contains(manufacturingIndirectCostValueValue)) {
			manufacturingIndirectCostValue
					.remove(manufacturingIndirectCostValueValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingIndirectCostValue</em> feature.
	 * @generated
	 */
	public void clearManufacturingIndirectCostValue() {
		while (!manufacturingIndirectCostValue.isEmpty()) {
			removeFromManufacturingIndirectCostValue(manufacturingIndirectCostValue
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingIndirectCostValueListType#getManufacturingIndirectCostValue() <em>manufacturingIndirectCostValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingIndirectCostValueListType#getManufacturingIndirectCostValue() manufacturingIndirectCostValue}' feature.
	 * @generated
	 */
	public void setManufacturingIndirectCostValue(
			List<ManufacturingIndirectCostValueType> newManufacturingIndirectCostValue) {
		manufacturingIndirectCostValue = newManufacturingIndirectCostValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingIndirectCostValueListType ";
	}
}
