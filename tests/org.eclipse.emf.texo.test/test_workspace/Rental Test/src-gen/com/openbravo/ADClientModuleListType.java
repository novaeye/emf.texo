package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADClientModuleListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADClientModuleListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADClientModuleType> aDClientModule = new ArrayList<ADClientModuleType>();

	/**
	 * Returns the value of '<em><b>aDClientModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClientModule</b></em>' feature
	 * @generated
	 */
	public List<ADClientModuleType> getADClientModule() {
		return aDClientModule;
	}

	/**
	 * Adds to the <em>aDClientModule</em> feature.
	 * @generated
	 */
	public void addToADClientModule(ADClientModuleType aDClientModuleValue) {
		if (!aDClientModule.contains(aDClientModuleValue)) {

			aDClientModule.add(aDClientModuleValue);
		}

	}

	/**			
	 * Removes from the <em>aDClientModule</em> feature.
	 * @generated
	 */
	public void removeFromADClientModule(ADClientModuleType aDClientModuleValue) {
		if (aDClientModule.contains(aDClientModuleValue)) {
			aDClientModule.remove(aDClientModuleValue);
		}
	}

	/**			
	 * Clears the <em>aDClientModule</em> feature.
	 * @generated
	 */
	public void clearADClientModule() {
		while (!aDClientModule.isEmpty()) {
			removeFromADClientModule(aDClientModule.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADClientModuleListType#getADClientModule() <em>aDClientModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADClientModuleListType#getADClientModule() aDClientModule}' feature.
	 * @generated
	 */
	public void setADClientModule(List<ADClientModuleType> newADClientModule) {
		aDClientModule = newADClientModule;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADClientModuleListType ";
	}
}
