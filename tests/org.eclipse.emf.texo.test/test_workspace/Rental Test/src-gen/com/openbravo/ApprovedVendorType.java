package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ApprovedVendorType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ApprovedVendorType {

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
	private ReferenceType product = null;

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
	private Boolean currentVendor = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType uOM = null;

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
	private Decimal listPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal purchaseOrderPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime priceEffectiveFrom = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal lastPurchasePrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal lastInvoicePrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String vendorProductNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uPCEAN = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String vendorCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean discontinued = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime discontinuedBy = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal minimumOrderQty = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal quantityPerPackage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal fixedCostPerOrder = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long purchasingLeadTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long actualDeliveryDays = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long qualityRating = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal royaltyAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String manufacturer = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal capacity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal standardQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String quantityType = null;

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
	private List<ApprovedVendorTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ApprovedVendorTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ApprovedVendorType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>product</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>product</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProduct() {
		return product;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
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
	 * Sets the '{@link ApprovedVendorType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
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
	 * Sets the '{@link ApprovedVendorType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getClient() client}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getActive() active}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>currentVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currentVendor</b></em>' feature
	 * @generated
	 */
	public Boolean getCurrentVendor() {
		return currentVendor;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getCurrentVendor() <em>currentVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getCurrentVendor() currentVendor}' feature.
	 * @generated
	 */
	public void setCurrentVendor(Boolean newCurrentVendor) {
		currentVendor = newCurrentVendor;
	}

	/**
	 * Returns the value of '<em><b>uOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOM</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUOM() {
		return uOM;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ReferenceType newUOM) {
		uOM = newUOM;
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
	 * Sets the '{@link ApprovedVendorType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>listPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>listPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getListPrice() {
		return listPrice;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getListPrice() <em>listPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getListPrice() listPrice}' feature.
	 * @generated
	 */
	public void setListPrice(Decimal newListPrice) {
		listPrice = newListPrice;
	}

	/**
	 * Returns the value of '<em><b>purchaseOrderPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>purchaseOrderPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getPurchaseOrderPrice() {
		return purchaseOrderPrice;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getPurchaseOrderPrice() <em>purchaseOrderPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getPurchaseOrderPrice() purchaseOrderPrice}' feature.
	 * @generated
	 */
	public void setPurchaseOrderPrice(Decimal newPurchaseOrderPrice) {
		purchaseOrderPrice = newPurchaseOrderPrice;
	}

	/**
	 * Returns the value of '<em><b>priceEffectiveFrom</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceEffectiveFrom</b></em>' feature
	 * @generated
	 */
	public DateTime getPriceEffectiveFrom() {
		return priceEffectiveFrom;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getPriceEffectiveFrom() <em>priceEffectiveFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getPriceEffectiveFrom() priceEffectiveFrom}' feature.
	 * @generated
	 */
	public void setPriceEffectiveFrom(DateTime newPriceEffectiveFrom) {
		priceEffectiveFrom = newPriceEffectiveFrom;
	}

	/**
	 * Returns the value of '<em><b>lastPurchasePrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastPurchasePrice</b></em>' feature
	 * @generated
	 */
	public Decimal getLastPurchasePrice() {
		return lastPurchasePrice;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getLastPurchasePrice() <em>lastPurchasePrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getLastPurchasePrice() lastPurchasePrice}' feature.
	 * @generated
	 */
	public void setLastPurchasePrice(Decimal newLastPurchasePrice) {
		lastPurchasePrice = newLastPurchasePrice;
	}

	/**
	 * Returns the value of '<em><b>lastInvoicePrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastInvoicePrice</b></em>' feature
	 * @generated
	 */
	public Decimal getLastInvoicePrice() {
		return lastInvoicePrice;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getLastInvoicePrice() <em>lastInvoicePrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getLastInvoicePrice() lastInvoicePrice}' feature.
	 * @generated
	 */
	public void setLastInvoicePrice(Decimal newLastInvoicePrice) {
		lastInvoicePrice = newLastInvoicePrice;
	}

	/**
	 * Returns the value of '<em><b>vendorProductNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorProductNo</b></em>' feature
	 * @generated
	 */
	public String getVendorProductNo() {
		return vendorProductNo;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getVendorProductNo() <em>vendorProductNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getVendorProductNo() vendorProductNo}' feature.
	 * @generated
	 */
	public void setVendorProductNo(String newVendorProductNo) {
		vendorProductNo = newVendorProductNo;
	}

	/**
	 * Returns the value of '<em><b>uPCEAN</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uPCEAN</b></em>' feature
	 * @generated
	 */
	public String getUPCEAN() {
		return uPCEAN;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getUPCEAN() <em>uPCEAN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getUPCEAN() uPCEAN}' feature.
	 * @generated
	 */
	public void setUPCEAN(String newUPCEAN) {
		uPCEAN = newUPCEAN;
	}

	/**
	 * Returns the value of '<em><b>vendorCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorCategory</b></em>' feature
	 * @generated
	 */
	public String getVendorCategory() {
		return vendorCategory;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getVendorCategory() <em>vendorCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getVendorCategory() vendorCategory}' feature.
	 * @generated
	 */
	public void setVendorCategory(String newVendorCategory) {
		vendorCategory = newVendorCategory;
	}

	/**
	 * Returns the value of '<em><b>discontinued</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>discontinued</b></em>' feature
	 * @generated
	 */
	public Boolean getDiscontinued() {
		return discontinued;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getDiscontinued() <em>discontinued</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getDiscontinued() discontinued}' feature.
	 * @generated
	 */
	public void setDiscontinued(Boolean newDiscontinued) {
		discontinued = newDiscontinued;
	}

	/**
	 * Returns the value of '<em><b>discontinuedBy</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>discontinuedBy</b></em>' feature
	 * @generated
	 */
	public DateTime getDiscontinuedBy() {
		return discontinuedBy;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getDiscontinuedBy() <em>discontinuedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getDiscontinuedBy() discontinuedBy}' feature.
	 * @generated
	 */
	public void setDiscontinuedBy(DateTime newDiscontinuedBy) {
		discontinuedBy = newDiscontinuedBy;
	}

	/**
	 * Returns the value of '<em><b>minimumOrderQty</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>minimumOrderQty</b></em>' feature
	 * @generated
	 */
	public Decimal getMinimumOrderQty() {
		return minimumOrderQty;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getMinimumOrderQty() <em>minimumOrderQty</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getMinimumOrderQty() minimumOrderQty}' feature.
	 * @generated
	 */
	public void setMinimumOrderQty(Decimal newMinimumOrderQty) {
		minimumOrderQty = newMinimumOrderQty;
	}

	/**
	 * Returns the value of '<em><b>quantityPerPackage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>quantityPerPackage</b></em>' feature
	 * @generated
	 */
	public Decimal getQuantityPerPackage() {
		return quantityPerPackage;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getQuantityPerPackage() <em>quantityPerPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getQuantityPerPackage() quantityPerPackage}' feature.
	 * @generated
	 */
	public void setQuantityPerPackage(Decimal newQuantityPerPackage) {
		quantityPerPackage = newQuantityPerPackage;
	}

	/**
	 * Returns the value of '<em><b>fixedCostPerOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fixedCostPerOrder</b></em>' feature
	 * @generated
	 */
	public Decimal getFixedCostPerOrder() {
		return fixedCostPerOrder;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getFixedCostPerOrder() <em>fixedCostPerOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getFixedCostPerOrder() fixedCostPerOrder}' feature.
	 * @generated
	 */
	public void setFixedCostPerOrder(Decimal newFixedCostPerOrder) {
		fixedCostPerOrder = newFixedCostPerOrder;
	}

	/**
	 * Returns the value of '<em><b>purchasingLeadTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>purchasingLeadTime</b></em>' feature
	 * @generated
	 */
	public Long getPurchasingLeadTime() {
		return purchasingLeadTime;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getPurchasingLeadTime() <em>purchasingLeadTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getPurchasingLeadTime() purchasingLeadTime}' feature.
	 * @generated
	 */
	public void setPurchasingLeadTime(Long newPurchasingLeadTime) {
		purchasingLeadTime = newPurchasingLeadTime;
	}

	/**
	 * Returns the value of '<em><b>actualDeliveryDays</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>actualDeliveryDays</b></em>' feature
	 * @generated
	 */
	public Long getActualDeliveryDays() {
		return actualDeliveryDays;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getActualDeliveryDays() <em>actualDeliveryDays</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getActualDeliveryDays() actualDeliveryDays}' feature.
	 * @generated
	 */
	public void setActualDeliveryDays(Long newActualDeliveryDays) {
		actualDeliveryDays = newActualDeliveryDays;
	}

	/**
	 * Returns the value of '<em><b>qualityRating</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>qualityRating</b></em>' feature
	 * @generated
	 */
	public Long getQualityRating() {
		return qualityRating;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getQualityRating() <em>qualityRating</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getQualityRating() qualityRating}' feature.
	 * @generated
	 */
	public void setQualityRating(Long newQualityRating) {
		qualityRating = newQualityRating;
	}

	/**
	 * Returns the value of '<em><b>royaltyAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>royaltyAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getRoyaltyAmount() {
		return royaltyAmount;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getRoyaltyAmount() <em>royaltyAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getRoyaltyAmount() royaltyAmount}' feature.
	 * @generated
	 */
	public void setRoyaltyAmount(Decimal newRoyaltyAmount) {
		royaltyAmount = newRoyaltyAmount;
	}

	/**
	 * Returns the value of '<em><b>manufacturer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturer</b></em>' feature
	 * @generated
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getManufacturer() <em>manufacturer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getManufacturer() manufacturer}' feature.
	 * @generated
	 */
	public void setManufacturer(String newManufacturer) {
		manufacturer = newManufacturer;
	}

	/**
	 * Returns the value of '<em><b>capacity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>capacity</b></em>' feature
	 * @generated
	 */
	public Decimal getCapacity() {
		return capacity;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getCapacity() <em>capacity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getCapacity() capacity}' feature.
	 * @generated
	 */
	public void setCapacity(Decimal newCapacity) {
		capacity = newCapacity;
	}

	/**
	 * Returns the value of '<em><b>standardQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>standardQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getStandardQuantity() {
		return standardQuantity;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getStandardQuantity() <em>standardQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getStandardQuantity() standardQuantity}' feature.
	 * @generated
	 */
	public void setStandardQuantity(Decimal newStandardQuantity) {
		standardQuantity = newStandardQuantity;
	}

	/**
	 * Returns the value of '<em><b>quantityType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>quantityType</b></em>' feature
	 * @generated
	 */
	public String getQuantityType() {
		return quantityType;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getQuantityType() <em>quantityType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getQuantityType() quantityType}' feature.
	 * @generated
	 */
	public void setQuantityType(String newQuantityType) {
		quantityType = newQuantityType;
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
	 * Sets the '{@link ApprovedVendorType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getId1() id1}' feature.
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
	 * Sets the '{@link ApprovedVendorType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ApprovedVendorType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#isReference() reference}' feature.
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
	public List<ApprovedVendorTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ApprovedVendorType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ApprovedVendorType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ApprovedVendorTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ApprovedVendorType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
