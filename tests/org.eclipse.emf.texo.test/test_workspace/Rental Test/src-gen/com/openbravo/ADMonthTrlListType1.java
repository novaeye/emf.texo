package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADMonthTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADMonthTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADMonthTrlType> aDMonthTrl = new ArrayList<ADMonthTrlType>();

	/**
	 * Returns the value of '<em><b>aDMonthTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMonthTrl</b></em>' feature
	 * @generated
	 */
	public List<ADMonthTrlType> getADMonthTrl() {
		return aDMonthTrl;
	}

	/**
	 * Adds to the <em>aDMonthTrl</em> feature.
	 * @generated
	 */
	public void addToADMonthTrl(ADMonthTrlType aDMonthTrlValue) {
		if (!aDMonthTrl.contains(aDMonthTrlValue)) {

			aDMonthTrl.add(aDMonthTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDMonthTrl</em> feature.
	 * @generated
	 */
	public void removeFromADMonthTrl(ADMonthTrlType aDMonthTrlValue) {
		if (aDMonthTrl.contains(aDMonthTrlValue)) {
			aDMonthTrl.remove(aDMonthTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDMonthTrl</em> feature.
	 * @generated
	 */
	public void clearADMonthTrl() {
		while (!aDMonthTrl.isEmpty()) {
			removeFromADMonthTrl(aDMonthTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADMonthTrlListType1#getADMonthTrl() <em>aDMonthTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADMonthTrlListType1#getADMonthTrl() aDMonthTrl}' feature.
	 * @generated
	 */
	public void setADMonthTrl(List<ADMonthTrlType> newADMonthTrl) {
		aDMonthTrl = newADMonthTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADMonthTrlListType1 ";
	}
}
