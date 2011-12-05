package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADModelImplementationListType3</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADModelImplementationListType3 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADModelImplementationType> aDModelImplementation = new ArrayList<ADModelImplementationType>();

	/**
	 * Returns the value of '<em><b>aDModelImplementation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementation</b></em>' feature
	 * @generated
	 */
	public List<ADModelImplementationType> getADModelImplementation() {
		return aDModelImplementation;
	}

	/**
	 * Adds to the <em>aDModelImplementation</em> feature.
	 * @generated
	 */
	public void addToADModelImplementation(
			ADModelImplementationType aDModelImplementationValue) {
		if (!aDModelImplementation.contains(aDModelImplementationValue)) {

			aDModelImplementation.add(aDModelImplementationValue);
		}

	}

	/**			
	 * Removes from the <em>aDModelImplementation</em> feature.
	 * @generated
	 */
	public void removeFromADModelImplementation(
			ADModelImplementationType aDModelImplementationValue) {
		if (aDModelImplementation.contains(aDModelImplementationValue)) {
			aDModelImplementation.remove(aDModelImplementationValue);
		}
	}

	/**			
	 * Clears the <em>aDModelImplementation</em> feature.
	 * @generated
	 */
	public void clearADModelImplementation() {
		while (!aDModelImplementation.isEmpty()) {
			removeFromADModelImplementation(aDModelImplementation.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link ADModelImplementationListType3#getADModelImplementation() <em>aDModelImplementation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADModelImplementationListType3#getADModelImplementation() aDModelImplementation}' feature.
	 * @generated
	 */
	public void setADModelImplementation(
			List<ADModelImplementationType> newADModelImplementation) {
		aDModelImplementation = newADModelImplementation;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADModelImplementationListType3 ";
	}
}
