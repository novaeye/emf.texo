package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProcessExecutionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProcessExecutionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProcessExecutionType> processExecution = new ArrayList<ProcessExecutionType>();

	/**
	 * Returns the value of '<em><b>processExecution</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processExecution</b></em>' feature
	 * @generated
	 */
	public List<ProcessExecutionType> getProcessExecution() {
		return processExecution;
	}

	/**
	 * Adds to the <em>processExecution</em> feature.
	 * @generated
	 */
	public void addToProcessExecution(ProcessExecutionType processExecutionValue) {
		if (!processExecution.contains(processExecutionValue)) {

			processExecution.add(processExecutionValue);
		}

	}

	/**			
	 * Removes from the <em>processExecution</em> feature.
	 * @generated
	 */
	public void removeFromProcessExecution(
			ProcessExecutionType processExecutionValue) {
		if (processExecution.contains(processExecutionValue)) {
			processExecution.remove(processExecutionValue);
		}
	}

	/**			
	 * Clears the <em>processExecution</em> feature.
	 * @generated
	 */
	public void clearProcessExecution() {
		while (!processExecution.isEmpty()) {
			removeFromProcessExecution(processExecution.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProcessExecutionListType#getProcessExecution() <em>processExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessExecutionListType#getProcessExecution() processExecution}' feature.
	 * @generated
	 */
	public void setProcessExecution(
			List<ProcessExecutionType> newProcessExecution) {
		processExecution = newProcessExecution;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProcessExecutionListType ";
	}
}
