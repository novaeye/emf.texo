package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CityListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CityListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<CityType> city = new ArrayList<CityType>();

	/**
	 * Returns the value of '<em><b>city</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>city</b></em>' feature
	 * @generated
	 */
	public List<CityType> getCity() {
		return city;
	}

	/**
	 * Adds to the <em>city</em> feature.
	 * @generated
	 */
	public void addToCity(CityType cityValue) {
		if (!city.contains(cityValue)) {

			city.add(cityValue);
		}

	}

	/**			
	 * Removes from the <em>city</em> feature.
	 * @generated
	 */
	public void removeFromCity(CityType cityValue) {
		if (city.contains(cityValue)) {
			city.remove(cityValue);
		}
	}

	/**			
	 * Clears the <em>city</em> feature.
	 * @generated
	 */
	public void clearCity() {
		while (!city.isEmpty()) {
			removeFromCity(city.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CityListType#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CityListType#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(List<CityType> newCity) {
		city = newCity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "CityListType ";
	}
}
