package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetClassListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetClassListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetClassType> oBKMOWidgetClass = new ArrayList<OBKMOWidgetClassType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClass</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClass</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassType> getOBKMOWidgetClass() {
		return oBKMOWidgetClass;
	}

	/**
	 * Adds to the <em>oBKMOWidgetClass</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetClass(OBKMOWidgetClassType oBKMOWidgetClassValue) {
		if (!oBKMOWidgetClass.contains(oBKMOWidgetClassValue)) {

			oBKMOWidgetClass.add(oBKMOWidgetClassValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetClass</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetClass(
			OBKMOWidgetClassType oBKMOWidgetClassValue) {
		if (oBKMOWidgetClass.contains(oBKMOWidgetClassValue)) {
			oBKMOWidgetClass.remove(oBKMOWidgetClassValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetClass</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetClass() {
		while (!oBKMOWidgetClass.isEmpty()) {
			removeFromOBKMOWidgetClass(oBKMOWidgetClass.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassListType#getOBKMOWidgetClass() <em>oBKMOWidgetClass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassListType#getOBKMOWidgetClass() oBKMOWidgetClass}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClass(
			List<OBKMOWidgetClassType> newOBKMOWidgetClass) {
		oBKMOWidgetClass = newOBKMOWidgetClass;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetClassListType ";
	}
}
