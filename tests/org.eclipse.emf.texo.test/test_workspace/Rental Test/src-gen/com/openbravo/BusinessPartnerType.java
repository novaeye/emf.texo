package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>BusinessPartnerType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class BusinessPartnerType {

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
	private String name2 = null;

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
	private Boolean summaryLevel = null;

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
	private Boolean oneTimeTransaction = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean potentialCustomer = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean vendor = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean customer = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean employee = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean isSalesRepresentative = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String referenceNo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dUNS = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uRL = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType language = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String taxID = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean taxExempt = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType invoiceSchedule = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String valuation = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal volumeOfSales = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long noOfEmployees = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String nAICSSIC = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime dateOfFirstSale = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal acquisitionCost = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal expectedLifetimeRevenue = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal lifetimeRevenueToDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long share = null;

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
	private Decimal creditLimit = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal creditUsed = null;

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
	private ReferenceType priceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean printDiscount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String orderDescription = null;

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
	private String pOFormOfPayment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType purchasePricelist = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pOPaymentTerms = null;

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
	private ReferenceType greeting = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String invoiceTerms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String deliveryTerms = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String deliveryMethod = null;

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
	private String partnerParent = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String creditStatus = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType forcedOrg = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean pricesShownInOrder = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String invoiceGrouping = null;

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
	private Boolean operator = null;

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
	private ReferenceType salaryCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String invoicePrintformat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long consumptionDays = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccount = null;

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
	private Long pOMaturityDate1 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long pOMaturityDate2 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long pOMaturityDate3 = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType transactionalBankAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType sOBPTaxCategory = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String fiscalcode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String isofiscalcode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType incotermsPO = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType incotermsSO = null;

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
	private ReferenceType pOPaymentMethod = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType account = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pOFinancialAccount = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADUserListType aDUserList = null;

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
	private ApprovedVendorListType1 approvedVendorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerSalesRepresentativeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerBankAccountListType businessPartnerBankAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerDiscountListType businessPartnerDiscountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerLocationListType businessPartnerLocationList = null;

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
	private BusinessPartnerWithholdingListType businessPartnerWithholdingList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationTemplateBPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CustomerAccountsListType1 customerAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType emailInteractionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmployeeAccountsListType1 employeeAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmployeeSalaryCategoryListType employeeSalaryCategoryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType externalPOSList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINBankStatementLineList = null;

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
	private ReferenceType fINFinancialAccountList = null;

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
	private ReferenceType fINPaymentDetailVBusinessPartnerdimList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentPropDetailVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINPaymentProposalList = null;

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
	private FinancialMgmtAssetListType financialMgmtAssetList = null;

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
	private ReferenceType financialMgmtDebtPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtDebtPaymentCancelVList = null;

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
	private ReferenceType financialMgmtGLJournalLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxPaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtWithholdingBeneficiaryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceListType invoiceList = null;

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
	private ReferenceType mRPPurchasingRunVendorList = null;

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
	private ReferenceType mRPSalesForecastList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingMaintenanceWorkerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType manufacturingWorkEffortEmployeeList = null;

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
	private ReferenceType orderDropShipPartnerList = null;

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
	private ReferenceType organizationInformationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType pricingAdjustmentBusinessPartnerList = null;

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
	private PricingVolumeDiscountBusinessPartnerListType pricingVolumeDiscountBusinessPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType procurementRequisitionList = null;

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
	private ReferenceType productList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCustomerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectPersonInChargeList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectProposalList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectVendorList = null;

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
	private ReferenceType shippingShippingCompanyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private TimeAndExpenseSheetLineListType1 timeAndExpenseSheetLineList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private TimeAndExpenseSheetLineVListType timeAndExpenseSheetLineVList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType timeAndExpenseSheetLineVChargedBusinessPartnerList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private VendorAccountsListType1 vendorAccountsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseShipperListType1 warehouseShipperList = null;

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
	private List<BusinessPartnerTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<BusinessPartnerTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link BusinessPartnerType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getId() id}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getClient() client}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrganization() organization}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getActive() active}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getUpdated() updated}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSearchKey() searchKey}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link BusinessPartnerType#getName2() <em>name2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getName2() name2}' feature.
	 * @generated
	 */
	public void setName2(String newName2) {
		name2 = newName2;
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
	 * Sets the '{@link BusinessPartnerType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link BusinessPartnerType#getSummaryLevel() <em>summaryLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSummaryLevel() summaryLevel}' feature.
	 * @generated
	 */
	public void setSummaryLevel(Boolean newSummaryLevel) {
		summaryLevel = newSummaryLevel;
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
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerCategory() <em>businessPartnerCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerCategory() businessPartnerCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategory(
			ReferenceType newBusinessPartnerCategory) {
		businessPartnerCategory = newBusinessPartnerCategory;
	}

	/**
	 * Returns the value of '<em><b>oneTimeTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oneTimeTransaction</b></em>' feature
	 * @generated
	 */
	public Boolean getOneTimeTransaction() {
		return oneTimeTransaction;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getOneTimeTransaction() <em>oneTimeTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOneTimeTransaction() oneTimeTransaction}' feature.
	 * @generated
	 */
	public void setOneTimeTransaction(Boolean newOneTimeTransaction) {
		oneTimeTransaction = newOneTimeTransaction;
	}

	/**
	 * Returns the value of '<em><b>potentialCustomer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>potentialCustomer</b></em>' feature
	 * @generated
	 */
	public Boolean getPotentialCustomer() {
		return potentialCustomer;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPotentialCustomer() <em>potentialCustomer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPotentialCustomer() potentialCustomer}' feature.
	 * @generated
	 */
	public void setPotentialCustomer(Boolean newPotentialCustomer) {
		potentialCustomer = newPotentialCustomer;
	}

	/**
	 * Returns the value of '<em><b>vendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendor</b></em>' feature
	 * @generated
	 */
	public Boolean getVendor() {
		return vendor;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getVendor() <em>vendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getVendor() vendor}' feature.
	 * @generated
	 */
	public void setVendor(Boolean newVendor) {
		vendor = newVendor;
	}

	/**
	 * Returns the value of '<em><b>customer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customer</b></em>' feature
	 * @generated
	 */
	public Boolean getCustomer() {
		return customer;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getCustomer() <em>customer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCustomer() customer}' feature.
	 * @generated
	 */
	public void setCustomer(Boolean newCustomer) {
		customer = newCustomer;
	}

	/**
	 * Returns the value of '<em><b>employee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employee</b></em>' feature
	 * @generated
	 */
	public Boolean getEmployee() {
		return employee;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getEmployee() <em>employee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getEmployee() employee}' feature.
	 * @generated
	 */
	public void setEmployee(Boolean newEmployee) {
		employee = newEmployee;
	}

	/**
	 * Returns the value of '<em><b>isSalesRepresentative</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isSalesRepresentative</b></em>' feature
	 * @generated
	 */
	public Boolean getIsSalesRepresentative() {
		return isSalesRepresentative;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getIsSalesRepresentative() <em>isSalesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getIsSalesRepresentative() isSalesRepresentative}' feature.
	 * @generated
	 */
	public void setIsSalesRepresentative(Boolean newIsSalesRepresentative) {
		isSalesRepresentative = newIsSalesRepresentative;
	}

	/**
	 * Returns the value of '<em><b>referenceNo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceNo</b></em>' feature
	 * @generated
	 */
	public String getReferenceNo() {
		return referenceNo;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getReferenceNo() <em>referenceNo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getReferenceNo() referenceNo}' feature.
	 * @generated
	 */
	public void setReferenceNo(String newReferenceNo) {
		referenceNo = newReferenceNo;
	}

	/**
	 * Returns the value of '<em><b>dUNS</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dUNS</b></em>' feature
	 * @generated
	 */
	public String getDUNS() {
		return dUNS;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getDUNS() <em>dUNS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getDUNS() dUNS}' feature.
	 * @generated
	 */
	public void setDUNS(String newDUNS) {
		dUNS = newDUNS;
	}

	/**
	 * Returns the value of '<em><b>uRL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uRL</b></em>' feature
	 * @generated
	 */
	public String getURL() {
		return uRL;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getURL() <em>uRL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getURL() uRL}' feature.
	 * @generated
	 */
	public void setURL(String newURL) {
		uRL = newURL;
	}

	/**
	 * Returns the value of '<em><b>language</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>language</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLanguage() {
		return language;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getLanguage() <em>language</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getLanguage() language}' feature.
	 * @generated
	 */
	public void setLanguage(ReferenceType newLanguage) {
		language = newLanguage;
	}

	/**
	 * Returns the value of '<em><b>taxID</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxID</b></em>' feature
	 * @generated
	 */
	public String getTaxID() {
		return taxID;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTaxID() <em>taxID</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTaxID() taxID}' feature.
	 * @generated
	 */
	public void setTaxID(String newTaxID) {
		taxID = newTaxID;
	}

	/**
	 * Returns the value of '<em><b>taxExempt</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>taxExempt</b></em>' feature
	 * @generated
	 */
	public Boolean getTaxExempt() {
		return taxExempt;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTaxExempt() <em>taxExempt</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTaxExempt() taxExempt}' feature.
	 * @generated
	 */
	public void setTaxExempt(Boolean newTaxExempt) {
		taxExempt = newTaxExempt;
	}

	/**
	 * Returns the value of '<em><b>invoiceSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceSchedule</b></em>' feature
	 * @generated
	 */
	public ReferenceType getInvoiceSchedule() {
		return invoiceSchedule;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getInvoiceSchedule() <em>invoiceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getInvoiceSchedule() invoiceSchedule}' feature.
	 * @generated
	 */
	public void setInvoiceSchedule(ReferenceType newInvoiceSchedule) {
		invoiceSchedule = newInvoiceSchedule;
	}

	/**
	 * Returns the value of '<em><b>valuation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>valuation</b></em>' feature
	 * @generated
	 */
	public String getValuation() {
		return valuation;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getValuation() <em>valuation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getValuation() valuation}' feature.
	 * @generated
	 */
	public void setValuation(String newValuation) {
		valuation = newValuation;
	}

	/**
	 * Returns the value of '<em><b>volumeOfSales</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>volumeOfSales</b></em>' feature
	 * @generated
	 */
	public Decimal getVolumeOfSales() {
		return volumeOfSales;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getVolumeOfSales() <em>volumeOfSales</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getVolumeOfSales() volumeOfSales}' feature.
	 * @generated
	 */
	public void setVolumeOfSales(Decimal newVolumeOfSales) {
		volumeOfSales = newVolumeOfSales;
	}

	/**
	 * Returns the value of '<em><b>noOfEmployees</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>noOfEmployees</b></em>' feature
	 * @generated
	 */
	public Long getNoOfEmployees() {
		return noOfEmployees;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getNoOfEmployees() <em>noOfEmployees</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getNoOfEmployees() noOfEmployees}' feature.
	 * @generated
	 */
	public void setNoOfEmployees(Long newNoOfEmployees) {
		noOfEmployees = newNoOfEmployees;
	}

	/**
	 * Returns the value of '<em><b>nAICSSIC</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>nAICSSIC</b></em>' feature
	 * @generated
	 */
	public String getNAICSSIC() {
		return nAICSSIC;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getNAICSSIC() <em>nAICSSIC</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getNAICSSIC() nAICSSIC}' feature.
	 * @generated
	 */
	public void setNAICSSIC(String newNAICSSIC) {
		nAICSSIC = newNAICSSIC;
	}

	/**
	 * Returns the value of '<em><b>dateOfFirstSale</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dateOfFirstSale</b></em>' feature
	 * @generated
	 */
	public DateTime getDateOfFirstSale() {
		return dateOfFirstSale;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getDateOfFirstSale() <em>dateOfFirstSale</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getDateOfFirstSale() dateOfFirstSale}' feature.
	 * @generated
	 */
	public void setDateOfFirstSale(DateTime newDateOfFirstSale) {
		dateOfFirstSale = newDateOfFirstSale;
	}

	/**
	 * Returns the value of '<em><b>acquisitionCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>acquisitionCost</b></em>' feature
	 * @generated
	 */
	public Decimal getAcquisitionCost() {
		return acquisitionCost;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getAcquisitionCost() <em>acquisitionCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getAcquisitionCost() acquisitionCost}' feature.
	 * @generated
	 */
	public void setAcquisitionCost(Decimal newAcquisitionCost) {
		acquisitionCost = newAcquisitionCost;
	}

	/**
	 * Returns the value of '<em><b>expectedLifetimeRevenue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expectedLifetimeRevenue</b></em>' feature
	 * @generated
	 */
	public Decimal getExpectedLifetimeRevenue() {
		return expectedLifetimeRevenue;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getExpectedLifetimeRevenue() <em>expectedLifetimeRevenue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getExpectedLifetimeRevenue() expectedLifetimeRevenue}' feature.
	 * @generated
	 */
	public void setExpectedLifetimeRevenue(Decimal newExpectedLifetimeRevenue) {
		expectedLifetimeRevenue = newExpectedLifetimeRevenue;
	}

	/**
	 * Returns the value of '<em><b>lifetimeRevenueToDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lifetimeRevenueToDate</b></em>' feature
	 * @generated
	 */
	public Decimal getLifetimeRevenueToDate() {
		return lifetimeRevenueToDate;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getLifetimeRevenueToDate() <em>lifetimeRevenueToDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getLifetimeRevenueToDate() lifetimeRevenueToDate}' feature.
	 * @generated
	 */
	public void setLifetimeRevenueToDate(Decimal newLifetimeRevenueToDate) {
		lifetimeRevenueToDate = newLifetimeRevenueToDate;
	}

	/**
	 * Returns the value of '<em><b>share</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>share</b></em>' feature
	 * @generated
	 */
	public Long getShare() {
		return share;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getShare() <em>share</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getShare() share}' feature.
	 * @generated
	 */
	public void setShare(Long newShare) {
		share = newShare;
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
	 * Sets the '{@link BusinessPartnerType#getFormOfPayment() <em>formOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFormOfPayment() formOfPayment}' feature.
	 * @generated
	 */
	public void setFormOfPayment(String newFormOfPayment) {
		formOfPayment = newFormOfPayment;
	}

	/**
	 * Returns the value of '<em><b>creditLimit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>creditLimit</b></em>' feature
	 * @generated
	 */
	public Decimal getCreditLimit() {
		return creditLimit;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getCreditLimit() <em>creditLimit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCreditLimit() creditLimit}' feature.
	 * @generated
	 */
	public void setCreditLimit(Decimal newCreditLimit) {
		creditLimit = newCreditLimit;
	}

	/**
	 * Returns the value of '<em><b>creditUsed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>creditUsed</b></em>' feature
	 * @generated
	 */
	public Decimal getCreditUsed() {
		return creditUsed;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getCreditUsed() <em>creditUsed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCreditUsed() creditUsed}' feature.
	 * @generated
	 */
	public void setCreditUsed(Decimal newCreditUsed) {
		creditUsed = newCreditUsed;
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
	 * Sets the '{@link BusinessPartnerType#getPaymentTerms() <em>paymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPaymentTerms() paymentTerms}' feature.
	 * @generated
	 */
	public void setPaymentTerms(ReferenceType newPaymentTerms) {
		paymentTerms = newPaymentTerms;
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
	 * Sets the '{@link BusinessPartnerType#getPriceList() <em>priceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPriceList() priceList}' feature.
	 * @generated
	 */
	public void setPriceList(ReferenceType newPriceList) {
		priceList = newPriceList;
	}

	/**
	 * Returns the value of '<em><b>printDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>printDiscount</b></em>' feature
	 * @generated
	 */
	public Boolean getPrintDiscount() {
		return printDiscount;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPrintDiscount() <em>printDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPrintDiscount() printDiscount}' feature.
	 * @generated
	 */
	public void setPrintDiscount(Boolean newPrintDiscount) {
		printDiscount = newPrintDiscount;
	}

	/**
	 * Returns the value of '<em><b>orderDescription</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDescription</b></em>' feature
	 * @generated
	 */
	public String getOrderDescription() {
		return orderDescription;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getOrderDescription() <em>orderDescription</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrderDescription() orderDescription}' feature.
	 * @generated
	 */
	public void setOrderDescription(String newOrderDescription) {
		orderDescription = newOrderDescription;
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
	 * Sets the '{@link BusinessPartnerType#getOrderReference() <em>orderReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrderReference() orderReference}' feature.
	 * @generated
	 */
	public void setOrderReference(String newOrderReference) {
		orderReference = newOrderReference;
	}

	/**
	 * Returns the value of '<em><b>pOFormOfPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOFormOfPayment</b></em>' feature
	 * @generated
	 */
	public String getPOFormOfPayment() {
		return pOFormOfPayment;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOFormOfPayment() <em>pOFormOfPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOFormOfPayment() pOFormOfPayment}' feature.
	 * @generated
	 */
	public void setPOFormOfPayment(String newPOFormOfPayment) {
		pOFormOfPayment = newPOFormOfPayment;
	}

	/**
	 * Returns the value of '<em><b>purchasePricelist</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>purchasePricelist</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPurchasePricelist() {
		return purchasePricelist;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPurchasePricelist() <em>purchasePricelist</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPurchasePricelist() purchasePricelist}' feature.
	 * @generated
	 */
	public void setPurchasePricelist(ReferenceType newPurchasePricelist) {
		purchasePricelist = newPurchasePricelist;
	}

	/**
	 * Returns the value of '<em><b>pOPaymentTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOPaymentTerms</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPOPaymentTerms() {
		return pOPaymentTerms;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOPaymentTerms() <em>pOPaymentTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOPaymentTerms() pOPaymentTerms}' feature.
	 * @generated
	 */
	public void setPOPaymentTerms(ReferenceType newPOPaymentTerms) {
		pOPaymentTerms = newPOPaymentTerms;
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
	 * Sets the '{@link BusinessPartnerType#getNumberOfCopies() <em>numberOfCopies</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getNumberOfCopies() numberOfCopies}' feature.
	 * @generated
	 */
	public void setNumberOfCopies(Long newNumberOfCopies) {
		numberOfCopies = newNumberOfCopies;
	}

	/**
	 * Returns the value of '<em><b>greeting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greeting</b></em>' feature
	 * @generated
	 */
	public ReferenceType getGreeting() {
		return greeting;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getGreeting() <em>greeting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getGreeting() greeting}' feature.
	 * @generated
	 */
	public void setGreeting(ReferenceType newGreeting) {
		greeting = newGreeting;
	}

	/**
	 * Returns the value of '<em><b>invoiceTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTerms</b></em>' feature
	 * @generated
	 */
	public String getInvoiceTerms() {
		return invoiceTerms;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getInvoiceTerms() <em>invoiceTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getInvoiceTerms() invoiceTerms}' feature.
	 * @generated
	 */
	public void setInvoiceTerms(String newInvoiceTerms) {
		invoiceTerms = newInvoiceTerms;
	}

	/**
	 * Returns the value of '<em><b>deliveryTerms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deliveryTerms</b></em>' feature
	 * @generated
	 */
	public String getDeliveryTerms() {
		return deliveryTerms;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getDeliveryTerms() <em>deliveryTerms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getDeliveryTerms() deliveryTerms}' feature.
	 * @generated
	 */
	public void setDeliveryTerms(String newDeliveryTerms) {
		deliveryTerms = newDeliveryTerms;
	}

	/**
	 * Returns the value of '<em><b>deliveryMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deliveryMethod</b></em>' feature
	 * @generated
	 */
	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getDeliveryMethod() <em>deliveryMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getDeliveryMethod() deliveryMethod}' feature.
	 * @generated
	 */
	public void setDeliveryMethod(String newDeliveryMethod) {
		deliveryMethod = newDeliveryMethod;
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
	 * Sets the '{@link BusinessPartnerType#getSalesRepresentative() <em>salesRepresentative</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSalesRepresentative() salesRepresentative}' feature.
	 * @generated
	 */
	public void setSalesRepresentative(ReferenceType newSalesRepresentative) {
		salesRepresentative = newSalesRepresentative;
	}

	/**
	 * Returns the value of '<em><b>partnerParent</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>partnerParent</b></em>' feature
	 * @generated
	 */
	public String getPartnerParent() {
		return partnerParent;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPartnerParent() <em>partnerParent</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPartnerParent() partnerParent}' feature.
	 * @generated
	 */
	public void setPartnerParent(String newPartnerParent) {
		partnerParent = newPartnerParent;
	}

	/**
	 * Returns the value of '<em><b>creditStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>creditStatus</b></em>' feature
	 * @generated
	 */
	public String getCreditStatus() {
		return creditStatus;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getCreditStatus() <em>creditStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCreditStatus() creditStatus}' feature.
	 * @generated
	 */
	public void setCreditStatus(String newCreditStatus) {
		creditStatus = newCreditStatus;
	}

	/**
	 * Returns the value of '<em><b>forcedOrg</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>forcedOrg</b></em>' feature
	 * @generated
	 */
	public ReferenceType getForcedOrg() {
		return forcedOrg;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getForcedOrg() <em>forcedOrg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getForcedOrg() forcedOrg}' feature.
	 * @generated
	 */
	public void setForcedOrg(ReferenceType newForcedOrg) {
		forcedOrg = newForcedOrg;
	}

	/**
	 * Returns the value of '<em><b>pricesShownInOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricesShownInOrder</b></em>' feature
	 * @generated
	 */
	public Boolean getPricesShownInOrder() {
		return pricesShownInOrder;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPricesShownInOrder() <em>pricesShownInOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPricesShownInOrder() pricesShownInOrder}' feature.
	 * @generated
	 */
	public void setPricesShownInOrder(Boolean newPricesShownInOrder) {
		pricesShownInOrder = newPricesShownInOrder;
	}

	/**
	 * Returns the value of '<em><b>invoiceGrouping</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceGrouping</b></em>' feature
	 * @generated
	 */
	public String getInvoiceGrouping() {
		return invoiceGrouping;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getInvoiceGrouping() <em>invoiceGrouping</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getInvoiceGrouping() invoiceGrouping}' feature.
	 * @generated
	 */
	public void setInvoiceGrouping(String newInvoiceGrouping) {
		invoiceGrouping = newInvoiceGrouping;
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
	 * Sets the '{@link BusinessPartnerType#getMaturityDate1() <em>maturityDate1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMaturityDate1() maturityDate1}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getMaturityDate2() <em>maturityDate2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMaturityDate2() maturityDate2}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getMaturityDate3() <em>maturityDate3</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMaturityDate3() maturityDate3}' feature.
	 * @generated
	 */
	public void setMaturityDate3(Long newMaturityDate3) {
		maturityDate3 = newMaturityDate3;
	}

	/**
	 * Returns the value of '<em><b>operator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>operator</b></em>' feature
	 * @generated
	 */
	public Boolean getOperator() {
		return operator;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getOperator() <em>operator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOperator() operator}' feature.
	 * @generated
	 */
	public void setOperator(Boolean newOperator) {
		operator = newOperator;
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
	 * Sets the '{@link BusinessPartnerType#getUPCEAN() <em>uPCEAN</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getUPCEAN() uPCEAN}' feature.
	 * @generated
	 */
	public void setUPCEAN(String newUPCEAN) {
		uPCEAN = newUPCEAN;
	}

	/**
	 * Returns the value of '<em><b>salaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalaryCategory() {
		return salaryCategory;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getSalaryCategory() <em>salaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSalaryCategory() salaryCategory}' feature.
	 * @generated
	 */
	public void setSalaryCategory(ReferenceType newSalaryCategory) {
		salaryCategory = newSalaryCategory;
	}

	/**
	 * Returns the value of '<em><b>invoicePrintformat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoicePrintformat</b></em>' feature
	 * @generated
	 */
	public String getInvoicePrintformat() {
		return invoicePrintformat;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getInvoicePrintformat() <em>invoicePrintformat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getInvoicePrintformat() invoicePrintformat}' feature.
	 * @generated
	 */
	public void setInvoicePrintformat(String newInvoicePrintformat) {
		invoicePrintformat = newInvoicePrintformat;
	}

	/**
	 * Returns the value of '<em><b>consumptionDays</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>consumptionDays</b></em>' feature
	 * @generated
	 */
	public Long getConsumptionDays() {
		return consumptionDays;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getConsumptionDays() <em>consumptionDays</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getConsumptionDays() consumptionDays}' feature.
	 * @generated
	 */
	public void setConsumptionDays(Long newConsumptionDays) {
		consumptionDays = newConsumptionDays;
	}

	/**
	 * Returns the value of '<em><b>bankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccount() {
		return bankAccount;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(ReferenceType newBankAccount) {
		bankAccount = newBankAccount;
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
	 * Sets the '{@link BusinessPartnerType#getTaxCategory() <em>taxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTaxCategory() taxCategory}' feature.
	 * @generated
	 */
	public void setTaxCategory(ReferenceType newTaxCategory) {
		taxCategory = newTaxCategory;
	}

	/**
	 * Returns the value of '<em><b>pOMaturityDate1</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOMaturityDate1</b></em>' feature
	 * @generated
	 */
	public Long getPOMaturityDate1() {
		return pOMaturityDate1;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOMaturityDate1() <em>pOMaturityDate1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOMaturityDate1() pOMaturityDate1}' feature.
	 * @generated
	 */
	public void setPOMaturityDate1(Long newPOMaturityDate1) {
		pOMaturityDate1 = newPOMaturityDate1;
	}

	/**
	 * Returns the value of '<em><b>pOMaturityDate2</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOMaturityDate2</b></em>' feature
	 * @generated
	 */
	public Long getPOMaturityDate2() {
		return pOMaturityDate2;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOMaturityDate2() <em>pOMaturityDate2</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOMaturityDate2() pOMaturityDate2}' feature.
	 * @generated
	 */
	public void setPOMaturityDate2(Long newPOMaturityDate2) {
		pOMaturityDate2 = newPOMaturityDate2;
	}

	/**
	 * Returns the value of '<em><b>pOMaturityDate3</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOMaturityDate3</b></em>' feature
	 * @generated
	 */
	public Long getPOMaturityDate3() {
		return pOMaturityDate3;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOMaturityDate3() <em>pOMaturityDate3</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOMaturityDate3() pOMaturityDate3}' feature.
	 * @generated
	 */
	public void setPOMaturityDate3(Long newPOMaturityDate3) {
		pOMaturityDate3 = newPOMaturityDate3;
	}

	/**
	 * Returns the value of '<em><b>transactionalBankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>transactionalBankAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTransactionalBankAccount() {
		return transactionalBankAccount;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTransactionalBankAccount() <em>transactionalBankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTransactionalBankAccount() transactionalBankAccount}' feature.
	 * @generated
	 */
	public void setTransactionalBankAccount(
			ReferenceType newTransactionalBankAccount) {
		transactionalBankAccount = newTransactionalBankAccount;
	}

	/**
	 * Returns the value of '<em><b>sOBPTaxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sOBPTaxCategory</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSOBPTaxCategory() {
		return sOBPTaxCategory;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getSOBPTaxCategory() <em>sOBPTaxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSOBPTaxCategory() sOBPTaxCategory}' feature.
	 * @generated
	 */
	public void setSOBPTaxCategory(ReferenceType newSOBPTaxCategory) {
		sOBPTaxCategory = newSOBPTaxCategory;
	}

	/**
	 * Returns the value of '<em><b>fiscalcode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fiscalcode</b></em>' feature
	 * @generated
	 */
	public String getFiscalcode() {
		return fiscalcode;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFiscalcode() <em>fiscalcode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFiscalcode() fiscalcode}' feature.
	 * @generated
	 */
	public void setFiscalcode(String newFiscalcode) {
		fiscalcode = newFiscalcode;
	}

	/**
	 * Returns the value of '<em><b>isofiscalcode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>isofiscalcode</b></em>' feature
	 * @generated
	 */
	public String getIsofiscalcode() {
		return isofiscalcode;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getIsofiscalcode() <em>isofiscalcode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getIsofiscalcode() isofiscalcode}' feature.
	 * @generated
	 */
	public void setIsofiscalcode(String newIsofiscalcode) {
		isofiscalcode = newIsofiscalcode;
	}

	/**
	 * Returns the value of '<em><b>incotermsPO</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>incotermsPO</b></em>' feature
	 * @generated
	 */
	public ReferenceType getIncotermsPO() {
		return incotermsPO;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getIncotermsPO() <em>incotermsPO</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getIncotermsPO() incotermsPO}' feature.
	 * @generated
	 */
	public void setIncotermsPO(ReferenceType newIncotermsPO) {
		incotermsPO = newIncotermsPO;
	}

	/**
	 * Returns the value of '<em><b>incotermsSO</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>incotermsSO</b></em>' feature
	 * @generated
	 */
	public ReferenceType getIncotermsSO() {
		return incotermsSO;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getIncotermsSO() <em>incotermsSO</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getIncotermsSO() incotermsSO}' feature.
	 * @generated
	 */
	public void setIncotermsSO(ReferenceType newIncotermsSO) {
		incotermsSO = newIncotermsSO;
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
	 * Sets the '{@link BusinessPartnerType#getPaymentMethod() <em>paymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPaymentMethod() paymentMethod}' feature.
	 * @generated
	 */
	public void setPaymentMethod(ReferenceType newPaymentMethod) {
		paymentMethod = newPaymentMethod;
	}

	/**
	 * Returns the value of '<em><b>pOPaymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOPaymentMethod</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPOPaymentMethod() {
		return pOPaymentMethod;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOPaymentMethod() <em>pOPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOPaymentMethod() pOPaymentMethod}' feature.
	 * @generated
	 */
	public void setPOPaymentMethod(ReferenceType newPOPaymentMethod) {
		pOPaymentMethod = newPOPaymentMethod;
	}

	/**
	 * Returns the value of '<em><b>account</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>account</b></em>' feature
	 * @generated
	 */
	public ReferenceType getAccount() {
		return account;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
	}

	/**
	 * Returns the value of '<em><b>pOFinancialAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pOFinancialAccount</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPOFinancialAccount() {
		return pOFinancialAccount;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPOFinancialAccount() <em>pOFinancialAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPOFinancialAccount() pOFinancialAccount}' feature.
	 * @generated
	 */
	public void setPOFinancialAccount(ReferenceType newPOFinancialAccount) {
		pOFinancialAccount = newPOFinancialAccount;
	}

	/**
	 * Returns the value of '<em><b>aDUserList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserList</b></em>' feature
	 * @generated
	 */
	public ADUserListType getADUserList() {
		return aDUserList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getADUserList() <em>aDUserList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getADUserList() aDUserList}' feature.
	 * @generated
	 */
	public void setADUserList(ADUserListType newADUserList) {
		aDUserList = newADUserList;
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
	 * Sets the '{@link BusinessPartnerType#getAPRMFinAccTransactionAcctVList() <em>aPRMFinAccTransactionAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getAPRMFinAccTransactionAcctVList() aPRMFinAccTransactionAcctVList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getAPRMFinaccTransactionVList() <em>aPRMFinaccTransactionVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getAPRMFinaccTransactionVList() aPRMFinaccTransactionVList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getAPRMFinaccTrxFullAcctVList() <em>aPRMFinaccTrxFullAcctVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getAPRMFinaccTrxFullAcctVList() aPRMFinaccTrxFullAcctVList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getActiveProposalVList() <em>activeProposalVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getActiveProposalVList() activeProposalVList}' feature.
	 * @generated
	 */
	public void setActiveProposalVList(ReferenceType newActiveProposalVList) {
		activeProposalVList = newActiveProposalVList;
	}

	/**
	 * Returns the value of '<em><b>approvedVendorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendorList</b></em>' feature
	 * @generated
	 */
	public ApprovedVendorListType1 getApprovedVendorList() {
		return approvedVendorList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getApprovedVendorList() <em>approvedVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getApprovedVendorList() approvedVendorList}' feature.
	 * @generated
	 */
	public void setApprovedVendorList(
			ApprovedVendorListType1 newApprovedVendorList) {
		approvedVendorList = newApprovedVendorList;
	}

	/**
	 * Returns the value of '<em><b>bankList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankList() {
		return bankList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBankList() <em>bankList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBankList() bankList}' feature.
	 * @generated
	 */
	public void setBankList(ReferenceType newBankList) {
		bankList = newBankList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerSalesRepresentativeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerSalesRepresentativeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerSalesRepresentativeList() {
		return businessPartnerSalesRepresentativeList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerSalesRepresentativeList() <em>businessPartnerSalesRepresentativeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerSalesRepresentativeList() businessPartnerSalesRepresentativeList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerSalesRepresentativeList(
			ReferenceType newBusinessPartnerSalesRepresentativeList) {
		businessPartnerSalesRepresentativeList = newBusinessPartnerSalesRepresentativeList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerBankAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerBankAccountList</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerBankAccountListType getBusinessPartnerBankAccountList() {
		return businessPartnerBankAccountList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerBankAccountList() <em>businessPartnerBankAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerBankAccountList() businessPartnerBankAccountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccountList(
			BusinessPartnerBankAccountListType newBusinessPartnerBankAccountList) {
		businessPartnerBankAccountList = newBusinessPartnerBankAccountList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerDiscountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerDiscountList</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerDiscountListType getBusinessPartnerDiscountList() {
		return businessPartnerDiscountList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerDiscountList() <em>businessPartnerDiscountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerDiscountList() businessPartnerDiscountList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerDiscountList(
			BusinessPartnerDiscountListType newBusinessPartnerDiscountList) {
		businessPartnerDiscountList = newBusinessPartnerDiscountList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerLocationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerLocationList</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerLocationListType getBusinessPartnerLocationList() {
		return businessPartnerLocationList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerLocationList() <em>businessPartnerLocationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerLocationList() businessPartnerLocationList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerLocationList(
			BusinessPartnerLocationListType newBusinessPartnerLocationList) {
		businessPartnerLocationList = newBusinessPartnerLocationList;
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
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerProductTemplateList() <em>businessPartnerProductTemplateList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerProductTemplateList() businessPartnerProductTemplateList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerProductTemplateList(
			ReferenceType newBusinessPartnerProductTemplateList) {
		businessPartnerProductTemplateList = newBusinessPartnerProductTemplateList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerWithholdingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerWithholdingList</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerWithholdingListType getBusinessPartnerWithholdingList() {
		return businessPartnerWithholdingList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getBusinessPartnerWithholdingList() <em>businessPartnerWithholdingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getBusinessPartnerWithholdingList() businessPartnerWithholdingList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerWithholdingList(
			BusinessPartnerWithholdingListType newBusinessPartnerWithholdingList) {
		businessPartnerWithholdingList = newBusinessPartnerWithholdingList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationTemplateBPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationTemplateBPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationTemplateBPartnerList() {
		return clientInformationTemplateBPartnerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getClientInformationTemplateBPartnerList() <em>clientInformationTemplateBPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getClientInformationTemplateBPartnerList() clientInformationTemplateBPartnerList}' feature.
	 * @generated
	 */
	public void setClientInformationTemplateBPartnerList(
			ReferenceType newClientInformationTemplateBPartnerList) {
		clientInformationTemplateBPartnerList = newClientInformationTemplateBPartnerList;
	}

	/**
	 * Returns the value of '<em><b>customerAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccountsList</b></em>' feature
	 * @generated
	 */
	public CustomerAccountsListType1 getCustomerAccountsList() {
		return customerAccountsList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getCustomerAccountsList() <em>customerAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getCustomerAccountsList() customerAccountsList}' feature.
	 * @generated
	 */
	public void setCustomerAccountsList(
			CustomerAccountsListType1 newCustomerAccountsList) {
		customerAccountsList = newCustomerAccountsList;
	}

	/**
	 * Returns the value of '<em><b>emailInteractionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailInteractionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getEmailInteractionList() {
		return emailInteractionList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getEmailInteractionList() <em>emailInteractionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getEmailInteractionList() emailInteractionList}' feature.
	 * @generated
	 */
	public void setEmailInteractionList(ReferenceType newEmailInteractionList) {
		emailInteractionList = newEmailInteractionList;
	}

	/**
	 * Returns the value of '<em><b>employeeAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccountsList</b></em>' feature
	 * @generated
	 */
	public EmployeeAccountsListType1 getEmployeeAccountsList() {
		return employeeAccountsList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getEmployeeAccountsList() <em>employeeAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getEmployeeAccountsList() employeeAccountsList}' feature.
	 * @generated
	 */
	public void setEmployeeAccountsList(
			EmployeeAccountsListType1 newEmployeeAccountsList) {
		employeeAccountsList = newEmployeeAccountsList;
	}

	/**
	 * Returns the value of '<em><b>employeeSalaryCategoryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeSalaryCategoryList</b></em>' feature
	 * @generated
	 */
	public EmployeeSalaryCategoryListType getEmployeeSalaryCategoryList() {
		return employeeSalaryCategoryList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getEmployeeSalaryCategoryList() <em>employeeSalaryCategoryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getEmployeeSalaryCategoryList() employeeSalaryCategoryList}' feature.
	 * @generated
	 */
	public void setEmployeeSalaryCategoryList(
			EmployeeSalaryCategoryListType newEmployeeSalaryCategoryList) {
		employeeSalaryCategoryList = newEmployeeSalaryCategoryList;
	}

	/**
	 * Returns the value of '<em><b>externalPOSList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getExternalPOSList() {
		return externalPOSList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getExternalPOSList() <em>externalPOSList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getExternalPOSList() externalPOSList}' feature.
	 * @generated
	 */
	public void setExternalPOSList(ReferenceType newExternalPOSList) {
		externalPOSList = newExternalPOSList;
	}

	/**
	 * Returns the value of '<em><b>fINBankStatementLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatementLineList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINBankStatementLineList() {
		return fINBankStatementLineList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFINBankStatementLineList() <em>fINBankStatementLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINBankStatementLineList() fINBankStatementLineList}' feature.
	 * @generated
	 */
	public void setFINBankStatementLineList(
			ReferenceType newFINBankStatementLineList) {
		fINBankStatementLineList = newFINBankStatementLineList;
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
	 * Sets the '{@link BusinessPartnerType#getFINFinaccTransactionList() <em>fINFinaccTransactionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINFinaccTransactionList() fINFinaccTransactionList}' feature.
	 * @generated
	 */
	public void setFINFinaccTransactionList(
			ReferenceType newFINFinaccTransactionList) {
		fINFinaccTransactionList = newFINFinaccTransactionList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountList() {
		return fINFinancialAccountList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFINFinancialAccountList() <em>fINFinancialAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINFinancialAccountList() fINFinancialAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountList(
			ReferenceType newFINFinancialAccountList) {
		fINFinancialAccountList = newFINFinancialAccountList;
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
	 * Sets the '{@link BusinessPartnerType#getFINPaymentList() <em>fINPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINPaymentList() fINPaymentList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getFINPaymentDetailVList() <em>fINPaymentDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINPaymentDetailVList() fINPaymentDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVList(ReferenceType newFINPaymentDetailVList) {
		fINPaymentDetailVList = newFINPaymentDetailVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailVBusinessPartnerdimList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailVBusinessPartnerdimList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentDetailVBusinessPartnerdimList() {
		return fINPaymentDetailVBusinessPartnerdimList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFINPaymentDetailVBusinessPartnerdimList() <em>fINPaymentDetailVBusinessPartnerdimList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINPaymentDetailVBusinessPartnerdimList() fINPaymentDetailVBusinessPartnerdimList}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailVBusinessPartnerdimList(
			ReferenceType newFINPaymentDetailVBusinessPartnerdimList) {
		fINPaymentDetailVBusinessPartnerdimList = newFINPaymentDetailVBusinessPartnerdimList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetailVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetailVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentPropDetailVList() {
		return fINPaymentPropDetailVList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFINPaymentPropDetailVList() <em>fINPaymentPropDetailVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINPaymentPropDetailVList() fINPaymentPropDetailVList}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetailVList(
			ReferenceType newFINPaymentPropDetailVList) {
		fINPaymentPropDetailVList = newFINPaymentPropDetailVList;
	}

	/**
	 * Returns the value of '<em><b>fINPaymentProposalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentProposalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINPaymentProposalList() {
		return fINPaymentProposalList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFINPaymentProposalList() <em>fINPaymentProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINPaymentProposalList() fINPaymentProposalList}' feature.
	 * @generated
	 */
	public void setFINPaymentProposalList(
			ReferenceType newFINPaymentProposalList) {
		fINPaymentProposalList = newFINPaymentProposalList;
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
	 * Sets the '{@link BusinessPartnerType#getFINPaymentScheduleDetailList() <em>fINPaymentScheduleDetailList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFINPaymentScheduleDetailList() fINPaymentScheduleDetailList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtAccountingCombinationList() <em>financialMgmtAccountingCombinationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtAccountingCombinationList() financialMgmtAccountingCombinationList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtAccountingFactList() <em>financialMgmtAccountingFactList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtAccountingFactList() financialMgmtAccountingFactList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtAcctSchemaElementList() <em>financialMgmtAcctSchemaElementList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtAcctSchemaElementList() financialMgmtAcctSchemaElementList}' feature.
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
	public FinancialMgmtAssetListType getFinancialMgmtAssetList() {
		return financialMgmtAssetList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtAssetList() <em>financialMgmtAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtAssetList() financialMgmtAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetList(
			FinancialMgmtAssetListType newFinancialMgmtAssetList) {
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtBudgetLineList() <em>financialMgmtBudgetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtBudgetLineList() financialMgmtBudgetLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLineList(
			ReferenceType newFinancialMgmtBudgetLineList) {
		financialMgmtBudgetLineList = newFinancialMgmtBudgetLineList;
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtDebtPaymentList() <em>financialMgmtDebtPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtDebtPaymentList() financialMgmtDebtPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentList(
			ReferenceType newFinancialMgmtDebtPaymentList) {
		financialMgmtDebtPaymentList = newFinancialMgmtDebtPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelVList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtDebtPaymentCancelVList() {
		return financialMgmtDebtPaymentCancelVList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtDebtPaymentCancelVList() <em>financialMgmtDebtPaymentCancelVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtDebtPaymentCancelVList() financialMgmtDebtPaymentCancelVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelVList(
			ReferenceType newFinancialMgmtDebtPaymentCancelVList) {
		financialMgmtDebtPaymentCancelVList = newFinancialMgmtDebtPaymentCancelVList;
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtDebtPaymentGenerateVList() <em>financialMgmtDebtPaymentGenerateVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtDebtPaymentGenerateVList() financialMgmtDebtPaymentGenerateVList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateVList(
			ReferenceType newFinancialMgmtDebtPaymentGenerateVList) {
		financialMgmtDebtPaymentGenerateVList = newFinancialMgmtDebtPaymentGenerateVList;
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
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxPaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxPaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxPaymentList() {
		return financialMgmtTaxPaymentList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtTaxPaymentList() <em>financialMgmtTaxPaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtTaxPaymentList() financialMgmtTaxPaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPaymentList(
			ReferenceType newFinancialMgmtTaxPaymentList) {
		financialMgmtTaxPaymentList = newFinancialMgmtTaxPaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingBeneficiaryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingBeneficiaryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtWithholdingBeneficiaryList() {
		return financialMgmtWithholdingBeneficiaryList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getFinancialMgmtWithholdingBeneficiaryList() <em>financialMgmtWithholdingBeneficiaryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getFinancialMgmtWithholdingBeneficiaryList() financialMgmtWithholdingBeneficiaryList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingBeneficiaryList(
			ReferenceType newFinancialMgmtWithholdingBeneficiaryList) {
		financialMgmtWithholdingBeneficiaryList = newFinancialMgmtWithholdingBeneficiaryList;
	}

	/**
	 * Returns the value of '<em><b>invoiceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceList</b></em>' feature
	 * @generated
	 */
	public InvoiceListType getInvoiceList() {
		return invoiceList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getInvoiceList() <em>invoiceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getInvoiceList() invoiceList}' feature.
	 * @generated
	 */
	public void setInvoiceList(InvoiceListType newInvoiceList) {
		invoiceList = newInvoiceList;
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
	 * Sets the '{@link BusinessPartnerType#getMRPProductionRunList() <em>mRPProductionRunList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMRPProductionRunList() mRPProductionRunList}' feature.
	 * @generated
	 */
	public void setMRPProductionRunList(ReferenceType newMRPProductionRunList) {
		mRPProductionRunList = newMRPProductionRunList;
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunVendorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunVendorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPPurchasingRunVendorList() {
		return mRPPurchasingRunVendorList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getMRPPurchasingRunVendorList() <em>mRPPurchasingRunVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMRPPurchasingRunVendorList() mRPPurchasingRunVendorList}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunVendorList(
			ReferenceType newMRPPurchasingRunVendorList) {
		mRPPurchasingRunVendorList = newMRPPurchasingRunVendorList;
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
	 * Sets the '{@link BusinessPartnerType#getMRPPurchasingRunList() <em>mRPPurchasingRunList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMRPPurchasingRunList() mRPPurchasingRunList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getMRPPurchasingRunLineList() <em>mRPPurchasingRunLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMRPPurchasingRunLineList() mRPPurchasingRunLineList}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLineList(
			ReferenceType newMRPPurchasingRunLineList) {
		mRPPurchasingRunLineList = newMRPPurchasingRunLineList;
	}

	/**
	 * Returns the value of '<em><b>mRPSalesForecastList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecastList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getMRPSalesForecastList() {
		return mRPSalesForecastList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getMRPSalesForecastList() <em>mRPSalesForecastList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMRPSalesForecastList() mRPSalesForecastList}' feature.
	 * @generated
	 */
	public void setMRPSalesForecastList(ReferenceType newMRPSalesForecastList) {
		mRPSalesForecastList = newMRPSalesForecastList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceWorkerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceWorkerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingMaintenanceWorkerList() {
		return manufacturingMaintenanceWorkerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getManufacturingMaintenanceWorkerList() <em>manufacturingMaintenanceWorkerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getManufacturingMaintenanceWorkerList() manufacturingMaintenanceWorkerList}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceWorkerList(
			ReferenceType newManufacturingMaintenanceWorkerList) {
		manufacturingMaintenanceWorkerList = newManufacturingMaintenanceWorkerList;
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortEmployeeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortEmployeeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getManufacturingWorkEffortEmployeeList() {
		return manufacturingWorkEffortEmployeeList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getManufacturingWorkEffortEmployeeList() <em>manufacturingWorkEffortEmployeeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getManufacturingWorkEffortEmployeeList() manufacturingWorkEffortEmployeeList}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortEmployeeList(
			ReferenceType newManufacturingWorkEffortEmployeeList) {
		manufacturingWorkEffortEmployeeList = newManufacturingWorkEffortEmployeeList;
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
	 * Sets the '{@link BusinessPartnerType#getMaterialMgmtShipmentInOutList() <em>materialMgmtShipmentInOutList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getMaterialMgmtShipmentInOutList() materialMgmtShipmentInOutList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getOrderList() <em>orderList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrderList() orderList}' feature.
	 * @generated
	 */
	public void setOrderList(ReferenceType newOrderList) {
		orderList = newOrderList;
	}

	/**
	 * Returns the value of '<em><b>orderDropShipPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDropShipPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrderDropShipPartnerList() {
		return orderDropShipPartnerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getOrderDropShipPartnerList() <em>orderDropShipPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrderDropShipPartnerList() orderDropShipPartnerList}' feature.
	 * @generated
	 */
	public void setOrderDropShipPartnerList(
			ReferenceType newOrderDropShipPartnerList) {
		orderDropShipPartnerList = newOrderDropShipPartnerList;
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
	 * Sets the '{@link BusinessPartnerType#getOrderLineList() <em>orderLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrderLineList() orderLineList}' feature.
	 * @generated
	 */
	public void setOrderLineList(ReferenceType newOrderLineList) {
		orderLineList = newOrderLineList;
	}

	/**
	 * Returns the value of '<em><b>organizationInformationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationInformationList() {
		return organizationInformationList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getOrganizationInformationList() <em>organizationInformationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getOrganizationInformationList() organizationInformationList}' feature.
	 * @generated
	 */
	public void setOrganizationInformationList(
			ReferenceType newOrganizationInformationList) {
		organizationInformationList = newOrganizationInformationList;
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getPricingAdjustmentBusinessPartnerList() {
		return pricingAdjustmentBusinessPartnerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPricingAdjustmentBusinessPartnerList() <em>pricingAdjustmentBusinessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPricingAdjustmentBusinessPartnerList() pricingAdjustmentBusinessPartnerList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartnerList(
			ReferenceType newPricingAdjustmentBusinessPartnerList) {
		pricingAdjustmentBusinessPartnerList = newPricingAdjustmentBusinessPartnerList;
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
	 * Sets the '{@link BusinessPartnerType#getPricingPriceListSchemeLineList() <em>pricingPriceListSchemeLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPricingPriceListSchemeLineList() pricingPriceListSchemeLineList}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchemeLineList(
			ReferenceType newPricingPriceListSchemeLineList) {
		pricingPriceListSchemeLineList = newPricingPriceListSchemeLineList;
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountBusinessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountBusinessPartnerList</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountBusinessPartnerListType getPricingVolumeDiscountBusinessPartnerList() {
		return pricingVolumeDiscountBusinessPartnerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getPricingVolumeDiscountBusinessPartnerList() <em>pricingVolumeDiscountBusinessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getPricingVolumeDiscountBusinessPartnerList() pricingVolumeDiscountBusinessPartnerList}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountBusinessPartnerList(
			PricingVolumeDiscountBusinessPartnerListType newPricingVolumeDiscountBusinessPartnerList) {
		pricingVolumeDiscountBusinessPartnerList = newPricingVolumeDiscountBusinessPartnerList;
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcurementRequisitionList() {
		return procurementRequisitionList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProcurementRequisitionList() <em>procurementRequisitionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProcurementRequisitionList() procurementRequisitionList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionList(
			ReferenceType newProcurementRequisitionList) {
		procurementRequisitionList = newProcurementRequisitionList;
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
	 * Sets the '{@link BusinessPartnerType#getProcurementRequisitionLineList() <em>procurementRequisitionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProcurementRequisitionLineList() procurementRequisitionLineList}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLineList(
			ReferenceType newProcurementRequisitionLineList) {
		procurementRequisitionLineList = newProcurementRequisitionLineList;
	}

	/**
	 * Returns the value of '<em><b>productList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductList() {
		return productList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProductList() <em>productList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProductList() productList}' feature.
	 * @generated
	 */
	public void setProductList(ReferenceType newProductList) {
		productList = newProductList;
	}

	/**
	 * Returns the value of '<em><b>productCustomerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCustomerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCustomerList() {
		return productCustomerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProductCustomerList() <em>productCustomerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProductCustomerList() productCustomerList}' feature.
	 * @generated
	 */
	public void setProductCustomerList(ReferenceType newProductCustomerList) {
		productCustomerList = newProductCustomerList;
	}

	/**
	 * Returns the value of '<em><b>projectList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectList() {
		return projectList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProjectList() <em>projectList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProjectList() projectList}' feature.
	 * @generated
	 */
	public void setProjectList(ReferenceType newProjectList) {
		projectList = newProjectList;
	}

	/**
	 * Returns the value of '<em><b>projectPersonInChargeList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPersonInChargeList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectPersonInChargeList() {
		return projectPersonInChargeList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProjectPersonInChargeList() <em>projectPersonInChargeList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProjectPersonInChargeList() projectPersonInChargeList}' feature.
	 * @generated
	 */
	public void setProjectPersonInChargeList(
			ReferenceType newProjectPersonInChargeList) {
		projectPersonInChargeList = newProjectPersonInChargeList;
	}

	/**
	 * Returns the value of '<em><b>projectProposalList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectProposalList() {
		return projectProposalList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProjectProposalList() <em>projectProposalList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProjectProposalList() projectProposalList}' feature.
	 * @generated
	 */
	public void setProjectProposalList(ReferenceType newProjectProposalList) {
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
	public ReferenceType getProjectVendorList() {
		return projectVendorList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getProjectVendorList() <em>projectVendorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getProjectVendorList() projectVendorList}' feature.
	 * @generated
	 */
	public void setProjectVendorList(ReferenceType newProjectVendorList) {
		projectVendorList = newProjectVendorList;
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
	 * Sets the '{@link BusinessPartnerType#getSalesCommissionList() <em>salesCommissionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSalesCommissionList() salesCommissionList}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getSalesCommissionLineList() <em>salesCommissionLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getSalesCommissionLineList() salesCommissionLineList}' feature.
	 * @generated
	 */
	public void setSalesCommissionLineList(
			ReferenceType newSalesCommissionLineList) {
		salesCommissionLineList = newSalesCommissionLineList;
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getShippingShippingCompanyList() {
		return shippingShippingCompanyList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getShippingShippingCompanyList() <em>shippingShippingCompanyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getShippingShippingCompanyList() shippingShippingCompanyList}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyList(
			ReferenceType newShippingShippingCompanyList) {
		shippingShippingCompanyList = newShippingShippingCompanyList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetList() {
		return timeAndExpenseSheetList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTimeAndExpenseSheetList() <em>timeAndExpenseSheetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTimeAndExpenseSheetList() timeAndExpenseSheetList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetList(
			ReferenceType newTimeAndExpenseSheetList) {
		timeAndExpenseSheetList = newTimeAndExpenseSheetList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineList</b></em>' feature
	 * @generated
	 */
	public TimeAndExpenseSheetLineListType1 getTimeAndExpenseSheetLineList() {
		return timeAndExpenseSheetLineList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTimeAndExpenseSheetLineList() <em>timeAndExpenseSheetLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTimeAndExpenseSheetLineList() timeAndExpenseSheetLineList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineList(
			TimeAndExpenseSheetLineListType1 newTimeAndExpenseSheetLineList) {
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
	public TimeAndExpenseSheetLineVListType getTimeAndExpenseSheetLineVList() {
		return timeAndExpenseSheetLineVList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTimeAndExpenseSheetLineVList() <em>timeAndExpenseSheetLineVList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTimeAndExpenseSheetLineVList() timeAndExpenseSheetLineVList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineVList(
			TimeAndExpenseSheetLineVListType newTimeAndExpenseSheetLineVList) {
		timeAndExpenseSheetLineVList = newTimeAndExpenseSheetLineVList;
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineVChargedBusinessPartnerList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineVChargedBusinessPartnerList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTimeAndExpenseSheetLineVChargedBusinessPartnerList() {
		return timeAndExpenseSheetLineVChargedBusinessPartnerList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getTimeAndExpenseSheetLineVChargedBusinessPartnerList() <em>timeAndExpenseSheetLineVChargedBusinessPartnerList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getTimeAndExpenseSheetLineVChargedBusinessPartnerList() timeAndExpenseSheetLineVChargedBusinessPartnerList}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineVChargedBusinessPartnerList(
			ReferenceType newTimeAndExpenseSheetLineVChargedBusinessPartnerList) {
		timeAndExpenseSheetLineVChargedBusinessPartnerList = newTimeAndExpenseSheetLineVChargedBusinessPartnerList;
	}

	/**
	 * Returns the value of '<em><b>vendorAccountsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccountsList</b></em>' feature
	 * @generated
	 */
	public VendorAccountsListType1 getVendorAccountsList() {
		return vendorAccountsList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getVendorAccountsList() <em>vendorAccountsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getVendorAccountsList() vendorAccountsList}' feature.
	 * @generated
	 */
	public void setVendorAccountsList(
			VendorAccountsListType1 newVendorAccountsList) {
		vendorAccountsList = newVendorAccountsList;
	}

	/**
	 * Returns the value of '<em><b>warehouseShipperList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseShipperList</b></em>' feature
	 * @generated
	 */
	public WarehouseShipperListType1 getWarehouseShipperList() {
		return warehouseShipperList;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getWarehouseShipperList() <em>warehouseShipperList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getWarehouseShipperList() warehouseShipperList}' feature.
	 * @generated
	 */
	public void setWarehouseShipperList(
			WarehouseShipperListType1 newWarehouseShipperList) {
		warehouseShipperList = newWarehouseShipperList;
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
	 * Sets the '{@link BusinessPartnerType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getId1() id1}' feature.
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
	 * Sets the '{@link BusinessPartnerType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link BusinessPartnerType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#isReference() reference}' feature.
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
	public List<BusinessPartnerTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link BusinessPartnerType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link BusinessPartnerType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<BusinessPartnerTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "BusinessPartnerType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
