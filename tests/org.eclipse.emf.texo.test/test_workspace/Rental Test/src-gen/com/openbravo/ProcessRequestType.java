package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProcessRequestType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProcessRequestType {

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
	private ReferenceType process = null;

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
	private ReferenceType userContact = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean securityBasedOnRole = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String openbravoContext = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String status = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime nextExecution = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime previousExecution = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime finish = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String channel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String timing = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime startTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime startDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String frequency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long intervalInSeconds = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long intervalInMinutes = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long hourlyInterval = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long dailyInterval = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long repetitions = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numRepetitions = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfRepetitions = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean monday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean tuesday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean wednesday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean thursday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean friday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean saturday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean sunday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String monthlyOption = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long dayInMonth = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dayOfTheWeek = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean finishes = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime finishTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime finishDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dailyOption = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String cronExpression = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String processSet = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean scheduleProcess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean rescheduleProcess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean unscheduleProcess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String params = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcessExecutionListType processExecutionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType processRunList = null;

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
	private List<ProcessRequestTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ProcessRequestTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ProcessRequestType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getId() id}' feature.
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
	 * Sets the '{@link ProcessRequestType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getClient() client}' feature.
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
	 * Sets the '{@link ProcessRequestType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ProcessRequestType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getActive() active}' feature.
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
	 * Sets the '{@link ProcessRequestType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ProcessRequestType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ProcessRequestType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ProcessRequestType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>process</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>process</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcess() {
		return process;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getProcess() <em>process</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getProcess() process}' feature.
	 * @generated
	 */
	public void setProcess(ReferenceType newProcess) {
		process = newProcess;
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
	 * Sets the '{@link ProcessRequestType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link ProcessRequestType#getUserContact() <em>userContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getUserContact() userContact}' feature.
	 * @generated
	 */
	public void setUserContact(ReferenceType newUserContact) {
		userContact = newUserContact;
	}

	/**
	 * Returns the value of '<em><b>securityBasedOnRole</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>securityBasedOnRole</b></em>' feature
	 * @generated
	 */
	public Boolean getSecurityBasedOnRole() {
		return securityBasedOnRole;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getSecurityBasedOnRole() <em>securityBasedOnRole</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getSecurityBasedOnRole() securityBasedOnRole}' feature.
	 * @generated
	 */
	public void setSecurityBasedOnRole(Boolean newSecurityBasedOnRole) {
		securityBasedOnRole = newSecurityBasedOnRole;
	}

	/**
	 * Returns the value of '<em><b>openbravoContext</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>openbravoContext</b></em>' feature
	 * @generated
	 */
	public String getOpenbravoContext() {
		return openbravoContext;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getOpenbravoContext() <em>openbravoContext</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getOpenbravoContext() openbravoContext}' feature.
	 * @generated
	 */
	public void setOpenbravoContext(String newOpenbravoContext) {
		openbravoContext = newOpenbravoContext;
	}

	/**
	 * Returns the value of '<em><b>status</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>status</b></em>' feature
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>nextExecution</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nextExecution</b></em>' feature
	 * @generated
	 */
	public DateTime getNextExecution() {
		return nextExecution;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getNextExecution() <em>nextExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getNextExecution() nextExecution}' feature.
	 * @generated
	 */
	public void setNextExecution(DateTime newNextExecution) {
		nextExecution = newNextExecution;
	}

	/**
	 * Returns the value of '<em><b>previousExecution</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>previousExecution</b></em>' feature
	 * @generated
	 */
	public DateTime getPreviousExecution() {
		return previousExecution;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getPreviousExecution() <em>previousExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getPreviousExecution() previousExecution}' feature.
	 * @generated
	 */
	public void setPreviousExecution(DateTime newPreviousExecution) {
		previousExecution = newPreviousExecution;
	}

	/**
	 * Returns the value of '<em><b>finish</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>finish</b></em>' feature
	 * @generated
	 */
	public DateTime getFinish() {
		return finish;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getFinish() <em>finish</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getFinish() finish}' feature.
	 * @generated
	 */
	public void setFinish(DateTime newFinish) {
		finish = newFinish;
	}

	/**
	 * Returns the value of '<em><b>channel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>channel</b></em>' feature
	 * @generated
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getChannel() <em>channel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getChannel() channel}' feature.
	 * @generated
	 */
	public void setChannel(String newChannel) {
		channel = newChannel;
	}

	/**
	 * Returns the value of '<em><b>timing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timing</b></em>' feature
	 * @generated
	 */
	public String getTiming() {
		return timing;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getTiming() <em>timing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getTiming() timing}' feature.
	 * @generated
	 */
	public void setTiming(String newTiming) {
		timing = newTiming;
	}

	/**
	 * Returns the value of '<em><b>startTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>startTime</b></em>' feature
	 * @generated
	 */
	public DateTime getStartTime() {
		return startTime;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getStartTime() <em>startTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getStartTime() startTime}' feature.
	 * @generated
	 */
	public void setStartTime(DateTime newStartTime) {
		startTime = newStartTime;
	}

	/**
	 * Returns the value of '<em><b>startDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>startDate</b></em>' feature
	 * @generated
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getStartDate() <em>startDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getStartDate() startDate}' feature.
	 * @generated
	 */
	public void setStartDate(DateTime newStartDate) {
		startDate = newStartDate;
	}

	/**
	 * Returns the value of '<em><b>frequency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>frequency</b></em>' feature
	 * @generated
	 */
	public String getFrequency() {
		return frequency;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getFrequency() <em>frequency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getFrequency() frequency}' feature.
	 * @generated
	 */
	public void setFrequency(String newFrequency) {
		frequency = newFrequency;
	}

	/**
	 * Returns the value of '<em><b>intervalInSeconds</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>intervalInSeconds</b></em>' feature
	 * @generated
	 */
	public Long getIntervalInSeconds() {
		return intervalInSeconds;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getIntervalInSeconds() <em>intervalInSeconds</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getIntervalInSeconds() intervalInSeconds}' feature.
	 * @generated
	 */
	public void setIntervalInSeconds(Long newIntervalInSeconds) {
		intervalInSeconds = newIntervalInSeconds;
	}

	/**
	 * Returns the value of '<em><b>intervalInMinutes</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>intervalInMinutes</b></em>' feature
	 * @generated
	 */
	public Long getIntervalInMinutes() {
		return intervalInMinutes;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getIntervalInMinutes() <em>intervalInMinutes</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getIntervalInMinutes() intervalInMinutes}' feature.
	 * @generated
	 */
	public void setIntervalInMinutes(Long newIntervalInMinutes) {
		intervalInMinutes = newIntervalInMinutes;
	}

	/**
	 * Returns the value of '<em><b>hourlyInterval</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>hourlyInterval</b></em>' feature
	 * @generated
	 */
	public Long getHourlyInterval() {
		return hourlyInterval;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getHourlyInterval() <em>hourlyInterval</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getHourlyInterval() hourlyInterval}' feature.
	 * @generated
	 */
	public void setHourlyInterval(Long newHourlyInterval) {
		hourlyInterval = newHourlyInterval;
	}

	/**
	 * Returns the value of '<em><b>dailyInterval</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dailyInterval</b></em>' feature
	 * @generated
	 */
	public Long getDailyInterval() {
		return dailyInterval;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getDailyInterval() <em>dailyInterval</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getDailyInterval() dailyInterval}' feature.
	 * @generated
	 */
	public void setDailyInterval(Long newDailyInterval) {
		dailyInterval = newDailyInterval;
	}

	/**
	 * Returns the value of '<em><b>repetitions</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>repetitions</b></em>' feature
	 * @generated
	 */
	public Long getRepetitions() {
		return repetitions;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getRepetitions() <em>repetitions</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getRepetitions() repetitions}' feature.
	 * @generated
	 */
	public void setRepetitions(Long newRepetitions) {
		repetitions = newRepetitions;
	}

	/**
	 * Returns the value of '<em><b>numRepetitions</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numRepetitions</b></em>' feature
	 * @generated
	 */
	public Long getNumRepetitions() {
		return numRepetitions;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getNumRepetitions() <em>numRepetitions</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getNumRepetitions() numRepetitions}' feature.
	 * @generated
	 */
	public void setNumRepetitions(Long newNumRepetitions) {
		numRepetitions = newNumRepetitions;
	}

	/**
	 * Returns the value of '<em><b>numberOfRepetitions</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfRepetitions</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfRepetitions() {
		return numberOfRepetitions;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getNumberOfRepetitions() <em>numberOfRepetitions</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getNumberOfRepetitions() numberOfRepetitions}' feature.
	 * @generated
	 */
	public void setNumberOfRepetitions(Long newNumberOfRepetitions) {
		numberOfRepetitions = newNumberOfRepetitions;
	}

	/**
	 * Returns the value of '<em><b>monday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>monday</b></em>' feature
	 * @generated
	 */
	public Boolean getMonday() {
		return monday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getMonday() <em>monday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getMonday() monday}' feature.
	 * @generated
	 */
	public void setMonday(Boolean newMonday) {
		monday = newMonday;
	}

	/**
	 * Returns the value of '<em><b>tuesday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>tuesday</b></em>' feature
	 * @generated
	 */
	public Boolean getTuesday() {
		return tuesday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getTuesday() <em>tuesday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getTuesday() tuesday}' feature.
	 * @generated
	 */
	public void setTuesday(Boolean newTuesday) {
		tuesday = newTuesday;
	}

	/**
	 * Returns the value of '<em><b>wednesday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>wednesday</b></em>' feature
	 * @generated
	 */
	public Boolean getWednesday() {
		return wednesday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getWednesday() <em>wednesday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getWednesday() wednesday}' feature.
	 * @generated
	 */
	public void setWednesday(Boolean newWednesday) {
		wednesday = newWednesday;
	}

	/**
	 * Returns the value of '<em><b>thursday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>thursday</b></em>' feature
	 * @generated
	 */
	public Boolean getThursday() {
		return thursday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getThursday() <em>thursday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getThursday() thursday}' feature.
	 * @generated
	 */
	public void setThursday(Boolean newThursday) {
		thursday = newThursday;
	}

	/**
	 * Returns the value of '<em><b>friday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>friday</b></em>' feature
	 * @generated
	 */
	public Boolean getFriday() {
		return friday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getFriday() <em>friday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getFriday() friday}' feature.
	 * @generated
	 */
	public void setFriday(Boolean newFriday) {
		friday = newFriday;
	}

	/**
	 * Returns the value of '<em><b>saturday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>saturday</b></em>' feature
	 * @generated
	 */
	public Boolean getSaturday() {
		return saturday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getSaturday() <em>saturday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getSaturday() saturday}' feature.
	 * @generated
	 */
	public void setSaturday(Boolean newSaturday) {
		saturday = newSaturday;
	}

	/**
	 * Returns the value of '<em><b>sunday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sunday</b></em>' feature
	 * @generated
	 */
	public Boolean getSunday() {
		return sunday;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getSunday() <em>sunday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getSunday() sunday}' feature.
	 * @generated
	 */
	public void setSunday(Boolean newSunday) {
		sunday = newSunday;
	}

	/**
	 * Returns the value of '<em><b>monthlyOption</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>monthlyOption</b></em>' feature
	 * @generated
	 */
	public String getMonthlyOption() {
		return monthlyOption;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getMonthlyOption() <em>monthlyOption</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getMonthlyOption() monthlyOption}' feature.
	 * @generated
	 */
	public void setMonthlyOption(String newMonthlyOption) {
		monthlyOption = newMonthlyOption;
	}

	/**
	 * Returns the value of '<em><b>dayInMonth</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dayInMonth</b></em>' feature
	 * @generated
	 */
	public Long getDayInMonth() {
		return dayInMonth;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getDayInMonth() <em>dayInMonth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getDayInMonth() dayInMonth}' feature.
	 * @generated
	 */
	public void setDayInMonth(Long newDayInMonth) {
		dayInMonth = newDayInMonth;
	}

	/**
	 * Returns the value of '<em><b>dayOfTheWeek</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dayOfTheWeek</b></em>' feature
	 * @generated
	 */
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getDayOfTheWeek() <em>dayOfTheWeek</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getDayOfTheWeek() dayOfTheWeek}' feature.
	 * @generated
	 */
	public void setDayOfTheWeek(String newDayOfTheWeek) {
		dayOfTheWeek = newDayOfTheWeek;
	}

	/**
	 * Returns the value of '<em><b>finishes</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>finishes</b></em>' feature
	 * @generated
	 */
	public Boolean getFinishes() {
		return finishes;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getFinishes() <em>finishes</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getFinishes() finishes}' feature.
	 * @generated
	 */
	public void setFinishes(Boolean newFinishes) {
		finishes = newFinishes;
	}

	/**
	 * Returns the value of '<em><b>finishTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>finishTime</b></em>' feature
	 * @generated
	 */
	public DateTime getFinishTime() {
		return finishTime;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getFinishTime() <em>finishTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getFinishTime() finishTime}' feature.
	 * @generated
	 */
	public void setFinishTime(DateTime newFinishTime) {
		finishTime = newFinishTime;
	}

	/**
	 * Returns the value of '<em><b>finishDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>finishDate</b></em>' feature
	 * @generated
	 */
	public DateTime getFinishDate() {
		return finishDate;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getFinishDate() <em>finishDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getFinishDate() finishDate}' feature.
	 * @generated
	 */
	public void setFinishDate(DateTime newFinishDate) {
		finishDate = newFinishDate;
	}

	/**
	 * Returns the value of '<em><b>dailyOption</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dailyOption</b></em>' feature
	 * @generated
	 */
	public String getDailyOption() {
		return dailyOption;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getDailyOption() <em>dailyOption</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getDailyOption() dailyOption}' feature.
	 * @generated
	 */
	public void setDailyOption(String newDailyOption) {
		dailyOption = newDailyOption;
	}

	/**
	 * Returns the value of '<em><b>cronExpression</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cronExpression</b></em>' feature
	 * @generated
	 */
	public String getCronExpression() {
		return cronExpression;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getCronExpression() <em>cronExpression</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getCronExpression() cronExpression}' feature.
	 * @generated
	 */
	public void setCronExpression(String newCronExpression) {
		cronExpression = newCronExpression;
	}

	/**
	 * Returns the value of '<em><b>processSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processSet</b></em>' feature
	 * @generated
	 */
	public String getProcessSet() {
		return processSet;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getProcessSet() <em>processSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getProcessSet() processSet}' feature.
	 * @generated
	 */
	public void setProcessSet(String newProcessSet) {
		processSet = newProcessSet;
	}

	/**
	 * Returns the value of '<em><b>scheduleProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>scheduleProcess</b></em>' feature
	 * @generated
	 */
	public Boolean getScheduleProcess() {
		return scheduleProcess;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getScheduleProcess() <em>scheduleProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getScheduleProcess() scheduleProcess}' feature.
	 * @generated
	 */
	public void setScheduleProcess(Boolean newScheduleProcess) {
		scheduleProcess = newScheduleProcess;
	}

	/**
	 * Returns the value of '<em><b>rescheduleProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rescheduleProcess</b></em>' feature
	 * @generated
	 */
	public Boolean getRescheduleProcess() {
		return rescheduleProcess;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getRescheduleProcess() <em>rescheduleProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getRescheduleProcess() rescheduleProcess}' feature.
	 * @generated
	 */
	public void setRescheduleProcess(Boolean newRescheduleProcess) {
		rescheduleProcess = newRescheduleProcess;
	}

	/**
	 * Returns the value of '<em><b>unscheduleProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unscheduleProcess</b></em>' feature
	 * @generated
	 */
	public Boolean getUnscheduleProcess() {
		return unscheduleProcess;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getUnscheduleProcess() <em>unscheduleProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getUnscheduleProcess() unscheduleProcess}' feature.
	 * @generated
	 */
	public void setUnscheduleProcess(Boolean newUnscheduleProcess) {
		unscheduleProcess = newUnscheduleProcess;
	}

	/**
	 * Returns the value of '<em><b>params</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>params</b></em>' feature
	 * @generated
	 */
	public String getParams() {
		return params;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getParams() <em>params</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getParams() params}' feature.
	 * @generated
	 */
	public void setParams(String newParams) {
		params = newParams;
	}

	/**
	 * Returns the value of '<em><b>processExecutionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processExecutionList</b></em>' feature
	 * @generated
	 */
	public ProcessExecutionListType getProcessExecutionList() {
		return processExecutionList;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getProcessExecutionList() <em>processExecutionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getProcessExecutionList() processExecutionList}' feature.
	 * @generated
	 */
	public void setProcessExecutionList(
			ProcessExecutionListType newProcessExecutionList) {
		processExecutionList = newProcessExecutionList;
	}

	/**
	 * Returns the value of '<em><b>processRunList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRunList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessRunList() {
		return processRunList;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getProcessRunList() <em>processRunList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getProcessRunList() processRunList}' feature.
	 * @generated
	 */
	public void setProcessRunList(ReferenceType newProcessRunList) {
		processRunList = newProcessRunList;
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
	 * Sets the '{@link ProcessRequestType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getId1() id1}' feature.
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
	 * Sets the '{@link ProcessRequestType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ProcessRequestType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#isReference() reference}' feature.
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
	public List<ProcessRequestTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ProcessRequestType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProcessRequestType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ProcessRequestTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ProcessRequestType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
