package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADAlertRecipientListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADAlertRecipientListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADAlertRecipientType> aDAlertRecipient = new ArrayList<ADAlertRecipientType>();

	/**
	 * Returns the value of '<em><b>aDAlertRecipient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRecipient</b></em>' feature
	 * @generated
	 */
	public List<ADAlertRecipientType> getADAlertRecipient() {
		return aDAlertRecipient;
	}

	/**
	 * Adds to the <em>aDAlertRecipient</em> feature.
	 * @generated
	 */
	public void addToADAlertRecipient(ADAlertRecipientType aDAlertRecipientValue) {
		if (!aDAlertRecipient.contains(aDAlertRecipientValue)) {

			aDAlertRecipient.add(aDAlertRecipientValue);
		}

	}

	/**			
	 * Removes from the <em>aDAlertRecipient</em> feature.
	 * @generated
	 */
	public void removeFromADAlertRecipient(
			ADAlertRecipientType aDAlertRecipientValue) {
		if (aDAlertRecipient.contains(aDAlertRecipientValue)) {
			aDAlertRecipient.remove(aDAlertRecipientValue);
		}
	}

	/**			
	 * Clears the <em>aDAlertRecipient</em> feature.
	 * @generated
	 */
	public void clearADAlertRecipient() {
		while (!aDAlertRecipient.isEmpty()) {
			removeFromADAlertRecipient(aDAlertRecipient.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADAlertRecipientListType#getADAlertRecipient() <em>aDAlertRecipient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAlertRecipientListType#getADAlertRecipient() aDAlertRecipient}' feature.
	 * @generated
	 */
	public void setADAlertRecipient(
			List<ADAlertRecipientType> newADAlertRecipient) {
		aDAlertRecipient = newADAlertRecipient;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADAlertRecipientListType ";
	}
}
