package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ModuleTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ModuleTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ModuleTrlType> moduleTrl = new ArrayList<ModuleTrlType>();

	/**
	 * Returns the value of '<em><b>moduleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleTrl</b></em>' feature
	 * @generated
	 */
	public List<ModuleTrlType> getModuleTrl() {
		return moduleTrl;
	}

	/**
	 * Adds to the <em>moduleTrl</em> feature.
	 * @generated
	 */
	public void addToModuleTrl(ModuleTrlType moduleTrlValue) {
		if (!moduleTrl.contains(moduleTrlValue)) {

			moduleTrl.add(moduleTrlValue);
		}

	}

	/**			
	 * Removes from the <em>moduleTrl</em> feature.
	 * @generated
	 */
	public void removeFromModuleTrl(ModuleTrlType moduleTrlValue) {
		if (moduleTrl.contains(moduleTrlValue)) {
			moduleTrl.remove(moduleTrlValue);
		}
	}

	/**			
	 * Clears the <em>moduleTrl</em> feature.
	 * @generated
	 */
	public void clearModuleTrl() {
		while (!moduleTrl.isEmpty()) {
			removeFromModuleTrl(moduleTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ModuleTrlListType#getModuleTrl() <em>moduleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ModuleTrlListType#getModuleTrl() moduleTrl}' feature.
	 * @generated
	 */
	public void setModuleTrl(List<ModuleTrlType> newModuleTrl) {
		moduleTrl = newModuleTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ModuleTrlListType ";
	}
}
