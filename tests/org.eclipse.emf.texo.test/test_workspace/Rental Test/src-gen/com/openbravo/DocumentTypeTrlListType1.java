package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>DocumentTypeTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DocumentTypeTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<DocumentTypeTrlType> documentTypeTrl = new ArrayList<DocumentTypeTrlType>();

	/**
	 * Returns the value of '<em><b>documentTypeTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTypeTrl</b></em>' feature
	 * @generated
	 */
	public List<DocumentTypeTrlType> getDocumentTypeTrl() {
		return documentTypeTrl;
	}

	/**
	 * Adds to the <em>documentTypeTrl</em> feature.
	 * @generated
	 */
	public void addToDocumentTypeTrl(DocumentTypeTrlType documentTypeTrlValue) {
		if (!documentTypeTrl.contains(documentTypeTrlValue)) {

			documentTypeTrl.add(documentTypeTrlValue);
		}

	}

	/**			
	 * Removes from the <em>documentTypeTrl</em> feature.
	 * @generated
	 */
	public void removeFromDocumentTypeTrl(
			DocumentTypeTrlType documentTypeTrlValue) {
		if (documentTypeTrl.contains(documentTypeTrlValue)) {
			documentTypeTrl.remove(documentTypeTrlValue);
		}
	}

	/**			
	 * Clears the <em>documentTypeTrl</em> feature.
	 * @generated
	 */
	public void clearDocumentTypeTrl() {
		while (!documentTypeTrl.isEmpty()) {
			removeFromDocumentTypeTrl(documentTypeTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DocumentTypeTrlListType1#getDocumentTypeTrl() <em>documentTypeTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DocumentTypeTrlListType1#getDocumentTypeTrl() documentTypeTrl}' feature.
	 * @generated
	 */
	public void setDocumentTypeTrl(List<DocumentTypeTrlType> newDocumentTypeTrl) {
		documentTypeTrl = newDocumentTypeTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DocumentTypeTrlListType1 ";
	}
}
