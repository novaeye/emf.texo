package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingWorkRequirementOperationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingWorkRequirementOperationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingWorkRequirementOperationType> manufacturingWorkRequirementOperation = new ArrayList<ManufacturingWorkRequirementOperationType>();

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementOperation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementOperation</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkRequirementOperationType> getManufacturingWorkRequirementOperation() {
		return manufacturingWorkRequirementOperation;
	}

	/**
	 * Adds to the <em>manufacturingWorkRequirementOperation</em> feature.
	 * @generated
	 */
	public void addToManufacturingWorkRequirementOperation(
			ManufacturingWorkRequirementOperationType manufacturingWorkRequirementOperationValue) {
		if (!manufacturingWorkRequirementOperation
				.contains(manufacturingWorkRequirementOperationValue)) {

			manufacturingWorkRequirementOperation
					.add(manufacturingWorkRequirementOperationValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingWorkRequirementOperation</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingWorkRequirementOperation(
			ManufacturingWorkRequirementOperationType manufacturingWorkRequirementOperationValue) {
		if (manufacturingWorkRequirementOperation
				.contains(manufacturingWorkRequirementOperationValue)) {
			manufacturingWorkRequirementOperation
					.remove(manufacturingWorkRequirementOperationValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingWorkRequirementOperation</em> feature.
	 * @generated
	 */
	public void clearManufacturingWorkRequirementOperation() {
		while (!manufacturingWorkRequirementOperation.isEmpty()) {
			removeFromManufacturingWorkRequirementOperation(manufacturingWorkRequirementOperation
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingWorkRequirementOperationListType#getManufacturingWorkRequirementOperation() <em>manufacturingWorkRequirementOperation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingWorkRequirementOperationListType#getManufacturingWorkRequirementOperation() manufacturingWorkRequirementOperation}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementOperation(
			List<ManufacturingWorkRequirementOperationType> newManufacturingWorkRequirementOperation) {
		manufacturingWorkRequirementOperation = newManufacturingWorkRequirementOperation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingWorkRequirementOperationListType ";
	}
}
