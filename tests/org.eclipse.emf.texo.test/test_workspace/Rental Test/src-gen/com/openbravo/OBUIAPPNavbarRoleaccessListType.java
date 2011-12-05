package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPNavbarRoleaccessListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPNavbarRoleaccessListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPNavbarRoleaccessType> oBUIAPPNavbarRoleaccess = new ArrayList<OBUIAPPNavbarRoleaccessType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPNavbarRoleaccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavbarRoleaccess</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPNavbarRoleaccessType> getOBUIAPPNavbarRoleaccess() {
		return oBUIAPPNavbarRoleaccess;
	}

	/**
	 * Adds to the <em>oBUIAPPNavbarRoleaccess</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPNavbarRoleaccess(
			OBUIAPPNavbarRoleaccessType oBUIAPPNavbarRoleaccessValue) {
		if (!oBUIAPPNavbarRoleaccess.contains(oBUIAPPNavbarRoleaccessValue)) {

			oBUIAPPNavbarRoleaccess.add(oBUIAPPNavbarRoleaccessValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPNavbarRoleaccess</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPNavbarRoleaccess(
			OBUIAPPNavbarRoleaccessType oBUIAPPNavbarRoleaccessValue) {
		if (oBUIAPPNavbarRoleaccess.contains(oBUIAPPNavbarRoleaccessValue)) {
			oBUIAPPNavbarRoleaccess.remove(oBUIAPPNavbarRoleaccessValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPNavbarRoleaccess</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPNavbarRoleaccess() {
		while (!oBUIAPPNavbarRoleaccess.isEmpty()) {
			removeFromOBUIAPPNavbarRoleaccess(oBUIAPPNavbarRoleaccess
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPNavbarRoleaccessListType#getOBUIAPPNavbarRoleaccess() <em>oBUIAPPNavbarRoleaccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPNavbarRoleaccessListType#getOBUIAPPNavbarRoleaccess() oBUIAPPNavbarRoleaccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavbarRoleaccess(
			List<OBUIAPPNavbarRoleaccessType> newOBUIAPPNavbarRoleaccess) {
		oBUIAPPNavbarRoleaccess = newOBUIAPPNavbarRoleaccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPNavbarRoleaccessListType ";
	}
}
