package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADMenuTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADMenuTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADMenuTrlType> aDMenuTrl = new ArrayList<ADMenuTrlType>();

	/**
	 * Returns the value of '<em><b>aDMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenuTrl</b></em>' feature
	 * @generated
	 */
	public List<ADMenuTrlType> getADMenuTrl() {
		return aDMenuTrl;
	}

	/**
	 * Adds to the <em>aDMenuTrl</em> feature.
	 * @generated
	 */
	public void addToADMenuTrl(ADMenuTrlType aDMenuTrlValue) {
		if (!aDMenuTrl.contains(aDMenuTrlValue)) {

			aDMenuTrl.add(aDMenuTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDMenuTrl</em> feature.
	 * @generated
	 */
	public void removeFromADMenuTrl(ADMenuTrlType aDMenuTrlValue) {
		if (aDMenuTrl.contains(aDMenuTrlValue)) {
			aDMenuTrl.remove(aDMenuTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDMenuTrl</em> feature.
	 * @generated
	 */
	public void clearADMenuTrl() {
		while (!aDMenuTrl.isEmpty()) {
			removeFromADMenuTrl(aDMenuTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADMenuTrlListType#getADMenuTrl() <em>aDMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADMenuTrlListType#getADMenuTrl() aDMenuTrl}' feature.
	 * @generated
	 */
	public void setADMenuTrl(List<ADMenuTrlType> newADMenuTrl) {
		aDMenuTrl = newADMenuTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADMenuTrlListType ";
	}
}
