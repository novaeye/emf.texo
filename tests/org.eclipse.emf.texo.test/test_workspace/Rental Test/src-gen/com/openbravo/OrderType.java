package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OrderType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OrderType {

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
	private String documentStatus = null;

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
	private ReferenceType transactionDocument = null;

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
	private Boolean delivered = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean reinvoice = null;

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
	private Boolean selected = null;

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
	private DateTime orderDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime scheduledDeliveryDate = null;

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
	private ReferenceType invoiceAddress = null;

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
	private String orderReference = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean printDiscount = null;

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
	private String formOfPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentTerms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String invoiceTerms = null;

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
	private Decimal summedLineAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal grandTotalAmount = null;

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
	private ReferenceType priceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean priceIncludesTax = null;

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
	private ReferenceType project = null;

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
	private String posted = null;

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
	private Boolean copyFrom = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dropShipPartner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dropShipLocation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType dropShipContact = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean selfService = null;

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
	private String deliveryNotes = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType incoterms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String iNCOTERMSDescription = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean generateTemplate = null;

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
	private Boolean copyFromPO = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentMethod = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentPriority = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean pickFromShipment = null;

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
	private Boolean createInvoice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnReason = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentSchedInvVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentSchedOrdVListType fINPaymentSchedOrdVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentScheduleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentListType financialMgmtDebtPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtJournalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceList = null;

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
	private OrderDiscountListType orderDiscountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderLineListType orderLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderLineTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderTaxListType orderTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectLinePurchaseOrderList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectPhaseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialOrderPickEditLinesReturnOrderList = null;

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
	private List<OrderTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<OrderTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link OrderType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getId() id}' feature.
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
	 * Sets the '{@link OrderType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getClient() client}' feature.
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
	 * Sets the '{@link OrderType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrganization() organization}' feature.
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
	 * Sets the '{@link OrderType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getActive() active}' feature.
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
	 * Sets the '{@link OrderType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link OrderType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link OrderType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getUpdated() updated}' feature.
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
	 * Sets the '{@link OrderType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link OrderType#getSalesTransaction() <em>salesTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getSalesTransaction() salesTransaction}' feature.
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
	 * Sets the '{@link OrderType#getDocumentNo() <em>documentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDocumentNo() documentNo}' feature.
	 * @generated
	 */
	public void setDocumentNo(String newDocumentNo) {
		documentNo = newDocumentNo;
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
	 * Sets the '{@link OrderType#getDocumentStatus() <em>documentStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDocumentStatus() documentStatus}' feature.
	 * @generated
	 */
	public void setDocumentStatus(String newDocumentStatus) {
		documentStatus = newDocumentStatus;
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
	 * Sets the '{@link OrderType#getDocumentAction() <em>documentAction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDocumentAction() documentAction}' feature.
	 * @generated
	 */
	public void setDocumentAction(String newDocumentAction) {
		documentAction = newDocumentAction;
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
	 * Sets the '{@link OrderType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getProcessNow() processNow}' feature.
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
	 * Sets the '{@link OrderType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getProcessed() processed}' feature.
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
	 * Sets the '{@link OrderType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(ReferenceType newDocumentType) {
		documentType = newDocumentType;
	}

	/**
	 * Returns the value of '<em><b>transactionDocument</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transactionDocument</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTransactionDocument() {
		return transactionDocument;
	}

	/**
	 * Sets the '{@link OrderType#getTransactionDocument() <em>transactionDocument</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getTransactionDocument() transactionDocument}' feature.
	 * @generated
	 */
	public void setTransactionDocument(ReferenceType newTransactionDocument) {
		transactionDocument = newTransactionDocument;
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
	 * Sets the '{@link OrderType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>delivered</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>delivered</b></em>' feature
	 * @generated
	 */
	public Boolean getDelivered() {
		return delivered;
	}

	/**
	 * Sets the '{@link OrderType#getDelivered() <em>delivered</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDelivered() delivered}' feature.
	 * @generated
	 */
	public void setDelivered(Boolean newDelivered) {
		delivered = newDelivered;
	}

	/**
	 * Returns the value of '<em><b>reinvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reinvoice</b></em>' feature
	 * @generated
	 */
	public Boolean getReinvoice() {
		return reinvoice;
	}

	/**
	 * Sets the '{@link OrderType#getReinvoice() <em>reinvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getReinvoice() reinvoice}' feature.
	 * @generated
	 */
	public void setReinvoice(Boolean newReinvoice) {
		reinvoice = newReinvoice;
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
	 * Sets the '{@link OrderType#getPrint() <em>print</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPrint() print}' feature.
	 * @generated
	 */
	public void setPrint(Boolean newPrint) {
		print = newPrint;
	}

	/**
	 * Returns the value of '<em><b>selected</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>selected</b></em>' feature
	 * @generated
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * Sets the '{@link OrderType#getSelected() <em>selected</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getSelected() selected}' feature.
	 * @generated
	 */
	public void setSelected(Boolean newSelected) {
		selected = newSelected;
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
	 * Sets the '{@link OrderType#getSalesRepresentative() <em>salesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getSalesRepresentative() salesRepresentative}' feature.
	 * @generated
	 */
	public void setSalesRepresentative(ReferenceType newSalesRepresentative) {
		salesRepresentative = newSalesRepresentative;
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
	 * Sets the '{@link OrderType#getOrderDate() <em>orderDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrderDate() orderDate}' feature.
	 * @generated
	 */
	public void setOrderDate(DateTime newOrderDate) {
		orderDate = newOrderDate;
	}

	/**
	 * Returns the value of '<em><b>scheduledDeliveryDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>scheduledDeliveryDate</b></em>' feature
	 * @generated
	 */
	public DateTime getScheduledDeliveryDate() {
		return scheduledDeliveryDate;
	}

	/**
	 * Sets the '{@link OrderType#getScheduledDeliveryDate() <em>scheduledDeliveryDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getScheduledDeliveryDate() scheduledDeliveryDate}' feature.
	 * @generated
	 */
	public void setScheduledDeliveryDate(DateTime newScheduledDeliveryDate) {
		scheduledDeliveryDate = newScheduledDeliveryDate;
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
	 * Sets the '{@link OrderType#getDatePrinted() <em>datePrinted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDatePrinted() datePrinted}' feature.
	 * @generated
	 */
	public void setDatePrinted(DateTime newDatePrinted) {
		datePrinted = newDatePrinted;
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
	 * Sets the '{@link OrderType#getAccountingDate() <em>accountingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getAccountingDate() accountingDate}' feature.
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
	 * Sets the '{@link OrderType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>invoiceAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceAddress() {
		return invoiceAddress;
	}

	/**
	 * Sets the '{@link OrderType#getInvoiceAddress() <em>invoiceAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getInvoiceAddress() invoiceAddress}' feature.
	 * @generated
	 */
	public void setInvoiceAddress(ReferenceType newInvoiceAddress) {
		invoiceAddress = newInvoiceAddress;
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
	 * Sets the '{@link OrderType#getPartnerAddress() <em>partnerAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPartnerAddress() partnerAddress}' feature.
	 * @generated
	 */
	public void setPartnerAddress(ReferenceType newPartnerAddress) {
		partnerAddress = newPartnerAddress;
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
	 * Sets the '{@link OrderType#getOrderReference() <em>orderReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrderReference() orderReference}' feature.
	 * @generated
	 */
	public void setOrderReference(String newOrderReference) {
		orderReference = newOrderReference;
	}

	/**
	 * Returns the value of '<em><b>printDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printDiscount</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintDiscount() {
		return printDiscount;
	}

	/**
	 * Sets the '{@link OrderType#getPrintDiscount() <em>printDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPrintDiscount() printDiscount}' feature.
	 * @generated
	 */
	public void setPrintDiscount(Boolean newPrintDiscount) {
		printDiscount = newPrintDiscount;
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
	 * Sets the '{@link OrderType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>formOfPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>formOfPayment</b></em>' feature
	 * @generated
	 */
	public String getFormOfPayment() {
		return formOfPayment;
	}

	/**
	 * Sets the '{@link OrderType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFormOfPayment() formOfPayment}' feature.
	 * @generated
	 */
	public void setFormOfPayment(String newFormOfPayment) {
		formOfPayment = newFormOfPayment;
	}

	/**
	 * Returns the value of '<em><b>paymentTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentTerms</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentTerms() {
		return paymentTerms;
	}

	/**
	 * Sets the '{@link OrderType#getPaymentTerms() <em>paymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPaymentTerms() paymentTerms}' feature.
	 * @generated
	 */
	public void setPaymentTerms(ReferenceType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
	}

	/**
	 * Returns the value of '<em><b>invoiceTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTerms</b></em>' feature
	 * @generated
	 */
	public String getInvoiceTerms() {
		return invoiceTerms;
	}

	/**
	 * Sets the '{@link OrderType#getInvoiceTerms() <em>invoiceTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getInvoiceTerms() invoiceTerms}' feature.
	 * @generated
	 */
	public void setInvoiceTerms(String newInvoiceTerms) {
		invoiceTerms = newInvoiceTerms;
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
	 * Sets the '{@link OrderType#getDeliveryTerms() <em>deliveryTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDeliveryTerms() deliveryTerms}' feature.
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
	 * Sets the '{@link OrderType#getFreightCostRule() <em>freightCostRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFreightCostRule() freightCostRule}' feature.
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
	 * Sets the '{@link OrderType#getFreightAmount() <em>freightAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFreightAmount() freightAmount}' feature.
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
	 * Sets the '{@link OrderType#getDeliveryMethod() <em>deliveryMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDeliveryMethod() deliveryMethod}' feature.
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
	 * Sets the '{@link OrderType#getShippingCompany() <em>shippingCompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getShippingCompany() shippingCompany}' feature.
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
	 * Sets the '{@link OrderType#getCharge() <em>charge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCharge() charge}' feature.
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
	 * Sets the '{@link OrderType#getChargeAmount() <em>chargeAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getChargeAmount() chargeAmount}' feature.
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
	 * Sets the '{@link OrderType#getPriority() <em>priority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPriority() priority}' feature.
	 * @generated
	 */
	public void setPriority(String newPriority) {
		priority = newPriority;
	}

	/**
	 * Returns the value of '<em><b>summedLineAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>summedLineAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getSummedLineAmount() {
		return summedLineAmount;
	}

	/**
	 * Sets the '{@link OrderType#getSummedLineAmount() <em>summedLineAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getSummedLineAmount() summedLineAmount}' feature.
	 * @generated
	 */
	public void setSummedLineAmount(Decimal newSummedLineAmount) {
		summedLineAmount = newSummedLineAmount;
	}

	/**
	 * Returns the value of '<em><b>grandTotalAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>grandTotalAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getGrandTotalAmount() {
		return grandTotalAmount;
	}

	/**
	 * Sets the '{@link OrderType#getGrandTotalAmount() <em>grandTotalAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getGrandTotalAmount() grandTotalAmount}' feature.
	 * @generated
	 */
	public void setGrandTotalAmount(Decimal newGrandTotalAmount) {
		grandTotalAmount = newGrandTotalAmount;
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
	 * Sets the '{@link OrderType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(ReferenceType newWarehouse) {
		warehouse = newWarehouse;
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
	 * Sets the '{@link OrderType#getPriceList() <em>priceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPriceList() priceList}' feature.
	 * @generated
	 */
	public void setPriceList(ReferenceType newPriceList) {
		priceList = newPriceList;
	}

	/**
	 * Returns the value of '<em><b>priceIncludesTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceIncludesTax</b></em>' feature
	 * @generated
	 */
	public Boolean getPriceIncludesTax() {
		return priceIncludesTax;
	}

	/**
	 * Sets the '{@link OrderType#getPriceIncludesTax() <em>priceIncludesTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPriceIncludesTax() priceIncludesTax}' feature.
	 * @generated
	 */
	public void setPriceIncludesTax(Boolean newPriceIncludesTax) {
		priceIncludesTax = newPriceIncludesTax;
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
	 * Sets the '{@link OrderType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getSalesCampaign() salesCampaign}' feature.
	 * @generated
	 */
	public void setSalesCampaign(ReferenceType newSalesCampaign) {
		salesCampaign = newSalesCampaign;
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
	 * Sets the '{@link OrderType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ReferenceType newProject) {
		project = newProject;
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
	 * Sets the '{@link OrderType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
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
	 * Sets the '{@link OrderType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
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
	 * Sets the '{@link OrderType#getUserContact() <em>userContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getUserContact() userContact}' feature.
	 * @generated
	 */
	public void setUserContact(ReferenceType newUserContact) {
		userContact = newUserContact;
	}

	/**
	 * Returns the value of '<em><b>copyFrom</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>copyFrom</b></em>' feature
	 * @generated
	 */
	public Boolean getCopyFrom() {
		return copyFrom;
	}

	/**
	 * Sets the '{@link OrderType#getCopyFrom() <em>copyFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCopyFrom() copyFrom}' feature.
	 * @generated
	 */
	public void setCopyFrom(Boolean newCopyFrom) {
		copyFrom = newCopyFrom;
	}

	/**
	 * Returns the value of '<em><b>dropShipPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dropShipPartner</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDropShipPartner() {
		return dropShipPartner;
	}

	/**
	 * Sets the '{@link OrderType#getDropShipPartner() <em>dropShipPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDropShipPartner() dropShipPartner}' feature.
	 * @generated
	 */
	public void setDropShipPartner(ReferenceType newDropShipPartner) {
		dropShipPartner = newDropShipPartner;
	}

	/**
	 * Returns the value of '<em><b>dropShipLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dropShipLocation</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDropShipLocation() {
		return dropShipLocation;
	}

	/**
	 * Sets the '{@link OrderType#getDropShipLocation() <em>dropShipLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDropShipLocation() dropShipLocation}' feature.
	 * @generated
	 */
	public void setDropShipLocation(ReferenceType newDropShipLocation) {
		dropShipLocation = newDropShipLocation;
	}

	/**
	 * Returns the value of '<em><b>dropShipContact</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dropShipContact</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDropShipContact() {
		return dropShipContact;
	}

	/**
	 * Sets the '{@link OrderType#getDropShipContact() <em>dropShipContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDropShipContact() dropShipContact}' feature.
	 * @generated
	 */
	public void setDropShipContact(ReferenceType newDropShipContact) {
		dropShipContact = newDropShipContact;
	}

	/**
	 * Returns the value of '<em><b>selfService</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>selfService</b></em>' feature
	 * @generated
	 */
	public Boolean getSelfService() {
		return selfService;
	}

	/**
	 * Sets the '{@link OrderType#getSelfService() <em>selfService</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getSelfService() selfService}' feature.
	 * @generated
	 */
	public void setSelfService(Boolean newSelfService) {
		selfService = newSelfService;
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
	 * Sets the '{@link OrderType#getTrxOrganization() <em>trxOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getTrxOrganization() trxOrganization}' feature.
	 * @generated
	 */
	public void setTrxOrganization(ReferenceType newTrxOrganization) {
		trxOrganization = newTrxOrganization;
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
	 * Sets the '{@link OrderType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getStDimension() stDimension}' feature.
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
	 * Sets the '{@link OrderType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
	}

	/**
	 * Returns the value of '<em><b>deliveryNotes</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deliveryNotes</b></em>' feature
	 * @generated
	 */
	public String getDeliveryNotes() {
		return deliveryNotes;
	}

	/**
	 * Sets the '{@link OrderType#getDeliveryNotes() <em>deliveryNotes</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDeliveryNotes() deliveryNotes}' feature.
	 * @generated
	 */
	public void setDeliveryNotes(String newDeliveryNotes) {
		deliveryNotes = newDeliveryNotes;
	}

	/**
	 * Returns the value of '<em><b>incoterms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>incoterms</b></em>' feature
	 * @generated
	 */
	public ReferenceType getIncoterms() {
		return incoterms;
	}

	/**
	 * Sets the '{@link OrderType#getIncoterms() <em>incoterms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getIncoterms() incoterms}' feature.
	 * @generated
	 */
	public void setIncoterms(ReferenceType newIncoterms) {
		incoterms = newIncoterms;
	}

	/**
	 * Returns the value of '<em><b>iNCOTERMSDescription</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iNCOTERMSDescription</b></em>' feature
	 * @generated
	 */
	public String getINCOTERMSDescription() {
		return iNCOTERMSDescription;
	}

	/**
	 * Sets the '{@link OrderType#getINCOTERMSDescription() <em>iNCOTERMSDescription</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getINCOTERMSDescription() iNCOTERMSDescription}' feature.
	 * @generated
	 */
	public void setINCOTERMSDescription(String newINCOTERMSDescription) {
		iNCOTERMSDescription = newINCOTERMSDescription;
	}

	/**
	 * Returns the value of '<em><b>generateTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generateTemplate</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerateTemplate() {
		return generateTemplate;
	}

	/**
	 * Sets the '{@link OrderType#getGenerateTemplate() <em>generateTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getGenerateTemplate() generateTemplate}' feature.
	 * @generated
	 */
	public void setGenerateTemplate(Boolean newGenerateTemplate) {
		generateTemplate = newGenerateTemplate;
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
	 * Sets the '{@link OrderType#getDeliveryLocation() <em>deliveryLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getDeliveryLocation() deliveryLocation}' feature.
	 * @generated
	 */
	public void setDeliveryLocation(ReferenceType newDeliveryLocation) {
		deliveryLocation = newDeliveryLocation;
	}

	/**
	 * Returns the value of '<em><b>copyFromPO</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>copyFromPO</b></em>' feature
	 * @generated
	 */
	public Boolean getCopyFromPO() {
		return copyFromPO;
	}

	/**
	 * Sets the '{@link OrderType#getCopyFromPO() <em>copyFromPO</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCopyFromPO() copyFromPO}' feature.
	 * @generated
	 */
	public void setCopyFromPO(Boolean newCopyFromPO) {
		copyFromPO = newCopyFromPO;
	}

	/**
	 * Returns the value of '<em><b>paymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentMethod</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Sets the '{@link OrderType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPriority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPriority</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentPriority() {
		return fINPaymentPriority;
	}

	/**
	 * Sets the '{@link OrderType#getFINPaymentPriority() <em>fINPaymentPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFINPaymentPriority() fINPaymentPriority}' feature.
	 * @generated
	 */
	public void setFINPaymentPriority(ReferenceType newFINPaymentPriority) {
		fINPaymentPriority = newFINPaymentPriority;
	}

	/**
	 * Returns the value of '<em><b>pickFromShipment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pickFromShipment</b></em>' feature
	 * @generated
	 */
	public Boolean getPickFromShipment() {
		return pickFromShipment;
	}

	/**
	 * Sets the '{@link OrderType#getPickFromShipment() <em>pickFromShipment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getPickFromShipment() pickFromShipment}' feature.
	 * @generated
	 */
	public void setPickFromShipment(Boolean newPickFromShipment) {
		pickFromShipment = newPickFromShipment;
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
	 * Sets the '{@link OrderType#getReceiveMaterials() <em>receiveMaterials</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getReceiveMaterials() receiveMaterials}' feature.
	 * @generated
	 */
	public void setReceiveMaterials(Boolean newReceiveMaterials) {
		receiveMaterials = newReceiveMaterials;
	}

	/**
	 * Returns the value of '<em><b>createInvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createInvoice</b></em>' feature
	 * @generated
	 */
	public Boolean getCreateInvoice() {
		return createInvoice;
	}

	/**
	 * Sets the '{@link OrderType#getCreateInvoice() <em>createInvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getCreateInvoice() createInvoice}' feature.
	 * @generated
	 */
	public void setCreateInvoice(Boolean newCreateInvoice) {
		createInvoice = newCreateInvoice;
	}

	/**
	 * Returns the value of '<em><b>returnReason</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnReason</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnReason() {
		return returnReason;
	}

	/**
	 * Sets the '{@link OrderType#getReturnReason() <em>returnReason</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getReturnReason() returnReason}' feature.
	 * @generated
	 */
	public void setReturnReason(ReferenceType newReturnReason) {
		returnReason = newReturnReason;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedInvVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedInvVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentSchedInvVList() {
		return fINPaymentSchedInvVList;
	}

	/**
	 * Sets the '{@link OrderType#getFINPaymentSchedInvVList() <em>fINPaymentSchedInvVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFINPaymentSchedInvVList() fINPaymentSchedInvVList}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvVList(
			ReferenceType newFINPaymentSchedInvVList) {
		fINPaymentSchedInvVList = newFINPaymentSchedInvVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedOrdVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedOrdVList</b></em>' feature
	 * @generated
	 */
	public FINPaymentSchedOrdVListType getFINPaymentSchedOrdVList() {
		return fINPaymentSchedOrdVList;
	}

	/**
	 * Sets the '{@link OrderType#getFINPaymentSchedOrdVList() <em>fINPaymentSchedOrdVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFINPaymentSchedOrdVList() fINPaymentSchedOrdVList}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdVList(
			FINPaymentSchedOrdVListType newFINPaymentSchedOrdVList) {
		fINPaymentSchedOrdVList = newFINPaymentSchedOrdVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentScheduleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentScheduleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentScheduleList() {
		return fINPaymentScheduleList;
	}

	/**
	 * Sets the '{@link OrderType#getFINPaymentScheduleList() <em>fINPaymentScheduleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFINPaymentScheduleList() fINPaymentScheduleList}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleList(
			ReferenceType newFINPaymentScheduleList) {
		fINPaymentScheduleList = newFINPaymentScheduleList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentListType getFinancialMgmtDebtPaymentList() {
		return financialMgmtDebtPaymentList;
	}

	/**
	 * Sets the '{@link OrderType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentList(
			FinancialMgmtDebtPaymentListType newFinancialMgmtDebtPaymentList) {
		financialMgmtDebtPaymentList = newFinancialMgmtDebtPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtJournalLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtJournalLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtJournalLineList() {
		return financialMgmtJournalLineList;
	}

	/**
	 * Sets the '{@link OrderType#getFinancialMgmtJournalLineList() <em>financialMgmtJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getFinancialMgmtJournalLineList() financialMgmtJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtJournalLineList(
			ReferenceType newFinancialMgmtJournalLineList) {
		financialMgmtJournalLineList = newFinancialMgmtJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>invoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceList() {
		return invoiceList;
	}

	/**
	 * Sets the '{@link OrderType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(ReferenceType newInvoiceList) {
		invoiceList = newInvoiceList;
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
	 * Sets the '{@link OrderType#getMaterialMgmtShipmentInOutList() <em>materialMgmtShipmentInOutList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getMaterialMgmtShipmentInOutList() materialMgmtShipmentInOutList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutList(
			ReferenceType newMaterialMgmtShipmentInOutList) {
		materialMgmtShipmentInOutList = newMaterialMgmtShipmentInOutList;
	}

	/**
	 * Returns the value of '<em><b>orderDiscountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDiscountList</b></em>' feature
	 * @generated
	 */
	public OrderDiscountListType getOrderDiscountList() {
		return orderDiscountList;
	}

	/**
	 * Sets the '{@link OrderType#getOrderDiscountList() <em>orderDiscountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrderDiscountList() orderDiscountList}' feature.
	 * @generated
	 */
	public void setOrderDiscountList(OrderDiscountListType newOrderDiscountList) {
		orderDiscountList = newOrderDiscountList;
	}

	/**
	 * Returns the value of '<em><b>orderLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineList</b></em>' feature
	 * @generated
	 */
	public OrderLineListType getOrderLineList() {
		return orderLineList;
	}

	/**
	 * Sets the '{@link OrderType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(OrderLineListType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>orderLineTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineTaxList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderLineTaxList() {
		return orderLineTaxList;
	}

	/**
	 * Sets the '{@link OrderType#getOrderLineTaxList() <em>orderLineTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrderLineTaxList() orderLineTaxList}' feature.
	 * @generated
	 */
	public void setOrderLineTaxList(ReferenceType newOrderLineTaxList) {
		orderLineTaxList = newOrderLineTaxList;
	}

	/**
	 * Returns the value of '<em><b>orderTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderTaxList</b></em>' feature
	 * @generated
	 */
	public OrderTaxListType getOrderTaxList() {
		return orderTaxList;
	}

	/**
	 * Sets the '{@link OrderType#getOrderTaxList() <em>orderTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getOrderTaxList() orderTaxList}' feature.
	 * @generated
	 */
	public void setOrderTaxList(OrderTaxListType newOrderTaxList) {
		orderTaxList = newOrderTaxList;
	}

	/**
	 * Returns the value of '<em><b>projectLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectLineList() {
		return projectLineList;
	}

	/**
	 * Sets the '{@link OrderType#getProjectLineList() <em>projectLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getProjectLineList() projectLineList}' feature.
	 * @generated
	 */
	public void setProjectLineList(ReferenceType newProjectLineList) {
		projectLineList = newProjectLineList;
	}

	/**
	 * Returns the value of '<em><b>projectLinePurchaseOrderList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLinePurchaseOrderList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectLinePurchaseOrderList() {
		return projectLinePurchaseOrderList;
	}

	/**
	 * Sets the '{@link OrderType#getProjectLinePurchaseOrderList() <em>projectLinePurchaseOrderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getProjectLinePurchaseOrderList() projectLinePurchaseOrderList}' feature.
	 * @generated
	 */
	public void setProjectLinePurchaseOrderList(
			ReferenceType newProjectLinePurchaseOrderList) {
		projectLinePurchaseOrderList = newProjectLinePurchaseOrderList;
	}

	/**
	 * Returns the value of '<em><b>projectPhaseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhaseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectPhaseList() {
		return projectPhaseList;
	}

	/**
	 * Sets the '{@link OrderType#getProjectPhaseList() <em>projectPhaseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getProjectPhaseList() projectPhaseList}' feature.
	 * @generated
	 */
	public void setProjectPhaseList(ReferenceType newProjectPhaseList) {
		projectPhaseList = newProjectPhaseList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialOrderPickEditLinesReturnOrderList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialOrderPickEditLinesReturnOrderList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialOrderPickEditLinesReturnOrderList() {
		return returnMaterialOrderPickEditLinesReturnOrderList;
	}

	/**
	 * Sets the '{@link OrderType#getReturnMaterialOrderPickEditLinesReturnOrderList() <em>returnMaterialOrderPickEditLinesReturnOrderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getReturnMaterialOrderPickEditLinesReturnOrderList() returnMaterialOrderPickEditLinesReturnOrderList}' feature.
	 * @generated
	 */
	public void setReturnMaterialOrderPickEditLinesReturnOrderList(
			ReferenceType newReturnMaterialOrderPickEditLinesReturnOrderList) {
		returnMaterialOrderPickEditLinesReturnOrderList = newReturnMaterialOrderPickEditLinesReturnOrderList;
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
	 * Sets the '{@link OrderType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getId1() id1}' feature.
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
	 * Sets the '{@link OrderType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link OrderType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#isReference() reference}' feature.
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
	public List<OrderTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link OrderType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OrderType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<OrderTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "OrderType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
