package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingMachineType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingMachineType {

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
	private DateTime purchaseYear = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long lifespan = null;

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
	private ReferenceType costCenter = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType machineCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingCostCenterMachineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMachineCostListType manufacturingMachineCostList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingMachineStationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMaintenanceListType1 manufacturingMaintenanceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingMaintenanceScheduleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingOperationMachineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingProductionRunMachineList = null;

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
	private List<ManufacturingMachineTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ManufacturingMachineTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ManufacturingMachineType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getId() id}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getClient() client}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getActive() active}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>purchaseYear</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>purchaseYear</b></em>' feature
	 * @generated
	 */
	public DateTime getPurchaseYear() {
		return purchaseYear;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getPurchaseYear() <em>purchaseYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getPurchaseYear() purchaseYear}' feature.
	 * @generated
	 */
	public void setPurchaseYear(DateTime newPurchaseYear) {
		purchaseYear = newPurchaseYear;
	}

	/**
	 * Returns the value of '<em><b>lifespan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lifespan</b></em>' feature
	 * @generated
	 */
	public Long getLifespan() {
		return lifespan;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getLifespan() <em>lifespan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getLifespan() lifespan}' feature.
	 * @generated
	 */
	public void setLifespan(Long newLifespan) {
		lifespan = newLifespan;
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
	 * Sets the '{@link ManufacturingMachineType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getSearchKey() searchKey}' feature.
	 * @generated
	 */
	public void setSearchKey(String newSearchKey) {
		searchKey = newSearchKey;
	}

	/**
	 * Returns the value of '<em><b>costCenter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costCenter</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCostCenter() {
		return costCenter;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getCostCenter() <em>costCenter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getCostCenter() costCenter}' feature.
	 * @generated
	 */
	public void setCostCenter(ReferenceType newCostCenter) {
		costCenter = newCostCenter;
	}

	/**
	 * Returns the value of '<em><b>machineCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>machineCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMachineCategory() {
		return machineCategory;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getMachineCategory() <em>machineCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getMachineCategory() machineCategory}' feature.
	 * @generated
	 */
	public void setMachineCategory(ReferenceType newMachineCategory) {
		machineCategory = newMachineCategory;
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostCenterMachineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostCenterMachineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingCostCenterMachineList() {
		return manufacturingCostCenterMachineList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingCostCenterMachineList() <em>manufacturingCostCenterMachineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingCostCenterMachineList() manufacturingCostCenterMachineList}' feature.
	 * @generated
	 */
	public void setManufacturingCostCenterMachineList(
			ReferenceType newManufacturingCostCenterMachineList) {
		manufacturingCostCenterMachineList = newManufacturingCostCenterMachineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineCostList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineCostList</b></em>' feature
	 * @generated
	 */
	public ManufacturingMachineCostListType getManufacturingMachineCostList() {
		return manufacturingMachineCostList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingMachineCostList() <em>manufacturingMachineCostList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingMachineCostList() manufacturingMachineCostList}' feature.
	 * @generated
	 */
	public void setManufacturingMachineCostList(
			ManufacturingMachineCostListType newManufacturingMachineCostList) {
		manufacturingMachineCostList = newManufacturingMachineCostList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineStationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineStationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingMachineStationList() {
		return manufacturingMachineStationList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingMachineStationList() <em>manufacturingMachineStationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingMachineStationList() manufacturingMachineStationList}' feature.
	 * @generated
	 */
	public void setManufacturingMachineStationList(
			ReferenceType newManufacturingMachineStationList) {
		manufacturingMachineStationList = newManufacturingMachineStationList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceList</b></em>' feature
	 * @generated
	 */
	public ManufacturingMaintenanceListType1 getManufacturingMaintenanceList() {
		return manufacturingMaintenanceList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingMaintenanceList() <em>manufacturingMaintenanceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingMaintenanceList() manufacturingMaintenanceList}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceList(
			ManufacturingMaintenanceListType1 newManufacturingMaintenanceList) {
		manufacturingMaintenanceList = newManufacturingMaintenanceList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceScheduleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceScheduleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingMaintenanceScheduleList() {
		return manufacturingMaintenanceScheduleList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingMaintenanceScheduleList() <em>manufacturingMaintenanceScheduleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingMaintenanceScheduleList() manufacturingMaintenanceScheduleList}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceScheduleList(
			ReferenceType newManufacturingMaintenanceScheduleList) {
		manufacturingMaintenanceScheduleList = newManufacturingMaintenanceScheduleList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationMachineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationMachineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingOperationMachineList() {
		return manufacturingOperationMachineList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingOperationMachineList() <em>manufacturingOperationMachineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingOperationMachineList() manufacturingOperationMachineList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationMachineList(
			ReferenceType newManufacturingOperationMachineList) {
		manufacturingOperationMachineList = newManufacturingOperationMachineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunMachineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunMachineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingProductionRunMachineList() {
		return manufacturingProductionRunMachineList;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getManufacturingProductionRunMachineList() <em>manufacturingProductionRunMachineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getManufacturingProductionRunMachineList() manufacturingProductionRunMachineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunMachineList(
			ReferenceType newManufacturingProductionRunMachineList) {
		manufacturingProductionRunMachineList = newManufacturingProductionRunMachineList;
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
	 * Sets the '{@link ManufacturingMachineType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getId1() id1}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ManufacturingMachineType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#isReference() reference}' feature.
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
	public List<ManufacturingMachineTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ManufacturingMachineType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingMachineType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ManufacturingMachineTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ManufacturingMachineType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
