package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessAccessListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessAccessListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADProcessAccessType> aDProcessAccess = new ArrayList<ADProcessAccessType>();

	/**
	 * Returns the value of '<em><b>aDProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessAccess</b></em>' feature
	 * @generated
	 */
	public List<ADProcessAccessType> getADProcessAccess() {
		return aDProcessAccess;
	}

	/**
	 * Adds to the <em>aDProcessAccess</em> feature.
	 * @generated
	 */
	public void addToADProcessAccess(ADProcessAccessType aDProcessAccessValue) {
		if (!aDProcessAccess.contains(aDProcessAccessValue)) {

			aDProcessAccess.add(aDProcessAccessValue);
		}

	}

	/**			
	 * Removes from the <em>aDProcessAccess</em> feature.
	 * @generated
	 */
	public void removeFromADProcessAccess(
			ADProcessAccessType aDProcessAccessValue) {
		if (aDProcessAccess.contains(aDProcessAccessValue)) {
			aDProcessAccess.remove(aDProcessAccessValue);
		}
	}

	/**			
	 * Clears the <em>aDProcessAccess</em> feature.
	 * @generated
	 */
	public void clearADProcessAccess() {
		while (!aDProcessAccess.isEmpty()) {
			removeFromADProcessAccess(aDProcessAccess.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADProcessAccessListType1#getADProcessAccess() <em>aDProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessAccessListType1#getADProcessAccess() aDProcessAccess}' feature.
	 * @generated
	 */
	public void setADProcessAccess(List<ADProcessAccessType> newADProcessAccess) {
		aDProcessAccess = newADProcessAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADProcessAccessListType1 ";
	}
}
