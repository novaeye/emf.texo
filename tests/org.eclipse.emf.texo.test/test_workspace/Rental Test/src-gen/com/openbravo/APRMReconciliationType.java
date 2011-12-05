package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>APRMReconciliationType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class APRMReconciliationType {

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
	private ReferenceType reconciliation = null;

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
	private Boolean active = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType account = null;

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
	private ReferenceType documentType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime endingDate = null;

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
	private Decimal endingBalance = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal startingBalance = null;

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
	private Boolean printDetailed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean printSummary = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String processReconciliation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long itemNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal itemAmt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long unrecNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal unrecAmt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long paymentNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal paymentAmt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long depositNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal depositAmt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType forcedTable = null;

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
	private List<APRMReconciliationTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<APRMReconciliationTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link APRMReconciliationType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>reconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reconciliation</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReconciliation() {
		return reconciliation;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getReconciliation() <em>reconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getReconciliation() reconciliation}' feature.
	 * @generated
	 */
	public void setReconciliation(ReferenceType newReconciliation) {
		reconciliation = newReconciliation;
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
	 * Sets the '{@link APRMReconciliationType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getClient() client}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
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
	 * Sets the '{@link APRMReconciliationType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getUpdated() updated}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link APRMReconciliationType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>account</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>account</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccount() {
		return account;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
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
	 * Sets the '{@link APRMReconciliationType#getDocumentNo() <em>documentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getDocumentNo() documentNo}' feature.
	 * @generated
	 */
	public void setDocumentNo(String newDocumentNo) {
		documentNo = newDocumentNo;
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
	 * Sets the '{@link APRMReconciliationType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(ReferenceType newDocumentType) {
		documentType = newDocumentType;
	}

	/**
	 * Returns the value of '<em><b>endingDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>endingDate</b></em>' feature
	 * @generated
	 */
	public DateTime getEndingDate() {
		return endingDate;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getEndingDate() <em>endingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getEndingDate() endingDate}' feature.
	 * @generated
	 */
	public void setEndingDate(DateTime newEndingDate) {
		endingDate = newEndingDate;
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
	 * Sets the '{@link APRMReconciliationType#getTransactionDate() <em>transactionDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getTransactionDate() transactionDate}' feature.
	 * @generated
	 */
	public void setTransactionDate(DateTime newTransactionDate) {
		transactionDate = newTransactionDate;
	}

	/**
	 * Returns the value of '<em><b>endingBalance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>endingBalance</b></em>' feature
	 * @generated
	 */
	public Decimal getEndingBalance() {
		return endingBalance;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getEndingBalance() <em>endingBalance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getEndingBalance() endingBalance}' feature.
	 * @generated
	 */
	public void setEndingBalance(Decimal newEndingBalance) {
		endingBalance = newEndingBalance;
	}

	/**
	 * Returns the value of '<em><b>startingBalance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>startingBalance</b></em>' feature
	 * @generated
	 */
	public Decimal getStartingBalance() {
		return startingBalance;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getStartingBalance() <em>startingBalance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getStartingBalance() startingBalance}' feature.
	 * @generated
	 */
	public void setStartingBalance(Decimal newStartingBalance) {
		startingBalance = newStartingBalance;
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
	 * Sets the '{@link APRMReconciliationType#getDocumentStatus() <em>documentStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getDocumentStatus() documentStatus}' feature.
	 * @generated
	 */
	public void setDocumentStatus(String newDocumentStatus) {
		documentStatus = newDocumentStatus;
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
	 * Sets the '{@link APRMReconciliationType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getProcessNow() processNow}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getProcessed() processed}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getPosted() <em>posted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getPosted() posted}' feature.
	 * @generated
	 */
	public void setPosted(String newPosted) {
		posted = newPosted;
	}

	/**
	 * Returns the value of '<em><b>printDetailed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printDetailed</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintDetailed() {
		return printDetailed;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getPrintDetailed() <em>printDetailed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getPrintDetailed() printDetailed}' feature.
	 * @generated
	 */
	public void setPrintDetailed(Boolean newPrintDetailed) {
		printDetailed = newPrintDetailed;
	}

	/**
	 * Returns the value of '<em><b>printSummary</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printSummary</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintSummary() {
		return printSummary;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getPrintSummary() <em>printSummary</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getPrintSummary() printSummary}' feature.
	 * @generated
	 */
	public void setPrintSummary(Boolean newPrintSummary) {
		printSummary = newPrintSummary;
	}

	/**
	 * Returns the value of '<em><b>processReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processReconciliation</b></em>' feature
	 * @generated
	 */
	public String getProcessReconciliation() {
		return processReconciliation;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getProcessReconciliation() <em>processReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getProcessReconciliation() processReconciliation}' feature.
	 * @generated
	 */
	public void setProcessReconciliation(String newProcessReconciliation) {
		processReconciliation = newProcessReconciliation;
	}

	/**
	 * Returns the value of '<em><b>itemNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>itemNo</b></em>' feature
	 * @generated
	 */
	public Long getItemNo() {
		return itemNo;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getItemNo() <em>itemNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getItemNo() itemNo}' feature.
	 * @generated
	 */
	public void setItemNo(Long newItemNo) {
		itemNo = newItemNo;
	}

	/**
	 * Returns the value of '<em><b>itemAmt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>itemAmt</b></em>' feature
	 * @generated
	 */
	public Decimal getItemAmt() {
		return itemAmt;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getItemAmt() <em>itemAmt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getItemAmt() itemAmt}' feature.
	 * @generated
	 */
	public void setItemAmt(Decimal newItemAmt) {
		itemAmt = newItemAmt;
	}

	/**
	 * Returns the value of '<em><b>unrecNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unrecNo</b></em>' feature
	 * @generated
	 */
	public Long getUnrecNo() {
		return unrecNo;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getUnrecNo() <em>unrecNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getUnrecNo() unrecNo}' feature.
	 * @generated
	 */
	public void setUnrecNo(Long newUnrecNo) {
		unrecNo = newUnrecNo;
	}

	/**
	 * Returns the value of '<em><b>unrecAmt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unrecAmt</b></em>' feature
	 * @generated
	 */
	public Decimal getUnrecAmt() {
		return unrecAmt;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getUnrecAmt() <em>unrecAmt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getUnrecAmt() unrecAmt}' feature.
	 * @generated
	 */
	public void setUnrecAmt(Decimal newUnrecAmt) {
		unrecAmt = newUnrecAmt;
	}

	/**
	 * Returns the value of '<em><b>paymentNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentNo</b></em>' feature
	 * @generated
	 */
	public Long getPaymentNo() {
		return paymentNo;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getPaymentNo() <em>paymentNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getPaymentNo() paymentNo}' feature.
	 * @generated
	 */
	public void setPaymentNo(Long newPaymentNo) {
		paymentNo = newPaymentNo;
	}

	/**
	 * Returns the value of '<em><b>paymentAmt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentAmt</b></em>' feature
	 * @generated
	 */
	public Decimal getPaymentAmt() {
		return paymentAmt;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getPaymentAmt() <em>paymentAmt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getPaymentAmt() paymentAmt}' feature.
	 * @generated
	 */
	public void setPaymentAmt(Decimal newPaymentAmt) {
		paymentAmt = newPaymentAmt;
	}

	/**
	 * Returns the value of '<em><b>depositNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>depositNo</b></em>' feature
	 * @generated
	 */
	public Long getDepositNo() {
		return depositNo;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getDepositNo() <em>depositNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getDepositNo() depositNo}' feature.
	 * @generated
	 */
	public void setDepositNo(Long newDepositNo) {
		depositNo = newDepositNo;
	}

	/**
	 * Returns the value of '<em><b>depositAmt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>depositAmt</b></em>' feature
	 * @generated
	 */
	public Decimal getDepositAmt() {
		return depositAmt;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getDepositAmt() <em>depositAmt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getDepositAmt() depositAmt}' feature.
	 * @generated
	 */
	public void setDepositAmt(Decimal newDepositAmt) {
		depositAmt = newDepositAmt;
	}

	/**
	 * Returns the value of '<em><b>forcedTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>forcedTable</b></em>' feature
	 * @generated
	 */
	public ReferenceType getForcedTable() {
		return forcedTable;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getForcedTable() <em>forcedTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getForcedTable() forcedTable}' feature.
	 * @generated
	 */
	public void setForcedTable(ReferenceType newForcedTable) {
		forcedTable = newForcedTable;
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
	 * Sets the '{@link APRMReconciliationType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getId1() id1}' feature.
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
	 * Sets the '{@link APRMReconciliationType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link APRMReconciliationType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#isReference() reference}' feature.
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
	public List<APRMReconciliationTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link APRMReconciliationType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link APRMReconciliationType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<APRMReconciliationTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "APRMReconciliationType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
