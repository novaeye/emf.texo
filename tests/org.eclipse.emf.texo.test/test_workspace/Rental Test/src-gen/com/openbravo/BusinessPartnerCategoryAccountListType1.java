package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerCategoryAccountListType1</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerCategoryAccountListType1 {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BusinessPartnerCategoryAccountType> businessPartnerCategoryAccount = new ArrayList<BusinessPartnerCategoryAccountType>();

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccount</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerCategoryAccountType> getBusinessPartnerCategoryAccount() {
		return businessPartnerCategoryAccount;
	}

	/**
	 * Adds to the <em>businessPartnerCategoryAccount</em> feature.
	 * @generated
	 */
	public void addToBusinessPartnerCategoryAccount(
			BusinessPartnerCategoryAccountType businessPartnerCategoryAccountValue) {
		if (!businessPartnerCategoryAccount
				.contains(businessPartnerCategoryAccountValue)) {

			businessPartnerCategoryAccount
					.add(businessPartnerCategoryAccountValue);
		}

	}

	/**			
	 * Removes from the <em>businessPartnerCategoryAccount</em> feature.
	 * @generated
	 */
	public void removeFromBusinessPartnerCategoryAccount(
			BusinessPartnerCategoryAccountType businessPartnerCategoryAccountValue) {
		if (businessPartnerCategoryAccount
				.contains(businessPartnerCategoryAccountValue)) {
			businessPartnerCategoryAccount
					.remove(businessPartnerCategoryAccountValue);
		}
	}

	/**			
	 * Clears the <em>businessPartnerCategoryAccount</em> feature.
	 * @generated
	 */
	public void clearBusinessPartnerCategoryAccount() {
		while (!businessPartnerCategoryAccount.isEmpty()) {
			removeFromBusinessPartnerCategoryAccount(businessPartnerCategoryAccount
					.iterator().next());
		}
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountListType1#getBusinessPartnerCategoryAccount() <em>businessPartnerCategoryAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountListType1#getBusinessPartnerCategoryAccount() businessPartnerCategoryAccount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccount(
			List<BusinessPartnerCategoryAccountType> newBusinessPartnerCategoryAccount) {
		businessPartnerCategoryAccount = newBusinessPartnerCategoryAccount;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BusinessPartnerCategoryAccountListType1 ";
	}
}
