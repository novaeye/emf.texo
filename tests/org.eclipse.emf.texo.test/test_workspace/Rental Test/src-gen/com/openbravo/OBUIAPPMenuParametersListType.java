package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUIAPPMenuParametersListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUIAPPMenuParametersListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBUIAPPMenuParametersType> oBUIAPPMenuParameters = new ArrayList<OBUIAPPMenuParametersType>();

	/**
	 * Returns the value of '<em><b>oBUIAPPMenuParameters</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPMenuParameters</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPMenuParametersType> getOBUIAPPMenuParameters() {
		return oBUIAPPMenuParameters;
	}

	/**
	 * Adds to the <em>oBUIAPPMenuParameters</em> feature.
	 * @generated
	 */
	public void addToOBUIAPPMenuParameters(
			OBUIAPPMenuParametersType oBUIAPPMenuParametersValue) {
		if (!oBUIAPPMenuParameters.contains(oBUIAPPMenuParametersValue)) {

			oBUIAPPMenuParameters.add(oBUIAPPMenuParametersValue);
		}

	}

	/**			
	 * Removes from the <em>oBUIAPPMenuParameters</em> feature.
	 * @generated
	 */
	public void removeFromOBUIAPPMenuParameters(
			OBUIAPPMenuParametersType oBUIAPPMenuParametersValue) {
		if (oBUIAPPMenuParameters.contains(oBUIAPPMenuParametersValue)) {
			oBUIAPPMenuParameters.remove(oBUIAPPMenuParametersValue);
		}
	}

	/**			
	 * Clears the <em>oBUIAPPMenuParameters</em> feature.
	 * @generated
	 */
	public void clearOBUIAPPMenuParameters() {
		while (!oBUIAPPMenuParameters.isEmpty()) {
			removeFromOBUIAPPMenuParameters(oBUIAPPMenuParameters.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBUIAPPMenuParametersListType#getOBUIAPPMenuParameters() <em>oBUIAPPMenuParameters</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUIAPPMenuParametersListType#getOBUIAPPMenuParameters() oBUIAPPMenuParameters}' feature.
	 * @generated
	 */
	public void setOBUIAPPMenuParameters(
			List<OBUIAPPMenuParametersType> newOBUIAPPMenuParameters) {
		oBUIAPPMenuParameters = newOBUIAPPMenuParameters;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBUIAPPMenuParametersListType ";
	}
}
