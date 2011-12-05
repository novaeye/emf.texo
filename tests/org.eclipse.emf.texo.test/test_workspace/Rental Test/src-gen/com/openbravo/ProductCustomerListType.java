package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductCustomerListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductCustomerListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductCustomerType> productCustomer = new ArrayList<ProductCustomerType>();

	/**
	 * Returns the value of '<em><b>productCustomer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCustomer</b></em>' feature
	 * @generated
	 */
	public List<ProductCustomerType> getProductCustomer() {
		return productCustomer;
	}

	/**
	 * Adds to the <em>productCustomer</em> feature.
	 * @generated
	 */
	public void addToProductCustomer(ProductCustomerType productCustomerValue) {
		if (!productCustomer.contains(productCustomerValue)) {

			productCustomer.add(productCustomerValue);
		}

	}

	/**			
	 * Removes from the <em>productCustomer</em> feature.
	 * @generated
	 */
	public void removeFromProductCustomer(
			ProductCustomerType productCustomerValue) {
		if (productCustomer.contains(productCustomerValue)) {
			productCustomer.remove(productCustomerValue);
		}
	}

	/**			
	 * Clears the <em>productCustomer</em> feature.
	 * @generated
	 */
	public void clearProductCustomer() {
		while (!productCustomer.isEmpty()) {
			removeFromProductCustomer(productCustomer.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductCustomerListType#getProductCustomer() <em>productCustomer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductCustomerListType#getProductCustomer() productCustomer}' feature.
	 * @generated
	 */
	public void setProductCustomer(List<ProductCustomerType> newProductCustomer) {
		productCustomer = newProductCustomer;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductCustomerListType ";
	}
}
