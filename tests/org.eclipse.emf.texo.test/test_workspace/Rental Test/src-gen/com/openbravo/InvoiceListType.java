package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceType> invoice = new ArrayList<InvoiceType>();

	/**
	 * Returns the value of '<em><b>invoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoice</b></em>' feature
	 * @generated
	 */
	public List<InvoiceType> getInvoice() {
		return invoice;
	}

	/**
	 * Adds to the <em>invoice</em> feature.
	 * @generated
	 */
	public void addToInvoice(InvoiceType invoiceValue) {
		if (!invoice.contains(invoiceValue)) {

			invoice.add(invoiceValue);
		}

	}

	/**			
	 * Removes from the <em>invoice</em> feature.
	 * @generated
	 */
	public void removeFromInvoice(InvoiceType invoiceValue) {
		if (invoice.contains(invoiceValue)) {
			invoice.remove(invoiceValue);
		}
	}

	/**			
	 * Clears the <em>invoice</em> feature.
	 * @generated
	 */
	public void clearInvoice() {
		while (!invoice.isEmpty()) {
			removeFromInvoice(invoice.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceListType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceListType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(List<InvoiceType> newInvoice) {
		invoice = newInvoice;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceListType ";
	}
}
