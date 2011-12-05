package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingTestListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingTestListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ManufacturingTestType> manufacturingTest = new ArrayList<ManufacturingTestType>();

	/**
	 * Returns the value of '<em><b>manufacturingTest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingTest</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingTestType> getManufacturingTest() {
		return manufacturingTest;
	}

	/**
	 * Adds to the <em>manufacturingTest</em> feature.
	 * @generated
	 */
	public void addToManufacturingTest(
			ManufacturingTestType manufacturingTestValue) {
		if (!manufacturingTest.contains(manufacturingTestValue)) {

			manufacturingTest.add(manufacturingTestValue);
		}

	}

	/**			
	 * Removes from the <em>manufacturingTest</em> feature.
	 * @generated
	 */
	public void removeFromManufacturingTest(
			ManufacturingTestType manufacturingTestValue) {
		if (manufacturingTest.contains(manufacturingTestValue)) {
			manufacturingTest.remove(manufacturingTestValue);
		}
	}

	/**			
	 * Clears the <em>manufacturingTest</em> feature.
	 * @generated
	 */
	public void clearManufacturingTest() {
		while (!manufacturingTest.isEmpty()) {
			removeFromManufacturingTest(manufacturingTest.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ManufacturingTestListType#getManufacturingTest() <em>manufacturingTest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingTestListType#getManufacturingTest() manufacturingTest}' feature.
	 * @generated
	 */
	public void setManufacturingTest(
			List<ManufacturingTestType> newManufacturingTest) {
		manufacturingTest = newManufacturingTest;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ManufacturingTestListType ";
	}
}
