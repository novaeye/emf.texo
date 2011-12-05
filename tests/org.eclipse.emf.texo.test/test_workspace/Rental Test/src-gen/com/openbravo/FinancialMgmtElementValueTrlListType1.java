package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtElementValueTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtElementValueTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtElementValueTrlType> financialMgmtElementValueTrl = new ArrayList<FinancialMgmtElementValueTrlType>();

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementValueTrlType> getFinancialMgmtElementValueTrl() {
		return financialMgmtElementValueTrl;
	}

	/**
	 * Adds to the <em>financialMgmtElementValueTrl</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtElementValueTrl(
			FinancialMgmtElementValueTrlType financialMgmtElementValueTrlValue) {
		if (!financialMgmtElementValueTrl
				.contains(financialMgmtElementValueTrlValue)) {

			financialMgmtElementValueTrl.add(financialMgmtElementValueTrlValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtElementValueTrl</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtElementValueTrl(
			FinancialMgmtElementValueTrlType financialMgmtElementValueTrlValue) {
		if (financialMgmtElementValueTrl
				.contains(financialMgmtElementValueTrlValue)) {
			financialMgmtElementValueTrl
					.remove(financialMgmtElementValueTrlValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtElementValueTrl</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtElementValueTrl() {
		while (!financialMgmtElementValueTrl.isEmpty()) {
			removeFromFinancialMgmtElementValueTrl(financialMgmtElementValueTrl
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueTrlListType1#getFinancialMgmtElementValueTrl() <em>financialMgmtElementValueTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueTrlListType1#getFinancialMgmtElementValueTrl() financialMgmtElementValueTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueTrl(
			List<FinancialMgmtElementValueTrlType> newFinancialMgmtElementValueTrl) {
		financialMgmtElementValueTrl = newFinancialMgmtElementValueTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtElementValueTrlListType1 ";
	}
}
