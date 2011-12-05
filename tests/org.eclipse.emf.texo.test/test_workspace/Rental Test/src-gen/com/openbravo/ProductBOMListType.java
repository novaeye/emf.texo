package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductBOMListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductBOMListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductBOMType> productBOM = new ArrayList<ProductBOMType>();

	/**
	 * Returns the value of '<em><b>productBOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productBOM</b></em>' feature
	 * @generated
	 */
	public List<ProductBOMType> getProductBOM() {
		return productBOM;
	}

	/**
	 * Adds to the <em>productBOM</em> feature.
	 * @generated
	 */
	public void addToProductBOM(ProductBOMType productBOMValue) {
		if (!productBOM.contains(productBOMValue)) {

			productBOM.add(productBOMValue);
		}

	}

	/**			
	 * Removes from the <em>productBOM</em> feature.
	 * @generated
	 */
	public void removeFromProductBOM(ProductBOMType productBOMValue) {
		if (productBOM.contains(productBOMValue)) {
			productBOM.remove(productBOMValue);
		}
	}

	/**			
	 * Clears the <em>productBOM</em> feature.
	 * @generated
	 */
	public void clearProductBOM() {
		while (!productBOM.isEmpty()) {
			removeFromProductBOM(productBOM.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductBOMListType#getProductBOM() <em>productBOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductBOMListType#getProductBOM() productBOM}' feature.
	 * @generated
	 */
	public void setProductBOM(List<ProductBOMType> newProductBOM) {
		productBOM = newProductBOM;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductBOMListType ";
	}
}
