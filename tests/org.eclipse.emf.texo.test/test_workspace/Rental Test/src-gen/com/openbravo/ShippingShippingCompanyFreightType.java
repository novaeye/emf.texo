package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ShippingShippingCompanyFreightType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ShippingShippingCompanyFreightType {

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
	private ReferenceType shippingCompany = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType freightCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime validFromDate = null;

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
	private ReferenceType destinationCountry = null;

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
	private ReferenceType destinationRegion = null;

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
	private Decimal freightAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String freightUOM = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean price = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String roundLine = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal minQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal maxQuanity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String roundTotal = null;

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
	private List<ShippingShippingCompanyFreightTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ShippingShippingCompanyFreightTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getId() id}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getClient() client}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getActive() active}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>shippingCompany</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingCompany</b></em>' feature
	 * @generated
	 */
	public ReferenceType getShippingCompany() {
		return shippingCompany;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getShippingCompany() <em>shippingCompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getShippingCompany() shippingCompany}' feature.
	 * @generated
	 */
	public void setShippingCompany(ReferenceType newShippingCompany) {
		shippingCompany = newShippingCompany;
	}

	/**
	 * Returns the value of '<em><b>freightCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFreightCategory() {
		return freightCategory;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getFreightCategory() <em>freightCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getFreightCategory() freightCategory}' feature.
	 * @generated
	 */
	public void setFreightCategory(ReferenceType newFreightCategory) {
		freightCategory = newFreightCategory;
	}

	/**
	 * Returns the value of '<em><b>validFromDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>validFromDate</b></em>' feature
	 * @generated
	 */
	public DateTime getValidFromDate() {
		return validFromDate;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getValidFromDate() <em>validFromDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getValidFromDate() validFromDate}' feature.
	 * @generated
	 */
	public void setValidFromDate(DateTime newValidFromDate) {
		validFromDate = newValidFromDate;
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(ReferenceType newCountry) {
		country = newCountry;
	}

	/**
	 * Returns the value of '<em><b>destinationCountry</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>destinationCountry</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDestinationCountry() {
		return destinationCountry;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getDestinationCountry() <em>destinationCountry</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getDestinationCountry() destinationCountry}' feature.
	 * @generated
	 */
	public void setDestinationCountry(ReferenceType newDestinationCountry) {
		destinationCountry = newDestinationCountry;
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(ReferenceType newRegion) {
		region = newRegion;
	}

	/**
	 * Returns the value of '<em><b>destinationRegion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>destinationRegion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getDestinationRegion() {
		return destinationRegion;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getDestinationRegion() <em>destinationRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getDestinationRegion() destinationRegion}' feature.
	 * @generated
	 */
	public void setDestinationRegion(ReferenceType newDestinationRegion) {
		destinationRegion = newDestinationRegion;
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>freightAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getFreightAmount() {
		return freightAmount;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getFreightAmount() <em>freightAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getFreightAmount() freightAmount}' feature.
	 * @generated
	 */
	public void setFreightAmount(Decimal newFreightAmount) {
		freightAmount = newFreightAmount;
	}

	/**
	 * Returns the value of '<em><b>freightUOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>freightUOM</b></em>' feature
	 * @generated
	 */
	public String getFreightUOM() {
		return freightUOM;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getFreightUOM() <em>freightUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getFreightUOM() freightUOM}' feature.
	 * @generated
	 */
	public void setFreightUOM(String newFreightUOM) {
		freightUOM = newFreightUOM;
	}

	/**
	 * Returns the value of '<em><b>price</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>price</b></em>' feature
	 * @generated
	 */
	public Boolean getPrice() {
		return price;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getPrice() <em>price</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getPrice() price}' feature.
	 * @generated
	 */
	public void setPrice(Boolean newPrice) {
		price = newPrice;
	}

	/**
	 * Returns the value of '<em><b>roundLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>roundLine</b></em>' feature
	 * @generated
	 */
	public String getRoundLine() {
		return roundLine;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getRoundLine() <em>roundLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getRoundLine() roundLine}' feature.
	 * @generated
	 */
	public void setRoundLine(String newRoundLine) {
		roundLine = newRoundLine;
	}

	/**
	 * Returns the value of '<em><b>minQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>minQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getMinQuantity() {
		return minQuantity;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getMinQuantity() <em>minQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getMinQuantity() minQuantity}' feature.
	 * @generated
	 */
	public void setMinQuantity(Decimal newMinQuantity) {
		minQuantity = newMinQuantity;
	}

	/**
	 * Returns the value of '<em><b>maxQuanity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maxQuanity</b></em>' feature
	 * @generated
	 */
	public Decimal getMaxQuanity() {
		return maxQuanity;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getMaxQuanity() <em>maxQuanity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getMaxQuanity() maxQuanity}' feature.
	 * @generated
	 */
	public void setMaxQuanity(Decimal newMaxQuanity) {
		maxQuanity = newMaxQuanity;
	}

	/**
	 * Returns the value of '<em><b>roundTotal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>roundTotal</b></em>' feature
	 * @generated
	 */
	public String getRoundTotal() {
		return roundTotal;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getRoundTotal() <em>roundTotal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getRoundTotal() roundTotal}' feature.
	 * @generated
	 */
	public void setRoundTotal(String newRoundTotal) {
		roundTotal = newRoundTotal;
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getId1() id1}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ShippingShippingCompanyFreightType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#isReference() reference}' feature.
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
	public List<ShippingShippingCompanyFreightTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ShippingShippingCompanyFreightType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ShippingShippingCompanyFreightType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ShippingShippingCompanyFreightTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ShippingShippingCompanyFreightType " + " [id1: " + getId1()
				+ "]" + " [identifier: " + getIdentifier() + "]"
				+ " [reference: " + isReference() + "]";
	}
}
