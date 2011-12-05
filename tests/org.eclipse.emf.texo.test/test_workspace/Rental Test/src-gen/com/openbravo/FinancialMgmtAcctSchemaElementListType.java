package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctSchemaElementListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctSchemaElementListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAcctSchemaElementType> financialMgmtAcctSchemaElement = new ArrayList<FinancialMgmtAcctSchemaElementType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaElement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaElementType> getFinancialMgmtAcctSchemaElement() {
		return financialMgmtAcctSchemaElement;
	}

	/**
	 * Adds to the <em>financialMgmtAcctSchemaElement</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAcctSchemaElement(
			FinancialMgmtAcctSchemaElementType financialMgmtAcctSchemaElementValue) {
		if (!financialMgmtAcctSchemaElement
				.contains(financialMgmtAcctSchemaElementValue)) {

			financialMgmtAcctSchemaElement
					.add(financialMgmtAcctSchemaElementValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAcctSchemaElement</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAcctSchemaElement(
			FinancialMgmtAcctSchemaElementType financialMgmtAcctSchemaElementValue) {
		if (financialMgmtAcctSchemaElement
				.contains(financialMgmtAcctSchemaElementValue)) {
			financialMgmtAcctSchemaElement
					.remove(financialMgmtAcctSchemaElementValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAcctSchemaElement</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAcctSchemaElement() {
		while (!financialMgmtAcctSchemaElement.isEmpty()) {
			removeFromFinancialMgmtAcctSchemaElement(financialMgmtAcctSchemaElement
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaElementListType#getFinancialMgmtAcctSchemaElement() <em>financialMgmtAcctSchemaElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaElementListType#getFinancialMgmtAcctSchemaElement() financialMgmtAcctSchemaElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElement(
			List<FinancialMgmtAcctSchemaElementType> newFinancialMgmtAcctSchemaElement) {
		financialMgmtAcctSchemaElement = newFinancialMgmtAcctSchemaElement;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAcctSchemaElementListType ";
	}
}
