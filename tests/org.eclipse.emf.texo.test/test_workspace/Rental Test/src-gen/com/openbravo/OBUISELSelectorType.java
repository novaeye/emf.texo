package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBUISELSelectorType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBUISELSelectorType {

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
	private ReferenceType module = null;

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
	private ReferenceType reference = null;

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
	private ReferenceType column = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String hQLWhereClause = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String filterExpression = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType obserdsDatasource = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType obclkerTemplate = null;

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
	private ReferenceType valuefield = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType displayfield = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String suggestiontextmatchstyle = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String popuptextmatchstyle = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String hQL = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String entityAlias = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean customQuery = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorFieldListType oBUISELSelectorFieldList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorTrlListType oBUISELSelectorTrlList = null;

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
	private List<OBUISELSelectorTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<OBUISELSelectorTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link OBUISELSelectorType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getId() id}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getClient() client}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getOrganization() organization}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getModule() <em>module</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getModule() module}' feature.
	 * @generated
	 */
	public void setModule(ReferenceType newModule) {
		module = newModule;
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
	 * Sets the '{@link OBUISELSelectorType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getName() name}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getDescription() description}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
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
	 * Sets the '{@link OBUISELSelectorType#getReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getReference() reference}' feature.
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		reference = newReference;
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
	 * Sets the '{@link OBUISELSelectorType#getTable() <em>table</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getTable() table}' feature.
	 * @generated
	 */
	public void setTable(ReferenceType newTable) {
		table = newTable;
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
	 * Sets the '{@link OBUISELSelectorType#getColumn() <em>column</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getColumn() column}' feature.
	 * @generated
	 */
	public void setColumn(ReferenceType newColumn) {
		column = newColumn;
	}

	/**
	 * Returns the value of '<em><b>hQLWhereClause</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>hQLWhereClause</b></em>' feature
	 * @generated
	 */
	public String getHQLWhereClause() {
		return hQLWhereClause;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getHQLWhereClause() <em>hQLWhereClause</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getHQLWhereClause() hQLWhereClause}' feature.
	 * @generated
	 */
	public void setHQLWhereClause(String newHQLWhereClause) {
		hQLWhereClause = newHQLWhereClause;
	}

	/**
	 * Returns the value of '<em><b>filterExpression</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>filterExpression</b></em>' feature
	 * @generated
	 */
	public String getFilterExpression() {
		return filterExpression;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getFilterExpression() <em>filterExpression</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getFilterExpression() filterExpression}' feature.
	 * @generated
	 */
	public void setFilterExpression(String newFilterExpression) {
		filterExpression = newFilterExpression;
	}

	/**
	 * Returns the value of '<em><b>obserdsDatasource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obserdsDatasource</b></em>' feature
	 * @generated
	 */
	public ReferenceType getObserdsDatasource() {
		return obserdsDatasource;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getObserdsDatasource() <em>obserdsDatasource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getObserdsDatasource() obserdsDatasource}' feature.
	 * @generated
	 */
	public void setObserdsDatasource(ReferenceType newObserdsDatasource) {
		obserdsDatasource = newObserdsDatasource;
	}

	/**
	 * Returns the value of '<em><b>obclkerTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obclkerTemplate</b></em>' feature
	 * @generated
	 */
	public ReferenceType getObclkerTemplate() {
		return obclkerTemplate;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getObclkerTemplate() <em>obclkerTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getObclkerTemplate() obclkerTemplate}' feature.
	 * @generated
	 */
	public void setObclkerTemplate(ReferenceType newObclkerTemplate) {
		obclkerTemplate = newObclkerTemplate;
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
	 * Sets the '{@link OBUISELSelectorType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getActive() active}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getUpdated() updated}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>valuefield</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>valuefield</b></em>' feature
	 * @generated
	 */
	public ReferenceType getValuefield() {
		return valuefield;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getValuefield() <em>valuefield</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getValuefield() valuefield}' feature.
	 * @generated
	 */
	public void setValuefield(ReferenceType newValuefield) {
		valuefield = newValuefield;
	}

	/**
	 * Returns the value of '<em><b>displayfield</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>displayfield</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDisplayfield() {
		return displayfield;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getDisplayfield() <em>displayfield</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getDisplayfield() displayfield}' feature.
	 * @generated
	 */
	public void setDisplayfield(ReferenceType newDisplayfield) {
		displayfield = newDisplayfield;
	}

	/**
	 * Returns the value of '<em><b>suggestiontextmatchstyle</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>suggestiontextmatchstyle</b></em>' feature
	 * @generated
	 */
	public String getSuggestiontextmatchstyle() {
		return suggestiontextmatchstyle;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getSuggestiontextmatchstyle() <em>suggestiontextmatchstyle</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getSuggestiontextmatchstyle() suggestiontextmatchstyle}' feature.
	 * @generated
	 */
	public void setSuggestiontextmatchstyle(String newSuggestiontextmatchstyle) {
		suggestiontextmatchstyle = newSuggestiontextmatchstyle;
	}

	/**
	 * Returns the value of '<em><b>popuptextmatchstyle</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>popuptextmatchstyle</b></em>' feature
	 * @generated
	 */
	public String getPopuptextmatchstyle() {
		return popuptextmatchstyle;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getPopuptextmatchstyle() <em>popuptextmatchstyle</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getPopuptextmatchstyle() popuptextmatchstyle}' feature.
	 * @generated
	 */
	public void setPopuptextmatchstyle(String newPopuptextmatchstyle) {
		popuptextmatchstyle = newPopuptextmatchstyle;
	}

	/**
	 * Returns the value of '<em><b>hQL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>hQL</b></em>' feature
	 * @generated
	 */
	public String getHQL() {
		return hQL;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getHQL() <em>hQL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getHQL() hQL}' feature.
	 * @generated
	 */
	public void setHQL(String newHQL) {
		hQL = newHQL;
	}

	/**
	 * Returns the value of '<em><b>entityAlias</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>entityAlias</b></em>' feature
	 * @generated
	 */
	public String getEntityAlias() {
		return entityAlias;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getEntityAlias() <em>entityAlias</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getEntityAlias() entityAlias}' feature.
	 * @generated
	 */
	public void setEntityAlias(String newEntityAlias) {
		entityAlias = newEntityAlias;
	}

	/**
	 * Returns the value of '<em><b>customQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customQuery</b></em>' feature
	 * @generated
	 */
	public Boolean getCustomQuery() {
		return customQuery;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getCustomQuery() <em>customQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getCustomQuery() customQuery}' feature.
	 * @generated
	 */
	public void setCustomQuery(Boolean newCustomQuery) {
		customQuery = newCustomQuery;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorFieldList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorFieldList</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorFieldListType getOBUISELSelectorFieldList() {
		return oBUISELSelectorFieldList;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getOBUISELSelectorFieldList() <em>oBUISELSelectorFieldList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getOBUISELSelectorFieldList() oBUISELSelectorFieldList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorFieldList(
			OBUISELSelectorFieldListType newOBUISELSelectorFieldList) {
		oBUISELSelectorFieldList = newOBUISELSelectorFieldList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorTrlList</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorTrlListType getOBUISELSelectorTrlList() {
		return oBUISELSelectorTrlList;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getOBUISELSelectorTrlList() <em>oBUISELSelectorTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getOBUISELSelectorTrlList() oBUISELSelectorTrlList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorTrlList(
			OBUISELSelectorTrlListType newOBUISELSelectorTrlList) {
		oBUISELSelectorTrlList = newOBUISELSelectorTrlList;
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
	 * Sets the '{@link OBUISELSelectorType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getId1() id1}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link OBUISELSelectorType#isReference1() <em>reference1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#isReference1() reference1}' feature.
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
	public List<OBUISELSelectorTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link OBUISELSelectorType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBUISELSelectorType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<OBUISELSelectorTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "OBUISELSelectorType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference1: "
				+ isReference1() + "]";
	}
}
