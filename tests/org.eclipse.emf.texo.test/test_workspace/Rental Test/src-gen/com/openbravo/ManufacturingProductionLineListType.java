package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingProductionLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingProductionLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingProductionLineType> manufacturingProductionLine = new ArrayList<ManufacturingProductionLineType>();

	/**
	 * Returns the value of '<em><b>manufacturingProductionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionLine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionLineType> getManufacturingProductionLine() {
		return manufacturingProductionLine;
	}

	/**
	 * Adds to the <em>manufacturingProductionLine</em> feature.
	 * @generated
	 */
	public void addToManufacturingProductionLine(
			ManufacturingProductionLineType manufacturingProductionLineValue) {
		if (!manufacturingProductionLine
				.contains(manufacturingProductionLineValue)) {

			manufacturingProductionLine.add(manufacturingProductionLineValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingProductionLine</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingProductionLine(
			ManufacturingProductionLineType manufacturingProductionLineValue) {
		if (manufacturingProductionLine
				.contains(manufacturingProductionLineValue)) {
			manufacturingProductionLine
					.remove(manufacturingProductionLineValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingProductionLine</em> feature.
	 * @generated
	 */
	public void clearManufacturingProductionLine() {
		while (!manufacturingProductionLine.isEmpty()) {
			removeFromManufacturingProductionLine(manufacturingProductionLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingProductionLineListType#getManufacturingProductionLine() <em>manufacturingProductionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingProductionLineListType#getManufacturingProductionLine() manufacturingProductionLine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLine(
			List<ManufacturingProductionLineType> newManufacturingProductionLine) {
		manufacturingProductionLine = newManufacturingProductionLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingProductionLineListType ";
	}
}
