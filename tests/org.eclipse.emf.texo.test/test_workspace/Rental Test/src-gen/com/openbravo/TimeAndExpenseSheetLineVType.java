package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>TimeAndExpenseSheetLineVType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class TimeAndExpenseSheetLineVType {

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
	private ReferenceType expenseSheet = null;

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
	private Boolean timeSheet = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime reportDate = null;

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
	private Decimal expenseAmount = null;

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
	private Decimal convertedAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType resourceAssignment = null;

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
	private String comments = null;

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
	private ReferenceType salesCampaign = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal invoicePrice = null;

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
	private ReferenceType salesOrderLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectPhase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectTask = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeType = null;

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
	private DateTime expenseDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType chargedBusinessPartner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType sheetLine = null;

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
	private List<TimeAndExpenseSheetLineVTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<TimeAndExpenseSheetLineVTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getId() id}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getClient() client}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getOrganization() organization}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getActive() active}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getUpdated() updated}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>expenseSheet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseSheet</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExpenseSheet() {
		return expenseSheet;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getExpenseSheet() <em>expenseSheet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getExpenseSheet() expenseSheet}' feature.
	 * @generated
	 */
	public void setExpenseSheet(ReferenceType newExpenseSheet) {
		expenseSheet = newExpenseSheet;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>timeSheet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeSheet</b></em>' feature
	 * @generated
	 */
	public Boolean getTimeSheet() {
		return timeSheet;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getTimeSheet() <em>timeSheet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getTimeSheet() timeSheet}' feature.
	 * @generated
	 */
	public void setTimeSheet(Boolean newTimeSheet) {
		timeSheet = newTimeSheet;
	}

	/**
	 * Returns the value of '<em><b>reportDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reportDate</b></em>' feature
	 * @generated
	 */
	public DateTime getReportDate() {
		return reportDate;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getReportDate() <em>reportDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getReportDate() reportDate}' feature.
	 * @generated
	 */
	public void setReportDate(DateTime newReportDate) {
		reportDate = newReportDate;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getProduct() product}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getQuantity() <em>quantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getQuantity() quantity}' feature.
	 * @generated
	 */
	public void setQuantity(Decimal newQuantity) {
		quantity = newQuantity;
	}

	/**
	 * Returns the value of '<em><b>expenseAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getExpenseAmount() {
		return expenseAmount;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getExpenseAmount() <em>expenseAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getExpenseAmount() expenseAmount}' feature.
	 * @generated
	 */
	public void setExpenseAmount(Decimal newExpenseAmount) {
		expenseAmount = newExpenseAmount;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>convertedAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>convertedAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getConvertedAmount() {
		return convertedAmount;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getConvertedAmount() <em>convertedAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getConvertedAmount() convertedAmount}' feature.
	 * @generated
	 */
	public void setConvertedAmount(Decimal newConvertedAmount) {
		convertedAmount = newConvertedAmount;
	}

	/**
	 * Returns the value of '<em><b>resourceAssignment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceAssignment</b></em>' feature
	 * @generated
	 */
	public ReferenceType getResourceAssignment() {
		return resourceAssignment;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getResourceAssignment() <em>resourceAssignment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getResourceAssignment() resourceAssignment}' feature.
	 * @generated
	 */
	public void setResourceAssignment(ReferenceType newResourceAssignment) {
		resourceAssignment = newResourceAssignment;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>comments</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>comments</b></em>' feature
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getComments() <em>comments</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getComments() comments}' feature.
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getReinvoice() <em>reinvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getReinvoice() reinvoice}' feature.
	 * @generated
	 */
	public void setReinvoice(Boolean newReinvoice) {
		reinvoice = newReinvoice;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getProject() project}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getSalesCampaign() salesCampaign}' feature.
	 * @generated
	 */
	public void setSalesCampaign(ReferenceType newSalesCampaign) {
		salesCampaign = newSalesCampaign;
	}

	/**
	 * Returns the value of '<em><b>invoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLine() {
		return invoiceLine;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getInvoiceLine() <em>invoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getInvoiceLine() invoiceLine}' feature.
	 * @generated
	 */
	public void setInvoiceLine(ReferenceType newInvoiceLine) {
		invoiceLine = newInvoiceLine;
	}

	/**
	 * Returns the value of '<em><b>invoicePrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoicePrice</b></em>' feature
	 * @generated
	 */
	public Decimal getInvoicePrice() {
		return invoicePrice;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getInvoicePrice() <em>invoicePrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getInvoicePrice() invoicePrice}' feature.
	 * @generated
	 */
	public void setInvoicePrice(Decimal newInvoicePrice) {
		invoicePrice = newInvoicePrice;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ReferenceType newUOM) {
		uOM = newUOM;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getSalesOrderLine() <em>salesOrderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getSalesOrderLine() salesOrderLine}' feature.
	 * @generated
	 */
	public void setSalesOrderLine(ReferenceType newSalesOrderLine) {
		salesOrderLine = newSalesOrderLine;
	}

	/**
	 * Returns the value of '<em><b>projectPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhase</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectPhase() {
		return projectPhase;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(ReferenceType newProjectPhase) {
		projectPhase = newProjectPhase;
	}

	/**
	 * Returns the value of '<em><b>projectTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectTask</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectTask() {
		return projectTask;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getProjectTask() <em>projectTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getProjectTask() projectTask}' feature.
	 * @generated
	 */
	public void setProjectTask(ReferenceType newProjectTask) {
		projectTask = newProjectTask;
	}

	/**
	 * Returns the value of '<em><b>timeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeType</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeType() {
		return timeType;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getTimeType() <em>timeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getTimeType() timeType}' feature.
	 * @generated
	 */
	public void setTimeType(ReferenceType newTimeType) {
		timeType = newTimeType;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>expenseDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseDate</b></em>' feature
	 * @generated
	 */
	public DateTime getExpenseDate() {
		return expenseDate;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getExpenseDate() <em>expenseDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getExpenseDate() expenseDate}' feature.
	 * @generated
	 */
	public void setExpenseDate(DateTime newExpenseDate) {
		expenseDate = newExpenseDate;
	}

	/**
	 * Returns the value of '<em><b>chargedBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>chargedBusinessPartner</b></em>' feature
	 * @generated
	 */
	public ReferenceType getChargedBusinessPartner() {
		return chargedBusinessPartner;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getChargedBusinessPartner() <em>chargedBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getChargedBusinessPartner() chargedBusinessPartner}' feature.
	 * @generated
	 */
	public void setChargedBusinessPartner(
			ReferenceType newChargedBusinessPartner) {
		chargedBusinessPartner = newChargedBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>sheetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sheetLine</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSheetLine() {
		return sheetLine;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getSheetLine() <em>sheetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getSheetLine() sheetLine}' feature.
	 * @generated
	 */
	public void setSheetLine(ReferenceType newSheetLine) {
		sheetLine = newSheetLine;
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getId1() id1}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link TimeAndExpenseSheetLineVType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#isReference() reference}' feature.
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
	public List<TimeAndExpenseSheetLineVTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link TimeAndExpenseSheetLineVType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link TimeAndExpenseSheetLineVType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<TimeAndExpenseSheetLineVTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "TimeAndExpenseSheetLineVType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
