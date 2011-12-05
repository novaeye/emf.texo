package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ManufacturingOperationType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ManufacturingOperationType {

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
	private ReferenceType processPlanVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType activity = null;

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
	private Decimal costCenterUseTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal preparationTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal multiplier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long sequenceNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean emptyCellsAreZero = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean globalUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean calculated = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal costCenterCost = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean outsourced = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal outsourcingCost = null;

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
	private ManufacturingOperationEmployeeListType manufacturingOperationEmployeeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationIndirectCostListType manufacturingOperationIndirectCostList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationMachineListType manufacturingOperationMachineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationProductListType manufacturingOperationProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingWorkRequirementOperationList = null;

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
	private List<ManufacturingOperationTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ManufacturingOperationTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ManufacturingOperationType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getId() id}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getClient() client}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getActive() active}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>processPlanVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processPlanVersion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessPlanVersion() {
		return processPlanVersion;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getProcessPlanVersion() <em>processPlanVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getProcessPlanVersion() processPlanVersion}' feature.
	 * @generated
	 */
	public void setProcessPlanVersion(ReferenceType newProcessPlanVersion) {
		processPlanVersion = newProcessPlanVersion;
	}

	/**
	 * Returns the value of '<em><b>activity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activity</b></em>' feature
	 * @generated
	 */
	public ReferenceType getActivity() {
		return activity;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
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
	 * Sets the '{@link ManufacturingOperationType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getSearchKey() searchKey}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getName() name}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>costCenterUseTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costCenterUseTime</b></em>' feature
	 * @generated
	 */
	public Decimal getCostCenterUseTime() {
		return costCenterUseTime;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getCostCenterUseTime() <em>costCenterUseTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getCostCenterUseTime() costCenterUseTime}' feature.
	 * @generated
	 */
	public void setCostCenterUseTime(Decimal newCostCenterUseTime) {
		costCenterUseTime = newCostCenterUseTime;
	}

	/**
	 * Returns the value of '<em><b>preparationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>preparationTime</b></em>' feature
	 * @generated
	 */
	public Decimal getPreparationTime() {
		return preparationTime;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getPreparationTime() <em>preparationTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getPreparationTime() preparationTime}' feature.
	 * @generated
	 */
	public void setPreparationTime(Decimal newPreparationTime) {
		preparationTime = newPreparationTime;
	}

	/**
	 * Returns the value of '<em><b>multiplier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>multiplier</b></em>' feature
	 * @generated
	 */
	public Decimal getMultiplier() {
		return multiplier;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getMultiplier() <em>multiplier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getMultiplier() multiplier}' feature.
	 * @generated
	 */
	public void setMultiplier(Decimal newMultiplier) {
		multiplier = newMultiplier;
	}

	/**
	 * Returns the value of '<em><b>sequenceNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sequenceNumber</b></em>' feature
	 * @generated
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getSequenceNumber() <em>sequenceNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getSequenceNumber() sequenceNumber}' feature.
	 * @generated
	 */
	public void setSequenceNumber(Long newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
	}

	/**
	 * Returns the value of '<em><b>emptyCellsAreZero</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emptyCellsAreZero</b></em>' feature
	 * @generated
	 */
	public Boolean getEmptyCellsAreZero() {
		return emptyCellsAreZero;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getEmptyCellsAreZero() <em>emptyCellsAreZero</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getEmptyCellsAreZero() emptyCellsAreZero}' feature.
	 * @generated
	 */
	public void setEmptyCellsAreZero(Boolean newEmptyCellsAreZero) {
		emptyCellsAreZero = newEmptyCellsAreZero;
	}

	/**
	 * Returns the value of '<em><b>globalUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>globalUse</b></em>' feature
	 * @generated
	 */
	public Boolean getGlobalUse() {
		return globalUse;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getGlobalUse() <em>globalUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getGlobalUse() globalUse}' feature.
	 * @generated
	 */
	public void setGlobalUse(Boolean newGlobalUse) {
		globalUse = newGlobalUse;
	}

	/**
	 * Returns the value of '<em><b>calculated</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>calculated</b></em>' feature
	 * @generated
	 */
	public Boolean getCalculated() {
		return calculated;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getCalculated() <em>calculated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getCalculated() calculated}' feature.
	 * @generated
	 */
	public void setCalculated(Boolean newCalculated) {
		calculated = newCalculated;
	}

	/**
	 * Returns the value of '<em><b>costCenterCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costCenterCost</b></em>' feature
	 * @generated
	 */
	public Decimal getCostCenterCost() {
		return costCenterCost;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getCostCenterCost() <em>costCenterCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getCostCenterCost() costCenterCost}' feature.
	 * @generated
	 */
	public void setCostCenterCost(Decimal newCostCenterCost) {
		costCenterCost = newCostCenterCost;
	}

	/**
	 * Returns the value of '<em><b>outsourced</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>outsourced</b></em>' feature
	 * @generated
	 */
	public Boolean getOutsourced() {
		return outsourced;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getOutsourced() <em>outsourced</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getOutsourced() outsourced}' feature.
	 * @generated
	 */
	public void setOutsourced(Boolean newOutsourced) {
		outsourced = newOutsourced;
	}

	/**
	 * Returns the value of '<em><b>outsourcingCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>outsourcingCost</b></em>' feature
	 * @generated
	 */
	public Decimal getOutsourcingCost() {
		return outsourcingCost;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getOutsourcingCost() <em>outsourcingCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getOutsourcingCost() outsourcingCost}' feature.
	 * @generated
	 */
	public void setOutsourcingCost(Decimal newOutsourcingCost) {
		outsourcingCost = newOutsourcingCost;
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
	 * Sets the '{@link ManufacturingOperationType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationEmployeeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationEmployeeList</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationEmployeeListType getManufacturingOperationEmployeeList() {
		return manufacturingOperationEmployeeList;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getManufacturingOperationEmployeeList() <em>manufacturingOperationEmployeeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getManufacturingOperationEmployeeList() manufacturingOperationEmployeeList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationEmployeeList(
			ManufacturingOperationEmployeeListType newManufacturingOperationEmployeeList) {
		manufacturingOperationEmployeeList = newManufacturingOperationEmployeeList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationIndirectCostList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationIndirectCostList</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationIndirectCostListType getManufacturingOperationIndirectCostList() {
		return manufacturingOperationIndirectCostList;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getManufacturingOperationIndirectCostList() <em>manufacturingOperationIndirectCostList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getManufacturingOperationIndirectCostList() manufacturingOperationIndirectCostList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationIndirectCostList(
			ManufacturingOperationIndirectCostListType newManufacturingOperationIndirectCostList) {
		manufacturingOperationIndirectCostList = newManufacturingOperationIndirectCostList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationMachineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationMachineList</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationMachineListType getManufacturingOperationMachineList() {
		return manufacturingOperationMachineList;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getManufacturingOperationMachineList() <em>manufacturingOperationMachineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getManufacturingOperationMachineList() manufacturingOperationMachineList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationMachineList(
			ManufacturingOperationMachineListType newManufacturingOperationMachineList) {
		manufacturingOperationMachineList = newManufacturingOperationMachineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationProductList</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationProductListType getManufacturingOperationProductList() {
		return manufacturingOperationProductList;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getManufacturingOperationProductList() <em>manufacturingOperationProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getManufacturingOperationProductList() manufacturingOperationProductList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationProductList(
			ManufacturingOperationProductListType newManufacturingOperationProductList) {
		manufacturingOperationProductList = newManufacturingOperationProductList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementOperationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementOperationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingWorkRequirementOperationList() {
		return manufacturingWorkRequirementOperationList;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getManufacturingWorkRequirementOperationList() <em>manufacturingWorkRequirementOperationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getManufacturingWorkRequirementOperationList() manufacturingWorkRequirementOperationList}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementOperationList(
			ReferenceType newManufacturingWorkRequirementOperationList) {
		manufacturingWorkRequirementOperationList = newManufacturingWorkRequirementOperationList;
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
	 * Sets the '{@link ManufacturingOperationType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getId1() id1}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ManufacturingOperationType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#isReference() reference}' feature.
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
	public List<ManufacturingOperationTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ManufacturingOperationType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ManufacturingOperationType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ManufacturingOperationTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ManufacturingOperationType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
