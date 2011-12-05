package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingPriceListVersionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingPriceListVersionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingPriceListVersionType> pricingPriceListVersion = new ArrayList<PricingPriceListVersionType>();

	/**
	 * Returns the value of '<em><b>pricingPriceListVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListVersion</b></em>' feature
	 * @generated
	 */
	public List<PricingPriceListVersionType> getPricingPriceListVersion() {
		return pricingPriceListVersion;
	}

	/**
	 * Adds to the <em>pricingPriceListVersion</em> feature.
	 * @generated
	 */
	public void addToPricingPriceListVersion(
			PricingPriceListVersionType pricingPriceListVersionValue) {
		if (!pricingPriceListVersion.contains(pricingPriceListVersionValue)) {

			pricingPriceListVersion.add(pricingPriceListVersionValue);
		}

	}

	/**			
	 * Removes from the <em>pricingPriceListVersion</em> feature.
	 * @generated
	 */
	public void removeFromPricingPriceListVersion(
			PricingPriceListVersionType pricingPriceListVersionValue) {
		if (pricingPriceListVersion.contains(pricingPriceListVersionValue)) {
			pricingPriceListVersion.remove(pricingPriceListVersionValue);
		}
	}

	/**			
	 * Clears the <em>pricingPriceListVersion</em> feature.
	 * @generated
	 */
	public void clearPricingPriceListVersion() {
		while (!pricingPriceListVersion.isEmpty()) {
			removeFromPricingPriceListVersion(pricingPriceListVersion
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingPriceListVersionListType#getPricingPriceListVersion() <em>pricingPriceListVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingPriceListVersionListType#getPricingPriceListVersion() pricingPriceListVersion}' feature.
	 * @generated
	 */
	public void setPricingPriceListVersion(
			List<PricingPriceListVersionType> newPricingPriceListVersion) {
		pricingPriceListVersion = newPricingPriceListVersion;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingPriceListVersionListType ";
	}
}
