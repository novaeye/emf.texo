package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductUOMListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductUOMListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductUOMType> productUOM = new ArrayList<ProductUOMType>();

	/**
	 * Returns the value of '<em><b>productUOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productUOM</b></em>' feature
	 * @generated
	 */
	public List<ProductUOMType> getProductUOM() {
		return productUOM;
	}

	/**
	 * Adds to the <em>productUOM</em> feature.
	 * @generated
	 */
	public void addToProductUOM(ProductUOMType productUOMValue) {
		if (!productUOM.contains(productUOMValue)) {

			productUOM.add(productUOMValue);
		}

	}

	/**			
	 * Removes from the <em>productUOM</em> feature.
	 * @generated
	 */
	public void removeFromProductUOM(ProductUOMType productUOMValue) {
		if (productUOM.contains(productUOMValue)) {
			productUOM.remove(productUOMValue);
		}
	}

	/**			
	 * Clears the <em>productUOM</em> feature.
	 * @generated
	 */
	public void clearProductUOM() {
		while (!productUOM.isEmpty()) {
			removeFromProductUOM(productUOM.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductUOMListType#getProductUOM() <em>productUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMListType#getProductUOM() productUOM}' feature.
	 * @generated
	 */
	public void setProductUOM(List<ProductUOMType> newProductUOM) {
		productUOM = newProductUOM;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductUOMListType ";
	}
}
