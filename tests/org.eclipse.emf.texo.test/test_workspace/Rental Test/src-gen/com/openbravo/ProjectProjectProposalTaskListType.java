package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectProjectProposalTaskListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectProjectProposalTaskListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectProjectProposalTaskType> projectProjectProposalTask = new ArrayList<ProjectProjectProposalTaskType>();

	/**
	 * Returns the value of '<em><b>projectProjectProposalTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProjectProposalTask</b></em>' feature
	 * @generated
	 */
	public List<ProjectProjectProposalTaskType> getProjectProjectProposalTask() {
		return projectProjectProposalTask;
	}

	/**
	 * Adds to the <em>projectProjectProposalTask</em> feature.
	 * @generated
	 */
	public void addToProjectProjectProposalTask(
			ProjectProjectProposalTaskType projectProjectProposalTaskValue) {
		if (!projectProjectProposalTask
				.contains(projectProjectProposalTaskValue)) {

			projectProjectProposalTask.add(projectProjectProposalTaskValue);
		}

	}

	/**			
	 * Removes from the <em>projectProjectProposalTask</em> feature.
	 * @generated
	 */
	public void removeFromProjectProjectProposalTask(
			ProjectProjectProposalTaskType projectProjectProposalTaskValue) {
		if (projectProjectProposalTask
				.contains(projectProjectProposalTaskValue)) {
			projectProjectProposalTask.remove(projectProjectProposalTaskValue);
		}
	}

	/**			
	 * Clears the <em>projectProjectProposalTask</em> feature.
	 * @generated
	 */
	public void clearProjectProjectProposalTask() {
		while (!projectProjectProposalTask.isEmpty()) {
			removeFromProjectProjectProposalTask(projectProjectProposalTask
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectProjectProposalTaskListType#getProjectProjectProposalTask() <em>projectProjectProposalTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectProjectProposalTaskListType#getProjectProjectProposalTask() projectProjectProposalTask}' feature.
	 * @generated
	 */
	public void setProjectProjectProposalTask(
			List<ProjectProjectProposalTaskType> newProjectProjectProposalTask) {
		projectProjectProposalTask = newProjectProjectProposalTask;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectProjectProposalTaskListType ";
	}
}
