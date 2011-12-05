package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADWindowAccessListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADWindowAccessListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADWindowAccessType> aDWindowAccess = new ArrayList<ADWindowAccessType>();

	/**
	 * Returns the value of '<em><b>aDWindowAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowAccess</b></em>' feature
	 * @generated
	 */
	public List<ADWindowAccessType> getADWindowAccess() {
		return aDWindowAccess;
	}

	/**
	 * Adds to the <em>aDWindowAccess</em> feature.
	 * @generated
	 */
	public void addToADWindowAccess(ADWindowAccessType aDWindowAccessValue) {
		if (!aDWindowAccess.contains(aDWindowAccessValue)) {

			aDWindowAccess.add(aDWindowAccessValue);
		}

	}

	/**			
	 * Removes from the <em>aDWindowAccess</em> feature.
	 * @generated
	 */
	public void removeFromADWindowAccess(ADWindowAccessType aDWindowAccessValue) {
		if (aDWindowAccess.contains(aDWindowAccessValue)) {
			aDWindowAccess.remove(aDWindowAccessValue);
		}
	}

	/**			
	 * Clears the <em>aDWindowAccess</em> feature.
	 * @generated
	 */
	public void clearADWindowAccess() {
		while (!aDWindowAccess.isEmpty()) {
			removeFromADWindowAccess(aDWindowAccess.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADWindowAccessListType#getADWindowAccess() <em>aDWindowAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADWindowAccessListType#getADWindowAccess() aDWindowAccess}' feature.
	 * @generated
	 */
	public void setADWindowAccess(List<ADWindowAccessType> newADWindowAccess) {
		aDWindowAccess = newADWindowAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADWindowAccessListType ";
	}
}
