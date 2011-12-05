package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADReferenceTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADReferenceTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADReferenceTrlType> aDReferenceTrl = new ArrayList<ADReferenceTrlType>();

	/**
	 * Returns the value of '<em><b>aDReferenceTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferenceTrl</b></em>' feature
	 * @generated
	 */
	public List<ADReferenceTrlType> getADReferenceTrl() {
		return aDReferenceTrl;
	}

	/**
	 * Adds to the <em>aDReferenceTrl</em> feature.
	 * @generated
	 */
	public void addToADReferenceTrl(ADReferenceTrlType aDReferenceTrlValue) {
		if (!aDReferenceTrl.contains(aDReferenceTrlValue)) {

			aDReferenceTrl.add(aDReferenceTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDReferenceTrl</em> feature.
	 * @generated
	 */
	public void removeFromADReferenceTrl(ADReferenceTrlType aDReferenceTrlValue) {
		if (aDReferenceTrl.contains(aDReferenceTrlValue)) {
			aDReferenceTrl.remove(aDReferenceTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDReferenceTrl</em> feature.
	 * @generated
	 */
	public void clearADReferenceTrl() {
		while (!aDReferenceTrl.isEmpty()) {
			removeFromADReferenceTrl(aDReferenceTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADReferenceTrlListType1#getADReferenceTrl() <em>aDReferenceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceTrlListType1#getADReferenceTrl() aDReferenceTrl}' feature.
	 * @generated
	 */
	public void setADReferenceTrl(List<ADReferenceTrlType> newADReferenceTrl) {
		aDReferenceTrl = newADReferenceTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADReferenceTrlListType1 ";
	}
}
