package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ExternalPOSCategoryListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ExternalPOSCategoryListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ExternalPOSCategoryType> externalPOSCategory = new ArrayList<ExternalPOSCategoryType>();

	/**
	 * Returns the value of '<em><b>externalPOSCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSCategory</b></em>' feature
	 * @generated
	 */
	public List<ExternalPOSCategoryType> getExternalPOSCategory() {
		return externalPOSCategory;
	}

	/**
	 * Adds to the <em>externalPOSCategory</em> feature.
	 * @generated
	 */
	public void addToExternalPOSCategory(
			ExternalPOSCategoryType externalPOSCategoryValue) {
		if (!externalPOSCategory.contains(externalPOSCategoryValue)) {

			externalPOSCategory.add(externalPOSCategoryValue);
		}

	}

	/**			
	 * Removes from the <em>externalPOSCategory</em> feature.
	 * @generated
	 */
	public void removeFromExternalPOSCategory(
			ExternalPOSCategoryType externalPOSCategoryValue) {
		if (externalPOSCategory.contains(externalPOSCategoryValue)) {
			externalPOSCategory.remove(externalPOSCategoryValue);
		}
	}

	/**			
	 * Clears the <em>externalPOSCategory</em> feature.
	 * @generated
	 */
	public void clearExternalPOSCategory() {
		while (!externalPOSCategory.isEmpty()) {
			removeFromExternalPOSCategory(externalPOSCategory.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ExternalPOSCategoryListType#getExternalPOSCategory() <em>externalPOSCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ExternalPOSCategoryListType#getExternalPOSCategory() externalPOSCategory}' feature.
	 * @generated
	 */
	public void setExternalPOSCategory(
			List<ExternalPOSCategoryType> newExternalPOSCategory) {
		externalPOSCategory = newExternalPOSCategory;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ExternalPOSCategoryListType ";
	}
}
