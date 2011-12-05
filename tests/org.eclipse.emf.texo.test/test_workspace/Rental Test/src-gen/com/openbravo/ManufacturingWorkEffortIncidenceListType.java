package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingWorkEffortIncidenceListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingWorkEffortIncidenceListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingWorkEffortIncidenceType> manufacturingWorkEffortIncidence = new ArrayList<ManufacturingWorkEffortIncidenceType>();

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortIncidence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortIncidence</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkEffortIncidenceType> getManufacturingWorkEffortIncidence() {
		return manufacturingWorkEffortIncidence;
	}

	/**
	 * Adds to the <em>manufacturingWorkEffortIncidence</em> feature.
	 * @generated
	 */
	public void addToManufacturingWorkEffortIncidence(
			ManufacturingWorkEffortIncidenceType manufacturingWorkEffortIncidenceValue) {
		if (!manufacturingWorkEffortIncidence
				.contains(manufacturingWorkEffortIncidenceValue)) {

			manufacturingWorkEffortIncidence
					.add(manufacturingWorkEffortIncidenceValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingWorkEffortIncidence</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingWorkEffortIncidence(
			ManufacturingWorkEffortIncidenceType manufacturingWorkEffortIncidenceValue) {
		if (manufacturingWorkEffortIncidence
				.contains(manufacturingWorkEffortIncidenceValue)) {
			manufacturingWorkEffortIncidence
					.remove(manufacturingWorkEffortIncidenceValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingWorkEffortIncidence</em> feature.
	 * @generated
	 */
	public void clearManufacturingWorkEffortIncidence() {
		while (!manufacturingWorkEffortIncidence.isEmpty()) {
			removeFromManufacturingWorkEffortIncidence(manufacturingWorkEffortIncidence
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingWorkEffortIncidenceListType#getManufacturingWorkEffortIncidence() <em>manufacturingWorkEffortIncidence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingWorkEffortIncidenceListType#getManufacturingWorkEffortIncidence() manufacturingWorkEffortIncidence}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortIncidence(
			List<ManufacturingWorkEffortIncidenceType> newManufacturingWorkEffortIncidence) {
		manufacturingWorkEffortIncidence = newManufacturingWorkEffortIncidence;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingWorkEffortIncidenceListType ";
	}
}
