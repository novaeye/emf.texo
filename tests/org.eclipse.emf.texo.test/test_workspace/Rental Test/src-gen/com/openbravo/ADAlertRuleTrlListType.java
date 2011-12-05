package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADAlertRuleTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADAlertRuleTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADAlertRuleTrlType> aDAlertRuleTrl = new ArrayList<ADAlertRuleTrlType>();

	/**
	 * Returns the value of '<em><b>aDAlertRuleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRuleTrl</b></em>' feature
	 * @generated
	 */
	public List<ADAlertRuleTrlType> getADAlertRuleTrl() {
		return aDAlertRuleTrl;
	}

	/**
	 * Adds to the <em>aDAlertRuleTrl</em> feature.
	 * @generated
	 */
	public void addToADAlertRuleTrl(ADAlertRuleTrlType aDAlertRuleTrlValue) {
		if (!aDAlertRuleTrl.contains(aDAlertRuleTrlValue)) {

			aDAlertRuleTrl.add(aDAlertRuleTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDAlertRuleTrl</em> feature.
	 * @generated
	 */
	public void removeFromADAlertRuleTrl(ADAlertRuleTrlType aDAlertRuleTrlValue) {
		if (aDAlertRuleTrl.contains(aDAlertRuleTrlValue)) {
			aDAlertRuleTrl.remove(aDAlertRuleTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDAlertRuleTrl</em> feature.
	 * @generated
	 */
	public void clearADAlertRuleTrl() {
		while (!aDAlertRuleTrl.isEmpty()) {
			removeFromADAlertRuleTrl(aDAlertRuleTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADAlertRuleTrlListType#getADAlertRuleTrl() <em>aDAlertRuleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAlertRuleTrlListType#getADAlertRuleTrl() aDAlertRuleTrl}' feature.
	 * @generated
	 */
	public void setADAlertRuleTrl(List<ADAlertRuleTrlType> newADAlertRuleTrl) {
		aDAlertRuleTrl = newADAlertRuleTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADAlertRuleTrlListType ";
	}
}
