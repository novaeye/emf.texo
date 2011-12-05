package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingPriceListSchemeLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingPriceListSchemeLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<PricingPriceListSchemeLineType> pricingPriceListSchemeLine = new ArrayList<PricingPriceListSchemeLineType>();

	/**
	 * Returns the value of '<em><b>pricingPriceListSchemeLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListSchemeLine</b></em>' feature
	 * @generated
	 */
	public List<PricingPriceListSchemeLineType> getPricingPriceListSchemeLine() {
		return pricingPriceListSchemeLine;
	}

	/**
	 * Adds to the <em>pricingPriceListSchemeLine</em> feature.
	 * @generated
	 */
	public void addToPricingPriceListSchemeLine(
			PricingPriceListSchemeLineType pricingPriceListSchemeLineValue) {
		if (!pricingPriceListSchemeLine
				.contains(pricingPriceListSchemeLineValue)) {

			pricingPriceListSchemeLine.add(pricingPriceListSchemeLineValue);
		}

	}

	/**			
	 * Removes from the <em>pricingPriceListSchemeLine</em> feature.
	 * @generated
	 */
	public void removeFromPricingPriceListSchemeLine(
			PricingPriceListSchemeLineType pricingPriceListSchemeLineValue) {
		if (pricingPriceListSchemeLine
				.contains(pricingPriceListSchemeLineValue)) {
			pricingPriceListSchemeLine.remove(pricingPriceListSchemeLineValue);
		}
	}

	/**			
	 * Clears the <em>pricingPriceListSchemeLine</em> feature.
	 * @generated
	 */
	public void clearPricingPriceListSchemeLine() {
		while (!pricingPriceListSchemeLine.isEmpty()) {
			removeFromPricingPriceListSchemeLine(pricingPriceListSchemeLine
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link PricingPriceListSchemeLineListType#getPricingPriceListSchemeLine() <em>pricingPriceListSchemeLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingPriceListSchemeLineListType#getPricingPriceListSchemeLine() pricingPriceListSchemeLine}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchemeLine(
			List<PricingPriceListSchemeLineType> newPricingPriceListSchemeLine) {
		pricingPriceListSchemeLine = newPricingPriceListSchemeLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PricingPriceListSchemeLineListType ";
	}
}
