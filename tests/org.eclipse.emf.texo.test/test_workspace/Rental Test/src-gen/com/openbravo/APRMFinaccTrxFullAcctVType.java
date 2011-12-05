package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>APRMFinaccTrxFullAcctVType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class APRMFinaccTrxFullAcctVType {

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
	private ReferenceType accountingSchema = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType accountElement = null;

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
	private DateTime accountingDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType period = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType table = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialAccountTransaction = null;

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
	private ReferenceType bankStatement = null;

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
	private ReferenceType financialAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType gLCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType tax = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType storageBin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String postingType = null;

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
	private Decimal foreignCurrencyDebit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal amtsourcecr = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal accountingSchemaCurrencyDebit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal credit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType uOM = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal quantity = null;

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
	private ReferenceType businessPartner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String trxOrganization = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType locationFromAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType locationToAddress = null;

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
	private String description = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType asset = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String groupID = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long sequenceNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String type = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String documentCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String value = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String accountingEntryDescription = null;

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
	private List<APRMFinaccTrxFullAcctVTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<APRMFinaccTrxFullAcctVTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getId() id}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getClient() client}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getOrganization() organization}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getActive() active}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getUpdated() updated}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAccountingSchema() <em>accountingSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAccountingSchema() accountingSchema}' feature.
	 * @generated
	 */
	public void setAccountingSchema(ReferenceType newAccountingSchema) {
		accountingSchema = newAccountingSchema;
	}

	/**
	 * Returns the value of '<em><b>accountElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountElement</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccountElement() {
		return accountElement;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAccountElement() <em>accountElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAccountElement() accountElement}' feature.
	 * @generated
	 */
	public void setAccountElement(ReferenceType newAccountElement) {
		accountElement = newAccountElement;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getTransactionDate() <em>transactionDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getTransactionDate() transactionDate}' feature.
	 * @generated
	 */
	public void setTransactionDate(DateTime newTransactionDate) {
		transactionDate = newTransactionDate;
	}

	/**
	 * Returns the value of '<em><b>accountingDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingDate</b></em>' feature
	 * @generated
	 */
	public DateTime getAccountingDate() {
		return accountingDate;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAccountingDate() <em>accountingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAccountingDate() accountingDate}' feature.
	 * @generated
	 */
	public void setAccountingDate(DateTime newAccountingDate) {
		accountingDate = newAccountingDate;
	}

	/**
	 * Returns the value of '<em><b>period</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>period</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPeriod() {
		return period;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getPeriod() <em>period</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getPeriod() period}' feature.
	 * @generated
	 */
	public void setPeriod(ReferenceType newPeriod) {
		period = newPeriod;
	}

	/**
	 * Returns the value of '<em><b>table</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>table</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTable() {
		return table;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getTable() <em>table</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getTable() table}' feature.
	 * @generated
	 */
	public void setTable(ReferenceType newTable) {
		table = newTable;
	}

	/**
	 * Returns the value of '<em><b>financialAccountTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialAccountTransaction</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialAccountTransaction() {
		return financialAccountTransaction;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getFinancialAccountTransaction() <em>financialAccountTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getFinancialAccountTransaction() financialAccountTransaction}' feature.
	 * @generated
	 */
	public void setFinancialAccountTransaction(
			ReferenceType newFinancialAccountTransaction) {
		financialAccountTransaction = newFinancialAccountTransaction;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getReconciliation() <em>reconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getReconciliation() reconciliation}' feature.
	 * @generated
	 */
	public void setReconciliation(ReferenceType newReconciliation) {
		reconciliation = newReconciliation;
	}

	/**
	 * Returns the value of '<em><b>bankStatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankStatement</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankStatement() {
		return bankStatement;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getBankStatement() <em>bankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getBankStatement() bankStatement}' feature.
	 * @generated
	 */
	public void setBankStatement(ReferenceType newBankStatement) {
		bankStatement = newBankStatement;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>financialAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialAccount() {
		return financialAccount;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getFinancialAccount() <em>financialAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getFinancialAccount() financialAccount}' feature.
	 * @generated
	 */
	public void setFinancialAccount(ReferenceType newFinancialAccount) {
		financialAccount = newFinancialAccount;
	}

	/**
	 * Returns the value of '<em><b>gLCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>gLCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getGLCategory() {
		return gLCategory;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getGLCategory() <em>gLCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getGLCategory() gLCategory}' feature.
	 * @generated
	 */
	public void setGLCategory(ReferenceType newGLCategory) {
		gLCategory = newGLCategory;
	}

	/**
	 * Returns the value of '<em><b>tax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>tax</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTax() {
		return tax;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getTax() <em>tax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getTax() tax}' feature.
	 * @generated
	 */
	public void setTax(ReferenceType newTax) {
		tax = newTax;
	}

	/**
	 * Returns the value of '<em><b>storageBin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>storageBin</b></em>' feature
	 * @generated
	 */
	public ReferenceType getStorageBin() {
		return storageBin;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getStorageBin() <em>storageBin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getStorageBin() storageBin}' feature.
	 * @generated
	 */
	public void setStorageBin(ReferenceType newStorageBin) {
		storageBin = newStorageBin;
	}

	/**
	 * Returns the value of '<em><b>postingType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postingType</b></em>' feature
	 * @generated
	 */
	public String getPostingType() {
		return postingType;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getPostingType() <em>postingType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getPostingType() postingType}' feature.
	 * @generated
	 */
	public void setPostingType(String newPostingType) {
		postingType = newPostingType;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>foreignCurrencyDebit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>foreignCurrencyDebit</b></em>' feature
	 * @generated
	 */
	public Decimal getForeignCurrencyDebit() {
		return foreignCurrencyDebit;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getForeignCurrencyDebit() <em>foreignCurrencyDebit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getForeignCurrencyDebit() foreignCurrencyDebit}' feature.
	 * @generated
	 */
	public void setForeignCurrencyDebit(Decimal newForeignCurrencyDebit) {
		foreignCurrencyDebit = newForeignCurrencyDebit;
	}

	/**
	 * Returns the value of '<em><b>amtsourcecr</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>amtsourcecr</b></em>' feature
	 * @generated
	 */
	public Decimal getAmtsourcecr() {
		return amtsourcecr;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAmtsourcecr() <em>amtsourcecr</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAmtsourcecr() amtsourcecr}' feature.
	 * @generated
	 */
	public void setAmtsourcecr(Decimal newAmtsourcecr) {
		amtsourcecr = newAmtsourcecr;
	}

	/**
	 * Returns the value of '<em><b>accountingSchemaCurrencyDebit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingSchemaCurrencyDebit</b></em>' feature
	 * @generated
	 */
	public Decimal getAccountingSchemaCurrencyDebit() {
		return accountingSchemaCurrencyDebit;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAccountingSchemaCurrencyDebit() <em>accountingSchemaCurrencyDebit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAccountingSchemaCurrencyDebit() accountingSchemaCurrencyDebit}' feature.
	 * @generated
	 */
	public void setAccountingSchemaCurrencyDebit(
			Decimal newAccountingSchemaCurrencyDebit) {
		accountingSchemaCurrencyDebit = newAccountingSchemaCurrencyDebit;
	}

	/**
	 * Returns the value of '<em><b>credit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>credit</b></em>' feature
	 * @generated
	 */
	public Decimal getCredit() {
		return credit;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getCredit() <em>credit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getCredit() credit}' feature.
	 * @generated
	 */
	public void setCredit(Decimal newCredit) {
		credit = newCredit;
	}

	/**
	 * Returns the value of '<em><b>uOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOM</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUOM() {
		return uOM;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ReferenceType newUOM) {
		uOM = newUOM;
	}

	/**
	 * Returns the value of '<em><b>quantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>quantity</b></em>' feature
	 * @generated
	 */
	public Decimal getQuantity() {
		return quantity;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getQuantity() <em>quantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getQuantity() quantity}' feature.
	 * @generated
	 */
	public void setQuantity(Decimal newQuantity) {
		quantity = newQuantity;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>trxOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>trxOrganization</b></em>' feature
	 * @generated
	 */
	public String getTrxOrganization() {
		return trxOrganization;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getTrxOrganization() <em>trxOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getTrxOrganization() trxOrganization}' feature.
	 * @generated
	 */
	public void setTrxOrganization(String newTrxOrganization) {
		trxOrganization = newTrxOrganization;
	}

	/**
	 * Returns the value of '<em><b>locationFromAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationFromAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationFromAddress() {
		return locationFromAddress;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getLocationFromAddress() <em>locationFromAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getLocationFromAddress() locationFromAddress}' feature.
	 * @generated
	 */
	public void setLocationFromAddress(ReferenceType newLocationFromAddress) {
		locationFromAddress = newLocationFromAddress;
	}

	/**
	 * Returns the value of '<em><b>locationToAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationToAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationToAddress() {
		return locationToAddress;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getLocationToAddress() <em>locationToAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getLocationToAddress() locationToAddress}' feature.
	 * @generated
	 */
	public void setLocationToAddress(ReferenceType newLocationToAddress) {
		locationToAddress = newLocationToAddress;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(ReferenceType newSalesRegion) {
		salesRegion = newSalesRegion;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getProject() project}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getSalesCampaign() salesCampaign}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getActivity() activity}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getStDimension() stDimension}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>asset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>asset</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAsset() {
		return asset;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAsset() <em>asset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAsset() asset}' feature.
	 * @generated
	 */
	public void setAsset(ReferenceType newAsset) {
		asset = newAsset;
	}

	/**
	 * Returns the value of '<em><b>groupID</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>groupID</b></em>' feature
	 * @generated
	 */
	public String getGroupID() {
		return groupID;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getGroupID() <em>groupID</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getGroupID() groupID}' feature.
	 * @generated
	 */
	public void setGroupID(String newGroupID) {
		groupID = newGroupID;
	}

	/**
	 * Returns the value of '<em><b>sequenceNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sequenceNumber</b></em>' feature
	 * @generated
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getSequenceNumber() <em>sequenceNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getSequenceNumber() sequenceNumber}' feature.
	 * @generated
	 */
	public void setSequenceNumber(Long newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
	}

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getType() type}' feature.
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
	}

	/**
	 * Returns the value of '<em><b>documentCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentCategory</b></em>' feature
	 * @generated
	 */
	public String getDocumentCategory() {
		return documentCategory;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getDocumentCategory() <em>documentCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getDocumentCategory() documentCategory}' feature.
	 * @generated
	 */
	public void setDocumentCategory(String newDocumentCategory) {
		documentCategory = newDocumentCategory;
	}

	/**
	 * Returns the value of '<em><b>value</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>value</b></em>' feature
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getValue() <em>value</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getValue() value}' feature.
	 * @generated
	 */
	public void setValue(String newValue) {
		value = newValue;
	}

	/**
	 * Returns the value of '<em><b>accountingEntryDescription</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingEntryDescription</b></em>' feature
	 * @generated
	 */
	public String getAccountingEntryDescription() {
		return accountingEntryDescription;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAccountingEntryDescription() <em>accountingEntryDescription</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAccountingEntryDescription() accountingEntryDescription}' feature.
	 * @generated
	 */
	public void setAccountingEntryDescription(
			String newAccountingEntryDescription) {
		accountingEntryDescription = newAccountingEntryDescription;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getWithholding() <em>withholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getWithholding() withholding}' feature.
	 * @generated
	 */
	public void setWithholding(ReferenceType newWithholding) {
		withholding = newWithholding;
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getId1() id1}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#isReference() reference}' feature.
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
	public List<APRMFinaccTrxFullAcctVTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link APRMFinaccTrxFullAcctVType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMFinaccTrxFullAcctVType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<APRMFinaccTrxFullAcctVTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "APRMFinaccTrxFullAcctVType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
