package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADModelImplementationMappingListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADModelImplementationMappingListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADModelImplementationMappingType> aDModelImplementationMapping = new ArrayList<ADModelImplementationMappingType>();

	/**
	 * Returns the value of '<em><b>aDModelImplementationMapping</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementationMapping</b></em>' feature
	 * @generated
	 */
	public List<ADModelImplementationMappingType> getADModelImplementationMapping() {
		return aDModelImplementationMapping;
	}

	/**
	 * Adds to the <em>aDModelImplementationMapping</em> feature.
	 * @generated
	 */
	public void addToADModelImplementationMapping(
			ADModelImplementationMappingType aDModelImplementationMappingValue) {
		if (!aDModelImplementationMapping
				.contains(aDModelImplementationMappingValue)) {

			aDModelImplementationMapping.add(aDModelImplementationMappingValue);
		}

	}

	/**			
	 * Removes from the <em>aDModelImplementationMapping</em> feature.
	 * @generated
	 */
	public void removeFromADModelImplementationMapping(
			ADModelImplementationMappingType aDModelImplementationMappingValue) {
		if (aDModelImplementationMapping
				.contains(aDModelImplementationMappingValue)) {
			aDModelImplementationMapping
					.remove(aDModelImplementationMappingValue);
		}
	}

	/**			
	 * Clears the <em>aDModelImplementationMapping</em> feature.
	 * @generated
	 */
	public void clearADModelImplementationMapping() {
		while (!aDModelImplementationMapping.isEmpty()) {
			removeFromADModelImplementationMapping(aDModelImplementationMapping
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADModelImplementationMappingListType#getADModelImplementationMapping() <em>aDModelImplementationMapping</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADModelImplementationMappingListType#getADModelImplementationMapping() aDModelImplementationMapping}' feature.
	 * @generated
	 */
	public void setADModelImplementationMapping(
			List<ADModelImplementationMappingType> newADModelImplementationMapping) {
		aDModelImplementationMapping = newADModelImplementationMapping;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADModelImplementationMappingListType ";
	}
}
