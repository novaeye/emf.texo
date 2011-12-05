package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADColumnListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADColumnListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADColumnType> aDColumn = new ArrayList<ADColumnType>();

	/**
	 * Returns the value of '<em><b>aDColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumn</b></em>' feature
	 * @generated
	 */
	public List<ADColumnType> getADColumn() {
		return aDColumn;
	}

	/**
	 * Adds to the <em>aDColumn</em> feature.
	 * @generated
	 */
	public void addToADColumn(ADColumnType aDColumnValue) {
		if (!aDColumn.contains(aDColumnValue)) {

			aDColumn.add(aDColumnValue);
		}

	}

	/**			
	 * Removes from the <em>aDColumn</em> feature.
	 * @generated
	 */
	public void removeFromADColumn(ADColumnType aDColumnValue) {
		if (aDColumn.contains(aDColumnValue)) {
			aDColumn.remove(aDColumnValue);
		}
	}

	/**			
	 * Clears the <em>aDColumn</em> feature.
	 * @generated
	 */
	public void clearADColumn() {
		while (!aDColumn.isEmpty()) {
			removeFromADColumn(aDColumn.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADColumnListType#getADColumn() <em>aDColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADColumnListType#getADColumn() aDColumn}' feature.
	 * @generated
	 */
	public void setADColumn(List<ADColumnType> newADColumn) {
		aDColumn = newADColumn;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADColumnListType ";
	}
}
