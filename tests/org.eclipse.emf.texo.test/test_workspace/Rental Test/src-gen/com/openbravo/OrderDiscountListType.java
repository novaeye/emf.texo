package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrderDiscountListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrderDiscountListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrderDiscountType> orderDiscount = new ArrayList<OrderDiscountType>();

	/**
	 * Returns the value of '<em><b>orderDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDiscount</b></em>' feature
	 * @generated
	 */
	public List<OrderDiscountType> getOrderDiscount() {
		return orderDiscount;
	}

	/**
	 * Adds to the <em>orderDiscount</em> feature.
	 * @generated
	 */
	public void addToOrderDiscount(OrderDiscountType orderDiscountValue) {
		if (!orderDiscount.contains(orderDiscountValue)) {

			orderDiscount.add(orderDiscountValue);
		}

	}

	/**			
	 * Removes from the <em>orderDiscount</em> feature.
	 * @generated
	 */
	public void removeFromOrderDiscount(OrderDiscountType orderDiscountValue) {
		if (orderDiscount.contains(orderDiscountValue)) {
			orderDiscount.remove(orderDiscountValue);
		}
	}

	/**			
	 * Clears the <em>orderDiscount</em> feature.
	 * @generated
	 */
	public void clearOrderDiscount() {
		while (!orderDiscount.isEmpty()) {
			removeFromOrderDiscount(orderDiscount.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrderDiscountListType#getOrderDiscount() <em>orderDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderDiscountListType#getOrderDiscount() orderDiscount}' feature.
	 * @generated
	 */
	public void setOrderDiscount(List<OrderDiscountType> newOrderDiscount) {
		orderDiscount = newOrderDiscount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrderDiscountListType ";
	}
}
