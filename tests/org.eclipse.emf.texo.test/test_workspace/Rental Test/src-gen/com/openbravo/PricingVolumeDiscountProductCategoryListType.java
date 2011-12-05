package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingVolumeDiscountProductCategoryListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingVolumeDiscountProductCategoryListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingVolumeDiscountProductCategoryType> pricingVolumeDiscountProductCategory = new ArrayList<PricingVolumeDiscountProductCategoryType>();

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProductCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProductCategory</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountProductCategoryType> getPricingVolumeDiscountProductCategory() {
		return pricingVolumeDiscountProductCategory;
	}

	/**
	 * Adds to the <em>pricingVolumeDiscountProductCategory</em> feature.
	 * @generated
	 */
	public void addToPricingVolumeDiscountProductCategory(
			PricingVolumeDiscountProductCategoryType pricingVolumeDiscountProductCategoryValue) {
		if (!pricingVolumeDiscountProductCategory
				.contains(pricingVolumeDiscountProductCategoryValue)) {

			pricingVolumeDiscountProductCategory
					.add(pricingVolumeDiscountProductCategoryValue);
		}

	}

	/**			
	 * Removes from the <em>pricingVolumeDiscountProductCategory</em> feature.
	 * @generated
	 */
	public void removeFromPricingVolumeDiscountProductCategory(
			PricingVolumeDiscountProductCategoryType pricingVolumeDiscountProductCategoryValue) {
		if (pricingVolumeDiscountProductCategory
				.contains(pricingVolumeDiscountProductCategoryValue)) {
			pricingVolumeDiscountProductCategory
					.remove(pricingVolumeDiscountProductCategoryValue);
		}
	}

	/**			
	 * Clears the <em>pricingVolumeDiscountProductCategory</em> feature.
	 * @generated
	 */
	public void clearPricingVolumeDiscountProductCategory() {
		while (!pricingVolumeDiscountProductCategory.isEmpty()) {
			removeFromPricingVolumeDiscountProductCategory(pricingVolumeDiscountProductCategory
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingVolumeDiscountProductCategoryListType#getPricingVolumeDiscountProductCategory() <em>pricingVolumeDiscountProductCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingVolumeDiscountProductCategoryListType#getPricingVolumeDiscountProductCategory() pricingVolumeDiscountProductCategory}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProductCategory(
			List<PricingVolumeDiscountProductCategoryType> newPricingVolumeDiscountProductCategory) {
		pricingVolumeDiscountProductCategory = newPricingVolumeDiscountProductCategory;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingVolumeDiscountProductCategoryListType ";
	}
}
