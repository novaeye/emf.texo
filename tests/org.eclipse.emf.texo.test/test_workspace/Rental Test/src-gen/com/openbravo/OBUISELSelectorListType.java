package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUISELSelectorListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUISELSelectorListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUISELSelectorType> oBUISELSelector = new ArrayList<OBUISELSelectorType>();

	/**
	 * Returns the value of '<em><b>oBUISELSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelector</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorType> getOBUISELSelector() {
		return oBUISELSelector;
	}

	/**
	 * Adds to the <em>oBUISELSelector</em> feature.
	 * @generated
	 */
	public void addToOBUISELSelector(OBUISELSelectorType oBUISELSelectorValue) {
		if (!oBUISELSelector.contains(oBUISELSelectorValue)) {

			oBUISELSelector.add(oBUISELSelectorValue);
		}

	}

	/**			
	 * Removes from the <em>oBUISELSelector</em> feature.
	 * @generated
	 */
	public void removeFromOBUISELSelector(
			OBUISELSelectorType oBUISELSelectorValue) {
		if (oBUISELSelector.contains(oBUISELSelectorValue)) {
			oBUISELSelector.remove(oBUISELSelectorValue);
		}
	}

	/**			
	 * Clears the <em>oBUISELSelector</em> feature.
	 * @generated
	 */
	public void clearOBUISELSelector() {
		while (!oBUISELSelector.isEmpty()) {
			removeFromOBUISELSelector(oBUISELSelector.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUISELSelectorListType#getOBUISELSelector() <em>oBUISELSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorListType#getOBUISELSelector() oBUISELSelector}' feature.
	 * @generated
	 */
	public void setOBUISELSelector(List<OBUISELSelectorType> newOBUISELSelector) {
		oBUISELSelector = newOBUISELSelector;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUISELSelectorListType ";
	}
}
