package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMaintenancePeriodicityListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMaintenancePeriodicityListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMaintenancePeriodicityType> manufacturingMaintenancePeriodicity = new ArrayList<ManufacturingMaintenancePeriodicityType>();

	/**
	 * Returns the value of '<em><b>manufacturingMaintenancePeriodicity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenancePeriodicity</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenancePeriodicityType> getManufacturingMaintenancePeriodicity() {
		return manufacturingMaintenancePeriodicity;
	}

	/**
	 * Adds to the <em>manufacturingMaintenancePeriodicity</em> feature.
	 * @generated
	 */
	public void addToManufacturingMaintenancePeriodicity(
			ManufacturingMaintenancePeriodicityType manufacturingMaintenancePeriodicityValue) {
		if (!manufacturingMaintenancePeriodicity
				.contains(manufacturingMaintenancePeriodicityValue)) {

			manufacturingMaintenancePeriodicity
					.add(manufacturingMaintenancePeriodicityValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMaintenancePeriodicity</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMaintenancePeriodicity(
			ManufacturingMaintenancePeriodicityType manufacturingMaintenancePeriodicityValue) {
		if (manufacturingMaintenancePeriodicity
				.contains(manufacturingMaintenancePeriodicityValue)) {
			manufacturingMaintenancePeriodicity
					.remove(manufacturingMaintenancePeriodicityValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMaintenancePeriodicity</em> feature.
	 * @generated
	 */
	public void clearManufacturingMaintenancePeriodicity() {
		while (!manufacturingMaintenancePeriodicity.isEmpty()) {
			removeFromManufacturingMaintenancePeriodicity(manufacturingMaintenancePeriodicity
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMaintenancePeriodicityListType#getManufacturingMaintenancePeriodicity() <em>manufacturingMaintenancePeriodicity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMaintenancePeriodicityListType#getManufacturingMaintenancePeriodicity() manufacturingMaintenancePeriodicity}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenancePeriodicity(
			List<ManufacturingMaintenancePeriodicityType> newManufacturingMaintenancePeriodicity) {
		manufacturingMaintenancePeriodicity = newManufacturingMaintenancePeriodicity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMaintenancePeriodicityListType ";
	}
}
