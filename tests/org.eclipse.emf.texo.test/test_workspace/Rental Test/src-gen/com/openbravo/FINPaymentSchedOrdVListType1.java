package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentSchedOrdVListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentSchedOrdVListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentSchedOrdVType> fINPaymentSchedOrdV = new ArrayList<FINPaymentSchedOrdVType>();

	/**
	 * Returns the value of '<em><b>fINPaymentSchedOrdV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedOrdV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentSchedOrdVType> getFINPaymentSchedOrdV() {
		return fINPaymentSchedOrdV;
	}

	/**
	 * Adds to the <em>fINPaymentSchedOrdV</em> feature.
	 * @generated
	 */
	public void addToFINPaymentSchedOrdV(
			FINPaymentSchedOrdVType fINPaymentSchedOrdVValue) {
		if (!fINPaymentSchedOrdV.contains(fINPaymentSchedOrdVValue)) {

			fINPaymentSchedOrdV.add(fINPaymentSchedOrdVValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentSchedOrdV</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentSchedOrdV(
			FINPaymentSchedOrdVType fINPaymentSchedOrdVValue) {
		if (fINPaymentSchedOrdV.contains(fINPaymentSchedOrdVValue)) {
			fINPaymentSchedOrdV.remove(fINPaymentSchedOrdVValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentSchedOrdV</em> feature.
	 * @generated
	 */
	public void clearFINPaymentSchedOrdV() {
		while (!fINPaymentSchedOrdV.isEmpty()) {
			removeFromFINPaymentSchedOrdV(fINPaymentSchedOrdV.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentSchedOrdVListType1#getFINPaymentSchedOrdV() <em>fINPaymentSchedOrdV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedOrdVListType1#getFINPaymentSchedOrdV() fINPaymentSchedOrdV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdV(
			List<FINPaymentSchedOrdVType> newFINPaymentSchedOrdV) {
		fINPaymentSchedOrdV = newFINPaymentSchedOrdV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentSchedOrdVListType1 ";
	}
}
