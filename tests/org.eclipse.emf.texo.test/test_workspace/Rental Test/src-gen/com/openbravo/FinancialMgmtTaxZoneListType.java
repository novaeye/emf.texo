package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxZoneListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxZoneListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FinancialMgmtTaxZoneType> financialMgmtTaxZone = new ArrayList<FinancialMgmtTaxZoneType>();

	/**
	 * Returns the value of '<em><b>financialMgmtTaxZone</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxZone</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxZoneType> getFinancialMgmtTaxZone() {
		return financialMgmtTaxZone;
	}

	/**
	 * Adds to the <em>financialMgmtTaxZone</em> feature.
	 * @generated
	 */
	public void addToFinancialMgmtTaxZone(
			FinancialMgmtTaxZoneType financialMgmtTaxZoneValue) {
		if (!financialMgmtTaxZone.contains(financialMgmtTaxZoneValue)) {

			financialMgmtTaxZone.add(financialMgmtTaxZoneValue);
		}

	}

	/**			
	 * Removes from the <em>financialMgmtTaxZone</em> feature.
	 * @generated
	 */
	public void removeFromFinancialMgmtTaxZone(
			FinancialMgmtTaxZoneType financialMgmtTaxZoneValue) {
		if (financialMgmtTaxZone.contains(financialMgmtTaxZoneValue)) {
			financialMgmtTaxZone.remove(financialMgmtTaxZoneValue);
		}
	}

	/**			
	 * Clears the <em>financialMgmtTaxZone</em> feature.
	 * @generated
	 */
	public void clearFinancialMgmtTaxZone() {
		while (!financialMgmtTaxZone.isEmpty()) {
			removeFromFinancialMgmtTaxZone(financialMgmtTaxZone.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxZoneListType#getFinancialMgmtTaxZone() <em>financialMgmtTaxZone</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxZoneListType#getFinancialMgmtTaxZone() financialMgmtTaxZone}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZone(
			List<FinancialMgmtTaxZoneType> newFinancialMgmtTaxZone) {
		financialMgmtTaxZone = newFinancialMgmtTaxZone;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FinancialMgmtTaxZoneListType ";
	}
}
