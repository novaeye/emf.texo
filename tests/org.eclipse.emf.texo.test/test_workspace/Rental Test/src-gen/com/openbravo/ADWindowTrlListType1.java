package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADWindowTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADWindowTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADWindowTrlType> aDWindowTrl = new ArrayList<ADWindowTrlType>();

	/**
	 * Returns the value of '<em><b>aDWindowTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowTrl</b></em>' feature
	 * @generated
	 */
	public List<ADWindowTrlType> getADWindowTrl() {
		return aDWindowTrl;
	}

	/**
	 * Adds to the <em>aDWindowTrl</em> feature.
	 * @generated
	 */
	public void addToADWindowTrl(ADWindowTrlType aDWindowTrlValue) {
		if (!aDWindowTrl.contains(aDWindowTrlValue)) {

			aDWindowTrl.add(aDWindowTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDWindowTrl</em> feature.
	 * @generated
	 */
	public void removeFromADWindowTrl(ADWindowTrlType aDWindowTrlValue) {
		if (aDWindowTrl.contains(aDWindowTrlValue)) {
			aDWindowTrl.remove(aDWindowTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDWindowTrl</em> feature.
	 * @generated
	 */
	public void clearADWindowTrl() {
		while (!aDWindowTrl.isEmpty()) {
			removeFromADWindowTrl(aDWindowTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADWindowTrlListType1#getADWindowTrl() <em>aDWindowTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADWindowTrlListType1#getADWindowTrl() aDWindowTrl}' feature.
	 * @generated
	 */
	public void setADWindowTrl(List<ADWindowTrlType> newADWindowTrl) {
		aDWindowTrl = newADWindowTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADWindowTrlListType1 ";
	}
}
