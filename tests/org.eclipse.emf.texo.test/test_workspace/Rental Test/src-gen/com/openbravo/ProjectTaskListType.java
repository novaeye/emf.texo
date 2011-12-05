package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectTaskListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectTaskListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectTaskType> projectTask = new ArrayList<ProjectTaskType>();

	/**
	 * Returns the value of '<em><b>projectTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectTask</b></em>' feature
	 * @generated
	 */
	public List<ProjectTaskType> getProjectTask() {
		return projectTask;
	}

	/**
	 * Adds to the <em>projectTask</em> feature.
	 * @generated
	 */
	public void addToProjectTask(ProjectTaskType projectTaskValue) {
		if (!projectTask.contains(projectTaskValue)) {

			projectTask.add(projectTaskValue);
		}

	}

	/**			
	 * Removes from the <em>projectTask</em> feature.
	 * @generated
	 */
	public void removeFromProjectTask(ProjectTaskType projectTaskValue) {
		if (projectTask.contains(projectTaskValue)) {
			projectTask.remove(projectTaskValue);
		}
	}

	/**			
	 * Clears the <em>projectTask</em> feature.
	 * @generated
	 */
	public void clearProjectTask() {
		while (!projectTask.isEmpty()) {
			removeFromProjectTask(projectTask.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectTaskListType#getProjectTask() <em>projectTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectTaskListType#getProjectTask() projectTask}' feature.
	 * @generated
	 */
	public void setProjectTask(List<ProjectTaskType> newProjectTask) {
		projectTask = newProjectTask;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectTaskListType ";
	}
}
