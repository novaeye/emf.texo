package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessParameterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessParameterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADProcessParameterType> aDProcessParameter = new ArrayList<ADProcessParameterType>();

	/**
	 * Returns the value of '<em><b>aDProcessParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameter</b></em>' feature
	 * @generated
	 */
	public List<ADProcessParameterType> getADProcessParameter() {
		return aDProcessParameter;
	}

	/**
	 * Adds to the <em>aDProcessParameter</em> feature.
	 * @generated
	 */
	public void addToADProcessParameter(
			ADProcessParameterType aDProcessParameterValue) {
		if (!aDProcessParameter.contains(aDProcessParameterValue)) {

			aDProcessParameter.add(aDProcessParameterValue);
		}

	}

	/**			
	 * Removes from the <em>aDProcessParameter</em> feature.
	 * @generated
	 */
	public void removeFromADProcessParameter(
			ADProcessParameterType aDProcessParameterValue) {
		if (aDProcessParameter.contains(aDProcessParameterValue)) {
			aDProcessParameter.remove(aDProcessParameterValue);
		}
	}

	/**			
	 * Clears the <em>aDProcessParameter</em> feature.
	 * @generated
	 */
	public void clearADProcessParameter() {
		while (!aDProcessParameter.isEmpty()) {
			removeFromADProcessParameter(aDProcessParameter.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADProcessParameterListType#getADProcessParameter() <em>aDProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterListType#getADProcessParameter() aDProcessParameter}' feature.
	 * @generated
	 */
	public void setADProcessParameter(
			List<ADProcessParameterType> newADProcessParameter) {
		aDProcessParameter = newADProcessParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADProcessParameterListType ";
	}
}
