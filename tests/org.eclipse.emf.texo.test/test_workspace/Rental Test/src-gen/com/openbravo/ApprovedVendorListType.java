package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ApprovedVendorListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ApprovedVendorListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ApprovedVendorType> approvedVendor = new ArrayList<ApprovedVendorType>();

	/**
	 * Returns the value of '<em><b>approvedVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendor</b></em>' feature
	 * @generated
	 */
	public List<ApprovedVendorType> getApprovedVendor() {
		return approvedVendor;
	}

	/**
	 * Adds to the <em>approvedVendor</em> feature.
	 * @generated
	 */
	public void addToApprovedVendor(ApprovedVendorType approvedVendorValue) {
		if (!approvedVendor.contains(approvedVendorValue)) {

			approvedVendor.add(approvedVendorValue);
		}

	}

	/**			
	 * Removes from the <em>approvedVendor</em> feature.
	 * @generated
	 */
	public void removeFromApprovedVendor(ApprovedVendorType approvedVendorValue) {
		if (approvedVendor.contains(approvedVendorValue)) {
			approvedVendor.remove(approvedVendorValue);
		}
	}

	/**			
	 * Clears the <em>approvedVendor</em> feature.
	 * @generated
	 */
	public void clearApprovedVendor() {
		while (!approvedVendor.isEmpty()) {
			removeFromApprovedVendor(approvedVendor.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ApprovedVendorListType#getApprovedVendor() <em>approvedVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorListType#getApprovedVendor() approvedVendor}' feature.
	 * @generated
	 */
	public void setApprovedVendor(List<ApprovedVendorType> newApprovedVendor) {
		approvedVendor = newApprovedVendor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ApprovedVendorListType ";
	}
}
