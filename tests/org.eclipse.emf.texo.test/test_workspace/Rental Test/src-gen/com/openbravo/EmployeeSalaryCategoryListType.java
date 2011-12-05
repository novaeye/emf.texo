package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>EmployeeSalaryCategoryListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class EmployeeSalaryCategoryListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<EmployeeSalaryCategoryType> employeeSalaryCategory = new ArrayList<EmployeeSalaryCategoryType>();

	/**
	 * Returns the value of '<em><b>employeeSalaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeSalaryCategory</b></em>' feature
	 * @generated
	 */
	public List<EmployeeSalaryCategoryType> getEmployeeSalaryCategory() {
		return employeeSalaryCategory;
	}

	/**
	 * Adds to the <em>employeeSalaryCategory</em> feature.
	 * @generated
	 */
	public void addToEmployeeSalaryCategory(
			EmployeeSalaryCategoryType employeeSalaryCategoryValue) {
		if (!employeeSalaryCategory.contains(employeeSalaryCategoryValue)) {

			employeeSalaryCategory.add(employeeSalaryCategoryValue);
		}

	}

	/**			
	 * Removes from the <em>employeeSalaryCategory</em> feature.
	 * @generated
	 */
	public void removeFromEmployeeSalaryCategory(
			EmployeeSalaryCategoryType employeeSalaryCategoryValue) {
		if (employeeSalaryCategory.contains(employeeSalaryCategoryValue)) {
			employeeSalaryCategory.remove(employeeSalaryCategoryValue);
		}
	}

	/**			
	 * Clears the <em>employeeSalaryCategory</em> feature.
	 * @generated
	 */
	public void clearEmployeeSalaryCategory() {
		while (!employeeSalaryCategory.isEmpty()) {
			removeFromEmployeeSalaryCategory(employeeSalaryCategory.iterator()
					.next());
		}
	}

	/**
	 * Sets the '{@link EmployeeSalaryCategoryListType#getEmployeeSalaryCategory() <em>employeeSalaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link EmployeeSalaryCategoryListType#getEmployeeSalaryCategory() employeeSalaryCategory}' feature.
	 * @generated
	 */
	public void setEmployeeSalaryCategory(
			List<EmployeeSalaryCategoryType> newEmployeeSalaryCategory) {
		employeeSalaryCategory = newEmployeeSalaryCategory;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "EmployeeSalaryCategoryListType ";
	}
}
