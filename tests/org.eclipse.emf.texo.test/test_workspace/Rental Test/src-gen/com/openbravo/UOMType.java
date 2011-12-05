package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>UOMType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class UOMType {

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
	private DateTime updated = null;

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
	private ReferenceType updatedBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String eDICode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String symbol = null;

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
	private Long standardPrecision = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long costingPrecision = null;

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
	private Boolean breakdown = null;

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
	private ReferenceType approvedVendorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationUOMForVolumeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationUOMForWeightList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationUOMForLengthList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationUOMForTimeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType expenseTypeList = null;

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
	private ReferenceType financialMgmtBudgetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLJournalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineList = null;

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
	private ReferenceType manufacturingOperationProductList = null;

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
	private ReferenceType manufacturingWorkRequirementProductList = null;

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
	private ReferenceType materialMgmtStoragePendingList = null;

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
	private ReferenceType procurementRequisitionLineList = null;

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
	private ReferenceType productStockViewList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productUOMList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType resourceTypeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialOrderPickEditLinesList = null;

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
	private ReferenceType timeAndExpenseSheetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetLineVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private UOMConversionListType uOMConversionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType uOMConversionToUOMList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private UOMTrlListType uOMTrlList = null;

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
	private List<UOMTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<UOMTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link UOMType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getId() id}' feature.
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
	 * Sets the '{@link UOMType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getClient() client}' feature.
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
	 * Sets the '{@link UOMType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getOrganization() organization}' feature.
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
	 * Sets the '{@link UOMType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getActive() active}' feature.
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
	 * Sets the '{@link UOMType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getCreationDate() creationDate}' feature.
	 * @generated
	 */
	public void setCreationDate(DateTime newCreationDate) {
		creationDate = newCreationDate;
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
	 * Sets the '{@link UOMType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getUpdated() updated}' feature.
	 * @generated
	 */
	public void setUpdated(DateTime newUpdated) {
		updated = newUpdated;
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
	 * Sets the '{@link UOMType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getCreatedBy() createdBy}' feature.
	 * @generated
	 */
	public void setCreatedBy(ReferenceType newCreatedBy) {
		createdBy = newCreatedBy;
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
	 * Sets the '{@link UOMType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>eDICode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>eDICode</b></em>' feature
	 * @generated
	 */
	public String getEDICode() {
		return eDICode;
	}

	/**
	 * Sets the '{@link UOMType#getEDICode() <em>eDICode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getEDICode() eDICode}' feature.
	 * @generated
	 */
	public void setEDICode(String newEDICode) {
		eDICode = newEDICode;
	}

	/**
	 * Returns the value of '<em><b>symbol</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>symbol</b></em>' feature
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * Sets the '{@link UOMType#getSymbol() <em>symbol</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getSymbol() symbol}' feature.
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		symbol = newSymbol;
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
	 * Sets the '{@link UOMType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getName() name}' feature.
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
	 * Sets the '{@link UOMType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>standardPrecision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>standardPrecision</b></em>' feature
	 * @generated
	 */
	public Long getStandardPrecision() {
		return standardPrecision;
	}

	/**
	 * Sets the '{@link UOMType#getStandardPrecision() <em>standardPrecision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getStandardPrecision() standardPrecision}' feature.
	 * @generated
	 */
	public void setStandardPrecision(Long newStandardPrecision) {
		standardPrecision = newStandardPrecision;
	}

	/**
	 * Returns the value of '<em><b>costingPrecision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costingPrecision</b></em>' feature
	 * @generated
	 */
	public Long getCostingPrecision() {
		return costingPrecision;
	}

	/**
	 * Sets the '{@link UOMType#getCostingPrecision() <em>costingPrecision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getCostingPrecision() costingPrecision}' feature.
	 * @generated
	 */
	public void setCostingPrecision(Long newCostingPrecision) {
		costingPrecision = newCostingPrecision;
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
	 * Sets the '{@link UOMType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
	}

	/**
	 * Returns the value of '<em><b>breakdown</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>breakdown</b></em>' feature
	 * @generated
	 */
	public Boolean getBreakdown() {
		return breakdown;
	}

	/**
	 * Sets the '{@link UOMType#getBreakdown() <em>breakdown</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getBreakdown() breakdown}' feature.
	 * @generated
	 */
	public void setBreakdown(Boolean newBreakdown) {
		breakdown = newBreakdown;
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
	 * Sets the '{@link UOMType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	 * Sets the '{@link UOMType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>approvedVendorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getApprovedVendorList() {
		return approvedVendorList;
	}

	/**
	 * Sets the '{@link UOMType#getApprovedVendorList() <em>approvedVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getApprovedVendorList() approvedVendorList}' feature.
	 * @generated
	 */
	public void setApprovedVendorList(ReferenceType newApprovedVendorList) {
		approvedVendorList = newApprovedVendorList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationUOMForVolumeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationUOMForVolumeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationUOMForVolumeList() {
		return clientInformationUOMForVolumeList;
	}

	/**
	 * Sets the '{@link UOMType#getClientInformationUOMForVolumeList() <em>clientInformationUOMForVolumeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getClientInformationUOMForVolumeList() clientInformationUOMForVolumeList}' feature.
	 * @generated
	 */
	public void setClientInformationUOMForVolumeList(
			ReferenceType newClientInformationUOMForVolumeList) {
		clientInformationUOMForVolumeList = newClientInformationUOMForVolumeList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationUOMForWeightList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationUOMForWeightList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationUOMForWeightList() {
		return clientInformationUOMForWeightList;
	}

	/**
	 * Sets the '{@link UOMType#getClientInformationUOMForWeightList() <em>clientInformationUOMForWeightList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getClientInformationUOMForWeightList() clientInformationUOMForWeightList}' feature.
	 * @generated
	 */
	public void setClientInformationUOMForWeightList(
			ReferenceType newClientInformationUOMForWeightList) {
		clientInformationUOMForWeightList = newClientInformationUOMForWeightList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationUOMForLengthList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationUOMForLengthList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationUOMForLengthList() {
		return clientInformationUOMForLengthList;
	}

	/**
	 * Sets the '{@link UOMType#getClientInformationUOMForLengthList() <em>clientInformationUOMForLengthList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getClientInformationUOMForLengthList() clientInformationUOMForLengthList}' feature.
	 * @generated
	 */
	public void setClientInformationUOMForLengthList(
			ReferenceType newClientInformationUOMForLengthList) {
		clientInformationUOMForLengthList = newClientInformationUOMForLengthList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationUOMForTimeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationUOMForTimeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationUOMForTimeList() {
		return clientInformationUOMForTimeList;
	}

	/**
	 * Sets the '{@link UOMType#getClientInformationUOMForTimeList() <em>clientInformationUOMForTimeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getClientInformationUOMForTimeList() clientInformationUOMForTimeList}' feature.
	 * @generated
	 */
	public void setClientInformationUOMForTimeList(
			ReferenceType newClientInformationUOMForTimeList) {
		clientInformationUOMForTimeList = newClientInformationUOMForTimeList;
	}

	/**
	 * Returns the value of '<em><b>expenseTypeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseTypeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExpenseTypeList() {
		return expenseTypeList;
	}

	/**
	 * Sets the '{@link UOMType#getExpenseTypeList() <em>expenseTypeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getExpenseTypeList() expenseTypeList}' feature.
	 * @generated
	 */
	public void setExpenseTypeList(ReferenceType newExpenseTypeList) {
		expenseTypeList = newExpenseTypeList;
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
	 * Sets the '{@link UOMType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
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
	 * Sets the '{@link UOMType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLJournalLineList() {
		return financialMgmtGLJournalLineList;
	}

	/**
	 * Sets the '{@link UOMType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineList() {
		return invoiceLineList;
	}

	/**
	 * Sets the '{@link UOMType#getInvoiceLineList() <em>invoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getInvoiceLineList() invoiceLineList}' feature.
	 * @generated
	 */
	public void setInvoiceLineList(ReferenceType newInvoiceLineList) {
		invoiceLineList = newInvoiceLineList;
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
	 * Sets the '{@link UOMType#getManufacturingGlobalUseList() <em>manufacturingGlobalUseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getManufacturingGlobalUseList() manufacturingGlobalUseList}' feature.
	 * @generated
	 */
	public void setManufacturingGlobalUseList(
			ReferenceType newManufacturingGlobalUseList) {
		manufacturingGlobalUseList = newManufacturingGlobalUseList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingOperationProductList() {
		return manufacturingOperationProductList;
	}

	/**
	 * Sets the '{@link UOMType#getManufacturingOperationProductList() <em>manufacturingOperationProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getManufacturingOperationProductList() manufacturingOperationProductList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationProductList(
			ReferenceType newManufacturingOperationProductList) {
		manufacturingOperationProductList = newManufacturingOperationProductList;
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
	 * Sets the '{@link UOMType#getManufacturingProductionLineList() <em>manufacturingProductionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getManufacturingProductionLineList() manufacturingProductionLineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLineList(
			ReferenceType newManufacturingProductionLineList) {
		manufacturingProductionLineList = newManufacturingProductionLineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingWorkRequirementProductList() {
		return manufacturingWorkRequirementProductList;
	}

	/**
	 * Sets the '{@link UOMType#getManufacturingWorkRequirementProductList() <em>manufacturingWorkRequirementProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getManufacturingWorkRequirementProductList() manufacturingWorkRequirementProductList}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementProductList(
			ReferenceType newManufacturingWorkRequirementProductList) {
		manufacturingWorkRequirementProductList = newManufacturingWorkRequirementProductList;
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
	 * Sets the '{@link UOMType#getMaterialMgmtInternalConsumptionLineList() <em>materialMgmtInternalConsumptionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtInternalConsumptionLineList() materialMgmtInternalConsumptionLineList}' feature.
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
	 * Sets the '{@link UOMType#getMaterialMgmtInternalMovementLineList() <em>materialMgmtInternalMovementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtInternalMovementLineList() materialMgmtInternalMovementLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLineList(
			ReferenceType newMaterialMgmtInternalMovementLineList) {
		materialMgmtInternalMovementLineList = newMaterialMgmtInternalMovementLineList;
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
	 * Sets the '{@link UOMType#getMaterialMgmtInventoryCountLineList() <em>materialMgmtInventoryCountLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtInventoryCountLineList() materialMgmtInventoryCountLineList}' feature.
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
	 * Sets the '{@link UOMType#getMaterialMgmtMaterialTransactionList() <em>materialMgmtMaterialTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtMaterialTransactionList() materialMgmtMaterialTransactionList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtMaterialTransactionList(
			ReferenceType newMaterialMgmtMaterialTransactionList) {
		materialMgmtMaterialTransactionList = newMaterialMgmtMaterialTransactionList;
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
	 * Sets the '{@link UOMType#getMaterialMgmtShipmentInOutLineList() <em>materialMgmtShipmentInOutLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtShipmentInOutLineList() materialMgmtShipmentInOutLineList}' feature.
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
	 * Sets the '{@link UOMType#getMaterialMgmtStorageDetailList() <em>materialMgmtStorageDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtStorageDetailList() materialMgmtStorageDetailList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStorageDetailList(
			ReferenceType newMaterialMgmtStorageDetailList) {
		materialMgmtStorageDetailList = newMaterialMgmtStorageDetailList;
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
	 * Sets the '{@link UOMType#getMaterialMgmtStoragePendingList() <em>materialMgmtStoragePendingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getMaterialMgmtStoragePendingList() materialMgmtStoragePendingList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStoragePendingList(
			ReferenceType newMaterialMgmtStoragePendingList) {
		materialMgmtStoragePendingList = newMaterialMgmtStoragePendingList;
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
	 * Sets the '{@link UOMType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionLineList() {
		return procurementRequisitionLineList;
	}

	/**
	 * Sets the '{@link UOMType#getProcurementRequisitionLineList() <em>procurementRequisitionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getProcurementRequisitionLineList() procurementRequisitionLineList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLineList(
			ReferenceType newProcurementRequisitionLineList) {
		procurementRequisitionLineList = newProcurementRequisitionLineList;
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
	 * Sets the '{@link UOMType#getProductList() <em>productList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getProductList() productList}' feature.
	 * @generated
	 */
	public void setProductList(ReferenceType newProductList) {
		productList = newProductList;
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
	 * Sets the '{@link UOMType#getProductStockViewList() <em>productStockViewList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getProductStockViewList() productStockViewList}' feature.
	 * @generated
	 */
	public void setProductStockViewList(ReferenceType newProductStockViewList) {
		productStockViewList = newProductStockViewList;
	}

	/**
	 * Returns the value of '<em><b>productUOMList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productUOMList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductUOMList() {
		return productUOMList;
	}

	/**
	 * Sets the '{@link UOMType#getProductUOMList() <em>productUOMList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getProductUOMList() productUOMList}' feature.
	 * @generated
	 */
	public void setProductUOMList(ReferenceType newProductUOMList) {
		productUOMList = newProductUOMList;
	}

	/**
	 * Returns the value of '<em><b>resourceTypeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceTypeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getResourceTypeList() {
		return resourceTypeList;
	}

	/**
	 * Sets the '{@link UOMType#getResourceTypeList() <em>resourceTypeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getResourceTypeList() resourceTypeList}' feature.
	 * @generated
	 */
	public void setResourceTypeList(ReferenceType newResourceTypeList) {
		resourceTypeList = newResourceTypeList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialOrderPickEditLinesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialOrderPickEditLinesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialOrderPickEditLinesList() {
		return returnMaterialOrderPickEditLinesList;
	}

	/**
	 * Sets the '{@link UOMType#getReturnMaterialOrderPickEditLinesList() <em>returnMaterialOrderPickEditLinesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getReturnMaterialOrderPickEditLinesList() returnMaterialOrderPickEditLinesList}' feature.
	 * @generated
	 */
	public void setReturnMaterialOrderPickEditLinesList(
			ReferenceType newReturnMaterialOrderPickEditLinesList) {
		returnMaterialOrderPickEditLinesList = newReturnMaterialOrderPickEditLinesList;
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
	 * Sets the '{@link UOMType#getReturnMaterialReceiptPickEditList() <em>returnMaterialReceiptPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getReturnMaterialReceiptPickEditList() returnMaterialReceiptPickEditList}' feature.
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
	 * Sets the '{@link UOMType#getReturnMaterialShipmentPickEditList() <em>returnMaterialShipmentPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getReturnMaterialShipmentPickEditList() returnMaterialShipmentPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialShipmentPickEditList(
			ReferenceType newReturnMaterialShipmentPickEditList) {
		returnMaterialShipmentPickEditList = newReturnMaterialShipmentPickEditList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineList() {
		return timeAndExpenseSheetLineList;
	}

	/**
	 * Sets the '{@link UOMType#getTimeAndExpenseSheetLineList() <em>timeAndExpenseSheetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getTimeAndExpenseSheetLineList() timeAndExpenseSheetLineList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineList(
			ReferenceType newTimeAndExpenseSheetLineList) {
		timeAndExpenseSheetLineList = newTimeAndExpenseSheetLineList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineVList() {
		return timeAndExpenseSheetLineVList;
	}

	/**
	 * Sets the '{@link UOMType#getTimeAndExpenseSheetLineVList() <em>timeAndExpenseSheetLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getTimeAndExpenseSheetLineVList() timeAndExpenseSheetLineVList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineVList(
			ReferenceType newTimeAndExpenseSheetLineVList) {
		timeAndExpenseSheetLineVList = newTimeAndExpenseSheetLineVList;
	}

	/**
	 * Returns the value of '<em><b>uOMConversionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMConversionList</b></em>' feature
	 * @generated
	 */
	public UOMConversionListType getUOMConversionList() {
		return uOMConversionList;
	}

	/**
	 * Sets the '{@link UOMType#getUOMConversionList() <em>uOMConversionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getUOMConversionList() uOMConversionList}' feature.
	 * @generated
	 */
	public void setUOMConversionList(UOMConversionListType newUOMConversionList) {
		uOMConversionList = newUOMConversionList;
	}

	/**
	 * Returns the value of '<em><b>uOMConversionToUOMList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMConversionToUOMList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUOMConversionToUOMList() {
		return uOMConversionToUOMList;
	}

	/**
	 * Sets the '{@link UOMType#getUOMConversionToUOMList() <em>uOMConversionToUOMList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getUOMConversionToUOMList() uOMConversionToUOMList}' feature.
	 * @generated
	 */
	public void setUOMConversionToUOMList(
			ReferenceType newUOMConversionToUOMList) {
		uOMConversionToUOMList = newUOMConversionToUOMList;
	}

	/**
	 * Returns the value of '<em><b>uOMTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMTrlList</b></em>' feature
	 * @generated
	 */
	public UOMTrlListType getUOMTrlList() {
		return uOMTrlList;
	}

	/**
	 * Sets the '{@link UOMType#getUOMTrlList() <em>uOMTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getUOMTrlList() uOMTrlList}' feature.
	 * @generated
	 */
	public void setUOMTrlList(UOMTrlListType newUOMTrlList) {
		uOMTrlList = newUOMTrlList;
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
	 * Sets the '{@link UOMType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getId1() id1}' feature.
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
	 * Sets the '{@link UOMType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link UOMType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#isReference() reference}' feature.
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
	public List<UOMTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link UOMType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link UOMType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<UOMTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "UOMType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
