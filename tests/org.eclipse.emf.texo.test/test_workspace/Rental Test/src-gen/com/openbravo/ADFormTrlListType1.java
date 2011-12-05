package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADFormTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADFormTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADFormTrlType> aDFormTrl = new ArrayList<ADFormTrlType>();

	/**
	 * Returns the value of '<em><b>aDFormTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormTrl</b></em>' feature
	 * @generated
	 */
	public List<ADFormTrlType> getADFormTrl() {
		return aDFormTrl;
	}

	/**
	 * Adds to the <em>aDFormTrl</em> feature.
	 * @generated
	 */
	public void addToADFormTrl(ADFormTrlType aDFormTrlValue) {
		if (!aDFormTrl.contains(aDFormTrlValue)) {

			aDFormTrl.add(aDFormTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDFormTrl</em> feature.
	 * @generated
	 */
	public void removeFromADFormTrl(ADFormTrlType aDFormTrlValue) {
		if (aDFormTrl.contains(aDFormTrlValue)) {
			aDFormTrl.remove(aDFormTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDFormTrl</em> feature.
	 * @generated
	 */
	public void clearADFormTrl() {
		while (!aDFormTrl.isEmpty()) {
			removeFromADFormTrl(aDFormTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADFormTrlListType1#getADFormTrl() <em>aDFormTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADFormTrlListType1#getADFormTrl() aDFormTrl}' feature.
	 * @generated
	 */
	public void setADFormTrl(List<ADFormTrlType> newADFormTrl) {
		aDFormTrl = newADFormTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADFormTrlListType1 ";
	}
}
