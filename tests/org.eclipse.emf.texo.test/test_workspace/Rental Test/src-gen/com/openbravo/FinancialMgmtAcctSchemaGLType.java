package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctSchemaGLType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctSchemaGLType {

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
	private Boolean suspenseBalancingUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType suspenseBalancing = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean suspenseErrorUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType suspenseError = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean currencyBalancingUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType currencyBalancingAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType retainedEarning = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType incomeSummary = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dueToIntercompany = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dueFromIntercompany = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pPVOffset = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType cFSOrderAccount = null;

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
	private List<FinancialMgmtAcctSchemaGLTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtAcctSchemaGLTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getAccountingSchema() <em>accountingSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getAccountingSchema() accountingSchema}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>suspenseBalancingUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suspenseBalancingUse</b></em>' feature
	 * @generated
	 */
	public Boolean getSuspenseBalancingUse() {
		return suspenseBalancingUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseBalancingUse() <em>suspenseBalancingUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseBalancingUse() suspenseBalancingUse}' feature.
	 * @generated
	 */
	public void setSuspenseBalancingUse(Boolean newSuspenseBalancingUse) {
		suspenseBalancingUse = newSuspenseBalancingUse;
	}

	/**
	 * Returns the value of '<em><b>suspenseBalancing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suspenseBalancing</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSuspenseBalancing() {
		return suspenseBalancing;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseBalancing() <em>suspenseBalancing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseBalancing() suspenseBalancing}' feature.
	 * @generated
	 */
	public void setSuspenseBalancing(ReferenceType newSuspenseBalancing) {
		suspenseBalancing = newSuspenseBalancing;
	}

	/**
	 * Returns the value of '<em><b>suspenseErrorUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suspenseErrorUse</b></em>' feature
	 * @generated
	 */
	public Boolean getSuspenseErrorUse() {
		return suspenseErrorUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseErrorUse() <em>suspenseErrorUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseErrorUse() suspenseErrorUse}' feature.
	 * @generated
	 */
	public void setSuspenseErrorUse(Boolean newSuspenseErrorUse) {
		suspenseErrorUse = newSuspenseErrorUse;
	}

	/**
	 * Returns the value of '<em><b>suspenseError</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suspenseError</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSuspenseError() {
		return suspenseError;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseError() <em>suspenseError</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getSuspenseError() suspenseError}' feature.
	 * @generated
	 */
	public void setSuspenseError(ReferenceType newSuspenseError) {
		suspenseError = newSuspenseError;
	}

	/**
	 * Returns the value of '<em><b>currencyBalancingUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyBalancingUse</b></em>' feature
	 * @generated
	 */
	public Boolean getCurrencyBalancingUse() {
		return currencyBalancingUse;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getCurrencyBalancingUse() <em>currencyBalancingUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getCurrencyBalancingUse() currencyBalancingUse}' feature.
	 * @generated
	 */
	public void setCurrencyBalancingUse(Boolean newCurrencyBalancingUse) {
		currencyBalancingUse = newCurrencyBalancingUse;
	}

	/**
	 * Returns the value of '<em><b>currencyBalancingAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyBalancingAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCurrencyBalancingAcct() {
		return currencyBalancingAcct;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getCurrencyBalancingAcct() <em>currencyBalancingAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getCurrencyBalancingAcct() currencyBalancingAcct}' feature.
	 * @generated
	 */
	public void setCurrencyBalancingAcct(ReferenceType newCurrencyBalancingAcct) {
		currencyBalancingAcct = newCurrencyBalancingAcct;
	}

	/**
	 * Returns the value of '<em><b>retainedEarning</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>retainedEarning</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRetainedEarning() {
		return retainedEarning;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getRetainedEarning() <em>retainedEarning</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getRetainedEarning() retainedEarning}' feature.
	 * @generated
	 */
	public void setRetainedEarning(ReferenceType newRetainedEarning) {
		retainedEarning = newRetainedEarning;
	}

	/**
	 * Returns the value of '<em><b>incomeSummary</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>incomeSummary</b></em>' feature
	 * @generated
	 */
	public ReferenceType getIncomeSummary() {
		return incomeSummary;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getIncomeSummary() <em>incomeSummary</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getIncomeSummary() incomeSummary}' feature.
	 * @generated
	 */
	public void setIncomeSummary(ReferenceType newIncomeSummary) {
		incomeSummary = newIncomeSummary;
	}

	/**
	 * Returns the value of '<em><b>dueToIntercompany</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dueToIntercompany</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDueToIntercompany() {
		return dueToIntercompany;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getDueToIntercompany() <em>dueToIntercompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getDueToIntercompany() dueToIntercompany}' feature.
	 * @generated
	 */
	public void setDueToIntercompany(ReferenceType newDueToIntercompany) {
		dueToIntercompany = newDueToIntercompany;
	}

	/**
	 * Returns the value of '<em><b>dueFromIntercompany</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dueFromIntercompany</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDueFromIntercompany() {
		return dueFromIntercompany;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getDueFromIntercompany() <em>dueFromIntercompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getDueFromIntercompany() dueFromIntercompany}' feature.
	 * @generated
	 */
	public void setDueFromIntercompany(ReferenceType newDueFromIntercompany) {
		dueFromIntercompany = newDueFromIntercompany;
	}

	/**
	 * Returns the value of '<em><b>pPVOffset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pPVOffset</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPPVOffset() {
		return pPVOffset;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getPPVOffset() <em>pPVOffset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getPPVOffset() pPVOffset}' feature.
	 * @generated
	 */
	public void setPPVOffset(ReferenceType newPPVOffset) {
		pPVOffset = newPPVOffset;
	}

	/**
	 * Returns the value of '<em><b>cFSOrderAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cFSOrderAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCFSOrderAccount() {
		return cFSOrderAccount;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getCFSOrderAccount() <em>cFSOrderAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getCFSOrderAccount() cFSOrderAccount}' feature.
	 * @generated
	 */
	public void setCFSOrderAccount(ReferenceType newCFSOrderAccount) {
		cFSOrderAccount = newCFSOrderAccount;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#isReference() reference}' feature.
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
	public List<FinancialMgmtAcctSchemaGLTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaGLType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaGLType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtAcctSchemaGLTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtAcctSchemaGLType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
