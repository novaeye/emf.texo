package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BankAccountAccountsType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BankAccountAccountsType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String id = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType accountingSchema = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType client = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organization = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean active = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime creationDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType createdBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime updated = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType updatedBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankInTransit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAsset = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankExpense = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankInterestRevenue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankInterestExpense = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankUnidentifiedReceipts = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType unallocatedCash = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentSelection = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankSettlementGain = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankSettlementLoss = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankRevaluationGain = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankRevaluationLoss = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String id1 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String identifier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private boolean reference = false;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<BankAccountAccountsTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<BankAccountAccountsTypeAnyAttributeFeatureGroup>();

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>bankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccount() {
		return bankAccount;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(ReferenceType newBankAccount) {
		bankAccount = newBankAccount;
	}

	/**
	 * Returns the value of '<em><b>accountingSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingSchema</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccountingSchema() {
		return accountingSchema;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getAccountingSchema() <em>accountingSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getAccountingSchema() accountingSchema}' feature.
	 * @generated
	 */
	public void setAccountingSchema(ReferenceType newAccountingSchema) {
		accountingSchema = newAccountingSchema;
	}

	/**
	 * Returns the value of '<em><b>client</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>client</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClient() {
		return client;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getClient() client}' feature.
	 * @generated
	 */
	public void setClient(ReferenceType newClient) {
		client = newClient;
	}

	/**
	 * Returns the value of '<em><b>organization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organization</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganization() {
		return organization;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
	}

	/**
	 * Returns the value of '<em><b>active</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>active</b></em>' feature
	 * @generated
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>creationDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>creationDate</b></em>' feature
	 * @generated
	 */
	public DateTime getCreationDate() {
		return creationDate;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getCreationDate() creationDate}' feature.
	 * @generated
	 */
	public void setCreationDate(DateTime newCreationDate) {
		creationDate = newCreationDate;
	}

	/**
	 * Returns the value of '<em><b>createdBy</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createdBy</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getCreatedBy() createdBy}' feature.
	 * @generated
	 */
	public void setCreatedBy(ReferenceType newCreatedBy) {
		createdBy = newCreatedBy;
	}

	/**
	 * Returns the value of '<em><b>updated</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>updated</b></em>' feature
	 * @generated
	 */
	public DateTime getUpdated() {
		return updated;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getUpdated() updated}' feature.
	 * @generated
	 */
	public void setUpdated(DateTime newUpdated) {
		updated = newUpdated;
	}

	/**
	 * Returns the value of '<em><b>updatedBy</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>updatedBy</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>bankInTransit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankInTransit</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankInTransit() {
		return bankInTransit;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankInTransit() <em>bankInTransit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankInTransit() bankInTransit}' feature.
	 * @generated
	 */
	public void setBankInTransit(ReferenceType newBankInTransit) {
		bankInTransit = newBankInTransit;
	}

	/**
	 * Returns the value of '<em><b>bankAsset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAsset</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAsset() {
		return bankAsset;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankAsset() <em>bankAsset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankAsset() bankAsset}' feature.
	 * @generated
	 */
	public void setBankAsset(ReferenceType newBankAsset) {
		bankAsset = newBankAsset;
	}

	/**
	 * Returns the value of '<em><b>bankExpense</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankExpense</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankExpense() {
		return bankExpense;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankExpense() <em>bankExpense</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankExpense() bankExpense}' feature.
	 * @generated
	 */
	public void setBankExpense(ReferenceType newBankExpense) {
		bankExpense = newBankExpense;
	}

	/**
	 * Returns the value of '<em><b>bankInterestRevenue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankInterestRevenue</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankInterestRevenue() {
		return bankInterestRevenue;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankInterestRevenue() <em>bankInterestRevenue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankInterestRevenue() bankInterestRevenue}' feature.
	 * @generated
	 */
	public void setBankInterestRevenue(ReferenceType newBankInterestRevenue) {
		bankInterestRevenue = newBankInterestRevenue;
	}

	/**
	 * Returns the value of '<em><b>bankInterestExpense</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankInterestExpense</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankInterestExpense() {
		return bankInterestExpense;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankInterestExpense() <em>bankInterestExpense</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankInterestExpense() bankInterestExpense}' feature.
	 * @generated
	 */
	public void setBankInterestExpense(ReferenceType newBankInterestExpense) {
		bankInterestExpense = newBankInterestExpense;
	}

	/**
	 * Returns the value of '<em><b>bankUnidentifiedReceipts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankUnidentifiedReceipts</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankUnidentifiedReceipts() {
		return bankUnidentifiedReceipts;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankUnidentifiedReceipts() <em>bankUnidentifiedReceipts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankUnidentifiedReceipts() bankUnidentifiedReceipts}' feature.
	 * @generated
	 */
	public void setBankUnidentifiedReceipts(
			ReferenceType newBankUnidentifiedReceipts) {
		bankUnidentifiedReceipts = newBankUnidentifiedReceipts;
	}

	/**
	 * Returns the value of '<em><b>unallocatedCash</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unallocatedCash</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUnallocatedCash() {
		return unallocatedCash;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getUnallocatedCash() <em>unallocatedCash</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getUnallocatedCash() unallocatedCash}' feature.
	 * @generated
	 */
	public void setUnallocatedCash(ReferenceType newUnallocatedCash) {
		unallocatedCash = newUnallocatedCash;
	}

	/**
	 * Returns the value of '<em><b>paymentSelection</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentSelection</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentSelection() {
		return paymentSelection;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getPaymentSelection() <em>paymentSelection</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getPaymentSelection() paymentSelection}' feature.
	 * @generated
	 */
	public void setPaymentSelection(ReferenceType newPaymentSelection) {
		paymentSelection = newPaymentSelection;
	}

	/**
	 * Returns the value of '<em><b>bankSettlementGain</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankSettlementGain</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankSettlementGain() {
		return bankSettlementGain;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankSettlementGain() <em>bankSettlementGain</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankSettlementGain() bankSettlementGain}' feature.
	 * @generated
	 */
	public void setBankSettlementGain(ReferenceType newBankSettlementGain) {
		bankSettlementGain = newBankSettlementGain;
	}

	/**
	 * Returns the value of '<em><b>bankSettlementLoss</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankSettlementLoss</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankSettlementLoss() {
		return bankSettlementLoss;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankSettlementLoss() <em>bankSettlementLoss</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankSettlementLoss() bankSettlementLoss}' feature.
	 * @generated
	 */
	public void setBankSettlementLoss(ReferenceType newBankSettlementLoss) {
		bankSettlementLoss = newBankSettlementLoss;
	}

	/**
	 * Returns the value of '<em><b>bankRevaluationGain</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankRevaluationGain</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankRevaluationGain() {
		return bankRevaluationGain;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankRevaluationGain() <em>bankRevaluationGain</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankRevaluationGain() bankRevaluationGain}' feature.
	 * @generated
	 */
	public void setBankRevaluationGain(ReferenceType newBankRevaluationGain) {
		bankRevaluationGain = newBankRevaluationGain;
	}

	/**
	 * Returns the value of '<em><b>bankRevaluationLoss</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankRevaluationLoss</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankRevaluationLoss() {
		return bankRevaluationLoss;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getBankRevaluationLoss() <em>bankRevaluationLoss</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getBankRevaluationLoss() bankRevaluationLoss}' feature.
	 * @generated
	 */
	public void setBankRevaluationLoss(ReferenceType newBankRevaluationLoss) {
		bankRevaluationLoss = newBankRevaluationLoss;
	}

	/**
	 * Returns the value of '<em><b>id1</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>id1</b></em>' feature
	 * @generated
	 */
	public String getId1() {
		return id1;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getId1() id1}' feature.
	 * @generated
	 */
	public void setId1(String newId1) {
		id1 = newId1;
	}

	/**
	 * Returns the value of '<em><b>identifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>identifier</b></em>' feature
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getIdentifier() identifier}' feature.
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		identifier = newIdentifier;
	}

	/**
	 * Returns the value of '<em><b>reference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reference</b></em>' feature
	 * @generated
	 */
	public boolean isReference() {
		return reference;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#isReference() reference}' feature.
	 * @generated
	 */
	public void setReference(boolean newReference) {
		reference = newReference;
	}

	/**
	 * Returns the value of '<em><b>anyAttribute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>anyAttribute</b></em>' feature
	 * @generated
	 */
	public List<BankAccountAccountsTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link BankAccountAccountsType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountAccountsType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<BankAccountAccountsTypeAnyAttributeFeatureGroup> newAnyAttribute) {
		anyAttribute = newAnyAttribute;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "BankAccountAccountsType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
