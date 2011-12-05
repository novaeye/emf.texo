package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingGlobalUseListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingGlobalUseListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingGlobalUseType> manufacturingGlobalUse = new ArrayList<ManufacturingGlobalUseType>();

	/**
	 * Returns the value of '<em><b>manufacturingGlobalUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingGlobalUse</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingGlobalUseType> getManufacturingGlobalUse() {
		return manufacturingGlobalUse;
	}

	/**
	 * Adds to the <em>manufacturingGlobalUse</em> feature.
	 * @generated
	 */
	public void addToManufacturingGlobalUse(
			ManufacturingGlobalUseType manufacturingGlobalUseValue) {
		if (!manufacturingGlobalUse.contains(manufacturingGlobalUseValue)) {

			manufacturingGlobalUse.add(manufacturingGlobalUseValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingGlobalUse</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingGlobalUse(
			ManufacturingGlobalUseType manufacturingGlobalUseValue) {
		if (manufacturingGlobalUse.contains(manufacturingGlobalUseValue)) {
			manufacturingGlobalUse.remove(manufacturingGlobalUseValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingGlobalUse</em> feature.
	 * @generated
	 */
	public void clearManufacturingGlobalUse() {
		while (!manufacturingGlobalUse.isEmpty()) {
			removeFromManufacturingGlobalUse(manufacturingGlobalUse.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingGlobalUseListType#getManufacturingGlobalUse() <em>manufacturingGlobalUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingGlobalUseListType#getManufacturingGlobalUse() manufacturingGlobalUse}' feature.
	 * @generated
	 */
	public void setManufacturingGlobalUse(
			List<ManufacturingGlobalUseType> newManufacturingGlobalUse) {
		manufacturingGlobalUse = newManufacturingGlobalUse;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingGlobalUseListType ";
	}
}
