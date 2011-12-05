package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CountryTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CountryTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CountryTrlType> countryTrl = new ArrayList<CountryTrlType>();

	/**
	 * Returns the value of '<em><b>countryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>countryTrl</b></em>' feature
	 * @generated
	 */
	public List<CountryTrlType> getCountryTrl() {
		return countryTrl;
	}

	/**
	 * Adds to the <em>countryTrl</em> feature.
	 * @generated
	 */
	public void addToCountryTrl(CountryTrlType countryTrlValue) {
		if (!countryTrl.contains(countryTrlValue)) {

			countryTrl.add(countryTrlValue);
		}

	}

	/**			
	 * Removes from the <em>countryTrl</em> feature.
	 * @generated
	 */
	public void removeFromCountryTrl(CountryTrlType countryTrlValue) {
		if (countryTrl.contains(countryTrlValue)) {
			countryTrl.remove(countryTrlValue);
		}
	}

	/**			
	 * Clears the <em>countryTrl</em> feature.
	 * @generated
	 */
	public void clearCountryTrl() {
		while (!countryTrl.isEmpty()) {
			removeFromCountryTrl(countryTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CountryTrlListType1#getCountryTrl() <em>countryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryTrlListType1#getCountryTrl() countryTrl}' feature.
	 * @generated
	 */
	public void setCountryTrl(List<CountryTrlType> newCountryTrl) {
		countryTrl = newCountryTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CountryTrlListType1 ";
	}
}
