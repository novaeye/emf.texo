package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductOrgListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductOrgListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProductOrgType> productOrg = new ArrayList<ProductOrgType>();

	/**
	 * Returns the value of '<em><b>productOrg</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productOrg</b></em>' feature
	 * @generated
	 */
	public List<ProductOrgType> getProductOrg() {
		return productOrg;
	}

	/**
	 * Adds to the <em>productOrg</em> feature.
	 * @generated
	 */
	public void addToProductOrg(ProductOrgType productOrgValue) {
		if (!productOrg.contains(productOrgValue)) {

			productOrg.add(productOrgValue);
		}

	}

	/**			
	 * Removes from the <em>productOrg</em> feature.
	 * @generated
	 */
	public void removeFromProductOrg(ProductOrgType productOrgValue) {
		if (productOrg.contains(productOrgValue)) {
			productOrg.remove(productOrgValue);
		}
	}

	/**			
	 * Clears the <em>productOrg</em> feature.
	 * @generated
	 */
	public void clearProductOrg() {
		while (!productOrg.isEmpty()) {
			removeFromProductOrg(productOrg.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProductOrgListType#getProductOrg() <em>productOrg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductOrgListType#getProductOrg() productOrg}' feature.
	 * @generated
	 */
	public void setProductOrg(List<ProductOrgType> newProductOrg) {
		productOrg = newProductOrg;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProductOrgListType ";
	}
}
