package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ObuiappViewRoleAccessListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ObuiappViewRoleAccessListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ObuiappViewRoleAccessType> obuiappViewRoleAccess = new ArrayList<ObuiappViewRoleAccessType>();

	/**
	 * Returns the value of '<em><b>obuiappViewRoleAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obuiappViewRoleAccess</b></em>' feature
	 * @generated
	 */
	public List<ObuiappViewRoleAccessType> getObuiappViewRoleAccess() {
		return obuiappViewRoleAccess;
	}

	/**
	 * Adds to the <em>obuiappViewRoleAccess</em> feature.
	 * @generated
	 */
	public void addToObuiappViewRoleAccess(
			ObuiappViewRoleAccessType obuiappViewRoleAccessValue) {
		if (!obuiappViewRoleAccess.contains(obuiappViewRoleAccessValue)) {

			obuiappViewRoleAccess.add(obuiappViewRoleAccessValue);
		}

	}

	/**			
	 * Removes from the <em>obuiappViewRoleAccess</em> feature.
	 * @generated
	 */
	public void removeFromObuiappViewRoleAccess(
			ObuiappViewRoleAccessType obuiappViewRoleAccessValue) {
		if (obuiappViewRoleAccess.contains(obuiappViewRoleAccessValue)) {
			obuiappViewRoleAccess.remove(obuiappViewRoleAccessValue);
		}
	}

	/**			
	 * Clears the <em>obuiappViewRoleAccess</em> feature.
	 * @generated
	 */
	public void clearObuiappViewRoleAccess() {
		while (!obuiappViewRoleAccess.isEmpty()) {
			removeFromObuiappViewRoleAccess(obuiappViewRoleAccess.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ObuiappViewRoleAccessListType1#getObuiappViewRoleAccess() <em>obuiappViewRoleAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ObuiappViewRoleAccessListType1#getObuiappViewRoleAccess() obuiappViewRoleAccess}' feature.
	 * @generated
	 */
	public void setObuiappViewRoleAccess(
			List<ObuiappViewRoleAccessType> newObuiappViewRoleAccess) {
		obuiappViewRoleAccess = newObuiappViewRoleAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ObuiappViewRoleAccessListType1 ";
	}
}
