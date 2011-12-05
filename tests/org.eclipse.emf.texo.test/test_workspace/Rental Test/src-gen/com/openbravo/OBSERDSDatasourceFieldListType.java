package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBSERDSDatasourceFieldListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBSERDSDatasourceFieldListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBSERDSDatasourceFieldType> oBSERDSDatasourceField = new ArrayList<OBSERDSDatasourceFieldType>();

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceField</b></em>' feature
	 * @generated
	 */
	public List<OBSERDSDatasourceFieldType> getOBSERDSDatasourceField() {
		return oBSERDSDatasourceField;
	}

	/**
	 * Adds to the <em>oBSERDSDatasourceField</em> feature.
	 * @generated
	 */
	public void addToOBSERDSDatasourceField(
			OBSERDSDatasourceFieldType oBSERDSDatasourceFieldValue) {
		if (!oBSERDSDatasourceField.contains(oBSERDSDatasourceFieldValue)) {

			oBSERDSDatasourceField.add(oBSERDSDatasourceFieldValue);
		}

	}

	/**			
	 * Removes from the <em>oBSERDSDatasourceField</em> feature.
	 * @generated
	 */
	public void removeFromOBSERDSDatasourceField(
			OBSERDSDatasourceFieldType oBSERDSDatasourceFieldValue) {
		if (oBSERDSDatasourceField.contains(oBSERDSDatasourceFieldValue)) {
			oBSERDSDatasourceField.remove(oBSERDSDatasourceFieldValue);
		}
	}

	/**			
	 * Clears the <em>oBSERDSDatasourceField</em> feature.
	 * @generated
	 */
	public void clearOBSERDSDatasourceField() {
		while (!oBSERDSDatasourceField.isEmpty()) {
			removeFromOBSERDSDatasourceField(oBSERDSDatasourceField.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBSERDSDatasourceFieldListType#getOBSERDSDatasourceField() <em>oBSERDSDatasourceField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBSERDSDatasourceFieldListType#getOBSERDSDatasourceField() oBSERDSDatasourceField}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceField(
			List<OBSERDSDatasourceFieldType> newOBSERDSDatasourceField) {
		oBSERDSDatasourceField = newOBSERDSDatasourceField;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBSERDSDatasourceFieldListType ";
	}
}
