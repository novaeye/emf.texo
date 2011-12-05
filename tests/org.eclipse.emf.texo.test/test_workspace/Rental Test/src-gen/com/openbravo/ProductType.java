package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ProductType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ProductType {

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
	private String helpComment = null;

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
	private String sKU = null;

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
	private ReferenceType salesRepresentative = null;

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
	private Boolean stocked = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean purchase = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean sale = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean billOfMaterials = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean printDetailsOnInvoice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean printDetailsOnPickList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean bOMVerified = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String classification = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal volume = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal weight = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal shelfWidth = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal shelfHeight = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal shelfDepth = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long unitsPerPallet = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType taxCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType resource = null;

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
	private Boolean processNow = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType expenseType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String productType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String imageURL = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String descriptionURL = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long guaranteedDays = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String versionNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType attributeSet = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType attributeSetValue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String downloadURL = null;

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
	private ReferenceType storageBin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType image = null;

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
	private Boolean printPrice = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String name2 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String costType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal standardCost = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal minimumStock = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean enforceAttribute = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean calculated = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType processPlan = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean production = null;

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
	private Decimal minimumLeadTime = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType planner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType planningMethod = null;

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
	private Decimal minQuantity = null;

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
	private Boolean quantityType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal safetyStock = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String useAttributeSetValueAs = null;

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
	private ApprovedVendorListType approvedVendorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerProductTemplateList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationProductForFreightList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType externalPOSProductList = null;

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
	private ReferenceType financialMgmtAssetList = null;

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
	private ReferenceType financialMgmtGLJournalLineList = null;

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
	private ReferenceType lotList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPProductionRunList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPProductionRunLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPPurchasingRunList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPPurchasingRunLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType mRPSalesForecastLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingCaseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingGlobalUseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingOperationProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingProductionLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingWorkRequirementProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtCostingListType materialMgmtCostingList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInternalConsumptionLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInternalMovementLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtInventoryCountLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtMaterialTransactionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtProductionPlanList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtShipmentInOutLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtStorageDetailList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType materialMgmtStoragePendingList = null;

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
	private ReferenceType pricingAdjustmentProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pricingDiscountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pricingPriceListSchemeLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingProductPriceListType pricingProductPriceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pricingVolumeDiscountProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementPOInvoiceMatchList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementReceiptInvoiceMatchList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementRequisitionLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductAccountsListType productAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductBOMListType productBOMList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productBOMBOMProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productByPriceAndWarehouseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductCustomerListType productCustomerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductOrgListType productOrgList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductStockViewListType productStockViewList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductSubstituteListType productSubstituteList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productSubstituteSubstituteProductList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductTrlListType productTrlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductUOMListType productUOMList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectIssueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectPhaseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectProposalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectStandardPhaseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectStandardTaskList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectTaskList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialOrderPickEditLinesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialReceiptPickEditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType returnMaterialShipmentPickEditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCommissionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesCommissionLineList = null;

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
	private List<ProductTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ProductTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ProductType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getId() id}' feature.
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
	 * Sets the '{@link ProductType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getClient() client}' feature.
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
	 * Sets the '{@link ProductType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ProductType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getActive() active}' feature.
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
	 * Sets the '{@link ProductType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ProductType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ProductType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ProductType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ProductType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSearchKey() searchKey}' feature.
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
	 * Sets the '{@link ProductType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getName() name}' feature.
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
	 * Sets the '{@link ProductType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getDescription() description}' feature.
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
	 * Sets the '{@link ProductType#getComments() <em>comments</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getComments() comments}' feature.
	 * @generated
	 */
	public void setComments(String newComments) {
		comments = newComments;
	}

	/**
	 * Returns the value of '<em><b>helpComment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>helpComment</b></em>' feature
	 * @generated
	 */
	public String getHelpComment() {
		return helpComment;
	}

	/**
	 * Sets the '{@link ProductType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
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
	 * Sets the '{@link ProductType#getUPCEAN() <em>uPCEAN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getUPCEAN() uPCEAN}' feature.
	 * @generated
	 */
	public void setUPCEAN(String newUPCEAN) {
		uPCEAN = newUPCEAN;
	}

	/**
	 * Returns the value of '<em><b>sKU</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sKU</b></em>' feature
	 * @generated
	 */
	public String getSKU() {
		return sKU;
	}

	/**
	 * Sets the '{@link ProductType#getSKU() <em>sKU</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSKU() sKU}' feature.
	 * @generated
	 */
	public void setSKU(String newSKU) {
		sKU = newSKU;
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
	 * Sets the '{@link ProductType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ReferenceType newUOM) {
		uOM = newUOM;
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
	 * Sets the '{@link ProductType#getSalesRepresentative() <em>salesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSalesRepresentative() salesRepresentative}' feature.
	 * @generated
	 */
	public void setSalesRepresentative(ReferenceType newSalesRepresentative) {
		salesRepresentative = newSalesRepresentative;
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
	 * Sets the '{@link ProductType#getSummaryLevel() <em>summaryLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSummaryLevel() summaryLevel}' feature.
	 * @generated
	 */
	public void setSummaryLevel(Boolean newSummaryLevel) {
		summaryLevel = newSummaryLevel;
	}

	/**
	 * Returns the value of '<em><b>stocked</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>stocked</b></em>' feature
	 * @generated
	 */
	public Boolean getStocked() {
		return stocked;
	}

	/**
	 * Sets the '{@link ProductType#getStocked() <em>stocked</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getStocked() stocked}' feature.
	 * @generated
	 */
	public void setStocked(Boolean newStocked) {
		stocked = newStocked;
	}

	/**
	 * Returns the value of '<em><b>purchase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>purchase</b></em>' feature
	 * @generated
	 */
	public Boolean getPurchase() {
		return purchase;
	}

	/**
	 * Sets the '{@link ProductType#getPurchase() <em>purchase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPurchase() purchase}' feature.
	 * @generated
	 */
	public void setPurchase(Boolean newPurchase) {
		purchase = newPurchase;
	}

	/**
	 * Returns the value of '<em><b>sale</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sale</b></em>' feature
	 * @generated
	 */
	public Boolean getSale() {
		return sale;
	}

	/**
	 * Sets the '{@link ProductType#getSale() <em>sale</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSale() sale}' feature.
	 * @generated
	 */
	public void setSale(Boolean newSale) {
		sale = newSale;
	}

	/**
	 * Returns the value of '<em><b>billOfMaterials</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>billOfMaterials</b></em>' feature
	 * @generated
	 */
	public Boolean getBillOfMaterials() {
		return billOfMaterials;
	}

	/**
	 * Sets the '{@link ProductType#getBillOfMaterials() <em>billOfMaterials</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getBillOfMaterials() billOfMaterials}' feature.
	 * @generated
	 */
	public void setBillOfMaterials(Boolean newBillOfMaterials) {
		billOfMaterials = newBillOfMaterials;
	}

	/**
	 * Returns the value of '<em><b>printDetailsOnInvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printDetailsOnInvoice</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintDetailsOnInvoice() {
		return printDetailsOnInvoice;
	}

	/**
	 * Sets the '{@link ProductType#getPrintDetailsOnInvoice() <em>printDetailsOnInvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPrintDetailsOnInvoice() printDetailsOnInvoice}' feature.
	 * @generated
	 */
	public void setPrintDetailsOnInvoice(Boolean newPrintDetailsOnInvoice) {
		printDetailsOnInvoice = newPrintDetailsOnInvoice;
	}

	/**
	 * Returns the value of '<em><b>printDetailsOnPickList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printDetailsOnPickList</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintDetailsOnPickList() {
		return printDetailsOnPickList;
	}

	/**
	 * Sets the '{@link ProductType#getPrintDetailsOnPickList() <em>printDetailsOnPickList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPrintDetailsOnPickList() printDetailsOnPickList}' feature.
	 * @generated
	 */
	public void setPrintDetailsOnPickList(Boolean newPrintDetailsOnPickList) {
		printDetailsOnPickList = newPrintDetailsOnPickList;
	}

	/**
	 * Returns the value of '<em><b>bOMVerified</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bOMVerified</b></em>' feature
	 * @generated
	 */
	public Boolean getBOMVerified() {
		return bOMVerified;
	}

	/**
	 * Sets the '{@link ProductType#getBOMVerified() <em>bOMVerified</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getBOMVerified() bOMVerified}' feature.
	 * @generated
	 */
	public void setBOMVerified(Boolean newBOMVerified) {
		bOMVerified = newBOMVerified;
	}

	/**
	 * Returns the value of '<em><b>productCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the '{@link ProductType#getProductCategory() <em>productCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductCategory() productCategory}' feature.
	 * @generated
	 */
	public void setProductCategory(ReferenceType newProductCategory) {
		productCategory = newProductCategory;
	}

	/**
	 * Returns the value of '<em><b>classification</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>classification</b></em>' feature
	 * @generated
	 */
	public String getClassification() {
		return classification;
	}

	/**
	 * Sets the '{@link ProductType#getClassification() <em>classification</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getClassification() classification}' feature.
	 * @generated
	 */
	public void setClassification(String newClassification) {
		classification = newClassification;
	}

	/**
	 * Returns the value of '<em><b>volume</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>volume</b></em>' feature
	 * @generated
	 */
	public Decimal getVolume() {
		return volume;
	}

	/**
	 * Sets the '{@link ProductType#getVolume() <em>volume</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getVolume() volume}' feature.
	 * @generated
	 */
	public void setVolume(Decimal newVolume) {
		volume = newVolume;
	}

	/**
	 * Returns the value of '<em><b>weight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>weight</b></em>' feature
	 * @generated
	 */
	public Decimal getWeight() {
		return weight;
	}

	/**
	 * Sets the '{@link ProductType#getWeight() <em>weight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getWeight() weight}' feature.
	 * @generated
	 */
	public void setWeight(Decimal newWeight) {
		weight = newWeight;
	}

	/**
	 * Returns the value of '<em><b>shelfWidth</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shelfWidth</b></em>' feature
	 * @generated
	 */
	public Decimal getShelfWidth() {
		return shelfWidth;
	}

	/**
	 * Sets the '{@link ProductType#getShelfWidth() <em>shelfWidth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getShelfWidth() shelfWidth}' feature.
	 * @generated
	 */
	public void setShelfWidth(Decimal newShelfWidth) {
		shelfWidth = newShelfWidth;
	}

	/**
	 * Returns the value of '<em><b>shelfHeight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shelfHeight</b></em>' feature
	 * @generated
	 */
	public Decimal getShelfHeight() {
		return shelfHeight;
	}

	/**
	 * Sets the '{@link ProductType#getShelfHeight() <em>shelfHeight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getShelfHeight() shelfHeight}' feature.
	 * @generated
	 */
	public void setShelfHeight(Decimal newShelfHeight) {
		shelfHeight = newShelfHeight;
	}

	/**
	 * Returns the value of '<em><b>shelfDepth</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shelfDepth</b></em>' feature
	 * @generated
	 */
	public Decimal getShelfDepth() {
		return shelfDepth;
	}

	/**
	 * Sets the '{@link ProductType#getShelfDepth() <em>shelfDepth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getShelfDepth() shelfDepth}' feature.
	 * @generated
	 */
	public void setShelfDepth(Decimal newShelfDepth) {
		shelfDepth = newShelfDepth;
	}

	/**
	 * Returns the value of '<em><b>unitsPerPallet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>unitsPerPallet</b></em>' feature
	 * @generated
	 */
	public Long getUnitsPerPallet() {
		return unitsPerPallet;
	}

	/**
	 * Sets the '{@link ProductType#getUnitsPerPallet() <em>unitsPerPallet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getUnitsPerPallet() unitsPerPallet}' feature.
	 * @generated
	 */
	public void setUnitsPerPallet(Long newUnitsPerPallet) {
		unitsPerPallet = newUnitsPerPallet;
	}

	/**
	 * Returns the value of '<em><b>taxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTaxCategory() {
		return taxCategory;
	}

	/**
	 * Sets the '{@link ProductType#getTaxCategory() <em>taxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getTaxCategory() taxCategory}' feature.
	 * @generated
	 */
	public void setTaxCategory(ReferenceType newTaxCategory) {
		taxCategory = newTaxCategory;
	}

	/**
	 * Returns the value of '<em><b>resource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resource</b></em>' feature
	 * @generated
	 */
	public ReferenceType getResource() {
		return resource;
	}

	/**
	 * Sets the '{@link ProductType#getResource() <em>resource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getResource() resource}' feature.
	 * @generated
	 */
	public void setResource(ReferenceType newResource) {
		resource = newResource;
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
	 * Sets the '{@link ProductType#getDiscontinued() <em>discontinued</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getDiscontinued() discontinued}' feature.
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
	 * Sets the '{@link ProductType#getDiscontinuedBy() <em>discontinuedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getDiscontinuedBy() discontinuedBy}' feature.
	 * @generated
	 */
	public void setDiscontinuedBy(DateTime newDiscontinuedBy) {
		discontinuedBy = newDiscontinuedBy;
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
	 * Sets the '{@link ProductType#getProcessNow() <em>processNow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProcessNow() processNow}' feature.
	 * @generated
	 */
	public void setProcessNow(Boolean newProcessNow) {
		processNow = newProcessNow;
	}

	/**
	 * Returns the value of '<em><b>expenseType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseType</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExpenseType() {
		return expenseType;
	}

	/**
	 * Sets the '{@link ProductType#getExpenseType() <em>expenseType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getExpenseType() expenseType}' feature.
	 * @generated
	 */
	public void setExpenseType(ReferenceType newExpenseType) {
		expenseType = newExpenseType;
	}

	/**
	 * Returns the value of '<em><b>productType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productType</b></em>' feature
	 * @generated
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * Sets the '{@link ProductType#getProductType() <em>productType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductType() productType}' feature.
	 * @generated
	 */
	public void setProductType(String newProductType) {
		productType = newProductType;
	}

	/**
	 * Returns the value of '<em><b>imageURL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>imageURL</b></em>' feature
	 * @generated
	 */
	public String getImageURL() {
		return imageURL;
	}

	/**
	 * Sets the '{@link ProductType#getImageURL() <em>imageURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getImageURL() imageURL}' feature.
	 * @generated
	 */
	public void setImageURL(String newImageURL) {
		imageURL = newImageURL;
	}

	/**
	 * Returns the value of '<em><b>descriptionURL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>descriptionURL</b></em>' feature
	 * @generated
	 */
	public String getDescriptionURL() {
		return descriptionURL;
	}

	/**
	 * Sets the '{@link ProductType#getDescriptionURL() <em>descriptionURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getDescriptionURL() descriptionURL}' feature.
	 * @generated
	 */
	public void setDescriptionURL(String newDescriptionURL) {
		descriptionURL = newDescriptionURL;
	}

	/**
	 * Returns the value of '<em><b>guaranteedDays</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>guaranteedDays</b></em>' feature
	 * @generated
	 */
	public Long getGuaranteedDays() {
		return guaranteedDays;
	}

	/**
	 * Sets the '{@link ProductType#getGuaranteedDays() <em>guaranteedDays</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getGuaranteedDays() guaranteedDays}' feature.
	 * @generated
	 */
	public void setGuaranteedDays(Long newGuaranteedDays) {
		guaranteedDays = newGuaranteedDays;
	}

	/**
	 * Returns the value of '<em><b>versionNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>versionNo</b></em>' feature
	 * @generated
	 */
	public String getVersionNo() {
		return versionNo;
	}

	/**
	 * Sets the '{@link ProductType#getVersionNo() <em>versionNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getVersionNo() versionNo}' feature.
	 * @generated
	 */
	public void setVersionNo(String newVersionNo) {
		versionNo = newVersionNo;
	}

	/**
	 * Returns the value of '<em><b>attributeSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSet</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAttributeSet() {
		return attributeSet;
	}

	/**
	 * Sets the '{@link ProductType#getAttributeSet() <em>attributeSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getAttributeSet() attributeSet}' feature.
	 * @generated
	 */
	public void setAttributeSet(ReferenceType newAttributeSet) {
		attributeSet = newAttributeSet;
	}

	/**
	 * Returns the value of '<em><b>attributeSetValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSetValue</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAttributeSetValue() {
		return attributeSetValue;
	}

	/**
	 * Sets the '{@link ProductType#getAttributeSetValue() <em>attributeSetValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getAttributeSetValue() attributeSetValue}' feature.
	 * @generated
	 */
	public void setAttributeSetValue(ReferenceType newAttributeSetValue) {
		attributeSetValue = newAttributeSetValue;
	}

	/**
	 * Returns the value of '<em><b>downloadURL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>downloadURL</b></em>' feature
	 * @generated
	 */
	public String getDownloadURL() {
		return downloadURL;
	}

	/**
	 * Sets the '{@link ProductType#getDownloadURL() <em>downloadURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getDownloadURL() downloadURL}' feature.
	 * @generated
	 */
	public void setDownloadURL(String newDownloadURL) {
		downloadURL = newDownloadURL;
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
	 * Sets the '{@link ProductType#getFreightCategory() <em>freightCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFreightCategory() freightCategory}' feature.
	 * @generated
	 */
	public void setFreightCategory(ReferenceType newFreightCategory) {
		freightCategory = newFreightCategory;
	}

	/**
	 * Returns the value of '<em><b>storageBin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>storageBin</b></em>' feature
	 * @generated
	 */
	public ReferenceType getStorageBin() {
		return storageBin;
	}

	/**
	 * Sets the '{@link ProductType#getStorageBin() <em>storageBin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getStorageBin() storageBin}' feature.
	 * @generated
	 */
	public void setStorageBin(ReferenceType newStorageBin) {
		storageBin = newStorageBin;
	}

	/**
	 * Returns the value of '<em><b>image</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>image</b></em>' feature
	 * @generated
	 */
	public ReferenceType getImage() {
		return image;
	}

	/**
	 * Sets the '{@link ProductType#getImage() <em>image</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getImage() image}' feature.
	 * @generated
	 */
	public void setImage(ReferenceType newImage) {
		image = newImage;
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
	 * Sets the '{@link ProductType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>printPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printPrice</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintPrice() {
		return printPrice;
	}

	/**
	 * Sets the '{@link ProductType#getPrintPrice() <em>printPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPrintPrice() printPrice}' feature.
	 * @generated
	 */
	public void setPrintPrice(Boolean newPrintPrice) {
		printPrice = newPrintPrice;
	}

	/**
	 * Returns the value of '<em><b>name2</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>name2</b></em>' feature
	 * @generated
	 */
	public String getName2() {
		return name2;
	}

	/**
	 * Sets the '{@link ProductType#getName2() <em>name2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getName2() name2}' feature.
	 * @generated
	 */
	public void setName2(String newName2) {
		name2 = newName2;
	}

	/**
	 * Returns the value of '<em><b>costType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>costType</b></em>' feature
	 * @generated
	 */
	public String getCostType() {
		return costType;
	}

	/**
	 * Sets the '{@link ProductType#getCostType() <em>costType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getCostType() costType}' feature.
	 * @generated
	 */
	public void setCostType(String newCostType) {
		costType = newCostType;
	}

	/**
	 * Returns the value of '<em><b>standardCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>standardCost</b></em>' feature
	 * @generated
	 */
	public Decimal getStandardCost() {
		return standardCost;
	}

	/**
	 * Sets the '{@link ProductType#getStandardCost() <em>standardCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getStandardCost() standardCost}' feature.
	 * @generated
	 */
	public void setStandardCost(Decimal newStandardCost) {
		standardCost = newStandardCost;
	}

	/**
	 * Returns the value of '<em><b>minimumStock</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>minimumStock</b></em>' feature
	 * @generated
	 */
	public Decimal getMinimumStock() {
		return minimumStock;
	}

	/**
	 * Sets the '{@link ProductType#getMinimumStock() <em>minimumStock</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMinimumStock() minimumStock}' feature.
	 * @generated
	 */
	public void setMinimumStock(Decimal newMinimumStock) {
		minimumStock = newMinimumStock;
	}

	/**
	 * Returns the value of '<em><b>enforceAttribute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>enforceAttribute</b></em>' feature
	 * @generated
	 */
	public Boolean getEnforceAttribute() {
		return enforceAttribute;
	}

	/**
	 * Sets the '{@link ProductType#getEnforceAttribute() <em>enforceAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getEnforceAttribute() enforceAttribute}' feature.
	 * @generated
	 */
	public void setEnforceAttribute(Boolean newEnforceAttribute) {
		enforceAttribute = newEnforceAttribute;
	}

	/**
	 * Returns the value of '<em><b>calculated</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>calculated</b></em>' feature
	 * @generated
	 */
	public Boolean getCalculated() {
		return calculated;
	}

	/**
	 * Sets the '{@link ProductType#getCalculated() <em>calculated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getCalculated() calculated}' feature.
	 * @generated
	 */
	public void setCalculated(Boolean newCalculated) {
		calculated = newCalculated;
	}

	/**
	 * Returns the value of '<em><b>processPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processPlan</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessPlan() {
		return processPlan;
	}

	/**
	 * Sets the '{@link ProductType#getProcessPlan() <em>processPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProcessPlan() processPlan}' feature.
	 * @generated
	 */
	public void setProcessPlan(ReferenceType newProcessPlan) {
		processPlan = newProcessPlan;
	}

	/**
	 * Returns the value of '<em><b>production</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>production</b></em>' feature
	 * @generated
	 */
	public Boolean getProduction() {
		return production;
	}

	/**
	 * Sets the '{@link ProductType#getProduction() <em>production</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProduction() production}' feature.
	 * @generated
	 */
	public void setProduction(Boolean newProduction) {
		production = newProduction;
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
	 * Sets the '{@link ProductType#getCapacity() <em>capacity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getCapacity() capacity}' feature.
	 * @generated
	 */
	public void setCapacity(Decimal newCapacity) {
		capacity = newCapacity;
	}

	/**
	 * Returns the value of '<em><b>minimumLeadTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>minimumLeadTime</b></em>' feature
	 * @generated
	 */
	public Decimal getMinimumLeadTime() {
		return minimumLeadTime;
	}

	/**
	 * Sets the '{@link ProductType#getMinimumLeadTime() <em>minimumLeadTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMinimumLeadTime() minimumLeadTime}' feature.
	 * @generated
	 */
	public void setMinimumLeadTime(Decimal newMinimumLeadTime) {
		minimumLeadTime = newMinimumLeadTime;
	}

	/**
	 * Returns the value of '<em><b>planner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>planner</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPlanner() {
		return planner;
	}

	/**
	 * Sets the '{@link ProductType#getPlanner() <em>planner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPlanner() planner}' feature.
	 * @generated
	 */
	public void setPlanner(ReferenceType newPlanner) {
		planner = newPlanner;
	}

	/**
	 * Returns the value of '<em><b>planningMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>planningMethod</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPlanningMethod() {
		return planningMethod;
	}

	/**
	 * Sets the '{@link ProductType#getPlanningMethod() <em>planningMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPlanningMethod() planningMethod}' feature.
	 * @generated
	 */
	public void setPlanningMethod(ReferenceType newPlanningMethod) {
		planningMethod = newPlanningMethod;
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
	 * Sets the '{@link ProductType#getMaxQuantity() <em>maxQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaxQuantity() maxQuantity}' feature.
	 * @generated
	 */
	public void setMaxQuantity(Decimal newMaxQuantity) {
		maxQuantity = newMaxQuantity;
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
	 * Sets the '{@link ProductType#getMinQuantity() <em>minQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMinQuantity() minQuantity}' feature.
	 * @generated
	 */
	public void setMinQuantity(Decimal newMinQuantity) {
		minQuantity = newMinQuantity;
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
	 * Sets the '{@link ProductType#getStandardQuantity() <em>standardQuantity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getStandardQuantity() standardQuantity}' feature.
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
	public Boolean getQuantityType() {
		return quantityType;
	}

	/**
	 * Sets the '{@link ProductType#getQuantityType() <em>quantityType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getQuantityType() quantityType}' feature.
	 * @generated
	 */
	public void setQuantityType(Boolean newQuantityType) {
		quantityType = newQuantityType;
	}

	/**
	 * Returns the value of '<em><b>safetyStock</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>safetyStock</b></em>' feature
	 * @generated
	 */
	public Decimal getSafetyStock() {
		return safetyStock;
	}

	/**
	 * Sets the '{@link ProductType#getSafetyStock() <em>safetyStock</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSafetyStock() safetyStock}' feature.
	 * @generated
	 */
	public void setSafetyStock(Decimal newSafetyStock) {
		safetyStock = newSafetyStock;
	}

	/**
	 * Returns the value of '<em><b>useAttributeSetValueAs</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>useAttributeSetValueAs</b></em>' feature
	 * @generated
	 */
	public String getUseAttributeSetValueAs() {
		return useAttributeSetValueAs;
	}

	/**
	 * Sets the '{@link ProductType#getUseAttributeSetValueAs() <em>useAttributeSetValueAs</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getUseAttributeSetValueAs() useAttributeSetValueAs}' feature.
	 * @generated
	 */
	public void setUseAttributeSetValueAs(String newUseAttributeSetValueAs) {
		useAttributeSetValueAs = newUseAttributeSetValueAs;
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
	 * Sets the '{@link ProductType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	 * Sets the '{@link ProductType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
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
	 * Sets the '{@link ProductType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctVList(
			ReferenceType newAPRMFinaccTrxFullAcctVList) {
		aPRMFinaccTrxFullAcctVList = newAPRMFinaccTrxFullAcctVList;
	}

	/**
	 * Returns the value of '<em><b>approvedVendorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendorList</b></em>' feature
	 * @generated
	 */
	public ApprovedVendorListType getApprovedVendorList() {
		return approvedVendorList;
	}

	/**
	 * Sets the '{@link ProductType#getApprovedVendorList() <em>approvedVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getApprovedVendorList() approvedVendorList}' feature.
	 * @generated
	 */
	public void setApprovedVendorList(
			ApprovedVendorListType newApprovedVendorList) {
		approvedVendorList = newApprovedVendorList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerProductTemplateList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerProductTemplateList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerProductTemplateList() {
		return businessPartnerProductTemplateList;
	}

	/**
	 * Sets the '{@link ProductType#getBusinessPartnerProductTemplateList() <em>businessPartnerProductTemplateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getBusinessPartnerProductTemplateList() businessPartnerProductTemplateList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerProductTemplateList(
			ReferenceType newBusinessPartnerProductTemplateList) {
		businessPartnerProductTemplateList = newBusinessPartnerProductTemplateList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationProductForFreightList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationProductForFreightList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationProductForFreightList() {
		return clientInformationProductForFreightList;
	}

	/**
	 * Sets the '{@link ProductType#getClientInformationProductForFreightList() <em>clientInformationProductForFreightList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getClientInformationProductForFreightList() clientInformationProductForFreightList}' feature.
	 * @generated
	 */
	public void setClientInformationProductForFreightList(
			ReferenceType newClientInformationProductForFreightList) {
		clientInformationProductForFreightList = newClientInformationProductForFreightList;
	}

	/**
	 * Returns the value of '<em><b>externalPOSProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExternalPOSProductList() {
		return externalPOSProductList;
	}

	/**
	 * Sets the '{@link ProductType#getExternalPOSProductList() <em>externalPOSProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getExternalPOSProductList() externalPOSProductList}' feature.
	 * @generated
	 */
	public void setExternalPOSProductList(
			ReferenceType newExternalPOSProductList) {
		externalPOSProductList = newExternalPOSProductList;
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
	 * Sets the '{@link ProductType#getFINFinaccTransactionList() <em>fINFinaccTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFINFinaccTransactionList() fINFinaccTransactionList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionList(
			ReferenceType newFINFinaccTransactionList) {
		fINFinaccTransactionList = newFINFinaccTransactionList;
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
	 * Sets the '{@link ProductType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
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
	 * Sets the '{@link ProductType#getFINPaymentScheduleDetailList() <em>fINPaymentScheduleDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFINPaymentScheduleDetailList() fINPaymentScheduleDetailList}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleDetailList(
			ReferenceType newFINPaymentScheduleDetailList) {
		fINPaymentScheduleDetailList = newFINPaymentScheduleDetailList;
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
	 * Sets the '{@link ProductType#getFinancialMgmtAccountingCombinationList() <em>financialMgmtAccountingCombinationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFinancialMgmtAccountingCombinationList() financialMgmtAccountingCombinationList}' feature.
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
	 * Sets the '{@link ProductType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
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
	 * Sets the '{@link ProductType#getFinancialMgmtAcctSchemaElementList() <em>financialMgmtAcctSchemaElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFinancialMgmtAcctSchemaElementList() financialMgmtAcctSchemaElementList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElementList(
			ReferenceType newFinancialMgmtAcctSchemaElementList) {
		financialMgmtAcctSchemaElementList = newFinancialMgmtAcctSchemaElementList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetList() {
		return financialMgmtAssetList;
	}

	/**
	 * Sets the '{@link ProductType#getFinancialMgmtAssetList() <em>financialMgmtAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFinancialMgmtAssetList() financialMgmtAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetList(
			ReferenceType newFinancialMgmtAssetList) {
		financialMgmtAssetList = newFinancialMgmtAssetList;
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
	 * Sets the '{@link ProductType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
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
	 * Sets the '{@link ProductType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
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
	 * Sets the '{@link ProductType#getInvoiceLineList() <em>invoiceLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getInvoiceLineList() invoiceLineList}' feature.
	 * @generated
	 */
	public void setInvoiceLineList(ReferenceType newInvoiceLineList) {
		invoiceLineList = newInvoiceLineList;
	}

	/**
	 * Returns the value of '<em><b>lotList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lotList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLotList() {
		return lotList;
	}

	/**
	 * Sets the '{@link ProductType#getLotList() <em>lotList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getLotList() lotList}' feature.
	 * @generated
	 */
	public void setLotList(ReferenceType newLotList) {
		lotList = newLotList;
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRunList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPProductionRunList() {
		return mRPProductionRunList;
	}

	/**
	 * Sets the '{@link ProductType#getMRPProductionRunList() <em>mRPProductionRunList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMRPProductionRunList() mRPProductionRunList}' feature.
	 * @generated
	 */
	public void setMRPProductionRunList(ReferenceType newMRPProductionRunList) {
		mRPProductionRunList = newMRPProductionRunList;
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRunLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPProductionRunLineList() {
		return mRPProductionRunLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMRPProductionRunLineList() <em>mRPProductionRunLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMRPProductionRunLineList() mRPProductionRunLineList}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLineList(
			ReferenceType newMRPProductionRunLineList) {
		mRPProductionRunLineList = newMRPProductionRunLineList;
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPPurchasingRunList() {
		return mRPPurchasingRunList;
	}

	/**
	 * Sets the '{@link ProductType#getMRPPurchasingRunList() <em>mRPPurchasingRunList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMRPPurchasingRunList() mRPPurchasingRunList}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunList(ReferenceType newMRPPurchasingRunList) {
		mRPPurchasingRunList = newMRPPurchasingRunList;
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPPurchasingRunLineList() {
		return mRPPurchasingRunLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMRPPurchasingRunLineList() <em>mRPPurchasingRunLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMRPPurchasingRunLineList() mRPPurchasingRunLineList}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLineList(
			ReferenceType newMRPPurchasingRunLineList) {
		mRPPurchasingRunLineList = newMRPPurchasingRunLineList;
	}

	/**
	 * Returns the value of '<em><b>mRPSalesForecastLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecastLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPSalesForecastLineList() {
		return mRPSalesForecastLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMRPSalesForecastLineList() <em>mRPSalesForecastLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMRPSalesForecastLineList() mRPSalesForecastLineList}' feature.
	 * @generated
	 */
	public void setMRPSalesForecastLineList(
			ReferenceType newMRPSalesForecastLineList) {
		mRPSalesForecastLineList = newMRPSalesForecastLineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingCaseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCaseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingCaseList() {
		return manufacturingCaseList;
	}

	/**
	 * Sets the '{@link ProductType#getManufacturingCaseList() <em>manufacturingCaseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getManufacturingCaseList() manufacturingCaseList}' feature.
	 * @generated
	 */
	public void setManufacturingCaseList(ReferenceType newManufacturingCaseList) {
		manufacturingCaseList = newManufacturingCaseList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingGlobalUseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingGlobalUseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingGlobalUseList() {
		return manufacturingGlobalUseList;
	}

	/**
	 * Sets the '{@link ProductType#getManufacturingGlobalUseList() <em>manufacturingGlobalUseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getManufacturingGlobalUseList() manufacturingGlobalUseList}' feature.
	 * @generated
	 */
	public void setManufacturingGlobalUseList(
			ReferenceType newManufacturingGlobalUseList) {
		manufacturingGlobalUseList = newManufacturingGlobalUseList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingOperationProductList() {
		return manufacturingOperationProductList;
	}

	/**
	 * Sets the '{@link ProductType#getManufacturingOperationProductList() <em>manufacturingOperationProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getManufacturingOperationProductList() manufacturingOperationProductList}' feature.
	 * @generated
	 */
	public void setManufacturingOperationProductList(
			ReferenceType newManufacturingOperationProductList) {
		manufacturingOperationProductList = newManufacturingOperationProductList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingProductionLineList() {
		return manufacturingProductionLineList;
	}

	/**
	 * Sets the '{@link ProductType#getManufacturingProductionLineList() <em>manufacturingProductionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getManufacturingProductionLineList() manufacturingProductionLineList}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLineList(
			ReferenceType newManufacturingProductionLineList) {
		manufacturingProductionLineList = newManufacturingProductionLineList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingWorkRequirementProductList() {
		return manufacturingWorkRequirementProductList;
	}

	/**
	 * Sets the '{@link ProductType#getManufacturingWorkRequirementProductList() <em>manufacturingWorkRequirementProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getManufacturingWorkRequirementProductList() manufacturingWorkRequirementProductList}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementProductList(
			ReferenceType newManufacturingWorkRequirementProductList) {
		manufacturingWorkRequirementProductList = newManufacturingWorkRequirementProductList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtCostingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtCostingList</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtCostingListType getMaterialMgmtCostingList() {
		return materialMgmtCostingList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtCostingList() <em>materialMgmtCostingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtCostingList() materialMgmtCostingList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtCostingList(
			MaterialMgmtCostingListType newMaterialMgmtCostingList) {
		materialMgmtCostingList = newMaterialMgmtCostingList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumptionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumptionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInternalConsumptionLineList() {
		return materialMgmtInternalConsumptionLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtInternalConsumptionLineList() <em>materialMgmtInternalConsumptionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtInternalConsumptionLineList() materialMgmtInternalConsumptionLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumptionLineList(
			ReferenceType newMaterialMgmtInternalConsumptionLineList) {
		materialMgmtInternalConsumptionLineList = newMaterialMgmtInternalConsumptionLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInternalMovementLineList() {
		return materialMgmtInternalMovementLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtInternalMovementLineList() <em>materialMgmtInternalMovementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtInternalMovementLineList() materialMgmtInternalMovementLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLineList(
			ReferenceType newMaterialMgmtInternalMovementLineList) {
		materialMgmtInternalMovementLineList = newMaterialMgmtInternalMovementLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtInventoryCountLineList() {
		return materialMgmtInventoryCountLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtInventoryCountLineList() <em>materialMgmtInventoryCountLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtInventoryCountLineList() materialMgmtInventoryCountLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountLineList(
			ReferenceType newMaterialMgmtInventoryCountLineList) {
		materialMgmtInventoryCountLineList = newMaterialMgmtInventoryCountLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtMaterialTransactionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtMaterialTransactionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtMaterialTransactionList() {
		return materialMgmtMaterialTransactionList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtMaterialTransactionList() <em>materialMgmtMaterialTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtMaterialTransactionList() materialMgmtMaterialTransactionList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtMaterialTransactionList(
			ReferenceType newMaterialMgmtMaterialTransactionList) {
		materialMgmtMaterialTransactionList = newMaterialMgmtMaterialTransactionList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionPlanList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionPlanList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtProductionPlanList() {
		return materialMgmtProductionPlanList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtProductionPlanList() <em>materialMgmtProductionPlanList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtProductionPlanList() materialMgmtProductionPlanList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionPlanList(
			ReferenceType newMaterialMgmtProductionPlanList) {
		materialMgmtProductionPlanList = newMaterialMgmtProductionPlanList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtShipmentInOutLineList() {
		return materialMgmtShipmentInOutLineList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtShipmentInOutLineList() <em>materialMgmtShipmentInOutLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtShipmentInOutLineList() materialMgmtShipmentInOutLineList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutLineList(
			ReferenceType newMaterialMgmtShipmentInOutLineList) {
		materialMgmtShipmentInOutLineList = newMaterialMgmtShipmentInOutLineList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStorageDetailList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStorageDetailList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtStorageDetailList() {
		return materialMgmtStorageDetailList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtStorageDetailList() <em>materialMgmtStorageDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtStorageDetailList() materialMgmtStorageDetailList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStorageDetailList(
			ReferenceType newMaterialMgmtStorageDetailList) {
		materialMgmtStorageDetailList = newMaterialMgmtStorageDetailList;
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStoragePendingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStoragePendingList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMaterialMgmtStoragePendingList() {
		return materialMgmtStoragePendingList;
	}

	/**
	 * Sets the '{@link ProductType#getMaterialMgmtStoragePendingList() <em>materialMgmtStoragePendingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getMaterialMgmtStoragePendingList() materialMgmtStoragePendingList}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStoragePendingList(
			ReferenceType newMaterialMgmtStoragePendingList) {
		materialMgmtStoragePendingList = newMaterialMgmtStoragePendingList;
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
	 * Sets the '{@link ProductType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingAdjustmentProductList() {
		return pricingAdjustmentProductList;
	}

	/**
	 * Sets the '{@link ProductType#getPricingAdjustmentProductList() <em>pricingAdjustmentProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPricingAdjustmentProductList() pricingAdjustmentProductList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProductList(
			ReferenceType newPricingAdjustmentProductList) {
		pricingAdjustmentProductList = newPricingAdjustmentProductList;
	}

	/**
	 * Returns the value of '<em><b>pricingDiscountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingDiscountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingDiscountList() {
		return pricingDiscountList;
	}

	/**
	 * Sets the '{@link ProductType#getPricingDiscountList() <em>pricingDiscountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPricingDiscountList() pricingDiscountList}' feature.
	 * @generated
	 */
	public void setPricingDiscountList(ReferenceType newPricingDiscountList) {
		pricingDiscountList = newPricingDiscountList;
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListSchemeLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListSchemeLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingPriceListSchemeLineList() {
		return pricingPriceListSchemeLineList;
	}

	/**
	 * Sets the '{@link ProductType#getPricingPriceListSchemeLineList() <em>pricingPriceListSchemeLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPricingPriceListSchemeLineList() pricingPriceListSchemeLineList}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchemeLineList(
			ReferenceType newPricingPriceListSchemeLineList) {
		pricingPriceListSchemeLineList = newPricingPriceListSchemeLineList;
	}

	/**
	 * Returns the value of '<em><b>pricingProductPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingProductPriceList</b></em>' feature
	 * @generated
	 */
	public PricingProductPriceListType getPricingProductPriceList() {
		return pricingProductPriceList;
	}

	/**
	 * Sets the '{@link ProductType#getPricingProductPriceList() <em>pricingProductPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPricingProductPriceList() pricingProductPriceList}' feature.
	 * @generated
	 */
	public void setPricingProductPriceList(
			PricingProductPriceListType newPricingProductPriceList) {
		pricingProductPriceList = newPricingProductPriceList;
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingVolumeDiscountProductList() {
		return pricingVolumeDiscountProductList;
	}

	/**
	 * Sets the '{@link ProductType#getPricingVolumeDiscountProductList() <em>pricingVolumeDiscountProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getPricingVolumeDiscountProductList() pricingVolumeDiscountProductList}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProductList(
			ReferenceType newPricingVolumeDiscountProductList) {
		pricingVolumeDiscountProductList = newPricingVolumeDiscountProductList;
	}

	/**
	 * Returns the value of '<em><b>procurementPOInvoiceMatchList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementPOInvoiceMatchList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementPOInvoiceMatchList() {
		return procurementPOInvoiceMatchList;
	}

	/**
	 * Sets the '{@link ProductType#getProcurementPOInvoiceMatchList() <em>procurementPOInvoiceMatchList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProcurementPOInvoiceMatchList() procurementPOInvoiceMatchList}' feature.
	 * @generated
	 */
	public void setProcurementPOInvoiceMatchList(
			ReferenceType newProcurementPOInvoiceMatchList) {
		procurementPOInvoiceMatchList = newProcurementPOInvoiceMatchList;
	}

	/**
	 * Returns the value of '<em><b>procurementReceiptInvoiceMatchList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementReceiptInvoiceMatchList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementReceiptInvoiceMatchList() {
		return procurementReceiptInvoiceMatchList;
	}

	/**
	 * Sets the '{@link ProductType#getProcurementReceiptInvoiceMatchList() <em>procurementReceiptInvoiceMatchList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProcurementReceiptInvoiceMatchList() procurementReceiptInvoiceMatchList}' feature.
	 * @generated
	 */
	public void setProcurementReceiptInvoiceMatchList(
			ReferenceType newProcurementReceiptInvoiceMatchList) {
		procurementReceiptInvoiceMatchList = newProcurementReceiptInvoiceMatchList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionLineList() {
		return procurementRequisitionLineList;
	}

	/**
	 * Sets the '{@link ProductType#getProcurementRequisitionLineList() <em>procurementRequisitionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProcurementRequisitionLineList() procurementRequisitionLineList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLineList(
			ReferenceType newProcurementRequisitionLineList) {
		procurementRequisitionLineList = newProcurementRequisitionLineList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsList</b></em>' feature
	 * @generated
	 */
	public ProductAccountsListType getProductAccountsList() {
		return productAccountsList;
	}

	/**
	 * Sets the '{@link ProductType#getProductAccountsList() <em>productAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductAccountsList() productAccountsList}' feature.
	 * @generated
	 */
	public void setProductAccountsList(
			ProductAccountsListType newProductAccountsList) {
		productAccountsList = newProductAccountsList;
	}

	/**
	 * Returns the value of '<em><b>productBOMList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productBOMList</b></em>' feature
	 * @generated
	 */
	public ProductBOMListType getProductBOMList() {
		return productBOMList;
	}

	/**
	 * Sets the '{@link ProductType#getProductBOMList() <em>productBOMList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductBOMList() productBOMList}' feature.
	 * @generated
	 */
	public void setProductBOMList(ProductBOMListType newProductBOMList) {
		productBOMList = newProductBOMList;
	}

	/**
	 * Returns the value of '<em><b>productBOMBOMProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productBOMBOMProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductBOMBOMProductList() {
		return productBOMBOMProductList;
	}

	/**
	 * Sets the '{@link ProductType#getProductBOMBOMProductList() <em>productBOMBOMProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductBOMBOMProductList() productBOMBOMProductList}' feature.
	 * @generated
	 */
	public void setProductBOMBOMProductList(
			ReferenceType newProductBOMBOMProductList) {
		productBOMBOMProductList = newProductBOMBOMProductList;
	}

	/**
	 * Returns the value of '<em><b>productByPriceAndWarehouseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productByPriceAndWarehouseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductByPriceAndWarehouseList() {
		return productByPriceAndWarehouseList;
	}

	/**
	 * Sets the '{@link ProductType#getProductByPriceAndWarehouseList() <em>productByPriceAndWarehouseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductByPriceAndWarehouseList() productByPriceAndWarehouseList}' feature.
	 * @generated
	 */
	public void setProductByPriceAndWarehouseList(
			ReferenceType newProductByPriceAndWarehouseList) {
		productByPriceAndWarehouseList = newProductByPriceAndWarehouseList;
	}

	/**
	 * Returns the value of '<em><b>productCustomerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCustomerList</b></em>' feature
	 * @generated
	 */
	public ProductCustomerListType getProductCustomerList() {
		return productCustomerList;
	}

	/**
	 * Sets the '{@link ProductType#getProductCustomerList() <em>productCustomerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductCustomerList() productCustomerList}' feature.
	 * @generated
	 */
	public void setProductCustomerList(
			ProductCustomerListType newProductCustomerList) {
		productCustomerList = newProductCustomerList;
	}

	/**
	 * Returns the value of '<em><b>productOrgList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productOrgList</b></em>' feature
	 * @generated
	 */
	public ProductOrgListType getProductOrgList() {
		return productOrgList;
	}

	/**
	 * Sets the '{@link ProductType#getProductOrgList() <em>productOrgList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductOrgList() productOrgList}' feature.
	 * @generated
	 */
	public void setProductOrgList(ProductOrgListType newProductOrgList) {
		productOrgList = newProductOrgList;
	}

	/**
	 * Returns the value of '<em><b>productStockViewList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productStockViewList</b></em>' feature
	 * @generated
	 */
	public ProductStockViewListType getProductStockViewList() {
		return productStockViewList;
	}

	/**
	 * Sets the '{@link ProductType#getProductStockViewList() <em>productStockViewList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductStockViewList() productStockViewList}' feature.
	 * @generated
	 */
	public void setProductStockViewList(
			ProductStockViewListType newProductStockViewList) {
		productStockViewList = newProductStockViewList;
	}

	/**
	 * Returns the value of '<em><b>productSubstituteList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productSubstituteList</b></em>' feature
	 * @generated
	 */
	public ProductSubstituteListType getProductSubstituteList() {
		return productSubstituteList;
	}

	/**
	 * Sets the '{@link ProductType#getProductSubstituteList() <em>productSubstituteList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductSubstituteList() productSubstituteList}' feature.
	 * @generated
	 */
	public void setProductSubstituteList(
			ProductSubstituteListType newProductSubstituteList) {
		productSubstituteList = newProductSubstituteList;
	}

	/**
	 * Returns the value of '<em><b>productSubstituteSubstituteProductList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productSubstituteSubstituteProductList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductSubstituteSubstituteProductList() {
		return productSubstituteSubstituteProductList;
	}

	/**
	 * Sets the '{@link ProductType#getProductSubstituteSubstituteProductList() <em>productSubstituteSubstituteProductList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductSubstituteSubstituteProductList() productSubstituteSubstituteProductList}' feature.
	 * @generated
	 */
	public void setProductSubstituteSubstituteProductList(
			ReferenceType newProductSubstituteSubstituteProductList) {
		productSubstituteSubstituteProductList = newProductSubstituteSubstituteProductList;
	}

	/**
	 * Returns the value of '<em><b>productTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productTrlList</b></em>' feature
	 * @generated
	 */
	public ProductTrlListType getProductTrlList() {
		return productTrlList;
	}

	/**
	 * Sets the '{@link ProductType#getProductTrlList() <em>productTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductTrlList() productTrlList}' feature.
	 * @generated
	 */
	public void setProductTrlList(ProductTrlListType newProductTrlList) {
		productTrlList = newProductTrlList;
	}

	/**
	 * Returns the value of '<em><b>productUOMList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productUOMList</b></em>' feature
	 * @generated
	 */
	public ProductUOMListType getProductUOMList() {
		return productUOMList;
	}

	/**
	 * Sets the '{@link ProductType#getProductUOMList() <em>productUOMList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProductUOMList() productUOMList}' feature.
	 * @generated
	 */
	public void setProductUOMList(ProductUOMListType newProductUOMList) {
		productUOMList = newProductUOMList;
	}

	/**
	 * Returns the value of '<em><b>projectIssueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectIssueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectIssueList() {
		return projectIssueList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectIssueList() <em>projectIssueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectIssueList() projectIssueList}' feature.
	 * @generated
	 */
	public void setProjectIssueList(ReferenceType newProjectIssueList) {
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
	public ReferenceType getProjectLineList() {
		return projectLineList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectLineList() <em>projectLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectLineList() projectLineList}' feature.
	 * @generated
	 */
	public void setProjectLineList(ReferenceType newProjectLineList) {
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
	public ReferenceType getProjectPhaseList() {
		return projectPhaseList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectPhaseList() <em>projectPhaseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectPhaseList() projectPhaseList}' feature.
	 * @generated
	 */
	public void setProjectPhaseList(ReferenceType newProjectPhaseList) {
		projectPhaseList = newProjectPhaseList;
	}

	/**
	 * Returns the value of '<em><b>projectProposalLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectProposalLineList() {
		return projectProposalLineList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectProposalLineList() <em>projectProposalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectProposalLineList() projectProposalLineList}' feature.
	 * @generated
	 */
	public void setProjectProposalLineList(
			ReferenceType newProjectProposalLineList) {
		projectProposalLineList = newProjectProposalLineList;
	}

	/**
	 * Returns the value of '<em><b>projectStandardPhaseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardPhaseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectStandardPhaseList() {
		return projectStandardPhaseList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectStandardPhaseList() <em>projectStandardPhaseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectStandardPhaseList() projectStandardPhaseList}' feature.
	 * @generated
	 */
	public void setProjectStandardPhaseList(
			ReferenceType newProjectStandardPhaseList) {
		projectStandardPhaseList = newProjectStandardPhaseList;
	}

	/**
	 * Returns the value of '<em><b>projectStandardTaskList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardTaskList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectStandardTaskList() {
		return projectStandardTaskList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectStandardTaskList() <em>projectStandardTaskList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectStandardTaskList() projectStandardTaskList}' feature.
	 * @generated
	 */
	public void setProjectStandardTaskList(
			ReferenceType newProjectStandardTaskList) {
		projectStandardTaskList = newProjectStandardTaskList;
	}

	/**
	 * Returns the value of '<em><b>projectTaskList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectTaskList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectTaskList() {
		return projectTaskList;
	}

	/**
	 * Sets the '{@link ProductType#getProjectTaskList() <em>projectTaskList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getProjectTaskList() projectTaskList}' feature.
	 * @generated
	 */
	public void setProjectTaskList(ReferenceType newProjectTaskList) {
		projectTaskList = newProjectTaskList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialOrderPickEditLinesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialOrderPickEditLinesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialOrderPickEditLinesList() {
		return returnMaterialOrderPickEditLinesList;
	}

	/**
	 * Sets the '{@link ProductType#getReturnMaterialOrderPickEditLinesList() <em>returnMaterialOrderPickEditLinesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getReturnMaterialOrderPickEditLinesList() returnMaterialOrderPickEditLinesList}' feature.
	 * @generated
	 */
	public void setReturnMaterialOrderPickEditLinesList(
			ReferenceType newReturnMaterialOrderPickEditLinesList) {
		returnMaterialOrderPickEditLinesList = newReturnMaterialOrderPickEditLinesList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialReceiptPickEditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialReceiptPickEditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialReceiptPickEditList() {
		return returnMaterialReceiptPickEditList;
	}

	/**
	 * Sets the '{@link ProductType#getReturnMaterialReceiptPickEditList() <em>returnMaterialReceiptPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getReturnMaterialReceiptPickEditList() returnMaterialReceiptPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialReceiptPickEditList(
			ReferenceType newReturnMaterialReceiptPickEditList) {
		returnMaterialReceiptPickEditList = newReturnMaterialReceiptPickEditList;
	}

	/**
	 * Returns the value of '<em><b>returnMaterialShipmentPickEditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialShipmentPickEditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReturnMaterialShipmentPickEditList() {
		return returnMaterialShipmentPickEditList;
	}

	/**
	 * Sets the '{@link ProductType#getReturnMaterialShipmentPickEditList() <em>returnMaterialShipmentPickEditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getReturnMaterialShipmentPickEditList() returnMaterialShipmentPickEditList}' feature.
	 * @generated
	 */
	public void setReturnMaterialShipmentPickEditList(
			ReferenceType newReturnMaterialShipmentPickEditList) {
		returnMaterialShipmentPickEditList = newReturnMaterialShipmentPickEditList;
	}

	/**
	 * Returns the value of '<em><b>salesCommissionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCommissionList() {
		return salesCommissionList;
	}

	/**
	 * Sets the '{@link ProductType#getSalesCommissionList() <em>salesCommissionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSalesCommissionList() salesCommissionList}' feature.
	 * @generated
	 */
	public void setSalesCommissionList(ReferenceType newSalesCommissionList) {
		salesCommissionList = newSalesCommissionList;
	}

	/**
	 * Returns the value of '<em><b>salesCommissionLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesCommissionLineList() {
		return salesCommissionLineList;
	}

	/**
	 * Sets the '{@link ProductType#getSalesCommissionLineList() <em>salesCommissionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getSalesCommissionLineList() salesCommissionLineList}' feature.
	 * @generated
	 */
	public void setSalesCommissionLineList(
			ReferenceType newSalesCommissionLineList) {
		salesCommissionLineList = newSalesCommissionLineList;
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
	 * Sets the '{@link ProductType#getTimeAndExpenseSheetLineList() <em>timeAndExpenseSheetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getTimeAndExpenseSheetLineList() timeAndExpenseSheetLineList}' feature.
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
	 * Sets the '{@link ProductType#getTimeAndExpenseSheetLineVList() <em>timeAndExpenseSheetLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getTimeAndExpenseSheetLineVList() timeAndExpenseSheetLineVList}' feature.
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
	 * Sets the '{@link ProductType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getId1() id1}' feature.
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
	 * Sets the '{@link ProductType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ProductType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#isReference() reference}' feature.
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
	public List<ProductTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ProductType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ProductType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ProductTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ProductType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
