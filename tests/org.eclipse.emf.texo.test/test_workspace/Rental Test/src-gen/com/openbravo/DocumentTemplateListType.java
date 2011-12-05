package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>DocumentTemplateListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DocumentTemplateListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<DocumentTemplateType> documentTemplate = new ArrayList<DocumentTemplateType>();

	/**
	 * Returns the value of '<em><b>documentTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTemplate</b></em>' feature
	 * @generated
	 */
	public List<DocumentTemplateType> getDocumentTemplate() {
		return documentTemplate;
	}

	/**
	 * Adds to the <em>documentTemplate</em> feature.
	 * @generated
	 */
	public void addToDocumentTemplate(DocumentTemplateType documentTemplateValue) {
		if (!documentTemplate.contains(documentTemplateValue)) {

			documentTemplate.add(documentTemplateValue);
		}

	}

	/**			
	 * Removes from the <em>documentTemplate</em> feature.
	 * @generated
	 */
	public void removeFromDocumentTemplate(
			DocumentTemplateType documentTemplateValue) {
		if (documentTemplate.contains(documentTemplateValue)) {
			documentTemplate.remove(documentTemplateValue);
		}
	}

	/**			
	 * Clears the <em>documentTemplate</em> feature.
	 * @generated
	 */
	public void clearDocumentTemplate() {
		while (!documentTemplate.isEmpty()) {
			removeFromDocumentTemplate(documentTemplate.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DocumentTemplateListType#getDocumentTemplate() <em>documentTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DocumentTemplateListType#getDocumentTemplate() documentTemplate}' feature.
	 * @generated
	 */
	public void setDocumentTemplate(
			List<DocumentTemplateType> newDocumentTemplate) {
		documentTemplate = newDocumentTemplate;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DocumentTemplateListType ";
	}
}
