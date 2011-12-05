package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetReferenceListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetReferenceListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBKMOWidgetReferenceType> oBKMOWidgetReference = new ArrayList<OBKMOWidgetReferenceType>();

	/**
	 * Returns the value of '<em><b>oBKMOWidgetReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetReference</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetReferenceType> getOBKMOWidgetReference() {
		return oBKMOWidgetReference;
	}

	/**
	 * Adds to the <em>oBKMOWidgetReference</em> feature.
	 * @generated
	 */
	public void addToOBKMOWidgetReference(
			OBKMOWidgetReferenceType oBKMOWidgetReferenceValue) {
		if (!oBKMOWidgetReference.contains(oBKMOWidgetReferenceValue)) {

			oBKMOWidgetReference.add(oBKMOWidgetReferenceValue);
		}

	}

	/**			
	 * Removes from the <em>oBKMOWidgetReference</em> feature.
	 * @generated
	 */
	public void removeFromOBKMOWidgetReference(
			OBKMOWidgetReferenceType oBKMOWidgetReferenceValue) {
		if (oBKMOWidgetReference.contains(oBKMOWidgetReferenceValue)) {
			oBKMOWidgetReference.remove(oBKMOWidgetReferenceValue);
		}
	}

	/**			
	 * Clears the <em>oBKMOWidgetReference</em> feature.
	 * @generated
	 */
	public void clearOBKMOWidgetReference() {
		while (!oBKMOWidgetReference.isEmpty()) {
			removeFromOBKMOWidgetReference(oBKMOWidgetReference.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link OBKMOWidgetReferenceListType1#getOBKMOWidgetReference() <em>oBKMOWidgetReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetReferenceListType1#getOBKMOWidgetReference() oBKMOWidgetReference}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetReference(
			List<OBKMOWidgetReferenceType> newOBKMOWidgetReference) {
		oBKMOWidgetReference = newOBKMOWidgetReference;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBKMOWidgetReferenceListType1 ";
	}
}
