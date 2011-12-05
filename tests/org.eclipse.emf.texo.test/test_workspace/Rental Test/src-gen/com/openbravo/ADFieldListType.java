package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADFieldListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADFieldListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADFieldType> aDField = new ArrayList<ADFieldType>();

	/**
	 * Returns the value of '<em><b>aDField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDField</b></em>' feature
	 * @generated
	 */
	public List<ADFieldType> getADField() {
		return aDField;
	}

	/**
	 * Adds to the <em>aDField</em> feature.
	 * @generated
	 */
	public void addToADField(ADFieldType aDFieldValue) {
		if (!aDField.contains(aDFieldValue)) {

			aDField.add(aDFieldValue);
		}

	}

	/**			
	 * Removes from the <em>aDField</em> feature.
	 * @generated
	 */
	public void removeFromADField(ADFieldType aDFieldValue) {
		if (aDField.contains(aDFieldValue)) {
			aDField.remove(aDFieldValue);
		}
	}

	/**			
	 * Clears the <em>aDField</em> feature.
	 * @generated
	 */
	public void clearADField() {
		while (!aDField.isEmpty()) {
			removeFromADField(aDField.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADFieldListType#getADField() <em>aDField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADFieldListType#getADField() aDField}' feature.
	 * @generated
	 */
	public void setADField(List<ADFieldType> newADField) {
		aDField = newADField;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADFieldListType ";
	}
}
