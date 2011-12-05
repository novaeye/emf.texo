package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrderLineTaxListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrderLineTaxListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrderLineTaxType> orderLineTax = new ArrayList<OrderLineTaxType>();

	/**
	 * Returns the value of '<em><b>orderLineTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineTax</b></em>' feature
	 * @generated
	 */
	public List<OrderLineTaxType> getOrderLineTax() {
		return orderLineTax;
	}

	/**
	 * Adds to the <em>orderLineTax</em> feature.
	 * @generated
	 */
	public void addToOrderLineTax(OrderLineTaxType orderLineTaxValue) {
		if (!orderLineTax.contains(orderLineTaxValue)) {

			orderLineTax.add(orderLineTaxValue);
		}

	}

	/**			
	 * Removes from the <em>orderLineTax</em> feature.
	 * @generated
	 */
	public void removeFromOrderLineTax(OrderLineTaxType orderLineTaxValue) {
		if (orderLineTax.contains(orderLineTaxValue)) {
			orderLineTax.remove(orderLineTaxValue);
		}
	}

	/**			
	 * Clears the <em>orderLineTax</em> feature.
	 * @generated
	 */
	public void clearOrderLineTax() {
		while (!orderLineTax.isEmpty()) {
			removeFromOrderLineTax(orderLineTax.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrderLineTaxListType#getOrderLineTax() <em>orderLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderLineTaxListType#getOrderLineTax() orderLineTax}' feature.
	 * @generated
	 */
	public void setOrderLineTax(List<OrderLineTaxType> newOrderLineTax) {
		orderLineTax = newOrderLineTax;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrderLineTaxListType ";
	}
}
