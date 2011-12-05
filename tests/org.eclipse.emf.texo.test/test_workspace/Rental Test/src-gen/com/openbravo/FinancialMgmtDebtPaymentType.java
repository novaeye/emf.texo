package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentType {

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
	private Boolean receipt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType settlementCancelled = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType settlementGenerate = null;

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
	private ReferenceType invoice = null;

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
	private ReferenceType currency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType cashJournalLine = null;

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
	private ReferenceType cashbook = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String formOfPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean paymentComplete = null;

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
	private Decimal writeoffAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime dueDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean manual = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean valid = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankStatementLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean changeSettlementCancel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean cancelProcessed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean generateProcessed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal balancingAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean directPosting = null;

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
	private ReferenceType salesOrder = null;

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
	private Boolean isAutomaticGenerated = null;

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
	private String initialStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType withholding = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal withholdingamount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtBankStatementLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDPManagementLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentBalReplaceListType financialMgmtDebtPaymentBalReplaceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentBalancingListType financialMgmtDebtPaymentBalancingList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLJournalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtJournalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtRemittanceLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtRemittanceLinePaymentCancelledList = null;

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
	private List<FinancialMgmtDebtPaymentTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtDebtPaymentTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getReceipt() <em>receipt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getReceipt() receipt}' feature.
	 * @generated
	 */
	public void setReceipt(Boolean newReceipt) {
		receipt = newReceipt;
	}

	/**
	 * Returns the value of '<em><b>settlementCancelled</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>settlementCancelled</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSettlementCancelled() {
		return settlementCancelled;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getSettlementCancelled() <em>settlementCancelled</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getSettlementCancelled() settlementCancelled}' feature.
	 * @generated
	 */
	public void setSettlementCancelled(ReferenceType newSettlementCancelled) {
		settlementCancelled = newSettlementCancelled;
	}

	/**
	 * Returns the value of '<em><b>settlementGenerate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>settlementGenerate</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSettlementGenerate() {
		return settlementGenerate;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getSettlementGenerate() <em>settlementGenerate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getSettlementGenerate() settlementGenerate}' feature.
	 * @generated
	 */
	public void setSettlementGenerate(ReferenceType newSettlementGenerate) {
		settlementGenerate = newSettlementGenerate;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>invoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoice</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoice() {
		return invoice;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(ReferenceType newInvoice) {
		invoice = newInvoice;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>cashJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cashJournalLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCashJournalLine() {
		return cashJournalLine;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getCashJournalLine() <em>cashJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getCashJournalLine() cashJournalLine}' feature.
	 * @generated
	 */
	public void setCashJournalLine(ReferenceType newCashJournalLine) {
		cashJournalLine = newCashJournalLine;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(ReferenceType newBankAccount) {
		bankAccount = newBankAccount;
	}

	/**
	 * Returns the value of '<em><b>cashbook</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cashbook</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCashbook() {
		return cashbook;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getCashbook() <em>cashbook</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getCashbook() cashbook}' feature.
	 * @generated
	 */
	public void setCashbook(ReferenceType newCashbook) {
		cashbook = newCashbook;
	}

	/**
	 * Returns the value of '<em><b>formOfPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>formOfPayment</b></em>' feature
	 * @generated
	 */
	public String getFormOfPayment() {
		return formOfPayment;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFormOfPayment() formOfPayment}' feature.
	 * @generated
	 */
	public void setFormOfPayment(String newFormOfPayment) {
		formOfPayment = newFormOfPayment;
	}

	/**
	 * Returns the value of '<em><b>paymentComplete</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentComplete</b></em>' feature
	 * @generated
	 */
	public Boolean getPaymentComplete() {
		return paymentComplete;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getPaymentComplete() <em>paymentComplete</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getPaymentComplete() paymentComplete}' feature.
	 * @generated
	 */
	public void setPaymentComplete(Boolean newPaymentComplete) {
		paymentComplete = newPaymentComplete;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getAmount() <em>amount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getAmount() amount}' feature.
	 * @generated
	 */
	public void setAmount(Decimal newAmount) {
		amount = newAmount;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getWriteoffAmount() <em>writeoffAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getWriteoffAmount() writeoffAmount}' feature.
	 * @generated
	 */
	public void setWriteoffAmount(Decimal newWriteoffAmount) {
		writeoffAmount = newWriteoffAmount;
	}

	/**
	 * Returns the value of '<em><b>dueDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dueDate</b></em>' feature
	 * @generated
	 */
	public DateTime getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getDueDate() <em>dueDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getDueDate() dueDate}' feature.
	 * @generated
	 */
	public void setDueDate(DateTime newDueDate) {
		dueDate = newDueDate;
	}

	/**
	 * Returns the value of '<em><b>manual</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manual</b></em>' feature
	 * @generated
	 */
	public Boolean getManual() {
		return manual;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getManual() <em>manual</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getManual() manual}' feature.
	 * @generated
	 */
	public void setManual(Boolean newManual) {
		manual = newManual;
	}

	/**
	 * Returns the value of '<em><b>valid</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>valid</b></em>' feature
	 * @generated
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getValid() <em>valid</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getValid() valid}' feature.
	 * @generated
	 */
	public void setValid(Boolean newValid) {
		valid = newValid;
	}

	/**
	 * Returns the value of '<em><b>bankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankStatementLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankStatementLine() {
		return bankStatementLine;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getBankStatementLine() <em>bankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getBankStatementLine() bankStatementLine}' feature.
	 * @generated
	 */
	public void setBankStatementLine(ReferenceType newBankStatementLine) {
		bankStatementLine = newBankStatementLine;
	}

	/**
	 * Returns the value of '<em><b>changeSettlementCancel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>changeSettlementCancel</b></em>' feature
	 * @generated
	 */
	public Boolean getChangeSettlementCancel() {
		return changeSettlementCancel;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getChangeSettlementCancel() <em>changeSettlementCancel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getChangeSettlementCancel() changeSettlementCancel}' feature.
	 * @generated
	 */
	public void setChangeSettlementCancel(Boolean newChangeSettlementCancel) {
		changeSettlementCancel = newChangeSettlementCancel;
	}

	/**
	 * Returns the value of '<em><b>cancelProcessed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cancelProcessed</b></em>' feature
	 * @generated
	 */
	public Boolean getCancelProcessed() {
		return cancelProcessed;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getCancelProcessed() <em>cancelProcessed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getCancelProcessed() cancelProcessed}' feature.
	 * @generated
	 */
	public void setCancelProcessed(Boolean newCancelProcessed) {
		cancelProcessed = newCancelProcessed;
	}

	/**
	 * Returns the value of '<em><b>generateProcessed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generateProcessed</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerateProcessed() {
		return generateProcessed;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getGenerateProcessed() <em>generateProcessed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getGenerateProcessed() generateProcessed}' feature.
	 * @generated
	 */
	public void setGenerateProcessed(Boolean newGenerateProcessed) {
		generateProcessed = newGenerateProcessed;
	}

	/**
	 * Returns the value of '<em><b>balancingAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>balancingAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getBalancingAmount() {
		return balancingAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getBalancingAmount() <em>balancingAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getBalancingAmount() balancingAmount}' feature.
	 * @generated
	 */
	public void setBalancingAmount(Decimal newBalancingAmount) {
		balancingAmount = newBalancingAmount;
	}

	/**
	 * Returns the value of '<em><b>directPosting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>directPosting</b></em>' feature
	 * @generated
	 */
	public Boolean getDirectPosting() {
		return directPosting;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getDirectPosting() <em>directPosting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getDirectPosting() directPosting}' feature.
	 * @generated
	 */
	public void setDirectPosting(Boolean newDirectPosting) {
		directPosting = newDirectPosting;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getGLItem() <em>gLItem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getGLItem() gLItem}' feature.
	 * @generated
	 */
	public void setGLItem(ReferenceType newGLItem) {
		gLItem = newGLItem;
	}

	/**
	 * Returns the value of '<em><b>salesOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesOrder</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesOrder() {
		return salesOrder;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getSalesOrder() <em>salesOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getSalesOrder() salesOrder}' feature.
	 * @generated
	 */
	public void setSalesOrder(ReferenceType newSalesOrder) {
		salesOrder = newSalesOrder;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ReferenceType newProject) {
		project = newProject;
	}

	/**
	 * Returns the value of '<em><b>isAutomaticGenerated</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isAutomaticGenerated</b></em>' feature
	 * @generated
	 */
	public Boolean getIsAutomaticGenerated() {
		return isAutomaticGenerated;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getIsAutomaticGenerated() <em>isAutomaticGenerated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getIsAutomaticGenerated() isAutomaticGenerated}' feature.
	 * @generated
	 */
	public void setIsAutomaticGenerated(Boolean newIsAutomaticGenerated) {
		isAutomaticGenerated = newIsAutomaticGenerated;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>initialStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>initialStatus</b></em>' feature
	 * @generated
	 */
	public String getInitialStatus() {
		return initialStatus;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getInitialStatus() <em>initialStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getInitialStatus() initialStatus}' feature.
	 * @generated
	 */
	public void setInitialStatus(String newInitialStatus) {
		initialStatus = newInitialStatus;
	}

	/**
	 * Returns the value of '<em><b>withholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withholding</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWithholding() {
		return withholding;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getWithholding() <em>withholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getWithholding() withholding}' feature.
	 * @generated
	 */
	public void setWithholding(ReferenceType newWithholding) {
		withholding = newWithholding;
	}

	/**
	 * Returns the value of '<em><b>withholdingamount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withholdingamount</b></em>' feature
	 * @generated
	 */
	public Decimal getWithholdingamount() {
		return withholdingamount;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getWithholdingamount() <em>withholdingamount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getWithholdingamount() withholdingamount}' feature.
	 * @generated
	 */
	public void setWithholdingamount(Decimal newWithholdingamount) {
		withholdingamount = newWithholdingamount;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatementLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatementLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtBankStatementLineList() {
		return financialMgmtBankStatementLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtBankStatementLineList() <em>financialMgmtBankStatementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtBankStatementLineList() financialMgmtBankStatementLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatementLineList(
			ReferenceType newFinancialMgmtBankStatementLineList) {
		financialMgmtBankStatementLineList = newFinancialMgmtBankStatementLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagementLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagementLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDPManagementLineList() {
		return financialMgmtDPManagementLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtDPManagementLineList() <em>financialMgmtDPManagementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtDPManagementLineList() financialMgmtDPManagementLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagementLineList(
			ReferenceType newFinancialMgmtDPManagementLineList) {
		financialMgmtDPManagementLineList = newFinancialMgmtDPManagementLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalReplaceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalReplaceList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentBalReplaceListType getFinancialMgmtDebtPaymentBalReplaceList() {
		return financialMgmtDebtPaymentBalReplaceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtDebtPaymentBalReplaceList() <em>financialMgmtDebtPaymentBalReplaceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtDebtPaymentBalReplaceList() financialMgmtDebtPaymentBalReplaceList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalReplaceList(
			FinancialMgmtDebtPaymentBalReplaceListType newFinancialMgmtDebtPaymentBalReplaceList) {
		financialMgmtDebtPaymentBalReplaceList = newFinancialMgmtDebtPaymentBalReplaceList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalancingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalancingList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentBalancingListType getFinancialMgmtDebtPaymentBalancingList() {
		return financialMgmtDebtPaymentBalancingList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtDebtPaymentBalancingList() <em>financialMgmtDebtPaymentBalancingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtDebtPaymentBalancingList() financialMgmtDebtPaymentBalancingList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalancingList(
			FinancialMgmtDebtPaymentBalancingListType newFinancialMgmtDebtPaymentBalancingList) {
		financialMgmtDebtPaymentBalancingList = newFinancialMgmtDebtPaymentBalancingList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLJournalLineList() {
		return financialMgmtGLJournalLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtJournalLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtJournalLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtJournalLineList() {
		return financialMgmtJournalLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtJournalLineList() <em>financialMgmtJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtJournalLineList() financialMgmtJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtJournalLineList(
			ReferenceType newFinancialMgmtJournalLineList) {
		financialMgmtJournalLineList = newFinancialMgmtJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtRemittanceLineList() {
		return financialMgmtRemittanceLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtRemittanceLineList() <em>financialMgmtRemittanceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtRemittanceLineList() financialMgmtRemittanceLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceLineList(
			ReferenceType newFinancialMgmtRemittanceLineList) {
		financialMgmtRemittanceLineList = newFinancialMgmtRemittanceLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceLinePaymentCancelledList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceLinePaymentCancelledList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtRemittanceLinePaymentCancelledList() {
		return financialMgmtRemittanceLinePaymentCancelledList;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtRemittanceLinePaymentCancelledList() <em>financialMgmtRemittanceLinePaymentCancelledList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getFinancialMgmtRemittanceLinePaymentCancelledList() financialMgmtRemittanceLinePaymentCancelledList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceLinePaymentCancelledList(
			ReferenceType newFinancialMgmtRemittanceLinePaymentCancelledList) {
		financialMgmtRemittanceLinePaymentCancelledList = newFinancialMgmtRemittanceLinePaymentCancelledList;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#isReference() reference}' feature.
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
	public List<FinancialMgmtDebtPaymentTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtDebtPaymentTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtDebtPaymentType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
