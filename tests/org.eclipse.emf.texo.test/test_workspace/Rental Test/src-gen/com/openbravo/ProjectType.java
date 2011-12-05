package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProjectType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProjectType {

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
	private String searchKey = null;

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
	private String comments = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean summaryLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType userContact = null;

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
	private ReferenceType partnerAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String orderReference = null;

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
	private ReferenceType currency = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean createTemporaryPriceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType priceListVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCampaign = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean legallyBindingContract = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal plannedAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal plannedQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal plannedMargin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal contractAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime contractDate = null;

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
	private Boolean generateTo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean processed = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesRepresentative = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean copyFrom = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal contractQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal invoiceAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal invoiceQuantity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal projectBalance = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType standardPhase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectPhase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean priceCeiling = null;

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
	private String projectCategory = null;

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
	private String initiativeType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String projectStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String workType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String phase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean generateOrder = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String changeProjectStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType locationAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType priceList = null;

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
	private Boolean invoiceToProject = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal plannedPoAmount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime lastPlannedProposalDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfCopies = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String accountNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal plannedExpenses = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal expensesMargin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal reinvoicedExpenses = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType personInCharge = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal serviceCost = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal serviceMargin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal serviceRevenue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean setProjectType = null;

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
	private Decimal servicesProvidedCost = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal outsourcedCost = null;

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
	private ReferenceType aPRMFinAccTransactionAcctVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aPRMFinaccTransactionVList = null;

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
	private ReferenceType activeProposalVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinaccTransactionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentDetailVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentScheduleDetailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINReconciliationLineVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAccountingCombinationList = null;

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
	private ReferenceType financialMgmtAcctSchemaElementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAmortizationList = null;

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
	private ReferenceType financialMgmtCashJournalList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDPManagementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentGenerateVList = null;

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
	private ReferenceType financialMgmtGLJournalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtSettlementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceLineAccountingDimensionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInternalMovementList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInventoryCountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtProductionTransactionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType orderList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectAccountsListType projectAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectIssueListType projectIssueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectLineListType projectLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectPhaseListType projectPhaseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectProposalListType projectProposalList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectVendorListType projectVendorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetLineVList = null;

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
	private List<ProjectTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ProjectTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ProjectType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getId() id}' feature.
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
	 * Sets the '{@link ProjectType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getClient() client}' feature.
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
	 * Sets the '{@link ProjectType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ProjectType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getActive() active}' feature.
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
	 * Sets the '{@link ProjectType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ProjectType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ProjectType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ProjectType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>searchKey</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>searchKey</b></em>' feature
	 * @generated
	 */
	public String getSearchKey() {
		return searchKey;
	}

	/**
	 * Sets the '{@link ProjectType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getSearchKey() searchKey}' feature.
	 * @generated
	 */
	public void setSearchKey(String newSearchKey) {
		searchKey = newSearchKey;
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
	 * Sets the '{@link ProjectType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getName() name}' feature.
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
	 * Sets the '{@link ProjectType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>comments</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>comments</b></em>' feature
	 * @generated
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * Sets the '{@link ProjectType#getComments() <em>comments</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getComments() comments}' feature.
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * Returns the value of '<em><b>summaryLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>summaryLevel</b></em>' feature
	 * @generated
	 */
	public Boolean getSummaryLevel() {
		return summaryLevel;
	}

	/**
	 * Sets the '{@link ProjectType#getSummaryLevel() <em>summaryLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getSummaryLevel() summaryLevel}' feature.
	 * @generated
	 */
	public void setSummaryLevel(Boolean newSummaryLevel) {
		summaryLevel = newSummaryLevel;
	}

	/**
	 * Returns the value of '<em><b>userContact</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>userContact</b></em>' feature
	 * @generated
	 */
	public ReferenceType getUserContact() {
		return userContact;
	}

	/**
	 * Sets the '{@link ProjectType#getUserContact() <em>userContact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getUserContact() userContact}' feature.
	 * @generated
	 */
	public void setUserContact(ReferenceType newUserContact) {
		userContact = newUserContact;
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
	 * Sets the '{@link ProjectType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>partnerAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>partnerAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPartnerAddress() {
		return partnerAddress;
	}

	/**
	 * Sets the '{@link ProjectType#getPartnerAddress() <em>partnerAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPartnerAddress() partnerAddress}' feature.
	 * @generated
	 */
	public void setPartnerAddress(ReferenceType newPartnerAddress) {
		partnerAddress = newPartnerAddress;
	}

	/**
	 * Returns the value of '<em><b>orderReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderReference</b></em>' feature
	 * @generated
	 */
	public String getOrderReference() {
		return orderReference;
	}

	/**
	 * Sets the '{@link ProjectType#getOrderReference() <em>orderReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getOrderReference() orderReference}' feature.
	 * @generated
	 */
	public void setOrderReference(String newOrderReference) {
		orderReference = newOrderReference;
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
	 * Sets the '{@link ProjectType#getPaymentTerms() <em>paymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPaymentTerms() paymentTerms}' feature.
	 * @generated
	 */
	public void setPaymentTerms(ReferenceType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
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
	 * Sets the '{@link ProjectType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ReferenceType newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>createTemporaryPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>createTemporaryPriceList</b></em>' feature
	 * @generated
	 */
	public Boolean getCreateTemporaryPriceList() {
		return createTemporaryPriceList;
	}

	/**
	 * Sets the '{@link ProjectType#getCreateTemporaryPriceList() <em>createTemporaryPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getCreateTemporaryPriceList() createTemporaryPriceList}' feature.
	 * @generated
	 */
	public void setCreateTemporaryPriceList(Boolean newCreateTemporaryPriceList) {
		createTemporaryPriceList = newCreateTemporaryPriceList;
	}

	/**
	 * Returns the value of '<em><b>priceListVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceListVersion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPriceListVersion() {
		return priceListVersion;
	}

	/**
	 * Sets the '{@link ProjectType#getPriceListVersion() <em>priceListVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPriceListVersion() priceListVersion}' feature.
	 * @generated
	 */
	public void setPriceListVersion(ReferenceType newPriceListVersion) {
		priceListVersion = newPriceListVersion;
	}

	/**
	 * Returns the value of '<em><b>salesCampaign</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCampaign</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCampaign() {
		return salesCampaign;
	}

	/**
	 * Sets the '{@link ProjectType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getSalesCampaign() salesCampaign}' feature.
	 * @generated
	 */
	public void setSalesCampaign(ReferenceType newSalesCampaign) {
		salesCampaign = newSalesCampaign;
	}

	/**
	 * Returns the value of '<em><b>legallyBindingContract</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>legallyBindingContract</b></em>' feature
	 * @generated
	 */
	public Boolean getLegallyBindingContract() {
		return legallyBindingContract;
	}

	/**
	 * Sets the '{@link ProjectType#getLegallyBindingContract() <em>legallyBindingContract</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getLegallyBindingContract() legallyBindingContract}' feature.
	 * @generated
	 */
	public void setLegallyBindingContract(Boolean newLegallyBindingContract) {
		legallyBindingContract = newLegallyBindingContract;
	}

	/**
	 * Returns the value of '<em><b>plannedAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getPlannedAmount() {
		return plannedAmount;
	}

	/**
	 * Sets the '{@link ProjectType#getPlannedAmount() <em>plannedAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPlannedAmount() plannedAmount}' feature.
	 * @generated
	 */
	public void setPlannedAmount(Decimal newPlannedAmount) {
		plannedAmount = newPlannedAmount;
	}

	/**
	 * Returns the value of '<em><b>plannedQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getPlannedQuantity() {
		return plannedQuantity;
	}

	/**
	 * Sets the '{@link ProjectType#getPlannedQuantity() <em>plannedQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPlannedQuantity() plannedQuantity}' feature.
	 * @generated
	 */
	public void setPlannedQuantity(Decimal newPlannedQuantity) {
		plannedQuantity = newPlannedQuantity;
	}

	/**
	 * Returns the value of '<em><b>plannedMargin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedMargin</b></em>' feature
	 * @generated
	 */
	public Decimal getPlannedMargin() {
		return plannedMargin;
	}

	/**
	 * Sets the '{@link ProjectType#getPlannedMargin() <em>plannedMargin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPlannedMargin() plannedMargin}' feature.
	 * @generated
	 */
	public void setPlannedMargin(Decimal newPlannedMargin) {
		plannedMargin = newPlannedMargin;
	}

	/**
	 * Returns the value of '<em><b>contractAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contractAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getContractAmount() {
		return contractAmount;
	}

	/**
	 * Sets the '{@link ProjectType#getContractAmount() <em>contractAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getContractAmount() contractAmount}' feature.
	 * @generated
	 */
	public void setContractAmount(Decimal newContractAmount) {
		contractAmount = newContractAmount;
	}

	/**
	 * Returns the value of '<em><b>contractDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contractDate</b></em>' feature
	 * @generated
	 */
	public DateTime getContractDate() {
		return contractDate;
	}

	/**
	 * Sets the '{@link ProjectType#getContractDate() <em>contractDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getContractDate() contractDate}' feature.
	 * @generated
	 */
	public void setContractDate(DateTime newContractDate) {
		contractDate = newContractDate;
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
	 * Sets the '{@link ProjectType#getEndingDate() <em>endingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getEndingDate() endingDate}' feature.
	 * @generated
	 */
	public void setEndingDate(DateTime newEndingDate) {
		endingDate = newEndingDate;
	}

	/**
	 * Returns the value of '<em><b>generateTo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generateTo</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerateTo() {
		return generateTo;
	}

	/**
	 * Sets the '{@link ProjectType#getGenerateTo() <em>generateTo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getGenerateTo() generateTo}' feature.
	 * @generated
	 */
	public void setGenerateTo(Boolean newGenerateTo) {
		generateTo = newGenerateTo;
	}

	/**
	 * Returns the value of '<em><b>processed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processed</b></em>' feature
	 * @generated
	 */
	public Boolean getProcessed() {
		return processed;
	}

	/**
	 * Sets the '{@link ProjectType#getProcessed() <em>processed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProcessed() processed}' feature.
	 * @generated
	 */
	public void setProcessed(Boolean newProcessed) {
		processed = newProcessed;
	}

	/**
	 * Returns the value of '<em><b>salesRepresentative</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRepresentative</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesRepresentative() {
		return salesRepresentative;
	}

	/**
	 * Sets the '{@link ProjectType#getSalesRepresentative() <em>salesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getSalesRepresentative() salesRepresentative}' feature.
	 * @generated
	 */
	public void setSalesRepresentative(ReferenceType newSalesRepresentative) {
		salesRepresentative = newSalesRepresentative;
	}

	/**
	 * Returns the value of '<em><b>copyFrom</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>copyFrom</b></em>' feature
	 * @generated
	 */
	public Boolean getCopyFrom() {
		return copyFrom;
	}

	/**
	 * Sets the '{@link ProjectType#getCopyFrom() <em>copyFrom</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getCopyFrom() copyFrom}' feature.
	 * @generated
	 */
	public void setCopyFrom(Boolean newCopyFrom) {
		copyFrom = newCopyFrom;
	}

	/**
	 * Returns the value of '<em><b>projectType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectType</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectType() {
		return projectType;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectType() <em>projectType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectType() projectType}' feature.
	 * @generated
	 */
	public void setProjectType(ReferenceType newProjectType) {
		projectType = newProjectType;
	}

	/**
	 * Returns the value of '<em><b>contractQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contractQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getContractQuantity() {
		return contractQuantity;
	}

	/**
	 * Sets the '{@link ProjectType#getContractQuantity() <em>contractQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getContractQuantity() contractQuantity}' feature.
	 * @generated
	 */
	public void setContractQuantity(Decimal newContractQuantity) {
		contractQuantity = newContractQuantity;
	}

	/**
	 * Returns the value of '<em><b>invoiceAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getInvoiceAmount() {
		return invoiceAmount;
	}

	/**
	 * Sets the '{@link ProjectType#getInvoiceAmount() <em>invoiceAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInvoiceAmount() invoiceAmount}' feature.
	 * @generated
	 */
	public void setInvoiceAmount(Decimal newInvoiceAmount) {
		invoiceAmount = newInvoiceAmount;
	}

	/**
	 * Returns the value of '<em><b>invoiceQuantity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceQuantity</b></em>' feature
	 * @generated
	 */
	public Decimal getInvoiceQuantity() {
		return invoiceQuantity;
	}

	/**
	 * Sets the '{@link ProjectType#getInvoiceQuantity() <em>invoiceQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInvoiceQuantity() invoiceQuantity}' feature.
	 * @generated
	 */
	public void setInvoiceQuantity(Decimal newInvoiceQuantity) {
		invoiceQuantity = newInvoiceQuantity;
	}

	/**
	 * Returns the value of '<em><b>projectBalance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectBalance</b></em>' feature
	 * @generated
	 */
	public Decimal getProjectBalance() {
		return projectBalance;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectBalance() <em>projectBalance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectBalance() projectBalance}' feature.
	 * @generated
	 */
	public void setProjectBalance(Decimal newProjectBalance) {
		projectBalance = newProjectBalance;
	}

	/**
	 * Returns the value of '<em><b>standardPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>standardPhase</b></em>' feature
	 * @generated
	 */
	public ReferenceType getStandardPhase() {
		return standardPhase;
	}

	/**
	 * Sets the '{@link ProjectType#getStandardPhase() <em>standardPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getStandardPhase() standardPhase}' feature.
	 * @generated
	 */
	public void setStandardPhase(ReferenceType newStandardPhase) {
		standardPhase = newStandardPhase;
	}

	/**
	 * Returns the value of '<em><b>projectPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhase</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectPhase() {
		return projectPhase;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(ReferenceType newProjectPhase) {
		projectPhase = newProjectPhase;
	}

	/**
	 * Returns the value of '<em><b>priceCeiling</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceCeiling</b></em>' feature
	 * @generated
	 */
	public Boolean getPriceCeiling() {
		return priceCeiling;
	}

	/**
	 * Sets the '{@link ProjectType#getPriceCeiling() <em>priceCeiling</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPriceCeiling() priceCeiling}' feature.
	 * @generated
	 */
	public void setPriceCeiling(Boolean newPriceCeiling) {
		priceCeiling = newPriceCeiling;
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
	 * Sets the '{@link ProjectType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(ReferenceType newWarehouse) {
		warehouse = newWarehouse;
	}

	/**
	 * Returns the value of '<em><b>projectCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectCategory</b></em>' feature
	 * @generated
	 */
	public String getProjectCategory() {
		return projectCategory;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectCategory() <em>projectCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectCategory() projectCategory}' feature.
	 * @generated
	 */
	public void setProjectCategory(String newProjectCategory) {
		projectCategory = newProjectCategory;
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
	 * Sets the '{@link ProjectType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

	/**
	 * Returns the value of '<em><b>initiativeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>initiativeType</b></em>' feature
	 * @generated
	 */
	public String getInitiativeType() {
		return initiativeType;
	}

	/**
	 * Sets the '{@link ProjectType#getInitiativeType() <em>initiativeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInitiativeType() initiativeType}' feature.
	 * @generated
	 */
	public void setInitiativeType(String newInitiativeType) {
		initiativeType = newInitiativeType;
	}

	/**
	 * Returns the value of '<em><b>projectStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStatus</b></em>' feature
	 * @generated
	 */
	public String getProjectStatus() {
		return projectStatus;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectStatus() <em>projectStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectStatus() projectStatus}' feature.
	 * @generated
	 */
	public void setProjectStatus(String newProjectStatus) {
		projectStatus = newProjectStatus;
	}

	/**
	 * Returns the value of '<em><b>workType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>workType</b></em>' feature
	 * @generated
	 */
	public String getWorkType() {
		return workType;
	}

	/**
	 * Sets the '{@link ProjectType#getWorkType() <em>workType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getWorkType() workType}' feature.
	 * @generated
	 */
	public void setWorkType(String newWorkType) {
		workType = newWorkType;
	}

	/**
	 * Returns the value of '<em><b>invoiceAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceAddress() {
		return invoiceAddress;
	}

	/**
	 * Sets the '{@link ProjectType#getInvoiceAddress() <em>invoiceAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInvoiceAddress() invoiceAddress}' feature.
	 * @generated
	 */
	public void setInvoiceAddress(ReferenceType newInvoiceAddress) {
		invoiceAddress = newInvoiceAddress;
	}

	/**
	 * Returns the value of '<em><b>phase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>phase</b></em>' feature
	 * @generated
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * Sets the '{@link ProjectType#getPhase() <em>phase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPhase() phase}' feature.
	 * @generated
	 */
	public void setPhase(String newPhase) {
		phase = newPhase;
	}

	/**
	 * Returns the value of '<em><b>generateOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>generateOrder</b></em>' feature
	 * @generated
	 */
	public Boolean getGenerateOrder() {
		return generateOrder;
	}

	/**
	 * Sets the '{@link ProjectType#getGenerateOrder() <em>generateOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getGenerateOrder() generateOrder}' feature.
	 * @generated
	 */
	public void setGenerateOrder(Boolean newGenerateOrder) {
		generateOrder = newGenerateOrder;
	}

	/**
	 * Returns the value of '<em><b>changeProjectStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>changeProjectStatus</b></em>' feature
	 * @generated
	 */
	public String getChangeProjectStatus() {
		return changeProjectStatus;
	}

	/**
	 * Sets the '{@link ProjectType#getChangeProjectStatus() <em>changeProjectStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getChangeProjectStatus() changeProjectStatus}' feature.
	 * @generated
	 */
	public void setChangeProjectStatus(String newChangeProjectStatus) {
		changeProjectStatus = newChangeProjectStatus;
	}

	/**
	 * Returns the value of '<em><b>locationAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationAddress() {
		return locationAddress;
	}

	/**
	 * Sets the '{@link ProjectType#getLocationAddress() <em>locationAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getLocationAddress() locationAddress}' feature.
	 * @generated
	 */
	public void setLocationAddress(ReferenceType newLocationAddress) {
		locationAddress = newLocationAddress;
	}

	/**
	 * Returns the value of '<em><b>priceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>priceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPriceList() {
		return priceList;
	}

	/**
	 * Sets the '{@link ProjectType#getPriceList() <em>priceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPriceList() priceList}' feature.
	 * @generated
	 */
	public void setPriceList(ReferenceType newPriceList) {
		priceList = newPriceList;
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
	 * Sets the '{@link ProjectType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFormOfPayment() formOfPayment}' feature.
	 * @generated
	 */
	public void setFormOfPayment(String newFormOfPayment) {
		formOfPayment = newFormOfPayment;
	}

	/**
	 * Returns the value of '<em><b>invoiceToProject</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceToProject</b></em>' feature
	 * @generated
	 */
	public Boolean getInvoiceToProject() {
		return invoiceToProject;
	}

	/**
	 * Sets the '{@link ProjectType#getInvoiceToProject() <em>invoiceToProject</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInvoiceToProject() invoiceToProject}' feature.
	 * @generated
	 */
	public void setInvoiceToProject(Boolean newInvoiceToProject) {
		invoiceToProject = newInvoiceToProject;
	}

	/**
	 * Returns the value of '<em><b>plannedPoAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedPoAmount</b></em>' feature
	 * @generated
	 */
	public Decimal getPlannedPoAmount() {
		return plannedPoAmount;
	}

	/**
	 * Sets the '{@link ProjectType#getPlannedPoAmount() <em>plannedPoAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPlannedPoAmount() plannedPoAmount}' feature.
	 * @generated
	 */
	public void setPlannedPoAmount(Decimal newPlannedPoAmount) {
		plannedPoAmount = newPlannedPoAmount;
	}

	/**
	 * Returns the value of '<em><b>lastPlannedProposalDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastPlannedProposalDate</b></em>' feature
	 * @generated
	 */
	public DateTime getLastPlannedProposalDate() {
		return lastPlannedProposalDate;
	}

	/**
	 * Sets the '{@link ProjectType#getLastPlannedProposalDate() <em>lastPlannedProposalDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getLastPlannedProposalDate() lastPlannedProposalDate}' feature.
	 * @generated
	 */
	public void setLastPlannedProposalDate(DateTime newLastPlannedProposalDate) {
		lastPlannedProposalDate = newLastPlannedProposalDate;
	}

	/**
	 * Returns the value of '<em><b>numberOfCopies</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfCopies</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfCopies() {
		return numberOfCopies;
	}

	/**
	 * Sets the '{@link ProjectType#getNumberOfCopies() <em>numberOfCopies</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getNumberOfCopies() numberOfCopies}' feature.
	 * @generated
	 */
	public void setNumberOfCopies(Long newNumberOfCopies) {
		numberOfCopies = newNumberOfCopies;
	}

	/**
	 * Returns the value of '<em><b>accountNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>accountNo</b></em>' feature
	 * @generated
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * Sets the '{@link ProjectType#getAccountNo() <em>accountNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getAccountNo() accountNo}' feature.
	 * @generated
	 */
	public void setAccountNo(String newAccountNo) {
		accountNo = newAccountNo;
	}

	/**
	 * Returns the value of '<em><b>plannedExpenses</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>plannedExpenses</b></em>' feature
	 * @generated
	 */
	public Decimal getPlannedExpenses() {
		return plannedExpenses;
	}

	/**
	 * Sets the '{@link ProjectType#getPlannedExpenses() <em>plannedExpenses</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPlannedExpenses() plannedExpenses}' feature.
	 * @generated
	 */
	public void setPlannedExpenses(Decimal newPlannedExpenses) {
		plannedExpenses = newPlannedExpenses;
	}

	/**
	 * Returns the value of '<em><b>expensesMargin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expensesMargin</b></em>' feature
	 * @generated
	 */
	public Decimal getExpensesMargin() {
		return expensesMargin;
	}

	/**
	 * Sets the '{@link ProjectType#getExpensesMargin() <em>expensesMargin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getExpensesMargin() expensesMargin}' feature.
	 * @generated
	 */
	public void setExpensesMargin(Decimal newExpensesMargin) {
		expensesMargin = newExpensesMargin;
	}

	/**
	 * Returns the value of '<em><b>reinvoicedExpenses</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reinvoicedExpenses</b></em>' feature
	 * @generated
	 */
	public Decimal getReinvoicedExpenses() {
		return reinvoicedExpenses;
	}

	/**
	 * Sets the '{@link ProjectType#getReinvoicedExpenses() <em>reinvoicedExpenses</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getReinvoicedExpenses() reinvoicedExpenses}' feature.
	 * @generated
	 */
	public void setReinvoicedExpenses(Decimal newReinvoicedExpenses) {
		reinvoicedExpenses = newReinvoicedExpenses;
	}

	/**
	 * Returns the value of '<em><b>personInCharge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>personInCharge</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPersonInCharge() {
		return personInCharge;
	}

	/**
	 * Sets the '{@link ProjectType#getPersonInCharge() <em>personInCharge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPersonInCharge() personInCharge}' feature.
	 * @generated
	 */
	public void setPersonInCharge(ReferenceType newPersonInCharge) {
		personInCharge = newPersonInCharge;
	}

	/**
	 * Returns the value of '<em><b>serviceCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serviceCost</b></em>' feature
	 * @generated
	 */
	public Decimal getServiceCost() {
		return serviceCost;
	}

	/**
	 * Sets the '{@link ProjectType#getServiceCost() <em>serviceCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getServiceCost() serviceCost}' feature.
	 * @generated
	 */
	public void setServiceCost(Decimal newServiceCost) {
		serviceCost = newServiceCost;
	}

	/**
	 * Returns the value of '<em><b>serviceMargin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serviceMargin</b></em>' feature
	 * @generated
	 */
	public Decimal getServiceMargin() {
		return serviceMargin;
	}

	/**
	 * Sets the '{@link ProjectType#getServiceMargin() <em>serviceMargin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getServiceMargin() serviceMargin}' feature.
	 * @generated
	 */
	public void setServiceMargin(Decimal newServiceMargin) {
		serviceMargin = newServiceMargin;
	}

	/**
	 * Returns the value of '<em><b>serviceRevenue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serviceRevenue</b></em>' feature
	 * @generated
	 */
	public Decimal getServiceRevenue() {
		return serviceRevenue;
	}

	/**
	 * Sets the '{@link ProjectType#getServiceRevenue() <em>serviceRevenue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getServiceRevenue() serviceRevenue}' feature.
	 * @generated
	 */
	public void setServiceRevenue(Decimal newServiceRevenue) {
		serviceRevenue = newServiceRevenue;
	}

	/**
	 * Returns the value of '<em><b>setProjectType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>setProjectType</b></em>' feature
	 * @generated
	 */
	public Boolean getSetProjectType() {
		return setProjectType;
	}

	/**
	 * Sets the '{@link ProjectType#getSetProjectType() <em>setProjectType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getSetProjectType() setProjectType}' feature.
	 * @generated
	 */
	public void setSetProjectType(Boolean newSetProjectType) {
		setProjectType = newSetProjectType;
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
	 * Sets the '{@link ProjectType#getStartingDate() <em>startingDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getStartingDate() startingDate}' feature.
	 * @generated
	 */
	public void setStartingDate(DateTime newStartingDate) {
		startingDate = newStartingDate;
	}

	/**
	 * Returns the value of '<em><b>servicesProvidedCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>servicesProvidedCost</b></em>' feature
	 * @generated
	 */
	public Decimal getServicesProvidedCost() {
		return servicesProvidedCost;
	}

	/**
	 * Sets the '{@link ProjectType#getServicesProvidedCost() <em>servicesProvidedCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getServicesProvidedCost() servicesProvidedCost}' feature.
	 * @generated
	 */
	public void setServicesProvidedCost(Decimal newServicesProvidedCost) {
		servicesProvidedCost = newServicesProvidedCost;
	}

	/**
	 * Returns the value of '<em><b>outsourcedCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>outsourcedCost</b></em>' feature
	 * @generated
	 */
	public Decimal getOutsourcedCost() {
		return outsourcedCost;
	}

	/**
	 * Sets the '{@link ProjectType#getOutsourcedCost() <em>outsourcedCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getOutsourcedCost() outsourcedCost}' feature.
	 * @generated
	 */
	public void setOutsourcedCost(Decimal newOutsourcedCost) {
		outsourcedCost = newOutsourcedCost;
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
	 * Sets the '{@link ProjectType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
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
	 * Sets the '{@link ProjectType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctVList(
			ReferenceType newAPRMFinAccTransactionAcctVList) {
		aPRMFinAccTransactionAcctVList = newAPRMFinAccTransactionAcctVList;
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAPRMFinaccTransactionVList() {
		return aPRMFinaccTransactionVList;
	}

	/**
	 * Sets the '{@link ProjectType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionVList(
			ReferenceType newAPRMFinaccTransactionVList) {
		aPRMFinaccTransactionVList = newAPRMFinaccTransactionVList;
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
	 * Sets the '{@link ProjectType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>activeProposalVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activeProposalVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getActiveProposalVList() {
		return activeProposalVList;
	}

	/**
	 * Sets the '{@link ProjectType#getActiveProposalVList() <em>activeProposalVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getActiveProposalVList() activeProposalVList}' feature.
	 * @generated
	 */
	public void setActiveProposalVList(ReferenceType newActiveProposalVList) {
		activeProposalVList = newActiveProposalVList;
	}

	/**
	 * Returns the value of '<em><b>fINFinaccTransactionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransactionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinaccTransactionList() {
		return fINFinaccTransactionList;
	}

	/**
	 * Sets the '{@link ProjectType#getFINFinaccTransactionList() <em>fINFinaccTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFINFinaccTransactionList() fINFinaccTransactionList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionList(
			ReferenceType newFINFinaccTransactionList) {
		fINFinaccTransactionList = newFINFinaccTransactionList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentList() {
		return fINPaymentList;
	}

	/**
	 * Sets the '{@link ProjectType#getFINPaymentList() <em>fINPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFINPaymentList() fINPaymentList}' feature.
	 * @generated
	 */
	public void setFINPaymentList(ReferenceType newFINPaymentList) {
		fINPaymentList = newFINPaymentList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentDetailVList() {
		return fINPaymentDetailVList;
	}

	/**
	 * Sets the '{@link ProjectType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(ReferenceType newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentScheduleDetailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentScheduleDetailList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentScheduleDetailList() {
		return fINPaymentScheduleDetailList;
	}

	/**
	 * Sets the '{@link ProjectType#getFINPaymentScheduleDetailList() <em>fINPaymentScheduleDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFINPaymentScheduleDetailList() fINPaymentScheduleDetailList}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleDetailList(
			ReferenceType newFINPaymentScheduleDetailList) {
		fINPaymentScheduleDetailList = newFINPaymentScheduleDetailList;
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINReconciliationLineVList() {
		return fINReconciliationLineVList;
	}

	/**
	 * Sets the '{@link ProjectType#getFINReconciliationLineVList() <em>fINReconciliationLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFINReconciliationLineVList() fINReconciliationLineVList}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineVList(
			ReferenceType newFINReconciliationLineVList) {
		fINReconciliationLineVList = newFINReconciliationLineVList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombinationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombinationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAccountingCombinationList() {
		return financialMgmtAccountingCombinationList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtAccountingCombinationList() <em>financialMgmtAccountingCombinationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtAccountingCombinationList() financialMgmtAccountingCombinationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombinationList(
			ReferenceType newFinancialMgmtAccountingCombinationList) {
		financialMgmtAccountingCombinationList = newFinancialMgmtAccountingCombinationList;
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
	 * Sets the '{@link ProjectType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFactList(
			ReferenceType newFinancialMgmtAccountingFactList) {
		financialMgmtAccountingFactList = newFinancialMgmtAccountingFactList;
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
	 * Sets the '{@link ProjectType#getFinancialMgmtAcctSchemaElementList() <em>financialMgmtAcctSchemaElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtAcctSchemaElementList() financialMgmtAcctSchemaElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElementList(
			ReferenceType newFinancialMgmtAcctSchemaElementList) {
		financialMgmtAcctSchemaElementList = newFinancialMgmtAcctSchemaElementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortizationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortizationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAmortizationList() {
		return financialMgmtAmortizationList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtAmortizationList() <em>financialMgmtAmortizationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtAmortizationList() financialMgmtAmortizationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortizationList(
			ReferenceType newFinancialMgmtAmortizationList) {
		financialMgmtAmortizationList = newFinancialMgmtAmortizationList;
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
	 * Sets the '{@link ProjectType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashJournalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashJournalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashJournalList() {
		return financialMgmtCashJournalList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtCashJournalList() <em>financialMgmtCashJournalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtCashJournalList() financialMgmtCashJournalList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashJournalList(
			ReferenceType newFinancialMgmtCashJournalList) {
		financialMgmtCashJournalList = newFinancialMgmtCashJournalList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDPManagementList() {
		return financialMgmtDPManagementList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtDPManagementList() <em>financialMgmtDPManagementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtDPManagementList() financialMgmtDPManagementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagementList(
			ReferenceType newFinancialMgmtDPManagementList) {
		financialMgmtDPManagementList = newFinancialMgmtDPManagementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentList() {
		return financialMgmtDebtPaymentList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentList(
			ReferenceType newFinancialMgmtDebtPaymentList) {
		financialMgmtDebtPaymentList = newFinancialMgmtDebtPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentGenerateVList() {
		return financialMgmtDebtPaymentGenerateVList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVList(
			ReferenceType newFinancialMgmtDebtPaymentGenerateVList) {
		financialMgmtDebtPaymentGenerateVList = newFinancialMgmtDebtPaymentGenerateVList;
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
	 * Sets the '{@link ProjectType#getFinancialMgmtGLJournalList() <em>financialMgmtGLJournalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtGLJournalList() financialMgmtGLJournalList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalList(
			ReferenceType newFinancialMgmtGLJournalList) {
		financialMgmtGLJournalList = newFinancialMgmtGLJournalList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLJournalLineList() {
		return financialMgmtGLJournalLineList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtSettlementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtSettlementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtSettlementList() {
		return financialMgmtSettlementList;
	}

	/**
	 * Sets the '{@link ProjectType#getFinancialMgmtSettlementList() <em>financialMgmtSettlementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getFinancialMgmtSettlementList() financialMgmtSettlementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtSettlementList(
			ReferenceType newFinancialMgmtSettlementList) {
		financialMgmtSettlementList = newFinancialMgmtSettlementList;
	}

	/**
	 * Returns the value of '<em><b>invoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceList() {
		return invoiceList;
	}

	/**
	 * Sets the '{@link ProjectType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(ReferenceType newInvoiceList) {
		invoiceList = newInvoiceList;
	}

	/**
	 * Returns the value of '<em><b>invoiceLineAccountingDimensionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineAccountingDimensionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceLineAccountingDimensionList() {
		return invoiceLineAccountingDimensionList;
	}

	/**
	 * Sets the '{@link ProjectType#getInvoiceLineAccountingDimensionList() <em>invoiceLineAccountingDimensionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getInvoiceLineAccountingDimensionList() invoiceLineAccountingDimensionList}' feature.
	 * @generated
	 */
	public void setInvoiceLineAccountingDimensionList(
			ReferenceType newInvoiceLineAccountingDimensionList) {
		invoiceLineAccountingDimensionList = newInvoiceLineAccountingDimensionList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInternalMovementList() {
		return materialMgmtInternalMovementList;
	}

	/**
	 * Sets the '{@link ProjectType#getMaterialMgmtInternalMovementList() <em>materialMgmtInternalMovementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getMaterialMgmtInternalMovementList() materialMgmtInternalMovementList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementList(
			ReferenceType newMaterialMgmtInternalMovementList) {
		materialMgmtInternalMovementList = newMaterialMgmtInternalMovementList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInventoryCountList() {
		return materialMgmtInventoryCountList;
	}

	/**
	 * Sets the '{@link ProjectType#getMaterialMgmtInventoryCountList() <em>materialMgmtInventoryCountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getMaterialMgmtInventoryCountList() materialMgmtInventoryCountList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountList(
			ReferenceType newMaterialMgmtInventoryCountList) {
		materialMgmtInventoryCountList = newMaterialMgmtInventoryCountList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionTransactionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionTransactionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtProductionTransactionList() {
		return materialMgmtProductionTransactionList;
	}

	/**
	 * Sets the '{@link ProjectType#getMaterialMgmtProductionTransactionList() <em>materialMgmtProductionTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getMaterialMgmtProductionTransactionList() materialMgmtProductionTransactionList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionTransactionList(
			ReferenceType newMaterialMgmtProductionTransactionList) {
		materialMgmtProductionTransactionList = newMaterialMgmtProductionTransactionList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutList() {
		return materialMgmtShipmentInOutList;
	}

	/**
	 * Sets the '{@link ProjectType#getMaterialMgmtShipmentInOutList() <em>materialMgmtShipmentInOutList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getMaterialMgmtShipmentInOutList() materialMgmtShipmentInOutList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutList(
			ReferenceType newMaterialMgmtShipmentInOutList) {
		materialMgmtShipmentInOutList = newMaterialMgmtShipmentInOutList;
	}

	/**
	 * Returns the value of '<em><b>orderList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderList() {
		return orderList;
	}

	/**
	 * Sets the '{@link ProjectType#getOrderList() <em>orderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getOrderList() orderList}' feature.
	 * @generated
	 */
	public void setOrderList(ReferenceType newOrderList) {
		orderList = newOrderList;
	}

	/**
	 * Returns the value of '<em><b>projectAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccountsList</b></em>' feature
	 * @generated
	 */
	public ProjectAccountsListType getProjectAccountsList() {
		return projectAccountsList;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectAccountsList() <em>projectAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectAccountsList() projectAccountsList}' feature.
	 * @generated
	 */
	public void setProjectAccountsList(
			ProjectAccountsListType newProjectAccountsList) {
		projectAccountsList = newProjectAccountsList;
	}

	/**
	 * Returns the value of '<em><b>projectIssueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectIssueList</b></em>' feature
	 * @generated
	 */
	public ProjectIssueListType getProjectIssueList() {
		return projectIssueList;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectIssueList() <em>projectIssueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectIssueList() projectIssueList}' feature.
	 * @generated
	 */
	public void setProjectIssueList(ProjectIssueListType newProjectIssueList) {
		projectIssueList = newProjectIssueList;
	}

	/**
	 * Returns the value of '<em><b>projectLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLineList</b></em>' feature
	 * @generated
	 */
	public ProjectLineListType getProjectLineList() {
		return projectLineList;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectLineList() <em>projectLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectLineList() projectLineList}' feature.
	 * @generated
	 */
	public void setProjectLineList(ProjectLineListType newProjectLineList) {
		projectLineList = newProjectLineList;
	}

	/**
	 * Returns the value of '<em><b>projectPhaseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhaseList</b></em>' feature
	 * @generated
	 */
	public ProjectPhaseListType getProjectPhaseList() {
		return projectPhaseList;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectPhaseList() <em>projectPhaseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectPhaseList() projectPhaseList}' feature.
	 * @generated
	 */
	public void setProjectPhaseList(ProjectPhaseListType newProjectPhaseList) {
		projectPhaseList = newProjectPhaseList;
	}

	/**
	 * Returns the value of '<em><b>projectProposalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalList</b></em>' feature
	 * @generated
	 */
	public ProjectProposalListType getProjectProposalList() {
		return projectProposalList;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectProposalList() <em>projectProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectProposalList() projectProposalList}' feature.
	 * @generated
	 */
	public void setProjectProposalList(
			ProjectProposalListType newProjectProposalList) {
		projectProposalList = newProjectProposalList;
	}

	/**
	 * Returns the value of '<em><b>projectVendorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectVendorList</b></em>' feature
	 * @generated
	 */
	public ProjectVendorListType getProjectVendorList() {
		return projectVendorList;
	}

	/**
	 * Sets the '{@link ProjectType#getProjectVendorList() <em>projectVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getProjectVendorList() projectVendorList}' feature.
	 * @generated
	 */
	public void setProjectVendorList(ProjectVendorListType newProjectVendorList) {
		projectVendorList = newProjectVendorList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineList() {
		return timeAndExpenseSheetLineList;
	}

	/**
	 * Sets the '{@link ProjectType#getTimeAndExpenseSheetLineList() <em>timeAndExpenseSheetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getTimeAndExpenseSheetLineList() timeAndExpenseSheetLineList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineList(
			ReferenceType newTimeAndExpenseSheetLineList) {
		timeAndExpenseSheetLineList = newTimeAndExpenseSheetLineList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineVList() {
		return timeAndExpenseSheetLineVList;
	}

	/**
	 * Sets the '{@link ProjectType#getTimeAndExpenseSheetLineVList() <em>timeAndExpenseSheetLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getTimeAndExpenseSheetLineVList() timeAndExpenseSheetLineVList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineVList(
			ReferenceType newTimeAndExpenseSheetLineVList) {
		timeAndExpenseSheetLineVList = newTimeAndExpenseSheetLineVList;
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
	 * Sets the '{@link ProjectType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getId1() id1}' feature.
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
	 * Sets the '{@link ProjectType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ProjectType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#isReference() reference}' feature.
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
	public List<ProjectTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ProjectType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProjectType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ProjectTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ProjectType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
