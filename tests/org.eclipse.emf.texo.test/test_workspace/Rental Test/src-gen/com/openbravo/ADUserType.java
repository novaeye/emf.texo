package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADUserType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADUserType {

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
	private String password = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String email = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType supervisor = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartner = null;

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
	private String emailServerUsername = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String emailServerPassword = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType partnerAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType greeting = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String position = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String comments = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String phone = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String alternativePhone = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String fax = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime lastContactDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String lastContactResult = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime birthday = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType trxOrganization = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String firstName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String lastName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String username = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType defaultClient = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType defaultLanguage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType defaultOrganization = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType defaultRole = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType defaultWarehouse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean locked = null;

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
	private ReferenceType aDPreferenceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDProcessInstanceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDUserSupervisorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADUserRolesListType aDUserRolesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType auditTrailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType activeProposalVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerBankAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType contactEmailInteractionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType externalPOSSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingMeasureShiftList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBKMOWidgetInstanceVisibleAtUserList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBSOIDUserIdentifierListType oBSOIDUserIdentifierList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType oBUIAPPUIPersonalizationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderDropShipContactList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organizationInformationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType processExecutionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType processRequestList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementRequisitionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementRequisitionLineLockedByList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectProjectProposalTaskList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectProposalList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType resourceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesRegionSalesRepresentativeList = null;

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
	private List<ADUserTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADUserTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADUserType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getId() id}' feature.
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
	 * Sets the '{@link ADUserType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getClient() client}' feature.
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
	 * Sets the '{@link ADUserType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADUserType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getActive() active}' feature.
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
	 * Sets the '{@link ADUserType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADUserType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADUserType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADUserType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ADUserType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getName() name}' feature.
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
	 * Sets the '{@link ADUserType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>password</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>password</b></em>' feature
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the '{@link ADUserType#getPassword() <em>password</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getPassword() password}' feature.
	 * @generated
	 */
	public void setPassword(String newPassword) {
		password = newPassword;
	}

	/**
	 * Returns the value of '<em><b>email</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>email</b></em>' feature
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the '{@link ADUserType#getEmail() <em>email</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getEmail() email}' feature.
	 * @generated
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * Returns the value of '<em><b>supervisor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>supervisor</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSupervisor() {
		return supervisor;
	}

	/**
	 * Sets the '{@link ADUserType#getSupervisor() <em>supervisor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getSupervisor() supervisor}' feature.
	 * @generated
	 */
	public void setSupervisor(ReferenceType newSupervisor) {
		supervisor = newSupervisor;
	}

	/**
	 * Returns the value of '<em><b>businessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartner</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartner() {
		return businessPartner;
	}

	/**
	 * Sets the '{@link ADUserType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
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
	 * Sets the '{@link ADUserType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

	/**
	 * Returns the value of '<em><b>emailServerUsername</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailServerUsername</b></em>' feature
	 * @generated
	 */
	public String getEmailServerUsername() {
		return emailServerUsername;
	}

	/**
	 * Sets the '{@link ADUserType#getEmailServerUsername() <em>emailServerUsername</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getEmailServerUsername() emailServerUsername}' feature.
	 * @generated
	 */
	public void setEmailServerUsername(String newEmailServerUsername) {
		emailServerUsername = newEmailServerUsername;
	}

	/**
	 * Returns the value of '<em><b>emailServerPassword</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailServerPassword</b></em>' feature
	 * @generated
	 */
	public String getEmailServerPassword() {
		return emailServerPassword;
	}

	/**
	 * Sets the '{@link ADUserType#getEmailServerPassword() <em>emailServerPassword</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getEmailServerPassword() emailServerPassword}' feature.
	 * @generated
	 */
	public void setEmailServerPassword(String newEmailServerPassword) {
		emailServerPassword = newEmailServerPassword;
	}

	/**
	 * Returns the value of '<em><b>partnerAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>partnerAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPartnerAddress() {
		return partnerAddress;
	}

	/**
	 * Sets the '{@link ADUserType#getPartnerAddress() <em>partnerAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getPartnerAddress() partnerAddress}' feature.
	 * @generated
	 */
	public void setPartnerAddress(ReferenceType newPartnerAddress) {
		partnerAddress = newPartnerAddress;
	}

	/**
	 * Returns the value of '<em><b>greeting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greeting</b></em>' feature
	 * @generated
	 */
	public ReferenceType getGreeting() {
		return greeting;
	}

	/**
	 * Sets the '{@link ADUserType#getGreeting() <em>greeting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getGreeting() greeting}' feature.
	 * @generated
	 */
	public void setGreeting(ReferenceType newGreeting) {
		greeting = newGreeting;
	}

	/**
	 * Returns the value of '<em><b>position</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>position</b></em>' feature
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * Sets the '{@link ADUserType#getPosition() <em>position</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getPosition() position}' feature.
	 * @generated
	 */
	public void setPosition(String newPosition) {
		position = newPosition;
	}

	/**
	 * Returns the value of '<em><b>comments</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>comments</b></em>' feature
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the '{@link ADUserType#getComments() <em>comments</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getComments() comments}' feature.
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * Returns the value of '<em><b>phone</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>phone</b></em>' feature
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the '{@link ADUserType#getPhone() <em>phone</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getPhone() phone}' feature.
	 * @generated
	 */
	public void setPhone(String newPhone) {
		phone = newPhone;
	}

	/**
	 * Returns the value of '<em><b>alternativePhone</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>alternativePhone</b></em>' feature
	 * @generated
	 */
	public String getAlternativePhone() {
		return alternativePhone;
	}

	/**
	 * Sets the '{@link ADUserType#getAlternativePhone() <em>alternativePhone</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getAlternativePhone() alternativePhone}' feature.
	 * @generated
	 */
	public void setAlternativePhone(String newAlternativePhone) {
		alternativePhone = newAlternativePhone;
	}

	/**
	 * Returns the value of '<em><b>fax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fax</b></em>' feature
	 * @generated
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * Sets the '{@link ADUserType#getFax() <em>fax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getFax() fax}' feature.
	 * @generated
	 */
	public void setFax(String newFax) {
		fax = newFax;
	}

	/**
	 * Returns the value of '<em><b>lastContactDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastContactDate</b></em>' feature
	 * @generated
	 */
	public DateTime getLastContactDate() {
		return lastContactDate;
	}

	/**
	 * Sets the '{@link ADUserType#getLastContactDate() <em>lastContactDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getLastContactDate() lastContactDate}' feature.
	 * @generated
	 */
	public void setLastContactDate(DateTime newLastContactDate) {
		lastContactDate = newLastContactDate;
	}

	/**
	 * Returns the value of '<em><b>lastContactResult</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastContactResult</b></em>' feature
	 * @generated
	 */
	public String getLastContactResult() {
		return lastContactResult;
	}

	/**
	 * Sets the '{@link ADUserType#getLastContactResult() <em>lastContactResult</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getLastContactResult() lastContactResult}' feature.
	 * @generated
	 */
	public void setLastContactResult(String newLastContactResult) {
		lastContactResult = newLastContactResult;
	}

	/**
	 * Returns the value of '<em><b>birthday</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>birthday</b></em>' feature
	 * @generated
	 */
	public DateTime getBirthday() {
		return birthday;
	}

	/**
	 * Sets the '{@link ADUserType#getBirthday() <em>birthday</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getBirthday() birthday}' feature.
	 * @generated
	 */
	public void setBirthday(DateTime newBirthday) {
		birthday = newBirthday;
	}

	/**
	 * Returns the value of '<em><b>trxOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>trxOrganization</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTrxOrganization() {
		return trxOrganization;
	}

	/**
	 * Sets the '{@link ADUserType#getTrxOrganization() <em>trxOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getTrxOrganization() trxOrganization}' feature.
	 * @generated
	 */
	public void setTrxOrganization(ReferenceType newTrxOrganization) {
		trxOrganization = newTrxOrganization;
	}

	/**
	 * Returns the value of '<em><b>firstName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>firstName</b></em>' feature
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the '{@link ADUserType#getFirstName() <em>firstName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getFirstName() firstName}' feature.
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	/**
	 * Returns the value of '<em><b>lastName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastName</b></em>' feature
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the '{@link ADUserType#getLastName() <em>lastName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getLastName() lastName}' feature.
	 * @generated
	 */
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	/**
	 * Returns the value of '<em><b>username</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>username</b></em>' feature
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the '{@link ADUserType#getUsername() <em>username</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getUsername() username}' feature.
	 * @generated
	 */
	public void setUsername(String newUsername) {
		username = newUsername;
	}

	/**
	 * Returns the value of '<em><b>defaultClient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultClient</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDefaultClient() {
		return defaultClient;
	}

	/**
	 * Sets the '{@link ADUserType#getDefaultClient() <em>defaultClient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getDefaultClient() defaultClient}' feature.
	 * @generated
	 */
	public void setDefaultClient(ReferenceType newDefaultClient) {
		defaultClient = newDefaultClient;
	}

	/**
	 * Returns the value of '<em><b>defaultLanguage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultLanguage</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * Sets the '{@link ADUserType#getDefaultLanguage() <em>defaultLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getDefaultLanguage() defaultLanguage}' feature.
	 * @generated
	 */
	public void setDefaultLanguage(ReferenceType newDefaultLanguage) {
		defaultLanguage = newDefaultLanguage;
	}

	/**
	 * Returns the value of '<em><b>defaultOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultOrganization</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDefaultOrganization() {
		return defaultOrganization;
	}

	/**
	 * Sets the '{@link ADUserType#getDefaultOrganization() <em>defaultOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getDefaultOrganization() defaultOrganization}' feature.
	 * @generated
	 */
	public void setDefaultOrganization(ReferenceType newDefaultOrganization) {
		defaultOrganization = newDefaultOrganization;
	}

	/**
	 * Returns the value of '<em><b>defaultRole</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultRole</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDefaultRole() {
		return defaultRole;
	}

	/**
	 * Sets the '{@link ADUserType#getDefaultRole() <em>defaultRole</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getDefaultRole() defaultRole}' feature.
	 * @generated
	 */
	public void setDefaultRole(ReferenceType newDefaultRole) {
		defaultRole = newDefaultRole;
	}

	/**
	 * Returns the value of '<em><b>defaultWarehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>defaultWarehouse</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDefaultWarehouse() {
		return defaultWarehouse;
	}

	/**
	 * Sets the '{@link ADUserType#getDefaultWarehouse() <em>defaultWarehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getDefaultWarehouse() defaultWarehouse}' feature.
	 * @generated
	 */
	public void setDefaultWarehouse(ReferenceType newDefaultWarehouse) {
		defaultWarehouse = newDefaultWarehouse;
	}

	/**
	 * Returns the value of '<em><b>locked</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locked</b></em>' feature
	 * @generated
	 */
	public Boolean getLocked() {
		return locked;
	}

	/**
	 * Sets the '{@link ADUserType#getLocked() <em>locked</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getLocked() locked}' feature.
	 * @generated
	 */
	public void setLocked(Boolean newLocked) {
		locked = newLocked;
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
	 * Sets the '{@link ADUserType#getADAlertList() <em>aDAlertList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getADAlertList() aDAlertList}' feature.
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
	 * Sets the '{@link ADUserType#getADAlertRecipientList() <em>aDAlertRecipientList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getADAlertRecipientList() aDAlertRecipientList}' feature.
	 * @generated
	 */
	public void setADAlertRecipientList(ReferenceType newADAlertRecipientList) {
		aDAlertRecipientList = newADAlertRecipientList;
	}

	/**
	 * Returns the value of '<em><b>aDPreferenceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDPreferenceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADPreferenceList() {
		return aDPreferenceList;
	}

	/**
	 * Sets the '{@link ADUserType#getADPreferenceList() <em>aDPreferenceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getADPreferenceList() aDPreferenceList}' feature.
	 * @generated
	 */
	public void setADPreferenceList(ReferenceType newADPreferenceList) {
		aDPreferenceList = newADPreferenceList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessInstanceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessInstanceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADProcessInstanceList() {
		return aDProcessInstanceList;
	}

	/**
	 * Sets the '{@link ADUserType#getADProcessInstanceList() <em>aDProcessInstanceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getADProcessInstanceList() aDProcessInstanceList}' feature.
	 * @generated
	 */
	public void setADProcessInstanceList(ReferenceType newADProcessInstanceList) {
		aDProcessInstanceList = newADProcessInstanceList;
	}

	/**
	 * Returns the value of '<em><b>aDUserSupervisorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserSupervisorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADUserSupervisorList() {
		return aDUserSupervisorList;
	}

	/**
	 * Sets the '{@link ADUserType#getADUserSupervisorList() <em>aDUserSupervisorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getADUserSupervisorList() aDUserSupervisorList}' feature.
	 * @generated
	 */
	public void setADUserSupervisorList(ReferenceType newADUserSupervisorList) {
		aDUserSupervisorList = newADUserSupervisorList;
	}

	/**
	 * Returns the value of '<em><b>aDUserRolesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserRolesList</b></em>' feature
	 * @generated
	 */
	public ADUserRolesListType getADUserRolesList() {
		return aDUserRolesList;
	}

	/**
	 * Sets the '{@link ADUserType#getADUserRolesList() <em>aDUserRolesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getADUserRolesList() aDUserRolesList}' feature.
	 * @generated
	 */
	public void setADUserRolesList(ADUserRolesListType newADUserRolesList) {
		aDUserRolesList = newADUserRolesList;
	}

	/**
	 * Returns the value of '<em><b>auditTrailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>auditTrailList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAuditTrailList() {
		return auditTrailList;
	}

	/**
	 * Sets the '{@link ADUserType#getAuditTrailList() <em>auditTrailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getAuditTrailList() auditTrailList}' feature.
	 * @generated
	 */
	public void setAuditTrailList(ReferenceType newAuditTrailList) {
		auditTrailList = newAuditTrailList;
	}

	/**
	 * Returns the value of '<em><b>activeProposalVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activeProposalVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getActiveProposalVList() {
		return activeProposalVList;
	}

	/**
	 * Sets the '{@link ADUserType#getActiveProposalVList() <em>activeProposalVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getActiveProposalVList() activeProposalVList}' feature.
	 * @generated
	 */
	public void setActiveProposalVList(ReferenceType newActiveProposalVList) {
		activeProposalVList = newActiveProposalVList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerBankAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerBankAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerBankAccountList() {
		return businessPartnerBankAccountList;
	}

	/**
	 * Sets the '{@link ADUserType#getBusinessPartnerBankAccountList() <em>businessPartnerBankAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getBusinessPartnerBankAccountList() businessPartnerBankAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccountList(
			ReferenceType newBusinessPartnerBankAccountList) {
		businessPartnerBankAccountList = newBusinessPartnerBankAccountList;
	}

	/**
	 * Returns the value of '<em><b>contactEmailInteractionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contactEmailInteractionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getContactEmailInteractionList() {
		return contactEmailInteractionList;
	}

	/**
	 * Sets the '{@link ADUserType#getContactEmailInteractionList() <em>contactEmailInteractionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getContactEmailInteractionList() contactEmailInteractionList}' feature.
	 * @generated
	 */
	public void setContactEmailInteractionList(
			ReferenceType newContactEmailInteractionList) {
		contactEmailInteractionList = newContactEmailInteractionList;
	}

	/**
	 * Returns the value of '<em><b>externalPOSSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExternalPOSSalesRepresentativeList() {
		return externalPOSSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getExternalPOSSalesRepresentativeList() <em>externalPOSSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getExternalPOSSalesRepresentativeList() externalPOSSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setExternalPOSSalesRepresentativeList(
			ReferenceType newExternalPOSSalesRepresentativeList) {
		externalPOSSalesRepresentativeList = newExternalPOSSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetList() {
		return financialMgmtAssetList;
	}

	/**
	 * Sets the '{@link ADUserType#getFinancialMgmtAssetList() <em>financialMgmtAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getFinancialMgmtAssetList() financialMgmtAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetList(
			ReferenceType newFinancialMgmtAssetList) {
		financialMgmtAssetList = newFinancialMgmtAssetList;
	}

	/**
	 * Returns the value of '<em><b>invoiceSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceSalesRepresentativeList() {
		return invoiceSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getInvoiceSalesRepresentativeList() <em>invoiceSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getInvoiceSalesRepresentativeList() invoiceSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setInvoiceSalesRepresentativeList(
			ReferenceType newInvoiceSalesRepresentativeList) {
		invoiceSalesRepresentativeList = newInvoiceSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>invoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceList() {
		return invoiceList;
	}

	/**
	 * Sets the '{@link ADUserType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(ReferenceType newInvoiceList) {
		invoiceList = newInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureShiftList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureShiftList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingMeasureShiftList() {
		return manufacturingMeasureShiftList;
	}

	/**
	 * Sets the '{@link ADUserType#getManufacturingMeasureShiftList() <em>manufacturingMeasureShiftList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getManufacturingMeasureShiftList() manufacturingMeasureShiftList}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureShiftList(
			ReferenceType newManufacturingMeasureShiftList) {
		manufacturingMeasureShiftList = newManufacturingMeasureShiftList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutList() {
		return materialMgmtShipmentInOutList;
	}

	/**
	 * Sets the '{@link ADUserType#getMaterialMgmtShipmentInOutList() <em>materialMgmtShipmentInOutList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getMaterialMgmtShipmentInOutList() materialMgmtShipmentInOutList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutList(
			ReferenceType newMaterialMgmtShipmentInOutList) {
		materialMgmtShipmentInOutList = newMaterialMgmtShipmentInOutList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutSalesRepresentativeList() {
		return materialMgmtShipmentInOutSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getMaterialMgmtShipmentInOutSalesRepresentativeList() <em>materialMgmtShipmentInOutSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getMaterialMgmtShipmentInOutSalesRepresentativeList() materialMgmtShipmentInOutSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutSalesRepresentativeList(
			ReferenceType newMaterialMgmtShipmentInOutSalesRepresentativeList) {
		materialMgmtShipmentInOutSalesRepresentativeList = newMaterialMgmtShipmentInOutSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetInstanceVisibleAtUserList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetInstanceVisibleAtUserList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBKMOWidgetInstanceVisibleAtUserList() {
		return oBKMOWidgetInstanceVisibleAtUserList;
	}

	/**
	 * Sets the '{@link ADUserType#getOBKMOWidgetInstanceVisibleAtUserList() <em>oBKMOWidgetInstanceVisibleAtUserList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOBKMOWidgetInstanceVisibleAtUserList() oBKMOWidgetInstanceVisibleAtUserList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstanceVisibleAtUserList(
			ReferenceType newOBKMOWidgetInstanceVisibleAtUserList) {
		oBKMOWidgetInstanceVisibleAtUserList = newOBKMOWidgetInstanceVisibleAtUserList;
	}

	/**
	 * Returns the value of '<em><b>oBSOIDUserIdentifierList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSOIDUserIdentifierList</b></em>' feature
	 * @generated
	 */
	public OBSOIDUserIdentifierListType getOBSOIDUserIdentifierList() {
		return oBSOIDUserIdentifierList;
	}

	/**
	 * Sets the '{@link ADUserType#getOBSOIDUserIdentifierList() <em>oBSOIDUserIdentifierList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOBSOIDUserIdentifierList() oBSOIDUserIdentifierList}' feature.
	 * @generated
	 */
	public void setOBSOIDUserIdentifierList(
			OBSOIDUserIdentifierListType newOBSOIDUserIdentifierList) {
		oBSOIDUserIdentifierList = newOBSOIDUserIdentifierList;
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPUIPersonalizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPUIPersonalizationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOBUIAPPUIPersonalizationList() {
		return oBUIAPPUIPersonalizationList;
	}

	/**
	 * Sets the '{@link ADUserType#getOBUIAPPUIPersonalizationList() <em>oBUIAPPUIPersonalizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOBUIAPPUIPersonalizationList() oBUIAPPUIPersonalizationList}' feature.
	 * @generated
	 */
	public void setOBUIAPPUIPersonalizationList(
			ReferenceType newOBUIAPPUIPersonalizationList) {
		oBUIAPPUIPersonalizationList = newOBUIAPPUIPersonalizationList;
	}

	/**
	 * Returns the value of '<em><b>orderSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderSalesRepresentativeList() {
		return orderSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getOrderSalesRepresentativeList() <em>orderSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOrderSalesRepresentativeList() orderSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setOrderSalesRepresentativeList(
			ReferenceType newOrderSalesRepresentativeList) {
		orderSalesRepresentativeList = newOrderSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>orderList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderList() {
		return orderList;
	}

	/**
	 * Sets the '{@link ADUserType#getOrderList() <em>orderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOrderList() orderList}' feature.
	 * @generated
	 */
	public void setOrderList(ReferenceType newOrderList) {
		orderList = newOrderList;
	}

	/**
	 * Returns the value of '<em><b>orderDropShipContactList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDropShipContactList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderDropShipContactList() {
		return orderDropShipContactList;
	}

	/**
	 * Sets the '{@link ADUserType#getOrderDropShipContactList() <em>orderDropShipContactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOrderDropShipContactList() orderDropShipContactList}' feature.
	 * @generated
	 */
	public void setOrderDropShipContactList(
			ReferenceType newOrderDropShipContactList) {
		orderDropShipContactList = newOrderDropShipContactList;
	}

	/**
	 * Returns the value of '<em><b>organizationInformationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationInformationList() {
		return organizationInformationList;
	}

	/**
	 * Sets the '{@link ADUserType#getOrganizationInformationList() <em>organizationInformationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getOrganizationInformationList() organizationInformationList}' feature.
	 * @generated
	 */
	public void setOrganizationInformationList(
			ReferenceType newOrganizationInformationList) {
		organizationInformationList = newOrganizationInformationList;
	}

	/**
	 * Returns the value of '<em><b>processExecutionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processExecutionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessExecutionList() {
		return processExecutionList;
	}

	/**
	 * Sets the '{@link ADUserType#getProcessExecutionList() <em>processExecutionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProcessExecutionList() processExecutionList}' feature.
	 * @generated
	 */
	public void setProcessExecutionList(ReferenceType newProcessExecutionList) {
		processExecutionList = newProcessExecutionList;
	}

	/**
	 * Returns the value of '<em><b>processRequestList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRequestList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessRequestList() {
		return processRequestList;
	}

	/**
	 * Sets the '{@link ADUserType#getProcessRequestList() <em>processRequestList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProcessRequestList() processRequestList}' feature.
	 * @generated
	 */
	public void setProcessRequestList(ReferenceType newProcessRequestList) {
		processRequestList = newProcessRequestList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionList() {
		return procurementRequisitionList;
	}

	/**
	 * Sets the '{@link ADUserType#getProcurementRequisitionList() <em>procurementRequisitionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProcurementRequisitionList() procurementRequisitionList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionList(
			ReferenceType newProcurementRequisitionList) {
		procurementRequisitionList = newProcurementRequisitionList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionLineLockedByList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLineLockedByList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionLineLockedByList() {
		return procurementRequisitionLineLockedByList;
	}

	/**
	 * Sets the '{@link ADUserType#getProcurementRequisitionLineLockedByList() <em>procurementRequisitionLineLockedByList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProcurementRequisitionLineLockedByList() procurementRequisitionLineLockedByList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLineLockedByList(
			ReferenceType newProcurementRequisitionLineLockedByList) {
		procurementRequisitionLineLockedByList = newProcurementRequisitionLineLockedByList;
	}

	/**
	 * Returns the value of '<em><b>productSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductSalesRepresentativeList() {
		return productSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getProductSalesRepresentativeList() <em>productSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProductSalesRepresentativeList() productSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setProductSalesRepresentativeList(
			ReferenceType newProductSalesRepresentativeList) {
		productSalesRepresentativeList = newProductSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>projectList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectList() {
		return projectList;
	}

	/**
	 * Sets the '{@link ADUserType#getProjectList() <em>projectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProjectList() projectList}' feature.
	 * @generated
	 */
	public void setProjectList(ReferenceType newProjectList) {
		projectList = newProjectList;
	}

	/**
	 * Returns the value of '<em><b>projectSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectSalesRepresentativeList() {
		return projectSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getProjectSalesRepresentativeList() <em>projectSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProjectSalesRepresentativeList() projectSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setProjectSalesRepresentativeList(
			ReferenceType newProjectSalesRepresentativeList) {
		projectSalesRepresentativeList = newProjectSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>projectProjectProposalTaskList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProjectProposalTaskList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectProjectProposalTaskList() {
		return projectProjectProposalTaskList;
	}

	/**
	 * Sets the '{@link ADUserType#getProjectProjectProposalTaskList() <em>projectProjectProposalTaskList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProjectProjectProposalTaskList() projectProjectProposalTaskList}' feature.
	 * @generated
	 */
	public void setProjectProjectProposalTaskList(
			ReferenceType newProjectProjectProposalTaskList) {
		projectProjectProposalTaskList = newProjectProjectProposalTaskList;
	}

	/**
	 * Returns the value of '<em><b>projectProposalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectProposalList() {
		return projectProposalList;
	}

	/**
	 * Sets the '{@link ADUserType#getProjectProposalList() <em>projectProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getProjectProposalList() projectProposalList}' feature.
	 * @generated
	 */
	public void setProjectProposalList(ReferenceType newProjectProposalList) {
		projectProposalList = newProjectProposalList;
	}

	/**
	 * Returns the value of '<em><b>resourceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getResourceList() {
		return resourceList;
	}

	/**
	 * Sets the '{@link ADUserType#getResourceList() <em>resourceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getResourceList() resourceList}' feature.
	 * @generated
	 */
	public void setResourceList(ReferenceType newResourceList) {
		resourceList = newResourceList;
	}

	/**
	 * Returns the value of '<em><b>salesRegionSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRegionSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesRegionSalesRepresentativeList() {
		return salesRegionSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link ADUserType#getSalesRegionSalesRepresentativeList() <em>salesRegionSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getSalesRegionSalesRepresentativeList() salesRegionSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setSalesRegionSalesRepresentativeList(
			ReferenceType newSalesRegionSalesRepresentativeList) {
		salesRegionSalesRepresentativeList = newSalesRegionSalesRepresentativeList;
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
	 * Sets the '{@link ADUserType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getId1() id1}' feature.
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
	 * Sets the '{@link ADUserType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADUserType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#isReference() reference}' feature.
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
	public List<ADUserTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADUserType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADUserType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADUserTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADUserType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
