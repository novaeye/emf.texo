package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUISELSelectorFieldType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUISELSelectorFieldType {

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
	private ReferenceType obuiselSelector = null;

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
	private ReferenceType module = null;

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
	private String property = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType obserdsDatasourceField = null;

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
	private Boolean sortable = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean filterable = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean searchinsuggestionbox = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean showingrid = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long sortno = null;

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
	private Boolean isoutfield = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String defaultExpression = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String suffix = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String displayColumnAlias = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String clauseLeftPart = null;

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
	private Boolean showInPicklist = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDFieldEMObuiselOutfieldIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUISELSelectorValuefieldIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUISELSelectorDisplayfieldIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorFieldTrlListType oBUISELSelectorFieldTrlList = null;

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
	private List<OBUISELSelectorFieldTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<OBUISELSelectorFieldTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link OBUISELSelectorFieldType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>obuiselSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obuiselSelector</b></em>' feature
	 * @generated
	 */
	public ReferenceType getObuiselSelector() {
		return obuiselSelector;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getObuiselSelector() <em>obuiselSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getObuiselSelector() obuiselSelector}' feature.
	 * @generated
	 */
	public void setObuiselSelector(ReferenceType newObuiselSelector) {
		obuiselSelector = newObuiselSelector;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getClient() client}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
	}

	/**
	 * Returns the value of '<em><b>module</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>module</b></em>' feature
	 * @generated
	 */
	public ReferenceType getModule() {
		return module;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getModule() <em>module</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getModule() module}' feature.
	 * @generated
	 */
	public void setModule(ReferenceType newModule) {
		module = newModule;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getColumn() <em>column</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getColumn() column}' feature.
	 * @generated
	 */
	public void setColumn(ReferenceType newColumn) {
		column = newColumn;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getName() name}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getDescription() description}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
	}

	/**
	 * Returns the value of '<em><b>property</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>property</b></em>' feature
	 * @generated
	 */
	public String getProperty() {
		return property;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getProperty() <em>property</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getProperty() property}' feature.
	 * @generated
	 */
	public void setProperty(String newProperty) {
		property = newProperty;
	}

	/**
	 * Returns the value of '<em><b>obserdsDatasourceField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obserdsDatasourceField</b></em>' feature
	 * @generated
	 */
	public ReferenceType getObserdsDatasourceField() {
		return obserdsDatasourceField;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getObserdsDatasourceField() <em>obserdsDatasourceField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getObserdsDatasourceField() obserdsDatasourceField}' feature.
	 * @generated
	 */
	public void setObserdsDatasourceField(
			ReferenceType newObserdsDatasourceField) {
		obserdsDatasourceField = newObserdsDatasourceField;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getCentralMaintenance() <em>centralMaintenance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getCentralMaintenance() centralMaintenance}' feature.
	 * @generated
	 */
	public void setCentralMaintenance(Boolean newCentralMaintenance) {
		centralMaintenance = newCentralMaintenance;
	}

	/**
	 * Returns the value of '<em><b>sortable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sortable</b></em>' feature
	 * @generated
	 */
	public Boolean getSortable() {
		return sortable;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getSortable() <em>sortable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getSortable() sortable}' feature.
	 * @generated
	 */
	public void setSortable(Boolean newSortable) {
		sortable = newSortable;
	}

	/**
	 * Returns the value of '<em><b>filterable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>filterable</b></em>' feature
	 * @generated
	 */
	public Boolean getFilterable() {
		return filterable;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getFilterable() <em>filterable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getFilterable() filterable}' feature.
	 * @generated
	 */
	public void setFilterable(Boolean newFilterable) {
		filterable = newFilterable;
	}

	/**
	 * Returns the value of '<em><b>searchinsuggestionbox</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>searchinsuggestionbox</b></em>' feature
	 * @generated
	 */
	public Boolean getSearchinsuggestionbox() {
		return searchinsuggestionbox;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getSearchinsuggestionbox() <em>searchinsuggestionbox</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getSearchinsuggestionbox() searchinsuggestionbox}' feature.
	 * @generated
	 */
	public void setSearchinsuggestionbox(Boolean newSearchinsuggestionbox) {
		searchinsuggestionbox = newSearchinsuggestionbox;
	}

	/**
	 * Returns the value of '<em><b>showingrid</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>showingrid</b></em>' feature
	 * @generated
	 */
	public Boolean getShowingrid() {
		return showingrid;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getShowingrid() <em>showingrid</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getShowingrid() showingrid}' feature.
	 * @generated
	 */
	public void setShowingrid(Boolean newShowingrid) {
		showingrid = newShowingrid;
	}

	/**
	 * Returns the value of '<em><b>sortno</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sortno</b></em>' feature
	 * @generated
	 */
	public Long getSortno() {
		return sortno;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getSortno() <em>sortno</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getSortno() sortno}' feature.
	 * @generated
	 */
	public void setSortno(Long newSortno) {
		sortno = newSortno;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getActive() active}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getUpdated() updated}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>isoutfield</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isoutfield</b></em>' feature
	 * @generated
	 */
	public Boolean getIsoutfield() {
		return isoutfield;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getIsoutfield() <em>isoutfield</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getIsoutfield() isoutfield}' feature.
	 * @generated
	 */
	public void setIsoutfield(Boolean newIsoutfield) {
		isoutfield = newIsoutfield;
	}

	/**
	 * Returns the value of '<em><b>defaultExpression</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultExpression</b></em>' feature
	 * @generated
	 */
	public String getDefaultExpression() {
		return defaultExpression;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getDefaultExpression() <em>defaultExpression</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getDefaultExpression() defaultExpression}' feature.
	 * @generated
	 */
	public void setDefaultExpression(String newDefaultExpression) {
		defaultExpression = newDefaultExpression;
	}

	/**
	 * Returns the value of '<em><b>suffix</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suffix</b></em>' feature
	 * @generated
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getSuffix() <em>suffix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getSuffix() suffix}' feature.
	 * @generated
	 */
	public void setSuffix(String newSuffix) {
		suffix = newSuffix;
	}

	/**
	 * Returns the value of '<em><b>displayColumnAlias</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>displayColumnAlias</b></em>' feature
	 * @generated
	 */
	public String getDisplayColumnAlias() {
		return displayColumnAlias;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getDisplayColumnAlias() <em>displayColumnAlias</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getDisplayColumnAlias() displayColumnAlias}' feature.
	 * @generated
	 */
	public void setDisplayColumnAlias(String newDisplayColumnAlias) {
		displayColumnAlias = newDisplayColumnAlias;
	}

	/**
	 * Returns the value of '<em><b>clauseLeftPart</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clauseLeftPart</b></em>' feature
	 * @generated
	 */
	public String getClauseLeftPart() {
		return clauseLeftPart;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getClauseLeftPart() <em>clauseLeftPart</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getClauseLeftPart() clauseLeftPart}' feature.
	 * @generated
	 */
	public void setClauseLeftPart(String newClauseLeftPart) {
		clauseLeftPart = newClauseLeftPart;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getReference() reference}' feature.
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		reference = newReference;
	}

	/**
	 * Returns the value of '<em><b>showInPicklist</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>showInPicklist</b></em>' feature
	 * @generated
	 */
	public Boolean getShowInPicklist() {
		return showInPicklist;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getShowInPicklist() <em>showInPicklist</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getShowInPicklist() showInPicklist}' feature.
	 * @generated
	 */
	public void setShowInPicklist(Boolean newShowInPicklist) {
		showInPicklist = newShowInPicklist;
	}

	/**
	 * Returns the value of '<em><b>aDFieldEMObuiselOutfieldIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldEMObuiselOutfieldIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADFieldEMObuiselOutfieldIDList() {
		return aDFieldEMObuiselOutfieldIDList;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getADFieldEMObuiselOutfieldIDList() <em>aDFieldEMObuiselOutfieldIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getADFieldEMObuiselOutfieldIDList() aDFieldEMObuiselOutfieldIDList}' feature.
	 * @generated
	 */
	public void setADFieldEMObuiselOutfieldIDList(
			ReferenceType newADFieldEMObuiselOutfieldIDList) {
		aDFieldEMObuiselOutfieldIDList = newADFieldEMObuiselOutfieldIDList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorValuefieldIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorValuefieldIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUISELSelectorValuefieldIDList() {
		return oBUISELSelectorValuefieldIDList;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getOBUISELSelectorValuefieldIDList() <em>oBUISELSelectorValuefieldIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getOBUISELSelectorValuefieldIDList() oBUISELSelectorValuefieldIDList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorValuefieldIDList(
			ReferenceType newOBUISELSelectorValuefieldIDList) {
		oBUISELSelectorValuefieldIDList = newOBUISELSelectorValuefieldIDList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorDisplayfieldIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorDisplayfieldIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUISELSelectorDisplayfieldIDList() {
		return oBUISELSelectorDisplayfieldIDList;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getOBUISELSelectorDisplayfieldIDList() <em>oBUISELSelectorDisplayfieldIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getOBUISELSelectorDisplayfieldIDList() oBUISELSelectorDisplayfieldIDList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorDisplayfieldIDList(
			ReferenceType newOBUISELSelectorDisplayfieldIDList) {
		oBUISELSelectorDisplayfieldIDList = newOBUISELSelectorDisplayfieldIDList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorFieldTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorFieldTrlList</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorFieldTrlListType getOBUISELSelectorFieldTrlList() {
		return oBUISELSelectorFieldTrlList;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getOBUISELSelectorFieldTrlList() <em>oBUISELSelectorFieldTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getOBUISELSelectorFieldTrlList() oBUISELSelectorFieldTrlList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorFieldTrlList(
			OBUISELSelectorFieldTrlListType newOBUISELSelectorFieldTrlList) {
		oBUISELSelectorFieldTrlList = newOBUISELSelectorFieldTrlList;
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
	 * Sets the '{@link OBUISELSelectorFieldType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getId1() id1}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link OBUISELSelectorFieldType#isReference1() <em>reference1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#isReference1() reference1}' feature.
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
	public List<OBUISELSelectorFieldTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link OBUISELSelectorFieldType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorFieldType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<OBUISELSelectorFieldTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "OBUISELSelectorFieldType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference1: "
				+ isReference1() + "]";
	}
}
