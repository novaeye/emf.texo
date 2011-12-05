package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingActivityListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingActivityListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingActivityType> manufacturingActivity = new ArrayList<ManufacturingActivityType>();

	/**
	 * Returns the value of '<em><b>manufacturingActivity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingActivity</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingActivityType> getManufacturingActivity() {
		return manufacturingActivity;
	}

	/**
	 * Adds to the <em>manufacturingActivity</em> feature.
	 * @generated
	 */
	public void addToManufacturingActivity(
			ManufacturingActivityType manufacturingActivityValue) {
		if (!manufacturingActivity.contains(manufacturingActivityValue)) {

			manufacturingActivity.add(manufacturingActivityValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingActivity</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingActivity(
			ManufacturingActivityType manufacturingActivityValue) {
		if (manufacturingActivity.contains(manufacturingActivityValue)) {
			manufacturingActivity.remove(manufacturingActivityValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingActivity</em> feature.
	 * @generated
	 */
	public void clearManufacturingActivity() {
		while (!manufacturingActivity.isEmpty()) {
			removeFromManufacturingActivity(manufacturingActivity.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingActivityListType#getManufacturingActivity() <em>manufacturingActivity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingActivityListType#getManufacturingActivity() manufacturingActivity}' feature.
	 * @generated
	 */
	public void setManufacturingActivity(
			List<ManufacturingActivityType> newManufacturingActivity) {
		manufacturingActivity = newManufacturingActivity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingActivityListType ";
	}
}
