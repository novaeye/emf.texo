package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ModelImplementationParameterListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ModelImplementationParameterListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ModelImplementationParameterType> modelImplementationParameter = new ArrayList<ModelImplementationParameterType>();

	/**
	 * Returns the value of '<em><b>modelImplementationParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>modelImplementationParameter</b></em>' feature
	 * @generated
	 */
	public List<ModelImplementationParameterType> getModelImplementationParameter() {
		return modelImplementationParameter;
	}

	/**
	 * Adds to the <em>modelImplementationParameter</em> feature.
	 * @generated
	 */
	public void addToModelImplementationParameter(
			ModelImplementationParameterType modelImplementationParameterValue) {
		if (!modelImplementationParameter
				.contains(modelImplementationParameterValue)) {

			modelImplementationParameter.add(modelImplementationParameterValue);
		}

	}

	/**			
	 * Removes from the <em>modelImplementationParameter</em> feature.
	 * @generated
	 */
	public void removeFromModelImplementationParameter(
			ModelImplementationParameterType modelImplementationParameterValue) {
		if (modelImplementationParameter
				.contains(modelImplementationParameterValue)) {
			modelImplementationParameter
					.remove(modelImplementationParameterValue);
		}
	}

	/**			
	 * Clears the <em>modelImplementationParameter</em> feature.
	 * @generated
	 */
	public void clearModelImplementationParameter() {
		while (!modelImplementationParameter.isEmpty()) {
			removeFromModelImplementationParameter(modelImplementationParameter
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ModelImplementationParameterListType#getModelImplementationParameter() <em>modelImplementationParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ModelImplementationParameterListType#getModelImplementationParameter() modelImplementationParameter}' feature.
	 * @generated
	 */
	public void setModelImplementationParameter(
			List<ModelImplementationParameterType> newModelImplementationParameter) {
		modelImplementationParameter = newModelImplementationParameter;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ModelImplementationParameterListType ";
	}
}
