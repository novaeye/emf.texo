package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CurrencyTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CurrencyTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CurrencyTrlType> currencyTrl = new ArrayList<CurrencyTrlType>();

	/**
	 * Returns the value of '<em><b>currencyTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyTrl</b></em>' feature
	 * @generated
	 */
	public List<CurrencyTrlType> getCurrencyTrl() {
		return currencyTrl;
	}

	/**
	 * Adds to the <em>currencyTrl</em> feature.
	 * @generated
	 */
	public void addToCurrencyTrl(CurrencyTrlType currencyTrlValue) {
		if (!currencyTrl.contains(currencyTrlValue)) {

			currencyTrl.add(currencyTrlValue);
		}

	}

	/**			
	 * Removes from the <em>currencyTrl</em> feature.
	 * @generated
	 */
	public void removeFromCurrencyTrl(CurrencyTrlType currencyTrlValue) {
		if (currencyTrl.contains(currencyTrlValue)) {
			currencyTrl.remove(currencyTrlValue);
		}
	}

	/**			
	 * Clears the <em>currencyTrl</em> feature.
	 * @generated
	 */
	public void clearCurrencyTrl() {
		while (!currencyTrl.isEmpty()) {
			removeFromCurrencyTrl(currencyTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CurrencyTrlListType#getCurrencyTrl() <em>currencyTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyTrlListType#getCurrencyTrl() currencyTrl}' feature.
	 * @generated
	 */
	public void setCurrencyTrl(List<CurrencyTrlType> newCurrencyTrl) {
		currencyTrl = newCurrencyTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CurrencyTrlListType ";
	}
}
