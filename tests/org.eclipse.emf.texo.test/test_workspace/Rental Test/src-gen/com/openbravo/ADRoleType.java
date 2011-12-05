package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADRoleType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADRoleType {

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
	private String name = null;

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
	private String description = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String userLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String clientList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String organizationList = null;

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
	private Decimal approvalAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType primaryTreeMenu = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean manual = null;

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
	private Boolean clientAdmin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean advanced = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDAlertList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDAlertRecipientList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFormAccessListType aDFormAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDPreferenceVisibleAtRoleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessAccessListType aDProcessAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADRoleOrganizationListType1 aDRoleOrganizationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTableAccessListType1 aDTableAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDUserDefaultRoleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADUserRolesListType1 aDUserRolesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADWindowAccessListType1 aDWindowAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassAccessListType oBKMOWidgetClassAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBKMOWidgetInstanceVisibleAtRoleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBSEIGDefaultsListType oBSEIGDefaultsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPNavbarRoleaccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPProcessAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPUIPersonalizationVisibleAtRoleList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ObuiappViewRoleAccessListType1 obuiappViewRoleAccessList = null;

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
	private List<ADRoleTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADRoleTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADRoleType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getId() id}' feature.
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
	 * Sets the '{@link ADRoleType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getClient() client}' feature.
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
	 * Sets the '{@link ADRoleType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADRoleType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getActive() active}' feature.
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
	 * Sets the '{@link ADRoleType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADRoleType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADRoleType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getUpdated() updated}' feature.
	 * @generated
	 */
	public void setUpdated(DateTime newUpdated) {
		updated = newUpdated;
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
	 * Sets the '{@link ADRoleType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link ADRoleType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link ADRoleType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>userLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>userLevel</b></em>' feature
	 * @generated
	 */
	public String getUserLevel() {
		return userLevel;
	}

	/**
	 * Sets the '{@link ADRoleType#getUserLevel() <em>userLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getUserLevel() userLevel}' feature.
	 * @generated
	 */
	public void setUserLevel(String newUserLevel) {
		userLevel = newUserLevel;
	}

	/**
	 * Returns the value of '<em><b>clientList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientList</b></em>' feature
	 * @generated
	 */
	public String getClientList() {
		return clientList;
	}

	/**
	 * Sets the '{@link ADRoleType#getClientList() <em>clientList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getClientList() clientList}' feature.
	 * @generated
	 */
	public void setClientList(String newClientList) {
		clientList = newClientList;
	}

	/**
	 * Returns the value of '<em><b>organizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationList</b></em>' feature
	 * @generated
	 */
	public String getOrganizationList() {
		return organizationList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOrganizationList() <em>organizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOrganizationList() organizationList}' feature.
	 * @generated
	 */
	public void setOrganizationList(String newOrganizationList) {
		organizationList = newOrganizationList;
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
	 * Sets the '{@link ADRoleType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>approvalAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvalAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getApprovalAmount() {
		return approvalAmount;
	}

	/**
	 * Sets the '{@link ADRoleType#getApprovalAmount() <em>approvalAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getApprovalAmount() approvalAmount}' feature.
	 * @generated
	 */
	public void setApprovalAmount(Decimal newApprovalAmount) {
		approvalAmount = newApprovalAmount;
	}

	/**
	 * Returns the value of '<em><b>primaryTreeMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>primaryTreeMenu</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPrimaryTreeMenu() {
		return primaryTreeMenu;
	}

	/**
	 * Sets the '{@link ADRoleType#getPrimaryTreeMenu() <em>primaryTreeMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getPrimaryTreeMenu() primaryTreeMenu}' feature.
	 * @generated
	 */
	public void setPrimaryTreeMenu(ReferenceType newPrimaryTreeMenu) {
		primaryTreeMenu = newPrimaryTreeMenu;
	}

	/**
	 * Returns the value of '<em><b>manual</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manual</b></em>' feature
	 * @generated
	 */
	public Boolean getManual() {
		return manual;
	}

	/**
	 * Sets the '{@link ADRoleType#getManual() <em>manual</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getManual() manual}' feature.
	 * @generated
	 */
	public void setManual(Boolean newManual) {
		manual = newManual;
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
	 * Sets the '{@link ADRoleType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

	/**
	 * Returns the value of '<em><b>clientAdmin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientAdmin</b></em>' feature
	 * @generated
	 */
	public Boolean getClientAdmin() {
		return clientAdmin;
	}

	/**
	 * Sets the '{@link ADRoleType#getClientAdmin() <em>clientAdmin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getClientAdmin() clientAdmin}' feature.
	 * @generated
	 */
	public void setClientAdmin(Boolean newClientAdmin) {
		clientAdmin = newClientAdmin;
	}

	/**
	 * Returns the value of '<em><b>advanced</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>advanced</b></em>' feature
	 * @generated
	 */
	public Boolean getAdvanced() {
		return advanced;
	}

	/**
	 * Sets the '{@link ADRoleType#getAdvanced() <em>advanced</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getAdvanced() advanced}' feature.
	 * @generated
	 */
	public void setAdvanced(Boolean newAdvanced) {
		advanced = newAdvanced;
	}

	/**
	 * Returns the value of '<em><b>aDAlertList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADAlertList() {
		return aDAlertList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADAlertList() <em>aDAlertList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADAlertList() aDAlertList}' feature.
	 * @generated
	 */
	public void setADAlertList(ReferenceType newADAlertList) {
		aDAlertList = newADAlertList;
	}

	/**
	 * Returns the value of '<em><b>aDAlertRecipientList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRecipientList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADAlertRecipientList() {
		return aDAlertRecipientList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADAlertRecipientList() <em>aDAlertRecipientList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADAlertRecipientList() aDAlertRecipientList}' feature.
	 * @generated
	 */
	public void setADAlertRecipientList(ReferenceType newADAlertRecipientList) {
		aDAlertRecipientList = newADAlertRecipientList;
	}

	/**
	 * Returns the value of '<em><b>aDFormAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormAccessList</b></em>' feature
	 * @generated
	 */
	public ADFormAccessListType getADFormAccessList() {
		return aDFormAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADFormAccessList() <em>aDFormAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADFormAccessList() aDFormAccessList}' feature.
	 * @generated
	 */
	public void setADFormAccessList(ADFormAccessListType newADFormAccessList) {
		aDFormAccessList = newADFormAccessList;
	}

	/**
	 * Returns the value of '<em><b>aDPreferenceVisibleAtRoleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDPreferenceVisibleAtRoleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADPreferenceVisibleAtRoleList() {
		return aDPreferenceVisibleAtRoleList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADPreferenceVisibleAtRoleList() <em>aDPreferenceVisibleAtRoleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADPreferenceVisibleAtRoleList() aDPreferenceVisibleAtRoleList}' feature.
	 * @generated
	 */
	public void setADPreferenceVisibleAtRoleList(
			ReferenceType newADPreferenceVisibleAtRoleList) {
		aDPreferenceVisibleAtRoleList = newADPreferenceVisibleAtRoleList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessAccessList</b></em>' feature
	 * @generated
	 */
	public ADProcessAccessListType getADProcessAccessList() {
		return aDProcessAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADProcessAccessList() <em>aDProcessAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADProcessAccessList() aDProcessAccessList}' feature.
	 * @generated
	 */
	public void setADProcessAccessList(
			ADProcessAccessListType newADProcessAccessList) {
		aDProcessAccessList = newADProcessAccessList;
	}

	/**
	 * Returns the value of '<em><b>aDRoleOrganizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRoleOrganizationList</b></em>' feature
	 * @generated
	 */
	public ADRoleOrganizationListType1 getADRoleOrganizationList() {
		return aDRoleOrganizationList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADRoleOrganizationList() <em>aDRoleOrganizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADRoleOrganizationList() aDRoleOrganizationList}' feature.
	 * @generated
	 */
	public void setADRoleOrganizationList(
			ADRoleOrganizationListType1 newADRoleOrganizationList) {
		aDRoleOrganizationList = newADRoleOrganizationList;
	}

	/**
	 * Returns the value of '<em><b>aDTableAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTableAccessList</b></em>' feature
	 * @generated
	 */
	public ADTableAccessListType1 getADTableAccessList() {
		return aDTableAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADTableAccessList() <em>aDTableAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADTableAccessList() aDTableAccessList}' feature.
	 * @generated
	 */
	public void setADTableAccessList(ADTableAccessListType1 newADTableAccessList) {
		aDTableAccessList = newADTableAccessList;
	}

	/**
	 * Returns the value of '<em><b>aDUserDefaultRoleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserDefaultRoleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADUserDefaultRoleList() {
		return aDUserDefaultRoleList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADUserDefaultRoleList() <em>aDUserDefaultRoleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADUserDefaultRoleList() aDUserDefaultRoleList}' feature.
	 * @generated
	 */
	public void setADUserDefaultRoleList(ReferenceType newADUserDefaultRoleList) {
		aDUserDefaultRoleList = newADUserDefaultRoleList;
	}

	/**
	 * Returns the value of '<em><b>aDUserRolesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserRolesList</b></em>' feature
	 * @generated
	 */
	public ADUserRolesListType1 getADUserRolesList() {
		return aDUserRolesList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADUserRolesList() <em>aDUserRolesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADUserRolesList() aDUserRolesList}' feature.
	 * @generated
	 */
	public void setADUserRolesList(ADUserRolesListType1 newADUserRolesList) {
		aDUserRolesList = newADUserRolesList;
	}

	/**
	 * Returns the value of '<em><b>aDWindowAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowAccessList</b></em>' feature
	 * @generated
	 */
	public ADWindowAccessListType1 getADWindowAccessList() {
		return aDWindowAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getADWindowAccessList() <em>aDWindowAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getADWindowAccessList() aDWindowAccessList}' feature.
	 * @generated
	 */
	public void setADWindowAccessList(
			ADWindowAccessListType1 newADWindowAccessList) {
		aDWindowAccessList = newADWindowAccessList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassAccessList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassAccessListType getOBKMOWidgetClassAccessList() {
		return oBKMOWidgetClassAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOBKMOWidgetClassAccessList() <em>oBKMOWidgetClassAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOBKMOWidgetClassAccessList() oBKMOWidgetClassAccessList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassAccessList(
			OBKMOWidgetClassAccessListType newOBKMOWidgetClassAccessList) {
		oBKMOWidgetClassAccessList = newOBKMOWidgetClassAccessList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetInstanceVisibleAtRoleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetInstanceVisibleAtRoleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBKMOWidgetInstanceVisibleAtRoleList() {
		return oBKMOWidgetInstanceVisibleAtRoleList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOBKMOWidgetInstanceVisibleAtRoleList() <em>oBKMOWidgetInstanceVisibleAtRoleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOBKMOWidgetInstanceVisibleAtRoleList() oBKMOWidgetInstanceVisibleAtRoleList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstanceVisibleAtRoleList(
			ReferenceType newOBKMOWidgetInstanceVisibleAtRoleList) {
		oBKMOWidgetInstanceVisibleAtRoleList = newOBKMOWidgetInstanceVisibleAtRoleList;
	}

	/**
	 * Returns the value of '<em><b>oBSEIGDefaultsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSEIGDefaultsList</b></em>' feature
	 * @generated
	 */
	public OBSEIGDefaultsListType getOBSEIGDefaultsList() {
		return oBSEIGDefaultsList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOBSEIGDefaultsList() <em>oBSEIGDefaultsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOBSEIGDefaultsList() oBSEIGDefaultsList}' feature.
	 * @generated
	 */
	public void setOBSEIGDefaultsList(
			OBSEIGDefaultsListType newOBSEIGDefaultsList) {
		oBSEIGDefaultsList = newOBSEIGDefaultsList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNavbarRoleaccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavbarRoleaccessList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPNavbarRoleaccessList() {
		return oBUIAPPNavbarRoleaccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOBUIAPPNavbarRoleaccessList() <em>oBUIAPPNavbarRoleaccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOBUIAPPNavbarRoleaccessList() oBUIAPPNavbarRoleaccessList}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavbarRoleaccessList(
			ReferenceType newOBUIAPPNavbarRoleaccessList) {
		oBUIAPPNavbarRoleaccessList = newOBUIAPPNavbarRoleaccessList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPProcessAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPProcessAccessList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPProcessAccessList() {
		return oBUIAPPProcessAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOBUIAPPProcessAccessList() <em>oBUIAPPProcessAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOBUIAPPProcessAccessList() oBUIAPPProcessAccessList}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcessAccessList(
			ReferenceType newOBUIAPPProcessAccessList) {
		oBUIAPPProcessAccessList = newOBUIAPPProcessAccessList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPUIPersonalizationVisibleAtRoleList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPUIPersonalizationVisibleAtRoleList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPUIPersonalizationVisibleAtRoleList() {
		return oBUIAPPUIPersonalizationVisibleAtRoleList;
	}

	/**
	 * Sets the '{@link ADRoleType#getOBUIAPPUIPersonalizationVisibleAtRoleList() <em>oBUIAPPUIPersonalizationVisibleAtRoleList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getOBUIAPPUIPersonalizationVisibleAtRoleList() oBUIAPPUIPersonalizationVisibleAtRoleList}' feature.
	 * @generated
	 */
	public void setOBUIAPPUIPersonalizationVisibleAtRoleList(
			ReferenceType newOBUIAPPUIPersonalizationVisibleAtRoleList) {
		oBUIAPPUIPersonalizationVisibleAtRoleList = newOBUIAPPUIPersonalizationVisibleAtRoleList;
	}

	/**
	 * Returns the value of '<em><b>obuiappViewRoleAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obuiappViewRoleAccessList</b></em>' feature
	 * @generated
	 */
	public ObuiappViewRoleAccessListType1 getObuiappViewRoleAccessList() {
		return obuiappViewRoleAccessList;
	}

	/**
	 * Sets the '{@link ADRoleType#getObuiappViewRoleAccessList() <em>obuiappViewRoleAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getObuiappViewRoleAccessList() obuiappViewRoleAccessList}' feature.
	 * @generated
	 */
	public void setObuiappViewRoleAccessList(
			ObuiappViewRoleAccessListType1 newObuiappViewRoleAccessList) {
		obuiappViewRoleAccessList = newObuiappViewRoleAccessList;
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
	 * Sets the '{@link ADRoleType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getId1() id1}' feature.
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
	 * Sets the '{@link ADRoleType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADRoleType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#isReference() reference}' feature.
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
	public List<ADRoleTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADRoleType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADRoleType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADRoleTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADRoleType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
