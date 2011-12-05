package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>EmployeeAccountsListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class EmployeeAccountsListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<EmployeeAccountsType> employeeAccounts = new ArrayList<EmployeeAccountsType>();

	/**
	 * Returns the value of '<em><b>employeeAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccounts</b></em>' feature
	 * @generated
	 */
	public List<EmployeeAccountsType> getEmployeeAccounts() {
		return employeeAccounts;
	}

	/**
	 * Adds to the <em>employeeAccounts</em> feature.
	 * @generated
	 */
	public void addToEmployeeAccounts(EmployeeAccountsType employeeAccountsValue) {
		if (!employeeAccounts.contains(employeeAccountsValue)) {

			employeeAccounts.add(employeeAccountsValue);
		}

	}

	/**			
	 * Removes from the <em>employeeAccounts</em> feature.
	 * @generated
	 */
	public void removeFromEmployeeAccounts(
			EmployeeAccountsType employeeAccountsValue) {
		if (employeeAccounts.contains(employeeAccountsValue)) {
			employeeAccounts.remove(employeeAccountsValue);
		}
	}

	/**			
	 * Clears the <em>employeeAccounts</em> feature.
	 * @generated
	 */
	public void clearEmployeeAccounts() {
		while (!employeeAccounts.isEmpty()) {
			removeFromEmployeeAccounts(employeeAccounts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link EmployeeAccountsListType1#getEmployeeAccounts() <em>employeeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link EmployeeAccountsListType1#getEmployeeAccounts() employeeAccounts}' feature.
	 * @generated
	 */
	public void setEmployeeAccounts(
			List<EmployeeAccountsType> newEmployeeAccounts) {
		employeeAccounts = newEmployeeAccounts;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "EmployeeAccountsListType1 ";
	}
}
