package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingAdjustmentProductListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingAdjustmentProductListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingAdjustmentProductType> pricingAdjustmentProduct = new ArrayList<PricingAdjustmentProductType>();

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProduct</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentProductType> getPricingAdjustmentProduct() {
		return pricingAdjustmentProduct;
	}

	/**
	 * Adds to the <em>pricingAdjustmentProduct</em> feature.
	 * @generated
	 */
	public void addToPricingAdjustmentProduct(
			PricingAdjustmentProductType pricingAdjustmentProductValue) {
		if (!pricingAdjustmentProduct.contains(pricingAdjustmentProductValue)) {

			pricingAdjustmentProduct.add(pricingAdjustmentProductValue);
		}

	}

	/**			
	 * Removes from the <em>pricingAdjustmentProduct</em> feature.
	 * @generated
	 */
	public void removeFromPricingAdjustmentProduct(
			PricingAdjustmentProductType pricingAdjustmentProductValue) {
		if (pricingAdjustmentProduct.contains(pricingAdjustmentProductValue)) {
			pricingAdjustmentProduct.remove(pricingAdjustmentProductValue);
		}
	}

	/**			
	 * Clears the <em>pricingAdjustmentProduct</em> feature.
	 * @generated
	 */
	public void clearPricingAdjustmentProduct() {
		while (!pricingAdjustmentProduct.isEmpty()) {
			removeFromPricingAdjustmentProduct(pricingAdjustmentProduct
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingAdjustmentProductListType#getPricingAdjustmentProduct() <em>pricingAdjustmentProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentProductListType#getPricingAdjustmentProduct() pricingAdjustmentProduct}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProduct(
			List<PricingAdjustmentProductType> newPricingAdjustmentProduct) {
		pricingAdjustmentProduct = newPricingAdjustmentProduct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingAdjustmentProductListType ";
	}
}
