package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectProposalListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectProposalListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectProposalType> projectProposal = new ArrayList<ProjectProposalType>();

	/**
	 * Returns the value of '<em><b>projectProposal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposal</b></em>' feature
	 * @generated
	 */
	public List<ProjectProposalType> getProjectProposal() {
		return projectProposal;
	}

	/**
	 * Adds to the <em>projectProposal</em> feature.
	 * @generated
	 */
	public void addToProjectProposal(ProjectProposalType projectProposalValue) {
		if (!projectProposal.contains(projectProposalValue)) {

			projectProposal.add(projectProposalValue);
		}

	}

	/**			
	 * Removes from the <em>projectProposal</em> feature.
	 * @generated
	 */
	public void removeFromProjectProposal(
			ProjectProposalType projectProposalValue) {
		if (projectProposal.contains(projectProposalValue)) {
			projectProposal.remove(projectProposalValue);
		}
	}

	/**			
	 * Clears the <em>projectProposal</em> feature.
	 * @generated
	 */
	public void clearProjectProposal() {
		while (!projectProposal.isEmpty()) {
			removeFromProjectProposal(projectProposal.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectProposalListType#getProjectProposal() <em>projectProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectProposalListType#getProjectProposal() projectProposal}' feature.
	 * @generated
	 */
	public void setProjectProposal(List<ProjectProposalType> newProjectProposal) {
		projectProposal = newProjectProposal;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectProposalListType ";
	}
}
