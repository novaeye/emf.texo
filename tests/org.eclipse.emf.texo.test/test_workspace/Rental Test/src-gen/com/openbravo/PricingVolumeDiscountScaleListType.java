package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingVolumeDiscountScaleListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingVolumeDiscountScaleListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingVolumeDiscountScaleType> pricingVolumeDiscountScale = new ArrayList<PricingVolumeDiscountScaleType>();

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountScale</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountScale</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountScaleType> getPricingVolumeDiscountScale() {
		return pricingVolumeDiscountScale;
	}

	/**
	 * Adds to the <em>pricingVolumeDiscountScale</em> feature.
	 * @generated
	 */
	public void addToPricingVolumeDiscountScale(
			PricingVolumeDiscountScaleType pricingVolumeDiscountScaleValue) {
		if (!pricingVolumeDiscountScale
				.contains(pricingVolumeDiscountScaleValue)) {

			pricingVolumeDiscountScale.add(pricingVolumeDiscountScaleValue);
		}

	}

	/**			
	 * Removes from the <em>pricingVolumeDiscountScale</em> feature.
	 * @generated
	 */
	public void removeFromPricingVolumeDiscountScale(
			PricingVolumeDiscountScaleType pricingVolumeDiscountScaleValue) {
		if (pricingVolumeDiscountScale
				.contains(pricingVolumeDiscountScaleValue)) {
			pricingVolumeDiscountScale.remove(pricingVolumeDiscountScaleValue);
		}
	}

	/**			
	 * Clears the <em>pricingVolumeDiscountScale</em> feature.
	 * @generated
	 */
	public void clearPricingVolumeDiscountScale() {
		while (!pricingVolumeDiscountScale.isEmpty()) {
			removeFromPricingVolumeDiscountScale(pricingVolumeDiscountScale
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingVolumeDiscountScaleListType#getPricingVolumeDiscountScale() <em>pricingVolumeDiscountScale</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingVolumeDiscountScaleListType#getPricingVolumeDiscountScale() pricingVolumeDiscountScale}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountScale(
			List<PricingVolumeDiscountScaleType> newPricingVolumeDiscountScale) {
		pricingVolumeDiscountScale = newPricingVolumeDiscountScale;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingVolumeDiscountScaleListType ";
	}
}
