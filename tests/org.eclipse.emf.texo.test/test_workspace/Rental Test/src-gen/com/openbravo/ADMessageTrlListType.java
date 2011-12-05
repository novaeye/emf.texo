package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADMessageTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADMessageTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADMessageTrlType> aDMessageTrl = new ArrayList<ADMessageTrlType>();

	/**
	 * Returns the value of '<em><b>aDMessageTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessageTrl</b></em>' feature
	 * @generated
	 */
	public List<ADMessageTrlType> getADMessageTrl() {
		return aDMessageTrl;
	}

	/**
	 * Adds to the <em>aDMessageTrl</em> feature.
	 * @generated
	 */
	public void addToADMessageTrl(ADMessageTrlType aDMessageTrlValue) {
		if (!aDMessageTrl.contains(aDMessageTrlValue)) {

			aDMessageTrl.add(aDMessageTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDMessageTrl</em> feature.
	 * @generated
	 */
	public void removeFromADMessageTrl(ADMessageTrlType aDMessageTrlValue) {
		if (aDMessageTrl.contains(aDMessageTrlValue)) {
			aDMessageTrl.remove(aDMessageTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDMessageTrl</em> feature.
	 * @generated
	 */
	public void clearADMessageTrl() {
		while (!aDMessageTrl.isEmpty()) {
			removeFromADMessageTrl(aDMessageTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADMessageTrlListType#getADMessageTrl() <em>aDMessageTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADMessageTrlListType#getADMessageTrl() aDMessageTrl}' feature.
	 * @generated
	 */
	public void setADMessageTrl(List<ADMessageTrlType> newADMessageTrl) {
		aDMessageTrl = newADMessageTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADMessageTrlListType ";
	}
}
