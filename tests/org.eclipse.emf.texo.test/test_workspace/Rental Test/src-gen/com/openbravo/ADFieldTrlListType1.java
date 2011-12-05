package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADFieldTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADFieldTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADFieldTrlType> aDFieldTrl = new ArrayList<ADFieldTrlType>();

	/**
	 * Returns the value of '<em><b>aDFieldTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldTrl</b></em>' feature
	 * @generated
	 */
	public List<ADFieldTrlType> getADFieldTrl() {
		return aDFieldTrl;
	}

	/**
	 * Adds to the <em>aDFieldTrl</em> feature.
	 * @generated
	 */
	public void addToADFieldTrl(ADFieldTrlType aDFieldTrlValue) {
		if (!aDFieldTrl.contains(aDFieldTrlValue)) {

			aDFieldTrl.add(aDFieldTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDFieldTrl</em> feature.
	 * @generated
	 */
	public void removeFromADFieldTrl(ADFieldTrlType aDFieldTrlValue) {
		if (aDFieldTrl.contains(aDFieldTrlValue)) {
			aDFieldTrl.remove(aDFieldTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDFieldTrl</em> feature.
	 * @generated
	 */
	public void clearADFieldTrl() {
		while (!aDFieldTrl.isEmpty()) {
			removeFromADFieldTrl(aDFieldTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADFieldTrlListType1#getADFieldTrl() <em>aDFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADFieldTrlListType1#getADFieldTrl() aDFieldTrl}' feature.
	 * @generated
	 */
	public void setADFieldTrl(List<ADFieldTrlType> newADFieldTrl) {
		aDFieldTrl = newADFieldTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADFieldTrlListType1 ";
	}
}
