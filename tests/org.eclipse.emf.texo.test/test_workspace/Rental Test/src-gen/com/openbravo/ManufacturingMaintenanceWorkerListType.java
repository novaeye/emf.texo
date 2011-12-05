package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMaintenanceWorkerListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMaintenanceWorkerListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingMaintenanceWorkerType> manufacturingMaintenanceWorker = new ArrayList<ManufacturingMaintenanceWorkerType>();

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceWorker</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceWorker</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceWorkerType> getManufacturingMaintenanceWorker() {
		return manufacturingMaintenanceWorker;
	}

	/**
	 * Adds to the <em>manufacturingMaintenanceWorker</em> feature.
	 * @generated
	 */
	public void addToManufacturingMaintenanceWorker(
			ManufacturingMaintenanceWorkerType manufacturingMaintenanceWorkerValue) {
		if (!manufacturingMaintenanceWorker
				.contains(manufacturingMaintenanceWorkerValue)) {

			manufacturingMaintenanceWorker
					.add(manufacturingMaintenanceWorkerValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingMaintenanceWorker</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingMaintenanceWorker(
			ManufacturingMaintenanceWorkerType manufacturingMaintenanceWorkerValue) {
		if (manufacturingMaintenanceWorker
				.contains(manufacturingMaintenanceWorkerValue)) {
			manufacturingMaintenanceWorker
					.remove(manufacturingMaintenanceWorkerValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingMaintenanceWorker</em> feature.
	 * @generated
	 */
	public void clearManufacturingMaintenanceWorker() {
		while (!manufacturingMaintenanceWorker.isEmpty()) {
			removeFromManufacturingMaintenanceWorker(manufacturingMaintenanceWorker
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingMaintenanceWorkerListType#getManufacturingMaintenanceWorker() <em>manufacturingMaintenanceWorker</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMaintenanceWorkerListType#getManufacturingMaintenanceWorker() manufacturingMaintenanceWorker}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceWorker(
			List<ManufacturingMaintenanceWorkerType> newManufacturingMaintenanceWorker) {
		manufacturingMaintenanceWorker = newManufacturingMaintenanceWorker;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingMaintenanceWorkerListType ";
	}
}
