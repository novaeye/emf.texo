package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingProductionRunEmployeeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingProductionRunEmployeeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingProductionRunEmployeeType> manufacturingProductionRunEmployee = new ArrayList<ManufacturingProductionRunEmployeeType>();

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunEmployeeType> getManufacturingProductionRunEmployee() {
		return manufacturingProductionRunEmployee;
	}

	/**
	 * Adds to the <em>manufacturingProductionRunEmployee</em> feature.
	 * @generated
	 */
	public void addToManufacturingProductionRunEmployee(
			ManufacturingProductionRunEmployeeType manufacturingProductionRunEmployeeValue) {
		if (!manufacturingProductionRunEmployee
				.contains(manufacturingProductionRunEmployeeValue)) {

			manufacturingProductionRunEmployee
					.add(manufacturingProductionRunEmployeeValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingProductionRunEmployee</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingProductionRunEmployee(
			ManufacturingProductionRunEmployeeType manufacturingProductionRunEmployeeValue) {
		if (manufacturingProductionRunEmployee
				.contains(manufacturingProductionRunEmployeeValue)) {
			manufacturingProductionRunEmployee
					.remove(manufacturingProductionRunEmployeeValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingProductionRunEmployee</em> feature.
	 * @generated
	 */
	public void clearManufacturingProductionRunEmployee() {
		while (!manufacturingProductionRunEmployee.isEmpty()) {
			removeFromManufacturingProductionRunEmployee(manufacturingProductionRunEmployee
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingProductionRunEmployeeListType#getManufacturingProductionRunEmployee() <em>manufacturingProductionRunEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingProductionRunEmployeeListType#getManufacturingProductionRunEmployee() manufacturingProductionRunEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunEmployee(
			List<ManufacturingProductionRunEmployeeType> newManufacturingProductionRunEmployee) {
		manufacturingProductionRunEmployee = newManufacturingProductionRunEmployee;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingProductionRunEmployeeListType ";
	}
}
