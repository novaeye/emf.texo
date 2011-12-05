package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADSelectorListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADSelectorListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADSelectorType> aDSelector = new ArrayList<ADSelectorType>();

	/**
	 * Returns the value of '<em><b>aDSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelector</b></em>' feature
	 * @generated
	 */
	public List<ADSelectorType> getADSelector() {
		return aDSelector;
	}

	/**
	 * Adds to the <em>aDSelector</em> feature.
	 * @generated
	 */
	public void addToADSelector(ADSelectorType aDSelectorValue) {
		if (!aDSelector.contains(aDSelectorValue)) {

			aDSelector.add(aDSelectorValue);
		}

	}

	/**			
	 * Removes from the <em>aDSelector</em> feature.
	 * @generated
	 */
	public void removeFromADSelector(ADSelectorType aDSelectorValue) {
		if (aDSelector.contains(aDSelectorValue)) {
			aDSelector.remove(aDSelectorValue);
		}
	}

	/**			
	 * Clears the <em>aDSelector</em> feature.
	 * @generated
	 */
	public void clearADSelector() {
		while (!aDSelector.isEmpty()) {
			removeFromADSelector(aDSelector.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADSelectorListType#getADSelector() <em>aDSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSelectorListType#getADSelector() aDSelector}' feature.
	 * @generated
	 */
	public void setADSelector(List<ADSelectorType> newADSelector) {
		aDSelector = newADSelector;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADSelectorListType ";
	}
}
