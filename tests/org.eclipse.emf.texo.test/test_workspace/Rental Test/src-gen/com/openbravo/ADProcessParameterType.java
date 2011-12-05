package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessParameterType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessParameterType {

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
	private String name = null;

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
	private String helpComment = null;

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
	private Long sequenceNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType reference = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType referenceSearchKey = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType validation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dBColumnName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean centralMaintenance = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long length = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean mandatory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean range = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String defaultValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String defaultLogic2 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String valueFormat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String minValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String maxValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType applicationElement = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessParameterTrlListType aDProcessParameterTrlList = null;

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
	private boolean reference1 = false;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ADProcessParameterTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADProcessParameterTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADProcessParameterType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getId() id}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getClient() client}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getActive() active}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link ADProcessParameterType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>helpComment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>helpComment</b></em>' feature
	 * @generated
	 */
	public String getHelpComment() {
		return helpComment;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
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
	 * Sets the '{@link ADProcessParameterType#getProcess() <em>process</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getProcess() process}' feature.
	 * @generated
	 */
	public void setProcess(ReferenceType newProcess) {
		process = newProcess;
	}

	/**
	 * Returns the value of '<em><b>sequenceNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sequenceNumber</b></em>' feature
	 * @generated
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getSequenceNumber() <em>sequenceNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getSequenceNumber() sequenceNumber}' feature.
	 * @generated
	 */
	public void setSequenceNumber(Long newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
	}

	/**
	 * Returns the value of '<em><b>reference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reference</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getReference() reference}' feature.
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		reference = newReference;
	}

	/**
	 * Returns the value of '<em><b>referenceSearchKey</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceSearchKey</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReferenceSearchKey() {
		return referenceSearchKey;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getReferenceSearchKey() <em>referenceSearchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getReferenceSearchKey() referenceSearchKey}' feature.
	 * @generated
	 */
	public void setReferenceSearchKey(ReferenceType newReferenceSearchKey) {
		referenceSearchKey = newReferenceSearchKey;
	}

	/**
	 * Returns the value of '<em><b>validation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>validation</b></em>' feature
	 * @generated
	 */
	public ReferenceType getValidation() {
		return validation;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getValidation() <em>validation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getValidation() validation}' feature.
	 * @generated
	 */
	public void setValidation(ReferenceType newValidation) {
		validation = newValidation;
	}

	/**
	 * Returns the value of '<em><b>dBColumnName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dBColumnName</b></em>' feature
	 * @generated
	 */
	public String getDBColumnName() {
		return dBColumnName;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getDBColumnName() <em>dBColumnName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getDBColumnName() dBColumnName}' feature.
	 * @generated
	 */
	public void setDBColumnName(String newDBColumnName) {
		dBColumnName = newDBColumnName;
	}

	/**
	 * Returns the value of '<em><b>centralMaintenance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>centralMaintenance</b></em>' feature
	 * @generated
	 */
	public Boolean getCentralMaintenance() {
		return centralMaintenance;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getCentralMaintenance() <em>centralMaintenance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getCentralMaintenance() centralMaintenance}' feature.
	 * @generated
	 */
	public void setCentralMaintenance(Boolean newCentralMaintenance) {
		centralMaintenance = newCentralMaintenance;
	}

	/**
	 * Returns the value of '<em><b>length</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>length</b></em>' feature
	 * @generated
	 */
	public Long getLength() {
		return length;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getLength() <em>length</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getLength() length}' feature.
	 * @generated
	 */
	public void setLength(Long newLength) {
		length = newLength;
	}

	/**
	 * Returns the value of '<em><b>mandatory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mandatory</b></em>' feature
	 * @generated
	 */
	public Boolean getMandatory() {
		return mandatory;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getMandatory() <em>mandatory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getMandatory() mandatory}' feature.
	 * @generated
	 */
	public void setMandatory(Boolean newMandatory) {
		mandatory = newMandatory;
	}

	/**
	 * Returns the value of '<em><b>range</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>range</b></em>' feature
	 * @generated
	 */
	public Boolean getRange() {
		return range;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getRange() <em>range</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getRange() range}' feature.
	 * @generated
	 */
	public void setRange(Boolean newRange) {
		range = newRange;
	}

	/**
	 * Returns the value of '<em><b>defaultValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultValue</b></em>' feature
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getDefaultValue() <em>defaultValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getDefaultValue() defaultValue}' feature.
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		defaultValue = newDefaultValue;
	}

	/**
	 * Returns the value of '<em><b>defaultLogic2</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultLogic2</b></em>' feature
	 * @generated
	 */
	public String getDefaultLogic2() {
		return defaultLogic2;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getDefaultLogic2() <em>defaultLogic2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getDefaultLogic2() defaultLogic2}' feature.
	 * @generated
	 */
	public void setDefaultLogic2(String newDefaultLogic2) {
		defaultLogic2 = newDefaultLogic2;
	}

	/**
	 * Returns the value of '<em><b>valueFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>valueFormat</b></em>' feature
	 * @generated
	 */
	public String getValueFormat() {
		return valueFormat;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getValueFormat() <em>valueFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getValueFormat() valueFormat}' feature.
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		valueFormat = newValueFormat;
	}

	/**
	 * Returns the value of '<em><b>minValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>minValue</b></em>' feature
	 * @generated
	 */
	public String getMinValue() {
		return minValue;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getMinValue() <em>minValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getMinValue() minValue}' feature.
	 * @generated
	 */
	public void setMinValue(String newMinValue) {
		minValue = newMinValue;
	}

	/**
	 * Returns the value of '<em><b>maxValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maxValue</b></em>' feature
	 * @generated
	 */
	public String getMaxValue() {
		return maxValue;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getMaxValue() <em>maxValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getMaxValue() maxValue}' feature.
	 * @generated
	 */
	public void setMaxValue(String newMaxValue) {
		maxValue = newMaxValue;
	}

	/**
	 * Returns the value of '<em><b>applicationElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>applicationElement</b></em>' feature
	 * @generated
	 */
	public ReferenceType getApplicationElement() {
		return applicationElement;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getApplicationElement() <em>applicationElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getApplicationElement() applicationElement}' feature.
	 * @generated
	 */
	public void setApplicationElement(ReferenceType newApplicationElement) {
		applicationElement = newApplicationElement;
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameterTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterTrlList</b></em>' feature
	 * @generated
	 */
	public ADProcessParameterTrlListType getADProcessParameterTrlList() {
		return aDProcessParameterTrlList;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getADProcessParameterTrlList() <em>aDProcessParameterTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getADProcessParameterTrlList() aDProcessParameterTrlList}' feature.
	 * @generated
	 */
	public void setADProcessParameterTrlList(
			ADProcessParameterTrlListType newADProcessParameterTrlList) {
		aDProcessParameterTrlList = newADProcessParameterTrlList;
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
	 * Sets the '{@link ADProcessParameterType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getId1() id1}' feature.
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
	 * Sets the '{@link ADProcessParameterType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getIdentifier() identifier}' feature.
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		identifier = newIdentifier;
	}

	/**
	 * Returns the value of '<em><b>reference1</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reference1</b></em>' feature
	 * @generated
	 */
	public boolean isReference1() {
		return reference1;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#isReference1() <em>reference1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#isReference1() reference1}' feature.
	 * @generated
	 */
	public void setReference1(boolean newReference1) {
		reference1 = newReference1;
	}

	/**
	 * Returns the value of '<em><b>anyAttribute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>anyAttribute</b></em>' feature
	 * @generated
	 */
	public List<ADProcessParameterTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADProcessParameterType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessParameterType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADProcessParameterTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADProcessParameterType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference1: "
				+ isReference1() + "]";
	}
}
