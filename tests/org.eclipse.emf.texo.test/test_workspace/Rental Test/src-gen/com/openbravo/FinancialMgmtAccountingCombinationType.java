package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>FinancialMgmtAccountingCombinationType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class FinancialMgmtAccountingCombinationType {

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
	private String alias = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String combination = null;

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
	private Boolean fullyQualified = null;

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
	private ReferenceType account = null;

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
	private ReferenceType trxOrganization = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType locationFromAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType locationToAddress = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType salesRegion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType project = null;

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
	private ReferenceType activity = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String stDimension = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String ndDimension = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankInTransitList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankInterestRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankInterestExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankUnidentifiedReceiptsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsUnallocatedCashList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsPaymentSelectionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankSettlementGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankSettlementLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankRevaluationGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType bankAccountAccountsBankRevaluationLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountCustomerReceivablesNoList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountCustomerPrepaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountVendorLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountVendorServiceLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountVendorPrepaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountPaymentDiscountExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountPaymentDiscountRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountWriteoffList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountUnrealizedGainsAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountUnrealizedLossesAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountRealizedGainAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountRealizedLossAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountNonInvoicedReceiptsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountUnearnedRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountNonInvoicedRevenuesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountNonInvoicedReceivablesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType businessPartnerCategoryAccountWriteoffRevAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType customerAccountsCustomerReceivablesNoList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType customerAccountsCustomerPrepaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType employeeAccountsEmployeeExpensesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType employeeAccountsEmployeePrepaymentsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctReceivePaymentAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctMakePaymentAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctDepositAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctWithdrawalAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctDebitAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctCreditAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctFINBankfeeAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctFINBankrevaluationgainAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctFINBankrevaluationlossAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctFINOutIntransitAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctClearedPaymentAccountOUTList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctInTransitPaymentAccountINList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctClearedPaymentAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctFINAssetAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType fINFinancialAccountAcctFINTransitoryAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultWarehouseInventoryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultInventoryAdjustmentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultWarehouseDifferencesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultInventoryRevaluationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultProductRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultProductExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultFixedAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultPurchasePriceVarianceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultInvoicePriceVarianceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTradeDiscountReceivedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTradeDiscountGrantedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultProductCOGSList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCustomerReceivablesNoList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCustomerPrepaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultVendorLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultVendorServiceLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultVendorPrepaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultWriteoffList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultWriteoffRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultRealizedGainAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultRealizedLossAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultWithholdingAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultEmployeePrepaymentsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultEmployeeExpensesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultProjectAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultWorkInProgressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTaxExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTaxLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTaxReceivablesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTaxDueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultTaxCreditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankInTransitList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankInterestRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankInterestExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultUnallocatedCashList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultPaymentSelectionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankSettlementGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankSettlementLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankRevaluationGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultBankRevaluationLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultChargeExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultChargeRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultUnearnedRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCashBookAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCashTransferList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCashBookDifferencesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCashBookExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultCashBookReceiptList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultAccumulatedDepreciationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultDepreciationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultDisposalGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaDefaultDisposalLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLSuspenseBalancingList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLSuspenseErrorList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLCurrencyBalancingAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLRetainedEarningList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLIncomeSummaryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLDueToIntercompanyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLDueFromIntercompanyList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLPPVOffsetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAcctSchemaGLCFSOrderAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetAccountsDepreciationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetAccountsAccumulatedDepreciationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetAccountsDisposalLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetAccountsDisposalGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetGroupAcctDepreciationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetGroupAcctAccumulatedDepreciationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetGroupAcctDisposalLossList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtAssetGroupAcctDisposalGainList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtCashBookAccountsCashBookAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtCashBookAccountsCashTransferList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtCashBookAccountsCashBookDifferencesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtCashBookAccountsCashBookExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtCashBookAccountsCashBookReceiptList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLChargeAccountsChargeExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLChargeAccountsChargeRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLItemAccountsGlitemDebitAcctList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtGLItemAccountsGlitemCreditAcctList = null;

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
	private ReferenceType financialMgmtTaxRateAccountsTaxDueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateAccountsTaxLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateAccountsTaxCreditList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateAccountsTaxReceivablesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtTaxRateAccountsTaxExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType financialMgmtWithholdingAccountsWithholdingAccountList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsProductRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsProductExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsFixedAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsPurchasePriceVarianceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsInvoicePriceVarianceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsProductCOGSList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsTradeDiscountReceivedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productAccountsTradeDiscountGrantedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsProductRevenueList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsProductExpenseList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsFixedAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsProductCOGSList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsPurchasePriceVarianceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsInvoicePriceVarianceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsTradeDiscountReceivedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType productCategoryAccountsTradeDiscountGrantedList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectAccountsProjectAssetList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType projectAccountsWorkInProgressList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType vendorAccountsVendorLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType vendorAccountsVendorServiceLiabilityList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType vendorAccountsVendorPrepaymentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType warehouseAccountsWarehouseInventoryList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType warehouseAccountsInventoryAdjustmentList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType warehouseAccountsWarehouseDifferencesList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType warehouseAccountsInventoryRevaluationList = null;

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
	private List<FinancialMgmtAccountingCombinationTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<FinancialMgmtAccountingCombinationTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getId() id}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getClient() client}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getOrganization() organization}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getActive() active}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getUpdated() updated}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>alias</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>alias</b></em>' feature
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getAlias() <em>alias</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getAlias() alias}' feature.
	 * @generated
	 */
	public void setAlias(String newAlias) {
		alias = newAlias;
	}

	/**
	 * Returns the value of '<em><b>combination</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>combination</b></em>' feature
	 * @generated
	 */
	public String getCombination() {
		return combination;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getCombination() <em>combination</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getCombination() combination}' feature.
	 * @generated
	 */
	public void setCombination(String newCombination) {
		combination = newCombination;
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>fullyQualified</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fullyQualified</b></em>' feature
	 * @generated
	 */
	public Boolean getFullyQualified() {
		return fullyQualified;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFullyQualified() <em>fullyQualified</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFullyQualified() fullyQualified}' feature.
	 * @generated
	 */
	public void setFullyQualified(Boolean newFullyQualified) {
		fullyQualified = newFullyQualified;
	}

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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getAccountingSchema() <em>accountingSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getAccountingSchema() accountingSchema}' feature.
	 * @generated
	 */
	public void setAccountingSchema(ReferenceType newAccountingSchema) {
		accountingSchema = newAccountingSchema;
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getAccount() <em>account</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getAccount() account}' feature.
	 * @generated
	 */
	public void setAccount(ReferenceType newAccount) {
		account = newAccount;
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProduct() product}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ReferenceType newBusinessPartner) {
		businessPartner = newBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>trxOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>trxOrganization</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTrxOrganization() {
		return trxOrganization;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getTrxOrganization() <em>trxOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getTrxOrganization() trxOrganization}' feature.
	 * @generated
	 */
	public void setTrxOrganization(ReferenceType newTrxOrganization) {
		trxOrganization = newTrxOrganization;
	}

	/**
	 * Returns the value of '<em><b>locationFromAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationFromAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationFromAddress() {
		return locationFromAddress;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getLocationFromAddress() <em>locationFromAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getLocationFromAddress() locationFromAddress}' feature.
	 * @generated
	 */
	public void setLocationFromAddress(ReferenceType newLocationFromAddress) {
		locationFromAddress = newLocationFromAddress;
	}

	/**
	 * Returns the value of '<em><b>locationToAddress</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locationToAddress</b></em>' feature
	 * @generated
	 */
	public ReferenceType getLocationToAddress() {
		return locationToAddress;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getLocationToAddress() <em>locationToAddress</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getLocationToAddress() locationToAddress}' feature.
	 * @generated
	 */
	public void setLocationToAddress(ReferenceType newLocationToAddress) {
		locationToAddress = newLocationToAddress;
	}

	/**
	 * Returns the value of '<em><b>salesRegion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRegion</b></em>' feature
	 * @generated
	 */
	public ReferenceType getSalesRegion() {
		return salesRegion;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(ReferenceType newSalesRegion) {
		salesRegion = newSalesRegion;
	}

	/**
	 * Returns the value of '<em><b>project</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>project</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProject() {
		return project;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ReferenceType newProject) {
		project = newProject;
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getSalesCampaign() <em>salesCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getSalesCampaign() salesCampaign}' feature.
	 * @generated
	 */
	public void setSalesCampaign(ReferenceType newSalesCampaign) {
		salesCampaign = newSalesCampaign;
	}

	/**
	 * Returns the value of '<em><b>activity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activity</b></em>' feature
	 * @generated
	 */
	public ReferenceType getActivity() {
		return activity;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getActivity() <em>activity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getActivity() activity}' feature.
	 * @generated
	 */
	public void setActivity(ReferenceType newActivity) {
		activity = newActivity;
	}

	/**
	 * Returns the value of '<em><b>stDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>stDimension</b></em>' feature
	 * @generated
	 */
	public String getStDimension() {
		return stDimension;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getStDimension() <em>stDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getStDimension() stDimension}' feature.
	 * @generated
	 */
	public void setStDimension(String newStDimension) {
		stDimension = newStDimension;
	}

	/**
	 * Returns the value of '<em><b>ndDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>ndDimension</b></em>' feature
	 * @generated
	 */
	public String getNdDimension() {
		return ndDimension;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getNdDimension() <em>ndDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getNdDimension() ndDimension}' feature.
	 * @generated
	 */
	public void setNdDimension(String newNdDimension) {
		ndDimension = newNdDimension;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankInTransitList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankInTransitList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankInTransitList() {
		return bankAccountAccountsBankInTransitList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankInTransitList() <em>bankAccountAccountsBankInTransitList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankInTransitList() bankAccountAccountsBankInTransitList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankInTransitList(
			ReferenceType newBankAccountAccountsBankInTransitList) {
		bankAccountAccountsBankInTransitList = newBankAccountAccountsBankInTransitList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankAssetList() {
		return bankAccountAccountsBankAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankAssetList() <em>bankAccountAccountsBankAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankAssetList() bankAccountAccountsBankAssetList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankAssetList(
			ReferenceType newBankAccountAccountsBankAssetList) {
		bankAccountAccountsBankAssetList = newBankAccountAccountsBankAssetList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankExpenseList() {
		return bankAccountAccountsBankExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankExpenseList() <em>bankAccountAccountsBankExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankExpenseList() bankAccountAccountsBankExpenseList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankExpenseList(
			ReferenceType newBankAccountAccountsBankExpenseList) {
		bankAccountAccountsBankExpenseList = newBankAccountAccountsBankExpenseList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankInterestRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankInterestRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankInterestRevenueList() {
		return bankAccountAccountsBankInterestRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankInterestRevenueList() <em>bankAccountAccountsBankInterestRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankInterestRevenueList() bankAccountAccountsBankInterestRevenueList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankInterestRevenueList(
			ReferenceType newBankAccountAccountsBankInterestRevenueList) {
		bankAccountAccountsBankInterestRevenueList = newBankAccountAccountsBankInterestRevenueList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankInterestExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankInterestExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankInterestExpenseList() {
		return bankAccountAccountsBankInterestExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankInterestExpenseList() <em>bankAccountAccountsBankInterestExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankInterestExpenseList() bankAccountAccountsBankInterestExpenseList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankInterestExpenseList(
			ReferenceType newBankAccountAccountsBankInterestExpenseList) {
		bankAccountAccountsBankInterestExpenseList = newBankAccountAccountsBankInterestExpenseList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankUnidentifiedReceiptsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankUnidentifiedReceiptsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankUnidentifiedReceiptsList() {
		return bankAccountAccountsBankUnidentifiedReceiptsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankUnidentifiedReceiptsList() <em>bankAccountAccountsBankUnidentifiedReceiptsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankUnidentifiedReceiptsList() bankAccountAccountsBankUnidentifiedReceiptsList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankUnidentifiedReceiptsList(
			ReferenceType newBankAccountAccountsBankUnidentifiedReceiptsList) {
		bankAccountAccountsBankUnidentifiedReceiptsList = newBankAccountAccountsBankUnidentifiedReceiptsList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsUnallocatedCashList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsUnallocatedCashList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsUnallocatedCashList() {
		return bankAccountAccountsUnallocatedCashList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsUnallocatedCashList() <em>bankAccountAccountsUnallocatedCashList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsUnallocatedCashList() bankAccountAccountsUnallocatedCashList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsUnallocatedCashList(
			ReferenceType newBankAccountAccountsUnallocatedCashList) {
		bankAccountAccountsUnallocatedCashList = newBankAccountAccountsUnallocatedCashList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsPaymentSelectionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsPaymentSelectionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsPaymentSelectionList() {
		return bankAccountAccountsPaymentSelectionList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsPaymentSelectionList() <em>bankAccountAccountsPaymentSelectionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsPaymentSelectionList() bankAccountAccountsPaymentSelectionList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsPaymentSelectionList(
			ReferenceType newBankAccountAccountsPaymentSelectionList) {
		bankAccountAccountsPaymentSelectionList = newBankAccountAccountsPaymentSelectionList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankSettlementGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankSettlementGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankSettlementGainList() {
		return bankAccountAccountsBankSettlementGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankSettlementGainList() <em>bankAccountAccountsBankSettlementGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankSettlementGainList() bankAccountAccountsBankSettlementGainList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankSettlementGainList(
			ReferenceType newBankAccountAccountsBankSettlementGainList) {
		bankAccountAccountsBankSettlementGainList = newBankAccountAccountsBankSettlementGainList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankSettlementLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankSettlementLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankSettlementLossList() {
		return bankAccountAccountsBankSettlementLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankSettlementLossList() <em>bankAccountAccountsBankSettlementLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankSettlementLossList() bankAccountAccountsBankSettlementLossList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankSettlementLossList(
			ReferenceType newBankAccountAccountsBankSettlementLossList) {
		bankAccountAccountsBankSettlementLossList = newBankAccountAccountsBankSettlementLossList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankRevaluationGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankRevaluationGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankRevaluationGainList() {
		return bankAccountAccountsBankRevaluationGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankRevaluationGainList() <em>bankAccountAccountsBankRevaluationGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankRevaluationGainList() bankAccountAccountsBankRevaluationGainList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankRevaluationGainList(
			ReferenceType newBankAccountAccountsBankRevaluationGainList) {
		bankAccountAccountsBankRevaluationGainList = newBankAccountAccountsBankRevaluationGainList;
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccountsBankRevaluationLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccountsBankRevaluationLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBankAccountAccountsBankRevaluationLossList() {
		return bankAccountAccountsBankRevaluationLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankRevaluationLossList() <em>bankAccountAccountsBankRevaluationLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBankAccountAccountsBankRevaluationLossList() bankAccountAccountsBankRevaluationLossList}' feature.
	 * @generated
	 */
	public void setBankAccountAccountsBankRevaluationLossList(
			ReferenceType newBankAccountAccountsBankRevaluationLossList) {
		bankAccountAccountsBankRevaluationLossList = newBankAccountAccountsBankRevaluationLossList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountCustomerReceivablesNoList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountCustomerReceivablesNoList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountCustomerReceivablesNoList() {
		return businessPartnerCategoryAccountCustomerReceivablesNoList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountCustomerReceivablesNoList() <em>businessPartnerCategoryAccountCustomerReceivablesNoList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountCustomerReceivablesNoList() businessPartnerCategoryAccountCustomerReceivablesNoList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountCustomerReceivablesNoList(
			ReferenceType newBusinessPartnerCategoryAccountCustomerReceivablesNoList) {
		businessPartnerCategoryAccountCustomerReceivablesNoList = newBusinessPartnerCategoryAccountCustomerReceivablesNoList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountCustomerPrepaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountCustomerPrepaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountCustomerPrepaymentList() {
		return businessPartnerCategoryAccountCustomerPrepaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountCustomerPrepaymentList() <em>businessPartnerCategoryAccountCustomerPrepaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountCustomerPrepaymentList() businessPartnerCategoryAccountCustomerPrepaymentList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountCustomerPrepaymentList(
			ReferenceType newBusinessPartnerCategoryAccountCustomerPrepaymentList) {
		businessPartnerCategoryAccountCustomerPrepaymentList = newBusinessPartnerCategoryAccountCustomerPrepaymentList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountVendorLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountVendorLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountVendorLiabilityList() {
		return businessPartnerCategoryAccountVendorLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountVendorLiabilityList() <em>businessPartnerCategoryAccountVendorLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountVendorLiabilityList() businessPartnerCategoryAccountVendorLiabilityList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountVendorLiabilityList(
			ReferenceType newBusinessPartnerCategoryAccountVendorLiabilityList) {
		businessPartnerCategoryAccountVendorLiabilityList = newBusinessPartnerCategoryAccountVendorLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountVendorServiceLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountVendorServiceLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountVendorServiceLiabilityList() {
		return businessPartnerCategoryAccountVendorServiceLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountVendorServiceLiabilityList() <em>businessPartnerCategoryAccountVendorServiceLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountVendorServiceLiabilityList() businessPartnerCategoryAccountVendorServiceLiabilityList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountVendorServiceLiabilityList(
			ReferenceType newBusinessPartnerCategoryAccountVendorServiceLiabilityList) {
		businessPartnerCategoryAccountVendorServiceLiabilityList = newBusinessPartnerCategoryAccountVendorServiceLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountVendorPrepaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountVendorPrepaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountVendorPrepaymentList() {
		return businessPartnerCategoryAccountVendorPrepaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountVendorPrepaymentList() <em>businessPartnerCategoryAccountVendorPrepaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountVendorPrepaymentList() businessPartnerCategoryAccountVendorPrepaymentList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountVendorPrepaymentList(
			ReferenceType newBusinessPartnerCategoryAccountVendorPrepaymentList) {
		businessPartnerCategoryAccountVendorPrepaymentList = newBusinessPartnerCategoryAccountVendorPrepaymentList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountPaymentDiscountExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountPaymentDiscountExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountPaymentDiscountExpenseList() {
		return businessPartnerCategoryAccountPaymentDiscountExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountPaymentDiscountExpenseList() <em>businessPartnerCategoryAccountPaymentDiscountExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountPaymentDiscountExpenseList() businessPartnerCategoryAccountPaymentDiscountExpenseList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountPaymentDiscountExpenseList(
			ReferenceType newBusinessPartnerCategoryAccountPaymentDiscountExpenseList) {
		businessPartnerCategoryAccountPaymentDiscountExpenseList = newBusinessPartnerCategoryAccountPaymentDiscountExpenseList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountPaymentDiscountRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountPaymentDiscountRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountPaymentDiscountRevenueList() {
		return businessPartnerCategoryAccountPaymentDiscountRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountPaymentDiscountRevenueList() <em>businessPartnerCategoryAccountPaymentDiscountRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountPaymentDiscountRevenueList() businessPartnerCategoryAccountPaymentDiscountRevenueList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountPaymentDiscountRevenueList(
			ReferenceType newBusinessPartnerCategoryAccountPaymentDiscountRevenueList) {
		businessPartnerCategoryAccountPaymentDiscountRevenueList = newBusinessPartnerCategoryAccountPaymentDiscountRevenueList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountWriteoffList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountWriteoffList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountWriteoffList() {
		return businessPartnerCategoryAccountWriteoffList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountWriteoffList() <em>businessPartnerCategoryAccountWriteoffList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountWriteoffList() businessPartnerCategoryAccountWriteoffList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountWriteoffList(
			ReferenceType newBusinessPartnerCategoryAccountWriteoffList) {
		businessPartnerCategoryAccountWriteoffList = newBusinessPartnerCategoryAccountWriteoffList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountUnrealizedGainsAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountUnrealizedGainsAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountUnrealizedGainsAcctList() {
		return businessPartnerCategoryAccountUnrealizedGainsAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountUnrealizedGainsAcctList() <em>businessPartnerCategoryAccountUnrealizedGainsAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountUnrealizedGainsAcctList() businessPartnerCategoryAccountUnrealizedGainsAcctList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountUnrealizedGainsAcctList(
			ReferenceType newBusinessPartnerCategoryAccountUnrealizedGainsAcctList) {
		businessPartnerCategoryAccountUnrealizedGainsAcctList = newBusinessPartnerCategoryAccountUnrealizedGainsAcctList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountUnrealizedLossesAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountUnrealizedLossesAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountUnrealizedLossesAcctList() {
		return businessPartnerCategoryAccountUnrealizedLossesAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountUnrealizedLossesAcctList() <em>businessPartnerCategoryAccountUnrealizedLossesAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountUnrealizedLossesAcctList() businessPartnerCategoryAccountUnrealizedLossesAcctList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountUnrealizedLossesAcctList(
			ReferenceType newBusinessPartnerCategoryAccountUnrealizedLossesAcctList) {
		businessPartnerCategoryAccountUnrealizedLossesAcctList = newBusinessPartnerCategoryAccountUnrealizedLossesAcctList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountRealizedGainAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountRealizedGainAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountRealizedGainAcctList() {
		return businessPartnerCategoryAccountRealizedGainAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountRealizedGainAcctList() <em>businessPartnerCategoryAccountRealizedGainAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountRealizedGainAcctList() businessPartnerCategoryAccountRealizedGainAcctList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountRealizedGainAcctList(
			ReferenceType newBusinessPartnerCategoryAccountRealizedGainAcctList) {
		businessPartnerCategoryAccountRealizedGainAcctList = newBusinessPartnerCategoryAccountRealizedGainAcctList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountRealizedLossAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountRealizedLossAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountRealizedLossAcctList() {
		return businessPartnerCategoryAccountRealizedLossAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountRealizedLossAcctList() <em>businessPartnerCategoryAccountRealizedLossAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountRealizedLossAcctList() businessPartnerCategoryAccountRealizedLossAcctList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountRealizedLossAcctList(
			ReferenceType newBusinessPartnerCategoryAccountRealizedLossAcctList) {
		businessPartnerCategoryAccountRealizedLossAcctList = newBusinessPartnerCategoryAccountRealizedLossAcctList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountNonInvoicedReceiptsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountNonInvoicedReceiptsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountNonInvoicedReceiptsList() {
		return businessPartnerCategoryAccountNonInvoicedReceiptsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountNonInvoicedReceiptsList() <em>businessPartnerCategoryAccountNonInvoicedReceiptsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountNonInvoicedReceiptsList() businessPartnerCategoryAccountNonInvoicedReceiptsList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountNonInvoicedReceiptsList(
			ReferenceType newBusinessPartnerCategoryAccountNonInvoicedReceiptsList) {
		businessPartnerCategoryAccountNonInvoicedReceiptsList = newBusinessPartnerCategoryAccountNonInvoicedReceiptsList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountUnearnedRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountUnearnedRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountUnearnedRevenueList() {
		return businessPartnerCategoryAccountUnearnedRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountUnearnedRevenueList() <em>businessPartnerCategoryAccountUnearnedRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountUnearnedRevenueList() businessPartnerCategoryAccountUnearnedRevenueList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountUnearnedRevenueList(
			ReferenceType newBusinessPartnerCategoryAccountUnearnedRevenueList) {
		businessPartnerCategoryAccountUnearnedRevenueList = newBusinessPartnerCategoryAccountUnearnedRevenueList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountNonInvoicedRevenuesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountNonInvoicedRevenuesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountNonInvoicedRevenuesList() {
		return businessPartnerCategoryAccountNonInvoicedRevenuesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountNonInvoicedRevenuesList() <em>businessPartnerCategoryAccountNonInvoicedRevenuesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountNonInvoicedRevenuesList() businessPartnerCategoryAccountNonInvoicedRevenuesList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountNonInvoicedRevenuesList(
			ReferenceType newBusinessPartnerCategoryAccountNonInvoicedRevenuesList) {
		businessPartnerCategoryAccountNonInvoicedRevenuesList = newBusinessPartnerCategoryAccountNonInvoicedRevenuesList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountNonInvoicedReceivablesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountNonInvoicedReceivablesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountNonInvoicedReceivablesList() {
		return businessPartnerCategoryAccountNonInvoicedReceivablesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountNonInvoicedReceivablesList() <em>businessPartnerCategoryAccountNonInvoicedReceivablesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountNonInvoicedReceivablesList() businessPartnerCategoryAccountNonInvoicedReceivablesList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountNonInvoicedReceivablesList(
			ReferenceType newBusinessPartnerCategoryAccountNonInvoicedReceivablesList) {
		businessPartnerCategoryAccountNonInvoicedReceivablesList = newBusinessPartnerCategoryAccountNonInvoicedReceivablesList;
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccountWriteoffRevAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccountWriteoffRevAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getBusinessPartnerCategoryAccountWriteoffRevAcctList() {
		return businessPartnerCategoryAccountWriteoffRevAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountWriteoffRevAcctList() <em>businessPartnerCategoryAccountWriteoffRevAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getBusinessPartnerCategoryAccountWriteoffRevAcctList() businessPartnerCategoryAccountWriteoffRevAcctList}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccountWriteoffRevAcctList(
			ReferenceType newBusinessPartnerCategoryAccountWriteoffRevAcctList) {
		businessPartnerCategoryAccountWriteoffRevAcctList = newBusinessPartnerCategoryAccountWriteoffRevAcctList;
	}

	/**
	 * Returns the value of '<em><b>customerAccountsCustomerReceivablesNoList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccountsCustomerReceivablesNoList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCustomerAccountsCustomerReceivablesNoList() {
		return customerAccountsCustomerReceivablesNoList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getCustomerAccountsCustomerReceivablesNoList() <em>customerAccountsCustomerReceivablesNoList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getCustomerAccountsCustomerReceivablesNoList() customerAccountsCustomerReceivablesNoList}' feature.
	 * @generated
	 */
	public void setCustomerAccountsCustomerReceivablesNoList(
			ReferenceType newCustomerAccountsCustomerReceivablesNoList) {
		customerAccountsCustomerReceivablesNoList = newCustomerAccountsCustomerReceivablesNoList;
	}

	/**
	 * Returns the value of '<em><b>customerAccountsCustomerPrepaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccountsCustomerPrepaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getCustomerAccountsCustomerPrepaymentList() {
		return customerAccountsCustomerPrepaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getCustomerAccountsCustomerPrepaymentList() <em>customerAccountsCustomerPrepaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getCustomerAccountsCustomerPrepaymentList() customerAccountsCustomerPrepaymentList}' feature.
	 * @generated
	 */
	public void setCustomerAccountsCustomerPrepaymentList(
			ReferenceType newCustomerAccountsCustomerPrepaymentList) {
		customerAccountsCustomerPrepaymentList = newCustomerAccountsCustomerPrepaymentList;
	}

	/**
	 * Returns the value of '<em><b>employeeAccountsEmployeeExpensesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccountsEmployeeExpensesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getEmployeeAccountsEmployeeExpensesList() {
		return employeeAccountsEmployeeExpensesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getEmployeeAccountsEmployeeExpensesList() <em>employeeAccountsEmployeeExpensesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getEmployeeAccountsEmployeeExpensesList() employeeAccountsEmployeeExpensesList}' feature.
	 * @generated
	 */
	public void setEmployeeAccountsEmployeeExpensesList(
			ReferenceType newEmployeeAccountsEmployeeExpensesList) {
		employeeAccountsEmployeeExpensesList = newEmployeeAccountsEmployeeExpensesList;
	}

	/**
	 * Returns the value of '<em><b>employeeAccountsEmployeePrepaymentsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccountsEmployeePrepaymentsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getEmployeeAccountsEmployeePrepaymentsList() {
		return employeeAccountsEmployeePrepaymentsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getEmployeeAccountsEmployeePrepaymentsList() <em>employeeAccountsEmployeePrepaymentsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getEmployeeAccountsEmployeePrepaymentsList() employeeAccountsEmployeePrepaymentsList}' feature.
	 * @generated
	 */
	public void setEmployeeAccountsEmployeePrepaymentsList(
			ReferenceType newEmployeeAccountsEmployeePrepaymentsList) {
		employeeAccountsEmployeePrepaymentsList = newEmployeeAccountsEmployeePrepaymentsList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctReceivePaymentAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctReceivePaymentAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctReceivePaymentAccountList() {
		return fINFinancialAccountAcctReceivePaymentAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctReceivePaymentAccountList() <em>fINFinancialAccountAcctReceivePaymentAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctReceivePaymentAccountList() fINFinancialAccountAcctReceivePaymentAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctReceivePaymentAccountList(
			ReferenceType newFINFinancialAccountAcctReceivePaymentAccountList) {
		fINFinancialAccountAcctReceivePaymentAccountList = newFINFinancialAccountAcctReceivePaymentAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctMakePaymentAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctMakePaymentAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctMakePaymentAccountList() {
		return fINFinancialAccountAcctMakePaymentAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctMakePaymentAccountList() <em>fINFinancialAccountAcctMakePaymentAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctMakePaymentAccountList() fINFinancialAccountAcctMakePaymentAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctMakePaymentAccountList(
			ReferenceType newFINFinancialAccountAcctMakePaymentAccountList) {
		fINFinancialAccountAcctMakePaymentAccountList = newFINFinancialAccountAcctMakePaymentAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctDepositAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctDepositAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctDepositAccountList() {
		return fINFinancialAccountAcctDepositAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctDepositAccountList() <em>fINFinancialAccountAcctDepositAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctDepositAccountList() fINFinancialAccountAcctDepositAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctDepositAccountList(
			ReferenceType newFINFinancialAccountAcctDepositAccountList) {
		fINFinancialAccountAcctDepositAccountList = newFINFinancialAccountAcctDepositAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctWithdrawalAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctWithdrawalAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctWithdrawalAccountList() {
		return fINFinancialAccountAcctWithdrawalAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctWithdrawalAccountList() <em>fINFinancialAccountAcctWithdrawalAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctWithdrawalAccountList() fINFinancialAccountAcctWithdrawalAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctWithdrawalAccountList(
			ReferenceType newFINFinancialAccountAcctWithdrawalAccountList) {
		fINFinancialAccountAcctWithdrawalAccountList = newFINFinancialAccountAcctWithdrawalAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctDebitAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctDebitAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctDebitAccountList() {
		return fINFinancialAccountAcctDebitAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctDebitAccountList() <em>fINFinancialAccountAcctDebitAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctDebitAccountList() fINFinancialAccountAcctDebitAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctDebitAccountList(
			ReferenceType newFINFinancialAccountAcctDebitAccountList) {
		fINFinancialAccountAcctDebitAccountList = newFINFinancialAccountAcctDebitAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctCreditAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctCreditAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctCreditAccountList() {
		return fINFinancialAccountAcctCreditAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctCreditAccountList() <em>fINFinancialAccountAcctCreditAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctCreditAccountList() fINFinancialAccountAcctCreditAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctCreditAccountList(
			ReferenceType newFINFinancialAccountAcctCreditAccountList) {
		fINFinancialAccountAcctCreditAccountList = newFINFinancialAccountAcctCreditAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctFINBankfeeAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctFINBankfeeAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctFINBankfeeAcctList() {
		return fINFinancialAccountAcctFINBankfeeAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINBankfeeAcctList() <em>fINFinancialAccountAcctFINBankfeeAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINBankfeeAcctList() fINFinancialAccountAcctFINBankfeeAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctFINBankfeeAcctList(
			ReferenceType newFINFinancialAccountAcctFINBankfeeAcctList) {
		fINFinancialAccountAcctFINBankfeeAcctList = newFINFinancialAccountAcctFINBankfeeAcctList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctFINBankrevaluationgainAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctFINBankrevaluationgainAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctFINBankrevaluationgainAcctList() {
		return fINFinancialAccountAcctFINBankrevaluationgainAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINBankrevaluationgainAcctList() <em>fINFinancialAccountAcctFINBankrevaluationgainAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINBankrevaluationgainAcctList() fINFinancialAccountAcctFINBankrevaluationgainAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctFINBankrevaluationgainAcctList(
			ReferenceType newFINFinancialAccountAcctFINBankrevaluationgainAcctList) {
		fINFinancialAccountAcctFINBankrevaluationgainAcctList = newFINFinancialAccountAcctFINBankrevaluationgainAcctList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctFINBankrevaluationlossAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctFINBankrevaluationlossAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctFINBankrevaluationlossAcctList() {
		return fINFinancialAccountAcctFINBankrevaluationlossAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINBankrevaluationlossAcctList() <em>fINFinancialAccountAcctFINBankrevaluationlossAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINBankrevaluationlossAcctList() fINFinancialAccountAcctFINBankrevaluationlossAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctFINBankrevaluationlossAcctList(
			ReferenceType newFINFinancialAccountAcctFINBankrevaluationlossAcctList) {
		fINFinancialAccountAcctFINBankrevaluationlossAcctList = newFINFinancialAccountAcctFINBankrevaluationlossAcctList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctFINOutIntransitAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctFINOutIntransitAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctFINOutIntransitAcctList() {
		return fINFinancialAccountAcctFINOutIntransitAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINOutIntransitAcctList() <em>fINFinancialAccountAcctFINOutIntransitAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINOutIntransitAcctList() fINFinancialAccountAcctFINOutIntransitAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctFINOutIntransitAcctList(
			ReferenceType newFINFinancialAccountAcctFINOutIntransitAcctList) {
		fINFinancialAccountAcctFINOutIntransitAcctList = newFINFinancialAccountAcctFINOutIntransitAcctList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctClearedPaymentAccountOUTList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctClearedPaymentAccountOUTList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctClearedPaymentAccountOUTList() {
		return fINFinancialAccountAcctClearedPaymentAccountOUTList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctClearedPaymentAccountOUTList() <em>fINFinancialAccountAcctClearedPaymentAccountOUTList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctClearedPaymentAccountOUTList() fINFinancialAccountAcctClearedPaymentAccountOUTList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctClearedPaymentAccountOUTList(
			ReferenceType newFINFinancialAccountAcctClearedPaymentAccountOUTList) {
		fINFinancialAccountAcctClearedPaymentAccountOUTList = newFINFinancialAccountAcctClearedPaymentAccountOUTList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctInTransitPaymentAccountINList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctInTransitPaymentAccountINList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctInTransitPaymentAccountINList() {
		return fINFinancialAccountAcctInTransitPaymentAccountINList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctInTransitPaymentAccountINList() <em>fINFinancialAccountAcctInTransitPaymentAccountINList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctInTransitPaymentAccountINList() fINFinancialAccountAcctInTransitPaymentAccountINList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctInTransitPaymentAccountINList(
			ReferenceType newFINFinancialAccountAcctInTransitPaymentAccountINList) {
		fINFinancialAccountAcctInTransitPaymentAccountINList = newFINFinancialAccountAcctInTransitPaymentAccountINList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctClearedPaymentAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctClearedPaymentAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctClearedPaymentAccountList() {
		return fINFinancialAccountAcctClearedPaymentAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctClearedPaymentAccountList() <em>fINFinancialAccountAcctClearedPaymentAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctClearedPaymentAccountList() fINFinancialAccountAcctClearedPaymentAccountList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctClearedPaymentAccountList(
			ReferenceType newFINFinancialAccountAcctClearedPaymentAccountList) {
		fINFinancialAccountAcctClearedPaymentAccountList = newFINFinancialAccountAcctClearedPaymentAccountList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctFINAssetAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctFINAssetAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctFINAssetAcctList() {
		return fINFinancialAccountAcctFINAssetAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINAssetAcctList() <em>fINFinancialAccountAcctFINAssetAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINAssetAcctList() fINFinancialAccountAcctFINAssetAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctFINAssetAcctList(
			ReferenceType newFINFinancialAccountAcctFINAssetAcctList) {
		fINFinancialAccountAcctFINAssetAcctList = newFINFinancialAccountAcctFINAssetAcctList;
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcctFINTransitoryAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcctFINTransitoryAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFINFinancialAccountAcctFINTransitoryAcctList() {
		return fINFinancialAccountAcctFINTransitoryAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINTransitoryAcctList() <em>fINFinancialAccountAcctFINTransitoryAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFINFinancialAccountAcctFINTransitoryAcctList() fINFinancialAccountAcctFINTransitoryAcctList}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcctFINTransitoryAcctList(
			ReferenceType newFINFinancialAccountAcctFINTransitoryAcctList) {
		fINFinancialAccountAcctFINTransitoryAcctList = newFINFinancialAccountAcctFINTransitoryAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultWarehouseInventoryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultWarehouseInventoryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultWarehouseInventoryList() {
		return financialMgmtAcctSchemaDefaultWarehouseInventoryList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWarehouseInventoryList() <em>financialMgmtAcctSchemaDefaultWarehouseInventoryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWarehouseInventoryList() financialMgmtAcctSchemaDefaultWarehouseInventoryList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultWarehouseInventoryList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultWarehouseInventoryList) {
		financialMgmtAcctSchemaDefaultWarehouseInventoryList = newFinancialMgmtAcctSchemaDefaultWarehouseInventoryList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultInventoryAdjustmentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultInventoryAdjustmentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultInventoryAdjustmentList() {
		return financialMgmtAcctSchemaDefaultInventoryAdjustmentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultInventoryAdjustmentList() <em>financialMgmtAcctSchemaDefaultInventoryAdjustmentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultInventoryAdjustmentList() financialMgmtAcctSchemaDefaultInventoryAdjustmentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultInventoryAdjustmentList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultInventoryAdjustmentList) {
		financialMgmtAcctSchemaDefaultInventoryAdjustmentList = newFinancialMgmtAcctSchemaDefaultInventoryAdjustmentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultWarehouseDifferencesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultWarehouseDifferencesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultWarehouseDifferencesList() {
		return financialMgmtAcctSchemaDefaultWarehouseDifferencesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWarehouseDifferencesList() <em>financialMgmtAcctSchemaDefaultWarehouseDifferencesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWarehouseDifferencesList() financialMgmtAcctSchemaDefaultWarehouseDifferencesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultWarehouseDifferencesList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultWarehouseDifferencesList) {
		financialMgmtAcctSchemaDefaultWarehouseDifferencesList = newFinancialMgmtAcctSchemaDefaultWarehouseDifferencesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultInventoryRevaluationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultInventoryRevaluationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultInventoryRevaluationList() {
		return financialMgmtAcctSchemaDefaultInventoryRevaluationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultInventoryRevaluationList() <em>financialMgmtAcctSchemaDefaultInventoryRevaluationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultInventoryRevaluationList() financialMgmtAcctSchemaDefaultInventoryRevaluationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultInventoryRevaluationList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultInventoryRevaluationList) {
		financialMgmtAcctSchemaDefaultInventoryRevaluationList = newFinancialMgmtAcctSchemaDefaultInventoryRevaluationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultProductRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultProductRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultProductRevenueList() {
		return financialMgmtAcctSchemaDefaultProductRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProductRevenueList() <em>financialMgmtAcctSchemaDefaultProductRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProductRevenueList() financialMgmtAcctSchemaDefaultProductRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultProductRevenueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultProductRevenueList) {
		financialMgmtAcctSchemaDefaultProductRevenueList = newFinancialMgmtAcctSchemaDefaultProductRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultProductExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultProductExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultProductExpenseList() {
		return financialMgmtAcctSchemaDefaultProductExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProductExpenseList() <em>financialMgmtAcctSchemaDefaultProductExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProductExpenseList() financialMgmtAcctSchemaDefaultProductExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultProductExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultProductExpenseList) {
		financialMgmtAcctSchemaDefaultProductExpenseList = newFinancialMgmtAcctSchemaDefaultProductExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultFixedAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultFixedAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultFixedAssetList() {
		return financialMgmtAcctSchemaDefaultFixedAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultFixedAssetList() <em>financialMgmtAcctSchemaDefaultFixedAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultFixedAssetList() financialMgmtAcctSchemaDefaultFixedAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultFixedAssetList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultFixedAssetList) {
		financialMgmtAcctSchemaDefaultFixedAssetList = newFinancialMgmtAcctSchemaDefaultFixedAssetList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultPurchasePriceVarianceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultPurchasePriceVarianceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultPurchasePriceVarianceList() {
		return financialMgmtAcctSchemaDefaultPurchasePriceVarianceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPurchasePriceVarianceList() <em>financialMgmtAcctSchemaDefaultPurchasePriceVarianceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPurchasePriceVarianceList() financialMgmtAcctSchemaDefaultPurchasePriceVarianceList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultPurchasePriceVarianceList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultPurchasePriceVarianceList) {
		financialMgmtAcctSchemaDefaultPurchasePriceVarianceList = newFinancialMgmtAcctSchemaDefaultPurchasePriceVarianceList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultInvoicePriceVarianceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultInvoicePriceVarianceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultInvoicePriceVarianceList() {
		return financialMgmtAcctSchemaDefaultInvoicePriceVarianceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultInvoicePriceVarianceList() <em>financialMgmtAcctSchemaDefaultInvoicePriceVarianceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultInvoicePriceVarianceList() financialMgmtAcctSchemaDefaultInvoicePriceVarianceList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultInvoicePriceVarianceList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultInvoicePriceVarianceList) {
		financialMgmtAcctSchemaDefaultInvoicePriceVarianceList = newFinancialMgmtAcctSchemaDefaultInvoicePriceVarianceList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTradeDiscountReceivedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTradeDiscountReceivedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTradeDiscountReceivedList() {
		return financialMgmtAcctSchemaDefaultTradeDiscountReceivedList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTradeDiscountReceivedList() <em>financialMgmtAcctSchemaDefaultTradeDiscountReceivedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTradeDiscountReceivedList() financialMgmtAcctSchemaDefaultTradeDiscountReceivedList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTradeDiscountReceivedList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTradeDiscountReceivedList) {
		financialMgmtAcctSchemaDefaultTradeDiscountReceivedList = newFinancialMgmtAcctSchemaDefaultTradeDiscountReceivedList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTradeDiscountGrantedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTradeDiscountGrantedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTradeDiscountGrantedList() {
		return financialMgmtAcctSchemaDefaultTradeDiscountGrantedList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTradeDiscountGrantedList() <em>financialMgmtAcctSchemaDefaultTradeDiscountGrantedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTradeDiscountGrantedList() financialMgmtAcctSchemaDefaultTradeDiscountGrantedList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTradeDiscountGrantedList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTradeDiscountGrantedList) {
		financialMgmtAcctSchemaDefaultTradeDiscountGrantedList = newFinancialMgmtAcctSchemaDefaultTradeDiscountGrantedList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultProductCOGSList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultProductCOGSList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultProductCOGSList() {
		return financialMgmtAcctSchemaDefaultProductCOGSList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProductCOGSList() <em>financialMgmtAcctSchemaDefaultProductCOGSList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProductCOGSList() financialMgmtAcctSchemaDefaultProductCOGSList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultProductCOGSList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultProductCOGSList) {
		financialMgmtAcctSchemaDefaultProductCOGSList = newFinancialMgmtAcctSchemaDefaultProductCOGSList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCustomerReceivablesNoList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCustomerReceivablesNoList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCustomerReceivablesNoList() {
		return financialMgmtAcctSchemaDefaultCustomerReceivablesNoList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCustomerReceivablesNoList() <em>financialMgmtAcctSchemaDefaultCustomerReceivablesNoList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCustomerReceivablesNoList() financialMgmtAcctSchemaDefaultCustomerReceivablesNoList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCustomerReceivablesNoList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCustomerReceivablesNoList) {
		financialMgmtAcctSchemaDefaultCustomerReceivablesNoList = newFinancialMgmtAcctSchemaDefaultCustomerReceivablesNoList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCustomerPrepaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCustomerPrepaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCustomerPrepaymentList() {
		return financialMgmtAcctSchemaDefaultCustomerPrepaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCustomerPrepaymentList() <em>financialMgmtAcctSchemaDefaultCustomerPrepaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCustomerPrepaymentList() financialMgmtAcctSchemaDefaultCustomerPrepaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCustomerPrepaymentList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCustomerPrepaymentList) {
		financialMgmtAcctSchemaDefaultCustomerPrepaymentList = newFinancialMgmtAcctSchemaDefaultCustomerPrepaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultVendorLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultVendorLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultVendorLiabilityList() {
		return financialMgmtAcctSchemaDefaultVendorLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultVendorLiabilityList() <em>financialMgmtAcctSchemaDefaultVendorLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultVendorLiabilityList() financialMgmtAcctSchemaDefaultVendorLiabilityList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultVendorLiabilityList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultVendorLiabilityList) {
		financialMgmtAcctSchemaDefaultVendorLiabilityList = newFinancialMgmtAcctSchemaDefaultVendorLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultVendorServiceLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultVendorServiceLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultVendorServiceLiabilityList() {
		return financialMgmtAcctSchemaDefaultVendorServiceLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultVendorServiceLiabilityList() <em>financialMgmtAcctSchemaDefaultVendorServiceLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultVendorServiceLiabilityList() financialMgmtAcctSchemaDefaultVendorServiceLiabilityList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultVendorServiceLiabilityList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultVendorServiceLiabilityList) {
		financialMgmtAcctSchemaDefaultVendorServiceLiabilityList = newFinancialMgmtAcctSchemaDefaultVendorServiceLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultVendorPrepaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultVendorPrepaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultVendorPrepaymentList() {
		return financialMgmtAcctSchemaDefaultVendorPrepaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultVendorPrepaymentList() <em>financialMgmtAcctSchemaDefaultVendorPrepaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultVendorPrepaymentList() financialMgmtAcctSchemaDefaultVendorPrepaymentList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultVendorPrepaymentList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultVendorPrepaymentList) {
		financialMgmtAcctSchemaDefaultVendorPrepaymentList = newFinancialMgmtAcctSchemaDefaultVendorPrepaymentList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultPaymentDiscountExpenseList() {
		return financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPaymentDiscountExpenseList() <em>financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPaymentDiscountExpenseList() financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultPaymentDiscountExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultPaymentDiscountExpenseList) {
		financialMgmtAcctSchemaDefaultPaymentDiscountExpenseList = newFinancialMgmtAcctSchemaDefaultPaymentDiscountExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultWriteoffList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultWriteoffList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultWriteoffList() {
		return financialMgmtAcctSchemaDefaultWriteoffList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWriteoffList() <em>financialMgmtAcctSchemaDefaultWriteoffList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWriteoffList() financialMgmtAcctSchemaDefaultWriteoffList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultWriteoffList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultWriteoffList) {
		financialMgmtAcctSchemaDefaultWriteoffList = newFinancialMgmtAcctSchemaDefaultWriteoffList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultWriteoffRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultWriteoffRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultWriteoffRevenueList() {
		return financialMgmtAcctSchemaDefaultWriteoffRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWriteoffRevenueList() <em>financialMgmtAcctSchemaDefaultWriteoffRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWriteoffRevenueList() financialMgmtAcctSchemaDefaultWriteoffRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultWriteoffRevenueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultWriteoffRevenueList) {
		financialMgmtAcctSchemaDefaultWriteoffRevenueList = newFinancialMgmtAcctSchemaDefaultWriteoffRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultPaymentDiscountRevenueList() {
		return financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPaymentDiscountRevenueList() <em>financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPaymentDiscountRevenueList() financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultPaymentDiscountRevenueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultPaymentDiscountRevenueList) {
		financialMgmtAcctSchemaDefaultPaymentDiscountRevenueList = newFinancialMgmtAcctSchemaDefaultPaymentDiscountRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultUnrealizedGainsAcctList() {
		return financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnrealizedGainsAcctList() <em>financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnrealizedGainsAcctList() financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultUnrealizedGainsAcctList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultUnrealizedGainsAcctList) {
		financialMgmtAcctSchemaDefaultUnrealizedGainsAcctList = newFinancialMgmtAcctSchemaDefaultUnrealizedGainsAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultUnrealizedLossesAcctList() {
		return financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnrealizedLossesAcctList() <em>financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnrealizedLossesAcctList() financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultUnrealizedLossesAcctList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultUnrealizedLossesAcctList) {
		financialMgmtAcctSchemaDefaultUnrealizedLossesAcctList = newFinancialMgmtAcctSchemaDefaultUnrealizedLossesAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultRealizedGainAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultRealizedGainAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultRealizedGainAcctList() {
		return financialMgmtAcctSchemaDefaultRealizedGainAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultRealizedGainAcctList() <em>financialMgmtAcctSchemaDefaultRealizedGainAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultRealizedGainAcctList() financialMgmtAcctSchemaDefaultRealizedGainAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultRealizedGainAcctList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultRealizedGainAcctList) {
		financialMgmtAcctSchemaDefaultRealizedGainAcctList = newFinancialMgmtAcctSchemaDefaultRealizedGainAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultRealizedLossAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultRealizedLossAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultRealizedLossAcctList() {
		return financialMgmtAcctSchemaDefaultRealizedLossAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultRealizedLossAcctList() <em>financialMgmtAcctSchemaDefaultRealizedLossAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultRealizedLossAcctList() financialMgmtAcctSchemaDefaultRealizedLossAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultRealizedLossAcctList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultRealizedLossAcctList) {
		financialMgmtAcctSchemaDefaultRealizedLossAcctList = newFinancialMgmtAcctSchemaDefaultRealizedLossAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultWithholdingAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultWithholdingAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultWithholdingAccountList() {
		return financialMgmtAcctSchemaDefaultWithholdingAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWithholdingAccountList() <em>financialMgmtAcctSchemaDefaultWithholdingAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWithholdingAccountList() financialMgmtAcctSchemaDefaultWithholdingAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultWithholdingAccountList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultWithholdingAccountList) {
		financialMgmtAcctSchemaDefaultWithholdingAccountList = newFinancialMgmtAcctSchemaDefaultWithholdingAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultEmployeePrepaymentsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultEmployeePrepaymentsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultEmployeePrepaymentsList() {
		return financialMgmtAcctSchemaDefaultEmployeePrepaymentsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultEmployeePrepaymentsList() <em>financialMgmtAcctSchemaDefaultEmployeePrepaymentsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultEmployeePrepaymentsList() financialMgmtAcctSchemaDefaultEmployeePrepaymentsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultEmployeePrepaymentsList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultEmployeePrepaymentsList) {
		financialMgmtAcctSchemaDefaultEmployeePrepaymentsList = newFinancialMgmtAcctSchemaDefaultEmployeePrepaymentsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultEmployeeExpensesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultEmployeeExpensesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultEmployeeExpensesList() {
		return financialMgmtAcctSchemaDefaultEmployeeExpensesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultEmployeeExpensesList() <em>financialMgmtAcctSchemaDefaultEmployeeExpensesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultEmployeeExpensesList() financialMgmtAcctSchemaDefaultEmployeeExpensesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultEmployeeExpensesList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultEmployeeExpensesList) {
		financialMgmtAcctSchemaDefaultEmployeeExpensesList = newFinancialMgmtAcctSchemaDefaultEmployeeExpensesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultProjectAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultProjectAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultProjectAssetList() {
		return financialMgmtAcctSchemaDefaultProjectAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProjectAssetList() <em>financialMgmtAcctSchemaDefaultProjectAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultProjectAssetList() financialMgmtAcctSchemaDefaultProjectAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultProjectAssetList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultProjectAssetList) {
		financialMgmtAcctSchemaDefaultProjectAssetList = newFinancialMgmtAcctSchemaDefaultProjectAssetList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultWorkInProgressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultWorkInProgressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultWorkInProgressList() {
		return financialMgmtAcctSchemaDefaultWorkInProgressList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWorkInProgressList() <em>financialMgmtAcctSchemaDefaultWorkInProgressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultWorkInProgressList() financialMgmtAcctSchemaDefaultWorkInProgressList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultWorkInProgressList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultWorkInProgressList) {
		financialMgmtAcctSchemaDefaultWorkInProgressList = newFinancialMgmtAcctSchemaDefaultWorkInProgressList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTaxExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTaxExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTaxExpenseList() {
		return financialMgmtAcctSchemaDefaultTaxExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxExpenseList() <em>financialMgmtAcctSchemaDefaultTaxExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxExpenseList() financialMgmtAcctSchemaDefaultTaxExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTaxExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTaxExpenseList) {
		financialMgmtAcctSchemaDefaultTaxExpenseList = newFinancialMgmtAcctSchemaDefaultTaxExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTaxLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTaxLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTaxLiabilityList() {
		return financialMgmtAcctSchemaDefaultTaxLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxLiabilityList() <em>financialMgmtAcctSchemaDefaultTaxLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxLiabilityList() financialMgmtAcctSchemaDefaultTaxLiabilityList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTaxLiabilityList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTaxLiabilityList) {
		financialMgmtAcctSchemaDefaultTaxLiabilityList = newFinancialMgmtAcctSchemaDefaultTaxLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTaxReceivablesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTaxReceivablesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTaxReceivablesList() {
		return financialMgmtAcctSchemaDefaultTaxReceivablesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxReceivablesList() <em>financialMgmtAcctSchemaDefaultTaxReceivablesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxReceivablesList() financialMgmtAcctSchemaDefaultTaxReceivablesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTaxReceivablesList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTaxReceivablesList) {
		financialMgmtAcctSchemaDefaultTaxReceivablesList = newFinancialMgmtAcctSchemaDefaultTaxReceivablesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTaxDueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTaxDueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTaxDueList() {
		return financialMgmtAcctSchemaDefaultTaxDueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxDueList() <em>financialMgmtAcctSchemaDefaultTaxDueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxDueList() financialMgmtAcctSchemaDefaultTaxDueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTaxDueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTaxDueList) {
		financialMgmtAcctSchemaDefaultTaxDueList = newFinancialMgmtAcctSchemaDefaultTaxDueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultTaxCreditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultTaxCreditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultTaxCreditList() {
		return financialMgmtAcctSchemaDefaultTaxCreditList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxCreditList() <em>financialMgmtAcctSchemaDefaultTaxCreditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultTaxCreditList() financialMgmtAcctSchemaDefaultTaxCreditList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultTaxCreditList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultTaxCreditList) {
		financialMgmtAcctSchemaDefaultTaxCreditList = newFinancialMgmtAcctSchemaDefaultTaxCreditList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankInTransitList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankInTransitList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankInTransitList() {
		return financialMgmtAcctSchemaDefaultBankInTransitList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankInTransitList() <em>financialMgmtAcctSchemaDefaultBankInTransitList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankInTransitList() financialMgmtAcctSchemaDefaultBankInTransitList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankInTransitList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankInTransitList) {
		financialMgmtAcctSchemaDefaultBankInTransitList = newFinancialMgmtAcctSchemaDefaultBankInTransitList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankAssetList() {
		return financialMgmtAcctSchemaDefaultBankAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankAssetList() <em>financialMgmtAcctSchemaDefaultBankAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankAssetList() financialMgmtAcctSchemaDefaultBankAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankAssetList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankAssetList) {
		financialMgmtAcctSchemaDefaultBankAssetList = newFinancialMgmtAcctSchemaDefaultBankAssetList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankExpenseList() {
		return financialMgmtAcctSchemaDefaultBankExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankExpenseList() <em>financialMgmtAcctSchemaDefaultBankExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankExpenseList() financialMgmtAcctSchemaDefaultBankExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankExpenseList) {
		financialMgmtAcctSchemaDefaultBankExpenseList = newFinancialMgmtAcctSchemaDefaultBankExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankInterestRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankInterestRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankInterestRevenueList() {
		return financialMgmtAcctSchemaDefaultBankInterestRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankInterestRevenueList() <em>financialMgmtAcctSchemaDefaultBankInterestRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankInterestRevenueList() financialMgmtAcctSchemaDefaultBankInterestRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankInterestRevenueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankInterestRevenueList) {
		financialMgmtAcctSchemaDefaultBankInterestRevenueList = newFinancialMgmtAcctSchemaDefaultBankInterestRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankInterestExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankInterestExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankInterestExpenseList() {
		return financialMgmtAcctSchemaDefaultBankInterestExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankInterestExpenseList() <em>financialMgmtAcctSchemaDefaultBankInterestExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankInterestExpenseList() financialMgmtAcctSchemaDefaultBankInterestExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankInterestExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankInterestExpenseList) {
		financialMgmtAcctSchemaDefaultBankInterestExpenseList = newFinancialMgmtAcctSchemaDefaultBankInterestExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList() {
		return financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList() <em>financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList() financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList) {
		financialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList = newFinancialMgmtAcctSchemaDefaultBankUnidentifiedReceiptsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultUnallocatedCashList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultUnallocatedCashList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultUnallocatedCashList() {
		return financialMgmtAcctSchemaDefaultUnallocatedCashList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnallocatedCashList() <em>financialMgmtAcctSchemaDefaultUnallocatedCashList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnallocatedCashList() financialMgmtAcctSchemaDefaultUnallocatedCashList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultUnallocatedCashList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultUnallocatedCashList) {
		financialMgmtAcctSchemaDefaultUnallocatedCashList = newFinancialMgmtAcctSchemaDefaultUnallocatedCashList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultPaymentSelectionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultPaymentSelectionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultPaymentSelectionList() {
		return financialMgmtAcctSchemaDefaultPaymentSelectionList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPaymentSelectionList() <em>financialMgmtAcctSchemaDefaultPaymentSelectionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultPaymentSelectionList() financialMgmtAcctSchemaDefaultPaymentSelectionList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultPaymentSelectionList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultPaymentSelectionList) {
		financialMgmtAcctSchemaDefaultPaymentSelectionList = newFinancialMgmtAcctSchemaDefaultPaymentSelectionList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankSettlementGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankSettlementGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankSettlementGainList() {
		return financialMgmtAcctSchemaDefaultBankSettlementGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankSettlementGainList() <em>financialMgmtAcctSchemaDefaultBankSettlementGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankSettlementGainList() financialMgmtAcctSchemaDefaultBankSettlementGainList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankSettlementGainList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankSettlementGainList) {
		financialMgmtAcctSchemaDefaultBankSettlementGainList = newFinancialMgmtAcctSchemaDefaultBankSettlementGainList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankSettlementLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankSettlementLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankSettlementLossList() {
		return financialMgmtAcctSchemaDefaultBankSettlementLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankSettlementLossList() <em>financialMgmtAcctSchemaDefaultBankSettlementLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankSettlementLossList() financialMgmtAcctSchemaDefaultBankSettlementLossList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankSettlementLossList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankSettlementLossList) {
		financialMgmtAcctSchemaDefaultBankSettlementLossList = newFinancialMgmtAcctSchemaDefaultBankSettlementLossList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankRevaluationGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankRevaluationGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankRevaluationGainList() {
		return financialMgmtAcctSchemaDefaultBankRevaluationGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankRevaluationGainList() <em>financialMgmtAcctSchemaDefaultBankRevaluationGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankRevaluationGainList() financialMgmtAcctSchemaDefaultBankRevaluationGainList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankRevaluationGainList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankRevaluationGainList) {
		financialMgmtAcctSchemaDefaultBankRevaluationGainList = newFinancialMgmtAcctSchemaDefaultBankRevaluationGainList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultBankRevaluationLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultBankRevaluationLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultBankRevaluationLossList() {
		return financialMgmtAcctSchemaDefaultBankRevaluationLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankRevaluationLossList() <em>financialMgmtAcctSchemaDefaultBankRevaluationLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultBankRevaluationLossList() financialMgmtAcctSchemaDefaultBankRevaluationLossList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultBankRevaluationLossList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultBankRevaluationLossList) {
		financialMgmtAcctSchemaDefaultBankRevaluationLossList = newFinancialMgmtAcctSchemaDefaultBankRevaluationLossList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultChargeExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultChargeExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultChargeExpenseList() {
		return financialMgmtAcctSchemaDefaultChargeExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultChargeExpenseList() <em>financialMgmtAcctSchemaDefaultChargeExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultChargeExpenseList() financialMgmtAcctSchemaDefaultChargeExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultChargeExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultChargeExpenseList) {
		financialMgmtAcctSchemaDefaultChargeExpenseList = newFinancialMgmtAcctSchemaDefaultChargeExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultChargeRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultChargeRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultChargeRevenueList() {
		return financialMgmtAcctSchemaDefaultChargeRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultChargeRevenueList() <em>financialMgmtAcctSchemaDefaultChargeRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultChargeRevenueList() financialMgmtAcctSchemaDefaultChargeRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultChargeRevenueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultChargeRevenueList) {
		financialMgmtAcctSchemaDefaultChargeRevenueList = newFinancialMgmtAcctSchemaDefaultChargeRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultUnearnedRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultUnearnedRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultUnearnedRevenueList() {
		return financialMgmtAcctSchemaDefaultUnearnedRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnearnedRevenueList() <em>financialMgmtAcctSchemaDefaultUnearnedRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultUnearnedRevenueList() financialMgmtAcctSchemaDefaultUnearnedRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultUnearnedRevenueList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultUnearnedRevenueList) {
		financialMgmtAcctSchemaDefaultUnearnedRevenueList = newFinancialMgmtAcctSchemaDefaultUnearnedRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultNonInvoicedReceivablesList() {
		return financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultNonInvoicedReceivablesList() <em>financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultNonInvoicedReceivablesList() financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultNonInvoicedReceivablesList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultNonInvoicedReceivablesList) {
		financialMgmtAcctSchemaDefaultNonInvoicedReceivablesList = newFinancialMgmtAcctSchemaDefaultNonInvoicedReceivablesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultNonInvoicedRevenuesList() {
		return financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultNonInvoicedRevenuesList() <em>financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultNonInvoicedRevenuesList() financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultNonInvoicedRevenuesList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultNonInvoicedRevenuesList) {
		financialMgmtAcctSchemaDefaultNonInvoicedRevenuesList = newFinancialMgmtAcctSchemaDefaultNonInvoicedRevenuesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultNonInvoicedReceiptsList() {
		return financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultNonInvoicedReceiptsList() <em>financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultNonInvoicedReceiptsList() financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultNonInvoicedReceiptsList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultNonInvoicedReceiptsList) {
		financialMgmtAcctSchemaDefaultNonInvoicedReceiptsList = newFinancialMgmtAcctSchemaDefaultNonInvoicedReceiptsList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCashBookAssetList() {
		return financialMgmtAcctSchemaDefaultCashBookAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookAssetList() <em>financialMgmtAcctSchemaDefaultCashBookAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookAssetList() financialMgmtAcctSchemaDefaultCashBookAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCashBookAssetList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCashBookAssetList) {
		financialMgmtAcctSchemaDefaultCashBookAssetList = newFinancialMgmtAcctSchemaDefaultCashBookAssetList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCashTransferList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCashTransferList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCashTransferList() {
		return financialMgmtAcctSchemaDefaultCashTransferList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashTransferList() <em>financialMgmtAcctSchemaDefaultCashTransferList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashTransferList() financialMgmtAcctSchemaDefaultCashTransferList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCashTransferList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCashTransferList) {
		financialMgmtAcctSchemaDefaultCashTransferList = newFinancialMgmtAcctSchemaDefaultCashTransferList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookDifferencesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookDifferencesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCashBookDifferencesList() {
		return financialMgmtAcctSchemaDefaultCashBookDifferencesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookDifferencesList() <em>financialMgmtAcctSchemaDefaultCashBookDifferencesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookDifferencesList() financialMgmtAcctSchemaDefaultCashBookDifferencesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCashBookDifferencesList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCashBookDifferencesList) {
		financialMgmtAcctSchemaDefaultCashBookDifferencesList = newFinancialMgmtAcctSchemaDefaultCashBookDifferencesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCashBookExpenseList() {
		return financialMgmtAcctSchemaDefaultCashBookExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookExpenseList() <em>financialMgmtAcctSchemaDefaultCashBookExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookExpenseList() financialMgmtAcctSchemaDefaultCashBookExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCashBookExpenseList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCashBookExpenseList) {
		financialMgmtAcctSchemaDefaultCashBookExpenseList = newFinancialMgmtAcctSchemaDefaultCashBookExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookReceiptList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultCashBookReceiptList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultCashBookReceiptList() {
		return financialMgmtAcctSchemaDefaultCashBookReceiptList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookReceiptList() <em>financialMgmtAcctSchemaDefaultCashBookReceiptList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultCashBookReceiptList() financialMgmtAcctSchemaDefaultCashBookReceiptList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultCashBookReceiptList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultCashBookReceiptList) {
		financialMgmtAcctSchemaDefaultCashBookReceiptList = newFinancialMgmtAcctSchemaDefaultCashBookReceiptList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultAccumulatedDepreciationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultAccumulatedDepreciationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultAccumulatedDepreciationList() {
		return financialMgmtAcctSchemaDefaultAccumulatedDepreciationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultAccumulatedDepreciationList() <em>financialMgmtAcctSchemaDefaultAccumulatedDepreciationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultAccumulatedDepreciationList() financialMgmtAcctSchemaDefaultAccumulatedDepreciationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultAccumulatedDepreciationList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultAccumulatedDepreciationList) {
		financialMgmtAcctSchemaDefaultAccumulatedDepreciationList = newFinancialMgmtAcctSchemaDefaultAccumulatedDepreciationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultDepreciationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultDepreciationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultDepreciationList() {
		return financialMgmtAcctSchemaDefaultDepreciationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultDepreciationList() <em>financialMgmtAcctSchemaDefaultDepreciationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultDepreciationList() financialMgmtAcctSchemaDefaultDepreciationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultDepreciationList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultDepreciationList) {
		financialMgmtAcctSchemaDefaultDepreciationList = newFinancialMgmtAcctSchemaDefaultDepreciationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultDisposalGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultDisposalGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultDisposalGainList() {
		return financialMgmtAcctSchemaDefaultDisposalGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultDisposalGainList() <em>financialMgmtAcctSchemaDefaultDisposalGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultDisposalGainList() financialMgmtAcctSchemaDefaultDisposalGainList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultDisposalGainList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultDisposalGainList) {
		financialMgmtAcctSchemaDefaultDisposalGainList = newFinancialMgmtAcctSchemaDefaultDisposalGainList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefaultDisposalLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefaultDisposalLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaDefaultDisposalLossList() {
		return financialMgmtAcctSchemaDefaultDisposalLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultDisposalLossList() <em>financialMgmtAcctSchemaDefaultDisposalLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaDefaultDisposalLossList() financialMgmtAcctSchemaDefaultDisposalLossList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefaultDisposalLossList(
			ReferenceType newFinancialMgmtAcctSchemaDefaultDisposalLossList) {
		financialMgmtAcctSchemaDefaultDisposalLossList = newFinancialMgmtAcctSchemaDefaultDisposalLossList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLSuspenseBalancingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLSuspenseBalancingList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLSuspenseBalancingList() {
		return financialMgmtAcctSchemaGLSuspenseBalancingList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLSuspenseBalancingList() <em>financialMgmtAcctSchemaGLSuspenseBalancingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLSuspenseBalancingList() financialMgmtAcctSchemaGLSuspenseBalancingList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLSuspenseBalancingList(
			ReferenceType newFinancialMgmtAcctSchemaGLSuspenseBalancingList) {
		financialMgmtAcctSchemaGLSuspenseBalancingList = newFinancialMgmtAcctSchemaGLSuspenseBalancingList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLSuspenseErrorList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLSuspenseErrorList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLSuspenseErrorList() {
		return financialMgmtAcctSchemaGLSuspenseErrorList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLSuspenseErrorList() <em>financialMgmtAcctSchemaGLSuspenseErrorList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLSuspenseErrorList() financialMgmtAcctSchemaGLSuspenseErrorList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLSuspenseErrorList(
			ReferenceType newFinancialMgmtAcctSchemaGLSuspenseErrorList) {
		financialMgmtAcctSchemaGLSuspenseErrorList = newFinancialMgmtAcctSchemaGLSuspenseErrorList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLCurrencyBalancingAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLCurrencyBalancingAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLCurrencyBalancingAcctList() {
		return financialMgmtAcctSchemaGLCurrencyBalancingAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLCurrencyBalancingAcctList() <em>financialMgmtAcctSchemaGLCurrencyBalancingAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLCurrencyBalancingAcctList() financialMgmtAcctSchemaGLCurrencyBalancingAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLCurrencyBalancingAcctList(
			ReferenceType newFinancialMgmtAcctSchemaGLCurrencyBalancingAcctList) {
		financialMgmtAcctSchemaGLCurrencyBalancingAcctList = newFinancialMgmtAcctSchemaGLCurrencyBalancingAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLRetainedEarningList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLRetainedEarningList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLRetainedEarningList() {
		return financialMgmtAcctSchemaGLRetainedEarningList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLRetainedEarningList() <em>financialMgmtAcctSchemaGLRetainedEarningList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLRetainedEarningList() financialMgmtAcctSchemaGLRetainedEarningList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLRetainedEarningList(
			ReferenceType newFinancialMgmtAcctSchemaGLRetainedEarningList) {
		financialMgmtAcctSchemaGLRetainedEarningList = newFinancialMgmtAcctSchemaGLRetainedEarningList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLIncomeSummaryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLIncomeSummaryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLIncomeSummaryList() {
		return financialMgmtAcctSchemaGLIncomeSummaryList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLIncomeSummaryList() <em>financialMgmtAcctSchemaGLIncomeSummaryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLIncomeSummaryList() financialMgmtAcctSchemaGLIncomeSummaryList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLIncomeSummaryList(
			ReferenceType newFinancialMgmtAcctSchemaGLIncomeSummaryList) {
		financialMgmtAcctSchemaGLIncomeSummaryList = newFinancialMgmtAcctSchemaGLIncomeSummaryList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLDueToIntercompanyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLDueToIntercompanyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLDueToIntercompanyList() {
		return financialMgmtAcctSchemaGLDueToIntercompanyList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLDueToIntercompanyList() <em>financialMgmtAcctSchemaGLDueToIntercompanyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLDueToIntercompanyList() financialMgmtAcctSchemaGLDueToIntercompanyList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLDueToIntercompanyList(
			ReferenceType newFinancialMgmtAcctSchemaGLDueToIntercompanyList) {
		financialMgmtAcctSchemaGLDueToIntercompanyList = newFinancialMgmtAcctSchemaGLDueToIntercompanyList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLDueFromIntercompanyList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLDueFromIntercompanyList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLDueFromIntercompanyList() {
		return financialMgmtAcctSchemaGLDueFromIntercompanyList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLDueFromIntercompanyList() <em>financialMgmtAcctSchemaGLDueFromIntercompanyList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLDueFromIntercompanyList() financialMgmtAcctSchemaGLDueFromIntercompanyList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLDueFromIntercompanyList(
			ReferenceType newFinancialMgmtAcctSchemaGLDueFromIntercompanyList) {
		financialMgmtAcctSchemaGLDueFromIntercompanyList = newFinancialMgmtAcctSchemaGLDueFromIntercompanyList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLPPVOffsetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLPPVOffsetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLPPVOffsetList() {
		return financialMgmtAcctSchemaGLPPVOffsetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLPPVOffsetList() <em>financialMgmtAcctSchemaGLPPVOffsetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLPPVOffsetList() financialMgmtAcctSchemaGLPPVOffsetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLPPVOffsetList(
			ReferenceType newFinancialMgmtAcctSchemaGLPPVOffsetList) {
		financialMgmtAcctSchemaGLPPVOffsetList = newFinancialMgmtAcctSchemaGLPPVOffsetList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGLCFSOrderAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGLCFSOrderAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAcctSchemaGLCFSOrderAccountList() {
		return financialMgmtAcctSchemaGLCFSOrderAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLCFSOrderAccountList() <em>financialMgmtAcctSchemaGLCFSOrderAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAcctSchemaGLCFSOrderAccountList() financialMgmtAcctSchemaGLCFSOrderAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGLCFSOrderAccountList(
			ReferenceType newFinancialMgmtAcctSchemaGLCFSOrderAccountList) {
		financialMgmtAcctSchemaGLCFSOrderAccountList = newFinancialMgmtAcctSchemaGLCFSOrderAccountList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccountsDepreciationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccountsDepreciationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetAccountsDepreciationList() {
		return financialMgmtAssetAccountsDepreciationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsDepreciationList() <em>financialMgmtAssetAccountsDepreciationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsDepreciationList() financialMgmtAssetAccountsDepreciationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccountsDepreciationList(
			ReferenceType newFinancialMgmtAssetAccountsDepreciationList) {
		financialMgmtAssetAccountsDepreciationList = newFinancialMgmtAssetAccountsDepreciationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccountsAccumulatedDepreciationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccountsAccumulatedDepreciationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetAccountsAccumulatedDepreciationList() {
		return financialMgmtAssetAccountsAccumulatedDepreciationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsAccumulatedDepreciationList() <em>financialMgmtAssetAccountsAccumulatedDepreciationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsAccumulatedDepreciationList() financialMgmtAssetAccountsAccumulatedDepreciationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccountsAccumulatedDepreciationList(
			ReferenceType newFinancialMgmtAssetAccountsAccumulatedDepreciationList) {
		financialMgmtAssetAccountsAccumulatedDepreciationList = newFinancialMgmtAssetAccountsAccumulatedDepreciationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccountsDisposalLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccountsDisposalLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetAccountsDisposalLossList() {
		return financialMgmtAssetAccountsDisposalLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsDisposalLossList() <em>financialMgmtAssetAccountsDisposalLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsDisposalLossList() financialMgmtAssetAccountsDisposalLossList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccountsDisposalLossList(
			ReferenceType newFinancialMgmtAssetAccountsDisposalLossList) {
		financialMgmtAssetAccountsDisposalLossList = newFinancialMgmtAssetAccountsDisposalLossList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccountsDisposalGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccountsDisposalGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetAccountsDisposalGainList() {
		return financialMgmtAssetAccountsDisposalGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsDisposalGainList() <em>financialMgmtAssetAccountsDisposalGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetAccountsDisposalGainList() financialMgmtAssetAccountsDisposalGainList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccountsDisposalGainList(
			ReferenceType newFinancialMgmtAssetAccountsDisposalGainList) {
		financialMgmtAssetAccountsDisposalGainList = newFinancialMgmtAssetAccountsDisposalGainList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcctDepreciationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcctDepreciationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetGroupAcctDepreciationList() {
		return financialMgmtAssetGroupAcctDepreciationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctDepreciationList() <em>financialMgmtAssetGroupAcctDepreciationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctDepreciationList() financialMgmtAssetGroupAcctDepreciationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcctDepreciationList(
			ReferenceType newFinancialMgmtAssetGroupAcctDepreciationList) {
		financialMgmtAssetGroupAcctDepreciationList = newFinancialMgmtAssetGroupAcctDepreciationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcctAccumulatedDepreciationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcctAccumulatedDepreciationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetGroupAcctAccumulatedDepreciationList() {
		return financialMgmtAssetGroupAcctAccumulatedDepreciationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctAccumulatedDepreciationList() <em>financialMgmtAssetGroupAcctAccumulatedDepreciationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctAccumulatedDepreciationList() financialMgmtAssetGroupAcctAccumulatedDepreciationList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcctAccumulatedDepreciationList(
			ReferenceType newFinancialMgmtAssetGroupAcctAccumulatedDepreciationList) {
		financialMgmtAssetGroupAcctAccumulatedDepreciationList = newFinancialMgmtAssetGroupAcctAccumulatedDepreciationList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcctDisposalLossList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcctDisposalLossList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetGroupAcctDisposalLossList() {
		return financialMgmtAssetGroupAcctDisposalLossList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctDisposalLossList() <em>financialMgmtAssetGroupAcctDisposalLossList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctDisposalLossList() financialMgmtAssetGroupAcctDisposalLossList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcctDisposalLossList(
			ReferenceType newFinancialMgmtAssetGroupAcctDisposalLossList) {
		financialMgmtAssetGroupAcctDisposalLossList = newFinancialMgmtAssetGroupAcctDisposalLossList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcctDisposalGainList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcctDisposalGainList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtAssetGroupAcctDisposalGainList() {
		return financialMgmtAssetGroupAcctDisposalGainList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctDisposalGainList() <em>financialMgmtAssetGroupAcctDisposalGainList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtAssetGroupAcctDisposalGainList() financialMgmtAssetGroupAcctDisposalGainList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcctDisposalGainList(
			ReferenceType newFinancialMgmtAssetGroupAcctDisposalGainList) {
		financialMgmtAssetGroupAcctDisposalGainList = newFinancialMgmtAssetGroupAcctDisposalGainList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccountsCashBookAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccountsCashBookAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashBookAccountsCashBookAssetList() {
		return financialMgmtCashBookAccountsCashBookAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookAssetList() <em>financialMgmtCashBookAccountsCashBookAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookAssetList() financialMgmtCashBookAccountsCashBookAssetList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccountsCashBookAssetList(
			ReferenceType newFinancialMgmtCashBookAccountsCashBookAssetList) {
		financialMgmtCashBookAccountsCashBookAssetList = newFinancialMgmtCashBookAccountsCashBookAssetList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccountsCashTransferList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccountsCashTransferList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashBookAccountsCashTransferList() {
		return financialMgmtCashBookAccountsCashTransferList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashTransferList() <em>financialMgmtCashBookAccountsCashTransferList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashTransferList() financialMgmtCashBookAccountsCashTransferList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccountsCashTransferList(
			ReferenceType newFinancialMgmtCashBookAccountsCashTransferList) {
		financialMgmtCashBookAccountsCashTransferList = newFinancialMgmtCashBookAccountsCashTransferList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccountsCashBookDifferencesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccountsCashBookDifferencesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashBookAccountsCashBookDifferencesList() {
		return financialMgmtCashBookAccountsCashBookDifferencesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookDifferencesList() <em>financialMgmtCashBookAccountsCashBookDifferencesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookDifferencesList() financialMgmtCashBookAccountsCashBookDifferencesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccountsCashBookDifferencesList(
			ReferenceType newFinancialMgmtCashBookAccountsCashBookDifferencesList) {
		financialMgmtCashBookAccountsCashBookDifferencesList = newFinancialMgmtCashBookAccountsCashBookDifferencesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccountsCashBookExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccountsCashBookExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashBookAccountsCashBookExpenseList() {
		return financialMgmtCashBookAccountsCashBookExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookExpenseList() <em>financialMgmtCashBookAccountsCashBookExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookExpenseList() financialMgmtCashBookAccountsCashBookExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccountsCashBookExpenseList(
			ReferenceType newFinancialMgmtCashBookAccountsCashBookExpenseList) {
		financialMgmtCashBookAccountsCashBookExpenseList = newFinancialMgmtCashBookAccountsCashBookExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccountsCashBookReceiptList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccountsCashBookReceiptList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtCashBookAccountsCashBookReceiptList() {
		return financialMgmtCashBookAccountsCashBookReceiptList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookReceiptList() <em>financialMgmtCashBookAccountsCashBookReceiptList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtCashBookAccountsCashBookReceiptList() financialMgmtCashBookAccountsCashBookReceiptList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccountsCashBookReceiptList(
			ReferenceType newFinancialMgmtCashBookAccountsCashBookReceiptList) {
		financialMgmtCashBookAccountsCashBookReceiptList = newFinancialMgmtCashBookAccountsCashBookReceiptList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLChargeAccountsChargeExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLChargeAccountsChargeExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLChargeAccountsChargeExpenseList() {
		return financialMgmtGLChargeAccountsChargeExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLChargeAccountsChargeExpenseList() <em>financialMgmtGLChargeAccountsChargeExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLChargeAccountsChargeExpenseList() financialMgmtGLChargeAccountsChargeExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLChargeAccountsChargeExpenseList(
			ReferenceType newFinancialMgmtGLChargeAccountsChargeExpenseList) {
		financialMgmtGLChargeAccountsChargeExpenseList = newFinancialMgmtGLChargeAccountsChargeExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLChargeAccountsChargeRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLChargeAccountsChargeRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLChargeAccountsChargeRevenueList() {
		return financialMgmtGLChargeAccountsChargeRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLChargeAccountsChargeRevenueList() <em>financialMgmtGLChargeAccountsChargeRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLChargeAccountsChargeRevenueList() financialMgmtGLChargeAccountsChargeRevenueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLChargeAccountsChargeRevenueList(
			ReferenceType newFinancialMgmtGLChargeAccountsChargeRevenueList) {
		financialMgmtGLChargeAccountsChargeRevenueList = newFinancialMgmtGLChargeAccountsChargeRevenueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemAccountsGlitemDebitAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemAccountsGlitemDebitAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLItemAccountsGlitemDebitAcctList() {
		return financialMgmtGLItemAccountsGlitemDebitAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLItemAccountsGlitemDebitAcctList() <em>financialMgmtGLItemAccountsGlitemDebitAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLItemAccountsGlitemDebitAcctList() financialMgmtGLItemAccountsGlitemDebitAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemAccountsGlitemDebitAcctList(
			ReferenceType newFinancialMgmtGLItemAccountsGlitemDebitAcctList) {
		financialMgmtGLItemAccountsGlitemDebitAcctList = newFinancialMgmtGLItemAccountsGlitemDebitAcctList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemAccountsGlitemCreditAcctList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemAccountsGlitemCreditAcctList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtGLItemAccountsGlitemCreditAcctList() {
		return financialMgmtGLItemAccountsGlitemCreditAcctList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLItemAccountsGlitemCreditAcctList() <em>financialMgmtGLItemAccountsGlitemCreditAcctList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLItemAccountsGlitemCreditAcctList() financialMgmtGLItemAccountsGlitemCreditAcctList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemAccountsGlitemCreditAcctList(
			ReferenceType newFinancialMgmtGLItemAccountsGlitemCreditAcctList) {
		financialMgmtGLItemAccountsGlitemCreditAcctList = newFinancialMgmtGLItemAccountsGlitemCreditAcctList;
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLJournalLineList() <em>financialMgmtGLJournalLineList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtGLJournalLineList() financialMgmtGLJournalLineList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLineList(
			ReferenceType newFinancialMgmtGLJournalLineList) {
		financialMgmtGLJournalLineList = newFinancialMgmtGLJournalLineList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsTaxDueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsTaxDueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateAccountsTaxDueList() {
		return financialMgmtTaxRateAccountsTaxDueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxDueList() <em>financialMgmtTaxRateAccountsTaxDueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxDueList() financialMgmtTaxRateAccountsTaxDueList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsTaxDueList(
			ReferenceType newFinancialMgmtTaxRateAccountsTaxDueList) {
		financialMgmtTaxRateAccountsTaxDueList = newFinancialMgmtTaxRateAccountsTaxDueList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsTaxLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsTaxLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateAccountsTaxLiabilityList() {
		return financialMgmtTaxRateAccountsTaxLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxLiabilityList() <em>financialMgmtTaxRateAccountsTaxLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxLiabilityList() financialMgmtTaxRateAccountsTaxLiabilityList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsTaxLiabilityList(
			ReferenceType newFinancialMgmtTaxRateAccountsTaxLiabilityList) {
		financialMgmtTaxRateAccountsTaxLiabilityList = newFinancialMgmtTaxRateAccountsTaxLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsTaxCreditList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsTaxCreditList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateAccountsTaxCreditList() {
		return financialMgmtTaxRateAccountsTaxCreditList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxCreditList() <em>financialMgmtTaxRateAccountsTaxCreditList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxCreditList() financialMgmtTaxRateAccountsTaxCreditList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsTaxCreditList(
			ReferenceType newFinancialMgmtTaxRateAccountsTaxCreditList) {
		financialMgmtTaxRateAccountsTaxCreditList = newFinancialMgmtTaxRateAccountsTaxCreditList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsTaxReceivablesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsTaxReceivablesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateAccountsTaxReceivablesList() {
		return financialMgmtTaxRateAccountsTaxReceivablesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxReceivablesList() <em>financialMgmtTaxRateAccountsTaxReceivablesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxReceivablesList() financialMgmtTaxRateAccountsTaxReceivablesList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsTaxReceivablesList(
			ReferenceType newFinancialMgmtTaxRateAccountsTaxReceivablesList) {
		financialMgmtTaxRateAccountsTaxReceivablesList = newFinancialMgmtTaxRateAccountsTaxReceivablesList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccountsTaxExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccountsTaxExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtTaxRateAccountsTaxExpenseList() {
		return financialMgmtTaxRateAccountsTaxExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxExpenseList() <em>financialMgmtTaxRateAccountsTaxExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtTaxRateAccountsTaxExpenseList() financialMgmtTaxRateAccountsTaxExpenseList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccountsTaxExpenseList(
			ReferenceType newFinancialMgmtTaxRateAccountsTaxExpenseList) {
		financialMgmtTaxRateAccountsTaxExpenseList = newFinancialMgmtTaxRateAccountsTaxExpenseList;
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingAccountsWithholdingAccountList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingAccountsWithholdingAccountList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getFinancialMgmtWithholdingAccountsWithholdingAccountList() {
		return financialMgmtWithholdingAccountsWithholdingAccountList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtWithholdingAccountsWithholdingAccountList() <em>financialMgmtWithholdingAccountsWithholdingAccountList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getFinancialMgmtWithholdingAccountsWithholdingAccountList() financialMgmtWithholdingAccountsWithholdingAccountList}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingAccountsWithholdingAccountList(
			ReferenceType newFinancialMgmtWithholdingAccountsWithholdingAccountList) {
		financialMgmtWithholdingAccountsWithholdingAccountList = newFinancialMgmtWithholdingAccountsWithholdingAccountList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsProductRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsProductRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsProductRevenueList() {
		return productAccountsProductRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsProductRevenueList() <em>productAccountsProductRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsProductRevenueList() productAccountsProductRevenueList}' feature.
	 * @generated
	 */
	public void setProductAccountsProductRevenueList(
			ReferenceType newProductAccountsProductRevenueList) {
		productAccountsProductRevenueList = newProductAccountsProductRevenueList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsProductExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsProductExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsProductExpenseList() {
		return productAccountsProductExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsProductExpenseList() <em>productAccountsProductExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsProductExpenseList() productAccountsProductExpenseList}' feature.
	 * @generated
	 */
	public void setProductAccountsProductExpenseList(
			ReferenceType newProductAccountsProductExpenseList) {
		productAccountsProductExpenseList = newProductAccountsProductExpenseList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsFixedAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsFixedAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsFixedAssetList() {
		return productAccountsFixedAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsFixedAssetList() <em>productAccountsFixedAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsFixedAssetList() productAccountsFixedAssetList}' feature.
	 * @generated
	 */
	public void setProductAccountsFixedAssetList(
			ReferenceType newProductAccountsFixedAssetList) {
		productAccountsFixedAssetList = newProductAccountsFixedAssetList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsPurchasePriceVarianceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsPurchasePriceVarianceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsPurchasePriceVarianceList() {
		return productAccountsPurchasePriceVarianceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsPurchasePriceVarianceList() <em>productAccountsPurchasePriceVarianceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsPurchasePriceVarianceList() productAccountsPurchasePriceVarianceList}' feature.
	 * @generated
	 */
	public void setProductAccountsPurchasePriceVarianceList(
			ReferenceType newProductAccountsPurchasePriceVarianceList) {
		productAccountsPurchasePriceVarianceList = newProductAccountsPurchasePriceVarianceList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsInvoicePriceVarianceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsInvoicePriceVarianceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsInvoicePriceVarianceList() {
		return productAccountsInvoicePriceVarianceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsInvoicePriceVarianceList() <em>productAccountsInvoicePriceVarianceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsInvoicePriceVarianceList() productAccountsInvoicePriceVarianceList}' feature.
	 * @generated
	 */
	public void setProductAccountsInvoicePriceVarianceList(
			ReferenceType newProductAccountsInvoicePriceVarianceList) {
		productAccountsInvoicePriceVarianceList = newProductAccountsInvoicePriceVarianceList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsProductCOGSList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsProductCOGSList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsProductCOGSList() {
		return productAccountsProductCOGSList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsProductCOGSList() <em>productAccountsProductCOGSList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsProductCOGSList() productAccountsProductCOGSList}' feature.
	 * @generated
	 */
	public void setProductAccountsProductCOGSList(
			ReferenceType newProductAccountsProductCOGSList) {
		productAccountsProductCOGSList = newProductAccountsProductCOGSList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsTradeDiscountReceivedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsTradeDiscountReceivedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsTradeDiscountReceivedList() {
		return productAccountsTradeDiscountReceivedList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsTradeDiscountReceivedList() <em>productAccountsTradeDiscountReceivedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsTradeDiscountReceivedList() productAccountsTradeDiscountReceivedList}' feature.
	 * @generated
	 */
	public void setProductAccountsTradeDiscountReceivedList(
			ReferenceType newProductAccountsTradeDiscountReceivedList) {
		productAccountsTradeDiscountReceivedList = newProductAccountsTradeDiscountReceivedList;
	}

	/**
	 * Returns the value of '<em><b>productAccountsTradeDiscountGrantedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccountsTradeDiscountGrantedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductAccountsTradeDiscountGrantedList() {
		return productAccountsTradeDiscountGrantedList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsTradeDiscountGrantedList() <em>productAccountsTradeDiscountGrantedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductAccountsTradeDiscountGrantedList() productAccountsTradeDiscountGrantedList}' feature.
	 * @generated
	 */
	public void setProductAccountsTradeDiscountGrantedList(
			ReferenceType newProductAccountsTradeDiscountGrantedList) {
		productAccountsTradeDiscountGrantedList = newProductAccountsTradeDiscountGrantedList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsProductRevenueList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsProductRevenueList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsProductRevenueList() {
		return productCategoryAccountsProductRevenueList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsProductRevenueList() <em>productCategoryAccountsProductRevenueList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsProductRevenueList() productCategoryAccountsProductRevenueList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsProductRevenueList(
			ReferenceType newProductCategoryAccountsProductRevenueList) {
		productCategoryAccountsProductRevenueList = newProductCategoryAccountsProductRevenueList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsProductExpenseList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsProductExpenseList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsProductExpenseList() {
		return productCategoryAccountsProductExpenseList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsProductExpenseList() <em>productCategoryAccountsProductExpenseList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsProductExpenseList() productCategoryAccountsProductExpenseList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsProductExpenseList(
			ReferenceType newProductCategoryAccountsProductExpenseList) {
		productCategoryAccountsProductExpenseList = newProductCategoryAccountsProductExpenseList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsFixedAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsFixedAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsFixedAssetList() {
		return productCategoryAccountsFixedAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsFixedAssetList() <em>productCategoryAccountsFixedAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsFixedAssetList() productCategoryAccountsFixedAssetList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsFixedAssetList(
			ReferenceType newProductCategoryAccountsFixedAssetList) {
		productCategoryAccountsFixedAssetList = newProductCategoryAccountsFixedAssetList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsProductCOGSList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsProductCOGSList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsProductCOGSList() {
		return productCategoryAccountsProductCOGSList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsProductCOGSList() <em>productCategoryAccountsProductCOGSList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsProductCOGSList() productCategoryAccountsProductCOGSList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsProductCOGSList(
			ReferenceType newProductCategoryAccountsProductCOGSList) {
		productCategoryAccountsProductCOGSList = newProductCategoryAccountsProductCOGSList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsPurchasePriceVarianceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsPurchasePriceVarianceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsPurchasePriceVarianceList() {
		return productCategoryAccountsPurchasePriceVarianceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsPurchasePriceVarianceList() <em>productCategoryAccountsPurchasePriceVarianceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsPurchasePriceVarianceList() productCategoryAccountsPurchasePriceVarianceList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsPurchasePriceVarianceList(
			ReferenceType newProductCategoryAccountsPurchasePriceVarianceList) {
		productCategoryAccountsPurchasePriceVarianceList = newProductCategoryAccountsPurchasePriceVarianceList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsInvoicePriceVarianceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsInvoicePriceVarianceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsInvoicePriceVarianceList() {
		return productCategoryAccountsInvoicePriceVarianceList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsInvoicePriceVarianceList() <em>productCategoryAccountsInvoicePriceVarianceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsInvoicePriceVarianceList() productCategoryAccountsInvoicePriceVarianceList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsInvoicePriceVarianceList(
			ReferenceType newProductCategoryAccountsInvoicePriceVarianceList) {
		productCategoryAccountsInvoicePriceVarianceList = newProductCategoryAccountsInvoicePriceVarianceList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsTradeDiscountReceivedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsTradeDiscountReceivedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsTradeDiscountReceivedList() {
		return productCategoryAccountsTradeDiscountReceivedList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsTradeDiscountReceivedList() <em>productCategoryAccountsTradeDiscountReceivedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsTradeDiscountReceivedList() productCategoryAccountsTradeDiscountReceivedList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsTradeDiscountReceivedList(
			ReferenceType newProductCategoryAccountsTradeDiscountReceivedList) {
		productCategoryAccountsTradeDiscountReceivedList = newProductCategoryAccountsTradeDiscountReceivedList;
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccountsTradeDiscountGrantedList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccountsTradeDiscountGrantedList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProductCategoryAccountsTradeDiscountGrantedList() {
		return productCategoryAccountsTradeDiscountGrantedList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsTradeDiscountGrantedList() <em>productCategoryAccountsTradeDiscountGrantedList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProductCategoryAccountsTradeDiscountGrantedList() productCategoryAccountsTradeDiscountGrantedList}' feature.
	 * @generated
	 */
	public void setProductCategoryAccountsTradeDiscountGrantedList(
			ReferenceType newProductCategoryAccountsTradeDiscountGrantedList) {
		productCategoryAccountsTradeDiscountGrantedList = newProductCategoryAccountsTradeDiscountGrantedList;
	}

	/**
	 * Returns the value of '<em><b>projectAccountsProjectAssetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccountsProjectAssetList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectAccountsProjectAssetList() {
		return projectAccountsProjectAssetList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProjectAccountsProjectAssetList() <em>projectAccountsProjectAssetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProjectAccountsProjectAssetList() projectAccountsProjectAssetList}' feature.
	 * @generated
	 */
	public void setProjectAccountsProjectAssetList(
			ReferenceType newProjectAccountsProjectAssetList) {
		projectAccountsProjectAssetList = newProjectAccountsProjectAssetList;
	}

	/**
	 * Returns the value of '<em><b>projectAccountsWorkInProgressList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccountsWorkInProgressList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProjectAccountsWorkInProgressList() {
		return projectAccountsWorkInProgressList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getProjectAccountsWorkInProgressList() <em>projectAccountsWorkInProgressList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getProjectAccountsWorkInProgressList() projectAccountsWorkInProgressList}' feature.
	 * @generated
	 */
	public void setProjectAccountsWorkInProgressList(
			ReferenceType newProjectAccountsWorkInProgressList) {
		projectAccountsWorkInProgressList = newProjectAccountsWorkInProgressList;
	}

	/**
	 * Returns the value of '<em><b>vendorAccountsVendorLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccountsVendorLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getVendorAccountsVendorLiabilityList() {
		return vendorAccountsVendorLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getVendorAccountsVendorLiabilityList() <em>vendorAccountsVendorLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getVendorAccountsVendorLiabilityList() vendorAccountsVendorLiabilityList}' feature.
	 * @generated
	 */
	public void setVendorAccountsVendorLiabilityList(
			ReferenceType newVendorAccountsVendorLiabilityList) {
		vendorAccountsVendorLiabilityList = newVendorAccountsVendorLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>vendorAccountsVendorServiceLiabilityList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccountsVendorServiceLiabilityList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getVendorAccountsVendorServiceLiabilityList() {
		return vendorAccountsVendorServiceLiabilityList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getVendorAccountsVendorServiceLiabilityList() <em>vendorAccountsVendorServiceLiabilityList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getVendorAccountsVendorServiceLiabilityList() vendorAccountsVendorServiceLiabilityList}' feature.
	 * @generated
	 */
	public void setVendorAccountsVendorServiceLiabilityList(
			ReferenceType newVendorAccountsVendorServiceLiabilityList) {
		vendorAccountsVendorServiceLiabilityList = newVendorAccountsVendorServiceLiabilityList;
	}

	/**
	 * Returns the value of '<em><b>vendorAccountsVendorPrepaymentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccountsVendorPrepaymentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getVendorAccountsVendorPrepaymentList() {
		return vendorAccountsVendorPrepaymentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getVendorAccountsVendorPrepaymentList() <em>vendorAccountsVendorPrepaymentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getVendorAccountsVendorPrepaymentList() vendorAccountsVendorPrepaymentList}' feature.
	 * @generated
	 */
	public void setVendorAccountsVendorPrepaymentList(
			ReferenceType newVendorAccountsVendorPrepaymentList) {
		vendorAccountsVendorPrepaymentList = newVendorAccountsVendorPrepaymentList;
	}

	/**
	 * Returns the value of '<em><b>warehouseAccountsWarehouseInventoryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccountsWarehouseInventoryList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouseAccountsWarehouseInventoryList() {
		return warehouseAccountsWarehouseInventoryList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsWarehouseInventoryList() <em>warehouseAccountsWarehouseInventoryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsWarehouseInventoryList() warehouseAccountsWarehouseInventoryList}' feature.
	 * @generated
	 */
	public void setWarehouseAccountsWarehouseInventoryList(
			ReferenceType newWarehouseAccountsWarehouseInventoryList) {
		warehouseAccountsWarehouseInventoryList = newWarehouseAccountsWarehouseInventoryList;
	}

	/**
	 * Returns the value of '<em><b>warehouseAccountsInventoryAdjustmentList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccountsInventoryAdjustmentList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouseAccountsInventoryAdjustmentList() {
		return warehouseAccountsInventoryAdjustmentList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsInventoryAdjustmentList() <em>warehouseAccountsInventoryAdjustmentList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsInventoryAdjustmentList() warehouseAccountsInventoryAdjustmentList}' feature.
	 * @generated
	 */
	public void setWarehouseAccountsInventoryAdjustmentList(
			ReferenceType newWarehouseAccountsInventoryAdjustmentList) {
		warehouseAccountsInventoryAdjustmentList = newWarehouseAccountsInventoryAdjustmentList;
	}

	/**
	 * Returns the value of '<em><b>warehouseAccountsWarehouseDifferencesList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccountsWarehouseDifferencesList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouseAccountsWarehouseDifferencesList() {
		return warehouseAccountsWarehouseDifferencesList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsWarehouseDifferencesList() <em>warehouseAccountsWarehouseDifferencesList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsWarehouseDifferencesList() warehouseAccountsWarehouseDifferencesList}' feature.
	 * @generated
	 */
	public void setWarehouseAccountsWarehouseDifferencesList(
			ReferenceType newWarehouseAccountsWarehouseDifferencesList) {
		warehouseAccountsWarehouseDifferencesList = newWarehouseAccountsWarehouseDifferencesList;
	}

	/**
	 * Returns the value of '<em><b>warehouseAccountsInventoryRevaluationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccountsInventoryRevaluationList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWarehouseAccountsInventoryRevaluationList() {
		return warehouseAccountsInventoryRevaluationList;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsInventoryRevaluationList() <em>warehouseAccountsInventoryRevaluationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getWarehouseAccountsInventoryRevaluationList() warehouseAccountsInventoryRevaluationList}' feature.
	 * @generated
	 */
	public void setWarehouseAccountsInventoryRevaluationList(
			ReferenceType newWarehouseAccountsInventoryRevaluationList) {
		warehouseAccountsInventoryRevaluationList = newWarehouseAccountsInventoryRevaluationList;
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getId1() id1}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#isReference() reference}' feature.
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
	public List<FinancialMgmtAccountingCombinationTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link FinancialMgmtAccountingCombinationType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link FinancialMgmtAccountingCombinationType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<FinancialMgmtAccountingCombinationTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "FinancialMgmtAccountingCombinationType " + " [id1: " + getId1()
				+ "]" + " [identifier: " + getIdentifier() + "]"
				+ " [reference: " + isReference() + "]";
	}
}
