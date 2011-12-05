package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCLKERTemplateType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCLKERTemplateType {

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
	private ReferenceType overridesTemplate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String template = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String templateClasspathLocation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String templateLanguage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String componentType = null;

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
	private ReferenceType oBCLKERTemplateOverridesTemplateIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCLKERTemplateDependencyListType oBCLKERTemplateDependencyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBCLKERTemplateDependencyDependsOnTemplateList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBSERDSDatasourceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPNavigationBarComponentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPViewImplementationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUISELSelectorList = null;

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
	private List<OBCLKERTemplateTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<OBCLKERTemplateTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link OBCLKERTemplateType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getId() id}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getClient() client}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOrganization() organization}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getModule() <em>module</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getModule() module}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getName() name}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>overridesTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>overridesTemplate</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOverridesTemplate() {
		return overridesTemplate;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOverridesTemplate() <em>overridesTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOverridesTemplate() overridesTemplate}' feature.
	 * @generated
	 */
	public void setOverridesTemplate(ReferenceType newOverridesTemplate) {
		overridesTemplate = newOverridesTemplate;
	}

	/**
	 * Returns the value of '<em><b>template</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>template</b></em>' feature
	 * @generated
	 */
	public String getTemplate() {
		return template;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getTemplate() <em>template</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getTemplate() template}' feature.
	 * @generated
	 */
	public void setTemplate(String newTemplate) {
		template = newTemplate;
	}

	/**
	 * Returns the value of '<em><b>templateClasspathLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>templateClasspathLocation</b></em>' feature
	 * @generated
	 */
	public String getTemplateClasspathLocation() {
		return templateClasspathLocation;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getTemplateClasspathLocation() <em>templateClasspathLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getTemplateClasspathLocation() templateClasspathLocation}' feature.
	 * @generated
	 */
	public void setTemplateClasspathLocation(String newTemplateClasspathLocation) {
		templateClasspathLocation = newTemplateClasspathLocation;
	}

	/**
	 * Returns the value of '<em><b>templateLanguage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>templateLanguage</b></em>' feature
	 * @generated
	 */
	public String getTemplateLanguage() {
		return templateLanguage;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getTemplateLanguage() <em>templateLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getTemplateLanguage() templateLanguage}' feature.
	 * @generated
	 */
	public void setTemplateLanguage(String newTemplateLanguage) {
		templateLanguage = newTemplateLanguage;
	}

	/**
	 * Returns the value of '<em><b>componentType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>componentType</b></em>' feature
	 * @generated
	 */
	public String getComponentType() {
		return componentType;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getComponentType() <em>componentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getComponentType() componentType}' feature.
	 * @generated
	 */
	public void setComponentType(String newComponentType) {
		componentType = newComponentType;
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
	 * Sets the '{@link OBCLKERTemplateType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getActive() active}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getUpdated() updated}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplateOverridesTemplateIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplateOverridesTemplateIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBCLKERTemplateOverridesTemplateIDList() {
		return oBCLKERTemplateOverridesTemplateIDList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBCLKERTemplateOverridesTemplateIDList() <em>oBCLKERTemplateOverridesTemplateIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBCLKERTemplateOverridesTemplateIDList() oBCLKERTemplateOverridesTemplateIDList}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplateOverridesTemplateIDList(
			ReferenceType newOBCLKERTemplateOverridesTemplateIDList) {
		oBCLKERTemplateOverridesTemplateIDList = newOBCLKERTemplateOverridesTemplateIDList;
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplateDependencyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplateDependencyList</b></em>' feature
	 * @generated
	 */
	public OBCLKERTemplateDependencyListType getOBCLKERTemplateDependencyList() {
		return oBCLKERTemplateDependencyList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBCLKERTemplateDependencyList() <em>oBCLKERTemplateDependencyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBCLKERTemplateDependencyList() oBCLKERTemplateDependencyList}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplateDependencyList(
			OBCLKERTemplateDependencyListType newOBCLKERTemplateDependencyList) {
		oBCLKERTemplateDependencyList = newOBCLKERTemplateDependencyList;
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplateDependencyDependsOnTemplateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplateDependencyDependsOnTemplateList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBCLKERTemplateDependencyDependsOnTemplateList() {
		return oBCLKERTemplateDependencyDependsOnTemplateList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBCLKERTemplateDependencyDependsOnTemplateList() <em>oBCLKERTemplateDependencyDependsOnTemplateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBCLKERTemplateDependencyDependsOnTemplateList() oBCLKERTemplateDependencyDependsOnTemplateList}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplateDependencyDependsOnTemplateList(
			ReferenceType newOBCLKERTemplateDependencyDependsOnTemplateList) {
		oBCLKERTemplateDependencyDependsOnTemplateList = newOBCLKERTemplateDependencyDependsOnTemplateList;
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBSERDSDatasourceList() {
		return oBSERDSDatasourceList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBSERDSDatasourceList() <em>oBSERDSDatasourceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBSERDSDatasourceList() oBSERDSDatasourceList}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceList(ReferenceType newOBSERDSDatasourceList) {
		oBSERDSDatasourceList = newOBSERDSDatasourceList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNavigationBarComponentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavigationBarComponentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPNavigationBarComponentList() {
		return oBUIAPPNavigationBarComponentList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBUIAPPNavigationBarComponentList() <em>oBUIAPPNavigationBarComponentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBUIAPPNavigationBarComponentList() oBUIAPPNavigationBarComponentList}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavigationBarComponentList(
			ReferenceType newOBUIAPPNavigationBarComponentList) {
		oBUIAPPNavigationBarComponentList = newOBUIAPPNavigationBarComponentList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPViewImplementationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPViewImplementationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPViewImplementationList() {
		return oBUIAPPViewImplementationList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBUIAPPViewImplementationList() <em>oBUIAPPViewImplementationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBUIAPPViewImplementationList() oBUIAPPViewImplementationList}' feature.
	 * @generated
	 */
	public void setOBUIAPPViewImplementationList(
			ReferenceType newOBUIAPPViewImplementationList) {
		oBUIAPPViewImplementationList = newOBUIAPPViewImplementationList;
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUISELSelectorList() {
		return oBUISELSelectorList;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getOBUISELSelectorList() <em>oBUISELSelectorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getOBUISELSelectorList() oBUISELSelectorList}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorList(ReferenceType newOBUISELSelectorList) {
		oBUISELSelectorList = newOBUISELSelectorList;
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
	 * Sets the '{@link OBCLKERTemplateType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getId1() id1}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link OBCLKERTemplateType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#isReference() reference}' feature.
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
	public List<OBCLKERTemplateTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link OBCLKERTemplateType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCLKERTemplateType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<OBCLKERTemplateTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "OBCLKERTemplateType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
