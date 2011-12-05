package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>SalesCommissionAmountListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class SalesCommissionAmountListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<SalesCommissionAmountType> salesCommissionAmount = new ArrayList<SalesCommissionAmountType>();

	/**
	 * Returns the value of '<em><b>salesCommissionAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionAmount</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionAmountType> getSalesCommissionAmount() {
		return salesCommissionAmount;
	}

	/**
	 * Adds to the <em>salesCommissionAmount</em> feature.
	 * @generated
	 */
	public void addToSalesCommissionAmount(
			SalesCommissionAmountType salesCommissionAmountValue) {
		if (!salesCommissionAmount.contains(salesCommissionAmountValue)) {

			salesCommissionAmount.add(salesCommissionAmountValue);
		}

	}

	/**			
	 * Removes from the <em>salesCommissionAmount</em> feature.
	 * @generated
	 */
	public void removeFromSalesCommissionAmount(
			SalesCommissionAmountType salesCommissionAmountValue) {
		if (salesCommissionAmount.contains(salesCommissionAmountValue)) {
			salesCommissionAmount.remove(salesCommissionAmountValue);
		}
	}

	/**			
	 * Clears the <em>salesCommissionAmount</em> feature.
	 * @generated
	 */
	public void clearSalesCommissionAmount() {
		while (!salesCommissionAmount.isEmpty()) {
			removeFromSalesCommissionAmount(salesCommissionAmount.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link SalesCommissionAmountListType#getSalesCommissionAmount() <em>salesCommissionAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link SalesCommissionAmountListType#getSalesCommissionAmount() salesCommissionAmount}' feature.
	 * @generated
	 */
	public void setSalesCommissionAmount(
			List<SalesCommissionAmountType> newSalesCommissionAmount) {
		salesCommissionAmount = newSalesCommissionAmount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "SalesCommissionAmountListType ";
	}
}
