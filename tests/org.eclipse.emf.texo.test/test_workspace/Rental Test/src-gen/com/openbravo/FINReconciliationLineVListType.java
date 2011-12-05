package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINReconciliationLineVListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINReconciliationLineVListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINReconciliationLineVType> fINReconciliationLineV = new ArrayList<FINReconciliationLineVType>();

	/**
	 * Returns the value of '<em><b>fINReconciliationLineV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineV</b></em>' feature
	 * @generated
	 */
	public List<FINReconciliationLineVType> getFINReconciliationLineV() {
		return fINReconciliationLineV;
	}

	/**
	 * Adds to the <em>fINReconciliationLineV</em> feature.
	 * @generated
	 */
	public void addToFINReconciliationLineV(
			FINReconciliationLineVType fINReconciliationLineVValue) {
		if (!fINReconciliationLineV.contains(fINReconciliationLineVValue)) {

			fINReconciliationLineV.add(fINReconciliationLineVValue);
		}

	}

	/**			
	 * Removes from the <em>fINReconciliationLineV</em> feature.
	 * @generated
	 */
	public void removeFromFINReconciliationLineV(
			FINReconciliationLineVType fINReconciliationLineVValue) {
		if (fINReconciliationLineV.contains(fINReconciliationLineVValue)) {
			fINReconciliationLineV.remove(fINReconciliationLineVValue);
		}
	}

	/**			
	 * Clears the <em>fINReconciliationLineV</em> feature.
	 * @generated
	 */
	public void clearFINReconciliationLineV() {
		while (!fINReconciliationLineV.isEmpty()) {
			removeFromFINReconciliationLineV(fINReconciliationLineV.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FINReconciliationLineVListType#getFINReconciliationLineV() <em>fINReconciliationLineV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINReconciliationLineVListType#getFINReconciliationLineV() fINReconciliationLineV}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineV(
			List<FINReconciliationLineVType> newFINReconciliationLineV) {
		fINReconciliationLineV = newFINReconciliationLineV;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINReconciliationLineVListType ";
	}
}
