package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADFormAccessListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADFormAccessListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADFormAccessType> aDFormAccess = new ArrayList<ADFormAccessType>();

	/**
	 * Returns the value of '<em><b>aDFormAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormAccess</b></em>' feature
	 * @generated
	 */
	public List<ADFormAccessType> getADFormAccess() {
		return aDFormAccess;
	}

	/**
	 * Adds to the <em>aDFormAccess</em> feature.
	 * @generated
	 */
	public void addToADFormAccess(ADFormAccessType aDFormAccessValue) {
		if (!aDFormAccess.contains(aDFormAccessValue)) {

			aDFormAccess.add(aDFormAccessValue);
		}

	}

	/**			
	 * Removes from the <em>aDFormAccess</em> feature.
	 * @generated
	 */
	public void removeFromADFormAccess(ADFormAccessType aDFormAccessValue) {
		if (aDFormAccess.contains(aDFormAccessValue)) {
			aDFormAccess.remove(aDFormAccessValue);
		}
	}

	/**			
	 * Clears the <em>aDFormAccess</em> feature.
	 * @generated
	 */
	public void clearADFormAccess() {
		while (!aDFormAccess.isEmpty()) {
			removeFromADFormAccess(aDFormAccess.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADFormAccessListType1#getADFormAccess() <em>aDFormAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADFormAccessListType1#getADFormAccess() aDFormAccess}' feature.
	 * @generated
	 */
	public void setADFormAccess(List<ADFormAccessType> newADFormAccess) {
		aDFormAccess = newADFormAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADFormAccessListType1 ";
	}
}
