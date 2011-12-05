package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>SalesCommissionDetailListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class SalesCommissionDetailListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<SalesCommissionDetailType> salesCommissionDetail = new ArrayList<SalesCommissionDetailType>();

	/**
	 * Returns the value of '<em><b>salesCommissionDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionDetail</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionDetailType> getSalesCommissionDetail() {
		return salesCommissionDetail;
	}

	/**
	 * Adds to the <em>salesCommissionDetail</em> feature.
	 * @generated
	 */
	public void addToSalesCommissionDetail(
			SalesCommissionDetailType salesCommissionDetailValue) {
		if (!salesCommissionDetail.contains(salesCommissionDetailValue)) {

			salesCommissionDetail.add(salesCommissionDetailValue);
		}

	}

	/**			
	 * Removes from the <em>salesCommissionDetail</em> feature.
	 * @generated
	 */
	public void removeFromSalesCommissionDetail(
			SalesCommissionDetailType salesCommissionDetailValue) {
		if (salesCommissionDetail.contains(salesCommissionDetailValue)) {
			salesCommissionDetail.remove(salesCommissionDetailValue);
		}
	}

	/**			
	 * Clears the <em>salesCommissionDetail</em> feature.
	 * @generated
	 */
	public void clearSalesCommissionDetail() {
		while (!salesCommissionDetail.isEmpty()) {
			removeFromSalesCommissionDetail(salesCommissionDetail.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link SalesCommissionDetailListType#getSalesCommissionDetail() <em>salesCommissionDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link SalesCommissionDetailListType#getSalesCommissionDetail() salesCommissionDetail}' feature.
	 * @generated
	 */
	public void setSalesCommissionDetail(
			List<SalesCommissionDetailType> newSalesCommissionDetail) {
		salesCommissionDetail = newSalesCommissionDetail;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "SalesCommissionDetailListType ";
	}
}
