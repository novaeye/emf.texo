package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingVolumeDiscountProductListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingVolumeDiscountProductListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingVolumeDiscountProductType> pricingVolumeDiscountProduct = new ArrayList<PricingVolumeDiscountProductType>();

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProduct</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountProductType> getPricingVolumeDiscountProduct() {
		return pricingVolumeDiscountProduct;
	}

	/**
	 * Adds to the <em>pricingVolumeDiscountProduct</em> feature.
	 * @generated
	 */
	public void addToPricingVolumeDiscountProduct(
			PricingVolumeDiscountProductType pricingVolumeDiscountProductValue) {
		if (!pricingVolumeDiscountProduct
				.contains(pricingVolumeDiscountProductValue)) {

			pricingVolumeDiscountProduct.add(pricingVolumeDiscountProductValue);
		}

	}

	/**			
	 * Removes from the <em>pricingVolumeDiscountProduct</em> feature.
	 * @generated
	 */
	public void removeFromPricingVolumeDiscountProduct(
			PricingVolumeDiscountProductType pricingVolumeDiscountProductValue) {
		if (pricingVolumeDiscountProduct
				.contains(pricingVolumeDiscountProductValue)) {
			pricingVolumeDiscountProduct
					.remove(pricingVolumeDiscountProductValue);
		}
	}

	/**			
	 * Clears the <em>pricingVolumeDiscountProduct</em> feature.
	 * @generated
	 */
	public void clearPricingVolumeDiscountProduct() {
		while (!pricingVolumeDiscountProduct.isEmpty()) {
			removeFromPricingVolumeDiscountProduct(pricingVolumeDiscountProduct
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingVolumeDiscountProductListType#getPricingVolumeDiscountProduct() <em>pricingVolumeDiscountProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingVolumeDiscountProductListType#getPricingVolumeDiscountProduct() pricingVolumeDiscountProduct}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProduct(
			List<PricingVolumeDiscountProductType> newPricingVolumeDiscountProduct) {
		pricingVolumeDiscountProduct = newPricingVolumeDiscountProduct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingVolumeDiscountProductListType ";
	}
}
