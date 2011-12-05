package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProcurementRequisitionLineType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProcurementRequisitionLineType {

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
	private ReferenceType requisition = null;

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
	private Decimal listPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal lineNetAmount = null;

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
	private ReferenceType uOM = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderUOM = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal orderQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType attributeSetValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String requisitionLineStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal matchedPOQty = null;

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
	private Boolean changeStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String internalNotes = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String notesForSupplier = null;

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
	private DateTime needByDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal unitPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal discount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType currency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType lockedBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal lockQty = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal lockPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType priceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime lockDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String lockCause = null;

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
	private ReferenceType mRPProductionRunLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPPurchasingRunLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcurementRequisitionPOMatchListType procurementRequisitionPOMatchList = null;

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
	private List<ProcurementRequisitionLineTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ProcurementRequisitionLineTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ProcurementRequisitionLineType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getId() id}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getClient() client}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getActive() active}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>requisition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>requisition</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRequisition() {
		return requisition;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getRequisition() <em>requisition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getRequisition() requisition}' feature.
	 * @generated
	 */
	public void setRequisition(ReferenceType newRequisition) {
		requisition = newRequisition;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getProduct() product}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getQuantity() <em>quantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getQuantity() quantity}' feature.
	 * @generated
	 */
	public void setQuantity(Decimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the value of '<em><b>listPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>listPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getListPrice() {
		return listPrice;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getListPrice() <em>listPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getListPrice() listPrice}' feature.
	 * @generated
	 */
	public void setListPrice(Decimal newListPrice) {
		listPrice = newListPrice;
	}

	/**
	 * Returns the value of '<em><b>lineNetAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lineNetAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getLineNetAmount() {
		return lineNetAmount;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getLineNetAmount() <em>lineNetAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLineNetAmount() lineNetAmount}' feature.
	 * @generated
	 */
	public void setLineNetAmount(Decimal newLineNetAmount) {
		lineNetAmount = newLineNetAmount;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ReferenceType newUOM) {
		uOM = newUOM;
	}

	/**
	 * Returns the value of '<em><b>orderUOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderUOM</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderUOM() {
		return orderUOM;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getOrderUOM() <em>orderUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getOrderUOM() orderUOM}' feature.
	 * @generated
	 */
	public void setOrderUOM(ReferenceType newOrderUOM) {
		orderUOM = newOrderUOM;
	}

	/**
	 * Returns the value of '<em><b>orderQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getOrderQuantity() {
		return orderQuantity;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getOrderQuantity() <em>orderQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getOrderQuantity() orderQuantity}' feature.
	 * @generated
	 */
	public void setOrderQuantity(Decimal newOrderQuantity) {
		orderQuantity = newOrderQuantity;
	}

	/**
	 * Returns the value of '<em><b>attributeSetValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSetValue</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAttributeSetValue() {
		return attributeSetValue;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getAttributeSetValue() <em>attributeSetValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getAttributeSetValue() attributeSetValue}' feature.
	 * @generated
	 */
	public void setAttributeSetValue(ReferenceType newAttributeSetValue) {
		attributeSetValue = newAttributeSetValue;
	}

	/**
	 * Returns the value of '<em><b>requisitionLineStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>requisitionLineStatus</b></em>' feature
	 * @generated
	 */
	public String getRequisitionLineStatus() {
		return requisitionLineStatus;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getRequisitionLineStatus() <em>requisitionLineStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getRequisitionLineStatus() requisitionLineStatus}' feature.
	 * @generated
	 */
	public void setRequisitionLineStatus(String newRequisitionLineStatus) {
		requisitionLineStatus = newRequisitionLineStatus;
	}

	/**
	 * Returns the value of '<em><b>matchedPOQty</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>matchedPOQty</b></em>' feature
	 * @generated
	 */
	public Decimal getMatchedPOQty() {
		return matchedPOQty;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getMatchedPOQty() <em>matchedPOQty</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getMatchedPOQty() matchedPOQty}' feature.
	 * @generated
	 */
	public void setMatchedPOQty(Decimal newMatchedPOQty) {
		matchedPOQty = newMatchedPOQty;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>changeStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>changeStatus</b></em>' feature
	 * @generated
	 */
	public Boolean getChangeStatus() {
		return changeStatus;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getChangeStatus() <em>changeStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getChangeStatus() changeStatus}' feature.
	 * @generated
	 */
	public void setChangeStatus(Boolean newChangeStatus) {
		changeStatus = newChangeStatus;
	}

	/**
	 * Returns the value of '<em><b>internalNotes</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>internalNotes</b></em>' feature
	 * @generated
	 */
	public String getInternalNotes() {
		return internalNotes;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getInternalNotes() <em>internalNotes</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getInternalNotes() internalNotes}' feature.
	 * @generated
	 */
	public void setInternalNotes(String newInternalNotes) {
		internalNotes = newInternalNotes;
	}

	/**
	 * Returns the value of '<em><b>notesForSupplier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>notesForSupplier</b></em>' feature
	 * @generated
	 */
	public String getNotesForSupplier() {
		return notesForSupplier;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getNotesForSupplier() <em>notesForSupplier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getNotesForSupplier() notesForSupplier}' feature.
	 * @generated
	 */
	public void setNotesForSupplier(String newNotesForSupplier) {
		notesForSupplier = newNotesForSupplier;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getPlannedDate() <em>plannedDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getPlannedDate() plannedDate}' feature.
	 * @generated
	 */
	public void setPlannedDate(DateTime newPlannedDate) {
		plannedDate = newPlannedDate;
	}

	/**
	 * Returns the value of '<em><b>needByDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>needByDate</b></em>' feature
	 * @generated
	 */
	public DateTime getNeedByDate() {
		return needByDate;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getNeedByDate() <em>needByDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getNeedByDate() needByDate}' feature.
	 * @generated
	 */
	public void setNeedByDate(DateTime newNeedByDate) {
		needByDate = newNeedByDate;
	}

	/**
	 * Returns the value of '<em><b>unitPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unitPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getUnitPrice() {
		return unitPrice;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getUnitPrice() <em>unitPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getUnitPrice() unitPrice}' feature.
	 * @generated
	 */
	public void setUnitPrice(Decimal newUnitPrice) {
		unitPrice = newUnitPrice;
	}

	/**
	 * Returns the value of '<em><b>discount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>discount</b></em>' feature
	 * @generated
	 */
	public Decimal getDiscount() {
		return discount;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getDiscount() <em>discount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getDiscount() discount}' feature.
	 * @generated
	 */
	public void setDiscount(Decimal newDiscount) {
		discount = newDiscount;
	}

	/**
	 * Returns the value of '<em><b>currency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currency</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCurrency() {
		return currency;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>lockedBy</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lockedBy</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLockedBy() {
		return lockedBy;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getLockedBy() <em>lockedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLockedBy() lockedBy}' feature.
	 * @generated
	 */
	public void setLockedBy(ReferenceType newLockedBy) {
		lockedBy = newLockedBy;
	}

	/**
	 * Returns the value of '<em><b>lockQty</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lockQty</b></em>' feature
	 * @generated
	 */
	public Decimal getLockQty() {
		return lockQty;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getLockQty() <em>lockQty</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLockQty() lockQty}' feature.
	 * @generated
	 */
	public void setLockQty(Decimal newLockQty) {
		lockQty = newLockQty;
	}

	/**
	 * Returns the value of '<em><b>lockPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lockPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getLockPrice() {
		return lockPrice;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getLockPrice() <em>lockPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLockPrice() lockPrice}' feature.
	 * @generated
	 */
	public void setLockPrice(Decimal newLockPrice) {
		lockPrice = newLockPrice;
	}

	/**
	 * Returns the value of '<em><b>priceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPriceList() {
		return priceList;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getPriceList() <em>priceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getPriceList() priceList}' feature.
	 * @generated
	 */
	public void setPriceList(ReferenceType newPriceList) {
		priceList = newPriceList;
	}

	/**
	 * Returns the value of '<em><b>lockDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lockDate</b></em>' feature
	 * @generated
	 */
	public DateTime getLockDate() {
		return lockDate;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getLockDate() <em>lockDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLockDate() lockDate}' feature.
	 * @generated
	 */
	public void setLockDate(DateTime newLockDate) {
		lockDate = newLockDate;
	}

	/**
	 * Returns the value of '<em><b>lockCause</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lockCause</b></em>' feature
	 * @generated
	 */
	public String getLockCause() {
		return lockCause;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getLockCause() <em>lockCause</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLockCause() lockCause}' feature.
	 * @generated
	 */
	public void setLockCause(String newLockCause) {
		lockCause = newLockCause;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRunLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPProductionRunLineList() {
		return mRPProductionRunLineList;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getMRPProductionRunLineList() <em>mRPProductionRunLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getMRPProductionRunLineList() mRPProductionRunLineList}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLineList(
			ReferenceType newMRPProductionRunLineList) {
		mRPProductionRunLineList = newMRPProductionRunLineList;
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPPurchasingRunLineList() {
		return mRPPurchasingRunLineList;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getMRPPurchasingRunLineList() <em>mRPPurchasingRunLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getMRPPurchasingRunLineList() mRPPurchasingRunLineList}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLineList(
			ReferenceType newMRPPurchasingRunLineList) {
		mRPPurchasingRunLineList = newMRPPurchasingRunLineList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionPOMatchList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionPOMatchList</b></em>' feature
	 * @generated
	 */
	public ProcurementRequisitionPOMatchListType getProcurementRequisitionPOMatchList() {
		return procurementRequisitionPOMatchList;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getProcurementRequisitionPOMatchList() <em>procurementRequisitionPOMatchList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getProcurementRequisitionPOMatchList() procurementRequisitionPOMatchList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionPOMatchList(
			ProcurementRequisitionPOMatchListType newProcurementRequisitionPOMatchList) {
		procurementRequisitionPOMatchList = newProcurementRequisitionPOMatchList;
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
	 * Sets the '{@link ProcurementRequisitionLineType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getId1() id1}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ProcurementRequisitionLineType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#isReference() reference}' feature.
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
	public List<ProcurementRequisitionLineTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ProcurementRequisitionLineType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcurementRequisitionLineType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ProcurementRequisitionLineTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ProcurementRequisitionLineType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
