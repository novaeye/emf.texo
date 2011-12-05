package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CAcctSchemaProcessListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CAcctSchemaProcessListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CAcctSchemaProcessType> cAcctSchemaProcess = new ArrayList<CAcctSchemaProcessType>();

	/**
	 * Returns the value of '<em><b>cAcctSchemaProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cAcctSchemaProcess</b></em>' feature
	 * @generated
	 */
	public List<CAcctSchemaProcessType> getCAcctSchemaProcess() {
		return cAcctSchemaProcess;
	}

	/**
	 * Adds to the <em>cAcctSchemaProcess</em> feature.
	 * @generated
	 */
	public void addToCAcctSchemaProcess(
			CAcctSchemaProcessType cAcctSchemaProcessValue) {
		if (!cAcctSchemaProcess.contains(cAcctSchemaProcessValue)) {

			cAcctSchemaProcess.add(cAcctSchemaProcessValue);
		}

	}

	/**			
	 * Removes from the <em>cAcctSchemaProcess</em> feature.
	 * @generated
	 */
	public void removeFromCAcctSchemaProcess(
			CAcctSchemaProcessType cAcctSchemaProcessValue) {
		if (cAcctSchemaProcess.contains(cAcctSchemaProcessValue)) {
			cAcctSchemaProcess.remove(cAcctSchemaProcessValue);
		}
	}

	/**			
	 * Clears the <em>cAcctSchemaProcess</em> feature.
	 * @generated
	 */
	public void clearCAcctSchemaProcess() {
		while (!cAcctSchemaProcess.isEmpty()) {
			removeFromCAcctSchemaProcess(cAcctSchemaProcess.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CAcctSchemaProcessListType1#getCAcctSchemaProcess() <em>cAcctSchemaProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CAcctSchemaProcessListType1#getCAcctSchemaProcess() cAcctSchemaProcess}' feature.
	 * @generated
	 */
	public void setCAcctSchemaProcess(
			List<CAcctSchemaProcessType> newCAcctSchemaProcess) {
		cAcctSchemaProcess = newCAcctSchemaProcess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CAcctSchemaProcessListType1 ";
	}
}
