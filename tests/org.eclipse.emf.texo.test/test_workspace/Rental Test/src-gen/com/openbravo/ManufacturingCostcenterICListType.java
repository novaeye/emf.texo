package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingCostcenterICListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingCostcenterICListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingCostcenterICType> manufacturingCostcenterIC = new ArrayList<ManufacturingCostcenterICType>();

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterIC</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterIC</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostcenterICType> getManufacturingCostcenterIC() {
		return manufacturingCostcenterIC;
	}

	/**
	 * Adds to the <em>manufacturingCostcenterIC</em> feature.
	 * @generated
	 */
	public void addToManufacturingCostcenterIC(
			ManufacturingCostcenterICType manufacturingCostcenterICValue) {
		if (!manufacturingCostcenterIC.contains(manufacturingCostcenterICValue)) {

			manufacturingCostcenterIC.add(manufacturingCostcenterICValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingCostcenterIC</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingCostcenterIC(
			ManufacturingCostcenterICType manufacturingCostcenterICValue) {
		if (manufacturingCostcenterIC.contains(manufacturingCostcenterICValue)) {
			manufacturingCostcenterIC.remove(manufacturingCostcenterICValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingCostcenterIC</em> feature.
	 * @generated
	 */
	public void clearManufacturingCostcenterIC() {
		while (!manufacturingCostcenterIC.isEmpty()) {
			removeFromManufacturingCostcenterIC(manufacturingCostcenterIC
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingCostcenterICListType#getManufacturingCostcenterIC() <em>manufacturingCostcenterIC</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingCostcenterICListType#getManufacturingCostcenterIC() manufacturingCostcenterIC}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterIC(
			List<ManufacturingCostcenterICType> newManufacturingCostcenterIC) {
		manufacturingCostcenterIC = newManufacturingCostcenterIC;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingCostcenterICListType ";
	}
}
