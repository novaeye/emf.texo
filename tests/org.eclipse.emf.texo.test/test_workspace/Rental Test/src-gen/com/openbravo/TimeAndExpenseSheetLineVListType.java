package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>TimeAndExpenseSheetLineVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class TimeAndExpenseSheetLineVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<TimeAndExpenseSheetLineVType> timeAndExpenseSheetLineV = new ArrayList<TimeAndExpenseSheetLineVType>();

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineV</b></em>' feature
	 * @generated
	 */
	public List<TimeAndExpenseSheetLineVType> getTimeAndExpenseSheetLineV() {
		return timeAndExpenseSheetLineV;
	}

	/**
	 * Adds to the <em>timeAndExpenseSheetLineV</em> feature.
	 * @generated
	 */
	public void addToTimeAndExpenseSheetLineV(
			TimeAndExpenseSheetLineVType timeAndExpenseSheetLineVValue) {
		if (!timeAndExpenseSheetLineV.contains(timeAndExpenseSheetLineVValue)) {

			timeAndExpenseSheetLineV.add(timeAndExpenseSheetLineVValue);
		}

	}

	/**			
	 * Removes from the <em>timeAndExpenseSheetLineV</em> feature.
	 * @generated
	 */
	public void removeFromTimeAndExpenseSheetLineV(
			TimeAndExpenseSheetLineVType timeAndExpenseSheetLineVValue) {
		if (timeAndExpenseSheetLineV.contains(timeAndExpenseSheetLineVValue)) {
			timeAndExpenseSheetLineV.remove(timeAndExpenseSheetLineVValue);
		}
	}

	/**			
	 * Clears the <em>timeAndExpenseSheetLineV</em> feature.
	 * @generated
	 */
	public void clearTimeAndExpenseSheetLineV() {
		while (!timeAndExpenseSheetLineV.isEmpty()) {
			removeFromTimeAndExpenseSheetLineV(timeAndExpenseSheetLineV
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVListType#getTimeAndExpenseSheetLineV() <em>timeAndExpenseSheetLineV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVListType#getTimeAndExpenseSheetLineV() timeAndExpenseSheetLineV}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineV(
			List<TimeAndExpenseSheetLineVType> newTimeAndExpenseSheetLineV) {
		timeAndExpenseSheetLineV = newTimeAndExpenseSheetLineV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "TimeAndExpenseSheetLineVListType ";
	}
}
