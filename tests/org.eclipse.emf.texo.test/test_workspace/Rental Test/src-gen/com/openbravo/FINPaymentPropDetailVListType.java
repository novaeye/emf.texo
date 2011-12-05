package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentPropDetailVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentPropDetailVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentPropDetailVType> fINPaymentPropDetailV = new ArrayList<FINPaymentPropDetailVType>();

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetailV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentPropDetailVType> getFINPaymentPropDetailV() {
		return fINPaymentPropDetailV;
	}

	/**
	 * Adds to the <em>fINPaymentPropDetailV</em> feature.
	 * @generated
	 */
	public void addToFINPaymentPropDetailV(
			FINPaymentPropDetailVType fINPaymentPropDetailVValue) {
		if (!fINPaymentPropDetailV.contains(fINPaymentPropDetailVValue)) {

			fINPaymentPropDetailV.add(fINPaymentPropDetailVValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentPropDetailV</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentPropDetailV(
			FINPaymentPropDetailVType fINPaymentPropDetailVValue) {
		if (fINPaymentPropDetailV.contains(fINPaymentPropDetailVValue)) {
			fINPaymentPropDetailV.remove(fINPaymentPropDetailVValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentPropDetailV</em> feature.
	 * @generated
	 */
	public void clearFINPaymentPropDetailV() {
		while (!fINPaymentPropDetailV.isEmpty()) {
			removeFromFINPaymentPropDetailV(fINPaymentPropDetailV.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentPropDetailVListType#getFINPaymentPropDetailV() <em>fINPaymentPropDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentPropDetailVListType#getFINPaymentPropDetailV() fINPaymentPropDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetailV(
			List<FINPaymentPropDetailVType> newFINPaymentPropDetailV) {
		fINPaymentPropDetailV = newFINPaymentPropDetailV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentPropDetailVListType ";
	}
}
