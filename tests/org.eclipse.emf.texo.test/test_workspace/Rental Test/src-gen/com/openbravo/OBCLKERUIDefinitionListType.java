package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCLKERUIDefinitionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCLKERUIDefinitionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBCLKERUIDefinitionType> oBCLKERUIDefinition = new ArrayList<OBCLKERUIDefinitionType>();

	/**
	 * Returns the value of '<em><b>oBCLKERUIDefinition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERUIDefinition</b></em>' feature
	 * @generated
	 */
	public List<OBCLKERUIDefinitionType> getOBCLKERUIDefinition() {
		return oBCLKERUIDefinition;
	}

	/**
	 * Adds to the <em>oBCLKERUIDefinition</em> feature.
	 * @generated
	 */
	public void addToOBCLKERUIDefinition(
			OBCLKERUIDefinitionType oBCLKERUIDefinitionValue) {
		if (!oBCLKERUIDefinition.contains(oBCLKERUIDefinitionValue)) {

			oBCLKERUIDefinition.add(oBCLKERUIDefinitionValue);
		}

	}

	/**			
	 * Removes from the <em>oBCLKERUIDefinition</em> feature.
	 * @generated
	 */
	public void removeFromOBCLKERUIDefinition(
			OBCLKERUIDefinitionType oBCLKERUIDefinitionValue) {
		if (oBCLKERUIDefinition.contains(oBCLKERUIDefinitionValue)) {
			oBCLKERUIDefinition.remove(oBCLKERUIDefinitionValue);
		}
	}

	/**			
	 * Clears the <em>oBCLKERUIDefinition</em> feature.
	 * @generated
	 */
	public void clearOBCLKERUIDefinition() {
		while (!oBCLKERUIDefinition.isEmpty()) {
			removeFromOBCLKERUIDefinition(oBCLKERUIDefinition.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBCLKERUIDefinitionListType#getOBCLKERUIDefinition() <em>oBCLKERUIDefinition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERUIDefinitionListType#getOBCLKERUIDefinition() oBCLKERUIDefinition}' feature.
	 * @generated
	 */
	public void setOBCLKERUIDefinition(
			List<OBCLKERUIDefinitionType> newOBCLKERUIDefinition) {
		oBCLKERUIDefinition = newOBCLKERUIDefinition;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBCLKERUIDefinitionListType ";
	}
}
