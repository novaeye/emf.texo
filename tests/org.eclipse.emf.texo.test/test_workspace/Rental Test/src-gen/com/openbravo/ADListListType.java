package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADListListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADListListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADListType> aDList = new ArrayList<ADListType>();

	/**
	 * Returns the value of '<em><b>aDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDList</b></em>' feature
	 * @generated
	 */
	public List<ADListType> getADList() {
		return aDList;
	}

	/**
	 * Adds to the <em>aDList</em> feature.
	 * @generated
	 */
	public void addToADList(ADListType aDListValue) {
		if (!aDList.contains(aDListValue)) {

			aDList.add(aDListValue);
		}

	}

	/**			
	 * Removes from the <em>aDList</em> feature.
	 * @generated
	 */
	public void removeFromADList(ADListType aDListValue) {
		if (aDList.contains(aDListValue)) {
			aDList.remove(aDListValue);
		}
	}

	/**			
	 * Clears the <em>aDList</em> feature.
	 * @generated
	 */
	public void clearADList() {
		while (!aDList.isEmpty()) {
			removeFromADList(aDList.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADListListType#getADList() <em>aDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADListListType#getADList() aDList}' feature.
	 * @generated
	 */
	public void setADList(List<ADListType> newADList) {
		aDList = newADList;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADListListType ";
	}
}
