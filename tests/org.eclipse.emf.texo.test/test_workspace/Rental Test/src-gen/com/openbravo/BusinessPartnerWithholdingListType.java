package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerWithholdingListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerWithholdingListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BusinessPartnerWithholdingType> businessPartnerWithholding = new ArrayList<BusinessPartnerWithholdingType>();

	/**
	 * Returns the value of '<em><b>businessPartnerWithholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerWithholding</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerWithholdingType> getBusinessPartnerWithholding() {
		return businessPartnerWithholding;
	}

	/**
	 * Adds to the <em>businessPartnerWithholding</em> feature.
	 * @generated
	 */
	public void addToBusinessPartnerWithholding(
			BusinessPartnerWithholdingType businessPartnerWithholdingValue) {
		if (!businessPartnerWithholding
				.contains(businessPartnerWithholdingValue)) {

			businessPartnerWithholding.add(businessPartnerWithholdingValue);
		}

	}

	/**			
	 * Removes from the <em>businessPartnerWithholding</em> feature.
	 * @generated
	 */
	public void removeFromBusinessPartnerWithholding(
			BusinessPartnerWithholdingType businessPartnerWithholdingValue) {
		if (businessPartnerWithholding
				.contains(businessPartnerWithholdingValue)) {
			businessPartnerWithholding.remove(businessPartnerWithholdingValue);
		}
	}

	/**			
	 * Clears the <em>businessPartnerWithholding</em> feature.
	 * @generated
	 */
	public void clearBusinessPartnerWithholding() {
		while (!businessPartnerWithholding.isEmpty()) {
			removeFromBusinessPartnerWithholding(businessPartnerWithholding
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BusinessPartnerWithholdingListType#getBusinessPartnerWithholding() <em>businessPartnerWithholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerWithholdingListType#getBusinessPartnerWithholding() businessPartnerWithholding}' feature.
	 * @generated
	 */
	public void setBusinessPartnerWithholding(
			List<BusinessPartnerWithholdingType> newBusinessPartnerWithholding) {
		businessPartnerWithholding = newBusinessPartnerWithholding;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BusinessPartnerWithholdingListType ";
	}
}
