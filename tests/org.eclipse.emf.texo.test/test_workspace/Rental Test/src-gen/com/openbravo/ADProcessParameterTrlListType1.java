package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessParameterTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessParameterTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADProcessParameterTrlType> aDProcessParameterTrl = new ArrayList<ADProcessParameterTrlType>();

	/**
	 * Returns the value of '<em><b>aDProcessParameterTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterTrl</b></em>' feature
	 * @generated
	 */
	public List<ADProcessParameterTrlType> getADProcessParameterTrl() {
		return aDProcessParameterTrl;
	}

	/**
	 * Adds to the <em>aDProcessParameterTrl</em> feature.
	 * @generated
	 */
	public void addToADProcessParameterTrl(
			ADProcessParameterTrlType aDProcessParameterTrlValue) {
		if (!aDProcessParameterTrl.contains(aDProcessParameterTrlValue)) {

			aDProcessParameterTrl.add(aDProcessParameterTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDProcessParameterTrl</em> feature.
	 * @generated
	 */
	public void removeFromADProcessParameterTrl(
			ADProcessParameterTrlType aDProcessParameterTrlValue) {
		if (aDProcessParameterTrl.contains(aDProcessParameterTrlValue)) {
			aDProcessParameterTrl.remove(aDProcessParameterTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDProcessParameterTrl</em> feature.
	 * @generated
	 */
	public void clearADProcessParameterTrl() {
		while (!aDProcessParameterTrl.isEmpty()) {
			removeFromADProcessParameterTrl(aDProcessParameterTrl.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ADProcessParameterTrlListType1#getADProcessParameterTrl() <em>aDProcessParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterTrlListType1#getADProcessParameterTrl() aDProcessParameterTrl}' feature.
	 * @generated
	 */
	public void setADProcessParameterTrl(
			List<ADProcessParameterTrlType> newADProcessParameterTrl) {
		aDProcessParameterTrl = newADProcessParameterTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADProcessParameterTrlListType1 ";
	}
}
