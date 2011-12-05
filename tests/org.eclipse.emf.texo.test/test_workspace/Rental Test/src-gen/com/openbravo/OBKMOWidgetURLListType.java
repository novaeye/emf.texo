package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetURLListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetURLListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetURLType> oBKMOWidgetURL = new ArrayList<OBKMOWidgetURLType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetURL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetURL</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetURLType> getOBKMOWidgetURL() {
		return oBKMOWidgetURL;
	}

	/**
	 * Adds to the <em>oBKMOWidgetURL</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetURL(OBKMOWidgetURLType oBKMOWidgetURLValue) {
		if (!oBKMOWidgetURL.contains(oBKMOWidgetURLValue)) {

			oBKMOWidgetURL.add(oBKMOWidgetURLValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetURL</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetURL(OBKMOWidgetURLType oBKMOWidgetURLValue) {
		if (oBKMOWidgetURL.contains(oBKMOWidgetURLValue)) {
			oBKMOWidgetURL.remove(oBKMOWidgetURLValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetURL</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetURL() {
		while (!oBKMOWidgetURL.isEmpty()) {
			removeFromOBKMOWidgetURL(oBKMOWidgetURL.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetURLListType#getOBKMOWidgetURL() <em>oBKMOWidgetURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetURLListType#getOBKMOWidgetURL() oBKMOWidgetURL}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetURL(List<OBKMOWidgetURLType> newOBKMOWidgetURL) {
		oBKMOWidgetURL = newOBKMOWidgetURL;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetURLListType ";
	}
}
