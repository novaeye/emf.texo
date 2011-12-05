package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>APRMFinaccTrxFullAcctVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class APRMFinaccTrxFullAcctVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<APRMFinaccTrxFullAcctVType> aPRMFinaccTrxFullAcctV = new ArrayList<APRMFinaccTrxFullAcctVType>();

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctV</b></em>' feature
	 * @generated
	 */
	public List<APRMFinaccTrxFullAcctVType> getAPRMFinaccTrxFullAcctV() {
		return aPRMFinaccTrxFullAcctV;
	}

	/**
	 * Adds to the <em>aPRMFinaccTrxFullAcctV</em> feature.
	 * @generated
	 */
	public void addToAPRMFinaccTrxFullAcctV(
			APRMFinaccTrxFullAcctVType aPRMFinaccTrxFullAcctVValue) {
		if (!aPRMFinaccTrxFullAcctV.contains(aPRMFinaccTrxFullAcctVValue)) {

			aPRMFinaccTrxFullAcctV.add(aPRMFinaccTrxFullAcctVValue);
		}

	}

	/**			
	 * Removes from the <em>aPRMFinaccTrxFullAcctV</em> feature.
	 * @generated
	 */
	public void removeFromAPRMFinaccTrxFullAcctV(
			APRMFinaccTrxFullAcctVType aPRMFinaccTrxFullAcctVValue) {
		if (aPRMFinaccTrxFullAcctV.contains(aPRMFinaccTrxFullAcctVValue)) {
			aPRMFinaccTrxFullAcctV.remove(aPRMFinaccTrxFullAcctVValue);
		}
	}

	/**			
	 * Clears the <em>aPRMFinaccTrxFullAcctV</em> feature.
	 * @generated
	 */
	public void clearAPRMFinaccTrxFullAcctV() {
		while (!aPRMFinaccTrxFullAcctV.isEmpty()) {
			removeFromAPRMFinaccTrxFullAcctV(aPRMFinaccTrxFullAcctV.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVListType#getAPRMFinaccTrxFullAcctV() <em>aPRMFinaccTrxFullAcctV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVListType#getAPRMFinaccTrxFullAcctV() aPRMFinaccTrxFullAcctV}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctV(
			List<APRMFinaccTrxFullAcctVType> newAPRMFinaccTrxFullAcctV) {
		aPRMFinaccTrxFullAcctV = newAPRMFinaccTrxFullAcctV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "APRMFinaccTrxFullAcctVListType ";
	}
}
