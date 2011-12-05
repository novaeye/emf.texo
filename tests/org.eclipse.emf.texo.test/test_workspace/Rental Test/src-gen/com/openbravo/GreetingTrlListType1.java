package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>GreetingTrlListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class GreetingTrlListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<GreetingTrlType> greetingTrl = new ArrayList<GreetingTrlType>();

	/**
	 * Returns the value of '<em><b>greetingTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greetingTrl</b></em>' feature
	 * @generated
	 */
	public List<GreetingTrlType> getGreetingTrl() {
		return greetingTrl;
	}

	/**
	 * Adds to the <em>greetingTrl</em> feature.
	 * @generated
	 */
	public void addToGreetingTrl(GreetingTrlType greetingTrlValue) {
		if (!greetingTrl.contains(greetingTrlValue)) {

			greetingTrl.add(greetingTrlValue);
		}

	}

	/**			
	 * Removes from the <em>greetingTrl</em> feature.
	 * @generated
	 */
	public void removeFromGreetingTrl(GreetingTrlType greetingTrlValue) {
		if (greetingTrl.contains(greetingTrlValue)) {
			greetingTrl.remove(greetingTrlValue);
		}
	}

	/**			
	 * Clears the <em>greetingTrl</em> feature.
	 * @generated
	 */
	public void clearGreetingTrl() {
		while (!greetingTrl.isEmpty()) {
			removeFromGreetingTrl(greetingTrl.iterator().next());
		}
	}

	/**
	 * Sets the '{@link GreetingTrlListType1#getGreetingTrl() <em>greetingTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link GreetingTrlListType1#getGreetingTrl() greetingTrl}' feature.
	 * @generated
	 */
	public void setGreetingTrl(List<GreetingTrlType> newGreetingTrl) {
		greetingTrl = newGreetingTrl;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "GreetingTrlListType1 ";
	}
}
