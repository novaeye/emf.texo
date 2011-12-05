package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>DataPackageListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DataPackageListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<DataPackageType> dataPackage = new ArrayList<DataPackageType>();

	/**
	 * Returns the value of '<em><b>dataPackage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataPackage</b></em>' feature
	 * @generated
	 */
	public List<DataPackageType> getDataPackage() {
		return dataPackage;
	}

	/**
	 * Adds to the <em>dataPackage</em> feature.
	 * @generated
	 */
	public void addToDataPackage(DataPackageType dataPackageValue) {
		if (!dataPackage.contains(dataPackageValue)) {

			dataPackage.add(dataPackageValue);
		}

	}

	/**			
	 * Removes from the <em>dataPackage</em> feature.
	 * @generated
	 */
	public void removeFromDataPackage(DataPackageType dataPackageValue) {
		if (dataPackage.contains(dataPackageValue)) {
			dataPackage.remove(dataPackageValue);
		}
	}

	/**			
	 * Clears the <em>dataPackage</em> feature.
	 * @generated
	 */
	public void clearDataPackage() {
		while (!dataPackage.isEmpty()) {
			removeFromDataPackage(dataPackage.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DataPackageListType#getDataPackage() <em>dataPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DataPackageListType#getDataPackage() dataPackage}' feature.
	 * @generated
	 */
	public void setDataPackage(List<DataPackageType> newDataPackage) {
		dataPackage = newDataPackage;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DataPackageListType ";
	}
}
