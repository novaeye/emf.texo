package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctSchemaGLListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctSchemaGLListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtAcctSchemaGLType> financialMgmtAcctSchemaGL = new ArrayList<FinancialMgmtAcctSchemaGLType>();

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGL</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaGLType> getFinancialMgmtAcctSchemaGL() {
		return financialMgmtAcctSchemaGL;
	}

	/**
	 * Adds to the <em>financialMgmtAcctSchemaGL</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtAcctSchemaGL(
			FinancialMgmtAcctSchemaGLType financialMgmtAcctSchemaGLValue) {
		if (!financialMgmtAcctSchemaGL.contains(financialMgmtAcctSchemaGLValue)) {

			financialMgmtAcctSchemaGL.add(financialMgmtAcctSchemaGLValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtAcctSchemaGL</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtAcctSchemaGL(
			FinancialMgmtAcctSchemaGLType financialMgmtAcctSchemaGLValue) {
		if (financialMgmtAcctSchemaGL.contains(financialMgmtAcctSchemaGLValue)) {
			financialMgmtAcctSchemaGL.remove(financialMgmtAcctSchemaGLValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtAcctSchemaGL</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtAcctSchemaGL() {
		while (!financialMgmtAcctSchemaGL.isEmpty()) {
			removeFromFinancialMgmtAcctSchemaGL(financialMgmtAcctSchemaGL
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLListType#getFinancialMgmtAcctSchemaGL() <em>financialMgmtAcctSchemaGL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLListType#getFinancialMgmtAcctSchemaGL() financialMgmtAcctSchemaGL}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGL(
			List<FinancialMgmtAcctSchemaGLType> newFinancialMgmtAcctSchemaGL) {
		financialMgmtAcctSchemaGL = newFinancialMgmtAcctSchemaGL;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtAcctSchemaGLListType ";
	}
}
