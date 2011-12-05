package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtWithholdingType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtWithholdingType {

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
	private ReferenceType paymentTerms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean taxWithholding = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean prorateTax = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean paymentToExternalParty = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType beneficiary = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean withholdingPercentage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal percent = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal fixAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal thresholdMin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal thresholdMax = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal minAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal maxAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal rate = null;

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
	private ReferenceType businessPartnerWithholdingList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingFactList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentCancelVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentGenerateVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLItemList = null;

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
	private FinancialMgmtWithholdingAccountsListType financialMgmtWithholdingAccountsList = null;

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
	private List<FinancialMgmtWithholdingTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtWithholdingTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtWithholdingType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getName() name}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>paymentTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentTerms</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentTerms() {
		return paymentTerms;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getPaymentTerms() <em>paymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getPaymentTerms() paymentTerms}' feature.
	 * @generated
	 */
	public void setPaymentTerms(ReferenceType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
	}

	/**
	 * Returns the value of '<em><b>taxWithholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxWithholding</b></em>' feature
	 * @generated
	 */
	public Boolean getTaxWithholding() {
		return taxWithholding;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getTaxWithholding() <em>taxWithholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getTaxWithholding() taxWithholding}' feature.
	 * @generated
	 */
	public void setTaxWithholding(Boolean newTaxWithholding) {
		taxWithholding = newTaxWithholding;
	}

	/**
	 * Returns the value of '<em><b>prorateTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>prorateTax</b></em>' feature
	 * @generated
	 */
	public Boolean getProrateTax() {
		return prorateTax;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getProrateTax() <em>prorateTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getProrateTax() prorateTax}' feature.
	 * @generated
	 */
	public void setProrateTax(Boolean newProrateTax) {
		prorateTax = newProrateTax;
	}

	/**
	 * Returns the value of '<em><b>paymentToExternalParty</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentToExternalParty</b></em>' feature
	 * @generated
	 */
	public Boolean getPaymentToExternalParty() {
		return paymentToExternalParty;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getPaymentToExternalParty() <em>paymentToExternalParty</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getPaymentToExternalParty() paymentToExternalParty}' feature.
	 * @generated
	 */
	public void setPaymentToExternalParty(Boolean newPaymentToExternalParty) {
		paymentToExternalParty = newPaymentToExternalParty;
	}

	/**
	 * Returns the value of '<em><b>beneficiary</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>beneficiary</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBeneficiary() {
		return beneficiary;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getBeneficiary() <em>beneficiary</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getBeneficiary() beneficiary}' feature.
	 * @generated
	 */
	public void setBeneficiary(ReferenceType newBeneficiary) {
		beneficiary = newBeneficiary;
	}

	/**
	 * Returns the value of '<em><b>withholdingPercentage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withholdingPercentage</b></em>' feature
	 * @generated
	 */
	public Boolean getWithholdingPercentage() {
		return withholdingPercentage;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getWithholdingPercentage() <em>withholdingPercentage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getWithholdingPercentage() withholdingPercentage}' feature.
	 * @generated
	 */
	public void setWithholdingPercentage(Boolean newWithholdingPercentage) {
		withholdingPercentage = newWithholdingPercentage;
	}

	/**
	 * Returns the value of '<em><b>percent</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>percent</b></em>' feature
	 * @generated
	 */
	public Decimal getPercent() {
		return percent;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getPercent() <em>percent</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getPercent() percent}' feature.
	 * @generated
	 */
	public void setPercent(Decimal newPercent) {
		percent = newPercent;
	}

	/**
	 * Returns the value of '<em><b>fixAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fixAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getFixAmount() {
		return fixAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFixAmount() <em>fixAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFixAmount() fixAmount}' feature.
	 * @generated
	 */
	public void setFixAmount(Decimal newFixAmount) {
		fixAmount = newFixAmount;
	}

	/**
	 * Returns the value of '<em><b>thresholdMin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>thresholdMin</b></em>' feature
	 * @generated
	 */
	public Decimal getThresholdMin() {
		return thresholdMin;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getThresholdMin() <em>thresholdMin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getThresholdMin() thresholdMin}' feature.
	 * @generated
	 */
	public void setThresholdMin(Decimal newThresholdMin) {
		thresholdMin = newThresholdMin;
	}

	/**
	 * Returns the value of '<em><b>thresholdMax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>thresholdMax</b></em>' feature
	 * @generated
	 */
	public Decimal getThresholdMax() {
		return thresholdMax;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getThresholdMax() <em>thresholdMax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getThresholdMax() thresholdMax}' feature.
	 * @generated
	 */
	public void setThresholdMax(Decimal newThresholdMax) {
		thresholdMax = newThresholdMax;
	}

	/**
	 * Returns the value of '<em><b>minAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>minAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getMinAmount() {
		return minAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getMinAmount() <em>minAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getMinAmount() minAmount}' feature.
	 * @generated
	 */
	public void setMinAmount(Decimal newMinAmount) {
		minAmount = newMinAmount;
	}

	/**
	 * Returns the value of '<em><b>maxAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maxAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getMaxAmount() {
		return maxAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getMaxAmount() <em>maxAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getMaxAmount() maxAmount}' feature.
	 * @generated
	 */
	public void setMaxAmount(Decimal newMaxAmount) {
		maxAmount = newMaxAmount;
	}

	/**
	 * Returns the value of '<em><b>rate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rate</b></em>' feature
	 * @generated
	 */
	public Decimal getRate() {
		return rate;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getRate() <em>rate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getRate() rate}' feature.
	 * @generated
	 */
	public void setRate(Decimal newRate) {
		rate = newRate;
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerWithholdingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerWithholdingList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerWithholdingList() {
		return businessPartnerWithholdingList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getBusinessPartnerWithholdingList() <em>businessPartnerWithholdingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getBusinessPartnerWithholdingList() businessPartnerWithholdingList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerWithholdingList(
			ReferenceType newBusinessPartnerWithholdingList) {
		businessPartnerWithholdingList = newBusinessPartnerWithholdingList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFactList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFactList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingFactList() {
		return financialMgmtAccountingFactList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentList() {
		return financialMgmtDebtPaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentList(
			ReferenceType newFinancialMgmtDebtPaymentList) {
		financialMgmtDebtPaymentList = newFinancialMgmtDebtPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentCancelVList() {
		return financialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtDebtPaymentCancelVList() <em>financialMgmtDebtPaymentCancelVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtDebtPaymentCancelVList() financialMgmtDebtPaymentCancelVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelVList(
			ReferenceType newFinancialMgmtDebtPaymentCancelVList) {
		financialMgmtDebtPaymentCancelVList = newFinancialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentGenerateVList() {
		return financialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVList(
			ReferenceType newFinancialMgmtDebtPaymentGenerateVList) {
		financialMgmtDebtPaymentGenerateVList = newFinancialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLItemList() {
		return financialMgmtGLItemList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtGLItemList() <em>financialMgmtGLItemList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtGLItemList() financialMgmtGLItemList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemList(
			ReferenceType newFinancialMgmtGLItemList) {
		financialMgmtGLItemList = newFinancialMgmtGLItemList;
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtWithholdingAccountsListType getFinancialMgmtWithholdingAccountsList() {
		return financialMgmtWithholdingAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getFinancialMgmtWithholdingAccountsList() <em>financialMgmtWithholdingAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getFinancialMgmtWithholdingAccountsList() financialMgmtWithholdingAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingAccountsList(
			FinancialMgmtWithholdingAccountsListType newFinancialMgmtWithholdingAccountsList) {
		financialMgmtWithholdingAccountsList = newFinancialMgmtWithholdingAccountsList;
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(ReferenceType newInvoiceList) {
		invoiceList = newInvoiceList;
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtWithholdingType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#isReference() reference}' feature.
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
	public List<FinancialMgmtWithholdingTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtWithholdingType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtWithholdingType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtWithholdingTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtWithholdingType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
