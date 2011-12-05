package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ModuleDBPrefixListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ModuleDBPrefixListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ModuleDBPrefixType> moduleDBPrefix = new ArrayList<ModuleDBPrefixType>();

	/**
	 * Returns the value of '<em><b>moduleDBPrefix</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleDBPrefix</b></em>' feature
	 * @generated
	 */
	public List<ModuleDBPrefixType> getModuleDBPrefix() {
		return moduleDBPrefix;
	}

	/**
	 * Adds to the <em>moduleDBPrefix</em> feature.
	 * @generated
	 */
	public void addToModuleDBPrefix(ModuleDBPrefixType moduleDBPrefixValue) {
		if (!moduleDBPrefix.contains(moduleDBPrefixValue)) {

			moduleDBPrefix.add(moduleDBPrefixValue);
		}

	}

	/**			
	 * Removes from the <em>moduleDBPrefix</em> feature.
	 * @generated
	 */
	public void removeFromModuleDBPrefix(ModuleDBPrefixType moduleDBPrefixValue) {
		if (moduleDBPrefix.contains(moduleDBPrefixValue)) {
			moduleDBPrefix.remove(moduleDBPrefixValue);
		}
	}

	/**			
	 * Clears the <em>moduleDBPrefix</em> feature.
	 * @generated
	 */
	public void clearModuleDBPrefix() {
		while (!moduleDBPrefix.isEmpty()) {
			removeFromModuleDBPrefix(moduleDBPrefix.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ModuleDBPrefixListType#getModuleDBPrefix() <em>moduleDBPrefix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ModuleDBPrefixListType#getModuleDBPrefix() moduleDBPrefix}' feature.
	 * @generated
	 */
	public void setModuleDBPrefix(List<ModuleDBPrefixType> newModuleDBPrefix) {
		moduleDBPrefix = newModuleDBPrefix;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ModuleDBPrefixListType ";
	}
}
