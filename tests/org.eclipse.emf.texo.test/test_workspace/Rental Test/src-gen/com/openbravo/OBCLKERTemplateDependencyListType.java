package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCLKERTemplateDependencyListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCLKERTemplateDependencyListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBCLKERTemplateDependencyType> oBCLKERTemplateDependency = new ArrayList<OBCLKERTemplateDependencyType>();

	/**
	 * Returns the value of '<em><b>oBCLKERTemplateDependency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplateDependency</b></em>' feature
	 * @generated
	 */
	public List<OBCLKERTemplateDependencyType> getOBCLKERTemplateDependency() {
		return oBCLKERTemplateDependency;
	}

	/**
	 * Adds to the <em>oBCLKERTemplateDependency</em> feature.
	 * @generated
	 */
	public void addToOBCLKERTemplateDependency(
			OBCLKERTemplateDependencyType oBCLKERTemplateDependencyValue) {
		if (!oBCLKERTemplateDependency.contains(oBCLKERTemplateDependencyValue)) {

			oBCLKERTemplateDependency.add(oBCLKERTemplateDependencyValue);
		}

	}

	/**			
	 * Removes from the <em>oBCLKERTemplateDependency</em> feature.
	 * @generated
	 */
	public void removeFromOBCLKERTemplateDependency(
			OBCLKERTemplateDependencyType oBCLKERTemplateDependencyValue) {
		if (oBCLKERTemplateDependency.contains(oBCLKERTemplateDependencyValue)) {
			oBCLKERTemplateDependency.remove(oBCLKERTemplateDependencyValue);
		}
	}

	/**			
	 * Clears the <em>oBCLKERTemplateDependency</em> feature.
	 * @generated
	 */
	public void clearOBCLKERTemplateDependency() {
		while (!oBCLKERTemplateDependency.isEmpty()) {
			removeFromOBCLKERTemplateDependency(oBCLKERTemplateDependency
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBCLKERTemplateDependencyListType#getOBCLKERTemplateDependency() <em>oBCLKERTemplateDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateDependencyListType#getOBCLKERTemplateDependency() oBCLKERTemplateDependency}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplateDependency(
			List<OBCLKERTemplateDependencyType> newOBCLKERTemplateDependency) {
		oBCLKERTemplateDependency = newOBCLKERTemplateDependency;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBCLKERTemplateDependencyListType ";
	}
}
