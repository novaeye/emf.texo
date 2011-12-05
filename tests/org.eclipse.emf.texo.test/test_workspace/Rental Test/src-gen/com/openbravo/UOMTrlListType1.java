package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>UOMTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class UOMTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<UOMTrlType> uOMTrl = new ArrayList<UOMTrlType>();

	/**
	 * Returns the value of '<em><b>uOMTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMTrl</b></em>' feature
	 * @generated
	 */
	public List<UOMTrlType> getUOMTrl() {
		return uOMTrl;
	}

	/**
	 * Adds to the <em>uOMTrl</em> feature.
	 * @generated
	 */
	public void addToUOMTrl(UOMTrlType uOMTrlValue) {
		if (!uOMTrl.contains(uOMTrlValue)) {

			uOMTrl.add(uOMTrlValue);
		}

	}

	/**			
	 * Removes from the <em>uOMTrl</em> feature.
	 * @generated
	 */
	public void removeFromUOMTrl(UOMTrlType uOMTrlValue) {
		if (uOMTrl.contains(uOMTrlValue)) {
			uOMTrl.remove(uOMTrlValue);
		}
	}

	/**			
	 * Clears the <em>uOMTrl</em> feature.
	 * @generated
	 */
	public void clearUOMTrl() {
		while (!uOMTrl.isEmpty()) {
			removeFromUOMTrl(uOMTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link UOMTrlListType1#getUOMTrl() <em>uOMTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMTrlListType1#getUOMTrl() uOMTrl}' feature.
	 * @generated
	 */
	public void setUOMTrl(List<UOMTrlType> newUOMTrl) {
		uOMTrl = newUOMTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "UOMTrlListType1 ";
	}
}
