package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBSOIDUserIdentifierListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBSOIDUserIdentifierListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBSOIDUserIdentifierType> oBSOIDUserIdentifier = new ArrayList<OBSOIDUserIdentifierType>();

	/**
	 * Returns the value of '<em><b>oBSOIDUserIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSOIDUserIdentifier</b></em>' feature
	 * @generated
	 */
	public List<OBSOIDUserIdentifierType> getOBSOIDUserIdentifier() {
		return oBSOIDUserIdentifier;
	}

	/**
	 * Adds to the <em>oBSOIDUserIdentifier</em> feature.
	 * @generated
	 */
	public void addToOBSOIDUserIdentifier(
			OBSOIDUserIdentifierType oBSOIDUserIdentifierValue) {
		if (!oBSOIDUserIdentifier.contains(oBSOIDUserIdentifierValue)) {

			oBSOIDUserIdentifier.add(oBSOIDUserIdentifierValue);
		}

	}

	/**			
	 * Removes from the <em>oBSOIDUserIdentifier</em> feature.
	 * @generated
	 */
	public void removeFromOBSOIDUserIdentifier(
			OBSOIDUserIdentifierType oBSOIDUserIdentifierValue) {
		if (oBSOIDUserIdentifier.contains(oBSOIDUserIdentifierValue)) {
			oBSOIDUserIdentifier.remove(oBSOIDUserIdentifierValue);
		}
	}

	/**			
	 * Clears the <em>oBSOIDUserIdentifier</em> feature.
	 * @generated
	 */
	public void clearOBSOIDUserIdentifier() {
		while (!oBSOIDUserIdentifier.isEmpty()) {
			removeFromOBSOIDUserIdentifier(oBSOIDUserIdentifier.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBSOIDUserIdentifierListType#getOBSOIDUserIdentifier() <em>oBSOIDUserIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBSOIDUserIdentifierListType#getOBSOIDUserIdentifier() oBSOIDUserIdentifier}' feature.
	 * @generated
	 */
	public void setOBSOIDUserIdentifier(
			List<OBSOIDUserIdentifierType> newOBSOIDUserIdentifier) {
		oBSOIDUserIdentifier = newOBSOIDUserIdentifier;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBSOIDUserIdentifierListType ";
	}
}
