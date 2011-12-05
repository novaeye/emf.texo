package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentDetailListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentDetailListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentDetailType> fINPaymentDetail = new ArrayList<FINPaymentDetailType>();

	/**
	 * Returns the value of '<em><b>fINPaymentDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetail</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentDetailType> getFINPaymentDetail() {
		return fINPaymentDetail;
	}

	/**
	 * Adds to the <em>fINPaymentDetail</em> feature.
	 * @generated
	 */
	public void addToFINPaymentDetail(FINPaymentDetailType fINPaymentDetailValue) {
		if (!fINPaymentDetail.contains(fINPaymentDetailValue)) {

			fINPaymentDetail.add(fINPaymentDetailValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentDetail</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentDetail(
			FINPaymentDetailType fINPaymentDetailValue) {
		if (fINPaymentDetail.contains(fINPaymentDetailValue)) {
			fINPaymentDetail.remove(fINPaymentDetailValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentDetail</em> feature.
	 * @generated
	 */
	public void clearFINPaymentDetail() {
		while (!fINPaymentDetail.isEmpty()) {
			removeFromFINPaymentDetail(fINPaymentDetail.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentDetailListType#getFINPaymentDetail() <em>fINPaymentDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentDetailListType#getFINPaymentDetail() fINPaymentDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentDetail(
			List<FINPaymentDetailType> newFINPaymentDetail) {
		fINPaymentDetail = newFINPaymentDetail;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentDetailListType ";
	}
}
