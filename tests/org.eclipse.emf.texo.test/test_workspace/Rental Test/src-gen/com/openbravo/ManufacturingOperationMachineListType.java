package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingOperationMachineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingOperationMachineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingOperationMachineType> manufacturingOperationMachine = new ArrayList<ManufacturingOperationMachineType>();

	/**
	 * Returns the value of '<em><b>manufacturingOperationMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationMachineType> getManufacturingOperationMachine() {
		return manufacturingOperationMachine;
	}

	/**
	 * Adds to the <em>manufacturingOperationMachine</em> feature.
	 * @generated
	 */
	public void addToManufacturingOperationMachine(
			ManufacturingOperationMachineType manufacturingOperationMachineValue) {
		if (!manufacturingOperationMachine
				.contains(manufacturingOperationMachineValue)) {

			manufacturingOperationMachine
					.add(manufacturingOperationMachineValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingOperationMachine</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingOperationMachine(
			ManufacturingOperationMachineType manufacturingOperationMachineValue) {
		if (manufacturingOperationMachine
				.contains(manufacturingOperationMachineValue)) {
			manufacturingOperationMachine
					.remove(manufacturingOperationMachineValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingOperationMachine</em> feature.
	 * @generated
	 */
	public void clearManufacturingOperationMachine() {
		while (!manufacturingOperationMachine.isEmpty()) {
			removeFromManufacturingOperationMachine(manufacturingOperationMachine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingOperationMachineListType#getManufacturingOperationMachine() <em>manufacturingOperationMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationMachineListType#getManufacturingOperationMachine() manufacturingOperationMachine}' feature.
	 * @generated
	 */
	public void setManufacturingOperationMachine(
			List<ManufacturingOperationMachineType> newManufacturingOperationMachine) {
		manufacturingOperationMachine = newManufacturingOperationMachine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingOperationMachineListType ";
	}
}
