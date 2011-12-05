package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CurrencyConversionRateListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CurrencyConversionRateListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CurrencyConversionRateType> currencyConversionRate = new ArrayList<CurrencyConversionRateType>();

	/**
	 * Returns the value of '<em><b>currencyConversionRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRate</b></em>' feature
	 * @generated
	 */
	public List<CurrencyConversionRateType> getCurrencyConversionRate() {
		return currencyConversionRate;
	}

	/**
	 * Adds to the <em>currencyConversionRate</em> feature.
	 * @generated
	 */
	public void addToCurrencyConversionRate(
			CurrencyConversionRateType currencyConversionRateValue) {
		if (!currencyConversionRate.contains(currencyConversionRateValue)) {

			currencyConversionRate.add(currencyConversionRateValue);
		}

	}

	/**			
	 * Removes from the <em>currencyConversionRate</em> feature.
	 * @generated
	 */
	public void removeFromCurrencyConversionRate(
			CurrencyConversionRateType currencyConversionRateValue) {
		if (currencyConversionRate.contains(currencyConversionRateValue)) {
			currencyConversionRate.remove(currencyConversionRateValue);
		}
	}

	/**			
	 * Clears the <em>currencyConversionRate</em> feature.
	 * @generated
	 */
	public void clearCurrencyConversionRate() {
		while (!currencyConversionRate.isEmpty()) {
			removeFromCurrencyConversionRate(currencyConversionRate.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link CurrencyConversionRateListType#getCurrencyConversionRate() <em>currencyConversionRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyConversionRateListType#getCurrencyConversionRate() currencyConversionRate}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRate(
			List<CurrencyConversionRateType> newCurrencyConversionRate) {
		currencyConversionRate = newCurrencyConversionRate;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CurrencyConversionRateListType ";
	}
}
