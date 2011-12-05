package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductTrlListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductTrlListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductTrlType> productTrl = new ArrayList<ProductTrlType>();

	/**
	 * Returns the value of '<em><b>productTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productTrl</b></em>' feature
	 * @generated
	 */
	public List<ProductTrlType> getProductTrl() {
		return productTrl;
	}

	/**
	 * Adds to the <em>productTrl</em> feature.
	 * @generated
	 */
	public void addToProductTrl(ProductTrlType productTrlValue) {
		if (!productTrl.contains(productTrlValue)) {

			productTrl.add(productTrlValue);
		}

	}

	/**			
	 * Removes from the <em>productTrl</em> feature.
	 * @generated
	 */
	public void removeFromProductTrl(ProductTrlType productTrlValue) {
		if (productTrl.contains(productTrlValue)) {
			productTrl.remove(productTrlValue);
		}
	}

	/**			
	 * Clears the <em>productTrl</em> feature.
	 * @generated
	 */
	public void clearProductTrl() {
		while (!productTrl.isEmpty()) {
			removeFromProductTrl(productTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductTrlListType#getProductTrl() <em>productTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductTrlListType#getProductTrl() productTrl}' feature.
	 * @generated
	 */
	public void setProductTrl(List<ProductTrlType> newProductTrl) {
		productTrl = newProductTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductTrlListType ";
	}
}
