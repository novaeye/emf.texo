package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>TimeAndExpenseSheetLineListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class TimeAndExpenseSheetLineListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<TimeAndExpenseSheetLineType> timeAndExpenseSheetLine = new ArrayList<TimeAndExpenseSheetLineType>();

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLine</b></em>' feature
	 * @generated
	 */
	public List<TimeAndExpenseSheetLineType> getTimeAndExpenseSheetLine() {
		return timeAndExpenseSheetLine;
	}

	/**
	 * Adds to the <em>timeAndExpenseSheetLine</em> feature.
	 * @generated
	 */
	public void addToTimeAndExpenseSheetLine(
			TimeAndExpenseSheetLineType timeAndExpenseSheetLineValue) {
		if (!timeAndExpenseSheetLine.contains(timeAndExpenseSheetLineValue)) {

			timeAndExpenseSheetLine.add(timeAndExpenseSheetLineValue);
		}

	}

	/**			
	 * Removes from the <em>timeAndExpenseSheetLine</em> feature.
	 * @generated
	 */
	public void removeFromTimeAndExpenseSheetLine(
			TimeAndExpenseSheetLineType timeAndExpenseSheetLineValue) {
		if (timeAndExpenseSheetLine.contains(timeAndExpenseSheetLineValue)) {
			timeAndExpenseSheetLine.remove(timeAndExpenseSheetLineValue);
		}
	}

	/**			
	 * Clears the <em>timeAndExpenseSheetLine</em> feature.
	 * @generated
	 */
	public void clearTimeAndExpenseSheetLine() {
		while (!timeAndExpenseSheetLine.isEmpty()) {
			removeFromTimeAndExpenseSheetLine(timeAndExpenseSheetLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineListType1#getTimeAndExpenseSheetLine() <em>timeAndExpenseSheetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineListType1#getTimeAndExpenseSheetLine() timeAndExpenseSheetLine}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLine(
			List<TimeAndExpenseSheetLineType> newTimeAndExpenseSheetLine) {
		timeAndExpenseSheetLine = newTimeAndExpenseSheetLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "TimeAndExpenseSheetLineListType1 ";
	}
}
