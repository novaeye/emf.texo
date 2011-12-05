package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ModuleDependencyListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ModuleDependencyListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ModuleDependencyType> moduleDependency = new ArrayList<ModuleDependencyType>();

	/**
	 * Returns the value of '<em><b>moduleDependency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleDependency</b></em>' feature
	 * @generated
	 */
	public List<ModuleDependencyType> getModuleDependency() {
		return moduleDependency;
	}

	/**
	 * Adds to the <em>moduleDependency</em> feature.
	 * @generated
	 */
	public void addToModuleDependency(ModuleDependencyType moduleDependencyValue) {
		if (!moduleDependency.contains(moduleDependencyValue)) {

			moduleDependency.add(moduleDependencyValue);
		}

	}

	/**			
	 * Removes from the <em>moduleDependency</em> feature.
	 * @generated
	 */
	public void removeFromModuleDependency(
			ModuleDependencyType moduleDependencyValue) {
		if (moduleDependency.contains(moduleDependencyValue)) {
			moduleDependency.remove(moduleDependencyValue);
		}
	}

	/**			
	 * Clears the <em>moduleDependency</em> feature.
	 * @generated
	 */
	public void clearModuleDependency() {
		while (!moduleDependency.isEmpty()) {
			removeFromModuleDependency(moduleDependency.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ModuleDependencyListType#getModuleDependency() <em>moduleDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ModuleDependencyListType#getModuleDependency() moduleDependency}' feature.
	 * @generated
	 */
	public void setModuleDependency(
			List<ModuleDependencyType> newModuleDependency) {
		moduleDependency = newModuleDependency;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ModuleDependencyListType ";
	}
}
