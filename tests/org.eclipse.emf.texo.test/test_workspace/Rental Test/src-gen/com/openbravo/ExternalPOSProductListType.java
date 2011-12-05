package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ExternalPOSProductListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ExternalPOSProductListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ExternalPOSProductType> externalPOSProduct = new ArrayList<ExternalPOSProductType>();

	/**
	 * Returns the value of '<em><b>externalPOSProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSProduct</b></em>' feature
	 * @generated
	 */
	public List<ExternalPOSProductType> getExternalPOSProduct() {
		return externalPOSProduct;
	}

	/**
	 * Adds to the <em>externalPOSProduct</em> feature.
	 * @generated
	 */
	public void addToExternalPOSProduct(
			ExternalPOSProductType externalPOSProductValue) {
		if (!externalPOSProduct.contains(externalPOSProductValue)) {

			externalPOSProduct.add(externalPOSProductValue);
		}

	}

	/**			
	 * Removes from the <em>externalPOSProduct</em> feature.
	 * @generated
	 */
	public void removeFromExternalPOSProduct(
			ExternalPOSProductType externalPOSProductValue) {
		if (externalPOSProduct.contains(externalPOSProductValue)) {
			externalPOSProduct.remove(externalPOSProductValue);
		}
	}

	/**			
	 * Clears the <em>externalPOSProduct</em> feature.
	 * @generated
	 */
	public void clearExternalPOSProduct() {
		while (!externalPOSProduct.isEmpty()) {
			removeFromExternalPOSProduct(externalPOSProduct.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ExternalPOSProductListType#getExternalPOSProduct() <em>externalPOSProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ExternalPOSProductListType#getExternalPOSProduct() externalPOSProduct}' feature.
	 * @generated
	 */
	public void setExternalPOSProduct(
			List<ExternalPOSProductType> newExternalPOSProduct) {
		externalPOSProduct = newExternalPOSProduct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ExternalPOSProductListType ";
	}
}
