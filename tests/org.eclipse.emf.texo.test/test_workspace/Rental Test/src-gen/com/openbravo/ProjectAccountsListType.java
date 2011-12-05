package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectAccountsListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectAccountsListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectAccountsType> projectAccounts = new ArrayList<ProjectAccountsType>();

	/**
	 * Returns the value of '<em><b>projectAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccounts</b></em>' feature
	 * @generated
	 */
	public List<ProjectAccountsType> getProjectAccounts() {
		return projectAccounts;
	}

	/**
	 * Adds to the <em>projectAccounts</em> feature.
	 * @generated
	 */
	public void addToProjectAccounts(ProjectAccountsType projectAccountsValue) {
		if (!projectAccounts.contains(projectAccountsValue)) {

			projectAccounts.add(projectAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>projectAccounts</em> feature.
	 * @generated
	 */
	public void removeFromProjectAccounts(
			ProjectAccountsType projectAccountsValue) {
		if (projectAccounts.contains(projectAccountsValue)) {
			projectAccounts.remove(projectAccountsValue);
		}
	}

	/**			
	 * Clears the <em>projectAccounts</em> feature.
	 * @generated
	 */
	public void clearProjectAccounts() {
		while (!projectAccounts.isEmpty()) {
			removeFromProjectAccounts(projectAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectAccountsListType#getProjectAccounts() <em>projectAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectAccountsListType#getProjectAccounts() projectAccounts}' feature.
	 * @generated
	 */
	public void setProjectAccounts(List<ProjectAccountsType> newProjectAccounts) {
		projectAccounts = newProjectAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectAccountsListType ";
	}
}
