package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetClassTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetClassTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetClassTrlType> oBKMOWidgetClassTrl = new ArrayList<OBKMOWidgetClassTrlType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassTrl</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassTrlType> getOBKMOWidgetClassTrl() {
		return oBKMOWidgetClassTrl;
	}

	/**
	 * Adds to the <em>oBKMOWidgetClassTrl</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetClassTrl(
			OBKMOWidgetClassTrlType oBKMOWidgetClassTrlValue) {
		if (!oBKMOWidgetClassTrl.contains(oBKMOWidgetClassTrlValue)) {

			oBKMOWidgetClassTrl.add(oBKMOWidgetClassTrlValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetClassTrl</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetClassTrl(
			OBKMOWidgetClassTrlType oBKMOWidgetClassTrlValue) {
		if (oBKMOWidgetClassTrl.contains(oBKMOWidgetClassTrlValue)) {
			oBKMOWidgetClassTrl.remove(oBKMOWidgetClassTrlValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetClassTrl</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetClassTrl() {
		while (!oBKMOWidgetClassTrl.isEmpty()) {
			removeFromOBKMOWidgetClassTrl(oBKMOWidgetClassTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassTrlListType#getOBKMOWidgetClassTrl() <em>oBKMOWidgetClassTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassTrlListType#getOBKMOWidgetClassTrl() oBKMOWidgetClassTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassTrl(
			List<OBKMOWidgetClassTrlType> newOBKMOWidgetClassTrl) {
		oBKMOWidgetClassTrl = newOBKMOWidgetClassTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetClassTrlListType ";
	}
}
