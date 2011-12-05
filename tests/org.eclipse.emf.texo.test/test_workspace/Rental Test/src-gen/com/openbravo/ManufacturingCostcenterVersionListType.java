package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingCostcenterVersionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingCostcenterVersionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingCostcenterVersionType> manufacturingCostcenterVersion = new ArrayList<ManufacturingCostcenterVersionType>();

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterVersion</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostcenterVersionType> getManufacturingCostcenterVersion() {
		return manufacturingCostcenterVersion;
	}

	/**
	 * Adds to the <em>manufacturingCostcenterVersion</em> feature.
	 * @generated
	 */
	public void addToManufacturingCostcenterVersion(
			ManufacturingCostcenterVersionType manufacturingCostcenterVersionValue) {
		if (!manufacturingCostcenterVersion
				.contains(manufacturingCostcenterVersionValue)) {

			manufacturingCostcenterVersion
					.add(manufacturingCostcenterVersionValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingCostcenterVersion</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingCostcenterVersion(
			ManufacturingCostcenterVersionType manufacturingCostcenterVersionValue) {
		if (manufacturingCostcenterVersion
				.contains(manufacturingCostcenterVersionValue)) {
			manufacturingCostcenterVersion
					.remove(manufacturingCostcenterVersionValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingCostcenterVersion</em> feature.
	 * @generated
	 */
	public void clearManufacturingCostcenterVersion() {
		while (!manufacturingCostcenterVersion.isEmpty()) {
			removeFromManufacturingCostcenterVersion(manufacturingCostcenterVersion
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingCostcenterVersionListType#getManufacturingCostcenterVersion() <em>manufacturingCostcenterVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingCostcenterVersionListType#getManufacturingCostcenterVersion() manufacturingCostcenterVersion}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterVersion(
			List<ManufacturingCostcenterVersionType> newManufacturingCostcenterVersion) {
		manufacturingCostcenterVersion = newManufacturingCostcenterVersion;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingCostcenterVersionListType ";
	}
}
