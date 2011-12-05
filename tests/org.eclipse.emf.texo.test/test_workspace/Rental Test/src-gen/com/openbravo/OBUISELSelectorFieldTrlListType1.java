package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUISELSelectorFieldTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUISELSelectorFieldTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUISELSelectorFieldTrlType> oBUISELSelectorFieldTrl = new ArrayList<OBUISELSelectorFieldTrlType>();

	/**
	 * Returns the value of '<em><b>oBUISELSelectorFieldTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorFieldTrl</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorFieldTrlType> getOBUISELSelectorFieldTrl() {
		return oBUISELSelectorFieldTrl;
	}

	/**
	 * Adds to the <em>oBUISELSelectorFieldTrl</em> feature.
	 * @generated
	 */
	public void addToOBUISELSelectorFieldTrl(
			OBUISELSelectorFieldTrlType oBUISELSelectorFieldTrlValue) {
		if (!oBUISELSelectorFieldTrl.contains(oBUISELSelectorFieldTrlValue)) {

			oBUISELSelectorFieldTrl.add(oBUISELSelectorFieldTrlValue);
		}

	}

	/**			
	 * Removes from the <em>oBUISELSelectorFieldTrl</em> feature.
	 * @generated
	 */
	public void removeFromOBUISELSelectorFieldTrl(
			OBUISELSelectorFieldTrlType oBUISELSelectorFieldTrlValue) {
		if (oBUISELSelectorFieldTrl.contains(oBUISELSelectorFieldTrlValue)) {
			oBUISELSelectorFieldTrl.remove(oBUISELSelectorFieldTrlValue);
		}
	}

	/**			
	 * Clears the <em>oBUISELSelectorFieldTrl</em> feature.
	 * @generated
	 */
	public void clearOBUISELSelectorFieldTrl() {
		while (!oBUISELSelectorFieldTrl.isEmpty()) {
			removeFromOBUISELSelectorFieldTrl(oBUISELSelectorFieldTrl
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldTrlListType1#getOBUISELSelectorFieldTrl() <em>oBUISELSelectorFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldTrlListType1#getOBUISELSelectorFieldTrl() oBUISELSelectorFieldTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorFieldTrl(
			List<OBUISELSelectorFieldTrlType> newOBUISELSelectorFieldTrl) {
		oBUISELSelectorFieldTrl = newOBUISELSelectorFieldTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUISELSelectorFieldTrlListType1 ";
	}
}
