package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTabTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTabTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADTabTrlType> aDTabTrl = new ArrayList<ADTabTrlType>();

	/**
	 * Returns the value of '<em><b>aDTabTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTabTrl</b></em>' feature
	 * @generated
	 */
	public List<ADTabTrlType> getADTabTrl() {
		return aDTabTrl;
	}

	/**
	 * Adds to the <em>aDTabTrl</em> feature.
	 * @generated
	 */
	public void addToADTabTrl(ADTabTrlType aDTabTrlValue) {
		if (!aDTabTrl.contains(aDTabTrlValue)) {

			aDTabTrl.add(aDTabTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDTabTrl</em> feature.
	 * @generated
	 */
	public void removeFromADTabTrl(ADTabTrlType aDTabTrlValue) {
		if (aDTabTrl.contains(aDTabTrlValue)) {
			aDTabTrl.remove(aDTabTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDTabTrl</em> feature.
	 * @generated
	 */
	public void clearADTabTrl() {
		while (!aDTabTrl.isEmpty()) {
			removeFromADTabTrl(aDTabTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADTabTrlListType#getADTabTrl() <em>aDTabTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTabTrlListType#getADTabTrl() aDTabTrl}' feature.
	 * @generated
	 */
	public void setADTabTrl(List<ADTabTrlType> newADTabTrl) {
		aDTabTrl = newADTabTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADTabTrlListType ";
	}
}
