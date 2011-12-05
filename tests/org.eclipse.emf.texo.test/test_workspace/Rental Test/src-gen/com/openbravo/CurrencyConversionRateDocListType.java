package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CurrencyConversionRateDocListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CurrencyConversionRateDocListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CurrencyConversionRateDocType> currencyConversionRateDoc = new ArrayList<CurrencyConversionRateDocType>();

	/**
	 * Returns the value of '<em><b>currencyConversionRateDoc</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDoc</b></em>' feature
	 * @generated
	 */
	public List<CurrencyConversionRateDocType> getCurrencyConversionRateDoc() {
		return currencyConversionRateDoc;
	}

	/**
	 * Adds to the <em>currencyConversionRateDoc</em> feature.
	 * @generated
	 */
	public void addToCurrencyConversionRateDoc(
			CurrencyConversionRateDocType currencyConversionRateDocValue) {
		if (!currencyConversionRateDoc.contains(currencyConversionRateDocValue)) {

			currencyConversionRateDoc.add(currencyConversionRateDocValue);
		}

	}

	/**			
	 * Removes from the <em>currencyConversionRateDoc</em> feature.
	 * @generated
	 */
	public void removeFromCurrencyConversionRateDoc(
			CurrencyConversionRateDocType currencyConversionRateDocValue) {
		if (currencyConversionRateDoc.contains(currencyConversionRateDocValue)) {
			currencyConversionRateDoc.remove(currencyConversionRateDocValue);
		}
	}

	/**			
	 * Clears the <em>currencyConversionRateDoc</em> feature.
	 * @generated
	 */
	public void clearCurrencyConversionRateDoc() {
		while (!currencyConversionRateDoc.isEmpty()) {
			removeFromCurrencyConversionRateDoc(currencyConversionRateDoc
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CurrencyConversionRateDocListType#getCurrencyConversionRateDoc() <em>currencyConversionRateDoc</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyConversionRateDocListType#getCurrencyConversionRateDoc() currencyConversionRateDoc}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDoc(
			List<CurrencyConversionRateDocType> newCurrencyConversionRateDoc) {
		currencyConversionRateDoc = newCurrencyConversionRateDoc;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CurrencyConversionRateDocListType ";
	}
}
