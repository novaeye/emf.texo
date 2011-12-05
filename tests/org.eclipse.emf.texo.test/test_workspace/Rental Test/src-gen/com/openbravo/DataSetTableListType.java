package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>DataSetTableListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DataSetTableListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<DataSetTableType> dataSetTable = new ArrayList<DataSetTableType>();

	/**
	 * Returns the value of '<em><b>dataSetTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetTable</b></em>' feature
	 * @generated
	 */
	public List<DataSetTableType> getDataSetTable() {
		return dataSetTable;
	}

	/**
	 * Adds to the <em>dataSetTable</em> feature.
	 * @generated
	 */
	public void addToDataSetTable(DataSetTableType dataSetTableValue) {
		if (!dataSetTable.contains(dataSetTableValue)) {

			dataSetTable.add(dataSetTableValue);
		}

	}

	/**			
	 * Removes from the <em>dataSetTable</em> feature.
	 * @generated
	 */
	public void removeFromDataSetTable(DataSetTableType dataSetTableValue) {
		if (dataSetTable.contains(dataSetTableValue)) {
			dataSetTable.remove(dataSetTableValue);
		}
	}

	/**			
	 * Clears the <em>dataSetTable</em> feature.
	 * @generated
	 */
	public void clearDataSetTable() {
		while (!dataSetTable.isEmpty()) {
			removeFromDataSetTable(dataSetTable.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DataSetTableListType#getDataSetTable() <em>dataSetTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DataSetTableListType#getDataSetTable() dataSetTable}' feature.
	 * @generated
	 */
	public void setDataSetTable(List<DataSetTableType> newDataSetTable) {
		dataSetTable = newDataSetTable;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DataSetTableListType ";
	}
}
