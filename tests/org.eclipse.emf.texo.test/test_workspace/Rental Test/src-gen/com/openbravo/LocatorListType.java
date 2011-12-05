package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>LocatorListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class LocatorListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<LocatorType> locator = new ArrayList<LocatorType>();

	/**
	 * Returns the value of '<em><b>locator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locator</b></em>' feature
	 * @generated
	 */
	public List<LocatorType> getLocator() {
		return locator;
	}

	/**
	 * Adds to the <em>locator</em> feature.
	 * @generated
	 */
	public void addToLocator(LocatorType locatorValue) {
		if (!locator.contains(locatorValue)) {

			locator.add(locatorValue);
		}

	}

	/**			
	 * Removes from the <em>locator</em> feature.
	 * @generated
	 */
	public void removeFromLocator(LocatorType locatorValue) {
		if (locator.contains(locatorValue)) {
			locator.remove(locatorValue);
		}
	}

	/**			
	 * Clears the <em>locator</em> feature.
	 * @generated
	 */
	public void clearLocator() {
		while (!locator.isEmpty()) {
			removeFromLocator(locator.iterator().next());
		}
	}

	/**
	 * Sets the '{@link LocatorListType#getLocator() <em>locator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorListType#getLocator() locator}' feature.
	 * @generated
	 */
	public void setLocator(List<LocatorType> newLocator) {
		locator = newLocator;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "LocatorListType ";
	}
}
