package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUISELSelectorFieldListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUISELSelectorFieldListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUISELSelectorFieldType> oBUISELSelectorField = new ArrayList<OBUISELSelectorFieldType>();

	/**
	 * Returns the value of '<em><b>oBUISELSelectorField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorField</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorFieldType> getOBUISELSelectorField() {
		return oBUISELSelectorField;
	}

	/**
	 * Adds to the <em>oBUISELSelectorField</em> feature.
	 * @generated
	 */
	public void addToOBUISELSelectorField(
			OBUISELSelectorFieldType oBUISELSelectorFieldValue) {
		if (!oBUISELSelectorField.contains(oBUISELSelectorFieldValue)) {

			oBUISELSelectorField.add(oBUISELSelectorFieldValue);
		}

	}

	/**			
	 * Removes from the <em>oBUISELSelectorField</em> feature.
	 * @generated
	 */
	public void removeFromOBUISELSelectorField(
			OBUISELSelectorFieldType oBUISELSelectorFieldValue) {
		if (oBUISELSelectorField.contains(oBUISELSelectorFieldValue)) {
			oBUISELSelectorField.remove(oBUISELSelectorFieldValue);
		}
	}

	/**			
	 * Clears the <em>oBUISELSelectorField</em> feature.
	 * @generated
	 */
	public void clearOBUISELSelectorField() {
		while (!oBUISELSelectorField.isEmpty()) {
			removeFromOBUISELSelectorField(oBUISELSelectorField.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldListType#getOBUISELSelectorField() <em>oBUISELSelectorField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldListType#getOBUISELSelectorField() oBUISELSelectorField}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorField(
			List<OBUISELSelectorFieldType> newOBUISELSelectorField) {
		oBUISELSelectorField = newOBUISELSelectorField;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUISELSelectorFieldListType ";
	}
}
