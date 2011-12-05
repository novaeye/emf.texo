package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADHeartbeatLogCustomQueryRowListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADHeartbeatLogCustomQueryRowListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADHeartbeatLogCustomQueryRowType> aDHeartbeatLogCustomQueryRow = new ArrayList<ADHeartbeatLogCustomQueryRowType>();

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQueryRow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQueryRow</b></em>' feature
	 * @generated
	 */
	public List<ADHeartbeatLogCustomQueryRowType> getADHeartbeatLogCustomQueryRow() {
		return aDHeartbeatLogCustomQueryRow;
	}

	/**
	 * Adds to the <em>aDHeartbeatLogCustomQueryRow</em> feature.
	 * @generated
	 */
	public void addToADHeartbeatLogCustomQueryRow(
			ADHeartbeatLogCustomQueryRowType aDHeartbeatLogCustomQueryRowValue) {
		if (!aDHeartbeatLogCustomQueryRow
				.contains(aDHeartbeatLogCustomQueryRowValue)) {

			aDHeartbeatLogCustomQueryRow.add(aDHeartbeatLogCustomQueryRowValue);
		}

	}

	/**			
	 * Removes from the <em>aDHeartbeatLogCustomQueryRow</em> feature.
	 * @generated
	 */
	public void removeFromADHeartbeatLogCustomQueryRow(
			ADHeartbeatLogCustomQueryRowType aDHeartbeatLogCustomQueryRowValue) {
		if (aDHeartbeatLogCustomQueryRow
				.contains(aDHeartbeatLogCustomQueryRowValue)) {
			aDHeartbeatLogCustomQueryRow
					.remove(aDHeartbeatLogCustomQueryRowValue);
		}
	}

	/**			
	 * Clears the <em>aDHeartbeatLogCustomQueryRow</em> feature.
	 * @generated
	 */
	public void clearADHeartbeatLogCustomQueryRow() {
		while (!aDHeartbeatLogCustomQueryRow.isEmpty()) {
			removeFromADHeartbeatLogCustomQueryRow(aDHeartbeatLogCustomQueryRow
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADHeartbeatLogCustomQueryRowListType#getADHeartbeatLogCustomQueryRow() <em>aDHeartbeatLogCustomQueryRow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogCustomQueryRowListType#getADHeartbeatLogCustomQueryRow() aDHeartbeatLogCustomQueryRow}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQueryRow(
			List<ADHeartbeatLogCustomQueryRowType> newADHeartbeatLogCustomQueryRow) {
		aDHeartbeatLogCustomQueryRow = newADHeartbeatLogCustomQueryRow;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADHeartbeatLogCustomQueryRowListType ";
	}
}
