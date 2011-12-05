package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtPeriodType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtPeriodType {

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
	private Long periodNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType year = null;

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
	private String periodType = null;

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
	private String closingFactAcctGroup = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String regularizationFactAcctGroup = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String divideupFactAcctGroup = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String openFactAcctGroup = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinAccTransactionAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinaccTrxFullAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingFactList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtBudgetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLBatchList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLJournalList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPeriodControlListType financialMgmtPeriodControlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtPeriodControlVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType periodControlLogPeriodNoList = null;

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
	private List<FinancialMgmtPeriodTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtPeriodTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtPeriodType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>periodNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>periodNo</b></em>' feature
	 * @generated
	 */
	public Long getPeriodNo() {
		return periodNo;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getPeriodNo() <em>periodNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getPeriodNo() periodNo}' feature.
	 * @generated
	 */
	public void setPeriodNo(Long newPeriodNo) {
		periodNo = newPeriodNo;
	}

	/**
	 * Returns the value of '<em><b>year</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>year</b></em>' feature
	 * @generated
	 */
	public ReferenceType getYear() {
		return year;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getYear() <em>year</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getYear() year}' feature.
	 * @generated
	 */
	public void setYear(ReferenceType newYear) {
		year = newYear;
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
	 * Sets the '{@link FinancialMgmtPeriodType#getStartingDate() <em>startingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getStartingDate() startingDate}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getEndingDate() <em>endingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getEndingDate() endingDate}' feature.
	 * @generated
	 */
	public void setEndingDate(DateTime newEndingDate) {
		endingDate = newEndingDate;
	}

	/**
	 * Returns the value of '<em><b>periodType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>periodType</b></em>' feature
	 * @generated
	 */
	public String getPeriodType() {
		return periodType;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getPeriodType() <em>periodType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getPeriodType() periodType}' feature.
	 * @generated
	 */
	public void setPeriodType(String newPeriodType) {
		periodType = newPeriodType;
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
	 * Sets the '{@link FinancialMgmtPeriodType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

	/**
	 * Returns the value of '<em><b>closingFactAcctGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>closingFactAcctGroup</b></em>' feature
	 * @generated
	 */
	public String getClosingFactAcctGroup() {
		return closingFactAcctGroup;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getClosingFactAcctGroup() <em>closingFactAcctGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getClosingFactAcctGroup() closingFactAcctGroup}' feature.
	 * @generated
	 */
	public void setClosingFactAcctGroup(String newClosingFactAcctGroup) {
		closingFactAcctGroup = newClosingFactAcctGroup;
	}

	/**
	 * Returns the value of '<em><b>regularizationFactAcctGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>regularizationFactAcctGroup</b></em>' feature
	 * @generated
	 */
	public String getRegularizationFactAcctGroup() {
		return regularizationFactAcctGroup;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getRegularizationFactAcctGroup() <em>regularizationFactAcctGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getRegularizationFactAcctGroup() regularizationFactAcctGroup}' feature.
	 * @generated
	 */
	public void setRegularizationFactAcctGroup(
			String newRegularizationFactAcctGroup) {
		regularizationFactAcctGroup = newRegularizationFactAcctGroup;
	}

	/**
	 * Returns the value of '<em><b>divideupFactAcctGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>divideupFactAcctGroup</b></em>' feature
	 * @generated
	 */
	public String getDivideupFactAcctGroup() {
		return divideupFactAcctGroup;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getDivideupFactAcctGroup() <em>divideupFactAcctGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getDivideupFactAcctGroup() divideupFactAcctGroup}' feature.
	 * @generated
	 */
	public void setDivideupFactAcctGroup(String newDivideupFactAcctGroup) {
		divideupFactAcctGroup = newDivideupFactAcctGroup;
	}

	/**
	 * Returns the value of '<em><b>openFactAcctGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>openFactAcctGroup</b></em>' feature
	 * @generated
	 */
	public String getOpenFactAcctGroup() {
		return openFactAcctGroup;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getOpenFactAcctGroup() <em>openFactAcctGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getOpenFactAcctGroup() openFactAcctGroup}' feature.
	 * @generated
	 */
	public void setOpenFactAcctGroup(String newOpenFactAcctGroup) {
		openFactAcctGroup = newOpenFactAcctGroup;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinAccTransactionAcctVList() {
		return aPRMFinAccTransactionAcctVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVList(
			ReferenceType newAPRMFinAccTransactionAcctVList) {
		aPRMFinAccTransactionAcctVList = newAPRMFinAccTransactionAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTrxFullAcctVList() {
		return aPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFactList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFactList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingFactList() {
		return financialMgmtAccountingFactList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaList() {
		return financialMgmtAcctSchemaList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtAcctSchemaList() <em>financialMgmtAcctSchemaList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtAcctSchemaList() financialMgmtAcctSchemaList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaList(
			ReferenceType newFinancialMgmtAcctSchemaList) {
		financialMgmtAcctSchemaList = newFinancialMgmtAcctSchemaList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBudgetLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudgetLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtBudgetLineList() {
		return financialMgmtBudgetLineList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLBatchList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLBatchList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLBatchList() {
		return financialMgmtGLBatchList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtGLBatchList() <em>financialMgmtGLBatchList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtGLBatchList() financialMgmtGLBatchList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLBatchList(
			ReferenceType newFinancialMgmtGLBatchList) {
		financialMgmtGLBatchList = newFinancialMgmtGLBatchList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLJournalList() {
		return financialMgmtGLJournalList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtGLJournalList() <em>financialMgmtGLJournalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtGLJournalList() financialMgmtGLJournalList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalList(
			ReferenceType newFinancialMgmtGLJournalList) {
		financialMgmtGLJournalList = newFinancialMgmtGLJournalList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControlList</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPeriodControlListType getFinancialMgmtPeriodControlList() {
		return financialMgmtPeriodControlList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtPeriodControlList() <em>financialMgmtPeriodControlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtPeriodControlList() financialMgmtPeriodControlList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControlList(
			FinancialMgmtPeriodControlListType newFinancialMgmtPeriodControlList) {
		financialMgmtPeriodControlList = newFinancialMgmtPeriodControlList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControlVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControlVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtPeriodControlVList() {
		return financialMgmtPeriodControlVList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getFinancialMgmtPeriodControlVList() <em>financialMgmtPeriodControlVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getFinancialMgmtPeriodControlVList() financialMgmtPeriodControlVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControlVList(
			ReferenceType newFinancialMgmtPeriodControlVList) {
		financialMgmtPeriodControlVList = newFinancialMgmtPeriodControlVList;
	}

	/**
	 * Returns the value of '<em><b>periodControlLogPeriodNoList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>periodControlLogPeriodNoList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPeriodControlLogPeriodNoList() {
		return periodControlLogPeriodNoList;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getPeriodControlLogPeriodNoList() <em>periodControlLogPeriodNoList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getPeriodControlLogPeriodNoList() periodControlLogPeriodNoList}' feature.
	 * @generated
	 */
	public void setPeriodControlLogPeriodNoList(
			ReferenceType newPeriodControlLogPeriodNoList) {
		periodControlLogPeriodNoList = newPeriodControlLogPeriodNoList;
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
	 * Sets the '{@link FinancialMgmtPeriodType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtPeriodType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#isReference() reference}' feature.
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
	public List<FinancialMgmtPeriodTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtPeriodType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtPeriodType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtPeriodTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtPeriodType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
