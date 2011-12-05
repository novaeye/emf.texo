package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADSessionUsageAuditListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADSessionUsageAuditListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADSessionUsageAuditType> aDSessionUsageAudit = new ArrayList<ADSessionUsageAuditType>();

	/**
	 * Returns the value of '<em><b>aDSessionUsageAudit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSessionUsageAudit</b></em>' feature
	 * @generated
	 */
	public List<ADSessionUsageAuditType> getADSessionUsageAudit() {
		return aDSessionUsageAudit;
	}

	/**
	 * Adds to the <em>aDSessionUsageAudit</em> feature.
	 * @generated
	 */
	public void addToADSessionUsageAudit(
			ADSessionUsageAuditType aDSessionUsageAuditValue) {
		if (!aDSessionUsageAudit.contains(aDSessionUsageAuditValue)) {

			aDSessionUsageAudit.add(aDSessionUsageAuditValue);
		}

	}

	/**			
	 * Removes from the <em>aDSessionUsageAudit</em> feature.
	 * @generated
	 */
	public void removeFromADSessionUsageAudit(
			ADSessionUsageAuditType aDSessionUsageAuditValue) {
		if (aDSessionUsageAudit.contains(aDSessionUsageAuditValue)) {
			aDSessionUsageAudit.remove(aDSessionUsageAuditValue);
		}
	}

	/**			
	 * Clears the <em>aDSessionUsageAudit</em> feature.
	 * @generated
	 */
	public void clearADSessionUsageAudit() {
		while (!aDSessionUsageAudit.isEmpty()) {
			removeFromADSessionUsageAudit(aDSessionUsageAudit.iterator().next());
		}
	}

	/**
	 * Sets the '{@link ADSessionUsageAuditListType#getADSessionUsageAudit() <em>aDSessionUsageAudit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSessionUsageAuditListType#getADSessionUsageAudit() aDSessionUsageAudit}' feature.
	 * @generated
	 */
	public void setADSessionUsageAudit(
			List<ADSessionUsageAuditType> newADSessionUsageAudit) {
		aDSessionUsageAudit = newADSessionUsageAudit;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ADSessionUsageAuditListType ";
	}
}
