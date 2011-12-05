package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADParameterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADParameterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADParameterType> aDParameter = new ArrayList<ADParameterType>();

	/**
	 * Returns the value of '<em><b>aDParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDParameter</b></em>' feature
	 * @generated
	 */
	public List<ADParameterType> getADParameter() {
		return aDParameter;
	}

	/**
	 * Adds to the <em>aDParameter</em> feature.
	 * @generated
	 */
	public void addToADParameter(ADParameterType aDParameterValue) {
		if (!aDParameter.contains(aDParameterValue)) {

			aDParameter.add(aDParameterValue);
		}

	}

	/**			
	 * Removes from the <em>aDParameter</em> feature.
	 * @generated
	 */
	public void removeFromADParameter(ADParameterType aDParameterValue) {
		if (aDParameter.contains(aDParameterValue)) {
			aDParameter.remove(aDParameterValue);
		}
	}

	/**			
	 * Clears the <em>aDParameter</em> feature.
	 * @generated
	 */
	public void clearADParameter() {
		while (!aDParameter.isEmpty()) {
			removeFromADParameter(aDParameter.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADParameterListType#getADParameter() <em>aDParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADParameterListType#getADParameter() aDParameter}' feature.
	 * @generated
	 */
	public void setADParameter(List<ADParameterType> newADParameter) {
		aDParameter = newADParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADParameterListType ";
	}
}
