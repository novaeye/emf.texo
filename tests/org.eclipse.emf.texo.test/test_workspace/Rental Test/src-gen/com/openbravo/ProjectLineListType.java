package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectLineListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectLineListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProjectLineType> projectLine = new ArrayList<ProjectLineType>();

	/**
	 * Returns the value of '<em><b>projectLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLine</b></em>' feature
	 * @generated
	 */
	public List<ProjectLineType> getProjectLine() {
		return projectLine;
	}

	/**
	 * Adds to the <em>projectLine</em> feature.
	 * @generated
	 */
	public void addToProjectLine(ProjectLineType projectLineValue) {
		if (!projectLine.contains(projectLineValue)) {

			projectLine.add(projectLineValue);
		}

	}

	/**			
	 * Removes from the <em>projectLine</em> feature.
	 * @generated
	 */
	public void removeFromProjectLine(ProjectLineType projectLineValue) {
		if (projectLine.contains(projectLineValue)) {
			projectLine.remove(projectLineValue);
		}
	}

	/**			
	 * Clears the <em>projectLine</em> feature.
	 * @generated
	 */
	public void clearProjectLine() {
		while (!projectLine.isEmpty()) {
			removeFromProjectLine(projectLine.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProjectLineListType#getProjectLine() <em>projectLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectLineListType#getProjectLine() projectLine}' feature.
	 * @generated
	 */
	public void setProjectLine(List<ProjectLineType> newProjectLine) {
		projectLine = newProjectLine;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProjectLineListType ";
	}
}
