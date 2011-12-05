package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINFinancialAccountAcctType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINFinancialAccountAcctType {

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
	private ReferenceType account = null;

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
	private ReferenceType receivePaymentAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType makePaymentAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType depositAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType withdrawalAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType debitAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType creditAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINBankfeeAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINBankrevaluationgainAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINBankrevaluationlossAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINOutIntransitAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clearedPaymentAccountOUT = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType inTransitPaymentAccountIN = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clearedPaymentAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINAssetAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINTransitoryAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean enablebankstatement = null;

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
	private List<FINFinancialAccountAcctTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FINFinancialAccountAcctTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FINFinancialAccountAcctType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>account</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>account</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccount() {
		return account;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
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
	 * Sets the '{@link FINFinancialAccountAcctType#getAccountingSchema() <em>accountingSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getAccountingSchema() accountingSchema}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getClient() client}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getActive() active}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>receivePaymentAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>receivePaymentAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReceivePaymentAccount() {
		return receivePaymentAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getReceivePaymentAccount() <em>receivePaymentAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getReceivePaymentAccount() receivePaymentAccount}' feature.
	 * @generated
	 */
	public void setReceivePaymentAccount(ReferenceType newReceivePaymentAccount) {
		receivePaymentAccount = newReceivePaymentAccount;
	}

	/**
	 * Returns the value of '<em><b>makePaymentAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>makePaymentAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMakePaymentAccount() {
		return makePaymentAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getMakePaymentAccount() <em>makePaymentAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getMakePaymentAccount() makePaymentAccount}' feature.
	 * @generated
	 */
	public void setMakePaymentAccount(ReferenceType newMakePaymentAccount) {
		makePaymentAccount = newMakePaymentAccount;
	}

	/**
	 * Returns the value of '<em><b>depositAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>depositAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDepositAccount() {
		return depositAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getDepositAccount() <em>depositAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getDepositAccount() depositAccount}' feature.
	 * @generated
	 */
	public void setDepositAccount(ReferenceType newDepositAccount) {
		depositAccount = newDepositAccount;
	}

	/**
	 * Returns the value of '<em><b>withdrawalAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withdrawalAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWithdrawalAccount() {
		return withdrawalAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getWithdrawalAccount() <em>withdrawalAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getWithdrawalAccount() withdrawalAccount}' feature.
	 * @generated
	 */
	public void setWithdrawalAccount(ReferenceType newWithdrawalAccount) {
		withdrawalAccount = newWithdrawalAccount;
	}

	/**
	 * Returns the value of '<em><b>debitAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>debitAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDebitAccount() {
		return debitAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getDebitAccount() <em>debitAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getDebitAccount() debitAccount}' feature.
	 * @generated
	 */
	public void setDebitAccount(ReferenceType newDebitAccount) {
		debitAccount = newDebitAccount;
	}

	/**
	 * Returns the value of '<em><b>creditAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>creditAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCreditAccount() {
		return creditAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getCreditAccount() <em>creditAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getCreditAccount() creditAccount}' feature.
	 * @generated
	 */
	public void setCreditAccount(ReferenceType newCreditAccount) {
		creditAccount = newCreditAccount;
	}

	/**
	 * Returns the value of '<em><b>fINBankfeeAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankfeeAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINBankfeeAcct() {
		return fINBankfeeAcct;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getFINBankfeeAcct() <em>fINBankfeeAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getFINBankfeeAcct() fINBankfeeAcct}' feature.
	 * @generated
	 */
	public void setFINBankfeeAcct(ReferenceType newFINBankfeeAcct) {
		fINBankfeeAcct = newFINBankfeeAcct;
	}

	/**
	 * Returns the value of '<em><b>fINBankrevaluationgainAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankrevaluationgainAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINBankrevaluationgainAcct() {
		return fINBankrevaluationgainAcct;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getFINBankrevaluationgainAcct() <em>fINBankrevaluationgainAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getFINBankrevaluationgainAcct() fINBankrevaluationgainAcct}' feature.
	 * @generated
	 */
	public void setFINBankrevaluationgainAcct(
			ReferenceType newFINBankrevaluationgainAcct) {
		fINBankrevaluationgainAcct = newFINBankrevaluationgainAcct;
	}

	/**
	 * Returns the value of '<em><b>fINBankrevaluationlossAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankrevaluationlossAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINBankrevaluationlossAcct() {
		return fINBankrevaluationlossAcct;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getFINBankrevaluationlossAcct() <em>fINBankrevaluationlossAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getFINBankrevaluationlossAcct() fINBankrevaluationlossAcct}' feature.
	 * @generated
	 */
	public void setFINBankrevaluationlossAcct(
			ReferenceType newFINBankrevaluationlossAcct) {
		fINBankrevaluationlossAcct = newFINBankrevaluationlossAcct;
	}

	/**
	 * Returns the value of '<em><b>fINOutIntransitAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINOutIntransitAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINOutIntransitAcct() {
		return fINOutIntransitAcct;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getFINOutIntransitAcct() <em>fINOutIntransitAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getFINOutIntransitAcct() fINOutIntransitAcct}' feature.
	 * @generated
	 */
	public void setFINOutIntransitAcct(ReferenceType newFINOutIntransitAcct) {
		fINOutIntransitAcct = newFINOutIntransitAcct;
	}

	/**
	 * Returns the value of '<em><b>clearedPaymentAccountOUT</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clearedPaymentAccountOUT</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClearedPaymentAccountOUT() {
		return clearedPaymentAccountOUT;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getClearedPaymentAccountOUT() <em>clearedPaymentAccountOUT</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getClearedPaymentAccountOUT() clearedPaymentAccountOUT}' feature.
	 * @generated
	 */
	public void setClearedPaymentAccountOUT(
			ReferenceType newClearedPaymentAccountOUT) {
		clearedPaymentAccountOUT = newClearedPaymentAccountOUT;
	}

	/**
	 * Returns the value of '<em><b>inTransitPaymentAccountIN</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>inTransitPaymentAccountIN</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInTransitPaymentAccountIN() {
		return inTransitPaymentAccountIN;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getInTransitPaymentAccountIN() <em>inTransitPaymentAccountIN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getInTransitPaymentAccountIN() inTransitPaymentAccountIN}' feature.
	 * @generated
	 */
	public void setInTransitPaymentAccountIN(
			ReferenceType newInTransitPaymentAccountIN) {
		inTransitPaymentAccountIN = newInTransitPaymentAccountIN;
	}

	/**
	 * Returns the value of '<em><b>clearedPaymentAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clearedPaymentAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClearedPaymentAccount() {
		return clearedPaymentAccount;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getClearedPaymentAccount() <em>clearedPaymentAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getClearedPaymentAccount() clearedPaymentAccount}' feature.
	 * @generated
	 */
	public void setClearedPaymentAccount(ReferenceType newClearedPaymentAccount) {
		clearedPaymentAccount = newClearedPaymentAccount;
	}

	/**
	 * Returns the value of '<em><b>fINAssetAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINAssetAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINAssetAcct() {
		return fINAssetAcct;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getFINAssetAcct() <em>fINAssetAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getFINAssetAcct() fINAssetAcct}' feature.
	 * @generated
	 */
	public void setFINAssetAcct(ReferenceType newFINAssetAcct) {
		fINAssetAcct = newFINAssetAcct;
	}

	/**
	 * Returns the value of '<em><b>fINTransitoryAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINTransitoryAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINTransitoryAcct() {
		return fINTransitoryAcct;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getFINTransitoryAcct() <em>fINTransitoryAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getFINTransitoryAcct() fINTransitoryAcct}' feature.
	 * @generated
	 */
	public void setFINTransitoryAcct(ReferenceType newFINTransitoryAcct) {
		fINTransitoryAcct = newFINTransitoryAcct;
	}

	/**
	 * Returns the value of '<em><b>enablebankstatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>enablebankstatement</b></em>' feature
	 * @generated
	 */
	public Boolean getEnablebankstatement() {
		return enablebankstatement;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getEnablebankstatement() <em>enablebankstatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getEnablebankstatement() enablebankstatement}' feature.
	 * @generated
	 */
	public void setEnablebankstatement(Boolean newEnablebankstatement) {
		enablebankstatement = newEnablebankstatement;
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
	 * Sets the '{@link FINFinancialAccountAcctType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getId1() id1}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FINFinancialAccountAcctType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#isReference() reference}' feature.
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
	public List<FINFinancialAccountAcctTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FINFinancialAccountAcctType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountAcctType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FINFinancialAccountAcctTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FINFinancialAccountAcctType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
