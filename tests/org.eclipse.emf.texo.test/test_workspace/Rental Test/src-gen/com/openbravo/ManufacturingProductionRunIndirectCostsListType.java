package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingProductionRunIndirectCostsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingProductionRunIndirectCostsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingProductionRunIndirectCostsType> manufacturingProductionRunIndirectCosts = new ArrayList<ManufacturingProductionRunIndirectCostsType>();

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunIndirectCosts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunIndirectCosts</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunIndirectCostsType> getManufacturingProductionRunIndirectCosts() {
		return manufacturingProductionRunIndirectCosts;
	}

	/**
	 * Adds to the <em>manufacturingProductionRunIndirectCosts</em> feature.
	 * @generated
	 */
	public void addToManufacturingProductionRunIndirectCosts(
			ManufacturingProductionRunIndirectCostsType manufacturingProductionRunIndirectCostsValue) {
		if (!manufacturingProductionRunIndirectCosts
				.contains(manufacturingProductionRunIndirectCostsValue)) {

			manufacturingProductionRunIndirectCosts
					.add(manufacturingProductionRunIndirectCostsValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingProductionRunIndirectCosts</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingProductionRunIndirectCosts(
			ManufacturingProductionRunIndirectCostsType manufacturingProductionRunIndirectCostsValue) {
		if (manufacturingProductionRunIndirectCosts
				.contains(manufacturingProductionRunIndirectCostsValue)) {
			manufacturingProductionRunIndirectCosts
					.remove(manufacturingProductionRunIndirectCostsValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingProductionRunIndirectCosts</em> feature.
	 * @generated
	 */
	public void clearManufacturingProductionRunIndirectCosts() {
		while (!manufacturingProductionRunIndirectCosts.isEmpty()) {
			removeFromManufacturingProductionRunIndirectCosts(manufacturingProductionRunIndirectCosts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingProductionRunIndirectCostsListType#getManufacturingProductionRunIndirectCosts() <em>manufacturingProductionRunIndirectCosts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingProductionRunIndirectCostsListType#getManufacturingProductionRunIndirectCosts() manufacturingProductionRunIndirectCosts}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunIndirectCosts(
			List<ManufacturingProductionRunIndirectCostsType> newManufacturingProductionRunIndirectCosts) {
		manufacturingProductionRunIndirectCosts = newManufacturingProductionRunIndirectCosts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingProductionRunIndirectCostsListType ";
	}
}
