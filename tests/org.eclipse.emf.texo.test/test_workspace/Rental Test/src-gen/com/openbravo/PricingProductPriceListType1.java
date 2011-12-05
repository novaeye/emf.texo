package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingProductPriceListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingProductPriceListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingProductPriceType> pricingProductPrice = new ArrayList<PricingProductPriceType>();

	/**
	 * Returns the value of '<em><b>pricingProductPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingProductPrice</b></em>' feature
	 * @generated
	 */
	public List<PricingProductPriceType> getPricingProductPrice() {
		return pricingProductPrice;
	}

	/**
	 * Adds to the <em>pricingProductPrice</em> feature.
	 * @generated
	 */
	public void addToPricingProductPrice(
			PricingProductPriceType pricingProductPriceValue) {
		if (!pricingProductPrice.contains(pricingProductPriceValue)) {

			pricingProductPrice.add(pricingProductPriceValue);
		}

	}

	/**			
	 * Removes from the <em>pricingProductPrice</em> feature.
	 * @generated
	 */
	public void removeFromPricingProductPrice(
			PricingProductPriceType pricingProductPriceValue) {
		if (pricingProductPrice.contains(pricingProductPriceValue)) {
			pricingProductPrice.remove(pricingProductPriceValue);
		}
	}

	/**			
	 * Clears the <em>pricingProductPrice</em> feature.
	 * @generated
	 */
	public void clearPricingProductPrice() {
		while (!pricingProductPrice.isEmpty()) {
			removeFromPricingProductPrice(pricingProductPrice.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingProductPriceListType1#getPricingProductPrice() <em>pricingProductPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingProductPriceListType1#getPricingProductPrice() pricingProductPrice}' feature.
	 * @generated
	 */
	public void setPricingProductPrice(
			List<PricingProductPriceType> newPricingProductPrice) {
		pricingProductPrice = newPricingProductPrice;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingProductPriceListType1 ";
	}
}
