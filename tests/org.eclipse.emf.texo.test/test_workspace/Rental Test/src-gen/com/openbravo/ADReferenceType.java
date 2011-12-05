package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADReferenceType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADReferenceType {

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
	private String validationType = null;

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
	private ReferenceType module = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean isBaseReference = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType parentReference = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String modelImpl = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String wADImpl = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String impl = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean displayedValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDColumnList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDColumnReferenceSearchKeyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADListListType aDListList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModelImplementationListType2 aDModelImplementationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDProcessParameterList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDProcessParameterReferenceSearchKeyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDReferenceParentReferenceIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADReferenceTrlListType aDReferenceTrlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADReferencedTableListType aDReferencedTableList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSelectorListType aDSelectorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCLKERUIDefinitionListType oBCLKERUIDefinitionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBCQLQueryColumnList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBCQLQueryColumnReferenceSearchKeyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetReferenceListType oBKMOWidgetReferenceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBSERDSDatasourceFieldList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPParameterList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPParameterReferenceSearchKeyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPRefWindowListType oBUIAPPRefWindowList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorListType oBUISELSelectorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUISELSelectorFieldList = null;

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
	private List<ADReferenceTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADReferenceTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADReferenceType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getId() id}' feature.
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
	 * Sets the '{@link ADReferenceType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getClient() client}' feature.
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
	 * Sets the '{@link ADReferenceType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADReferenceType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getActive() active}' feature.
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
	 * Sets the '{@link ADReferenceType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADReferenceType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADReferenceType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADReferenceType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ADReferenceType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getName() name}' feature.
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
	 * Sets the '{@link ADReferenceType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getDescription() description}' feature.
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
	 * Sets the '{@link ADReferenceType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
	}

	/**
	 * Returns the value of '<em><b>validationType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>validationType</b></em>' feature
	 * @generated
	 */
	public String getValidationType() {
		return validationType;
	}

	/**
	 * Sets the '{@link ADReferenceType#getValidationType() <em>validationType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getValidationType() validationType}' feature.
	 * @generated
	 */
	public void setValidationType(String newValidationType) {
		validationType = newValidationType;
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
	 * Sets the '{@link ADReferenceType#getValueFormat() <em>valueFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getValueFormat() valueFormat}' feature.
	 * @generated
	 */
	public void setValueFormat(String newValueFormat) {
		valueFormat = newValueFormat;
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
	 * Sets the '{@link ADReferenceType#getModule() <em>module</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getModule() module}' feature.
	 * @generated
	 */
	public void setModule(ReferenceType newModule) {
		module = newModule;
	}

	/**
	 * Returns the value of '<em><b>isBaseReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isBaseReference</b></em>' feature
	 * @generated
	 */
	public Boolean getIsBaseReference() {
		return isBaseReference;
	}

	/**
	 * Sets the '{@link ADReferenceType#getIsBaseReference() <em>isBaseReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getIsBaseReference() isBaseReference}' feature.
	 * @generated
	 */
	public void setIsBaseReference(Boolean newIsBaseReference) {
		isBaseReference = newIsBaseReference;
	}

	/**
	 * Returns the value of '<em><b>parentReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>parentReference</b></em>' feature
	 * @generated
	 */
	public ReferenceType getParentReference() {
		return parentReference;
	}

	/**
	 * Sets the '{@link ADReferenceType#getParentReference() <em>parentReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getParentReference() parentReference}' feature.
	 * @generated
	 */
	public void setParentReference(ReferenceType newParentReference) {
		parentReference = newParentReference;
	}

	/**
	 * Returns the value of '<em><b>modelImpl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>modelImpl</b></em>' feature
	 * @generated
	 */
	public String getModelImpl() {
		return modelImpl;
	}

	/**
	 * Sets the '{@link ADReferenceType#getModelImpl() <em>modelImpl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getModelImpl() modelImpl}' feature.
	 * @generated
	 */
	public void setModelImpl(String newModelImpl) {
		modelImpl = newModelImpl;
	}

	/**
	 * Returns the value of '<em><b>wADImpl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>wADImpl</b></em>' feature
	 * @generated
	 */
	public String getWADImpl() {
		return wADImpl;
	}

	/**
	 * Sets the '{@link ADReferenceType#getWADImpl() <em>wADImpl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getWADImpl() wADImpl}' feature.
	 * @generated
	 */
	public void setWADImpl(String newWADImpl) {
		wADImpl = newWADImpl;
	}

	/**
	 * Returns the value of '<em><b>impl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>impl</b></em>' feature
	 * @generated
	 */
	public String getImpl() {
		return impl;
	}

	/**
	 * Sets the '{@link ADReferenceType#getImpl() <em>impl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getImpl() impl}' feature.
	 * @generated
	 */
	public void setImpl(String newImpl) {
		impl = newImpl;
	}

	/**
	 * Returns the value of '<em><b>displayedValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>displayedValue</b></em>' feature
	 * @generated
	 */
	public Boolean getDisplayedValue() {
		return displayedValue;
	}

	/**
	 * Sets the '{@link ADReferenceType#getDisplayedValue() <em>displayedValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getDisplayedValue() displayedValue}' feature.
	 * @generated
	 */
	public void setDisplayedValue(Boolean newDisplayedValue) {
		displayedValue = newDisplayedValue;
	}

	/**
	 * Returns the value of '<em><b>aDColumnList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumnList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADColumnList() {
		return aDColumnList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADColumnList() <em>aDColumnList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADColumnList() aDColumnList}' feature.
	 * @generated
	 */
	public void setADColumnList(ReferenceType newADColumnList) {
		aDColumnList = newADColumnList;
	}

	/**
	 * Returns the value of '<em><b>aDColumnReferenceSearchKeyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumnReferenceSearchKeyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADColumnReferenceSearchKeyList() {
		return aDColumnReferenceSearchKeyList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADColumnReferenceSearchKeyList() <em>aDColumnReferenceSearchKeyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADColumnReferenceSearchKeyList() aDColumnReferenceSearchKeyList}' feature.
	 * @generated
	 */
	public void setADColumnReferenceSearchKeyList(
			ReferenceType newADColumnReferenceSearchKeyList) {
		aDColumnReferenceSearchKeyList = newADColumnReferenceSearchKeyList;
	}

	/**
	 * Returns the value of '<em><b>aDListList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDListList</b></em>' feature
	 * @generated
	 */
	public ADListListType getADListList() {
		return aDListList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADListList() <em>aDListList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADListList() aDListList}' feature.
	 * @generated
	 */
	public void setADListList(ADListListType newADListList) {
		aDListList = newADListList;
	}

	/**
	 * Returns the value of '<em><b>aDModelImplementationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementationList</b></em>' feature
	 * @generated
	 */
	public ADModelImplementationListType2 getADModelImplementationList() {
		return aDModelImplementationList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADModelImplementationList() <em>aDModelImplementationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADModelImplementationList() aDModelImplementationList}' feature.
	 * @generated
	 */
	public void setADModelImplementationList(
			ADModelImplementationListType2 newADModelImplementationList) {
		aDModelImplementationList = newADModelImplementationList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameterList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADProcessParameterList() {
		return aDProcessParameterList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADProcessParameterList() <em>aDProcessParameterList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADProcessParameterList() aDProcessParameterList}' feature.
	 * @generated
	 */
	public void setADProcessParameterList(
			ReferenceType newADProcessParameterList) {
		aDProcessParameterList = newADProcessParameterList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameterReferenceSearchKeyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterReferenceSearchKeyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADProcessParameterReferenceSearchKeyList() {
		return aDProcessParameterReferenceSearchKeyList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADProcessParameterReferenceSearchKeyList() <em>aDProcessParameterReferenceSearchKeyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADProcessParameterReferenceSearchKeyList() aDProcessParameterReferenceSearchKeyList}' feature.
	 * @generated
	 */
	public void setADProcessParameterReferenceSearchKeyList(
			ReferenceType newADProcessParameterReferenceSearchKeyList) {
		aDProcessParameterReferenceSearchKeyList = newADProcessParameterReferenceSearchKeyList;
	}

	/**
	 * Returns the value of '<em><b>aDReferenceParentReferenceIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferenceParentReferenceIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADReferenceParentReferenceIDList() {
		return aDReferenceParentReferenceIDList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADReferenceParentReferenceIDList() <em>aDReferenceParentReferenceIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADReferenceParentReferenceIDList() aDReferenceParentReferenceIDList}' feature.
	 * @generated
	 */
	public void setADReferenceParentReferenceIDList(
			ReferenceType newADReferenceParentReferenceIDList) {
		aDReferenceParentReferenceIDList = newADReferenceParentReferenceIDList;
	}

	/**
	 * Returns the value of '<em><b>aDReferenceTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferenceTrlList</b></em>' feature
	 * @generated
	 */
	public ADReferenceTrlListType getADReferenceTrlList() {
		return aDReferenceTrlList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADReferenceTrlList() <em>aDReferenceTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADReferenceTrlList() aDReferenceTrlList}' feature.
	 * @generated
	 */
	public void setADReferenceTrlList(
			ADReferenceTrlListType newADReferenceTrlList) {
		aDReferenceTrlList = newADReferenceTrlList;
	}

	/**
	 * Returns the value of '<em><b>aDReferencedTableList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferencedTableList</b></em>' feature
	 * @generated
	 */
	public ADReferencedTableListType getADReferencedTableList() {
		return aDReferencedTableList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADReferencedTableList() <em>aDReferencedTableList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADReferencedTableList() aDReferencedTableList}' feature.
	 * @generated
	 */
	public void setADReferencedTableList(
			ADReferencedTableListType newADReferencedTableList) {
		aDReferencedTableList = newADReferencedTableList;
	}

	/**
	 * Returns the value of '<em><b>aDSelectorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelectorList</b></em>' feature
	 * @generated
	 */
	public ADSelectorListType getADSelectorList() {
		return aDSelectorList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getADSelectorList() <em>aDSelectorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getADSelectorList() aDSelectorList}' feature.
	 * @generated
	 */
	public void setADSelectorList(ADSelectorListType newADSelectorList) {
		aDSelectorList = newADSelectorList;
	}

	/**
	 * Returns the value of '<em><b>oBCLKERUIDefinitionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERUIDefinitionList</b></em>' feature
	 * @generated
	 */
	public OBCLKERUIDefinitionListType getOBCLKERUIDefinitionList() {
		return oBCLKERUIDefinitionList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBCLKERUIDefinitionList() <em>oBCLKERUIDefinitionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBCLKERUIDefinitionList() oBCLKERUIDefinitionList}' feature.
	 * @generated
	 */
	public void setOBCLKERUIDefinitionList(
			OBCLKERUIDefinitionListType newOBCLKERUIDefinitionList) {
		oBCLKERUIDefinitionList = newOBCLKERUIDefinitionList;
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumnList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumnList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBCQLQueryColumnList() {
		return oBCQLQueryColumnList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBCQLQueryColumnList() <em>oBCQLQueryColumnList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBCQLQueryColumnList() oBCQLQueryColumnList}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnList(ReferenceType newOBCQLQueryColumnList) {
		oBCQLQueryColumnList = newOBCQLQueryColumnList;
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumnReferenceSearchKeyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumnReferenceSearchKeyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBCQLQueryColumnReferenceSearchKeyList() {
		return oBCQLQueryColumnReferenceSearchKeyList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBCQLQueryColumnReferenceSearchKeyList() <em>oBCQLQueryColumnReferenceSearchKeyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBCQLQueryColumnReferenceSearchKeyList() oBCQLQueryColumnReferenceSearchKeyList}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnReferenceSearchKeyList(
			ReferenceType newOBCQLQueryColumnReferenceSearchKeyList) {
		oBCQLQueryColumnReferenceSearchKeyList = newOBCQLQueryColumnReferenceSearchKeyList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetReferenceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetReferenceList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetReferenceListType getOBKMOWidgetReferenceList() {
		return oBKMOWidgetReferenceList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBKMOWidgetReferenceList() <em>oBKMOWidgetReferenceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBKMOWidgetReferenceList() oBKMOWidgetReferenceList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetReferenceList(
			OBKMOWidgetReferenceListType newOBKMOWidgetReferenceList) {
		oBKMOWidgetReferenceList = newOBKMOWidgetReferenceList;
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceFieldList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceFieldList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBSERDSDatasourceFieldList() {
		return oBSERDSDatasourceFieldList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBSERDSDatasourceFieldList() <em>oBSERDSDatasourceFieldList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBSERDSDatasourceFieldList() oBSERDSDatasourceFieldList}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceFieldList(
			ReferenceType newOBSERDSDatasourceFieldList) {
		oBSERDSDatasourceFieldList = newOBSERDSDatasourceFieldList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPParameterList() {
		return oBUIAPPParameterList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBUIAPPParameterList() <em>oBUIAPPParameterList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBUIAPPParameterList() oBUIAPPParameterList}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterList(ReferenceType newOBUIAPPParameterList) {
		oBUIAPPParameterList = newOBUIAPPParameterList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterReferenceSearchKeyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterReferenceSearchKeyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPParameterReferenceSearchKeyList() {
		return oBUIAPPParameterReferenceSearchKeyList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBUIAPPParameterReferenceSearchKeyList() <em>oBUIAPPParameterReferenceSearchKeyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBUIAPPParameterReferenceSearchKeyList() oBUIAPPParameterReferenceSearchKeyList}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterReferenceSearchKeyList(
			ReferenceType newOBUIAPPParameterReferenceSearchKeyList) {
		oBUIAPPParameterReferenceSearchKeyList = newOBUIAPPParameterReferenceSearchKeyList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPRefWindowList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPRefWindowList</b></em>' feature
	 * @generated
	 */
	public OBUIAPPRefWindowListType getOBUIAPPRefWindowList() {
		return oBUIAPPRefWindowList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBUIAPPRefWindowList() <em>oBUIAPPRefWindowList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBUIAPPRefWindowList() oBUIAPPRefWindowList}' feature.
	 * @generated
	 */
	public void setOBUIAPPRefWindowList(
			OBUIAPPRefWindowListType newOBUIAPPRefWindowList) {
		oBUIAPPRefWindowList = newOBUIAPPRefWindowList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorList</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorListType getOBUISELSelectorList() {
		return oBUISELSelectorList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBUISELSelectorList() <em>oBUISELSelectorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBUISELSelectorList() oBUISELSelectorList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorList(
			OBUISELSelectorListType newOBUISELSelectorList) {
		oBUISELSelectorList = newOBUISELSelectorList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorFieldList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorFieldList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUISELSelectorFieldList() {
		return oBUISELSelectorFieldList;
	}

	/**
	 * Sets the '{@link ADReferenceType#getOBUISELSelectorFieldList() <em>oBUISELSelectorFieldList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getOBUISELSelectorFieldList() oBUISELSelectorFieldList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorFieldList(
			ReferenceType newOBUISELSelectorFieldList) {
		oBUISELSelectorFieldList = newOBUISELSelectorFieldList;
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
	 * Sets the '{@link ADReferenceType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getId1() id1}' feature.
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
	 * Sets the '{@link ADReferenceType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADReferenceType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#isReference() reference}' feature.
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
	public List<ADReferenceTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADReferenceType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADReferenceType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADReferenceTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADReferenceType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
