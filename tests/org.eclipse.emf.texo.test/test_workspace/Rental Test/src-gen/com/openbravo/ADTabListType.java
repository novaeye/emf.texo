package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTabListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTabListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADTabType> aDTab = new ArrayList<ADTabType>();

	/**
	 * Returns the value of '<em><b>aDTab</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTab</b></em>' feature
	 * @generated
	 */
	public List<ADTabType> getADTab() {
		return aDTab;
	}

	/**
	 * Adds to the <em>aDTab</em> feature.
	 * @generated
	 */
	public void addToADTab(ADTabType aDTabValue) {
		if (!aDTab.contains(aDTabValue)) {

			aDTab.add(aDTabValue);
		}

	}

	/**			
	 * Removes from the <em>aDTab</em> feature.
	 * @generated
	 */
	public void removeFromADTab(ADTabType aDTabValue) {
		if (aDTab.contains(aDTabValue)) {
			aDTab.remove(aDTabValue);
		}
	}

	/**			
	 * Clears the <em>aDTab</em> feature.
	 * @generated
	 */
	public void clearADTab() {
		while (!aDTab.isEmpty()) {
			removeFromADTab(aDTab.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADTabListType#getADTab() <em>aDTab</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTabListType#getADTab() aDTab}' feature.
	 * @generated
	 */
	public void setADTab(List<ADTabType> newADTab) {
		aDTab = newADTab;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADTabListType ";
	}
}
