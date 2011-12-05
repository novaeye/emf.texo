package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtFinAccPaymentMethodType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtFinAccPaymentMethodType {

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
	private Boolean active = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentMethod = null;

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
	private Boolean automaticReceipt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean automaticPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean automaticDeposit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean automaticWithdrawn = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean payinAllow = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean payoutAllow = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String payinExecutionType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String payoutExecutionType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType payinExecutionProcess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType payoutExecutionProcess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean payinDeferred = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean payoutDeferred = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uponReceiptUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uponDepositUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String iNUponClearingUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uponPaymentUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uponWithdrawalUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String oUTUponClearingUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean payinIsMulticurrency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean payoutIsMulticurrency = null;

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
	private List<FinancialMgmtFinAccPaymentMethodTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtFinAccPaymentMethodTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>paymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentMethod</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
	}

	/**
	 * Returns the value of '<em><b>automaticReceipt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>automaticReceipt</b></em>' feature
	 * @generated
	 */
	public Boolean getAutomaticReceipt() {
		return automaticReceipt;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticReceipt() <em>automaticReceipt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticReceipt() automaticReceipt}' feature.
	 * @generated
	 */
	public void setAutomaticReceipt(Boolean newAutomaticReceipt) {
		automaticReceipt = newAutomaticReceipt;
	}

	/**
	 * Returns the value of '<em><b>automaticPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>automaticPayment</b></em>' feature
	 * @generated
	 */
	public Boolean getAutomaticPayment() {
		return automaticPayment;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticPayment() <em>automaticPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticPayment() automaticPayment}' feature.
	 * @generated
	 */
	public void setAutomaticPayment(Boolean newAutomaticPayment) {
		automaticPayment = newAutomaticPayment;
	}

	/**
	 * Returns the value of '<em><b>automaticDeposit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>automaticDeposit</b></em>' feature
	 * @generated
	 */
	public Boolean getAutomaticDeposit() {
		return automaticDeposit;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticDeposit() <em>automaticDeposit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticDeposit() automaticDeposit}' feature.
	 * @generated
	 */
	public void setAutomaticDeposit(Boolean newAutomaticDeposit) {
		automaticDeposit = newAutomaticDeposit;
	}

	/**
	 * Returns the value of '<em><b>automaticWithdrawn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>automaticWithdrawn</b></em>' feature
	 * @generated
	 */
	public Boolean getAutomaticWithdrawn() {
		return automaticWithdrawn;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticWithdrawn() <em>automaticWithdrawn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getAutomaticWithdrawn() automaticWithdrawn}' feature.
	 * @generated
	 */
	public void setAutomaticWithdrawn(Boolean newAutomaticWithdrawn) {
		automaticWithdrawn = newAutomaticWithdrawn;
	}

	/**
	 * Returns the value of '<em><b>payinAllow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payinAllow</b></em>' feature
	 * @generated
	 */
	public Boolean getPayinAllow() {
		return payinAllow;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinAllow() <em>payinAllow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinAllow() payinAllow}' feature.
	 * @generated
	 */
	public void setPayinAllow(Boolean newPayinAllow) {
		payinAllow = newPayinAllow;
	}

	/**
	 * Returns the value of '<em><b>payoutAllow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payoutAllow</b></em>' feature
	 * @generated
	 */
	public Boolean getPayoutAllow() {
		return payoutAllow;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutAllow() <em>payoutAllow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutAllow() payoutAllow}' feature.
	 * @generated
	 */
	public void setPayoutAllow(Boolean newPayoutAllow) {
		payoutAllow = newPayoutAllow;
	}

	/**
	 * Returns the value of '<em><b>payinExecutionType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payinExecutionType</b></em>' feature
	 * @generated
	 */
	public String getPayinExecutionType() {
		return payinExecutionType;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinExecutionType() <em>payinExecutionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinExecutionType() payinExecutionType}' feature.
	 * @generated
	 */
	public void setPayinExecutionType(String newPayinExecutionType) {
		payinExecutionType = newPayinExecutionType;
	}

	/**
	 * Returns the value of '<em><b>payoutExecutionType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payoutExecutionType</b></em>' feature
	 * @generated
	 */
	public String getPayoutExecutionType() {
		return payoutExecutionType;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutExecutionType() <em>payoutExecutionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutExecutionType() payoutExecutionType}' feature.
	 * @generated
	 */
	public void setPayoutExecutionType(String newPayoutExecutionType) {
		payoutExecutionType = newPayoutExecutionType;
	}

	/**
	 * Returns the value of '<em><b>payinExecutionProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payinExecutionProcess</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPayinExecutionProcess() {
		return payinExecutionProcess;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinExecutionProcess() <em>payinExecutionProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinExecutionProcess() payinExecutionProcess}' feature.
	 * @generated
	 */
	public void setPayinExecutionProcess(ReferenceType newPayinExecutionProcess) {
		payinExecutionProcess = newPayinExecutionProcess;
	}

	/**
	 * Returns the value of '<em><b>payoutExecutionProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payoutExecutionProcess</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPayoutExecutionProcess() {
		return payoutExecutionProcess;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutExecutionProcess() <em>payoutExecutionProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutExecutionProcess() payoutExecutionProcess}' feature.
	 * @generated
	 */
	public void setPayoutExecutionProcess(
			ReferenceType newPayoutExecutionProcess) {
		payoutExecutionProcess = newPayoutExecutionProcess;
	}

	/**
	 * Returns the value of '<em><b>payinDeferred</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payinDeferred</b></em>' feature
	 * @generated
	 */
	public Boolean getPayinDeferred() {
		return payinDeferred;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinDeferred() <em>payinDeferred</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinDeferred() payinDeferred}' feature.
	 * @generated
	 */
	public void setPayinDeferred(Boolean newPayinDeferred) {
		payinDeferred = newPayinDeferred;
	}

	/**
	 * Returns the value of '<em><b>payoutDeferred</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payoutDeferred</b></em>' feature
	 * @generated
	 */
	public Boolean getPayoutDeferred() {
		return payoutDeferred;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutDeferred() <em>payoutDeferred</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutDeferred() payoutDeferred}' feature.
	 * @generated
	 */
	public void setPayoutDeferred(Boolean newPayoutDeferred) {
		payoutDeferred = newPayoutDeferred;
	}

	/**
	 * Returns the value of '<em><b>uponReceiptUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uponReceiptUse</b></em>' feature
	 * @generated
	 */
	public String getUponReceiptUse() {
		return uponReceiptUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getUponReceiptUse() <em>uponReceiptUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getUponReceiptUse() uponReceiptUse}' feature.
	 * @generated
	 */
	public void setUponReceiptUse(String newUponReceiptUse) {
		uponReceiptUse = newUponReceiptUse;
	}

	/**
	 * Returns the value of '<em><b>uponDepositUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uponDepositUse</b></em>' feature
	 * @generated
	 */
	public String getUponDepositUse() {
		return uponDepositUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getUponDepositUse() <em>uponDepositUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getUponDepositUse() uponDepositUse}' feature.
	 * @generated
	 */
	public void setUponDepositUse(String newUponDepositUse) {
		uponDepositUse = newUponDepositUse;
	}

	/**
	 * Returns the value of '<em><b>iNUponClearingUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iNUponClearingUse</b></em>' feature
	 * @generated
	 */
	public String getINUponClearingUse() {
		return iNUponClearingUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getINUponClearingUse() <em>iNUponClearingUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getINUponClearingUse() iNUponClearingUse}' feature.
	 * @generated
	 */
	public void setINUponClearingUse(String newINUponClearingUse) {
		iNUponClearingUse = newINUponClearingUse;
	}

	/**
	 * Returns the value of '<em><b>uponPaymentUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uponPaymentUse</b></em>' feature
	 * @generated
	 */
	public String getUponPaymentUse() {
		return uponPaymentUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getUponPaymentUse() <em>uponPaymentUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getUponPaymentUse() uponPaymentUse}' feature.
	 * @generated
	 */
	public void setUponPaymentUse(String newUponPaymentUse) {
		uponPaymentUse = newUponPaymentUse;
	}

	/**
	 * Returns the value of '<em><b>uponWithdrawalUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uponWithdrawalUse</b></em>' feature
	 * @generated
	 */
	public String getUponWithdrawalUse() {
		return uponWithdrawalUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getUponWithdrawalUse() <em>uponWithdrawalUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getUponWithdrawalUse() uponWithdrawalUse}' feature.
	 * @generated
	 */
	public void setUponWithdrawalUse(String newUponWithdrawalUse) {
		uponWithdrawalUse = newUponWithdrawalUse;
	}

	/**
	 * Returns the value of '<em><b>oUTUponClearingUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oUTUponClearingUse</b></em>' feature
	 * @generated
	 */
	public String getOUTUponClearingUse() {
		return oUTUponClearingUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getOUTUponClearingUse() <em>oUTUponClearingUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getOUTUponClearingUse() oUTUponClearingUse}' feature.
	 * @generated
	 */
	public void setOUTUponClearingUse(String newOUTUponClearingUse) {
		oUTUponClearingUse = newOUTUponClearingUse;
	}

	/**
	 * Returns the value of '<em><b>payinIsMulticurrency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payinIsMulticurrency</b></em>' feature
	 * @generated
	 */
	public Boolean getPayinIsMulticurrency() {
		return payinIsMulticurrency;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinIsMulticurrency() <em>payinIsMulticurrency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayinIsMulticurrency() payinIsMulticurrency}' feature.
	 * @generated
	 */
	public void setPayinIsMulticurrency(Boolean newPayinIsMulticurrency) {
		payinIsMulticurrency = newPayinIsMulticurrency;
	}

	/**
	 * Returns the value of '<em><b>payoutIsMulticurrency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>payoutIsMulticurrency</b></em>' feature
	 * @generated
	 */
	public Boolean getPayoutIsMulticurrency() {
		return payoutIsMulticurrency;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutIsMulticurrency() <em>payoutIsMulticurrency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getPayoutIsMulticurrency() payoutIsMulticurrency}' feature.
	 * @generated
	 */
	public void setPayoutIsMulticurrency(Boolean newPayoutIsMulticurrency) {
		payoutIsMulticurrency = newPayoutIsMulticurrency;
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#isReference() reference}' feature.
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
	public List<FinancialMgmtFinAccPaymentMethodTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtFinAccPaymentMethodType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtFinAccPaymentMethodType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtFinAccPaymentMethodTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtFinAccPaymentMethodType " + " [id1: " + getId1()
				+ "]" + " [identifier: " + getIdentifier() + "]"
				+ " [reference: " + isReference() + "]";
	}
}
