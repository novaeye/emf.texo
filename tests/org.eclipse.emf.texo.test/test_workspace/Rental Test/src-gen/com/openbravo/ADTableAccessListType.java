package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTableAccessListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTableAccessListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADTableAccessType> aDTableAccess = new ArrayList<ADTableAccessType>();

	/**
	 * Returns the value of '<em><b>aDTableAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTableAccess</b></em>' feature
	 * @generated
	 */
	public List<ADTableAccessType> getADTableAccess() {
		return aDTableAccess;
	}

	/**
	 * Adds to the <em>aDTableAccess</em> feature.
	 * @generated
	 */
	public void addToADTableAccess(ADTableAccessType aDTableAccessValue) {
		if (!aDTableAccess.contains(aDTableAccessValue)) {

			aDTableAccess.add(aDTableAccessValue);
		}

	}

	/**			
	 * Removes from the <em>aDTableAccess</em> feature.
	 * @generated
	 */
	public void removeFromADTableAccess(ADTableAccessType aDTableAccessValue) {
		if (aDTableAccess.contains(aDTableAccessValue)) {
			aDTableAccess.remove(aDTableAccessValue);
		}
	}

	/**			
	 * Clears the <em>aDTableAccess</em> feature.
	 * @generated
	 */
	public void clearADTableAccess() {
		while (!aDTableAccess.isEmpty()) {
			removeFromADTableAccess(aDTableAccess.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADTableAccessListType#getADTableAccess() <em>aDTableAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableAccessListType#getADTableAccess() aDTableAccess}' feature.
	 * @generated
	 */
	public void setADTableAccess(List<ADTableAccessType> newADTableAccess) {
		aDTableAccess = newADTableAccess;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADTableAccessListType ";
	}
}
