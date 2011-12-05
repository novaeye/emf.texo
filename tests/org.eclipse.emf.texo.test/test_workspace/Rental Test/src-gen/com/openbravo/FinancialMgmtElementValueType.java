package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtElementValueType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtElementValueType {

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
	private String searchKey = null;

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
	private String accountType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String accountSign = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean documentControlled = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType accountingElement = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean summaryLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime validFromDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime validToDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean postActual = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean postBudget = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean postEncumbrance = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean postStatistical = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean isBankAccount = null;

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
	private Boolean foreignCurrencyAccount = null;

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
	private Boolean elementShown = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String showValueCondition = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String elementLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean titleNode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinAccTransactionAcctVList = null;

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
	private ReferenceType financialMgmtAccountingCombinationAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingFactAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingRptElementAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctCFSAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctRptNodeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaElementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtBudgetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtElementValueOperandListType financialMgmtElementValueOperandList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtElementValueOperandAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtElementValueTrlListType financialMgmtElementValueTrlList = null;

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
	private List<FinancialMgmtElementValueTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtElementValueTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtElementValueType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>searchKey</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>searchKey</b></em>' feature
	 * @generated
	 */
	public String getSearchKey() {
		return searchKey;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getSearchKey() searchKey}' feature.
	 * @generated
	 */
	public void setSearchKey(String newSearchKey) {
		searchKey = newSearchKey;
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
	 * Sets the '{@link FinancialMgmtElementValueType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getName() name}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>accountType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountType</b></em>' feature
	 * @generated
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getAccountType() <em>accountType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getAccountType() accountType}' feature.
	 * @generated
	 */
	public void setAccountType(String newAccountType) {
		accountType = newAccountType;
	}

	/**
	 * Returns the value of '<em><b>accountSign</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountSign</b></em>' feature
	 * @generated
	 */
	public String getAccountSign() {
		return accountSign;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getAccountSign() <em>accountSign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getAccountSign() accountSign}' feature.
	 * @generated
	 */
	public void setAccountSign(String newAccountSign) {
		accountSign = newAccountSign;
	}

	/**
	 * Returns the value of '<em><b>documentControlled</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentControlled</b></em>' feature
	 * @generated
	 */
	public Boolean getDocumentControlled() {
		return documentControlled;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getDocumentControlled() <em>documentControlled</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getDocumentControlled() documentControlled}' feature.
	 * @generated
	 */
	public void setDocumentControlled(Boolean newDocumentControlled) {
		documentControlled = newDocumentControlled;
	}

	/**
	 * Returns the value of '<em><b>accountingElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingElement</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccountingElement() {
		return accountingElement;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getAccountingElement() <em>accountingElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getAccountingElement() accountingElement}' feature.
	 * @generated
	 */
	public void setAccountingElement(ReferenceType newAccountingElement) {
		accountingElement = newAccountingElement;
	}

	/**
	 * Returns the value of '<em><b>summaryLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>summaryLevel</b></em>' feature
	 * @generated
	 */
	public Boolean getSummaryLevel() {
		return summaryLevel;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getSummaryLevel() <em>summaryLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getSummaryLevel() summaryLevel}' feature.
	 * @generated
	 */
	public void setSummaryLevel(Boolean newSummaryLevel) {
		summaryLevel = newSummaryLevel;
	}

	/**
	 * Returns the value of '<em><b>validFromDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>validFromDate</b></em>' feature
	 * @generated
	 */
	public DateTime getValidFromDate() {
		return validFromDate;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getValidFromDate() <em>validFromDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getValidFromDate() validFromDate}' feature.
	 * @generated
	 */
	public void setValidFromDate(DateTime newValidFromDate) {
		validFromDate = newValidFromDate;
	}

	/**
	 * Returns the value of '<em><b>validToDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>validToDate</b></em>' feature
	 * @generated
	 */
	public DateTime getValidToDate() {
		return validToDate;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getValidToDate() <em>validToDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getValidToDate() validToDate}' feature.
	 * @generated
	 */
	public void setValidToDate(DateTime newValidToDate) {
		validToDate = newValidToDate;
	}

	/**
	 * Returns the value of '<em><b>postActual</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postActual</b></em>' feature
	 * @generated
	 */
	public Boolean getPostActual() {
		return postActual;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getPostActual() <em>postActual</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getPostActual() postActual}' feature.
	 * @generated
	 */
	public void setPostActual(Boolean newPostActual) {
		postActual = newPostActual;
	}

	/**
	 * Returns the value of '<em><b>postBudget</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postBudget</b></em>' feature
	 * @generated
	 */
	public Boolean getPostBudget() {
		return postBudget;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getPostBudget() <em>postBudget</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getPostBudget() postBudget}' feature.
	 * @generated
	 */
	public void setPostBudget(Boolean newPostBudget) {
		postBudget = newPostBudget;
	}

	/**
	 * Returns the value of '<em><b>postEncumbrance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postEncumbrance</b></em>' feature
	 * @generated
	 */
	public Boolean getPostEncumbrance() {
		return postEncumbrance;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getPostEncumbrance() <em>postEncumbrance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getPostEncumbrance() postEncumbrance}' feature.
	 * @generated
	 */
	public void setPostEncumbrance(Boolean newPostEncumbrance) {
		postEncumbrance = newPostEncumbrance;
	}

	/**
	 * Returns the value of '<em><b>postStatistical</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postStatistical</b></em>' feature
	 * @generated
	 */
	public Boolean getPostStatistical() {
		return postStatistical;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getPostStatistical() <em>postStatistical</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getPostStatistical() postStatistical}' feature.
	 * @generated
	 */
	public void setPostStatistical(Boolean newPostStatistical) {
		postStatistical = newPostStatistical;
	}

	/**
	 * Returns the value of '<em><b>isBankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isBankAccount</b></em>' feature
	 * @generated
	 */
	public Boolean getIsBankAccount() {
		return isBankAccount;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getIsBankAccount() <em>isBankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getIsBankAccount() isBankAccount}' feature.
	 * @generated
	 */
	public void setIsBankAccount(Boolean newIsBankAccount) {
		isBankAccount = newIsBankAccount;
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
	 * Sets the '{@link FinancialMgmtElementValueType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(ReferenceType newBankAccount) {
		bankAccount = newBankAccount;
	}

	/**
	 * Returns the value of '<em><b>foreignCurrencyAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>foreignCurrencyAccount</b></em>' feature
	 * @generated
	 */
	public Boolean getForeignCurrencyAccount() {
		return foreignCurrencyAccount;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getForeignCurrencyAccount() <em>foreignCurrencyAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getForeignCurrencyAccount() foreignCurrencyAccount}' feature.
	 * @generated
	 */
	public void setForeignCurrencyAccount(Boolean newForeignCurrencyAccount) {
		foreignCurrencyAccount = newForeignCurrencyAccount;
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
	 * Sets the '{@link FinancialMgmtElementValueType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>elementShown</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>elementShown</b></em>' feature
	 * @generated
	 */
	public Boolean getElementShown() {
		return elementShown;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getElementShown() <em>elementShown</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getElementShown() elementShown}' feature.
	 * @generated
	 */
	public void setElementShown(Boolean newElementShown) {
		elementShown = newElementShown;
	}

	/**
	 * Returns the value of '<em><b>showValueCondition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>showValueCondition</b></em>' feature
	 * @generated
	 */
	public String getShowValueCondition() {
		return showValueCondition;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getShowValueCondition() <em>showValueCondition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getShowValueCondition() showValueCondition}' feature.
	 * @generated
	 */
	public void setShowValueCondition(String newShowValueCondition) {
		showValueCondition = newShowValueCondition;
	}

	/**
	 * Returns the value of '<em><b>elementLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>elementLevel</b></em>' feature
	 * @generated
	 */
	public String getElementLevel() {
		return elementLevel;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getElementLevel() <em>elementLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getElementLevel() elementLevel}' feature.
	 * @generated
	 */
	public void setElementLevel(String newElementLevel) {
		elementLevel = newElementLevel;
	}

	/**
	 * Returns the value of '<em><b>titleNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>titleNode</b></em>' feature
	 * @generated
	 */
	public Boolean getTitleNode() {
		return titleNode;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getTitleNode() <em>titleNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getTitleNode() titleNode}' feature.
	 * @generated
	 */
	public void setTitleNode(Boolean newTitleNode) {
		titleNode = newTitleNode;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinAccTransactionAcctVList() {
		return aPRMFinAccTransactionAcctVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVList(
			ReferenceType newAPRMFinAccTransactionAcctVList) {
		aPRMFinAccTransactionAcctVList = newAPRMFinAccTransactionAcctVList;
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
	 * Sets the '{@link FinancialMgmtElementValueType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombinationAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombinationAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingCombinationAccountList() {
		return financialMgmtAccountingCombinationAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtAccountingCombinationAccountList() <em>financialMgmtAccountingCombinationAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtAccountingCombinationAccountList() financialMgmtAccountingCombinationAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombinationAccountList(
			ReferenceType newFinancialMgmtAccountingCombinationAccountList) {
		financialMgmtAccountingCombinationAccountList = newFinancialMgmtAccountingCombinationAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFactAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFactAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingFactAccountList() {
		return financialMgmtAccountingFactAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtAccountingFactAccountList() <em>financialMgmtAccountingFactAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtAccountingFactAccountList() financialMgmtAccountingFactAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactAccountList(
			ReferenceType newFinancialMgmtAccountingFactAccountList) {
		financialMgmtAccountingFactAccountList = newFinancialMgmtAccountingFactAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingRptElementAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingRptElementAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingRptElementAccountList() {
		return financialMgmtAccountingRptElementAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtAccountingRptElementAccountList() <em>financialMgmtAccountingRptElementAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtAccountingRptElementAccountList() financialMgmtAccountingRptElementAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingRptElementAccountList(
			ReferenceType newFinancialMgmtAccountingRptElementAccountList) {
		financialMgmtAccountingRptElementAccountList = newFinancialMgmtAccountingRptElementAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctCFSAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctCFSAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctCFSAccountList() {
		return financialMgmtAcctCFSAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtAcctCFSAccountList() <em>financialMgmtAcctCFSAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtAcctCFSAccountList() financialMgmtAcctCFSAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctCFSAccountList(
			ReferenceType newFinancialMgmtAcctCFSAccountList) {
		financialMgmtAcctCFSAccountList = newFinancialMgmtAcctCFSAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptNodeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptNodeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctRptNodeList() {
		return financialMgmtAcctRptNodeList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtAcctRptNodeList() <em>financialMgmtAcctRptNodeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtAcctRptNodeList() financialMgmtAcctRptNodeList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptNodeList(
			ReferenceType newFinancialMgmtAcctRptNodeList) {
		financialMgmtAcctRptNodeList = newFinancialMgmtAcctRptNodeList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaElementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaElementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaElementList() {
		return financialMgmtAcctSchemaElementList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtAcctSchemaElementList() <em>financialMgmtAcctSchemaElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtAcctSchemaElementList() financialMgmtAcctSchemaElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElementList(
			ReferenceType newFinancialMgmtAcctSchemaElementList) {
		financialMgmtAcctSchemaElementList = newFinancialMgmtAcctSchemaElementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBudgetLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudgetLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtBudgetLineList() {
		return financialMgmtBudgetLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueOperandList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueOperandList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtElementValueOperandListType getFinancialMgmtElementValueOperandList() {
		return financialMgmtElementValueOperandList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtElementValueOperandList() <em>financialMgmtElementValueOperandList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtElementValueOperandList() financialMgmtElementValueOperandList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueOperandList(
			FinancialMgmtElementValueOperandListType newFinancialMgmtElementValueOperandList) {
		financialMgmtElementValueOperandList = newFinancialMgmtElementValueOperandList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueOperandAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueOperandAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtElementValueOperandAccountList() {
		return financialMgmtElementValueOperandAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtElementValueOperandAccountList() <em>financialMgmtElementValueOperandAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtElementValueOperandAccountList() financialMgmtElementValueOperandAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueOperandAccountList(
			ReferenceType newFinancialMgmtElementValueOperandAccountList) {
		financialMgmtElementValueOperandAccountList = newFinancialMgmtElementValueOperandAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueTrlList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtElementValueTrlListType getFinancialMgmtElementValueTrlList() {
		return financialMgmtElementValueTrlList;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getFinancialMgmtElementValueTrlList() <em>financialMgmtElementValueTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getFinancialMgmtElementValueTrlList() financialMgmtElementValueTrlList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueTrlList(
			FinancialMgmtElementValueTrlListType newFinancialMgmtElementValueTrlList) {
		financialMgmtElementValueTrlList = newFinancialMgmtElementValueTrlList;
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
	 * Sets the '{@link FinancialMgmtElementValueType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtElementValueType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#isReference() reference}' feature.
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
	public List<FinancialMgmtElementValueTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtElementValueType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtElementValueType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtElementValueTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtElementValueType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
