package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceDiscountListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceDiscountListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceDiscountType> invoiceDiscount = new ArrayList<InvoiceDiscountType>();

	/**
	 * Returns the value of '<em><b>invoiceDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceDiscount</b></em>' feature
	 * @generated
	 */
	public List<InvoiceDiscountType> getInvoiceDiscount() {
		return invoiceDiscount;
	}

	/**
	 * Adds to the <em>invoiceDiscount</em> feature.
	 * @generated
	 */
	public void addToInvoiceDiscount(InvoiceDiscountType invoiceDiscountValue) {
		if (!invoiceDiscount.contains(invoiceDiscountValue)) {

			invoiceDiscount.add(invoiceDiscountValue);
		}

	}

	/**			
	 * Removes from the <em>invoiceDiscount</em> feature.
	 * @generated
	 */
	public void removeFromInvoiceDiscount(
			InvoiceDiscountType invoiceDiscountValue) {
		if (invoiceDiscount.contains(invoiceDiscountValue)) {
			invoiceDiscount.remove(invoiceDiscountValue);
		}
	}

	/**			
	 * Clears the <em>invoiceDiscount</em> feature.
	 * @generated
	 */
	public void clearInvoiceDiscount() {
		while (!invoiceDiscount.isEmpty()) {
			removeFromInvoiceDiscount(invoiceDiscount.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceDiscountListType#getInvoiceDiscount() <em>invoiceDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceDiscountListType#getInvoiceDiscount() invoiceDiscount}' feature.
	 * @generated
	 */
	public void setInvoiceDiscount(List<InvoiceDiscountType> newInvoiceDiscount) {
		invoiceDiscount = newInvoiceDiscount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceDiscountListType ";
	}
}
