package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPProcessAccessListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPProcessAccessListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPProcessAccessType> oBUIAPPProcessAccess = new ArrayList<OBUIAPPProcessAccessType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPProcessAccess</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPProcessAccessType> getOBUIAPPProcessAccess() {
		return oBUIAPPProcessAccess;
	}

	/**
	 * Adds to the <em>oBUIAPPProcessAccess</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPProcessAccess(
			OBUIAPPProcessAccessType oBUIAPPProcessAccessValue) {
		if (!oBUIAPPProcessAccess.contains(oBUIAPPProcessAccessValue)) {

			oBUIAPPProcessAccess.add(oBUIAPPProcessAccessValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPProcessAccess</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPProcessAccess(
			OBUIAPPProcessAccessType oBUIAPPProcessAccessValue) {
		if (oBUIAPPProcessAccess.contains(oBUIAPPProcessAccessValue)) {
			oBUIAPPProcessAccess.remove(oBUIAPPProcessAccessValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPProcessAccess</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPProcessAccess() {
		while (!oBUIAPPProcessAccess.isEmpty()) {
			removeFromOBUIAPPProcessAccess(oBUIAPPProcessAccess.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPProcessAccessListType#getOBUIAPPProcessAccess() <em>oBUIAPPProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPProcessAccessListType#getOBUIAPPProcessAccess() oBUIAPPProcessAccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcessAccess(
			List<OBUIAPPProcessAccessType> newOBUIAPPProcessAccess) {
		oBUIAPPProcessAccess = newOBUIAPPProcessAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPProcessAccessListType ";
	}
}
