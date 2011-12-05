package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingAdjustmentBusinessPartnerListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingAdjustmentBusinessPartnerListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingAdjustmentBusinessPartnerType> pricingAdjustmentBusinessPartner = new ArrayList<PricingAdjustmentBusinessPartnerType>();

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartner</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentBusinessPartnerType> getPricingAdjustmentBusinessPartner() {
		return pricingAdjustmentBusinessPartner;
	}

	/**
	 * Adds to the <em>pricingAdjustmentBusinessPartner</em> feature.
	 * @generated
	 */
	public void addToPricingAdjustmentBusinessPartner(
			PricingAdjustmentBusinessPartnerType pricingAdjustmentBusinessPartnerValue) {
		if (!pricingAdjustmentBusinessPartner
				.contains(pricingAdjustmentBusinessPartnerValue)) {

			pricingAdjustmentBusinessPartner
					.add(pricingAdjustmentBusinessPartnerValue);
		}

	}

	/**			
	 * Removes from the <em>pricingAdjustmentBusinessPartner</em> feature.
	 * @generated
	 */
	public void removeFromPricingAdjustmentBusinessPartner(
			PricingAdjustmentBusinessPartnerType pricingAdjustmentBusinessPartnerValue) {
		if (pricingAdjustmentBusinessPartner
				.contains(pricingAdjustmentBusinessPartnerValue)) {
			pricingAdjustmentBusinessPartner
					.remove(pricingAdjustmentBusinessPartnerValue);
		}
	}

	/**			
	 * Clears the <em>pricingAdjustmentBusinessPartner</em> feature.
	 * @generated
	 */
	public void clearPricingAdjustmentBusinessPartner() {
		while (!pricingAdjustmentBusinessPartner.isEmpty()) {
			removeFromPricingAdjustmentBusinessPartner(pricingAdjustmentBusinessPartner
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingAdjustmentBusinessPartnerListType#getPricingAdjustmentBusinessPartner() <em>pricingAdjustmentBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentBusinessPartnerListType#getPricingAdjustmentBusinessPartner() pricingAdjustmentBusinessPartner}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartner(
			List<PricingAdjustmentBusinessPartnerType> newPricingAdjustmentBusinessPartner) {
		pricingAdjustmentBusinessPartner = newPricingAdjustmentBusinessPartner;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingAdjustmentBusinessPartnerListType ";
	}
}
