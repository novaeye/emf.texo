package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentTermTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentTermTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtPaymentTermTrlType> financialMgmtPaymentTermTrl = new ArrayList<FinancialMgmtPaymentTermTrlType>();

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentTermTrlType> getFinancialMgmtPaymentTermTrl() {
		return financialMgmtPaymentTermTrl;
	}

	/**
	 * Adds to the <em>financialMgmtPaymentTermTrl</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtPaymentTermTrl(
			FinancialMgmtPaymentTermTrlType financialMgmtPaymentTermTrlValue) {
		if (!financialMgmtPaymentTermTrl
				.contains(financialMgmtPaymentTermTrlValue)) {

			financialMgmtPaymentTermTrl.add(financialMgmtPaymentTermTrlValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtPaymentTermTrl</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtPaymentTermTrl(
			FinancialMgmtPaymentTermTrlType financialMgmtPaymentTermTrlValue) {
		if (financialMgmtPaymentTermTrl
				.contains(financialMgmtPaymentTermTrlValue)) {
			financialMgmtPaymentTermTrl
					.remove(financialMgmtPaymentTermTrlValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtPaymentTermTrl</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtPaymentTermTrl() {
		while (!financialMgmtPaymentTermTrl.isEmpty()) {
			removeFromFinancialMgmtPaymentTermTrl(financialMgmtPaymentTermTrl
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermTrlListType1#getFinancialMgmtPaymentTermTrl() <em>financialMgmtPaymentTermTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermTrlListType1#getFinancialMgmtPaymentTermTrl() financialMgmtPaymentTermTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermTrl(
			List<FinancialMgmtPaymentTermTrlType> newFinancialMgmtPaymentTermTrl) {
		financialMgmtPaymentTermTrl = newFinancialMgmtPaymentTermTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtPaymentTermTrlListType1 ";
	}
}
