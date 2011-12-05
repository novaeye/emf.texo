package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>InvoiceType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class InvoiceType {

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
	private String posted = null;

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
	private ReferenceType salesOrder = null;

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
	private Boolean print = null;

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
	private DateTime invoiceDate = null;

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
	private DateTime orderDate = null;

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
	private Boolean copyFrom = null;

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
	private Decimal withholdingamount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime taxDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType withholding = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean paymentComplete = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal totalPaid = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal outstandingAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long daysTillDue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal dueAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime lastCalculatedOnDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean updatePaymentMonitor = null;

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
	private Boolean aPRMAddpayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String aPRMProcessinvoice = null;

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
	private ReferenceType aPRMPendingPaymentInvoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyConversionRateDocListType1 currencyConversionRateDocList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentSchedInvVListType fINPaymentSchedInvVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentSchedOrdVListType1 fINPaymentSchedOrdVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentScheduleListType fINPaymentScheduleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentListType1 financialMgmtDebtPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentCancelVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentGenerateVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceDiscountListType invoiceDiscountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceLineListType invoiceLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineTaxList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceTaxListType invoiceTaxList = null;

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
	private ReferenceType pricingVolumeDiscountInvoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReversedInvoicesListType reversedInvoicesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType reversedInvoicesReversedInvoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCommissionRunList = null;

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
	private List<InvoiceTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<InvoiceTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link InvoiceType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getId() id}' feature.
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
	 * Sets the '{@link InvoiceType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getClient() client}' feature.
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
	 * Sets the '{@link InvoiceType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getOrganization() organization}' feature.
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
	 * Sets the '{@link InvoiceType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getActive() active}' feature.
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
	 * Sets the '{@link InvoiceType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link InvoiceType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link InvoiceType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getUpdated() updated}' feature.
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
	 * Sets the '{@link InvoiceType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link InvoiceType#getSalesTransaction() <em>salesTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSalesTransaction() salesTransaction}' feature.
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
	 * Sets the '{@link InvoiceType#getDocumentNo() <em>documentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDocumentNo() documentNo}' feature.
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
	 * Sets the '{@link InvoiceType#getDocumentStatus() <em>documentStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDocumentStatus() documentStatus}' feature.
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
	 * Sets the '{@link InvoiceType#getDocumentAction() <em>documentAction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDocumentAction() documentAction}' feature.
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
	 * Sets the '{@link InvoiceType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getProcessNow() processNow}' feature.
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
	 * Sets the '{@link InvoiceType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getProcessed() processed}' feature.
	 * @generated
	 */
	public void setProcessed(Boolean newProcessed) {
		processed = newProcessed;
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
	 * Sets the '{@link InvoiceType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
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
	 * Sets the '{@link InvoiceType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDocumentType() documentType}' feature.
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
	 * Sets the '{@link InvoiceType#getTransactionDocument() <em>transactionDocument</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getTransactionDocument() transactionDocument}' feature.
	 * @generated
	 */
	public void setTransactionDocument(ReferenceType newTransactionDocument) {
		transactionDocument = newTransactionDocument;
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
	 * Sets the '{@link InvoiceType#getSalesOrder() <em>salesOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSalesOrder() salesOrder}' feature.
	 * @generated
	 */
	public void setSalesOrder(ReferenceType newSalesOrder) {
		salesOrder = newSalesOrder;
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
	 * Sets the '{@link InvoiceType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link InvoiceType#getPrint() <em>print</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPrint() print}' feature.
	 * @generated
	 */
	public void setPrint(Boolean newPrint) {
		print = newPrint;
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
	 * Sets the '{@link InvoiceType#getSalesRepresentative() <em>salesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSalesRepresentative() salesRepresentative}' feature.
	 * @generated
	 */
	public void setSalesRepresentative(ReferenceType newSalesRepresentative) {
		salesRepresentative = newSalesRepresentative;
	}

	/**
	 * Returns the value of '<em><b>invoiceDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceDate</b></em>' feature
	 * @generated
	 */
	public DateTime getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * Sets the '{@link InvoiceType#getInvoiceDate() <em>invoiceDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getInvoiceDate() invoiceDate}' feature.
	 * @generated
	 */
	public void setInvoiceDate(DateTime newInvoiceDate) {
		invoiceDate = newInvoiceDate;
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
	 * Sets the '{@link InvoiceType#getDatePrinted() <em>datePrinted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDatePrinted() datePrinted}' feature.
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
	 * Sets the '{@link InvoiceType#getAccountingDate() <em>accountingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getAccountingDate() accountingDate}' feature.
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
	 * Sets the '{@link InvoiceType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getBusinessPartner() businessPartner}' feature.
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
	 * Sets the '{@link InvoiceType#getPartnerAddress() <em>partnerAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPartnerAddress() partnerAddress}' feature.
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
	 * Sets the '{@link InvoiceType#getOrderReference() <em>orderReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getOrderReference() orderReference}' feature.
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
	 * Sets the '{@link InvoiceType#getPrintDiscount() <em>printDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPrintDiscount() printDiscount}' feature.
	 * @generated
	 */
	public void setPrintDiscount(Boolean newPrintDiscount) {
		printDiscount = newPrintDiscount;
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
	 * Sets the '{@link InvoiceType#getOrderDate() <em>orderDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getOrderDate() orderDate}' feature.
	 * @generated
	 */
	public void setOrderDate(DateTime newOrderDate) {
		orderDate = newOrderDate;
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
	 * Sets the '{@link InvoiceType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCurrency() currency}' feature.
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
	 * Sets the '{@link InvoiceType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFormOfPayment() formOfPayment}' feature.
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
	 * Sets the '{@link InvoiceType#getPaymentTerms() <em>paymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPaymentTerms() paymentTerms}' feature.
	 * @generated
	 */
	public void setPaymentTerms(ReferenceType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
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
	 * Sets the '{@link InvoiceType#getCharge() <em>charge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCharge() charge}' feature.
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
	 * Sets the '{@link InvoiceType#getChargeAmount() <em>chargeAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getChargeAmount() chargeAmount}' feature.
	 * @generated
	 */
	public void setChargeAmount(Decimal newChargeAmount) {
		chargeAmount = newChargeAmount;
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
	 * Sets the '{@link InvoiceType#getSummedLineAmount() <em>summedLineAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSummedLineAmount() summedLineAmount}' feature.
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
	 * Sets the '{@link InvoiceType#getGrandTotalAmount() <em>grandTotalAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getGrandTotalAmount() grandTotalAmount}' feature.
	 * @generated
	 */
	public void setGrandTotalAmount(Decimal newGrandTotalAmount) {
		grandTotalAmount = newGrandTotalAmount;
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
	 * Sets the '{@link InvoiceType#getPriceList() <em>priceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPriceList() priceList}' feature.
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
	 * Sets the '{@link InvoiceType#getPriceIncludesTax() <em>priceIncludesTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPriceIncludesTax() priceIncludesTax}' feature.
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
	 * Sets the '{@link InvoiceType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSalesCampaign() salesCampaign}' feature.
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
	 * Sets the '{@link InvoiceType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getProject() project}' feature.
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
	 * Sets the '{@link InvoiceType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
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
	 * Sets the '{@link InvoiceType#getCreateLinesFrom() <em>createLinesFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCreateLinesFrom() createLinesFrom}' feature.
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
	 * Sets the '{@link InvoiceType#getGenerateTo() <em>generateTo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getGenerateTo() generateTo}' feature.
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
	 * Sets the '{@link InvoiceType#getUserContact() <em>userContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getUserContact() userContact}' feature.
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
	 * Sets the '{@link InvoiceType#getCopyFrom() <em>copyFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCopyFrom() copyFrom}' feature.
	 * @generated
	 */
	public void setCopyFrom(Boolean newCopyFrom) {
		copyFrom = newCopyFrom;
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
	 * Sets the '{@link InvoiceType#getSelfService() <em>selfService</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSelfService() selfService}' feature.
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
	 * Sets the '{@link InvoiceType#getTrxOrganization() <em>trxOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getTrxOrganization() trxOrganization}' feature.
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
	 * Sets the '{@link InvoiceType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getStDimension() stDimension}' feature.
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
	 * Sets the '{@link InvoiceType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
	}

	/**
	 * Returns the value of '<em><b>withholdingamount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withholdingamount</b></em>' feature
	 * @generated
	 */
	public Decimal getWithholdingamount() {
		return withholdingamount;
	}

	/**
	 * Sets the '{@link InvoiceType#getWithholdingamount() <em>withholdingamount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getWithholdingamount() withholdingamount}' feature.
	 * @generated
	 */
	public void setWithholdingamount(Decimal newWithholdingamount) {
		withholdingamount = newWithholdingamount;
	}

	/**
	 * Returns the value of '<em><b>taxDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxDate</b></em>' feature
	 * @generated
	 */
	public DateTime getTaxDate() {
		return taxDate;
	}

	/**
	 * Sets the '{@link InvoiceType#getTaxDate() <em>taxDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getTaxDate() taxDate}' feature.
	 * @generated
	 */
	public void setTaxDate(DateTime newTaxDate) {
		taxDate = newTaxDate;
	}

	/**
	 * Returns the value of '<em><b>withholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>withholding</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWithholding() {
		return withholding;
	}

	/**
	 * Sets the '{@link InvoiceType#getWithholding() <em>withholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getWithholding() withholding}' feature.
	 * @generated
	 */
	public void setWithholding(ReferenceType newWithholding) {
		withholding = newWithholding;
	}

	/**
	 * Returns the value of '<em><b>paymentComplete</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentComplete</b></em>' feature
	 * @generated
	 */
	public Boolean getPaymentComplete() {
		return paymentComplete;
	}

	/**
	 * Sets the '{@link InvoiceType#getPaymentComplete() <em>paymentComplete</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPaymentComplete() paymentComplete}' feature.
	 * @generated
	 */
	public void setPaymentComplete(Boolean newPaymentComplete) {
		paymentComplete = newPaymentComplete;
	}

	/**
	 * Returns the value of '<em><b>totalPaid</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>totalPaid</b></em>' feature
	 * @generated
	 */
	public Decimal getTotalPaid() {
		return totalPaid;
	}

	/**
	 * Sets the '{@link InvoiceType#getTotalPaid() <em>totalPaid</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getTotalPaid() totalPaid}' feature.
	 * @generated
	 */
	public void setTotalPaid(Decimal newTotalPaid) {
		totalPaid = newTotalPaid;
	}

	/**
	 * Returns the value of '<em><b>outstandingAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>outstandingAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getOutstandingAmount() {
		return outstandingAmount;
	}

	/**
	 * Sets the '{@link InvoiceType#getOutstandingAmount() <em>outstandingAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getOutstandingAmount() outstandingAmount}' feature.
	 * @generated
	 */
	public void setOutstandingAmount(Decimal newOutstandingAmount) {
		outstandingAmount = newOutstandingAmount;
	}

	/**
	 * Returns the value of '<em><b>daysTillDue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>daysTillDue</b></em>' feature
	 * @generated
	 */
	public Long getDaysTillDue() {
		return daysTillDue;
	}

	/**
	 * Sets the '{@link InvoiceType#getDaysTillDue() <em>daysTillDue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDaysTillDue() daysTillDue}' feature.
	 * @generated
	 */
	public void setDaysTillDue(Long newDaysTillDue) {
		daysTillDue = newDaysTillDue;
	}

	/**
	 * Returns the value of '<em><b>dueAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dueAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getDueAmount() {
		return dueAmount;
	}

	/**
	 * Sets the '{@link InvoiceType#getDueAmount() <em>dueAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getDueAmount() dueAmount}' feature.
	 * @generated
	 */
	public void setDueAmount(Decimal newDueAmount) {
		dueAmount = newDueAmount;
	}

	/**
	 * Returns the value of '<em><b>lastCalculatedOnDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastCalculatedOnDate</b></em>' feature
	 * @generated
	 */
	public DateTime getLastCalculatedOnDate() {
		return lastCalculatedOnDate;
	}

	/**
	 * Sets the '{@link InvoiceType#getLastCalculatedOnDate() <em>lastCalculatedOnDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getLastCalculatedOnDate() lastCalculatedOnDate}' feature.
	 * @generated
	 */
	public void setLastCalculatedOnDate(DateTime newLastCalculatedOnDate) {
		lastCalculatedOnDate = newLastCalculatedOnDate;
	}

	/**
	 * Returns the value of '<em><b>updatePaymentMonitor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>updatePaymentMonitor</b></em>' feature
	 * @generated
	 */
	public Boolean getUpdatePaymentMonitor() {
		return updatePaymentMonitor;
	}

	/**
	 * Sets the '{@link InvoiceType#getUpdatePaymentMonitor() <em>updatePaymentMonitor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getUpdatePaymentMonitor() updatePaymentMonitor}' feature.
	 * @generated
	 */
	public void setUpdatePaymentMonitor(Boolean newUpdatePaymentMonitor) {
		updatePaymentMonitor = newUpdatePaymentMonitor;
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
	 * Sets the '{@link InvoiceType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
	}

	/**
	 * Returns the value of '<em><b>aPRMAddpayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMAddpayment</b></em>' feature
	 * @generated
	 */
	public Boolean getAPRMAddpayment() {
		return aPRMAddpayment;
	}

	/**
	 * Sets the '{@link InvoiceType#getAPRMAddpayment() <em>aPRMAddpayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getAPRMAddpayment() aPRMAddpayment}' feature.
	 * @generated
	 */
	public void setAPRMAddpayment(Boolean newAPRMAddpayment) {
		aPRMAddpayment = newAPRMAddpayment;
	}

	/**
	 * Returns the value of '<em><b>aPRMProcessinvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMProcessinvoice</b></em>' feature
	 * @generated
	 */
	public String getAPRMProcessinvoice() {
		return aPRMProcessinvoice;
	}

	/**
	 * Sets the '{@link InvoiceType#getAPRMProcessinvoice() <em>aPRMProcessinvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getAPRMProcessinvoice() aPRMProcessinvoice}' feature.
	 * @generated
	 */
	public void setAPRMProcessinvoice(String newAPRMProcessinvoice) {
		aPRMProcessinvoice = newAPRMProcessinvoice;
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
	 * Sets the '{@link InvoiceType#getFINPaymentPriority() <em>fINPaymentPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFINPaymentPriority() fINPaymentPriority}' feature.
	 * @generated
	 */
	public void setFINPaymentPriority(ReferenceType newFINPaymentPriority) {
		fINPaymentPriority = newFINPaymentPriority;
	}

	/**
	 * Returns the value of '<em><b>aPRMPendingPaymentInvoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMPendingPaymentInvoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMPendingPaymentInvoiceList() {
		return aPRMPendingPaymentInvoiceList;
	}

	/**
	 * Sets the '{@link InvoiceType#getAPRMPendingPaymentInvoiceList() <em>aPRMPendingPaymentInvoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getAPRMPendingPaymentInvoiceList() aPRMPendingPaymentInvoiceList}' feature.
	 * @generated
	 */
	public void setAPRMPendingPaymentInvoiceList(
			ReferenceType newAPRMPendingPaymentInvoiceList) {
		aPRMPendingPaymentInvoiceList = newAPRMPendingPaymentInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateDocList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDocList</b></em>' feature
	 * @generated
	 */
	public CurrencyConversionRateDocListType1 getCurrencyConversionRateDocList() {
		return currencyConversionRateDocList;
	}

	/**
	 * Sets the '{@link InvoiceType#getCurrencyConversionRateDocList() <em>currencyConversionRateDocList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getCurrencyConversionRateDocList() currencyConversionRateDocList}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDocList(
			CurrencyConversionRateDocListType1 newCurrencyConversionRateDocList) {
		currencyConversionRateDocList = newCurrencyConversionRateDocList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedInvVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedInvVList</b></em>' feature
	 * @generated
	 */
	public FINPaymentSchedInvVListType getFINPaymentSchedInvVList() {
		return fINPaymentSchedInvVList;
	}

	/**
	 * Sets the '{@link InvoiceType#getFINPaymentSchedInvVList() <em>fINPaymentSchedInvVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFINPaymentSchedInvVList() fINPaymentSchedInvVList}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvVList(
			FINPaymentSchedInvVListType newFINPaymentSchedInvVList) {
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
	public FINPaymentSchedOrdVListType1 getFINPaymentSchedOrdVList() {
		return fINPaymentSchedOrdVList;
	}

	/**
	 * Sets the '{@link InvoiceType#getFINPaymentSchedOrdVList() <em>fINPaymentSchedOrdVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFINPaymentSchedOrdVList() fINPaymentSchedOrdVList}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdVList(
			FINPaymentSchedOrdVListType1 newFINPaymentSchedOrdVList) {
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
	public FINPaymentScheduleListType getFINPaymentScheduleList() {
		return fINPaymentScheduleList;
	}

	/**
	 * Sets the '{@link InvoiceType#getFINPaymentScheduleList() <em>fINPaymentScheduleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFINPaymentScheduleList() fINPaymentScheduleList}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleList(
			FINPaymentScheduleListType newFINPaymentScheduleList) {
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
	public FinancialMgmtDebtPaymentListType1 getFinancialMgmtDebtPaymentList() {
		return financialMgmtDebtPaymentList;
	}

	/**
	 * Sets the '{@link InvoiceType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentList(
			FinancialMgmtDebtPaymentListType1 newFinancialMgmtDebtPaymentList) {
		financialMgmtDebtPaymentList = newFinancialMgmtDebtPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentCancelVList() {
		return financialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Sets the '{@link InvoiceType#getFinancialMgmtDebtPaymentCancelVList() <em>financialMgmtDebtPaymentCancelVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFinancialMgmtDebtPaymentCancelVList() financialMgmtDebtPaymentCancelVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelVList(
			ReferenceType newFinancialMgmtDebtPaymentCancelVList) {
		financialMgmtDebtPaymentCancelVList = newFinancialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentGenerateVList() {
		return financialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Sets the '{@link InvoiceType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVList(
			ReferenceType newFinancialMgmtDebtPaymentGenerateVList) {
		financialMgmtDebtPaymentGenerateVList = newFinancialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Returns the value of '<em><b>invoiceDiscountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceDiscountList</b></em>' feature
	 * @generated
	 */
	public InvoiceDiscountListType getInvoiceDiscountList() {
		return invoiceDiscountList;
	}

	/**
	 * Sets the '{@link InvoiceType#getInvoiceDiscountList() <em>invoiceDiscountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getInvoiceDiscountList() invoiceDiscountList}' feature.
	 * @generated
	 */
	public void setInvoiceDiscountList(
			InvoiceDiscountListType newInvoiceDiscountList) {
		invoiceDiscountList = newInvoiceDiscountList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineList</b></em>' feature
	 * @generated
	 */
	public InvoiceLineListType getInvoiceLineList() {
		return invoiceLineList;
	}

	/**
	 * Sets the '{@link InvoiceType#getInvoiceLineList() <em>invoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getInvoiceLineList() invoiceLineList}' feature.
	 * @generated
	 */
	public void setInvoiceLineList(InvoiceLineListType newInvoiceLineList) {
		invoiceLineList = newInvoiceLineList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineTaxList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineTaxList() {
		return invoiceLineTaxList;
	}

	/**
	 * Sets the '{@link InvoiceType#getInvoiceLineTaxList() <em>invoiceLineTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getInvoiceLineTaxList() invoiceLineTaxList}' feature.
	 * @generated
	 */
	public void setInvoiceLineTaxList(ReferenceType newInvoiceLineTaxList) {
		invoiceLineTaxList = newInvoiceLineTaxList;
	}

	/**
	 * Returns the value of '<em><b>invoiceTaxList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTaxList</b></em>' feature
	 * @generated
	 */
	public InvoiceTaxListType getInvoiceTaxList() {
		return invoiceTaxList;
	}

	/**
	 * Sets the '{@link InvoiceType#getInvoiceTaxList() <em>invoiceTaxList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getInvoiceTaxList() invoiceTaxList}' feature.
	 * @generated
	 */
	public void setInvoiceTaxList(InvoiceTaxListType newInvoiceTaxList) {
		invoiceTaxList = newInvoiceTaxList;
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
	 * Sets the '{@link InvoiceType#getMaterialMgmtShipmentInOutList() <em>materialMgmtShipmentInOutList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getMaterialMgmtShipmentInOutList() materialMgmtShipmentInOutList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutList(
			ReferenceType newMaterialMgmtShipmentInOutList) {
		materialMgmtShipmentInOutList = newMaterialMgmtShipmentInOutList;
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountInvoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountInvoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingVolumeDiscountInvoiceList() {
		return pricingVolumeDiscountInvoiceList;
	}

	/**
	 * Sets the '{@link InvoiceType#getPricingVolumeDiscountInvoiceList() <em>pricingVolumeDiscountInvoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getPricingVolumeDiscountInvoiceList() pricingVolumeDiscountInvoiceList}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountInvoiceList(
			ReferenceType newPricingVolumeDiscountInvoiceList) {
		pricingVolumeDiscountInvoiceList = newPricingVolumeDiscountInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>reversedInvoicesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reversedInvoicesList</b></em>' feature
	 * @generated
	 */
	public ReversedInvoicesListType getReversedInvoicesList() {
		return reversedInvoicesList;
	}

	/**
	 * Sets the '{@link InvoiceType#getReversedInvoicesList() <em>reversedInvoicesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getReversedInvoicesList() reversedInvoicesList}' feature.
	 * @generated
	 */
	public void setReversedInvoicesList(
			ReversedInvoicesListType newReversedInvoicesList) {
		reversedInvoicesList = newReversedInvoicesList;
	}

	/**
	 * Returns the value of '<em><b>reversedInvoicesReversedInvoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reversedInvoicesReversedInvoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReversedInvoicesReversedInvoiceList() {
		return reversedInvoicesReversedInvoiceList;
	}

	/**
	 * Sets the '{@link InvoiceType#getReversedInvoicesReversedInvoiceList() <em>reversedInvoicesReversedInvoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getReversedInvoicesReversedInvoiceList() reversedInvoicesReversedInvoiceList}' feature.
	 * @generated
	 */
	public void setReversedInvoicesReversedInvoiceList(
			ReferenceType newReversedInvoicesReversedInvoiceList) {
		reversedInvoicesReversedInvoiceList = newReversedInvoicesReversedInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>salesCommissionRunList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionRunList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCommissionRunList() {
		return salesCommissionRunList;
	}

	/**
	 * Sets the '{@link InvoiceType#getSalesCommissionRunList() <em>salesCommissionRunList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getSalesCommissionRunList() salesCommissionRunList}' feature.
	 * @generated
	 */
	public void setSalesCommissionRunList(
			ReferenceType newSalesCommissionRunList) {
		salesCommissionRunList = newSalesCommissionRunList;
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
	 * Sets the '{@link InvoiceType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getId1() id1}' feature.
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
	 * Sets the '{@link InvoiceType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link InvoiceType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#isReference() reference}' feature.
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
	public List<InvoiceTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link InvoiceType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link InvoiceType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<InvoiceTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "InvoiceType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
