package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCQLQueryColumnTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCQLQueryColumnTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBCQLQueryColumnTrlType> oBCQLQueryColumnTrl = new ArrayList<OBCQLQueryColumnTrlType>();

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumnTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumnTrl</b></em>' feature
	 * @generated
	 */
	public List<OBCQLQueryColumnTrlType> getOBCQLQueryColumnTrl() {
		return oBCQLQueryColumnTrl;
	}

	/**
	 * Adds to the <em>oBCQLQueryColumnTrl</em> feature.
	 * @generated
	 */
	public void addToOBCQLQueryColumnTrl(
			OBCQLQueryColumnTrlType oBCQLQueryColumnTrlValue) {
		if (!oBCQLQueryColumnTrl.contains(oBCQLQueryColumnTrlValue)) {

			oBCQLQueryColumnTrl.add(oBCQLQueryColumnTrlValue);
		}

	}

	/**			
	 * Removes from the <em>oBCQLQueryColumnTrl</em> feature.
	 * @generated
	 */
	public void removeFromOBCQLQueryColumnTrl(
			OBCQLQueryColumnTrlType oBCQLQueryColumnTrlValue) {
		if (oBCQLQueryColumnTrl.contains(oBCQLQueryColumnTrlValue)) {
			oBCQLQueryColumnTrl.remove(oBCQLQueryColumnTrlValue);
		}
	}

	/**			
	 * Clears the <em>oBCQLQueryColumnTrl</em> feature.
	 * @generated
	 */
	public void clearOBCQLQueryColumnTrl() {
		while (!oBCQLQueryColumnTrl.isEmpty()) {
			removeFromOBCQLQueryColumnTrl(oBCQLQueryColumnTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnTrlListType#getOBCQLQueryColumnTrl() <em>oBCQLQueryColumnTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnTrlListType#getOBCQLQueryColumnTrl() oBCQLQueryColumnTrl}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnTrl(
			List<OBCQLQueryColumnTrlType> newOBCQLQueryColumnTrl) {
		oBCQLQueryColumnTrl = newOBCQLQueryColumnTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBCQLQueryColumnTrlListType ";
	}
}
