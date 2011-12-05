package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentMethodType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentMethodType {

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
	private String name = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String description = null;

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
	private ReferenceType businessPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerPOPaymentMethodList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentDetailVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentProposalList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentSchedInvVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentSchedOrdVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentScheduleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtFinAccPaymentMethodListType financialMgmtFinAccPaymentMethodList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtPaymentTermLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectProposalList = null;

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
	private List<FINPaymentMethodTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FINPaymentMethodTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FINPaymentMethodType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getId() id}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getClient() client}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>description</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link FINPaymentMethodType#getAutomaticReceipt() <em>automaticReceipt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getAutomaticReceipt() automaticReceipt}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getAutomaticPayment() <em>automaticPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getAutomaticPayment() automaticPayment}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getAutomaticDeposit() <em>automaticDeposit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getAutomaticDeposit() automaticDeposit}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getAutomaticWithdrawn() <em>automaticWithdrawn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getAutomaticWithdrawn() automaticWithdrawn}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayinAllow() <em>payinAllow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayinAllow() payinAllow}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayoutAllow() <em>payoutAllow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayoutAllow() payoutAllow}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayinExecutionType() <em>payinExecutionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayinExecutionType() payinExecutionType}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayoutExecutionType() <em>payoutExecutionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayoutExecutionType() payoutExecutionType}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayinExecutionProcess() <em>payinExecutionProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayinExecutionProcess() payinExecutionProcess}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayoutExecutionProcess() <em>payoutExecutionProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayoutExecutionProcess() payoutExecutionProcess}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayinDeferred() <em>payinDeferred</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayinDeferred() payinDeferred}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayoutDeferred() <em>payoutDeferred</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayoutDeferred() payoutDeferred}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getUponReceiptUse() <em>uponReceiptUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getUponReceiptUse() uponReceiptUse}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getUponDepositUse() <em>uponDepositUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getUponDepositUse() uponDepositUse}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getINUponClearingUse() <em>iNUponClearingUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getINUponClearingUse() iNUponClearingUse}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getUponPaymentUse() <em>uponPaymentUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getUponPaymentUse() uponPaymentUse}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getUponWithdrawalUse() <em>uponWithdrawalUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getUponWithdrawalUse() uponWithdrawalUse}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getOUTUponClearingUse() <em>oUTUponClearingUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getOUTUponClearingUse() oUTUponClearingUse}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayinIsMulticurrency() <em>payinIsMulticurrency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayinIsMulticurrency() payinIsMulticurrency}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getPayoutIsMulticurrency() <em>payoutIsMulticurrency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getPayoutIsMulticurrency() payoutIsMulticurrency}' feature.
	 * @generated
	 */
	public void setPayoutIsMulticurrency(Boolean newPayoutIsMulticurrency) {
		payoutIsMulticurrency = newPayoutIsMulticurrency;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerList() {
		return businessPartnerList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getBusinessPartnerList() <em>businessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getBusinessPartnerList() businessPartnerList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerList(ReferenceType newBusinessPartnerList) {
		businessPartnerList = newBusinessPartnerList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerPOPaymentMethodList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerPOPaymentMethodList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerPOPaymentMethodList() {
		return businessPartnerPOPaymentMethodList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getBusinessPartnerPOPaymentMethodList() <em>businessPartnerPOPaymentMethodList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getBusinessPartnerPOPaymentMethodList() businessPartnerPOPaymentMethodList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerPOPaymentMethodList(
			ReferenceType newBusinessPartnerPOPaymentMethodList) {
		businessPartnerPOPaymentMethodList = newBusinessPartnerPOPaymentMethodList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentList() {
		return fINPaymentList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFINPaymentList() <em>fINPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFINPaymentList() fINPaymentList}' feature.
	 * @generated
	 */
	public void setFINPaymentList(ReferenceType newFINPaymentList) {
		fINPaymentList = newFINPaymentList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentDetailVList() {
		return fINPaymentDetailVList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(ReferenceType newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentProposalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentProposalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentProposalList() {
		return fINPaymentProposalList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFINPaymentProposalList() <em>fINPaymentProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFINPaymentProposalList() fINPaymentProposalList}' feature.
	 * @generated
	 */
	public void setFINPaymentProposalList(
			ReferenceType newFINPaymentProposalList) {
		fINPaymentProposalList = newFINPaymentProposalList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedInvVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedInvVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentSchedInvVList() {
		return fINPaymentSchedInvVList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFINPaymentSchedInvVList() <em>fINPaymentSchedInvVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFINPaymentSchedInvVList() fINPaymentSchedInvVList}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvVList(
			ReferenceType newFINPaymentSchedInvVList) {
		fINPaymentSchedInvVList = newFINPaymentSchedInvVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedOrdVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedOrdVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentSchedOrdVList() {
		return fINPaymentSchedOrdVList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFINPaymentSchedOrdVList() <em>fINPaymentSchedOrdVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFINPaymentSchedOrdVList() fINPaymentSchedOrdVList}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdVList(
			ReferenceType newFINPaymentSchedOrdVList) {
		fINPaymentSchedOrdVList = newFINPaymentSchedOrdVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentScheduleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentScheduleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentScheduleList() {
		return fINPaymentScheduleList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFINPaymentScheduleList() <em>fINPaymentScheduleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFINPaymentScheduleList() fINPaymentScheduleList}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleList(
			ReferenceType newFINPaymentScheduleList) {
		fINPaymentScheduleList = newFINPaymentScheduleList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtFinAccPaymentMethodList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtFinAccPaymentMethodList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtFinAccPaymentMethodListType getFinancialMgmtFinAccPaymentMethodList() {
		return financialMgmtFinAccPaymentMethodList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFinancialMgmtFinAccPaymentMethodList() <em>financialMgmtFinAccPaymentMethodList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFinancialMgmtFinAccPaymentMethodList() financialMgmtFinAccPaymentMethodList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtFinAccPaymentMethodList(
			FinancialMgmtFinAccPaymentMethodListType newFinancialMgmtFinAccPaymentMethodList) {
		financialMgmtFinAccPaymentMethodList = newFinancialMgmtFinAccPaymentMethodList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtPaymentTermLineList() {
		return financialMgmtPaymentTermLineList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getFinancialMgmtPaymentTermLineList() <em>financialMgmtPaymentTermLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getFinancialMgmtPaymentTermLineList() financialMgmtPaymentTermLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermLineList(
			ReferenceType newFinancialMgmtPaymentTermLineList) {
		financialMgmtPaymentTermLineList = newFinancialMgmtPaymentTermLineList;
	}

	/**
	 * Returns the value of '<em><b>invoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceList() {
		return invoiceList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(ReferenceType newInvoiceList) {
		invoiceList = newInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>orderList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderList() {
		return orderList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getOrderList() <em>orderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getOrderList() orderList}' feature.
	 * @generated
	 */
	public void setOrderList(ReferenceType newOrderList) {
		orderList = newOrderList;
	}

	/**
	 * Returns the value of '<em><b>projectList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectList() {
		return projectList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getProjectList() <em>projectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getProjectList() projectList}' feature.
	 * @generated
	 */
	public void setProjectList(ReferenceType newProjectList) {
		projectList = newProjectList;
	}

	/**
	 * Returns the value of '<em><b>projectProposalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectProposalList() {
		return projectProposalList;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getProjectProposalList() <em>projectProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getProjectProposalList() projectProposalList}' feature.
	 * @generated
	 */
	public void setProjectProposalList(ReferenceType newProjectProposalList) {
		projectProposalList = newProjectProposalList;
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
	 * Sets the '{@link FINPaymentMethodType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getId1() id1}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FINPaymentMethodType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#isReference() reference}' feature.
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
	public List<FINPaymentMethodTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FINPaymentMethodType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentMethodType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FINPaymentMethodTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FINPaymentMethodType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
