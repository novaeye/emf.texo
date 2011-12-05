package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADSequenceType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADSequenceType {

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
	private String valueFormat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean autoNumbering = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long incrementBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long startingNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long nextAssignedNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long currentNextSystem = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean usedForRecordID = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String prefix = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String suffix = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean restartSequenceEveryYear = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType documentTypeDocumentSequenceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRegisterTypeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organizationAcctSchemaSequanceForBusinessPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organizationAcctSchemaSequenceForProductList = null;

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
	private List<ADSequenceTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADSequenceTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADSequenceType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getId() id}' feature.
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
	 * Sets the '{@link ADSequenceType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getClient() client}' feature.
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
	 * Sets the '{@link ADSequenceType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADSequenceType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getActive() active}' feature.
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
	 * Sets the '{@link ADSequenceType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADSequenceType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADSequenceType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADSequenceType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ADSequenceType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getName() name}' feature.
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
	 * Sets the '{@link ADSequenceType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>valueFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>valueFormat</b></em>' feature
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * Sets the '{@link ADSequenceType#getValueFormat() <em>valueFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getValueFormat() valueFormat}' feature.
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		valueFormat = newValueFormat;
	}

	/**
	 * Returns the value of '<em><b>autoNumbering</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>autoNumbering</b></em>' feature
	 * @generated
	 */
	public Boolean getAutoNumbering() {
		return autoNumbering;
	}

	/**
	 * Sets the '{@link ADSequenceType#getAutoNumbering() <em>autoNumbering</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getAutoNumbering() autoNumbering}' feature.
	 * @generated
	 */
	public void setAutoNumbering(Boolean newAutoNumbering) {
		autoNumbering = newAutoNumbering;
	}

	/**
	 * Returns the value of '<em><b>incrementBy</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>incrementBy</b></em>' feature
	 * @generated
	 */
	public Long getIncrementBy() {
		return incrementBy;
	}

	/**
	 * Sets the '{@link ADSequenceType#getIncrementBy() <em>incrementBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getIncrementBy() incrementBy}' feature.
	 * @generated
	 */
	public void setIncrementBy(Long newIncrementBy) {
		incrementBy = newIncrementBy;
	}

	/**
	 * Returns the value of '<em><b>startingNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>startingNo</b></em>' feature
	 * @generated
	 */
	public Long getStartingNo() {
		return startingNo;
	}

	/**
	 * Sets the '{@link ADSequenceType#getStartingNo() <em>startingNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getStartingNo() startingNo}' feature.
	 * @generated
	 */
	public void setStartingNo(Long newStartingNo) {
		startingNo = newStartingNo;
	}

	/**
	 * Returns the value of '<em><b>nextAssignedNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nextAssignedNumber</b></em>' feature
	 * @generated
	 */
	public Long getNextAssignedNumber() {
		return nextAssignedNumber;
	}

	/**
	 * Sets the '{@link ADSequenceType#getNextAssignedNumber() <em>nextAssignedNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getNextAssignedNumber() nextAssignedNumber}' feature.
	 * @generated
	 */
	public void setNextAssignedNumber(Long newNextAssignedNumber) {
		nextAssignedNumber = newNextAssignedNumber;
	}

	/**
	 * Returns the value of '<em><b>currentNextSystem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currentNextSystem</b></em>' feature
	 * @generated
	 */
	public Long getCurrentNextSystem() {
		return currentNextSystem;
	}

	/**
	 * Sets the '{@link ADSequenceType#getCurrentNextSystem() <em>currentNextSystem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getCurrentNextSystem() currentNextSystem}' feature.
	 * @generated
	 */
	public void setCurrentNextSystem(Long newCurrentNextSystem) {
		currentNextSystem = newCurrentNextSystem;
	}

	/**
	 * Returns the value of '<em><b>usedForRecordID</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>usedForRecordID</b></em>' feature
	 * @generated
	 */
	public Boolean getUsedForRecordID() {
		return usedForRecordID;
	}

	/**
	 * Sets the '{@link ADSequenceType#getUsedForRecordID() <em>usedForRecordID</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getUsedForRecordID() usedForRecordID}' feature.
	 * @generated
	 */
	public void setUsedForRecordID(Boolean newUsedForRecordID) {
		usedForRecordID = newUsedForRecordID;
	}

	/**
	 * Returns the value of '<em><b>prefix</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>prefix</b></em>' feature
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Sets the '{@link ADSequenceType#getPrefix() <em>prefix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getPrefix() prefix}' feature.
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		prefix = newPrefix;
	}

	/**
	 * Returns the value of '<em><b>suffix</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suffix</b></em>' feature
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Sets the '{@link ADSequenceType#getSuffix() <em>suffix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getSuffix() suffix}' feature.
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		suffix = newSuffix;
	}

	/**
	 * Returns the value of '<em><b>restartSequenceEveryYear</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>restartSequenceEveryYear</b></em>' feature
	 * @generated
	 */
	public Boolean getRestartSequenceEveryYear() {
		return restartSequenceEveryYear;
	}

	/**
	 * Sets the '{@link ADSequenceType#getRestartSequenceEveryYear() <em>restartSequenceEveryYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getRestartSequenceEveryYear() restartSequenceEveryYear}' feature.
	 * @generated
	 */
	public void setRestartSequenceEveryYear(Boolean newRestartSequenceEveryYear) {
		restartSequenceEveryYear = newRestartSequenceEveryYear;
	}

	/**
	 * Returns the value of '<em><b>documentTypeDocumentSequenceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTypeDocumentSequenceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDocumentTypeDocumentSequenceList() {
		return documentTypeDocumentSequenceList;
	}

	/**
	 * Sets the '{@link ADSequenceType#getDocumentTypeDocumentSequenceList() <em>documentTypeDocumentSequenceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getDocumentTypeDocumentSequenceList() documentTypeDocumentSequenceList}' feature.
	 * @generated
	 */
	public void setDocumentTypeDocumentSequenceList(
			ReferenceType newDocumentTypeDocumentSequenceList) {
		documentTypeDocumentSequenceList = newDocumentTypeDocumentSequenceList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterTypeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterTypeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRegisterTypeList() {
		return financialMgmtTaxRegisterTypeList;
	}

	/**
	 * Sets the '{@link ADSequenceType#getFinancialMgmtTaxRegisterTypeList() <em>financialMgmtTaxRegisterTypeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getFinancialMgmtTaxRegisterTypeList() financialMgmtTaxRegisterTypeList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterTypeList(
			ReferenceType newFinancialMgmtTaxRegisterTypeList) {
		financialMgmtTaxRegisterTypeList = newFinancialMgmtTaxRegisterTypeList;
	}

	/**
	 * Returns the value of '<em><b>organizationAcctSchemaSequanceForBusinessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationAcctSchemaSequanceForBusinessPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationAcctSchemaSequanceForBusinessPartnerList() {
		return organizationAcctSchemaSequanceForBusinessPartnerList;
	}

	/**
	 * Sets the '{@link ADSequenceType#getOrganizationAcctSchemaSequanceForBusinessPartnerList() <em>organizationAcctSchemaSequanceForBusinessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getOrganizationAcctSchemaSequanceForBusinessPartnerList() organizationAcctSchemaSequanceForBusinessPartnerList}' feature.
	 * @generated
	 */
	public void setOrganizationAcctSchemaSequanceForBusinessPartnerList(
			ReferenceType newOrganizationAcctSchemaSequanceForBusinessPartnerList) {
		organizationAcctSchemaSequanceForBusinessPartnerList = newOrganizationAcctSchemaSequanceForBusinessPartnerList;
	}

	/**
	 * Returns the value of '<em><b>organizationAcctSchemaSequenceForProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationAcctSchemaSequenceForProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationAcctSchemaSequenceForProductList() {
		return organizationAcctSchemaSequenceForProductList;
	}

	/**
	 * Sets the '{@link ADSequenceType#getOrganizationAcctSchemaSequenceForProductList() <em>organizationAcctSchemaSequenceForProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getOrganizationAcctSchemaSequenceForProductList() organizationAcctSchemaSequenceForProductList}' feature.
	 * @generated
	 */
	public void setOrganizationAcctSchemaSequenceForProductList(
			ReferenceType newOrganizationAcctSchemaSequenceForProductList) {
		organizationAcctSchemaSequenceForProductList = newOrganizationAcctSchemaSequenceForProductList;
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
	 * Sets the '{@link ADSequenceType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getId1() id1}' feature.
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
	 * Sets the '{@link ADSequenceType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADSequenceType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#isReference() reference}' feature.
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
	public List<ADSequenceTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADSequenceType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADSequenceType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADSequenceTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADSequenceType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
