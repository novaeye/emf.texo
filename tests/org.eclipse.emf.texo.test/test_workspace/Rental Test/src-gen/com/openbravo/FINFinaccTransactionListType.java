package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINFinaccTransactionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINFinaccTransactionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINFinaccTransactionType> fINFinaccTransaction = new ArrayList<FINFinaccTransactionType>();

	/**
	 * Returns the value of '<em><b>fINFinaccTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransaction</b></em>' feature
	 * @generated
	 */
	public List<FINFinaccTransactionType> getFINFinaccTransaction() {
		return fINFinaccTransaction;
	}

	/**
	 * Adds to the <em>fINFinaccTransaction</em> feature.
	 * @generated
	 */
	public void addToFINFinaccTransaction(
			FINFinaccTransactionType fINFinaccTransactionValue) {
		if (!fINFinaccTransaction.contains(fINFinaccTransactionValue)) {

			fINFinaccTransaction.add(fINFinaccTransactionValue);
		}

	}

	/**			
	 * Removes from the <em>fINFinaccTransaction</em> feature.
	 * @generated
	 */
	public void removeFromFINFinaccTransaction(
			FINFinaccTransactionType fINFinaccTransactionValue) {
		if (fINFinaccTransaction.contains(fINFinaccTransactionValue)) {
			fINFinaccTransaction.remove(fINFinaccTransactionValue);
		}
	}

	/**			
	 * Clears the <em>fINFinaccTransaction</em> feature.
	 * @generated
	 */
	public void clearFINFinaccTransaction() {
		while (!fINFinaccTransaction.isEmpty()) {
			removeFromFINFinaccTransaction(fINFinaccTransaction.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FINFinaccTransactionListType#getFINFinaccTransaction() <em>fINFinaccTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionListType#getFINFinaccTransaction() fINFinaccTransaction}' feature.
	 * @generated
	 */
	public void setFINFinaccTransaction(
			List<FINFinaccTransactionType> newFINFinaccTransaction) {
		fINFinaccTransaction = newFINFinaccTransaction;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINFinaccTransactionListType ";
	}
}
