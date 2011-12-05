package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAcctSchemaType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAcctSchemaType {

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
	private String gAAP = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean accrual = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String costingMethod = null;

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
	private Boolean automaticPeriodControl = null;

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
	private Long historyDays = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long futureDays = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String storageBinSeparator = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean useAccountAlias = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean useAccountCombinationControl = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean postTradeDiscount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean correctTaxForDiscountsCharges = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean allowNegative = null;

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
	private APRMFinaccTrxFullAcctVListType aPRMFinaccTrxFullAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BankAccountAccountsListType bankAccountAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerCategoryAccountListType businessPartnerCategoryAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CAcctSchemaProcessListType cAcctSchemaProcessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryAccountingSchemaList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationSecondAccountingSchemaList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationThirdAccountingSchemaList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CustomerAccountsListType customerAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmployeeAccountsListType employeeAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINFinancialAccountAcctListType fINFinancialAccountAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingCombinationList = null;

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
	private ReferenceType financialMgmtAccountingReportList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingRptElementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaDefaultListType financialMgmtAcctSchemaDefaultList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaElementListType financialMgmtAcctSchemaElementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaGLListType financialMgmtAcctSchemaGLList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaTableListType financialMgmtAcctSchemaTableList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAssetAccountsListType financialMgmtAssetAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAssetGroupAcctListType1 financialMgmtAssetGroupAcctList = null;

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
	private FinancialMgmtCashBookAccountsListType1 financialMgmtCashBookAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLChargeAccountsListType1 financialMgmtGLChargeAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLItemAccountsListType1 financialMgmtGLItemAccountsList = null;

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
	private ReferenceType financialMgmtTaxPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRateAccountsListType1 financialMgmtTaxRateAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtWithholdingAccountsListType1 financialMgmtWithholdingAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationAcctSchemaListType organizationAcctSchemaList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductAccountsListType1 productAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductCategoryAccountsListType1 productCategoryAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private VendorAccountsListType vendorAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseAccountsListType1 warehouseAccountsList = null;

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
	private List<FinancialMgmtAcctSchemaTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtAcctSchemaTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getName() name}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>gAAP</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>gAAP</b></em>' feature
	 * @generated
	 */
	public String getGAAP() {
		return gAAP;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getGAAP() <em>gAAP</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getGAAP() gAAP}' feature.
	 * @generated
	 */
	public void setGAAP(String newGAAP) {
		gAAP = newGAAP;
	}

	/**
	 * Returns the value of '<em><b>accrual</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accrual</b></em>' feature
	 * @generated
	 */
	public Boolean getAccrual() {
		return accrual;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getAccrual() <em>accrual</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getAccrual() accrual}' feature.
	 * @generated
	 */
	public void setAccrual(Boolean newAccrual) {
		accrual = newAccrual;
	}

	/**
	 * Returns the value of '<em><b>costingMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costingMethod</b></em>' feature
	 * @generated
	 */
	public String getCostingMethod() {
		return costingMethod;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCostingMethod() <em>costingMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCostingMethod() costingMethod}' feature.
	 * @generated
	 */
	public void setCostingMethod(String newCostingMethod) {
		costingMethod = newCostingMethod;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>automaticPeriodControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>automaticPeriodControl</b></em>' feature
	 * @generated
	 */
	public Boolean getAutomaticPeriodControl() {
		return automaticPeriodControl;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getAutomaticPeriodControl() <em>automaticPeriodControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getAutomaticPeriodControl() automaticPeriodControl}' feature.
	 * @generated
	 */
	public void setAutomaticPeriodControl(Boolean newAutomaticPeriodControl) {
		automaticPeriodControl = newAutomaticPeriodControl;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getPeriod() <em>period</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getPeriod() period}' feature.
	 * @generated
	 */
	public void setPeriod(ReferenceType newPeriod) {
		period = newPeriod;
	}

	/**
	 * Returns the value of '<em><b>historyDays</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>historyDays</b></em>' feature
	 * @generated
	 */
	public Long getHistoryDays() {
		return historyDays;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getHistoryDays() <em>historyDays</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getHistoryDays() historyDays}' feature.
	 * @generated
	 */
	public void setHistoryDays(Long newHistoryDays) {
		historyDays = newHistoryDays;
	}

	/**
	 * Returns the value of '<em><b>futureDays</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>futureDays</b></em>' feature
	 * @generated
	 */
	public Long getFutureDays() {
		return futureDays;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFutureDays() <em>futureDays</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFutureDays() futureDays}' feature.
	 * @generated
	 */
	public void setFutureDays(Long newFutureDays) {
		futureDays = newFutureDays;
	}

	/**
	 * Returns the value of '<em><b>storageBinSeparator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>storageBinSeparator</b></em>' feature
	 * @generated
	 */
	public String getStorageBinSeparator() {
		return storageBinSeparator;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getStorageBinSeparator() <em>storageBinSeparator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getStorageBinSeparator() storageBinSeparator}' feature.
	 * @generated
	 */
	public void setStorageBinSeparator(String newStorageBinSeparator) {
		storageBinSeparator = newStorageBinSeparator;
	}

	/**
	 * Returns the value of '<em><b>useAccountAlias</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>useAccountAlias</b></em>' feature
	 * @generated
	 */
	public Boolean getUseAccountAlias() {
		return useAccountAlias;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getUseAccountAlias() <em>useAccountAlias</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getUseAccountAlias() useAccountAlias}' feature.
	 * @generated
	 */
	public void setUseAccountAlias(Boolean newUseAccountAlias) {
		useAccountAlias = newUseAccountAlias;
	}

	/**
	 * Returns the value of '<em><b>useAccountCombinationControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>useAccountCombinationControl</b></em>' feature
	 * @generated
	 */
	public Boolean getUseAccountCombinationControl() {
		return useAccountCombinationControl;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getUseAccountCombinationControl() <em>useAccountCombinationControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getUseAccountCombinationControl() useAccountCombinationControl}' feature.
	 * @generated
	 */
	public void setUseAccountCombinationControl(
			Boolean newUseAccountCombinationControl) {
		useAccountCombinationControl = newUseAccountCombinationControl;
	}

	/**
	 * Returns the value of '<em><b>postTradeDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postTradeDiscount</b></em>' feature
	 * @generated
	 */
	public Boolean getPostTradeDiscount() {
		return postTradeDiscount;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getPostTradeDiscount() <em>postTradeDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getPostTradeDiscount() postTradeDiscount}' feature.
	 * @generated
	 */
	public void setPostTradeDiscount(Boolean newPostTradeDiscount) {
		postTradeDiscount = newPostTradeDiscount;
	}

	/**
	 * Returns the value of '<em><b>correctTaxForDiscountsCharges</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>correctTaxForDiscountsCharges</b></em>' feature
	 * @generated
	 */
	public Boolean getCorrectTaxForDiscountsCharges() {
		return correctTaxForDiscountsCharges;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCorrectTaxForDiscountsCharges() <em>correctTaxForDiscountsCharges</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCorrectTaxForDiscountsCharges() correctTaxForDiscountsCharges}' feature.
	 * @generated
	 */
	public void setCorrectTaxForDiscountsCharges(
			Boolean newCorrectTaxForDiscountsCharges) {
		correctTaxForDiscountsCharges = newCorrectTaxForDiscountsCharges;
	}

	/**
	 * Returns the value of '<em><b>allowNegative</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>allowNegative</b></em>' feature
	 * @generated
	 */
	public Boolean getAllowNegative() {
		return allowNegative;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getAllowNegative() <em>allowNegative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getAllowNegative() allowNegative}' feature.
	 * @generated
	 */
	public void setAllowNegative(Boolean newAllowNegative) {
		allowNegative = newAllowNegative;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	public APRMFinaccTrxFullAcctVListType getAPRMFinaccTrxFullAcctVList() {
		return aPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			APRMFinaccTrxFullAcctVListType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsList</b></em>' feature
	 * @generated
	 */
	public BankAccountAccountsListType getBankAccountAccountsList() {
		return bankAccountAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getBankAccountAccountsList() <em>bankAccountAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getBankAccountAccountsList() bankAccountAccountsList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsList(
			BankAccountAccountsListType newBankAccountAccountsList) {
		bankAccountAccountsList = newBankAccountAccountsList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountList</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerCategoryAccountListType getBusinessPartnerCategoryAccountList() {
		return businessPartnerCategoryAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getBusinessPartnerCategoryAccountList() <em>businessPartnerCategoryAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getBusinessPartnerCategoryAccountList() businessPartnerCategoryAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountList(
			BusinessPartnerCategoryAccountListType newBusinessPartnerCategoryAccountList) {
		businessPartnerCategoryAccountList = newBusinessPartnerCategoryAccountList;
	}

	/**
	 * Returns the value of '<em><b>cAcctSchemaProcessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cAcctSchemaProcessList</b></em>' feature
	 * @generated
	 */
	public CAcctSchemaProcessListType getCAcctSchemaProcessList() {
		return cAcctSchemaProcessList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCAcctSchemaProcessList() <em>cAcctSchemaProcessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCAcctSchemaProcessList() cAcctSchemaProcessList}' feature.
	 * @generated
	 */
	public void setCAcctSchemaProcessList(
			CAcctSchemaProcessListType newCAcctSchemaProcessList) {
		cAcctSchemaProcessList = newCAcctSchemaProcessList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryAccountingSchemaList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryAccountingSchemaList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryAccountingSchemaList() {
		return clientInformationPrimaryAccountingSchemaList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getClientInformationPrimaryAccountingSchemaList() <em>clientInformationPrimaryAccountingSchemaList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getClientInformationPrimaryAccountingSchemaList() clientInformationPrimaryAccountingSchemaList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryAccountingSchemaList(
			ReferenceType newClientInformationPrimaryAccountingSchemaList) {
		clientInformationPrimaryAccountingSchemaList = newClientInformationPrimaryAccountingSchemaList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationSecondAccountingSchemaList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationSecondAccountingSchemaList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationSecondAccountingSchemaList() {
		return clientInformationSecondAccountingSchemaList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getClientInformationSecondAccountingSchemaList() <em>clientInformationSecondAccountingSchemaList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getClientInformationSecondAccountingSchemaList() clientInformationSecondAccountingSchemaList}' feature.
	 * @generated
	 */
	public void setClientInformationSecondAccountingSchemaList(
			ReferenceType newClientInformationSecondAccountingSchemaList) {
		clientInformationSecondAccountingSchemaList = newClientInformationSecondAccountingSchemaList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationThirdAccountingSchemaList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationThirdAccountingSchemaList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationThirdAccountingSchemaList() {
		return clientInformationThirdAccountingSchemaList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getClientInformationThirdAccountingSchemaList() <em>clientInformationThirdAccountingSchemaList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getClientInformationThirdAccountingSchemaList() clientInformationThirdAccountingSchemaList}' feature.
	 * @generated
	 */
	public void setClientInformationThirdAccountingSchemaList(
			ReferenceType newClientInformationThirdAccountingSchemaList) {
		clientInformationThirdAccountingSchemaList = newClientInformationThirdAccountingSchemaList;
	}

	/**
	 * Returns the value of '<em><b>customerAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccountsList</b></em>' feature
	 * @generated
	 */
	public CustomerAccountsListType getCustomerAccountsList() {
		return customerAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getCustomerAccountsList() <em>customerAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getCustomerAccountsList() customerAccountsList}' feature.
	 * @generated
	 */
	public void setCustomerAccountsList(
			CustomerAccountsListType newCustomerAccountsList) {
		customerAccountsList = newCustomerAccountsList;
	}

	/**
	 * Returns the value of '<em><b>employeeAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccountsList</b></em>' feature
	 * @generated
	 */
	public EmployeeAccountsListType getEmployeeAccountsList() {
		return employeeAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getEmployeeAccountsList() <em>employeeAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getEmployeeAccountsList() employeeAccountsList}' feature.
	 * @generated
	 */
	public void setEmployeeAccountsList(
			EmployeeAccountsListType newEmployeeAccountsList) {
		employeeAccountsList = newEmployeeAccountsList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctList</b></em>' feature
	 * @generated
	 */
	public FINFinancialAccountAcctListType getFINFinancialAccountAcctList() {
		return fINFinancialAccountAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFINFinancialAccountAcctList() <em>fINFinancialAccountAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFINFinancialAccountAcctList() fINFinancialAccountAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctList(
			FINFinancialAccountAcctListType newFINFinancialAccountAcctList) {
		fINFinancialAccountAcctList = newFINFinancialAccountAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombinationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombinationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingCombinationList() {
		return financialMgmtAccountingCombinationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingCombinationList() <em>financialMgmtAccountingCombinationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingCombinationList() financialMgmtAccountingCombinationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombinationList(
			ReferenceType newFinancialMgmtAccountingCombinationList) {
		financialMgmtAccountingCombinationList = newFinancialMgmtAccountingCombinationList;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingReportList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingReportList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingReportList() {
		return financialMgmtAccountingReportList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingReportList() <em>financialMgmtAccountingReportList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingReportList() financialMgmtAccountingReportList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingReportList(
			ReferenceType newFinancialMgmtAccountingReportList) {
		financialMgmtAccountingReportList = newFinancialMgmtAccountingReportList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingRptElementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingRptElementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingRptElementList() {
		return financialMgmtAccountingRptElementList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingRptElementList() <em>financialMgmtAccountingRptElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAccountingRptElementList() financialMgmtAccountingRptElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingRptElementList(
			ReferenceType newFinancialMgmtAccountingRptElementList) {
		financialMgmtAccountingRptElementList = newFinancialMgmtAccountingRptElementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaDefaultListType getFinancialMgmtAcctSchemaDefaultList() {
		return financialMgmtAcctSchemaDefaultList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaDefaultList() <em>financialMgmtAcctSchemaDefaultList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaDefaultList() financialMgmtAcctSchemaDefaultList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultList(
			FinancialMgmtAcctSchemaDefaultListType newFinancialMgmtAcctSchemaDefaultList) {
		financialMgmtAcctSchemaDefaultList = newFinancialMgmtAcctSchemaDefaultList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaElementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaElementList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaElementListType getFinancialMgmtAcctSchemaElementList() {
		return financialMgmtAcctSchemaElementList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaElementList() <em>financialMgmtAcctSchemaElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaElementList() financialMgmtAcctSchemaElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElementList(
			FinancialMgmtAcctSchemaElementListType newFinancialMgmtAcctSchemaElementList) {
		financialMgmtAcctSchemaElementList = newFinancialMgmtAcctSchemaElementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaGLListType getFinancialMgmtAcctSchemaGLList() {
		return financialMgmtAcctSchemaGLList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaGLList() <em>financialMgmtAcctSchemaGLList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaGLList() financialMgmtAcctSchemaGLList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLList(
			FinancialMgmtAcctSchemaGLListType newFinancialMgmtAcctSchemaGLList) {
		financialMgmtAcctSchemaGLList = newFinancialMgmtAcctSchemaGLList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaTableList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaTableList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaTableListType getFinancialMgmtAcctSchemaTableList() {
		return financialMgmtAcctSchemaTableList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaTableList() <em>financialMgmtAcctSchemaTableList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAcctSchemaTableList() financialMgmtAcctSchemaTableList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaTableList(
			FinancialMgmtAcctSchemaTableListType newFinancialMgmtAcctSchemaTableList) {
		financialMgmtAcctSchemaTableList = newFinancialMgmtAcctSchemaTableList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAssetAccountsListType getFinancialMgmtAssetAccountsList() {
		return financialMgmtAssetAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAssetAccountsList() <em>financialMgmtAssetAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAssetAccountsList() financialMgmtAssetAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccountsList(
			FinancialMgmtAssetAccountsListType newFinancialMgmtAssetAccountsList) {
		financialMgmtAssetAccountsList = newFinancialMgmtAssetAccountsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcctList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAssetGroupAcctListType1 getFinancialMgmtAssetGroupAcctList() {
		return financialMgmtAssetGroupAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAssetGroupAcctList() <em>financialMgmtAssetGroupAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtAssetGroupAcctList() financialMgmtAssetGroupAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcctList(
			FinancialMgmtAssetGroupAcctListType1 newFinancialMgmtAssetGroupAcctList) {
		financialMgmtAssetGroupAcctList = newFinancialMgmtAssetGroupAcctList;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtCashBookAccountsListType1 getFinancialMgmtCashBookAccountsList() {
		return financialMgmtCashBookAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtCashBookAccountsList() <em>financialMgmtCashBookAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtCashBookAccountsList() financialMgmtCashBookAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccountsList(
			FinancialMgmtCashBookAccountsListType1 newFinancialMgmtCashBookAccountsList) {
		financialMgmtCashBookAccountsList = newFinancialMgmtCashBookAccountsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLChargeAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLChargeAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLChargeAccountsListType1 getFinancialMgmtGLChargeAccountsList() {
		return financialMgmtGLChargeAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtGLChargeAccountsList() <em>financialMgmtGLChargeAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtGLChargeAccountsList() financialMgmtGLChargeAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLChargeAccountsList(
			FinancialMgmtGLChargeAccountsListType1 newFinancialMgmtGLChargeAccountsList) {
		financialMgmtGLChargeAccountsList = newFinancialMgmtGLChargeAccountsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLItemAccountsListType1 getFinancialMgmtGLItemAccountsList() {
		return financialMgmtGLItemAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtGLItemAccountsList() <em>financialMgmtGLItemAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtGLItemAccountsList() financialMgmtGLItemAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemAccountsList(
			FinancialMgmtGLItemAccountsListType1 newFinancialMgmtGLItemAccountsList) {
		financialMgmtGLItemAccountsList = newFinancialMgmtGLItemAccountsList;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtGLJournalList() <em>financialMgmtGLJournalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtGLJournalList() financialMgmtGLJournalList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalList(
			ReferenceType newFinancialMgmtGLJournalList) {
		financialMgmtGLJournalList = newFinancialMgmtGLJournalList;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtTaxPaymentList() <em>financialMgmtTaxPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtTaxPaymentList() financialMgmtTaxPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPaymentList(
			ReferenceType newFinancialMgmtTaxPaymentList) {
		financialMgmtTaxPaymentList = newFinancialMgmtTaxPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRateAccountsListType1 getFinancialMgmtTaxRateAccountsList() {
		return financialMgmtTaxRateAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtTaxRateAccountsList() <em>financialMgmtTaxRateAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtTaxRateAccountsList() financialMgmtTaxRateAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsList(
			FinancialMgmtTaxRateAccountsListType1 newFinancialMgmtTaxRateAccountsList) {
		financialMgmtTaxRateAccountsList = newFinancialMgmtTaxRateAccountsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingAccountsList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtWithholdingAccountsListType1 getFinancialMgmtWithholdingAccountsList() {
		return financialMgmtWithholdingAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtWithholdingAccountsList() <em>financialMgmtWithholdingAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getFinancialMgmtWithholdingAccountsList() financialMgmtWithholdingAccountsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingAccountsList(
			FinancialMgmtWithholdingAccountsListType1 newFinancialMgmtWithholdingAccountsList) {
		financialMgmtWithholdingAccountsList = newFinancialMgmtWithholdingAccountsList;
	}

	/**
	 * Returns the value of '<em><b>organizationAcctSchemaList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationAcctSchemaList</b></em>' feature
	 * @generated
	 */
	public OrganizationAcctSchemaListType getOrganizationAcctSchemaList() {
		return organizationAcctSchemaList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getOrganizationAcctSchemaList() <em>organizationAcctSchemaList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getOrganizationAcctSchemaList() organizationAcctSchemaList}' feature.
	 * @generated
	 */
	public void setOrganizationAcctSchemaList(
			OrganizationAcctSchemaListType newOrganizationAcctSchemaList) {
		organizationAcctSchemaList = newOrganizationAcctSchemaList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsList</b></em>' feature
	 * @generated
	 */
	public ProductAccountsListType1 getProductAccountsList() {
		return productAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getProductAccountsList() <em>productAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getProductAccountsList() productAccountsList}' feature.
	 * @generated
	 */
	public void setProductAccountsList(
			ProductAccountsListType1 newProductAccountsList) {
		productAccountsList = newProductAccountsList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsList</b></em>' feature
	 * @generated
	 */
	public ProductCategoryAccountsListType1 getProductCategoryAccountsList() {
		return productCategoryAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getProductCategoryAccountsList() <em>productCategoryAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getProductCategoryAccountsList() productCategoryAccountsList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsList(
			ProductCategoryAccountsListType1 newProductCategoryAccountsList) {
		productCategoryAccountsList = newProductCategoryAccountsList;
	}

	/**
	 * Returns the value of '<em><b>projectAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccountsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectAccountsList() {
		return projectAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getProjectAccountsList() <em>projectAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getProjectAccountsList() projectAccountsList}' feature.
	 * @generated
	 */
	public void setProjectAccountsList(ReferenceType newProjectAccountsList) {
		projectAccountsList = newProjectAccountsList;
	}

	/**
	 * Returns the value of '<em><b>vendorAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccountsList</b></em>' feature
	 * @generated
	 */
	public VendorAccountsListType getVendorAccountsList() {
		return vendorAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getVendorAccountsList() <em>vendorAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getVendorAccountsList() vendorAccountsList}' feature.
	 * @generated
	 */
	public void setVendorAccountsList(
			VendorAccountsListType newVendorAccountsList) {
		vendorAccountsList = newVendorAccountsList;
	}

	/**
	 * Returns the value of '<em><b>warehouseAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccountsList</b></em>' feature
	 * @generated
	 */
	public WarehouseAccountsListType1 getWarehouseAccountsList() {
		return warehouseAccountsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getWarehouseAccountsList() <em>warehouseAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getWarehouseAccountsList() warehouseAccountsList}' feature.
	 * @generated
	 */
	public void setWarehouseAccountsList(
			WarehouseAccountsListType1 newWarehouseAccountsList) {
		warehouseAccountsList = newWarehouseAccountsList;
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtAcctSchemaType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#isReference() reference}' feature.
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
	public List<FinancialMgmtAcctSchemaTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtAcctSchemaType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAcctSchemaType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtAcctSchemaTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtAcctSchemaType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
