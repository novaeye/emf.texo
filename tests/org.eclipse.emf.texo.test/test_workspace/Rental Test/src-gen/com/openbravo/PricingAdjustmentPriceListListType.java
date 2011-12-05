package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingAdjustmentPriceListListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingAdjustmentPriceListListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingAdjustmentPriceListType> pricingAdjustmentPriceList = new ArrayList<PricingAdjustmentPriceListType>();

	/**
	 * Returns the value of '<em><b>pricingAdjustmentPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentPriceList</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentPriceListType> getPricingAdjustmentPriceList() {
		return pricingAdjustmentPriceList;
	}

	/**
	 * Adds to the <em>pricingAdjustmentPriceList</em> feature.
	 * @generated
	 */
	public void addToPricingAdjustmentPriceList(
			PricingAdjustmentPriceListType pricingAdjustmentPriceListValue) {
		if (!pricingAdjustmentPriceList
				.contains(pricingAdjustmentPriceListValue)) {

			pricingAdjustmentPriceList.add(pricingAdjustmentPriceListValue);
		}

	}

	/**			
	 * Removes from the <em>pricingAdjustmentPriceList</em> feature.
	 * @generated
	 */
	public void removeFromPricingAdjustmentPriceList(
			PricingAdjustmentPriceListType pricingAdjustmentPriceListValue) {
		if (pricingAdjustmentPriceList
				.contains(pricingAdjustmentPriceListValue)) {
			pricingAdjustmentPriceList.remove(pricingAdjustmentPriceListValue);
		}
	}

	/**			
	 * Clears the <em>pricingAdjustmentPriceList</em> feature.
	 * @generated
	 */
	public void clearPricingAdjustmentPriceList() {
		while (!pricingAdjustmentPriceList.isEmpty()) {
			removeFromPricingAdjustmentPriceList(pricingAdjustmentPriceList
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingAdjustmentPriceListListType#getPricingAdjustmentPriceList() <em>pricingAdjustmentPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentPriceListListType#getPricingAdjustmentPriceList() pricingAdjustmentPriceList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentPriceList(
			List<PricingAdjustmentPriceListType> newPricingAdjustmentPriceList) {
		pricingAdjustmentPriceList = newPricingAdjustmentPriceList;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingAdjustmentPriceListListType ";
	}
}
