package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>AcctSchemaTableDocTypeListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class AcctSchemaTableDocTypeListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<AcctSchemaTableDocTypeType> acctSchemaTableDocType = new ArrayList<AcctSchemaTableDocTypeType>();

	/**
	 * Returns the value of '<em><b>acctSchemaTableDocType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>acctSchemaTableDocType</b></em>' feature
	 * @generated
	 */
	public List<AcctSchemaTableDocTypeType> getAcctSchemaTableDocType() {
		return acctSchemaTableDocType;
	}

	/**
	 * Adds to the <em>acctSchemaTableDocType</em> feature.
	 * @generated
	 */
	public void addToAcctSchemaTableDocType(
			AcctSchemaTableDocTypeType acctSchemaTableDocTypeValue) {
		if (!acctSchemaTableDocType.contains(acctSchemaTableDocTypeValue)) {

			acctSchemaTableDocType.add(acctSchemaTableDocTypeValue);
		}

	}

	/**			
	 * Removes from the <em>acctSchemaTableDocType</em> feature.
	 * @generated
	 */
	public void removeFromAcctSchemaTableDocType(
			AcctSchemaTableDocTypeType acctSchemaTableDocTypeValue) {
		if (acctSchemaTableDocType.contains(acctSchemaTableDocTypeValue)) {
			acctSchemaTableDocType.remove(acctSchemaTableDocTypeValue);
		}
	}

	/**			
	 * Clears the <em>acctSchemaTableDocType</em> feature.
	 * @generated
	 */
	public void clearAcctSchemaTableDocType() {
		while (!acctSchemaTableDocType.isEmpty()) {
			removeFromAcctSchemaTableDocType(acctSchemaTableDocType.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link AcctSchemaTableDocTypeListType#getAcctSchemaTableDocType() <em>acctSchemaTableDocType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link AcctSchemaTableDocTypeListType#getAcctSchemaTableDocType() acctSchemaTableDocType}' feature.
	 * @generated
	 */
	public void setAcctSchemaTableDocType(
			List<AcctSchemaTableDocTypeType> newAcctSchemaTableDocType) {
		acctSchemaTableDocType = newAcctSchemaTableDocType;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "AcctSchemaTableDocTypeListType ";
	}
}
