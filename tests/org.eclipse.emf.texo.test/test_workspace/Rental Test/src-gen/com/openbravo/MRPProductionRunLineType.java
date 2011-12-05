package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MRPProductionRunLineType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MRPProductionRunLineType {

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
	private ReferenceType manufacturingPlan = null;

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
	private Decimal quantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal requiredQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime plannedDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType reportSet = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String transactionType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean fixed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesOrderLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType workRequirement = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesForecastLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType requisitionLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType processPlan = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean inserted = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime plannedOrderDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean planned = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal totalMovementQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean recalculateStock = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPProductionRunLineReportSetList = null;

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
	private List<MRPProductionRunLineTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<MRPProductionRunLineTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link MRPProductionRunLineType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getId() id}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getClient() client}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getOrganization() organization}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getActive() active}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getUpdated() updated}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>manufacturingPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingPlan</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingPlan() {
		return manufacturingPlan;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getManufacturingPlan() <em>manufacturingPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getManufacturingPlan() manufacturingPlan}' feature.
	 * @generated
	 */
	public void setManufacturingPlan(ReferenceType newManufacturingPlan) {
		manufacturingPlan = newManufacturingPlan;
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
	 * Sets the '{@link MRPProductionRunLineType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
	}

	/**
	 * Returns the value of '<em><b>quantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>quantity</b></em>' feature
	 * @generated
	 */
	public Decimal getQuantity() {
		return quantity;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getQuantity() <em>quantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getQuantity() quantity}' feature.
	 * @generated
	 */
	public void setQuantity(Decimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the value of '<em><b>requiredQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>requiredQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getRequiredQuantity() {
		return requiredQuantity;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getRequiredQuantity() <em>requiredQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getRequiredQuantity() requiredQuantity}' feature.
	 * @generated
	 */
	public void setRequiredQuantity(Decimal newRequiredQuantity) {
		requiredQuantity = newRequiredQuantity;
	}

	/**
	 * Returns the value of '<em><b>plannedDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedDate</b></em>' feature
	 * @generated
	 */
	public DateTime getPlannedDate() {
		return plannedDate;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getPlannedDate() <em>plannedDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getPlannedDate() plannedDate}' feature.
	 * @generated
	 */
	public void setPlannedDate(DateTime newPlannedDate) {
		plannedDate = newPlannedDate;
	}

	/**
	 * Returns the value of '<em><b>reportSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reportSet</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReportSet() {
		return reportSet;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getReportSet() <em>reportSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getReportSet() reportSet}' feature.
	 * @generated
	 */
	public void setReportSet(ReferenceType newReportSet) {
		reportSet = newReportSet;
	}

	/**
	 * Returns the value of '<em><b>transactionType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transactionType</b></em>' feature
	 * @generated
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getTransactionType() <em>transactionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getTransactionType() transactionType}' feature.
	 * @generated
	 */
	public void setTransactionType(String newTransactionType) {
		transactionType = newTransactionType;
	}

	/**
	 * Returns the value of '<em><b>fixed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fixed</b></em>' feature
	 * @generated
	 */
	public Boolean getFixed() {
		return fixed;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getFixed() <em>fixed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getFixed() fixed}' feature.
	 * @generated
	 */
	public void setFixed(Boolean newFixed) {
		fixed = newFixed;
	}

	/**
	 * Returns the value of '<em><b>salesOrderLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesOrderLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesOrderLine() {
		return salesOrderLine;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getSalesOrderLine() <em>salesOrderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getSalesOrderLine() salesOrderLine}' feature.
	 * @generated
	 */
	public void setSalesOrderLine(ReferenceType newSalesOrderLine) {
		salesOrderLine = newSalesOrderLine;
	}

	/**
	 * Returns the value of '<em><b>workRequirement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>workRequirement</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWorkRequirement() {
		return workRequirement;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getWorkRequirement() <em>workRequirement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getWorkRequirement() workRequirement}' feature.
	 * @generated
	 */
	public void setWorkRequirement(ReferenceType newWorkRequirement) {
		workRequirement = newWorkRequirement;
	}

	/**
	 * Returns the value of '<em><b>salesForecastLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesForecastLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesForecastLine() {
		return salesForecastLine;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getSalesForecastLine() <em>salesForecastLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getSalesForecastLine() salesForecastLine}' feature.
	 * @generated
	 */
	public void setSalesForecastLine(ReferenceType newSalesForecastLine) {
		salesForecastLine = newSalesForecastLine;
	}

	/**
	 * Returns the value of '<em><b>requisitionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>requisitionLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRequisitionLine() {
		return requisitionLine;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getRequisitionLine() <em>requisitionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getRequisitionLine() requisitionLine}' feature.
	 * @generated
	 */
	public void setRequisitionLine(ReferenceType newRequisitionLine) {
		requisitionLine = newRequisitionLine;
	}

	/**
	 * Returns the value of '<em><b>processPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processPlan</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessPlan() {
		return processPlan;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getProcessPlan() <em>processPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getProcessPlan() processPlan}' feature.
	 * @generated
	 */
	public void setProcessPlan(ReferenceType newProcessPlan) {
		processPlan = newProcessPlan;
	}

	/**
	 * Returns the value of '<em><b>inserted</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>inserted</b></em>' feature
	 * @generated
	 */
	public Boolean getInserted() {
		return inserted;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getInserted() <em>inserted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getInserted() inserted}' feature.
	 * @generated
	 */
	public void setInserted(Boolean newInserted) {
		inserted = newInserted;
	}

	/**
	 * Returns the value of '<em><b>plannedOrderDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedOrderDate</b></em>' feature
	 * @generated
	 */
	public DateTime getPlannedOrderDate() {
		return plannedOrderDate;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getPlannedOrderDate() <em>plannedOrderDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getPlannedOrderDate() plannedOrderDate}' feature.
	 * @generated
	 */
	public void setPlannedOrderDate(DateTime newPlannedOrderDate) {
		plannedOrderDate = newPlannedOrderDate;
	}

	/**
	 * Returns the value of '<em><b>planned</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>planned</b></em>' feature
	 * @generated
	 */
	public Boolean getPlanned() {
		return planned;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getPlanned() <em>planned</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getPlanned() planned}' feature.
	 * @generated
	 */
	public void setPlanned(Boolean newPlanned) {
		planned = newPlanned;
	}

	/**
	 * Returns the value of '<em><b>totalMovementQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>totalMovementQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getTotalMovementQuantity() {
		return totalMovementQuantity;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getTotalMovementQuantity() <em>totalMovementQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getTotalMovementQuantity() totalMovementQuantity}' feature.
	 * @generated
	 */
	public void setTotalMovementQuantity(Decimal newTotalMovementQuantity) {
		totalMovementQuantity = newTotalMovementQuantity;
	}

	/**
	 * Returns the value of '<em><b>recalculateStock</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>recalculateStock</b></em>' feature
	 * @generated
	 */
	public Boolean getRecalculateStock() {
		return recalculateStock;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getRecalculateStock() <em>recalculateStock</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getRecalculateStock() recalculateStock}' feature.
	 * @generated
	 */
	public void setRecalculateStock(Boolean newRecalculateStock) {
		recalculateStock = newRecalculateStock;
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRunLineReportSetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunLineReportSetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPProductionRunLineReportSetList() {
		return mRPProductionRunLineReportSetList;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getMRPProductionRunLineReportSetList() <em>mRPProductionRunLineReportSetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getMRPProductionRunLineReportSetList() mRPProductionRunLineReportSetList}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLineReportSetList(
			ReferenceType newMRPProductionRunLineReportSetList) {
		mRPProductionRunLineReportSetList = newMRPProductionRunLineReportSetList;
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
	 * Sets the '{@link MRPProductionRunLineType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getId1() id1}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link MRPProductionRunLineType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#isReference() reference}' feature.
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
	public List<MRPProductionRunLineTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link MRPProductionRunLineType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPProductionRunLineType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<MRPProductionRunLineTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "MRPProductionRunLineType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
