package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>APRMReconciliationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class APRMReconciliationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<APRMReconciliationType> aPRMReconciliation = new ArrayList<APRMReconciliationType>();

	/**
	 * Returns the value of '<em><b>aPRMReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconciliation</b></em>' feature
	 * @generated
	 */
	public List<APRMReconciliationType> getAPRMReconciliation() {
		return aPRMReconciliation;
	}

	/**
	 * Adds to the <em>aPRMReconciliation</em> feature.
	 * @generated
	 */
	public void addToAPRMReconciliation(
			APRMReconciliationType aPRMReconciliationValue) {
		if (!aPRMReconciliation.contains(aPRMReconciliationValue)) {

			aPRMReconciliation.add(aPRMReconciliationValue);
		}

	}

	/**			
	 * Removes from the <em>aPRMReconciliation</em> feature.
	 * @generated
	 */
	public void removeFromAPRMReconciliation(
			APRMReconciliationType aPRMReconciliationValue) {
		if (aPRMReconciliation.contains(aPRMReconciliationValue)) {
			aPRMReconciliation.remove(aPRMReconciliationValue);
		}
	}

	/**			
	 * Clears the <em>aPRMReconciliation</em> feature.
	 * @generated
	 */
	public void clearAPRMReconciliation() {
		while (!aPRMReconciliation.isEmpty()) {
			removeFromAPRMReconciliation(aPRMReconciliation.iterator().next());
		}
	}

	/**
	 * Sets the '{@link APRMReconciliationListType#getAPRMReconciliation() <em>aPRMReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationListType#getAPRMReconciliation() aPRMReconciliation}' feature.
	 * @generated
	 */
	public void setAPRMReconciliation(
			List<APRMReconciliationType> newAPRMReconciliation) {
		aPRMReconciliation = newAPRMReconciliation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "APRMReconciliationListType ";
	}
}
