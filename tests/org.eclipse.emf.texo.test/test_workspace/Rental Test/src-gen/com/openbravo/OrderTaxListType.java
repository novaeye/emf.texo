package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrderTaxListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrderTaxListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrderTaxType> orderTax = new ArrayList<OrderTaxType>();

	/**
	 * Returns the value of '<em><b>orderTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderTax</b></em>' feature
	 * @generated
	 */
	public List<OrderTaxType> getOrderTax() {
		return orderTax;
	}

	/**
	 * Adds to the <em>orderTax</em> feature.
	 * @generated
	 */
	public void addToOrderTax(OrderTaxType orderTaxValue) {
		if (!orderTax.contains(orderTaxValue)) {

			orderTax.add(orderTaxValue);
		}

	}

	/**			
	 * Removes from the <em>orderTax</em> feature.
	 * @generated
	 */
	public void removeFromOrderTax(OrderTaxType orderTaxValue) {
		if (orderTax.contains(orderTaxValue)) {
			orderTax.remove(orderTaxValue);
		}
	}

	/**			
	 * Clears the <em>orderTax</em> feature.
	 * @generated
	 */
	public void clearOrderTax() {
		while (!orderTax.isEmpty()) {
			removeFromOrderTax(orderTax.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrderTaxListType#getOrderTax() <em>orderTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderTaxListType#getOrderTax() orderTax}' feature.
	 * @generated
	 */
	public void setOrderTax(List<OrderTaxType> newOrderTax) {
		orderTax = newOrderTax;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrderTaxListType ";
	}
}
