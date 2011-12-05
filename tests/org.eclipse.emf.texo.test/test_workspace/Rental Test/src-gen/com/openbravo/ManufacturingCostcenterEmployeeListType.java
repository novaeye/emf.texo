package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingCostcenterEmployeeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingCostcenterEmployeeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingCostcenterEmployeeType> manufacturingCostcenterEmployee = new ArrayList<ManufacturingCostcenterEmployeeType>();

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostcenterEmployeeType> getManufacturingCostcenterEmployee() {
		return manufacturingCostcenterEmployee;
	}

	/**
	 * Adds to the <em>manufacturingCostcenterEmployee</em> feature.
	 * @generated
	 */
	public void addToManufacturingCostcenterEmployee(
			ManufacturingCostcenterEmployeeType manufacturingCostcenterEmployeeValue) {
		if (!manufacturingCostcenterEmployee
				.contains(manufacturingCostcenterEmployeeValue)) {

			manufacturingCostcenterEmployee
					.add(manufacturingCostcenterEmployeeValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingCostcenterEmployee</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingCostcenterEmployee(
			ManufacturingCostcenterEmployeeType manufacturingCostcenterEmployeeValue) {
		if (manufacturingCostcenterEmployee
				.contains(manufacturingCostcenterEmployeeValue)) {
			manufacturingCostcenterEmployee
					.remove(manufacturingCostcenterEmployeeValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingCostcenterEmployee</em> feature.
	 * @generated
	 */
	public void clearManufacturingCostcenterEmployee() {
		while (!manufacturingCostcenterEmployee.isEmpty()) {
			removeFromManufacturingCostcenterEmployee(manufacturingCostcenterEmployee
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingCostcenterEmployeeListType#getManufacturingCostcenterEmployee() <em>manufacturingCostcenterEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingCostcenterEmployeeListType#getManufacturingCostcenterEmployee() manufacturingCostcenterEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterEmployee(
			List<ManufacturingCostcenterEmployeeType> newManufacturingCostcenterEmployee) {
		manufacturingCostcenterEmployee = newManufacturingCostcenterEmployee;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingCostcenterEmployeeListType ";
	}
}
