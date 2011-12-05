package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMaintenanceScheduleListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMaintenanceScheduleListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMaintenanceScheduleType> manufacturingMaintenanceSchedule = new ArrayList<ManufacturingMaintenanceScheduleType>();

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceSchedule</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceScheduleType> getManufacturingMaintenanceSchedule() {
		return manufacturingMaintenanceSchedule;
	}

	/**
	 * Adds to the <em>manufacturingMaintenanceSchedule</em> feature.
	 * @generated
	 */
	public void addToManufacturingMaintenanceSchedule(
			ManufacturingMaintenanceScheduleType manufacturingMaintenanceScheduleValue) {
		if (!manufacturingMaintenanceSchedule
				.contains(manufacturingMaintenanceScheduleValue)) {

			manufacturingMaintenanceSchedule
					.add(manufacturingMaintenanceScheduleValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMaintenanceSchedule</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMaintenanceSchedule(
			ManufacturingMaintenanceScheduleType manufacturingMaintenanceScheduleValue) {
		if (manufacturingMaintenanceSchedule
				.contains(manufacturingMaintenanceScheduleValue)) {
			manufacturingMaintenanceSchedule
					.remove(manufacturingMaintenanceScheduleValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMaintenanceSchedule</em> feature.
	 * @generated
	 */
	public void clearManufacturingMaintenanceSchedule() {
		while (!manufacturingMaintenanceSchedule.isEmpty()) {
			removeFromManufacturingMaintenanceSchedule(manufacturingMaintenanceSchedule
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMaintenanceScheduleListType#getManufacturingMaintenanceSchedule() <em>manufacturingMaintenanceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMaintenanceScheduleListType#getManufacturingMaintenanceSchedule() manufacturingMaintenanceSchedule}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceSchedule(
			List<ManufacturingMaintenanceScheduleType> newManufacturingMaintenanceSchedule) {
		manufacturingMaintenanceSchedule = newManufacturingMaintenanceSchedule;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMaintenanceScheduleListType ";
	}
}
