package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerDiscountListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerDiscountListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BusinessPartnerDiscountType> businessPartnerDiscount = new ArrayList<BusinessPartnerDiscountType>();

	/**
	 * Returns the value of '<em><b>businessPartnerDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerDiscount</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerDiscountType> getBusinessPartnerDiscount() {
		return businessPartnerDiscount;
	}

	/**
	 * Adds to the <em>businessPartnerDiscount</em> feature.
	 * @generated
	 */
	public void addToBusinessPartnerDiscount(
			BusinessPartnerDiscountType businessPartnerDiscountValue) {
		if (!businessPartnerDiscount.contains(businessPartnerDiscountValue)) {

			businessPartnerDiscount.add(businessPartnerDiscountValue);
		}

	}

	/**			
	 * Removes from the <em>businessPartnerDiscount</em> feature.
	 * @generated
	 */
	public void removeFromBusinessPartnerDiscount(
			BusinessPartnerDiscountType businessPartnerDiscountValue) {
		if (businessPartnerDiscount.contains(businessPartnerDiscountValue)) {
			businessPartnerDiscount.remove(businessPartnerDiscountValue);
		}
	}

	/**			
	 * Clears the <em>businessPartnerDiscount</em> feature.
	 * @generated
	 */
	public void clearBusinessPartnerDiscount() {
		while (!businessPartnerDiscount.isEmpty()) {
			removeFromBusinessPartnerDiscount(businessPartnerDiscount
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BusinessPartnerDiscountListType#getBusinessPartnerDiscount() <em>businessPartnerDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerDiscountListType#getBusinessPartnerDiscount() businessPartnerDiscount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerDiscount(
			List<BusinessPartnerDiscountType> newBusinessPartnerDiscount) {
		businessPartnerDiscount = newBusinessPartnerDiscount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BusinessPartnerDiscountListType ";
	}
}
