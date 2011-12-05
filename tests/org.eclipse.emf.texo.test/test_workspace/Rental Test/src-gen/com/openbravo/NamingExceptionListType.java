package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>NamingExceptionListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class NamingExceptionListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<NamingExceptionType> namingException = new ArrayList<NamingExceptionType>();

	/**
	 * Returns the value of '<em><b>namingException</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>namingException</b></em>' feature
	 * @generated
	 */
	public List<NamingExceptionType> getNamingException() {
		return namingException;
	}

	/**
	 * Adds to the <em>namingException</em> feature.
	 * @generated
	 */
	public void addToNamingException(NamingExceptionType namingExceptionValue) {
		if (!namingException.contains(namingExceptionValue)) {

			namingException.add(namingExceptionValue);
		}

	}

	/**			
	 * Removes from the <em>namingException</em> feature.
	 * @generated
	 */
	public void removeFromNamingException(
			NamingExceptionType namingExceptionValue) {
		if (namingException.contains(namingExceptionValue)) {
			namingException.remove(namingExceptionValue);
		}
	}

	/**			
	 * Clears the <em>namingException</em> feature.
	 * @generated
	 */
	public void clearNamingException() {
		while (!namingException.isEmpty()) {
			removeFromNamingException(namingException.iterator().next());
		}
	}

	/**
	 * Sets the '{@link NamingExceptionListType#getNamingException() <em>namingException</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link NamingExceptionListType#getNamingException() namingException}' feature.
	 * @generated
	 */
	public void setNamingException(List<NamingExceptionType> newNamingException) {
		namingException = newNamingException;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "NamingExceptionListType ";
	}
}
