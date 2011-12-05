package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADReferencedTableListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADReferencedTableListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADReferencedTableType> aDReferencedTable = new ArrayList<ADReferencedTableType>();

	/**
	 * Returns the value of '<em><b>aDReferencedTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferencedTable</b></em>' feature
	 * @generated
	 */
	public List<ADReferencedTableType> getADReferencedTable() {
		return aDReferencedTable;
	}

	/**
	 * Adds to the <em>aDReferencedTable</em> feature.
	 * @generated
	 */
	public void addToADReferencedTable(
			ADReferencedTableType aDReferencedTableValue) {
		if (!aDReferencedTable.contains(aDReferencedTableValue)) {

			aDReferencedTable.add(aDReferencedTableValue);
		}

	}

	/**			
	 * Removes from the <em>aDReferencedTable</em> feature.
	 * @generated
	 */
	public void removeFromADReferencedTable(
			ADReferencedTableType aDReferencedTableValue) {
		if (aDReferencedTable.contains(aDReferencedTableValue)) {
			aDReferencedTable.remove(aDReferencedTableValue);
		}
	}

	/**			
	 * Clears the <em>aDReferencedTable</em> feature.
	 * @generated
	 */
	public void clearADReferencedTable() {
		while (!aDReferencedTable.isEmpty()) {
			removeFromADReferencedTable(aDReferencedTable.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADReferencedTableListType#getADReferencedTable() <em>aDReferencedTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferencedTableListType#getADReferencedTable() aDReferencedTable}' feature.
	 * @generated
	 */
	public void setADReferencedTable(
			List<ADReferencedTableType> newADReferencedTable) {
		aDReferencedTable = newADReferencedTable;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADReferencedTableListType ";
	}
}
