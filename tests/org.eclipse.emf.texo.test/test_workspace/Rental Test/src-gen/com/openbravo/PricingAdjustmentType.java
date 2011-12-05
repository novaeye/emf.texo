package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PricingAdjustmentType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class PricingAdjustmentType {

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
	private Long priority = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal discountAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal discount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal fixedPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime startingDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime endingDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String includedBusinessPartners = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String includedBPCategories = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String includedProducts = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String includedProductCategories = null;

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
	private String includePriceLists = null;

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
	private Decimal maxQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineOfferList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderLineOfferList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentBusinessPartnerListType pricingAdjustmentBusinessPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentBusinessPartnerGroupListType pricingAdjustmentBusinessPartnerGroupList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentPriceListListType pricingAdjustmentPriceListList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentProductListType pricingAdjustmentProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentProductCategoryListType pricingAdjustmentProductCategoryList = null;

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
	private List<PricingAdjustmentTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<PricingAdjustmentTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link PricingAdjustmentType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getId() id}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getClient() client}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getOrganization() organization}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getActive() active}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getUpdated() updated}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>priority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priority</b></em>' feature
	 * @generated
	 */
	public Long getPriority() {
		return priority;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getPriority() <em>priority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getPriority() priority}' feature.
	 * @generated
	 */
	public void setPriority(Long newPriority) {
		priority = newPriority;
	}

	/**
	 * Returns the value of '<em><b>discountAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>discountAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getDiscountAmount() {
		return discountAmount;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getDiscountAmount() <em>discountAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getDiscountAmount() discountAmount}' feature.
	 * @generated
	 */
	public void setDiscountAmount(Decimal newDiscountAmount) {
		discountAmount = newDiscountAmount;
	}

	/**
	 * Returns the value of '<em><b>discount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>discount</b></em>' feature
	 * @generated
	 */
	public Decimal getDiscount() {
		return discount;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getDiscount() <em>discount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getDiscount() discount}' feature.
	 * @generated
	 */
	public void setDiscount(Decimal newDiscount) {
		discount = newDiscount;
	}

	/**
	 * Returns the value of '<em><b>fixedPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fixedPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getFixedPrice() {
		return fixedPrice;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getFixedPrice() <em>fixedPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getFixedPrice() fixedPrice}' feature.
	 * @generated
	 */
	public void setFixedPrice(Decimal newFixedPrice) {
		fixedPrice = newFixedPrice;
	}

	/**
	 * Returns the value of '<em><b>startingDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>startingDate</b></em>' feature
	 * @generated
	 */
	public DateTime getStartingDate() {
		return startingDate;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getStartingDate() <em>startingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getStartingDate() startingDate}' feature.
	 * @generated
	 */
	public void setStartingDate(DateTime newStartingDate) {
		startingDate = newStartingDate;
	}

	/**
	 * Returns the value of '<em><b>endingDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>endingDate</b></em>' feature
	 * @generated
	 */
	public DateTime getEndingDate() {
		return endingDate;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getEndingDate() <em>endingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getEndingDate() endingDate}' feature.
	 * @generated
	 */
	public void setEndingDate(DateTime newEndingDate) {
		endingDate = newEndingDate;
	}

	/**
	 * Returns the value of '<em><b>includedBusinessPartners</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>includedBusinessPartners</b></em>' feature
	 * @generated
	 */
	public String getIncludedBusinessPartners() {
		return includedBusinessPartners;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getIncludedBusinessPartners() <em>includedBusinessPartners</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getIncludedBusinessPartners() includedBusinessPartners}' feature.
	 * @generated
	 */
	public void setIncludedBusinessPartners(String newIncludedBusinessPartners) {
		includedBusinessPartners = newIncludedBusinessPartners;
	}

	/**
	 * Returns the value of '<em><b>includedBPCategories</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>includedBPCategories</b></em>' feature
	 * @generated
	 */
	public String getIncludedBPCategories() {
		return includedBPCategories;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getIncludedBPCategories() <em>includedBPCategories</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getIncludedBPCategories() includedBPCategories}' feature.
	 * @generated
	 */
	public void setIncludedBPCategories(String newIncludedBPCategories) {
		includedBPCategories = newIncludedBPCategories;
	}

	/**
	 * Returns the value of '<em><b>includedProducts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>includedProducts</b></em>' feature
	 * @generated
	 */
	public String getIncludedProducts() {
		return includedProducts;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getIncludedProducts() <em>includedProducts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getIncludedProducts() includedProducts}' feature.
	 * @generated
	 */
	public void setIncludedProducts(String newIncludedProducts) {
		includedProducts = newIncludedProducts;
	}

	/**
	 * Returns the value of '<em><b>includedProductCategories</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>includedProductCategories</b></em>' feature
	 * @generated
	 */
	public String getIncludedProductCategories() {
		return includedProductCategories;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getIncludedProductCategories() <em>includedProductCategories</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getIncludedProductCategories() includedProductCategories}' feature.
	 * @generated
	 */
	public void setIncludedProductCategories(String newIncludedProductCategories) {
		includedProductCategories = newIncludedProductCategories;
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
	 * Sets the '{@link PricingAdjustmentType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>includePriceLists</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>includePriceLists</b></em>' feature
	 * @generated
	 */
	public String getIncludePriceLists() {
		return includePriceLists;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getIncludePriceLists() <em>includePriceLists</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getIncludePriceLists() includePriceLists}' feature.
	 * @generated
	 */
	public void setIncludePriceLists(String newIncludePriceLists) {
		includePriceLists = newIncludePriceLists;
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
	 * Sets the '{@link PricingAdjustmentType#getMinQuantity() <em>minQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getMinQuantity() minQuantity}' feature.
	 * @generated
	 */
	public void setMinQuantity(Decimal newMinQuantity) {
		minQuantity = newMinQuantity;
	}

	/**
	 * Returns the value of '<em><b>maxQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maxQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getMaxQuantity() {
		return maxQuantity;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getMaxQuantity() <em>maxQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getMaxQuantity() maxQuantity}' feature.
	 * @generated
	 */
	public void setMaxQuantity(Decimal newMaxQuantity) {
		maxQuantity = newMaxQuantity;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineList() {
		return invoiceLineList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getInvoiceLineList() <em>invoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getInvoiceLineList() invoiceLineList}' feature.
	 * @generated
	 */
	public void setInvoiceLineList(ReferenceType newInvoiceLineList) {
		invoiceLineList = newInvoiceLineList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineOfferList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineOfferList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineOfferList() {
		return invoiceLineOfferList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getInvoiceLineOfferList() <em>invoiceLineOfferList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getInvoiceLineOfferList() invoiceLineOfferList}' feature.
	 * @generated
	 */
	public void setInvoiceLineOfferList(ReferenceType newInvoiceLineOfferList) {
		invoiceLineOfferList = newInvoiceLineOfferList;
	}

	/**
	 * Returns the value of '<em><b>orderLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderLineList() {
		return orderLineList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>orderLineOfferList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineOfferList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderLineOfferList() {
		return orderLineOfferList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getOrderLineOfferList() <em>orderLineOfferList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getOrderLineOfferList() orderLineOfferList}' feature.
	 * @generated
	 */
	public void setOrderLineOfferList(ReferenceType newOrderLineOfferList) {
		orderLineOfferList = newOrderLineOfferList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartnerList</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentBusinessPartnerListType getPricingAdjustmentBusinessPartnerList() {
		return pricingAdjustmentBusinessPartnerList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getPricingAdjustmentBusinessPartnerList() <em>pricingAdjustmentBusinessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getPricingAdjustmentBusinessPartnerList() pricingAdjustmentBusinessPartnerList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartnerList(
			PricingAdjustmentBusinessPartnerListType newPricingAdjustmentBusinessPartnerList) {
		pricingAdjustmentBusinessPartnerList = newPricingAdjustmentBusinessPartnerList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartnerGroupList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartnerGroupList</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentBusinessPartnerGroupListType getPricingAdjustmentBusinessPartnerGroupList() {
		return pricingAdjustmentBusinessPartnerGroupList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getPricingAdjustmentBusinessPartnerGroupList() <em>pricingAdjustmentBusinessPartnerGroupList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getPricingAdjustmentBusinessPartnerGroupList() pricingAdjustmentBusinessPartnerGroupList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartnerGroupList(
			PricingAdjustmentBusinessPartnerGroupListType newPricingAdjustmentBusinessPartnerGroupList) {
		pricingAdjustmentBusinessPartnerGroupList = newPricingAdjustmentBusinessPartnerGroupList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentPriceListList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentPriceListList</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentPriceListListType getPricingAdjustmentPriceListList() {
		return pricingAdjustmentPriceListList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getPricingAdjustmentPriceListList() <em>pricingAdjustmentPriceListList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getPricingAdjustmentPriceListList() pricingAdjustmentPriceListList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentPriceListList(
			PricingAdjustmentPriceListListType newPricingAdjustmentPriceListList) {
		pricingAdjustmentPriceListList = newPricingAdjustmentPriceListList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProductList</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentProductListType getPricingAdjustmentProductList() {
		return pricingAdjustmentProductList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getPricingAdjustmentProductList() <em>pricingAdjustmentProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getPricingAdjustmentProductList() pricingAdjustmentProductList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProductList(
			PricingAdjustmentProductListType newPricingAdjustmentProductList) {
		pricingAdjustmentProductList = newPricingAdjustmentProductList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProductCategoryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProductCategoryList</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentProductCategoryListType getPricingAdjustmentProductCategoryList() {
		return pricingAdjustmentProductCategoryList;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getPricingAdjustmentProductCategoryList() <em>pricingAdjustmentProductCategoryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getPricingAdjustmentProductCategoryList() pricingAdjustmentProductCategoryList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProductCategoryList(
			PricingAdjustmentProductCategoryListType newPricingAdjustmentProductCategoryList) {
		pricingAdjustmentProductCategoryList = newPricingAdjustmentProductCategoryList;
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
	 * Sets the '{@link PricingAdjustmentType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getId1() id1}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link PricingAdjustmentType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#isReference() reference}' feature.
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
	public List<PricingAdjustmentTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link PricingAdjustmentType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PricingAdjustmentType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<PricingAdjustmentTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "PricingAdjustmentType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
