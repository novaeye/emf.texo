package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPParameterValueEMObkmoWidgetInstanceIDListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPParameterValueEMObkmoWidgetInstanceIDListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPParameterValueType> oBUIAPPParameterValue = new ArrayList<OBUIAPPParameterValueType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterValue</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPParameterValueType> getOBUIAPPParameterValue() {
		return oBUIAPPParameterValue;
	}

	/**
	 * Adds to the <em>oBUIAPPParameterValue</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPParameterValue(
			OBUIAPPParameterValueType oBUIAPPParameterValueValue) {
		if (!oBUIAPPParameterValue.contains(oBUIAPPParameterValueValue)) {

			oBUIAPPParameterValue.add(oBUIAPPParameterValueValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPParameterValue</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPParameterValue(
			OBUIAPPParameterValueType oBUIAPPParameterValueValue) {
		if (oBUIAPPParameterValue.contains(oBUIAPPParameterValueValue)) {
			oBUIAPPParameterValue.remove(oBUIAPPParameterValueValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPParameterValue</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPParameterValue() {
		while (!oBUIAPPParameterValue.isEmpty()) {
			removeFromOBUIAPPParameterValue(oBUIAPPParameterValue.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPParameterValueEMObkmoWidgetInstanceIDListType#getOBUIAPPParameterValue() <em>oBUIAPPParameterValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPParameterValueEMObkmoWidgetInstanceIDListType#getOBUIAPPParameterValue() oBUIAPPParameterValue}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterValue(
			List<OBUIAPPParameterValueType> newOBUIAPPParameterValue) {
		oBUIAPPParameterValue = newOBUIAPPParameterValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPParameterValueEMObkmoWidgetInstanceIDListType ";
	}
}
