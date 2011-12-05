package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBSEIGDefaultsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBSEIGDefaultsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBSEIGDefaultsType> oBSEIGDefaults = new ArrayList<OBSEIGDefaultsType>();

	/**
	 * Returns the value of '<em><b>oBSEIGDefaults</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSEIGDefaults</b></em>' feature
	 * @generated
	 */
	public List<OBSEIGDefaultsType> getOBSEIGDefaults() {
		return oBSEIGDefaults;
	}

	/**
	 * Adds to the <em>oBSEIGDefaults</em> feature.
	 * @generated
	 */
	public void addToOBSEIGDefaults(OBSEIGDefaultsType oBSEIGDefaultsValue) {
		if (!oBSEIGDefaults.contains(oBSEIGDefaultsValue)) {

			oBSEIGDefaults.add(oBSEIGDefaultsValue);
		}

	}

	/**			
	 * Removes from the <em>oBSEIGDefaults</em> feature.
	 * @generated
	 */
	public void removeFromOBSEIGDefaults(OBSEIGDefaultsType oBSEIGDefaultsValue) {
		if (oBSEIGDefaults.contains(oBSEIGDefaultsValue)) {
			oBSEIGDefaults.remove(oBSEIGDefaultsValue);
		}
	}

	/**			
	 * Clears the <em>oBSEIGDefaults</em> feature.
	 * @generated
	 */
	public void clearOBSEIGDefaults() {
		while (!oBSEIGDefaults.isEmpty()) {
			removeFromOBSEIGDefaults(oBSEIGDefaults.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBSEIGDefaultsListType#getOBSEIGDefaults() <em>oBSEIGDefaults</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBSEIGDefaultsListType#getOBSEIGDefaults() oBSEIGDefaults}' feature.
	 * @generated
	 */
	public void setOBSEIGDefaults(List<OBSEIGDefaultsType> newOBSEIGDefaults) {
		oBSEIGDefaults = newOBSEIGDefaults;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBSEIGDefaultsListType ";
	}
}
