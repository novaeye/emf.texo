package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceLineOfferListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceLineOfferListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceLineOfferType> invoiceLineOffer = new ArrayList<InvoiceLineOfferType>();

	/**
	 * Returns the value of '<em><b>invoiceLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineOffer</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineOfferType> getInvoiceLineOffer() {
		return invoiceLineOffer;
	}

	/**
	 * Adds to the <em>invoiceLineOffer</em> feature.
	 * @generated
	 */
	public void addToInvoiceLineOffer(InvoiceLineOfferType invoiceLineOfferValue) {
		if (!invoiceLineOffer.contains(invoiceLineOfferValue)) {

			invoiceLineOffer.add(invoiceLineOfferValue);
		}

	}

	/**			
	 * Removes from the <em>invoiceLineOffer</em> feature.
	 * @generated
	 */
	public void removeFromInvoiceLineOffer(
			InvoiceLineOfferType invoiceLineOfferValue) {
		if (invoiceLineOffer.contains(invoiceLineOfferValue)) {
			invoiceLineOffer.remove(invoiceLineOfferValue);
		}
	}

	/**			
	 * Clears the <em>invoiceLineOffer</em> feature.
	 * @generated
	 */
	public void clearInvoiceLineOffer() {
		while (!invoiceLineOffer.isEmpty()) {
			removeFromInvoiceLineOffer(invoiceLineOffer.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceLineOfferListType#getInvoiceLineOffer() <em>invoiceLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceLineOfferListType#getInvoiceLineOffer() invoiceLineOffer}' feature.
	 * @generated
	 */
	public void setInvoiceLineOffer(
			List<InvoiceLineOfferType> newInvoiceLineOffer) {
		invoiceLineOffer = newInvoiceLineOffer;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceLineOfferListType ";
	}
}
