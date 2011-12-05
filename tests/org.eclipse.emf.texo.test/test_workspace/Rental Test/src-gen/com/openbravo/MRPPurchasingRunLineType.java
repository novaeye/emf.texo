package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MRPPurchasingRunLineType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MRPPurchasingRunLineType {

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
	private ReferenceType purchasingPlan = null;

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
	private Boolean completed = null;

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
	private ReferenceType businessPartner = null;

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
	private List<MRPPurchasingRunLineTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<MRPPurchasingRunLineTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link MRPPurchasingRunLineType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getId() id}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getClient() client}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getOrganization() organization}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getActive() active}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getUpdated() updated}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>purchasingPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>purchasingPlan</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPurchasingPlan() {
		return purchasingPlan;
	}

	/**
	 * Sets the '{@link MRPPurchasingRunLineType#getPurchasingPlan() <em>purchasingPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getPurchasingPlan() purchasingPlan}' feature.
	 * @generated
	 */
	public void setPurchasingPlan(ReferenceType newPurchasingPlan) {
		purchasingPlan = newPurchasingPlan;
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
	 * Sets the '{@link MRPPurchasingRunLineType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getProduct() product}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getQuantity() <em>quantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getQuantity() quantity}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getRequiredQuantity() <em>requiredQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getRequiredQuantity() requiredQuantity}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getPlannedDate() <em>plannedDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getPlannedDate() plannedDate}' feature.
	 * @generated
	 */
	public void setPlannedDate(DateTime newPlannedDate) {
		plannedDate = newPlannedDate;
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
	 * Sets the '{@link MRPPurchasingRunLineType#getTransactionType() <em>transactionType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getTransactionType() transactionType}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getFixed() <em>fixed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getFixed() fixed}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getSalesOrderLine() <em>salesOrderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getSalesOrderLine() salesOrderLine}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getWorkRequirement() <em>workRequirement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getWorkRequirement() workRequirement}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getSalesForecastLine() <em>salesForecastLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getSalesForecastLine() salesForecastLine}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getRequisitionLine() <em>requisitionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getRequisitionLine() requisitionLine}' feature.
	 * @generated
	 */
	public void setRequisitionLine(ReferenceType newRequisitionLine) {
		requisitionLine = newRequisitionLine;
	}

	/**
	 * Returns the value of '<em><b>completed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>completed</b></em>' feature
	 * @generated
	 */
	public Boolean getCompleted() {
		return completed;
	}

	/**
	 * Sets the '{@link MRPPurchasingRunLineType#getCompleted() <em>completed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getCompleted() completed}' feature.
	 * @generated
	 */
	public void setCompleted(Boolean newCompleted) {
		completed = newCompleted;
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
	 * Sets the '{@link MRPPurchasingRunLineType#getPlannedOrderDate() <em>plannedOrderDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getPlannedOrderDate() plannedOrderDate}' feature.
	 * @generated
	 */
	public void setPlannedOrderDate(DateTime newPlannedOrderDate) {
		plannedOrderDate = newPlannedOrderDate;
	}

	/**
	 * Returns the value of '<em><b>businessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartner</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartner() {
		return businessPartner;
	}

	/**
	 * Sets the '{@link MRPPurchasingRunLineType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
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
	 * Sets the '{@link MRPPurchasingRunLineType#getTotalMovementQuantity() <em>totalMovementQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getTotalMovementQuantity() totalMovementQuantity}' feature.
	 * @generated
	 */
	public void setTotalMovementQuantity(Decimal newTotalMovementQuantity) {
		totalMovementQuantity = newTotalMovementQuantity;
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
	 * Sets the '{@link MRPPurchasingRunLineType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getId1() id1}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link MRPPurchasingRunLineType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#isReference() reference}' feature.
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
	public List<MRPPurchasingRunLineTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link MRPPurchasingRunLineType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MRPPurchasingRunLineType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<MRPPurchasingRunLineTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "MRPPurchasingRunLineType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
