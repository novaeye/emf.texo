package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPParameterTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPParameterTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPParameterTrlType> oBUIAPPParameterTrl = new ArrayList<OBUIAPPParameterTrlType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterTrl</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPParameterTrlType> getOBUIAPPParameterTrl() {
		return oBUIAPPParameterTrl;
	}

	/**
	 * Adds to the <em>oBUIAPPParameterTrl</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPParameterTrl(
			OBUIAPPParameterTrlType oBUIAPPParameterTrlValue) {
		if (!oBUIAPPParameterTrl.contains(oBUIAPPParameterTrlValue)) {

			oBUIAPPParameterTrl.add(oBUIAPPParameterTrlValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPParameterTrl</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPParameterTrl(
			OBUIAPPParameterTrlType oBUIAPPParameterTrlValue) {
		if (oBUIAPPParameterTrl.contains(oBUIAPPParameterTrlValue)) {
			oBUIAPPParameterTrl.remove(oBUIAPPParameterTrlValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPParameterTrl</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPParameterTrl() {
		while (!oBUIAPPParameterTrl.isEmpty()) {
			removeFromOBUIAPPParameterTrl(oBUIAPPParameterTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPParameterTrlListType#getOBUIAPPParameterTrl() <em>oBUIAPPParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPParameterTrlListType#getOBUIAPPParameterTrl() oBUIAPPParameterTrl}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterTrl(
			List<OBUIAPPParameterTrlType> newOBUIAPPParameterTrl) {
		oBUIAPPParameterTrl = newOBUIAPPParameterTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPParameterTrlListType ";
	}
}
