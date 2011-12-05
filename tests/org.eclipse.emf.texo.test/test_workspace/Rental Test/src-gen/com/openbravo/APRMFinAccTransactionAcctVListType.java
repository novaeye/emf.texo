package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>APRMFinAccTransactionAcctVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class APRMFinAccTransactionAcctVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<APRMFinAccTransactionAcctVType> aPRMFinAccTransactionAcctV = new ArrayList<APRMFinAccTransactionAcctVType>();

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctV</b></em>' feature
	 * @generated
	 */
	public List<APRMFinAccTransactionAcctVType> getAPRMFinAccTransactionAcctV() {
		return aPRMFinAccTransactionAcctV;
	}

	/**
	 * Adds to the <em>aPRMFinAccTransactionAcctV</em> feature.
	 * @generated
	 */
	public void addToAPRMFinAccTransactionAcctV(
			APRMFinAccTransactionAcctVType aPRMFinAccTransactionAcctVValue) {
		if (!aPRMFinAccTransactionAcctV
				.contains(aPRMFinAccTransactionAcctVValue)) {

			aPRMFinAccTransactionAcctV.add(aPRMFinAccTransactionAcctVValue);
		}

	}

	/**			
	 * Removes from the <em>aPRMFinAccTransactionAcctV</em> feature.
	 * @generated
	 */
	public void removeFromAPRMFinAccTransactionAcctV(
			APRMFinAccTransactionAcctVType aPRMFinAccTransactionAcctVValue) {
		if (aPRMFinAccTransactionAcctV
				.contains(aPRMFinAccTransactionAcctVValue)) {
			aPRMFinAccTransactionAcctV.remove(aPRMFinAccTransactionAcctVValue);
		}
	}

	/**			
	 * Clears the <em>aPRMFinAccTransactionAcctV</em> feature.
	 * @generated
	 */
	public void clearAPRMFinAccTransactionAcctV() {
		while (!aPRMFinAccTransactionAcctV.isEmpty()) {
			removeFromAPRMFinAccTransactionAcctV(aPRMFinAccTransactionAcctV
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link APRMFinAccTransactionAcctVListType#getAPRMFinAccTransactionAcctV() <em>aPRMFinAccTransactionAcctV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinAccTransactionAcctVListType#getAPRMFinAccTransactionAcctV() aPRMFinAccTransactionAcctV}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctV(
			List<APRMFinAccTransactionAcctVType> newAPRMFinAccTransactionAcctV) {
		aPRMFinAccTransactionAcctV = newAPRMFinAccTransactionAcctV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "APRMFinAccTransactionAcctVListType ";
	}
}
