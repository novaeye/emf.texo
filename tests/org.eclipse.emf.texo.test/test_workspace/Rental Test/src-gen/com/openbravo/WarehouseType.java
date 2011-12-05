package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>WarehouseType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class WarehouseType {

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
	private ReferenceType locationAddress = null;

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
	private Boolean shipmentVehicle = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String shipperCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long fromDocumentNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long toDocumentNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnlocator = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDAlertList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDUserDefaultWarehouseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType externalPOSList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private LocatorListType locatorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInventoryCountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtStoragePendingList = null;

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
	private ReferenceType productByPriceAndWarehouseList = null;

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
	private ReferenceType resourceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseAccountsListType warehouseAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseShipperListType warehouseShipperList = null;

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
	private List<WarehouseTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<WarehouseTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link WarehouseType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getId() id}' feature.
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
	 * Sets the '{@link WarehouseType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getClient() client}' feature.
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
	 * Sets the '{@link WarehouseType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getOrganization() organization}' feature.
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
	 * Sets the '{@link WarehouseType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getActive() active}' feature.
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
	 * Sets the '{@link WarehouseType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link WarehouseType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link WarehouseType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getUpdated() updated}' feature.
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
	 * Sets the '{@link WarehouseType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link WarehouseType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getSearchKey() searchKey}' feature.
	 * @generated
	 */
	public void setSearchKey(String newSearchKey) {
		searchKey = newSearchKey;
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
	 * Sets the '{@link WarehouseType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getName() name}' feature.
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
	 * Sets the '{@link WarehouseType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link WarehouseType#getLocationAddress() <em>locationAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getLocationAddress() locationAddress}' feature.
	 * @generated
	 */
	public void setLocationAddress(ReferenceType newLocationAddress) {
		locationAddress = newLocationAddress;
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
	 * Sets the '{@link WarehouseType#getStorageBinSeparator() <em>storageBinSeparator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getStorageBinSeparator() storageBinSeparator}' feature.
	 * @generated
	 */
	public void setStorageBinSeparator(String newStorageBinSeparator) {
		storageBinSeparator = newStorageBinSeparator;
	}

	/**
	 * Returns the value of '<em><b>shipmentVehicle</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shipmentVehicle</b></em>' feature
	 * @generated
	 */
	public Boolean getShipmentVehicle() {
		return shipmentVehicle;
	}

	/**
	 * Sets the '{@link WarehouseType#getShipmentVehicle() <em>shipmentVehicle</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getShipmentVehicle() shipmentVehicle}' feature.
	 * @generated
	 */
	public void setShipmentVehicle(Boolean newShipmentVehicle) {
		shipmentVehicle = newShipmentVehicle;
	}

	/**
	 * Returns the value of '<em><b>shipperCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shipperCode</b></em>' feature
	 * @generated
	 */
	public String getShipperCode() {
		return shipperCode;
	}

	/**
	 * Sets the '{@link WarehouseType#getShipperCode() <em>shipperCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getShipperCode() shipperCode}' feature.
	 * @generated
	 */
	public void setShipperCode(String newShipperCode) {
		shipperCode = newShipperCode;
	}

	/**
	 * Returns the value of '<em><b>fromDocumentNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fromDocumentNo</b></em>' feature
	 * @generated
	 */
	public Long getFromDocumentNo() {
		return fromDocumentNo;
	}

	/**
	 * Sets the '{@link WarehouseType#getFromDocumentNo() <em>fromDocumentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getFromDocumentNo() fromDocumentNo}' feature.
	 * @generated
	 */
	public void setFromDocumentNo(Long newFromDocumentNo) {
		fromDocumentNo = newFromDocumentNo;
	}

	/**
	 * Returns the value of '<em><b>toDocumentNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>toDocumentNo</b></em>' feature
	 * @generated
	 */
	public Long getToDocumentNo() {
		return toDocumentNo;
	}

	/**
	 * Sets the '{@link WarehouseType#getToDocumentNo() <em>toDocumentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getToDocumentNo() toDocumentNo}' feature.
	 * @generated
	 */
	public void setToDocumentNo(Long newToDocumentNo) {
		toDocumentNo = newToDocumentNo;
	}

	/**
	 * Returns the value of '<em><b>returnlocator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnlocator</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnlocator() {
		return returnlocator;
	}

	/**
	 * Sets the '{@link WarehouseType#getReturnlocator() <em>returnlocator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getReturnlocator() returnlocator}' feature.
	 * @generated
	 */
	public void setReturnlocator(ReferenceType newReturnlocator) {
		returnlocator = newReturnlocator;
	}

	/**
	 * Returns the value of '<em><b>aDAlertList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADAlertList() {
		return aDAlertList;
	}

	/**
	 * Sets the '{@link WarehouseType#getADAlertList() <em>aDAlertList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getADAlertList() aDAlertList}' feature.
	 * @generated
	 */
	public void setADAlertList(ReferenceType newADAlertList) {
		aDAlertList = newADAlertList;
	}

	/**
	 * Returns the value of '<em><b>aDUserDefaultWarehouseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserDefaultWarehouseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADUserDefaultWarehouseList() {
		return aDUserDefaultWarehouseList;
	}

	/**
	 * Sets the '{@link WarehouseType#getADUserDefaultWarehouseList() <em>aDUserDefaultWarehouseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getADUserDefaultWarehouseList() aDUserDefaultWarehouseList}' feature.
	 * @generated
	 */
	public void setADUserDefaultWarehouseList(
			ReferenceType newADUserDefaultWarehouseList) {
		aDUserDefaultWarehouseList = newADUserDefaultWarehouseList;
	}

	/**
	 * Returns the value of '<em><b>externalPOSList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExternalPOSList() {
		return externalPOSList;
	}

	/**
	 * Sets the '{@link WarehouseType#getExternalPOSList() <em>externalPOSList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getExternalPOSList() externalPOSList}' feature.
	 * @generated
	 */
	public void setExternalPOSList(ReferenceType newExternalPOSList) {
		externalPOSList = newExternalPOSList;
	}

	/**
	 * Returns the value of '<em><b>locatorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locatorList</b></em>' feature
	 * @generated
	 */
	public LocatorListType getLocatorList() {
		return locatorList;
	}

	/**
	 * Sets the '{@link WarehouseType#getLocatorList() <em>locatorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getLocatorList() locatorList}' feature.
	 * @generated
	 */
	public void setLocatorList(LocatorListType newLocatorList) {
		locatorList = newLocatorList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInventoryCountList() {
		return materialMgmtInventoryCountList;
	}

	/**
	 * Sets the '{@link WarehouseType#getMaterialMgmtInventoryCountList() <em>materialMgmtInventoryCountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getMaterialMgmtInventoryCountList() materialMgmtInventoryCountList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountList(
			ReferenceType newMaterialMgmtInventoryCountList) {
		materialMgmtInventoryCountList = newMaterialMgmtInventoryCountList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutList() {
		return materialMgmtShipmentInOutList;
	}

	/**
	 * Sets the '{@link WarehouseType#getMaterialMgmtShipmentInOutList() <em>materialMgmtShipmentInOutList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getMaterialMgmtShipmentInOutList() materialMgmtShipmentInOutList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutList(
			ReferenceType newMaterialMgmtShipmentInOutList) {
		materialMgmtShipmentInOutList = newMaterialMgmtShipmentInOutList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStoragePendingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStoragePendingList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtStoragePendingList() {
		return materialMgmtStoragePendingList;
	}

	/**
	 * Sets the '{@link WarehouseType#getMaterialMgmtStoragePendingList() <em>materialMgmtStoragePendingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getMaterialMgmtStoragePendingList() materialMgmtStoragePendingList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStoragePendingList(
			ReferenceType newMaterialMgmtStoragePendingList) {
		materialMgmtStoragePendingList = newMaterialMgmtStoragePendingList;
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
	 * Sets the '{@link WarehouseType#getOrderList() <em>orderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getOrderList() orderList}' feature.
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
	 * Sets the '{@link WarehouseType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>productByPriceAndWarehouseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productByPriceAndWarehouseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductByPriceAndWarehouseList() {
		return productByPriceAndWarehouseList;
	}

	/**
	 * Sets the '{@link WarehouseType#getProductByPriceAndWarehouseList() <em>productByPriceAndWarehouseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getProductByPriceAndWarehouseList() productByPriceAndWarehouseList}' feature.
	 * @generated
	 */
	public void setProductByPriceAndWarehouseList(
			ReferenceType newProductByPriceAndWarehouseList) {
		productByPriceAndWarehouseList = newProductByPriceAndWarehouseList;
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
	 * Sets the '{@link WarehouseType#getProjectList() <em>projectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getProjectList() projectList}' feature.
	 * @generated
	 */
	public void setProjectList(ReferenceType newProjectList) {
		projectList = newProjectList;
	}

	/**
	 * Returns the value of '<em><b>resourceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getResourceList() {
		return resourceList;
	}

	/**
	 * Sets the '{@link WarehouseType#getResourceList() <em>resourceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getResourceList() resourceList}' feature.
	 * @generated
	 */
	public void setResourceList(ReferenceType newResourceList) {
		resourceList = newResourceList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetList() {
		return timeAndExpenseSheetList;
	}

	/**
	 * Sets the '{@link WarehouseType#getTimeAndExpenseSheetList() <em>timeAndExpenseSheetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getTimeAndExpenseSheetList() timeAndExpenseSheetList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetList(
			ReferenceType newTimeAndExpenseSheetList) {
		timeAndExpenseSheetList = newTimeAndExpenseSheetList;
	}

	/**
	 * Returns the value of '<em><b>warehouseAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccountsList</b></em>' feature
	 * @generated
	 */
	public WarehouseAccountsListType getWarehouseAccountsList() {
		return warehouseAccountsList;
	}

	/**
	 * Sets the '{@link WarehouseType#getWarehouseAccountsList() <em>warehouseAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getWarehouseAccountsList() warehouseAccountsList}' feature.
	 * @generated
	 */
	public void setWarehouseAccountsList(
			WarehouseAccountsListType newWarehouseAccountsList) {
		warehouseAccountsList = newWarehouseAccountsList;
	}

	/**
	 * Returns the value of '<em><b>warehouseShipperList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseShipperList</b></em>' feature
	 * @generated
	 */
	public WarehouseShipperListType getWarehouseShipperList() {
		return warehouseShipperList;
	}

	/**
	 * Sets the '{@link WarehouseType#getWarehouseShipperList() <em>warehouseShipperList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getWarehouseShipperList() warehouseShipperList}' feature.
	 * @generated
	 */
	public void setWarehouseShipperList(
			WarehouseShipperListType newWarehouseShipperList) {
		warehouseShipperList = newWarehouseShipperList;
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
	 * Sets the '{@link WarehouseType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getId1() id1}' feature.
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
	 * Sets the '{@link WarehouseType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link WarehouseType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#isReference() reference}' feature.
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
	public List<WarehouseTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link WarehouseType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link WarehouseType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<WarehouseTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "WarehouseType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
