package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingWorkEffortEmployeeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingWorkEffortEmployeeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingWorkEffortEmployeeType> manufacturingWorkEffortEmployee = new ArrayList<ManufacturingWorkEffortEmployeeType>();

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkEffortEmployeeType> getManufacturingWorkEffortEmployee() {
		return manufacturingWorkEffortEmployee;
	}

	/**
	 * Adds to the <em>manufacturingWorkEffortEmployee</em> feature.
	 * @generated
	 */
	public void addToManufacturingWorkEffortEmployee(
			ManufacturingWorkEffortEmployeeType manufacturingWorkEffortEmployeeValue) {
		if (!manufacturingWorkEffortEmployee
				.contains(manufacturingWorkEffortEmployeeValue)) {

			manufacturingWorkEffortEmployee
					.add(manufacturingWorkEffortEmployeeValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingWorkEffortEmployee</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingWorkEffortEmployee(
			ManufacturingWorkEffortEmployeeType manufacturingWorkEffortEmployeeValue) {
		if (manufacturingWorkEffortEmployee
				.contains(manufacturingWorkEffortEmployeeValue)) {
			manufacturingWorkEffortEmployee
					.remove(manufacturingWorkEffortEmployeeValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingWorkEffortEmployee</em> feature.
	 * @generated
	 */
	public void clearManufacturingWorkEffortEmployee() {
		while (!manufacturingWorkEffortEmployee.isEmpty()) {
			removeFromManufacturingWorkEffortEmployee(manufacturingWorkEffortEmployee
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingWorkEffortEmployeeListType#getManufacturingWorkEffortEmployee() <em>manufacturingWorkEffortEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingWorkEffortEmployeeListType#getManufacturingWorkEffortEmployee() manufacturingWorkEffortEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortEmployee(
			List<ManufacturingWorkEffortEmployeeType> newManufacturingWorkEffortEmployee) {
		manufacturingWorkEffortEmployee = newManufacturingWorkEffortEmployee;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingWorkEffortEmployeeListType ";
	}
}
