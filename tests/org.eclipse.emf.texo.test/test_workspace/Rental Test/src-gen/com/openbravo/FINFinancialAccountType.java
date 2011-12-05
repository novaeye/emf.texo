package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINFinancialAccountType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINFinancialAccountType {

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
	private ReferenceType currency = null;

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
	private String type = null;

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
	private ReferenceType locationAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String routingNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String swiftCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String bankCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String branchCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String bankDigitcontrol = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String iNENo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String accountDigitcontrol = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String partialAccountNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String accountNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal currentBalance = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal initialBalance = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal creditLimit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String iBAN = null;

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
	private ReferenceType matchingAlgorithm = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMImportBankFile = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMMatchTransactions = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMReconcile = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean aPRMAddTransactions = null;

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
	private APRMFinaccTransactionVListType aPRMFinaccTransactionVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMFinaccTrxFullAcctVListType1 aPRMFinaccTrxFullAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMReconciliationListType aPRMReconciliationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerPOFinancialAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINBankStatementListType fINBankStatementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINFinaccTransactionListType fINFinaccTransactionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINFinancialAccountAcctListType1 fINFinancialAccountAcctList = null;

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
	private ReferenceType fINPaymentDetailVList = null;

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
	private FINReconciliationListType fINReconciliationList = null;

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
	private FinancialMgmtFinAccPaymentMethodListType1 financialMgmtFinAccPaymentMethodList = null;

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
	private List<FINFinancialAccountTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FINFinancialAccountTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FINFinancialAccountType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getId() id}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getClient() client}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
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
	 * Sets the '{@link FINFinancialAccountType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
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
	 * Sets the '{@link FINFinancialAccountType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
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
	 * Sets the '{@link FINFinancialAccountType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getName() name}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link FINFinancialAccountType#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getType() type}' feature.
	 * @generated
	 */
	public void setType(String newType) {
		type = newType;
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
	 * Sets the '{@link FINFinancialAccountType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>locationAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationAddress() {
		return locationAddress;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getLocationAddress() <em>locationAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getLocationAddress() locationAddress}' feature.
	 * @generated
	 */
	public void setLocationAddress(ReferenceType newLocationAddress) {
		locationAddress = newLocationAddress;
	}

	/**
	 * Returns the value of '<em><b>routingNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>routingNo</b></em>' feature
	 * @generated
	 */
	public String getRoutingNo() {
		return routingNo;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getRoutingNo() <em>routingNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getRoutingNo() routingNo}' feature.
	 * @generated
	 */
	public void setRoutingNo(String newRoutingNo) {
		routingNo = newRoutingNo;
	}

	/**
	 * Returns the value of '<em><b>swiftCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>swiftCode</b></em>' feature
	 * @generated
	 */
	public String getSwiftCode() {
		return swiftCode;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getSwiftCode() <em>swiftCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getSwiftCode() swiftCode}' feature.
	 * @generated
	 */
	public void setSwiftCode(String newSwiftCode) {
		swiftCode = newSwiftCode;
	}

	/**
	 * Returns the value of '<em><b>bankCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankCode</b></em>' feature
	 * @generated
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getBankCode() <em>bankCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getBankCode() bankCode}' feature.
	 * @generated
	 */
	public void setBankCode(String newBankCode) {
		bankCode = newBankCode;
	}

	/**
	 * Returns the value of '<em><b>branchCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>branchCode</b></em>' feature
	 * @generated
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getBranchCode() <em>branchCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getBranchCode() branchCode}' feature.
	 * @generated
	 */
	public void setBranchCode(String newBranchCode) {
		branchCode = newBranchCode;
	}

	/**
	 * Returns the value of '<em><b>bankDigitcontrol</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankDigitcontrol</b></em>' feature
	 * @generated
	 */
	public String getBankDigitcontrol() {
		return bankDigitcontrol;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getBankDigitcontrol() <em>bankDigitcontrol</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getBankDigitcontrol() bankDigitcontrol}' feature.
	 * @generated
	 */
	public void setBankDigitcontrol(String newBankDigitcontrol) {
		bankDigitcontrol = newBankDigitcontrol;
	}

	/**
	 * Returns the value of '<em><b>iNENo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iNENo</b></em>' feature
	 * @generated
	 */
	public String getINENo() {
		return iNENo;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getINENo() <em>iNENo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getINENo() iNENo}' feature.
	 * @generated
	 */
	public void setINENo(String newINENo) {
		iNENo = newINENo;
	}

	/**
	 * Returns the value of '<em><b>accountDigitcontrol</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountDigitcontrol</b></em>' feature
	 * @generated
	 */
	public String getAccountDigitcontrol() {
		return accountDigitcontrol;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAccountDigitcontrol() <em>accountDigitcontrol</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAccountDigitcontrol() accountDigitcontrol}' feature.
	 * @generated
	 */
	public void setAccountDigitcontrol(String newAccountDigitcontrol) {
		accountDigitcontrol = newAccountDigitcontrol;
	}

	/**
	 * Returns the value of '<em><b>partialAccountNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>partialAccountNo</b></em>' feature
	 * @generated
	 */
	public String getPartialAccountNo() {
		return partialAccountNo;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getPartialAccountNo() <em>partialAccountNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getPartialAccountNo() partialAccountNo}' feature.
	 * @generated
	 */
	public void setPartialAccountNo(String newPartialAccountNo) {
		partialAccountNo = newPartialAccountNo;
	}

	/**
	 * Returns the value of '<em><b>accountNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountNo</b></em>' feature
	 * @generated
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAccountNo() <em>accountNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAccountNo() accountNo}' feature.
	 * @generated
	 */
	public void setAccountNo(String newAccountNo) {
		accountNo = newAccountNo;
	}

	/**
	 * Returns the value of '<em><b>currentBalance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currentBalance</b></em>' feature
	 * @generated
	 */
	public Decimal getCurrentBalance() {
		return currentBalance;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getCurrentBalance() <em>currentBalance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getCurrentBalance() currentBalance}' feature.
	 * @generated
	 */
	public void setCurrentBalance(Decimal newCurrentBalance) {
		currentBalance = newCurrentBalance;
	}

	/**
	 * Returns the value of '<em><b>initialBalance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>initialBalance</b></em>' feature
	 * @generated
	 */
	public Decimal getInitialBalance() {
		return initialBalance;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getInitialBalance() <em>initialBalance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getInitialBalance() initialBalance}' feature.
	 * @generated
	 */
	public void setInitialBalance(Decimal newInitialBalance) {
		initialBalance = newInitialBalance;
	}

	/**
	 * Returns the value of '<em><b>creditLimit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>creditLimit</b></em>' feature
	 * @generated
	 */
	public Decimal getCreditLimit() {
		return creditLimit;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getCreditLimit() <em>creditLimit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getCreditLimit() creditLimit}' feature.
	 * @generated
	 */
	public void setCreditLimit(Decimal newCreditLimit) {
		creditLimit = newCreditLimit;
	}

	/**
	 * Returns the value of '<em><b>iBAN</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iBAN</b></em>' feature
	 * @generated
	 */
	public String getIBAN() {
		return iBAN;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getIBAN() <em>iBAN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getIBAN() iBAN}' feature.
	 * @generated
	 */
	public void setIBAN(String newIBAN) {
		iBAN = newIBAN;
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
	 * Sets the '{@link FINFinancialAccountType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
	}

	/**
	 * Returns the value of '<em><b>matchingAlgorithm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>matchingAlgorithm</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMatchingAlgorithm() {
		return matchingAlgorithm;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getMatchingAlgorithm() <em>matchingAlgorithm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getMatchingAlgorithm() matchingAlgorithm}' feature.
	 * @generated
	 */
	public void setMatchingAlgorithm(ReferenceType newMatchingAlgorithm) {
		matchingAlgorithm = newMatchingAlgorithm;
	}

	/**
	 * Returns the value of '<em><b>aPRMImportBankFile</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMImportBankFile</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMImportBankFile() {
		return aPRMImportBankFile;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMImportBankFile() <em>aPRMImportBankFile</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMImportBankFile() aPRMImportBankFile}' feature.
	 * @generated
	 */
	public void setAPRMImportBankFile(Boolean newAPRMImportBankFile) {
		aPRMImportBankFile = newAPRMImportBankFile;
	}

	/**
	 * Returns the value of '<em><b>aPRMMatchTransactions</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMMatchTransactions</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMMatchTransactions() {
		return aPRMMatchTransactions;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMMatchTransactions() <em>aPRMMatchTransactions</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMMatchTransactions() aPRMMatchTransactions}' feature.
	 * @generated
	 */
	public void setAPRMMatchTransactions(Boolean newAPRMMatchTransactions) {
		aPRMMatchTransactions = newAPRMMatchTransactions;
	}

	/**
	 * Returns the value of '<em><b>aPRMReconcile</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconcile</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMReconcile() {
		return aPRMReconcile;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMReconcile() <em>aPRMReconcile</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMReconcile() aPRMReconcile}' feature.
	 * @generated
	 */
	public void setAPRMReconcile(Boolean newAPRMReconcile) {
		aPRMReconcile = newAPRMReconcile;
	}

	/**
	 * Returns the value of '<em><b>aPRMAddTransactions</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMAddTransactions</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMAddTransactions() {
		return aPRMAddTransactions;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMAddTransactions() <em>aPRMAddTransactions</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMAddTransactions() aPRMAddTransactions}' feature.
	 * @generated
	 */
	public void setAPRMAddTransactions(Boolean newAPRMAddTransactions) {
		aPRMAddTransactions = newAPRMAddTransactions;
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
	 * Sets the '{@link FINFinancialAccountType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	public APRMFinaccTransactionVListType getAPRMFinaccTransactionVList() {
		return aPRMFinaccTransactionVList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVList(
			APRMFinaccTransactionVListType newAPRMFinaccTransactionVList) {
		aPRMFinaccTransactionVList = newAPRMFinaccTransactionVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctVList</b></em>' feature
	 * @generated
	 */
	public APRMFinaccTrxFullAcctVListType1 getAPRMFinaccTrxFullAcctVList() {
		return aPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			APRMFinaccTrxFullAcctVListType1 newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMReconciliationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconciliationList</b></em>' feature
	 * @generated
	 */
	public APRMReconciliationListType getAPRMReconciliationList() {
		return aPRMReconciliationList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAPRMReconciliationList() <em>aPRMReconciliationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAPRMReconciliationList() aPRMReconciliationList}' feature.
	 * @generated
	 */
	public void setAPRMReconciliationList(
			APRMReconciliationListType newAPRMReconciliationList) {
		aPRMReconciliationList = newAPRMReconciliationList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerList() {
		return businessPartnerList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getBusinessPartnerList() <em>businessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getBusinessPartnerList() businessPartnerList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerList(ReferenceType newBusinessPartnerList) {
		businessPartnerList = newBusinessPartnerList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerPOFinancialAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerPOFinancialAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerPOFinancialAccountList() {
		return businessPartnerPOFinancialAccountList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getBusinessPartnerPOFinancialAccountList() <em>businessPartnerPOFinancialAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getBusinessPartnerPOFinancialAccountList() businessPartnerPOFinancialAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerPOFinancialAccountList(
			ReferenceType newBusinessPartnerPOFinancialAccountList) {
		businessPartnerPOFinancialAccountList = newBusinessPartnerPOFinancialAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINBankStatementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatementList</b></em>' feature
	 * @generated
	 */
	public FINBankStatementListType getFINBankStatementList() {
		return fINBankStatementList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getFINBankStatementList() <em>fINBankStatementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINBankStatementList() fINBankStatementList}' feature.
	 * @generated
	 */
	public void setFINBankStatementList(
			FINBankStatementListType newFINBankStatementList) {
		fINBankStatementList = newFINBankStatementList;
	}

	/**
	 * Returns the value of '<em><b>fINFinaccTransactionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransactionList</b></em>' feature
	 * @generated
	 */
	public FINFinaccTransactionListType getFINFinaccTransactionList() {
		return fINFinaccTransactionList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getFINFinaccTransactionList() <em>fINFinaccTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINFinaccTransactionList() fINFinaccTransactionList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionList(
			FINFinaccTransactionListType newFINFinaccTransactionList) {
		fINFinaccTransactionList = newFINFinaccTransactionList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctList</b></em>' feature
	 * @generated
	 */
	public FINFinancialAccountAcctListType1 getFINFinancialAccountAcctList() {
		return fINFinancialAccountAcctList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getFINFinancialAccountAcctList() <em>fINFinancialAccountAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINFinancialAccountAcctList() fINFinancialAccountAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctList(
			FINFinancialAccountAcctListType1 newFINFinancialAccountAcctList) {
		fINFinancialAccountAcctList = newFINFinancialAccountAcctList;
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
	 * Sets the '{@link FINFinancialAccountType#getFINPaymentList() <em>fINPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINPaymentList() fINPaymentList}' feature.
	 * @generated
	 */
	public void setFINPaymentList(ReferenceType newFINPaymentList) {
		fINPaymentList = newFINPaymentList;
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
	 * Sets the '{@link FINFinancialAccountType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(ReferenceType newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
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
	 * Sets the '{@link FINFinancialAccountType#getFINPaymentProposalList() <em>fINPaymentProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINPaymentProposalList() fINPaymentProposalList}' feature.
	 * @generated
	 */
	public void setFINPaymentProposalList(
			ReferenceType newFINPaymentProposalList) {
		fINPaymentProposalList = newFINPaymentProposalList;
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationList</b></em>' feature
	 * @generated
	 */
	public FINReconciliationListType getFINReconciliationList() {
		return fINReconciliationList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getFINReconciliationList() <em>fINReconciliationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINReconciliationList() fINReconciliationList}' feature.
	 * @generated
	 */
	public void setFINReconciliationList(
			FINReconciliationListType newFINReconciliationList) {
		fINReconciliationList = newFINReconciliationList;
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
	 * Sets the '{@link FINFinancialAccountType#getFINReconciliationLineVList() <em>fINReconciliationLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFINReconciliationLineVList() fINReconciliationLineVList}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineVList(
			ReferenceType newFINReconciliationLineVList) {
		fINReconciliationLineVList = newFINReconciliationLineVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtFinAccPaymentMethodList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtFinAccPaymentMethodList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtFinAccPaymentMethodListType1 getFinancialMgmtFinAccPaymentMethodList() {
		return financialMgmtFinAccPaymentMethodList;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getFinancialMgmtFinAccPaymentMethodList() <em>financialMgmtFinAccPaymentMethodList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getFinancialMgmtFinAccPaymentMethodList() financialMgmtFinAccPaymentMethodList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtFinAccPaymentMethodList(
			FinancialMgmtFinAccPaymentMethodListType1 newFinancialMgmtFinAccPaymentMethodList) {
		financialMgmtFinAccPaymentMethodList = newFinancialMgmtFinAccPaymentMethodList;
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
	 * Sets the '{@link FINFinancialAccountType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getId1() id1}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FINFinancialAccountType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#isReference() reference}' feature.
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
	public List<FINFinancialAccountTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FINFinancialAccountType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINFinancialAccountType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FINFinancialAccountTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FINFinancialAccountType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
