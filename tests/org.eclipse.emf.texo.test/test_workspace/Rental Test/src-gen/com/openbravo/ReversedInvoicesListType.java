package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ReversedInvoicesListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ReversedInvoicesListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ReversedInvoicesType> reversedInvoices = new ArrayList<ReversedInvoicesType>();

	/**
	 * Returns the value of '<em><b>reversedInvoices</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reversedInvoices</b></em>' feature
	 * @generated
	 */
	public List<ReversedInvoicesType> getReversedInvoices() {
		return reversedInvoices;
	}

	/**
	 * Adds to the <em>reversedInvoices</em> feature.
	 * @generated
	 */
	public void addToReversedInvoices(ReversedInvoicesType reversedInvoicesValue) {
		if (!reversedInvoices.contains(reversedInvoicesValue)) {

			reversedInvoices.add(reversedInvoicesValue);
		}

	}

	/**			
	 * Removes from the <em>reversedInvoices</em> feature.
	 * @generated
	 */
	public void removeFromReversedInvoices(
			ReversedInvoicesType reversedInvoicesValue) {
		if (reversedInvoices.contains(reversedInvoicesValue)) {
			reversedInvoices.remove(reversedInvoicesValue);
		}
	}

	/**			
	 * Clears the <em>reversedInvoices</em> feature.
	 * @generated
	 */
	public void clearReversedInvoices() {
		while (!reversedInvoices.isEmpty()) {
			removeFromReversedInvoices(reversedInvoices.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ReversedInvoicesListType#getReversedInvoices() <em>reversedInvoices</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ReversedInvoicesListType#getReversedInvoices() reversedInvoices}' feature.
	 * @generated
	 */
	public void setReversedInvoices(
			List<ReversedInvoicesType> newReversedInvoices) {
		reversedInvoices = newReversedInvoices;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ReversedInvoicesListType ";
	}
}
