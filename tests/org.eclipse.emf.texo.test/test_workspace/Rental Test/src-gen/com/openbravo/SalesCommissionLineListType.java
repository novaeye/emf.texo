package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>SalesCommissionLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class SalesCommissionLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<SalesCommissionLineType> salesCommissionLine = new ArrayList<SalesCommissionLineType>();

	/**
	 * Returns the value of '<em><b>salesCommissionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionLine</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionLineType> getSalesCommissionLine() {
		return salesCommissionLine;
	}

	/**
	 * Adds to the <em>salesCommissionLine</em> feature.
	 * @generated
	 */
	public void addToSalesCommissionLine(
			SalesCommissionLineType salesCommissionLineValue) {
		if (!salesCommissionLine.contains(salesCommissionLineValue)) {

			salesCommissionLine.add(salesCommissionLineValue);
		}

	}

	/**			
	 * Removes from the <em>salesCommissionLine</em> feature.
	 * @generated
	 */
	public void removeFromSalesCommissionLine(
			SalesCommissionLineType salesCommissionLineValue) {
		if (salesCommissionLine.contains(salesCommissionLineValue)) {
			salesCommissionLine.remove(salesCommissionLineValue);
		}
	}

	/**			
	 * Clears the <em>salesCommissionLine</em> feature.
	 * @generated
	 */
	public void clearSalesCommissionLine() {
		while (!salesCommissionLine.isEmpty()) {
			removeFromSalesCommissionLine(salesCommissionLine.iterator().next());
		}
	}

	/**
	 * Sets the '{@link SalesCommissionLineListType#getSalesCommissionLine() <em>salesCommissionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link SalesCommissionLineListType#getSalesCommissionLine() salesCommissionLine}' feature.
	 * @generated
	 */
	public void setSalesCommissionLine(
			List<SalesCommissionLineType> newSalesCommissionLine) {
		salesCommissionLine = newSalesCommissionLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "SalesCommissionLineListType ";
	}
}
