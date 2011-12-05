package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingProductionRunInvoiceLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingProductionRunInvoiceLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingProductionRunInvoiceLineType> manufacturingProductionRunInvoiceLine = new ArrayList<ManufacturingProductionRunInvoiceLineType>();

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunInvoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunInvoiceLine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunInvoiceLineType> getManufacturingProductionRunInvoiceLine() {
		return manufacturingProductionRunInvoiceLine;
	}

	/**
	 * Adds to the <em>manufacturingProductionRunInvoiceLine</em> feature.
	 * @generated
	 */
	public void addToManufacturingProductionRunInvoiceLine(
			ManufacturingProductionRunInvoiceLineType manufacturingProductionRunInvoiceLineValue) {
		if (!manufacturingProductionRunInvoiceLine
				.contains(manufacturingProductionRunInvoiceLineValue)) {

			manufacturingProductionRunInvoiceLine
					.add(manufacturingProductionRunInvoiceLineValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingProductionRunInvoiceLine</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingProductionRunInvoiceLine(
			ManufacturingProductionRunInvoiceLineType manufacturingProductionRunInvoiceLineValue) {
		if (manufacturingProductionRunInvoiceLine
				.contains(manufacturingProductionRunInvoiceLineValue)) {
			manufacturingProductionRunInvoiceLine
					.remove(manufacturingProductionRunInvoiceLineValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingProductionRunInvoiceLine</em> feature.
	 * @generated
	 */
	public void clearManufacturingProductionRunInvoiceLine() {
		while (!manufacturingProductionRunInvoiceLine.isEmpty()) {
			removeFromManufacturingProductionRunInvoiceLine(manufacturingProductionRunInvoiceLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingProductionRunInvoiceLineListType#getManufacturingProductionRunInvoiceLine() <em>manufacturingProductionRunInvoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingProductionRunInvoiceLineListType#getManufacturingProductionRunInvoiceLine() manufacturingProductionRunInvoiceLine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunInvoiceLine(
			List<ManufacturingProductionRunInvoiceLineType> newManufacturingProductionRunInvoiceLine) {
		manufacturingProductionRunInvoiceLine = newManufacturingProductionRunInvoiceLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingProductionRunInvoiceLineListType ";
	}
}
