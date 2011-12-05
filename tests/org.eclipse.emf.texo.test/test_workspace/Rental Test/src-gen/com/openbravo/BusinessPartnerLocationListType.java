package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerLocationListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerLocationListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BusinessPartnerLocationType> businessPartnerLocation = new ArrayList<BusinessPartnerLocationType>();

	/**
	 * Returns the value of '<em><b>businessPartnerLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerLocation</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerLocationType> getBusinessPartnerLocation() {
		return businessPartnerLocation;
	}

	/**
	 * Adds to the <em>businessPartnerLocation</em> feature.
	 * @generated
	 */
	public void addToBusinessPartnerLocation(
			BusinessPartnerLocationType businessPartnerLocationValue) {
		if (!businessPartnerLocation.contains(businessPartnerLocationValue)) {

			businessPartnerLocation.add(businessPartnerLocationValue);
		}

	}

	/**			
	 * Removes from the <em>businessPartnerLocation</em> feature.
	 * @generated
	 */
	public void removeFromBusinessPartnerLocation(
			BusinessPartnerLocationType businessPartnerLocationValue) {
		if (businessPartnerLocation.contains(businessPartnerLocationValue)) {
			businessPartnerLocation.remove(businessPartnerLocationValue);
		}
	}

	/**			
	 * Clears the <em>businessPartnerLocation</em> feature.
	 * @generated
	 */
	public void clearBusinessPartnerLocation() {
		while (!businessPartnerLocation.isEmpty()) {
			removeFromBusinessPartnerLocation(businessPartnerLocation
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BusinessPartnerLocationListType#getBusinessPartnerLocation() <em>businessPartnerLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerLocationListType#getBusinessPartnerLocation() businessPartnerLocation}' feature.
	 * @generated
	 */
	public void setBusinessPartnerLocation(
			List<BusinessPartnerLocationType> newBusinessPartnerLocation) {
		businessPartnerLocation = newBusinessPartnerLocation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BusinessPartnerLocationListType ";
	}
}
