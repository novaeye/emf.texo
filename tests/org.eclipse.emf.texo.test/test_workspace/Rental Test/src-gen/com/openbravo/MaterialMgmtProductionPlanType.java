package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtProductionPlanType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtProductionPlanType {

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
	private ReferenceType production = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long lineNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType product = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal productionQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType storageBin = null;

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
	private Decimal conversionRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal costCenterUse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType wRPhase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long requiredQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean processed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long rejectedQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal processQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String processUnit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean createStandards = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal estimatedCost = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType costCenterVersion = null;

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
	private ManufacturingProductionLineListType manufacturingProductionLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunEmployeeListType manufacturingProductionRunEmployeeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunIndirectCostsListType manufacturingProductionRunIndirectCostsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunInvoiceLineListType manufacturingProductionRunInvoiceLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunMachineListType manufacturingProductionRunMachineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunToolsetListType manufacturingProductionRunToolsetList = null;

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
	private List<MaterialMgmtProductionPlanTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<MaterialMgmtProductionPlanTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getId() id}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getClient() client}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getOrganization() organization}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getActive() active}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getUpdated() updated}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>production</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>production</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProduction() {
		return production;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getProduction() <em>production</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getProduction() production}' feature.
	 * @generated
	 */
	public void setProduction(ReferenceType newProduction) {
		production = newProduction;
	}

	/**
	 * Returns the value of '<em><b>lineNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lineNo</b></em>' feature
	 * @generated
	 */
	public Long getLineNo() {
		return lineNo;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>product</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>product</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProduct() {
		return product;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
	}

	/**
	 * Returns the value of '<em><b>productionQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productionQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getProductionQuantity() {
		return productionQuantity;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getProductionQuantity() <em>productionQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getProductionQuantity() productionQuantity}' feature.
	 * @generated
	 */
	public void setProductionQuantity(Decimal newProductionQuantity) {
		productionQuantity = newProductionQuantity;
	}

	/**
	 * Returns the value of '<em><b>storageBin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>storageBin</b></em>' feature
	 * @generated
	 */
	public ReferenceType getStorageBin() {
		return storageBin;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getStorageBin() <em>storageBin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getStorageBin() storageBin}' feature.
	 * @generated
	 */
	public void setStorageBin(ReferenceType newStorageBin) {
		storageBin = newStorageBin;
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>conversionRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>conversionRate</b></em>' feature
	 * @generated
	 */
	public Decimal getConversionRate() {
		return conversionRate;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getConversionRate() <em>conversionRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getConversionRate() conversionRate}' feature.
	 * @generated
	 */
	public void setConversionRate(Decimal newConversionRate) {
		conversionRate = newConversionRate;
	}

	/**
	 * Returns the value of '<em><b>costCenterUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costCenterUse</b></em>' feature
	 * @generated
	 */
	public Decimal getCostCenterUse() {
		return costCenterUse;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getCostCenterUse() <em>costCenterUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getCostCenterUse() costCenterUse}' feature.
	 * @generated
	 */
	public void setCostCenterUse(Decimal newCostCenterUse) {
		costCenterUse = newCostCenterUse;
	}

	/**
	 * Returns the value of '<em><b>wRPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>wRPhase</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWRPhase() {
		return wRPhase;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getWRPhase() <em>wRPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getWRPhase() wRPhase}' feature.
	 * @generated
	 */
	public void setWRPhase(ReferenceType newWRPhase) {
		wRPhase = newWRPhase;
	}

	/**
	 * Returns the value of '<em><b>requiredQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>requiredQuantity</b></em>' feature
	 * @generated
	 */
	public Long getRequiredQuantity() {
		return requiredQuantity;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getRequiredQuantity() <em>requiredQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getRequiredQuantity() requiredQuantity}' feature.
	 * @generated
	 */
	public void setRequiredQuantity(Long newRequiredQuantity) {
		requiredQuantity = newRequiredQuantity;
	}

	/**
	 * Returns the value of '<em><b>processed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processed</b></em>' feature
	 * @generated
	 */
	public Boolean getProcessed() {
		return processed;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getProcessed() processed}' feature.
	 * @generated
	 */
	public void setProcessed(Boolean newProcessed) {
		processed = newProcessed;
	}

	/**
	 * Returns the value of '<em><b>rejectedQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rejectedQuantity</b></em>' feature
	 * @generated
	 */
	public Long getRejectedQuantity() {
		return rejectedQuantity;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getRejectedQuantity() <em>rejectedQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getRejectedQuantity() rejectedQuantity}' feature.
	 * @generated
	 */
	public void setRejectedQuantity(Long newRejectedQuantity) {
		rejectedQuantity = newRejectedQuantity;
	}

	/**
	 * Returns the value of '<em><b>processQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getProcessQuantity() {
		return processQuantity;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getProcessQuantity() <em>processQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getProcessQuantity() processQuantity}' feature.
	 * @generated
	 */
	public void setProcessQuantity(Decimal newProcessQuantity) {
		processQuantity = newProcessQuantity;
	}

	/**
	 * Returns the value of '<em><b>processUnit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processUnit</b></em>' feature
	 * @generated
	 */
	public String getProcessUnit() {
		return processUnit;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getProcessUnit() <em>processUnit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getProcessUnit() processUnit}' feature.
	 * @generated
	 */
	public void setProcessUnit(String newProcessUnit) {
		processUnit = newProcessUnit;
	}

	/**
	 * Returns the value of '<em><b>createStandards</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createStandards</b></em>' feature
	 * @generated
	 */
	public Boolean getCreateStandards() {
		return createStandards;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getCreateStandards() <em>createStandards</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getCreateStandards() createStandards}' feature.
	 * @generated
	 */
	public void setCreateStandards(Boolean newCreateStandards) {
		createStandards = newCreateStandards;
	}

	/**
	 * Returns the value of '<em><b>estimatedCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>estimatedCost</b></em>' feature
	 * @generated
	 */
	public Decimal getEstimatedCost() {
		return estimatedCost;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getEstimatedCost() <em>estimatedCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getEstimatedCost() estimatedCost}' feature.
	 * @generated
	 */
	public void setEstimatedCost(Decimal newEstimatedCost) {
		estimatedCost = newEstimatedCost;
	}

	/**
	 * Returns the value of '<em><b>costCenterVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costCenterVersion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCostCenterVersion() {
		return costCenterVersion;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getCostCenterVersion() <em>costCenterVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getCostCenterVersion() costCenterVersion}' feature.
	 * @generated
	 */
	public void setCostCenterVersion(ReferenceType newCostCenterVersion) {
		costCenterVersion = newCostCenterVersion;
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getOutsourced() <em>outsourced</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getOutsourced() outsourced}' feature.
	 * @generated
	 */
	public void setOutsourced(Boolean newOutsourced) {
		outsourced = newOutsourced;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionLineList</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionLineListType getManufacturingProductionLineList() {
		return manufacturingProductionLineList;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionLineList() <em>manufacturingProductionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionLineList() manufacturingProductionLineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLineList(
			ManufacturingProductionLineListType newManufacturingProductionLineList) {
		manufacturingProductionLineList = newManufacturingProductionLineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunEmployeeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunEmployeeList</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunEmployeeListType getManufacturingProductionRunEmployeeList() {
		return manufacturingProductionRunEmployeeList;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunEmployeeList() <em>manufacturingProductionRunEmployeeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunEmployeeList() manufacturingProductionRunEmployeeList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunEmployeeList(
			ManufacturingProductionRunEmployeeListType newManufacturingProductionRunEmployeeList) {
		manufacturingProductionRunEmployeeList = newManufacturingProductionRunEmployeeList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunIndirectCostsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunIndirectCostsList</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunIndirectCostsListType getManufacturingProductionRunIndirectCostsList() {
		return manufacturingProductionRunIndirectCostsList;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunIndirectCostsList() <em>manufacturingProductionRunIndirectCostsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunIndirectCostsList() manufacturingProductionRunIndirectCostsList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunIndirectCostsList(
			ManufacturingProductionRunIndirectCostsListType newManufacturingProductionRunIndirectCostsList) {
		manufacturingProductionRunIndirectCostsList = newManufacturingProductionRunIndirectCostsList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunInvoiceLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunInvoiceLineList</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunInvoiceLineListType getManufacturingProductionRunInvoiceLineList() {
		return manufacturingProductionRunInvoiceLineList;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunInvoiceLineList() <em>manufacturingProductionRunInvoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunInvoiceLineList() manufacturingProductionRunInvoiceLineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunInvoiceLineList(
			ManufacturingProductionRunInvoiceLineListType newManufacturingProductionRunInvoiceLineList) {
		manufacturingProductionRunInvoiceLineList = newManufacturingProductionRunInvoiceLineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunMachineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunMachineList</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunMachineListType getManufacturingProductionRunMachineList() {
		return manufacturingProductionRunMachineList;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunMachineList() <em>manufacturingProductionRunMachineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunMachineList() manufacturingProductionRunMachineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunMachineList(
			ManufacturingProductionRunMachineListType newManufacturingProductionRunMachineList) {
		manufacturingProductionRunMachineList = newManufacturingProductionRunMachineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunToolsetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunToolsetList</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunToolsetListType getManufacturingProductionRunToolsetList() {
		return manufacturingProductionRunToolsetList;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunToolsetList() <em>manufacturingProductionRunToolsetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getManufacturingProductionRunToolsetList() manufacturingProductionRunToolsetList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunToolsetList(
			ManufacturingProductionRunToolsetListType newManufacturingProductionRunToolsetList) {
		manufacturingProductionRunToolsetList = newManufacturingProductionRunToolsetList;
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getId1() id1}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link MaterialMgmtProductionPlanType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#isReference() reference}' feature.
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
	public List<MaterialMgmtProductionPlanTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link MaterialMgmtProductionPlanType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtProductionPlanType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<MaterialMgmtProductionPlanTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "MaterialMgmtProductionPlanType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
