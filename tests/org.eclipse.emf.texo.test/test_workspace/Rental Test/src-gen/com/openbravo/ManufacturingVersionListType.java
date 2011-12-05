package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingVersionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingVersionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingVersionType> manufacturingVersion = new ArrayList<ManufacturingVersionType>();

	/**
	 * Returns the value of '<em><b>manufacturingVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingVersion</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingVersionType> getManufacturingVersion() {
		return manufacturingVersion;
	}

	/**
	 * Adds to the <em>manufacturingVersion</em> feature.
	 * @generated
	 */
	public void addToManufacturingVersion(
			ManufacturingVersionType manufacturingVersionValue) {
		if (!manufacturingVersion.contains(manufacturingVersionValue)) {

			manufacturingVersion.add(manufacturingVersionValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingVersion</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingVersion(
			ManufacturingVersionType manufacturingVersionValue) {
		if (manufacturingVersion.contains(manufacturingVersionValue)) {
			manufacturingVersion.remove(manufacturingVersionValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingVersion</em> feature.
	 * @generated
	 */
	public void clearManufacturingVersion() {
		while (!manufacturingVersion.isEmpty()) {
			removeFromManufacturingVersion(manufacturingVersion.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingVersionListType#getManufacturingVersion() <em>manufacturingVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingVersionListType#getManufacturingVersion() manufacturingVersion}' feature.
	 * @generated
	 */
	public void setManufacturingVersion(
			List<ManufacturingVersionType> newManufacturingVersion) {
		manufacturingVersion = newManufacturingVersion;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingVersionListType ";
	}
}
