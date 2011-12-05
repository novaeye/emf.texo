package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentScheduleDetailListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentScheduleDetailListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentScheduleDetailType> fINPaymentScheduleDetail = new ArrayList<FINPaymentScheduleDetailType>();

	/**
	 * Returns the value of '<em><b>fINPaymentScheduleDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentScheduleDetail</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentScheduleDetailType> getFINPaymentScheduleDetail() {
		return fINPaymentScheduleDetail;
	}

	/**
	 * Adds to the <em>fINPaymentScheduleDetail</em> feature.
	 * @generated
	 */
	public void addToFINPaymentScheduleDetail(
			FINPaymentScheduleDetailType fINPaymentScheduleDetailValue) {
		if (!fINPaymentScheduleDetail.contains(fINPaymentScheduleDetailValue)) {

			fINPaymentScheduleDetail.add(fINPaymentScheduleDetailValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentScheduleDetail</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentScheduleDetail(
			FINPaymentScheduleDetailType fINPaymentScheduleDetailValue) {
		if (fINPaymentScheduleDetail.contains(fINPaymentScheduleDetailValue)) {
			fINPaymentScheduleDetail.remove(fINPaymentScheduleDetailValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentScheduleDetail</em> feature.
	 * @generated
	 */
	public void clearFINPaymentScheduleDetail() {
		while (!fINPaymentScheduleDetail.isEmpty()) {
			removeFromFINPaymentScheduleDetail(fINPaymentScheduleDetail
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentScheduleDetailListType#getFINPaymentScheduleDetail() <em>fINPaymentScheduleDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentScheduleDetailListType#getFINPaymentScheduleDetail() fINPaymentScheduleDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleDetail(
			List<FINPaymentScheduleDetailType> newFINPaymentScheduleDetail) {
		fINPaymentScheduleDetail = newFINPaymentScheduleDetail;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentScheduleDetailListType ";
	}
}
