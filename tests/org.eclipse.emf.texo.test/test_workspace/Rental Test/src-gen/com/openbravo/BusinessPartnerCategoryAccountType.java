package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerCategoryAccountType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerCategoryAccountType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType accountingSchema = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategory = null;

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
	private ReferenceType customerReceivablesNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType customerPrepayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType vendorLiability = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType vendorServiceLiability = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType vendorPrepayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentDiscountExpense = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType paymentDiscountRevenue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType writeoff = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType unrealizedGainsAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType unrealizedLossesAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType realizedGainAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType realizedLossAcct = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType nonInvoicedReceipts = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType unearnedRevenue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType nonInvoicedRevenues = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType nonInvoicedReceivables = null;

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
	private String id = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String status = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType writeoffRevAcct = null;

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
	private List<BusinessPartnerCategoryAccountTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<BusinessPartnerCategoryAccountTypeAnyAttributeFeatureGroup>();

	/**
	 * Returns the value of '<em><b>accountingSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountingSchema</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccountingSchema() {
		return accountingSchema;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getAccountingSchema() <em>accountingSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getAccountingSchema() accountingSchema}' feature.
	 * @generated
	 */
	public void setAccountingSchema(ReferenceType newAccountingSchema) {
		accountingSchema = newAccountingSchema;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategory() {
		return businessPartnerCategory;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getBusinessPartnerCategory() <em>businessPartnerCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getBusinessPartnerCategory() businessPartnerCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategory(
			ReferenceType newBusinessPartnerCategory) {
		businessPartnerCategory = newBusinessPartnerCategory;
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getClient() client}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getOrganization() organization}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getActive() active}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getUpdated() updated}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>customerReceivablesNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerReceivablesNo</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCustomerReceivablesNo() {
		return customerReceivablesNo;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getCustomerReceivablesNo() <em>customerReceivablesNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getCustomerReceivablesNo() customerReceivablesNo}' feature.
	 * @generated
	 */
	public void setCustomerReceivablesNo(ReferenceType newCustomerReceivablesNo) {
		customerReceivablesNo = newCustomerReceivablesNo;
	}

	/**
	 * Returns the value of '<em><b>customerPrepayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerPrepayment</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCustomerPrepayment() {
		return customerPrepayment;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getCustomerPrepayment() <em>customerPrepayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getCustomerPrepayment() customerPrepayment}' feature.
	 * @generated
	 */
	public void setCustomerPrepayment(ReferenceType newCustomerPrepayment) {
		customerPrepayment = newCustomerPrepayment;
	}

	/**
	 * Returns the value of '<em><b>vendorLiability</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorLiability</b></em>' feature
	 * @generated
	 */
	public ReferenceType getVendorLiability() {
		return vendorLiability;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getVendorLiability() <em>vendorLiability</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getVendorLiability() vendorLiability}' feature.
	 * @generated
	 */
	public void setVendorLiability(ReferenceType newVendorLiability) {
		vendorLiability = newVendorLiability;
	}

	/**
	 * Returns the value of '<em><b>vendorServiceLiability</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorServiceLiability</b></em>' feature
	 * @generated
	 */
	public ReferenceType getVendorServiceLiability() {
		return vendorServiceLiability;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getVendorServiceLiability() <em>vendorServiceLiability</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getVendorServiceLiability() vendorServiceLiability}' feature.
	 * @generated
	 */
	public void setVendorServiceLiability(
			ReferenceType newVendorServiceLiability) {
		vendorServiceLiability = newVendorServiceLiability;
	}

	/**
	 * Returns the value of '<em><b>vendorPrepayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorPrepayment</b></em>' feature
	 * @generated
	 */
	public ReferenceType getVendorPrepayment() {
		return vendorPrepayment;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getVendorPrepayment() <em>vendorPrepayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getVendorPrepayment() vendorPrepayment}' feature.
	 * @generated
	 */
	public void setVendorPrepayment(ReferenceType newVendorPrepayment) {
		vendorPrepayment = newVendorPrepayment;
	}

	/**
	 * Returns the value of '<em><b>paymentDiscountExpense</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentDiscountExpense</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentDiscountExpense() {
		return paymentDiscountExpense;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getPaymentDiscountExpense() <em>paymentDiscountExpense</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getPaymentDiscountExpense() paymentDiscountExpense}' feature.
	 * @generated
	 */
	public void setPaymentDiscountExpense(
			ReferenceType newPaymentDiscountExpense) {
		paymentDiscountExpense = newPaymentDiscountExpense;
	}

	/**
	 * Returns the value of '<em><b>paymentDiscountRevenue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentDiscountRevenue</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentDiscountRevenue() {
		return paymentDiscountRevenue;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getPaymentDiscountRevenue() <em>paymentDiscountRevenue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getPaymentDiscountRevenue() paymentDiscountRevenue}' feature.
	 * @generated
	 */
	public void setPaymentDiscountRevenue(
			ReferenceType newPaymentDiscountRevenue) {
		paymentDiscountRevenue = newPaymentDiscountRevenue;
	}

	/**
	 * Returns the value of '<em><b>writeoff</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>writeoff</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWriteoff() {
		return writeoff;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getWriteoff() <em>writeoff</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getWriteoff() writeoff}' feature.
	 * @generated
	 */
	public void setWriteoff(ReferenceType newWriteoff) {
		writeoff = newWriteoff;
	}

	/**
	 * Returns the value of '<em><b>unrealizedGainsAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unrealizedGainsAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUnrealizedGainsAcct() {
		return unrealizedGainsAcct;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getUnrealizedGainsAcct() <em>unrealizedGainsAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getUnrealizedGainsAcct() unrealizedGainsAcct}' feature.
	 * @generated
	 */
	public void setUnrealizedGainsAcct(ReferenceType newUnrealizedGainsAcct) {
		unrealizedGainsAcct = newUnrealizedGainsAcct;
	}

	/**
	 * Returns the value of '<em><b>unrealizedLossesAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unrealizedLossesAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUnrealizedLossesAcct() {
		return unrealizedLossesAcct;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getUnrealizedLossesAcct() <em>unrealizedLossesAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getUnrealizedLossesAcct() unrealizedLossesAcct}' feature.
	 * @generated
	 */
	public void setUnrealizedLossesAcct(ReferenceType newUnrealizedLossesAcct) {
		unrealizedLossesAcct = newUnrealizedLossesAcct;
	}

	/**
	 * Returns the value of '<em><b>realizedGainAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>realizedGainAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRealizedGainAcct() {
		return realizedGainAcct;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getRealizedGainAcct() <em>realizedGainAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getRealizedGainAcct() realizedGainAcct}' feature.
	 * @generated
	 */
	public void setRealizedGainAcct(ReferenceType newRealizedGainAcct) {
		realizedGainAcct = newRealizedGainAcct;
	}

	/**
	 * Returns the value of '<em><b>realizedLossAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>realizedLossAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getRealizedLossAcct() {
		return realizedLossAcct;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getRealizedLossAcct() <em>realizedLossAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getRealizedLossAcct() realizedLossAcct}' feature.
	 * @generated
	 */
	public void setRealizedLossAcct(ReferenceType newRealizedLossAcct) {
		realizedLossAcct = newRealizedLossAcct;
	}

	/**
	 * Returns the value of '<em><b>nonInvoicedReceipts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nonInvoicedReceipts</b></em>' feature
	 * @generated
	 */
	public ReferenceType getNonInvoicedReceipts() {
		return nonInvoicedReceipts;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getNonInvoicedReceipts() <em>nonInvoicedReceipts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getNonInvoicedReceipts() nonInvoicedReceipts}' feature.
	 * @generated
	 */
	public void setNonInvoicedReceipts(ReferenceType newNonInvoicedReceipts) {
		nonInvoicedReceipts = newNonInvoicedReceipts;
	}

	/**
	 * Returns the value of '<em><b>unearnedRevenue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unearnedRevenue</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUnearnedRevenue() {
		return unearnedRevenue;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getUnearnedRevenue() <em>unearnedRevenue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getUnearnedRevenue() unearnedRevenue}' feature.
	 * @generated
	 */
	public void setUnearnedRevenue(ReferenceType newUnearnedRevenue) {
		unearnedRevenue = newUnearnedRevenue;
	}

	/**
	 * Returns the value of '<em><b>nonInvoicedRevenues</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nonInvoicedRevenues</b></em>' feature
	 * @generated
	 */
	public ReferenceType getNonInvoicedRevenues() {
		return nonInvoicedRevenues;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getNonInvoicedRevenues() <em>nonInvoicedRevenues</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getNonInvoicedRevenues() nonInvoicedRevenues}' feature.
	 * @generated
	 */
	public void setNonInvoicedRevenues(ReferenceType newNonInvoicedRevenues) {
		nonInvoicedRevenues = newNonInvoicedRevenues;
	}

	/**
	 * Returns the value of '<em><b>nonInvoicedReceivables</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nonInvoicedReceivables</b></em>' feature
	 * @generated
	 */
	public ReferenceType getNonInvoicedReceivables() {
		return nonInvoicedReceivables;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getNonInvoicedReceivables() <em>nonInvoicedReceivables</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getNonInvoicedReceivables() nonInvoicedReceivables}' feature.
	 * @generated
	 */
	public void setNonInvoicedReceivables(
			ReferenceType newNonInvoicedReceivables) {
		nonInvoicedReceivables = newNonInvoicedReceivables;
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>status</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>status</b></em>' feature
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getStatus() <em>status</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getStatus() status}' feature.
	 * @generated
	 */
	public void setStatus(String newStatus) {
		status = newStatus;
	}

	/**
	 * Returns the value of '<em><b>writeoffRevAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>writeoffRevAcct</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWriteoffRevAcct() {
		return writeoffRevAcct;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getWriteoffRevAcct() <em>writeoffRevAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getWriteoffRevAcct() writeoffRevAcct}' feature.
	 * @generated
	 */
	public void setWriteoffRevAcct(ReferenceType newWriteoffRevAcct) {
		writeoffRevAcct = newWriteoffRevAcct;
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getId1() id1}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link BusinessPartnerCategoryAccountType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#isReference() reference}' feature.
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
	public List<BusinessPartnerCategoryAccountTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link BusinessPartnerCategoryAccountType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerCategoryAccountType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<BusinessPartnerCategoryAccountTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "BusinessPartnerCategoryAccountType " + " [id1: " + getId1()
				+ "]" + " [identifier: " + getIdentifier() + "]"
				+ " [reference: " + isReference() + "]";
	}
}
