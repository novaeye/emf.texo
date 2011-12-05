package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentDetailVListType2</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentDetailVListType2 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentDetailVType> fINPaymentDetailV = new ArrayList<FINPaymentDetailVType>();

	/**
	 * Returns the value of '<em><b>fINPaymentDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentDetailVType> getFINPaymentDetailV() {
		return fINPaymentDetailV;
	}

	/**
	 * Adds to the <em>fINPaymentDetailV</em> feature.
	 * @generated
	 */
	public void addToFINPaymentDetailV(
			FINPaymentDetailVType fINPaymentDetailVValue) {
		if (!fINPaymentDetailV.contains(fINPaymentDetailVValue)) {

			fINPaymentDetailV.add(fINPaymentDetailVValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentDetailV</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentDetailV(
			FINPaymentDetailVType fINPaymentDetailVValue) {
		if (fINPaymentDetailV.contains(fINPaymentDetailVValue)) {
			fINPaymentDetailV.remove(fINPaymentDetailVValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentDetailV</em> feature.
	 * @generated
	 */
	public void clearFINPaymentDetailV() {
		while (!fINPaymentDetailV.isEmpty()) {
			removeFromFINPaymentDetailV(fINPaymentDetailV.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentDetailVListType2#getFINPaymentDetailV() <em>fINPaymentDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentDetailVListType2#getFINPaymentDetailV() fINPaymentDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailV(
			List<FINPaymentDetailVType> newFINPaymentDetailV) {
		fINPaymentDetailV = newFINPaymentDetailV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentDetailVListType2 ";
	}
}
