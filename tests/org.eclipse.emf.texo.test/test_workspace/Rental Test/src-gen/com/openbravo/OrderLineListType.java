package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrderLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrderLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrderLineType> orderLine = new ArrayList<OrderLineType>();

	/**
	 * Returns the value of '<em><b>orderLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLine</b></em>' feature
	 * @generated
	 */
	public List<OrderLineType> getOrderLine() {
		return orderLine;
	}

	/**
	 * Adds to the <em>orderLine</em> feature.
	 * @generated
	 */
	public void addToOrderLine(OrderLineType orderLineValue) {
		if (!orderLine.contains(orderLineValue)) {

			orderLine.add(orderLineValue);
		}

	}

	/**			
	 * Removes from the <em>orderLine</em> feature.
	 * @generated
	 */
	public void removeFromOrderLine(OrderLineType orderLineValue) {
		if (orderLine.contains(orderLineValue)) {
			orderLine.remove(orderLineValue);
		}
	}

	/**			
	 * Clears the <em>orderLine</em> feature.
	 * @generated
	 */
	public void clearOrderLine() {
		while (!orderLine.isEmpty()) {
			removeFromOrderLine(orderLine.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrderLineListType#getOrderLine() <em>orderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderLineListType#getOrderLine() orderLine}' feature.
	 * @generated
	 */
	public void setOrderLine(List<OrderLineType> newOrderLine) {
		orderLine = newOrderLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrderLineListType ";
	}
}
