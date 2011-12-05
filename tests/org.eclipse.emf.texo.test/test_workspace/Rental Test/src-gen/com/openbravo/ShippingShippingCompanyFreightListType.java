package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ShippingShippingCompanyFreightListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ShippingShippingCompanyFreightListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ShippingShippingCompanyFreightType> shippingShippingCompanyFreight = new ArrayList<ShippingShippingCompanyFreightType>();

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyFreight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyFreight</b></em>' feature
	 * @generated
	 */
	public List<ShippingShippingCompanyFreightType> getShippingShippingCompanyFreight() {
		return shippingShippingCompanyFreight;
	}

	/**
	 * Adds to the <em>shippingShippingCompanyFreight</em> feature.
	 * @generated
	 */
	public void addToShippingShippingCompanyFreight(
			ShippingShippingCompanyFreightType shippingShippingCompanyFreightValue) {
		if (!shippingShippingCompanyFreight
				.contains(shippingShippingCompanyFreightValue)) {

			shippingShippingCompanyFreight
					.add(shippingShippingCompanyFreightValue);
		}

	}

	/**			
	 * Removes from the <em>shippingShippingCompanyFreight</em> feature.
	 * @generated
	 */
	public void removeFromShippingShippingCompanyFreight(
			ShippingShippingCompanyFreightType shippingShippingCompanyFreightValue) {
		if (shippingShippingCompanyFreight
				.contains(shippingShippingCompanyFreightValue)) {
			shippingShippingCompanyFreight
					.remove(shippingShippingCompanyFreightValue);
		}
	}

	/**			
	 * Clears the <em>shippingShippingCompanyFreight</em> feature.
	 * @generated
	 */
	public void clearShippingShippingCompanyFreight() {
		while (!shippingShippingCompanyFreight.isEmpty()) {
			removeFromShippingShippingCompanyFreight(shippingShippingCompanyFreight
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightListType#getShippingShippingCompanyFreight() <em>shippingShippingCompanyFreight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightListType#getShippingShippingCompanyFreight() shippingShippingCompanyFreight}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyFreight(
			List<ShippingShippingCompanyFreightType> newShippingShippingCompanyFreight) {
		shippingShippingCompanyFreight = newShippingShippingCompanyFreight;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ShippingShippingCompanyFreightListType ";
	}
}
