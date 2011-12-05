package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADHeartbeatLogCustomQueryListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADHeartbeatLogCustomQueryListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADHeartbeatLogCustomQueryType> aDHeartbeatLogCustomQuery = new ArrayList<ADHeartbeatLogCustomQueryType>();

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQuery</b></em>' feature
	 * @generated
	 */
	public List<ADHeartbeatLogCustomQueryType> getADHeartbeatLogCustomQuery() {
		return aDHeartbeatLogCustomQuery;
	}

	/**
	 * Adds to the <em>aDHeartbeatLogCustomQuery</em> feature.
	 * @generated
	 */
	public void addToADHeartbeatLogCustomQuery(
			ADHeartbeatLogCustomQueryType aDHeartbeatLogCustomQueryValue) {
		if (!aDHeartbeatLogCustomQuery.contains(aDHeartbeatLogCustomQueryValue)) {

			aDHeartbeatLogCustomQuery.add(aDHeartbeatLogCustomQueryValue);
		}

	}

	/**			
	 * Removes from the <em>aDHeartbeatLogCustomQuery</em> feature.
	 * @generated
	 */
	public void removeFromADHeartbeatLogCustomQuery(
			ADHeartbeatLogCustomQueryType aDHeartbeatLogCustomQueryValue) {
		if (aDHeartbeatLogCustomQuery.contains(aDHeartbeatLogCustomQueryValue)) {
			aDHeartbeatLogCustomQuery.remove(aDHeartbeatLogCustomQueryValue);
		}
	}

	/**			
	 * Clears the <em>aDHeartbeatLogCustomQuery</em> feature.
	 * @generated
	 */
	public void clearADHeartbeatLogCustomQuery() {
		while (!aDHeartbeatLogCustomQuery.isEmpty()) {
			removeFromADHeartbeatLogCustomQuery(aDHeartbeatLogCustomQuery
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADHeartbeatLogCustomQueryListType#getADHeartbeatLogCustomQuery() <em>aDHeartbeatLogCustomQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogCustomQueryListType#getADHeartbeatLogCustomQuery() aDHeartbeatLogCustomQuery}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQuery(
			List<ADHeartbeatLogCustomQueryType> newADHeartbeatLogCustomQuery) {
		aDHeartbeatLogCustomQuery = newADHeartbeatLogCustomQuery;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADHeartbeatLogCustomQueryListType ";
	}
}
