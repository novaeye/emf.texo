package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetClassMenuListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetClassMenuListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetClassMenuType> oBKMOWidgetClassMenu = new ArrayList<OBKMOWidgetClassMenuType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenu</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassMenuType> getOBKMOWidgetClassMenu() {
		return oBKMOWidgetClassMenu;
	}

	/**
	 * Adds to the <em>oBKMOWidgetClassMenu</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetClassMenu(
			OBKMOWidgetClassMenuType oBKMOWidgetClassMenuValue) {
		if (!oBKMOWidgetClassMenu.contains(oBKMOWidgetClassMenuValue)) {

			oBKMOWidgetClassMenu.add(oBKMOWidgetClassMenuValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetClassMenu</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetClassMenu(
			OBKMOWidgetClassMenuType oBKMOWidgetClassMenuValue) {
		if (oBKMOWidgetClassMenu.contains(oBKMOWidgetClassMenuValue)) {
			oBKMOWidgetClassMenu.remove(oBKMOWidgetClassMenuValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetClassMenu</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetClassMenu() {
		while (!oBKMOWidgetClassMenu.isEmpty()) {
			removeFromOBKMOWidgetClassMenu(oBKMOWidgetClassMenu.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassMenuListType#getOBKMOWidgetClassMenu() <em>oBKMOWidgetClassMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassMenuListType#getOBKMOWidgetClassMenu() oBKMOWidgetClassMenu}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenu(
			List<OBKMOWidgetClassMenuType> newOBKMOWidgetClassMenu) {
		oBKMOWidgetClassMenu = newOBKMOWidgetClassMenu;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetClassMenuListType ";
	}
}
