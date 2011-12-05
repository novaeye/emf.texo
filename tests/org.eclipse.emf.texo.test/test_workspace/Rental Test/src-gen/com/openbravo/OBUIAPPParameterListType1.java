package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPParameterListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPParameterListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPParameterType> oBUIAPPParameter = new ArrayList<OBUIAPPParameterType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameter</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPParameterType> getOBUIAPPParameter() {
		return oBUIAPPParameter;
	}

	/**
	 * Adds to the <em>oBUIAPPParameter</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPParameter(OBUIAPPParameterType oBUIAPPParameterValue) {
		if (!oBUIAPPParameter.contains(oBUIAPPParameterValue)) {

			oBUIAPPParameter.add(oBUIAPPParameterValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPParameter</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPParameter(
			OBUIAPPParameterType oBUIAPPParameterValue) {
		if (oBUIAPPParameter.contains(oBUIAPPParameterValue)) {
			oBUIAPPParameter.remove(oBUIAPPParameterValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPParameter</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPParameter() {
		while (!oBUIAPPParameter.isEmpty()) {
			removeFromOBUIAPPParameter(oBUIAPPParameter.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPParameterListType1#getOBUIAPPParameter() <em>oBUIAPPParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPParameterListType1#getOBUIAPPParameter() oBUIAPPParameter}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameter(
			List<OBUIAPPParameterType> newOBUIAPPParameter) {
		oBUIAPPParameter = newOBUIAPPParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPParameterListType1 ";
	}
}
