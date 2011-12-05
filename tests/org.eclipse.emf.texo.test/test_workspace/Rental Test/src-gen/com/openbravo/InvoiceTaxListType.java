package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceTaxListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceTaxListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceTaxType> invoiceTax = new ArrayList<InvoiceTaxType>();

	/**
	 * Returns the value of '<em><b>invoiceTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTax</b></em>' feature
	 * @generated
	 */
	public List<InvoiceTaxType> getInvoiceTax() {
		return invoiceTax;
	}

	/**
	 * Adds to the <em>invoiceTax</em> feature.
	 * @generated
	 */
	public void addToInvoiceTax(InvoiceTaxType invoiceTaxValue) {
		if (!invoiceTax.contains(invoiceTaxValue)) {

			invoiceTax.add(invoiceTaxValue);
		}

	}

	/**			
	 * Removes from the <em>invoiceTax</em> feature.
	 * @generated
	 */
	public void removeFromInvoiceTax(InvoiceTaxType invoiceTaxValue) {
		if (invoiceTax.contains(invoiceTaxValue)) {
			invoiceTax.remove(invoiceTaxValue);
		}
	}

	/**			
	 * Clears the <em>invoiceTax</em> feature.
	 * @generated
	 */
	public void clearInvoiceTax() {
		while (!invoiceTax.isEmpty()) {
			removeFromInvoiceTax(invoiceTax.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceTaxListType#getInvoiceTax() <em>invoiceTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceTaxListType#getInvoiceTax() invoiceTax}' feature.
	 * @generated
	 */
	public void setInvoiceTax(List<InvoiceTaxType> newInvoiceTax) {
		invoiceTax = newInvoiceTax;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceTaxListType ";
	}
}
