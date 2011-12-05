package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>APRMFinaccTransactionVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class APRMFinaccTransactionVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<APRMFinaccTransactionVType> aPRMFinaccTransactionV = new ArrayList<APRMFinaccTransactionVType>();

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionV</b></em>' feature
	 * @generated
	 */
	public List<APRMFinaccTransactionVType> getAPRMFinaccTransactionV() {
		return aPRMFinaccTransactionV;
	}

	/**
	 * Adds to the <em>aPRMFinaccTransactionV</em> feature.
	 * @generated
	 */
	public void addToAPRMFinaccTransactionV(
			APRMFinaccTransactionVType aPRMFinaccTransactionVValue) {
		if (!aPRMFinaccTransactionV.contains(aPRMFinaccTransactionVValue)) {

			aPRMFinaccTransactionV.add(aPRMFinaccTransactionVValue);
		}

	}

	/**			
	 * Removes from the <em>aPRMFinaccTransactionV</em> feature.
	 * @generated
	 */
	public void removeFromAPRMFinaccTransactionV(
			APRMFinaccTransactionVType aPRMFinaccTransactionVValue) {
		if (aPRMFinaccTransactionV.contains(aPRMFinaccTransactionVValue)) {
			aPRMFinaccTransactionV.remove(aPRMFinaccTransactionVValue);
		}
	}

	/**			
	 * Clears the <em>aPRMFinaccTransactionV</em> feature.
	 * @generated
	 */
	public void clearAPRMFinaccTransactionV() {
		while (!aPRMFinaccTransactionV.isEmpty()) {
			removeFromAPRMFinaccTransactionV(aPRMFinaccTransactionV.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link APRMFinaccTransactionVListType#getAPRMFinaccTransactionV() <em>aPRMFinaccTransactionV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTransactionVListType#getAPRMFinaccTransactionV() aPRMFinaccTransactionV}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionV(
			List<APRMFinaccTransactionVType> newAPRMFinaccTransactionV) {
		aPRMFinaccTransactionV = newAPRMFinaccTransactionV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "APRMFinaccTransactionVListType ";
	}
}
