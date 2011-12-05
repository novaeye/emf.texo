package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>CountryType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class CountryType {

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
	private String iSOCountryCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean hasRegions = null;

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
	private String phoneNoFormat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String addressPrintFormat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String postalCodeFormat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean additionalPostalCode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String additionalPostalFormat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean default_ = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType language = null;

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
	private Long iBANLength = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String iBANCode = null;

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
	private ReferenceType businessPartnerBankAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType cityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CountryTrlListType countryTrlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateDestinationCountryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxZoneFromCountryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxZoneDestinationCountryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType locationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RegionListType regionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType shippingShippingCompanyFreightList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType shippingShippingCompanyFreightDestinationCountryList = null;

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
	private List<CountryTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<CountryTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link CountryType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getId() id}' feature.
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
	 * Sets the '{@link CountryType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getClient() client}' feature.
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
	 * Sets the '{@link CountryType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getOrganization() organization}' feature.
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
	 * Sets the '{@link CountryType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getActive() active}' feature.
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
	 * Sets the '{@link CountryType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link CountryType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link CountryType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getUpdated() updated}' feature.
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
	 * Sets the '{@link CountryType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link CountryType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getName() name}' feature.
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
	 * Sets the '{@link CountryType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>iSOCountryCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iSOCountryCode</b></em>' feature
	 * @generated
	 */
	public String getISOCountryCode() {
		return iSOCountryCode;
	}

	/**
	 * Sets the '{@link CountryType#getISOCountryCode() <em>iSOCountryCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getISOCountryCode() iSOCountryCode}' feature.
	 * @generated
	 */
	public void setISOCountryCode(String newISOCountryCode) {
		iSOCountryCode = newISOCountryCode;
	}

	/**
	 * Returns the value of '<em><b>hasRegions</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>hasRegions</b></em>' feature
	 * @generated
	 */
	public Boolean getHasRegions() {
		return hasRegions;
	}

	/**
	 * Sets the '{@link CountryType#getHasRegions() <em>hasRegions</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getHasRegions() hasRegions}' feature.
	 * @generated
	 */
	public void setHasRegions(Boolean newHasRegions) {
		hasRegions = newHasRegions;
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
	 * Sets the '{@link CountryType#getRegionName() <em>regionName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getRegionName() regionName}' feature.
	 * @generated
	 */
	public void setRegionName(String newRegionName) {
		regionName = newRegionName;
	}

	/**
	 * Returns the value of '<em><b>phoneNoFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>phoneNoFormat</b></em>' feature
	 * @generated
	 */
	public String getPhoneNoFormat() {
		return phoneNoFormat;
	}

	/**
	 * Sets the '{@link CountryType#getPhoneNoFormat() <em>phoneNoFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getPhoneNoFormat() phoneNoFormat}' feature.
	 * @generated
	 */
	public void setPhoneNoFormat(String newPhoneNoFormat) {
		phoneNoFormat = newPhoneNoFormat;
	}

	/**
	 * Returns the value of '<em><b>addressPrintFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>addressPrintFormat</b></em>' feature
	 * @generated
	 */
	public String getAddressPrintFormat() {
		return addressPrintFormat;
	}

	/**
	 * Sets the '{@link CountryType#getAddressPrintFormat() <em>addressPrintFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getAddressPrintFormat() addressPrintFormat}' feature.
	 * @generated
	 */
	public void setAddressPrintFormat(String newAddressPrintFormat) {
		addressPrintFormat = newAddressPrintFormat;
	}

	/**
	 * Returns the value of '<em><b>postalCodeFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>postalCodeFormat</b></em>' feature
	 * @generated
	 */
	public String getPostalCodeFormat() {
		return postalCodeFormat;
	}

	/**
	 * Sets the '{@link CountryType#getPostalCodeFormat() <em>postalCodeFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getPostalCodeFormat() postalCodeFormat}' feature.
	 * @generated
	 */
	public void setPostalCodeFormat(String newPostalCodeFormat) {
		postalCodeFormat = newPostalCodeFormat;
	}

	/**
	 * Returns the value of '<em><b>additionalPostalCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>additionalPostalCode</b></em>' feature
	 * @generated
	 */
	public Boolean getAdditionalPostalCode() {
		return additionalPostalCode;
	}

	/**
	 * Sets the '{@link CountryType#getAdditionalPostalCode() <em>additionalPostalCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getAdditionalPostalCode() additionalPostalCode}' feature.
	 * @generated
	 */
	public void setAdditionalPostalCode(Boolean newAdditionalPostalCode) {
		additionalPostalCode = newAdditionalPostalCode;
	}

	/**
	 * Returns the value of '<em><b>additionalPostalFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>additionalPostalFormat</b></em>' feature
	 * @generated
	 */
	public String getAdditionalPostalFormat() {
		return additionalPostalFormat;
	}

	/**
	 * Sets the '{@link CountryType#getAdditionalPostalFormat() <em>additionalPostalFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getAdditionalPostalFormat() additionalPostalFormat}' feature.
	 * @generated
	 */
	public void setAdditionalPostalFormat(String newAdditionalPostalFormat) {
		additionalPostalFormat = newAdditionalPostalFormat;
	}

	/**
	 * Returns the value of '<em><b>default</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>default</b></em>' feature
	 * @generated
	 */
	public Boolean getDefault() {
		return default_;
	}

	/**
	 * Sets the '{@link CountryType#getDefault() <em>default</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getDefault() default}' feature.
	 * @generated
	 */
	public void setDefault(Boolean newDefault_) {
		default_ = newDefault_;
	}

	/**
	 * Returns the value of '<em><b>language</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>language</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLanguage() {
		return language;
	}

	/**
	 * Sets the '{@link CountryType#getLanguage() <em>language</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getLanguage() language}' feature.
	 * @generated
	 */
	public void setLanguage(ReferenceType newLanguage) {
		language = newLanguage;
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
	 * Sets the '{@link CountryType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>iBANLength</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iBANLength</b></em>' feature
	 * @generated
	 */
	public Long getIBANLength() {
		return iBANLength;
	}

	/**
	 * Sets the '{@link CountryType#getIBANLength() <em>iBANLength</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getIBANLength() iBANLength}' feature.
	 * @generated
	 */
	public void setIBANLength(Long newIBANLength) {
		iBANLength = newIBANLength;
	}

	/**
	 * Returns the value of '<em><b>iBANCode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>iBANCode</b></em>' feature
	 * @generated
	 */
	public String getIBANCode() {
		return iBANCode;
	}

	/**
	 * Sets the '{@link CountryType#getIBANCode() <em>iBANCode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getIBANCode() iBANCode}' feature.
	 * @generated
	 */
	public void setIBANCode(String newIBANCode) {
		iBANCode = newIBANCode;
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
	 * Sets the '{@link CountryType#getBankList() <em>bankList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getBankList() bankList}' feature.
	 * @generated
	 */
	public void setBankList(ReferenceType newBankList) {
		bankList = newBankList;
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
	 * Sets the '{@link CountryType#getBusinessPartnerBankAccountList() <em>businessPartnerBankAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getBusinessPartnerBankAccountList() businessPartnerBankAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccountList(
			ReferenceType newBusinessPartnerBankAccountList) {
		businessPartnerBankAccountList = newBusinessPartnerBankAccountList;
	}

	/**
	 * Returns the value of '<em><b>cityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCityList() {
		return cityList;
	}

	/**
	 * Sets the '{@link CountryType#getCityList() <em>cityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getCityList() cityList}' feature.
	 * @generated
	 */
	public void setCityList(ReferenceType newCityList) {
		cityList = newCityList;
	}

	/**
	 * Returns the value of '<em><b>countryTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>countryTrlList</b></em>' feature
	 * @generated
	 */
	public CountryTrlListType getCountryTrlList() {
		return countryTrlList;
	}

	/**
	 * Sets the '{@link CountryType#getCountryTrlList() <em>countryTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getCountryTrlList() countryTrlList}' feature.
	 * @generated
	 */
	public void setCountryTrlList(CountryTrlListType newCountryTrlList) {
		countryTrlList = newCountryTrlList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateList() {
		return financialMgmtTaxRateList;
	}

	/**
	 * Sets the '{@link CountryType#getFinancialMgmtTaxRateList() <em>financialMgmtTaxRateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getFinancialMgmtTaxRateList() financialMgmtTaxRateList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateList(
			ReferenceType newFinancialMgmtTaxRateList) {
		financialMgmtTaxRateList = newFinancialMgmtTaxRateList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateDestinationCountryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateDestinationCountryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateDestinationCountryList() {
		return financialMgmtTaxRateDestinationCountryList;
	}

	/**
	 * Sets the '{@link CountryType#getFinancialMgmtTaxRateDestinationCountryList() <em>financialMgmtTaxRateDestinationCountryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getFinancialMgmtTaxRateDestinationCountryList() financialMgmtTaxRateDestinationCountryList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateDestinationCountryList(
			ReferenceType newFinancialMgmtTaxRateDestinationCountryList) {
		financialMgmtTaxRateDestinationCountryList = newFinancialMgmtTaxRateDestinationCountryList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxZoneFromCountryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxZoneFromCountryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxZoneFromCountryList() {
		return financialMgmtTaxZoneFromCountryList;
	}

	/**
	 * Sets the '{@link CountryType#getFinancialMgmtTaxZoneFromCountryList() <em>financialMgmtTaxZoneFromCountryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getFinancialMgmtTaxZoneFromCountryList() financialMgmtTaxZoneFromCountryList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZoneFromCountryList(
			ReferenceType newFinancialMgmtTaxZoneFromCountryList) {
		financialMgmtTaxZoneFromCountryList = newFinancialMgmtTaxZoneFromCountryList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxZoneDestinationCountryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxZoneDestinationCountryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxZoneDestinationCountryList() {
		return financialMgmtTaxZoneDestinationCountryList;
	}

	/**
	 * Sets the '{@link CountryType#getFinancialMgmtTaxZoneDestinationCountryList() <em>financialMgmtTaxZoneDestinationCountryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getFinancialMgmtTaxZoneDestinationCountryList() financialMgmtTaxZoneDestinationCountryList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZoneDestinationCountryList(
			ReferenceType newFinancialMgmtTaxZoneDestinationCountryList) {
		financialMgmtTaxZoneDestinationCountryList = newFinancialMgmtTaxZoneDestinationCountryList;
	}

	/**
	 * Returns the value of '<em><b>locationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationList() {
		return locationList;
	}

	/**
	 * Sets the '{@link CountryType#getLocationList() <em>locationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getLocationList() locationList}' feature.
	 * @generated
	 */
	public void setLocationList(ReferenceType newLocationList) {
		locationList = newLocationList;
	}

	/**
	 * Returns the value of '<em><b>regionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>regionList</b></em>' feature
	 * @generated
	 */
	public RegionListType getRegionList() {
		return regionList;
	}

	/**
	 * Sets the '{@link CountryType#getRegionList() <em>regionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getRegionList() regionList}' feature.
	 * @generated
	 */
	public void setRegionList(RegionListType newRegionList) {
		regionList = newRegionList;
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyFreightList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyFreightList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getShippingShippingCompanyFreightList() {
		return shippingShippingCompanyFreightList;
	}

	/**
	 * Sets the '{@link CountryType#getShippingShippingCompanyFreightList() <em>shippingShippingCompanyFreightList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getShippingShippingCompanyFreightList() shippingShippingCompanyFreightList}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyFreightList(
			ReferenceType newShippingShippingCompanyFreightList) {
		shippingShippingCompanyFreightList = newShippingShippingCompanyFreightList;
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyFreightDestinationCountryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyFreightDestinationCountryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getShippingShippingCompanyFreightDestinationCountryList() {
		return shippingShippingCompanyFreightDestinationCountryList;
	}

	/**
	 * Sets the '{@link CountryType#getShippingShippingCompanyFreightDestinationCountryList() <em>shippingShippingCompanyFreightDestinationCountryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getShippingShippingCompanyFreightDestinationCountryList() shippingShippingCompanyFreightDestinationCountryList}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyFreightDestinationCountryList(
			ReferenceType newShippingShippingCompanyFreightDestinationCountryList) {
		shippingShippingCompanyFreightDestinationCountryList = newShippingShippingCompanyFreightDestinationCountryList;
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
	 * Sets the '{@link CountryType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getId1() id1}' feature.
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
	 * Sets the '{@link CountryType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link CountryType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#isReference() reference}' feature.
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
	public List<CountryTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link CountryType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link CountryType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<CountryTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "CountryType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
