package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBKMOWidgetClassType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBKMOWidgetClassType {

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
	private ReferenceType module = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String widgetTitle = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String javaClass = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long height = null;

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
	private Boolean allowAnonymousAccess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean superclass = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType widgetSuperclass = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean canMaximize = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dataAccessLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String authorMsg = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String authorUrl = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCQLWidgetQueryListType oBCQLWidgetQueryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBKMOWidgetClassWidgetSuperclassList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassAccessListType1 oBKMOWidgetClassAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassMenuListType oBKMOWidgetClassMenuList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassTrlListType oBKMOWidgetClassTrlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetInstanceListType oBKMOWidgetInstanceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetListListType oBKMOWidgetListList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetReferenceListType1 oBKMOWidgetReferenceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetURLListType oBKMOWidgetURLList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPParameterEMObkmoWidgetClassIDListType oBUIAPPParameterEMObkmoWidgetClassIDList = null;

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
	private List<OBKMOWidgetClassTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<OBKMOWidgetClassTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link OBKMOWidgetClassType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getId() id}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getClient() client}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOrganization() organization}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getActive() active}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getUpdated() updated}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link OBKMOWidgetClassType#getModule() <em>module</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getModule() module}' feature.
	 * @generated
	 */
	public void setModule(ReferenceType newModule) {
		module = newModule;
	}

	/**
	 * Returns the value of '<em><b>widgetTitle</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>widgetTitle</b></em>' feature
	 * @generated
	 */
	public String getWidgetTitle() {
		return widgetTitle;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getWidgetTitle() <em>widgetTitle</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getWidgetTitle() widgetTitle}' feature.
	 * @generated
	 */
	public void setWidgetTitle(String newWidgetTitle) {
		widgetTitle = newWidgetTitle;
	}

	/**
	 * Returns the value of '<em><b>javaClass</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>javaClass</b></em>' feature
	 * @generated
	 */
	public String getJavaClass() {
		return javaClass;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getJavaClass() <em>javaClass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getJavaClass() javaClass}' feature.
	 * @generated
	 */
	public void setJavaClass(String newJavaClass) {
		javaClass = newJavaClass;
	}

	/**
	 * Returns the value of '<em><b>height</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>height</b></em>' feature
	 * @generated
	 */
	public Long getHeight() {
		return height;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getHeight() <em>height</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getHeight() height}' feature.
	 * @generated
	 */
	public void setHeight(Long newHeight) {
		height = newHeight;
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
	 * Sets the '{@link OBKMOWidgetClassType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>allowAnonymousAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>allowAnonymousAccess</b></em>' feature
	 * @generated
	 */
	public Boolean getAllowAnonymousAccess() {
		return allowAnonymousAccess;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getAllowAnonymousAccess() <em>allowAnonymousAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getAllowAnonymousAccess() allowAnonymousAccess}' feature.
	 * @generated
	 */
	public void setAllowAnonymousAccess(Boolean newAllowAnonymousAccess) {
		allowAnonymousAccess = newAllowAnonymousAccess;
	}

	/**
	 * Returns the value of '<em><b>superclass</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>superclass</b></em>' feature
	 * @generated
	 */
	public Boolean getSuperclass() {
		return superclass;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getSuperclass() <em>superclass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getSuperclass() superclass}' feature.
	 * @generated
	 */
	public void setSuperclass(Boolean newSuperclass) {
		superclass = newSuperclass;
	}

	/**
	 * Returns the value of '<em><b>widgetSuperclass</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>widgetSuperclass</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWidgetSuperclass() {
		return widgetSuperclass;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getWidgetSuperclass() <em>widgetSuperclass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getWidgetSuperclass() widgetSuperclass}' feature.
	 * @generated
	 */
	public void setWidgetSuperclass(ReferenceType newWidgetSuperclass) {
		widgetSuperclass = newWidgetSuperclass;
	}

	/**
	 * Returns the value of '<em><b>canMaximize</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>canMaximize</b></em>' feature
	 * @generated
	 */
	public Boolean getCanMaximize() {
		return canMaximize;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getCanMaximize() <em>canMaximize</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getCanMaximize() canMaximize}' feature.
	 * @generated
	 */
	public void setCanMaximize(Boolean newCanMaximize) {
		canMaximize = newCanMaximize;
	}

	/**
	 * Returns the value of '<em><b>dataAccessLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataAccessLevel</b></em>' feature
	 * @generated
	 */
	public String getDataAccessLevel() {
		return dataAccessLevel;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getDataAccessLevel() <em>dataAccessLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getDataAccessLevel() dataAccessLevel}' feature.
	 * @generated
	 */
	public void setDataAccessLevel(String newDataAccessLevel) {
		dataAccessLevel = newDataAccessLevel;
	}

	/**
	 * Returns the value of '<em><b>authorMsg</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>authorMsg</b></em>' feature
	 * @generated
	 */
	public String getAuthorMsg() {
		return authorMsg;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getAuthorMsg() <em>authorMsg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getAuthorMsg() authorMsg}' feature.
	 * @generated
	 */
	public void setAuthorMsg(String newAuthorMsg) {
		authorMsg = newAuthorMsg;
	}

	/**
	 * Returns the value of '<em><b>authorUrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>authorUrl</b></em>' feature
	 * @generated
	 */
	public String getAuthorUrl() {
		return authorUrl;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getAuthorUrl() <em>authorUrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getAuthorUrl() authorUrl}' feature.
	 * @generated
	 */
	public void setAuthorUrl(String newAuthorUrl) {
		authorUrl = newAuthorUrl;
	}

	/**
	 * Returns the value of '<em><b>oBCQLWidgetQueryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLWidgetQueryList</b></em>' feature
	 * @generated
	 */
	public OBCQLWidgetQueryListType getOBCQLWidgetQueryList() {
		return oBCQLWidgetQueryList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBCQLWidgetQueryList() <em>oBCQLWidgetQueryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBCQLWidgetQueryList() oBCQLWidgetQueryList}' feature.
	 * @generated
	 */
	public void setOBCQLWidgetQueryList(
			OBCQLWidgetQueryListType newOBCQLWidgetQueryList) {
		oBCQLWidgetQueryList = newOBCQLWidgetQueryList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassWidgetSuperclassList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassWidgetSuperclassList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBKMOWidgetClassWidgetSuperclassList() {
		return oBKMOWidgetClassWidgetSuperclassList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassWidgetSuperclassList() <em>oBKMOWidgetClassWidgetSuperclassList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassWidgetSuperclassList() oBKMOWidgetClassWidgetSuperclassList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassWidgetSuperclassList(
			ReferenceType newOBKMOWidgetClassWidgetSuperclassList) {
		oBKMOWidgetClassWidgetSuperclassList = newOBKMOWidgetClassWidgetSuperclassList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassAccessList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassAccessListType1 getOBKMOWidgetClassAccessList() {
		return oBKMOWidgetClassAccessList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassAccessList() <em>oBKMOWidgetClassAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassAccessList() oBKMOWidgetClassAccessList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassAccessList(
			OBKMOWidgetClassAccessListType1 newOBKMOWidgetClassAccessList) {
		oBKMOWidgetClassAccessList = newOBKMOWidgetClassAccessList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenuList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenuList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassMenuListType getOBKMOWidgetClassMenuList() {
		return oBKMOWidgetClassMenuList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassMenuList() <em>oBKMOWidgetClassMenuList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassMenuList() oBKMOWidgetClassMenuList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenuList(
			OBKMOWidgetClassMenuListType newOBKMOWidgetClassMenuList) {
		oBKMOWidgetClassMenuList = newOBKMOWidgetClassMenuList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassTrlList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassTrlListType getOBKMOWidgetClassTrlList() {
		return oBKMOWidgetClassTrlList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassTrlList() <em>oBKMOWidgetClassTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetClassTrlList() oBKMOWidgetClassTrlList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassTrlList(
			OBKMOWidgetClassTrlListType newOBKMOWidgetClassTrlList) {
		oBKMOWidgetClassTrlList = newOBKMOWidgetClassTrlList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetInstanceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetInstanceList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetInstanceListType getOBKMOWidgetInstanceList() {
		return oBKMOWidgetInstanceList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetInstanceList() <em>oBKMOWidgetInstanceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetInstanceList() oBKMOWidgetInstanceList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstanceList(
			OBKMOWidgetInstanceListType newOBKMOWidgetInstanceList) {
		oBKMOWidgetInstanceList = newOBKMOWidgetInstanceList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetListList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetListList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetListListType getOBKMOWidgetListList() {
		return oBKMOWidgetListList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetListList() <em>oBKMOWidgetListList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetListList() oBKMOWidgetListList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetListList(
			OBKMOWidgetListListType newOBKMOWidgetListList) {
		oBKMOWidgetListList = newOBKMOWidgetListList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetReferenceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetReferenceList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetReferenceListType1 getOBKMOWidgetReferenceList() {
		return oBKMOWidgetReferenceList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetReferenceList() <em>oBKMOWidgetReferenceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetReferenceList() oBKMOWidgetReferenceList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetReferenceList(
			OBKMOWidgetReferenceListType1 newOBKMOWidgetReferenceList) {
		oBKMOWidgetReferenceList = newOBKMOWidgetReferenceList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetURLList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetURLList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetURLListType getOBKMOWidgetURLList() {
		return oBKMOWidgetURLList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBKMOWidgetURLList() <em>oBKMOWidgetURLList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBKMOWidgetURLList() oBKMOWidgetURLList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetURLList(
			OBKMOWidgetURLListType newOBKMOWidgetURLList) {
		oBKMOWidgetURLList = newOBKMOWidgetURLList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterEMObkmoWidgetClassIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterEMObkmoWidgetClassIDList</b></em>' feature
	 * @generated
	 */
	public OBUIAPPParameterEMObkmoWidgetClassIDListType getOBUIAPPParameterEMObkmoWidgetClassIDList() {
		return oBUIAPPParameterEMObkmoWidgetClassIDList;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getOBUIAPPParameterEMObkmoWidgetClassIDList() <em>oBUIAPPParameterEMObkmoWidgetClassIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getOBUIAPPParameterEMObkmoWidgetClassIDList() oBUIAPPParameterEMObkmoWidgetClassIDList}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterEMObkmoWidgetClassIDList(
			OBUIAPPParameterEMObkmoWidgetClassIDListType newOBUIAPPParameterEMObkmoWidgetClassIDList) {
		oBUIAPPParameterEMObkmoWidgetClassIDList = newOBUIAPPParameterEMObkmoWidgetClassIDList;
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
	 * Sets the '{@link OBKMOWidgetClassType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getId1() id1}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link OBKMOWidgetClassType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#isReference() reference}' feature.
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
	public List<OBKMOWidgetClassTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link OBKMOWidgetClassType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBKMOWidgetClassType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<OBKMOWidgetClassTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "OBKMOWidgetClassType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
