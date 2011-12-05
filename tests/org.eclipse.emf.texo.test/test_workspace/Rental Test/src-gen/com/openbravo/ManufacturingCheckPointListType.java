package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingCheckPointListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingCheckPointListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingCheckPointType> manufacturingCheckPoint = new ArrayList<ManufacturingCheckPointType>();

	/**
	 * Returns the value of '<em><b>manufacturingCheckPoint</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPoint</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCheckPointType> getManufacturingCheckPoint() {
		return manufacturingCheckPoint;
	}

	/**
	 * Adds to the <em>manufacturingCheckPoint</em> feature.
	 * @generated
	 */
	public void addToManufacturingCheckPoint(
			ManufacturingCheckPointType manufacturingCheckPointValue) {
		if (!manufacturingCheckPoint.contains(manufacturingCheckPointValue)) {

			manufacturingCheckPoint.add(manufacturingCheckPointValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingCheckPoint</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingCheckPoint(
			ManufacturingCheckPointType manufacturingCheckPointValue) {
		if (manufacturingCheckPoint.contains(manufacturingCheckPointValue)) {
			manufacturingCheckPoint.remove(manufacturingCheckPointValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingCheckPoint</em> feature.
	 * @generated
	 */
	public void clearManufacturingCheckPoint() {
		while (!manufacturingCheckPoint.isEmpty()) {
			removeFromManufacturingCheckPoint(manufacturingCheckPoint
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingCheckPointListType#getManufacturingCheckPoint() <em>manufacturingCheckPoint</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingCheckPointListType#getManufacturingCheckPoint() manufacturingCheckPoint}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPoint(
			List<ManufacturingCheckPointType> newManufacturingCheckPoint) {
		manufacturingCheckPoint = newManufacturingCheckPoint;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingCheckPointListType ";
	}
}
