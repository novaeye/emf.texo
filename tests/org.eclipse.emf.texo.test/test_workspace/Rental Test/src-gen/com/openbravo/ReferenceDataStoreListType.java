package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ReferenceDataStoreListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ReferenceDataStoreListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ReferenceDataStoreType> referenceDataStore = new ArrayList<ReferenceDataStoreType>();

	/**
	 * Returns the value of '<em><b>referenceDataStore</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceDataStore</b></em>' feature
	 * @generated
	 */
	public List<ReferenceDataStoreType> getReferenceDataStore() {
		return referenceDataStore;
	}

	/**
	 * Adds to the <em>referenceDataStore</em> feature.
	 * @generated
	 */
	public void addToReferenceDataStore(
			ReferenceDataStoreType referenceDataStoreValue) {
		if (!referenceDataStore.contains(referenceDataStoreValue)) {

			referenceDataStore.add(referenceDataStoreValue);
		}

	}

	/**			
	 * Removes from the <em>referenceDataStore</em> feature.
	 * @generated
	 */
	public void removeFromReferenceDataStore(
			ReferenceDataStoreType referenceDataStoreValue) {
		if (referenceDataStore.contains(referenceDataStoreValue)) {
			referenceDataStore.remove(referenceDataStoreValue);
		}
	}

	/**			
	 * Clears the <em>referenceDataStore</em> feature.
	 * @generated
	 */
	public void clearReferenceDataStore() {
		while (!referenceDataStore.isEmpty()) {
			removeFromReferenceDataStore(referenceDataStore.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ReferenceDataStoreListType#getReferenceDataStore() <em>referenceDataStore</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ReferenceDataStoreListType#getReferenceDataStore() referenceDataStore}' feature.
	 * @generated
	 */
	public void setReferenceDataStore(
			List<ReferenceDataStoreType> newReferenceDataStore) {
		referenceDataStore = newReferenceDataStore;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ReferenceDataStoreListType ";
	}
}
