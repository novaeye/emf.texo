package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductAccountsType> productAccounts = new ArrayList<ProductAccountsType>();

	/**
	 * Returns the value of '<em><b>productAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccounts</b></em>' feature
	 * @generated
	 */
	public List<ProductAccountsType> getProductAccounts() {
		return productAccounts;
	}

	/**
	 * Adds to the <em>productAccounts</em> feature.
	 * @generated
	 */
	public void addToProductAccounts(ProductAccountsType productAccountsValue) {
		if (!productAccounts.contains(productAccountsValue)) {

			productAccounts.add(productAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>productAccounts</em> feature.
	 * @generated
	 */
	public void removeFromProductAccounts(
			ProductAccountsType productAccountsValue) {
		if (productAccounts.contains(productAccountsValue)) {
			productAccounts.remove(productAccountsValue);
		}
	}

	/**			
	 * Clears the <em>productAccounts</em> feature.
	 * @generated
	 */
	public void clearProductAccounts() {
		while (!productAccounts.isEmpty()) {
			removeFromProductAccounts(productAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductAccountsListType1#getProductAccounts() <em>productAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductAccountsListType1#getProductAccounts() productAccounts}' feature.
	 * @generated
	 */
	public void setProductAccounts(List<ProductAccountsType> newProductAccounts) {
		productAccounts = newProductAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductAccountsListType1 ";
	}
}
