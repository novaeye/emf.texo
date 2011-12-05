package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ContactEmailInteractionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ContactEmailInteractionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ContactEmailInteractionType> contactEmailInteraction = new ArrayList<ContactEmailInteractionType>();

	/**
	 * Returns the value of '<em><b>contactEmailInteraction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contactEmailInteraction</b></em>' feature
	 * @generated
	 */
	public List<ContactEmailInteractionType> getContactEmailInteraction() {
		return contactEmailInteraction;
	}

	/**
	 * Adds to the <em>contactEmailInteraction</em> feature.
	 * @generated
	 */
	public void addToContactEmailInteraction(
			ContactEmailInteractionType contactEmailInteractionValue) {
		if (!contactEmailInteraction.contains(contactEmailInteractionValue)) {

			contactEmailInteraction.add(contactEmailInteractionValue);
		}

	}

	/**			
	 * Removes from the <em>contactEmailInteraction</em> feature.
	 * @generated
	 */
	public void removeFromContactEmailInteraction(
			ContactEmailInteractionType contactEmailInteractionValue) {
		if (contactEmailInteraction.contains(contactEmailInteractionValue)) {
			contactEmailInteraction.remove(contactEmailInteractionValue);
		}
	}

	/**			
	 * Clears the <em>contactEmailInteraction</em> feature.
	 * @generated
	 */
	public void clearContactEmailInteraction() {
		while (!contactEmailInteraction.isEmpty()) {
			removeFromContactEmailInteraction(contactEmailInteraction
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ContactEmailInteractionListType#getContactEmailInteraction() <em>contactEmailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ContactEmailInteractionListType#getContactEmailInteraction() contactEmailInteraction}' feature.
	 * @generated
	 */
	public void setContactEmailInteraction(
			List<ContactEmailInteractionType> newContactEmailInteraction) {
		contactEmailInteraction = newContactEmailInteraction;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ContactEmailInteractionListType ";
	}
}
