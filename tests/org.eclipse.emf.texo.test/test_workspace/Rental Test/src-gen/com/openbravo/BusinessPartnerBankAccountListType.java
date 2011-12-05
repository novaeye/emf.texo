package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerBankAccountListType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerBankAccountListType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BusinessPartnerBankAccountType> businessPartnerBankAccount = new ArrayList<BusinessPartnerBankAccountType>();

	/**
	 * Returns the value of '<em><b>businessPartnerBankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerBankAccount</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerBankAccountType> getBusinessPartnerBankAccount() {
		return businessPartnerBankAccount;
	}

	/**
	 * Adds to the <em>businessPartnerBankAccount</em> feature.
	 * @generated
	 */
	public void addToBusinessPartnerBankAccount(
			BusinessPartnerBankAccountType businessPartnerBankAccountValue) {
		if (!businessPartnerBankAccount
				.contains(businessPartnerBankAccountValue)) {

			businessPartnerBankAccount.add(businessPartnerBankAccountValue);
		}

	}

	/**			
	 * Removes from the <em>businessPartnerBankAccount</em> feature.
	 * @generated
	 */
	public void removeFromBusinessPartnerBankAccount(
			BusinessPartnerBankAccountType businessPartnerBankAccountValue) {
		if (businessPartnerBankAccount
				.contains(businessPartnerBankAccountValue)) {
			businessPartnerBankAccount.remove(businessPartnerBankAccountValue);
		}
	}

	/**			
	 * Clears the <em>businessPartnerBankAccount</em> feature.
	 * @generated
	 */
	public void clearBusinessPartnerBankAccount() {
		while (!businessPartnerBankAccount.isEmpty()) {
			removeFromBusinessPartnerBankAccount(businessPartnerBankAccount
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BusinessPartnerBankAccountListType#getBusinessPartnerBankAccount() <em>businessPartnerBankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerBankAccountListType#getBusinessPartnerBankAccount() businessPartnerBankAccount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccount(
			List<BusinessPartnerBankAccountType> newBusinessPartnerBankAccount) {
		businessPartnerBankAccount = newBusinessPartnerBankAccount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BusinessPartnerBankAccountListType ";
	}
}
