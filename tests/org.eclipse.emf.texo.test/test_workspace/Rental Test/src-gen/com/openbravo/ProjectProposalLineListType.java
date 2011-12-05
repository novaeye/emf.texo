package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectProposalLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectProposalLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectProposalLineType> projectProposalLine = new ArrayList<ProjectProposalLineType>();

	/**
	 * Returns the value of '<em><b>projectProposalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalLine</b></em>' feature
	 * @generated
	 */
	public List<ProjectProposalLineType> getProjectProposalLine() {
		return projectProposalLine;
	}

	/**
	 * Adds to the <em>projectProposalLine</em> feature.
	 * @generated
	 */
	public void addToProjectProposalLine(
			ProjectProposalLineType projectProposalLineValue) {
		if (!projectProposalLine.contains(projectProposalLineValue)) {

			projectProposalLine.add(projectProposalLineValue);
		}

	}

	/**			
	 * Removes from the <em>projectProposalLine</em> feature.
	 * @generated
	 */
	public void removeFromProjectProposalLine(
			ProjectProposalLineType projectProposalLineValue) {
		if (projectProposalLine.contains(projectProposalLineValue)) {
			projectProposalLine.remove(projectProposalLineValue);
		}
	}

	/**			
	 * Clears the <em>projectProposalLine</em> feature.
	 * @generated
	 */
	public void clearProjectProposalLine() {
		while (!projectProposalLine.isEmpty()) {
			removeFromProjectProposalLine(projectProposalLine.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectProposalLineListType#getProjectProposalLine() <em>projectProposalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectProposalLineListType#getProjectProposalLine() projectProposalLine}' feature.
	 * @generated
	 */
	public void setProjectProposalLine(
			List<ProjectProposalLineType> newProjectProposalLine) {
		projectProposalLine = newProjectProposalLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectProposalLineListType ";
	}
}
