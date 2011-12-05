package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProcurementRequisitionPOMatchListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProcurementRequisitionPOMatchListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProcurementRequisitionPOMatchType> procurementRequisitionPOMatch = new ArrayList<ProcurementRequisitionPOMatchType>();

	/**
	 * Returns the value of '<em><b>procurementRequisitionPOMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionPOMatch</b></em>' feature
	 * @generated
	 */
	public List<ProcurementRequisitionPOMatchType> getProcurementRequisitionPOMatch() {
		return procurementRequisitionPOMatch;
	}

	/**
	 * Adds to the <em>procurementRequisitionPOMatch</em> feature.
	 * @generated
	 */
	public void addToProcurementRequisitionPOMatch(
			ProcurementRequisitionPOMatchType procurementRequisitionPOMatchValue) {
		if (!procurementRequisitionPOMatch
				.contains(procurementRequisitionPOMatchValue)) {

			procurementRequisitionPOMatch
					.add(procurementRequisitionPOMatchValue);
		}

	}

	/**			
	 * Removes from the <em>procurementRequisitionPOMatch</em> feature.
	 * @generated
	 */
	public void removeFromProcurementRequisitionPOMatch(
			ProcurementRequisitionPOMatchType procurementRequisitionPOMatchValue) {
		if (procurementRequisitionPOMatch
				.contains(procurementRequisitionPOMatchValue)) {
			procurementRequisitionPOMatch
					.remove(procurementRequisitionPOMatchValue);
		}
	}

	/**			
	 * Clears the <em>procurementRequisitionPOMatch</em> feature.
	 * @generated
	 */
	public void clearProcurementRequisitionPOMatch() {
		while (!procurementRequisitionPOMatch.isEmpty()) {
			removeFromProcurementRequisitionPOMatch(procurementRequisitionPOMatch
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProcurementRequisitionPOMatchListType#getProcurementRequisitionPOMatch() <em>procurementRequisitionPOMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionPOMatchListType#getProcurementRequisitionPOMatch() procurementRequisitionPOMatch}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionPOMatch(
			List<ProcurementRequisitionPOMatchType> newProcurementRequisitionPOMatch) {
		procurementRequisitionPOMatch = newProcurementRequisitionPOMatch;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProcurementRequisitionPOMatchListType ";
	}
}
