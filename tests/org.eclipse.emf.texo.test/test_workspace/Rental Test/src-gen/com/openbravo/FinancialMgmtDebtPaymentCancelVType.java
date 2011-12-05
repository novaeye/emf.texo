package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtDebtPaymentCancelVType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtDebtPaymentCancelVType {

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
	private ReferenceType settlement = null;

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
	private ReferenceType bankStatementLine = null;

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
	private ReferenceType settlementGenerate = null;

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
	private List<FinancialMgmtDebtPaymentCancelVTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtDebtPaymentCancelVTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getReceipt() <em>receipt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getReceipt() receipt}' feature.
	 * @generated
	 */
	public void setReceipt(Boolean newReceipt) {
		receipt = newReceipt;
	}

	/**
	 * Returns the value of '<em><b>settlement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>settlement</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSettlement() {
		return settlement;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getSettlement() <em>settlement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getSettlement() settlement}' feature.
	 * @generated
	 */
	public void setSettlement(ReferenceType newSettlement) {
		settlement = newSettlement;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getDescription() description}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getInvoice() invoice}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getBusinessPartner() businessPartner}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getCurrency() currency}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getCashJournalLine() <em>cashJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getCashJournalLine() cashJournalLine}' feature.
	 * @generated
	 */
	public void setCashJournalLine(ReferenceType newCashJournalLine) {
		cashJournalLine = newCashJournalLine;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getBankStatementLine() <em>bankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getBankStatementLine() bankStatementLine}' feature.
	 * @generated
	 */
	public void setBankStatementLine(ReferenceType newBankStatementLine) {
		bankStatementLine = newBankStatementLine;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getBankAccount() bankAccount}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getCashbook() <em>cashbook</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getCashbook() cashbook}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getFormOfPayment() formOfPayment}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getPaymentComplete() <em>paymentComplete</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getPaymentComplete() paymentComplete}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getAmount() <em>amount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getAmount() amount}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getWriteoffAmount() <em>writeoffAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getWriteoffAmount() writeoffAmount}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getDueDate() <em>dueDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getDueDate() dueDate}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getManual() <em>manual</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getManual() manual}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getValid() <em>valid</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getValid() valid}' feature.
	 * @generated
	 */
	public void setValid(Boolean newValid) {
		valid = newValid;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getChangeSettlementCancel() <em>changeSettlementCancel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getChangeSettlementCancel() changeSettlementCancel}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getCancelProcessed() <em>cancelProcessed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getCancelProcessed() cancelProcessed}' feature.
	 * @generated
	 */
	public void setCancelProcessed(Boolean newCancelProcessed) {
		cancelProcessed = newCancelProcessed;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getSettlementGenerate() <em>settlementGenerate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getSettlementGenerate() settlementGenerate}' feature.
	 * @generated
	 */
	public void setSettlementGenerate(ReferenceType newSettlementGenerate) {
		settlementGenerate = newSettlementGenerate;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getWithholding() <em>withholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getWithholding() withholding}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getWithholdingamount() <em>withholdingamount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getWithholdingamount() withholdingamount}' feature.
	 * @generated
	 */
	public void setWithholdingamount(Decimal newWithholdingamount) {
		withholdingamount = newWithholdingamount;
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#isReference() reference}' feature.
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
	public List<FinancialMgmtDebtPaymentCancelVTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtDebtPaymentCancelVType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtDebtPaymentCancelVType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtDebtPaymentCancelVTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtDebtPaymentCancelVType " + " [id1: " + getId1()
				+ "]" + " [identifier: " + getIdentifier() + "]"
				+ " [reference: " + isReference() + "]";
	}
}
