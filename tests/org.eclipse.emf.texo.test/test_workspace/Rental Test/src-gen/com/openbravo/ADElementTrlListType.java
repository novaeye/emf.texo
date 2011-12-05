package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADElementTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADElementTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADElementTrlType> aDElementTrl = new ArrayList<ADElementTrlType>();

	/**
	 * Returns the value of '<em><b>aDElementTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDElementTrl</b></em>' feature
	 * @generated
	 */
	public List<ADElementTrlType> getADElementTrl() {
		return aDElementTrl;
	}

	/**
	 * Adds to the <em>aDElementTrl</em> feature.
	 * @generated
	 */
	public void addToADElementTrl(ADElementTrlType aDElementTrlValue) {
		if (!aDElementTrl.contains(aDElementTrlValue)) {

			aDElementTrl.add(aDElementTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDElementTrl</em> feature.
	 * @generated
	 */
	public void removeFromADElementTrl(ADElementTrlType aDElementTrlValue) {
		if (aDElementTrl.contains(aDElementTrlValue)) {
			aDElementTrl.remove(aDElementTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDElementTrl</em> feature.
	 * @generated
	 */
	public void clearADElementTrl() {
		while (!aDElementTrl.isEmpty()) {
			removeFromADElementTrl(aDElementTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADElementTrlListType#getADElementTrl() <em>aDElementTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADElementTrlListType#getADElementTrl() aDElementTrl}' feature.
	 * @generated
	 */
	public void setADElementTrl(List<ADElementTrlType> newADElementTrl) {
		aDElementTrl = newADElementTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADElementTrlListType ";
	}
}
