package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String documentNo = null;

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
	private DateTime paymentDate = null;

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
	private ReferenceType businessPartner = null;

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
	private Decimal amount = null;

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
	private Boolean receipt = null;

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
	private Decimal writeoffAmount = null;

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
	private String referenceNo = null;

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
	private String description = null;

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
	private ReferenceType documentType = null;

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
	private Decimal generatedCredit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal usedCredit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String aPRMProcessPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMReconcilePayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMAddScheduledpayments = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aprmExecutepayment = null;

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
	private Decimal financialTransactionConvertRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal financialTransactionAmount = null;

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
	private ReferenceType aPRMPendingPaymentInvoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyConversionRateDocListType currencyConversionRateDocList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinaccTransactionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentCreditListType fINPaymentCreditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentCreditCreditPaymentUsedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentDetailListType fINPaymentDetailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentDetailVListType1 fINPaymentDetailVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentPropDetailVList = null;

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
	private FinancialMgmtPaymentExecutionHistoryVListType financialMgmtPaymentExecutionHistoryVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentRunPaymentListType1 financialMgmtPaymentRunPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxPaymentList = null;

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
	private List<FINPaymentTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FINPaymentTypeAnyAttributeFeatureGroup>();

	/**
	 * Returns the value of '<em><b>documentNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentNo</b></em>' feature
	 * @generated
	 */
	public String getDocumentNo() {
		return documentNo;
	}

	/**
	 * Sets the '{@link FINPaymentType#getDocumentNo() <em>documentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getDocumentNo() documentNo}' feature.
	 * @generated
	 */
	public void setDocumentNo(String newDocumentNo) {
		documentNo = newDocumentNo;
	}

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
	 * Sets the '{@link FINPaymentType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>paymentDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentDate</b></em>' feature
	 * @generated
	 */
	public DateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * Sets the '{@link FINPaymentType#getPaymentDate() <em>paymentDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getPaymentDate() paymentDate}' feature.
	 * @generated
	 */
	public void setPaymentDate(DateTime newPaymentDate) {
		paymentDate = newPaymentDate;
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
	 * Sets the '{@link FINPaymentType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getClient() client}' feature.
	 * @generated
	 */
	public void setClient(ReferenceType newClient) {
		client = newClient;
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
	 * Sets the '{@link FINPaymentType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
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
	 * Sets the '{@link FINPaymentType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
	}

	/**
	 * Returns the value of '<em><b>amount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>amount</b></em>' feature
	 * @generated
	 */
	public Decimal getAmount() {
		return amount;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAmount() <em>amount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAmount() amount}' feature.
	 * @generated
	 */
	public void setAmount(Decimal newAmount) {
		amount = newAmount;
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
	 * Sets the '{@link FINPaymentType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FINPaymentType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FINPaymentType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FINPaymentType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FINPaymentType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>receipt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>receipt</b></em>' feature
	 * @generated
	 */
	public Boolean getReceipt() {
		return receipt;
	}

	/**
	 * Sets the '{@link FINPaymentType#getReceipt() <em>receipt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getReceipt() receipt}' feature.
	 * @generated
	 */
	public void setReceipt(Boolean newReceipt) {
		receipt = newReceipt;
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
	 * Sets the '{@link FINPaymentType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>writeoffAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>writeoffAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getWriteoffAmount() {
		return writeoffAmount;
	}

	/**
	 * Sets the '{@link FINPaymentType#getWriteoffAmount() <em>writeoffAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getWriteoffAmount() writeoffAmount}' feature.
	 * @generated
	 */
	public void setWriteoffAmount(Decimal newWriteoffAmount) {
		writeoffAmount = newWriteoffAmount;
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
	 * Sets the '{@link FINPaymentType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
	}

	/**
	 * Returns the value of '<em><b>referenceNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceNo</b></em>' feature
	 * @generated
	 */
	public String getReferenceNo() {
		return referenceNo;
	}

	/**
	 * Sets the '{@link FINPaymentType#getReferenceNo() <em>referenceNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getReferenceNo() referenceNo}' feature.
	 * @generated
	 */
	public void setReferenceNo(String newReferenceNo) {
		referenceNo = newReferenceNo;
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
	 * Sets the '{@link FINPaymentType#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
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
	 * Sets the '{@link FINPaymentType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getProcessed() processed}' feature.
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
	 * Sets the '{@link FINPaymentType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getProcessNow() processNow}' feature.
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
	 * Sets the '{@link FINPaymentType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
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
	 * Sets the '{@link FINPaymentType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link FINPaymentType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
	}

	/**
	 * Returns the value of '<em><b>documentType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentType</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the '{@link FINPaymentType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(ReferenceType newDocumentType) {
		documentType = newDocumentType;
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
	 * Sets the '{@link FINPaymentType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getProject() project}' feature.
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
	 * Sets the '{@link FINPaymentType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getSalesCampaign() salesCampaign}' feature.
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
	 * Sets the '{@link FINPaymentType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getActivity() activity}' feature.
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
	 * Sets the '{@link FINPaymentType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getStDimension() stDimension}' feature.
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
	 * Sets the '{@link FINPaymentType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
	}

	/**
	 * Returns the value of '<em><b>generatedCredit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generatedCredit</b></em>' feature
	 * @generated
	 */
	public Decimal getGeneratedCredit() {
		return generatedCredit;
	}

	/**
	 * Sets the '{@link FINPaymentType#getGeneratedCredit() <em>generatedCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getGeneratedCredit() generatedCredit}' feature.
	 * @generated
	 */
	public void setGeneratedCredit(Decimal newGeneratedCredit) {
		generatedCredit = newGeneratedCredit;
	}

	/**
	 * Returns the value of '<em><b>usedCredit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>usedCredit</b></em>' feature
	 * @generated
	 */
	public Decimal getUsedCredit() {
		return usedCredit;
	}

	/**
	 * Sets the '{@link FINPaymentType#getUsedCredit() <em>usedCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getUsedCredit() usedCredit}' feature.
	 * @generated
	 */
	public void setUsedCredit(Decimal newUsedCredit) {
		usedCredit = newUsedCredit;
	}

	/**
	 * Returns the value of '<em><b>aPRMProcessPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMProcessPayment</b></em>' feature
	 * @generated
	 */
	public String getAPRMProcessPayment() {
		return aPRMProcessPayment;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAPRMProcessPayment() <em>aPRMProcessPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAPRMProcessPayment() aPRMProcessPayment}' feature.
	 * @generated
	 */
	public void setAPRMProcessPayment(String newAPRMProcessPayment) {
		aPRMProcessPayment = newAPRMProcessPayment;
	}

	/**
	 * Returns the value of '<em><b>aPRMReconcilePayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconcilePayment</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMReconcilePayment() {
		return aPRMReconcilePayment;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAPRMReconcilePayment() <em>aPRMReconcilePayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAPRMReconcilePayment() aPRMReconcilePayment}' feature.
	 * @generated
	 */
	public void setAPRMReconcilePayment(Boolean newAPRMReconcilePayment) {
		aPRMReconcilePayment = newAPRMReconcilePayment;
	}

	/**
	 * Returns the value of '<em><b>aPRMAddScheduledpayments</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMAddScheduledpayments</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMAddScheduledpayments() {
		return aPRMAddScheduledpayments;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAPRMAddScheduledpayments() <em>aPRMAddScheduledpayments</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAPRMAddScheduledpayments() aPRMAddScheduledpayments}' feature.
	 * @generated
	 */
	public void setAPRMAddScheduledpayments(Boolean newAPRMAddScheduledpayments) {
		aPRMAddScheduledpayments = newAPRMAddScheduledpayments;
	}

	/**
	 * Returns the value of '<em><b>aprmExecutepayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aprmExecutepayment</b></em>' feature
	 * @generated
	 */
	public Boolean getAprmExecutepayment() {
		return aprmExecutepayment;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAprmExecutepayment() <em>aprmExecutepayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAprmExecutepayment() aprmExecutepayment}' feature.
	 * @generated
	 */
	public void setAprmExecutepayment(Boolean newAprmExecutepayment) {
		aprmExecutepayment = newAprmExecutepayment;
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
	 * Sets the '{@link FINPaymentType#getCreatedByAlgorithm() <em>createdByAlgorithm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getCreatedByAlgorithm() createdByAlgorithm}' feature.
	 * @generated
	 */
	public void setCreatedByAlgorithm(Boolean newCreatedByAlgorithm) {
		createdByAlgorithm = newCreatedByAlgorithm;
	}

	/**
	 * Returns the value of '<em><b>financialTransactionConvertRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialTransactionConvertRate</b></em>' feature
	 * @generated
	 */
	public Decimal getFinancialTransactionConvertRate() {
		return financialTransactionConvertRate;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFinancialTransactionConvertRate() <em>financialTransactionConvertRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFinancialTransactionConvertRate() financialTransactionConvertRate}' feature.
	 * @generated
	 */
	public void setFinancialTransactionConvertRate(
			Decimal newFinancialTransactionConvertRate) {
		financialTransactionConvertRate = newFinancialTransactionConvertRate;
	}

	/**
	 * Returns the value of '<em><b>financialTransactionAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialTransactionAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getFinancialTransactionAmount() {
		return financialTransactionAmount;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFinancialTransactionAmount() <em>financialTransactionAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFinancialTransactionAmount() financialTransactionAmount}' feature.
	 * @generated
	 */
	public void setFinancialTransactionAmount(
			Decimal newFinancialTransactionAmount) {
		financialTransactionAmount = newFinancialTransactionAmount;
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
	 * Sets the '{@link FINPaymentType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVList(
			ReferenceType newAPRMFinaccTransactionVList) {
		aPRMFinaccTransactionVList = newAPRMFinaccTransactionVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMPendingPaymentInvoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMPendingPaymentInvoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMPendingPaymentInvoiceList() {
		return aPRMPendingPaymentInvoiceList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAPRMPendingPaymentInvoiceList() <em>aPRMPendingPaymentInvoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAPRMPendingPaymentInvoiceList() aPRMPendingPaymentInvoiceList}' feature.
	 * @generated
	 */
	public void setAPRMPendingPaymentInvoiceList(
			ReferenceType newAPRMPendingPaymentInvoiceList) {
		aPRMPendingPaymentInvoiceList = newAPRMPendingPaymentInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateDocList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDocList</b></em>' feature
	 * @generated
	 */
	public CurrencyConversionRateDocListType getCurrencyConversionRateDocList() {
		return currencyConversionRateDocList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getCurrencyConversionRateDocList() <em>currencyConversionRateDocList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getCurrencyConversionRateDocList() currencyConversionRateDocList}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDocList(
			CurrencyConversionRateDocListType newCurrencyConversionRateDocList) {
		currencyConversionRateDocList = newCurrencyConversionRateDocList;
	}

	/**
	 * Returns the value of '<em><b>fINFinaccTransactionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransactionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinaccTransactionList() {
		return fINFinaccTransactionList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFINFinaccTransactionList() <em>fINFinaccTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINFinaccTransactionList() fINFinaccTransactionList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionList(
			ReferenceType newFINFinaccTransactionList) {
		fINFinaccTransactionList = newFINFinaccTransactionList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentCreditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentCreditList</b></em>' feature
	 * @generated
	 */
	public FINPaymentCreditListType getFINPaymentCreditList() {
		return fINPaymentCreditList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFINPaymentCreditList() <em>fINPaymentCreditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINPaymentCreditList() fINPaymentCreditList}' feature.
	 * @generated
	 */
	public void setFINPaymentCreditList(
			FINPaymentCreditListType newFINPaymentCreditList) {
		fINPaymentCreditList = newFINPaymentCreditList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentCreditCreditPaymentUsedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentCreditCreditPaymentUsedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentCreditCreditPaymentUsedList() {
		return fINPaymentCreditCreditPaymentUsedList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFINPaymentCreditCreditPaymentUsedList() <em>fINPaymentCreditCreditPaymentUsedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINPaymentCreditCreditPaymentUsedList() fINPaymentCreditCreditPaymentUsedList}' feature.
	 * @generated
	 */
	public void setFINPaymentCreditCreditPaymentUsedList(
			ReferenceType newFINPaymentCreditCreditPaymentUsedList) {
		fINPaymentCreditCreditPaymentUsedList = newFINPaymentCreditCreditPaymentUsedList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailList</b></em>' feature
	 * @generated
	 */
	public FINPaymentDetailListType getFINPaymentDetailList() {
		return fINPaymentDetailList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFINPaymentDetailList() <em>fINPaymentDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINPaymentDetailList() fINPaymentDetailList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailList(
			FINPaymentDetailListType newFINPaymentDetailList) {
		fINPaymentDetailList = newFINPaymentDetailList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailVList</b></em>' feature
	 * @generated
	 */
	public FINPaymentDetailVListType1 getFINPaymentDetailVList() {
		return fINPaymentDetailVList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(
			FINPaymentDetailVListType1 newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetailVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetailVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentPropDetailVList() {
		return fINPaymentPropDetailVList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFINPaymentPropDetailVList() <em>fINPaymentPropDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINPaymentPropDetailVList() fINPaymentPropDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetailVList(
			ReferenceType newFINPaymentPropDetailVList) {
		fINPaymentPropDetailVList = newFINPaymentPropDetailVList;
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
	 * Sets the '{@link FINPaymentType#getFINReconciliationLineTempList() <em>fINReconciliationLineTempList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINReconciliationLineTempList() fINReconciliationLineTempList}' feature.
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
	 * Sets the '{@link FINPaymentType#getFINReconciliationLineVList() <em>fINReconciliationLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFINReconciliationLineVList() fINReconciliationLineVList}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineVList(
			ReferenceType newFINReconciliationLineVList) {
		fINReconciliationLineVList = newFINReconciliationLineVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionHistoryVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionHistoryVList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentExecutionHistoryVListType getFinancialMgmtPaymentExecutionHistoryVList() {
		return financialMgmtPaymentExecutionHistoryVList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFinancialMgmtPaymentExecutionHistoryVList() <em>financialMgmtPaymentExecutionHistoryVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFinancialMgmtPaymentExecutionHistoryVList() financialMgmtPaymentExecutionHistoryVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionHistoryVList(
			FinancialMgmtPaymentExecutionHistoryVListType newFinancialMgmtPaymentExecutionHistoryVList) {
		financialMgmtPaymentExecutionHistoryVList = newFinancialMgmtPaymentExecutionHistoryVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunPaymentList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentRunPaymentListType1 getFinancialMgmtPaymentRunPaymentList() {
		return financialMgmtPaymentRunPaymentList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFinancialMgmtPaymentRunPaymentList() <em>financialMgmtPaymentRunPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFinancialMgmtPaymentRunPaymentList() financialMgmtPaymentRunPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunPaymentList(
			FinancialMgmtPaymentRunPaymentListType1 newFinancialMgmtPaymentRunPaymentList) {
		financialMgmtPaymentRunPaymentList = newFinancialMgmtPaymentRunPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxPaymentList() {
		return financialMgmtTaxPaymentList;
	}

	/**
	 * Sets the '{@link FINPaymentType#getFinancialMgmtTaxPaymentList() <em>financialMgmtTaxPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getFinancialMgmtTaxPaymentList() financialMgmtTaxPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPaymentList(
			ReferenceType newFinancialMgmtTaxPaymentList) {
		financialMgmtTaxPaymentList = newFinancialMgmtTaxPaymentList;
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
	 * Sets the '{@link FINPaymentType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getId1() id1}' feature.
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
	 * Sets the '{@link FINPaymentType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FINPaymentType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#isReference() reference}' feature.
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
	public List<FINPaymentTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FINPaymentType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FINPaymentTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FINPaymentType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
