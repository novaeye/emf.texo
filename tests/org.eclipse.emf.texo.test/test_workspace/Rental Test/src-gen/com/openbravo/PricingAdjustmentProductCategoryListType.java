package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingAdjustmentProductCategoryListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingAdjustmentProductCategoryListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingAdjustmentProductCategoryType> pricingAdjustmentProductCategory = new ArrayList<PricingAdjustmentProductCategoryType>();

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProductCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProductCategory</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentProductCategoryType> getPricingAdjustmentProductCategory() {
		return pricingAdjustmentProductCategory;
	}

	/**
	 * Adds to the <em>pricingAdjustmentProductCategory</em> feature.
	 * @generated
	 */
	public void addToPricingAdjustmentProductCategory(
			PricingAdjustmentProductCategoryType pricingAdjustmentProductCategoryValue) {
		if (!pricingAdjustmentProductCategory
				.contains(pricingAdjustmentProductCategoryValue)) {

			pricingAdjustmentProductCategory
					.add(pricingAdjustmentProductCategoryValue);
		}

	}

	/**			
	 * Removes from the <em>pricingAdjustmentProductCategory</em> feature.
	 * @generated
	 */
	public void removeFromPricingAdjustmentProductCategory(
			PricingAdjustmentProductCategoryType pricingAdjustmentProductCategoryValue) {
		if (pricingAdjustmentProductCategory
				.contains(pricingAdjustmentProductCategoryValue)) {
			pricingAdjustmentProductCategory
					.remove(pricingAdjustmentProductCategoryValue);
		}
	}

	/**			
	 * Clears the <em>pricingAdjustmentProductCategory</em> feature.
	 * @generated
	 */
	public void clearPricingAdjustmentProductCategory() {
		while (!pricingAdjustmentProductCategory.isEmpty()) {
			removeFromPricingAdjustmentProductCategory(pricingAdjustmentProductCategory
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingAdjustmentProductCategoryListType#getPricingAdjustmentProductCategory() <em>pricingAdjustmentProductCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentProductCategoryListType#getPricingAdjustmentProductCategory() pricingAdjustmentProductCategory}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProductCategory(
			List<PricingAdjustmentProductCategoryType> newPricingAdjustmentProductCategory) {
		pricingAdjustmentProductCategory = newPricingAdjustmentProductCategory;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingAdjustmentProductCategoryListType ";
	}
}
