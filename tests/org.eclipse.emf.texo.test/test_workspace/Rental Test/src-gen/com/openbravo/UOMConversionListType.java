package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>UOMConversionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class UOMConversionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<UOMConversionType> uOMConversion = new ArrayList<UOMConversionType>();

	/**
	 * Returns the value of '<em><b>uOMConversion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMConversion</b></em>' feature
	 * @generated
	 */
	public List<UOMConversionType> getUOMConversion() {
		return uOMConversion;
	}

	/**
	 * Adds to the <em>uOMConversion</em> feature.
	 * @generated
	 */
	public void addToUOMConversion(UOMConversionType uOMConversionValue) {
		if (!uOMConversion.contains(uOMConversionValue)) {

			uOMConversion.add(uOMConversionValue);
		}

	}

	/**			
	 * Removes from the <em>uOMConversion</em> feature.
	 * @generated
	 */
	public void removeFromUOMConversion(UOMConversionType uOMConversionValue) {
		if (uOMConversion.contains(uOMConversionValue)) {
			uOMConversion.remove(uOMConversionValue);
		}
	}

	/**			
	 * Clears the <em>uOMConversion</em> feature.
	 * @generated
	 */
	public void clearUOMConversion() {
		while (!uOMConversion.isEmpty()) {
			removeFromUOMConversion(uOMConversion.iterator().next());
		}
	}

	/**
	 * Sets the '{@link UOMConversionListType#getUOMConversion() <em>uOMConversion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMConversionListType#getUOMConversion() uOMConversion}' feature.
	 * @generated
	 */
	public void setUOMConversion(List<UOMConversionType> newUOMConversion) {
		uOMConversion = newUOMConversion;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "UOMConversionListType ";
	}
}
