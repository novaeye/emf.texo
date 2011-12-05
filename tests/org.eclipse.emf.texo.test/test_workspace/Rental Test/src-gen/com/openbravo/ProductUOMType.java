package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductUOMType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductUOMType {

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
	private ReferenceType uOM = null;

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
	private ReferenceType productStockViewList = null;

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
	private List<ProductUOMTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ProductUOMTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ProductUOMType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getId() id}' feature.
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
	 * Sets the '{@link ProductUOMType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getClient() client}' feature.
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
	 * Sets the '{@link ProductUOMType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ProductUOMType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getActive() active}' feature.
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
	 * Sets the '{@link ProductUOMType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ProductUOMType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ProductUOMType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ProductUOMType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>uOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOM</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUOM() {
		return uOM;
	}

	/**
	 * Sets the '{@link ProductUOMType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ReferenceType newUOM) {
		uOM = newUOM;
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
	 * Sets the '{@link ProductUOMType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
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
	 * Sets the '{@link ProductUOMType#getInvoiceLineList() <em>invoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getInvoiceLineList() invoiceLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getManufacturingGlobalUseList() <em>manufacturingGlobalUseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getManufacturingGlobalUseList() manufacturingGlobalUseList}' feature.
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
	 * Sets the '{@link ProductUOMType#getManufacturingOperationProductList() <em>manufacturingOperationProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getManufacturingOperationProductList() manufacturingOperationProductList}' feature.
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
	 * Sets the '{@link ProductUOMType#getManufacturingProductionLineList() <em>manufacturingProductionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getManufacturingProductionLineList() manufacturingProductionLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getManufacturingWorkRequirementProductList() <em>manufacturingWorkRequirementProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getManufacturingWorkRequirementProductList() manufacturingWorkRequirementProductList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtInternalConsumptionLineList() <em>materialMgmtInternalConsumptionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtInternalConsumptionLineList() materialMgmtInternalConsumptionLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtInternalMovementLineList() <em>materialMgmtInternalMovementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtInternalMovementLineList() materialMgmtInternalMovementLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtInventoryCountLineList() <em>materialMgmtInventoryCountLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtInventoryCountLineList() materialMgmtInventoryCountLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtMaterialTransactionList() <em>materialMgmtMaterialTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtMaterialTransactionList() materialMgmtMaterialTransactionList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtShipmentInOutLineList() <em>materialMgmtShipmentInOutLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtShipmentInOutLineList() materialMgmtShipmentInOutLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtStorageDetailList() <em>materialMgmtStorageDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtStorageDetailList() materialMgmtStorageDetailList}' feature.
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
	 * Sets the '{@link ProductUOMType#getMaterialMgmtStoragePendingList() <em>materialMgmtStoragePendingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getMaterialMgmtStoragePendingList() materialMgmtStoragePendingList}' feature.
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
	 * Sets the '{@link ProductUOMType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getOrderLineList() orderLineList}' feature.
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
	 * Sets the '{@link ProductUOMType#getProcurementRequisitionLineList() <em>procurementRequisitionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getProcurementRequisitionLineList() procurementRequisitionLineList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLineList(
			ReferenceType newProcurementRequisitionLineList) {
		procurementRequisitionLineList = newProcurementRequisitionLineList;
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
	 * Sets the '{@link ProductUOMType#getProductStockViewList() <em>productStockViewList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getProductStockViewList() productStockViewList}' feature.
	 * @generated
	 */
	public void setProductStockViewList(ReferenceType newProductStockViewList) {
		productStockViewList = newProductStockViewList;
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
	 * Sets the '{@link ProductUOMType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getId1() id1}' feature.
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
	 * Sets the '{@link ProductUOMType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ProductUOMType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#isReference() reference}' feature.
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
	public List<ProductUOMTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ProductUOMType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductUOMType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ProductUOMTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ProductUOMType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
