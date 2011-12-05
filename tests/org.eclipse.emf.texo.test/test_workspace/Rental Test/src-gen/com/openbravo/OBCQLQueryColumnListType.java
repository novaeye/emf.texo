package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCQLQueryColumnListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCQLQueryColumnListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBCQLQueryColumnType> oBCQLQueryColumn = new ArrayList<OBCQLQueryColumnType>();

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumn</b></em>' feature
	 * @generated
	 */
	public List<OBCQLQueryColumnType> getOBCQLQueryColumn() {
		return oBCQLQueryColumn;
	}

	/**
	 * Adds to the <em>oBCQLQueryColumn</em> feature.
	 * @generated
	 */
	public void addToOBCQLQueryColumn(OBCQLQueryColumnType oBCQLQueryColumnValue) {
		if (!oBCQLQueryColumn.contains(oBCQLQueryColumnValue)) {

			oBCQLQueryColumn.add(oBCQLQueryColumnValue);
		}

	}

	/**			
	 * Removes from the <em>oBCQLQueryColumn</em> feature.
	 * @generated
	 */
	public void removeFromOBCQLQueryColumn(
			OBCQLQueryColumnType oBCQLQueryColumnValue) {
		if (oBCQLQueryColumn.contains(oBCQLQueryColumnValue)) {
			oBCQLQueryColumn.remove(oBCQLQueryColumnValue);
		}
	}

	/**			
	 * Clears the <em>oBCQLQueryColumn</em> feature.
	 * @generated
	 */
	public void clearOBCQLQueryColumn() {
		while (!oBCQLQueryColumn.isEmpty()) {
			removeFromOBCQLQueryColumn(oBCQLQueryColumn.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnListType#getOBCQLQueryColumn() <em>oBCQLQueryColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnListType#getOBCQLQueryColumn() oBCQLQueryColumn}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumn(
			List<OBCQLQueryColumnType> newOBCQLQueryColumn) {
		oBCQLQueryColumn = newOBCQLQueryColumn;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBCQLQueryColumnListType ";
	}
}
