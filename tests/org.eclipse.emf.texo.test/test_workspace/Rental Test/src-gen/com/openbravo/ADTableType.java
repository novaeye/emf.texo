package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTableType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTableType {

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
	private String helpComment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dBTableName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String javaClassName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean view = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dataAccessLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType window = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean securityEnabled = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean deletableRecords = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean highVolume = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean importTable = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean maintainChangeLog = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pOWindow = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean defaultAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String sQLRecordIdentifier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String developmentStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dataPackage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String treeType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType acctdateColumn = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String acctclassname = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean isFullyAudited = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDAttachmentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADColumnListType aDColumnList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDReferencedTableList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSelectorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDTabList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTableAccessListType aDTableAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType auditTrailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType createFactTemplateList = null;

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
	private ReferenceType aPRMFinaccTransactionVForcedTableIDList = null;

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
	private ReferenceType aPRMReconciliationForcedTableIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dataSetTableList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType documentTypeList = null;

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
	private ReferenceType financialMgmtAcctSchemaTableList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBSERDSDatasourceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBSERDSDatasourceFieldList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPNoteList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUISELSelectorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType referenceDataStoreList = null;

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
	private List<ADTableTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADTableTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADTableType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getId() id}' feature.
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
	 * Sets the '{@link ADTableType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getClient() client}' feature.
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
	 * Sets the '{@link ADTableType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADTableType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getActive() active}' feature.
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
	 * Sets the '{@link ADTableType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADTableType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADTableType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADTableType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ADTableType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getName() name}' feature.
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
	 * Sets the '{@link ADTableType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>helpComment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>helpComment</b></em>' feature
	 * @generated
	 */
	public String getHelpComment() {
		return helpComment;
	}

	/**
	 * Sets the '{@link ADTableType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
	}

	/**
	 * Returns the value of '<em><b>dBTableName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dBTableName</b></em>' feature
	 * @generated
	 */
	public String getDBTableName() {
		return dBTableName;
	}

	/**
	 * Sets the '{@link ADTableType#getDBTableName() <em>dBTableName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDBTableName() dBTableName}' feature.
	 * @generated
	 */
	public void setDBTableName(String newDBTableName) {
		dBTableName = newDBTableName;
	}

	/**
	 * Returns the value of '<em><b>javaClassName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>javaClassName</b></em>' feature
	 * @generated
	 */
	public String getJavaClassName() {
		return javaClassName;
	}

	/**
	 * Sets the '{@link ADTableType#getJavaClassName() <em>javaClassName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getJavaClassName() javaClassName}' feature.
	 * @generated
	 */
	public void setJavaClassName(String newJavaClassName) {
		javaClassName = newJavaClassName;
	}

	/**
	 * Returns the value of '<em><b>view</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>view</b></em>' feature
	 * @generated
	 */
	public Boolean getView() {
		return view;
	}

	/**
	 * Sets the '{@link ADTableType#getView() <em>view</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getView() view}' feature.
	 * @generated
	 */
	public void setView(Boolean newView) {
		view = newView;
	}

	/**
	 * Returns the value of '<em><b>dataAccessLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataAccessLevel</b></em>' feature
	 * @generated
	 */
	public String getDataAccessLevel() {
		return dataAccessLevel;
	}

	/**
	 * Sets the '{@link ADTableType#getDataAccessLevel() <em>dataAccessLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDataAccessLevel() dataAccessLevel}' feature.
	 * @generated
	 */
	public void setDataAccessLevel(String newDataAccessLevel) {
		dataAccessLevel = newDataAccessLevel;
	}

	/**
	 * Returns the value of '<em><b>window</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>window</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWindow() {
		return window;
	}

	/**
	 * Sets the '{@link ADTableType#getWindow() <em>window</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getWindow() window}' feature.
	 * @generated
	 */
	public void setWindow(ReferenceType newWindow) {
		window = newWindow;
	}

	/**
	 * Returns the value of '<em><b>securityEnabled</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>securityEnabled</b></em>' feature
	 * @generated
	 */
	public Boolean getSecurityEnabled() {
		return securityEnabled;
	}

	/**
	 * Sets the '{@link ADTableType#getSecurityEnabled() <em>securityEnabled</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getSecurityEnabled() securityEnabled}' feature.
	 * @generated
	 */
	public void setSecurityEnabled(Boolean newSecurityEnabled) {
		securityEnabled = newSecurityEnabled;
	}

	/**
	 * Returns the value of '<em><b>deletableRecords</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deletableRecords</b></em>' feature
	 * @generated
	 */
	public Boolean getDeletableRecords() {
		return deletableRecords;
	}

	/**
	 * Sets the '{@link ADTableType#getDeletableRecords() <em>deletableRecords</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDeletableRecords() deletableRecords}' feature.
	 * @generated
	 */
	public void setDeletableRecords(Boolean newDeletableRecords) {
		deletableRecords = newDeletableRecords;
	}

	/**
	 * Returns the value of '<em><b>highVolume</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>highVolume</b></em>' feature
	 * @generated
	 */
	public Boolean getHighVolume() {
		return highVolume;
	}

	/**
	 * Sets the '{@link ADTableType#getHighVolume() <em>highVolume</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getHighVolume() highVolume}' feature.
	 * @generated
	 */
	public void setHighVolume(Boolean newHighVolume) {
		highVolume = newHighVolume;
	}

	/**
	 * Returns the value of '<em><b>importTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>importTable</b></em>' feature
	 * @generated
	 */
	public Boolean getImportTable() {
		return importTable;
	}

	/**
	 * Sets the '{@link ADTableType#getImportTable() <em>importTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getImportTable() importTable}' feature.
	 * @generated
	 */
	public void setImportTable(Boolean newImportTable) {
		importTable = newImportTable;
	}

	/**
	 * Returns the value of '<em><b>maintainChangeLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maintainChangeLog</b></em>' feature
	 * @generated
	 */
	public Boolean getMaintainChangeLog() {
		return maintainChangeLog;
	}

	/**
	 * Sets the '{@link ADTableType#getMaintainChangeLog() <em>maintainChangeLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getMaintainChangeLog() maintainChangeLog}' feature.
	 * @generated
	 */
	public void setMaintainChangeLog(Boolean newMaintainChangeLog) {
		maintainChangeLog = newMaintainChangeLog;
	}

	/**
	 * Returns the value of '<em><b>pOWindow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOWindow</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPOWindow() {
		return pOWindow;
	}

	/**
	 * Sets the '{@link ADTableType#getPOWindow() <em>pOWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getPOWindow() pOWindow}' feature.
	 * @generated
	 */
	public void setPOWindow(ReferenceType newPOWindow) {
		pOWindow = newPOWindow;
	}

	/**
	 * Returns the value of '<em><b>defaultAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultAccount</b></em>' feature
	 * @generated
	 */
	public Boolean getDefaultAccount() {
		return defaultAccount;
	}

	/**
	 * Sets the '{@link ADTableType#getDefaultAccount() <em>defaultAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDefaultAccount() defaultAccount}' feature.
	 * @generated
	 */
	public void setDefaultAccount(Boolean newDefaultAccount) {
		defaultAccount = newDefaultAccount;
	}

	/**
	 * Returns the value of '<em><b>sQLRecordIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sQLRecordIdentifier</b></em>' feature
	 * @generated
	 */
	public String getSQLRecordIdentifier() {
		return sQLRecordIdentifier;
	}

	/**
	 * Sets the '{@link ADTableType#getSQLRecordIdentifier() <em>sQLRecordIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getSQLRecordIdentifier() sQLRecordIdentifier}' feature.
	 * @generated
	 */
	public void setSQLRecordIdentifier(String newSQLRecordIdentifier) {
		sQLRecordIdentifier = newSQLRecordIdentifier;
	}

	/**
	 * Returns the value of '<em><b>developmentStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>developmentStatus</b></em>' feature
	 * @generated
	 */
	public String getDevelopmentStatus() {
		return developmentStatus;
	}

	/**
	 * Sets the '{@link ADTableType#getDevelopmentStatus() <em>developmentStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDevelopmentStatus() developmentStatus}' feature.
	 * @generated
	 */
	public void setDevelopmentStatus(String newDevelopmentStatus) {
		developmentStatus = newDevelopmentStatus;
	}

	/**
	 * Returns the value of '<em><b>dataPackage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataPackage</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDataPackage() {
		return dataPackage;
	}

	/**
	 * Sets the '{@link ADTableType#getDataPackage() <em>dataPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDataPackage() dataPackage}' feature.
	 * @generated
	 */
	public void setDataPackage(ReferenceType newDataPackage) {
		dataPackage = newDataPackage;
	}

	/**
	 * Returns the value of '<em><b>treeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>treeType</b></em>' feature
	 * @generated
	 */
	public String getTreeType() {
		return treeType;
	}

	/**
	 * Sets the '{@link ADTableType#getTreeType() <em>treeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getTreeType() treeType}' feature.
	 * @generated
	 */
	public void setTreeType(String newTreeType) {
		treeType = newTreeType;
	}

	/**
	 * Returns the value of '<em><b>acctdateColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>acctdateColumn</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAcctdateColumn() {
		return acctdateColumn;
	}

	/**
	 * Sets the '{@link ADTableType#getAcctdateColumn() <em>acctdateColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAcctdateColumn() acctdateColumn}' feature.
	 * @generated
	 */
	public void setAcctdateColumn(ReferenceType newAcctdateColumn) {
		acctdateColumn = newAcctdateColumn;
	}

	/**
	 * Returns the value of '<em><b>acctclassname</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>acctclassname</b></em>' feature
	 * @generated
	 */
	public String getAcctclassname() {
		return acctclassname;
	}

	/**
	 * Sets the '{@link ADTableType#getAcctclassname() <em>acctclassname</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAcctclassname() acctclassname}' feature.
	 * @generated
	 */
	public void setAcctclassname(String newAcctclassname) {
		acctclassname = newAcctclassname;
	}

	/**
	 * Returns the value of '<em><b>isFullyAudited</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isFullyAudited</b></em>' feature
	 * @generated
	 */
	public Boolean getIsFullyAudited() {
		return isFullyAudited;
	}

	/**
	 * Sets the '{@link ADTableType#getIsFullyAudited() <em>isFullyAudited</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getIsFullyAudited() isFullyAudited}' feature.
	 * @generated
	 */
	public void setIsFullyAudited(Boolean newIsFullyAudited) {
		isFullyAudited = newIsFullyAudited;
	}

	/**
	 * Returns the value of '<em><b>aDAttachmentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAttachmentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADAttachmentList() {
		return aDAttachmentList;
	}

	/**
	 * Sets the '{@link ADTableType#getADAttachmentList() <em>aDAttachmentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getADAttachmentList() aDAttachmentList}' feature.
	 * @generated
	 */
	public void setADAttachmentList(ReferenceType newADAttachmentList) {
		aDAttachmentList = newADAttachmentList;
	}

	/**
	 * Returns the value of '<em><b>aDColumnList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumnList</b></em>' feature
	 * @generated
	 */
	public ADColumnListType getADColumnList() {
		return aDColumnList;
	}

	/**
	 * Sets the '{@link ADTableType#getADColumnList() <em>aDColumnList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getADColumnList() aDColumnList}' feature.
	 * @generated
	 */
	public void setADColumnList(ADColumnListType newADColumnList) {
		aDColumnList = newADColumnList;
	}

	/**
	 * Returns the value of '<em><b>aDReferencedTableList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferencedTableList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADReferencedTableList() {
		return aDReferencedTableList;
	}

	/**
	 * Sets the '{@link ADTableType#getADReferencedTableList() <em>aDReferencedTableList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getADReferencedTableList() aDReferencedTableList}' feature.
	 * @generated
	 */
	public void setADReferencedTableList(ReferenceType newADReferencedTableList) {
		aDReferencedTableList = newADReferencedTableList;
	}

	/**
	 * Returns the value of '<em><b>aDSelectorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelectorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSelectorList() {
		return aDSelectorList;
	}

	/**
	 * Sets the '{@link ADTableType#getADSelectorList() <em>aDSelectorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getADSelectorList() aDSelectorList}' feature.
	 * @generated
	 */
	public void setADSelectorList(ReferenceType newADSelectorList) {
		aDSelectorList = newADSelectorList;
	}

	/**
	 * Returns the value of '<em><b>aDTabList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTabList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADTabList() {
		return aDTabList;
	}

	/**
	 * Sets the '{@link ADTableType#getADTabList() <em>aDTabList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getADTabList() aDTabList}' feature.
	 * @generated
	 */
	public void setADTabList(ReferenceType newADTabList) {
		aDTabList = newADTabList;
	}

	/**
	 * Returns the value of '<em><b>aDTableAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTableAccessList</b></em>' feature
	 * @generated
	 */
	public ADTableAccessListType getADTableAccessList() {
		return aDTableAccessList;
	}

	/**
	 * Sets the '{@link ADTableType#getADTableAccessList() <em>aDTableAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getADTableAccessList() aDTableAccessList}' feature.
	 * @generated
	 */
	public void setADTableAccessList(ADTableAccessListType newADTableAccessList) {
		aDTableAccessList = newADTableAccessList;
	}

	/**
	 * Returns the value of '<em><b>auditTrailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>auditTrailList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAuditTrailList() {
		return auditTrailList;
	}

	/**
	 * Sets the '{@link ADTableType#getAuditTrailList() <em>auditTrailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAuditTrailList() auditTrailList}' feature.
	 * @generated
	 */
	public void setAuditTrailList(ReferenceType newAuditTrailList) {
		auditTrailList = newAuditTrailList;
	}

	/**
	 * Returns the value of '<em><b>createFactTemplateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createFactTemplateList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCreateFactTemplateList() {
		return createFactTemplateList;
	}

	/**
	 * Sets the '{@link ADTableType#getCreateFactTemplateList() <em>createFactTemplateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getCreateFactTemplateList() createFactTemplateList}' feature.
	 * @generated
	 */
	public void setCreateFactTemplateList(
			ReferenceType newCreateFactTemplateList) {
		createFactTemplateList = newCreateFactTemplateList;
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
	 * Sets the '{@link ADTableType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVList(
			ReferenceType newAPRMFinAccTransactionAcctVList) {
		aPRMFinAccTransactionAcctVList = newAPRMFinAccTransactionAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionVForcedTableIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionVForcedTableIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTransactionVForcedTableIDList() {
		return aPRMFinaccTransactionVForcedTableIDList;
	}

	/**
	 * Sets the '{@link ADTableType#getAPRMFinaccTransactionVForcedTableIDList() <em>aPRMFinaccTransactionVForcedTableIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAPRMFinaccTransactionVForcedTableIDList() aPRMFinaccTransactionVForcedTableIDList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVForcedTableIDList(
			ReferenceType newAPRMFinaccTransactionVForcedTableIDList) {
		aPRMFinaccTransactionVForcedTableIDList = newAPRMFinaccTransactionVForcedTableIDList;
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
	 * Sets the '{@link ADTableType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMReconciliationForcedTableIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconciliationForcedTableIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMReconciliationForcedTableIDList() {
		return aPRMReconciliationForcedTableIDList;
	}

	/**
	 * Sets the '{@link ADTableType#getAPRMReconciliationForcedTableIDList() <em>aPRMReconciliationForcedTableIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAPRMReconciliationForcedTableIDList() aPRMReconciliationForcedTableIDList}' feature.
	 * @generated
	 */
	public void setAPRMReconciliationForcedTableIDList(
			ReferenceType newAPRMReconciliationForcedTableIDList) {
		aPRMReconciliationForcedTableIDList = newAPRMReconciliationForcedTableIDList;
	}

	/**
	 * Returns the value of '<em><b>dataSetTableList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetTableList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDataSetTableList() {
		return dataSetTableList;
	}

	/**
	 * Sets the '{@link ADTableType#getDataSetTableList() <em>dataSetTableList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDataSetTableList() dataSetTableList}' feature.
	 * @generated
	 */
	public void setDataSetTableList(ReferenceType newDataSetTableList) {
		dataSetTableList = newDataSetTableList;
	}

	/**
	 * Returns the value of '<em><b>documentTypeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTypeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDocumentTypeList() {
		return documentTypeList;
	}

	/**
	 * Sets the '{@link ADTableType#getDocumentTypeList() <em>documentTypeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getDocumentTypeList() documentTypeList}' feature.
	 * @generated
	 */
	public void setDocumentTypeList(ReferenceType newDocumentTypeList) {
		documentTypeList = newDocumentTypeList;
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
	 * Sets the '{@link ADTableType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaTableList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaTableList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaTableList() {
		return financialMgmtAcctSchemaTableList;
	}

	/**
	 * Sets the '{@link ADTableType#getFinancialMgmtAcctSchemaTableList() <em>financialMgmtAcctSchemaTableList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getFinancialMgmtAcctSchemaTableList() financialMgmtAcctSchemaTableList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaTableList(
			ReferenceType newFinancialMgmtAcctSchemaTableList) {
		financialMgmtAcctSchemaTableList = newFinancialMgmtAcctSchemaTableList;
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBSERDSDatasourceList() {
		return oBSERDSDatasourceList;
	}

	/**
	 * Sets the '{@link ADTableType#getOBSERDSDatasourceList() <em>oBSERDSDatasourceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getOBSERDSDatasourceList() oBSERDSDatasourceList}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceList(ReferenceType newOBSERDSDatasourceList) {
		oBSERDSDatasourceList = newOBSERDSDatasourceList;
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceFieldList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceFieldList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBSERDSDatasourceFieldList() {
		return oBSERDSDatasourceFieldList;
	}

	/**
	 * Sets the '{@link ADTableType#getOBSERDSDatasourceFieldList() <em>oBSERDSDatasourceFieldList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getOBSERDSDatasourceFieldList() oBSERDSDatasourceFieldList}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceFieldList(
			ReferenceType newOBSERDSDatasourceFieldList) {
		oBSERDSDatasourceFieldList = newOBSERDSDatasourceFieldList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNoteList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNoteList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPNoteList() {
		return oBUIAPPNoteList;
	}

	/**
	 * Sets the '{@link ADTableType#getOBUIAPPNoteList() <em>oBUIAPPNoteList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getOBUIAPPNoteList() oBUIAPPNoteList}' feature.
	 * @generated
	 */
	public void setOBUIAPPNoteList(ReferenceType newOBUIAPPNoteList) {
		oBUIAPPNoteList = newOBUIAPPNoteList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUISELSelectorList() {
		return oBUISELSelectorList;
	}

	/**
	 * Sets the '{@link ADTableType#getOBUISELSelectorList() <em>oBUISELSelectorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getOBUISELSelectorList() oBUISELSelectorList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorList(ReferenceType newOBUISELSelectorList) {
		oBUISELSelectorList = newOBUISELSelectorList;
	}

	/**
	 * Returns the value of '<em><b>referenceDataStoreList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceDataStoreList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReferenceDataStoreList() {
		return referenceDataStoreList;
	}

	/**
	 * Sets the '{@link ADTableType#getReferenceDataStoreList() <em>referenceDataStoreList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getReferenceDataStoreList() referenceDataStoreList}' feature.
	 * @generated
	 */
	public void setReferenceDataStoreList(
			ReferenceType newReferenceDataStoreList) {
		referenceDataStoreList = newReferenceDataStoreList;
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
	 * Sets the '{@link ADTableType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getId1() id1}' feature.
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
	 * Sets the '{@link ADTableType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADTableType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#isReference() reference}' feature.
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
	public List<ADTableTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADTableType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTableType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADTableTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADTableType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
