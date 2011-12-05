package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectIssueListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectIssueListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectIssueType> projectIssue = new ArrayList<ProjectIssueType>();

	/**
	 * Returns the value of '<em><b>projectIssue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectIssue</b></em>' feature
	 * @generated
	 */
	public List<ProjectIssueType> getProjectIssue() {
		return projectIssue;
	}

	/**
	 * Adds to the <em>projectIssue</em> feature.
	 * @generated
	 */
	public void addToProjectIssue(ProjectIssueType projectIssueValue) {
		if (!projectIssue.contains(projectIssueValue)) {

			projectIssue.add(projectIssueValue);
		}

	}

	/**			
	 * Removes from the <em>projectIssue</em> feature.
	 * @generated
	 */
	public void removeFromProjectIssue(ProjectIssueType projectIssueValue) {
		if (projectIssue.contains(projectIssueValue)) {
			projectIssue.remove(projectIssueValue);
		}
	}

	/**			
	 * Clears the <em>projectIssue</em> feature.
	 * @generated
	 */
	public void clearProjectIssue() {
		while (!projectIssue.isEmpty()) {
			removeFromProjectIssue(projectIssue.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectIssueListType#getProjectIssue() <em>projectIssue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectIssueListType#getProjectIssue() projectIssue}' feature.
	 * @generated
	 */
	public void setProjectIssue(List<ProjectIssueType> newProjectIssue) {
		projectIssue = newProjectIssue;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectIssueListType ";
	}
}
