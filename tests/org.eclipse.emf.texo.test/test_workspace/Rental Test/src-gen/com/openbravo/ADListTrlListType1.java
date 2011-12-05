package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADListTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADListTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADListTrlType> aDListTrl = new ArrayList<ADListTrlType>();

	/**
	 * Returns the value of '<em><b>aDListTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDListTrl</b></em>' feature
	 * @generated
	 */
	public List<ADListTrlType> getADListTrl() {
		return aDListTrl;
	}

	/**
	 * Adds to the <em>aDListTrl</em> feature.
	 * @generated
	 */
	public void addToADListTrl(ADListTrlType aDListTrlValue) {
		if (!aDListTrl.contains(aDListTrlValue)) {

			aDListTrl.add(aDListTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDListTrl</em> feature.
	 * @generated
	 */
	public void removeFromADListTrl(ADListTrlType aDListTrlValue) {
		if (aDListTrl.contains(aDListTrlValue)) {
			aDListTrl.remove(aDListTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDListTrl</em> feature.
	 * @generated
	 */
	public void clearADListTrl() {
		while (!aDListTrl.isEmpty()) {
			removeFromADListTrl(aDListTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADListTrlListType1#getADListTrl() <em>aDListTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADListTrlListType1#getADListTrl() aDListTrl}' feature.
	 * @generated
	 */
	public void setADListTrl(List<ADListTrlType> newADListTrl) {
		aDListTrl = newADListTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADListTrlListType1 ";
	}
}
