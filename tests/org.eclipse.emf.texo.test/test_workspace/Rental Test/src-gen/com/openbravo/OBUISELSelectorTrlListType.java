package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUISELSelectorTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUISELSelectorTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUISELSelectorTrlType> oBUISELSelectorTrl = new ArrayList<OBUISELSelectorTrlType>();

	/**
	 * Returns the value of '<em><b>oBUISELSelectorTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorTrl</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorTrlType> getOBUISELSelectorTrl() {
		return oBUISELSelectorTrl;
	}

	/**
	 * Adds to the <em>oBUISELSelectorTrl</em> feature.
	 * @generated
	 */
	public void addToOBUISELSelectorTrl(
			OBUISELSelectorTrlType oBUISELSelectorTrlValue) {
		if (!oBUISELSelectorTrl.contains(oBUISELSelectorTrlValue)) {

			oBUISELSelectorTrl.add(oBUISELSelectorTrlValue);
		}

	}

	/**			
	 * Removes from the <em>oBUISELSelectorTrl</em> feature.
	 * @generated
	 */
	public void removeFromOBUISELSelectorTrl(
			OBUISELSelectorTrlType oBUISELSelectorTrlValue) {
		if (oBUISELSelectorTrl.contains(oBUISELSelectorTrlValue)) {
			oBUISELSelectorTrl.remove(oBUISELSelectorTrlValue);
		}
	}

	/**			
	 * Clears the <em>oBUISELSelectorTrl</em> feature.
	 * @generated
	 */
	public void clearOBUISELSelectorTrl() {
		while (!oBUISELSelectorTrl.isEmpty()) {
			removeFromOBUISELSelectorTrl(oBUISELSelectorTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUISELSelectorTrlListType#getOBUISELSelectorTrl() <em>oBUISELSelectorTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorTrlListType#getOBUISELSelectorTrl() oBUISELSelectorTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorTrl(
			List<OBUISELSelectorTrlType> newOBUISELSelectorTrl) {
		oBUISELSelectorTrl = newOBUISELSelectorTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUISELSelectorTrlListType ";
	}
}
