package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADProcessTrlType> aDProcessTrl = new ArrayList<ADProcessTrlType>();

	/**
	 * Returns the value of '<em><b>aDProcessTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessTrl</b></em>' feature
	 * @generated
	 */
	public List<ADProcessTrlType> getADProcessTrl() {
		return aDProcessTrl;
	}

	/**
	 * Adds to the <em>aDProcessTrl</em> feature.
	 * @generated
	 */
	public void addToADProcessTrl(ADProcessTrlType aDProcessTrlValue) {
		if (!aDProcessTrl.contains(aDProcessTrlValue)) {

			aDProcessTrl.add(aDProcessTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDProcessTrl</em> feature.
	 * @generated
	 */
	public void removeFromADProcessTrl(ADProcessTrlType aDProcessTrlValue) {
		if (aDProcessTrl.contains(aDProcessTrlValue)) {
			aDProcessTrl.remove(aDProcessTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDProcessTrl</em> feature.
	 * @generated
	 */
	public void clearADProcessTrl() {
		while (!aDProcessTrl.isEmpty()) {
			removeFromADProcessTrl(aDProcessTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADProcessTrlListType1#getADProcessTrl() <em>aDProcessTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessTrlListType1#getADProcessTrl() aDProcessTrl}' feature.
	 * @generated
	 */
	public void setADProcessTrl(List<ADProcessTrlType> newADProcessTrl) {
		aDProcessTrl = newADProcessTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADProcessTrlListType1 ";
	}
}
