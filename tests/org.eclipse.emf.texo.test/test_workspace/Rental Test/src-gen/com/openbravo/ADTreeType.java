package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADTreeType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADTreeType {

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
	private Boolean active = null;

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
	private String typeArea = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean allNodes = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDRolePrimaryTreeMenuList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTreeNodeListType aDTreeNodeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryTreeMenuList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryTreeOrganizationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryTreeBPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryTreeProjectList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryTreeSalesRegionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationPrimaryTreeProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationADTreeCampaignIDList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtElementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtElementAdditionalTree2List = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtElementAdditionalTree1List = null;

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
	private List<ADTreeTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADTreeTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADTreeType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getId() id}' feature.
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
	 * Sets the '{@link ADTreeType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClient() client}' feature.
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
	 * Sets the '{@link ADTreeType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ReferenceType newOrganization) {
		organization = newOrganization;
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
	 * Sets the '{@link ADTreeType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADTreeType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADTreeType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADTreeType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link ADTreeType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
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
	 * Sets the '{@link ADTreeType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getName() name}' feature.
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
	 * Sets the '{@link ADTreeType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>typeArea</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>typeArea</b></em>' feature
	 * @generated
	 */
	public String getTypeArea() {
		return typeArea;
	}

	/**
	 * Sets the '{@link ADTreeType#getTypeArea() <em>typeArea</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getTypeArea() typeArea}' feature.
	 * @generated
	 */
	public void setTypeArea(String newTypeArea) {
		typeArea = newTypeArea;
	}

	/**
	 * Returns the value of '<em><b>allNodes</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>allNodes</b></em>' feature
	 * @generated
	 */
	public Boolean getAllNodes() {
		return allNodes;
	}

	/**
	 * Sets the '{@link ADTreeType#getAllNodes() <em>allNodes</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getAllNodes() allNodes}' feature.
	 * @generated
	 */
	public void setAllNodes(Boolean newAllNodes) {
		allNodes = newAllNodes;
	}

	/**
	 * Returns the value of '<em><b>aDRolePrimaryTreeMenuList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRolePrimaryTreeMenuList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADRolePrimaryTreeMenuList() {
		return aDRolePrimaryTreeMenuList;
	}

	/**
	 * Sets the '{@link ADTreeType#getADRolePrimaryTreeMenuList() <em>aDRolePrimaryTreeMenuList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getADRolePrimaryTreeMenuList() aDRolePrimaryTreeMenuList}' feature.
	 * @generated
	 */
	public void setADRolePrimaryTreeMenuList(
			ReferenceType newADRolePrimaryTreeMenuList) {
		aDRolePrimaryTreeMenuList = newADRolePrimaryTreeMenuList;
	}

	/**
	 * Returns the value of '<em><b>aDTreeNodeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTreeNodeList</b></em>' feature
	 * @generated
	 */
	public ADTreeNodeListType getADTreeNodeList() {
		return aDTreeNodeList;
	}

	/**
	 * Sets the '{@link ADTreeType#getADTreeNodeList() <em>aDTreeNodeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getADTreeNodeList() aDTreeNodeList}' feature.
	 * @generated
	 */
	public void setADTreeNodeList(ADTreeNodeListType newADTreeNodeList) {
		aDTreeNodeList = newADTreeNodeList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryTreeMenuList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryTreeMenuList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryTreeMenuList() {
		return clientInformationPrimaryTreeMenuList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationPrimaryTreeMenuList() <em>clientInformationPrimaryTreeMenuList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationPrimaryTreeMenuList() clientInformationPrimaryTreeMenuList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryTreeMenuList(
			ReferenceType newClientInformationPrimaryTreeMenuList) {
		clientInformationPrimaryTreeMenuList = newClientInformationPrimaryTreeMenuList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryTreeOrganizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryTreeOrganizationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryTreeOrganizationList() {
		return clientInformationPrimaryTreeOrganizationList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationPrimaryTreeOrganizationList() <em>clientInformationPrimaryTreeOrganizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationPrimaryTreeOrganizationList() clientInformationPrimaryTreeOrganizationList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryTreeOrganizationList(
			ReferenceType newClientInformationPrimaryTreeOrganizationList) {
		clientInformationPrimaryTreeOrganizationList = newClientInformationPrimaryTreeOrganizationList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryTreeBPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryTreeBPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryTreeBPartnerList() {
		return clientInformationPrimaryTreeBPartnerList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationPrimaryTreeBPartnerList() <em>clientInformationPrimaryTreeBPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationPrimaryTreeBPartnerList() clientInformationPrimaryTreeBPartnerList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryTreeBPartnerList(
			ReferenceType newClientInformationPrimaryTreeBPartnerList) {
		clientInformationPrimaryTreeBPartnerList = newClientInformationPrimaryTreeBPartnerList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryTreeProjectList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryTreeProjectList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryTreeProjectList() {
		return clientInformationPrimaryTreeProjectList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationPrimaryTreeProjectList() <em>clientInformationPrimaryTreeProjectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationPrimaryTreeProjectList() clientInformationPrimaryTreeProjectList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryTreeProjectList(
			ReferenceType newClientInformationPrimaryTreeProjectList) {
		clientInformationPrimaryTreeProjectList = newClientInformationPrimaryTreeProjectList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryTreeSalesRegionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryTreeSalesRegionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryTreeSalesRegionList() {
		return clientInformationPrimaryTreeSalesRegionList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationPrimaryTreeSalesRegionList() <em>clientInformationPrimaryTreeSalesRegionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationPrimaryTreeSalesRegionList() clientInformationPrimaryTreeSalesRegionList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryTreeSalesRegionList(
			ReferenceType newClientInformationPrimaryTreeSalesRegionList) {
		clientInformationPrimaryTreeSalesRegionList = newClientInformationPrimaryTreeSalesRegionList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationPrimaryTreeProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationPrimaryTreeProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationPrimaryTreeProductList() {
		return clientInformationPrimaryTreeProductList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationPrimaryTreeProductList() <em>clientInformationPrimaryTreeProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationPrimaryTreeProductList() clientInformationPrimaryTreeProductList}' feature.
	 * @generated
	 */
	public void setClientInformationPrimaryTreeProductList(
			ReferenceType newClientInformationPrimaryTreeProductList) {
		clientInformationPrimaryTreeProductList = newClientInformationPrimaryTreeProductList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationADTreeCampaignIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationADTreeCampaignIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationADTreeCampaignIDList() {
		return clientInformationADTreeCampaignIDList;
	}

	/**
	 * Sets the '{@link ADTreeType#getClientInformationADTreeCampaignIDList() <em>clientInformationADTreeCampaignIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getClientInformationADTreeCampaignIDList() clientInformationADTreeCampaignIDList}' feature.
	 * @generated
	 */
	public void setClientInformationADTreeCampaignIDList(
			ReferenceType newClientInformationADTreeCampaignIDList) {
		clientInformationADTreeCampaignIDList = newClientInformationADTreeCampaignIDList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtElementList() {
		return financialMgmtElementList;
	}

	/**
	 * Sets the '{@link ADTreeType#getFinancialMgmtElementList() <em>financialMgmtElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getFinancialMgmtElementList() financialMgmtElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementList(
			ReferenceType newFinancialMgmtElementList) {
		financialMgmtElementList = newFinancialMgmtElementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementAdditionalTree2List</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementAdditionalTree2List</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtElementAdditionalTree2List() {
		return financialMgmtElementAdditionalTree2List;
	}

	/**
	 * Sets the '{@link ADTreeType#getFinancialMgmtElementAdditionalTree2List() <em>financialMgmtElementAdditionalTree2List</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getFinancialMgmtElementAdditionalTree2List() financialMgmtElementAdditionalTree2List}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementAdditionalTree2List(
			ReferenceType newFinancialMgmtElementAdditionalTree2List) {
		financialMgmtElementAdditionalTree2List = newFinancialMgmtElementAdditionalTree2List;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementAdditionalTree1List</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementAdditionalTree1List</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtElementAdditionalTree1List() {
		return financialMgmtElementAdditionalTree1List;
	}

	/**
	 * Sets the '{@link ADTreeType#getFinancialMgmtElementAdditionalTree1List() <em>financialMgmtElementAdditionalTree1List</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getFinancialMgmtElementAdditionalTree1List() financialMgmtElementAdditionalTree1List}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementAdditionalTree1List(
			ReferenceType newFinancialMgmtElementAdditionalTree1List) {
		financialMgmtElementAdditionalTree1List = newFinancialMgmtElementAdditionalTree1List;
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
	 * Sets the '{@link ADTreeType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getId1() id1}' feature.
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
	 * Sets the '{@link ADTreeType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADTreeType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#isReference() reference}' feature.
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
	public List<ADTreeTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADTreeType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADTreeType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADTreeTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADTreeType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
