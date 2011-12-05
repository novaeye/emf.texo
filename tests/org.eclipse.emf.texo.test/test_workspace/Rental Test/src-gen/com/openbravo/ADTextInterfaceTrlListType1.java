package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTextInterfaceTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTextInterfaceTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADTextInterfaceTrlType> aDTextInterfaceTrl = new ArrayList<ADTextInterfaceTrlType>();

	/**
	 * Returns the value of '<em><b>aDTextInterfaceTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTextInterfaceTrl</b></em>' feature
	 * @generated
	 */
	public List<ADTextInterfaceTrlType> getADTextInterfaceTrl() {
		return aDTextInterfaceTrl;
	}

	/**
	 * Adds to the <em>aDTextInterfaceTrl</em> feature.
	 * @generated
	 */
	public void addToADTextInterfaceTrl(
			ADTextInterfaceTrlType aDTextInterfaceTrlValue) {
		if (!aDTextInterfaceTrl.contains(aDTextInterfaceTrlValue)) {

			aDTextInterfaceTrl.add(aDTextInterfaceTrlValue);
		}

	}

	/**			
	 * Removes from the <em>aDTextInterfaceTrl</em> feature.
	 * @generated
	 */
	public void removeFromADTextInterfaceTrl(
			ADTextInterfaceTrlType aDTextInterfaceTrlValue) {
		if (aDTextInterfaceTrl.contains(aDTextInterfaceTrlValue)) {
			aDTextInterfaceTrl.remove(aDTextInterfaceTrlValue);
		}
	}

	/**			
	 * Clears the <em>aDTextInterfaceTrl</em> feature.
	 * @generated
	 */
	public void clearADTextInterfaceTrl() {
		while (!aDTextInterfaceTrl.isEmpty()) {
			removeFromADTextInterfaceTrl(aDTextInterfaceTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADTextInterfaceTrlListType1#getADTextInterfaceTrl() <em>aDTextInterfaceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTextInterfaceTrlListType1#getADTextInterfaceTrl() aDTextInterfaceTrl}' feature.
	 * @generated
	 */
	public void setADTextInterfaceTrl(
			List<ADTextInterfaceTrlType> newADTextInterfaceTrl) {
		aDTextInterfaceTrl = newADTextInterfaceTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADTextInterfaceTrlListType1 ";
	}
}
