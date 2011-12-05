package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProcurementRequisitionLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProcurementRequisitionLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProcurementRequisitionLineType> procurementRequisitionLine = new ArrayList<ProcurementRequisitionLineType>();

	/**
	 * Returns the value of '<em><b>procurementRequisitionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLine</b></em>' feature
	 * @generated
	 */
	public List<ProcurementRequisitionLineType> getProcurementRequisitionLine() {
		return procurementRequisitionLine;
	}

	/**
	 * Adds to the <em>procurementRequisitionLine</em> feature.
	 * @generated
	 */
	public void addToProcurementRequisitionLine(
			ProcurementRequisitionLineType procurementRequisitionLineValue) {
		if (!procurementRequisitionLine
				.contains(procurementRequisitionLineValue)) {

			procurementRequisitionLine.add(procurementRequisitionLineValue);
		}

	}

	/**			
	 * Removes from the <em>procurementRequisitionLine</em> feature.
	 * @generated
	 */
	public void removeFromProcurementRequisitionLine(
			ProcurementRequisitionLineType procurementRequisitionLineValue) {
		if (procurementRequisitionLine
				.contains(procurementRequisitionLineValue)) {
			procurementRequisitionLine.remove(procurementRequisitionLineValue);
		}
	}

	/**			
	 * Clears the <em>procurementRequisitionLine</em> feature.
	 * @generated
	 */
	public void clearProcurementRequisitionLine() {
		while (!procurementRequisitionLine.isEmpty()) {
			removeFromProcurementRequisitionLine(procurementRequisitionLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineListType#getProcurementRequisitionLine() <em>procurementRequisitionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineListType#getProcurementRequisitionLine() procurementRequisitionLine}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLine(
			List<ProcurementRequisitionLineType> newProcurementRequisitionLine) {
		procurementRequisitionLine = newProcurementRequisitionLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProcurementRequisitionLineListType ";
	}
}
