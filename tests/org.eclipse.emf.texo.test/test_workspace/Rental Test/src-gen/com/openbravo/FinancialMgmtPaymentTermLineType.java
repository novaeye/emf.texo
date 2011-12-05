package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPaymentTermLineType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPaymentTermLineType {

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
	private ReferenceType paymentTerms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long lineNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal percentageDue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean rest = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean excludeTax = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String formOfPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean fixedDueDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long overduePaymentDaysRule = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long lastDayCutoff = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long maturityDate1 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long maturityDate2 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long maturityDate3 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long offsetMonthDue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean nextBusinessDay = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String overduePaymentDayRule = null;

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
	private List<FinancialMgmtPaymentTermLineTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtPaymentTermLineTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>paymentTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentTerms</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPaymentTerms() {
		return paymentTerms;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getPaymentTerms() <em>paymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getPaymentTerms() paymentTerms}' feature.
	 * @generated
	 */
	public void setPaymentTerms(ReferenceType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
	}

	/**
	 * Returns the value of '<em><b>lineNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lineNo</b></em>' feature
	 * @generated
	 */
	public Long getLineNo() {
		return lineNo;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getLineNo() <em>lineNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getLineNo() lineNo}' feature.
	 * @generated
	 */
	public void setLineNo(Long newLineNo) {
		lineNo = newLineNo;
	}

	/**
	 * Returns the value of '<em><b>percentageDue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>percentageDue</b></em>' feature
	 * @generated
	 */
	public Decimal getPercentageDue() {
		return percentageDue;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getPercentageDue() <em>percentageDue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getPercentageDue() percentageDue}' feature.
	 * @generated
	 */
	public void setPercentageDue(Decimal newPercentageDue) {
		percentageDue = newPercentageDue;
	}

	/**
	 * Returns the value of '<em><b>rest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rest</b></em>' feature
	 * @generated
	 */
	public Boolean getRest() {
		return rest;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getRest() <em>rest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getRest() rest}' feature.
	 * @generated
	 */
	public void setRest(Boolean newRest) {
		rest = newRest;
	}

	/**
	 * Returns the value of '<em><b>excludeTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>excludeTax</b></em>' feature
	 * @generated
	 */
	public Boolean getExcludeTax() {
		return excludeTax;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getExcludeTax() <em>excludeTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getExcludeTax() excludeTax}' feature.
	 * @generated
	 */
	public void setExcludeTax(Boolean newExcludeTax) {
		excludeTax = newExcludeTax;
	}

	/**
	 * Returns the value of '<em><b>formOfPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>formOfPayment</b></em>' feature
	 * @generated
	 */
	public String getFormOfPayment() {
		return formOfPayment;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getFormOfPayment() formOfPayment}' feature.
	 * @generated
	 */
	public void setFormOfPayment(String newFormOfPayment) {
		formOfPayment = newFormOfPayment;
	}

	/**
	 * Returns the value of '<em><b>fixedDueDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fixedDueDate</b></em>' feature
	 * @generated
	 */
	public Boolean getFixedDueDate() {
		return fixedDueDate;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getFixedDueDate() <em>fixedDueDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getFixedDueDate() fixedDueDate}' feature.
	 * @generated
	 */
	public void setFixedDueDate(Boolean newFixedDueDate) {
		fixedDueDate = newFixedDueDate;
	}

	/**
	 * Returns the value of '<em><b>overduePaymentDaysRule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>overduePaymentDaysRule</b></em>' feature
	 * @generated
	 */
	public Long getOverduePaymentDaysRule() {
		return overduePaymentDaysRule;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getOverduePaymentDaysRule() <em>overduePaymentDaysRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getOverduePaymentDaysRule() overduePaymentDaysRule}' feature.
	 * @generated
	 */
	public void setOverduePaymentDaysRule(Long newOverduePaymentDaysRule) {
		overduePaymentDaysRule = newOverduePaymentDaysRule;
	}

	/**
	 * Returns the value of '<em><b>lastDayCutoff</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastDayCutoff</b></em>' feature
	 * @generated
	 */
	public Long getLastDayCutoff() {
		return lastDayCutoff;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getLastDayCutoff() <em>lastDayCutoff</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getLastDayCutoff() lastDayCutoff}' feature.
	 * @generated
	 */
	public void setLastDayCutoff(Long newLastDayCutoff) {
		lastDayCutoff = newLastDayCutoff;
	}

	/**
	 * Returns the value of '<em><b>maturityDate1</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maturityDate1</b></em>' feature
	 * @generated
	 */
	public Long getMaturityDate1() {
		return maturityDate1;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getMaturityDate1() <em>maturityDate1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getMaturityDate1() maturityDate1}' feature.
	 * @generated
	 */
	public void setMaturityDate1(Long newMaturityDate1) {
		maturityDate1 = newMaturityDate1;
	}

	/**
	 * Returns the value of '<em><b>maturityDate2</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maturityDate2</b></em>' feature
	 * @generated
	 */
	public Long getMaturityDate2() {
		return maturityDate2;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getMaturityDate2() <em>maturityDate2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getMaturityDate2() maturityDate2}' feature.
	 * @generated
	 */
	public void setMaturityDate2(Long newMaturityDate2) {
		maturityDate2 = newMaturityDate2;
	}

	/**
	 * Returns the value of '<em><b>maturityDate3</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maturityDate3</b></em>' feature
	 * @generated
	 */
	public Long getMaturityDate3() {
		return maturityDate3;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getMaturityDate3() <em>maturityDate3</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getMaturityDate3() maturityDate3}' feature.
	 * @generated
	 */
	public void setMaturityDate3(Long newMaturityDate3) {
		maturityDate3 = newMaturityDate3;
	}

	/**
	 * Returns the value of '<em><b>offsetMonthDue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>offsetMonthDue</b></em>' feature
	 * @generated
	 */
	public Long getOffsetMonthDue() {
		return offsetMonthDue;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getOffsetMonthDue() <em>offsetMonthDue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getOffsetMonthDue() offsetMonthDue}' feature.
	 * @generated
	 */
	public void setOffsetMonthDue(Long newOffsetMonthDue) {
		offsetMonthDue = newOffsetMonthDue;
	}

	/**
	 * Returns the value of '<em><b>nextBusinessDay</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nextBusinessDay</b></em>' feature
	 * @generated
	 */
	public Boolean getNextBusinessDay() {
		return nextBusinessDay;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getNextBusinessDay() <em>nextBusinessDay</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getNextBusinessDay() nextBusinessDay}' feature.
	 * @generated
	 */
	public void setNextBusinessDay(Boolean newNextBusinessDay) {
		nextBusinessDay = newNextBusinessDay;
	}

	/**
	 * Returns the value of '<em><b>overduePaymentDayRule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>overduePaymentDayRule</b></em>' feature
	 * @generated
	 */
	public String getOverduePaymentDayRule() {
		return overduePaymentDayRule;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getOverduePaymentDayRule() <em>overduePaymentDayRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getOverduePaymentDayRule() overduePaymentDayRule}' feature.
	 * @generated
	 */
	public void setOverduePaymentDayRule(String newOverduePaymentDayRule) {
		overduePaymentDayRule = newOverduePaymentDayRule;
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#isReference() reference}' feature.
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
	public List<FinancialMgmtPaymentTermLineTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtPaymentTermLineType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPaymentTermLineType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtPaymentTermLineTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtPaymentTermLineType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
