package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADModuleMergeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADModuleMergeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADModuleMergeType> aDModuleMerge = new ArrayList<ADModuleMergeType>();

	/**
	 * Returns the value of '<em><b>aDModuleMerge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleMerge</b></em>' feature
	 * @generated
	 */
	public List<ADModuleMergeType> getADModuleMerge() {
		return aDModuleMerge;
	}

	/**
	 * Adds to the <em>aDModuleMerge</em> feature.
	 * @generated
	 */
	public void addToADModuleMerge(ADModuleMergeType aDModuleMergeValue) {
		if (!aDModuleMerge.contains(aDModuleMergeValue)) {

			aDModuleMerge.add(aDModuleMergeValue);
		}

	}

	/**			
	 * Removes from the <em>aDModuleMerge</em> feature.
	 * @generated
	 */
	public void removeFromADModuleMerge(ADModuleMergeType aDModuleMergeValue) {
		if (aDModuleMerge.contains(aDModuleMergeValue)) {
			aDModuleMerge.remove(aDModuleMergeValue);
		}
	}

	/**			
	 * Clears the <em>aDModuleMerge</em> feature.
	 * @generated
	 */
	public void clearADModuleMerge() {
		while (!aDModuleMerge.isEmpty()) {
			removeFromADModuleMerge(aDModuleMerge.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADModuleMergeListType#getADModuleMerge() <em>aDModuleMerge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADModuleMergeListType#getADModuleMerge() aDModuleMerge}' feature.
	 * @generated
	 */
	public void setADModuleMerge(List<ADModuleMergeType> newADModuleMerge) {
		aDModuleMerge = newADModuleMerge;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADModuleMergeListType ";
	}
}
