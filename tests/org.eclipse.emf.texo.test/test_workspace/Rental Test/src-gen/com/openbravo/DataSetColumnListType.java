package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>DataSetColumnListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class DataSetColumnListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<DataSetColumnType> dataSetColumn = new ArrayList<DataSetColumnType>();

	/**
	 * Returns the value of '<em><b>dataSetColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetColumn</b></em>' feature
	 * @generated
	 */
	public List<DataSetColumnType> getDataSetColumn() {
		return dataSetColumn;
	}

	/**
	 * Adds to the <em>dataSetColumn</em> feature.
	 * @generated
	 */
	public void addToDataSetColumn(DataSetColumnType dataSetColumnValue) {
		if (!dataSetColumn.contains(dataSetColumnValue)) {

			dataSetColumn.add(dataSetColumnValue);
		}

	}

	/**			
	 * Removes from the <em>dataSetColumn</em> feature.
	 * @generated
	 */
	public void removeFromDataSetColumn(DataSetColumnType dataSetColumnValue) {
		if (dataSetColumn.contains(dataSetColumnValue)) {
			dataSetColumn.remove(dataSetColumnValue);
		}
	}

	/**			
	 * Clears the <em>dataSetColumn</em> feature.
	 * @generated
	 */
	public void clearDataSetColumn() {
		while (!dataSetColumn.isEmpty()) {
			removeFromDataSetColumn(dataSetColumn.iterator().next());
		}
	}

	/**
	 * Sets the '{@link DataSetColumnListType#getDataSetColumn() <em>dataSetColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link DataSetColumnListType#getDataSetColumn() dataSetColumn}' feature.
	 * @generated
	 */
	public void setDataSetColumn(List<DataSetColumnType> newDataSetColumn) {
		dataSetColumn = newDataSetColumn;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "DataSetColumnListType ";
	}
}
