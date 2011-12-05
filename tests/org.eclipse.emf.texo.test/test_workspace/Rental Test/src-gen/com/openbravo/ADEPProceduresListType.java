package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADEPProceduresListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADEPProceduresListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADEPProceduresType> aDEPProcedures = new ArrayList<ADEPProceduresType>();

	/**
	 * Returns the value of '<em><b>aDEPProcedures</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDEPProcedures</b></em>' feature
	 * @generated
	 */
	public List<ADEPProceduresType> getADEPProcedures() {
		return aDEPProcedures;
	}

	/**
	 * Adds to the <em>aDEPProcedures</em> feature.
	 * @generated
	 */
	public void addToADEPProcedures(ADEPProceduresType aDEPProceduresValue) {
		if (!aDEPProcedures.contains(aDEPProceduresValue)) {

			aDEPProcedures.add(aDEPProceduresValue);
		}

	}

	/**			
	 * Removes from the <em>aDEPProcedures</em> feature.
	 * @generated
	 */
	public void removeFromADEPProcedures(ADEPProceduresType aDEPProceduresValue) {
		if (aDEPProcedures.contains(aDEPProceduresValue)) {
			aDEPProcedures.remove(aDEPProceduresValue);
		}
	}

	/**			
	 * Clears the <em>aDEPProcedures</em> feature.
	 * @generated
	 */
	public void clearADEPProcedures() {
		while (!aDEPProcedures.isEmpty()) {
			removeFromADEPProcedures(aDEPProcedures.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADEPProceduresListType#getADEPProcedures() <em>aDEPProcedures</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADEPProceduresListType#getADEPProcedures() aDEPProcedures}' feature.
	 * @generated
	 */
	public void setADEPProcedures(List<ADEPProceduresType> newADEPProcedures) {
		aDEPProcedures = newADEPProcedures;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADEPProceduresListType ";
	}
}
