package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceLineType> invoiceLine = new ArrayList<InvoiceLineType>();

	/**
	 * Returns the value of '<em><b>invoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLine</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineType> getInvoiceLine() {
		return invoiceLine;
	}

	/**
	 * Adds to the <em>invoiceLine</em> feature.
	 * @generated
	 */
	public void addToInvoiceLine(InvoiceLineType invoiceLineValue) {
		if (!invoiceLine.contains(invoiceLineValue)) {

			invoiceLine.add(invoiceLineValue);
		}

	}

	/**			
	 * Removes from the <em>invoiceLine</em> feature.
	 * @generated
	 */
	public void removeFromInvoiceLine(InvoiceLineType invoiceLineValue) {
		if (invoiceLine.contains(invoiceLineValue)) {
			invoiceLine.remove(invoiceLineValue);
		}
	}

	/**			
	 * Clears the <em>invoiceLine</em> feature.
	 * @generated
	 */
	public void clearInvoiceLine() {
		while (!invoiceLine.isEmpty()) {
			removeFromInvoiceLine(invoiceLine.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceLineListType#getInvoiceLine() <em>invoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceLineListType#getInvoiceLine() invoiceLine}' feature.
	 * @generated
	 */
	public void setInvoiceLine(List<InvoiceLineType> newInvoiceLine) {
		invoiceLine = newInvoiceLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceLineListType ";
	}
}
