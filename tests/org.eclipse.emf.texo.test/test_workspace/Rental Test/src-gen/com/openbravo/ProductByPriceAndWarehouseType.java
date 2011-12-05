package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductByPriceAndWarehouseType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductByPriceAndWarehouseType {

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
	private ReferenceType product = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType warehouse = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal available = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal qtyOnHand = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal qtyReserved = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal qtyOrdered = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal netListPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal standardPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal priceLimit = null;

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
	private List<ProductByPriceAndWarehouseTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ProductByPriceAndWarehouseTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getId() id}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getClient() client}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getActive() active}' feature.
	 * @generated
	 */
	public void setActive(Boolean newActive) {
		active = newActive;
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getCreatedBy() createdBy}' feature.
	 * @generated
	 */
	public void setCreatedBy(ReferenceType newCreatedBy) {
		createdBy = newCreatedBy;
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ReferenceType newProduct) {
		product = newProduct;
	}

	/**
	 * Returns the value of '<em><b>warehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouse</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouse() {
		return warehouse;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(ReferenceType newWarehouse) {
		warehouse = newWarehouse;
	}

	/**
	 * Returns the value of '<em><b>productPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productPrice</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductPrice() {
		return productPrice;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getProductPrice() <em>productPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getProductPrice() productPrice}' feature.
	 * @generated
	 */
	public void setProductPrice(ReferenceType newProductPrice) {
		productPrice = newProductPrice;
	}

	/**
	 * Returns the value of '<em><b>available</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>available</b></em>' feature
	 * @generated
	 */
	public Decimal getAvailable() {
		return available;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getAvailable() <em>available</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getAvailable() available}' feature.
	 * @generated
	 */
	public void setAvailable(Decimal newAvailable) {
		available = newAvailable;
	}

	/**
	 * Returns the value of '<em><b>qtyOnHand</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>qtyOnHand</b></em>' feature
	 * @generated
	 */
	public Decimal getQtyOnHand() {
		return qtyOnHand;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getQtyOnHand() <em>qtyOnHand</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getQtyOnHand() qtyOnHand}' feature.
	 * @generated
	 */
	public void setQtyOnHand(Decimal newQtyOnHand) {
		qtyOnHand = newQtyOnHand;
	}

	/**
	 * Returns the value of '<em><b>qtyReserved</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>qtyReserved</b></em>' feature
	 * @generated
	 */
	public Decimal getQtyReserved() {
		return qtyReserved;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getQtyReserved() <em>qtyReserved</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getQtyReserved() qtyReserved}' feature.
	 * @generated
	 */
	public void setQtyReserved(Decimal newQtyReserved) {
		qtyReserved = newQtyReserved;
	}

	/**
	 * Returns the value of '<em><b>qtyOrdered</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>qtyOrdered</b></em>' feature
	 * @generated
	 */
	public Decimal getQtyOrdered() {
		return qtyOrdered;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getQtyOrdered() <em>qtyOrdered</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getQtyOrdered() qtyOrdered}' feature.
	 * @generated
	 */
	public void setQtyOrdered(Decimal newQtyOrdered) {
		qtyOrdered = newQtyOrdered;
	}

	/**
	 * Returns the value of '<em><b>netListPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>netListPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getNetListPrice() {
		return netListPrice;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getNetListPrice() <em>netListPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getNetListPrice() netListPrice}' feature.
	 * @generated
	 */
	public void setNetListPrice(Decimal newNetListPrice) {
		netListPrice = newNetListPrice;
	}

	/**
	 * Returns the value of '<em><b>standardPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>standardPrice</b></em>' feature
	 * @generated
	 */
	public Decimal getStandardPrice() {
		return standardPrice;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getStandardPrice() <em>standardPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getStandardPrice() standardPrice}' feature.
	 * @generated
	 */
	public void setStandardPrice(Decimal newStandardPrice) {
		standardPrice = newStandardPrice;
	}

	/**
	 * Returns the value of '<em><b>priceLimit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceLimit</b></em>' feature
	 * @generated
	 */
	public Decimal getPriceLimit() {
		return priceLimit;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getPriceLimit() <em>priceLimit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getPriceLimit() priceLimit}' feature.
	 * @generated
	 */
	public void setPriceLimit(Decimal newPriceLimit) {
		priceLimit = newPriceLimit;
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getId1() id1}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ProductByPriceAndWarehouseType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#isReference() reference}' feature.
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
	public List<ProductByPriceAndWarehouseTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ProductByPriceAndWarehouseType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductByPriceAndWarehouseType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ProductByPriceAndWarehouseTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ProductByPriceAndWarehouseType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
