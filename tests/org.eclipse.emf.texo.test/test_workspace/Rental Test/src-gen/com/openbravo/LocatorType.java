package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>LocatorType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class LocatorType {

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
	private ReferenceType warehouse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long relativePriority = null;

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
	private String rowX = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String stackY = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String levelZ = null;

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
	private ReferenceType aPRMFinaccTrxFullAcctVLocationFromAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinaccTrxFullAcctVLocationToAddressList = null;

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
	private ReferenceType financialMgmtAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingGlobalUseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingProductionLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingToolsetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInternalConsumptionLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInternalMovementLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInternalMovementLineNewStorageBinList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInventoryCountLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtMaterialTransactionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtProductionPlanList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtStorageDetailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productOrgList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productStockViewList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectIssueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialReceiptPickEditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialShipmentPickEditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType warehouseMReturnlocatorIDList = null;

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
	private List<LocatorTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<LocatorTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link LocatorType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getId() id}' feature.
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
	 * Sets the '{@link LocatorType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getClient() client}' feature.
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
	 * Sets the '{@link LocatorType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getOrganization() organization}' feature.
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
	 * Sets the '{@link LocatorType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getActive() active}' feature.
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
	 * Sets the '{@link LocatorType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link LocatorType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link LocatorType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getUpdated() updated}' feature.
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
	 * Sets the '{@link LocatorType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link LocatorType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getSearchKey() searchKey}' feature.
	 * @generated
	 */
	public void setSearchKey(String newSearchKey) {
		searchKey = newSearchKey;
	}

	/**
	 * Returns the value of '<em><b>warehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouse</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouse() {
		return warehouse;
	}

	/**
	 * Sets the '{@link LocatorType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(ReferenceType newWarehouse) {
		warehouse = newWarehouse;
	}

	/**
	 * Returns the value of '<em><b>relativePriority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>relativePriority</b></em>' feature
	 * @generated
	 */
	public Long getRelativePriority() {
		return relativePriority;
	}

	/**
	 * Sets the '{@link LocatorType#getRelativePriority() <em>relativePriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getRelativePriority() relativePriority}' feature.
	 * @generated
	 */
	public void setRelativePriority(Long newRelativePriority) {
		relativePriority = newRelativePriority;
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
	 * Sets the '{@link LocatorType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
	}

	/**
	 * Returns the value of '<em><b>rowX</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rowX</b></em>' feature
	 * @generated
	 */
	public String getRowX() {
		return rowX;
	}

	/**
	 * Sets the '{@link LocatorType#getRowX() <em>rowX</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getRowX() rowX}' feature.
	 * @generated
	 */
	public void setRowX(String newRowX) {
		rowX = newRowX;
	}

	/**
	 * Returns the value of '<em><b>stackY</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>stackY</b></em>' feature
	 * @generated
	 */
	public String getStackY() {
		return stackY;
	}

	/**
	 * Sets the '{@link LocatorType#getStackY() <em>stackY</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getStackY() stackY}' feature.
	 * @generated
	 */
	public void setStackY(String newStackY) {
		stackY = newStackY;
	}

	/**
	 * Returns the value of '<em><b>levelZ</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>levelZ</b></em>' feature
	 * @generated
	 */
	public String getLevelZ() {
		return levelZ;
	}

	/**
	 * Sets the '{@link LocatorType#getLevelZ() <em>levelZ</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getLevelZ() levelZ}' feature.
	 * @generated
	 */
	public void setLevelZ(String newLevelZ) {
		levelZ = newLevelZ;
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
	 * Sets the '{@link LocatorType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	 * Sets the '{@link LocatorType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctVLocationFromAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctVLocationFromAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTrxFullAcctVLocationFromAddressList() {
		return aPRMFinaccTrxFullAcctVLocationFromAddressList;
	}

	/**
	 * Sets the '{@link LocatorType#getAPRMFinaccTrxFullAcctVLocationFromAddressList() <em>aPRMFinaccTrxFullAcctVLocationFromAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getAPRMFinaccTrxFullAcctVLocationFromAddressList() aPRMFinaccTrxFullAcctVLocationFromAddressList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVLocationFromAddressList(
			ReferenceType newAPRMFinaccTrxFullAcctVLocationFromAddressList) {
		aPRMFinaccTrxFullAcctVLocationFromAddressList = newAPRMFinaccTrxFullAcctVLocationFromAddressList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctVLocationToAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctVLocationToAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTrxFullAcctVLocationToAddressList() {
		return aPRMFinaccTrxFullAcctVLocationToAddressList;
	}

	/**
	 * Sets the '{@link LocatorType#getAPRMFinaccTrxFullAcctVLocationToAddressList() <em>aPRMFinaccTrxFullAcctVLocationToAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getAPRMFinaccTrxFullAcctVLocationToAddressList() aPRMFinaccTrxFullAcctVLocationToAddressList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVLocationToAddressList(
			ReferenceType newAPRMFinaccTrxFullAcctVLocationToAddressList) {
		aPRMFinaccTrxFullAcctVLocationToAddressList = newAPRMFinaccTrxFullAcctVLocationToAddressList;
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
	 * Sets the '{@link LocatorType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
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
	 * Sets the '{@link LocatorType#getFinancialMgmtAssetList() <em>financialMgmtAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getFinancialMgmtAssetList() financialMgmtAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetList(
			ReferenceType newFinancialMgmtAssetList) {
		financialMgmtAssetList = newFinancialMgmtAssetList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingGlobalUseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingGlobalUseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingGlobalUseList() {
		return manufacturingGlobalUseList;
	}

	/**
	 * Sets the '{@link LocatorType#getManufacturingGlobalUseList() <em>manufacturingGlobalUseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getManufacturingGlobalUseList() manufacturingGlobalUseList}' feature.
	 * @generated
	 */
	public void setManufacturingGlobalUseList(
			ReferenceType newManufacturingGlobalUseList) {
		manufacturingGlobalUseList = newManufacturingGlobalUseList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingProductionLineList() {
		return manufacturingProductionLineList;
	}

	/**
	 * Sets the '{@link LocatorType#getManufacturingProductionLineList() <em>manufacturingProductionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getManufacturingProductionLineList() manufacturingProductionLineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLineList(
			ReferenceType newManufacturingProductionLineList) {
		manufacturingProductionLineList = newManufacturingProductionLineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingToolsetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingToolsetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingToolsetList() {
		return manufacturingToolsetList;
	}

	/**
	 * Sets the '{@link LocatorType#getManufacturingToolsetList() <em>manufacturingToolsetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getManufacturingToolsetList() manufacturingToolsetList}' feature.
	 * @generated
	 */
	public void setManufacturingToolsetList(
			ReferenceType newManufacturingToolsetList) {
		manufacturingToolsetList = newManufacturingToolsetList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumptionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumptionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInternalConsumptionLineList() {
		return materialMgmtInternalConsumptionLineList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtInternalConsumptionLineList() <em>materialMgmtInternalConsumptionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtInternalConsumptionLineList() materialMgmtInternalConsumptionLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumptionLineList(
			ReferenceType newMaterialMgmtInternalConsumptionLineList) {
		materialMgmtInternalConsumptionLineList = newMaterialMgmtInternalConsumptionLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInternalMovementLineList() {
		return materialMgmtInternalMovementLineList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtInternalMovementLineList() <em>materialMgmtInternalMovementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtInternalMovementLineList() materialMgmtInternalMovementLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLineList(
			ReferenceType newMaterialMgmtInternalMovementLineList) {
		materialMgmtInternalMovementLineList = newMaterialMgmtInternalMovementLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementLineNewStorageBinList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementLineNewStorageBinList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInternalMovementLineNewStorageBinList() {
		return materialMgmtInternalMovementLineNewStorageBinList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtInternalMovementLineNewStorageBinList() <em>materialMgmtInternalMovementLineNewStorageBinList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtInternalMovementLineNewStorageBinList() materialMgmtInternalMovementLineNewStorageBinList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLineNewStorageBinList(
			ReferenceType newMaterialMgmtInternalMovementLineNewStorageBinList) {
		materialMgmtInternalMovementLineNewStorageBinList = newMaterialMgmtInternalMovementLineNewStorageBinList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInventoryCountLineList() {
		return materialMgmtInventoryCountLineList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtInventoryCountLineList() <em>materialMgmtInventoryCountLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtInventoryCountLineList() materialMgmtInventoryCountLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountLineList(
			ReferenceType newMaterialMgmtInventoryCountLineList) {
		materialMgmtInventoryCountLineList = newMaterialMgmtInventoryCountLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtMaterialTransactionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtMaterialTransactionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtMaterialTransactionList() {
		return materialMgmtMaterialTransactionList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtMaterialTransactionList() <em>materialMgmtMaterialTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtMaterialTransactionList() materialMgmtMaterialTransactionList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtMaterialTransactionList(
			ReferenceType newMaterialMgmtMaterialTransactionList) {
		materialMgmtMaterialTransactionList = newMaterialMgmtMaterialTransactionList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionPlanList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionPlanList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtProductionPlanList() {
		return materialMgmtProductionPlanList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtProductionPlanList() <em>materialMgmtProductionPlanList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtProductionPlanList() materialMgmtProductionPlanList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionPlanList(
			ReferenceType newMaterialMgmtProductionPlanList) {
		materialMgmtProductionPlanList = newMaterialMgmtProductionPlanList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutLineList() {
		return materialMgmtShipmentInOutLineList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtShipmentInOutLineList() <em>materialMgmtShipmentInOutLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtShipmentInOutLineList() materialMgmtShipmentInOutLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutLineList(
			ReferenceType newMaterialMgmtShipmentInOutLineList) {
		materialMgmtShipmentInOutLineList = newMaterialMgmtShipmentInOutLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStorageDetailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStorageDetailList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtStorageDetailList() {
		return materialMgmtStorageDetailList;
	}

	/**
	 * Sets the '{@link LocatorType#getMaterialMgmtStorageDetailList() <em>materialMgmtStorageDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getMaterialMgmtStorageDetailList() materialMgmtStorageDetailList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStorageDetailList(
			ReferenceType newMaterialMgmtStorageDetailList) {
		materialMgmtStorageDetailList = newMaterialMgmtStorageDetailList;
	}

	/**
	 * Returns the value of '<em><b>productList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductList() {
		return productList;
	}

	/**
	 * Sets the '{@link LocatorType#getProductList() <em>productList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getProductList() productList}' feature.
	 * @generated
	 */
	public void setProductList(ReferenceType newProductList) {
		productList = newProductList;
	}

	/**
	 * Returns the value of '<em><b>productOrgList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productOrgList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductOrgList() {
		return productOrgList;
	}

	/**
	 * Sets the '{@link LocatorType#getProductOrgList() <em>productOrgList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getProductOrgList() productOrgList}' feature.
	 * @generated
	 */
	public void setProductOrgList(ReferenceType newProductOrgList) {
		productOrgList = newProductOrgList;
	}

	/**
	 * Returns the value of '<em><b>productStockViewList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productStockViewList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductStockViewList() {
		return productStockViewList;
	}

	/**
	 * Sets the '{@link LocatorType#getProductStockViewList() <em>productStockViewList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getProductStockViewList() productStockViewList}' feature.
	 * @generated
	 */
	public void setProductStockViewList(ReferenceType newProductStockViewList) {
		productStockViewList = newProductStockViewList;
	}

	/**
	 * Returns the value of '<em><b>projectIssueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectIssueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectIssueList() {
		return projectIssueList;
	}

	/**
	 * Sets the '{@link LocatorType#getProjectIssueList() <em>projectIssueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getProjectIssueList() projectIssueList}' feature.
	 * @generated
	 */
	public void setProjectIssueList(ReferenceType newProjectIssueList) {
		projectIssueList = newProjectIssueList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialReceiptPickEditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialReceiptPickEditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialReceiptPickEditList() {
		return returnMaterialReceiptPickEditList;
	}

	/**
	 * Sets the '{@link LocatorType#getReturnMaterialReceiptPickEditList() <em>returnMaterialReceiptPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getReturnMaterialReceiptPickEditList() returnMaterialReceiptPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialReceiptPickEditList(
			ReferenceType newReturnMaterialReceiptPickEditList) {
		returnMaterialReceiptPickEditList = newReturnMaterialReceiptPickEditList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialShipmentPickEditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialShipmentPickEditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialShipmentPickEditList() {
		return returnMaterialShipmentPickEditList;
	}

	/**
	 * Sets the '{@link LocatorType#getReturnMaterialShipmentPickEditList() <em>returnMaterialShipmentPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getReturnMaterialShipmentPickEditList() returnMaterialShipmentPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialShipmentPickEditList(
			ReferenceType newReturnMaterialShipmentPickEditList) {
		returnMaterialShipmentPickEditList = newReturnMaterialShipmentPickEditList;
	}

	/**
	 * Returns the value of '<em><b>warehouseMReturnlocatorIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseMReturnlocatorIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouseMReturnlocatorIDList() {
		return warehouseMReturnlocatorIDList;
	}

	/**
	 * Sets the '{@link LocatorType#getWarehouseMReturnlocatorIDList() <em>warehouseMReturnlocatorIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getWarehouseMReturnlocatorIDList() warehouseMReturnlocatorIDList}' feature.
	 * @generated
	 */
	public void setWarehouseMReturnlocatorIDList(
			ReferenceType newWarehouseMReturnlocatorIDList) {
		warehouseMReturnlocatorIDList = newWarehouseMReturnlocatorIDList;
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
	 * Sets the '{@link LocatorType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getId1() id1}' feature.
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
	 * Sets the '{@link LocatorType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link LocatorType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#isReference() reference}' feature.
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
	public List<LocatorTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link LocatorType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocatorType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<LocatorTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "LocatorType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
