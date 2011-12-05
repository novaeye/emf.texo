package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceLineTaxListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceLineTaxListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceLineTaxType> invoiceLineTax = new ArrayList<InvoiceLineTaxType>();

	/**
	 * Returns the value of '<em><b>invoiceLineTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineTax</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineTaxType> getInvoiceLineTax() {
		return invoiceLineTax;
	}

	/**
	 * Adds to the <em>invoiceLineTax</em> feature.
	 * @generated
	 */
	public void addToInvoiceLineTax(InvoiceLineTaxType invoiceLineTaxValue) {
		if (!invoiceLineTax.contains(invoiceLineTaxValue)) {

			invoiceLineTax.add(invoiceLineTaxValue);
		}

	}

	/**			
	 * Removes from the <em>invoiceLineTax</em> feature.
	 * @generated
	 */
	public void removeFromInvoiceLineTax(InvoiceLineTaxType invoiceLineTaxValue) {
		if (invoiceLineTax.contains(invoiceLineTaxValue)) {
			invoiceLineTax.remove(invoiceLineTaxValue);
		}
	}

	/**			
	 * Clears the <em>invoiceLineTax</em> feature.
	 * @generated
	 */
	public void clearInvoiceLineTax() {
		while (!invoiceLineTax.isEmpty()) {
			removeFromInvoiceLineTax(invoiceLineTax.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceLineTaxListType#getInvoiceLineTax() <em>invoiceLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceLineTaxListType#getInvoiceLineTax() invoiceLineTax}' feature.
	 * @generated
	 */
	public void setInvoiceLineTax(List<InvoiceLineTaxType> newInvoiceLineTax) {
		invoiceLineTax = newInvoiceLineTax;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceLineTaxListType ";
	}
}
