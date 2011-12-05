package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectStandardTaskListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectStandardTaskListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectStandardTaskType> projectStandardTask = new ArrayList<ProjectStandardTaskType>();

	/**
	 * Returns the value of '<em><b>projectStandardTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardTask</b></em>' feature
	 * @generated
	 */
	public List<ProjectStandardTaskType> getProjectStandardTask() {
		return projectStandardTask;
	}

	/**
	 * Adds to the <em>projectStandardTask</em> feature.
	 * @generated
	 */
	public void addToProjectStandardTask(
			ProjectStandardTaskType projectStandardTaskValue) {
		if (!projectStandardTask.contains(projectStandardTaskValue)) {

			projectStandardTask.add(projectStandardTaskValue);
		}

	}

	/**			
	 * Removes from the <em>projectStandardTask</em> feature.
	 * @generated
	 */
	public void removeFromProjectStandardTask(
			ProjectStandardTaskType projectStandardTaskValue) {
		if (projectStandardTask.contains(projectStandardTaskValue)) {
			projectStandardTask.remove(projectStandardTaskValue);
		}
	}

	/**			
	 * Clears the <em>projectStandardTask</em> feature.
	 * @generated
	 */
	public void clearProjectStandardTask() {
		while (!projectStandardTask.isEmpty()) {
			removeFromProjectStandardTask(projectStandardTask.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectStandardTaskListType#getProjectStandardTask() <em>projectStandardTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectStandardTaskListType#getProjectStandardTask() projectStandardTask}' feature.
	 * @generated
	 */
	public void setProjectStandardTask(
			List<ProjectStandardTaskType> newProjectStandardTask) {
		projectStandardTask = newProjectStandardTask;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectStandardTaskListType ";
	}
}
