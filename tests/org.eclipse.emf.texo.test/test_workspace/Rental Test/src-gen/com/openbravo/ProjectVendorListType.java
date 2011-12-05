package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectVendorListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectVendorListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectVendorType> projectVendor = new ArrayList<ProjectVendorType>();

	/**
	 * Returns the value of '<em><b>projectVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectVendor</b></em>' feature
	 * @generated
	 */
	public List<ProjectVendorType> getProjectVendor() {
		return projectVendor;
	}

	/**
	 * Adds to the <em>projectVendor</em> feature.
	 * @generated
	 */
	public void addToProjectVendor(ProjectVendorType projectVendorValue) {
		if (!projectVendor.contains(projectVendorValue)) {

			projectVendor.add(projectVendorValue);
		}

	}

	/**			
	 * Removes from the <em>projectVendor</em> feature.
	 * @generated
	 */
	public void removeFromProjectVendor(ProjectVendorType projectVendorValue) {
		if (projectVendor.contains(projectVendorValue)) {
			projectVendor.remove(projectVendorValue);
		}
	}

	/**			
	 * Clears the <em>projectVendor</em> feature.
	 * @generated
	 */
	public void clearProjectVendor() {
		while (!projectVendor.isEmpty()) {
			removeFromProjectVendor(projectVendor.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectVendorListType#getProjectVendor() <em>projectVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectVendorListType#getProjectVendor() projectVendor}' feature.
	 * @generated
	 */
	public void setProjectVendor(List<ProjectVendorType> newProjectVendor) {
		projectVendor = newProjectVendor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectVendorListType ";
	}
}
