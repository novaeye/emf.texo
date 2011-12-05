package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentScheduleListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentScheduleListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINPaymentScheduleType> fINPaymentSchedule = new ArrayList<FINPaymentScheduleType>();

	/**
	 * Returns the value of '<em><b>fINPaymentSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedule</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentScheduleType> getFINPaymentSchedule() {
		return fINPaymentSchedule;
	}

	/**
	 * Adds to the <em>fINPaymentSchedule</em> feature.
	 * @generated
	 */
	public void addToFINPaymentSchedule(
			FINPaymentScheduleType fINPaymentScheduleValue) {
		if (!fINPaymentSchedule.contains(fINPaymentScheduleValue)) {

			fINPaymentSchedule.add(fINPaymentScheduleValue);
		}

	}

	/**			
	 * Removes from the <em>fINPaymentSchedule</em> feature.
	 * @generated
	 */
	public void removeFromFINPaymentSchedule(
			FINPaymentScheduleType fINPaymentScheduleValue) {
		if (fINPaymentSchedule.contains(fINPaymentScheduleValue)) {
			fINPaymentSchedule.remove(fINPaymentScheduleValue);
		}
	}

	/**			
	 * Clears the <em>fINPaymentSchedule</em> feature.
	 * @generated
	 */
	public void clearFINPaymentSchedule() {
		while (!fINPaymentSchedule.isEmpty()) {
			removeFromFINPaymentSchedule(fINPaymentSchedule.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINPaymentScheduleListType#getFINPaymentSchedule() <em>fINPaymentSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentScheduleListType#getFINPaymentSchedule() fINPaymentSchedule}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedule(
			List<FINPaymentScheduleType> newFINPaymentSchedule) {
		fINPaymentSchedule = newFINPaymentSchedule;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINPaymentScheduleListType ";
	}
}
