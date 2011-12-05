package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>AttributeUseListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class AttributeUseListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<AttributeUseType> attributeUse = new ArrayList<AttributeUseType>();

	/**
	 * Returns the value of '<em><b>attributeUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeUse</b></em>' feature
	 * @generated
	 */
	public List<AttributeUseType> getAttributeUse() {
		return attributeUse;
	}

	/**
	 * Adds to the <em>attributeUse</em> feature.
	 * @generated
	 */
	public void addToAttributeUse(AttributeUseType attributeUseValue) {
		if (!attributeUse.contains(attributeUseValue)) {

			attributeUse.add(attributeUseValue);
		}

	}

	/**			
	 * Removes from the <em>attributeUse</em> feature.
	 * @generated
	 */
	public void removeFromAttributeUse(AttributeUseType attributeUseValue) {
		if (attributeUse.contains(attributeUseValue)) {
			attributeUse.remove(attributeUseValue);
		}
	}

	/**			
	 * Clears the <em>attributeUse</em> feature.
	 * @generated
	 */
	public void clearAttributeUse() {
		while (!attributeUse.isEmpty()) {
			removeFromAttributeUse(attributeUse.iterator().next());
		}
	}

	/**
	 * Sets the '{@link AttributeUseListType#getAttributeUse() <em>attributeUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link AttributeUseListType#getAttributeUse() attributeUse}' feature.
	 * @generated
	 */
	public void setAttributeUse(List<AttributeUseType> newAttributeUse) {
		attributeUse = newAttributeUse;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "AttributeUseListType ";
	}
}
