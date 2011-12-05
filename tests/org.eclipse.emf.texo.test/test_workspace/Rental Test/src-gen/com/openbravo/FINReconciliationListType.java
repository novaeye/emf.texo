package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINReconciliationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINReconciliationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINReconciliationType> fINReconciliation = new ArrayList<FINReconciliationType>();

	/**
	 * Returns the value of '<em><b>fINReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliation</b></em>' feature
	 * @generated
	 */
	public List<FINReconciliationType> getFINReconciliation() {
		return fINReconciliation;
	}

	/**
	 * Adds to the <em>fINReconciliation</em> feature.
	 * @generated
	 */
	public void addToFINReconciliation(
			FINReconciliationType fINReconciliationValue) {
		if (!fINReconciliation.contains(fINReconciliationValue)) {

			fINReconciliation.add(fINReconciliationValue);
		}

	}

	/**			
	 * Removes from the <em>fINReconciliation</em> feature.
	 * @generated
	 */
	public void removeFromFINReconciliation(
			FINReconciliationType fINReconciliationValue) {
		if (fINReconciliation.contains(fINReconciliationValue)) {
			fINReconciliation.remove(fINReconciliationValue);
		}
	}

	/**			
	 * Clears the <em>fINReconciliation</em> feature.
	 * @generated
	 */
	public void clearFINReconciliation() {
		while (!fINReconciliation.isEmpty()) {
			removeFromFINReconciliation(fINReconciliation.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINReconciliationListType#getFINReconciliation() <em>fINReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINReconciliationListType#getFINReconciliation() fINReconciliation}' feature.
	 * @generated
	 */
	public void setFINReconciliation(
			List<FINReconciliationType> newFINReconciliation) {
		fINReconciliation = newFINReconciliation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINReconciliationListType ";
	}
}
