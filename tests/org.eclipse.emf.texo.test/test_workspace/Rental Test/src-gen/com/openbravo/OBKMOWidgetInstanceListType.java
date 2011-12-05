package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetInstanceListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetInstanceListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetInstanceType> oBKMOWidgetInstance = new ArrayList<OBKMOWidgetInstanceType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetInstance</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetInstanceType> getOBKMOWidgetInstance() {
		return oBKMOWidgetInstance;
	}

	/**
	 * Adds to the <em>oBKMOWidgetInstance</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetInstance(
			OBKMOWidgetInstanceType oBKMOWidgetInstanceValue) {
		if (!oBKMOWidgetInstance.contains(oBKMOWidgetInstanceValue)) {

			oBKMOWidgetInstance.add(oBKMOWidgetInstanceValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetInstance</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetInstance(
			OBKMOWidgetInstanceType oBKMOWidgetInstanceValue) {
		if (oBKMOWidgetInstance.contains(oBKMOWidgetInstanceValue)) {
			oBKMOWidgetInstance.remove(oBKMOWidgetInstanceValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetInstance</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetInstance() {
		while (!oBKMOWidgetInstance.isEmpty()) {
			removeFromOBKMOWidgetInstance(oBKMOWidgetInstance.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetInstanceListType#getOBKMOWidgetInstance() <em>oBKMOWidgetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetInstanceListType#getOBKMOWidgetInstance() oBKMOWidgetInstance}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstance(
			List<OBKMOWidgetInstanceType> newOBKMOWidgetInstance) {
		oBKMOWidgetInstance = newOBKMOWidgetInstance;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetInstanceListType ";
	}
}
