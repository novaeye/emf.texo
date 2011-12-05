package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>MaterialMgmtShipmentInOutType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class MaterialMgmtShipmentInOutType {

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
	private Boolean salesTransaction = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String documentNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String documentAction = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String documentStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String posted = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean processNow = null;

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
	private ReferenceType documentType = null;

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
	private ReferenceType salesOrder = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime orderDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean print = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String movementType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime movementDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime accountingDate = null;

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
	private ReferenceType partnerAddress = null;

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
	private String orderReference = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String deliveryTerms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String freightCostRule = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal freightAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String deliveryMethod = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType shippingCompany = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType charge = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal chargeAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String priority = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime datePrinted = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean createLinesFrom = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean generateTo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType userContact = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesRepresentative = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfPackages = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime pickDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime shipDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String trackingNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType trxOrganization = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType project = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCampaign = null;

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
	private String stDimension = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String ndDimension = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean updateLines = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean logistic = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean generateLines = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean calculateFreight = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType deliveryLocation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType freightCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType freightCurrency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean receiveMaterials = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean sendMaterials = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType conditionGoods = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtShipmentInOutLineListType materialMgmtShipmentInOutLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReturnMaterialReceiptPickEditListType returnMaterialReceiptPickEditList = null;

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
	private List<MaterialMgmtShipmentInOutTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<MaterialMgmtShipmentInOutTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getId() id}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getClient() client}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getOrganization() organization}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getActive() active}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getUpdated() updated}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>salesTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesTransaction</b></em>' feature
	 * @generated
	 */
	public Boolean getSalesTransaction() {
		return salesTransaction;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getSalesTransaction() <em>salesTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getSalesTransaction() salesTransaction}' feature.
	 * @generated
	 */
	public void setSalesTransaction(Boolean newSalesTransaction) {
		salesTransaction = newSalesTransaction;
	}

	/**
	 * Returns the value of '<em><b>documentNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentNo</b></em>' feature
	 * @generated
	 */
	public String getDocumentNo() {
		return documentNo;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDocumentNo() <em>documentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDocumentNo() documentNo}' feature.
	 * @generated
	 */
	public void setDocumentNo(String newDocumentNo) {
		documentNo = newDocumentNo;
	}

	/**
	 * Returns the value of '<em><b>documentAction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentAction</b></em>' feature
	 * @generated
	 */
	public String getDocumentAction() {
		return documentAction;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDocumentAction() <em>documentAction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDocumentAction() documentAction}' feature.
	 * @generated
	 */
	public void setDocumentAction(String newDocumentAction) {
		documentAction = newDocumentAction;
	}

	/**
	 * Returns the value of '<em><b>documentStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentStatus</b></em>' feature
	 * @generated
	 */
	public String getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDocumentStatus() <em>documentStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDocumentStatus() documentStatus}' feature.
	 * @generated
	 */
	public void setDocumentStatus(String newDocumentStatus) {
		documentStatus = newDocumentStatus;
	}

	/**
	 * Returns the value of '<em><b>posted</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>posted</b></em>' feature
	 * @generated
	 */
	public String getPosted() {
		return posted;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
	}

	/**
	 * Returns the value of '<em><b>processNow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processNow</b></em>' feature
	 * @generated
	 */
	public Boolean getProcessNow() {
		return processNow;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getProcessed() processed}' feature.
	 * @generated
	 */
	public void setProcessed(Boolean newProcessed) {
		processed = newProcessed;
	}

	/**
	 * Returns the value of '<em><b>documentType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentType</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(ReferenceType newDocumentType) {
		documentType = newDocumentType;
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>salesOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesOrder</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesOrder() {
		return salesOrder;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getSalesOrder() <em>salesOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getSalesOrder() salesOrder}' feature.
	 * @generated
	 */
	public void setSalesOrder(ReferenceType newSalesOrder) {
		salesOrder = newSalesOrder;
	}

	/**
	 * Returns the value of '<em><b>orderDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDate</b></em>' feature
	 * @generated
	 */
	public DateTime getOrderDate() {
		return orderDate;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getOrderDate() <em>orderDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getOrderDate() orderDate}' feature.
	 * @generated
	 */
	public void setOrderDate(DateTime newOrderDate) {
		orderDate = newOrderDate;
	}

	/**
	 * Returns the value of '<em><b>print</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>print</b></em>' feature
	 * @generated
	 */
	public Boolean getPrint() {
		return print;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getPrint() <em>print</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getPrint() print}' feature.
	 * @generated
	 */
	public void setPrint(Boolean newPrint) {
		print = newPrint;
	}

	/**
	 * Returns the value of '<em><b>movementType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>movementType</b></em>' feature
	 * @generated
	 */
	public String getMovementType() {
		return movementType;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getMovementType() <em>movementType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getMovementType() movementType}' feature.
	 * @generated
	 */
	public void setMovementType(String newMovementType) {
		movementType = newMovementType;
	}

	/**
	 * Returns the value of '<em><b>movementDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>movementDate</b></em>' feature
	 * @generated
	 */
	public DateTime getMovementDate() {
		return movementDate;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getMovementDate() <em>movementDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getMovementDate() movementDate}' feature.
	 * @generated
	 */
	public void setMovementDate(DateTime newMovementDate) {
		movementDate = newMovementDate;
	}

	/**
	 * Returns the value of '<em><b>accountingDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingDate</b></em>' feature
	 * @generated
	 */
	public DateTime getAccountingDate() {
		return accountingDate;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getAccountingDate() <em>accountingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getAccountingDate() accountingDate}' feature.
	 * @generated
	 */
	public void setAccountingDate(DateTime newAccountingDate) {
		accountingDate = newAccountingDate;
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>partnerAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>partnerAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPartnerAddress() {
		return partnerAddress;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getPartnerAddress() <em>partnerAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getPartnerAddress() partnerAddress}' feature.
	 * @generated
	 */
	public void setPartnerAddress(ReferenceType newPartnerAddress) {
		partnerAddress = newPartnerAddress;
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(ReferenceType newWarehouse) {
		warehouse = newWarehouse;
	}

	/**
	 * Returns the value of '<em><b>orderReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderReference</b></em>' feature
	 * @generated
	 */
	public String getOrderReference() {
		return orderReference;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getOrderReference() <em>orderReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getOrderReference() orderReference}' feature.
	 * @generated
	 */
	public void setOrderReference(String newOrderReference) {
		orderReference = newOrderReference;
	}

	/**
	 * Returns the value of '<em><b>deliveryTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deliveryTerms</b></em>' feature
	 * @generated
	 */
	public String getDeliveryTerms() {
		return deliveryTerms;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDeliveryTerms() <em>deliveryTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDeliveryTerms() deliveryTerms}' feature.
	 * @generated
	 */
	public void setDeliveryTerms(String newDeliveryTerms) {
		deliveryTerms = newDeliveryTerms;
	}

	/**
	 * Returns the value of '<em><b>freightCostRule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightCostRule</b></em>' feature
	 * @generated
	 */
	public String getFreightCostRule() {
		return freightCostRule;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getFreightCostRule() <em>freightCostRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getFreightCostRule() freightCostRule}' feature.
	 * @generated
	 */
	public void setFreightCostRule(String newFreightCostRule) {
		freightCostRule = newFreightCostRule;
	}

	/**
	 * Returns the value of '<em><b>freightAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getFreightAmount() {
		return freightAmount;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getFreightAmount() <em>freightAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getFreightAmount() freightAmount}' feature.
	 * @generated
	 */
	public void setFreightAmount(Decimal newFreightAmount) {
		freightAmount = newFreightAmount;
	}

	/**
	 * Returns the value of '<em><b>deliveryMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deliveryMethod</b></em>' feature
	 * @generated
	 */
	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDeliveryMethod() <em>deliveryMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDeliveryMethod() deliveryMethod}' feature.
	 * @generated
	 */
	public void setDeliveryMethod(String newDeliveryMethod) {
		deliveryMethod = newDeliveryMethod;
	}

	/**
	 * Returns the value of '<em><b>shippingCompany</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingCompany</b></em>' feature
	 * @generated
	 */
	public ReferenceType getShippingCompany() {
		return shippingCompany;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getShippingCompany() <em>shippingCompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getShippingCompany() shippingCompany}' feature.
	 * @generated
	 */
	public void setShippingCompany(ReferenceType newShippingCompany) {
		shippingCompany = newShippingCompany;
	}

	/**
	 * Returns the value of '<em><b>charge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>charge</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCharge() {
		return charge;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getCharge() <em>charge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getCharge() charge}' feature.
	 * @generated
	 */
	public void setCharge(ReferenceType newCharge) {
		charge = newCharge;
	}

	/**
	 * Returns the value of '<em><b>chargeAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>chargeAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getChargeAmount() {
		return chargeAmount;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getChargeAmount() <em>chargeAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getChargeAmount() chargeAmount}' feature.
	 * @generated
	 */
	public void setChargeAmount(Decimal newChargeAmount) {
		chargeAmount = newChargeAmount;
	}

	/**
	 * Returns the value of '<em><b>priority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priority</b></em>' feature
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getPriority() <em>priority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getPriority() priority}' feature.
	 * @generated
	 */
	public void setPriority(String newPriority) {
		priority = newPriority;
	}

	/**
	 * Returns the value of '<em><b>datePrinted</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>datePrinted</b></em>' feature
	 * @generated
	 */
	public DateTime getDatePrinted() {
		return datePrinted;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDatePrinted() <em>datePrinted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDatePrinted() datePrinted}' feature.
	 * @generated
	 */
	public void setDatePrinted(DateTime newDatePrinted) {
		datePrinted = newDatePrinted;
	}

	/**
	 * Returns the value of '<em><b>invoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoice</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoice() {
		return invoice;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(ReferenceType newInvoice) {
		invoice = newInvoice;
	}

	/**
	 * Returns the value of '<em><b>createLinesFrom</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createLinesFrom</b></em>' feature
	 * @generated
	 */
	public Boolean getCreateLinesFrom() {
		return createLinesFrom;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getCreateLinesFrom() <em>createLinesFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getCreateLinesFrom() createLinesFrom}' feature.
	 * @generated
	 */
	public void setCreateLinesFrom(Boolean newCreateLinesFrom) {
		createLinesFrom = newCreateLinesFrom;
	}

	/**
	 * Returns the value of '<em><b>generateTo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generateTo</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerateTo() {
		return generateTo;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getGenerateTo() <em>generateTo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getGenerateTo() generateTo}' feature.
	 * @generated
	 */
	public void setGenerateTo(Boolean newGenerateTo) {
		generateTo = newGenerateTo;
	}

	/**
	 * Returns the value of '<em><b>userContact</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>userContact</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUserContact() {
		return userContact;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getUserContact() <em>userContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getUserContact() userContact}' feature.
	 * @generated
	 */
	public void setUserContact(ReferenceType newUserContact) {
		userContact = newUserContact;
	}

	/**
	 * Returns the value of '<em><b>salesRepresentative</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRepresentative</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesRepresentative() {
		return salesRepresentative;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getSalesRepresentative() <em>salesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getSalesRepresentative() salesRepresentative}' feature.
	 * @generated
	 */
	public void setSalesRepresentative(ReferenceType newSalesRepresentative) {
		salesRepresentative = newSalesRepresentative;
	}

	/**
	 * Returns the value of '<em><b>numberOfPackages</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfPackages</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfPackages() {
		return numberOfPackages;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getNumberOfPackages() <em>numberOfPackages</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getNumberOfPackages() numberOfPackages}' feature.
	 * @generated
	 */
	public void setNumberOfPackages(Long newNumberOfPackages) {
		numberOfPackages = newNumberOfPackages;
	}

	/**
	 * Returns the value of '<em><b>pickDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pickDate</b></em>' feature
	 * @generated
	 */
	public DateTime getPickDate() {
		return pickDate;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getPickDate() <em>pickDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getPickDate() pickDate}' feature.
	 * @generated
	 */
	public void setPickDate(DateTime newPickDate) {
		pickDate = newPickDate;
	}

	/**
	 * Returns the value of '<em><b>shipDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shipDate</b></em>' feature
	 * @generated
	 */
	public DateTime getShipDate() {
		return shipDate;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getShipDate() <em>shipDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getShipDate() shipDate}' feature.
	 * @generated
	 */
	public void setShipDate(DateTime newShipDate) {
		shipDate = newShipDate;
	}

	/**
	 * Returns the value of '<em><b>trackingNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>trackingNo</b></em>' feature
	 * @generated
	 */
	public String getTrackingNo() {
		return trackingNo;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getTrackingNo() <em>trackingNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getTrackingNo() trackingNo}' feature.
	 * @generated
	 */
	public void setTrackingNo(String newTrackingNo) {
		trackingNo = newTrackingNo;
	}

	/**
	 * Returns the value of '<em><b>trxOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>trxOrganization</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTrxOrganization() {
		return trxOrganization;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getTrxOrganization() <em>trxOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getTrxOrganization() trxOrganization}' feature.
	 * @generated
	 */
	public void setTrxOrganization(ReferenceType newTrxOrganization) {
		trxOrganization = newTrxOrganization;
	}

	/**
	 * Returns the value of '<em><b>project</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>project</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProject() {
		return project;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ReferenceType newProject) {
		project = newProject;
	}

	/**
	 * Returns the value of '<em><b>salesCampaign</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCampaign</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCampaign() {
		return salesCampaign;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getSalesCampaign() salesCampaign}' feature.
	 * @generated
	 */
	public void setSalesCampaign(ReferenceType newSalesCampaign) {
		salesCampaign = newSalesCampaign;
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
	}

	/**
	 * Returns the value of '<em><b>stDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>stDimension</b></em>' feature
	 * @generated
	 */
	public String getStDimension() {
		return stDimension;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getStDimension() stDimension}' feature.
	 * @generated
	 */
	public void setStDimension(String newStDimension) {
		stDimension = newStDimension;
	}

	/**
	 * Returns the value of '<em><b>ndDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>ndDimension</b></em>' feature
	 * @generated
	 */
	public String getNdDimension() {
		return ndDimension;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
	}

	/**
	 * Returns the value of '<em><b>updateLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>updateLines</b></em>' feature
	 * @generated
	 */
	public Boolean getUpdateLines() {
		return updateLines;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getUpdateLines() <em>updateLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getUpdateLines() updateLines}' feature.
	 * @generated
	 */
	public void setUpdateLines(Boolean newUpdateLines) {
		updateLines = newUpdateLines;
	}

	/**
	 * Returns the value of '<em><b>logistic</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>logistic</b></em>' feature
	 * @generated
	 */
	public Boolean getLogistic() {
		return logistic;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getLogistic() <em>logistic</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getLogistic() logistic}' feature.
	 * @generated
	 */
	public void setLogistic(Boolean newLogistic) {
		logistic = newLogistic;
	}

	/**
	 * Returns the value of '<em><b>generateLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generateLines</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerateLines() {
		return generateLines;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getGenerateLines() <em>generateLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getGenerateLines() generateLines}' feature.
	 * @generated
	 */
	public void setGenerateLines(Boolean newGenerateLines) {
		generateLines = newGenerateLines;
	}

	/**
	 * Returns the value of '<em><b>calculateFreight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>calculateFreight</b></em>' feature
	 * @generated
	 */
	public Boolean getCalculateFreight() {
		return calculateFreight;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getCalculateFreight() <em>calculateFreight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getCalculateFreight() calculateFreight}' feature.
	 * @generated
	 */
	public void setCalculateFreight(Boolean newCalculateFreight) {
		calculateFreight = newCalculateFreight;
	}

	/**
	 * Returns the value of '<em><b>deliveryLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deliveryLocation</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDeliveryLocation() {
		return deliveryLocation;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getDeliveryLocation() <em>deliveryLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getDeliveryLocation() deliveryLocation}' feature.
	 * @generated
	 */
	public void setDeliveryLocation(ReferenceType newDeliveryLocation) {
		deliveryLocation = newDeliveryLocation;
	}

	/**
	 * Returns the value of '<em><b>freightCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFreightCategory() {
		return freightCategory;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getFreightCategory() <em>freightCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getFreightCategory() freightCategory}' feature.
	 * @generated
	 */
	public void setFreightCategory(ReferenceType newFreightCategory) {
		freightCategory = newFreightCategory;
	}

	/**
	 * Returns the value of '<em><b>freightCurrency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightCurrency</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFreightCurrency() {
		return freightCurrency;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getFreightCurrency() <em>freightCurrency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getFreightCurrency() freightCurrency}' feature.
	 * @generated
	 */
	public void setFreightCurrency(ReferenceType newFreightCurrency) {
		freightCurrency = newFreightCurrency;
	}

	/**
	 * Returns the value of '<em><b>receiveMaterials</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>receiveMaterials</b></em>' feature
	 * @generated
	 */
	public Boolean getReceiveMaterials() {
		return receiveMaterials;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getReceiveMaterials() <em>receiveMaterials</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getReceiveMaterials() receiveMaterials}' feature.
	 * @generated
	 */
	public void setReceiveMaterials(Boolean newReceiveMaterials) {
		receiveMaterials = newReceiveMaterials;
	}

	/**
	 * Returns the value of '<em><b>sendMaterials</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sendMaterials</b></em>' feature
	 * @generated
	 */
	public Boolean getSendMaterials() {
		return sendMaterials;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getSendMaterials() <em>sendMaterials</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getSendMaterials() sendMaterials}' feature.
	 * @generated
	 */
	public void setSendMaterials(Boolean newSendMaterials) {
		sendMaterials = newSendMaterials;
	}

	/**
	 * Returns the value of '<em><b>conditionGoods</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>conditionGoods</b></em>' feature
	 * @generated
	 */
	public ReferenceType getConditionGoods() {
		return conditionGoods;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getConditionGoods() <em>conditionGoods</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getConditionGoods() conditionGoods}' feature.
	 * @generated
	 */
	public void setConditionGoods(ReferenceType newConditionGoods) {
		conditionGoods = newConditionGoods;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutLineList</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtShipmentInOutLineListType getMaterialMgmtShipmentInOutLineList() {
		return materialMgmtShipmentInOutLineList;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getMaterialMgmtShipmentInOutLineList() <em>materialMgmtShipmentInOutLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getMaterialMgmtShipmentInOutLineList() materialMgmtShipmentInOutLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutLineList(
			MaterialMgmtShipmentInOutLineListType newMaterialMgmtShipmentInOutLineList) {
		materialMgmtShipmentInOutLineList = newMaterialMgmtShipmentInOutLineList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialReceiptPickEditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialReceiptPickEditList</b></em>' feature
	 * @generated
	 */
	public ReturnMaterialReceiptPickEditListType getReturnMaterialReceiptPickEditList() {
		return returnMaterialReceiptPickEditList;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getReturnMaterialReceiptPickEditList() <em>returnMaterialReceiptPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getReturnMaterialReceiptPickEditList() returnMaterialReceiptPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialReceiptPickEditList(
			ReturnMaterialReceiptPickEditListType newReturnMaterialReceiptPickEditList) {
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getReturnMaterialShipmentPickEditList() <em>returnMaterialShipmentPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getReturnMaterialShipmentPickEditList() returnMaterialShipmentPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialShipmentPickEditList(
			ReferenceType newReturnMaterialShipmentPickEditList) {
		returnMaterialShipmentPickEditList = newReturnMaterialShipmentPickEditList;
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getId1() id1}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link MaterialMgmtShipmentInOutType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#isReference() reference}' feature.
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
	public List<MaterialMgmtShipmentInOutTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link MaterialMgmtShipmentInOutType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link MaterialMgmtShipmentInOutType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<MaterialMgmtShipmentInOutTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "MaterialMgmtShipmentInOutType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
