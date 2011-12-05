package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductCategoryAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductCategoryAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductCategoryAccountsType> productCategoryAccounts = new ArrayList<ProductCategoryAccountsType>();

	/**
	 * Returns the value of '<em><b>productCategoryAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccounts</b></em>' feature
	 * @generated
	 */
	public List<ProductCategoryAccountsType> getProductCategoryAccounts() {
		return productCategoryAccounts;
	}

	/**
	 * Adds to the <em>productCategoryAccounts</em> feature.
	 * @generated
	 */
	public void addToProductCategoryAccounts(
			ProductCategoryAccountsType productCategoryAccountsValue) {
		if (!productCategoryAccounts.contains(productCategoryAccountsValue)) {

			productCategoryAccounts.add(productCategoryAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>productCategoryAccounts</em> feature.
	 * @generated
	 */
	public void removeFromProductCategoryAccounts(
			ProductCategoryAccountsType productCategoryAccountsValue) {
		if (productCategoryAccounts.contains(productCategoryAccountsValue)) {
			productCategoryAccounts.remove(productCategoryAccountsValue);
		}
	}

	/**			
	 * Clears the <em>productCategoryAccounts</em> feature.
	 * @generated
	 */
	public void clearProductCategoryAccounts() {
		while (!productCategoryAccounts.isEmpty()) {
			removeFromProductCategoryAccounts(productCategoryAccounts
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductCategoryAccountsListType#getProductCategoryAccounts() <em>productCategoryAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductCategoryAccountsListType#getProductCategoryAccounts() productCategoryAccounts}' feature.
	 * @generated
	 */
	public void setProductCategoryAccounts(
			List<ProductCategoryAccountsType> newProductCategoryAccounts) {
		productCategoryAccounts = newProductCategoryAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductCategoryAccountsListType ";
	}
}
