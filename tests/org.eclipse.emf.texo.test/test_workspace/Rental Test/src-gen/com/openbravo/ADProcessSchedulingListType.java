package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessSchedulingListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessSchedulingListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADProcessSchedulingType> aDProcessScheduling = new ArrayList<ADProcessSchedulingType>();

	/**
	 * Returns the value of '<em><b>aDProcessScheduling</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessScheduling</b></em>' feature
	 * @generated
	 */
	public List<ADProcessSchedulingType> getADProcessScheduling() {
		return aDProcessScheduling;
	}

	/**
	 * Adds to the <em>aDProcessScheduling</em> feature.
	 * @generated
	 */
	public void addToADProcessScheduling(
			ADProcessSchedulingType aDProcessSchedulingValue) {
		if (!aDProcessScheduling.contains(aDProcessSchedulingValue)) {

			aDProcessScheduling.add(aDProcessSchedulingValue);
		}

	}

	/**			
	 * Removes from the <em>aDProcessScheduling</em> feature.
	 * @generated
	 */
	public void removeFromADProcessScheduling(
			ADProcessSchedulingType aDProcessSchedulingValue) {
		if (aDProcessScheduling.contains(aDProcessSchedulingValue)) {
			aDProcessScheduling.remove(aDProcessSchedulingValue);
		}
	}

	/**			
	 * Clears the <em>aDProcessScheduling</em> feature.
	 * @generated
	 */
	public void clearADProcessScheduling() {
		while (!aDProcessScheduling.isEmpty()) {
			removeFromADProcessScheduling(aDProcessScheduling.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADProcessSchedulingListType#getADProcessScheduling() <em>aDProcessScheduling</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessSchedulingListType#getADProcessScheduling() aDProcessScheduling}' feature.
	 * @generated
	 */
	public void setADProcessScheduling(
			List<ADProcessSchedulingType> newADProcessScheduling) {
		aDProcessScheduling = newADProcessScheduling;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADProcessSchedulingListType ";
	}
}
