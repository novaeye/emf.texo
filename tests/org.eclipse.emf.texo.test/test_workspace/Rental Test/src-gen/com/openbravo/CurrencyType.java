package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CurrencyType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CurrencyType {

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
	private String iSOCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String symbol = null;

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
	private Long standardPrecision = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long costingPrecision = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long pricePrecision = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean currencySymbolAtTheRight = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDClientList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDRoleList = null;

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
	private ReferenceType aPRMFinaccTransactionVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinaccTransactionVForeignCurrencyIDList = null;

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
	private ReferenceType approvedVendorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType countryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyConversionRateListType currencyConversionRateList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType currencyConversionRateToCurrencyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType currencyConversionRateDocList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType currencyConversionRateDocToCurrencyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyTrlListType currencyTrlList = null;

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
	private ReferenceType fINFinaccTransactionForeignCurrencyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountList = null;

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
	private ReferenceType fINPaymentCreditList = null;

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
	private ReferenceType fINPaymentDetailVFinaccCurrencyIDList = null;

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
	private ReferenceType fINReconciliationLineVList = null;

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
	private ReferenceType financialMgmtAcctSchemaList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAmortizationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAmortizationLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetList = null;

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
	private ReferenceType financialMgmtBudgetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtCashBookList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDPManagementList = null;

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
	private ReferenceType financialMgmtElementValueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLBatchList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLJournalList = null;

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
	private ReferenceType financialMgmtSettlementList = null;

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
	private ReferenceType invoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutFreightCurrencyList = null;

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
	private ReferenceType orderLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organizationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pricingPriceListList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pricingVolumeDiscountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementRequisitionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementRequisitionLineList = null;

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
	private ReferenceType salesCommissionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCommissionDetailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType shippingShippingCompanyFreightList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetLineVList = null;

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
	private List<CurrencyTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<CurrencyTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link CurrencyType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getId() id}' feature.
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
	 * Sets the '{@link CurrencyType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getClient() client}' feature.
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
	 * Sets the '{@link CurrencyType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getOrganization() organization}' feature.
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
	 * Sets the '{@link CurrencyType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getActive() active}' feature.
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
	 * Sets the '{@link CurrencyType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link CurrencyType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link CurrencyType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getUpdated() updated}' feature.
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
	 * Sets the '{@link CurrencyType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>iSOCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iSOCode</b></em>' feature
	 * @generated
	 */
	public String getISOCode() {
		return iSOCode;
	}

	/**
	 * Sets the '{@link CurrencyType#getISOCode() <em>iSOCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getISOCode() iSOCode}' feature.
	 * @generated
	 */
	public void setISOCode(String newISOCode) {
		iSOCode = newISOCode;
	}

	/**
	 * Returns the value of '<em><b>symbol</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>symbol</b></em>' feature
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Sets the '{@link CurrencyType#getSymbol() <em>symbol</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getSymbol() symbol}' feature.
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		symbol = newSymbol;
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
	 * Sets the '{@link CurrencyType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>standardPrecision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>standardPrecision</b></em>' feature
	 * @generated
	 */
	public Long getStandardPrecision() {
		return standardPrecision;
	}

	/**
	 * Sets the '{@link CurrencyType#getStandardPrecision() <em>standardPrecision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getStandardPrecision() standardPrecision}' feature.
	 * @generated
	 */
	public void setStandardPrecision(Long newStandardPrecision) {
		standardPrecision = newStandardPrecision;
	}

	/**
	 * Returns the value of '<em><b>costingPrecision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costingPrecision</b></em>' feature
	 * @generated
	 */
	public Long getCostingPrecision() {
		return costingPrecision;
	}

	/**
	 * Sets the '{@link CurrencyType#getCostingPrecision() <em>costingPrecision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCostingPrecision() costingPrecision}' feature.
	 * @generated
	 */
	public void setCostingPrecision(Long newCostingPrecision) {
		costingPrecision = newCostingPrecision;
	}

	/**
	 * Returns the value of '<em><b>pricePrecision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricePrecision</b></em>' feature
	 * @generated
	 */
	public Long getPricePrecision() {
		return pricePrecision;
	}

	/**
	 * Sets the '{@link CurrencyType#getPricePrecision() <em>pricePrecision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getPricePrecision() pricePrecision}' feature.
	 * @generated
	 */
	public void setPricePrecision(Long newPricePrecision) {
		pricePrecision = newPricePrecision;
	}

	/**
	 * Returns the value of '<em><b>currencySymbolAtTheRight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencySymbolAtTheRight</b></em>' feature
	 * @generated
	 */
	public Boolean getCurrencySymbolAtTheRight() {
		return currencySymbolAtTheRight;
	}

	/**
	 * Sets the '{@link CurrencyType#getCurrencySymbolAtTheRight() <em>currencySymbolAtTheRight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCurrencySymbolAtTheRight() currencySymbolAtTheRight}' feature.
	 * @generated
	 */
	public void setCurrencySymbolAtTheRight(Boolean newCurrencySymbolAtTheRight) {
		currencySymbolAtTheRight = newCurrencySymbolAtTheRight;
	}

	/**
	 * Returns the value of '<em><b>aDClientList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClientList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADClientList() {
		return aDClientList;
	}

	/**
	 * Sets the '{@link CurrencyType#getADClientList() <em>aDClientList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getADClientList() aDClientList}' feature.
	 * @generated
	 */
	public void setADClientList(ReferenceType newADClientList) {
		aDClientList = newADClientList;
	}

	/**
	 * Returns the value of '<em><b>aDRoleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRoleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADRoleList() {
		return aDRoleList;
	}

	/**
	 * Sets the '{@link CurrencyType#getADRoleList() <em>aDRoleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getADRoleList() aDRoleList}' feature.
	 * @generated
	 */
	public void setADRoleList(ReferenceType newADRoleList) {
		aDRoleList = newADRoleList;
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
	 * Sets the '{@link CurrencyType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVList(
			ReferenceType newAPRMFinAccTransactionAcctVList) {
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
	 * Sets the '{@link CurrencyType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVList(
			ReferenceType newAPRMFinaccTransactionVList) {
		aPRMFinaccTransactionVList = newAPRMFinaccTransactionVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionVForeignCurrencyIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionVForeignCurrencyIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTransactionVForeignCurrencyIDList() {
		return aPRMFinaccTransactionVForeignCurrencyIDList;
	}

	/**
	 * Sets the '{@link CurrencyType#getAPRMFinaccTransactionVForeignCurrencyIDList() <em>aPRMFinaccTransactionVForeignCurrencyIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getAPRMFinaccTransactionVForeignCurrencyIDList() aPRMFinaccTransactionVForeignCurrencyIDList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVForeignCurrencyIDList(
			ReferenceType newAPRMFinaccTransactionVForeignCurrencyIDList) {
		aPRMFinaccTransactionVForeignCurrencyIDList = newAPRMFinaccTransactionVForeignCurrencyIDList;
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
	 * Sets the '{@link CurrencyType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>approvedVendorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getApprovedVendorList() {
		return approvedVendorList;
	}

	/**
	 * Sets the '{@link CurrencyType#getApprovedVendorList() <em>approvedVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getApprovedVendorList() approvedVendorList}' feature.
	 * @generated
	 */
	public void setApprovedVendorList(ReferenceType newApprovedVendorList) {
		approvedVendorList = newApprovedVendorList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountList() {
		return bankAccountList;
	}

	/**
	 * Sets the '{@link CurrencyType#getBankAccountList() <em>bankAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getBankAccountList() bankAccountList}' feature.
	 * @generated
	 */
	public void setBankAccountList(ReferenceType newBankAccountList) {
		bankAccountList = newBankAccountList;
	}

	/**
	 * Returns the value of '<em><b>countryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>countryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCountryList() {
		return countryList;
	}

	/**
	 * Sets the '{@link CurrencyType#getCountryList() <em>countryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCountryList() countryList}' feature.
	 * @generated
	 */
	public void setCountryList(ReferenceType newCountryList) {
		countryList = newCountryList;
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateList</b></em>' feature
	 * @generated
	 */
	public CurrencyConversionRateListType getCurrencyConversionRateList() {
		return currencyConversionRateList;
	}

	/**
	 * Sets the '{@link CurrencyType#getCurrencyConversionRateList() <em>currencyConversionRateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCurrencyConversionRateList() currencyConversionRateList}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateList(
			CurrencyConversionRateListType newCurrencyConversionRateList) {
		currencyConversionRateList = newCurrencyConversionRateList;
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateToCurrencyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateToCurrencyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCurrencyConversionRateToCurrencyList() {
		return currencyConversionRateToCurrencyList;
	}

	/**
	 * Sets the '{@link CurrencyType#getCurrencyConversionRateToCurrencyList() <em>currencyConversionRateToCurrencyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCurrencyConversionRateToCurrencyList() currencyConversionRateToCurrencyList}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateToCurrencyList(
			ReferenceType newCurrencyConversionRateToCurrencyList) {
		currencyConversionRateToCurrencyList = newCurrencyConversionRateToCurrencyList;
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateDocList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDocList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCurrencyConversionRateDocList() {
		return currencyConversionRateDocList;
	}

	/**
	 * Sets the '{@link CurrencyType#getCurrencyConversionRateDocList() <em>currencyConversionRateDocList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCurrencyConversionRateDocList() currencyConversionRateDocList}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDocList(
			ReferenceType newCurrencyConversionRateDocList) {
		currencyConversionRateDocList = newCurrencyConversionRateDocList;
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateDocToCurrencyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDocToCurrencyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCurrencyConversionRateDocToCurrencyList() {
		return currencyConversionRateDocToCurrencyList;
	}

	/**
	 * Sets the '{@link CurrencyType#getCurrencyConversionRateDocToCurrencyList() <em>currencyConversionRateDocToCurrencyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCurrencyConversionRateDocToCurrencyList() currencyConversionRateDocToCurrencyList}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDocToCurrencyList(
			ReferenceType newCurrencyConversionRateDocToCurrencyList) {
		currencyConversionRateDocToCurrencyList = newCurrencyConversionRateDocToCurrencyList;
	}

	/**
	 * Returns the value of '<em><b>currencyTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyTrlList</b></em>' feature
	 * @generated
	 */
	public CurrencyTrlListType getCurrencyTrlList() {
		return currencyTrlList;
	}

	/**
	 * Sets the '{@link CurrencyType#getCurrencyTrlList() <em>currencyTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getCurrencyTrlList() currencyTrlList}' feature.
	 * @generated
	 */
	public void setCurrencyTrlList(CurrencyTrlListType newCurrencyTrlList) {
		currencyTrlList = newCurrencyTrlList;
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
	 * Sets the '{@link CurrencyType#getFINFinaccTransactionList() <em>fINFinaccTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINFinaccTransactionList() fINFinaccTransactionList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionList(
			ReferenceType newFINFinaccTransactionList) {
		fINFinaccTransactionList = newFINFinaccTransactionList;
	}

	/**
	 * Returns the value of '<em><b>fINFinaccTransactionForeignCurrencyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransactionForeignCurrencyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinaccTransactionForeignCurrencyList() {
		return fINFinaccTransactionForeignCurrencyList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFINFinaccTransactionForeignCurrencyList() <em>fINFinaccTransactionForeignCurrencyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINFinaccTransactionForeignCurrencyList() fINFinaccTransactionForeignCurrencyList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionForeignCurrencyList(
			ReferenceType newFINFinaccTransactionForeignCurrencyList) {
		fINFinaccTransactionForeignCurrencyList = newFINFinaccTransactionForeignCurrencyList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountList() {
		return fINFinancialAccountList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFINFinancialAccountList() <em>fINFinancialAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINFinancialAccountList() fINFinancialAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountList(
			ReferenceType newFINFinancialAccountList) {
		fINFinancialAccountList = newFINFinancialAccountList;
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
	 * Sets the '{@link CurrencyType#getFINPaymentList() <em>fINPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentList() fINPaymentList}' feature.
	 * @generated
	 */
	public void setFINPaymentList(ReferenceType newFINPaymentList) {
		fINPaymentList = newFINPaymentList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentCreditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentCreditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentCreditList() {
		return fINPaymentCreditList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFINPaymentCreditList() <em>fINPaymentCreditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentCreditList() fINPaymentCreditList}' feature.
	 * @generated
	 */
	public void setFINPaymentCreditList(ReferenceType newFINPaymentCreditList) {
		fINPaymentCreditList = newFINPaymentCreditList;
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
	 * Sets the '{@link CurrencyType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(ReferenceType newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailVFinaccCurrencyIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailVFinaccCurrencyIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentDetailVFinaccCurrencyIDList() {
		return fINPaymentDetailVFinaccCurrencyIDList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFINPaymentDetailVFinaccCurrencyIDList() <em>fINPaymentDetailVFinaccCurrencyIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentDetailVFinaccCurrencyIDList() fINPaymentDetailVFinaccCurrencyIDList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVFinaccCurrencyIDList(
			ReferenceType newFINPaymentDetailVFinaccCurrencyIDList) {
		fINPaymentDetailVFinaccCurrencyIDList = newFINPaymentDetailVFinaccCurrencyIDList;
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
	 * Sets the '{@link CurrencyType#getFINPaymentProposalList() <em>fINPaymentProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentProposalList() fINPaymentProposalList}' feature.
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
	 * Sets the '{@link CurrencyType#getFINPaymentSchedInvVList() <em>fINPaymentSchedInvVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentSchedInvVList() fINPaymentSchedInvVList}' feature.
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
	 * Sets the '{@link CurrencyType#getFINPaymentSchedOrdVList() <em>fINPaymentSchedOrdVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentSchedOrdVList() fINPaymentSchedOrdVList}' feature.
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
	 * Sets the '{@link CurrencyType#getFINPaymentScheduleList() <em>fINPaymentScheduleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINPaymentScheduleList() fINPaymentScheduleList}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleList(
			ReferenceType newFINPaymentScheduleList) {
		fINPaymentScheduleList = newFINPaymentScheduleList;
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
	 * Sets the '{@link CurrencyType#getFINReconciliationLineVList() <em>fINReconciliationLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFINReconciliationLineVList() fINReconciliationLineVList}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineVList(
			ReferenceType newFINReconciliationLineVList) {
		fINReconciliationLineVList = newFINReconciliationLineVList;
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaList() {
		return financialMgmtAcctSchemaList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtAcctSchemaList() <em>financialMgmtAcctSchemaList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtAcctSchemaList() financialMgmtAcctSchemaList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaList(
			ReferenceType newFinancialMgmtAcctSchemaList) {
		financialMgmtAcctSchemaList = newFinancialMgmtAcctSchemaList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortizationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAmortizationList() {
		return financialMgmtAmortizationList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtAmortizationList() <em>financialMgmtAmortizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtAmortizationList() financialMgmtAmortizationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortizationList(
			ReferenceType newFinancialMgmtAmortizationList) {
		financialMgmtAmortizationList = newFinancialMgmtAmortizationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortizationLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortizationLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAmortizationLineList() {
		return financialMgmtAmortizationLineList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtAmortizationLineList() <em>financialMgmtAmortizationLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtAmortizationLineList() financialMgmtAmortizationLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortizationLineList(
			ReferenceType newFinancialMgmtAmortizationLineList) {
		financialMgmtAmortizationLineList = newFinancialMgmtAmortizationLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetList() {
		return financialMgmtAssetList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtAssetList() <em>financialMgmtAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtAssetList() financialMgmtAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetList(
			ReferenceType newFinancialMgmtAssetList) {
		financialMgmtAssetList = newFinancialMgmtAssetList;
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtBankStatementLineList() <em>financialMgmtBankStatementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtBankStatementLineList() financialMgmtBankStatementLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatementLineList(
			ReferenceType newFinancialMgmtBankStatementLineList) {
		financialMgmtBankStatementLineList = newFinancialMgmtBankStatementLineList;
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashBookList() {
		return financialMgmtCashBookList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtCashBookList() <em>financialMgmtCashBookList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtCashBookList() financialMgmtCashBookList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookList(
			ReferenceType newFinancialMgmtCashBookList) {
		financialMgmtCashBookList = newFinancialMgmtCashBookList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDPManagementList() {
		return financialMgmtDPManagementList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtDPManagementList() <em>financialMgmtDPManagementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtDPManagementList() financialMgmtDPManagementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagementList(
			ReferenceType newFinancialMgmtDPManagementList) {
		financialMgmtDPManagementList = newFinancialMgmtDPManagementList;
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtDebtPaymentCancelVList() <em>financialMgmtDebtPaymentCancelVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtDebtPaymentCancelVList() financialMgmtDebtPaymentCancelVList}' feature.
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVList(
			ReferenceType newFinancialMgmtDebtPaymentGenerateVList) {
		financialMgmtDebtPaymentGenerateVList = newFinancialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtElementValueList() {
		return financialMgmtElementValueList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtElementValueList() <em>financialMgmtElementValueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtElementValueList() financialMgmtElementValueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueList(
			ReferenceType newFinancialMgmtElementValueList) {
		financialMgmtElementValueList = newFinancialMgmtElementValueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLBatchList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLBatchList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLBatchList() {
		return financialMgmtGLBatchList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtGLBatchList() <em>financialMgmtGLBatchList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtGLBatchList() financialMgmtGLBatchList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLBatchList(
			ReferenceType newFinancialMgmtGLBatchList) {
		financialMgmtGLBatchList = newFinancialMgmtGLBatchList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLJournalList() {
		return financialMgmtGLJournalList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtGLJournalList() <em>financialMgmtGLJournalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtGLJournalList() financialMgmtGLJournalList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalList(
			ReferenceType newFinancialMgmtGLJournalList) {
		financialMgmtGLJournalList = newFinancialMgmtGLJournalList;
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtJournalLineList() <em>financialMgmtJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtJournalLineList() financialMgmtJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtJournalLineList(
			ReferenceType newFinancialMgmtJournalLineList) {
		financialMgmtJournalLineList = newFinancialMgmtJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtSettlementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtSettlementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtSettlementList() {
		return financialMgmtSettlementList;
	}

	/**
	 * Sets the '{@link CurrencyType#getFinancialMgmtSettlementList() <em>financialMgmtSettlementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtSettlementList() financialMgmtSettlementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtSettlementList(
			ReferenceType newFinancialMgmtSettlementList) {
		financialMgmtSettlementList = newFinancialMgmtSettlementList;
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
	 * Sets the '{@link CurrencyType#getFinancialMgmtTaxPaymentList() <em>financialMgmtTaxPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getFinancialMgmtTaxPaymentList() financialMgmtTaxPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPaymentList(
			ReferenceType newFinancialMgmtTaxPaymentList) {
		financialMgmtTaxPaymentList = newFinancialMgmtTaxPaymentList;
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
	 * Sets the '{@link CurrencyType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(ReferenceType newInvoiceList) {
		invoiceList = newInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutFreightCurrencyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutFreightCurrencyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutFreightCurrencyList() {
		return materialMgmtShipmentInOutFreightCurrencyList;
	}

	/**
	 * Sets the '{@link CurrencyType#getMaterialMgmtShipmentInOutFreightCurrencyList() <em>materialMgmtShipmentInOutFreightCurrencyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getMaterialMgmtShipmentInOutFreightCurrencyList() materialMgmtShipmentInOutFreightCurrencyList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutFreightCurrencyList(
			ReferenceType newMaterialMgmtShipmentInOutFreightCurrencyList) {
		materialMgmtShipmentInOutFreightCurrencyList = newMaterialMgmtShipmentInOutFreightCurrencyList;
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
	 * Sets the '{@link CurrencyType#getOrderList() <em>orderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getOrderList() orderList}' feature.
	 * @generated
	 */
	public void setOrderList(ReferenceType newOrderList) {
		orderList = newOrderList;
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
	 * Sets the '{@link CurrencyType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>organizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationList() {
		return organizationList;
	}

	/**
	 * Sets the '{@link CurrencyType#getOrganizationList() <em>organizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getOrganizationList() organizationList}' feature.
	 * @generated
	 */
	public void setOrganizationList(ReferenceType newOrganizationList) {
		organizationList = newOrganizationList;
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingPriceListList() {
		return pricingPriceListList;
	}

	/**
	 * Sets the '{@link CurrencyType#getPricingPriceListList() <em>pricingPriceListList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getPricingPriceListList() pricingPriceListList}' feature.
	 * @generated
	 */
	public void setPricingPriceListList(ReferenceType newPricingPriceListList) {
		pricingPriceListList = newPricingPriceListList;
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingVolumeDiscountList() {
		return pricingVolumeDiscountList;
	}

	/**
	 * Sets the '{@link CurrencyType#getPricingVolumeDiscountList() <em>pricingVolumeDiscountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getPricingVolumeDiscountList() pricingVolumeDiscountList}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountList(
			ReferenceType newPricingVolumeDiscountList) {
		pricingVolumeDiscountList = newPricingVolumeDiscountList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionList() {
		return procurementRequisitionList;
	}

	/**
	 * Sets the '{@link CurrencyType#getProcurementRequisitionList() <em>procurementRequisitionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getProcurementRequisitionList() procurementRequisitionList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionList(
			ReferenceType newProcurementRequisitionList) {
		procurementRequisitionList = newProcurementRequisitionList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionLineList() {
		return procurementRequisitionLineList;
	}

	/**
	 * Sets the '{@link CurrencyType#getProcurementRequisitionLineList() <em>procurementRequisitionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getProcurementRequisitionLineList() procurementRequisitionLineList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLineList(
			ReferenceType newProcurementRequisitionLineList) {
		procurementRequisitionLineList = newProcurementRequisitionLineList;
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
	 * Sets the '{@link CurrencyType#getProjectList() <em>projectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getProjectList() projectList}' feature.
	 * @generated
	 */
	public void setProjectList(ReferenceType newProjectList) {
		projectList = newProjectList;
	}

	/**
	 * Returns the value of '<em><b>salesCommissionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCommissionList() {
		return salesCommissionList;
	}

	/**
	 * Sets the '{@link CurrencyType#getSalesCommissionList() <em>salesCommissionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getSalesCommissionList() salesCommissionList}' feature.
	 * @generated
	 */
	public void setSalesCommissionList(ReferenceType newSalesCommissionList) {
		salesCommissionList = newSalesCommissionList;
	}

	/**
	 * Returns the value of '<em><b>salesCommissionDetailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionDetailList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCommissionDetailList() {
		return salesCommissionDetailList;
	}

	/**
	 * Sets the '{@link CurrencyType#getSalesCommissionDetailList() <em>salesCommissionDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getSalesCommissionDetailList() salesCommissionDetailList}' feature.
	 * @generated
	 */
	public void setSalesCommissionDetailList(
			ReferenceType newSalesCommissionDetailList) {
		salesCommissionDetailList = newSalesCommissionDetailList;
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyFreightList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyFreightList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getShippingShippingCompanyFreightList() {
		return shippingShippingCompanyFreightList;
	}

	/**
	 * Sets the '{@link CurrencyType#getShippingShippingCompanyFreightList() <em>shippingShippingCompanyFreightList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getShippingShippingCompanyFreightList() shippingShippingCompanyFreightList}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyFreightList(
			ReferenceType newShippingShippingCompanyFreightList) {
		shippingShippingCompanyFreightList = newShippingShippingCompanyFreightList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineList() {
		return timeAndExpenseSheetLineList;
	}

	/**
	 * Sets the '{@link CurrencyType#getTimeAndExpenseSheetLineList() <em>timeAndExpenseSheetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getTimeAndExpenseSheetLineList() timeAndExpenseSheetLineList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineList(
			ReferenceType newTimeAndExpenseSheetLineList) {
		timeAndExpenseSheetLineList = newTimeAndExpenseSheetLineList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineVList() {
		return timeAndExpenseSheetLineVList;
	}

	/**
	 * Sets the '{@link CurrencyType#getTimeAndExpenseSheetLineVList() <em>timeAndExpenseSheetLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getTimeAndExpenseSheetLineVList() timeAndExpenseSheetLineVList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineVList(
			ReferenceType newTimeAndExpenseSheetLineVList) {
		timeAndExpenseSheetLineVList = newTimeAndExpenseSheetLineVList;
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
	 * Sets the '{@link CurrencyType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getId1() id1}' feature.
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
	 * Sets the '{@link CurrencyType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link CurrencyType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#isReference() reference}' feature.
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
	public List<CurrencyTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link CurrencyType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CurrencyType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<CurrencyTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "CurrencyType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
