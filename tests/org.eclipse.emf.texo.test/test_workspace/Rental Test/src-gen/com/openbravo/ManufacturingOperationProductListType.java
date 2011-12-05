package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingOperationProductListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingOperationProductListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingOperationProductType> manufacturingOperationProduct = new ArrayList<ManufacturingOperationProductType>();

	/**
	 * Returns the value of '<em><b>manufacturingOperationProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationProduct</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationProductType> getManufacturingOperationProduct() {
		return manufacturingOperationProduct;
	}

	/**
	 * Adds to the <em>manufacturingOperationProduct</em> feature.
	 * @generated
	 */
	public void addToManufacturingOperationProduct(
			ManufacturingOperationProductType manufacturingOperationProductValue) {
		if (!manufacturingOperationProduct
				.contains(manufacturingOperationProductValue)) {

			manufacturingOperationProduct
					.add(manufacturingOperationProductValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingOperationProduct</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingOperationProduct(
			ManufacturingOperationProductType manufacturingOperationProductValue) {
		if (manufacturingOperationProduct
				.contains(manufacturingOperationProductValue)) {
			manufacturingOperationProduct
					.remove(manufacturingOperationProductValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingOperationProduct</em> feature.
	 * @generated
	 */
	public void clearManufacturingOperationProduct() {
		while (!manufacturingOperationProduct.isEmpty()) {
			removeFromManufacturingOperationProduct(manufacturingOperationProduct
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingOperationProductListType#getManufacturingOperationProduct() <em>manufacturingOperationProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationProductListType#getManufacturingOperationProduct() manufacturingOperationProduct}' feature.
	 * @generated
	 */
	public void setManufacturingOperationProduct(
			List<ManufacturingOperationProductType> newManufacturingOperationProduct) {
		manufacturingOperationProduct = newManufacturingOperationProduct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingOperationProductListType ";
	}
}
