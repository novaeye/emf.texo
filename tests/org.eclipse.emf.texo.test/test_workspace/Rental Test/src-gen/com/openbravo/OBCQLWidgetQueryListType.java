package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCQLWidgetQueryListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCQLWidgetQueryListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBCQLWidgetQueryType> oBCQLWidgetQuery = new ArrayList<OBCQLWidgetQueryType>();

	/**
	 * Returns the value of '<em><b>oBCQLWidgetQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLWidgetQuery</b></em>' feature
	 * @generated
	 */
	public List<OBCQLWidgetQueryType> getOBCQLWidgetQuery() {
		return oBCQLWidgetQuery;
	}

	/**
	 * Adds to the <em>oBCQLWidgetQuery</em> feature.
	 * @generated
	 */
	public void addToOBCQLWidgetQuery(OBCQLWidgetQueryType oBCQLWidgetQueryValue) {
		if (!oBCQLWidgetQuery.contains(oBCQLWidgetQueryValue)) {

			oBCQLWidgetQuery.add(oBCQLWidgetQueryValue);
		}

	}

	/**			
	 * Removes from the <em>oBCQLWidgetQuery</em> feature.
	 * @generated
	 */
	public void removeFromOBCQLWidgetQuery(
			OBCQLWidgetQueryType oBCQLWidgetQueryValue) {
		if (oBCQLWidgetQuery.contains(oBCQLWidgetQueryValue)) {
			oBCQLWidgetQuery.remove(oBCQLWidgetQueryValue);
		}
	}

	/**			
	 * Clears the <em>oBCQLWidgetQuery</em> feature.
	 * @generated
	 */
	public void clearOBCQLWidgetQuery() {
		while (!oBCQLWidgetQuery.isEmpty()) {
			removeFromOBCQLWidgetQuery(oBCQLWidgetQuery.iterator().next());
		}
	}

	/**
	 * Sets the '{@link OBCQLWidgetQueryListType#getOBCQLWidgetQuery() <em>oBCQLWidgetQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLWidgetQueryListType#getOBCQLWidgetQuery() oBCQLWidgetQuery}' feature.
	 * @generated
	 */
	public void setOBCQLWidgetQuery(
			List<OBCQLWidgetQueryType> newOBCQLWidgetQuery) {
		oBCQLWidgetQuery = newOBCQLWidgetQuery;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OBCQLWidgetQueryListType ";
	}
}
