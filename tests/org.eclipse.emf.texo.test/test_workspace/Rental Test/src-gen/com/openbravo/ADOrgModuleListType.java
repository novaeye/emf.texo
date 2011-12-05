package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADOrgModuleListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADOrgModuleListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADOrgModuleType> aDOrgModule = new ArrayList<ADOrgModuleType>();

	/**
	 * Returns the value of '<em><b>aDOrgModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDOrgModule</b></em>' feature
	 * @generated
	 */
	public List<ADOrgModuleType> getADOrgModule() {
		return aDOrgModule;
	}

	/**
	 * Adds to the <em>aDOrgModule</em> feature.
	 * @generated
	 */
	public void addToADOrgModule(ADOrgModuleType aDOrgModuleValue) {
		if (!aDOrgModule.contains(aDOrgModuleValue)) {

			aDOrgModule.add(aDOrgModuleValue);
		}

	}

	/**			
	 * Removes from the <em>aDOrgModule</em> feature.
	 * @generated
	 */
	public void removeFromADOrgModule(ADOrgModuleType aDOrgModuleValue) {
		if (aDOrgModule.contains(aDOrgModuleValue)) {
			aDOrgModule.remove(aDOrgModuleValue);
		}
	}

	/**			
	 * Clears the <em>aDOrgModule</em> feature.
	 * @generated
	 */
	public void clearADOrgModule() {
		while (!aDOrgModule.isEmpty()) {
			removeFromADOrgModule(aDOrgModule.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADOrgModuleListType#getADOrgModule() <em>aDOrgModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADOrgModuleListType#getADOrgModule() aDOrgModule}' feature.
	 * @generated
	 */
	public void setADOrgModule(List<ADOrgModuleType> newADOrgModule) {
		aDOrgModule = newADOrgModule;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADOrgModuleListType ";
	}
}
