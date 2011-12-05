package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>SalaryCategoryCostListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class SalaryCategoryCostListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<SalaryCategoryCostType> salaryCategoryCost = new ArrayList<SalaryCategoryCostType>();

	/**
	 * Returns the value of '<em><b>salaryCategoryCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategoryCost</b></em>' feature
	 * @generated
	 */
	public List<SalaryCategoryCostType> getSalaryCategoryCost() {
		return salaryCategoryCost;
	}

	/**
	 * Adds to the <em>salaryCategoryCost</em> feature.
	 * @generated
	 */
	public void addToSalaryCategoryCost(
			SalaryCategoryCostType salaryCategoryCostValue) {
		if (!salaryCategoryCost.contains(salaryCategoryCostValue)) {

			salaryCategoryCost.add(salaryCategoryCostValue);
		}

	}

	/**			
	 * Removes from the <em>salaryCategoryCost</em> feature.
	 * @generated
	 */
	public void removeFromSalaryCategoryCost(
			SalaryCategoryCostType salaryCategoryCostValue) {
		if (salaryCategoryCost.contains(salaryCategoryCostValue)) {
			salaryCategoryCost.remove(salaryCategoryCostValue);
		}
	}

	/**			
	 * Clears the <em>salaryCategoryCost</em> feature.
	 * @generated
	 */
	public void clearSalaryCategoryCost() {
		while (!salaryCategoryCost.isEmpty()) {
			removeFromSalaryCategoryCost(salaryCategoryCost.iterator().next());
		}
	}

	/**
	 * Sets the '{@link SalaryCategoryCostListType#getSalaryCategoryCost() <em>salaryCategoryCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link SalaryCategoryCostListType#getSalaryCategoryCost() salaryCategoryCost}' feature.
	 * @generated
	 */
	public void setSalaryCategoryCost(
			List<SalaryCategoryCostType> newSalaryCategoryCost) {
		salaryCategoryCost = newSalaryCategoryCost;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "SalaryCategoryCostListType ";
	}
}
