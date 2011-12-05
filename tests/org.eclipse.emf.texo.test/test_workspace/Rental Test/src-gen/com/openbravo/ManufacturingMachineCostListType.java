package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMachineCostListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMachineCostListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMachineCostType> manufacturingMachineCost = new ArrayList<ManufacturingMachineCostType>();

	/**
	 * Returns the value of '<em><b>manufacturingMachineCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineCost</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMachineCostType> getManufacturingMachineCost() {
		return manufacturingMachineCost;
	}

	/**
	 * Adds to the <em>manufacturingMachineCost</em> feature.
	 * @generated
	 */
	public void addToManufacturingMachineCost(
			ManufacturingMachineCostType manufacturingMachineCostValue) {
		if (!manufacturingMachineCost.contains(manufacturingMachineCostValue)) {

			manufacturingMachineCost.add(manufacturingMachineCostValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMachineCost</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMachineCost(
			ManufacturingMachineCostType manufacturingMachineCostValue) {
		if (manufacturingMachineCost.contains(manufacturingMachineCostValue)) {
			manufacturingMachineCost.remove(manufacturingMachineCostValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMachineCost</em> feature.
	 * @generated
	 */
	public void clearManufacturingMachineCost() {
		while (!manufacturingMachineCost.isEmpty()) {
			removeFromManufacturingMachineCost(manufacturingMachineCost
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMachineCostListType#getManufacturingMachineCost() <em>manufacturingMachineCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineCostListType#getManufacturingMachineCost() manufacturingMachineCost}' feature.
	 * @generated
	 */
	public void setManufacturingMachineCost(
			List<ManufacturingMachineCostType> newManufacturingMachineCost) {
		manufacturingMachineCost = newManufacturingMachineCost;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMachineCostListType ";
	}
}
