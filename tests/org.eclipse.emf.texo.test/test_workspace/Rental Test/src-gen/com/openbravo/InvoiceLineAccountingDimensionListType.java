package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceLineAccountingDimensionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceLineAccountingDimensionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<InvoiceLineAccountingDimensionType> invoiceLineAccountingDimension = new ArrayList<InvoiceLineAccountingDimensionType>();

	/**
	 * Returns the value of '<em><b>invoiceLineAccountingDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineAccountingDimension</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineAccountingDimensionType> getInvoiceLineAccountingDimension() {
		return invoiceLineAccountingDimension;
	}

	/**
	 * Adds to the <em>invoiceLineAccountingDimension</em> feature.
	 * @generated
	 */
	public void addToInvoiceLineAccountingDimension(
			InvoiceLineAccountingDimensionType invoiceLineAccountingDimensionValue) {
		if (!invoiceLineAccountingDimension
				.contains(invoiceLineAccountingDimensionValue)) {

			invoiceLineAccountingDimension
					.add(invoiceLineAccountingDimensionValue);
		}

	}

	/**			
	 * Removes from the <em>invoiceLineAccountingDimension</em> feature.
	 * @generated
	 */
	public void removeFromInvoiceLineAccountingDimension(
			InvoiceLineAccountingDimensionType invoiceLineAccountingDimensionValue) {
		if (invoiceLineAccountingDimension
				.contains(invoiceLineAccountingDimensionValue)) {
			invoiceLineAccountingDimension
					.remove(invoiceLineAccountingDimensionValue);
		}
	}

	/**			
	 * Clears the <em>invoiceLineAccountingDimension</em> feature.
	 * @generated
	 */
	public void clearInvoiceLineAccountingDimension() {
		while (!invoiceLineAccountingDimension.isEmpty()) {
			removeFromInvoiceLineAccountingDimension(invoiceLineAccountingDimension
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link InvoiceLineAccountingDimensionListType#getInvoiceLineAccountingDimension() <em>invoiceLineAccountingDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceLineAccountingDimensionListType#getInvoiceLineAccountingDimension() invoiceLineAccountingDimension}' feature.
	 * @generated
	 */
	public void setInvoiceLineAccountingDimension(
			List<InvoiceLineAccountingDimensionType> newInvoiceLineAccountingDimension) {
		invoiceLineAccountingDimension = newInvoiceLineAccountingDimension;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "InvoiceLineAccountingDimensionListType ";
	}
}
