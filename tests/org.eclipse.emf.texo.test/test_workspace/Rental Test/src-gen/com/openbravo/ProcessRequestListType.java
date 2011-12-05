package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProcessRequestListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProcessRequestListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ProcessRequestType> processRequest = new ArrayList<ProcessRequestType>();

	/**
	 * Returns the value of '<em><b>processRequest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRequest</b></em>' feature
	 * @generated
	 */
	public List<ProcessRequestType> getProcessRequest() {
		return processRequest;
	}

	/**
	 * Adds to the <em>processRequest</em> feature.
	 * @generated
	 */
	public void addToProcessRequest(ProcessRequestType processRequestValue) {
		if (!processRequest.contains(processRequestValue)) {

			processRequest.add(processRequestValue);
		}

	}

	/**			
	 * Removes from the <em>processRequest</em> feature.
	 * @generated
	 */
	public void removeFromProcessRequest(ProcessRequestType processRequestValue) {
		if (processRequest.contains(processRequestValue)) {
			processRequest.remove(processRequestValue);
		}
	}

	/**			
	 * Clears the <em>processRequest</em> feature.
	 * @generated
	 */
	public void clearProcessRequest() {
		while (!processRequest.isEmpty()) {
			removeFromProcessRequest(processRequest.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ProcessRequestListType#getProcessRequest() <em>processRequest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestListType#getProcessRequest() processRequest}' feature.
	 * @generated
	 */
	public void setProcessRequest(List<ProcessRequestType> newProcessRequest) {
		processRequest = newProcessRequest;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ProcessRequestListType ";
	}
}
