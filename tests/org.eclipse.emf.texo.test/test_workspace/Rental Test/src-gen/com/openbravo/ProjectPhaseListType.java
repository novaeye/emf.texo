package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectPhaseListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectPhaseListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectPhaseType> projectPhase = new ArrayList<ProjectPhaseType>();

	/**
	 * Returns the value of '<em><b>projectPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhase</b></em>' feature
	 * @generated
	 */
	public List<ProjectPhaseType> getProjectPhase() {
		return projectPhase;
	}

	/**
	 * Adds to the <em>projectPhase</em> feature.
	 * @generated
	 */
	public void addToProjectPhase(ProjectPhaseType projectPhaseValue) {
		if (!projectPhase.contains(projectPhaseValue)) {

			projectPhase.add(projectPhaseValue);
		}

	}

	/**			
	 * Removes from the <em>projectPhase</em> feature.
	 * @generated
	 */
	public void removeFromProjectPhase(ProjectPhaseType projectPhaseValue) {
		if (projectPhase.contains(projectPhaseValue)) {
			projectPhase.remove(projectPhaseValue);
		}
	}

	/**			
	 * Clears the <em>projectPhase</em> feature.
	 * @generated
	 */
	public void clearProjectPhase() {
		while (!projectPhase.isEmpty()) {
			removeFromProjectPhase(projectPhase.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectPhaseListType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectPhaseListType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(List<ProjectPhaseType> newProjectPhase) {
		projectPhase = newProjectPhase;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectPhaseListType ";
	}
}
