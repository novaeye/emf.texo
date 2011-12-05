package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BankAccountType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BankAccountType {

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
	private ReferenceType bank = null;

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
	private String accountType = null;

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
	private Decimal creditLimit = null;

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
	private String partialAccountNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String controlDigit = null;

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
	private String genericAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean showGeneric = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean showSpanish = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean showIBAN = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String displayedAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BankAccountAccountsListType1 bankAccountAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerBankAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerTransactionalBankAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtBankStatementList = null;

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
	private ReferenceType financialMgmtPromissoryFormatList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtRemittanceList = null;

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
	private List<BankAccountTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<BankAccountTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link BankAccountType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getId() id}' feature.
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
	 * Sets the '{@link BankAccountType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getClient() client}' feature.
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
	 * Sets the '{@link BankAccountType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getOrganization() organization}' feature.
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
	 * Sets the '{@link BankAccountType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getActive() active}' feature.
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
	 * Sets the '{@link BankAccountType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link BankAccountType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link BankAccountType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getUpdated() updated}' feature.
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
	 * Sets the '{@link BankAccountType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>bank</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bank</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBank() {
		return bank;
	}

	/**
	 * Sets the '{@link BankAccountType#getBank() <em>bank</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getBank() bank}' feature.
	 * @generated
	 */
	public void setBank(ReferenceType newBank) {
		bank = newBank;
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
	 * Sets the '{@link BankAccountType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
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
	 * Sets the '{@link BankAccountType#getAccountType() <em>accountType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getAccountType() accountType}' feature.
	 * @generated
	 */
	public void setAccountType(String newAccountType) {
		accountType = newAccountType;
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
	 * Sets the '{@link BankAccountType#getAccountNo() <em>accountNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getAccountNo() accountNo}' feature.
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
	 * Sets the '{@link BankAccountType#getCurrentBalance() <em>currentBalance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getCurrentBalance() currentBalance}' feature.
	 * @generated
	 */
	public void setCurrentBalance(Decimal newCurrentBalance) {
		currentBalance = newCurrentBalance;
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
	 * Sets the '{@link BankAccountType#getCreditLimit() <em>creditLimit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getCreditLimit() creditLimit}' feature.
	 * @generated
	 */
	public void setCreditLimit(Decimal newCreditLimit) {
		creditLimit = newCreditLimit;
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
	 * Sets the '{@link BankAccountType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
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
	 * Sets the '{@link BankAccountType#getPartialAccountNo() <em>partialAccountNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getPartialAccountNo() partialAccountNo}' feature.
	 * @generated
	 */
	public void setPartialAccountNo(String newPartialAccountNo) {
		partialAccountNo = newPartialAccountNo;
	}

	/**
	 * Returns the value of '<em><b>controlDigit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>controlDigit</b></em>' feature
	 * @generated
	 */
	public String getControlDigit() {
		return controlDigit;
	}

	/**
	 * Sets the '{@link BankAccountType#getControlDigit() <em>controlDigit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getControlDigit() controlDigit}' feature.
	 * @generated
	 */
	public void setControlDigit(String newControlDigit) {
		controlDigit = newControlDigit;
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
	 * Sets the '{@link BankAccountType#getIBAN() <em>iBAN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getIBAN() iBAN}' feature.
	 * @generated
	 */
	public void setIBAN(String newIBAN) {
		iBAN = newIBAN;
	}

	/**
	 * Returns the value of '<em><b>genericAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>genericAccount</b></em>' feature
	 * @generated
	 */
	public String getGenericAccount() {
		return genericAccount;
	}

	/**
	 * Sets the '{@link BankAccountType#getGenericAccount() <em>genericAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getGenericAccount() genericAccount}' feature.
	 * @generated
	 */
	public void setGenericAccount(String newGenericAccount) {
		genericAccount = newGenericAccount;
	}

	/**
	 * Returns the value of '<em><b>showGeneric</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>showGeneric</b></em>' feature
	 * @generated
	 */
	public Boolean getShowGeneric() {
		return showGeneric;
	}

	/**
	 * Sets the '{@link BankAccountType#getShowGeneric() <em>showGeneric</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getShowGeneric() showGeneric}' feature.
	 * @generated
	 */
	public void setShowGeneric(Boolean newShowGeneric) {
		showGeneric = newShowGeneric;
	}

	/**
	 * Returns the value of '<em><b>showSpanish</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>showSpanish</b></em>' feature
	 * @generated
	 */
	public Boolean getShowSpanish() {
		return showSpanish;
	}

	/**
	 * Sets the '{@link BankAccountType#getShowSpanish() <em>showSpanish</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getShowSpanish() showSpanish}' feature.
	 * @generated
	 */
	public void setShowSpanish(Boolean newShowSpanish) {
		showSpanish = newShowSpanish;
	}

	/**
	 * Returns the value of '<em><b>showIBAN</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>showIBAN</b></em>' feature
	 * @generated
	 */
	public Boolean getShowIBAN() {
		return showIBAN;
	}

	/**
	 * Sets the '{@link BankAccountType#getShowIBAN() <em>showIBAN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getShowIBAN() showIBAN}' feature.
	 * @generated
	 */
	public void setShowIBAN(Boolean newShowIBAN) {
		showIBAN = newShowIBAN;
	}

	/**
	 * Returns the value of '<em><b>displayedAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>displayedAccount</b></em>' feature
	 * @generated
	 */
	public String getDisplayedAccount() {
		return displayedAccount;
	}

	/**
	 * Sets the '{@link BankAccountType#getDisplayedAccount() <em>displayedAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getDisplayedAccount() displayedAccount}' feature.
	 * @generated
	 */
	public void setDisplayedAccount(String newDisplayedAccount) {
		displayedAccount = newDisplayedAccount;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsList</b></em>' feature
	 * @generated
	 */
	public BankAccountAccountsListType1 getBankAccountAccountsList() {
		return bankAccountAccountsList;
	}

	/**
	 * Sets the '{@link BankAccountType#getBankAccountAccountsList() <em>bankAccountAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getBankAccountAccountsList() bankAccountAccountsList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsList(
			BankAccountAccountsListType1 newBankAccountAccountsList) {
		bankAccountAccountsList = newBankAccountAccountsList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerBankAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerBankAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerBankAccountList() {
		return businessPartnerBankAccountList;
	}

	/**
	 * Sets the '{@link BankAccountType#getBusinessPartnerBankAccountList() <em>businessPartnerBankAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getBusinessPartnerBankAccountList() businessPartnerBankAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccountList(
			ReferenceType newBusinessPartnerBankAccountList) {
		businessPartnerBankAccountList = newBusinessPartnerBankAccountList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerTransactionalBankAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerTransactionalBankAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerTransactionalBankAccountList() {
		return businessPartnerTransactionalBankAccountList;
	}

	/**
	 * Sets the '{@link BankAccountType#getBusinessPartnerTransactionalBankAccountList() <em>businessPartnerTransactionalBankAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getBusinessPartnerTransactionalBankAccountList() businessPartnerTransactionalBankAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerTransactionalBankAccountList(
			ReferenceType newBusinessPartnerTransactionalBankAccountList) {
		businessPartnerTransactionalBankAccountList = newBusinessPartnerTransactionalBankAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtBankStatementList() {
		return financialMgmtBankStatementList;
	}

	/**
	 * Sets the '{@link BankAccountType#getFinancialMgmtBankStatementList() <em>financialMgmtBankStatementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtBankStatementList() financialMgmtBankStatementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatementList(
			ReferenceType newFinancialMgmtBankStatementList) {
		financialMgmtBankStatementList = newFinancialMgmtBankStatementList;
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
	 * Sets the '{@link BankAccountType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
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
	 * Sets the '{@link BankAccountType#getFinancialMgmtDebtPaymentCancelVList() <em>financialMgmtDebtPaymentCancelVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtDebtPaymentCancelVList() financialMgmtDebtPaymentCancelVList}' feature.
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
	 * Sets the '{@link BankAccountType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
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
	 * Sets the '{@link BankAccountType#getFinancialMgmtElementValueList() <em>financialMgmtElementValueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtElementValueList() financialMgmtElementValueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueList(
			ReferenceType newFinancialMgmtElementValueList) {
		financialMgmtElementValueList = newFinancialMgmtElementValueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPromissoryFormatList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPromissoryFormatList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtPromissoryFormatList() {
		return financialMgmtPromissoryFormatList;
	}

	/**
	 * Sets the '{@link BankAccountType#getFinancialMgmtPromissoryFormatList() <em>financialMgmtPromissoryFormatList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtPromissoryFormatList() financialMgmtPromissoryFormatList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPromissoryFormatList(
			ReferenceType newFinancialMgmtPromissoryFormatList) {
		financialMgmtPromissoryFormatList = newFinancialMgmtPromissoryFormatList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtRemittanceList() {
		return financialMgmtRemittanceList;
	}

	/**
	 * Sets the '{@link BankAccountType#getFinancialMgmtRemittanceList() <em>financialMgmtRemittanceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getFinancialMgmtRemittanceList() financialMgmtRemittanceList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceList(
			ReferenceType newFinancialMgmtRemittanceList) {
		financialMgmtRemittanceList = newFinancialMgmtRemittanceList;
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
	 * Sets the '{@link BankAccountType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getId1() id1}' feature.
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
	 * Sets the '{@link BankAccountType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link BankAccountType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#isReference() reference}' feature.
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
	public List<BankAccountTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link BankAccountType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BankAccountType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<BankAccountTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "BankAccountType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
