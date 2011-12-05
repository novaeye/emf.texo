package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADFieldGroupTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADFieldGroupTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADFieldGroupTrlType> aDFieldGroupTrl = new ArrayList<ADFieldGroupTrlType>();

	/**
	 * Returns the value of '<em><b>aDFieldGroupTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldGroupTrl</b></em>' feature
	 * @generated
	 */
	public List<ADFieldGroupTrlType> getADFieldGroupTrl() {
		return aDFieldGroupTrl;
	}

	/**
	 * Adds to the <em>aDFieldGroupTrl</em> feature.
	 * @generated
	 */
	public void addToADFieldGroupTrl(ADFieldGroupTrlType aDFieldGroupTrlValue) {
		if (!aDFieldGroupTrl.contains(aDFieldGroupTrlValue)) {

			aDFieldGroupTrl.add(aDFieldGroupTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDFieldGroupTrl</em> feature.
	 * @generated
	 */
	public void removeFromADFieldGroupTrl(
			ADFieldGroupTrlType aDFieldGroupTrlValue) {
		if (aDFieldGroupTrl.contains(aDFieldGroupTrlValue)) {
			aDFieldGroupTrl.remove(aDFieldGroupTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDFieldGroupTrl</em> feature.
	 * @generated
	 */
	public void clearADFieldGroupTrl() {
		while (!aDFieldGroupTrl.isEmpty()) {
			removeFromADFieldGroupTrl(aDFieldGroupTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADFieldGroupTrlListType#getADFieldGroupTrl() <em>aDFieldGroupTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADFieldGroupTrlListType#getADFieldGroupTrl() aDFieldGroupTrl}' feature.
	 * @generated
	 */
	public void setADFieldGroupTrl(List<ADFieldGroupTrlType> newADFieldGroupTrl) {
		aDFieldGroupTrl = newADFieldGroupTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADFieldGroupTrlListType ";
	}
}
