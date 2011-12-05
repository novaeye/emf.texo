package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingWorkRequirementProductListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingWorkRequirementProductListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingWorkRequirementProductType> manufacturingWorkRequirementProduct = new ArrayList<ManufacturingWorkRequirementProductType>();

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementProduct</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkRequirementProductType> getManufacturingWorkRequirementProduct() {
		return manufacturingWorkRequirementProduct;
	}

	/**
	 * Adds to the <em>manufacturingWorkRequirementProduct</em> feature.
	 * @generated
	 */
	public void addToManufacturingWorkRequirementProduct(
			ManufacturingWorkRequirementProductType manufacturingWorkRequirementProductValue) {
		if (!manufacturingWorkRequirementProduct
				.contains(manufacturingWorkRequirementProductValue)) {

			manufacturingWorkRequirementProduct
					.add(manufacturingWorkRequirementProductValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingWorkRequirementProduct</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingWorkRequirementProduct(
			ManufacturingWorkRequirementProductType manufacturingWorkRequirementProductValue) {
		if (manufacturingWorkRequirementProduct
				.contains(manufacturingWorkRequirementProductValue)) {
			manufacturingWorkRequirementProduct
					.remove(manufacturingWorkRequirementProductValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingWorkRequirementProduct</em> feature.
	 * @generated
	 */
	public void clearManufacturingWorkRequirementProduct() {
		while (!manufacturingWorkRequirementProduct.isEmpty()) {
			removeFromManufacturingWorkRequirementProduct(manufacturingWorkRequirementProduct
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingWorkRequirementProductListType#getManufacturingWorkRequirementProduct() <em>manufacturingWorkRequirementProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingWorkRequirementProductListType#getManufacturingWorkRequirementProduct() manufacturingWorkRequirementProduct}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementProduct(
			List<ManufacturingWorkRequirementProductType> newManufacturingWorkRequirementProduct) {
		manufacturingWorkRequirementProduct = newManufacturingWorkRequirementProduct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingWorkRequirementProductListType ";
	}
}
