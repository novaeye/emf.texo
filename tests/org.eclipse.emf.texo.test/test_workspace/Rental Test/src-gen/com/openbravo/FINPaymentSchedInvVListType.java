package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentSchedInvVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentSchedInvVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentSchedInvVType> fINPaymentSchedInvV = new ArrayList<FINPaymentSchedInvVType>();

	/**
	 * Returns the value of '<em><b>fINPaymentSchedInvV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedInvV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentSchedInvVType> getFINPaymentSchedInvV() {
		return fINPaymentSchedInvV;
	}

	/**
	 * Adds to the <em>fINPaymentSchedInvV</em> feature.
	 * @generated
	 */
	public void addToFINPaymentSchedInvV(
			FINPaymentSchedInvVType fINPaymentSchedInvVValue) {
		if (!fINPaymentSchedInvV.contains(fINPaymentSchedInvVValue)) {

			fINPaymentSchedInvV.add(fINPaymentSchedInvVValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentSchedInvV</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentSchedInvV(
			FINPaymentSchedInvVType fINPaymentSchedInvVValue) {
		if (fINPaymentSchedInvV.contains(fINPaymentSchedInvVValue)) {
			fINPaymentSchedInvV.remove(fINPaymentSchedInvVValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentSchedInvV</em> feature.
	 * @generated
	 */
	public void clearFINPaymentSchedInvV() {
		while (!fINPaymentSchedInvV.isEmpty()) {
			removeFromFINPaymentSchedInvV(fINPaymentSchedInvV.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVListType#getFINPaymentSchedInvV() <em>fINPaymentSchedInvV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVListType#getFINPaymentSchedInvV() fINPaymentSchedInvV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvV(
			List<FINPaymentSchedInvVType> newFINPaymentSchedInvV) {
		fINPaymentSchedInvV = newFINPaymentSchedInvV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentSchedInvVListType ";
	}
}
