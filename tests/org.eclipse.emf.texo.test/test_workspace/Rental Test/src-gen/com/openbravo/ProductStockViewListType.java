package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductStockViewListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductStockViewListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductStockViewType> productStockView = new ArrayList<ProductStockViewType>();

	/**
	 * Returns the value of '<em><b>productStockView</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productStockView</b></em>' feature
	 * @generated
	 */
	public List<ProductStockViewType> getProductStockView() {
		return productStockView;
	}

	/**
	 * Adds to the <em>productStockView</em> feature.
	 * @generated
	 */
	public void addToProductStockView(ProductStockViewType productStockViewValue) {
		if (!productStockView.contains(productStockViewValue)) {

			productStockView.add(productStockViewValue);
		}

	}

	/**			
	 * Removes from the <em>productStockView</em> feature.
	 * @generated
	 */
	public void removeFromProductStockView(
			ProductStockViewType productStockViewValue) {
		if (productStockView.contains(productStockViewValue)) {
			productStockView.remove(productStockViewValue);
		}
	}

	/**			
	 * Clears the <em>productStockView</em> feature.
	 * @generated
	 */
	public void clearProductStockView() {
		while (!productStockView.isEmpty()) {
			removeFromProductStockView(productStockView.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductStockViewListType#getProductStockView() <em>productStockView</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductStockViewListType#getProductStockView() productStockView}' feature.
	 * @generated
	 */
	public void setProductStockView(
			List<ProductStockViewType> newProductStockView) {
		productStockView = newProductStockView;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductStockViewListType ";
	}
}
