package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ClientInformationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ClientInformationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ClientInformationType> clientInformation = new ArrayList<ClientInformationType>();

	/**
	 * Returns the value of '<em><b>clientInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformation</b></em>' feature
	 * @generated
	 */
	public List<ClientInformationType> getClientInformation() {
		return clientInformation;
	}

	/**
	 * Adds to the <em>clientInformation</em> feature.
	 * @generated
	 */
	public void addToClientInformation(
			ClientInformationType clientInformationValue) {
		if (!clientInformation.contains(clientInformationValue)) {

			clientInformation.add(clientInformationValue);
		}

	}

	/**			
	 * Removes from the <em>clientInformation</em> feature.
	 * @generated
	 */
	public void removeFromClientInformation(
			ClientInformationType clientInformationValue) {
		if (clientInformation.contains(clientInformationValue)) {
			clientInformation.remove(clientInformationValue);
		}
	}

	/**			
	 * Clears the <em>clientInformation</em> feature.
	 * @generated
	 */
	public void clearClientInformation() {
		while (!clientInformation.isEmpty()) {
			removeFromClientInformation(clientInformation.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ClientInformationListType#getClientInformation() <em>clientInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ClientInformationListType#getClientInformation() clientInformation}' feature.
	 * @generated
	 */
	public void setClientInformation(
			List<ClientInformationType> newClientInformation) {
		clientInformation = newClientInformation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ClientInformationListType ";
	}
}
