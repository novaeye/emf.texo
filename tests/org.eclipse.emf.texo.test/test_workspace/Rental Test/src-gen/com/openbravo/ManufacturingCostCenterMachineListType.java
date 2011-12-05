package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingCostCenterMachineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingCostCenterMachineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingCostCenterMachineType> manufacturingCostCenterMachine = new ArrayList<ManufacturingCostCenterMachineType>();

	/**
	 * Returns the value of '<em><b>manufacturingCostCenterMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostCenterMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostCenterMachineType> getManufacturingCostCenterMachine() {
		return manufacturingCostCenterMachine;
	}

	/**
	 * Adds to the <em>manufacturingCostCenterMachine</em> feature.
	 * @generated
	 */
	public void addToManufacturingCostCenterMachine(
			ManufacturingCostCenterMachineType manufacturingCostCenterMachineValue) {
		if (!manufacturingCostCenterMachine
				.contains(manufacturingCostCenterMachineValue)) {

			manufacturingCostCenterMachine
					.add(manufacturingCostCenterMachineValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingCostCenterMachine</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingCostCenterMachine(
			ManufacturingCostCenterMachineType manufacturingCostCenterMachineValue) {
		if (manufacturingCostCenterMachine
				.contains(manufacturingCostCenterMachineValue)) {
			manufacturingCostCenterMachine
					.remove(manufacturingCostCenterMachineValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingCostCenterMachine</em> feature.
	 * @generated
	 */
	public void clearManufacturingCostCenterMachine() {
		while (!manufacturingCostCenterMachine.isEmpty()) {
			removeFromManufacturingCostCenterMachine(manufacturingCostCenterMachine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingCostCenterMachineListType#getManufacturingCostCenterMachine() <em>manufacturingCostCenterMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingCostCenterMachineListType#getManufacturingCostCenterMachine() manufacturingCostCenterMachine}' feature.
	 * @generated
	 */
	public void setManufacturingCostCenterMachine(
			List<ManufacturingCostCenterMachineType> newManufacturingCostCenterMachine) {
		manufacturingCostCenterMachine = newManufacturingCostCenterMachine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingCostCenterMachineListType ";
	}
}
