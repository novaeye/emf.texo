package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPRefWindowListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPRefWindowListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPRefWindowType> oBUIAPPRefWindow = new ArrayList<OBUIAPPRefWindowType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPRefWindow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPRefWindow</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPRefWindowType> getOBUIAPPRefWindow() {
		return oBUIAPPRefWindow;
	}

	/**
	 * Adds to the <em>oBUIAPPRefWindow</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPRefWindow(OBUIAPPRefWindowType oBUIAPPRefWindowValue) {
		if (!oBUIAPPRefWindow.contains(oBUIAPPRefWindowValue)) {

			oBUIAPPRefWindow.add(oBUIAPPRefWindowValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPRefWindow</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPRefWindow(
			OBUIAPPRefWindowType oBUIAPPRefWindowValue) {
		if (oBUIAPPRefWindow.contains(oBUIAPPRefWindowValue)) {
			oBUIAPPRefWindow.remove(oBUIAPPRefWindowValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPRefWindow</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPRefWindow() {
		while (!oBUIAPPRefWindow.isEmpty()) {
			removeFromOBUIAPPRefWindow(oBUIAPPRefWindow.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPRefWindowListType#getOBUIAPPRefWindow() <em>oBUIAPPRefWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPRefWindowListType#getOBUIAPPRefWindow() oBUIAPPRefWindow}' feature.
	 * @generated
	 */
	public void setOBUIAPPRefWindow(
			List<OBUIAPPRefWindowType> newOBUIAPPRefWindow) {
		oBUIAPPRefWindow = newOBUIAPPRefWindow;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPRefWindowListType ";
	}
}
