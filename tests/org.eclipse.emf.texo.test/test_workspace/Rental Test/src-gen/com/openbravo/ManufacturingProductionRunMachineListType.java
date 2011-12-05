package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingProductionRunMachineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingProductionRunMachineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingProductionRunMachineType> manufacturingProductionRunMachine = new ArrayList<ManufacturingProductionRunMachineType>();

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunMachineType> getManufacturingProductionRunMachine() {
		return manufacturingProductionRunMachine;
	}

	/**
	 * Adds to the <em>manufacturingProductionRunMachine</em> feature.
	 * @generated
	 */
	public void addToManufacturingProductionRunMachine(
			ManufacturingProductionRunMachineType manufacturingProductionRunMachineValue) {
		if (!manufacturingProductionRunMachine
				.contains(manufacturingProductionRunMachineValue)) {

			manufacturingProductionRunMachine
					.add(manufacturingProductionRunMachineValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingProductionRunMachine</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingProductionRunMachine(
			ManufacturingProductionRunMachineType manufacturingProductionRunMachineValue) {
		if (manufacturingProductionRunMachine
				.contains(manufacturingProductionRunMachineValue)) {
			manufacturingProductionRunMachine
					.remove(manufacturingProductionRunMachineValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingProductionRunMachine</em> feature.
	 * @generated
	 */
	public void clearManufacturingProductionRunMachine() {
		while (!manufacturingProductionRunMachine.isEmpty()) {
			removeFromManufacturingProductionRunMachine(manufacturingProductionRunMachine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingProductionRunMachineListType#getManufacturingProductionRunMachine() <em>manufacturingProductionRunMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingProductionRunMachineListType#getManufacturingProductionRunMachine() manufacturingProductionRunMachine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunMachine(
			List<ManufacturingProductionRunMachineType> newManufacturingProductionRunMachine) {
		manufacturingProductionRunMachine = newManufacturingProductionRunMachine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingProductionRunMachineListType ";
	}
}
