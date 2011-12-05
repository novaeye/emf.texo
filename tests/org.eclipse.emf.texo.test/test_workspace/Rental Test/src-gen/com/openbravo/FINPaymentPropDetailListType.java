package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentPropDetailListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentPropDetailListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentPropDetailType> fINPaymentPropDetail = new ArrayList<FINPaymentPropDetailType>();

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetail</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentPropDetailType> getFINPaymentPropDetail() {
		return fINPaymentPropDetail;
	}

	/**
	 * Adds to the <em>fINPaymentPropDetail</em> feature.
	 * @generated
	 */
	public void addToFINPaymentPropDetail(
			FINPaymentPropDetailType fINPaymentPropDetailValue) {
		if (!fINPaymentPropDetail.contains(fINPaymentPropDetailValue)) {

			fINPaymentPropDetail.add(fINPaymentPropDetailValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentPropDetail</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentPropDetail(
			FINPaymentPropDetailType fINPaymentPropDetailValue) {
		if (fINPaymentPropDetail.contains(fINPaymentPropDetailValue)) {
			fINPaymentPropDetail.remove(fINPaymentPropDetailValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentPropDetail</em> feature.
	 * @generated
	 */
	public void clearFINPaymentPropDetail() {
		while (!fINPaymentPropDetail.isEmpty()) {
			removeFromFINPaymentPropDetail(fINPaymentPropDetail.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentPropDetailListType#getFINPaymentPropDetail() <em>fINPaymentPropDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentPropDetailListType#getFINPaymentPropDetail() fINPaymentPropDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetail(
			List<FINPaymentPropDetailType> newFINPaymentPropDetail) {
		fINPaymentPropDetail = newFINPaymentPropDetail;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentPropDetailListType ";
	}
}
