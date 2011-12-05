package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADSelectorColumnListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADSelectorColumnListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADSelectorColumnType> aDSelectorColumn = new ArrayList<ADSelectorColumnType>();

	/**
	 * Returns the value of '<em><b>aDSelectorColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelectorColumn</b></em>' feature
	 * @generated
	 */
	public List<ADSelectorColumnType> getADSelectorColumn() {
		return aDSelectorColumn;
	}

	/**
	 * Adds to the <em>aDSelectorColumn</em> feature.
	 * @generated
	 */
	public void addToADSelectorColumn(ADSelectorColumnType aDSelectorColumnValue) {
		if (!aDSelectorColumn.contains(aDSelectorColumnValue)) {

			aDSelectorColumn.add(aDSelectorColumnValue);
		}

	}

	/**			
	 * Removes from the <em>aDSelectorColumn</em> feature.
	 * @generated
	 */
	public void removeFromADSelectorColumn(
			ADSelectorColumnType aDSelectorColumnValue) {
		if (aDSelectorColumn.contains(aDSelectorColumnValue)) {
			aDSelectorColumn.remove(aDSelectorColumnValue);
		}
	}

	/**			
	 * Clears the <em>aDSelectorColumn</em> feature.
	 * @generated
	 */
	public void clearADSelectorColumn() {
		while (!aDSelectorColumn.isEmpty()) {
			removeFromADSelectorColumn(aDSelectorColumn.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADSelectorColumnListType#getADSelectorColumn() <em>aDSelectorColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSelectorColumnListType#getADSelectorColumn() aDSelectorColumn}' feature.
	 * @generated
	 */
	public void setADSelectorColumn(
			List<ADSelectorColumnType> newADSelectorColumn) {
		aDSelectorColumn = newADSelectorColumn;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADSelectorColumnListType ";
	}
}
