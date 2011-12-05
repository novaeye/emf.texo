package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>EmailTemplateListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class EmailTemplateListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<EmailTemplateType> emailTemplate = new ArrayList<EmailTemplateType>();

	/**
	 * Returns the value of '<em><b>emailTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailTemplate</b></em>' feature
	 * @generated
	 */
	public List<EmailTemplateType> getEmailTemplate() {
		return emailTemplate;
	}

	/**
	 * Adds to the <em>emailTemplate</em> feature.
	 * @generated
	 */
	public void addToEmailTemplate(EmailTemplateType emailTemplateValue) {
		if (!emailTemplate.contains(emailTemplateValue)) {

			emailTemplate.add(emailTemplateValue);
		}

	}

	/**			
	 * Removes from the <em>emailTemplate</em> feature.
	 * @generated
	 */
	public void removeFromEmailTemplate(EmailTemplateType emailTemplateValue) {
		if (emailTemplate.contains(emailTemplateValue)) {
			emailTemplate.remove(emailTemplateValue);
		}
	}

	/**			
	 * Clears the <em>emailTemplate</em> feature.
	 * @generated
	 */
	public void clearEmailTemplate() {
		while (!emailTemplate.isEmpty()) {
			removeFromEmailTemplate(emailTemplate.iterator().next());
		}
	}

	/**
	 * Sets the '{@link EmailTemplateListType#getEmailTemplate() <em>emailTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link EmailTemplateListType#getEmailTemplate() emailTemplate}' feature.
	 * @generated
	 */
	public void setEmailTemplate(List<EmailTemplateType> newEmailTemplate) {
		emailTemplate = newEmailTemplate;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "EmailTemplateListType ";
	}
}
