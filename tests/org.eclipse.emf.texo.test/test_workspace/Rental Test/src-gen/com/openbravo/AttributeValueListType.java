package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>AttributeValueListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class AttributeValueListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<AttributeValueType> attributeValue = new ArrayList<AttributeValueType>();

	/**
	 * Returns the value of '<em><b>attributeValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeValue</b></em>' feature
	 * @generated
	 */
	public List<AttributeValueType> getAttributeValue() {
		return attributeValue;
	}

	/**
	 * Adds to the <em>attributeValue</em> feature.
	 * @generated
	 */
	public void addToAttributeValue(AttributeValueType attributeValueValue) {
		if (!attributeValue.contains(attributeValueValue)) {

			attributeValue.add(attributeValueValue);
		}

	}

	/**			
	 * Removes from the <em>attributeValue</em> feature.
	 * @generated
	 */
	public void removeFromAttributeValue(AttributeValueType attributeValueValue) {
		if (attributeValue.contains(attributeValueValue)) {
			attributeValue.remove(attributeValueValue);
		}
	}

	/**			
	 * Clears the <em>attributeValue</em> feature.
	 * @generated
	 */
	public void clearAttributeValue() {
		while (!attributeValue.isEmpty()) {
			removeFromAttributeValue(attributeValue.iterator().next());
		}
	}

	/**
	 * Sets the '{@link AttributeValueListType#getAttributeValue() <em>attributeValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link AttributeValueListType#getAttributeValue() attributeValue}' feature.
	 * @generated
	 */
	public void setAttributeValue(List<AttributeValueType> newAttributeValue) {
		attributeValue = newAttributeValue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "AttributeValueListType ";
	}
}
