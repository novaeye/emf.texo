package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMachineStationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMachineStationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMachineStationType> manufacturingMachineStation = new ArrayList<ManufacturingMachineStationType>();

	/**
	 * Returns the value of '<em><b>manufacturingMachineStation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineStation</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMachineStationType> getManufacturingMachineStation() {
		return manufacturingMachineStation;
	}

	/**
	 * Adds to the <em>manufacturingMachineStation</em> feature.
	 * @generated
	 */
	public void addToManufacturingMachineStation(
			ManufacturingMachineStationType manufacturingMachineStationValue) {
		if (!manufacturingMachineStation
				.contains(manufacturingMachineStationValue)) {

			manufacturingMachineStation.add(manufacturingMachineStationValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMachineStation</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMachineStation(
			ManufacturingMachineStationType manufacturingMachineStationValue) {
		if (manufacturingMachineStation
				.contains(manufacturingMachineStationValue)) {
			manufacturingMachineStation
					.remove(manufacturingMachineStationValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMachineStation</em> feature.
	 * @generated
	 */
	public void clearManufacturingMachineStation() {
		while (!manufacturingMachineStation.isEmpty()) {
			removeFromManufacturingMachineStation(manufacturingMachineStation
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMachineStationListType#getManufacturingMachineStation() <em>manufacturingMachineStation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineStationListType#getManufacturingMachineStation() manufacturingMachineStation}' feature.
	 * @generated
	 */
	public void setManufacturingMachineStation(
			List<ManufacturingMachineStationType> newManufacturingMachineStation) {
		manufacturingMachineStation = newManufacturingMachineStation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMachineStationListType ";
	}
}
