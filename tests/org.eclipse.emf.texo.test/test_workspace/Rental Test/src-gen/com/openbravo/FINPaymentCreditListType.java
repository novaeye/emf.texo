package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentCreditListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentCreditListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentCreditType> fINPaymentCredit = new ArrayList<FINPaymentCreditType>();

	/**
	 * Returns the value of '<em><b>fINPaymentCredit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentCredit</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentCreditType> getFINPaymentCredit() {
		return fINPaymentCredit;
	}

	/**
	 * Adds to the <em>fINPaymentCredit</em> feature.
	 * @generated
	 */
	public void addToFINPaymentCredit(FINPaymentCreditType fINPaymentCreditValue) {
		if (!fINPaymentCredit.contains(fINPaymentCreditValue)) {

			fINPaymentCredit.add(fINPaymentCreditValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentCredit</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentCredit(
			FINPaymentCreditType fINPaymentCreditValue) {
		if (fINPaymentCredit.contains(fINPaymentCreditValue)) {
			fINPaymentCredit.remove(fINPaymentCreditValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentCredit</em> feature.
	 * @generated
	 */
	public void clearFINPaymentCredit() {
		while (!fINPaymentCredit.isEmpty()) {
			removeFromFINPaymentCredit(fINPaymentCredit.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentCreditListType#getFINPaymentCredit() <em>fINPaymentCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentCreditListType#getFINPaymentCredit() fINPaymentCredit}' feature.
	 * @generated
	 */
	public void setFINPaymentCredit(
			List<FINPaymentCreditType> newFINPaymentCredit) {
		fINPaymentCredit = newFINPaymentCredit;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentCreditListType ";
	}
}
