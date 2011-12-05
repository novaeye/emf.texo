package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMaintenanceListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMaintenanceListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMaintenanceType> manufacturingMaintenance = new ArrayList<ManufacturingMaintenanceType>();

	/**
	 * Returns the value of '<em><b>manufacturingMaintenance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenance</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceType> getManufacturingMaintenance() {
		return manufacturingMaintenance;
	}

	/**
	 * Adds to the <em>manufacturingMaintenance</em> feature.
	 * @generated
	 */
	public void addToManufacturingMaintenance(
			ManufacturingMaintenanceType manufacturingMaintenanceValue) {
		if (!manufacturingMaintenance.contains(manufacturingMaintenanceValue)) {

			manufacturingMaintenance.add(manufacturingMaintenanceValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMaintenance</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMaintenance(
			ManufacturingMaintenanceType manufacturingMaintenanceValue) {
		if (manufacturingMaintenance.contains(manufacturingMaintenanceValue)) {
			manufacturingMaintenance.remove(manufacturingMaintenanceValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMaintenance</em> feature.
	 * @generated
	 */
	public void clearManufacturingMaintenance() {
		while (!manufacturingMaintenance.isEmpty()) {
			removeFromManufacturingMaintenance(manufacturingMaintenance
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMaintenanceListType#getManufacturingMaintenance() <em>manufacturingMaintenance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMaintenanceListType#getManufacturingMaintenance() manufacturingMaintenance}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenance(
			List<ManufacturingMaintenanceType> newManufacturingMaintenance) {
		manufacturingMaintenance = newManufacturingMaintenance;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMaintenanceListType ";
	}
}
