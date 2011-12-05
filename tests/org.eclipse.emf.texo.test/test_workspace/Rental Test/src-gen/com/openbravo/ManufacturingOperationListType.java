package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingOperationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingOperationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingOperationType> manufacturingOperation = new ArrayList<ManufacturingOperationType>();

	/**
	 * Returns the value of '<em><b>manufacturingOperation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperation</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationType> getManufacturingOperation() {
		return manufacturingOperation;
	}

	/**
	 * Adds to the <em>manufacturingOperation</em> feature.
	 * @generated
	 */
	public void addToManufacturingOperation(
			ManufacturingOperationType manufacturingOperationValue) {
		if (!manufacturingOperation.contains(manufacturingOperationValue)) {

			manufacturingOperation.add(manufacturingOperationValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingOperation</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingOperation(
			ManufacturingOperationType manufacturingOperationValue) {
		if (manufacturingOperation.contains(manufacturingOperationValue)) {
			manufacturingOperation.remove(manufacturingOperationValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingOperation</em> feature.
	 * @generated
	 */
	public void clearManufacturingOperation() {
		while (!manufacturingOperation.isEmpty()) {
			removeFromManufacturingOperation(manufacturingOperation.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingOperationListType#getManufacturingOperation() <em>manufacturingOperation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationListType#getManufacturingOperation() manufacturingOperation}' feature.
	 * @generated
	 */
	public void setManufacturingOperation(
			List<ManufacturingOperationType> newManufacturingOperation) {
		manufacturingOperation = newManufacturingOperation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingOperationListType ";
	}
}
