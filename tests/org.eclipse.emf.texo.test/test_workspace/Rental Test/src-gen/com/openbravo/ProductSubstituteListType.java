package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductSubstituteListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductSubstituteListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductSubstituteType> productSubstitute = new ArrayList<ProductSubstituteType>();

	/**
	 * Returns the value of '<em><b>productSubstitute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productSubstitute</b></em>' feature
	 * @generated
	 */
	public List<ProductSubstituteType> getProductSubstitute() {
		return productSubstitute;
	}

	/**
	 * Adds to the <em>productSubstitute</em> feature.
	 * @generated
	 */
	public void addToProductSubstitute(
			ProductSubstituteType productSubstituteValue) {
		if (!productSubstitute.contains(productSubstituteValue)) {

			productSubstitute.add(productSubstituteValue);
		}

	}

	/**			
	 * Removes from the <em>productSubstitute</em> feature.
	 * @generated
	 */
	public void removeFromProductSubstitute(
			ProductSubstituteType productSubstituteValue) {
		if (productSubstitute.contains(productSubstituteValue)) {
			productSubstitute.remove(productSubstituteValue);
		}
	}

	/**			
	 * Clears the <em>productSubstitute</em> feature.
	 * @generated
	 */
	public void clearProductSubstitute() {
		while (!productSubstitute.isEmpty()) {
			removeFromProductSubstitute(productSubstitute.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductSubstituteListType#getProductSubstitute() <em>productSubstitute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductSubstituteListType#getProductSubstitute() productSubstitute}' feature.
	 * @generated
	 */
	public void setProductSubstitute(
			List<ProductSubstituteType> newProductSubstitute) {
		productSubstitute = newProductSubstitute;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductSubstituteListType ";
	}
}
