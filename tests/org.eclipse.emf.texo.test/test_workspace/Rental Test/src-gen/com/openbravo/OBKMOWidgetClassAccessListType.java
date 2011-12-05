package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetClassAccessListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetClassAccessListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetClassAccessType> oBKMOWidgetClassAccess = new ArrayList<OBKMOWidgetClassAccessType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassAccess</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassAccessType> getOBKMOWidgetClassAccess() {
		return oBKMOWidgetClassAccess;
	}

	/**
	 * Adds to the <em>oBKMOWidgetClassAccess</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetClassAccess(
			OBKMOWidgetClassAccessType oBKMOWidgetClassAccessValue) {
		if (!oBKMOWidgetClassAccess.contains(oBKMOWidgetClassAccessValue)) {

			oBKMOWidgetClassAccess.add(oBKMOWidgetClassAccessValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetClassAccess</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetClassAccess(
			OBKMOWidgetClassAccessType oBKMOWidgetClassAccessValue) {
		if (oBKMOWidgetClassAccess.contains(oBKMOWidgetClassAccessValue)) {
			oBKMOWidgetClassAccess.remove(oBKMOWidgetClassAccessValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetClassAccess</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetClassAccess() {
		while (!oBKMOWidgetClassAccess.isEmpty()) {
			removeFromOBKMOWidgetClassAccess(oBKMOWidgetClassAccess.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassAccessListType#getOBKMOWidgetClassAccess() <em>oBKMOWidgetClassAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassAccessListType#getOBKMOWidgetClassAccess() oBKMOWidgetClassAccess}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassAccess(
			List<OBKMOWidgetClassAccessType> newOBKMOWidgetClassAccess) {
		oBKMOWidgetClassAccess = newOBKMOWidgetClassAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetClassAccessListType ";
	}
}
