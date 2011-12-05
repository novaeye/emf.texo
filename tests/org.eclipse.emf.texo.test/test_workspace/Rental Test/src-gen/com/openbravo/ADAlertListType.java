package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADAlertListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADAlertListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADAlertType> aDAlert = new ArrayList<ADAlertType>();

	/**
	 * Returns the value of '<em><b>aDAlert</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlert</b></em>' feature
	 * @generated
	 */
	public List<ADAlertType> getADAlert() {
		return aDAlert;
	}

	/**
	 * Adds to the <em>aDAlert</em> feature.
	 * @generated
	 */
	public void addToADAlert(ADAlertType aDAlertValue) {
		if (!aDAlert.contains(aDAlertValue)) {

			aDAlert.add(aDAlertValue);
		}

	}

	/**			
	 * Removes from the <em>aDAlert</em> feature.
	 * @generated
	 */
	public void removeFromADAlert(ADAlertType aDAlertValue) {
		if (aDAlert.contains(aDAlertValue)) {
			aDAlert.remove(aDAlertValue);
		}
	}

	/**			
	 * Clears the <em>aDAlert</em> feature.
	 * @generated
	 */
	public void clearADAlert() {
		while (!aDAlert.isEmpty()) {
			removeFromADAlert(aDAlert.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADAlertListType#getADAlert() <em>aDAlert</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAlertListType#getADAlert() aDAlert}' feature.
	 * @generated
	 */
	public void setADAlert(List<ADAlertType> newADAlert) {
		aDAlert = newADAlert;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADAlertListType ";
	}
}
