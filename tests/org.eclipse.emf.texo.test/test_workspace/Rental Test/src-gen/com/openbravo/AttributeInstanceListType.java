package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>AttributeInstanceListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class AttributeInstanceListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<AttributeInstanceType> attributeInstance = new ArrayList<AttributeInstanceType>();

	/**
	 * Returns the value of '<em><b>attributeInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeInstance</b></em>' feature
	 * @generated
	 */
	public List<AttributeInstanceType> getAttributeInstance() {
		return attributeInstance;
	}

	/**
	 * Adds to the <em>attributeInstance</em> feature.
	 * @generated
	 */
	public void addToAttributeInstance(
			AttributeInstanceType attributeInstanceValue) {
		if (!attributeInstance.contains(attributeInstanceValue)) {

			attributeInstance.add(attributeInstanceValue);
		}

	}

	/**			
	 * Removes from the <em>attributeInstance</em> feature.
	 * @generated
	 */
	public void removeFromAttributeInstance(
			AttributeInstanceType attributeInstanceValue) {
		if (attributeInstance.contains(attributeInstanceValue)) {
			attributeInstance.remove(attributeInstanceValue);
		}
	}

	/**			
	 * Clears the <em>attributeInstance</em> feature.
	 * @generated
	 */
	public void clearAttributeInstance() {
		while (!attributeInstance.isEmpty()) {
			removeFromAttributeInstance(attributeInstance.iterator().next());
		}
	}

	/**
	 * Sets the '{@link AttributeInstanceListType#getAttributeInstance() <em>attributeInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link AttributeInstanceListType#getAttributeInstance() attributeInstance}' feature.
	 * @generated
	 */
	public void setAttributeInstance(
			List<AttributeInstanceType> newAttributeInstance) {
		attributeInstance = newAttributeInstance;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "AttributeInstanceListType ";
	}
}
