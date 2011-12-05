package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingOperationEmployeeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingOperationEmployeeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingOperationEmployeeType> manufacturingOperationEmployee = new ArrayList<ManufacturingOperationEmployeeType>();

	/**
	 * Returns the value of '<em><b>manufacturingOperationEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationEmployeeType> getManufacturingOperationEmployee() {
		return manufacturingOperationEmployee;
	}

	/**
	 * Adds to the <em>manufacturingOperationEmployee</em> feature.
	 * @generated
	 */
	public void addToManufacturingOperationEmployee(
			ManufacturingOperationEmployeeType manufacturingOperationEmployeeValue) {
		if (!manufacturingOperationEmployee
				.contains(manufacturingOperationEmployeeValue)) {

			manufacturingOperationEmployee
					.add(manufacturingOperationEmployeeValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingOperationEmployee</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingOperationEmployee(
			ManufacturingOperationEmployeeType manufacturingOperationEmployeeValue) {
		if (manufacturingOperationEmployee
				.contains(manufacturingOperationEmployeeValue)) {
			manufacturingOperationEmployee
					.remove(manufacturingOperationEmployeeValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingOperationEmployee</em> feature.
	 * @generated
	 */
	public void clearManufacturingOperationEmployee() {
		while (!manufacturingOperationEmployee.isEmpty()) {
			removeFromManufacturingOperationEmployee(manufacturingOperationEmployee
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingOperationEmployeeListType#getManufacturingOperationEmployee() <em>manufacturingOperationEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationEmployeeListType#getManufacturingOperationEmployee() manufacturingOperationEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingOperationEmployee(
			List<ManufacturingOperationEmployeeType> newManufacturingOperationEmployee) {
		manufacturingOperationEmployee = newManufacturingOperationEmployee;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingOperationEmployeeListType ";
	}
}
