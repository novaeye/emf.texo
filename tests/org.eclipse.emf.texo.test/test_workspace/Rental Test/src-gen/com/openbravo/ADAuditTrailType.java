package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADAuditTrailType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADAuditTrailType {

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
	private String createdBy = null;

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
	private String updatedBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType table = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String recordID = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long recordRevision = null;

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
	private DateTime eventTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String processtype = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String process = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String action = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType column = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String oLDChar = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String nEWChar = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String oLDNchar = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String nEWNchar = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal oLDNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal nEWNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime oLDDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime nEWDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String processDescription = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String oldValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String newValue = null;

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
	private List<ADAuditTrailTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADAuditTrailTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADAuditTrailType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getId() id}' feature.
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
	 * Sets the '{@link ADAuditTrailType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getClient() client}' feature.
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
	 * Sets the '{@link ADAuditTrailType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADAuditTrailType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getActive() active}' feature.
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
	 * Sets the '{@link ADAuditTrailType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getCreationDate() creationDate}' feature.
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
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getCreatedBy() createdBy}' feature.
	 * @generated
	 */
	public void setCreatedBy(String newCreatedBy) {
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
	 * Sets the '{@link ADAuditTrailType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getUpdated() updated}' feature.
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
	public String getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(String newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>table</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>table</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTable() {
		return table;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getTable() <em>table</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getTable() table}' feature.
	 * @generated
	 */
	public void setTable(ReferenceType newTable) {
		table = newTable;
	}

	/**
	 * Returns the value of '<em><b>recordID</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>recordID</b></em>' feature
	 * @generated
	 */
	public String getRecordID() {
		return recordID;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getRecordID() <em>recordID</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getRecordID() recordID}' feature.
	 * @generated
	 */
	public void setRecordID(String newRecordID) {
		recordID = newRecordID;
	}

	/**
	 * Returns the value of '<em><b>recordRevision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>recordRevision</b></em>' feature
	 * @generated
	 */
	public Long getRecordRevision() {
		return recordRevision;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getRecordRevision() <em>recordRevision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getRecordRevision() recordRevision}' feature.
	 * @generated
	 */
	public void setRecordRevision(Long newRecordRevision) {
		recordRevision = newRecordRevision;
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
	 * Sets the '{@link ADAuditTrailType#getUserContact() <em>userContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getUserContact() userContact}' feature.
	 * @generated
	 */
	public void setUserContact(ReferenceType newUserContact) {
		userContact = newUserContact;
	}

	/**
	 * Returns the value of '<em><b>eventTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>eventTime</b></em>' feature
	 * @generated
	 */
	public DateTime getEventTime() {
		return eventTime;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getEventTime() <em>eventTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getEventTime() eventTime}' feature.
	 * @generated
	 */
	public void setEventTime(DateTime newEventTime) {
		eventTime = newEventTime;
	}

	/**
	 * Returns the value of '<em><b>processtype</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processtype</b></em>' feature
	 * @generated
	 */
	public String getProcesstype() {
		return processtype;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getProcesstype() <em>processtype</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getProcesstype() processtype}' feature.
	 * @generated
	 */
	public void setProcesstype(String newProcesstype) {
		processtype = newProcesstype;
	}

	/**
	 * Returns the value of '<em><b>process</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>process</b></em>' feature
	 * @generated
	 */
	public String getProcess() {
		return process;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getProcess() <em>process</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getProcess() process}' feature.
	 * @generated
	 */
	public void setProcess(String newProcess) {
		process = newProcess;
	}

	/**
	 * Returns the value of '<em><b>action</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>action</b></em>' feature
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getAction() <em>action</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getAction() action}' feature.
	 * @generated
	 */
	public void setAction(String newAction) {
		action = newAction;
	}

	/**
	 * Returns the value of '<em><b>column</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>column</b></em>' feature
	 * @generated
	 */
	public ReferenceType getColumn() {
		return column;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getColumn() <em>column</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getColumn() column}' feature.
	 * @generated
	 */
	public void setColumn(ReferenceType newColumn) {
		column = newColumn;
	}

	/**
	 * Returns the value of '<em><b>oLDChar</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oLDChar</b></em>' feature
	 * @generated
	 */
	public String getOLDChar() {
		return oLDChar;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getOLDChar() <em>oLDChar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getOLDChar() oLDChar}' feature.
	 * @generated
	 */
	public void setOLDChar(String newOLDChar) {
		oLDChar = newOLDChar;
	}

	/**
	 * Returns the value of '<em><b>nEWChar</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nEWChar</b></em>' feature
	 * @generated
	 */
	public String getNEWChar() {
		return nEWChar;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getNEWChar() <em>nEWChar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getNEWChar() nEWChar}' feature.
	 * @generated
	 */
	public void setNEWChar(String newNEWChar) {
		nEWChar = newNEWChar;
	}

	/**
	 * Returns the value of '<em><b>oLDNchar</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oLDNchar</b></em>' feature
	 * @generated
	 */
	public String getOLDNchar() {
		return oLDNchar;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getOLDNchar() <em>oLDNchar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getOLDNchar() oLDNchar}' feature.
	 * @generated
	 */
	public void setOLDNchar(String newOLDNchar) {
		oLDNchar = newOLDNchar;
	}

	/**
	 * Returns the value of '<em><b>nEWNchar</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nEWNchar</b></em>' feature
	 * @generated
	 */
	public String getNEWNchar() {
		return nEWNchar;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getNEWNchar() <em>nEWNchar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getNEWNchar() nEWNchar}' feature.
	 * @generated
	 */
	public void setNEWNchar(String newNEWNchar) {
		nEWNchar = newNEWNchar;
	}

	/**
	 * Returns the value of '<em><b>oLDNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oLDNumber</b></em>' feature
	 * @generated
	 */
	public Decimal getOLDNumber() {
		return oLDNumber;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getOLDNumber() <em>oLDNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getOLDNumber() oLDNumber}' feature.
	 * @generated
	 */
	public void setOLDNumber(Decimal newOLDNumber) {
		oLDNumber = newOLDNumber;
	}

	/**
	 * Returns the value of '<em><b>nEWNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nEWNumber</b></em>' feature
	 * @generated
	 */
	public Decimal getNEWNumber() {
		return nEWNumber;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getNEWNumber() <em>nEWNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getNEWNumber() nEWNumber}' feature.
	 * @generated
	 */
	public void setNEWNumber(Decimal newNEWNumber) {
		nEWNumber = newNEWNumber;
	}

	/**
	 * Returns the value of '<em><b>oLDDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oLDDate</b></em>' feature
	 * @generated
	 */
	public DateTime getOLDDate() {
		return oLDDate;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getOLDDate() <em>oLDDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getOLDDate() oLDDate}' feature.
	 * @generated
	 */
	public void setOLDDate(DateTime newOLDDate) {
		oLDDate = newOLDDate;
	}

	/**
	 * Returns the value of '<em><b>nEWDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nEWDate</b></em>' feature
	 * @generated
	 */
	public DateTime getNEWDate() {
		return nEWDate;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getNEWDate() <em>nEWDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getNEWDate() nEWDate}' feature.
	 * @generated
	 */
	public void setNEWDate(DateTime newNEWDate) {
		nEWDate = newNEWDate;
	}

	/**
	 * Returns the value of '<em><b>processDescription</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processDescription</b></em>' feature
	 * @generated
	 */
	public String getProcessDescription() {
		return processDescription;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getProcessDescription() <em>processDescription</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getProcessDescription() processDescription}' feature.
	 * @generated
	 */
	public void setProcessDescription(String newProcessDescription) {
		processDescription = newProcessDescription;
	}

	/**
	 * Returns the value of '<em><b>oldValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oldValue</b></em>' feature
	 * @generated
	 */
	public String getOldValue() {
		return oldValue;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getOldValue() <em>oldValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getOldValue() oldValue}' feature.
	 * @generated
	 */
	public void setOldValue(String newOldValue) {
		oldValue = newOldValue;
	}

	/**
	 * Returns the value of '<em><b>newValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>newValue</b></em>' feature
	 * @generated
	 */
	public String getNewValue() {
		return newValue;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getNewValue() <em>newValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getNewValue() newValue}' feature.
	 * @generated
	 */
	public void setNewValue(String newNewValue) {
		newValue = newNewValue;
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
	 * Sets the '{@link ADAuditTrailType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getId1() id1}' feature.
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
	 * Sets the '{@link ADAuditTrailType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADAuditTrailType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#isReference() reference}' feature.
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
	public List<ADAuditTrailTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADAuditTrailType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADAuditTrailType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADAuditTrailTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADAuditTrailType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
