package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingAdjustmentBusinessPartnerGroupListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingAdjustmentBusinessPartnerGroupListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingAdjustmentBusinessPartnerGroupType> pricingAdjustmentBusinessPartnerGroup = new ArrayList<PricingAdjustmentBusinessPartnerGroupType>();

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartnerGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartnerGroup</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentBusinessPartnerGroupType> getPricingAdjustmentBusinessPartnerGroup() {
		return pricingAdjustmentBusinessPartnerGroup;
	}

	/**
	 * Adds to the <em>pricingAdjustmentBusinessPartnerGroup</em> feature.
	 * @generated
	 */
	public void addToPricingAdjustmentBusinessPartnerGroup(
			PricingAdjustmentBusinessPartnerGroupType pricingAdjustmentBusinessPartnerGroupValue) {
		if (!pricingAdjustmentBusinessPartnerGroup
				.contains(pricingAdjustmentBusinessPartnerGroupValue)) {

			pricingAdjustmentBusinessPartnerGroup
					.add(pricingAdjustmentBusinessPartnerGroupValue);
		}

	}

	/**			
	 * Removes from the <em>pricingAdjustmentBusinessPartnerGroup</em> feature.
	 * @generated
	 */
	public void removeFromPricingAdjustmentBusinessPartnerGroup(
			PricingAdjustmentBusinessPartnerGroupType pricingAdjustmentBusinessPartnerGroupValue) {
		if (pricingAdjustmentBusinessPartnerGroup
				.contains(pricingAdjustmentBusinessPartnerGroupValue)) {
			pricingAdjustmentBusinessPartnerGroup
					.remove(pricingAdjustmentBusinessPartnerGroupValue);
		}
	}

	/**			
	 * Clears the <em>pricingAdjustmentBusinessPartnerGroup</em> feature.
	 * @generated
	 */
	public void clearPricingAdjustmentBusinessPartnerGroup() {
		while (!pricingAdjustmentBusinessPartnerGroup.isEmpty()) {
			removeFromPricingAdjustmentBusinessPartnerGroup(pricingAdjustmentBusinessPartnerGroup
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingAdjustmentBusinessPartnerGroupListType#getPricingAdjustmentBusinessPartnerGroup() <em>pricingAdjustmentBusinessPartnerGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentBusinessPartnerGroupListType#getPricingAdjustmentBusinessPartnerGroup() pricingAdjustmentBusinessPartnerGroup}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartnerGroup(
			List<PricingAdjustmentBusinessPartnerGroupType> newPricingAdjustmentBusinessPartnerGroup) {
		pricingAdjustmentBusinessPartnerGroup = newPricingAdjustmentBusinessPartnerGroup;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingAdjustmentBusinessPartnerGroupListType ";
	}
}
