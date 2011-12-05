package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrderLineOfferListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrderLineOfferListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OrderLineOfferType> orderLineOffer = new ArrayList<OrderLineOfferType>();

	/**
	 * Returns the value of '<em><b>orderLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineOffer</b></em>' feature
	 * @generated
	 */
	public List<OrderLineOfferType> getOrderLineOffer() {
		return orderLineOffer;
	}

	/**
	 * Adds to the <em>orderLineOffer</em> feature.
	 * @generated
	 */
	public void addToOrderLineOffer(OrderLineOfferType orderLineOfferValue) {
		if (!orderLineOffer.contains(orderLineOfferValue)) {

			orderLineOffer.add(orderLineOfferValue);
		}

	}

	/**			
	 * Removes from the <em>orderLineOffer</em> feature.
	 * @generated
	 */
	public void removeFromOrderLineOffer(OrderLineOfferType orderLineOfferValue) {
		if (orderLineOffer.contains(orderLineOfferValue)) {
			orderLineOffer.remove(orderLineOfferValue);
		}
	}

	/**			
	 * Clears the <em>orderLineOffer</em> feature.
	 * @generated
	 */
	public void clearOrderLineOffer() {
		while (!orderLineOffer.isEmpty()) {
			removeFromOrderLineOffer(orderLineOffer.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OrderLineOfferListType#getOrderLineOffer() <em>orderLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderLineOfferListType#getOrderLineOffer() orderLineOffer}' feature.
	 * @generated
	 */
	public void setOrderLineOffer(List<OrderLineOfferType> newOrderLineOffer) {
		orderLineOffer = newOrderLineOffer;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OrderLineOfferListType ";
	}
}
