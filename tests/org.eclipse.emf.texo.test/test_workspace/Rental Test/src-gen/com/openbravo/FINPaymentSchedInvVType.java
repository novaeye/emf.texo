package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FINPaymentSchedInvVType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FINPaymentSchedInvVType {

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
	private ReferenceType invoice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesOrder = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime dueDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentMethod = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal expected = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal received = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal outstanding = null;

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
	private DateTime lastPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfPayments = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentPriority = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean updatePaymentPlan = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentDetailVListType2 fINPaymentDetailVList = null;

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
	private List<FINPaymentSchedInvVTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FINPaymentSchedInvVTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FINPaymentSchedInvVType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getId() id}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getClient() client}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getActive() active}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>invoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoice</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoice() {
		return invoice;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(ReferenceType newInvoice) {
		invoice = newInvoice;
	}

	/**
	 * Returns the value of '<em><b>salesOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesOrder</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesOrder() {
		return salesOrder;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getSalesOrder() <em>salesOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getSalesOrder() salesOrder}' feature.
	 * @generated
	 */
	public void setSalesOrder(ReferenceType newSalesOrder) {
		salesOrder = newSalesOrder;
	}

	/**
	 * Returns the value of '<em><b>dueDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dueDate</b></em>' feature
	 * @generated
	 */
	public DateTime getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getDueDate() <em>dueDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getDueDate() dueDate}' feature.
	 * @generated
	 */
	public void setDueDate(DateTime newDueDate) {
		dueDate = newDueDate;
	}

	/**
	 * Returns the value of '<em><b>paymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentMethod</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
	}

	/**
	 * Returns the value of '<em><b>expected</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expected</b></em>' feature
	 * @generated
	 */
	public Decimal getExpected() {
		return expected;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getExpected() <em>expected</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getExpected() expected}' feature.
	 * @generated
	 */
	public void setExpected(Decimal newExpected) {
		expected = newExpected;
	}

	/**
	 * Returns the value of '<em><b>received</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>received</b></em>' feature
	 * @generated
	 */
	public Decimal getReceived() {
		return received;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getReceived() <em>received</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getReceived() received}' feature.
	 * @generated
	 */
	public void setReceived(Decimal newReceived) {
		received = newReceived;
	}

	/**
	 * Returns the value of '<em><b>outstanding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>outstanding</b></em>' feature
	 * @generated
	 */
	public Decimal getOutstanding() {
		return outstanding;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getOutstanding() <em>outstanding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getOutstanding() outstanding}' feature.
	 * @generated
	 */
	public void setOutstanding(Decimal newOutstanding) {
		outstanding = newOutstanding;
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
	 * Sets the '{@link FINPaymentSchedInvVType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>lastPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastPayment</b></em>' feature
	 * @generated
	 */
	public DateTime getLastPayment() {
		return lastPayment;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getLastPayment() <em>lastPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getLastPayment() lastPayment}' feature.
	 * @generated
	 */
	public void setLastPayment(DateTime newLastPayment) {
		lastPayment = newLastPayment;
	}

	/**
	 * Returns the value of '<em><b>numberOfPayments</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfPayments</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfPayments() {
		return numberOfPayments;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getNumberOfPayments() <em>numberOfPayments</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getNumberOfPayments() numberOfPayments}' feature.
	 * @generated
	 */
	public void setNumberOfPayments(Long newNumberOfPayments) {
		numberOfPayments = newNumberOfPayments;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPriority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPriority</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentPriority() {
		return fINPaymentPriority;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getFINPaymentPriority() <em>fINPaymentPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getFINPaymentPriority() fINPaymentPriority}' feature.
	 * @generated
	 */
	public void setFINPaymentPriority(ReferenceType newFINPaymentPriority) {
		fINPaymentPriority = newFINPaymentPriority;
	}

	/**
	 * Returns the value of '<em><b>updatePaymentPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>updatePaymentPlan</b></em>' feature
	 * @generated
	 */
	public Boolean getUpdatePaymentPlan() {
		return updatePaymentPlan;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getUpdatePaymentPlan() <em>updatePaymentPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getUpdatePaymentPlan() updatePaymentPlan}' feature.
	 * @generated
	 */
	public void setUpdatePaymentPlan(Boolean newUpdatePaymentPlan) {
		updatePaymentPlan = newUpdatePaymentPlan;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailVList</b></em>' feature
	 * @generated
	 */
	public FINPaymentDetailVListType2 getFINPaymentDetailVList() {
		return fINPaymentDetailVList;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(
			FINPaymentDetailVListType2 newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
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
	 * Sets the '{@link FINPaymentSchedInvVType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getId1() id1}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FINPaymentSchedInvVType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#isReference() reference}' feature.
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
	public List<FINPaymentSchedInvVTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FINPaymentSchedInvVType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FINPaymentSchedInvVType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FINPaymentSchedInvVTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FINPaymentSchedInvVType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
