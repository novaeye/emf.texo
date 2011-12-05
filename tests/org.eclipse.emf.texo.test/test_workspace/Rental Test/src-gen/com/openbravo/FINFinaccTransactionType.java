package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINFinaccTransactionType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINFinaccTransactionType {

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
	private ReferenceType currency = null;

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
	private Long lineNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType finPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime dateAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType gLItem = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String status = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal paymentAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal depositAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean processed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean processNow = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String posted = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType project = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCampaign = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType activity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String stDimension = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String ndDimension = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String transactionType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime transactionDate = null;

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
	private ReferenceType reconciliation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean createdByAlgorithm = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType foreignCurrency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal foreignConversionRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal foreignAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType product = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesRegion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMDelete = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMModify = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMFinAccTransactionAcctVListType aPRMFinAccTransactionAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinaccTransactionVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinaccTrxFullAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINBankStatementLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINReconciliationLineTempList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINReconciliationLineVList = null;

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
	private List<FINFinaccTransactionTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FINFinaccTransactionTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FINFinaccTransactionType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getId() id}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getClient() client}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>currency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currency</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCurrency() {
		return currency;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
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
	 * Sets the '{@link FINFinaccTransactionType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
	}

	/**
	 * Returns the value of '<em><b>lineNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lineNo</b></em>' feature
	 * @generated
	 */
	public Long getLineNo() {
		return lineNo;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>finPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>finPayment</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinPayment() {
		return finPayment;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getFinPayment() <em>finPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getFinPayment() finPayment}' feature.
	 * @generated
	 */
	public void setFinPayment(ReferenceType newFinPayment) {
		finPayment = newFinPayment;
	}

	/**
	 * Returns the value of '<em><b>dateAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dateAcct</b></em>' feature
	 * @generated
	 */
	public DateTime getDateAcct() {
		return dateAcct;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getDateAcct() <em>dateAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getDateAcct() dateAcct}' feature.
	 * @generated
	 */
	public void setDateAcct(DateTime newDateAcct) {
		dateAcct = newDateAcct;
	}

	/**
	 * Returns the value of '<em><b>gLItem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>gLItem</b></em>' feature
	 * @generated
	 */
	public ReferenceType getGLItem() {
		return gLItem;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getGLItem() <em>gLItem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getGLItem() gLItem}' feature.
	 * @generated
	 */
	public void setGLItem(ReferenceType newGLItem) {
		gLItem = newGLItem;
	}

	/**
	 * Returns the value of '<em><b>status</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>status</b></em>' feature
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>paymentAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getPaymentAmount() {
		return paymentAmount;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getPaymentAmount() <em>paymentAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getPaymentAmount() paymentAmount}' feature.
	 * @generated
	 */
	public void setPaymentAmount(Decimal newPaymentAmount) {
		paymentAmount = newPaymentAmount;
	}

	/**
	 * Returns the value of '<em><b>depositAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>depositAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getDepositAmount() {
		return depositAmount;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getDepositAmount() <em>depositAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getDepositAmount() depositAmount}' feature.
	 * @generated
	 */
	public void setDepositAmount(Decimal newDepositAmount) {
		depositAmount = newDepositAmount;
	}

	/**
	 * Returns the value of '<em><b>processed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processed</b></em>' feature
	 * @generated
	 */
	public Boolean getProcessed() {
		return processed;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getProcessed() processed}' feature.
	 * @generated
	 */
	public void setProcessed(Boolean newProcessed) {
		processed = newProcessed;
	}

	/**
	 * Returns the value of '<em><b>processNow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processNow</b></em>' feature
	 * @generated
	 */
	public Boolean getProcessNow() {
		return processNow;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

	/**
	 * Returns the value of '<em><b>posted</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>posted</b></em>' feature
	 * @generated
	 */
	public String getPosted() {
		return posted;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
	}

	/**
	 * Returns the value of '<em><b>project</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>project</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProject() {
		return project;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ReferenceType newProject) {
		project = newProject;
	}

	/**
	 * Returns the value of '<em><b>salesCampaign</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCampaign</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCampaign() {
		return salesCampaign;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getSalesCampaign() salesCampaign}' feature.
	 * @generated
	 */
	public void setSalesCampaign(ReferenceType newSalesCampaign) {
		salesCampaign = newSalesCampaign;
	}

	/**
	 * Returns the value of '<em><b>activity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activity</b></em>' feature
	 * @generated
	 */
	public ReferenceType getActivity() {
		return activity;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
	}

	/**
	 * Returns the value of '<em><b>stDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>stDimension</b></em>' feature
	 * @generated
	 */
	public String getStDimension() {
		return stDimension;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getStDimension() stDimension}' feature.
	 * @generated
	 */
	public void setStDimension(String newStDimension) {
		stDimension = newStDimension;
	}

	/**
	 * Returns the value of '<em><b>ndDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>ndDimension</b></em>' feature
	 * @generated
	 */
	public String getNdDimension() {
		return ndDimension;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
	}

	/**
	 * Returns the value of '<em><b>transactionType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transactionType</b></em>' feature
	 * @generated
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getTransactionType() <em>transactionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getTransactionType() transactionType}' feature.
	 * @generated
	 */
	public void setTransactionType(String newTransactionType) {
		transactionType = newTransactionType;
	}

	/**
	 * Returns the value of '<em><b>transactionDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transactionDate</b></em>' feature
	 * @generated
	 */
	public DateTime getTransactionDate() {
		return transactionDate;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getTransactionDate() <em>transactionDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getTransactionDate() transactionDate}' feature.
	 * @generated
	 */
	public void setTransactionDate(DateTime newTransactionDate) {
		transactionDate = newTransactionDate;
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
	 * Sets the '{@link FINFinaccTransactionType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>reconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reconciliation</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReconciliation() {
		return reconciliation;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getReconciliation() <em>reconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getReconciliation() reconciliation}' feature.
	 * @generated
	 */
	public void setReconciliation(ReferenceType newReconciliation) {
		reconciliation = newReconciliation;
	}

	/**
	 * Returns the value of '<em><b>createdByAlgorithm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createdByAlgorithm</b></em>' feature
	 * @generated
	 */
	public Boolean getCreatedByAlgorithm() {
		return createdByAlgorithm;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getCreatedByAlgorithm() <em>createdByAlgorithm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getCreatedByAlgorithm() createdByAlgorithm}' feature.
	 * @generated
	 */
	public void setCreatedByAlgorithm(Boolean newCreatedByAlgorithm) {
		createdByAlgorithm = newCreatedByAlgorithm;
	}

	/**
	 * Returns the value of '<em><b>foreignCurrency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>foreignCurrency</b></em>' feature
	 * @generated
	 */
	public ReferenceType getForeignCurrency() {
		return foreignCurrency;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getForeignCurrency() <em>foreignCurrency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getForeignCurrency() foreignCurrency}' feature.
	 * @generated
	 */
	public void setForeignCurrency(ReferenceType newForeignCurrency) {
		foreignCurrency = newForeignCurrency;
	}

	/**
	 * Returns the value of '<em><b>foreignConversionRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>foreignConversionRate</b></em>' feature
	 * @generated
	 */
	public Decimal getForeignConversionRate() {
		return foreignConversionRate;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getForeignConversionRate() <em>foreignConversionRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getForeignConversionRate() foreignConversionRate}' feature.
	 * @generated
	 */
	public void setForeignConversionRate(Decimal newForeignConversionRate) {
		foreignConversionRate = newForeignConversionRate;
	}

	/**
	 * Returns the value of '<em><b>foreignAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>foreignAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getForeignAmount() {
		return foreignAmount;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getForeignAmount() <em>foreignAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getForeignAmount() foreignAmount}' feature.
	 * @generated
	 */
	public void setForeignAmount(Decimal newForeignAmount) {
		foreignAmount = newForeignAmount;
	}

	/**
	 * Returns the value of '<em><b>businessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartner</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartner() {
		return businessPartner;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>product</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>product</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProduct() {
		return product;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
	}

	/**
	 * Returns the value of '<em><b>salesRegion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRegion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesRegion() {
		return salesRegion;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(ReferenceType newSalesRegion) {
		salesRegion = newSalesRegion;
	}

	/**
	 * Returns the value of '<em><b>aPRMDelete</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMDelete</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMDelete() {
		return aPRMDelete;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getAPRMDelete() <em>aPRMDelete</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAPRMDelete() aPRMDelete}' feature.
	 * @generated
	 */
	public void setAPRMDelete(Boolean newAPRMDelete) {
		aPRMDelete = newAPRMDelete;
	}

	/**
	 * Returns the value of '<em><b>aPRMModify</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMModify</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMModify() {
		return aPRMModify;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getAPRMModify() <em>aPRMModify</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAPRMModify() aPRMModify}' feature.
	 * @generated
	 */
	public void setAPRMModify(Boolean newAPRMModify) {
		aPRMModify = newAPRMModify;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctVList</b></em>' feature
	 * @generated
	 */
	public APRMFinAccTransactionAcctVListType getAPRMFinAccTransactionAcctVList() {
		return aPRMFinAccTransactionAcctVList;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVList(
			APRMFinAccTransactionAcctVListType newAPRMFinAccTransactionAcctVList) {
		aPRMFinAccTransactionAcctVList = newAPRMFinAccTransactionAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTransactionVList() {
		return aPRMFinaccTransactionVList;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVList(
			ReferenceType newAPRMFinaccTransactionVList) {
		aPRMFinaccTransactionVList = newAPRMFinaccTransactionVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTrxFullAcctVList() {
		return aPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>fINBankStatementLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatementLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINBankStatementLineList() {
		return fINBankStatementLineList;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getFINBankStatementLineList() <em>fINBankStatementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getFINBankStatementLineList() fINBankStatementLineList}' feature.
	 * @generated
	 */
	public void setFINBankStatementLineList(
			ReferenceType newFINBankStatementLineList) {
		fINBankStatementLineList = newFINBankStatementLineList;
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineTempList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineTempList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINReconciliationLineTempList() {
		return fINReconciliationLineTempList;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getFINReconciliationLineTempList() <em>fINReconciliationLineTempList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getFINReconciliationLineTempList() fINReconciliationLineTempList}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineTempList(
			ReferenceType newFINReconciliationLineTempList) {
		fINReconciliationLineTempList = newFINReconciliationLineTempList;
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINReconciliationLineVList() {
		return fINReconciliationLineVList;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getFINReconciliationLineVList() <em>fINReconciliationLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getFINReconciliationLineVList() fINReconciliationLineVList}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineVList(
			ReferenceType newFINReconciliationLineVList) {
		fINReconciliationLineVList = newFINReconciliationLineVList;
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
	 * Sets the '{@link FINFinaccTransactionType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getId1() id1}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FINFinaccTransactionType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#isReference() reference}' feature.
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
	public List<FINFinaccTransactionTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FINFinaccTransactionType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinaccTransactionType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FINFinaccTransactionTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FINFinaccTransactionType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
