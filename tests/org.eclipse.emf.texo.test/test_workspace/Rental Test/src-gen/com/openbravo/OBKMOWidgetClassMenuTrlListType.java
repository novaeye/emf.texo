package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetClassMenuTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetClassMenuTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetClassMenuTrlType> oBKMOWidgetClassMenuTrl = new ArrayList<OBKMOWidgetClassMenuTrlType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenuTrl</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassMenuTrlType> getOBKMOWidgetClassMenuTrl() {
		return oBKMOWidgetClassMenuTrl;
	}

	/**
	 * Adds to the <em>oBKMOWidgetClassMenuTrl</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetClassMenuTrl(
			OBKMOWidgetClassMenuTrlType oBKMOWidgetClassMenuTrlValue) {
		if (!oBKMOWidgetClassMenuTrl.contains(oBKMOWidgetClassMenuTrlValue)) {

			oBKMOWidgetClassMenuTrl.add(oBKMOWidgetClassMenuTrlValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetClassMenuTrl</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetClassMenuTrl(
			OBKMOWidgetClassMenuTrlType oBKMOWidgetClassMenuTrlValue) {
		if (oBKMOWidgetClassMenuTrl.contains(oBKMOWidgetClassMenuTrlValue)) {
			oBKMOWidgetClassMenuTrl.remove(oBKMOWidgetClassMenuTrlValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetClassMenuTrl</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetClassMenuTrl() {
		while (!oBKMOWidgetClassMenuTrl.isEmpty()) {
			removeFromOBKMOWidgetClassMenuTrl(oBKMOWidgetClassMenuTrl
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassMenuTrlListType#getOBKMOWidgetClassMenuTrl() <em>oBKMOWidgetClassMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassMenuTrlListType#getOBKMOWidgetClassMenuTrl() oBKMOWidgetClassMenuTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenuTrl(
			List<OBKMOWidgetClassMenuTrlType> newOBKMOWidgetClassMenuTrl) {
		oBKMOWidgetClassMenuTrl = newOBKMOWidgetClassMenuTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetClassMenuTrlListType ";
	}
}
