package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>LocationType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class LocationType {

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
	private String addressLine1 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String addressLine2 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String cityName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String postalCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String postalAdd = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType country = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType region = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType city = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String regionName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinAccTransactionAcctVLocationFromAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinAccTransactionAcctVLocationToAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerLocationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingCombinationLocationFromAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingCombinationLocationToAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingFactLocationFromAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingFactLocationToAddressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaElementList = null;

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
	private ReferenceType organizationInformationList = null;

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
	private ReferenceType warehouseList = null;

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
	private List<LocationTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<LocationTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link LocationType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getId() id}' feature.
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
	 * Sets the '{@link LocationType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getClient() client}' feature.
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
	 * Sets the '{@link LocationType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getOrganization() organization}' feature.
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
	 * Sets the '{@link LocationType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getActive() active}' feature.
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
	 * Sets the '{@link LocationType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link LocationType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link LocationType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getUpdated() updated}' feature.
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
	 * Sets the '{@link LocationType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>addressLine1</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>addressLine1</b></em>' feature
	 * @generated
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * Sets the '{@link LocationType#getAddressLine1() <em>addressLine1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getAddressLine1() addressLine1}' feature.
	 * @generated
	 */
	public void setAddressLine1(String newAddressLine1) {
		addressLine1 = newAddressLine1;
	}

	/**
	 * Returns the value of '<em><b>addressLine2</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>addressLine2</b></em>' feature
	 * @generated
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * Sets the '{@link LocationType#getAddressLine2() <em>addressLine2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getAddressLine2() addressLine2}' feature.
	 * @generated
	 */
	public void setAddressLine2(String newAddressLine2) {
		addressLine2 = newAddressLine2;
	}

	/**
	 * Returns the value of '<em><b>cityName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cityName</b></em>' feature
	 * @generated
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * Sets the '{@link LocationType#getCityName() <em>cityName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getCityName() cityName}' feature.
	 * @generated
	 */
	public void setCityName(String newCityName) {
		cityName = newCityName;
	}

	/**
	 * Returns the value of '<em><b>postalCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postalCode</b></em>' feature
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Sets the '{@link LocationType#getPostalCode() <em>postalCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getPostalCode() postalCode}' feature.
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		postalCode = newPostalCode;
	}

	/**
	 * Returns the value of '<em><b>postalAdd</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postalAdd</b></em>' feature
	 * @generated
	 */
	public String getPostalAdd() {
		return postalAdd;
	}

	/**
	 * Sets the '{@link LocationType#getPostalAdd() <em>postalAdd</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getPostalAdd() postalAdd}' feature.
	 * @generated
	 */
	public void setPostalAdd(String newPostalAdd) {
		postalAdd = newPostalAdd;
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link LocationType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(ReferenceType newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of '<em><b>region</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>region</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRegion() {
		return region;
	}

	/**
	 * Sets the '{@link LocationType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(ReferenceType newRegion) {
		region = newRegion;
	}

	/**
	 * Returns the value of '<em><b>city</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>city</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCity() {
		return city;
	}

	/**
	 * Sets the '{@link LocationType#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(ReferenceType newCity) {
		city = newCity;
	}

	/**
	 * Returns the value of '<em><b>regionName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>regionName</b></em>' feature
	 * @generated
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * Sets the '{@link LocationType#getRegionName() <em>regionName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getRegionName() regionName}' feature.
	 * @generated
	 */
	public void setRegionName(String newRegionName) {
		regionName = newRegionName;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctVLocationFromAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctVLocationFromAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinAccTransactionAcctVLocationFromAddressList() {
		return aPRMFinAccTransactionAcctVLocationFromAddressList;
	}

	/**
	 * Sets the '{@link LocationType#getAPRMFinAccTransactionAcctVLocationFromAddressList() <em>aPRMFinAccTransactionAcctVLocationFromAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getAPRMFinAccTransactionAcctVLocationFromAddressList() aPRMFinAccTransactionAcctVLocationFromAddressList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVLocationFromAddressList(
			ReferenceType newAPRMFinAccTransactionAcctVLocationFromAddressList) {
		aPRMFinAccTransactionAcctVLocationFromAddressList = newAPRMFinAccTransactionAcctVLocationFromAddressList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctVLocationToAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctVLocationToAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinAccTransactionAcctVLocationToAddressList() {
		return aPRMFinAccTransactionAcctVLocationToAddressList;
	}

	/**
	 * Sets the '{@link LocationType#getAPRMFinAccTransactionAcctVLocationToAddressList() <em>aPRMFinAccTransactionAcctVLocationToAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getAPRMFinAccTransactionAcctVLocationToAddressList() aPRMFinAccTransactionAcctVLocationToAddressList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVLocationToAddressList(
			ReferenceType newAPRMFinAccTransactionAcctVLocationToAddressList) {
		aPRMFinAccTransactionAcctVLocationToAddressList = newAPRMFinAccTransactionAcctVLocationToAddressList;
	}

	/**
	 * Returns the value of '<em><b>bankList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankList() {
		return bankList;
	}

	/**
	 * Sets the '{@link LocationType#getBankList() <em>bankList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getBankList() bankList}' feature.
	 * @generated
	 */
	public void setBankList(ReferenceType newBankList) {
		bankList = newBankList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerLocationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerLocationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerLocationList() {
		return businessPartnerLocationList;
	}

	/**
	 * Sets the '{@link LocationType#getBusinessPartnerLocationList() <em>businessPartnerLocationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getBusinessPartnerLocationList() businessPartnerLocationList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerLocationList(
			ReferenceType newBusinessPartnerLocationList) {
		businessPartnerLocationList = newBusinessPartnerLocationList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountList() {
		return fINFinancialAccountList;
	}

	/**
	 * Sets the '{@link LocationType#getFINFinancialAccountList() <em>fINFinancialAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFINFinancialAccountList() fINFinancialAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountList(
			ReferenceType newFINFinancialAccountList) {
		fINFinancialAccountList = newFINFinancialAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombinationLocationFromAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombinationLocationFromAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingCombinationLocationFromAddressList() {
		return financialMgmtAccountingCombinationLocationFromAddressList;
	}

	/**
	 * Sets the '{@link LocationType#getFinancialMgmtAccountingCombinationLocationFromAddressList() <em>financialMgmtAccountingCombinationLocationFromAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFinancialMgmtAccountingCombinationLocationFromAddressList() financialMgmtAccountingCombinationLocationFromAddressList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombinationLocationFromAddressList(
			ReferenceType newFinancialMgmtAccountingCombinationLocationFromAddressList) {
		financialMgmtAccountingCombinationLocationFromAddressList = newFinancialMgmtAccountingCombinationLocationFromAddressList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombinationLocationToAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombinationLocationToAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingCombinationLocationToAddressList() {
		return financialMgmtAccountingCombinationLocationToAddressList;
	}

	/**
	 * Sets the '{@link LocationType#getFinancialMgmtAccountingCombinationLocationToAddressList() <em>financialMgmtAccountingCombinationLocationToAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFinancialMgmtAccountingCombinationLocationToAddressList() financialMgmtAccountingCombinationLocationToAddressList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombinationLocationToAddressList(
			ReferenceType newFinancialMgmtAccountingCombinationLocationToAddressList) {
		financialMgmtAccountingCombinationLocationToAddressList = newFinancialMgmtAccountingCombinationLocationToAddressList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFactLocationFromAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFactLocationFromAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingFactLocationFromAddressList() {
		return financialMgmtAccountingFactLocationFromAddressList;
	}

	/**
	 * Sets the '{@link LocationType#getFinancialMgmtAccountingFactLocationFromAddressList() <em>financialMgmtAccountingFactLocationFromAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFinancialMgmtAccountingFactLocationFromAddressList() financialMgmtAccountingFactLocationFromAddressList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactLocationFromAddressList(
			ReferenceType newFinancialMgmtAccountingFactLocationFromAddressList) {
		financialMgmtAccountingFactLocationFromAddressList = newFinancialMgmtAccountingFactLocationFromAddressList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFactLocationToAddressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFactLocationToAddressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingFactLocationToAddressList() {
		return financialMgmtAccountingFactLocationToAddressList;
	}

	/**
	 * Sets the '{@link LocationType#getFinancialMgmtAccountingFactLocationToAddressList() <em>financialMgmtAccountingFactLocationToAddressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFinancialMgmtAccountingFactLocationToAddressList() financialMgmtAccountingFactLocationToAddressList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactLocationToAddressList(
			ReferenceType newFinancialMgmtAccountingFactLocationToAddressList) {
		financialMgmtAccountingFactLocationToAddressList = newFinancialMgmtAccountingFactLocationToAddressList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaElementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaElementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaElementList() {
		return financialMgmtAcctSchemaElementList;
	}

	/**
	 * Sets the '{@link LocationType#getFinancialMgmtAcctSchemaElementList() <em>financialMgmtAcctSchemaElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFinancialMgmtAcctSchemaElementList() financialMgmtAcctSchemaElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElementList(
			ReferenceType newFinancialMgmtAcctSchemaElementList) {
		financialMgmtAcctSchemaElementList = newFinancialMgmtAcctSchemaElementList;
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
	 * Sets the '{@link LocationType#getFinancialMgmtAssetList() <em>financialMgmtAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getFinancialMgmtAssetList() financialMgmtAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetList(
			ReferenceType newFinancialMgmtAssetList) {
		financialMgmtAssetList = newFinancialMgmtAssetList;
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
	 * Sets the '{@link LocationType#getOrganizationInformationList() <em>organizationInformationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getOrganizationInformationList() organizationInformationList}' feature.
	 * @generated
	 */
	public void setOrganizationInformationList(
			ReferenceType newOrganizationInformationList) {
		organizationInformationList = newOrganizationInformationList;
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
	 * Sets the '{@link LocationType#getProjectList() <em>projectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getProjectList() projectList}' feature.
	 * @generated
	 */
	public void setProjectList(ReferenceType newProjectList) {
		projectList = newProjectList;
	}

	/**
	 * Returns the value of '<em><b>warehouseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouseList() {
		return warehouseList;
	}

	/**
	 * Sets the '{@link LocationType#getWarehouseList() <em>warehouseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getWarehouseList() warehouseList}' feature.
	 * @generated
	 */
	public void setWarehouseList(ReferenceType newWarehouseList) {
		warehouseList = newWarehouseList;
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
	 * Sets the '{@link LocationType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getId1() id1}' feature.
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
	 * Sets the '{@link LocationType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link LocationType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#isReference() reference}' feature.
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
	public List<LocationTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link LocationType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LocationType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<LocationTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "LocationType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
