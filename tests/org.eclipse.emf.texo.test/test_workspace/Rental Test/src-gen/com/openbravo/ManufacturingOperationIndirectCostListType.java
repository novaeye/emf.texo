package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingOperationIndirectCostListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingOperationIndirectCostListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingOperationIndirectCostType> manufacturingOperationIndirectCost = new ArrayList<ManufacturingOperationIndirectCostType>();

	/**
	 * Returns the value of '<em><b>manufacturingOperationIndirectCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationIndirectCost</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationIndirectCostType> getManufacturingOperationIndirectCost() {
		return manufacturingOperationIndirectCost;
	}

	/**
	 * Adds to the <em>manufacturingOperationIndirectCost</em> feature.
	 * @generated
	 */
	public void addToManufacturingOperationIndirectCost(
			ManufacturingOperationIndirectCostType manufacturingOperationIndirectCostValue) {
		if (!manufacturingOperationIndirectCost
				.contains(manufacturingOperationIndirectCostValue)) {

			manufacturingOperationIndirectCost
					.add(manufacturingOperationIndirectCostValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingOperationIndirectCost</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingOperationIndirectCost(
			ManufacturingOperationIndirectCostType manufacturingOperationIndirectCostValue) {
		if (manufacturingOperationIndirectCost
				.contains(manufacturingOperationIndirectCostValue)) {
			manufacturingOperationIndirectCost
					.remove(manufacturingOperationIndirectCostValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingOperationIndirectCost</em> feature.
	 * @generated
	 */
	public void clearManufacturingOperationIndirectCost() {
		while (!manufacturingOperationIndirectCost.isEmpty()) {
			removeFromManufacturingOperationIndirectCost(manufacturingOperationIndirectCost
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingOperationIndirectCostListType#getManufacturingOperationIndirectCost() <em>manufacturingOperationIndirectCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationIndirectCostListType#getManufacturingOperationIndirectCost() manufacturingOperationIndirectCost}' feature.
	 * @generated
	 */
	public void setManufacturingOperationIndirectCost(
			List<ManufacturingOperationIndirectCostType> newManufacturingOperationIndirectCost) {
		manufacturingOperationIndirectCost = newManufacturingOperationIndirectCost;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingOperationIndirectCostListType ";
	}
}
