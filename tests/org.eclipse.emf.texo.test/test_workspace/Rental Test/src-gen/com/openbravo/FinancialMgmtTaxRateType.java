package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtTaxRateType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtTaxRateType {

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
	private String name = null;

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
	private String description = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String taxSearchKey = null;

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
	private Boolean summaryLevel = null;

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
	private ReferenceType parentTaxRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType country = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType region = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType destinationCountry = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType destinationRegion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType taxCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean default_ = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean taxExempt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String salesPurchaseType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean cascade = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerTaxCategory = null;

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
	private Boolean withholdingTax = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean notTaxable = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal deductableRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal originalRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean notTaxdeductable = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean istaxdeductable = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean noVAT = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String baseAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType taxBase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String docTaxAmount = null;

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
	private ReferenceType financialMgmtTaxRateParentTaxRateList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateTaxBaseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRateAccountsListType financialMgmtTaxRateAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRegisterTypeLinesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRegisterlineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxReportList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxTrlListType financialMgmtTaxTrlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxZoneListType financialMgmtTaxZoneList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderLineTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organizationInformationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectLineList = null;

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
	private List<FinancialMgmtTaxRateTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtTaxRateTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtTaxRateType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getUpdated() updated}' feature.
	 * @generated
	 */
	public void setUpdated(DateTime newUpdated) {
		updated = newUpdated;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>taxSearchKey</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxSearchKey</b></em>' feature
	 * @generated
	 */
	public String getTaxSearchKey() {
		return taxSearchKey;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getTaxSearchKey() <em>taxSearchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getTaxSearchKey() taxSearchKey}' feature.
	 * @generated
	 */
	public void setTaxSearchKey(String newTaxSearchKey) {
		taxSearchKey = newTaxSearchKey;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getValidFromDate() <em>validFromDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getValidFromDate() validFromDate}' feature.
	 * @generated
	 */
	public void setValidFromDate(DateTime newValidFromDate) {
		validFromDate = newValidFromDate;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getSummaryLevel() <em>summaryLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getSummaryLevel() summaryLevel}' feature.
	 * @generated
	 */
	public void setSummaryLevel(Boolean newSummaryLevel) {
		summaryLevel = newSummaryLevel;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getRate() <em>rate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getRate() rate}' feature.
	 * @generated
	 */
	public void setRate(Decimal newRate) {
		rate = newRate;
	}

	/**
	 * Returns the value of '<em><b>parentTaxRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>parentTaxRate</b></em>' feature
	 * @generated
	 */
	public ReferenceType getParentTaxRate() {
		return parentTaxRate;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getParentTaxRate() <em>parentTaxRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getParentTaxRate() parentTaxRate}' feature.
	 * @generated
	 */
	public void setParentTaxRate(ReferenceType newParentTaxRate) {
		parentTaxRate = newParentTaxRate;
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(ReferenceType newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of '<em><b>region</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>region</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRegion() {
		return region;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(ReferenceType newRegion) {
		region = newRegion;
	}

	/**
	 * Returns the value of '<em><b>destinationCountry</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>destinationCountry</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDestinationCountry() {
		return destinationCountry;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getDestinationCountry() <em>destinationCountry</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getDestinationCountry() destinationCountry}' feature.
	 * @generated
	 */
	public void setDestinationCountry(ReferenceType newDestinationCountry) {
		destinationCountry = newDestinationCountry;
	}

	/**
	 * Returns the value of '<em><b>destinationRegion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>destinationRegion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDestinationRegion() {
		return destinationRegion;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getDestinationRegion() <em>destinationRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getDestinationRegion() destinationRegion}' feature.
	 * @generated
	 */
	public void setDestinationRegion(ReferenceType newDestinationRegion) {
		destinationRegion = newDestinationRegion;
	}

	/**
	 * Returns the value of '<em><b>taxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTaxCategory() {
		return taxCategory;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getTaxCategory() <em>taxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getTaxCategory() taxCategory}' feature.
	 * @generated
	 */
	public void setTaxCategory(ReferenceType newTaxCategory) {
		taxCategory = newTaxCategory;
	}

	/**
	 * Returns the value of '<em><b>default</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>default</b></em>' feature
	 * @generated
	 */
	public Boolean getDefault() {
		return default_;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
	}

	/**
	 * Returns the value of '<em><b>taxExempt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxExempt</b></em>' feature
	 * @generated
	 */
	public Boolean getTaxExempt() {
		return taxExempt;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getTaxExempt() <em>taxExempt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getTaxExempt() taxExempt}' feature.
	 * @generated
	 */
	public void setTaxExempt(Boolean newTaxExempt) {
		taxExempt = newTaxExempt;
	}

	/**
	 * Returns the value of '<em><b>salesPurchaseType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesPurchaseType</b></em>' feature
	 * @generated
	 */
	public String getSalesPurchaseType() {
		return salesPurchaseType;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getSalesPurchaseType() <em>salesPurchaseType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getSalesPurchaseType() salesPurchaseType}' feature.
	 * @generated
	 */
	public void setSalesPurchaseType(String newSalesPurchaseType) {
		salesPurchaseType = newSalesPurchaseType;
	}

	/**
	 * Returns the value of '<em><b>cascade</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cascade</b></em>' feature
	 * @generated
	 */
	public Boolean getCascade() {
		return cascade;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getCascade() <em>cascade</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getCascade() cascade}' feature.
	 * @generated
	 */
	public void setCascade(Boolean newCascade) {
		cascade = newCascade;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerTaxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerTaxCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerTaxCategory() {
		return businessPartnerTaxCategory;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getBusinessPartnerTaxCategory() <em>businessPartnerTaxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getBusinessPartnerTaxCategory() businessPartnerTaxCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerTaxCategory(
			ReferenceType newBusinessPartnerTaxCategory) {
		businessPartnerTaxCategory = newBusinessPartnerTaxCategory;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>withholdingTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withholdingTax</b></em>' feature
	 * @generated
	 */
	public Boolean getWithholdingTax() {
		return withholdingTax;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getWithholdingTax() <em>withholdingTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getWithholdingTax() withholdingTax}' feature.
	 * @generated
	 */
	public void setWithholdingTax(Boolean newWithholdingTax) {
		withholdingTax = newWithholdingTax;
	}

	/**
	 * Returns the value of '<em><b>notTaxable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>notTaxable</b></em>' feature
	 * @generated
	 */
	public Boolean getNotTaxable() {
		return notTaxable;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getNotTaxable() <em>notTaxable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getNotTaxable() notTaxable}' feature.
	 * @generated
	 */
	public void setNotTaxable(Boolean newNotTaxable) {
		notTaxable = newNotTaxable;
	}

	/**
	 * Returns the value of '<em><b>deductableRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deductableRate</b></em>' feature
	 * @generated
	 */
	public Decimal getDeductableRate() {
		return deductableRate;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getDeductableRate() <em>deductableRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getDeductableRate() deductableRate}' feature.
	 * @generated
	 */
	public void setDeductableRate(Decimal newDeductableRate) {
		deductableRate = newDeductableRate;
	}

	/**
	 * Returns the value of '<em><b>originalRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>originalRate</b></em>' feature
	 * @generated
	 */
	public Decimal getOriginalRate() {
		return originalRate;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getOriginalRate() <em>originalRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getOriginalRate() originalRate}' feature.
	 * @generated
	 */
	public void setOriginalRate(Decimal newOriginalRate) {
		originalRate = newOriginalRate;
	}

	/**
	 * Returns the value of '<em><b>notTaxdeductable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>notTaxdeductable</b></em>' feature
	 * @generated
	 */
	public Boolean getNotTaxdeductable() {
		return notTaxdeductable;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getNotTaxdeductable() <em>notTaxdeductable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getNotTaxdeductable() notTaxdeductable}' feature.
	 * @generated
	 */
	public void setNotTaxdeductable(Boolean newNotTaxdeductable) {
		notTaxdeductable = newNotTaxdeductable;
	}

	/**
	 * Returns the value of '<em><b>istaxdeductable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>istaxdeductable</b></em>' feature
	 * @generated
	 */
	public Boolean getIstaxdeductable() {
		return istaxdeductable;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getIstaxdeductable() <em>istaxdeductable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getIstaxdeductable() istaxdeductable}' feature.
	 * @generated
	 */
	public void setIstaxdeductable(Boolean newIstaxdeductable) {
		istaxdeductable = newIstaxdeductable;
	}

	/**
	 * Returns the value of '<em><b>noVAT</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>noVAT</b></em>' feature
	 * @generated
	 */
	public Boolean getNoVAT() {
		return noVAT;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getNoVAT() <em>noVAT</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getNoVAT() noVAT}' feature.
	 * @generated
	 */
	public void setNoVAT(Boolean newNoVAT) {
		noVAT = newNoVAT;
	}

	/**
	 * Returns the value of '<em><b>baseAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>baseAmount</b></em>' feature
	 * @generated
	 */
	public String getBaseAmount() {
		return baseAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getBaseAmount() <em>baseAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getBaseAmount() baseAmount}' feature.
	 * @generated
	 */
	public void setBaseAmount(String newBaseAmount) {
		baseAmount = newBaseAmount;
	}

	/**
	 * Returns the value of '<em><b>taxBase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxBase</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTaxBase() {
		return taxBase;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getTaxBase() <em>taxBase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getTaxBase() taxBase}' feature.
	 * @generated
	 */
	public void setTaxBase(ReferenceType newTaxBase) {
		taxBase = newTaxBase;
	}

	/**
	 * Returns the value of '<em><b>docTaxAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>docTaxAmount</b></em>' feature
	 * @generated
	 */
	public String getDocTaxAmount() {
		return docTaxAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getDocTaxAmount() <em>docTaxAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getDocTaxAmount() docTaxAmount}' feature.
	 * @generated
	 */
	public void setDocTaxAmount(String newDocTaxAmount) {
		docTaxAmount = newDocTaxAmount;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getBusinessPartnerWithholdingList() <em>businessPartnerWithholdingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getBusinessPartnerWithholdingList() businessPartnerWithholdingList}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtGLItemList() <em>financialMgmtGLItemList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtGLItemList() financialMgmtGLItemList}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateParentTaxRateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateParentTaxRateList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateParentTaxRateList() {
		return financialMgmtTaxRateParentTaxRateList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRateParentTaxRateList() <em>financialMgmtTaxRateParentTaxRateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRateParentTaxRateList() financialMgmtTaxRateParentTaxRateList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateParentTaxRateList(
			ReferenceType newFinancialMgmtTaxRateParentTaxRateList) {
		financialMgmtTaxRateParentTaxRateList = newFinancialMgmtTaxRateParentTaxRateList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateTaxBaseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateTaxBaseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateTaxBaseList() {
		return financialMgmtTaxRateTaxBaseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRateTaxBaseList() <em>financialMgmtTaxRateTaxBaseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRateTaxBaseList() financialMgmtTaxRateTaxBaseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateTaxBaseList(
			ReferenceType newFinancialMgmtTaxRateTaxBaseList) {
		financialMgmtTaxRateTaxBaseList = newFinancialMgmtTaxRateTaxBaseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRateAccountsListType getFinancialMgmtTaxRateAccountsList() {
		return financialMgmtTaxRateAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRateAccountsList() <em>financialMgmtTaxRateAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRateAccountsList() financialMgmtTaxRateAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsList(
			FinancialMgmtTaxRateAccountsListType newFinancialMgmtTaxRateAccountsList) {
		financialMgmtTaxRateAccountsList = newFinancialMgmtTaxRateAccountsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterTypeLinesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterTypeLinesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRegisterTypeLinesList() {
		return financialMgmtTaxRegisterTypeLinesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRegisterTypeLinesList() <em>financialMgmtTaxRegisterTypeLinesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRegisterTypeLinesList() financialMgmtTaxRegisterTypeLinesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterTypeLinesList(
			ReferenceType newFinancialMgmtTaxRegisterTypeLinesList) {
		financialMgmtTaxRegisterTypeLinesList = newFinancialMgmtTaxRegisterTypeLinesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterlineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterlineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRegisterlineList() {
		return financialMgmtTaxRegisterlineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRegisterlineList() <em>financialMgmtTaxRegisterlineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxRegisterlineList() financialMgmtTaxRegisterlineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterlineList(
			ReferenceType newFinancialMgmtTaxRegisterlineList) {
		financialMgmtTaxRegisterlineList = newFinancialMgmtTaxRegisterlineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxReportList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxReportList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxReportList() {
		return financialMgmtTaxReportList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxReportList() <em>financialMgmtTaxReportList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxReportList() financialMgmtTaxReportList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxReportList(
			ReferenceType newFinancialMgmtTaxReportList) {
		financialMgmtTaxReportList = newFinancialMgmtTaxReportList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxTrlList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxTrlListType getFinancialMgmtTaxTrlList() {
		return financialMgmtTaxTrlList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxTrlList() <em>financialMgmtTaxTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxTrlList() financialMgmtTaxTrlList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxTrlList(
			FinancialMgmtTaxTrlListType newFinancialMgmtTaxTrlList) {
		financialMgmtTaxTrlList = newFinancialMgmtTaxTrlList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxZoneList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxZoneList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxZoneListType getFinancialMgmtTaxZoneList() {
		return financialMgmtTaxZoneList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxZoneList() <em>financialMgmtTaxZoneList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getFinancialMgmtTaxZoneList() financialMgmtTaxZoneList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZoneList(
			FinancialMgmtTaxZoneListType newFinancialMgmtTaxZoneList) {
		financialMgmtTaxZoneList = newFinancialMgmtTaxZoneList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineList() {
		return invoiceLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getInvoiceLineList() <em>invoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getInvoiceLineList() invoiceLineList}' feature.
	 * @generated
	 */
	public void setInvoiceLineList(ReferenceType newInvoiceLineList) {
		invoiceLineList = newInvoiceLineList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineTaxList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineTaxList() {
		return invoiceLineTaxList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getInvoiceLineTaxList() <em>invoiceLineTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getInvoiceLineTaxList() invoiceLineTaxList}' feature.
	 * @generated
	 */
	public void setInvoiceLineTaxList(ReferenceType newInvoiceLineTaxList) {
		invoiceLineTaxList = newInvoiceLineTaxList;
	}

	/**
	 * Returns the value of '<em><b>invoiceTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTaxList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceTaxList() {
		return invoiceTaxList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getInvoiceTaxList() <em>invoiceTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getInvoiceTaxList() invoiceTaxList}' feature.
	 * @generated
	 */
	public void setInvoiceTaxList(ReferenceType newInvoiceTaxList) {
		invoiceTaxList = newInvoiceTaxList;
	}

	/**
	 * Returns the value of '<em><b>orderLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderLineList() {
		return orderLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>orderLineTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineTaxList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderLineTaxList() {
		return orderLineTaxList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getOrderLineTaxList() <em>orderLineTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getOrderLineTaxList() orderLineTaxList}' feature.
	 * @generated
	 */
	public void setOrderLineTaxList(ReferenceType newOrderLineTaxList) {
		orderLineTaxList = newOrderLineTaxList;
	}

	/**
	 * Returns the value of '<em><b>orderTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderTaxList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderTaxList() {
		return orderTaxList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getOrderTaxList() <em>orderTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getOrderTaxList() orderTaxList}' feature.
	 * @generated
	 */
	public void setOrderTaxList(ReferenceType newOrderTaxList) {
		orderTaxList = newOrderTaxList;
	}

	/**
	 * Returns the value of '<em><b>organizationInformationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationInformationList() {
		return organizationInformationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getOrganizationInformationList() <em>organizationInformationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getOrganizationInformationList() organizationInformationList}' feature.
	 * @generated
	 */
	public void setOrganizationInformationList(
			ReferenceType newOrganizationInformationList) {
		organizationInformationList = newOrganizationInformationList;
	}

	/**
	 * Returns the value of '<em><b>projectLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectLineList() {
		return projectLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getProjectLineList() <em>projectLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getProjectLineList() projectLineList}' feature.
	 * @generated
	 */
	public void setProjectLineList(ReferenceType newProjectLineList) {
		projectLineList = newProjectLineList;
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtTaxRateType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#isReference() reference}' feature.
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
	public List<FinancialMgmtTaxRateTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtTaxRateType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtTaxRateType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtTaxRateTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtTaxRateType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
