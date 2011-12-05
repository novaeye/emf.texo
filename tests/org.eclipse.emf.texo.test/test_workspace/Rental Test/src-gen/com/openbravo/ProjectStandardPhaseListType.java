package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectStandardPhaseListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectStandardPhaseListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectStandardPhaseType> projectStandardPhase = new ArrayList<ProjectStandardPhaseType>();

	/**
	 * Returns the value of '<em><b>projectStandardPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardPhase</b></em>' feature
	 * @generated
	 */
	public List<ProjectStandardPhaseType> getProjectStandardPhase() {
		return projectStandardPhase;
	}

	/**
	 * Adds to the <em>projectStandardPhase</em> feature.
	 * @generated
	 */
	public void addToProjectStandardPhase(
			ProjectStandardPhaseType projectStandardPhaseValue) {
		if (!projectStandardPhase.contains(projectStandardPhaseValue)) {

			projectStandardPhase.add(projectStandardPhaseValue);
		}

	}

	/**			
	 * Removes from the <em>projectStandardPhase</em> feature.
	 * @generated
	 */
	public void removeFromProjectStandardPhase(
			ProjectStandardPhaseType projectStandardPhaseValue) {
		if (projectStandardPhase.contains(projectStandardPhaseValue)) {
			projectStandardPhase.remove(projectStandardPhaseValue);
		}
	}

	/**			
	 * Clears the <em>projectStandardPhase</em> feature.
	 * @generated
	 */
	public void clearProjectStandardPhase() {
		while (!projectStandardPhase.isEmpty()) {
			removeFromProjectStandardPhase(projectStandardPhase.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ProjectStandardPhaseListType#getProjectStandardPhase() <em>projectStandardPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectStandardPhaseListType#getProjectStandardPhase() projectStandardPhase}' feature.
	 * @generated
	 */
	public void setProjectStandardPhase(
			List<ProjectStandardPhaseType> newProjectStandardPhase) {
		projectStandardPhase = newProjectStandardPhase;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectStandardPhaseListType ";
	}
}
