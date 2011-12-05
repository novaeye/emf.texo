package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtSettlementType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtSettlementType {

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
	private String documentNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime transactionDate = null;

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
	private Boolean processNow = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String processed = null;

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
	private Boolean createLinesFrom = null;

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
	private Decimal canceledNotCharged = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal createdAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal chargedAmount = null;

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
	private Boolean createFile = null;

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
	private String settlementType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean openSettlement = null;

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
	private Boolean generated = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean template = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentSettlementCancelledListType financialMgmtDebtPaymentSettlementCancelledList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentCSettlementGenerateIDListType financialMgmtDebtPaymentCSettlementGenerateIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentCancelVListType financialMgmtDebtPaymentCancelVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentCancelVSettlementGenerateList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentGenerateVListType financialMgmtDebtPaymentGenerateVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentGenerateVSettlementCancelledList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtRemittanceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxPaymentList = null;

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
	private List<FinancialMgmtSettlementTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtSettlementTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtSettlementType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getDocumentNo() <em>documentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getDocumentNo() documentNo}' feature.
	 * @generated
	 */
	public void setDocumentNo(String newDocumentNo) {
		documentNo = newDocumentNo;
	}

	/**
	 * Returns the value of '<em><b>transactionDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transactionDate</b></em>' feature
	 * @generated
	 */
	public DateTime getTransactionDate() {
		return transactionDate;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getTransactionDate() <em>transactionDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getTransactionDate() transactionDate}' feature.
	 * @generated
	 */
	public void setTransactionDate(DateTime newTransactionDate) {
		transactionDate = newTransactionDate;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(ReferenceType newDocumentType) {
		documentType = newDocumentType;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getProcessNow() processNow}' feature.
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
	public String getProcessed() {
		return processed;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getProcessed() processed}' feature.
	 * @generated
	 */
	public void setProcessed(String newProcessed) {
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
	 * Sets the '{@link FinancialMgmtSettlementType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getProject() project}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getSalesCampaign() salesCampaign}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getActivity() activity}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getStDimension() stDimension}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getCreateLinesFrom() <em>createLinesFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCreateLinesFrom() createLinesFrom}' feature.
	 * @generated
	 */
	public void setCreateLinesFrom(Boolean newCreateLinesFrom) {
		createLinesFrom = newCreateLinesFrom;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>canceledNotCharged</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>canceledNotCharged</b></em>' feature
	 * @generated
	 */
	public Decimal getCanceledNotCharged() {
		return canceledNotCharged;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getCanceledNotCharged() <em>canceledNotCharged</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCanceledNotCharged() canceledNotCharged}' feature.
	 * @generated
	 */
	public void setCanceledNotCharged(Decimal newCanceledNotCharged) {
		canceledNotCharged = newCanceledNotCharged;
	}

	/**
	 * Returns the value of '<em><b>createdAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createdAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getCreatedAmount() {
		return createdAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getCreatedAmount() <em>createdAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCreatedAmount() createdAmount}' feature.
	 * @generated
	 */
	public void setCreatedAmount(Decimal newCreatedAmount) {
		createdAmount = newCreatedAmount;
	}

	/**
	 * Returns the value of '<em><b>chargedAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>chargedAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getChargedAmount() {
		return chargedAmount;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getChargedAmount() <em>chargedAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getChargedAmount() chargedAmount}' feature.
	 * @generated
	 */
	public void setChargedAmount(Decimal newChargedAmount) {
		chargedAmount = newChargedAmount;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>createFile</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createFile</b></em>' feature
	 * @generated
	 */
	public Boolean getCreateFile() {
		return createFile;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getCreateFile() <em>createFile</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCreateFile() createFile}' feature.
	 * @generated
	 */
	public void setCreateFile(Boolean newCreateFile) {
		createFile = newCreateFile;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getAccountingDate() <em>accountingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getAccountingDate() accountingDate}' feature.
	 * @generated
	 */
	public void setAccountingDate(DateTime newAccountingDate) {
		accountingDate = newAccountingDate;
	}

	/**
	 * Returns the value of '<em><b>settlementType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>settlementType</b></em>' feature
	 * @generated
	 */
	public String getSettlementType() {
		return settlementType;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getSettlementType() <em>settlementType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getSettlementType() settlementType}' feature.
	 * @generated
	 */
	public void setSettlementType(String newSettlementType) {
		settlementType = newSettlementType;
	}

	/**
	 * Returns the value of '<em><b>openSettlement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>openSettlement</b></em>' feature
	 * @generated
	 */
	public Boolean getOpenSettlement() {
		return openSettlement;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getOpenSettlement() <em>openSettlement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getOpenSettlement() openSettlement}' feature.
	 * @generated
	 */
	public void setOpenSettlement(Boolean newOpenSettlement) {
		openSettlement = newOpenSettlement;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getCopyFrom() <em>copyFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getCopyFrom() copyFrom}' feature.
	 * @generated
	 */
	public void setCopyFrom(Boolean newCopyFrom) {
		copyFrom = newCopyFrom;
	}

	/**
	 * Returns the value of '<em><b>generated</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generated</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerated() {
		return generated;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getGenerated() <em>generated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getGenerated() generated}' feature.
	 * @generated
	 */
	public void setGenerated(Boolean newGenerated) {
		generated = newGenerated;
	}

	/**
	 * Returns the value of '<em><b>template</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>template</b></em>' feature
	 * @generated
	 */
	public Boolean getTemplate() {
		return template;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getTemplate() <em>template</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getTemplate() template}' feature.
	 * @generated
	 */
	public void setTemplate(Boolean newTemplate) {
		template = newTemplate;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentSettlementCancelledList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentSettlementCancelledList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentSettlementCancelledListType getFinancialMgmtDebtPaymentSettlementCancelledList() {
		return financialMgmtDebtPaymentSettlementCancelledList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentSettlementCancelledList() <em>financialMgmtDebtPaymentSettlementCancelledList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentSettlementCancelledList() financialMgmtDebtPaymentSettlementCancelledList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentSettlementCancelledList(
			FinancialMgmtDebtPaymentSettlementCancelledListType newFinancialMgmtDebtPaymentSettlementCancelledList) {
		financialMgmtDebtPaymentSettlementCancelledList = newFinancialMgmtDebtPaymentSettlementCancelledList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCSettlementGenerateIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCSettlementGenerateIDList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentCSettlementGenerateIDListType getFinancialMgmtDebtPaymentCSettlementGenerateIDList() {
		return financialMgmtDebtPaymentCSettlementGenerateIDList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentCSettlementGenerateIDList() <em>financialMgmtDebtPaymentCSettlementGenerateIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentCSettlementGenerateIDList() financialMgmtDebtPaymentCSettlementGenerateIDList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCSettlementGenerateIDList(
			FinancialMgmtDebtPaymentCSettlementGenerateIDListType newFinancialMgmtDebtPaymentCSettlementGenerateIDList) {
		financialMgmtDebtPaymentCSettlementGenerateIDList = newFinancialMgmtDebtPaymentCSettlementGenerateIDList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentCancelVListType getFinancialMgmtDebtPaymentCancelVList() {
		return financialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentCancelVList() <em>financialMgmtDebtPaymentCancelVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentCancelVList() financialMgmtDebtPaymentCancelVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelVList(
			FinancialMgmtDebtPaymentCancelVListType newFinancialMgmtDebtPaymentCancelVList) {
		financialMgmtDebtPaymentCancelVList = newFinancialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelVSettlementGenerateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelVSettlementGenerateList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentCancelVSettlementGenerateList() {
		return financialMgmtDebtPaymentCancelVSettlementGenerateList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentCancelVSettlementGenerateList() <em>financialMgmtDebtPaymentCancelVSettlementGenerateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentCancelVSettlementGenerateList() financialMgmtDebtPaymentCancelVSettlementGenerateList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelVSettlementGenerateList(
			ReferenceType newFinancialMgmtDebtPaymentCancelVSettlementGenerateList) {
		financialMgmtDebtPaymentCancelVSettlementGenerateList = newFinancialMgmtDebtPaymentCancelVSettlementGenerateList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentGenerateVListType getFinancialMgmtDebtPaymentGenerateVList() {
		return financialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVList(
			FinancialMgmtDebtPaymentGenerateVListType newFinancialMgmtDebtPaymentGenerateVList) {
		financialMgmtDebtPaymentGenerateVList = newFinancialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateVSettlementCancelledList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateVSettlementCancelledList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentGenerateVSettlementCancelledList() {
		return financialMgmtDebtPaymentGenerateVSettlementCancelledList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentGenerateVSettlementCancelledList() <em>financialMgmtDebtPaymentGenerateVSettlementCancelledList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtDebtPaymentGenerateVSettlementCancelledList() financialMgmtDebtPaymentGenerateVSettlementCancelledList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVSettlementCancelledList(
			ReferenceType newFinancialMgmtDebtPaymentGenerateVSettlementCancelledList) {
		financialMgmtDebtPaymentGenerateVSettlementCancelledList = newFinancialMgmtDebtPaymentGenerateVSettlementCancelledList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtRemittanceList() {
		return financialMgmtRemittanceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtRemittanceList() <em>financialMgmtRemittanceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtRemittanceList() financialMgmtRemittanceList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceList(
			ReferenceType newFinancialMgmtRemittanceList) {
		financialMgmtRemittanceList = newFinancialMgmtRemittanceList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxPaymentList() {
		return financialMgmtTaxPaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getFinancialMgmtTaxPaymentList() <em>financialMgmtTaxPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getFinancialMgmtTaxPaymentList() financialMgmtTaxPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPaymentList(
			ReferenceType newFinancialMgmtTaxPaymentList) {
		financialMgmtTaxPaymentList = newFinancialMgmtTaxPaymentList;
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
	 * Sets the '{@link FinancialMgmtSettlementType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtSettlementType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#isReference() reference}' feature.
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
	public List<FinancialMgmtSettlementTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtSettlementType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtSettlementType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtSettlementTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtSettlementType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
