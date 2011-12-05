package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingVolumeDiscountBusinessPartnerListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingVolumeDiscountBusinessPartnerListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingVolumeDiscountBusinessPartnerType> pricingVolumeDiscountBusinessPartner = new ArrayList<PricingVolumeDiscountBusinessPartnerType>();

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountBusinessPartner</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountBusinessPartnerType> getPricingVolumeDiscountBusinessPartner() {
		return pricingVolumeDiscountBusinessPartner;
	}

	/**
	 * Adds to the <em>pricingVolumeDiscountBusinessPartner</em> feature.
	 * @generated
	 */
	public void addToPricingVolumeDiscountBusinessPartner(
			PricingVolumeDiscountBusinessPartnerType pricingVolumeDiscountBusinessPartnerValue) {
		if (!pricingVolumeDiscountBusinessPartner
				.contains(pricingVolumeDiscountBusinessPartnerValue)) {

			pricingVolumeDiscountBusinessPartner
					.add(pricingVolumeDiscountBusinessPartnerValue);
		}

	}

	/**			
	 * Removes from the <em>pricingVolumeDiscountBusinessPartner</em> feature.
	 * @generated
	 */
	public void removeFromPricingVolumeDiscountBusinessPartner(
			PricingVolumeDiscountBusinessPartnerType pricingVolumeDiscountBusinessPartnerValue) {
		if (pricingVolumeDiscountBusinessPartner
				.contains(pricingVolumeDiscountBusinessPartnerValue)) {
			pricingVolumeDiscountBusinessPartner
					.remove(pricingVolumeDiscountBusinessPartnerValue);
		}
	}

	/**			
	 * Clears the <em>pricingVolumeDiscountBusinessPartner</em> feature.
	 * @generated
	 */
	public void clearPricingVolumeDiscountBusinessPartner() {
		while (!pricingVolumeDiscountBusinessPartner.isEmpty()) {
			removeFromPricingVolumeDiscountBusinessPartner(pricingVolumeDiscountBusinessPartner
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingVolumeDiscountBusinessPartnerListType#getPricingVolumeDiscountBusinessPartner() <em>pricingVolumeDiscountBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingVolumeDiscountBusinessPartnerListType#getPricingVolumeDiscountBusinessPartner() pricingVolumeDiscountBusinessPartner}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountBusinessPartner(
			List<PricingVolumeDiscountBusinessPartnerType> newPricingVolumeDiscountBusinessPartner) {
		pricingVolumeDiscountBusinessPartner = newPricingVolumeDiscountBusinessPartner;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingVolumeDiscountBusinessPartnerListType ";
	}
}
