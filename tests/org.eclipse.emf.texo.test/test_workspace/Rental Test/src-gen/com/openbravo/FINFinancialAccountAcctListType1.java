package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINFinancialAccountAcctListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINFinancialAccountAcctListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<FINFinancialAccountAcctType> fINFinancialAccountAcct = new ArrayList<FINFinancialAccountAcctType>();

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcct</b></em>' feature
	 * @generated
	 */
	public List<FINFinancialAccountAcctType> getFINFinancialAccountAcct() {
		return fINFinancialAccountAcct;
	}

	/**
	 * Adds to the <em>fINFinancialAccountAcct</em> feature.
	 * @generated
	 */
	public void addToFINFinancialAccountAcct(
			FINFinancialAccountAcctType fINFinancialAccountAcctValue) {
		if (!fINFinancialAccountAcct.contains(fINFinancialAccountAcctValue)) {

			fINFinancialAccountAcct.add(fINFinancialAccountAcctValue);
		}

	}

	/**			
	 * Removes from the <em>fINFinancialAccountAcct</em> feature.
	 * @generated
	 */
	public void removeFromFINFinancialAccountAcct(
			FINFinancialAccountAcctType fINFinancialAccountAcctValue) {
		if (fINFinancialAccountAcct.contains(fINFinancialAccountAcctValue)) {
			fINFinancialAccountAcct.remove(fINFinancialAccountAcctValue);
		}
	}

	/**			
	 * Clears the <em>fINFinancialAccountAcct</em> feature.
	 * @generated
	 */
	public void clearFINFinancialAccountAcct() {
		while (!fINFinancialAccountAcct.isEmpty()) {
			removeFromFINFinancialAccountAcct(fINFinancialAccountAcct
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctListType1#getFINFinancialAccountAcct() <em>fINFinancialAccountAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctListType1#getFINFinancialAccountAcct() fINFinancialAccountAcct}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcct(
			List<FINFinancialAccountAcctType> newFINFinancialAccountAcct) {
		fINFinancialAccountAcct = newFINFinancialAccountAcct;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "FINFinancialAccountAcctListType1 ";
	}
}
