package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetListListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetListListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetListType> oBKMOWidgetList = new ArrayList<OBKMOWidgetListType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetList</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetListType> getOBKMOWidgetList() {
		return oBKMOWidgetList;
	}

	/**
	 * Adds to the <em>oBKMOWidgetList</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetList(OBKMOWidgetListType oBKMOWidgetListValue) {
		if (!oBKMOWidgetList.contains(oBKMOWidgetListValue)) {

			oBKMOWidgetList.add(oBKMOWidgetListValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetList</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetList(
			OBKMOWidgetListType oBKMOWidgetListValue) {
		if (oBKMOWidgetList.contains(oBKMOWidgetListValue)) {
			oBKMOWidgetList.remove(oBKMOWidgetListValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetList</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetList() {
		while (!oBKMOWidgetList.isEmpty()) {
			removeFromOBKMOWidgetList(oBKMOWidgetList.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetListListType#getOBKMOWidgetList() <em>oBKMOWidgetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetListListType#getOBKMOWidgetList() oBKMOWidgetList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetList(List<OBKMOWidgetListType> newOBKMOWidgetList) {
		oBKMOWidgetList = newOBKMOWidgetList;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetListListType ";
	}
}
