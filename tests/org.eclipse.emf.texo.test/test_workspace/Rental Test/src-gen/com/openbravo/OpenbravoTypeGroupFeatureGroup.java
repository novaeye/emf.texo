package com.openbravo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation for the Feature Group '<em><b>OpenbravoType.group</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OpenbravoTypeGroupFeatureGroup {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Is used to identify which feature is set in this feature group.
	 * @generated 
	 */
	public static enum Feature {
		ADACCTPROCESS, ADALERT, ADALERTRECIPIENT, ADALERTRULE, ADALERTRULETRL, ADATTACHMENT, ADAUXILIARYINPUT, ADCALLOUT, ADCLIENT, ADCLIENTMODULE, ADCOLUMN, ADEPINSTANCEPARA, ADEPPROCEDURES, ADELEMENT, ADELEMENTTRL, ADERRORLOG, ADEXTENSIONPOINTS, ADFIELD, ADFIELDGROUP, ADFIELDGROUPTRL, ADFIELDTRL, ADFILETYPE, ADFORM, ADFORMACCESS, ADFORMTRL, ADHEARTBEATLOG, ADHEARTBEATLOGCUSTOMQUERY, ADHEARTBEATLOGCUSTOMQUERYROW, ADIMAGE, ADLANGUAGE, ADLIST, ADLISTTRL, ADMENU, ADMENUTRL, ADMESSAGE, ADMESSAGETRL, ADMODELIMPLEMENTATION, ADMODELIMPLEMENTATIONMAPPING, ADMODULE, ADMODULEDBPREFIXINSTALL, ADMODULEDEPENDENCYINST, ADMODULEINSTALL, ADMODULEMERGE, ADMONTH, ADMONTHTRL, ADORGMODULE, ADPARAMETER, ADPREFERENCE, ADPROCESS, ADPROCESSACCESS, ADPROCESSINSTANCE, ADPROCESSPARAMETER, ADPROCESSPARAMETERTRL, ADPROCESSSCHEDULING, ADPROCESSTRL, ADREFERENCE, ADREFERENCETRL, ADREFERENCEDTABLE, ADREGISTRATION, ADROLE, ADROLEORGANIZATION, ADSELECTOR, ADSELECTORCOLUMN, ADSEQUENCE, ADSESSION, ADSESSIONSTATUS, ADSESSIONUSAGEAUDIT, ADSYSTEM, ADSYSTEMINFORMATION, ADTAB, ADTABTRL, ADTABLE, ADTABLEACCESS, ADTABLEPOSTV, ADTEXTINTERFACE, ADTEXTINTERFACETRL, ADTREE, ADTREENODE, ADUSER, ADUSERROLES, ADVALIDATION, ADWINDOW, ADWINDOWACCESS, ADWINDOWTRL, ADAUDITTRAIL, ADAUDITTRAILRAW, ADCREATEFACTTEMPLATE, APRMFINACCTRANSACTIONACCTV, APRMFINACCTRANSACTIONV, APRMFINACCTRXFULLACCTV, APRMPENDINGPAYMENTINVOICE, APRMRECDETAILV, APRMRECONCILIATION, ACCTSCHEMATABLEDOCTYPE, ACTIVEPROPOSALV, APPROVEDVENDOR, ATTRIBUTE, ATTRIBUTEINSTANCE, ATTRIBUTESET, ATTRIBUTESETINSTANCE, ATTRIBUTEUSE, ATTRIBUTEVALUE, BANK, BANKACCOUNT, BANKACCOUNTACCOUNTS, BUSINESSPARTNER, BUSINESSPARTNERBANKACCOUNT, BUSINESSPARTNERCATEGORY, BUSINESSPARTNERCATEGORYACCOUNT, BUSINESSPARTNERDISCOUNT, BUSINESSPARTNERLOCATION, BUSINESSPARTNERPRODUCTTEMPLATE, BUSINESSPARTNERTAXCATEGORY, BUSINESSPARTNERWITHHOLDING, CACCTSCHEMAPROCESS, CITY, CLIENTINFORMATION, CONDITIONGOODS, CONTACTEMAILINTERACTION, COUNTRY, COUNTRYTRL, CURRENCY, CURRENCYCONVERSIONRATE, CURRENCYCONVERSIONRATEDOC, CURRENCYTRL, CUSTOMERACCOUNTS, DATAPACKAGE, DATASET, DATASETCOLUMN, DATASETTABLE, DOCUMENTTEMPLATE, DOCUMENTTYPE, DOCUMENTTYPETRL, EMAILINTERACTION, EMAILSERVERCONFIGURATION, EMAILTEMPLATE, EMPLOYEEACCOUNTS, EMPLOYEESALARYCATEGORY, EXPENSETYPE, EXTERNALPOS, EXTERNALPOSCATEGORY, EXTERNALPOSPRODUCT, FINBANKSTATEMENT, FINBANKSTATEMENTLINE, FINFINACCTRANSACTION, FINFINANCIALACCOUNT, FINFINANCIALACCOUNTACCT, FINPAYMENT, FINPAYMENTMETHOD, FINPAYMENTCREDIT, FINPAYMENTDETAIL, FINPAYMENTDETAILV, FINPAYMENTPRIORITY, FINPAYMENTPROPDETAIL, FINPAYMENTPROPDETAILV, FINPAYMENTPROPOSAL, FINPAYMENTSCHEDINVV, FINPAYMENTSCHEDORDV, FINPAYMENTSCHEDULE, FINPAYMENTSCHEDULEDETAIL, FINRECONCILIATION, FINRECONCILIATIONLINETEMP, FINRECONCILIATIONLINEV, FINANCIALMGMTACCOUNTINGCOMBINATION, FINANCIALMGMTACCOUNTINGFACT, FINANCIALMGMTACCOUNTINGREPORT, FINANCIALMGMTACCOUNTINGRPTELEMENT, FINANCIALMGMTACCTCFS, FINANCIALMGMTACCTRPTGROUP, FINANCIALMGMTACCTRPTNODE, FINANCIALMGMTACCTSCHEMA, FINANCIALMGMTACCTSCHEMADEFAULT, FINANCIALMGMTACCTSCHEMAELEMENT, FINANCIALMGMTACCTSCHEMAGL, FINANCIALMGMTACCTSCHEMATABLE, FINANCIALMGMTAMORTIZATION, FINANCIALMGMTAMORTIZATIONLINE, FINANCIALMGMTASSET, FINANCIALMGMTASSETACCOUNTS, FINANCIALMGMTASSETGROUP, FINANCIALMGMTASSETGROUPACCT, FINANCIALMGMTBANKFILEFORMAT, FINANCIALMGMTBANKSTATEMENT, FINANCIALMGMTBANKSTATEMENTLINE, FINANCIALMGMTBUDGET, FINANCIALMGMTBUDGETLINE, FINANCIALMGMTCALENDAR, FINANCIALMGMTCASHBOOK, FINANCIALMGMTCASHBOOKACCOUNTS, FINANCIALMGMTCASHJOURNAL, FINANCIALMGMTDPMANAGEMENT, FINANCIALMGMTDPMANAGEMENTLINE, FINANCIALMGMTDEBTPAYMENT, FINANCIALMGMTDEBTPAYMENTBALREPLACE, FINANCIALMGMTDEBTPAYMENTBALANCING, FINANCIALMGMTDEBTPAYMENTCANCELV, FINANCIALMGMTDEBTPAYMENTGENERATEV, FINANCIALMGMTDIMENSION, FINANCIALMGMTELEMENT, FINANCIALMGMTELEMENTVALUE, FINANCIALMGMTELEMENTVALUEOPERAND, FINANCIALMGMTELEMENTVALUETRL, FINANCIALMGMTFINACCPAYMENTMETHOD, FINANCIALMGMTGLBATCH, FINANCIALMGMTGLCATEGORY, FINANCIALMGMTGLCHARGE, FINANCIALMGMTGLCHARGEACCOUNTS, FINANCIALMGMTGLITEM, FINANCIALMGMTGLITEMACCOUNTS, FINANCIALMGMTGLJOURNAL, FINANCIALMGMTGLJOURNALLINE, FINANCIALMGMTINCOTERMS, FINANCIALMGMTJOURNALLINE, FINANCIALMGMTMATCHINGALGORITHM, FINANCIALMGMTNONBUSINESSDAY, FINANCIALMGMTPAYMENTEXECUTIONHISTORYV, FINANCIALMGMTPAYMENTEXECUTIONPROCESS, FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER, FINANCIALMGMTPAYMENTRUN, FINANCIALMGMTPAYMENTRUNPARAMETER, FINANCIALMGMTPAYMENTRUNPAYMENT, FINANCIALMGMTPAYMENTTERM, FINANCIALMGMTPAYMENTTERMLINE, FINANCIALMGMTPAYMENTTERMTRL, FINANCIALMGMTPERIOD, FINANCIALMGMTPERIODCONTROL, FINANCIALMGMTPERIODCONTROLV, FINANCIALMGMTPROMISSORYFORMAT, FINANCIALMGMTREMITTANCE, FINANCIALMGMTREMITTANCELINE, FINANCIALMGMTREMITTANCEPARAMETER, FINANCIALMGMTREMITTANCETYPE, FINANCIALMGMTSETTLEMENT, FINANCIALMGMTTAXCATEGORY, FINANCIALMGMTTAXCATEGORYTRL, FINANCIALMGMTTAXPAYMENT, FINANCIALMGMTTAXRATE, FINANCIALMGMTTAXRATEACCOUNTS, FINANCIALMGMTTAXREGISTER, FINANCIALMGMTTAXREGISTERTYPE, FINANCIALMGMTTAXREGISTERTYPELINES, FINANCIALMGMTTAXREGISTERLINE, FINANCIALMGMTTAXREPORT, FINANCIALMGMTTAXTRL, FINANCIALMGMTTAXZONE, FINANCIALMGMTWITHHOLDING, FINANCIALMGMTWITHHOLDINGACCOUNTS, FINANCIALMGMTYEAR, GREETING, GREETINGTRL, INVOICE, INVOICEDISCOUNT, INVOICELINE, INVOICELINEACCOUNTINGDIMENSION, INVOICELINEOFFER, INVOICELINETAX, INVOICESCHEDULE, INVOICETAX, LOCATION, LOCATOR, LOT, LOTCONTROL, MRPPLANNER, MRPPLANNINGMETHOD, MRPPLANNINGMETHODLINE, MRPPRODUCTIONRUN, MRPPRODUCTIONRUNLINE, MRPPURCHASINGRUN, MRPPURCHASINGRUNLINE, MRPSALESFORECAST, MRPSALESFORECASTLINE, MANUFACTURINGACTIVITY, MANUFACTURINGACTIVITYTOOLSET, MANUFACTURINGCASE, MANUFACTURINGCHECKPOINT, MANUFACTURINGCHECKPOINTSET, MANUFACTURINGCHECKPOINTSHIFT, MANUFACTURINGCOSTCENTER, MANUFACTURINGCOSTCENTERMACHINE, MANUFACTURINGCOSTCENTEREMPLOYEE, MANUFACTURINGCOSTCENTERIC, MANUFACTURINGCOSTCENTERVERSION, MANUFACTURINGGLOBALUSE, MANUFACTURINGINCIDENCE, MANUFACTURINGINDIRECTCOST, MANUFACTURINGINDIRECTCOSTVALUE, MANUFACTURINGMACHINE, MANUFACTURINGMACHINECOST, MANUFACTURINGMACHINESTATION, MANUFACTURINGMACHINETYPE, MANUFACTURINGMAINTEANCEORDER, MANUFACTURINGMAINTENANCE, MANUFACTURINGMAINTENANCEPERIODICITY, MANUFACTURINGMAINTENANCESCHEDULE, MANUFACTURINGMAINTENANCETASK, MANUFACTURINGMAINTENANCEWORKER, MANUFACTURINGMEASUREGROUP, MANUFACTURINGMEASURESHIFT, MANUFACTURINGMEASURETIME, MANUFACTURINGMEASUREVALUES, MANUFACTURINGOPERATION, MANUFACTURINGOPERATIONEMPLOYEE, MANUFACTURINGOPERATIONINDIRECTCOST, MANUFACTURINGOPERATIONMACHINE, MANUFACTURINGOPERATIONPRODUCT, MANUFACTURINGPERIODICCONTROL, MANUFACTURINGPROCESSPLAN, MANUFACTURINGPRODUCTIONLINE, MANUFACTURINGPRODUCTIONRUNEMPLOYEE, MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS, MANUFACTURINGPRODUCTIONRUNINVOICELINE, MANUFACTURINGPRODUCTIONRUNMACHINE, MANUFACTURINGPRODUCTIONRUNTOOLSET, MANUFACTURINGSECTION, MANUFACTURINGTEST, MANUFACTURINGTOOLSET, MANUFACTURINGTOOLSETTYPE, MANUFACTURINGVALUE, MANUFACTURINGVERSION, MANUFACTURINGWORKCENTER, MANUFACTURINGWORKEFFORTEMPLOYEE, MANUFACTURINGWORKEFFORTINCIDENCE, MANUFACTURINGWORKREQUIREMENT, MANUFACTURINGWORKREQUIREMENTOPERATION, MANUFACTURINGWORKREQUIREMENTPRODUCT, MARKETINGCAMPAIGN, MARKETINGCHANNEL, MATERIALMGMTABCACTIVITY, MATERIALMGMTCOSTING, MATERIALMGMTINTERNALCONSUMPTION, MATERIALMGMTINTERNALCONSUMPTIONLINE, MATERIALMGMTINTERNALMOVEMENT, MATERIALMGMTINTERNALMOVEMENTLINE, MATERIALMGMTINVENTORYCOUNT, MATERIALMGMTINVENTORYCOUNTLINE, MATERIALMGMTMATERIALTRANSACTION, MATERIALMGMTPRODUCTIONPLAN, MATERIALMGMTPRODUCTIONTRANSACTION, MATERIALMGMTSHIPMENTINOUT, MATERIALMGMTSHIPMENTINOUTLINE, MATERIALMGMTSTORAGEDETAIL, MATERIALMGMTSTORAGEPENDING, MODELIMPLEMENTATIONPARAMETER, MODULEDBPREFIX, MODULEDEPENDENCY, MODULELOG, MODULETRL, NAMINGEXCEPTION, OBCLKERTEMPLATE, OBCLKERTEMPLATEDEPENDENCY, OBCLKERUIDEFINITION, OBCQLQUERYCOLUMN, OBCQLQUERYCOLUMNTRL, OBCQLWIDGETQUERY, OBKMOWIDGETCLASS, OBKMOWIDGETCLASSACCESS, OBKMOWIDGETCLASSMENU, OBKMOWIDGETCLASSMENUTRL, OBKMOWIDGETCLASSTRL, OBKMOWIDGETINSTANCE, OBKMOWIDGETLIST, OBKMOWIDGETREFERENCE, OBKMOWIDGETURL, OBSEIGDEFAULTS, OBSERDSDATASOURCE, OBSERDSDATASOURCEFIELD, OBSOIDUSERIDENTIFIER, OBUIAPPMENUPARAMETERS, OBUIAPPNAVBARROLEACCESS, OBUIAPPNAVIGATIONBARCOMPONENT, OBUIAPPNOTE, OBUIAPPPARAMETER, OBUIAPPPARAMETERTRL, OBUIAPPPARAMETERVALUE, OBUIAPPPROCESS, OBUIAPPPROCESSACCESS, OBUIAPPREFWINDOW, OBUIAPPUIPERSONALIZATION, OBUIAPPVIEWIMPLEMENTATION, OBUISELSELECTOR, OBUISELSELECTORFIELD, OBUISELSELECTORFIELDTRL, OBUISELSELECTORTRL, ORDER, ORDERDISCOUNT, ORDERLINE, ORDERLINEOFFER, ORDERLINETAX, ORDERTAX, ORGANIZATION, ORGANIZATIONACCTSCHEMA, ORGANIZATIONCLOSING, ORGANIZATIONINFORMATION, ORGANIZATIONMODULEV, ORGANIZATIONTYPE, PERIODCONTROLLOG, PRICINGADJUSTMENT, PRICINGADJUSTMENTBUSINESSPARTNER, PRICINGADJUSTMENTBUSINESSPARTNERGROUP, PRICINGADJUSTMENTPRICELIST, PRICINGADJUSTMENTPRODUCT, PRICINGADJUSTMENTPRODUCTCATEGORY, PRICINGDISCOUNT, PRICINGPRICELIST, PRICINGPRICELISTSCHEMA, PRICINGPRICELISTSCHEMELINE, PRICINGPRICELISTVERSION, PRICINGPRODUCTPRICE, PRICINGVOLUMEDISCOUNT, PRICINGVOLUMEDISCOUNTBUSINESSPARTNER, PRICINGVOLUMEDISCOUNTINVOICE, PRICINGVOLUMEDISCOUNTPRODUCT, PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY, PRICINGVOLUMEDISCOUNTSCALE, PROCESSEXECUTION, PROCESSREQUEST, PROCESSRUN, PROCUREMENTPOINVOICEMATCH, PROCUREMENTRECEIPTINVOICEMATCH, PROCUREMENTREQUISITION, PROCUREMENTREQUISITIONLINE, PROCUREMENTREQUISITIONPOMATCH, PRODUCT, PRODUCTACCOUNTS, PRODUCTBOM, PRODUCTBYPRICEANDWAREHOUSE, PRODUCTCATEGORY, PRODUCTCATEGORYACCOUNTS, PRODUCTCUSTOMER, PRODUCTORG, PRODUCTSTOCKVIEW, PRODUCTSUBSTITUTE, PRODUCTTRL, PRODUCTUOM, PROJECT, PROJECTACCOUNTS, PROJECTISSUE, PROJECTLINE, PROJECTPHASE, PROJECTPROJECTPROPOSALTASK, PROJECTPROPOSAL, PROJECTPROPOSALLINE, PROJECTSTANDARDPHASE, PROJECTSTANDARDTASK, PROJECTTASK, PROJECTTYPE, PROJECTVENDOR, REFERENCEDATASTORE, REGION, RESOURCE, RESOURCEASSIGNMENT, RESOURCETYPE, RESOURCEUNAVAILABLE, RETURNMATERIALORDERPICKEDITLINES, RETURNMATERIALRECEIPTPICKEDIT, RETURNMATERIALSHIPMENTPICKEDIT, RETURNREASON, REVERSEDINVOICES, SQLSCRIPT, SALARYCATEGORY, SALARYCATEGORYCOST, SALESCOMMISSION, SALESCOMMISSIONAMOUNT, SALESCOMMISSIONDETAIL, SALESCOMMISSIONLINE, SALESCOMMISSIONRUN, SALESREGION, SERIALNUMBERCONTROL, SHIPPINGFREIGHTCATEGORY, SHIPPINGSHIPPINGCOMPANY, SHIPPINGSHIPPINGCOMPANYFREIGHT, TIMEANDEXPENSESHEET, TIMEANDEXPENSESHEETLINE, TIMEANDEXPENSESHEETLINEV, TIMETYPE, UOM, UOMCONVERSION, UOMTRL, VENDORACCOUNTS, WAREHOUSE, WAREHOUSEACCOUNTS, WAREHOUSESHIPPER, OBUIAPPVIEWROLEACCESS
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns only the values from the feature group which have the feature equal to the parameter. 
	 * 
	 * @param featureGroup the featureGroup List to filter
	 * @param filterByFeature filters by this enum
	 * @return a list with instances corresponding to the feature kind
	 * @see Collections#unmodifiableList(List)
	 * @generated 
	 */
	@SuppressWarnings("unchecked")
	public static <T> List<T> createUnmodifiableValueList(
			List<OpenbravoTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final OpenbravoTypeGroupFeatureGroup group : featureGroup) {
			if (group.getFeature() == filterByFeature) {
				result.add(group.getValue());
			}
		}
		return (List<T>) Collections.unmodifiableList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Returns a single value from the feature group which has the feature equal to the parameter.
	 * The first found value is returned. If no value can be found then null is returned. 
	 * 
	 * @param featureGroup the featureGroup List to filter
	 * @param filterByFeature filters by this enum
	 * @return an instance corresponding to the feature kind or null if not found.
	 * @generated 
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getSingleFeatureMapValue(
			List<OpenbravoTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final OpenbravoTypeGroupFeatureGroup group : featureGroup) {
			if (group.getFeature() == filterByFeature) {
				return (T) group.getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Creates a list of group instances set with the passed feature and values. 
	 * 
	 * @param feature the feature to set
	 * @param values the values to set as value of each group instance in the result.
	 * @return a list with instances of this class, set with the Feature and values
	 * @generated 
	 */
	public static List<OpenbravoTypeGroupFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<OpenbravoTypeGroupFeatureGroup> result = new ArrayList<OpenbravoTypeGroupFeatureGroup>();
		for (Object value : values) {
			final OpenbravoTypeGroupFeatureGroup group = new OpenbravoTypeGroupFeatureGroup();
			group.setValue(feature, value);
			result.add(group);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Feature feature = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAcctProcessType aDAcctProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAlertType aDAlert;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAlertRecipientType aDAlertRecipient;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAlertRuleType aDAlertRule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAlertRuleTrlType aDAlertRuleTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAttachmentType aDAttachment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAuxiliaryInputType aDAuxiliaryInput;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADCalloutType aDCallout;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADClientType aDClient;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADClientModuleType aDClientModule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADColumnType aDColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADEPInstanceParaType aDEPInstancePara;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADEPProceduresType aDEPProcedures;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADElementType aDElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADElementTrlType aDElementTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADErrorLogType aDErrorLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADExtensionPointsType aDExtensionPoints;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFieldType aDField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFieldGroupType aDFieldGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFieldGroupTrlType aDFieldGroupTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFieldTrlType aDFieldTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFileTypeType aDFileType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFormType aDForm;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFormAccessType aDFormAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADFormTrlType aDFormTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADHeartbeatLogType aDHeartbeatLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADHeartbeatLogCustomQueryType aDHeartbeatLogCustomQuery;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADHeartbeatLogCustomQueryRowType aDHeartbeatLogCustomQueryRow;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADImageType aDImage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADLanguageType aDLanguage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADListType aDList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADListTrlType aDListTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADMenuType aDMenu;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADMenuTrlType aDMenuTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADMessageType aDMessage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADMessageTrlType aDMessageTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModelImplementationType aDModelImplementation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModelImplementationMappingType aDModelImplementationMapping;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModuleType aDModule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModuleDBPrefixInstallType aDModuleDBPrefixInstall;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModuleDependencyInstType aDModuleDependencyInst;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModuleInstallType aDModuleInstall;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModuleMergeType aDModuleMerge;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADMonthType aDMonth;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADMonthTrlType aDMonthTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADOrgModuleType aDOrgModule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADParameterType aDParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADPreferenceType aDPreference;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessType aDProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessAccessType aDProcessAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessInstanceType aDProcessInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessParameterType aDProcessParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessParameterTrlType aDProcessParameterTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessSchedulingType aDProcessScheduling;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessTrlType aDProcessTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADReferenceType aDReference;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADReferenceTrlType aDReferenceTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADReferencedTableType aDReferencedTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADRegistrationType aDRegistration;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADRoleType aDRole;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADRoleOrganizationType aDRoleOrganization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSelectorType aDSelector;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSelectorColumnType aDSelectorColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSequenceType aDSequence;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSessionType aDSession;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSessionStatusType aDSessionStatus;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSessionUsageAuditType aDSessionUsageAudit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSystemType aDSystem;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADSystemInformationType aDSystemInformation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTabType aDTab;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTabTrlType aDTabTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTableType aDTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTableAccessType aDTableAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTablePostVType aDTablePostV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTextInterfaceType aDTextInterface;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTextInterfaceTrlType aDTextInterfaceTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTreeType aDTree;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADTreeNodeType aDTreeNode;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADUserType aDUser;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADUserRolesType aDUserRoles;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADValidationType aDValidation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADWindowType aDWindow;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADWindowAccessType aDWindowAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADWindowTrlType aDWindowTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAuditTrailType aDAuditTrail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADAuditTrailRawType aDAuditTrailRaw;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADCreateFactTemplateType aDCreateFactTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMFinAccTransactionAcctVType aPRMFinAccTransactionAcctV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMFinaccTransactionVType aPRMFinaccTransactionV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMFinaccTrxFullAcctVType aPRMFinaccTrxFullAcctV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMPendingPaymentInvoiceType aPRMPendingPaymentInvoice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMRecDetailVType aPRMRecDetailV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private APRMReconciliationType aPRMReconciliation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AcctSchemaTableDocTypeType acctSchemaTableDocType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ActiveProposalVType activeProposalV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ApprovedVendorType approvedVendor;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AttributeType attribute;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AttributeInstanceType attributeInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AttributeSetType attributeSet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AttributeSetInstanceType attributeSetInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AttributeUseType attributeUse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private AttributeValueType attributeValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BankType bank;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BankAccountType bankAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BankAccountAccountsType bankAccountAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerType businessPartner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerBankAccountType businessPartnerBankAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerCategoryType businessPartnerCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerCategoryAccountType businessPartnerCategoryAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerDiscountType businessPartnerDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerLocationType businessPartnerLocation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerProductTemplateType businessPartnerProductTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerTaxCategoryType businessPartnerTaxCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private BusinessPartnerWithholdingType businessPartnerWithholding;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CAcctSchemaProcessType cAcctSchemaProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CityType city;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ClientInformationType clientInformation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ConditionGoodsType conditionGoods;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ContactEmailInteractionType contactEmailInteraction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CountryType country;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CountryTrlType countryTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyType currency;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyConversionRateType currencyConversionRate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyConversionRateDocType currencyConversionRateDoc;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CurrencyTrlType currencyTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private CustomerAccountsType customerAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DataPackageType dataPackage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DataSetType dataSet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DataSetColumnType dataSetColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DataSetTableType dataSetTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DocumentTemplateType documentTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DocumentTypeType documentType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DocumentTypeTrlType documentTypeTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmailInteractionType emailInteraction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmailServerConfigurationType emailServerConfiguration;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmailTemplateType emailTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmployeeAccountsType employeeAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private EmployeeSalaryCategoryType employeeSalaryCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ExpenseTypeType expenseType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ExternalPOSType externalPOS;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ExternalPOSCategoryType externalPOSCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ExternalPOSProductType externalPOSProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINBankStatementType fINBankStatement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINBankStatementLineType fINBankStatementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINFinaccTransactionType fINFinaccTransaction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINFinancialAccountType fINFinancialAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINFinancialAccountAcctType fINFinancialAccountAcct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentType fINPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentMethodType fINPaymentMethod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentCreditType fINPaymentCredit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentDetailType fINPaymentDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentDetailVType fINPaymentDetailV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentPriorityType fINPaymentPriority;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentPropDetailType fINPaymentPropDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentPropDetailVType fINPaymentPropDetailV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentProposalType fINPaymentProposal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentSchedInvVType fINPaymentSchedInvV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentSchedOrdVType fINPaymentSchedOrdV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentScheduleType fINPaymentSchedule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINPaymentScheduleDetailType fINPaymentScheduleDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINReconciliationType fINReconciliation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINReconciliationLineTempType fINReconciliationLineTemp;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FINReconciliationLineVType fINReconciliationLineV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAccountingCombinationType financialMgmtAccountingCombination;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAccountingFactType financialMgmtAccountingFact;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAccountingReportType financialMgmtAccountingReport;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAccountingRptElementType financialMgmtAccountingRptElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctCFSType financialMgmtAcctCFS;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctRptGroupType financialMgmtAcctRptGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctRptNodeType financialMgmtAcctRptNode;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaType financialMgmtAcctSchema;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaDefaultType financialMgmtAcctSchemaDefault;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaElementType financialMgmtAcctSchemaElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaGLType financialMgmtAcctSchemaGL;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAcctSchemaTableType financialMgmtAcctSchemaTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAmortizationType financialMgmtAmortization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAmortizationLineType financialMgmtAmortizationLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAssetType financialMgmtAsset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAssetAccountsType financialMgmtAssetAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAssetGroupType financialMgmtAssetGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtAssetGroupAcctType financialMgmtAssetGroupAcct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtBankFileFormatType financialMgmtBankFileFormat;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtBankStatementType financialMgmtBankStatement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtBankStatementLineType financialMgmtBankStatementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtBudgetType financialMgmtBudget;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtBudgetLineType financialMgmtBudgetLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtCalendarType financialMgmtCalendar;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtCashBookType financialMgmtCashBook;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtCashBookAccountsType financialMgmtCashBookAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtCashJournalType financialMgmtCashJournal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDPManagementType financialMgmtDPManagement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDPManagementLineType financialMgmtDPManagementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentType financialMgmtDebtPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentBalReplaceType financialMgmtDebtPaymentBalReplace;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentBalancingType financialMgmtDebtPaymentBalancing;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentCancelVType financialMgmtDebtPaymentCancelV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDebtPaymentGenerateVType financialMgmtDebtPaymentGenerateV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtDimensionType financialMgmtDimension;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtElementType financialMgmtElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtElementValueType financialMgmtElementValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtElementValueOperandType financialMgmtElementValueOperand;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtElementValueTrlType financialMgmtElementValueTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtFinAccPaymentMethodType financialMgmtFinAccPaymentMethod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLBatchType financialMgmtGLBatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLCategoryType financialMgmtGLCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLChargeType financialMgmtGLCharge;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLChargeAccountsType financialMgmtGLChargeAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLItemType financialMgmtGLItem;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLItemAccountsType financialMgmtGLItemAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLJournalType financialMgmtGLJournal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtGLJournalLineType financialMgmtGLJournalLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtIncotermsType financialMgmtIncoterms;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtJournalLineType financialMgmtJournalLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtMatchingAlgorithmType financialMgmtMatchingAlgorithm;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtNonBusinessDayType financialMgmtNonBusinessDay;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentExecutionHistoryVType financialMgmtPaymentExecutionHistoryV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentExecutionProcessType financialMgmtPaymentExecutionProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentExecutionProcessParameterType financialMgmtPaymentExecutionProcessParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentRunType financialMgmtPaymentRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentRunParameterType financialMgmtPaymentRunParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentRunPaymentType financialMgmtPaymentRunPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentTermType financialMgmtPaymentTerm;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentTermLineType financialMgmtPaymentTermLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPaymentTermTrlType financialMgmtPaymentTermTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPeriodType financialMgmtPeriod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPeriodControlType financialMgmtPeriodControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPeriodControlVType financialMgmtPeriodControlV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtPromissoryFormatType financialMgmtPromissoryFormat;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtRemittanceType financialMgmtRemittance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtRemittanceLineType financialMgmtRemittanceLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtRemittanceParameterType financialMgmtRemittanceParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtRemittanceTypeType financialMgmtRemittanceType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtSettlementType financialMgmtSettlement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxCategoryType financialMgmtTaxCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxCategoryTrlType financialMgmtTaxCategoryTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxPaymentType financialMgmtTaxPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRateType financialMgmtTaxRate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRateAccountsType financialMgmtTaxRateAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRegisterType financialMgmtTaxRegister;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRegisterTypeType financialMgmtTaxRegisterType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRegisterTypeLinesType financialMgmtTaxRegisterTypeLines;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxRegisterlineType financialMgmtTaxRegisterline;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxReportType financialMgmtTaxReport;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxTrlType financialMgmtTaxTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtTaxZoneType financialMgmtTaxZone;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtWithholdingType financialMgmtWithholding;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtWithholdingAccountsType financialMgmtWithholdingAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private FinancialMgmtYearType financialMgmtYear;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private GreetingType greeting;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private GreetingTrlType greetingTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceType invoice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceDiscountType invoiceDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceLineType invoiceLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceLineAccountingDimensionType invoiceLineAccountingDimension;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceLineOfferType invoiceLineOffer;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceLineTaxType invoiceLineTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceScheduleType invoiceSchedule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private InvoiceTaxType invoiceTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private LocationType location;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private LocatorType locator;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private LotType lot;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private LotControlType lotControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPPlannerType mRPPlanner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPPlanningMethodType mRPPlanningMethod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPPlanningMethodLineType mRPPlanningMethodLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPProductionRunType mRPProductionRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPProductionRunLineType mRPProductionRunLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPPurchasingRunType mRPPurchasingRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPPurchasingRunLineType mRPPurchasingRunLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPSalesForecastType mRPSalesForecast;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MRPSalesForecastLineType mRPSalesForecastLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingActivityType manufacturingActivity;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingActivityToolsetType manufacturingActivityToolset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCaseType manufacturingCase;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCheckPointType manufacturingCheckPoint;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCheckPointSetType manufacturingCheckPointSet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCheckPointShiftType manufacturingCheckPointShift;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCostCenterType manufacturingCostCenter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCostCenterMachineType manufacturingCostCenterMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCostcenterEmployeeType manufacturingCostcenterEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCostcenterICType manufacturingCostcenterIC;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingCostcenterVersionType manufacturingCostcenterVersion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingGlobalUseType manufacturingGlobalUse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingIncidenceType manufacturingIncidence;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingIndirectCostType manufacturingIndirectCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingIndirectCostValueType manufacturingIndirectCostValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMachineType manufacturingMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMachineCostType manufacturingMachineCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMachineStationType manufacturingMachineStation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMachineTypeType manufacturingMachineType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMainteanceOrderType manufacturingMainteanceOrder;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMaintenanceType manufacturingMaintenance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMaintenancePeriodicityType manufacturingMaintenancePeriodicity;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMaintenanceScheduleType manufacturingMaintenanceSchedule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMaintenanceTaskType manufacturingMaintenanceTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMaintenanceWorkerType manufacturingMaintenanceWorker;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMeasureGroupType manufacturingMeasureGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMeasureShiftType manufacturingMeasureShift;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMeasureTimeType manufacturingMeasureTime;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingMeasureValuesType manufacturingMeasureValues;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationType manufacturingOperation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationEmployeeType manufacturingOperationEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationIndirectCostType manufacturingOperationIndirectCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationMachineType manufacturingOperationMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingOperationProductType manufacturingOperationProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingPeriodicControlType manufacturingPeriodicControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProcessPlanType manufacturingProcessPlan;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionLineType manufacturingProductionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunEmployeeType manufacturingProductionRunEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunIndirectCostsType manufacturingProductionRunIndirectCosts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunInvoiceLineType manufacturingProductionRunInvoiceLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunMachineType manufacturingProductionRunMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingProductionRunToolsetType manufacturingProductionRunToolset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingSectionType manufacturingSection;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingTestType manufacturingTest;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingToolsetType manufacturingToolset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingToolsetTypeType manufacturingToolsetType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingValueType manufacturingValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingVersionType manufacturingVersion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingWorkCenterType manufacturingWorkCenter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingWorkEffortEmployeeType manufacturingWorkEffortEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingWorkEffortIncidenceType manufacturingWorkEffortIncidence;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingWorkRequirementType manufacturingWorkRequirement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingWorkRequirementOperationType manufacturingWorkRequirementOperation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ManufacturingWorkRequirementProductType manufacturingWorkRequirementProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MarketingCampaignType marketingCampaign;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MarketingChannelType marketingChannel;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtABCActivityType materialMgmtABCActivity;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtCostingType materialMgmtCosting;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtInternalConsumptionType materialMgmtInternalConsumption;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtInternalConsumptionLineType materialMgmtInternalConsumptionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtInternalMovementType materialMgmtInternalMovement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtInternalMovementLineType materialMgmtInternalMovementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtInventoryCountType materialMgmtInventoryCount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtInventoryCountLineType materialMgmtInventoryCountLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtMaterialTransactionType materialMgmtMaterialTransaction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtProductionPlanType materialMgmtProductionPlan;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtProductionTransactionType materialMgmtProductionTransaction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtShipmentInOutType materialMgmtShipmentInOut;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtShipmentInOutLineType materialMgmtShipmentInOutLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtStorageDetailType materialMgmtStorageDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private MaterialMgmtStoragePendingType materialMgmtStoragePending;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ModelImplementationParameterType modelImplementationParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ModuleDBPrefixType moduleDBPrefix;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ModuleDependencyType moduleDependency;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ModuleLogType moduleLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ModuleTrlType moduleTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private NamingExceptionType namingException;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCLKERTemplateType oBCLKERTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCLKERTemplateDependencyType oBCLKERTemplateDependency;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCLKERUIDefinitionType oBCLKERUIDefinition;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCQLQueryColumnType oBCQLQueryColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCQLQueryColumnTrlType oBCQLQueryColumnTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCQLWidgetQueryType oBCQLWidgetQuery;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassType oBKMOWidgetClass;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassAccessType oBKMOWidgetClassAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassMenuType oBKMOWidgetClassMenu;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassMenuTrlType oBKMOWidgetClassMenuTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetClassTrlType oBKMOWidgetClassTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetInstanceType oBKMOWidgetInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetListType oBKMOWidgetList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetReferenceType oBKMOWidgetReference;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBKMOWidgetURLType oBKMOWidgetURL;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBSEIGDefaultsType oBSEIGDefaults;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBSERDSDatasourceType oBSERDSDatasource;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBSERDSDatasourceFieldType oBSERDSDatasourceField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBSOIDUserIdentifierType oBSOIDUserIdentifier;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPMenuParametersType oBUIAPPMenuParameters;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPNavbarRoleaccessType oBUIAPPNavbarRoleaccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPNavigationBarComponentType oBUIAPPNavigationBarComponent;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPNoteType oBUIAPPNote;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPParameterType oBUIAPPParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPParameterTrlType oBUIAPPParameterTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPParameterValueType oBUIAPPParameterValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPProcessType oBUIAPPProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPProcessAccessType oBUIAPPProcessAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPRefWindowType oBUIAPPRefWindow;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPUIPersonalizationType oBUIAPPUIPersonalization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUIAPPViewImplementationType oBUIAPPViewImplementation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorType oBUISELSelector;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorFieldType oBUISELSelectorField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorFieldTrlType oBUISELSelectorFieldTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBUISELSelectorTrlType oBUISELSelectorTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderType order;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderDiscountType orderDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderLineType orderLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderLineOfferType orderLineOffer;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderLineTaxType orderLineTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrderTaxType orderTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationType organization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationAcctSchemaType organizationAcctSchema;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationClosingType organizationClosing;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationInformationType organizationInformation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationModuleVType organizationModuleV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OrganizationTypeType organizationType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PeriodControlLogType periodControlLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentType pricingAdjustment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentBusinessPartnerType pricingAdjustmentBusinessPartner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentBusinessPartnerGroupType pricingAdjustmentBusinessPartnerGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentPriceListType pricingAdjustmentPriceList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentProductType pricingAdjustmentProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingAdjustmentProductCategoryType pricingAdjustmentProductCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingDiscountType pricingDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingPriceListType pricingPriceList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingPriceListSchemaType pricingPriceListSchema;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingPriceListSchemeLineType pricingPriceListSchemeLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingPriceListVersionType pricingPriceListVersion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingProductPriceType pricingProductPrice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingVolumeDiscountType pricingVolumeDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingVolumeDiscountBusinessPartnerType pricingVolumeDiscountBusinessPartner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingVolumeDiscountInvoiceType pricingVolumeDiscountInvoice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingVolumeDiscountProductType pricingVolumeDiscountProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingVolumeDiscountProductCategoryType pricingVolumeDiscountProductCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PricingVolumeDiscountScaleType pricingVolumeDiscountScale;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcessExecutionType processExecution;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcessRequestType processRequest;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcessRunType processRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcurementPOInvoiceMatchType procurementPOInvoiceMatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcurementReceiptInvoiceMatchType procurementReceiptInvoiceMatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcurementRequisitionType procurementRequisition;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcurementRequisitionLineType procurementRequisitionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcurementRequisitionPOMatchType procurementRequisitionPOMatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductType product;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductAccountsType productAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductBOMType productBOM;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductByPriceAndWarehouseType productByPriceAndWarehouse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductCategoryType productCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductCategoryAccountsType productCategoryAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductCustomerType productCustomer;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductOrgType productOrg;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductStockViewType productStockView;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductSubstituteType productSubstitute;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductTrlType productTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProductUOMType productUOM;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectType project;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectAccountsType projectAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectIssueType projectIssue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectLineType projectLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectPhaseType projectPhase;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectProjectProposalTaskType projectProjectProposalTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectProposalType projectProposal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectProposalLineType projectProposalLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectStandardPhaseType projectStandardPhase;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectStandardTaskType projectStandardTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectTaskType projectTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectTypeType projectType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProjectVendorType projectVendor;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceDataStoreType referenceDataStore;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RegionType region;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResourceType resource;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResourceAssignmentType resourceAssignment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResourceTypeType resourceType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResourceUnAvailableType resourceUnAvailable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReturnMaterialOrderPickEditLinesType returnMaterialOrderPickEditLines;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReturnMaterialReceiptPickEditType returnMaterialReceiptPickEdit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReturnMaterialShipmentPickEditType returnMaterialShipmentPickEdit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReturnReasonType returnReason;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReversedInvoicesType reversedInvoices;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SQLScriptType sQLScript;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalaryCategoryType salaryCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalaryCategoryCostType salaryCategoryCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalesCommissionType salesCommission;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalesCommissionAmountType salesCommissionAmount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalesCommissionDetailType salesCommissionDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalesCommissionLineType salesCommissionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalesCommissionRunType salesCommissionRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SalesRegionType salesRegion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SerialNumberControlType serialNumberControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ShippingFreightCategoryType shippingFreightCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ShippingShippingCompanyType shippingShippingCompany;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ShippingShippingCompanyFreightType shippingShippingCompanyFreight;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private TimeAndExpenseSheetType timeAndExpenseSheet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private TimeAndExpenseSheetLineType timeAndExpenseSheetLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private TimeAndExpenseSheetLineVType timeAndExpenseSheetLineV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private TimeTypeType timeType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private UOMType uOM;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private UOMConversionType uOMConversion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private UOMTrlType uOMTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private VendorAccountsType vendorAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseType warehouse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseAccountsType warehouseAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private WarehouseShipperType warehouseShipper;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ObuiappViewRoleAccessType obuiappViewRoleAccess;

	/**
	 * @generated 
	 */
	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	/**
	 * @generated 
	 */
	public Feature getFeature() {
		return feature;
	}

	/**
	 * Returns the value of '<em><b>aDAcctProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAcctProcess</b></em>' feature
	 * @generated
	 */
	public ADAcctProcessType getADAcctProcess() {
		return aDAcctProcess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAcctProcess() <em>aDAcctProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAcctProcess() aDAcctProcess}' feature.
	 * @generated
	 */
	public void setADAcctProcess(ADAcctProcessType newADAcctProcess) {
		aDAcctProcess = newADAcctProcess;
		setFeature(Feature.ADACCTPROCESS);
	}

	/**
	 * Returns the value of '<em><b>aDAlert</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlert</b></em>' feature
	 * @generated
	 */
	public ADAlertType getADAlert() {
		return aDAlert;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlert() <em>aDAlert</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlert() aDAlert}' feature.
	 * @generated
	 */
	public void setADAlert(ADAlertType newADAlert) {
		aDAlert = newADAlert;
		setFeature(Feature.ADALERT);
	}

	/**
	 * Returns the value of '<em><b>aDAlertRecipient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRecipient</b></em>' feature
	 * @generated
	 */
	public ADAlertRecipientType getADAlertRecipient() {
		return aDAlertRecipient;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlertRecipient() <em>aDAlertRecipient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlertRecipient() aDAlertRecipient}' feature.
	 * @generated
	 */
	public void setADAlertRecipient(ADAlertRecipientType newADAlertRecipient) {
		aDAlertRecipient = newADAlertRecipient;
		setFeature(Feature.ADALERTRECIPIENT);
	}

	/**
	 * Returns the value of '<em><b>aDAlertRule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRule</b></em>' feature
	 * @generated
	 */
	public ADAlertRuleType getADAlertRule() {
		return aDAlertRule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlertRule() <em>aDAlertRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlertRule() aDAlertRule}' feature.
	 * @generated
	 */
	public void setADAlertRule(ADAlertRuleType newADAlertRule) {
		aDAlertRule = newADAlertRule;
		setFeature(Feature.ADALERTRULE);
	}

	/**
	 * Returns the value of '<em><b>aDAlertRuleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRuleTrl</b></em>' feature
	 * @generated
	 */
	public ADAlertRuleTrlType getADAlertRuleTrl() {
		return aDAlertRuleTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlertRuleTrl() <em>aDAlertRuleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlertRuleTrl() aDAlertRuleTrl}' feature.
	 * @generated
	 */
	public void setADAlertRuleTrl(ADAlertRuleTrlType newADAlertRuleTrl) {
		aDAlertRuleTrl = newADAlertRuleTrl;
		setFeature(Feature.ADALERTRULETRL);
	}

	/**
	 * Returns the value of '<em><b>aDAttachment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAttachment</b></em>' feature
	 * @generated
	 */
	public ADAttachmentType getADAttachment() {
		return aDAttachment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAttachment() <em>aDAttachment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAttachment() aDAttachment}' feature.
	 * @generated
	 */
	public void setADAttachment(ADAttachmentType newADAttachment) {
		aDAttachment = newADAttachment;
		setFeature(Feature.ADATTACHMENT);
	}

	/**
	 * Returns the value of '<em><b>aDAuxiliaryInput</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAuxiliaryInput</b></em>' feature
	 * @generated
	 */
	public ADAuxiliaryInputType getADAuxiliaryInput() {
		return aDAuxiliaryInput;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAuxiliaryInput() <em>aDAuxiliaryInput</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAuxiliaryInput() aDAuxiliaryInput}' feature.
	 * @generated
	 */
	public void setADAuxiliaryInput(ADAuxiliaryInputType newADAuxiliaryInput) {
		aDAuxiliaryInput = newADAuxiliaryInput;
		setFeature(Feature.ADAUXILIARYINPUT);
	}

	/**
	 * Returns the value of '<em><b>aDCallout</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDCallout</b></em>' feature
	 * @generated
	 */
	public ADCalloutType getADCallout() {
		return aDCallout;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADCallout() <em>aDCallout</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADCallout() aDCallout}' feature.
	 * @generated
	 */
	public void setADCallout(ADCalloutType newADCallout) {
		aDCallout = newADCallout;
		setFeature(Feature.ADCALLOUT);
	}

	/**
	 * Returns the value of '<em><b>aDClient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClient</b></em>' feature
	 * @generated
	 */
	public ADClientType getADClient() {
		return aDClient;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADClient() <em>aDClient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADClient() aDClient}' feature.
	 * @generated
	 */
	public void setADClient(ADClientType newADClient) {
		aDClient = newADClient;
		setFeature(Feature.ADCLIENT);
	}

	/**
	 * Returns the value of '<em><b>aDClientModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClientModule</b></em>' feature
	 * @generated
	 */
	public ADClientModuleType getADClientModule() {
		return aDClientModule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADClientModule() <em>aDClientModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADClientModule() aDClientModule}' feature.
	 * @generated
	 */
	public void setADClientModule(ADClientModuleType newADClientModule) {
		aDClientModule = newADClientModule;
		setFeature(Feature.ADCLIENTMODULE);
	}

	/**
	 * Returns the value of '<em><b>aDColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumn</b></em>' feature
	 * @generated
	 */
	public ADColumnType getADColumn() {
		return aDColumn;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADColumn() <em>aDColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADColumn() aDColumn}' feature.
	 * @generated
	 */
	public void setADColumn(ADColumnType newADColumn) {
		aDColumn = newADColumn;
		setFeature(Feature.ADCOLUMN);
	}

	/**
	 * Returns the value of '<em><b>aDEPInstancePara</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDEPInstancePara</b></em>' feature
	 * @generated
	 */
	public ADEPInstanceParaType getADEPInstancePara() {
		return aDEPInstancePara;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADEPInstancePara() <em>aDEPInstancePara</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADEPInstancePara() aDEPInstancePara}' feature.
	 * @generated
	 */
	public void setADEPInstancePara(ADEPInstanceParaType newADEPInstancePara) {
		aDEPInstancePara = newADEPInstancePara;
		setFeature(Feature.ADEPINSTANCEPARA);
	}

	/**
	 * Returns the value of '<em><b>aDEPProcedures</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDEPProcedures</b></em>' feature
	 * @generated
	 */
	public ADEPProceduresType getADEPProcedures() {
		return aDEPProcedures;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADEPProcedures() <em>aDEPProcedures</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADEPProcedures() aDEPProcedures}' feature.
	 * @generated
	 */
	public void setADEPProcedures(ADEPProceduresType newADEPProcedures) {
		aDEPProcedures = newADEPProcedures;
		setFeature(Feature.ADEPPROCEDURES);
	}

	/**
	 * Returns the value of '<em><b>aDElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDElement</b></em>' feature
	 * @generated
	 */
	public ADElementType getADElement() {
		return aDElement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADElement() <em>aDElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADElement() aDElement}' feature.
	 * @generated
	 */
	public void setADElement(ADElementType newADElement) {
		aDElement = newADElement;
		setFeature(Feature.ADELEMENT);
	}

	/**
	 * Returns the value of '<em><b>aDElementTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDElementTrl</b></em>' feature
	 * @generated
	 */
	public ADElementTrlType getADElementTrl() {
		return aDElementTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADElementTrl() <em>aDElementTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADElementTrl() aDElementTrl}' feature.
	 * @generated
	 */
	public void setADElementTrl(ADElementTrlType newADElementTrl) {
		aDElementTrl = newADElementTrl;
		setFeature(Feature.ADELEMENTTRL);
	}

	/**
	 * Returns the value of '<em><b>aDErrorLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDErrorLog</b></em>' feature
	 * @generated
	 */
	public ADErrorLogType getADErrorLog() {
		return aDErrorLog;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADErrorLog() <em>aDErrorLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADErrorLog() aDErrorLog}' feature.
	 * @generated
	 */
	public void setADErrorLog(ADErrorLogType newADErrorLog) {
		aDErrorLog = newADErrorLog;
		setFeature(Feature.ADERRORLOG);
	}

	/**
	 * Returns the value of '<em><b>aDExtensionPoints</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDExtensionPoints</b></em>' feature
	 * @generated
	 */
	public ADExtensionPointsType getADExtensionPoints() {
		return aDExtensionPoints;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADExtensionPoints() <em>aDExtensionPoints</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADExtensionPoints() aDExtensionPoints}' feature.
	 * @generated
	 */
	public void setADExtensionPoints(ADExtensionPointsType newADExtensionPoints) {
		aDExtensionPoints = newADExtensionPoints;
		setFeature(Feature.ADEXTENSIONPOINTS);
	}

	/**
	 * Returns the value of '<em><b>aDField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDField</b></em>' feature
	 * @generated
	 */
	public ADFieldType getADField() {
		return aDField;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADField() <em>aDField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADField() aDField}' feature.
	 * @generated
	 */
	public void setADField(ADFieldType newADField) {
		aDField = newADField;
		setFeature(Feature.ADFIELD);
	}

	/**
	 * Returns the value of '<em><b>aDFieldGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldGroup</b></em>' feature
	 * @generated
	 */
	public ADFieldGroupType getADFieldGroup() {
		return aDFieldGroup;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFieldGroup() <em>aDFieldGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFieldGroup() aDFieldGroup}' feature.
	 * @generated
	 */
	public void setADFieldGroup(ADFieldGroupType newADFieldGroup) {
		aDFieldGroup = newADFieldGroup;
		setFeature(Feature.ADFIELDGROUP);
	}

	/**
	 * Returns the value of '<em><b>aDFieldGroupTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldGroupTrl</b></em>' feature
	 * @generated
	 */
	public ADFieldGroupTrlType getADFieldGroupTrl() {
		return aDFieldGroupTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFieldGroupTrl() <em>aDFieldGroupTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFieldGroupTrl() aDFieldGroupTrl}' feature.
	 * @generated
	 */
	public void setADFieldGroupTrl(ADFieldGroupTrlType newADFieldGroupTrl) {
		aDFieldGroupTrl = newADFieldGroupTrl;
		setFeature(Feature.ADFIELDGROUPTRL);
	}

	/**
	 * Returns the value of '<em><b>aDFieldTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldTrl</b></em>' feature
	 * @generated
	 */
	public ADFieldTrlType getADFieldTrl() {
		return aDFieldTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFieldTrl() <em>aDFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFieldTrl() aDFieldTrl}' feature.
	 * @generated
	 */
	public void setADFieldTrl(ADFieldTrlType newADFieldTrl) {
		aDFieldTrl = newADFieldTrl;
		setFeature(Feature.ADFIELDTRL);
	}

	/**
	 * Returns the value of '<em><b>aDFileType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFileType</b></em>' feature
	 * @generated
	 */
	public ADFileTypeType getADFileType() {
		return aDFileType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFileType() <em>aDFileType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFileType() aDFileType}' feature.
	 * @generated
	 */
	public void setADFileType(ADFileTypeType newADFileType) {
		aDFileType = newADFileType;
		setFeature(Feature.ADFILETYPE);
	}

	/**
	 * Returns the value of '<em><b>aDForm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDForm</b></em>' feature
	 * @generated
	 */
	public ADFormType getADForm() {
		return aDForm;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADForm() <em>aDForm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADForm() aDForm}' feature.
	 * @generated
	 */
	public void setADForm(ADFormType newADForm) {
		aDForm = newADForm;
		setFeature(Feature.ADFORM);
	}

	/**
	 * Returns the value of '<em><b>aDFormAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormAccess</b></em>' feature
	 * @generated
	 */
	public ADFormAccessType getADFormAccess() {
		return aDFormAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFormAccess() <em>aDFormAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFormAccess() aDFormAccess}' feature.
	 * @generated
	 */
	public void setADFormAccess(ADFormAccessType newADFormAccess) {
		aDFormAccess = newADFormAccess;
		setFeature(Feature.ADFORMACCESS);
	}

	/**
	 * Returns the value of '<em><b>aDFormTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormTrl</b></em>' feature
	 * @generated
	 */
	public ADFormTrlType getADFormTrl() {
		return aDFormTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFormTrl() <em>aDFormTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFormTrl() aDFormTrl}' feature.
	 * @generated
	 */
	public void setADFormTrl(ADFormTrlType newADFormTrl) {
		aDFormTrl = newADFormTrl;
		setFeature(Feature.ADFORMTRL);
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLog</b></em>' feature
	 * @generated
	 */
	public ADHeartbeatLogType getADHeartbeatLog() {
		return aDHeartbeatLog;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADHeartbeatLog() <em>aDHeartbeatLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADHeartbeatLog() aDHeartbeatLog}' feature.
	 * @generated
	 */
	public void setADHeartbeatLog(ADHeartbeatLogType newADHeartbeatLog) {
		aDHeartbeatLog = newADHeartbeatLog;
		setFeature(Feature.ADHEARTBEATLOG);
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQuery</b></em>' feature
	 * @generated
	 */
	public ADHeartbeatLogCustomQueryType getADHeartbeatLogCustomQuery() {
		return aDHeartbeatLogCustomQuery;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADHeartbeatLogCustomQuery() <em>aDHeartbeatLogCustomQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADHeartbeatLogCustomQuery() aDHeartbeatLogCustomQuery}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQuery(
			ADHeartbeatLogCustomQueryType newADHeartbeatLogCustomQuery) {
		aDHeartbeatLogCustomQuery = newADHeartbeatLogCustomQuery;
		setFeature(Feature.ADHEARTBEATLOGCUSTOMQUERY);
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQueryRow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQueryRow</b></em>' feature
	 * @generated
	 */
	public ADHeartbeatLogCustomQueryRowType getADHeartbeatLogCustomQueryRow() {
		return aDHeartbeatLogCustomQueryRow;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADHeartbeatLogCustomQueryRow() <em>aDHeartbeatLogCustomQueryRow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADHeartbeatLogCustomQueryRow() aDHeartbeatLogCustomQueryRow}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQueryRow(
			ADHeartbeatLogCustomQueryRowType newADHeartbeatLogCustomQueryRow) {
		aDHeartbeatLogCustomQueryRow = newADHeartbeatLogCustomQueryRow;
		setFeature(Feature.ADHEARTBEATLOGCUSTOMQUERYROW);
	}

	/**
	 * Returns the value of '<em><b>aDImage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDImage</b></em>' feature
	 * @generated
	 */
	public ADImageType getADImage() {
		return aDImage;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADImage() <em>aDImage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADImage() aDImage}' feature.
	 * @generated
	 */
	public void setADImage(ADImageType newADImage) {
		aDImage = newADImage;
		setFeature(Feature.ADIMAGE);
	}

	/**
	 * Returns the value of '<em><b>aDLanguage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDLanguage</b></em>' feature
	 * @generated
	 */
	public ADLanguageType getADLanguage() {
		return aDLanguage;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADLanguage() <em>aDLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADLanguage() aDLanguage}' feature.
	 * @generated
	 */
	public void setADLanguage(ADLanguageType newADLanguage) {
		aDLanguage = newADLanguage;
		setFeature(Feature.ADLANGUAGE);
	}

	/**
	 * Returns the value of '<em><b>aDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDList</b></em>' feature
	 * @generated
	 */
	public ADListType getADList() {
		return aDList;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADList() <em>aDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADList() aDList}' feature.
	 * @generated
	 */
	public void setADList(ADListType newADList) {
		aDList = newADList;
		setFeature(Feature.ADLIST);
	}

	/**
	 * Returns the value of '<em><b>aDListTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDListTrl</b></em>' feature
	 * @generated
	 */
	public ADListTrlType getADListTrl() {
		return aDListTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADListTrl() <em>aDListTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADListTrl() aDListTrl}' feature.
	 * @generated
	 */
	public void setADListTrl(ADListTrlType newADListTrl) {
		aDListTrl = newADListTrl;
		setFeature(Feature.ADLISTTRL);
	}

	/**
	 * Returns the value of '<em><b>aDMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenu</b></em>' feature
	 * @generated
	 */
	public ADMenuType getADMenu() {
		return aDMenu;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMenu() <em>aDMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMenu() aDMenu}' feature.
	 * @generated
	 */
	public void setADMenu(ADMenuType newADMenu) {
		aDMenu = newADMenu;
		setFeature(Feature.ADMENU);
	}

	/**
	 * Returns the value of '<em><b>aDMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenuTrl</b></em>' feature
	 * @generated
	 */
	public ADMenuTrlType getADMenuTrl() {
		return aDMenuTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMenuTrl() <em>aDMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMenuTrl() aDMenuTrl}' feature.
	 * @generated
	 */
	public void setADMenuTrl(ADMenuTrlType newADMenuTrl) {
		aDMenuTrl = newADMenuTrl;
		setFeature(Feature.ADMENUTRL);
	}

	/**
	 * Returns the value of '<em><b>aDMessage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessage</b></em>' feature
	 * @generated
	 */
	public ADMessageType getADMessage() {
		return aDMessage;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMessage() <em>aDMessage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMessage() aDMessage}' feature.
	 * @generated
	 */
	public void setADMessage(ADMessageType newADMessage) {
		aDMessage = newADMessage;
		setFeature(Feature.ADMESSAGE);
	}

	/**
	 * Returns the value of '<em><b>aDMessageTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessageTrl</b></em>' feature
	 * @generated
	 */
	public ADMessageTrlType getADMessageTrl() {
		return aDMessageTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMessageTrl() <em>aDMessageTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMessageTrl() aDMessageTrl}' feature.
	 * @generated
	 */
	public void setADMessageTrl(ADMessageTrlType newADMessageTrl) {
		aDMessageTrl = newADMessageTrl;
		setFeature(Feature.ADMESSAGETRL);
	}

	/**
	 * Returns the value of '<em><b>aDModelImplementation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementation</b></em>' feature
	 * @generated
	 */
	public ADModelImplementationType getADModelImplementation() {
		return aDModelImplementation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModelImplementation() <em>aDModelImplementation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModelImplementation() aDModelImplementation}' feature.
	 * @generated
	 */
	public void setADModelImplementation(
			ADModelImplementationType newADModelImplementation) {
		aDModelImplementation = newADModelImplementation;
		setFeature(Feature.ADMODELIMPLEMENTATION);
	}

	/**
	 * Returns the value of '<em><b>aDModelImplementationMapping</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementationMapping</b></em>' feature
	 * @generated
	 */
	public ADModelImplementationMappingType getADModelImplementationMapping() {
		return aDModelImplementationMapping;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModelImplementationMapping() <em>aDModelImplementationMapping</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModelImplementationMapping() aDModelImplementationMapping}' feature.
	 * @generated
	 */
	public void setADModelImplementationMapping(
			ADModelImplementationMappingType newADModelImplementationMapping) {
		aDModelImplementationMapping = newADModelImplementationMapping;
		setFeature(Feature.ADMODELIMPLEMENTATIONMAPPING);
	}

	/**
	 * Returns the value of '<em><b>aDModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModule</b></em>' feature
	 * @generated
	 */
	public ADModuleType getADModule() {
		return aDModule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModule() <em>aDModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModule() aDModule}' feature.
	 * @generated
	 */
	public void setADModule(ADModuleType newADModule) {
		aDModule = newADModule;
		setFeature(Feature.ADMODULE);
	}

	/**
	 * Returns the value of '<em><b>aDModuleDBPrefixInstall</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleDBPrefixInstall</b></em>' feature
	 * @generated
	 */
	public ADModuleDBPrefixInstallType getADModuleDBPrefixInstall() {
		return aDModuleDBPrefixInstall;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModuleDBPrefixInstall() <em>aDModuleDBPrefixInstall</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModuleDBPrefixInstall() aDModuleDBPrefixInstall}' feature.
	 * @generated
	 */
	public void setADModuleDBPrefixInstall(
			ADModuleDBPrefixInstallType newADModuleDBPrefixInstall) {
		aDModuleDBPrefixInstall = newADModuleDBPrefixInstall;
		setFeature(Feature.ADMODULEDBPREFIXINSTALL);
	}

	/**
	 * Returns the value of '<em><b>aDModuleDependencyInst</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleDependencyInst</b></em>' feature
	 * @generated
	 */
	public ADModuleDependencyInstType getADModuleDependencyInst() {
		return aDModuleDependencyInst;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModuleDependencyInst() <em>aDModuleDependencyInst</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModuleDependencyInst() aDModuleDependencyInst}' feature.
	 * @generated
	 */
	public void setADModuleDependencyInst(
			ADModuleDependencyInstType newADModuleDependencyInst) {
		aDModuleDependencyInst = newADModuleDependencyInst;
		setFeature(Feature.ADMODULEDEPENDENCYINST);
	}

	/**
	 * Returns the value of '<em><b>aDModuleInstall</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleInstall</b></em>' feature
	 * @generated
	 */
	public ADModuleInstallType getADModuleInstall() {
		return aDModuleInstall;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModuleInstall() <em>aDModuleInstall</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModuleInstall() aDModuleInstall}' feature.
	 * @generated
	 */
	public void setADModuleInstall(ADModuleInstallType newADModuleInstall) {
		aDModuleInstall = newADModuleInstall;
		setFeature(Feature.ADMODULEINSTALL);
	}

	/**
	 * Returns the value of '<em><b>aDModuleMerge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleMerge</b></em>' feature
	 * @generated
	 */
	public ADModuleMergeType getADModuleMerge() {
		return aDModuleMerge;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModuleMerge() <em>aDModuleMerge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModuleMerge() aDModuleMerge}' feature.
	 * @generated
	 */
	public void setADModuleMerge(ADModuleMergeType newADModuleMerge) {
		aDModuleMerge = newADModuleMerge;
		setFeature(Feature.ADMODULEMERGE);
	}

	/**
	 * Returns the value of '<em><b>aDMonth</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMonth</b></em>' feature
	 * @generated
	 */
	public ADMonthType getADMonth() {
		return aDMonth;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMonth() <em>aDMonth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMonth() aDMonth}' feature.
	 * @generated
	 */
	public void setADMonth(ADMonthType newADMonth) {
		aDMonth = newADMonth;
		setFeature(Feature.ADMONTH);
	}

	/**
	 * Returns the value of '<em><b>aDMonthTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMonthTrl</b></em>' feature
	 * @generated
	 */
	public ADMonthTrlType getADMonthTrl() {
		return aDMonthTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMonthTrl() <em>aDMonthTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMonthTrl() aDMonthTrl}' feature.
	 * @generated
	 */
	public void setADMonthTrl(ADMonthTrlType newADMonthTrl) {
		aDMonthTrl = newADMonthTrl;
		setFeature(Feature.ADMONTHTRL);
	}

	/**
	 * Returns the value of '<em><b>aDOrgModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDOrgModule</b></em>' feature
	 * @generated
	 */
	public ADOrgModuleType getADOrgModule() {
		return aDOrgModule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADOrgModule() <em>aDOrgModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADOrgModule() aDOrgModule}' feature.
	 * @generated
	 */
	public void setADOrgModule(ADOrgModuleType newADOrgModule) {
		aDOrgModule = newADOrgModule;
		setFeature(Feature.ADORGMODULE);
	}

	/**
	 * Returns the value of '<em><b>aDParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDParameter</b></em>' feature
	 * @generated
	 */
	public ADParameterType getADParameter() {
		return aDParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADParameter() <em>aDParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADParameter() aDParameter}' feature.
	 * @generated
	 */
	public void setADParameter(ADParameterType newADParameter) {
		aDParameter = newADParameter;
		setFeature(Feature.ADPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>aDPreference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDPreference</b></em>' feature
	 * @generated
	 */
	public ADPreferenceType getADPreference() {
		return aDPreference;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADPreference() <em>aDPreference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADPreference() aDPreference}' feature.
	 * @generated
	 */
	public void setADPreference(ADPreferenceType newADPreference) {
		aDPreference = newADPreference;
		setFeature(Feature.ADPREFERENCE);
	}

	/**
	 * Returns the value of '<em><b>aDProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcess</b></em>' feature
	 * @generated
	 */
	public ADProcessType getADProcess() {
		return aDProcess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcess() <em>aDProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcess() aDProcess}' feature.
	 * @generated
	 */
	public void setADProcess(ADProcessType newADProcess) {
		aDProcess = newADProcess;
		setFeature(Feature.ADPROCESS);
	}

	/**
	 * Returns the value of '<em><b>aDProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessAccess</b></em>' feature
	 * @generated
	 */
	public ADProcessAccessType getADProcessAccess() {
		return aDProcessAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessAccess() <em>aDProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessAccess() aDProcessAccess}' feature.
	 * @generated
	 */
	public void setADProcessAccess(ADProcessAccessType newADProcessAccess) {
		aDProcessAccess = newADProcessAccess;
		setFeature(Feature.ADPROCESSACCESS);
	}

	/**
	 * Returns the value of '<em><b>aDProcessInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessInstance</b></em>' feature
	 * @generated
	 */
	public ADProcessInstanceType getADProcessInstance() {
		return aDProcessInstance;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessInstance() <em>aDProcessInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessInstance() aDProcessInstance}' feature.
	 * @generated
	 */
	public void setADProcessInstance(ADProcessInstanceType newADProcessInstance) {
		aDProcessInstance = newADProcessInstance;
		setFeature(Feature.ADPROCESSINSTANCE);
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameter</b></em>' feature
	 * @generated
	 */
	public ADProcessParameterType getADProcessParameter() {
		return aDProcessParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessParameter() <em>aDProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessParameter() aDProcessParameter}' feature.
	 * @generated
	 */
	public void setADProcessParameter(
			ADProcessParameterType newADProcessParameter) {
		aDProcessParameter = newADProcessParameter;
		setFeature(Feature.ADPROCESSPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameterTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterTrl</b></em>' feature
	 * @generated
	 */
	public ADProcessParameterTrlType getADProcessParameterTrl() {
		return aDProcessParameterTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessParameterTrl() <em>aDProcessParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessParameterTrl() aDProcessParameterTrl}' feature.
	 * @generated
	 */
	public void setADProcessParameterTrl(
			ADProcessParameterTrlType newADProcessParameterTrl) {
		aDProcessParameterTrl = newADProcessParameterTrl;
		setFeature(Feature.ADPROCESSPARAMETERTRL);
	}

	/**
	 * Returns the value of '<em><b>aDProcessScheduling</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessScheduling</b></em>' feature
	 * @generated
	 */
	public ADProcessSchedulingType getADProcessScheduling() {
		return aDProcessScheduling;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessScheduling() <em>aDProcessScheduling</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessScheduling() aDProcessScheduling}' feature.
	 * @generated
	 */
	public void setADProcessScheduling(
			ADProcessSchedulingType newADProcessScheduling) {
		aDProcessScheduling = newADProcessScheduling;
		setFeature(Feature.ADPROCESSSCHEDULING);
	}

	/**
	 * Returns the value of '<em><b>aDProcessTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessTrl</b></em>' feature
	 * @generated
	 */
	public ADProcessTrlType getADProcessTrl() {
		return aDProcessTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessTrl() <em>aDProcessTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessTrl() aDProcessTrl}' feature.
	 * @generated
	 */
	public void setADProcessTrl(ADProcessTrlType newADProcessTrl) {
		aDProcessTrl = newADProcessTrl;
		setFeature(Feature.ADPROCESSTRL);
	}

	/**
	 * Returns the value of '<em><b>aDReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReference</b></em>' feature
	 * @generated
	 */
	public ADReferenceType getADReference() {
		return aDReference;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADReference() <em>aDReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADReference() aDReference}' feature.
	 * @generated
	 */
	public void setADReference(ADReferenceType newADReference) {
		aDReference = newADReference;
		setFeature(Feature.ADREFERENCE);
	}

	/**
	 * Returns the value of '<em><b>aDReferenceTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferenceTrl</b></em>' feature
	 * @generated
	 */
	public ADReferenceTrlType getADReferenceTrl() {
		return aDReferenceTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADReferenceTrl() <em>aDReferenceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADReferenceTrl() aDReferenceTrl}' feature.
	 * @generated
	 */
	public void setADReferenceTrl(ADReferenceTrlType newADReferenceTrl) {
		aDReferenceTrl = newADReferenceTrl;
		setFeature(Feature.ADREFERENCETRL);
	}

	/**
	 * Returns the value of '<em><b>aDReferencedTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferencedTable</b></em>' feature
	 * @generated
	 */
	public ADReferencedTableType getADReferencedTable() {
		return aDReferencedTable;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADReferencedTable() <em>aDReferencedTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADReferencedTable() aDReferencedTable}' feature.
	 * @generated
	 */
	public void setADReferencedTable(ADReferencedTableType newADReferencedTable) {
		aDReferencedTable = newADReferencedTable;
		setFeature(Feature.ADREFERENCEDTABLE);
	}

	/**
	 * Returns the value of '<em><b>aDRegistration</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRegistration</b></em>' feature
	 * @generated
	 */
	public ADRegistrationType getADRegistration() {
		return aDRegistration;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADRegistration() <em>aDRegistration</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADRegistration() aDRegistration}' feature.
	 * @generated
	 */
	public void setADRegistration(ADRegistrationType newADRegistration) {
		aDRegistration = newADRegistration;
		setFeature(Feature.ADREGISTRATION);
	}

	/**
	 * Returns the value of '<em><b>aDRole</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRole</b></em>' feature
	 * @generated
	 */
	public ADRoleType getADRole() {
		return aDRole;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADRole() <em>aDRole</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADRole() aDRole}' feature.
	 * @generated
	 */
	public void setADRole(ADRoleType newADRole) {
		aDRole = newADRole;
		setFeature(Feature.ADROLE);
	}

	/**
	 * Returns the value of '<em><b>aDRoleOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRoleOrganization</b></em>' feature
	 * @generated
	 */
	public ADRoleOrganizationType getADRoleOrganization() {
		return aDRoleOrganization;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADRoleOrganization() <em>aDRoleOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADRoleOrganization() aDRoleOrganization}' feature.
	 * @generated
	 */
	public void setADRoleOrganization(
			ADRoleOrganizationType newADRoleOrganization) {
		aDRoleOrganization = newADRoleOrganization;
		setFeature(Feature.ADROLEORGANIZATION);
	}

	/**
	 * Returns the value of '<em><b>aDSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelector</b></em>' feature
	 * @generated
	 */
	public ADSelectorType getADSelector() {
		return aDSelector;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSelector() <em>aDSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSelector() aDSelector}' feature.
	 * @generated
	 */
	public void setADSelector(ADSelectorType newADSelector) {
		aDSelector = newADSelector;
		setFeature(Feature.ADSELECTOR);
	}

	/**
	 * Returns the value of '<em><b>aDSelectorColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelectorColumn</b></em>' feature
	 * @generated
	 */
	public ADSelectorColumnType getADSelectorColumn() {
		return aDSelectorColumn;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSelectorColumn() <em>aDSelectorColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSelectorColumn() aDSelectorColumn}' feature.
	 * @generated
	 */
	public void setADSelectorColumn(ADSelectorColumnType newADSelectorColumn) {
		aDSelectorColumn = newADSelectorColumn;
		setFeature(Feature.ADSELECTORCOLUMN);
	}

	/**
	 * Returns the value of '<em><b>aDSequence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSequence</b></em>' feature
	 * @generated
	 */
	public ADSequenceType getADSequence() {
		return aDSequence;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSequence() <em>aDSequence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSequence() aDSequence}' feature.
	 * @generated
	 */
	public void setADSequence(ADSequenceType newADSequence) {
		aDSequence = newADSequence;
		setFeature(Feature.ADSEQUENCE);
	}

	/**
	 * Returns the value of '<em><b>aDSession</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSession</b></em>' feature
	 * @generated
	 */
	public ADSessionType getADSession() {
		return aDSession;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSession() <em>aDSession</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSession() aDSession}' feature.
	 * @generated
	 */
	public void setADSession(ADSessionType newADSession) {
		aDSession = newADSession;
		setFeature(Feature.ADSESSION);
	}

	/**
	 * Returns the value of '<em><b>aDSessionStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSessionStatus</b></em>' feature
	 * @generated
	 */
	public ADSessionStatusType getADSessionStatus() {
		return aDSessionStatus;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSessionStatus() <em>aDSessionStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSessionStatus() aDSessionStatus}' feature.
	 * @generated
	 */
	public void setADSessionStatus(ADSessionStatusType newADSessionStatus) {
		aDSessionStatus = newADSessionStatus;
		setFeature(Feature.ADSESSIONSTATUS);
	}

	/**
	 * Returns the value of '<em><b>aDSessionUsageAudit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSessionUsageAudit</b></em>' feature
	 * @generated
	 */
	public ADSessionUsageAuditType getADSessionUsageAudit() {
		return aDSessionUsageAudit;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSessionUsageAudit() <em>aDSessionUsageAudit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSessionUsageAudit() aDSessionUsageAudit}' feature.
	 * @generated
	 */
	public void setADSessionUsageAudit(
			ADSessionUsageAuditType newADSessionUsageAudit) {
		aDSessionUsageAudit = newADSessionUsageAudit;
		setFeature(Feature.ADSESSIONUSAGEAUDIT);
	}

	/**
	 * Returns the value of '<em><b>aDSystem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystem</b></em>' feature
	 * @generated
	 */
	public ADSystemType getADSystem() {
		return aDSystem;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSystem() <em>aDSystem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSystem() aDSystem}' feature.
	 * @generated
	 */
	public void setADSystem(ADSystemType newADSystem) {
		aDSystem = newADSystem;
		setFeature(Feature.ADSYSTEM);
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformation</b></em>' feature
	 * @generated
	 */
	public ADSystemInformationType getADSystemInformation() {
		return aDSystemInformation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSystemInformation() <em>aDSystemInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSystemInformation() aDSystemInformation}' feature.
	 * @generated
	 */
	public void setADSystemInformation(
			ADSystemInformationType newADSystemInformation) {
		aDSystemInformation = newADSystemInformation;
		setFeature(Feature.ADSYSTEMINFORMATION);
	}

	/**
	 * Returns the value of '<em><b>aDTab</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTab</b></em>' feature
	 * @generated
	 */
	public ADTabType getADTab() {
		return aDTab;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTab() <em>aDTab</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTab() aDTab}' feature.
	 * @generated
	 */
	public void setADTab(ADTabType newADTab) {
		aDTab = newADTab;
		setFeature(Feature.ADTAB);
	}

	/**
	 * Returns the value of '<em><b>aDTabTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTabTrl</b></em>' feature
	 * @generated
	 */
	public ADTabTrlType getADTabTrl() {
		return aDTabTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTabTrl() <em>aDTabTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTabTrl() aDTabTrl}' feature.
	 * @generated
	 */
	public void setADTabTrl(ADTabTrlType newADTabTrl) {
		aDTabTrl = newADTabTrl;
		setFeature(Feature.ADTABTRL);
	}

	/**
	 * Returns the value of '<em><b>aDTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTable</b></em>' feature
	 * @generated
	 */
	public ADTableType getADTable() {
		return aDTable;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTable() <em>aDTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTable() aDTable}' feature.
	 * @generated
	 */
	public void setADTable(ADTableType newADTable) {
		aDTable = newADTable;
		setFeature(Feature.ADTABLE);
	}

	/**
	 * Returns the value of '<em><b>aDTableAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTableAccess</b></em>' feature
	 * @generated
	 */
	public ADTableAccessType getADTableAccess() {
		return aDTableAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTableAccess() <em>aDTableAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTableAccess() aDTableAccess}' feature.
	 * @generated
	 */
	public void setADTableAccess(ADTableAccessType newADTableAccess) {
		aDTableAccess = newADTableAccess;
		setFeature(Feature.ADTABLEACCESS);
	}

	/**
	 * Returns the value of '<em><b>aDTablePostV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTablePostV</b></em>' feature
	 * @generated
	 */
	public ADTablePostVType getADTablePostV() {
		return aDTablePostV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTablePostV() <em>aDTablePostV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTablePostV() aDTablePostV}' feature.
	 * @generated
	 */
	public void setADTablePostV(ADTablePostVType newADTablePostV) {
		aDTablePostV = newADTablePostV;
		setFeature(Feature.ADTABLEPOSTV);
	}

	/**
	 * Returns the value of '<em><b>aDTextInterface</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTextInterface</b></em>' feature
	 * @generated
	 */
	public ADTextInterfaceType getADTextInterface() {
		return aDTextInterface;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTextInterface() <em>aDTextInterface</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTextInterface() aDTextInterface}' feature.
	 * @generated
	 */
	public void setADTextInterface(ADTextInterfaceType newADTextInterface) {
		aDTextInterface = newADTextInterface;
		setFeature(Feature.ADTEXTINTERFACE);
	}

	/**
	 * Returns the value of '<em><b>aDTextInterfaceTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTextInterfaceTrl</b></em>' feature
	 * @generated
	 */
	public ADTextInterfaceTrlType getADTextInterfaceTrl() {
		return aDTextInterfaceTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTextInterfaceTrl() <em>aDTextInterfaceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTextInterfaceTrl() aDTextInterfaceTrl}' feature.
	 * @generated
	 */
	public void setADTextInterfaceTrl(
			ADTextInterfaceTrlType newADTextInterfaceTrl) {
		aDTextInterfaceTrl = newADTextInterfaceTrl;
		setFeature(Feature.ADTEXTINTERFACETRL);
	}

	/**
	 * Returns the value of '<em><b>aDTree</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTree</b></em>' feature
	 * @generated
	 */
	public ADTreeType getADTree() {
		return aDTree;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTree() <em>aDTree</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTree() aDTree}' feature.
	 * @generated
	 */
	public void setADTree(ADTreeType newADTree) {
		aDTree = newADTree;
		setFeature(Feature.ADTREE);
	}

	/**
	 * Returns the value of '<em><b>aDTreeNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTreeNode</b></em>' feature
	 * @generated
	 */
	public ADTreeNodeType getADTreeNode() {
		return aDTreeNode;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTreeNode() <em>aDTreeNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTreeNode() aDTreeNode}' feature.
	 * @generated
	 */
	public void setADTreeNode(ADTreeNodeType newADTreeNode) {
		aDTreeNode = newADTreeNode;
		setFeature(Feature.ADTREENODE);
	}

	/**
	 * Returns the value of '<em><b>aDUser</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUser</b></em>' feature
	 * @generated
	 */
	public ADUserType getADUser() {
		return aDUser;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADUser() <em>aDUser</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADUser() aDUser}' feature.
	 * @generated
	 */
	public void setADUser(ADUserType newADUser) {
		aDUser = newADUser;
		setFeature(Feature.ADUSER);
	}

	/**
	 * Returns the value of '<em><b>aDUserRoles</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserRoles</b></em>' feature
	 * @generated
	 */
	public ADUserRolesType getADUserRoles() {
		return aDUserRoles;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADUserRoles() <em>aDUserRoles</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADUserRoles() aDUserRoles}' feature.
	 * @generated
	 */
	public void setADUserRoles(ADUserRolesType newADUserRoles) {
		aDUserRoles = newADUserRoles;
		setFeature(Feature.ADUSERROLES);
	}

	/**
	 * Returns the value of '<em><b>aDValidation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDValidation</b></em>' feature
	 * @generated
	 */
	public ADValidationType getADValidation() {
		return aDValidation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADValidation() <em>aDValidation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADValidation() aDValidation}' feature.
	 * @generated
	 */
	public void setADValidation(ADValidationType newADValidation) {
		aDValidation = newADValidation;
		setFeature(Feature.ADVALIDATION);
	}

	/**
	 * Returns the value of '<em><b>aDWindow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindow</b></em>' feature
	 * @generated
	 */
	public ADWindowType getADWindow() {
		return aDWindow;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADWindow() <em>aDWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADWindow() aDWindow}' feature.
	 * @generated
	 */
	public void setADWindow(ADWindowType newADWindow) {
		aDWindow = newADWindow;
		setFeature(Feature.ADWINDOW);
	}

	/**
	 * Returns the value of '<em><b>aDWindowAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowAccess</b></em>' feature
	 * @generated
	 */
	public ADWindowAccessType getADWindowAccess() {
		return aDWindowAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADWindowAccess() <em>aDWindowAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADWindowAccess() aDWindowAccess}' feature.
	 * @generated
	 */
	public void setADWindowAccess(ADWindowAccessType newADWindowAccess) {
		aDWindowAccess = newADWindowAccess;
		setFeature(Feature.ADWINDOWACCESS);
	}

	/**
	 * Returns the value of '<em><b>aDWindowTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowTrl</b></em>' feature
	 * @generated
	 */
	public ADWindowTrlType getADWindowTrl() {
		return aDWindowTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADWindowTrl() <em>aDWindowTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADWindowTrl() aDWindowTrl}' feature.
	 * @generated
	 */
	public void setADWindowTrl(ADWindowTrlType newADWindowTrl) {
		aDWindowTrl = newADWindowTrl;
		setFeature(Feature.ADWINDOWTRL);
	}

	/**
	 * Returns the value of '<em><b>aDAuditTrail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAuditTrail</b></em>' feature
	 * @generated
	 */
	public ADAuditTrailType getADAuditTrail() {
		return aDAuditTrail;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAuditTrail() <em>aDAuditTrail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAuditTrail() aDAuditTrail}' feature.
	 * @generated
	 */
	public void setADAuditTrail(ADAuditTrailType newADAuditTrail) {
		aDAuditTrail = newADAuditTrail;
		setFeature(Feature.ADAUDITTRAIL);
	}

	/**
	 * Returns the value of '<em><b>aDAuditTrailRaw</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAuditTrailRaw</b></em>' feature
	 * @generated
	 */
	public ADAuditTrailRawType getADAuditTrailRaw() {
		return aDAuditTrailRaw;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAuditTrailRaw() <em>aDAuditTrailRaw</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAuditTrailRaw() aDAuditTrailRaw}' feature.
	 * @generated
	 */
	public void setADAuditTrailRaw(ADAuditTrailRawType newADAuditTrailRaw) {
		aDAuditTrailRaw = newADAuditTrailRaw;
		setFeature(Feature.ADAUDITTRAILRAW);
	}

	/**
	 * Returns the value of '<em><b>aDCreateFactTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDCreateFactTemplate</b></em>' feature
	 * @generated
	 */
	public ADCreateFactTemplateType getADCreateFactTemplate() {
		return aDCreateFactTemplate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getADCreateFactTemplate() <em>aDCreateFactTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADCreateFactTemplate() aDCreateFactTemplate}' feature.
	 * @generated
	 */
	public void setADCreateFactTemplate(
			ADCreateFactTemplateType newADCreateFactTemplate) {
		aDCreateFactTemplate = newADCreateFactTemplate;
		setFeature(Feature.ADCREATEFACTTEMPLATE);
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctV</b></em>' feature
	 * @generated
	 */
	public APRMFinAccTransactionAcctVType getAPRMFinAccTransactionAcctV() {
		return aPRMFinAccTransactionAcctV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMFinAccTransactionAcctV() <em>aPRMFinAccTransactionAcctV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMFinAccTransactionAcctV() aPRMFinAccTransactionAcctV}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctV(
			APRMFinAccTransactionAcctVType newAPRMFinAccTransactionAcctV) {
		aPRMFinAccTransactionAcctV = newAPRMFinAccTransactionAcctV;
		setFeature(Feature.APRMFINACCTRANSACTIONACCTV);
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionV</b></em>' feature
	 * @generated
	 */
	public APRMFinaccTransactionVType getAPRMFinaccTransactionV() {
		return aPRMFinaccTransactionV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMFinaccTransactionV() <em>aPRMFinaccTransactionV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMFinaccTransactionV() aPRMFinaccTransactionV}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionV(
			APRMFinaccTransactionVType newAPRMFinaccTransactionV) {
		aPRMFinaccTransactionV = newAPRMFinaccTransactionV;
		setFeature(Feature.APRMFINACCTRANSACTIONV);
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctV</b></em>' feature
	 * @generated
	 */
	public APRMFinaccTrxFullAcctVType getAPRMFinaccTrxFullAcctV() {
		return aPRMFinaccTrxFullAcctV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMFinaccTrxFullAcctV() <em>aPRMFinaccTrxFullAcctV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMFinaccTrxFullAcctV() aPRMFinaccTrxFullAcctV}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctV(
			APRMFinaccTrxFullAcctVType newAPRMFinaccTrxFullAcctV) {
		aPRMFinaccTrxFullAcctV = newAPRMFinaccTrxFullAcctV;
		setFeature(Feature.APRMFINACCTRXFULLACCTV);
	}

	/**
	 * Returns the value of '<em><b>aPRMPendingPaymentInvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMPendingPaymentInvoice</b></em>' feature
	 * @generated
	 */
	public APRMPendingPaymentInvoiceType getAPRMPendingPaymentInvoice() {
		return aPRMPendingPaymentInvoice;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMPendingPaymentInvoice() <em>aPRMPendingPaymentInvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMPendingPaymentInvoice() aPRMPendingPaymentInvoice}' feature.
	 * @generated
	 */
	public void setAPRMPendingPaymentInvoice(
			APRMPendingPaymentInvoiceType newAPRMPendingPaymentInvoice) {
		aPRMPendingPaymentInvoice = newAPRMPendingPaymentInvoice;
		setFeature(Feature.APRMPENDINGPAYMENTINVOICE);
	}

	/**
	 * Returns the value of '<em><b>aPRMRecDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMRecDetailV</b></em>' feature
	 * @generated
	 */
	public APRMRecDetailVType getAPRMRecDetailV() {
		return aPRMRecDetailV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMRecDetailV() <em>aPRMRecDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMRecDetailV() aPRMRecDetailV}' feature.
	 * @generated
	 */
	public void setAPRMRecDetailV(APRMRecDetailVType newAPRMRecDetailV) {
		aPRMRecDetailV = newAPRMRecDetailV;
		setFeature(Feature.APRMRECDETAILV);
	}

	/**
	 * Returns the value of '<em><b>aPRMReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconciliation</b></em>' feature
	 * @generated
	 */
	public APRMReconciliationType getAPRMReconciliation() {
		return aPRMReconciliation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMReconciliation() <em>aPRMReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMReconciliation() aPRMReconciliation}' feature.
	 * @generated
	 */
	public void setAPRMReconciliation(
			APRMReconciliationType newAPRMReconciliation) {
		aPRMReconciliation = newAPRMReconciliation;
		setFeature(Feature.APRMRECONCILIATION);
	}

	/**
	 * Returns the value of '<em><b>acctSchemaTableDocType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>acctSchemaTableDocType</b></em>' feature
	 * @generated
	 */
	public AcctSchemaTableDocTypeType getAcctSchemaTableDocType() {
		return acctSchemaTableDocType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAcctSchemaTableDocType() <em>acctSchemaTableDocType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAcctSchemaTableDocType() acctSchemaTableDocType}' feature.
	 * @generated
	 */
	public void setAcctSchemaTableDocType(
			AcctSchemaTableDocTypeType newAcctSchemaTableDocType) {
		acctSchemaTableDocType = newAcctSchemaTableDocType;
		setFeature(Feature.ACCTSCHEMATABLEDOCTYPE);
	}

	/**
	 * Returns the value of '<em><b>activeProposalV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activeProposalV</b></em>' feature
	 * @generated
	 */
	public ActiveProposalVType getActiveProposalV() {
		return activeProposalV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getActiveProposalV() <em>activeProposalV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getActiveProposalV() activeProposalV}' feature.
	 * @generated
	 */
	public void setActiveProposalV(ActiveProposalVType newActiveProposalV) {
		activeProposalV = newActiveProposalV;
		setFeature(Feature.ACTIVEPROPOSALV);
	}

	/**
	 * Returns the value of '<em><b>approvedVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendor</b></em>' feature
	 * @generated
	 */
	public ApprovedVendorType getApprovedVendor() {
		return approvedVendor;
	}

	/**
	 * Sets the '{@link OpenbravoType#getApprovedVendor() <em>approvedVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getApprovedVendor() approvedVendor}' feature.
	 * @generated
	 */
	public void setApprovedVendor(ApprovedVendorType newApprovedVendor) {
		approvedVendor = newApprovedVendor;
		setFeature(Feature.APPROVEDVENDOR);
	}

	/**
	 * Returns the value of '<em><b>attribute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attribute</b></em>' feature
	 * @generated
	 */
	public AttributeType getAttribute() {
		return attribute;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttribute() <em>attribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttribute() attribute}' feature.
	 * @generated
	 */
	public void setAttribute(AttributeType newAttribute) {
		attribute = newAttribute;
		setFeature(Feature.ATTRIBUTE);
	}

	/**
	 * Returns the value of '<em><b>attributeInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeInstance</b></em>' feature
	 * @generated
	 */
	public AttributeInstanceType getAttributeInstance() {
		return attributeInstance;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeInstance() <em>attributeInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeInstance() attributeInstance}' feature.
	 * @generated
	 */
	public void setAttributeInstance(AttributeInstanceType newAttributeInstance) {
		attributeInstance = newAttributeInstance;
		setFeature(Feature.ATTRIBUTEINSTANCE);
	}

	/**
	 * Returns the value of '<em><b>attributeSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSet</b></em>' feature
	 * @generated
	 */
	public AttributeSetType getAttributeSet() {
		return attributeSet;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeSet() <em>attributeSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeSet() attributeSet}' feature.
	 * @generated
	 */
	public void setAttributeSet(AttributeSetType newAttributeSet) {
		attributeSet = newAttributeSet;
		setFeature(Feature.ATTRIBUTESET);
	}

	/**
	 * Returns the value of '<em><b>attributeSetInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSetInstance</b></em>' feature
	 * @generated
	 */
	public AttributeSetInstanceType getAttributeSetInstance() {
		return attributeSetInstance;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeSetInstance() <em>attributeSetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeSetInstance() attributeSetInstance}' feature.
	 * @generated
	 */
	public void setAttributeSetInstance(
			AttributeSetInstanceType newAttributeSetInstance) {
		attributeSetInstance = newAttributeSetInstance;
		setFeature(Feature.ATTRIBUTESETINSTANCE);
	}

	/**
	 * Returns the value of '<em><b>attributeUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeUse</b></em>' feature
	 * @generated
	 */
	public AttributeUseType getAttributeUse() {
		return attributeUse;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeUse() <em>attributeUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeUse() attributeUse}' feature.
	 * @generated
	 */
	public void setAttributeUse(AttributeUseType newAttributeUse) {
		attributeUse = newAttributeUse;
		setFeature(Feature.ATTRIBUTEUSE);
	}

	/**
	 * Returns the value of '<em><b>attributeValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeValue</b></em>' feature
	 * @generated
	 */
	public AttributeValueType getAttributeValue() {
		return attributeValue;
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeValue() <em>attributeValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeValue() attributeValue}' feature.
	 * @generated
	 */
	public void setAttributeValue(AttributeValueType newAttributeValue) {
		attributeValue = newAttributeValue;
		setFeature(Feature.ATTRIBUTEVALUE);
	}

	/**
	 * Returns the value of '<em><b>bank</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bank</b></em>' feature
	 * @generated
	 */
	public BankType getBank() {
		return bank;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBank() <em>bank</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBank() bank}' feature.
	 * @generated
	 */
	public void setBank(BankType newBank) {
		bank = newBank;
		setFeature(Feature.BANK);
	}

	/**
	 * Returns the value of '<em><b>bankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccount</b></em>' feature
	 * @generated
	 */
	public BankAccountType getBankAccount() {
		return bankAccount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(BankAccountType newBankAccount) {
		bankAccount = newBankAccount;
		setFeature(Feature.BANKACCOUNT);
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccounts</b></em>' feature
	 * @generated
	 */
	public BankAccountAccountsType getBankAccountAccounts() {
		return bankAccountAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBankAccountAccounts() <em>bankAccountAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBankAccountAccounts() bankAccountAccounts}' feature.
	 * @generated
	 */
	public void setBankAccountAccounts(
			BankAccountAccountsType newBankAccountAccounts) {
		bankAccountAccounts = newBankAccountAccounts;
		setFeature(Feature.BANKACCOUNTACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>businessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartner</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerType getBusinessPartner() {
		return businessPartner;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(BusinessPartnerType newBusinessPartner) {
		businessPartner = newBusinessPartner;
		setFeature(Feature.BUSINESSPARTNER);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerBankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerBankAccount</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerBankAccountType getBusinessPartnerBankAccount() {
		return businessPartnerBankAccount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerBankAccount() <em>businessPartnerBankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerBankAccount() businessPartnerBankAccount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccount(
			BusinessPartnerBankAccountType newBusinessPartnerBankAccount) {
		businessPartnerBankAccount = newBusinessPartnerBankAccount;
		setFeature(Feature.BUSINESSPARTNERBANKACCOUNT);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategory</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerCategoryType getBusinessPartnerCategory() {
		return businessPartnerCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerCategory() <em>businessPartnerCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerCategory() businessPartnerCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategory(
			BusinessPartnerCategoryType newBusinessPartnerCategory) {
		businessPartnerCategory = newBusinessPartnerCategory;
		setFeature(Feature.BUSINESSPARTNERCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccount</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerCategoryAccountType getBusinessPartnerCategoryAccount() {
		return businessPartnerCategoryAccount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerCategoryAccount() <em>businessPartnerCategoryAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerCategoryAccount() businessPartnerCategoryAccount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccount(
			BusinessPartnerCategoryAccountType newBusinessPartnerCategoryAccount) {
		businessPartnerCategoryAccount = newBusinessPartnerCategoryAccount;
		setFeature(Feature.BUSINESSPARTNERCATEGORYACCOUNT);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerDiscount</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerDiscountType getBusinessPartnerDiscount() {
		return businessPartnerDiscount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerDiscount() <em>businessPartnerDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerDiscount() businessPartnerDiscount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerDiscount(
			BusinessPartnerDiscountType newBusinessPartnerDiscount) {
		businessPartnerDiscount = newBusinessPartnerDiscount;
		setFeature(Feature.BUSINESSPARTNERDISCOUNT);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerLocation</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerLocationType getBusinessPartnerLocation() {
		return businessPartnerLocation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerLocation() <em>businessPartnerLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerLocation() businessPartnerLocation}' feature.
	 * @generated
	 */
	public void setBusinessPartnerLocation(
			BusinessPartnerLocationType newBusinessPartnerLocation) {
		businessPartnerLocation = newBusinessPartnerLocation;
		setFeature(Feature.BUSINESSPARTNERLOCATION);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerProductTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerProductTemplate</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerProductTemplateType getBusinessPartnerProductTemplate() {
		return businessPartnerProductTemplate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerProductTemplate() <em>businessPartnerProductTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerProductTemplate() businessPartnerProductTemplate}' feature.
	 * @generated
	 */
	public void setBusinessPartnerProductTemplate(
			BusinessPartnerProductTemplateType newBusinessPartnerProductTemplate) {
		businessPartnerProductTemplate = newBusinessPartnerProductTemplate;
		setFeature(Feature.BUSINESSPARTNERPRODUCTTEMPLATE);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerTaxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerTaxCategory</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerTaxCategoryType getBusinessPartnerTaxCategory() {
		return businessPartnerTaxCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerTaxCategory() <em>businessPartnerTaxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerTaxCategory() businessPartnerTaxCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerTaxCategory(
			BusinessPartnerTaxCategoryType newBusinessPartnerTaxCategory) {
		businessPartnerTaxCategory = newBusinessPartnerTaxCategory;
		setFeature(Feature.BUSINESSPARTNERTAXCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>businessPartnerWithholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerWithholding</b></em>' feature
	 * @generated
	 */
	public BusinessPartnerWithholdingType getBusinessPartnerWithholding() {
		return businessPartnerWithholding;
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartnerWithholding() <em>businessPartnerWithholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartnerWithholding() businessPartnerWithholding}' feature.
	 * @generated
	 */
	public void setBusinessPartnerWithholding(
			BusinessPartnerWithholdingType newBusinessPartnerWithholding) {
		businessPartnerWithholding = newBusinessPartnerWithholding;
		setFeature(Feature.BUSINESSPARTNERWITHHOLDING);
	}

	/**
	 * Returns the value of '<em><b>cAcctSchemaProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cAcctSchemaProcess</b></em>' feature
	 * @generated
	 */
	public CAcctSchemaProcessType getCAcctSchemaProcess() {
		return cAcctSchemaProcess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCAcctSchemaProcess() <em>cAcctSchemaProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCAcctSchemaProcess() cAcctSchemaProcess}' feature.
	 * @generated
	 */
	public void setCAcctSchemaProcess(
			CAcctSchemaProcessType newCAcctSchemaProcess) {
		cAcctSchemaProcess = newCAcctSchemaProcess;
		setFeature(Feature.CACCTSCHEMAPROCESS);
	}

	/**
	 * Returns the value of '<em><b>city</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>city</b></em>' feature
	 * @generated
	 */
	public CityType getCity() {
		return city;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(CityType newCity) {
		city = newCity;
		setFeature(Feature.CITY);
	}

	/**
	 * Returns the value of '<em><b>clientInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformation</b></em>' feature
	 * @generated
	 */
	public ClientInformationType getClientInformation() {
		return clientInformation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getClientInformation() <em>clientInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getClientInformation() clientInformation}' feature.
	 * @generated
	 */
	public void setClientInformation(ClientInformationType newClientInformation) {
		clientInformation = newClientInformation;
		setFeature(Feature.CLIENTINFORMATION);
	}

	/**
	 * Returns the value of '<em><b>conditionGoods</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>conditionGoods</b></em>' feature
	 * @generated
	 */
	public ConditionGoodsType getConditionGoods() {
		return conditionGoods;
	}

	/**
	 * Sets the '{@link OpenbravoType#getConditionGoods() <em>conditionGoods</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getConditionGoods() conditionGoods}' feature.
	 * @generated
	 */
	public void setConditionGoods(ConditionGoodsType newConditionGoods) {
		conditionGoods = newConditionGoods;
		setFeature(Feature.CONDITIONGOODS);
	}

	/**
	 * Returns the value of '<em><b>contactEmailInteraction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contactEmailInteraction</b></em>' feature
	 * @generated
	 */
	public ContactEmailInteractionType getContactEmailInteraction() {
		return contactEmailInteraction;
	}

	/**
	 * Sets the '{@link OpenbravoType#getContactEmailInteraction() <em>contactEmailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getContactEmailInteraction() contactEmailInteraction}' feature.
	 * @generated
	 */
	public void setContactEmailInteraction(
			ContactEmailInteractionType newContactEmailInteraction) {
		contactEmailInteraction = newContactEmailInteraction;
		setFeature(Feature.CONTACTEMAILINTERACTION);
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public CountryType getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(CountryType newCountry) {
		country = newCountry;
		setFeature(Feature.COUNTRY);
	}

	/**
	 * Returns the value of '<em><b>countryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>countryTrl</b></em>' feature
	 * @generated
	 */
	public CountryTrlType getCountryTrl() {
		return countryTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCountryTrl() <em>countryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCountryTrl() countryTrl}' feature.
	 * @generated
	 */
	public void setCountryTrl(CountryTrlType newCountryTrl) {
		countryTrl = newCountryTrl;
		setFeature(Feature.COUNTRYTRL);
	}

	/**
	 * Returns the value of '<em><b>currency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currency</b></em>' feature
	 * @generated
	 */
	public CurrencyType getCurrency() {
		return currency;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(CurrencyType newCurrency) {
		currency = newCurrency;
		setFeature(Feature.CURRENCY);
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRate</b></em>' feature
	 * @generated
	 */
	public CurrencyConversionRateType getCurrencyConversionRate() {
		return currencyConversionRate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCurrencyConversionRate() <em>currencyConversionRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCurrencyConversionRate() currencyConversionRate}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRate(
			CurrencyConversionRateType newCurrencyConversionRate) {
		currencyConversionRate = newCurrencyConversionRate;
		setFeature(Feature.CURRENCYCONVERSIONRATE);
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateDoc</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDoc</b></em>' feature
	 * @generated
	 */
	public CurrencyConversionRateDocType getCurrencyConversionRateDoc() {
		return currencyConversionRateDoc;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCurrencyConversionRateDoc() <em>currencyConversionRateDoc</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCurrencyConversionRateDoc() currencyConversionRateDoc}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDoc(
			CurrencyConversionRateDocType newCurrencyConversionRateDoc) {
		currencyConversionRateDoc = newCurrencyConversionRateDoc;
		setFeature(Feature.CURRENCYCONVERSIONRATEDOC);
	}

	/**
	 * Returns the value of '<em><b>currencyTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyTrl</b></em>' feature
	 * @generated
	 */
	public CurrencyTrlType getCurrencyTrl() {
		return currencyTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCurrencyTrl() <em>currencyTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCurrencyTrl() currencyTrl}' feature.
	 * @generated
	 */
	public void setCurrencyTrl(CurrencyTrlType newCurrencyTrl) {
		currencyTrl = newCurrencyTrl;
		setFeature(Feature.CURRENCYTRL);
	}

	/**
	 * Returns the value of '<em><b>customerAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccounts</b></em>' feature
	 * @generated
	 */
	public CustomerAccountsType getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCustomerAccounts() <em>customerAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCustomerAccounts() customerAccounts}' feature.
	 * @generated
	 */
	public void setCustomerAccounts(CustomerAccountsType newCustomerAccounts) {
		customerAccounts = newCustomerAccounts;
		setFeature(Feature.CUSTOMERACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>dataPackage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataPackage</b></em>' feature
	 * @generated
	 */
	public DataPackageType getDataPackage() {
		return dataPackage;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataPackage() <em>dataPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataPackage() dataPackage}' feature.
	 * @generated
	 */
	public void setDataPackage(DataPackageType newDataPackage) {
		dataPackage = newDataPackage;
		setFeature(Feature.DATAPACKAGE);
	}

	/**
	 * Returns the value of '<em><b>dataSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSet</b></em>' feature
	 * @generated
	 */
	public DataSetType getDataSet() {
		return dataSet;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataSet() <em>dataSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataSet() dataSet}' feature.
	 * @generated
	 */
	public void setDataSet(DataSetType newDataSet) {
		dataSet = newDataSet;
		setFeature(Feature.DATASET);
	}

	/**
	 * Returns the value of '<em><b>dataSetColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetColumn</b></em>' feature
	 * @generated
	 */
	public DataSetColumnType getDataSetColumn() {
		return dataSetColumn;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataSetColumn() <em>dataSetColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataSetColumn() dataSetColumn}' feature.
	 * @generated
	 */
	public void setDataSetColumn(DataSetColumnType newDataSetColumn) {
		dataSetColumn = newDataSetColumn;
		setFeature(Feature.DATASETCOLUMN);
	}

	/**
	 * Returns the value of '<em><b>dataSetTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetTable</b></em>' feature
	 * @generated
	 */
	public DataSetTableType getDataSetTable() {
		return dataSetTable;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataSetTable() <em>dataSetTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataSetTable() dataSetTable}' feature.
	 * @generated
	 */
	public void setDataSetTable(DataSetTableType newDataSetTable) {
		dataSetTable = newDataSetTable;
		setFeature(Feature.DATASETTABLE);
	}

	/**
	 * Returns the value of '<em><b>documentTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTemplate</b></em>' feature
	 * @generated
	 */
	public DocumentTemplateType getDocumentTemplate() {
		return documentTemplate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDocumentTemplate() <em>documentTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDocumentTemplate() documentTemplate}' feature.
	 * @generated
	 */
	public void setDocumentTemplate(DocumentTemplateType newDocumentTemplate) {
		documentTemplate = newDocumentTemplate;
		setFeature(Feature.DOCUMENTTEMPLATE);
	}

	/**
	 * Returns the value of '<em><b>documentType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentType</b></em>' feature
	 * @generated
	 */
	public DocumentTypeType getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(DocumentTypeType newDocumentType) {
		documentType = newDocumentType;
		setFeature(Feature.DOCUMENTTYPE);
	}

	/**
	 * Returns the value of '<em><b>documentTypeTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTypeTrl</b></em>' feature
	 * @generated
	 */
	public DocumentTypeTrlType getDocumentTypeTrl() {
		return documentTypeTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getDocumentTypeTrl() <em>documentTypeTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDocumentTypeTrl() documentTypeTrl}' feature.
	 * @generated
	 */
	public void setDocumentTypeTrl(DocumentTypeTrlType newDocumentTypeTrl) {
		documentTypeTrl = newDocumentTypeTrl;
		setFeature(Feature.DOCUMENTTYPETRL);
	}

	/**
	 * Returns the value of '<em><b>emailInteraction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailInteraction</b></em>' feature
	 * @generated
	 */
	public EmailInteractionType getEmailInteraction() {
		return emailInteraction;
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmailInteraction() <em>emailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmailInteraction() emailInteraction}' feature.
	 * @generated
	 */
	public void setEmailInteraction(EmailInteractionType newEmailInteraction) {
		emailInteraction = newEmailInteraction;
		setFeature(Feature.EMAILINTERACTION);
	}

	/**
	 * Returns the value of '<em><b>emailServerConfiguration</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailServerConfiguration</b></em>' feature
	 * @generated
	 */
	public EmailServerConfigurationType getEmailServerConfiguration() {
		return emailServerConfiguration;
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmailServerConfiguration() <em>emailServerConfiguration</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmailServerConfiguration() emailServerConfiguration}' feature.
	 * @generated
	 */
	public void setEmailServerConfiguration(
			EmailServerConfigurationType newEmailServerConfiguration) {
		emailServerConfiguration = newEmailServerConfiguration;
		setFeature(Feature.EMAILSERVERCONFIGURATION);
	}

	/**
	 * Returns the value of '<em><b>emailTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailTemplate</b></em>' feature
	 * @generated
	 */
	public EmailTemplateType getEmailTemplate() {
		return emailTemplate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmailTemplate() <em>emailTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmailTemplate() emailTemplate}' feature.
	 * @generated
	 */
	public void setEmailTemplate(EmailTemplateType newEmailTemplate) {
		emailTemplate = newEmailTemplate;
		setFeature(Feature.EMAILTEMPLATE);
	}

	/**
	 * Returns the value of '<em><b>employeeAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccounts</b></em>' feature
	 * @generated
	 */
	public EmployeeAccountsType getEmployeeAccounts() {
		return employeeAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmployeeAccounts() <em>employeeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmployeeAccounts() employeeAccounts}' feature.
	 * @generated
	 */
	public void setEmployeeAccounts(EmployeeAccountsType newEmployeeAccounts) {
		employeeAccounts = newEmployeeAccounts;
		setFeature(Feature.EMPLOYEEACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>employeeSalaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeSalaryCategory</b></em>' feature
	 * @generated
	 */
	public EmployeeSalaryCategoryType getEmployeeSalaryCategory() {
		return employeeSalaryCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmployeeSalaryCategory() <em>employeeSalaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmployeeSalaryCategory() employeeSalaryCategory}' feature.
	 * @generated
	 */
	public void setEmployeeSalaryCategory(
			EmployeeSalaryCategoryType newEmployeeSalaryCategory) {
		employeeSalaryCategory = newEmployeeSalaryCategory;
		setFeature(Feature.EMPLOYEESALARYCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>expenseType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseType</b></em>' feature
	 * @generated
	 */
	public ExpenseTypeType getExpenseType() {
		return expenseType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getExpenseType() <em>expenseType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getExpenseType() expenseType}' feature.
	 * @generated
	 */
	public void setExpenseType(ExpenseTypeType newExpenseType) {
		expenseType = newExpenseType;
		setFeature(Feature.EXPENSETYPE);
	}

	/**
	 * Returns the value of '<em><b>externalPOS</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOS</b></em>' feature
	 * @generated
	 */
	public ExternalPOSType getExternalPOS() {
		return externalPOS;
	}

	/**
	 * Sets the '{@link OpenbravoType#getExternalPOS() <em>externalPOS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getExternalPOS() externalPOS}' feature.
	 * @generated
	 */
	public void setExternalPOS(ExternalPOSType newExternalPOS) {
		externalPOS = newExternalPOS;
		setFeature(Feature.EXTERNALPOS);
	}

	/**
	 * Returns the value of '<em><b>externalPOSCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSCategory</b></em>' feature
	 * @generated
	 */
	public ExternalPOSCategoryType getExternalPOSCategory() {
		return externalPOSCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getExternalPOSCategory() <em>externalPOSCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getExternalPOSCategory() externalPOSCategory}' feature.
	 * @generated
	 */
	public void setExternalPOSCategory(
			ExternalPOSCategoryType newExternalPOSCategory) {
		externalPOSCategory = newExternalPOSCategory;
		setFeature(Feature.EXTERNALPOSCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>externalPOSProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSProduct</b></em>' feature
	 * @generated
	 */
	public ExternalPOSProductType getExternalPOSProduct() {
		return externalPOSProduct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getExternalPOSProduct() <em>externalPOSProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getExternalPOSProduct() externalPOSProduct}' feature.
	 * @generated
	 */
	public void setExternalPOSProduct(
			ExternalPOSProductType newExternalPOSProduct) {
		externalPOSProduct = newExternalPOSProduct;
		setFeature(Feature.EXTERNALPOSPRODUCT);
	}

	/**
	 * Returns the value of '<em><b>fINBankStatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatement</b></em>' feature
	 * @generated
	 */
	public FINBankStatementType getFINBankStatement() {
		return fINBankStatement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINBankStatement() <em>fINBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINBankStatement() fINBankStatement}' feature.
	 * @generated
	 */
	public void setFINBankStatement(FINBankStatementType newFINBankStatement) {
		fINBankStatement = newFINBankStatement;
		setFeature(Feature.FINBANKSTATEMENT);
	}

	/**
	 * Returns the value of '<em><b>fINBankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatementLine</b></em>' feature
	 * @generated
	 */
	public FINBankStatementLineType getFINBankStatementLine() {
		return fINBankStatementLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINBankStatementLine() <em>fINBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINBankStatementLine() fINBankStatementLine}' feature.
	 * @generated
	 */
	public void setFINBankStatementLine(
			FINBankStatementLineType newFINBankStatementLine) {
		fINBankStatementLine = newFINBankStatementLine;
		setFeature(Feature.FINBANKSTATEMENTLINE);
	}

	/**
	 * Returns the value of '<em><b>fINFinaccTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransaction</b></em>' feature
	 * @generated
	 */
	public FINFinaccTransactionType getFINFinaccTransaction() {
		return fINFinaccTransaction;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINFinaccTransaction() <em>fINFinaccTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINFinaccTransaction() fINFinaccTransaction}' feature.
	 * @generated
	 */
	public void setFINFinaccTransaction(
			FINFinaccTransactionType newFINFinaccTransaction) {
		fINFinaccTransaction = newFINFinaccTransaction;
		setFeature(Feature.FINFINACCTRANSACTION);
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccount</b></em>' feature
	 * @generated
	 */
	public FINFinancialAccountType getFINFinancialAccount() {
		return fINFinancialAccount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINFinancialAccount() <em>fINFinancialAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINFinancialAccount() fINFinancialAccount}' feature.
	 * @generated
	 */
	public void setFINFinancialAccount(
			FINFinancialAccountType newFINFinancialAccount) {
		fINFinancialAccount = newFINFinancialAccount;
		setFeature(Feature.FINFINANCIALACCOUNT);
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcct</b></em>' feature
	 * @generated
	 */
	public FINFinancialAccountAcctType getFINFinancialAccountAcct() {
		return fINFinancialAccountAcct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINFinancialAccountAcct() <em>fINFinancialAccountAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINFinancialAccountAcct() fINFinancialAccountAcct}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcct(
			FINFinancialAccountAcctType newFINFinancialAccountAcct) {
		fINFinancialAccountAcct = newFINFinancialAccountAcct;
		setFeature(Feature.FINFINANCIALACCOUNTACCT);
	}

	/**
	 * Returns the value of '<em><b>fINPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPayment</b></em>' feature
	 * @generated
	 */
	public FINPaymentType getFINPayment() {
		return fINPayment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPayment() <em>fINPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPayment() fINPayment}' feature.
	 * @generated
	 */
	public void setFINPayment(FINPaymentType newFINPayment) {
		fINPayment = newFINPayment;
		setFeature(Feature.FINPAYMENT);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentMethod</b></em>' feature
	 * @generated
	 */
	public FINPaymentMethodType getFINPaymentMethod() {
		return fINPaymentMethod;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentMethod() <em>fINPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentMethod() fINPaymentMethod}' feature.
	 * @generated
	 */
	public void setFINPaymentMethod(FINPaymentMethodType newFINPaymentMethod) {
		fINPaymentMethod = newFINPaymentMethod;
		setFeature(Feature.FINPAYMENTMETHOD);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentCredit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentCredit</b></em>' feature
	 * @generated
	 */
	public FINPaymentCreditType getFINPaymentCredit() {
		return fINPaymentCredit;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentCredit() <em>fINPaymentCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentCredit() fINPaymentCredit}' feature.
	 * @generated
	 */
	public void setFINPaymentCredit(FINPaymentCreditType newFINPaymentCredit) {
		fINPaymentCredit = newFINPaymentCredit;
		setFeature(Feature.FINPAYMENTCREDIT);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetail</b></em>' feature
	 * @generated
	 */
	public FINPaymentDetailType getFINPaymentDetail() {
		return fINPaymentDetail;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentDetail() <em>fINPaymentDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentDetail() fINPaymentDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentDetail(FINPaymentDetailType newFINPaymentDetail) {
		fINPaymentDetail = newFINPaymentDetail;
		setFeature(Feature.FINPAYMENTDETAIL);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailV</b></em>' feature
	 * @generated
	 */
	public FINPaymentDetailVType getFINPaymentDetailV() {
		return fINPaymentDetailV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentDetailV() <em>fINPaymentDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentDetailV() fINPaymentDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailV(FINPaymentDetailVType newFINPaymentDetailV) {
		fINPaymentDetailV = newFINPaymentDetailV;
		setFeature(Feature.FINPAYMENTDETAILV);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPriority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPriority</b></em>' feature
	 * @generated
	 */
	public FINPaymentPriorityType getFINPaymentPriority() {
		return fINPaymentPriority;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentPriority() <em>fINPaymentPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentPriority() fINPaymentPriority}' feature.
	 * @generated
	 */
	public void setFINPaymentPriority(
			FINPaymentPriorityType newFINPaymentPriority) {
		fINPaymentPriority = newFINPaymentPriority;
		setFeature(Feature.FINPAYMENTPRIORITY);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetail</b></em>' feature
	 * @generated
	 */
	public FINPaymentPropDetailType getFINPaymentPropDetail() {
		return fINPaymentPropDetail;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentPropDetail() <em>fINPaymentPropDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentPropDetail() fINPaymentPropDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetail(
			FINPaymentPropDetailType newFINPaymentPropDetail) {
		fINPaymentPropDetail = newFINPaymentPropDetail;
		setFeature(Feature.FINPAYMENTPROPDETAIL);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetailV</b></em>' feature
	 * @generated
	 */
	public FINPaymentPropDetailVType getFINPaymentPropDetailV() {
		return fINPaymentPropDetailV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentPropDetailV() <em>fINPaymentPropDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentPropDetailV() fINPaymentPropDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetailV(
			FINPaymentPropDetailVType newFINPaymentPropDetailV) {
		fINPaymentPropDetailV = newFINPaymentPropDetailV;
		setFeature(Feature.FINPAYMENTPROPDETAILV);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentProposal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentProposal</b></em>' feature
	 * @generated
	 */
	public FINPaymentProposalType getFINPaymentProposal() {
		return fINPaymentProposal;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentProposal() <em>fINPaymentProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentProposal() fINPaymentProposal}' feature.
	 * @generated
	 */
	public void setFINPaymentProposal(
			FINPaymentProposalType newFINPaymentProposal) {
		fINPaymentProposal = newFINPaymentProposal;
		setFeature(Feature.FINPAYMENTPROPOSAL);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedInvV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedInvV</b></em>' feature
	 * @generated
	 */
	public FINPaymentSchedInvVType getFINPaymentSchedInvV() {
		return fINPaymentSchedInvV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentSchedInvV() <em>fINPaymentSchedInvV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentSchedInvV() fINPaymentSchedInvV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvV(
			FINPaymentSchedInvVType newFINPaymentSchedInvV) {
		fINPaymentSchedInvV = newFINPaymentSchedInvV;
		setFeature(Feature.FINPAYMENTSCHEDINVV);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedOrdV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedOrdV</b></em>' feature
	 * @generated
	 */
	public FINPaymentSchedOrdVType getFINPaymentSchedOrdV() {
		return fINPaymentSchedOrdV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentSchedOrdV() <em>fINPaymentSchedOrdV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentSchedOrdV() fINPaymentSchedOrdV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdV(
			FINPaymentSchedOrdVType newFINPaymentSchedOrdV) {
		fINPaymentSchedOrdV = newFINPaymentSchedOrdV;
		setFeature(Feature.FINPAYMENTSCHEDORDV);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedule</b></em>' feature
	 * @generated
	 */
	public FINPaymentScheduleType getFINPaymentSchedule() {
		return fINPaymentSchedule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentSchedule() <em>fINPaymentSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentSchedule() fINPaymentSchedule}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedule(
			FINPaymentScheduleType newFINPaymentSchedule) {
		fINPaymentSchedule = newFINPaymentSchedule;
		setFeature(Feature.FINPAYMENTSCHEDULE);
	}

	/**
	 * Returns the value of '<em><b>fINPaymentScheduleDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentScheduleDetail</b></em>' feature
	 * @generated
	 */
	public FINPaymentScheduleDetailType getFINPaymentScheduleDetail() {
		return fINPaymentScheduleDetail;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentScheduleDetail() <em>fINPaymentScheduleDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentScheduleDetail() fINPaymentScheduleDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleDetail(
			FINPaymentScheduleDetailType newFINPaymentScheduleDetail) {
		fINPaymentScheduleDetail = newFINPaymentScheduleDetail;
		setFeature(Feature.FINPAYMENTSCHEDULEDETAIL);
	}

	/**
	 * Returns the value of '<em><b>fINReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliation</b></em>' feature
	 * @generated
	 */
	public FINReconciliationType getFINReconciliation() {
		return fINReconciliation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINReconciliation() <em>fINReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINReconciliation() fINReconciliation}' feature.
	 * @generated
	 */
	public void setFINReconciliation(FINReconciliationType newFINReconciliation) {
		fINReconciliation = newFINReconciliation;
		setFeature(Feature.FINRECONCILIATION);
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineTemp</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineTemp</b></em>' feature
	 * @generated
	 */
	public FINReconciliationLineTempType getFINReconciliationLineTemp() {
		return fINReconciliationLineTemp;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINReconciliationLineTemp() <em>fINReconciliationLineTemp</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINReconciliationLineTemp() fINReconciliationLineTemp}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineTemp(
			FINReconciliationLineTempType newFINReconciliationLineTemp) {
		fINReconciliationLineTemp = newFINReconciliationLineTemp;
		setFeature(Feature.FINRECONCILIATIONLINETEMP);
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineV</b></em>' feature
	 * @generated
	 */
	public FINReconciliationLineVType getFINReconciliationLineV() {
		return fINReconciliationLineV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINReconciliationLineV() <em>fINReconciliationLineV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINReconciliationLineV() fINReconciliationLineV}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineV(
			FINReconciliationLineVType newFINReconciliationLineV) {
		fINReconciliationLineV = newFINReconciliationLineV;
		setFeature(Feature.FINRECONCILIATIONLINEV);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombination</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombination</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAccountingCombinationType getFinancialMgmtAccountingCombination() {
		return financialMgmtAccountingCombination;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAccountingCombination() <em>financialMgmtAccountingCombination</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAccountingCombination() financialMgmtAccountingCombination}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombination(
			FinancialMgmtAccountingCombinationType newFinancialMgmtAccountingCombination) {
		financialMgmtAccountingCombination = newFinancialMgmtAccountingCombination;
		setFeature(Feature.FINANCIALMGMTACCOUNTINGCOMBINATION);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFact</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFact</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAccountingFactType getFinancialMgmtAccountingFact() {
		return financialMgmtAccountingFact;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAccountingFact() <em>financialMgmtAccountingFact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAccountingFact() financialMgmtAccountingFact}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFact(
			FinancialMgmtAccountingFactType newFinancialMgmtAccountingFact) {
		financialMgmtAccountingFact = newFinancialMgmtAccountingFact;
		setFeature(Feature.FINANCIALMGMTACCOUNTINGFACT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingReport</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingReport</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAccountingReportType getFinancialMgmtAccountingReport() {
		return financialMgmtAccountingReport;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAccountingReport() <em>financialMgmtAccountingReport</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAccountingReport() financialMgmtAccountingReport}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingReport(
			FinancialMgmtAccountingReportType newFinancialMgmtAccountingReport) {
		financialMgmtAccountingReport = newFinancialMgmtAccountingReport;
		setFeature(Feature.FINANCIALMGMTACCOUNTINGREPORT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingRptElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingRptElement</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAccountingRptElementType getFinancialMgmtAccountingRptElement() {
		return financialMgmtAccountingRptElement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAccountingRptElement() <em>financialMgmtAccountingRptElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAccountingRptElement() financialMgmtAccountingRptElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingRptElement(
			FinancialMgmtAccountingRptElementType newFinancialMgmtAccountingRptElement) {
		financialMgmtAccountingRptElement = newFinancialMgmtAccountingRptElement;
		setFeature(Feature.FINANCIALMGMTACCOUNTINGRPTELEMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctCFS</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctCFS</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctCFSType getFinancialMgmtAcctCFS() {
		return financialMgmtAcctCFS;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctCFS() <em>financialMgmtAcctCFS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctCFS() financialMgmtAcctCFS}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctCFS(
			FinancialMgmtAcctCFSType newFinancialMgmtAcctCFS) {
		financialMgmtAcctCFS = newFinancialMgmtAcctCFS;
		setFeature(Feature.FINANCIALMGMTACCTCFS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptGroup</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctRptGroupType getFinancialMgmtAcctRptGroup() {
		return financialMgmtAcctRptGroup;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctRptGroup() <em>financialMgmtAcctRptGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctRptGroup() financialMgmtAcctRptGroup}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptGroup(
			FinancialMgmtAcctRptGroupType newFinancialMgmtAcctRptGroup) {
		financialMgmtAcctRptGroup = newFinancialMgmtAcctRptGroup;
		setFeature(Feature.FINANCIALMGMTACCTRPTGROUP);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptNode</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctRptNodeType getFinancialMgmtAcctRptNode() {
		return financialMgmtAcctRptNode;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctRptNode() <em>financialMgmtAcctRptNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctRptNode() financialMgmtAcctRptNode}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptNode(
			FinancialMgmtAcctRptNodeType newFinancialMgmtAcctRptNode) {
		financialMgmtAcctRptNode = newFinancialMgmtAcctRptNode;
		setFeature(Feature.FINANCIALMGMTACCTRPTNODE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchema</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaType getFinancialMgmtAcctSchema() {
		return financialMgmtAcctSchema;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctSchema() <em>financialMgmtAcctSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctSchema() financialMgmtAcctSchema}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchema(
			FinancialMgmtAcctSchemaType newFinancialMgmtAcctSchema) {
		financialMgmtAcctSchema = newFinancialMgmtAcctSchema;
		setFeature(Feature.FINANCIALMGMTACCTSCHEMA);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefault</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefault</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaDefaultType getFinancialMgmtAcctSchemaDefault() {
		return financialMgmtAcctSchemaDefault;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctSchemaDefault() <em>financialMgmtAcctSchemaDefault</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctSchemaDefault() financialMgmtAcctSchemaDefault}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefault(
			FinancialMgmtAcctSchemaDefaultType newFinancialMgmtAcctSchemaDefault) {
		financialMgmtAcctSchemaDefault = newFinancialMgmtAcctSchemaDefault;
		setFeature(Feature.FINANCIALMGMTACCTSCHEMADEFAULT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaElement</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaElementType getFinancialMgmtAcctSchemaElement() {
		return financialMgmtAcctSchemaElement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctSchemaElement() <em>financialMgmtAcctSchemaElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctSchemaElement() financialMgmtAcctSchemaElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElement(
			FinancialMgmtAcctSchemaElementType newFinancialMgmtAcctSchemaElement) {
		financialMgmtAcctSchemaElement = newFinancialMgmtAcctSchemaElement;
		setFeature(Feature.FINANCIALMGMTACCTSCHEMAELEMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGL</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaGLType getFinancialMgmtAcctSchemaGL() {
		return financialMgmtAcctSchemaGL;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctSchemaGL() <em>financialMgmtAcctSchemaGL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctSchemaGL() financialMgmtAcctSchemaGL}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGL(
			FinancialMgmtAcctSchemaGLType newFinancialMgmtAcctSchemaGL) {
		financialMgmtAcctSchemaGL = newFinancialMgmtAcctSchemaGL;
		setFeature(Feature.FINANCIALMGMTACCTSCHEMAGL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaTable</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAcctSchemaTableType getFinancialMgmtAcctSchemaTable() {
		return financialMgmtAcctSchemaTable;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAcctSchemaTable() <em>financialMgmtAcctSchemaTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAcctSchemaTable() financialMgmtAcctSchemaTable}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaTable(
			FinancialMgmtAcctSchemaTableType newFinancialMgmtAcctSchemaTable) {
		financialMgmtAcctSchemaTable = newFinancialMgmtAcctSchemaTable;
		setFeature(Feature.FINANCIALMGMTACCTSCHEMATABLE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortization</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAmortizationType getFinancialMgmtAmortization() {
		return financialMgmtAmortization;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAmortization() <em>financialMgmtAmortization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAmortization() financialMgmtAmortization}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortization(
			FinancialMgmtAmortizationType newFinancialMgmtAmortization) {
		financialMgmtAmortization = newFinancialMgmtAmortization;
		setFeature(Feature.FINANCIALMGMTAMORTIZATION);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortizationLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortizationLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAmortizationLineType getFinancialMgmtAmortizationLine() {
		return financialMgmtAmortizationLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAmortizationLine() <em>financialMgmtAmortizationLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAmortizationLine() financialMgmtAmortizationLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortizationLine(
			FinancialMgmtAmortizationLineType newFinancialMgmtAmortizationLine) {
		financialMgmtAmortizationLine = newFinancialMgmtAmortizationLine;
		setFeature(Feature.FINANCIALMGMTAMORTIZATIONLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAsset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAsset</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAssetType getFinancialMgmtAsset() {
		return financialMgmtAsset;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAsset() <em>financialMgmtAsset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAsset() financialMgmtAsset}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAsset(
			FinancialMgmtAssetType newFinancialMgmtAsset) {
		financialMgmtAsset = newFinancialMgmtAsset;
		setFeature(Feature.FINANCIALMGMTASSET);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccounts</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAssetAccountsType getFinancialMgmtAssetAccounts() {
		return financialMgmtAssetAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAssetAccounts() <em>financialMgmtAssetAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAssetAccounts() financialMgmtAssetAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccounts(
			FinancialMgmtAssetAccountsType newFinancialMgmtAssetAccounts) {
		financialMgmtAssetAccounts = newFinancialMgmtAssetAccounts;
		setFeature(Feature.FINANCIALMGMTASSETACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroup</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAssetGroupType getFinancialMgmtAssetGroup() {
		return financialMgmtAssetGroup;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAssetGroup() <em>financialMgmtAssetGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAssetGroup() financialMgmtAssetGroup}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroup(
			FinancialMgmtAssetGroupType newFinancialMgmtAssetGroup) {
		financialMgmtAssetGroup = newFinancialMgmtAssetGroup;
		setFeature(Feature.FINANCIALMGMTASSETGROUP);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcct</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtAssetGroupAcctType getFinancialMgmtAssetGroupAcct() {
		return financialMgmtAssetGroupAcct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtAssetGroupAcct() <em>financialMgmtAssetGroupAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtAssetGroupAcct() financialMgmtAssetGroupAcct}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcct(
			FinancialMgmtAssetGroupAcctType newFinancialMgmtAssetGroupAcct) {
		financialMgmtAssetGroupAcct = newFinancialMgmtAssetGroupAcct;
		setFeature(Feature.FINANCIALMGMTASSETGROUPACCT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankFileFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankFileFormat</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtBankFileFormatType getFinancialMgmtBankFileFormat() {
		return financialMgmtBankFileFormat;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtBankFileFormat() <em>financialMgmtBankFileFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtBankFileFormat() financialMgmtBankFileFormat}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankFileFormat(
			FinancialMgmtBankFileFormatType newFinancialMgmtBankFileFormat) {
		financialMgmtBankFileFormat = newFinancialMgmtBankFileFormat;
		setFeature(Feature.FINANCIALMGMTBANKFILEFORMAT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatement</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtBankStatementType getFinancialMgmtBankStatement() {
		return financialMgmtBankStatement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtBankStatement() <em>financialMgmtBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtBankStatement() financialMgmtBankStatement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatement(
			FinancialMgmtBankStatementType newFinancialMgmtBankStatement) {
		financialMgmtBankStatement = newFinancialMgmtBankStatement;
		setFeature(Feature.FINANCIALMGMTBANKSTATEMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatementLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtBankStatementLineType getFinancialMgmtBankStatementLine() {
		return financialMgmtBankStatementLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtBankStatementLine() <em>financialMgmtBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtBankStatementLine() financialMgmtBankStatementLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatementLine(
			FinancialMgmtBankStatementLineType newFinancialMgmtBankStatementLine) {
		financialMgmtBankStatementLine = newFinancialMgmtBankStatementLine;
		setFeature(Feature.FINANCIALMGMTBANKSTATEMENTLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBudget</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudget</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtBudgetType getFinancialMgmtBudget() {
		return financialMgmtBudget;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtBudget() <em>financialMgmtBudget</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtBudget() financialMgmtBudget}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudget(
			FinancialMgmtBudgetType newFinancialMgmtBudget) {
		financialMgmtBudget = newFinancialMgmtBudget;
		setFeature(Feature.FINANCIALMGMTBUDGET);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBudgetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudgetLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtBudgetLineType getFinancialMgmtBudgetLine() {
		return financialMgmtBudgetLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtBudgetLine() <em>financialMgmtBudgetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtBudgetLine() financialMgmtBudgetLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLine(
			FinancialMgmtBudgetLineType newFinancialMgmtBudgetLine) {
		financialMgmtBudgetLine = newFinancialMgmtBudgetLine;
		setFeature(Feature.FINANCIALMGMTBUDGETLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCalendar</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCalendar</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtCalendarType getFinancialMgmtCalendar() {
		return financialMgmtCalendar;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtCalendar() <em>financialMgmtCalendar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtCalendar() financialMgmtCalendar}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCalendar(
			FinancialMgmtCalendarType newFinancialMgmtCalendar) {
		financialMgmtCalendar = newFinancialMgmtCalendar;
		setFeature(Feature.FINANCIALMGMTCALENDAR);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBook</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBook</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtCashBookType getFinancialMgmtCashBook() {
		return financialMgmtCashBook;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtCashBook() <em>financialMgmtCashBook</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtCashBook() financialMgmtCashBook}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBook(
			FinancialMgmtCashBookType newFinancialMgmtCashBook) {
		financialMgmtCashBook = newFinancialMgmtCashBook;
		setFeature(Feature.FINANCIALMGMTCASHBOOK);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccounts</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtCashBookAccountsType getFinancialMgmtCashBookAccounts() {
		return financialMgmtCashBookAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtCashBookAccounts() <em>financialMgmtCashBookAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtCashBookAccounts() financialMgmtCashBookAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccounts(
			FinancialMgmtCashBookAccountsType newFinancialMgmtCashBookAccounts) {
		financialMgmtCashBookAccounts = newFinancialMgmtCashBookAccounts;
		setFeature(Feature.FINANCIALMGMTCASHBOOKACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashJournal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashJournal</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtCashJournalType getFinancialMgmtCashJournal() {
		return financialMgmtCashJournal;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtCashJournal() <em>financialMgmtCashJournal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtCashJournal() financialMgmtCashJournal}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashJournal(
			FinancialMgmtCashJournalType newFinancialMgmtCashJournal) {
		financialMgmtCashJournal = newFinancialMgmtCashJournal;
		setFeature(Feature.FINANCIALMGMTCASHJOURNAL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagement</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDPManagementType getFinancialMgmtDPManagement() {
		return financialMgmtDPManagement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDPManagement() <em>financialMgmtDPManagement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDPManagement() financialMgmtDPManagement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagement(
			FinancialMgmtDPManagementType newFinancialMgmtDPManagement) {
		financialMgmtDPManagement = newFinancialMgmtDPManagement;
		setFeature(Feature.FINANCIALMGMTDPMANAGEMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagementLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDPManagementLineType getFinancialMgmtDPManagementLine() {
		return financialMgmtDPManagementLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDPManagementLine() <em>financialMgmtDPManagementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDPManagementLine() financialMgmtDPManagementLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagementLine(
			FinancialMgmtDPManagementLineType newFinancialMgmtDPManagementLine) {
		financialMgmtDPManagementLine = newFinancialMgmtDPManagementLine;
		setFeature(Feature.FINANCIALMGMTDPMANAGEMENTLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPayment</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentType getFinancialMgmtDebtPayment() {
		return financialMgmtDebtPayment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDebtPayment() <em>financialMgmtDebtPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDebtPayment() financialMgmtDebtPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPayment(
			FinancialMgmtDebtPaymentType newFinancialMgmtDebtPayment) {
		financialMgmtDebtPayment = newFinancialMgmtDebtPayment;
		setFeature(Feature.FINANCIALMGMTDEBTPAYMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalReplace</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalReplace</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentBalReplaceType getFinancialMgmtDebtPaymentBalReplace() {
		return financialMgmtDebtPaymentBalReplace;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDebtPaymentBalReplace() <em>financialMgmtDebtPaymentBalReplace</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDebtPaymentBalReplace() financialMgmtDebtPaymentBalReplace}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalReplace(
			FinancialMgmtDebtPaymentBalReplaceType newFinancialMgmtDebtPaymentBalReplace) {
		financialMgmtDebtPaymentBalReplace = newFinancialMgmtDebtPaymentBalReplace;
		setFeature(Feature.FINANCIALMGMTDEBTPAYMENTBALREPLACE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalancing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalancing</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentBalancingType getFinancialMgmtDebtPaymentBalancing() {
		return financialMgmtDebtPaymentBalancing;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDebtPaymentBalancing() <em>financialMgmtDebtPaymentBalancing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDebtPaymentBalancing() financialMgmtDebtPaymentBalancing}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalancing(
			FinancialMgmtDebtPaymentBalancingType newFinancialMgmtDebtPaymentBalancing) {
		financialMgmtDebtPaymentBalancing = newFinancialMgmtDebtPaymentBalancing;
		setFeature(Feature.FINANCIALMGMTDEBTPAYMENTBALANCING);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelV</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentCancelVType getFinancialMgmtDebtPaymentCancelV() {
		return financialMgmtDebtPaymentCancelV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDebtPaymentCancelV() <em>financialMgmtDebtPaymentCancelV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDebtPaymentCancelV() financialMgmtDebtPaymentCancelV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelV(
			FinancialMgmtDebtPaymentCancelVType newFinancialMgmtDebtPaymentCancelV) {
		financialMgmtDebtPaymentCancelV = newFinancialMgmtDebtPaymentCancelV;
		setFeature(Feature.FINANCIALMGMTDEBTPAYMENTCANCELV);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateV</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDebtPaymentGenerateVType getFinancialMgmtDebtPaymentGenerateV() {
		return financialMgmtDebtPaymentGenerateV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDebtPaymentGenerateV() <em>financialMgmtDebtPaymentGenerateV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDebtPaymentGenerateV() financialMgmtDebtPaymentGenerateV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateV(
			FinancialMgmtDebtPaymentGenerateVType newFinancialMgmtDebtPaymentGenerateV) {
		financialMgmtDebtPaymentGenerateV = newFinancialMgmtDebtPaymentGenerateV;
		setFeature(Feature.FINANCIALMGMTDEBTPAYMENTGENERATEV);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDimension</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtDimensionType getFinancialMgmtDimension() {
		return financialMgmtDimension;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtDimension() <em>financialMgmtDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtDimension() financialMgmtDimension}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDimension(
			FinancialMgmtDimensionType newFinancialMgmtDimension) {
		financialMgmtDimension = newFinancialMgmtDimension;
		setFeature(Feature.FINANCIALMGMTDIMENSION);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElement</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtElementType getFinancialMgmtElement() {
		return financialMgmtElement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtElement() <em>financialMgmtElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtElement() financialMgmtElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElement(
			FinancialMgmtElementType newFinancialMgmtElement) {
		financialMgmtElement = newFinancialMgmtElement;
		setFeature(Feature.FINANCIALMGMTELEMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValue</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtElementValueType getFinancialMgmtElementValue() {
		return financialMgmtElementValue;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtElementValue() <em>financialMgmtElementValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtElementValue() financialMgmtElementValue}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValue(
			FinancialMgmtElementValueType newFinancialMgmtElementValue) {
		financialMgmtElementValue = newFinancialMgmtElementValue;
		setFeature(Feature.FINANCIALMGMTELEMENTVALUE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueOperand</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueOperand</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtElementValueOperandType getFinancialMgmtElementValueOperand() {
		return financialMgmtElementValueOperand;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtElementValueOperand() <em>financialMgmtElementValueOperand</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtElementValueOperand() financialMgmtElementValueOperand}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueOperand(
			FinancialMgmtElementValueOperandType newFinancialMgmtElementValueOperand) {
		financialMgmtElementValueOperand = newFinancialMgmtElementValueOperand;
		setFeature(Feature.FINANCIALMGMTELEMENTVALUEOPERAND);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueTrl</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtElementValueTrlType getFinancialMgmtElementValueTrl() {
		return financialMgmtElementValueTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtElementValueTrl() <em>financialMgmtElementValueTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtElementValueTrl() financialMgmtElementValueTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueTrl(
			FinancialMgmtElementValueTrlType newFinancialMgmtElementValueTrl) {
		financialMgmtElementValueTrl = newFinancialMgmtElementValueTrl;
		setFeature(Feature.FINANCIALMGMTELEMENTVALUETRL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtFinAccPaymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtFinAccPaymentMethod</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtFinAccPaymentMethodType getFinancialMgmtFinAccPaymentMethod() {
		return financialMgmtFinAccPaymentMethod;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtFinAccPaymentMethod() <em>financialMgmtFinAccPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtFinAccPaymentMethod() financialMgmtFinAccPaymentMethod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtFinAccPaymentMethod(
			FinancialMgmtFinAccPaymentMethodType newFinancialMgmtFinAccPaymentMethod) {
		financialMgmtFinAccPaymentMethod = newFinancialMgmtFinAccPaymentMethod;
		setFeature(Feature.FINANCIALMGMTFINACCPAYMENTMETHOD);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLBatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLBatch</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLBatchType getFinancialMgmtGLBatch() {
		return financialMgmtGLBatch;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLBatch() <em>financialMgmtGLBatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLBatch() financialMgmtGLBatch}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLBatch(
			FinancialMgmtGLBatchType newFinancialMgmtGLBatch) {
		financialMgmtGLBatch = newFinancialMgmtGLBatch;
		setFeature(Feature.FINANCIALMGMTGLBATCH);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLCategory</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLCategoryType getFinancialMgmtGLCategory() {
		return financialMgmtGLCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLCategory() <em>financialMgmtGLCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLCategory() financialMgmtGLCategory}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLCategory(
			FinancialMgmtGLCategoryType newFinancialMgmtGLCategory) {
		financialMgmtGLCategory = newFinancialMgmtGLCategory;
		setFeature(Feature.FINANCIALMGMTGLCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLCharge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLCharge</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLChargeType getFinancialMgmtGLCharge() {
		return financialMgmtGLCharge;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLCharge() <em>financialMgmtGLCharge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLCharge() financialMgmtGLCharge}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLCharge(
			FinancialMgmtGLChargeType newFinancialMgmtGLCharge) {
		financialMgmtGLCharge = newFinancialMgmtGLCharge;
		setFeature(Feature.FINANCIALMGMTGLCHARGE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLChargeAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLChargeAccounts</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLChargeAccountsType getFinancialMgmtGLChargeAccounts() {
		return financialMgmtGLChargeAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLChargeAccounts() <em>financialMgmtGLChargeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLChargeAccounts() financialMgmtGLChargeAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLChargeAccounts(
			FinancialMgmtGLChargeAccountsType newFinancialMgmtGLChargeAccounts) {
		financialMgmtGLChargeAccounts = newFinancialMgmtGLChargeAccounts;
		setFeature(Feature.FINANCIALMGMTGLCHARGEACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItem</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLItemType getFinancialMgmtGLItem() {
		return financialMgmtGLItem;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLItem() <em>financialMgmtGLItem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLItem() financialMgmtGLItem}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItem(
			FinancialMgmtGLItemType newFinancialMgmtGLItem) {
		financialMgmtGLItem = newFinancialMgmtGLItem;
		setFeature(Feature.FINANCIALMGMTGLITEM);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemAccounts</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLItemAccountsType getFinancialMgmtGLItemAccounts() {
		return financialMgmtGLItemAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLItemAccounts() <em>financialMgmtGLItemAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLItemAccounts() financialMgmtGLItemAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemAccounts(
			FinancialMgmtGLItemAccountsType newFinancialMgmtGLItemAccounts) {
		financialMgmtGLItemAccounts = newFinancialMgmtGLItemAccounts;
		setFeature(Feature.FINANCIALMGMTGLITEMACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournal</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLJournalType getFinancialMgmtGLJournal() {
		return financialMgmtGLJournal;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLJournal() <em>financialMgmtGLJournal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLJournal() financialMgmtGLJournal}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournal(
			FinancialMgmtGLJournalType newFinancialMgmtGLJournal) {
		financialMgmtGLJournal = newFinancialMgmtGLJournal;
		setFeature(Feature.FINANCIALMGMTGLJOURNAL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtGLJournalLineType getFinancialMgmtGLJournalLine() {
		return financialMgmtGLJournalLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtGLJournalLine() <em>financialMgmtGLJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtGLJournalLine() financialMgmtGLJournalLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLine(
			FinancialMgmtGLJournalLineType newFinancialMgmtGLJournalLine) {
		financialMgmtGLJournalLine = newFinancialMgmtGLJournalLine;
		setFeature(Feature.FINANCIALMGMTGLJOURNALLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtIncoterms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtIncoterms</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtIncotermsType getFinancialMgmtIncoterms() {
		return financialMgmtIncoterms;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtIncoterms() <em>financialMgmtIncoterms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtIncoterms() financialMgmtIncoterms}' feature.
	 * @generated
	 */
	public void setFinancialMgmtIncoterms(
			FinancialMgmtIncotermsType newFinancialMgmtIncoterms) {
		financialMgmtIncoterms = newFinancialMgmtIncoterms;
		setFeature(Feature.FINANCIALMGMTINCOTERMS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtJournalLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtJournalLineType getFinancialMgmtJournalLine() {
		return financialMgmtJournalLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtJournalLine() <em>financialMgmtJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtJournalLine() financialMgmtJournalLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtJournalLine(
			FinancialMgmtJournalLineType newFinancialMgmtJournalLine) {
		financialMgmtJournalLine = newFinancialMgmtJournalLine;
		setFeature(Feature.FINANCIALMGMTJOURNALLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtMatchingAlgorithm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtMatchingAlgorithm</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtMatchingAlgorithmType getFinancialMgmtMatchingAlgorithm() {
		return financialMgmtMatchingAlgorithm;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtMatchingAlgorithm() <em>financialMgmtMatchingAlgorithm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtMatchingAlgorithm() financialMgmtMatchingAlgorithm}' feature.
	 * @generated
	 */
	public void setFinancialMgmtMatchingAlgorithm(
			FinancialMgmtMatchingAlgorithmType newFinancialMgmtMatchingAlgorithm) {
		financialMgmtMatchingAlgorithm = newFinancialMgmtMatchingAlgorithm;
		setFeature(Feature.FINANCIALMGMTMATCHINGALGORITHM);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtNonBusinessDay</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtNonBusinessDay</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtNonBusinessDayType getFinancialMgmtNonBusinessDay() {
		return financialMgmtNonBusinessDay;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtNonBusinessDay() <em>financialMgmtNonBusinessDay</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtNonBusinessDay() financialMgmtNonBusinessDay}' feature.
	 * @generated
	 */
	public void setFinancialMgmtNonBusinessDay(
			FinancialMgmtNonBusinessDayType newFinancialMgmtNonBusinessDay) {
		financialMgmtNonBusinessDay = newFinancialMgmtNonBusinessDay;
		setFeature(Feature.FINANCIALMGMTNONBUSINESSDAY);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionHistoryV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionHistoryV</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentExecutionHistoryVType getFinancialMgmtPaymentExecutionHistoryV() {
		return financialMgmtPaymentExecutionHistoryV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentExecutionHistoryV() <em>financialMgmtPaymentExecutionHistoryV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentExecutionHistoryV() financialMgmtPaymentExecutionHistoryV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionHistoryV(
			FinancialMgmtPaymentExecutionHistoryVType newFinancialMgmtPaymentExecutionHistoryV) {
		financialMgmtPaymentExecutionHistoryV = newFinancialMgmtPaymentExecutionHistoryV;
		setFeature(Feature.FINANCIALMGMTPAYMENTEXECUTIONHISTORYV);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionProcess</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentExecutionProcessType getFinancialMgmtPaymentExecutionProcess() {
		return financialMgmtPaymentExecutionProcess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentExecutionProcess() <em>financialMgmtPaymentExecutionProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentExecutionProcess() financialMgmtPaymentExecutionProcess}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionProcess(
			FinancialMgmtPaymentExecutionProcessType newFinancialMgmtPaymentExecutionProcess) {
		financialMgmtPaymentExecutionProcess = newFinancialMgmtPaymentExecutionProcess;
		setFeature(Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionProcessParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionProcessParameter</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentExecutionProcessParameterType getFinancialMgmtPaymentExecutionProcessParameter() {
		return financialMgmtPaymentExecutionProcessParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentExecutionProcessParameter() <em>financialMgmtPaymentExecutionProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentExecutionProcessParameter() financialMgmtPaymentExecutionProcessParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionProcessParameter(
			FinancialMgmtPaymentExecutionProcessParameterType newFinancialMgmtPaymentExecutionProcessParameter) {
		financialMgmtPaymentExecutionProcessParameter = newFinancialMgmtPaymentExecutionProcessParameter;
		setFeature(Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRun</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentRunType getFinancialMgmtPaymentRun() {
		return financialMgmtPaymentRun;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentRun() <em>financialMgmtPaymentRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentRun() financialMgmtPaymentRun}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRun(
			FinancialMgmtPaymentRunType newFinancialMgmtPaymentRun) {
		financialMgmtPaymentRun = newFinancialMgmtPaymentRun;
		setFeature(Feature.FINANCIALMGMTPAYMENTRUN);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunParameter</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentRunParameterType getFinancialMgmtPaymentRunParameter() {
		return financialMgmtPaymentRunParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentRunParameter() <em>financialMgmtPaymentRunParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentRunParameter() financialMgmtPaymentRunParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunParameter(
			FinancialMgmtPaymentRunParameterType newFinancialMgmtPaymentRunParameter) {
		financialMgmtPaymentRunParameter = newFinancialMgmtPaymentRunParameter;
		setFeature(Feature.FINANCIALMGMTPAYMENTRUNPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunPayment</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentRunPaymentType getFinancialMgmtPaymentRunPayment() {
		return financialMgmtPaymentRunPayment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentRunPayment() <em>financialMgmtPaymentRunPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentRunPayment() financialMgmtPaymentRunPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunPayment(
			FinancialMgmtPaymentRunPaymentType newFinancialMgmtPaymentRunPayment) {
		financialMgmtPaymentRunPayment = newFinancialMgmtPaymentRunPayment;
		setFeature(Feature.FINANCIALMGMTPAYMENTRUNPAYMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTerm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTerm</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentTermType getFinancialMgmtPaymentTerm() {
		return financialMgmtPaymentTerm;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentTerm() <em>financialMgmtPaymentTerm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentTerm() financialMgmtPaymentTerm}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTerm(
			FinancialMgmtPaymentTermType newFinancialMgmtPaymentTerm) {
		financialMgmtPaymentTerm = newFinancialMgmtPaymentTerm;
		setFeature(Feature.FINANCIALMGMTPAYMENTTERM);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentTermLineType getFinancialMgmtPaymentTermLine() {
		return financialMgmtPaymentTermLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentTermLine() <em>financialMgmtPaymentTermLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentTermLine() financialMgmtPaymentTermLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermLine(
			FinancialMgmtPaymentTermLineType newFinancialMgmtPaymentTermLine) {
		financialMgmtPaymentTermLine = newFinancialMgmtPaymentTermLine;
		setFeature(Feature.FINANCIALMGMTPAYMENTTERMLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermTrl</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPaymentTermTrlType getFinancialMgmtPaymentTermTrl() {
		return financialMgmtPaymentTermTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPaymentTermTrl() <em>financialMgmtPaymentTermTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPaymentTermTrl() financialMgmtPaymentTermTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermTrl(
			FinancialMgmtPaymentTermTrlType newFinancialMgmtPaymentTermTrl) {
		financialMgmtPaymentTermTrl = newFinancialMgmtPaymentTermTrl;
		setFeature(Feature.FINANCIALMGMTPAYMENTTERMTRL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriod</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPeriodType getFinancialMgmtPeriod() {
		return financialMgmtPeriod;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPeriod() <em>financialMgmtPeriod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPeriod() financialMgmtPeriod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriod(
			FinancialMgmtPeriodType newFinancialMgmtPeriod) {
		financialMgmtPeriod = newFinancialMgmtPeriod;
		setFeature(Feature.FINANCIALMGMTPERIOD);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControl</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPeriodControlType getFinancialMgmtPeriodControl() {
		return financialMgmtPeriodControl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPeriodControl() <em>financialMgmtPeriodControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPeriodControl() financialMgmtPeriodControl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControl(
			FinancialMgmtPeriodControlType newFinancialMgmtPeriodControl) {
		financialMgmtPeriodControl = newFinancialMgmtPeriodControl;
		setFeature(Feature.FINANCIALMGMTPERIODCONTROL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControlV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControlV</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPeriodControlVType getFinancialMgmtPeriodControlV() {
		return financialMgmtPeriodControlV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPeriodControlV() <em>financialMgmtPeriodControlV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPeriodControlV() financialMgmtPeriodControlV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControlV(
			FinancialMgmtPeriodControlVType newFinancialMgmtPeriodControlV) {
		financialMgmtPeriodControlV = newFinancialMgmtPeriodControlV;
		setFeature(Feature.FINANCIALMGMTPERIODCONTROLV);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPromissoryFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPromissoryFormat</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtPromissoryFormatType getFinancialMgmtPromissoryFormat() {
		return financialMgmtPromissoryFormat;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtPromissoryFormat() <em>financialMgmtPromissoryFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtPromissoryFormat() financialMgmtPromissoryFormat}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPromissoryFormat(
			FinancialMgmtPromissoryFormatType newFinancialMgmtPromissoryFormat) {
		financialMgmtPromissoryFormat = newFinancialMgmtPromissoryFormat;
		setFeature(Feature.FINANCIALMGMTPROMISSORYFORMAT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittance</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtRemittanceType getFinancialMgmtRemittance() {
		return financialMgmtRemittance;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtRemittance() <em>financialMgmtRemittance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtRemittance() financialMgmtRemittance}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittance(
			FinancialMgmtRemittanceType newFinancialMgmtRemittance) {
		financialMgmtRemittance = newFinancialMgmtRemittance;
		setFeature(Feature.FINANCIALMGMTREMITTANCE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceLine</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtRemittanceLineType getFinancialMgmtRemittanceLine() {
		return financialMgmtRemittanceLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtRemittanceLine() <em>financialMgmtRemittanceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtRemittanceLine() financialMgmtRemittanceLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceLine(
			FinancialMgmtRemittanceLineType newFinancialMgmtRemittanceLine) {
		financialMgmtRemittanceLine = newFinancialMgmtRemittanceLine;
		setFeature(Feature.FINANCIALMGMTREMITTANCELINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceParameter</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtRemittanceParameterType getFinancialMgmtRemittanceParameter() {
		return financialMgmtRemittanceParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtRemittanceParameter() <em>financialMgmtRemittanceParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtRemittanceParameter() financialMgmtRemittanceParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceParameter(
			FinancialMgmtRemittanceParameterType newFinancialMgmtRemittanceParameter) {
		financialMgmtRemittanceParameter = newFinancialMgmtRemittanceParameter;
		setFeature(Feature.FINANCIALMGMTREMITTANCEPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceType</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtRemittanceTypeType getFinancialMgmtRemittanceType() {
		return financialMgmtRemittanceType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtRemittanceType() <em>financialMgmtRemittanceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtRemittanceType() financialMgmtRemittanceType}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceType(
			FinancialMgmtRemittanceTypeType newFinancialMgmtRemittanceType) {
		financialMgmtRemittanceType = newFinancialMgmtRemittanceType;
		setFeature(Feature.FINANCIALMGMTREMITTANCETYPE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtSettlement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtSettlement</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtSettlementType getFinancialMgmtSettlement() {
		return financialMgmtSettlement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtSettlement() <em>financialMgmtSettlement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtSettlement() financialMgmtSettlement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtSettlement(
			FinancialMgmtSettlementType newFinancialMgmtSettlement) {
		financialMgmtSettlement = newFinancialMgmtSettlement;
		setFeature(Feature.FINANCIALMGMTSETTLEMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxCategory</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxCategoryType getFinancialMgmtTaxCategory() {
		return financialMgmtTaxCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxCategory() <em>financialMgmtTaxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxCategory() financialMgmtTaxCategory}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxCategory(
			FinancialMgmtTaxCategoryType newFinancialMgmtTaxCategory) {
		financialMgmtTaxCategory = newFinancialMgmtTaxCategory;
		setFeature(Feature.FINANCIALMGMTTAXCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxCategoryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxCategoryTrl</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxCategoryTrlType getFinancialMgmtTaxCategoryTrl() {
		return financialMgmtTaxCategoryTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxCategoryTrl() <em>financialMgmtTaxCategoryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxCategoryTrl() financialMgmtTaxCategoryTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxCategoryTrl(
			FinancialMgmtTaxCategoryTrlType newFinancialMgmtTaxCategoryTrl) {
		financialMgmtTaxCategoryTrl = newFinancialMgmtTaxCategoryTrl;
		setFeature(Feature.FINANCIALMGMTTAXCATEGORYTRL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxPayment</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxPaymentType getFinancialMgmtTaxPayment() {
		return financialMgmtTaxPayment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxPayment() <em>financialMgmtTaxPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxPayment() financialMgmtTaxPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPayment(
			FinancialMgmtTaxPaymentType newFinancialMgmtTaxPayment) {
		financialMgmtTaxPayment = newFinancialMgmtTaxPayment;
		setFeature(Feature.FINANCIALMGMTTAXPAYMENT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRate</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRateType getFinancialMgmtTaxRate() {
		return financialMgmtTaxRate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxRate() <em>financialMgmtTaxRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxRate() financialMgmtTaxRate}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRate(
			FinancialMgmtTaxRateType newFinancialMgmtTaxRate) {
		financialMgmtTaxRate = newFinancialMgmtTaxRate;
		setFeature(Feature.FINANCIALMGMTTAXRATE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccounts</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRateAccountsType getFinancialMgmtTaxRateAccounts() {
		return financialMgmtTaxRateAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxRateAccounts() <em>financialMgmtTaxRateAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxRateAccounts() financialMgmtTaxRateAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccounts(
			FinancialMgmtTaxRateAccountsType newFinancialMgmtTaxRateAccounts) {
		financialMgmtTaxRateAccounts = newFinancialMgmtTaxRateAccounts;
		setFeature(Feature.FINANCIALMGMTTAXRATEACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegister</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegister</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRegisterType getFinancialMgmtTaxRegister() {
		return financialMgmtTaxRegister;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxRegister() <em>financialMgmtTaxRegister</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxRegister() financialMgmtTaxRegister}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegister(
			FinancialMgmtTaxRegisterType newFinancialMgmtTaxRegister) {
		financialMgmtTaxRegister = newFinancialMgmtTaxRegister;
		setFeature(Feature.FINANCIALMGMTTAXREGISTER);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterType</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRegisterTypeType getFinancialMgmtTaxRegisterType() {
		return financialMgmtTaxRegisterType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxRegisterType() <em>financialMgmtTaxRegisterType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxRegisterType() financialMgmtTaxRegisterType}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterType(
			FinancialMgmtTaxRegisterTypeType newFinancialMgmtTaxRegisterType) {
		financialMgmtTaxRegisterType = newFinancialMgmtTaxRegisterType;
		setFeature(Feature.FINANCIALMGMTTAXREGISTERTYPE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterTypeLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterTypeLines</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRegisterTypeLinesType getFinancialMgmtTaxRegisterTypeLines() {
		return financialMgmtTaxRegisterTypeLines;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxRegisterTypeLines() <em>financialMgmtTaxRegisterTypeLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxRegisterTypeLines() financialMgmtTaxRegisterTypeLines}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterTypeLines(
			FinancialMgmtTaxRegisterTypeLinesType newFinancialMgmtTaxRegisterTypeLines) {
		financialMgmtTaxRegisterTypeLines = newFinancialMgmtTaxRegisterTypeLines;
		setFeature(Feature.FINANCIALMGMTTAXREGISTERTYPELINES);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterline</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterline</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxRegisterlineType getFinancialMgmtTaxRegisterline() {
		return financialMgmtTaxRegisterline;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxRegisterline() <em>financialMgmtTaxRegisterline</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxRegisterline() financialMgmtTaxRegisterline}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterline(
			FinancialMgmtTaxRegisterlineType newFinancialMgmtTaxRegisterline) {
		financialMgmtTaxRegisterline = newFinancialMgmtTaxRegisterline;
		setFeature(Feature.FINANCIALMGMTTAXREGISTERLINE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxReport</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxReport</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxReportType getFinancialMgmtTaxReport() {
		return financialMgmtTaxReport;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxReport() <em>financialMgmtTaxReport</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxReport() financialMgmtTaxReport}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxReport(
			FinancialMgmtTaxReportType newFinancialMgmtTaxReport) {
		financialMgmtTaxReport = newFinancialMgmtTaxReport;
		setFeature(Feature.FINANCIALMGMTTAXREPORT);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxTrl</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxTrlType getFinancialMgmtTaxTrl() {
		return financialMgmtTaxTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxTrl() <em>financialMgmtTaxTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxTrl() financialMgmtTaxTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxTrl(
			FinancialMgmtTaxTrlType newFinancialMgmtTaxTrl) {
		financialMgmtTaxTrl = newFinancialMgmtTaxTrl;
		setFeature(Feature.FINANCIALMGMTTAXTRL);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxZone</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxZone</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtTaxZoneType getFinancialMgmtTaxZone() {
		return financialMgmtTaxZone;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtTaxZone() <em>financialMgmtTaxZone</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtTaxZone() financialMgmtTaxZone}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZone(
			FinancialMgmtTaxZoneType newFinancialMgmtTaxZone) {
		financialMgmtTaxZone = newFinancialMgmtTaxZone;
		setFeature(Feature.FINANCIALMGMTTAXZONE);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholding</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtWithholdingType getFinancialMgmtWithholding() {
		return financialMgmtWithholding;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtWithholding() <em>financialMgmtWithholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtWithholding() financialMgmtWithholding}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholding(
			FinancialMgmtWithholdingType newFinancialMgmtWithholding) {
		financialMgmtWithholding = newFinancialMgmtWithholding;
		setFeature(Feature.FINANCIALMGMTWITHHOLDING);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingAccounts</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtWithholdingAccountsType getFinancialMgmtWithholdingAccounts() {
		return financialMgmtWithholdingAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtWithholdingAccounts() <em>financialMgmtWithholdingAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtWithholdingAccounts() financialMgmtWithholdingAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingAccounts(
			FinancialMgmtWithholdingAccountsType newFinancialMgmtWithholdingAccounts) {
		financialMgmtWithholdingAccounts = newFinancialMgmtWithholdingAccounts;
		setFeature(Feature.FINANCIALMGMTWITHHOLDINGACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>financialMgmtYear</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtYear</b></em>' feature
	 * @generated
	 */
	public FinancialMgmtYearType getFinancialMgmtYear() {
		return financialMgmtYear;
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtYear() <em>financialMgmtYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtYear() financialMgmtYear}' feature.
	 * @generated
	 */
	public void setFinancialMgmtYear(FinancialMgmtYearType newFinancialMgmtYear) {
		financialMgmtYear = newFinancialMgmtYear;
		setFeature(Feature.FINANCIALMGMTYEAR);
	}

	/**
	 * Returns the value of '<em><b>greeting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greeting</b></em>' feature
	 * @generated
	 */
	public GreetingType getGreeting() {
		return greeting;
	}

	/**
	 * Sets the '{@link OpenbravoType#getGreeting() <em>greeting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getGreeting() greeting}' feature.
	 * @generated
	 */
	public void setGreeting(GreetingType newGreeting) {
		greeting = newGreeting;
		setFeature(Feature.GREETING);
	}

	/**
	 * Returns the value of '<em><b>greetingTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greetingTrl</b></em>' feature
	 * @generated
	 */
	public GreetingTrlType getGreetingTrl() {
		return greetingTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getGreetingTrl() <em>greetingTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getGreetingTrl() greetingTrl}' feature.
	 * @generated
	 */
	public void setGreetingTrl(GreetingTrlType newGreetingTrl) {
		greetingTrl = newGreetingTrl;
		setFeature(Feature.GREETINGTRL);
	}

	/**
	 * Returns the value of '<em><b>invoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoice</b></em>' feature
	 * @generated
	 */
	public InvoiceType getInvoice() {
		return invoice;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(InvoiceType newInvoice) {
		invoice = newInvoice;
		setFeature(Feature.INVOICE);
	}

	/**
	 * Returns the value of '<em><b>invoiceDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceDiscount</b></em>' feature
	 * @generated
	 */
	public InvoiceDiscountType getInvoiceDiscount() {
		return invoiceDiscount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceDiscount() <em>invoiceDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceDiscount() invoiceDiscount}' feature.
	 * @generated
	 */
	public void setInvoiceDiscount(InvoiceDiscountType newInvoiceDiscount) {
		invoiceDiscount = newInvoiceDiscount;
		setFeature(Feature.INVOICEDISCOUNT);
	}

	/**
	 * Returns the value of '<em><b>invoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLine</b></em>' feature
	 * @generated
	 */
	public InvoiceLineType getInvoiceLine() {
		return invoiceLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLine() <em>invoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLine() invoiceLine}' feature.
	 * @generated
	 */
	public void setInvoiceLine(InvoiceLineType newInvoiceLine) {
		invoiceLine = newInvoiceLine;
		setFeature(Feature.INVOICELINE);
	}

	/**
	 * Returns the value of '<em><b>invoiceLineAccountingDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineAccountingDimension</b></em>' feature
	 * @generated
	 */
	public InvoiceLineAccountingDimensionType getInvoiceLineAccountingDimension() {
		return invoiceLineAccountingDimension;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLineAccountingDimension() <em>invoiceLineAccountingDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLineAccountingDimension() invoiceLineAccountingDimension}' feature.
	 * @generated
	 */
	public void setInvoiceLineAccountingDimension(
			InvoiceLineAccountingDimensionType newInvoiceLineAccountingDimension) {
		invoiceLineAccountingDimension = newInvoiceLineAccountingDimension;
		setFeature(Feature.INVOICELINEACCOUNTINGDIMENSION);
	}

	/**
	 * Returns the value of '<em><b>invoiceLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineOffer</b></em>' feature
	 * @generated
	 */
	public InvoiceLineOfferType getInvoiceLineOffer() {
		return invoiceLineOffer;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLineOffer() <em>invoiceLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLineOffer() invoiceLineOffer}' feature.
	 * @generated
	 */
	public void setInvoiceLineOffer(InvoiceLineOfferType newInvoiceLineOffer) {
		invoiceLineOffer = newInvoiceLineOffer;
		setFeature(Feature.INVOICELINEOFFER);
	}

	/**
	 * Returns the value of '<em><b>invoiceLineTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineTax</b></em>' feature
	 * @generated
	 */
	public InvoiceLineTaxType getInvoiceLineTax() {
		return invoiceLineTax;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLineTax() <em>invoiceLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLineTax() invoiceLineTax}' feature.
	 * @generated
	 */
	public void setInvoiceLineTax(InvoiceLineTaxType newInvoiceLineTax) {
		invoiceLineTax = newInvoiceLineTax;
		setFeature(Feature.INVOICELINETAX);
	}

	/**
	 * Returns the value of '<em><b>invoiceSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceSchedule</b></em>' feature
	 * @generated
	 */
	public InvoiceScheduleType getInvoiceSchedule() {
		return invoiceSchedule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceSchedule() <em>invoiceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceSchedule() invoiceSchedule}' feature.
	 * @generated
	 */
	public void setInvoiceSchedule(InvoiceScheduleType newInvoiceSchedule) {
		invoiceSchedule = newInvoiceSchedule;
		setFeature(Feature.INVOICESCHEDULE);
	}

	/**
	 * Returns the value of '<em><b>invoiceTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTax</b></em>' feature
	 * @generated
	 */
	public InvoiceTaxType getInvoiceTax() {
		return invoiceTax;
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceTax() <em>invoiceTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceTax() invoiceTax}' feature.
	 * @generated
	 */
	public void setInvoiceTax(InvoiceTaxType newInvoiceTax) {
		invoiceTax = newInvoiceTax;
		setFeature(Feature.INVOICETAX);
	}

	/**
	 * Returns the value of '<em><b>location</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>location</b></em>' feature
	 * @generated
	 */
	public LocationType getLocation() {
		return location;
	}

	/**
	 * Sets the '{@link OpenbravoType#getLocation() <em>location</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLocation() location}' feature.
	 * @generated
	 */
	public void setLocation(LocationType newLocation) {
		location = newLocation;
		setFeature(Feature.LOCATION);
	}

	/**
	 * Returns the value of '<em><b>locator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locator</b></em>' feature
	 * @generated
	 */
	public LocatorType getLocator() {
		return locator;
	}

	/**
	 * Sets the '{@link OpenbravoType#getLocator() <em>locator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLocator() locator}' feature.
	 * @generated
	 */
	public void setLocator(LocatorType newLocator) {
		locator = newLocator;
		setFeature(Feature.LOCATOR);
	}

	/**
	 * Returns the value of '<em><b>lot</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lot</b></em>' feature
	 * @generated
	 */
	public LotType getLot() {
		return lot;
	}

	/**
	 * Sets the '{@link OpenbravoType#getLot() <em>lot</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLot() lot}' feature.
	 * @generated
	 */
	public void setLot(LotType newLot) {
		lot = newLot;
		setFeature(Feature.LOT);
	}

	/**
	 * Returns the value of '<em><b>lotControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lotControl</b></em>' feature
	 * @generated
	 */
	public LotControlType getLotControl() {
		return lotControl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getLotControl() <em>lotControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLotControl() lotControl}' feature.
	 * @generated
	 */
	public void setLotControl(LotControlType newLotControl) {
		lotControl = newLotControl;
		setFeature(Feature.LOTCONTROL);
	}

	/**
	 * Returns the value of '<em><b>mRPPlanner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanner</b></em>' feature
	 * @generated
	 */
	public MRPPlannerType getMRPPlanner() {
		return mRPPlanner;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPlanner() <em>mRPPlanner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPlanner() mRPPlanner}' feature.
	 * @generated
	 */
	public void setMRPPlanner(MRPPlannerType newMRPPlanner) {
		mRPPlanner = newMRPPlanner;
		setFeature(Feature.MRPPLANNER);
	}

	/**
	 * Returns the value of '<em><b>mRPPlanningMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanningMethod</b></em>' feature
	 * @generated
	 */
	public MRPPlanningMethodType getMRPPlanningMethod() {
		return mRPPlanningMethod;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPlanningMethod() <em>mRPPlanningMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPlanningMethod() mRPPlanningMethod}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethod(MRPPlanningMethodType newMRPPlanningMethod) {
		mRPPlanningMethod = newMRPPlanningMethod;
		setFeature(Feature.MRPPLANNINGMETHOD);
	}

	/**
	 * Returns the value of '<em><b>mRPPlanningMethodLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanningMethodLine</b></em>' feature
	 * @generated
	 */
	public MRPPlanningMethodLineType getMRPPlanningMethodLine() {
		return mRPPlanningMethodLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPlanningMethodLine() <em>mRPPlanningMethodLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPlanningMethodLine() mRPPlanningMethodLine}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethodLine(
			MRPPlanningMethodLineType newMRPPlanningMethodLine) {
		mRPPlanningMethodLine = newMRPPlanningMethodLine;
		setFeature(Feature.MRPPLANNINGMETHODLINE);
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRun</b></em>' feature
	 * @generated
	 */
	public MRPProductionRunType getMRPProductionRun() {
		return mRPProductionRun;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPProductionRun() <em>mRPProductionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPProductionRun() mRPProductionRun}' feature.
	 * @generated
	 */
	public void setMRPProductionRun(MRPProductionRunType newMRPProductionRun) {
		mRPProductionRun = newMRPProductionRun;
		setFeature(Feature.MRPPRODUCTIONRUN);
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRunLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunLine</b></em>' feature
	 * @generated
	 */
	public MRPProductionRunLineType getMRPProductionRunLine() {
		return mRPProductionRunLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPProductionRunLine() <em>mRPProductionRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPProductionRunLine() mRPProductionRunLine}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLine(
			MRPProductionRunLineType newMRPProductionRunLine) {
		mRPProductionRunLine = newMRPProductionRunLine;
		setFeature(Feature.MRPPRODUCTIONRUNLINE);
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRun</b></em>' feature
	 * @generated
	 */
	public MRPPurchasingRunType getMRPPurchasingRun() {
		return mRPPurchasingRun;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPurchasingRun() <em>mRPPurchasingRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPurchasingRun() mRPPurchasingRun}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRun(MRPPurchasingRunType newMRPPurchasingRun) {
		mRPPurchasingRun = newMRPPurchasingRun;
		setFeature(Feature.MRPPURCHASINGRUN);
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunLine</b></em>' feature
	 * @generated
	 */
	public MRPPurchasingRunLineType getMRPPurchasingRunLine() {
		return mRPPurchasingRunLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPurchasingRunLine() <em>mRPPurchasingRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPurchasingRunLine() mRPPurchasingRunLine}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLine(
			MRPPurchasingRunLineType newMRPPurchasingRunLine) {
		mRPPurchasingRunLine = newMRPPurchasingRunLine;
		setFeature(Feature.MRPPURCHASINGRUNLINE);
	}

	/**
	 * Returns the value of '<em><b>mRPSalesForecast</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecast</b></em>' feature
	 * @generated
	 */
	public MRPSalesForecastType getMRPSalesForecast() {
		return mRPSalesForecast;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPSalesForecast() <em>mRPSalesForecast</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPSalesForecast() mRPSalesForecast}' feature.
	 * @generated
	 */
	public void setMRPSalesForecast(MRPSalesForecastType newMRPSalesForecast) {
		mRPSalesForecast = newMRPSalesForecast;
		setFeature(Feature.MRPSALESFORECAST);
	}

	/**
	 * Returns the value of '<em><b>mRPSalesForecastLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecastLine</b></em>' feature
	 * @generated
	 */
	public MRPSalesForecastLineType getMRPSalesForecastLine() {
		return mRPSalesForecastLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPSalesForecastLine() <em>mRPSalesForecastLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPSalesForecastLine() mRPSalesForecastLine}' feature.
	 * @generated
	 */
	public void setMRPSalesForecastLine(
			MRPSalesForecastLineType newMRPSalesForecastLine) {
		mRPSalesForecastLine = newMRPSalesForecastLine;
		setFeature(Feature.MRPSALESFORECASTLINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingActivity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingActivity</b></em>' feature
	 * @generated
	 */
	public ManufacturingActivityType getManufacturingActivity() {
		return manufacturingActivity;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingActivity() <em>manufacturingActivity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingActivity() manufacturingActivity}' feature.
	 * @generated
	 */
	public void setManufacturingActivity(
			ManufacturingActivityType newManufacturingActivity) {
		manufacturingActivity = newManufacturingActivity;
		setFeature(Feature.MANUFACTURINGACTIVITY);
	}

	/**
	 * Returns the value of '<em><b>manufacturingActivityToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingActivityToolset</b></em>' feature
	 * @generated
	 */
	public ManufacturingActivityToolsetType getManufacturingActivityToolset() {
		return manufacturingActivityToolset;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingActivityToolset() <em>manufacturingActivityToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingActivityToolset() manufacturingActivityToolset}' feature.
	 * @generated
	 */
	public void setManufacturingActivityToolset(
			ManufacturingActivityToolsetType newManufacturingActivityToolset) {
		manufacturingActivityToolset = newManufacturingActivityToolset;
		setFeature(Feature.MANUFACTURINGACTIVITYTOOLSET);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCase</b></em>' feature
	 * @generated
	 */
	public ManufacturingCaseType getManufacturingCase() {
		return manufacturingCase;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCase() <em>manufacturingCase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCase() manufacturingCase}' feature.
	 * @generated
	 */
	public void setManufacturingCase(ManufacturingCaseType newManufacturingCase) {
		manufacturingCase = newManufacturingCase;
		setFeature(Feature.MANUFACTURINGCASE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCheckPoint</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPoint</b></em>' feature
	 * @generated
	 */
	public ManufacturingCheckPointType getManufacturingCheckPoint() {
		return manufacturingCheckPoint;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCheckPoint() <em>manufacturingCheckPoint</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCheckPoint() manufacturingCheckPoint}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPoint(
			ManufacturingCheckPointType newManufacturingCheckPoint) {
		manufacturingCheckPoint = newManufacturingCheckPoint;
		setFeature(Feature.MANUFACTURINGCHECKPOINT);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCheckPointSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPointSet</b></em>' feature
	 * @generated
	 */
	public ManufacturingCheckPointSetType getManufacturingCheckPointSet() {
		return manufacturingCheckPointSet;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCheckPointSet() <em>manufacturingCheckPointSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCheckPointSet() manufacturingCheckPointSet}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPointSet(
			ManufacturingCheckPointSetType newManufacturingCheckPointSet) {
		manufacturingCheckPointSet = newManufacturingCheckPointSet;
		setFeature(Feature.MANUFACTURINGCHECKPOINTSET);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCheckPointShift</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPointShift</b></em>' feature
	 * @generated
	 */
	public ManufacturingCheckPointShiftType getManufacturingCheckPointShift() {
		return manufacturingCheckPointShift;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCheckPointShift() <em>manufacturingCheckPointShift</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCheckPointShift() manufacturingCheckPointShift}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPointShift(
			ManufacturingCheckPointShiftType newManufacturingCheckPointShift) {
		manufacturingCheckPointShift = newManufacturingCheckPointShift;
		setFeature(Feature.MANUFACTURINGCHECKPOINTSHIFT);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostCenter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostCenter</b></em>' feature
	 * @generated
	 */
	public ManufacturingCostCenterType getManufacturingCostCenter() {
		return manufacturingCostCenter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCostCenter() <em>manufacturingCostCenter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCostCenter() manufacturingCostCenter}' feature.
	 * @generated
	 */
	public void setManufacturingCostCenter(
			ManufacturingCostCenterType newManufacturingCostCenter) {
		manufacturingCostCenter = newManufacturingCostCenter;
		setFeature(Feature.MANUFACTURINGCOSTCENTER);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostCenterMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostCenterMachine</b></em>' feature
	 * @generated
	 */
	public ManufacturingCostCenterMachineType getManufacturingCostCenterMachine() {
		return manufacturingCostCenterMachine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCostCenterMachine() <em>manufacturingCostCenterMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCostCenterMachine() manufacturingCostCenterMachine}' feature.
	 * @generated
	 */
	public void setManufacturingCostCenterMachine(
			ManufacturingCostCenterMachineType newManufacturingCostCenterMachine) {
		manufacturingCostCenterMachine = newManufacturingCostCenterMachine;
		setFeature(Feature.MANUFACTURINGCOSTCENTERMACHINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterEmployee</b></em>' feature
	 * @generated
	 */
	public ManufacturingCostcenterEmployeeType getManufacturingCostcenterEmployee() {
		return manufacturingCostcenterEmployee;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCostcenterEmployee() <em>manufacturingCostcenterEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCostcenterEmployee() manufacturingCostcenterEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterEmployee(
			ManufacturingCostcenterEmployeeType newManufacturingCostcenterEmployee) {
		manufacturingCostcenterEmployee = newManufacturingCostcenterEmployee;
		setFeature(Feature.MANUFACTURINGCOSTCENTEREMPLOYEE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterIC</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterIC</b></em>' feature
	 * @generated
	 */
	public ManufacturingCostcenterICType getManufacturingCostcenterIC() {
		return manufacturingCostcenterIC;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCostcenterIC() <em>manufacturingCostcenterIC</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCostcenterIC() manufacturingCostcenterIC}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterIC(
			ManufacturingCostcenterICType newManufacturingCostcenterIC) {
		manufacturingCostcenterIC = newManufacturingCostcenterIC;
		setFeature(Feature.MANUFACTURINGCOSTCENTERIC);
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterVersion</b></em>' feature
	 * @generated
	 */
	public ManufacturingCostcenterVersionType getManufacturingCostcenterVersion() {
		return manufacturingCostcenterVersion;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCostcenterVersion() <em>manufacturingCostcenterVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCostcenterVersion() manufacturingCostcenterVersion}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterVersion(
			ManufacturingCostcenterVersionType newManufacturingCostcenterVersion) {
		manufacturingCostcenterVersion = newManufacturingCostcenterVersion;
		setFeature(Feature.MANUFACTURINGCOSTCENTERVERSION);
	}

	/**
	 * Returns the value of '<em><b>manufacturingGlobalUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingGlobalUse</b></em>' feature
	 * @generated
	 */
	public ManufacturingGlobalUseType getManufacturingGlobalUse() {
		return manufacturingGlobalUse;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingGlobalUse() <em>manufacturingGlobalUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingGlobalUse() manufacturingGlobalUse}' feature.
	 * @generated
	 */
	public void setManufacturingGlobalUse(
			ManufacturingGlobalUseType newManufacturingGlobalUse) {
		manufacturingGlobalUse = newManufacturingGlobalUse;
		setFeature(Feature.MANUFACTURINGGLOBALUSE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingIncidence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIncidence</b></em>' feature
	 * @generated
	 */
	public ManufacturingIncidenceType getManufacturingIncidence() {
		return manufacturingIncidence;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingIncidence() <em>manufacturingIncidence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingIncidence() manufacturingIncidence}' feature.
	 * @generated
	 */
	public void setManufacturingIncidence(
			ManufacturingIncidenceType newManufacturingIncidence) {
		manufacturingIncidence = newManufacturingIncidence;
		setFeature(Feature.MANUFACTURINGINCIDENCE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingIndirectCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIndirectCost</b></em>' feature
	 * @generated
	 */
	public ManufacturingIndirectCostType getManufacturingIndirectCost() {
		return manufacturingIndirectCost;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingIndirectCost() <em>manufacturingIndirectCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingIndirectCost() manufacturingIndirectCost}' feature.
	 * @generated
	 */
	public void setManufacturingIndirectCost(
			ManufacturingIndirectCostType newManufacturingIndirectCost) {
		manufacturingIndirectCost = newManufacturingIndirectCost;
		setFeature(Feature.MANUFACTURINGINDIRECTCOST);
	}

	/**
	 * Returns the value of '<em><b>manufacturingIndirectCostValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIndirectCostValue</b></em>' feature
	 * @generated
	 */
	public ManufacturingIndirectCostValueType getManufacturingIndirectCostValue() {
		return manufacturingIndirectCostValue;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingIndirectCostValue() <em>manufacturingIndirectCostValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingIndirectCostValue() manufacturingIndirectCostValue}' feature.
	 * @generated
	 */
	public void setManufacturingIndirectCostValue(
			ManufacturingIndirectCostValueType newManufacturingIndirectCostValue) {
		manufacturingIndirectCostValue = newManufacturingIndirectCostValue;
		setFeature(Feature.MANUFACTURINGINDIRECTCOSTVALUE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachine</b></em>' feature
	 * @generated
	 */
	public ManufacturingMachineType getManufacturingMachine() {
		return manufacturingMachine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMachine() <em>manufacturingMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMachine() manufacturingMachine}' feature.
	 * @generated
	 */
	public void setManufacturingMachine(
			ManufacturingMachineType newManufacturingMachine) {
		manufacturingMachine = newManufacturingMachine;
		setFeature(Feature.MANUFACTURINGMACHINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineCost</b></em>' feature
	 * @generated
	 */
	public ManufacturingMachineCostType getManufacturingMachineCost() {
		return manufacturingMachineCost;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMachineCost() <em>manufacturingMachineCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMachineCost() manufacturingMachineCost}' feature.
	 * @generated
	 */
	public void setManufacturingMachineCost(
			ManufacturingMachineCostType newManufacturingMachineCost) {
		manufacturingMachineCost = newManufacturingMachineCost;
		setFeature(Feature.MANUFACTURINGMACHINECOST);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineStation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineStation</b></em>' feature
	 * @generated
	 */
	public ManufacturingMachineStationType getManufacturingMachineStation() {
		return manufacturingMachineStation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMachineStation() <em>manufacturingMachineStation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMachineStation() manufacturingMachineStation}' feature.
	 * @generated
	 */
	public void setManufacturingMachineStation(
			ManufacturingMachineStationType newManufacturingMachineStation) {
		manufacturingMachineStation = newManufacturingMachineStation;
		setFeature(Feature.MANUFACTURINGMACHINESTATION);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineType</b></em>' feature
	 * @generated
	 */
	public ManufacturingMachineTypeType getManufacturingMachineType() {
		return manufacturingMachineType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMachineType() <em>manufacturingMachineType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMachineType() manufacturingMachineType}' feature.
	 * @generated
	 */
	public void setManufacturingMachineType(
			ManufacturingMachineTypeType newManufacturingMachineType) {
		manufacturingMachineType = newManufacturingMachineType;
		setFeature(Feature.MANUFACTURINGMACHINETYPE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMainteanceOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMainteanceOrder</b></em>' feature
	 * @generated
	 */
	public ManufacturingMainteanceOrderType getManufacturingMainteanceOrder() {
		return manufacturingMainteanceOrder;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMainteanceOrder() <em>manufacturingMainteanceOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMainteanceOrder() manufacturingMainteanceOrder}' feature.
	 * @generated
	 */
	public void setManufacturingMainteanceOrder(
			ManufacturingMainteanceOrderType newManufacturingMainteanceOrder) {
		manufacturingMainteanceOrder = newManufacturingMainteanceOrder;
		setFeature(Feature.MANUFACTURINGMAINTEANCEORDER);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenance</b></em>' feature
	 * @generated
	 */
	public ManufacturingMaintenanceType getManufacturingMaintenance() {
		return manufacturingMaintenance;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMaintenance() <em>manufacturingMaintenance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMaintenance() manufacturingMaintenance}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenance(
			ManufacturingMaintenanceType newManufacturingMaintenance) {
		manufacturingMaintenance = newManufacturingMaintenance;
		setFeature(Feature.MANUFACTURINGMAINTENANCE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenancePeriodicity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenancePeriodicity</b></em>' feature
	 * @generated
	 */
	public ManufacturingMaintenancePeriodicityType getManufacturingMaintenancePeriodicity() {
		return manufacturingMaintenancePeriodicity;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMaintenancePeriodicity() <em>manufacturingMaintenancePeriodicity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMaintenancePeriodicity() manufacturingMaintenancePeriodicity}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenancePeriodicity(
			ManufacturingMaintenancePeriodicityType newManufacturingMaintenancePeriodicity) {
		manufacturingMaintenancePeriodicity = newManufacturingMaintenancePeriodicity;
		setFeature(Feature.MANUFACTURINGMAINTENANCEPERIODICITY);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceSchedule</b></em>' feature
	 * @generated
	 */
	public ManufacturingMaintenanceScheduleType getManufacturingMaintenanceSchedule() {
		return manufacturingMaintenanceSchedule;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMaintenanceSchedule() <em>manufacturingMaintenanceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMaintenanceSchedule() manufacturingMaintenanceSchedule}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceSchedule(
			ManufacturingMaintenanceScheduleType newManufacturingMaintenanceSchedule) {
		manufacturingMaintenanceSchedule = newManufacturingMaintenanceSchedule;
		setFeature(Feature.MANUFACTURINGMAINTENANCESCHEDULE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceTask</b></em>' feature
	 * @generated
	 */
	public ManufacturingMaintenanceTaskType getManufacturingMaintenanceTask() {
		return manufacturingMaintenanceTask;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMaintenanceTask() <em>manufacturingMaintenanceTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMaintenanceTask() manufacturingMaintenanceTask}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceTask(
			ManufacturingMaintenanceTaskType newManufacturingMaintenanceTask) {
		manufacturingMaintenanceTask = newManufacturingMaintenanceTask;
		setFeature(Feature.MANUFACTURINGMAINTENANCETASK);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceWorker</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceWorker</b></em>' feature
	 * @generated
	 */
	public ManufacturingMaintenanceWorkerType getManufacturingMaintenanceWorker() {
		return manufacturingMaintenanceWorker;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMaintenanceWorker() <em>manufacturingMaintenanceWorker</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMaintenanceWorker() manufacturingMaintenanceWorker}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceWorker(
			ManufacturingMaintenanceWorkerType newManufacturingMaintenanceWorker) {
		manufacturingMaintenanceWorker = newManufacturingMaintenanceWorker;
		setFeature(Feature.MANUFACTURINGMAINTENANCEWORKER);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureGroup</b></em>' feature
	 * @generated
	 */
	public ManufacturingMeasureGroupType getManufacturingMeasureGroup() {
		return manufacturingMeasureGroup;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMeasureGroup() <em>manufacturingMeasureGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMeasureGroup() manufacturingMeasureGroup}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureGroup(
			ManufacturingMeasureGroupType newManufacturingMeasureGroup) {
		manufacturingMeasureGroup = newManufacturingMeasureGroup;
		setFeature(Feature.MANUFACTURINGMEASUREGROUP);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureShift</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureShift</b></em>' feature
	 * @generated
	 */
	public ManufacturingMeasureShiftType getManufacturingMeasureShift() {
		return manufacturingMeasureShift;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMeasureShift() <em>manufacturingMeasureShift</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMeasureShift() manufacturingMeasureShift}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureShift(
			ManufacturingMeasureShiftType newManufacturingMeasureShift) {
		manufacturingMeasureShift = newManufacturingMeasureShift;
		setFeature(Feature.MANUFACTURINGMEASURESHIFT);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureTime</b></em>' feature
	 * @generated
	 */
	public ManufacturingMeasureTimeType getManufacturingMeasureTime() {
		return manufacturingMeasureTime;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMeasureTime() <em>manufacturingMeasureTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMeasureTime() manufacturingMeasureTime}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureTime(
			ManufacturingMeasureTimeType newManufacturingMeasureTime) {
		manufacturingMeasureTime = newManufacturingMeasureTime;
		setFeature(Feature.MANUFACTURINGMEASURETIME);
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureValues</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureValues</b></em>' feature
	 * @generated
	 */
	public ManufacturingMeasureValuesType getManufacturingMeasureValues() {
		return manufacturingMeasureValues;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingMeasureValues() <em>manufacturingMeasureValues</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingMeasureValues() manufacturingMeasureValues}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureValues(
			ManufacturingMeasureValuesType newManufacturingMeasureValues) {
		manufacturingMeasureValues = newManufacturingMeasureValues;
		setFeature(Feature.MANUFACTURINGMEASUREVALUES);
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperation</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationType getManufacturingOperation() {
		return manufacturingOperation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingOperation() <em>manufacturingOperation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingOperation() manufacturingOperation}' feature.
	 * @generated
	 */
	public void setManufacturingOperation(
			ManufacturingOperationType newManufacturingOperation) {
		manufacturingOperation = newManufacturingOperation;
		setFeature(Feature.MANUFACTURINGOPERATION);
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationEmployee</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationEmployeeType getManufacturingOperationEmployee() {
		return manufacturingOperationEmployee;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingOperationEmployee() <em>manufacturingOperationEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingOperationEmployee() manufacturingOperationEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingOperationEmployee(
			ManufacturingOperationEmployeeType newManufacturingOperationEmployee) {
		manufacturingOperationEmployee = newManufacturingOperationEmployee;
		setFeature(Feature.MANUFACTURINGOPERATIONEMPLOYEE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationIndirectCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationIndirectCost</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationIndirectCostType getManufacturingOperationIndirectCost() {
		return manufacturingOperationIndirectCost;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingOperationIndirectCost() <em>manufacturingOperationIndirectCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingOperationIndirectCost() manufacturingOperationIndirectCost}' feature.
	 * @generated
	 */
	public void setManufacturingOperationIndirectCost(
			ManufacturingOperationIndirectCostType newManufacturingOperationIndirectCost) {
		manufacturingOperationIndirectCost = newManufacturingOperationIndirectCost;
		setFeature(Feature.MANUFACTURINGOPERATIONINDIRECTCOST);
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationMachine</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationMachineType getManufacturingOperationMachine() {
		return manufacturingOperationMachine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingOperationMachine() <em>manufacturingOperationMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingOperationMachine() manufacturingOperationMachine}' feature.
	 * @generated
	 */
	public void setManufacturingOperationMachine(
			ManufacturingOperationMachineType newManufacturingOperationMachine) {
		manufacturingOperationMachine = newManufacturingOperationMachine;
		setFeature(Feature.MANUFACTURINGOPERATIONMACHINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationProduct</b></em>' feature
	 * @generated
	 */
	public ManufacturingOperationProductType getManufacturingOperationProduct() {
		return manufacturingOperationProduct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingOperationProduct() <em>manufacturingOperationProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingOperationProduct() manufacturingOperationProduct}' feature.
	 * @generated
	 */
	public void setManufacturingOperationProduct(
			ManufacturingOperationProductType newManufacturingOperationProduct) {
		manufacturingOperationProduct = newManufacturingOperationProduct;
		setFeature(Feature.MANUFACTURINGOPERATIONPRODUCT);
	}

	/**
	 * Returns the value of '<em><b>manufacturingPeriodicControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingPeriodicControl</b></em>' feature
	 * @generated
	 */
	public ManufacturingPeriodicControlType getManufacturingPeriodicControl() {
		return manufacturingPeriodicControl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingPeriodicControl() <em>manufacturingPeriodicControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingPeriodicControl() manufacturingPeriodicControl}' feature.
	 * @generated
	 */
	public void setManufacturingPeriodicControl(
			ManufacturingPeriodicControlType newManufacturingPeriodicControl) {
		manufacturingPeriodicControl = newManufacturingPeriodicControl;
		setFeature(Feature.MANUFACTURINGPERIODICCONTROL);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProcessPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProcessPlan</b></em>' feature
	 * @generated
	 */
	public ManufacturingProcessPlanType getManufacturingProcessPlan() {
		return manufacturingProcessPlan;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProcessPlan() <em>manufacturingProcessPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProcessPlan() manufacturingProcessPlan}' feature.
	 * @generated
	 */
	public void setManufacturingProcessPlan(
			ManufacturingProcessPlanType newManufacturingProcessPlan) {
		manufacturingProcessPlan = newManufacturingProcessPlan;
		setFeature(Feature.MANUFACTURINGPROCESSPLAN);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionLine</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionLineType getManufacturingProductionLine() {
		return manufacturingProductionLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProductionLine() <em>manufacturingProductionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProductionLine() manufacturingProductionLine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLine(
			ManufacturingProductionLineType newManufacturingProductionLine) {
		manufacturingProductionLine = newManufacturingProductionLine;
		setFeature(Feature.MANUFACTURINGPRODUCTIONLINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunEmployee</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunEmployeeType getManufacturingProductionRunEmployee() {
		return manufacturingProductionRunEmployee;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProductionRunEmployee() <em>manufacturingProductionRunEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProductionRunEmployee() manufacturingProductionRunEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunEmployee(
			ManufacturingProductionRunEmployeeType newManufacturingProductionRunEmployee) {
		manufacturingProductionRunEmployee = newManufacturingProductionRunEmployee;
		setFeature(Feature.MANUFACTURINGPRODUCTIONRUNEMPLOYEE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunIndirectCosts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunIndirectCosts</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunIndirectCostsType getManufacturingProductionRunIndirectCosts() {
		return manufacturingProductionRunIndirectCosts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProductionRunIndirectCosts() <em>manufacturingProductionRunIndirectCosts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProductionRunIndirectCosts() manufacturingProductionRunIndirectCosts}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunIndirectCosts(
			ManufacturingProductionRunIndirectCostsType newManufacturingProductionRunIndirectCosts) {
		manufacturingProductionRunIndirectCosts = newManufacturingProductionRunIndirectCosts;
		setFeature(Feature.MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunInvoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunInvoiceLine</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunInvoiceLineType getManufacturingProductionRunInvoiceLine() {
		return manufacturingProductionRunInvoiceLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProductionRunInvoiceLine() <em>manufacturingProductionRunInvoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProductionRunInvoiceLine() manufacturingProductionRunInvoiceLine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunInvoiceLine(
			ManufacturingProductionRunInvoiceLineType newManufacturingProductionRunInvoiceLine) {
		manufacturingProductionRunInvoiceLine = newManufacturingProductionRunInvoiceLine;
		setFeature(Feature.MANUFACTURINGPRODUCTIONRUNINVOICELINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunMachine</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunMachineType getManufacturingProductionRunMachine() {
		return manufacturingProductionRunMachine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProductionRunMachine() <em>manufacturingProductionRunMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProductionRunMachine() manufacturingProductionRunMachine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunMachine(
			ManufacturingProductionRunMachineType newManufacturingProductionRunMachine) {
		manufacturingProductionRunMachine = newManufacturingProductionRunMachine;
		setFeature(Feature.MANUFACTURINGPRODUCTIONRUNMACHINE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunToolset</b></em>' feature
	 * @generated
	 */
	public ManufacturingProductionRunToolsetType getManufacturingProductionRunToolset() {
		return manufacturingProductionRunToolset;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingProductionRunToolset() <em>manufacturingProductionRunToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingProductionRunToolset() manufacturingProductionRunToolset}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunToolset(
			ManufacturingProductionRunToolsetType newManufacturingProductionRunToolset) {
		manufacturingProductionRunToolset = newManufacturingProductionRunToolset;
		setFeature(Feature.MANUFACTURINGPRODUCTIONRUNTOOLSET);
	}

	/**
	 * Returns the value of '<em><b>manufacturingSection</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingSection</b></em>' feature
	 * @generated
	 */
	public ManufacturingSectionType getManufacturingSection() {
		return manufacturingSection;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingSection() <em>manufacturingSection</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingSection() manufacturingSection}' feature.
	 * @generated
	 */
	public void setManufacturingSection(
			ManufacturingSectionType newManufacturingSection) {
		manufacturingSection = newManufacturingSection;
		setFeature(Feature.MANUFACTURINGSECTION);
	}

	/**
	 * Returns the value of '<em><b>manufacturingTest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingTest</b></em>' feature
	 * @generated
	 */
	public ManufacturingTestType getManufacturingTest() {
		return manufacturingTest;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingTest() <em>manufacturingTest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingTest() manufacturingTest}' feature.
	 * @generated
	 */
	public void setManufacturingTest(ManufacturingTestType newManufacturingTest) {
		manufacturingTest = newManufacturingTest;
		setFeature(Feature.MANUFACTURINGTEST);
	}

	/**
	 * Returns the value of '<em><b>manufacturingToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingToolset</b></em>' feature
	 * @generated
	 */
	public ManufacturingToolsetType getManufacturingToolset() {
		return manufacturingToolset;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingToolset() <em>manufacturingToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingToolset() manufacturingToolset}' feature.
	 * @generated
	 */
	public void setManufacturingToolset(
			ManufacturingToolsetType newManufacturingToolset) {
		manufacturingToolset = newManufacturingToolset;
		setFeature(Feature.MANUFACTURINGTOOLSET);
	}

	/**
	 * Returns the value of '<em><b>manufacturingToolsetType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingToolsetType</b></em>' feature
	 * @generated
	 */
	public ManufacturingToolsetTypeType getManufacturingToolsetType() {
		return manufacturingToolsetType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingToolsetType() <em>manufacturingToolsetType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingToolsetType() manufacturingToolsetType}' feature.
	 * @generated
	 */
	public void setManufacturingToolsetType(
			ManufacturingToolsetTypeType newManufacturingToolsetType) {
		manufacturingToolsetType = newManufacturingToolsetType;
		setFeature(Feature.MANUFACTURINGTOOLSETTYPE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingValue</b></em>' feature
	 * @generated
	 */
	public ManufacturingValueType getManufacturingValue() {
		return manufacturingValue;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingValue() <em>manufacturingValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingValue() manufacturingValue}' feature.
	 * @generated
	 */
	public void setManufacturingValue(
			ManufacturingValueType newManufacturingValue) {
		manufacturingValue = newManufacturingValue;
		setFeature(Feature.MANUFACTURINGVALUE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingVersion</b></em>' feature
	 * @generated
	 */
	public ManufacturingVersionType getManufacturingVersion() {
		return manufacturingVersion;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingVersion() <em>manufacturingVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingVersion() manufacturingVersion}' feature.
	 * @generated
	 */
	public void setManufacturingVersion(
			ManufacturingVersionType newManufacturingVersion) {
		manufacturingVersion = newManufacturingVersion;
		setFeature(Feature.MANUFACTURINGVERSION);
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkCenter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkCenter</b></em>' feature
	 * @generated
	 */
	public ManufacturingWorkCenterType getManufacturingWorkCenter() {
		return manufacturingWorkCenter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingWorkCenter() <em>manufacturingWorkCenter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingWorkCenter() manufacturingWorkCenter}' feature.
	 * @generated
	 */
	public void setManufacturingWorkCenter(
			ManufacturingWorkCenterType newManufacturingWorkCenter) {
		manufacturingWorkCenter = newManufacturingWorkCenter;
		setFeature(Feature.MANUFACTURINGWORKCENTER);
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortEmployee</b></em>' feature
	 * @generated
	 */
	public ManufacturingWorkEffortEmployeeType getManufacturingWorkEffortEmployee() {
		return manufacturingWorkEffortEmployee;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingWorkEffortEmployee() <em>manufacturingWorkEffortEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingWorkEffortEmployee() manufacturingWorkEffortEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortEmployee(
			ManufacturingWorkEffortEmployeeType newManufacturingWorkEffortEmployee) {
		manufacturingWorkEffortEmployee = newManufacturingWorkEffortEmployee;
		setFeature(Feature.MANUFACTURINGWORKEFFORTEMPLOYEE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortIncidence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortIncidence</b></em>' feature
	 * @generated
	 */
	public ManufacturingWorkEffortIncidenceType getManufacturingWorkEffortIncidence() {
		return manufacturingWorkEffortIncidence;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingWorkEffortIncidence() <em>manufacturingWorkEffortIncidence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingWorkEffortIncidence() manufacturingWorkEffortIncidence}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortIncidence(
			ManufacturingWorkEffortIncidenceType newManufacturingWorkEffortIncidence) {
		manufacturingWorkEffortIncidence = newManufacturingWorkEffortIncidence;
		setFeature(Feature.MANUFACTURINGWORKEFFORTINCIDENCE);
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirement</b></em>' feature
	 * @generated
	 */
	public ManufacturingWorkRequirementType getManufacturingWorkRequirement() {
		return manufacturingWorkRequirement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingWorkRequirement() <em>manufacturingWorkRequirement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingWorkRequirement() manufacturingWorkRequirement}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirement(
			ManufacturingWorkRequirementType newManufacturingWorkRequirement) {
		manufacturingWorkRequirement = newManufacturingWorkRequirement;
		setFeature(Feature.MANUFACTURINGWORKREQUIREMENT);
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementOperation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementOperation</b></em>' feature
	 * @generated
	 */
	public ManufacturingWorkRequirementOperationType getManufacturingWorkRequirementOperation() {
		return manufacturingWorkRequirementOperation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingWorkRequirementOperation() <em>manufacturingWorkRequirementOperation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingWorkRequirementOperation() manufacturingWorkRequirementOperation}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementOperation(
			ManufacturingWorkRequirementOperationType newManufacturingWorkRequirementOperation) {
		manufacturingWorkRequirementOperation = newManufacturingWorkRequirementOperation;
		setFeature(Feature.MANUFACTURINGWORKREQUIREMENTOPERATION);
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementProduct</b></em>' feature
	 * @generated
	 */
	public ManufacturingWorkRequirementProductType getManufacturingWorkRequirementProduct() {
		return manufacturingWorkRequirementProduct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingWorkRequirementProduct() <em>manufacturingWorkRequirementProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingWorkRequirementProduct() manufacturingWorkRequirementProduct}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementProduct(
			ManufacturingWorkRequirementProductType newManufacturingWorkRequirementProduct) {
		manufacturingWorkRequirementProduct = newManufacturingWorkRequirementProduct;
		setFeature(Feature.MANUFACTURINGWORKREQUIREMENTPRODUCT);
	}

	/**
	 * Returns the value of '<em><b>marketingCampaign</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>marketingCampaign</b></em>' feature
	 * @generated
	 */
	public MarketingCampaignType getMarketingCampaign() {
		return marketingCampaign;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMarketingCampaign() <em>marketingCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMarketingCampaign() marketingCampaign}' feature.
	 * @generated
	 */
	public void setMarketingCampaign(MarketingCampaignType newMarketingCampaign) {
		marketingCampaign = newMarketingCampaign;
		setFeature(Feature.MARKETINGCAMPAIGN);
	}

	/**
	 * Returns the value of '<em><b>marketingChannel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>marketingChannel</b></em>' feature
	 * @generated
	 */
	public MarketingChannelType getMarketingChannel() {
		return marketingChannel;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMarketingChannel() <em>marketingChannel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMarketingChannel() marketingChannel}' feature.
	 * @generated
	 */
	public void setMarketingChannel(MarketingChannelType newMarketingChannel) {
		marketingChannel = newMarketingChannel;
		setFeature(Feature.MARKETINGCHANNEL);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtABCActivity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtABCActivity</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtABCActivityType getMaterialMgmtABCActivity() {
		return materialMgmtABCActivity;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtABCActivity() <em>materialMgmtABCActivity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtABCActivity() materialMgmtABCActivity}' feature.
	 * @generated
	 */
	public void setMaterialMgmtABCActivity(
			MaterialMgmtABCActivityType newMaterialMgmtABCActivity) {
		materialMgmtABCActivity = newMaterialMgmtABCActivity;
		setFeature(Feature.MATERIALMGMTABCACTIVITY);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtCosting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtCosting</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtCostingType getMaterialMgmtCosting() {
		return materialMgmtCosting;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtCosting() <em>materialMgmtCosting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtCosting() materialMgmtCosting}' feature.
	 * @generated
	 */
	public void setMaterialMgmtCosting(
			MaterialMgmtCostingType newMaterialMgmtCosting) {
		materialMgmtCosting = newMaterialMgmtCosting;
		setFeature(Feature.MATERIALMGMTCOSTING);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumption</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumption</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtInternalConsumptionType getMaterialMgmtInternalConsumption() {
		return materialMgmtInternalConsumption;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtInternalConsumption() <em>materialMgmtInternalConsumption</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtInternalConsumption() materialMgmtInternalConsumption}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumption(
			MaterialMgmtInternalConsumptionType newMaterialMgmtInternalConsumption) {
		materialMgmtInternalConsumption = newMaterialMgmtInternalConsumption;
		setFeature(Feature.MATERIALMGMTINTERNALCONSUMPTION);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumptionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumptionLine</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtInternalConsumptionLineType getMaterialMgmtInternalConsumptionLine() {
		return materialMgmtInternalConsumptionLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtInternalConsumptionLine() <em>materialMgmtInternalConsumptionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtInternalConsumptionLine() materialMgmtInternalConsumptionLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumptionLine(
			MaterialMgmtInternalConsumptionLineType newMaterialMgmtInternalConsumptionLine) {
		materialMgmtInternalConsumptionLine = newMaterialMgmtInternalConsumptionLine;
		setFeature(Feature.MATERIALMGMTINTERNALCONSUMPTIONLINE);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovement</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtInternalMovementType getMaterialMgmtInternalMovement() {
		return materialMgmtInternalMovement;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtInternalMovement() <em>materialMgmtInternalMovement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtInternalMovement() materialMgmtInternalMovement}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovement(
			MaterialMgmtInternalMovementType newMaterialMgmtInternalMovement) {
		materialMgmtInternalMovement = newMaterialMgmtInternalMovement;
		setFeature(Feature.MATERIALMGMTINTERNALMOVEMENT);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementLine</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtInternalMovementLineType getMaterialMgmtInternalMovementLine() {
		return materialMgmtInternalMovementLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtInternalMovementLine() <em>materialMgmtInternalMovementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtInternalMovementLine() materialMgmtInternalMovementLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLine(
			MaterialMgmtInternalMovementLineType newMaterialMgmtInternalMovementLine) {
		materialMgmtInternalMovementLine = newMaterialMgmtInternalMovementLine;
		setFeature(Feature.MATERIALMGMTINTERNALMOVEMENTLINE);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCount</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtInventoryCountType getMaterialMgmtInventoryCount() {
		return materialMgmtInventoryCount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtInventoryCount() <em>materialMgmtInventoryCount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtInventoryCount() materialMgmtInventoryCount}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCount(
			MaterialMgmtInventoryCountType newMaterialMgmtInventoryCount) {
		materialMgmtInventoryCount = newMaterialMgmtInventoryCount;
		setFeature(Feature.MATERIALMGMTINVENTORYCOUNT);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountLine</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtInventoryCountLineType getMaterialMgmtInventoryCountLine() {
		return materialMgmtInventoryCountLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtInventoryCountLine() <em>materialMgmtInventoryCountLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtInventoryCountLine() materialMgmtInventoryCountLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountLine(
			MaterialMgmtInventoryCountLineType newMaterialMgmtInventoryCountLine) {
		materialMgmtInventoryCountLine = newMaterialMgmtInventoryCountLine;
		setFeature(Feature.MATERIALMGMTINVENTORYCOUNTLINE);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtMaterialTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtMaterialTransaction</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtMaterialTransactionType getMaterialMgmtMaterialTransaction() {
		return materialMgmtMaterialTransaction;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtMaterialTransaction() <em>materialMgmtMaterialTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtMaterialTransaction() materialMgmtMaterialTransaction}' feature.
	 * @generated
	 */
	public void setMaterialMgmtMaterialTransaction(
			MaterialMgmtMaterialTransactionType newMaterialMgmtMaterialTransaction) {
		materialMgmtMaterialTransaction = newMaterialMgmtMaterialTransaction;
		setFeature(Feature.MATERIALMGMTMATERIALTRANSACTION);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionPlan</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtProductionPlanType getMaterialMgmtProductionPlan() {
		return materialMgmtProductionPlan;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtProductionPlan() <em>materialMgmtProductionPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtProductionPlan() materialMgmtProductionPlan}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionPlan(
			MaterialMgmtProductionPlanType newMaterialMgmtProductionPlan) {
		materialMgmtProductionPlan = newMaterialMgmtProductionPlan;
		setFeature(Feature.MATERIALMGMTPRODUCTIONPLAN);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionTransaction</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtProductionTransactionType getMaterialMgmtProductionTransaction() {
		return materialMgmtProductionTransaction;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtProductionTransaction() <em>materialMgmtProductionTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtProductionTransaction() materialMgmtProductionTransaction}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionTransaction(
			MaterialMgmtProductionTransactionType newMaterialMgmtProductionTransaction) {
		materialMgmtProductionTransaction = newMaterialMgmtProductionTransaction;
		setFeature(Feature.MATERIALMGMTPRODUCTIONTRANSACTION);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOut</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOut</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtShipmentInOutType getMaterialMgmtShipmentInOut() {
		return materialMgmtShipmentInOut;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtShipmentInOut() <em>materialMgmtShipmentInOut</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtShipmentInOut() materialMgmtShipmentInOut}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOut(
			MaterialMgmtShipmentInOutType newMaterialMgmtShipmentInOut) {
		materialMgmtShipmentInOut = newMaterialMgmtShipmentInOut;
		setFeature(Feature.MATERIALMGMTSHIPMENTINOUT);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutLine</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtShipmentInOutLineType getMaterialMgmtShipmentInOutLine() {
		return materialMgmtShipmentInOutLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtShipmentInOutLine() <em>materialMgmtShipmentInOutLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtShipmentInOutLine() materialMgmtShipmentInOutLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutLine(
			MaterialMgmtShipmentInOutLineType newMaterialMgmtShipmentInOutLine) {
		materialMgmtShipmentInOutLine = newMaterialMgmtShipmentInOutLine;
		setFeature(Feature.MATERIALMGMTSHIPMENTINOUTLINE);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStorageDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStorageDetail</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtStorageDetailType getMaterialMgmtStorageDetail() {
		return materialMgmtStorageDetail;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtStorageDetail() <em>materialMgmtStorageDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtStorageDetail() materialMgmtStorageDetail}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStorageDetail(
			MaterialMgmtStorageDetailType newMaterialMgmtStorageDetail) {
		materialMgmtStorageDetail = newMaterialMgmtStorageDetail;
		setFeature(Feature.MATERIALMGMTSTORAGEDETAIL);
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStoragePending</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStoragePending</b></em>' feature
	 * @generated
	 */
	public MaterialMgmtStoragePendingType getMaterialMgmtStoragePending() {
		return materialMgmtStoragePending;
	}

	/**
	 * Sets the '{@link OpenbravoType#getMaterialMgmtStoragePending() <em>materialMgmtStoragePending</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMaterialMgmtStoragePending() materialMgmtStoragePending}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStoragePending(
			MaterialMgmtStoragePendingType newMaterialMgmtStoragePending) {
		materialMgmtStoragePending = newMaterialMgmtStoragePending;
		setFeature(Feature.MATERIALMGMTSTORAGEPENDING);
	}

	/**
	 * Returns the value of '<em><b>modelImplementationParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>modelImplementationParameter</b></em>' feature
	 * @generated
	 */
	public ModelImplementationParameterType getModelImplementationParameter() {
		return modelImplementationParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getModelImplementationParameter() <em>modelImplementationParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModelImplementationParameter() modelImplementationParameter}' feature.
	 * @generated
	 */
	public void setModelImplementationParameter(
			ModelImplementationParameterType newModelImplementationParameter) {
		modelImplementationParameter = newModelImplementationParameter;
		setFeature(Feature.MODELIMPLEMENTATIONPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>moduleDBPrefix</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleDBPrefix</b></em>' feature
	 * @generated
	 */
	public ModuleDBPrefixType getModuleDBPrefix() {
		return moduleDBPrefix;
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleDBPrefix() <em>moduleDBPrefix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleDBPrefix() moduleDBPrefix}' feature.
	 * @generated
	 */
	public void setModuleDBPrefix(ModuleDBPrefixType newModuleDBPrefix) {
		moduleDBPrefix = newModuleDBPrefix;
		setFeature(Feature.MODULEDBPREFIX);
	}

	/**
	 * Returns the value of '<em><b>moduleDependency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleDependency</b></em>' feature
	 * @generated
	 */
	public ModuleDependencyType getModuleDependency() {
		return moduleDependency;
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleDependency() <em>moduleDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleDependency() moduleDependency}' feature.
	 * @generated
	 */
	public void setModuleDependency(ModuleDependencyType newModuleDependency) {
		moduleDependency = newModuleDependency;
		setFeature(Feature.MODULEDEPENDENCY);
	}

	/**
	 * Returns the value of '<em><b>moduleLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleLog</b></em>' feature
	 * @generated
	 */
	public ModuleLogType getModuleLog() {
		return moduleLog;
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleLog() <em>moduleLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleLog() moduleLog}' feature.
	 * @generated
	 */
	public void setModuleLog(ModuleLogType newModuleLog) {
		moduleLog = newModuleLog;
		setFeature(Feature.MODULELOG);
	}

	/**
	 * Returns the value of '<em><b>moduleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleTrl</b></em>' feature
	 * @generated
	 */
	public ModuleTrlType getModuleTrl() {
		return moduleTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleTrl() <em>moduleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleTrl() moduleTrl}' feature.
	 * @generated
	 */
	public void setModuleTrl(ModuleTrlType newModuleTrl) {
		moduleTrl = newModuleTrl;
		setFeature(Feature.MODULETRL);
	}

	/**
	 * Returns the value of '<em><b>namingException</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>namingException</b></em>' feature
	 * @generated
	 */
	public NamingExceptionType getNamingException() {
		return namingException;
	}

	/**
	 * Sets the '{@link OpenbravoType#getNamingException() <em>namingException</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getNamingException() namingException}' feature.
	 * @generated
	 */
	public void setNamingException(NamingExceptionType newNamingException) {
		namingException = newNamingException;
		setFeature(Feature.NAMINGEXCEPTION);
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplate</b></em>' feature
	 * @generated
	 */
	public OBCLKERTemplateType getOBCLKERTemplate() {
		return oBCLKERTemplate;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCLKERTemplate() <em>oBCLKERTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCLKERTemplate() oBCLKERTemplate}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplate(OBCLKERTemplateType newOBCLKERTemplate) {
		oBCLKERTemplate = newOBCLKERTemplate;
		setFeature(Feature.OBCLKERTEMPLATE);
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplateDependency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplateDependency</b></em>' feature
	 * @generated
	 */
	public OBCLKERTemplateDependencyType getOBCLKERTemplateDependency() {
		return oBCLKERTemplateDependency;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCLKERTemplateDependency() <em>oBCLKERTemplateDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCLKERTemplateDependency() oBCLKERTemplateDependency}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplateDependency(
			OBCLKERTemplateDependencyType newOBCLKERTemplateDependency) {
		oBCLKERTemplateDependency = newOBCLKERTemplateDependency;
		setFeature(Feature.OBCLKERTEMPLATEDEPENDENCY);
	}

	/**
	 * Returns the value of '<em><b>oBCLKERUIDefinition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERUIDefinition</b></em>' feature
	 * @generated
	 */
	public OBCLKERUIDefinitionType getOBCLKERUIDefinition() {
		return oBCLKERUIDefinition;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCLKERUIDefinition() <em>oBCLKERUIDefinition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCLKERUIDefinition() oBCLKERUIDefinition}' feature.
	 * @generated
	 */
	public void setOBCLKERUIDefinition(
			OBCLKERUIDefinitionType newOBCLKERUIDefinition) {
		oBCLKERUIDefinition = newOBCLKERUIDefinition;
		setFeature(Feature.OBCLKERUIDEFINITION);
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumn</b></em>' feature
	 * @generated
	 */
	public OBCQLQueryColumnType getOBCQLQueryColumn() {
		return oBCQLQueryColumn;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCQLQueryColumn() <em>oBCQLQueryColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCQLQueryColumn() oBCQLQueryColumn}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumn(OBCQLQueryColumnType newOBCQLQueryColumn) {
		oBCQLQueryColumn = newOBCQLQueryColumn;
		setFeature(Feature.OBCQLQUERYCOLUMN);
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumnTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumnTrl</b></em>' feature
	 * @generated
	 */
	public OBCQLQueryColumnTrlType getOBCQLQueryColumnTrl() {
		return oBCQLQueryColumnTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCQLQueryColumnTrl() <em>oBCQLQueryColumnTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCQLQueryColumnTrl() oBCQLQueryColumnTrl}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnTrl(
			OBCQLQueryColumnTrlType newOBCQLQueryColumnTrl) {
		oBCQLQueryColumnTrl = newOBCQLQueryColumnTrl;
		setFeature(Feature.OBCQLQUERYCOLUMNTRL);
	}

	/**
	 * Returns the value of '<em><b>oBCQLWidgetQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLWidgetQuery</b></em>' feature
	 * @generated
	 */
	public OBCQLWidgetQueryType getOBCQLWidgetQuery() {
		return oBCQLWidgetQuery;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCQLWidgetQuery() <em>oBCQLWidgetQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCQLWidgetQuery() oBCQLWidgetQuery}' feature.
	 * @generated
	 */
	public void setOBCQLWidgetQuery(OBCQLWidgetQueryType newOBCQLWidgetQuery) {
		oBCQLWidgetQuery = newOBCQLWidgetQuery;
		setFeature(Feature.OBCQLWIDGETQUERY);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClass</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClass</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassType getOBKMOWidgetClass() {
		return oBKMOWidgetClass;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetClass() <em>oBKMOWidgetClass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetClass() oBKMOWidgetClass}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClass(OBKMOWidgetClassType newOBKMOWidgetClass) {
		oBKMOWidgetClass = newOBKMOWidgetClass;
		setFeature(Feature.OBKMOWIDGETCLASS);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassAccess</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassAccessType getOBKMOWidgetClassAccess() {
		return oBKMOWidgetClassAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetClassAccess() <em>oBKMOWidgetClassAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetClassAccess() oBKMOWidgetClassAccess}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassAccess(
			OBKMOWidgetClassAccessType newOBKMOWidgetClassAccess) {
		oBKMOWidgetClassAccess = newOBKMOWidgetClassAccess;
		setFeature(Feature.OBKMOWIDGETCLASSACCESS);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenu</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassMenuType getOBKMOWidgetClassMenu() {
		return oBKMOWidgetClassMenu;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetClassMenu() <em>oBKMOWidgetClassMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetClassMenu() oBKMOWidgetClassMenu}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenu(
			OBKMOWidgetClassMenuType newOBKMOWidgetClassMenu) {
		oBKMOWidgetClassMenu = newOBKMOWidgetClassMenu;
		setFeature(Feature.OBKMOWIDGETCLASSMENU);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenuTrl</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassMenuTrlType getOBKMOWidgetClassMenuTrl() {
		return oBKMOWidgetClassMenuTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetClassMenuTrl() <em>oBKMOWidgetClassMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetClassMenuTrl() oBKMOWidgetClassMenuTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenuTrl(
			OBKMOWidgetClassMenuTrlType newOBKMOWidgetClassMenuTrl) {
		oBKMOWidgetClassMenuTrl = newOBKMOWidgetClassMenuTrl;
		setFeature(Feature.OBKMOWIDGETCLASSMENUTRL);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassTrl</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetClassTrlType getOBKMOWidgetClassTrl() {
		return oBKMOWidgetClassTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetClassTrl() <em>oBKMOWidgetClassTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetClassTrl() oBKMOWidgetClassTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassTrl(
			OBKMOWidgetClassTrlType newOBKMOWidgetClassTrl) {
		oBKMOWidgetClassTrl = newOBKMOWidgetClassTrl;
		setFeature(Feature.OBKMOWIDGETCLASSTRL);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetInstance</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetInstanceType getOBKMOWidgetInstance() {
		return oBKMOWidgetInstance;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetInstance() <em>oBKMOWidgetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetInstance() oBKMOWidgetInstance}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstance(
			OBKMOWidgetInstanceType newOBKMOWidgetInstance) {
		oBKMOWidgetInstance = newOBKMOWidgetInstance;
		setFeature(Feature.OBKMOWIDGETINSTANCE);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetList</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetListType getOBKMOWidgetList() {
		return oBKMOWidgetList;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetList() <em>oBKMOWidgetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetList() oBKMOWidgetList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetList(OBKMOWidgetListType newOBKMOWidgetList) {
		oBKMOWidgetList = newOBKMOWidgetList;
		setFeature(Feature.OBKMOWIDGETLIST);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetReference</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetReferenceType getOBKMOWidgetReference() {
		return oBKMOWidgetReference;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetReference() <em>oBKMOWidgetReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetReference() oBKMOWidgetReference}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetReference(
			OBKMOWidgetReferenceType newOBKMOWidgetReference) {
		oBKMOWidgetReference = newOBKMOWidgetReference;
		setFeature(Feature.OBKMOWIDGETREFERENCE);
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetURL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetURL</b></em>' feature
	 * @generated
	 */
	public OBKMOWidgetURLType getOBKMOWidgetURL() {
		return oBKMOWidgetURL;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetURL() <em>oBKMOWidgetURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetURL() oBKMOWidgetURL}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetURL(OBKMOWidgetURLType newOBKMOWidgetURL) {
		oBKMOWidgetURL = newOBKMOWidgetURL;
		setFeature(Feature.OBKMOWIDGETURL);
	}

	/**
	 * Returns the value of '<em><b>oBSEIGDefaults</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSEIGDefaults</b></em>' feature
	 * @generated
	 */
	public OBSEIGDefaultsType getOBSEIGDefaults() {
		return oBSEIGDefaults;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBSEIGDefaults() <em>oBSEIGDefaults</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBSEIGDefaults() oBSEIGDefaults}' feature.
	 * @generated
	 */
	public void setOBSEIGDefaults(OBSEIGDefaultsType newOBSEIGDefaults) {
		oBSEIGDefaults = newOBSEIGDefaults;
		setFeature(Feature.OBSEIGDEFAULTS);
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasource</b></em>' feature
	 * @generated
	 */
	public OBSERDSDatasourceType getOBSERDSDatasource() {
		return oBSERDSDatasource;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBSERDSDatasource() <em>oBSERDSDatasource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBSERDSDatasource() oBSERDSDatasource}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasource(OBSERDSDatasourceType newOBSERDSDatasource) {
		oBSERDSDatasource = newOBSERDSDatasource;
		setFeature(Feature.OBSERDSDATASOURCE);
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceField</b></em>' feature
	 * @generated
	 */
	public OBSERDSDatasourceFieldType getOBSERDSDatasourceField() {
		return oBSERDSDatasourceField;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBSERDSDatasourceField() <em>oBSERDSDatasourceField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBSERDSDatasourceField() oBSERDSDatasourceField}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceField(
			OBSERDSDatasourceFieldType newOBSERDSDatasourceField) {
		oBSERDSDatasourceField = newOBSERDSDatasourceField;
		setFeature(Feature.OBSERDSDATASOURCEFIELD);
	}

	/**
	 * Returns the value of '<em><b>oBSOIDUserIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSOIDUserIdentifier</b></em>' feature
	 * @generated
	 */
	public OBSOIDUserIdentifierType getOBSOIDUserIdentifier() {
		return oBSOIDUserIdentifier;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBSOIDUserIdentifier() <em>oBSOIDUserIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBSOIDUserIdentifier() oBSOIDUserIdentifier}' feature.
	 * @generated
	 */
	public void setOBSOIDUserIdentifier(
			OBSOIDUserIdentifierType newOBSOIDUserIdentifier) {
		oBSOIDUserIdentifier = newOBSOIDUserIdentifier;
		setFeature(Feature.OBSOIDUSERIDENTIFIER);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPMenuParameters</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPMenuParameters</b></em>' feature
	 * @generated
	 */
	public OBUIAPPMenuParametersType getOBUIAPPMenuParameters() {
		return oBUIAPPMenuParameters;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPMenuParameters() <em>oBUIAPPMenuParameters</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPMenuParameters() oBUIAPPMenuParameters}' feature.
	 * @generated
	 */
	public void setOBUIAPPMenuParameters(
			OBUIAPPMenuParametersType newOBUIAPPMenuParameters) {
		oBUIAPPMenuParameters = newOBUIAPPMenuParameters;
		setFeature(Feature.OBUIAPPMENUPARAMETERS);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNavbarRoleaccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavbarRoleaccess</b></em>' feature
	 * @generated
	 */
	public OBUIAPPNavbarRoleaccessType getOBUIAPPNavbarRoleaccess() {
		return oBUIAPPNavbarRoleaccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPNavbarRoleaccess() <em>oBUIAPPNavbarRoleaccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPNavbarRoleaccess() oBUIAPPNavbarRoleaccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavbarRoleaccess(
			OBUIAPPNavbarRoleaccessType newOBUIAPPNavbarRoleaccess) {
		oBUIAPPNavbarRoleaccess = newOBUIAPPNavbarRoleaccess;
		setFeature(Feature.OBUIAPPNAVBARROLEACCESS);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNavigationBarComponent</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavigationBarComponent</b></em>' feature
	 * @generated
	 */
	public OBUIAPPNavigationBarComponentType getOBUIAPPNavigationBarComponent() {
		return oBUIAPPNavigationBarComponent;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPNavigationBarComponent() <em>oBUIAPPNavigationBarComponent</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPNavigationBarComponent() oBUIAPPNavigationBarComponent}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavigationBarComponent(
			OBUIAPPNavigationBarComponentType newOBUIAPPNavigationBarComponent) {
		oBUIAPPNavigationBarComponent = newOBUIAPPNavigationBarComponent;
		setFeature(Feature.OBUIAPPNAVIGATIONBARCOMPONENT);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNote</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNote</b></em>' feature
	 * @generated
	 */
	public OBUIAPPNoteType getOBUIAPPNote() {
		return oBUIAPPNote;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPNote() <em>oBUIAPPNote</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPNote() oBUIAPPNote}' feature.
	 * @generated
	 */
	public void setOBUIAPPNote(OBUIAPPNoteType newOBUIAPPNote) {
		oBUIAPPNote = newOBUIAPPNote;
		setFeature(Feature.OBUIAPPNOTE);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameter</b></em>' feature
	 * @generated
	 */
	public OBUIAPPParameterType getOBUIAPPParameter() {
		return oBUIAPPParameter;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPParameter() <em>oBUIAPPParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPParameter() oBUIAPPParameter}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameter(OBUIAPPParameterType newOBUIAPPParameter) {
		oBUIAPPParameter = newOBUIAPPParameter;
		setFeature(Feature.OBUIAPPPARAMETER);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterTrl</b></em>' feature
	 * @generated
	 */
	public OBUIAPPParameterTrlType getOBUIAPPParameterTrl() {
		return oBUIAPPParameterTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPParameterTrl() <em>oBUIAPPParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPParameterTrl() oBUIAPPParameterTrl}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterTrl(
			OBUIAPPParameterTrlType newOBUIAPPParameterTrl) {
		oBUIAPPParameterTrl = newOBUIAPPParameterTrl;
		setFeature(Feature.OBUIAPPPARAMETERTRL);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterValue</b></em>' feature
	 * @generated
	 */
	public OBUIAPPParameterValueType getOBUIAPPParameterValue() {
		return oBUIAPPParameterValue;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPParameterValue() <em>oBUIAPPParameterValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPParameterValue() oBUIAPPParameterValue}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterValue(
			OBUIAPPParameterValueType newOBUIAPPParameterValue) {
		oBUIAPPParameterValue = newOBUIAPPParameterValue;
		setFeature(Feature.OBUIAPPPARAMETERVALUE);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPProcess</b></em>' feature
	 * @generated
	 */
	public OBUIAPPProcessType getOBUIAPPProcess() {
		return oBUIAPPProcess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPProcess() <em>oBUIAPPProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPProcess() oBUIAPPProcess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcess(OBUIAPPProcessType newOBUIAPPProcess) {
		oBUIAPPProcess = newOBUIAPPProcess;
		setFeature(Feature.OBUIAPPPROCESS);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPProcessAccess</b></em>' feature
	 * @generated
	 */
	public OBUIAPPProcessAccessType getOBUIAPPProcessAccess() {
		return oBUIAPPProcessAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPProcessAccess() <em>oBUIAPPProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPProcessAccess() oBUIAPPProcessAccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcessAccess(
			OBUIAPPProcessAccessType newOBUIAPPProcessAccess) {
		oBUIAPPProcessAccess = newOBUIAPPProcessAccess;
		setFeature(Feature.OBUIAPPPROCESSACCESS);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPRefWindow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPRefWindow</b></em>' feature
	 * @generated
	 */
	public OBUIAPPRefWindowType getOBUIAPPRefWindow() {
		return oBUIAPPRefWindow;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPRefWindow() <em>oBUIAPPRefWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPRefWindow() oBUIAPPRefWindow}' feature.
	 * @generated
	 */
	public void setOBUIAPPRefWindow(OBUIAPPRefWindowType newOBUIAPPRefWindow) {
		oBUIAPPRefWindow = newOBUIAPPRefWindow;
		setFeature(Feature.OBUIAPPREFWINDOW);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPUIPersonalization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPUIPersonalization</b></em>' feature
	 * @generated
	 */
	public OBUIAPPUIPersonalizationType getOBUIAPPUIPersonalization() {
		return oBUIAPPUIPersonalization;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPUIPersonalization() <em>oBUIAPPUIPersonalization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPUIPersonalization() oBUIAPPUIPersonalization}' feature.
	 * @generated
	 */
	public void setOBUIAPPUIPersonalization(
			OBUIAPPUIPersonalizationType newOBUIAPPUIPersonalization) {
		oBUIAPPUIPersonalization = newOBUIAPPUIPersonalization;
		setFeature(Feature.OBUIAPPUIPERSONALIZATION);
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPViewImplementation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPViewImplementation</b></em>' feature
	 * @generated
	 */
	public OBUIAPPViewImplementationType getOBUIAPPViewImplementation() {
		return oBUIAPPViewImplementation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPViewImplementation() <em>oBUIAPPViewImplementation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPViewImplementation() oBUIAPPViewImplementation}' feature.
	 * @generated
	 */
	public void setOBUIAPPViewImplementation(
			OBUIAPPViewImplementationType newOBUIAPPViewImplementation) {
		oBUIAPPViewImplementation = newOBUIAPPViewImplementation;
		setFeature(Feature.OBUIAPPVIEWIMPLEMENTATION);
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelector</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorType getOBUISELSelector() {
		return oBUISELSelector;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUISELSelector() <em>oBUISELSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUISELSelector() oBUISELSelector}' feature.
	 * @generated
	 */
	public void setOBUISELSelector(OBUISELSelectorType newOBUISELSelector) {
		oBUISELSelector = newOBUISELSelector;
		setFeature(Feature.OBUISELSELECTOR);
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorField</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorFieldType getOBUISELSelectorField() {
		return oBUISELSelectorField;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUISELSelectorField() <em>oBUISELSelectorField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUISELSelectorField() oBUISELSelectorField}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorField(
			OBUISELSelectorFieldType newOBUISELSelectorField) {
		oBUISELSelectorField = newOBUISELSelectorField;
		setFeature(Feature.OBUISELSELECTORFIELD);
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorFieldTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorFieldTrl</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorFieldTrlType getOBUISELSelectorFieldTrl() {
		return oBUISELSelectorFieldTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUISELSelectorFieldTrl() <em>oBUISELSelectorFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUISELSelectorFieldTrl() oBUISELSelectorFieldTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorFieldTrl(
			OBUISELSelectorFieldTrlType newOBUISELSelectorFieldTrl) {
		oBUISELSelectorFieldTrl = newOBUISELSelectorFieldTrl;
		setFeature(Feature.OBUISELSELECTORFIELDTRL);
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorTrl</b></em>' feature
	 * @generated
	 */
	public OBUISELSelectorTrlType getOBUISELSelectorTrl() {
		return oBUISELSelectorTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUISELSelectorTrl() <em>oBUISELSelectorTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUISELSelectorTrl() oBUISELSelectorTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorTrl(
			OBUISELSelectorTrlType newOBUISELSelectorTrl) {
		oBUISELSelectorTrl = newOBUISELSelectorTrl;
		setFeature(Feature.OBUISELSELECTORTRL);
	}

	/**
	 * Returns the value of '<em><b>order</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>order</b></em>' feature
	 * @generated
	 */
	public OrderType getOrder() {
		return order;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrder() <em>order</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrder() order}' feature.
	 * @generated
	 */
	public void setOrder(OrderType newOrder) {
		order = newOrder;
		setFeature(Feature.ORDER);
	}

	/**
	 * Returns the value of '<em><b>orderDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDiscount</b></em>' feature
	 * @generated
	 */
	public OrderDiscountType getOrderDiscount() {
		return orderDiscount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderDiscount() <em>orderDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderDiscount() orderDiscount}' feature.
	 * @generated
	 */
	public void setOrderDiscount(OrderDiscountType newOrderDiscount) {
		orderDiscount = newOrderDiscount;
		setFeature(Feature.ORDERDISCOUNT);
	}

	/**
	 * Returns the value of '<em><b>orderLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLine</b></em>' feature
	 * @generated
	 */
	public OrderLineType getOrderLine() {
		return orderLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderLine() <em>orderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderLine() orderLine}' feature.
	 * @generated
	 */
	public void setOrderLine(OrderLineType newOrderLine) {
		orderLine = newOrderLine;
		setFeature(Feature.ORDERLINE);
	}

	/**
	 * Returns the value of '<em><b>orderLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineOffer</b></em>' feature
	 * @generated
	 */
	public OrderLineOfferType getOrderLineOffer() {
		return orderLineOffer;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderLineOffer() <em>orderLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderLineOffer() orderLineOffer}' feature.
	 * @generated
	 */
	public void setOrderLineOffer(OrderLineOfferType newOrderLineOffer) {
		orderLineOffer = newOrderLineOffer;
		setFeature(Feature.ORDERLINEOFFER);
	}

	/**
	 * Returns the value of '<em><b>orderLineTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineTax</b></em>' feature
	 * @generated
	 */
	public OrderLineTaxType getOrderLineTax() {
		return orderLineTax;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderLineTax() <em>orderLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderLineTax() orderLineTax}' feature.
	 * @generated
	 */
	public void setOrderLineTax(OrderLineTaxType newOrderLineTax) {
		orderLineTax = newOrderLineTax;
		setFeature(Feature.ORDERLINETAX);
	}

	/**
	 * Returns the value of '<em><b>orderTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderTax</b></em>' feature
	 * @generated
	 */
	public OrderTaxType getOrderTax() {
		return orderTax;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderTax() <em>orderTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderTax() orderTax}' feature.
	 * @generated
	 */
	public void setOrderTax(OrderTaxType newOrderTax) {
		orderTax = newOrderTax;
		setFeature(Feature.ORDERTAX);
	}

	/**
	 * Returns the value of '<em><b>organization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organization</b></em>' feature
	 * @generated
	 */
	public OrganizationType getOrganization() {
		return organization;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(OrganizationType newOrganization) {
		organization = newOrganization;
		setFeature(Feature.ORGANIZATION);
	}

	/**
	 * Returns the value of '<em><b>organizationAcctSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationAcctSchema</b></em>' feature
	 * @generated
	 */
	public OrganizationAcctSchemaType getOrganizationAcctSchema() {
		return organizationAcctSchema;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganizationAcctSchema() <em>organizationAcctSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganizationAcctSchema() organizationAcctSchema}' feature.
	 * @generated
	 */
	public void setOrganizationAcctSchema(
			OrganizationAcctSchemaType newOrganizationAcctSchema) {
		organizationAcctSchema = newOrganizationAcctSchema;
		setFeature(Feature.ORGANIZATIONACCTSCHEMA);
	}

	/**
	 * Returns the value of '<em><b>organizationClosing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationClosing</b></em>' feature
	 * @generated
	 */
	public OrganizationClosingType getOrganizationClosing() {
		return organizationClosing;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganizationClosing() <em>organizationClosing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganizationClosing() organizationClosing}' feature.
	 * @generated
	 */
	public void setOrganizationClosing(
			OrganizationClosingType newOrganizationClosing) {
		organizationClosing = newOrganizationClosing;
		setFeature(Feature.ORGANIZATIONCLOSING);
	}

	/**
	 * Returns the value of '<em><b>organizationInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformation</b></em>' feature
	 * @generated
	 */
	public OrganizationInformationType getOrganizationInformation() {
		return organizationInformation;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganizationInformation() <em>organizationInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganizationInformation() organizationInformation}' feature.
	 * @generated
	 */
	public void setOrganizationInformation(
			OrganizationInformationType newOrganizationInformation) {
		organizationInformation = newOrganizationInformation;
		setFeature(Feature.ORGANIZATIONINFORMATION);
	}

	/**
	 * Returns the value of '<em><b>organizationModuleV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationModuleV</b></em>' feature
	 * @generated
	 */
	public OrganizationModuleVType getOrganizationModuleV() {
		return organizationModuleV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganizationModuleV() <em>organizationModuleV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganizationModuleV() organizationModuleV}' feature.
	 * @generated
	 */
	public void setOrganizationModuleV(
			OrganizationModuleVType newOrganizationModuleV) {
		organizationModuleV = newOrganizationModuleV;
		setFeature(Feature.ORGANIZATIONMODULEV);
	}

	/**
	 * Returns the value of '<em><b>organizationType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationType</b></em>' feature
	 * @generated
	 */
	public OrganizationTypeType getOrganizationType() {
		return organizationType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganizationType() <em>organizationType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganizationType() organizationType}' feature.
	 * @generated
	 */
	public void setOrganizationType(OrganizationTypeType newOrganizationType) {
		organizationType = newOrganizationType;
		setFeature(Feature.ORGANIZATIONTYPE);
	}

	/**
	 * Returns the value of '<em><b>periodControlLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>periodControlLog</b></em>' feature
	 * @generated
	 */
	public PeriodControlLogType getPeriodControlLog() {
		return periodControlLog;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPeriodControlLog() <em>periodControlLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPeriodControlLog() periodControlLog}' feature.
	 * @generated
	 */
	public void setPeriodControlLog(PeriodControlLogType newPeriodControlLog) {
		periodControlLog = newPeriodControlLog;
		setFeature(Feature.PERIODCONTROLLOG);
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustment</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentType getPricingAdjustment() {
		return pricingAdjustment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustment() <em>pricingAdjustment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustment() pricingAdjustment}' feature.
	 * @generated
	 */
	public void setPricingAdjustment(PricingAdjustmentType newPricingAdjustment) {
		pricingAdjustment = newPricingAdjustment;
		setFeature(Feature.PRICINGADJUSTMENT);
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartner</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentBusinessPartnerType getPricingAdjustmentBusinessPartner() {
		return pricingAdjustmentBusinessPartner;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustmentBusinessPartner() <em>pricingAdjustmentBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustmentBusinessPartner() pricingAdjustmentBusinessPartner}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartner(
			PricingAdjustmentBusinessPartnerType newPricingAdjustmentBusinessPartner) {
		pricingAdjustmentBusinessPartner = newPricingAdjustmentBusinessPartner;
		setFeature(Feature.PRICINGADJUSTMENTBUSINESSPARTNER);
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartnerGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartnerGroup</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentBusinessPartnerGroupType getPricingAdjustmentBusinessPartnerGroup() {
		return pricingAdjustmentBusinessPartnerGroup;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustmentBusinessPartnerGroup() <em>pricingAdjustmentBusinessPartnerGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustmentBusinessPartnerGroup() pricingAdjustmentBusinessPartnerGroup}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartnerGroup(
			PricingAdjustmentBusinessPartnerGroupType newPricingAdjustmentBusinessPartnerGroup) {
		pricingAdjustmentBusinessPartnerGroup = newPricingAdjustmentBusinessPartnerGroup;
		setFeature(Feature.PRICINGADJUSTMENTBUSINESSPARTNERGROUP);
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentPriceList</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentPriceListType getPricingAdjustmentPriceList() {
		return pricingAdjustmentPriceList;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustmentPriceList() <em>pricingAdjustmentPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustmentPriceList() pricingAdjustmentPriceList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentPriceList(
			PricingAdjustmentPriceListType newPricingAdjustmentPriceList) {
		pricingAdjustmentPriceList = newPricingAdjustmentPriceList;
		setFeature(Feature.PRICINGADJUSTMENTPRICELIST);
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProduct</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentProductType getPricingAdjustmentProduct() {
		return pricingAdjustmentProduct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustmentProduct() <em>pricingAdjustmentProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustmentProduct() pricingAdjustmentProduct}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProduct(
			PricingAdjustmentProductType newPricingAdjustmentProduct) {
		pricingAdjustmentProduct = newPricingAdjustmentProduct;
		setFeature(Feature.PRICINGADJUSTMENTPRODUCT);
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProductCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProductCategory</b></em>' feature
	 * @generated
	 */
	public PricingAdjustmentProductCategoryType getPricingAdjustmentProductCategory() {
		return pricingAdjustmentProductCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustmentProductCategory() <em>pricingAdjustmentProductCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustmentProductCategory() pricingAdjustmentProductCategory}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProductCategory(
			PricingAdjustmentProductCategoryType newPricingAdjustmentProductCategory) {
		pricingAdjustmentProductCategory = newPricingAdjustmentProductCategory;
		setFeature(Feature.PRICINGADJUSTMENTPRODUCTCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>pricingDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingDiscount</b></em>' feature
	 * @generated
	 */
	public PricingDiscountType getPricingDiscount() {
		return pricingDiscount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingDiscount() <em>pricingDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingDiscount() pricingDiscount}' feature.
	 * @generated
	 */
	public void setPricingDiscount(PricingDiscountType newPricingDiscount) {
		pricingDiscount = newPricingDiscount;
		setFeature(Feature.PRICINGDISCOUNT);
	}

	/**
	 * Returns the value of '<em><b>pricingPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceList</b></em>' feature
	 * @generated
	 */
	public PricingPriceListType getPricingPriceList() {
		return pricingPriceList;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingPriceList() <em>pricingPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingPriceList() pricingPriceList}' feature.
	 * @generated
	 */
	public void setPricingPriceList(PricingPriceListType newPricingPriceList) {
		pricingPriceList = newPricingPriceList;
		setFeature(Feature.PRICINGPRICELIST);
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListSchema</b></em>' feature
	 * @generated
	 */
	public PricingPriceListSchemaType getPricingPriceListSchema() {
		return pricingPriceListSchema;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingPriceListSchema() <em>pricingPriceListSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingPriceListSchema() pricingPriceListSchema}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchema(
			PricingPriceListSchemaType newPricingPriceListSchema) {
		pricingPriceListSchema = newPricingPriceListSchema;
		setFeature(Feature.PRICINGPRICELISTSCHEMA);
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListSchemeLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListSchemeLine</b></em>' feature
	 * @generated
	 */
	public PricingPriceListSchemeLineType getPricingPriceListSchemeLine() {
		return pricingPriceListSchemeLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingPriceListSchemeLine() <em>pricingPriceListSchemeLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingPriceListSchemeLine() pricingPriceListSchemeLine}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchemeLine(
			PricingPriceListSchemeLineType newPricingPriceListSchemeLine) {
		pricingPriceListSchemeLine = newPricingPriceListSchemeLine;
		setFeature(Feature.PRICINGPRICELISTSCHEMELINE);
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListVersion</b></em>' feature
	 * @generated
	 */
	public PricingPriceListVersionType getPricingPriceListVersion() {
		return pricingPriceListVersion;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingPriceListVersion() <em>pricingPriceListVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingPriceListVersion() pricingPriceListVersion}' feature.
	 * @generated
	 */
	public void setPricingPriceListVersion(
			PricingPriceListVersionType newPricingPriceListVersion) {
		pricingPriceListVersion = newPricingPriceListVersion;
		setFeature(Feature.PRICINGPRICELISTVERSION);
	}

	/**
	 * Returns the value of '<em><b>pricingProductPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingProductPrice</b></em>' feature
	 * @generated
	 */
	public PricingProductPriceType getPricingProductPrice() {
		return pricingProductPrice;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingProductPrice() <em>pricingProductPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingProductPrice() pricingProductPrice}' feature.
	 * @generated
	 */
	public void setPricingProductPrice(
			PricingProductPriceType newPricingProductPrice) {
		pricingProductPrice = newPricingProductPrice;
		setFeature(Feature.PRICINGPRODUCTPRICE);
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscount</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountType getPricingVolumeDiscount() {
		return pricingVolumeDiscount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingVolumeDiscount() <em>pricingVolumeDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingVolumeDiscount() pricingVolumeDiscount}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscount(
			PricingVolumeDiscountType newPricingVolumeDiscount) {
		pricingVolumeDiscount = newPricingVolumeDiscount;
		setFeature(Feature.PRICINGVOLUMEDISCOUNT);
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountBusinessPartner</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountBusinessPartnerType getPricingVolumeDiscountBusinessPartner() {
		return pricingVolumeDiscountBusinessPartner;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingVolumeDiscountBusinessPartner() <em>pricingVolumeDiscountBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingVolumeDiscountBusinessPartner() pricingVolumeDiscountBusinessPartner}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountBusinessPartner(
			PricingVolumeDiscountBusinessPartnerType newPricingVolumeDiscountBusinessPartner) {
		pricingVolumeDiscountBusinessPartner = newPricingVolumeDiscountBusinessPartner;
		setFeature(Feature.PRICINGVOLUMEDISCOUNTBUSINESSPARTNER);
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountInvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountInvoice</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountInvoiceType getPricingVolumeDiscountInvoice() {
		return pricingVolumeDiscountInvoice;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingVolumeDiscountInvoice() <em>pricingVolumeDiscountInvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingVolumeDiscountInvoice() pricingVolumeDiscountInvoice}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountInvoice(
			PricingVolumeDiscountInvoiceType newPricingVolumeDiscountInvoice) {
		pricingVolumeDiscountInvoice = newPricingVolumeDiscountInvoice;
		setFeature(Feature.PRICINGVOLUMEDISCOUNTINVOICE);
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProduct</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountProductType getPricingVolumeDiscountProduct() {
		return pricingVolumeDiscountProduct;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingVolumeDiscountProduct() <em>pricingVolumeDiscountProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingVolumeDiscountProduct() pricingVolumeDiscountProduct}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProduct(
			PricingVolumeDiscountProductType newPricingVolumeDiscountProduct) {
		pricingVolumeDiscountProduct = newPricingVolumeDiscountProduct;
		setFeature(Feature.PRICINGVOLUMEDISCOUNTPRODUCT);
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProductCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProductCategory</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountProductCategoryType getPricingVolumeDiscountProductCategory() {
		return pricingVolumeDiscountProductCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingVolumeDiscountProductCategory() <em>pricingVolumeDiscountProductCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingVolumeDiscountProductCategory() pricingVolumeDiscountProductCategory}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProductCategory(
			PricingVolumeDiscountProductCategoryType newPricingVolumeDiscountProductCategory) {
		pricingVolumeDiscountProductCategory = newPricingVolumeDiscountProductCategory;
		setFeature(Feature.PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountScale</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountScale</b></em>' feature
	 * @generated
	 */
	public PricingVolumeDiscountScaleType getPricingVolumeDiscountScale() {
		return pricingVolumeDiscountScale;
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingVolumeDiscountScale() <em>pricingVolumeDiscountScale</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingVolumeDiscountScale() pricingVolumeDiscountScale}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountScale(
			PricingVolumeDiscountScaleType newPricingVolumeDiscountScale) {
		pricingVolumeDiscountScale = newPricingVolumeDiscountScale;
		setFeature(Feature.PRICINGVOLUMEDISCOUNTSCALE);
	}

	/**
	 * Returns the value of '<em><b>processExecution</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processExecution</b></em>' feature
	 * @generated
	 */
	public ProcessExecutionType getProcessExecution() {
		return processExecution;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcessExecution() <em>processExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcessExecution() processExecution}' feature.
	 * @generated
	 */
	public void setProcessExecution(ProcessExecutionType newProcessExecution) {
		processExecution = newProcessExecution;
		setFeature(Feature.PROCESSEXECUTION);
	}

	/**
	 * Returns the value of '<em><b>processRequest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRequest</b></em>' feature
	 * @generated
	 */
	public ProcessRequestType getProcessRequest() {
		return processRequest;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcessRequest() <em>processRequest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcessRequest() processRequest}' feature.
	 * @generated
	 */
	public void setProcessRequest(ProcessRequestType newProcessRequest) {
		processRequest = newProcessRequest;
		setFeature(Feature.PROCESSREQUEST);
	}

	/**
	 * Returns the value of '<em><b>processRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRun</b></em>' feature
	 * @generated
	 */
	public ProcessRunType getProcessRun() {
		return processRun;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcessRun() <em>processRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcessRun() processRun}' feature.
	 * @generated
	 */
	public void setProcessRun(ProcessRunType newProcessRun) {
		processRun = newProcessRun;
		setFeature(Feature.PROCESSRUN);
	}

	/**
	 * Returns the value of '<em><b>procurementPOInvoiceMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementPOInvoiceMatch</b></em>' feature
	 * @generated
	 */
	public ProcurementPOInvoiceMatchType getProcurementPOInvoiceMatch() {
		return procurementPOInvoiceMatch;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcurementPOInvoiceMatch() <em>procurementPOInvoiceMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcurementPOInvoiceMatch() procurementPOInvoiceMatch}' feature.
	 * @generated
	 */
	public void setProcurementPOInvoiceMatch(
			ProcurementPOInvoiceMatchType newProcurementPOInvoiceMatch) {
		procurementPOInvoiceMatch = newProcurementPOInvoiceMatch;
		setFeature(Feature.PROCUREMENTPOINVOICEMATCH);
	}

	/**
	 * Returns the value of '<em><b>procurementReceiptInvoiceMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementReceiptInvoiceMatch</b></em>' feature
	 * @generated
	 */
	public ProcurementReceiptInvoiceMatchType getProcurementReceiptInvoiceMatch() {
		return procurementReceiptInvoiceMatch;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcurementReceiptInvoiceMatch() <em>procurementReceiptInvoiceMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcurementReceiptInvoiceMatch() procurementReceiptInvoiceMatch}' feature.
	 * @generated
	 */
	public void setProcurementReceiptInvoiceMatch(
			ProcurementReceiptInvoiceMatchType newProcurementReceiptInvoiceMatch) {
		procurementReceiptInvoiceMatch = newProcurementReceiptInvoiceMatch;
		setFeature(Feature.PROCUREMENTRECEIPTINVOICEMATCH);
	}

	/**
	 * Returns the value of '<em><b>procurementRequisition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisition</b></em>' feature
	 * @generated
	 */
	public ProcurementRequisitionType getProcurementRequisition() {
		return procurementRequisition;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcurementRequisition() <em>procurementRequisition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcurementRequisition() procurementRequisition}' feature.
	 * @generated
	 */
	public void setProcurementRequisition(
			ProcurementRequisitionType newProcurementRequisition) {
		procurementRequisition = newProcurementRequisition;
		setFeature(Feature.PROCUREMENTREQUISITION);
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLine</b></em>' feature
	 * @generated
	 */
	public ProcurementRequisitionLineType getProcurementRequisitionLine() {
		return procurementRequisitionLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcurementRequisitionLine() <em>procurementRequisitionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcurementRequisitionLine() procurementRequisitionLine}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLine(
			ProcurementRequisitionLineType newProcurementRequisitionLine) {
		procurementRequisitionLine = newProcurementRequisitionLine;
		setFeature(Feature.PROCUREMENTREQUISITIONLINE);
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionPOMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionPOMatch</b></em>' feature
	 * @generated
	 */
	public ProcurementRequisitionPOMatchType getProcurementRequisitionPOMatch() {
		return procurementRequisitionPOMatch;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcurementRequisitionPOMatch() <em>procurementRequisitionPOMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcurementRequisitionPOMatch() procurementRequisitionPOMatch}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionPOMatch(
			ProcurementRequisitionPOMatchType newProcurementRequisitionPOMatch) {
		procurementRequisitionPOMatch = newProcurementRequisitionPOMatch;
		setFeature(Feature.PROCUREMENTREQUISITIONPOMATCH);
	}

	/**
	 * Returns the value of '<em><b>product</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>product</b></em>' feature
	 * @generated
	 */
	public ProductType getProduct() {
		return product;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ProductType newProduct) {
		product = newProduct;
		setFeature(Feature.PRODUCT);
	}

	/**
	 * Returns the value of '<em><b>productAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccounts</b></em>' feature
	 * @generated
	 */
	public ProductAccountsType getProductAccounts() {
		return productAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductAccounts() <em>productAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductAccounts() productAccounts}' feature.
	 * @generated
	 */
	public void setProductAccounts(ProductAccountsType newProductAccounts) {
		productAccounts = newProductAccounts;
		setFeature(Feature.PRODUCTACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>productBOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productBOM</b></em>' feature
	 * @generated
	 */
	public ProductBOMType getProductBOM() {
		return productBOM;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductBOM() <em>productBOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductBOM() productBOM}' feature.
	 * @generated
	 */
	public void setProductBOM(ProductBOMType newProductBOM) {
		productBOM = newProductBOM;
		setFeature(Feature.PRODUCTBOM);
	}

	/**
	 * Returns the value of '<em><b>productByPriceAndWarehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productByPriceAndWarehouse</b></em>' feature
	 * @generated
	 */
	public ProductByPriceAndWarehouseType getProductByPriceAndWarehouse() {
		return productByPriceAndWarehouse;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductByPriceAndWarehouse() <em>productByPriceAndWarehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductByPriceAndWarehouse() productByPriceAndWarehouse}' feature.
	 * @generated
	 */
	public void setProductByPriceAndWarehouse(
			ProductByPriceAndWarehouseType newProductByPriceAndWarehouse) {
		productByPriceAndWarehouse = newProductByPriceAndWarehouse;
		setFeature(Feature.PRODUCTBYPRICEANDWAREHOUSE);
	}

	/**
	 * Returns the value of '<em><b>productCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategory</b></em>' feature
	 * @generated
	 */
	public ProductCategoryType getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductCategory() <em>productCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductCategory() productCategory}' feature.
	 * @generated
	 */
	public void setProductCategory(ProductCategoryType newProductCategory) {
		productCategory = newProductCategory;
		setFeature(Feature.PRODUCTCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccounts</b></em>' feature
	 * @generated
	 */
	public ProductCategoryAccountsType getProductCategoryAccounts() {
		return productCategoryAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductCategoryAccounts() <em>productCategoryAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductCategoryAccounts() productCategoryAccounts}' feature.
	 * @generated
	 */
	public void setProductCategoryAccounts(
			ProductCategoryAccountsType newProductCategoryAccounts) {
		productCategoryAccounts = newProductCategoryAccounts;
		setFeature(Feature.PRODUCTCATEGORYACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>productCustomer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCustomer</b></em>' feature
	 * @generated
	 */
	public ProductCustomerType getProductCustomer() {
		return productCustomer;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductCustomer() <em>productCustomer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductCustomer() productCustomer}' feature.
	 * @generated
	 */
	public void setProductCustomer(ProductCustomerType newProductCustomer) {
		productCustomer = newProductCustomer;
		setFeature(Feature.PRODUCTCUSTOMER);
	}

	/**
	 * Returns the value of '<em><b>productOrg</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productOrg</b></em>' feature
	 * @generated
	 */
	public ProductOrgType getProductOrg() {
		return productOrg;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductOrg() <em>productOrg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductOrg() productOrg}' feature.
	 * @generated
	 */
	public void setProductOrg(ProductOrgType newProductOrg) {
		productOrg = newProductOrg;
		setFeature(Feature.PRODUCTORG);
	}

	/**
	 * Returns the value of '<em><b>productStockView</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productStockView</b></em>' feature
	 * @generated
	 */
	public ProductStockViewType getProductStockView() {
		return productStockView;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductStockView() <em>productStockView</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductStockView() productStockView}' feature.
	 * @generated
	 */
	public void setProductStockView(ProductStockViewType newProductStockView) {
		productStockView = newProductStockView;
		setFeature(Feature.PRODUCTSTOCKVIEW);
	}

	/**
	 * Returns the value of '<em><b>productSubstitute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productSubstitute</b></em>' feature
	 * @generated
	 */
	public ProductSubstituteType getProductSubstitute() {
		return productSubstitute;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductSubstitute() <em>productSubstitute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductSubstitute() productSubstitute}' feature.
	 * @generated
	 */
	public void setProductSubstitute(ProductSubstituteType newProductSubstitute) {
		productSubstitute = newProductSubstitute;
		setFeature(Feature.PRODUCTSUBSTITUTE);
	}

	/**
	 * Returns the value of '<em><b>productTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productTrl</b></em>' feature
	 * @generated
	 */
	public ProductTrlType getProductTrl() {
		return productTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductTrl() <em>productTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductTrl() productTrl}' feature.
	 * @generated
	 */
	public void setProductTrl(ProductTrlType newProductTrl) {
		productTrl = newProductTrl;
		setFeature(Feature.PRODUCTTRL);
	}

	/**
	 * Returns the value of '<em><b>productUOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productUOM</b></em>' feature
	 * @generated
	 */
	public ProductUOMType getProductUOM() {
		return productUOM;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductUOM() <em>productUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductUOM() productUOM}' feature.
	 * @generated
	 */
	public void setProductUOM(ProductUOMType newProductUOM) {
		productUOM = newProductUOM;
		setFeature(Feature.PRODUCTUOM);
	}

	/**
	 * Returns the value of '<em><b>project</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>project</b></em>' feature
	 * @generated
	 */
	public ProjectType getProject() {
		return project;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ProjectType newProject) {
		project = newProject;
		setFeature(Feature.PROJECT);
	}

	/**
	 * Returns the value of '<em><b>projectAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccounts</b></em>' feature
	 * @generated
	 */
	public ProjectAccountsType getProjectAccounts() {
		return projectAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectAccounts() <em>projectAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectAccounts() projectAccounts}' feature.
	 * @generated
	 */
	public void setProjectAccounts(ProjectAccountsType newProjectAccounts) {
		projectAccounts = newProjectAccounts;
		setFeature(Feature.PROJECTACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>projectIssue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectIssue</b></em>' feature
	 * @generated
	 */
	public ProjectIssueType getProjectIssue() {
		return projectIssue;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectIssue() <em>projectIssue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectIssue() projectIssue}' feature.
	 * @generated
	 */
	public void setProjectIssue(ProjectIssueType newProjectIssue) {
		projectIssue = newProjectIssue;
		setFeature(Feature.PROJECTISSUE);
	}

	/**
	 * Returns the value of '<em><b>projectLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLine</b></em>' feature
	 * @generated
	 */
	public ProjectLineType getProjectLine() {
		return projectLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectLine() <em>projectLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectLine() projectLine}' feature.
	 * @generated
	 */
	public void setProjectLine(ProjectLineType newProjectLine) {
		projectLine = newProjectLine;
		setFeature(Feature.PROJECTLINE);
	}

	/**
	 * Returns the value of '<em><b>projectPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhase</b></em>' feature
	 * @generated
	 */
	public ProjectPhaseType getProjectPhase() {
		return projectPhase;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(ProjectPhaseType newProjectPhase) {
		projectPhase = newProjectPhase;
		setFeature(Feature.PROJECTPHASE);
	}

	/**
	 * Returns the value of '<em><b>projectProjectProposalTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProjectProposalTask</b></em>' feature
	 * @generated
	 */
	public ProjectProjectProposalTaskType getProjectProjectProposalTask() {
		return projectProjectProposalTask;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectProjectProposalTask() <em>projectProjectProposalTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectProjectProposalTask() projectProjectProposalTask}' feature.
	 * @generated
	 */
	public void setProjectProjectProposalTask(
			ProjectProjectProposalTaskType newProjectProjectProposalTask) {
		projectProjectProposalTask = newProjectProjectProposalTask;
		setFeature(Feature.PROJECTPROJECTPROPOSALTASK);
	}

	/**
	 * Returns the value of '<em><b>projectProposal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposal</b></em>' feature
	 * @generated
	 */
	public ProjectProposalType getProjectProposal() {
		return projectProposal;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectProposal() <em>projectProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectProposal() projectProposal}' feature.
	 * @generated
	 */
	public void setProjectProposal(ProjectProposalType newProjectProposal) {
		projectProposal = newProjectProposal;
		setFeature(Feature.PROJECTPROPOSAL);
	}

	/**
	 * Returns the value of '<em><b>projectProposalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalLine</b></em>' feature
	 * @generated
	 */
	public ProjectProposalLineType getProjectProposalLine() {
		return projectProposalLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectProposalLine() <em>projectProposalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectProposalLine() projectProposalLine}' feature.
	 * @generated
	 */
	public void setProjectProposalLine(
			ProjectProposalLineType newProjectProposalLine) {
		projectProposalLine = newProjectProposalLine;
		setFeature(Feature.PROJECTPROPOSALLINE);
	}

	/**
	 * Returns the value of '<em><b>projectStandardPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardPhase</b></em>' feature
	 * @generated
	 */
	public ProjectStandardPhaseType getProjectStandardPhase() {
		return projectStandardPhase;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectStandardPhase() <em>projectStandardPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectStandardPhase() projectStandardPhase}' feature.
	 * @generated
	 */
	public void setProjectStandardPhase(
			ProjectStandardPhaseType newProjectStandardPhase) {
		projectStandardPhase = newProjectStandardPhase;
		setFeature(Feature.PROJECTSTANDARDPHASE);
	}

	/**
	 * Returns the value of '<em><b>projectStandardTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardTask</b></em>' feature
	 * @generated
	 */
	public ProjectStandardTaskType getProjectStandardTask() {
		return projectStandardTask;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectStandardTask() <em>projectStandardTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectStandardTask() projectStandardTask}' feature.
	 * @generated
	 */
	public void setProjectStandardTask(
			ProjectStandardTaskType newProjectStandardTask) {
		projectStandardTask = newProjectStandardTask;
		setFeature(Feature.PROJECTSTANDARDTASK);
	}

	/**
	 * Returns the value of '<em><b>projectTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectTask</b></em>' feature
	 * @generated
	 */
	public ProjectTaskType getProjectTask() {
		return projectTask;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectTask() <em>projectTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectTask() projectTask}' feature.
	 * @generated
	 */
	public void setProjectTask(ProjectTaskType newProjectTask) {
		projectTask = newProjectTask;
		setFeature(Feature.PROJECTTASK);
	}

	/**
	 * Returns the value of '<em><b>projectType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectType</b></em>' feature
	 * @generated
	 */
	public ProjectTypeType getProjectType() {
		return projectType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectType() <em>projectType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectType() projectType}' feature.
	 * @generated
	 */
	public void setProjectType(ProjectTypeType newProjectType) {
		projectType = newProjectType;
		setFeature(Feature.PROJECTTYPE);
	}

	/**
	 * Returns the value of '<em><b>projectVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectVendor</b></em>' feature
	 * @generated
	 */
	public ProjectVendorType getProjectVendor() {
		return projectVendor;
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectVendor() <em>projectVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectVendor() projectVendor}' feature.
	 * @generated
	 */
	public void setProjectVendor(ProjectVendorType newProjectVendor) {
		projectVendor = newProjectVendor;
		setFeature(Feature.PROJECTVENDOR);
	}

	/**
	 * Returns the value of '<em><b>referenceDataStore</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceDataStore</b></em>' feature
	 * @generated
	 */
	public ReferenceDataStoreType getReferenceDataStore() {
		return referenceDataStore;
	}

	/**
	 * Sets the '{@link OpenbravoType#getReferenceDataStore() <em>referenceDataStore</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReferenceDataStore() referenceDataStore}' feature.
	 * @generated
	 */
	public void setReferenceDataStore(
			ReferenceDataStoreType newReferenceDataStore) {
		referenceDataStore = newReferenceDataStore;
		setFeature(Feature.REFERENCEDATASTORE);
	}

	/**
	 * Returns the value of '<em><b>region</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>region</b></em>' feature
	 * @generated
	 */
	public RegionType getRegion() {
		return region;
	}

	/**
	 * Sets the '{@link OpenbravoType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(RegionType newRegion) {
		region = newRegion;
		setFeature(Feature.REGION);
	}

	/**
	 * Returns the value of '<em><b>resource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resource</b></em>' feature
	 * @generated
	 */
	public ResourceType getResource() {
		return resource;
	}

	/**
	 * Sets the '{@link OpenbravoType#getResource() <em>resource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getResource() resource}' feature.
	 * @generated
	 */
	public void setResource(ResourceType newResource) {
		resource = newResource;
		setFeature(Feature.RESOURCE);
	}

	/**
	 * Returns the value of '<em><b>resourceAssignment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceAssignment</b></em>' feature
	 * @generated
	 */
	public ResourceAssignmentType getResourceAssignment() {
		return resourceAssignment;
	}

	/**
	 * Sets the '{@link OpenbravoType#getResourceAssignment() <em>resourceAssignment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getResourceAssignment() resourceAssignment}' feature.
	 * @generated
	 */
	public void setResourceAssignment(
			ResourceAssignmentType newResourceAssignment) {
		resourceAssignment = newResourceAssignment;
		setFeature(Feature.RESOURCEASSIGNMENT);
	}

	/**
	 * Returns the value of '<em><b>resourceType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceType</b></em>' feature
	 * @generated
	 */
	public ResourceTypeType getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getResourceType() <em>resourceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getResourceType() resourceType}' feature.
	 * @generated
	 */
	public void setResourceType(ResourceTypeType newResourceType) {
		resourceType = newResourceType;
		setFeature(Feature.RESOURCETYPE);
	}

	/**
	 * Returns the value of '<em><b>resourceUnAvailable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceUnAvailable</b></em>' feature
	 * @generated
	 */
	public ResourceUnAvailableType getResourceUnAvailable() {
		return resourceUnAvailable;
	}

	/**
	 * Sets the '{@link OpenbravoType#getResourceUnAvailable() <em>resourceUnAvailable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getResourceUnAvailable() resourceUnAvailable}' feature.
	 * @generated
	 */
	public void setResourceUnAvailable(
			ResourceUnAvailableType newResourceUnAvailable) {
		resourceUnAvailable = newResourceUnAvailable;
		setFeature(Feature.RESOURCEUNAVAILABLE);
	}

	/**
	 * Returns the value of '<em><b>returnMaterialOrderPickEditLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialOrderPickEditLines</b></em>' feature
	 * @generated
	 */
	public ReturnMaterialOrderPickEditLinesType getReturnMaterialOrderPickEditLines() {
		return returnMaterialOrderPickEditLines;
	}

	/**
	 * Sets the '{@link OpenbravoType#getReturnMaterialOrderPickEditLines() <em>returnMaterialOrderPickEditLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReturnMaterialOrderPickEditLines() returnMaterialOrderPickEditLines}' feature.
	 * @generated
	 */
	public void setReturnMaterialOrderPickEditLines(
			ReturnMaterialOrderPickEditLinesType newReturnMaterialOrderPickEditLines) {
		returnMaterialOrderPickEditLines = newReturnMaterialOrderPickEditLines;
		setFeature(Feature.RETURNMATERIALORDERPICKEDITLINES);
	}

	/**
	 * Returns the value of '<em><b>returnMaterialReceiptPickEdit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialReceiptPickEdit</b></em>' feature
	 * @generated
	 */
	public ReturnMaterialReceiptPickEditType getReturnMaterialReceiptPickEdit() {
		return returnMaterialReceiptPickEdit;
	}

	/**
	 * Sets the '{@link OpenbravoType#getReturnMaterialReceiptPickEdit() <em>returnMaterialReceiptPickEdit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReturnMaterialReceiptPickEdit() returnMaterialReceiptPickEdit}' feature.
	 * @generated
	 */
	public void setReturnMaterialReceiptPickEdit(
			ReturnMaterialReceiptPickEditType newReturnMaterialReceiptPickEdit) {
		returnMaterialReceiptPickEdit = newReturnMaterialReceiptPickEdit;
		setFeature(Feature.RETURNMATERIALRECEIPTPICKEDIT);
	}

	/**
	 * Returns the value of '<em><b>returnMaterialShipmentPickEdit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialShipmentPickEdit</b></em>' feature
	 * @generated
	 */
	public ReturnMaterialShipmentPickEditType getReturnMaterialShipmentPickEdit() {
		return returnMaterialShipmentPickEdit;
	}

	/**
	 * Sets the '{@link OpenbravoType#getReturnMaterialShipmentPickEdit() <em>returnMaterialShipmentPickEdit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReturnMaterialShipmentPickEdit() returnMaterialShipmentPickEdit}' feature.
	 * @generated
	 */
	public void setReturnMaterialShipmentPickEdit(
			ReturnMaterialShipmentPickEditType newReturnMaterialShipmentPickEdit) {
		returnMaterialShipmentPickEdit = newReturnMaterialShipmentPickEdit;
		setFeature(Feature.RETURNMATERIALSHIPMENTPICKEDIT);
	}

	/**
	 * Returns the value of '<em><b>returnReason</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnReason</b></em>' feature
	 * @generated
	 */
	public ReturnReasonType getReturnReason() {
		return returnReason;
	}

	/**
	 * Sets the '{@link OpenbravoType#getReturnReason() <em>returnReason</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReturnReason() returnReason}' feature.
	 * @generated
	 */
	public void setReturnReason(ReturnReasonType newReturnReason) {
		returnReason = newReturnReason;
		setFeature(Feature.RETURNREASON);
	}

	/**
	 * Returns the value of '<em><b>reversedInvoices</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reversedInvoices</b></em>' feature
	 * @generated
	 */
	public ReversedInvoicesType getReversedInvoices() {
		return reversedInvoices;
	}

	/**
	 * Sets the '{@link OpenbravoType#getReversedInvoices() <em>reversedInvoices</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReversedInvoices() reversedInvoices}' feature.
	 * @generated
	 */
	public void setReversedInvoices(ReversedInvoicesType newReversedInvoices) {
		reversedInvoices = newReversedInvoices;
		setFeature(Feature.REVERSEDINVOICES);
	}

	/**
	 * Returns the value of '<em><b>sQLScript</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sQLScript</b></em>' feature
	 * @generated
	 */
	public SQLScriptType getSQLScript() {
		return sQLScript;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSQLScript() <em>sQLScript</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSQLScript() sQLScript}' feature.
	 * @generated
	 */
	public void setSQLScript(SQLScriptType newSQLScript) {
		sQLScript = newSQLScript;
		setFeature(Feature.SQLSCRIPT);
	}

	/**
	 * Returns the value of '<em><b>salaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategory</b></em>' feature
	 * @generated
	 */
	public SalaryCategoryType getSalaryCategory() {
		return salaryCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalaryCategory() <em>salaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalaryCategory() salaryCategory}' feature.
	 * @generated
	 */
	public void setSalaryCategory(SalaryCategoryType newSalaryCategory) {
		salaryCategory = newSalaryCategory;
		setFeature(Feature.SALARYCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>salaryCategoryCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategoryCost</b></em>' feature
	 * @generated
	 */
	public SalaryCategoryCostType getSalaryCategoryCost() {
		return salaryCategoryCost;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalaryCategoryCost() <em>salaryCategoryCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalaryCategoryCost() salaryCategoryCost}' feature.
	 * @generated
	 */
	public void setSalaryCategoryCost(
			SalaryCategoryCostType newSalaryCategoryCost) {
		salaryCategoryCost = newSalaryCategoryCost;
		setFeature(Feature.SALARYCATEGORYCOST);
	}

	/**
	 * Returns the value of '<em><b>salesCommission</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommission</b></em>' feature
	 * @generated
	 */
	public SalesCommissionType getSalesCommission() {
		return salesCommission;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesCommission() <em>salesCommission</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesCommission() salesCommission}' feature.
	 * @generated
	 */
	public void setSalesCommission(SalesCommissionType newSalesCommission) {
		salesCommission = newSalesCommission;
		setFeature(Feature.SALESCOMMISSION);
	}

	/**
	 * Returns the value of '<em><b>salesCommissionAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionAmount</b></em>' feature
	 * @generated
	 */
	public SalesCommissionAmountType getSalesCommissionAmount() {
		return salesCommissionAmount;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesCommissionAmount() <em>salesCommissionAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesCommissionAmount() salesCommissionAmount}' feature.
	 * @generated
	 */
	public void setSalesCommissionAmount(
			SalesCommissionAmountType newSalesCommissionAmount) {
		salesCommissionAmount = newSalesCommissionAmount;
		setFeature(Feature.SALESCOMMISSIONAMOUNT);
	}

	/**
	 * Returns the value of '<em><b>salesCommissionDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionDetail</b></em>' feature
	 * @generated
	 */
	public SalesCommissionDetailType getSalesCommissionDetail() {
		return salesCommissionDetail;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesCommissionDetail() <em>salesCommissionDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesCommissionDetail() salesCommissionDetail}' feature.
	 * @generated
	 */
	public void setSalesCommissionDetail(
			SalesCommissionDetailType newSalesCommissionDetail) {
		salesCommissionDetail = newSalesCommissionDetail;
		setFeature(Feature.SALESCOMMISSIONDETAIL);
	}

	/**
	 * Returns the value of '<em><b>salesCommissionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionLine</b></em>' feature
	 * @generated
	 */
	public SalesCommissionLineType getSalesCommissionLine() {
		return salesCommissionLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesCommissionLine() <em>salesCommissionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesCommissionLine() salesCommissionLine}' feature.
	 * @generated
	 */
	public void setSalesCommissionLine(
			SalesCommissionLineType newSalesCommissionLine) {
		salesCommissionLine = newSalesCommissionLine;
		setFeature(Feature.SALESCOMMISSIONLINE);
	}

	/**
	 * Returns the value of '<em><b>salesCommissionRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionRun</b></em>' feature
	 * @generated
	 */
	public SalesCommissionRunType getSalesCommissionRun() {
		return salesCommissionRun;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesCommissionRun() <em>salesCommissionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesCommissionRun() salesCommissionRun}' feature.
	 * @generated
	 */
	public void setSalesCommissionRun(
			SalesCommissionRunType newSalesCommissionRun) {
		salesCommissionRun = newSalesCommissionRun;
		setFeature(Feature.SALESCOMMISSIONRUN);
	}

	/**
	 * Returns the value of '<em><b>salesRegion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRegion</b></em>' feature
	 * @generated
	 */
	public SalesRegionType getSalesRegion() {
		return salesRegion;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(SalesRegionType newSalesRegion) {
		salesRegion = newSalesRegion;
		setFeature(Feature.SALESREGION);
	}

	/**
	 * Returns the value of '<em><b>serialNumberControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serialNumberControl</b></em>' feature
	 * @generated
	 */
	public SerialNumberControlType getSerialNumberControl() {
		return serialNumberControl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getSerialNumberControl() <em>serialNumberControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSerialNumberControl() serialNumberControl}' feature.
	 * @generated
	 */
	public void setSerialNumberControl(
			SerialNumberControlType newSerialNumberControl) {
		serialNumberControl = newSerialNumberControl;
		setFeature(Feature.SERIALNUMBERCONTROL);
	}

	/**
	 * Returns the value of '<em><b>shippingFreightCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingFreightCategory</b></em>' feature
	 * @generated
	 */
	public ShippingFreightCategoryType getShippingFreightCategory() {
		return shippingFreightCategory;
	}

	/**
	 * Sets the '{@link OpenbravoType#getShippingFreightCategory() <em>shippingFreightCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getShippingFreightCategory() shippingFreightCategory}' feature.
	 * @generated
	 */
	public void setShippingFreightCategory(
			ShippingFreightCategoryType newShippingFreightCategory) {
		shippingFreightCategory = newShippingFreightCategory;
		setFeature(Feature.SHIPPINGFREIGHTCATEGORY);
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompany</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompany</b></em>' feature
	 * @generated
	 */
	public ShippingShippingCompanyType getShippingShippingCompany() {
		return shippingShippingCompany;
	}

	/**
	 * Sets the '{@link OpenbravoType#getShippingShippingCompany() <em>shippingShippingCompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getShippingShippingCompany() shippingShippingCompany}' feature.
	 * @generated
	 */
	public void setShippingShippingCompany(
			ShippingShippingCompanyType newShippingShippingCompany) {
		shippingShippingCompany = newShippingShippingCompany;
		setFeature(Feature.SHIPPINGSHIPPINGCOMPANY);
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyFreight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyFreight</b></em>' feature
	 * @generated
	 */
	public ShippingShippingCompanyFreightType getShippingShippingCompanyFreight() {
		return shippingShippingCompanyFreight;
	}

	/**
	 * Sets the '{@link OpenbravoType#getShippingShippingCompanyFreight() <em>shippingShippingCompanyFreight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getShippingShippingCompanyFreight() shippingShippingCompanyFreight}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyFreight(
			ShippingShippingCompanyFreightType newShippingShippingCompanyFreight) {
		shippingShippingCompanyFreight = newShippingShippingCompanyFreight;
		setFeature(Feature.SHIPPINGSHIPPINGCOMPANYFREIGHT);
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheet</b></em>' feature
	 * @generated
	 */
	public TimeAndExpenseSheetType getTimeAndExpenseSheet() {
		return timeAndExpenseSheet;
	}

	/**
	 * Sets the '{@link OpenbravoType#getTimeAndExpenseSheet() <em>timeAndExpenseSheet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getTimeAndExpenseSheet() timeAndExpenseSheet}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheet(
			TimeAndExpenseSheetType newTimeAndExpenseSheet) {
		timeAndExpenseSheet = newTimeAndExpenseSheet;
		setFeature(Feature.TIMEANDEXPENSESHEET);
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLine</b></em>' feature
	 * @generated
	 */
	public TimeAndExpenseSheetLineType getTimeAndExpenseSheetLine() {
		return timeAndExpenseSheetLine;
	}

	/**
	 * Sets the '{@link OpenbravoType#getTimeAndExpenseSheetLine() <em>timeAndExpenseSheetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getTimeAndExpenseSheetLine() timeAndExpenseSheetLine}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLine(
			TimeAndExpenseSheetLineType newTimeAndExpenseSheetLine) {
		timeAndExpenseSheetLine = newTimeAndExpenseSheetLine;
		setFeature(Feature.TIMEANDEXPENSESHEETLINE);
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineV</b></em>' feature
	 * @generated
	 */
	public TimeAndExpenseSheetLineVType getTimeAndExpenseSheetLineV() {
		return timeAndExpenseSheetLineV;
	}

	/**
	 * Sets the '{@link OpenbravoType#getTimeAndExpenseSheetLineV() <em>timeAndExpenseSheetLineV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getTimeAndExpenseSheetLineV() timeAndExpenseSheetLineV}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineV(
			TimeAndExpenseSheetLineVType newTimeAndExpenseSheetLineV) {
		timeAndExpenseSheetLineV = newTimeAndExpenseSheetLineV;
		setFeature(Feature.TIMEANDEXPENSESHEETLINEV);
	}

	/**
	 * Returns the value of '<em><b>timeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeType</b></em>' feature
	 * @generated
	 */
	public TimeTypeType getTimeType() {
		return timeType;
	}

	/**
	 * Sets the '{@link OpenbravoType#getTimeType() <em>timeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getTimeType() timeType}' feature.
	 * @generated
	 */
	public void setTimeType(TimeTypeType newTimeType) {
		timeType = newTimeType;
		setFeature(Feature.TIMETYPE);
	}

	/**
	 * Returns the value of '<em><b>uOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOM</b></em>' feature
	 * @generated
	 */
	public UOMType getUOM() {
		return uOM;
	}

	/**
	 * Sets the '{@link OpenbravoType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(UOMType newUOM) {
		uOM = newUOM;
		setFeature(Feature.UOM);
	}

	/**
	 * Returns the value of '<em><b>uOMConversion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMConversion</b></em>' feature
	 * @generated
	 */
	public UOMConversionType getUOMConversion() {
		return uOMConversion;
	}

	/**
	 * Sets the '{@link OpenbravoType#getUOMConversion() <em>uOMConversion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getUOMConversion() uOMConversion}' feature.
	 * @generated
	 */
	public void setUOMConversion(UOMConversionType newUOMConversion) {
		uOMConversion = newUOMConversion;
		setFeature(Feature.UOMCONVERSION);
	}

	/**
	 * Returns the value of '<em><b>uOMTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMTrl</b></em>' feature
	 * @generated
	 */
	public UOMTrlType getUOMTrl() {
		return uOMTrl;
	}

	/**
	 * Sets the '{@link OpenbravoType#getUOMTrl() <em>uOMTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getUOMTrl() uOMTrl}' feature.
	 * @generated
	 */
	public void setUOMTrl(UOMTrlType newUOMTrl) {
		uOMTrl = newUOMTrl;
		setFeature(Feature.UOMTRL);
	}

	/**
	 * Returns the value of '<em><b>vendorAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccounts</b></em>' feature
	 * @generated
	 */
	public VendorAccountsType getVendorAccounts() {
		return vendorAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getVendorAccounts() <em>vendorAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getVendorAccounts() vendorAccounts}' feature.
	 * @generated
	 */
	public void setVendorAccounts(VendorAccountsType newVendorAccounts) {
		vendorAccounts = newVendorAccounts;
		setFeature(Feature.VENDORACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>warehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouse</b></em>' feature
	 * @generated
	 */
	public WarehouseType getWarehouse() {
		return warehouse;
	}

	/**
	 * Sets the '{@link OpenbravoType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(WarehouseType newWarehouse) {
		warehouse = newWarehouse;
		setFeature(Feature.WAREHOUSE);
	}

	/**
	 * Returns the value of '<em><b>warehouseAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccounts</b></em>' feature
	 * @generated
	 */
	public WarehouseAccountsType getWarehouseAccounts() {
		return warehouseAccounts;
	}

	/**
	 * Sets the '{@link OpenbravoType#getWarehouseAccounts() <em>warehouseAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getWarehouseAccounts() warehouseAccounts}' feature.
	 * @generated
	 */
	public void setWarehouseAccounts(WarehouseAccountsType newWarehouseAccounts) {
		warehouseAccounts = newWarehouseAccounts;
		setFeature(Feature.WAREHOUSEACCOUNTS);
	}

	/**
	 * Returns the value of '<em><b>warehouseShipper</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseShipper</b></em>' feature
	 * @generated
	 */
	public WarehouseShipperType getWarehouseShipper() {
		return warehouseShipper;
	}

	/**
	 * Sets the '{@link OpenbravoType#getWarehouseShipper() <em>warehouseShipper</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getWarehouseShipper() warehouseShipper}' feature.
	 * @generated
	 */
	public void setWarehouseShipper(WarehouseShipperType newWarehouseShipper) {
		warehouseShipper = newWarehouseShipper;
		setFeature(Feature.WAREHOUSESHIPPER);
	}

	/**
	 * Returns the value of '<em><b>obuiappViewRoleAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obuiappViewRoleAccess</b></em>' feature
	 * @generated
	 */
	public ObuiappViewRoleAccessType getObuiappViewRoleAccess() {
		return obuiappViewRoleAccess;
	}

	/**
	 * Sets the '{@link OpenbravoType#getObuiappViewRoleAccess() <em>obuiappViewRoleAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getObuiappViewRoleAccess() obuiappViewRoleAccess}' feature.
	 * @generated
	 */
	public void setObuiappViewRoleAccess(
			ObuiappViewRoleAccessType newObuiappViewRoleAccess) {
		obuiappViewRoleAccess = newObuiappViewRoleAccess;
		setFeature(Feature.OBUIAPPVIEWROLEACCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of this feature map entry. The type of the returned value is based on the feature.
	 * @see #getFeature()
	 * @generated 
	 */
	public Object getValue() {
		switch (getFeature()) {
		case ADACCTPROCESS:
			return getADAcctProcess();
		case ADALERT:
			return getADAlert();
		case ADALERTRECIPIENT:
			return getADAlertRecipient();
		case ADALERTRULE:
			return getADAlertRule();
		case ADALERTRULETRL:
			return getADAlertRuleTrl();
		case ADATTACHMENT:
			return getADAttachment();
		case ADAUXILIARYINPUT:
			return getADAuxiliaryInput();
		case ADCALLOUT:
			return getADCallout();
		case ADCLIENT:
			return getADClient();
		case ADCLIENTMODULE:
			return getADClientModule();
		case ADCOLUMN:
			return getADColumn();
		case ADEPINSTANCEPARA:
			return getADEPInstancePara();
		case ADEPPROCEDURES:
			return getADEPProcedures();
		case ADELEMENT:
			return getADElement();
		case ADELEMENTTRL:
			return getADElementTrl();
		case ADERRORLOG:
			return getADErrorLog();
		case ADEXTENSIONPOINTS:
			return getADExtensionPoints();
		case ADFIELD:
			return getADField();
		case ADFIELDGROUP:
			return getADFieldGroup();
		case ADFIELDGROUPTRL:
			return getADFieldGroupTrl();
		case ADFIELDTRL:
			return getADFieldTrl();
		case ADFILETYPE:
			return getADFileType();
		case ADFORM:
			return getADForm();
		case ADFORMACCESS:
			return getADFormAccess();
		case ADFORMTRL:
			return getADFormTrl();
		case ADHEARTBEATLOG:
			return getADHeartbeatLog();
		case ADHEARTBEATLOGCUSTOMQUERY:
			return getADHeartbeatLogCustomQuery();
		case ADHEARTBEATLOGCUSTOMQUERYROW:
			return getADHeartbeatLogCustomQueryRow();
		case ADIMAGE:
			return getADImage();
		case ADLANGUAGE:
			return getADLanguage();
		case ADLIST:
			return getADList();
		case ADLISTTRL:
			return getADListTrl();
		case ADMENU:
			return getADMenu();
		case ADMENUTRL:
			return getADMenuTrl();
		case ADMESSAGE:
			return getADMessage();
		case ADMESSAGETRL:
			return getADMessageTrl();
		case ADMODELIMPLEMENTATION:
			return getADModelImplementation();
		case ADMODELIMPLEMENTATIONMAPPING:
			return getADModelImplementationMapping();
		case ADMODULE:
			return getADModule();
		case ADMODULEDBPREFIXINSTALL:
			return getADModuleDBPrefixInstall();
		case ADMODULEDEPENDENCYINST:
			return getADModuleDependencyInst();
		case ADMODULEINSTALL:
			return getADModuleInstall();
		case ADMODULEMERGE:
			return getADModuleMerge();
		case ADMONTH:
			return getADMonth();
		case ADMONTHTRL:
			return getADMonthTrl();
		case ADORGMODULE:
			return getADOrgModule();
		case ADPARAMETER:
			return getADParameter();
		case ADPREFERENCE:
			return getADPreference();
		case ADPROCESS:
			return getADProcess();
		case ADPROCESSACCESS:
			return getADProcessAccess();
		case ADPROCESSINSTANCE:
			return getADProcessInstance();
		case ADPROCESSPARAMETER:
			return getADProcessParameter();
		case ADPROCESSPARAMETERTRL:
			return getADProcessParameterTrl();
		case ADPROCESSSCHEDULING:
			return getADProcessScheduling();
		case ADPROCESSTRL:
			return getADProcessTrl();
		case ADREFERENCE:
			return getADReference();
		case ADREFERENCETRL:
			return getADReferenceTrl();
		case ADREFERENCEDTABLE:
			return getADReferencedTable();
		case ADREGISTRATION:
			return getADRegistration();
		case ADROLE:
			return getADRole();
		case ADROLEORGANIZATION:
			return getADRoleOrganization();
		case ADSELECTOR:
			return getADSelector();
		case ADSELECTORCOLUMN:
			return getADSelectorColumn();
		case ADSEQUENCE:
			return getADSequence();
		case ADSESSION:
			return getADSession();
		case ADSESSIONSTATUS:
			return getADSessionStatus();
		case ADSESSIONUSAGEAUDIT:
			return getADSessionUsageAudit();
		case ADSYSTEM:
			return getADSystem();
		case ADSYSTEMINFORMATION:
			return getADSystemInformation();
		case ADTAB:
			return getADTab();
		case ADTABTRL:
			return getADTabTrl();
		case ADTABLE:
			return getADTable();
		case ADTABLEACCESS:
			return getADTableAccess();
		case ADTABLEPOSTV:
			return getADTablePostV();
		case ADTEXTINTERFACE:
			return getADTextInterface();
		case ADTEXTINTERFACETRL:
			return getADTextInterfaceTrl();
		case ADTREE:
			return getADTree();
		case ADTREENODE:
			return getADTreeNode();
		case ADUSER:
			return getADUser();
		case ADUSERROLES:
			return getADUserRoles();
		case ADVALIDATION:
			return getADValidation();
		case ADWINDOW:
			return getADWindow();
		case ADWINDOWACCESS:
			return getADWindowAccess();
		case ADWINDOWTRL:
			return getADWindowTrl();
		case ADAUDITTRAIL:
			return getADAuditTrail();
		case ADAUDITTRAILRAW:
			return getADAuditTrailRaw();
		case ADCREATEFACTTEMPLATE:
			return getADCreateFactTemplate();
		case APRMFINACCTRANSACTIONACCTV:
			return getAPRMFinAccTransactionAcctV();
		case APRMFINACCTRANSACTIONV:
			return getAPRMFinaccTransactionV();
		case APRMFINACCTRXFULLACCTV:
			return getAPRMFinaccTrxFullAcctV();
		case APRMPENDINGPAYMENTINVOICE:
			return getAPRMPendingPaymentInvoice();
		case APRMRECDETAILV:
			return getAPRMRecDetailV();
		case APRMRECONCILIATION:
			return getAPRMReconciliation();
		case ACCTSCHEMATABLEDOCTYPE:
			return getAcctSchemaTableDocType();
		case ACTIVEPROPOSALV:
			return getActiveProposalV();
		case APPROVEDVENDOR:
			return getApprovedVendor();
		case ATTRIBUTE:
			return getAttribute();
		case ATTRIBUTEINSTANCE:
			return getAttributeInstance();
		case ATTRIBUTESET:
			return getAttributeSet();
		case ATTRIBUTESETINSTANCE:
			return getAttributeSetInstance();
		case ATTRIBUTEUSE:
			return getAttributeUse();
		case ATTRIBUTEVALUE:
			return getAttributeValue();
		case BANK:
			return getBank();
		case BANKACCOUNT:
			return getBankAccount();
		case BANKACCOUNTACCOUNTS:
			return getBankAccountAccounts();
		case BUSINESSPARTNER:
			return getBusinessPartner();
		case BUSINESSPARTNERBANKACCOUNT:
			return getBusinessPartnerBankAccount();
		case BUSINESSPARTNERCATEGORY:
			return getBusinessPartnerCategory();
		case BUSINESSPARTNERCATEGORYACCOUNT:
			return getBusinessPartnerCategoryAccount();
		case BUSINESSPARTNERDISCOUNT:
			return getBusinessPartnerDiscount();
		case BUSINESSPARTNERLOCATION:
			return getBusinessPartnerLocation();
		case BUSINESSPARTNERPRODUCTTEMPLATE:
			return getBusinessPartnerProductTemplate();
		case BUSINESSPARTNERTAXCATEGORY:
			return getBusinessPartnerTaxCategory();
		case BUSINESSPARTNERWITHHOLDING:
			return getBusinessPartnerWithholding();
		case CACCTSCHEMAPROCESS:
			return getCAcctSchemaProcess();
		case CITY:
			return getCity();
		case CLIENTINFORMATION:
			return getClientInformation();
		case CONDITIONGOODS:
			return getConditionGoods();
		case CONTACTEMAILINTERACTION:
			return getContactEmailInteraction();
		case COUNTRY:
			return getCountry();
		case COUNTRYTRL:
			return getCountryTrl();
		case CURRENCY:
			return getCurrency();
		case CURRENCYCONVERSIONRATE:
			return getCurrencyConversionRate();
		case CURRENCYCONVERSIONRATEDOC:
			return getCurrencyConversionRateDoc();
		case CURRENCYTRL:
			return getCurrencyTrl();
		case CUSTOMERACCOUNTS:
			return getCustomerAccounts();
		case DATAPACKAGE:
			return getDataPackage();
		case DATASET:
			return getDataSet();
		case DATASETCOLUMN:
			return getDataSetColumn();
		case DATASETTABLE:
			return getDataSetTable();
		case DOCUMENTTEMPLATE:
			return getDocumentTemplate();
		case DOCUMENTTYPE:
			return getDocumentType();
		case DOCUMENTTYPETRL:
			return getDocumentTypeTrl();
		case EMAILINTERACTION:
			return getEmailInteraction();
		case EMAILSERVERCONFIGURATION:
			return getEmailServerConfiguration();
		case EMAILTEMPLATE:
			return getEmailTemplate();
		case EMPLOYEEACCOUNTS:
			return getEmployeeAccounts();
		case EMPLOYEESALARYCATEGORY:
			return getEmployeeSalaryCategory();
		case EXPENSETYPE:
			return getExpenseType();
		case EXTERNALPOS:
			return getExternalPOS();
		case EXTERNALPOSCATEGORY:
			return getExternalPOSCategory();
		case EXTERNALPOSPRODUCT:
			return getExternalPOSProduct();
		case FINBANKSTATEMENT:
			return getFINBankStatement();
		case FINBANKSTATEMENTLINE:
			return getFINBankStatementLine();
		case FINFINACCTRANSACTION:
			return getFINFinaccTransaction();
		case FINFINANCIALACCOUNT:
			return getFINFinancialAccount();
		case FINFINANCIALACCOUNTACCT:
			return getFINFinancialAccountAcct();
		case FINPAYMENT:
			return getFINPayment();
		case FINPAYMENTMETHOD:
			return getFINPaymentMethod();
		case FINPAYMENTCREDIT:
			return getFINPaymentCredit();
		case FINPAYMENTDETAIL:
			return getFINPaymentDetail();
		case FINPAYMENTDETAILV:
			return getFINPaymentDetailV();
		case FINPAYMENTPRIORITY:
			return getFINPaymentPriority();
		case FINPAYMENTPROPDETAIL:
			return getFINPaymentPropDetail();
		case FINPAYMENTPROPDETAILV:
			return getFINPaymentPropDetailV();
		case FINPAYMENTPROPOSAL:
			return getFINPaymentProposal();
		case FINPAYMENTSCHEDINVV:
			return getFINPaymentSchedInvV();
		case FINPAYMENTSCHEDORDV:
			return getFINPaymentSchedOrdV();
		case FINPAYMENTSCHEDULE:
			return getFINPaymentSchedule();
		case FINPAYMENTSCHEDULEDETAIL:
			return getFINPaymentScheduleDetail();
		case FINRECONCILIATION:
			return getFINReconciliation();
		case FINRECONCILIATIONLINETEMP:
			return getFINReconciliationLineTemp();
		case FINRECONCILIATIONLINEV:
			return getFINReconciliationLineV();
		case FINANCIALMGMTACCOUNTINGCOMBINATION:
			return getFinancialMgmtAccountingCombination();
		case FINANCIALMGMTACCOUNTINGFACT:
			return getFinancialMgmtAccountingFact();
		case FINANCIALMGMTACCOUNTINGREPORT:
			return getFinancialMgmtAccountingReport();
		case FINANCIALMGMTACCOUNTINGRPTELEMENT:
			return getFinancialMgmtAccountingRptElement();
		case FINANCIALMGMTACCTCFS:
			return getFinancialMgmtAcctCFS();
		case FINANCIALMGMTACCTRPTGROUP:
			return getFinancialMgmtAcctRptGroup();
		case FINANCIALMGMTACCTRPTNODE:
			return getFinancialMgmtAcctRptNode();
		case FINANCIALMGMTACCTSCHEMA:
			return getFinancialMgmtAcctSchema();
		case FINANCIALMGMTACCTSCHEMADEFAULT:
			return getFinancialMgmtAcctSchemaDefault();
		case FINANCIALMGMTACCTSCHEMAELEMENT:
			return getFinancialMgmtAcctSchemaElement();
		case FINANCIALMGMTACCTSCHEMAGL:
			return getFinancialMgmtAcctSchemaGL();
		case FINANCIALMGMTACCTSCHEMATABLE:
			return getFinancialMgmtAcctSchemaTable();
		case FINANCIALMGMTAMORTIZATION:
			return getFinancialMgmtAmortization();
		case FINANCIALMGMTAMORTIZATIONLINE:
			return getFinancialMgmtAmortizationLine();
		case FINANCIALMGMTASSET:
			return getFinancialMgmtAsset();
		case FINANCIALMGMTASSETACCOUNTS:
			return getFinancialMgmtAssetAccounts();
		case FINANCIALMGMTASSETGROUP:
			return getFinancialMgmtAssetGroup();
		case FINANCIALMGMTASSETGROUPACCT:
			return getFinancialMgmtAssetGroupAcct();
		case FINANCIALMGMTBANKFILEFORMAT:
			return getFinancialMgmtBankFileFormat();
		case FINANCIALMGMTBANKSTATEMENT:
			return getFinancialMgmtBankStatement();
		case FINANCIALMGMTBANKSTATEMENTLINE:
			return getFinancialMgmtBankStatementLine();
		case FINANCIALMGMTBUDGET:
			return getFinancialMgmtBudget();
		case FINANCIALMGMTBUDGETLINE:
			return getFinancialMgmtBudgetLine();
		case FINANCIALMGMTCALENDAR:
			return getFinancialMgmtCalendar();
		case FINANCIALMGMTCASHBOOK:
			return getFinancialMgmtCashBook();
		case FINANCIALMGMTCASHBOOKACCOUNTS:
			return getFinancialMgmtCashBookAccounts();
		case FINANCIALMGMTCASHJOURNAL:
			return getFinancialMgmtCashJournal();
		case FINANCIALMGMTDPMANAGEMENT:
			return getFinancialMgmtDPManagement();
		case FINANCIALMGMTDPMANAGEMENTLINE:
			return getFinancialMgmtDPManagementLine();
		case FINANCIALMGMTDEBTPAYMENT:
			return getFinancialMgmtDebtPayment();
		case FINANCIALMGMTDEBTPAYMENTBALREPLACE:
			return getFinancialMgmtDebtPaymentBalReplace();
		case FINANCIALMGMTDEBTPAYMENTBALANCING:
			return getFinancialMgmtDebtPaymentBalancing();
		case FINANCIALMGMTDEBTPAYMENTCANCELV:
			return getFinancialMgmtDebtPaymentCancelV();
		case FINANCIALMGMTDEBTPAYMENTGENERATEV:
			return getFinancialMgmtDebtPaymentGenerateV();
		case FINANCIALMGMTDIMENSION:
			return getFinancialMgmtDimension();
		case FINANCIALMGMTELEMENT:
			return getFinancialMgmtElement();
		case FINANCIALMGMTELEMENTVALUE:
			return getFinancialMgmtElementValue();
		case FINANCIALMGMTELEMENTVALUEOPERAND:
			return getFinancialMgmtElementValueOperand();
		case FINANCIALMGMTELEMENTVALUETRL:
			return getFinancialMgmtElementValueTrl();
		case FINANCIALMGMTFINACCPAYMENTMETHOD:
			return getFinancialMgmtFinAccPaymentMethod();
		case FINANCIALMGMTGLBATCH:
			return getFinancialMgmtGLBatch();
		case FINANCIALMGMTGLCATEGORY:
			return getFinancialMgmtGLCategory();
		case FINANCIALMGMTGLCHARGE:
			return getFinancialMgmtGLCharge();
		case FINANCIALMGMTGLCHARGEACCOUNTS:
			return getFinancialMgmtGLChargeAccounts();
		case FINANCIALMGMTGLITEM:
			return getFinancialMgmtGLItem();
		case FINANCIALMGMTGLITEMACCOUNTS:
			return getFinancialMgmtGLItemAccounts();
		case FINANCIALMGMTGLJOURNAL:
			return getFinancialMgmtGLJournal();
		case FINANCIALMGMTGLJOURNALLINE:
			return getFinancialMgmtGLJournalLine();
		case FINANCIALMGMTINCOTERMS:
			return getFinancialMgmtIncoterms();
		case FINANCIALMGMTJOURNALLINE:
			return getFinancialMgmtJournalLine();
		case FINANCIALMGMTMATCHINGALGORITHM:
			return getFinancialMgmtMatchingAlgorithm();
		case FINANCIALMGMTNONBUSINESSDAY:
			return getFinancialMgmtNonBusinessDay();
		case FINANCIALMGMTPAYMENTEXECUTIONHISTORYV:
			return getFinancialMgmtPaymentExecutionHistoryV();
		case FINANCIALMGMTPAYMENTEXECUTIONPROCESS:
			return getFinancialMgmtPaymentExecutionProcess();
		case FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER:
			return getFinancialMgmtPaymentExecutionProcessParameter();
		case FINANCIALMGMTPAYMENTRUN:
			return getFinancialMgmtPaymentRun();
		case FINANCIALMGMTPAYMENTRUNPARAMETER:
			return getFinancialMgmtPaymentRunParameter();
		case FINANCIALMGMTPAYMENTRUNPAYMENT:
			return getFinancialMgmtPaymentRunPayment();
		case FINANCIALMGMTPAYMENTTERM:
			return getFinancialMgmtPaymentTerm();
		case FINANCIALMGMTPAYMENTTERMLINE:
			return getFinancialMgmtPaymentTermLine();
		case FINANCIALMGMTPAYMENTTERMTRL:
			return getFinancialMgmtPaymentTermTrl();
		case FINANCIALMGMTPERIOD:
			return getFinancialMgmtPeriod();
		case FINANCIALMGMTPERIODCONTROL:
			return getFinancialMgmtPeriodControl();
		case FINANCIALMGMTPERIODCONTROLV:
			return getFinancialMgmtPeriodControlV();
		case FINANCIALMGMTPROMISSORYFORMAT:
			return getFinancialMgmtPromissoryFormat();
		case FINANCIALMGMTREMITTANCE:
			return getFinancialMgmtRemittance();
		case FINANCIALMGMTREMITTANCELINE:
			return getFinancialMgmtRemittanceLine();
		case FINANCIALMGMTREMITTANCEPARAMETER:
			return getFinancialMgmtRemittanceParameter();
		case FINANCIALMGMTREMITTANCETYPE:
			return getFinancialMgmtRemittanceType();
		case FINANCIALMGMTSETTLEMENT:
			return getFinancialMgmtSettlement();
		case FINANCIALMGMTTAXCATEGORY:
			return getFinancialMgmtTaxCategory();
		case FINANCIALMGMTTAXCATEGORYTRL:
			return getFinancialMgmtTaxCategoryTrl();
		case FINANCIALMGMTTAXPAYMENT:
			return getFinancialMgmtTaxPayment();
		case FINANCIALMGMTTAXRATE:
			return getFinancialMgmtTaxRate();
		case FINANCIALMGMTTAXRATEACCOUNTS:
			return getFinancialMgmtTaxRateAccounts();
		case FINANCIALMGMTTAXREGISTER:
			return getFinancialMgmtTaxRegister();
		case FINANCIALMGMTTAXREGISTERTYPE:
			return getFinancialMgmtTaxRegisterType();
		case FINANCIALMGMTTAXREGISTERTYPELINES:
			return getFinancialMgmtTaxRegisterTypeLines();
		case FINANCIALMGMTTAXREGISTERLINE:
			return getFinancialMgmtTaxRegisterline();
		case FINANCIALMGMTTAXREPORT:
			return getFinancialMgmtTaxReport();
		case FINANCIALMGMTTAXTRL:
			return getFinancialMgmtTaxTrl();
		case FINANCIALMGMTTAXZONE:
			return getFinancialMgmtTaxZone();
		case FINANCIALMGMTWITHHOLDING:
			return getFinancialMgmtWithholding();
		case FINANCIALMGMTWITHHOLDINGACCOUNTS:
			return getFinancialMgmtWithholdingAccounts();
		case FINANCIALMGMTYEAR:
			return getFinancialMgmtYear();
		case GREETING:
			return getGreeting();
		case GREETINGTRL:
			return getGreetingTrl();
		case INVOICE:
			return getInvoice();
		case INVOICEDISCOUNT:
			return getInvoiceDiscount();
		case INVOICELINE:
			return getInvoiceLine();
		case INVOICELINEACCOUNTINGDIMENSION:
			return getInvoiceLineAccountingDimension();
		case INVOICELINEOFFER:
			return getInvoiceLineOffer();
		case INVOICELINETAX:
			return getInvoiceLineTax();
		case INVOICESCHEDULE:
			return getInvoiceSchedule();
		case INVOICETAX:
			return getInvoiceTax();
		case LOCATION:
			return getLocation();
		case LOCATOR:
			return getLocator();
		case LOT:
			return getLot();
		case LOTCONTROL:
			return getLotControl();
		case MRPPLANNER:
			return getMRPPlanner();
		case MRPPLANNINGMETHOD:
			return getMRPPlanningMethod();
		case MRPPLANNINGMETHODLINE:
			return getMRPPlanningMethodLine();
		case MRPPRODUCTIONRUN:
			return getMRPProductionRun();
		case MRPPRODUCTIONRUNLINE:
			return getMRPProductionRunLine();
		case MRPPURCHASINGRUN:
			return getMRPPurchasingRun();
		case MRPPURCHASINGRUNLINE:
			return getMRPPurchasingRunLine();
		case MRPSALESFORECAST:
			return getMRPSalesForecast();
		case MRPSALESFORECASTLINE:
			return getMRPSalesForecastLine();
		case MANUFACTURINGACTIVITY:
			return getManufacturingActivity();
		case MANUFACTURINGACTIVITYTOOLSET:
			return getManufacturingActivityToolset();
		case MANUFACTURINGCASE:
			return getManufacturingCase();
		case MANUFACTURINGCHECKPOINT:
			return getManufacturingCheckPoint();
		case MANUFACTURINGCHECKPOINTSET:
			return getManufacturingCheckPointSet();
		case MANUFACTURINGCHECKPOINTSHIFT:
			return getManufacturingCheckPointShift();
		case MANUFACTURINGCOSTCENTER:
			return getManufacturingCostCenter();
		case MANUFACTURINGCOSTCENTERMACHINE:
			return getManufacturingCostCenterMachine();
		case MANUFACTURINGCOSTCENTEREMPLOYEE:
			return getManufacturingCostcenterEmployee();
		case MANUFACTURINGCOSTCENTERIC:
			return getManufacturingCostcenterIC();
		case MANUFACTURINGCOSTCENTERVERSION:
			return getManufacturingCostcenterVersion();
		case MANUFACTURINGGLOBALUSE:
			return getManufacturingGlobalUse();
		case MANUFACTURINGINCIDENCE:
			return getManufacturingIncidence();
		case MANUFACTURINGINDIRECTCOST:
			return getManufacturingIndirectCost();
		case MANUFACTURINGINDIRECTCOSTVALUE:
			return getManufacturingIndirectCostValue();
		case MANUFACTURINGMACHINE:
			return getManufacturingMachine();
		case MANUFACTURINGMACHINECOST:
			return getManufacturingMachineCost();
		case MANUFACTURINGMACHINESTATION:
			return getManufacturingMachineStation();
		case MANUFACTURINGMACHINETYPE:
			return getManufacturingMachineType();
		case MANUFACTURINGMAINTEANCEORDER:
			return getManufacturingMainteanceOrder();
		case MANUFACTURINGMAINTENANCE:
			return getManufacturingMaintenance();
		case MANUFACTURINGMAINTENANCEPERIODICITY:
			return getManufacturingMaintenancePeriodicity();
		case MANUFACTURINGMAINTENANCESCHEDULE:
			return getManufacturingMaintenanceSchedule();
		case MANUFACTURINGMAINTENANCETASK:
			return getManufacturingMaintenanceTask();
		case MANUFACTURINGMAINTENANCEWORKER:
			return getManufacturingMaintenanceWorker();
		case MANUFACTURINGMEASUREGROUP:
			return getManufacturingMeasureGroup();
		case MANUFACTURINGMEASURESHIFT:
			return getManufacturingMeasureShift();
		case MANUFACTURINGMEASURETIME:
			return getManufacturingMeasureTime();
		case MANUFACTURINGMEASUREVALUES:
			return getManufacturingMeasureValues();
		case MANUFACTURINGOPERATION:
			return getManufacturingOperation();
		case MANUFACTURINGOPERATIONEMPLOYEE:
			return getManufacturingOperationEmployee();
		case MANUFACTURINGOPERATIONINDIRECTCOST:
			return getManufacturingOperationIndirectCost();
		case MANUFACTURINGOPERATIONMACHINE:
			return getManufacturingOperationMachine();
		case MANUFACTURINGOPERATIONPRODUCT:
			return getManufacturingOperationProduct();
		case MANUFACTURINGPERIODICCONTROL:
			return getManufacturingPeriodicControl();
		case MANUFACTURINGPROCESSPLAN:
			return getManufacturingProcessPlan();
		case MANUFACTURINGPRODUCTIONLINE:
			return getManufacturingProductionLine();
		case MANUFACTURINGPRODUCTIONRUNEMPLOYEE:
			return getManufacturingProductionRunEmployee();
		case MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS:
			return getManufacturingProductionRunIndirectCosts();
		case MANUFACTURINGPRODUCTIONRUNINVOICELINE:
			return getManufacturingProductionRunInvoiceLine();
		case MANUFACTURINGPRODUCTIONRUNMACHINE:
			return getManufacturingProductionRunMachine();
		case MANUFACTURINGPRODUCTIONRUNTOOLSET:
			return getManufacturingProductionRunToolset();
		case MANUFACTURINGSECTION:
			return getManufacturingSection();
		case MANUFACTURINGTEST:
			return getManufacturingTest();
		case MANUFACTURINGTOOLSET:
			return getManufacturingToolset();
		case MANUFACTURINGTOOLSETTYPE:
			return getManufacturingToolsetType();
		case MANUFACTURINGVALUE:
			return getManufacturingValue();
		case MANUFACTURINGVERSION:
			return getManufacturingVersion();
		case MANUFACTURINGWORKCENTER:
			return getManufacturingWorkCenter();
		case MANUFACTURINGWORKEFFORTEMPLOYEE:
			return getManufacturingWorkEffortEmployee();
		case MANUFACTURINGWORKEFFORTINCIDENCE:
			return getManufacturingWorkEffortIncidence();
		case MANUFACTURINGWORKREQUIREMENT:
			return getManufacturingWorkRequirement();
		case MANUFACTURINGWORKREQUIREMENTOPERATION:
			return getManufacturingWorkRequirementOperation();
		case MANUFACTURINGWORKREQUIREMENTPRODUCT:
			return getManufacturingWorkRequirementProduct();
		case MARKETINGCAMPAIGN:
			return getMarketingCampaign();
		case MARKETINGCHANNEL:
			return getMarketingChannel();
		case MATERIALMGMTABCACTIVITY:
			return getMaterialMgmtABCActivity();
		case MATERIALMGMTCOSTING:
			return getMaterialMgmtCosting();
		case MATERIALMGMTINTERNALCONSUMPTION:
			return getMaterialMgmtInternalConsumption();
		case MATERIALMGMTINTERNALCONSUMPTIONLINE:
			return getMaterialMgmtInternalConsumptionLine();
		case MATERIALMGMTINTERNALMOVEMENT:
			return getMaterialMgmtInternalMovement();
		case MATERIALMGMTINTERNALMOVEMENTLINE:
			return getMaterialMgmtInternalMovementLine();
		case MATERIALMGMTINVENTORYCOUNT:
			return getMaterialMgmtInventoryCount();
		case MATERIALMGMTINVENTORYCOUNTLINE:
			return getMaterialMgmtInventoryCountLine();
		case MATERIALMGMTMATERIALTRANSACTION:
			return getMaterialMgmtMaterialTransaction();
		case MATERIALMGMTPRODUCTIONPLAN:
			return getMaterialMgmtProductionPlan();
		case MATERIALMGMTPRODUCTIONTRANSACTION:
			return getMaterialMgmtProductionTransaction();
		case MATERIALMGMTSHIPMENTINOUT:
			return getMaterialMgmtShipmentInOut();
		case MATERIALMGMTSHIPMENTINOUTLINE:
			return getMaterialMgmtShipmentInOutLine();
		case MATERIALMGMTSTORAGEDETAIL:
			return getMaterialMgmtStorageDetail();
		case MATERIALMGMTSTORAGEPENDING:
			return getMaterialMgmtStoragePending();
		case MODELIMPLEMENTATIONPARAMETER:
			return getModelImplementationParameter();
		case MODULEDBPREFIX:
			return getModuleDBPrefix();
		case MODULEDEPENDENCY:
			return getModuleDependency();
		case MODULELOG:
			return getModuleLog();
		case MODULETRL:
			return getModuleTrl();
		case NAMINGEXCEPTION:
			return getNamingException();
		case OBCLKERTEMPLATE:
			return getOBCLKERTemplate();
		case OBCLKERTEMPLATEDEPENDENCY:
			return getOBCLKERTemplateDependency();
		case OBCLKERUIDEFINITION:
			return getOBCLKERUIDefinition();
		case OBCQLQUERYCOLUMN:
			return getOBCQLQueryColumn();
		case OBCQLQUERYCOLUMNTRL:
			return getOBCQLQueryColumnTrl();
		case OBCQLWIDGETQUERY:
			return getOBCQLWidgetQuery();
		case OBKMOWIDGETCLASS:
			return getOBKMOWidgetClass();
		case OBKMOWIDGETCLASSACCESS:
			return getOBKMOWidgetClassAccess();
		case OBKMOWIDGETCLASSMENU:
			return getOBKMOWidgetClassMenu();
		case OBKMOWIDGETCLASSMENUTRL:
			return getOBKMOWidgetClassMenuTrl();
		case OBKMOWIDGETCLASSTRL:
			return getOBKMOWidgetClassTrl();
		case OBKMOWIDGETINSTANCE:
			return getOBKMOWidgetInstance();
		case OBKMOWIDGETLIST:
			return getOBKMOWidgetList();
		case OBKMOWIDGETREFERENCE:
			return getOBKMOWidgetReference();
		case OBKMOWIDGETURL:
			return getOBKMOWidgetURL();
		case OBSEIGDEFAULTS:
			return getOBSEIGDefaults();
		case OBSERDSDATASOURCE:
			return getOBSERDSDatasource();
		case OBSERDSDATASOURCEFIELD:
			return getOBSERDSDatasourceField();
		case OBSOIDUSERIDENTIFIER:
			return getOBSOIDUserIdentifier();
		case OBUIAPPMENUPARAMETERS:
			return getOBUIAPPMenuParameters();
		case OBUIAPPNAVBARROLEACCESS:
			return getOBUIAPPNavbarRoleaccess();
		case OBUIAPPNAVIGATIONBARCOMPONENT:
			return getOBUIAPPNavigationBarComponent();
		case OBUIAPPNOTE:
			return getOBUIAPPNote();
		case OBUIAPPPARAMETER:
			return getOBUIAPPParameter();
		case OBUIAPPPARAMETERTRL:
			return getOBUIAPPParameterTrl();
		case OBUIAPPPARAMETERVALUE:
			return getOBUIAPPParameterValue();
		case OBUIAPPPROCESS:
			return getOBUIAPPProcess();
		case OBUIAPPPROCESSACCESS:
			return getOBUIAPPProcessAccess();
		case OBUIAPPREFWINDOW:
			return getOBUIAPPRefWindow();
		case OBUIAPPUIPERSONALIZATION:
			return getOBUIAPPUIPersonalization();
		case OBUIAPPVIEWIMPLEMENTATION:
			return getOBUIAPPViewImplementation();
		case OBUISELSELECTOR:
			return getOBUISELSelector();
		case OBUISELSELECTORFIELD:
			return getOBUISELSelectorField();
		case OBUISELSELECTORFIELDTRL:
			return getOBUISELSelectorFieldTrl();
		case OBUISELSELECTORTRL:
			return getOBUISELSelectorTrl();
		case ORDER:
			return getOrder();
		case ORDERDISCOUNT:
			return getOrderDiscount();
		case ORDERLINE:
			return getOrderLine();
		case ORDERLINEOFFER:
			return getOrderLineOffer();
		case ORDERLINETAX:
			return getOrderLineTax();
		case ORDERTAX:
			return getOrderTax();
		case ORGANIZATION:
			return getOrganization();
		case ORGANIZATIONACCTSCHEMA:
			return getOrganizationAcctSchema();
		case ORGANIZATIONCLOSING:
			return getOrganizationClosing();
		case ORGANIZATIONINFORMATION:
			return getOrganizationInformation();
		case ORGANIZATIONMODULEV:
			return getOrganizationModuleV();
		case ORGANIZATIONTYPE:
			return getOrganizationType();
		case PERIODCONTROLLOG:
			return getPeriodControlLog();
		case PRICINGADJUSTMENT:
			return getPricingAdjustment();
		case PRICINGADJUSTMENTBUSINESSPARTNER:
			return getPricingAdjustmentBusinessPartner();
		case PRICINGADJUSTMENTBUSINESSPARTNERGROUP:
			return getPricingAdjustmentBusinessPartnerGroup();
		case PRICINGADJUSTMENTPRICELIST:
			return getPricingAdjustmentPriceList();
		case PRICINGADJUSTMENTPRODUCT:
			return getPricingAdjustmentProduct();
		case PRICINGADJUSTMENTPRODUCTCATEGORY:
			return getPricingAdjustmentProductCategory();
		case PRICINGDISCOUNT:
			return getPricingDiscount();
		case PRICINGPRICELIST:
			return getPricingPriceList();
		case PRICINGPRICELISTSCHEMA:
			return getPricingPriceListSchema();
		case PRICINGPRICELISTSCHEMELINE:
			return getPricingPriceListSchemeLine();
		case PRICINGPRICELISTVERSION:
			return getPricingPriceListVersion();
		case PRICINGPRODUCTPRICE:
			return getPricingProductPrice();
		case PRICINGVOLUMEDISCOUNT:
			return getPricingVolumeDiscount();
		case PRICINGVOLUMEDISCOUNTBUSINESSPARTNER:
			return getPricingVolumeDiscountBusinessPartner();
		case PRICINGVOLUMEDISCOUNTINVOICE:
			return getPricingVolumeDiscountInvoice();
		case PRICINGVOLUMEDISCOUNTPRODUCT:
			return getPricingVolumeDiscountProduct();
		case PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY:
			return getPricingVolumeDiscountProductCategory();
		case PRICINGVOLUMEDISCOUNTSCALE:
			return getPricingVolumeDiscountScale();
		case PROCESSEXECUTION:
			return getProcessExecution();
		case PROCESSREQUEST:
			return getProcessRequest();
		case PROCESSRUN:
			return getProcessRun();
		case PROCUREMENTPOINVOICEMATCH:
			return getProcurementPOInvoiceMatch();
		case PROCUREMENTRECEIPTINVOICEMATCH:
			return getProcurementReceiptInvoiceMatch();
		case PROCUREMENTREQUISITION:
			return getProcurementRequisition();
		case PROCUREMENTREQUISITIONLINE:
			return getProcurementRequisitionLine();
		case PROCUREMENTREQUISITIONPOMATCH:
			return getProcurementRequisitionPOMatch();
		case PRODUCT:
			return getProduct();
		case PRODUCTACCOUNTS:
			return getProductAccounts();
		case PRODUCTBOM:
			return getProductBOM();
		case PRODUCTBYPRICEANDWAREHOUSE:
			return getProductByPriceAndWarehouse();
		case PRODUCTCATEGORY:
			return getProductCategory();
		case PRODUCTCATEGORYACCOUNTS:
			return getProductCategoryAccounts();
		case PRODUCTCUSTOMER:
			return getProductCustomer();
		case PRODUCTORG:
			return getProductOrg();
		case PRODUCTSTOCKVIEW:
			return getProductStockView();
		case PRODUCTSUBSTITUTE:
			return getProductSubstitute();
		case PRODUCTTRL:
			return getProductTrl();
		case PRODUCTUOM:
			return getProductUOM();
		case PROJECT:
			return getProject();
		case PROJECTACCOUNTS:
			return getProjectAccounts();
		case PROJECTISSUE:
			return getProjectIssue();
		case PROJECTLINE:
			return getProjectLine();
		case PROJECTPHASE:
			return getProjectPhase();
		case PROJECTPROJECTPROPOSALTASK:
			return getProjectProjectProposalTask();
		case PROJECTPROPOSAL:
			return getProjectProposal();
		case PROJECTPROPOSALLINE:
			return getProjectProposalLine();
		case PROJECTSTANDARDPHASE:
			return getProjectStandardPhase();
		case PROJECTSTANDARDTASK:
			return getProjectStandardTask();
		case PROJECTTASK:
			return getProjectTask();
		case PROJECTTYPE:
			return getProjectType();
		case PROJECTVENDOR:
			return getProjectVendor();
		case REFERENCEDATASTORE:
			return getReferenceDataStore();
		case REGION:
			return getRegion();
		case RESOURCE:
			return getResource();
		case RESOURCEASSIGNMENT:
			return getResourceAssignment();
		case RESOURCETYPE:
			return getResourceType();
		case RESOURCEUNAVAILABLE:
			return getResourceUnAvailable();
		case RETURNMATERIALORDERPICKEDITLINES:
			return getReturnMaterialOrderPickEditLines();
		case RETURNMATERIALRECEIPTPICKEDIT:
			return getReturnMaterialReceiptPickEdit();
		case RETURNMATERIALSHIPMENTPICKEDIT:
			return getReturnMaterialShipmentPickEdit();
		case RETURNREASON:
			return getReturnReason();
		case REVERSEDINVOICES:
			return getReversedInvoices();
		case SQLSCRIPT:
			return getSQLScript();
		case SALARYCATEGORY:
			return getSalaryCategory();
		case SALARYCATEGORYCOST:
			return getSalaryCategoryCost();
		case SALESCOMMISSION:
			return getSalesCommission();
		case SALESCOMMISSIONAMOUNT:
			return getSalesCommissionAmount();
		case SALESCOMMISSIONDETAIL:
			return getSalesCommissionDetail();
		case SALESCOMMISSIONLINE:
			return getSalesCommissionLine();
		case SALESCOMMISSIONRUN:
			return getSalesCommissionRun();
		case SALESREGION:
			return getSalesRegion();
		case SERIALNUMBERCONTROL:
			return getSerialNumberControl();
		case SHIPPINGFREIGHTCATEGORY:
			return getShippingFreightCategory();
		case SHIPPINGSHIPPINGCOMPANY:
			return getShippingShippingCompany();
		case SHIPPINGSHIPPINGCOMPANYFREIGHT:
			return getShippingShippingCompanyFreight();
		case TIMEANDEXPENSESHEET:
			return getTimeAndExpenseSheet();
		case TIMEANDEXPENSESHEETLINE:
			return getTimeAndExpenseSheetLine();
		case TIMEANDEXPENSESHEETLINEV:
			return getTimeAndExpenseSheetLineV();
		case TIMETYPE:
			return getTimeType();
		case UOM:
			return getUOM();
		case UOMCONVERSION:
			return getUOMConversion();
		case UOMTRL:
			return getUOMTrl();
		case VENDORACCOUNTS:
			return getVendorAccounts();
		case WAREHOUSE:
			return getWarehouse();
		case WAREHOUSEACCOUNTS:
			return getWarehouseAccounts();
		case WAREHOUSESHIPPER:
			return getWarehouseShipper();
		case OBUIAPPVIEWROLEACCESS:
			return getObuiappViewRoleAccess();
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param feature the feature to set
	 * @param the value to set in this instance
	 * @see #getFeature()
	 * @generated 
	 */
	public void setValue(Feature feature, Object value) {
		switch (feature) {
		case ADACCTPROCESS:
			setADAcctProcess((ADAcctProcessType) value);
			break;
		case ADALERT:
			setADAlert((ADAlertType) value);
			break;
		case ADALERTRECIPIENT:
			setADAlertRecipient((ADAlertRecipientType) value);
			break;
		case ADALERTRULE:
			setADAlertRule((ADAlertRuleType) value);
			break;
		case ADALERTRULETRL:
			setADAlertRuleTrl((ADAlertRuleTrlType) value);
			break;
		case ADATTACHMENT:
			setADAttachment((ADAttachmentType) value);
			break;
		case ADAUXILIARYINPUT:
			setADAuxiliaryInput((ADAuxiliaryInputType) value);
			break;
		case ADCALLOUT:
			setADCallout((ADCalloutType) value);
			break;
		case ADCLIENT:
			setADClient((ADClientType) value);
			break;
		case ADCLIENTMODULE:
			setADClientModule((ADClientModuleType) value);
			break;
		case ADCOLUMN:
			setADColumn((ADColumnType) value);
			break;
		case ADEPINSTANCEPARA:
			setADEPInstancePara((ADEPInstanceParaType) value);
			break;
		case ADEPPROCEDURES:
			setADEPProcedures((ADEPProceduresType) value);
			break;
		case ADELEMENT:
			setADElement((ADElementType) value);
			break;
		case ADELEMENTTRL:
			setADElementTrl((ADElementTrlType) value);
			break;
		case ADERRORLOG:
			setADErrorLog((ADErrorLogType) value);
			break;
		case ADEXTENSIONPOINTS:
			setADExtensionPoints((ADExtensionPointsType) value);
			break;
		case ADFIELD:
			setADField((ADFieldType) value);
			break;
		case ADFIELDGROUP:
			setADFieldGroup((ADFieldGroupType) value);
			break;
		case ADFIELDGROUPTRL:
			setADFieldGroupTrl((ADFieldGroupTrlType) value);
			break;
		case ADFIELDTRL:
			setADFieldTrl((ADFieldTrlType) value);
			break;
		case ADFILETYPE:
			setADFileType((ADFileTypeType) value);
			break;
		case ADFORM:
			setADForm((ADFormType) value);
			break;
		case ADFORMACCESS:
			setADFormAccess((ADFormAccessType) value);
			break;
		case ADFORMTRL:
			setADFormTrl((ADFormTrlType) value);
			break;
		case ADHEARTBEATLOG:
			setADHeartbeatLog((ADHeartbeatLogType) value);
			break;
		case ADHEARTBEATLOGCUSTOMQUERY:
			setADHeartbeatLogCustomQuery((ADHeartbeatLogCustomQueryType) value);
			break;
		case ADHEARTBEATLOGCUSTOMQUERYROW:
			setADHeartbeatLogCustomQueryRow((ADHeartbeatLogCustomQueryRowType) value);
			break;
		case ADIMAGE:
			setADImage((ADImageType) value);
			break;
		case ADLANGUAGE:
			setADLanguage((ADLanguageType) value);
			break;
		case ADLIST:
			setADList((ADListType) value);
			break;
		case ADLISTTRL:
			setADListTrl((ADListTrlType) value);
			break;
		case ADMENU:
			setADMenu((ADMenuType) value);
			break;
		case ADMENUTRL:
			setADMenuTrl((ADMenuTrlType) value);
			break;
		case ADMESSAGE:
			setADMessage((ADMessageType) value);
			break;
		case ADMESSAGETRL:
			setADMessageTrl((ADMessageTrlType) value);
			break;
		case ADMODELIMPLEMENTATION:
			setADModelImplementation((ADModelImplementationType) value);
			break;
		case ADMODELIMPLEMENTATIONMAPPING:
			setADModelImplementationMapping((ADModelImplementationMappingType) value);
			break;
		case ADMODULE:
			setADModule((ADModuleType) value);
			break;
		case ADMODULEDBPREFIXINSTALL:
			setADModuleDBPrefixInstall((ADModuleDBPrefixInstallType) value);
			break;
		case ADMODULEDEPENDENCYINST:
			setADModuleDependencyInst((ADModuleDependencyInstType) value);
			break;
		case ADMODULEINSTALL:
			setADModuleInstall((ADModuleInstallType) value);
			break;
		case ADMODULEMERGE:
			setADModuleMerge((ADModuleMergeType) value);
			break;
		case ADMONTH:
			setADMonth((ADMonthType) value);
			break;
		case ADMONTHTRL:
			setADMonthTrl((ADMonthTrlType) value);
			break;
		case ADORGMODULE:
			setADOrgModule((ADOrgModuleType) value);
			break;
		case ADPARAMETER:
			setADParameter((ADParameterType) value);
			break;
		case ADPREFERENCE:
			setADPreference((ADPreferenceType) value);
			break;
		case ADPROCESS:
			setADProcess((ADProcessType) value);
			break;
		case ADPROCESSACCESS:
			setADProcessAccess((ADProcessAccessType) value);
			break;
		case ADPROCESSINSTANCE:
			setADProcessInstance((ADProcessInstanceType) value);
			break;
		case ADPROCESSPARAMETER:
			setADProcessParameter((ADProcessParameterType) value);
			break;
		case ADPROCESSPARAMETERTRL:
			setADProcessParameterTrl((ADProcessParameterTrlType) value);
			break;
		case ADPROCESSSCHEDULING:
			setADProcessScheduling((ADProcessSchedulingType) value);
			break;
		case ADPROCESSTRL:
			setADProcessTrl((ADProcessTrlType) value);
			break;
		case ADREFERENCE:
			setADReference((ADReferenceType) value);
			break;
		case ADREFERENCETRL:
			setADReferenceTrl((ADReferenceTrlType) value);
			break;
		case ADREFERENCEDTABLE:
			setADReferencedTable((ADReferencedTableType) value);
			break;
		case ADREGISTRATION:
			setADRegistration((ADRegistrationType) value);
			break;
		case ADROLE:
			setADRole((ADRoleType) value);
			break;
		case ADROLEORGANIZATION:
			setADRoleOrganization((ADRoleOrganizationType) value);
			break;
		case ADSELECTOR:
			setADSelector((ADSelectorType) value);
			break;
		case ADSELECTORCOLUMN:
			setADSelectorColumn((ADSelectorColumnType) value);
			break;
		case ADSEQUENCE:
			setADSequence((ADSequenceType) value);
			break;
		case ADSESSION:
			setADSession((ADSessionType) value);
			break;
		case ADSESSIONSTATUS:
			setADSessionStatus((ADSessionStatusType) value);
			break;
		case ADSESSIONUSAGEAUDIT:
			setADSessionUsageAudit((ADSessionUsageAuditType) value);
			break;
		case ADSYSTEM:
			setADSystem((ADSystemType) value);
			break;
		case ADSYSTEMINFORMATION:
			setADSystemInformation((ADSystemInformationType) value);
			break;
		case ADTAB:
			setADTab((ADTabType) value);
			break;
		case ADTABTRL:
			setADTabTrl((ADTabTrlType) value);
			break;
		case ADTABLE:
			setADTable((ADTableType) value);
			break;
		case ADTABLEACCESS:
			setADTableAccess((ADTableAccessType) value);
			break;
		case ADTABLEPOSTV:
			setADTablePostV((ADTablePostVType) value);
			break;
		case ADTEXTINTERFACE:
			setADTextInterface((ADTextInterfaceType) value);
			break;
		case ADTEXTINTERFACETRL:
			setADTextInterfaceTrl((ADTextInterfaceTrlType) value);
			break;
		case ADTREE:
			setADTree((ADTreeType) value);
			break;
		case ADTREENODE:
			setADTreeNode((ADTreeNodeType) value);
			break;
		case ADUSER:
			setADUser((ADUserType) value);
			break;
		case ADUSERROLES:
			setADUserRoles((ADUserRolesType) value);
			break;
		case ADVALIDATION:
			setADValidation((ADValidationType) value);
			break;
		case ADWINDOW:
			setADWindow((ADWindowType) value);
			break;
		case ADWINDOWACCESS:
			setADWindowAccess((ADWindowAccessType) value);
			break;
		case ADWINDOWTRL:
			setADWindowTrl((ADWindowTrlType) value);
			break;
		case ADAUDITTRAIL:
			setADAuditTrail((ADAuditTrailType) value);
			break;
		case ADAUDITTRAILRAW:
			setADAuditTrailRaw((ADAuditTrailRawType) value);
			break;
		case ADCREATEFACTTEMPLATE:
			setADCreateFactTemplate((ADCreateFactTemplateType) value);
			break;
		case APRMFINACCTRANSACTIONACCTV:
			setAPRMFinAccTransactionAcctV((APRMFinAccTransactionAcctVType) value);
			break;
		case APRMFINACCTRANSACTIONV:
			setAPRMFinaccTransactionV((APRMFinaccTransactionVType) value);
			break;
		case APRMFINACCTRXFULLACCTV:
			setAPRMFinaccTrxFullAcctV((APRMFinaccTrxFullAcctVType) value);
			break;
		case APRMPENDINGPAYMENTINVOICE:
			setAPRMPendingPaymentInvoice((APRMPendingPaymentInvoiceType) value);
			break;
		case APRMRECDETAILV:
			setAPRMRecDetailV((APRMRecDetailVType) value);
			break;
		case APRMRECONCILIATION:
			setAPRMReconciliation((APRMReconciliationType) value);
			break;
		case ACCTSCHEMATABLEDOCTYPE:
			setAcctSchemaTableDocType((AcctSchemaTableDocTypeType) value);
			break;
		case ACTIVEPROPOSALV:
			setActiveProposalV((ActiveProposalVType) value);
			break;
		case APPROVEDVENDOR:
			setApprovedVendor((ApprovedVendorType) value);
			break;
		case ATTRIBUTE:
			setAttribute((AttributeType) value);
			break;
		case ATTRIBUTEINSTANCE:
			setAttributeInstance((AttributeInstanceType) value);
			break;
		case ATTRIBUTESET:
			setAttributeSet((AttributeSetType) value);
			break;
		case ATTRIBUTESETINSTANCE:
			setAttributeSetInstance((AttributeSetInstanceType) value);
			break;
		case ATTRIBUTEUSE:
			setAttributeUse((AttributeUseType) value);
			break;
		case ATTRIBUTEVALUE:
			setAttributeValue((AttributeValueType) value);
			break;
		case BANK:
			setBank((BankType) value);
			break;
		case BANKACCOUNT:
			setBankAccount((BankAccountType) value);
			break;
		case BANKACCOUNTACCOUNTS:
			setBankAccountAccounts((BankAccountAccountsType) value);
			break;
		case BUSINESSPARTNER:
			setBusinessPartner((BusinessPartnerType) value);
			break;
		case BUSINESSPARTNERBANKACCOUNT:
			setBusinessPartnerBankAccount((BusinessPartnerBankAccountType) value);
			break;
		case BUSINESSPARTNERCATEGORY:
			setBusinessPartnerCategory((BusinessPartnerCategoryType) value);
			break;
		case BUSINESSPARTNERCATEGORYACCOUNT:
			setBusinessPartnerCategoryAccount((BusinessPartnerCategoryAccountType) value);
			break;
		case BUSINESSPARTNERDISCOUNT:
			setBusinessPartnerDiscount((BusinessPartnerDiscountType) value);
			break;
		case BUSINESSPARTNERLOCATION:
			setBusinessPartnerLocation((BusinessPartnerLocationType) value);
			break;
		case BUSINESSPARTNERPRODUCTTEMPLATE:
			setBusinessPartnerProductTemplate((BusinessPartnerProductTemplateType) value);
			break;
		case BUSINESSPARTNERTAXCATEGORY:
			setBusinessPartnerTaxCategory((BusinessPartnerTaxCategoryType) value);
			break;
		case BUSINESSPARTNERWITHHOLDING:
			setBusinessPartnerWithholding((BusinessPartnerWithholdingType) value);
			break;
		case CACCTSCHEMAPROCESS:
			setCAcctSchemaProcess((CAcctSchemaProcessType) value);
			break;
		case CITY:
			setCity((CityType) value);
			break;
		case CLIENTINFORMATION:
			setClientInformation((ClientInformationType) value);
			break;
		case CONDITIONGOODS:
			setConditionGoods((ConditionGoodsType) value);
			break;
		case CONTACTEMAILINTERACTION:
			setContactEmailInteraction((ContactEmailInteractionType) value);
			break;
		case COUNTRY:
			setCountry((CountryType) value);
			break;
		case COUNTRYTRL:
			setCountryTrl((CountryTrlType) value);
			break;
		case CURRENCY:
			setCurrency((CurrencyType) value);
			break;
		case CURRENCYCONVERSIONRATE:
			setCurrencyConversionRate((CurrencyConversionRateType) value);
			break;
		case CURRENCYCONVERSIONRATEDOC:
			setCurrencyConversionRateDoc((CurrencyConversionRateDocType) value);
			break;
		case CURRENCYTRL:
			setCurrencyTrl((CurrencyTrlType) value);
			break;
		case CUSTOMERACCOUNTS:
			setCustomerAccounts((CustomerAccountsType) value);
			break;
		case DATAPACKAGE:
			setDataPackage((DataPackageType) value);
			break;
		case DATASET:
			setDataSet((DataSetType) value);
			break;
		case DATASETCOLUMN:
			setDataSetColumn((DataSetColumnType) value);
			break;
		case DATASETTABLE:
			setDataSetTable((DataSetTableType) value);
			break;
		case DOCUMENTTEMPLATE:
			setDocumentTemplate((DocumentTemplateType) value);
			break;
		case DOCUMENTTYPE:
			setDocumentType((DocumentTypeType) value);
			break;
		case DOCUMENTTYPETRL:
			setDocumentTypeTrl((DocumentTypeTrlType) value);
			break;
		case EMAILINTERACTION:
			setEmailInteraction((EmailInteractionType) value);
			break;
		case EMAILSERVERCONFIGURATION:
			setEmailServerConfiguration((EmailServerConfigurationType) value);
			break;
		case EMAILTEMPLATE:
			setEmailTemplate((EmailTemplateType) value);
			break;
		case EMPLOYEEACCOUNTS:
			setEmployeeAccounts((EmployeeAccountsType) value);
			break;
		case EMPLOYEESALARYCATEGORY:
			setEmployeeSalaryCategory((EmployeeSalaryCategoryType) value);
			break;
		case EXPENSETYPE:
			setExpenseType((ExpenseTypeType) value);
			break;
		case EXTERNALPOS:
			setExternalPOS((ExternalPOSType) value);
			break;
		case EXTERNALPOSCATEGORY:
			setExternalPOSCategory((ExternalPOSCategoryType) value);
			break;
		case EXTERNALPOSPRODUCT:
			setExternalPOSProduct((ExternalPOSProductType) value);
			break;
		case FINBANKSTATEMENT:
			setFINBankStatement((FINBankStatementType) value);
			break;
		case FINBANKSTATEMENTLINE:
			setFINBankStatementLine((FINBankStatementLineType) value);
			break;
		case FINFINACCTRANSACTION:
			setFINFinaccTransaction((FINFinaccTransactionType) value);
			break;
		case FINFINANCIALACCOUNT:
			setFINFinancialAccount((FINFinancialAccountType) value);
			break;
		case FINFINANCIALACCOUNTACCT:
			setFINFinancialAccountAcct((FINFinancialAccountAcctType) value);
			break;
		case FINPAYMENT:
			setFINPayment((FINPaymentType) value);
			break;
		case FINPAYMENTMETHOD:
			setFINPaymentMethod((FINPaymentMethodType) value);
			break;
		case FINPAYMENTCREDIT:
			setFINPaymentCredit((FINPaymentCreditType) value);
			break;
		case FINPAYMENTDETAIL:
			setFINPaymentDetail((FINPaymentDetailType) value);
			break;
		case FINPAYMENTDETAILV:
			setFINPaymentDetailV((FINPaymentDetailVType) value);
			break;
		case FINPAYMENTPRIORITY:
			setFINPaymentPriority((FINPaymentPriorityType) value);
			break;
		case FINPAYMENTPROPDETAIL:
			setFINPaymentPropDetail((FINPaymentPropDetailType) value);
			break;
		case FINPAYMENTPROPDETAILV:
			setFINPaymentPropDetailV((FINPaymentPropDetailVType) value);
			break;
		case FINPAYMENTPROPOSAL:
			setFINPaymentProposal((FINPaymentProposalType) value);
			break;
		case FINPAYMENTSCHEDINVV:
			setFINPaymentSchedInvV((FINPaymentSchedInvVType) value);
			break;
		case FINPAYMENTSCHEDORDV:
			setFINPaymentSchedOrdV((FINPaymentSchedOrdVType) value);
			break;
		case FINPAYMENTSCHEDULE:
			setFINPaymentSchedule((FINPaymentScheduleType) value);
			break;
		case FINPAYMENTSCHEDULEDETAIL:
			setFINPaymentScheduleDetail((FINPaymentScheduleDetailType) value);
			break;
		case FINRECONCILIATION:
			setFINReconciliation((FINReconciliationType) value);
			break;
		case FINRECONCILIATIONLINETEMP:
			setFINReconciliationLineTemp((FINReconciliationLineTempType) value);
			break;
		case FINRECONCILIATIONLINEV:
			setFINReconciliationLineV((FINReconciliationLineVType) value);
			break;
		case FINANCIALMGMTACCOUNTINGCOMBINATION:
			setFinancialMgmtAccountingCombination((FinancialMgmtAccountingCombinationType) value);
			break;
		case FINANCIALMGMTACCOUNTINGFACT:
			setFinancialMgmtAccountingFact((FinancialMgmtAccountingFactType) value);
			break;
		case FINANCIALMGMTACCOUNTINGREPORT:
			setFinancialMgmtAccountingReport((FinancialMgmtAccountingReportType) value);
			break;
		case FINANCIALMGMTACCOUNTINGRPTELEMENT:
			setFinancialMgmtAccountingRptElement((FinancialMgmtAccountingRptElementType) value);
			break;
		case FINANCIALMGMTACCTCFS:
			setFinancialMgmtAcctCFS((FinancialMgmtAcctCFSType) value);
			break;
		case FINANCIALMGMTACCTRPTGROUP:
			setFinancialMgmtAcctRptGroup((FinancialMgmtAcctRptGroupType) value);
			break;
		case FINANCIALMGMTACCTRPTNODE:
			setFinancialMgmtAcctRptNode((FinancialMgmtAcctRptNodeType) value);
			break;
		case FINANCIALMGMTACCTSCHEMA:
			setFinancialMgmtAcctSchema((FinancialMgmtAcctSchemaType) value);
			break;
		case FINANCIALMGMTACCTSCHEMADEFAULT:
			setFinancialMgmtAcctSchemaDefault((FinancialMgmtAcctSchemaDefaultType) value);
			break;
		case FINANCIALMGMTACCTSCHEMAELEMENT:
			setFinancialMgmtAcctSchemaElement((FinancialMgmtAcctSchemaElementType) value);
			break;
		case FINANCIALMGMTACCTSCHEMAGL:
			setFinancialMgmtAcctSchemaGL((FinancialMgmtAcctSchemaGLType) value);
			break;
		case FINANCIALMGMTACCTSCHEMATABLE:
			setFinancialMgmtAcctSchemaTable((FinancialMgmtAcctSchemaTableType) value);
			break;
		case FINANCIALMGMTAMORTIZATION:
			setFinancialMgmtAmortization((FinancialMgmtAmortizationType) value);
			break;
		case FINANCIALMGMTAMORTIZATIONLINE:
			setFinancialMgmtAmortizationLine((FinancialMgmtAmortizationLineType) value);
			break;
		case FINANCIALMGMTASSET:
			setFinancialMgmtAsset((FinancialMgmtAssetType) value);
			break;
		case FINANCIALMGMTASSETACCOUNTS:
			setFinancialMgmtAssetAccounts((FinancialMgmtAssetAccountsType) value);
			break;
		case FINANCIALMGMTASSETGROUP:
			setFinancialMgmtAssetGroup((FinancialMgmtAssetGroupType) value);
			break;
		case FINANCIALMGMTASSETGROUPACCT:
			setFinancialMgmtAssetGroupAcct((FinancialMgmtAssetGroupAcctType) value);
			break;
		case FINANCIALMGMTBANKFILEFORMAT:
			setFinancialMgmtBankFileFormat((FinancialMgmtBankFileFormatType) value);
			break;
		case FINANCIALMGMTBANKSTATEMENT:
			setFinancialMgmtBankStatement((FinancialMgmtBankStatementType) value);
			break;
		case FINANCIALMGMTBANKSTATEMENTLINE:
			setFinancialMgmtBankStatementLine((FinancialMgmtBankStatementLineType) value);
			break;
		case FINANCIALMGMTBUDGET:
			setFinancialMgmtBudget((FinancialMgmtBudgetType) value);
			break;
		case FINANCIALMGMTBUDGETLINE:
			setFinancialMgmtBudgetLine((FinancialMgmtBudgetLineType) value);
			break;
		case FINANCIALMGMTCALENDAR:
			setFinancialMgmtCalendar((FinancialMgmtCalendarType) value);
			break;
		case FINANCIALMGMTCASHBOOK:
			setFinancialMgmtCashBook((FinancialMgmtCashBookType) value);
			break;
		case FINANCIALMGMTCASHBOOKACCOUNTS:
			setFinancialMgmtCashBookAccounts((FinancialMgmtCashBookAccountsType) value);
			break;
		case FINANCIALMGMTCASHJOURNAL:
			setFinancialMgmtCashJournal((FinancialMgmtCashJournalType) value);
			break;
		case FINANCIALMGMTDPMANAGEMENT:
			setFinancialMgmtDPManagement((FinancialMgmtDPManagementType) value);
			break;
		case FINANCIALMGMTDPMANAGEMENTLINE:
			setFinancialMgmtDPManagementLine((FinancialMgmtDPManagementLineType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENT:
			setFinancialMgmtDebtPayment((FinancialMgmtDebtPaymentType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTBALREPLACE:
			setFinancialMgmtDebtPaymentBalReplace((FinancialMgmtDebtPaymentBalReplaceType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTBALANCING:
			setFinancialMgmtDebtPaymentBalancing((FinancialMgmtDebtPaymentBalancingType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTCANCELV:
			setFinancialMgmtDebtPaymentCancelV((FinancialMgmtDebtPaymentCancelVType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTGENERATEV:
			setFinancialMgmtDebtPaymentGenerateV((FinancialMgmtDebtPaymentGenerateVType) value);
			break;
		case FINANCIALMGMTDIMENSION:
			setFinancialMgmtDimension((FinancialMgmtDimensionType) value);
			break;
		case FINANCIALMGMTELEMENT:
			setFinancialMgmtElement((FinancialMgmtElementType) value);
			break;
		case FINANCIALMGMTELEMENTVALUE:
			setFinancialMgmtElementValue((FinancialMgmtElementValueType) value);
			break;
		case FINANCIALMGMTELEMENTVALUEOPERAND:
			setFinancialMgmtElementValueOperand((FinancialMgmtElementValueOperandType) value);
			break;
		case FINANCIALMGMTELEMENTVALUETRL:
			setFinancialMgmtElementValueTrl((FinancialMgmtElementValueTrlType) value);
			break;
		case FINANCIALMGMTFINACCPAYMENTMETHOD:
			setFinancialMgmtFinAccPaymentMethod((FinancialMgmtFinAccPaymentMethodType) value);
			break;
		case FINANCIALMGMTGLBATCH:
			setFinancialMgmtGLBatch((FinancialMgmtGLBatchType) value);
			break;
		case FINANCIALMGMTGLCATEGORY:
			setFinancialMgmtGLCategory((FinancialMgmtGLCategoryType) value);
			break;
		case FINANCIALMGMTGLCHARGE:
			setFinancialMgmtGLCharge((FinancialMgmtGLChargeType) value);
			break;
		case FINANCIALMGMTGLCHARGEACCOUNTS:
			setFinancialMgmtGLChargeAccounts((FinancialMgmtGLChargeAccountsType) value);
			break;
		case FINANCIALMGMTGLITEM:
			setFinancialMgmtGLItem((FinancialMgmtGLItemType) value);
			break;
		case FINANCIALMGMTGLITEMACCOUNTS:
			setFinancialMgmtGLItemAccounts((FinancialMgmtGLItemAccountsType) value);
			break;
		case FINANCIALMGMTGLJOURNAL:
			setFinancialMgmtGLJournal((FinancialMgmtGLJournalType) value);
			break;
		case FINANCIALMGMTGLJOURNALLINE:
			setFinancialMgmtGLJournalLine((FinancialMgmtGLJournalLineType) value);
			break;
		case FINANCIALMGMTINCOTERMS:
			setFinancialMgmtIncoterms((FinancialMgmtIncotermsType) value);
			break;
		case FINANCIALMGMTJOURNALLINE:
			setFinancialMgmtJournalLine((FinancialMgmtJournalLineType) value);
			break;
		case FINANCIALMGMTMATCHINGALGORITHM:
			setFinancialMgmtMatchingAlgorithm((FinancialMgmtMatchingAlgorithmType) value);
			break;
		case FINANCIALMGMTNONBUSINESSDAY:
			setFinancialMgmtNonBusinessDay((FinancialMgmtNonBusinessDayType) value);
			break;
		case FINANCIALMGMTPAYMENTEXECUTIONHISTORYV:
			setFinancialMgmtPaymentExecutionHistoryV((FinancialMgmtPaymentExecutionHistoryVType) value);
			break;
		case FINANCIALMGMTPAYMENTEXECUTIONPROCESS:
			setFinancialMgmtPaymentExecutionProcess((FinancialMgmtPaymentExecutionProcessType) value);
			break;
		case FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER:
			setFinancialMgmtPaymentExecutionProcessParameter((FinancialMgmtPaymentExecutionProcessParameterType) value);
			break;
		case FINANCIALMGMTPAYMENTRUN:
			setFinancialMgmtPaymentRun((FinancialMgmtPaymentRunType) value);
			break;
		case FINANCIALMGMTPAYMENTRUNPARAMETER:
			setFinancialMgmtPaymentRunParameter((FinancialMgmtPaymentRunParameterType) value);
			break;
		case FINANCIALMGMTPAYMENTRUNPAYMENT:
			setFinancialMgmtPaymentRunPayment((FinancialMgmtPaymentRunPaymentType) value);
			break;
		case FINANCIALMGMTPAYMENTTERM:
			setFinancialMgmtPaymentTerm((FinancialMgmtPaymentTermType) value);
			break;
		case FINANCIALMGMTPAYMENTTERMLINE:
			setFinancialMgmtPaymentTermLine((FinancialMgmtPaymentTermLineType) value);
			break;
		case FINANCIALMGMTPAYMENTTERMTRL:
			setFinancialMgmtPaymentTermTrl((FinancialMgmtPaymentTermTrlType) value);
			break;
		case FINANCIALMGMTPERIOD:
			setFinancialMgmtPeriod((FinancialMgmtPeriodType) value);
			break;
		case FINANCIALMGMTPERIODCONTROL:
			setFinancialMgmtPeriodControl((FinancialMgmtPeriodControlType) value);
			break;
		case FINANCIALMGMTPERIODCONTROLV:
			setFinancialMgmtPeriodControlV((FinancialMgmtPeriodControlVType) value);
			break;
		case FINANCIALMGMTPROMISSORYFORMAT:
			setFinancialMgmtPromissoryFormat((FinancialMgmtPromissoryFormatType) value);
			break;
		case FINANCIALMGMTREMITTANCE:
			setFinancialMgmtRemittance((FinancialMgmtRemittanceType) value);
			break;
		case FINANCIALMGMTREMITTANCELINE:
			setFinancialMgmtRemittanceLine((FinancialMgmtRemittanceLineType) value);
			break;
		case FINANCIALMGMTREMITTANCEPARAMETER:
			setFinancialMgmtRemittanceParameter((FinancialMgmtRemittanceParameterType) value);
			break;
		case FINANCIALMGMTREMITTANCETYPE:
			setFinancialMgmtRemittanceType((FinancialMgmtRemittanceTypeType) value);
			break;
		case FINANCIALMGMTSETTLEMENT:
			setFinancialMgmtSettlement((FinancialMgmtSettlementType) value);
			break;
		case FINANCIALMGMTTAXCATEGORY:
			setFinancialMgmtTaxCategory((FinancialMgmtTaxCategoryType) value);
			break;
		case FINANCIALMGMTTAXCATEGORYTRL:
			setFinancialMgmtTaxCategoryTrl((FinancialMgmtTaxCategoryTrlType) value);
			break;
		case FINANCIALMGMTTAXPAYMENT:
			setFinancialMgmtTaxPayment((FinancialMgmtTaxPaymentType) value);
			break;
		case FINANCIALMGMTTAXRATE:
			setFinancialMgmtTaxRate((FinancialMgmtTaxRateType) value);
			break;
		case FINANCIALMGMTTAXRATEACCOUNTS:
			setFinancialMgmtTaxRateAccounts((FinancialMgmtTaxRateAccountsType) value);
			break;
		case FINANCIALMGMTTAXREGISTER:
			setFinancialMgmtTaxRegister((FinancialMgmtTaxRegisterType) value);
			break;
		case FINANCIALMGMTTAXREGISTERTYPE:
			setFinancialMgmtTaxRegisterType((FinancialMgmtTaxRegisterTypeType) value);
			break;
		case FINANCIALMGMTTAXREGISTERTYPELINES:
			setFinancialMgmtTaxRegisterTypeLines((FinancialMgmtTaxRegisterTypeLinesType) value);
			break;
		case FINANCIALMGMTTAXREGISTERLINE:
			setFinancialMgmtTaxRegisterline((FinancialMgmtTaxRegisterlineType) value);
			break;
		case FINANCIALMGMTTAXREPORT:
			setFinancialMgmtTaxReport((FinancialMgmtTaxReportType) value);
			break;
		case FINANCIALMGMTTAXTRL:
			setFinancialMgmtTaxTrl((FinancialMgmtTaxTrlType) value);
			break;
		case FINANCIALMGMTTAXZONE:
			setFinancialMgmtTaxZone((FinancialMgmtTaxZoneType) value);
			break;
		case FINANCIALMGMTWITHHOLDING:
			setFinancialMgmtWithholding((FinancialMgmtWithholdingType) value);
			break;
		case FINANCIALMGMTWITHHOLDINGACCOUNTS:
			setFinancialMgmtWithholdingAccounts((FinancialMgmtWithholdingAccountsType) value);
			break;
		case FINANCIALMGMTYEAR:
			setFinancialMgmtYear((FinancialMgmtYearType) value);
			break;
		case GREETING:
			setGreeting((GreetingType) value);
			break;
		case GREETINGTRL:
			setGreetingTrl((GreetingTrlType) value);
			break;
		case INVOICE:
			setInvoice((InvoiceType) value);
			break;
		case INVOICEDISCOUNT:
			setInvoiceDiscount((InvoiceDiscountType) value);
			break;
		case INVOICELINE:
			setInvoiceLine((InvoiceLineType) value);
			break;
		case INVOICELINEACCOUNTINGDIMENSION:
			setInvoiceLineAccountingDimension((InvoiceLineAccountingDimensionType) value);
			break;
		case INVOICELINEOFFER:
			setInvoiceLineOffer((InvoiceLineOfferType) value);
			break;
		case INVOICELINETAX:
			setInvoiceLineTax((InvoiceLineTaxType) value);
			break;
		case INVOICESCHEDULE:
			setInvoiceSchedule((InvoiceScheduleType) value);
			break;
		case INVOICETAX:
			setInvoiceTax((InvoiceTaxType) value);
			break;
		case LOCATION:
			setLocation((LocationType) value);
			break;
		case LOCATOR:
			setLocator((LocatorType) value);
			break;
		case LOT:
			setLot((LotType) value);
			break;
		case LOTCONTROL:
			setLotControl((LotControlType) value);
			break;
		case MRPPLANNER:
			setMRPPlanner((MRPPlannerType) value);
			break;
		case MRPPLANNINGMETHOD:
			setMRPPlanningMethod((MRPPlanningMethodType) value);
			break;
		case MRPPLANNINGMETHODLINE:
			setMRPPlanningMethodLine((MRPPlanningMethodLineType) value);
			break;
		case MRPPRODUCTIONRUN:
			setMRPProductionRun((MRPProductionRunType) value);
			break;
		case MRPPRODUCTIONRUNLINE:
			setMRPProductionRunLine((MRPProductionRunLineType) value);
			break;
		case MRPPURCHASINGRUN:
			setMRPPurchasingRun((MRPPurchasingRunType) value);
			break;
		case MRPPURCHASINGRUNLINE:
			setMRPPurchasingRunLine((MRPPurchasingRunLineType) value);
			break;
		case MRPSALESFORECAST:
			setMRPSalesForecast((MRPSalesForecastType) value);
			break;
		case MRPSALESFORECASTLINE:
			setMRPSalesForecastLine((MRPSalesForecastLineType) value);
			break;
		case MANUFACTURINGACTIVITY:
			setManufacturingActivity((ManufacturingActivityType) value);
			break;
		case MANUFACTURINGACTIVITYTOOLSET:
			setManufacturingActivityToolset((ManufacturingActivityToolsetType) value);
			break;
		case MANUFACTURINGCASE:
			setManufacturingCase((ManufacturingCaseType) value);
			break;
		case MANUFACTURINGCHECKPOINT:
			setManufacturingCheckPoint((ManufacturingCheckPointType) value);
			break;
		case MANUFACTURINGCHECKPOINTSET:
			setManufacturingCheckPointSet((ManufacturingCheckPointSetType) value);
			break;
		case MANUFACTURINGCHECKPOINTSHIFT:
			setManufacturingCheckPointShift((ManufacturingCheckPointShiftType) value);
			break;
		case MANUFACTURINGCOSTCENTER:
			setManufacturingCostCenter((ManufacturingCostCenterType) value);
			break;
		case MANUFACTURINGCOSTCENTERMACHINE:
			setManufacturingCostCenterMachine((ManufacturingCostCenterMachineType) value);
			break;
		case MANUFACTURINGCOSTCENTEREMPLOYEE:
			setManufacturingCostcenterEmployee((ManufacturingCostcenterEmployeeType) value);
			break;
		case MANUFACTURINGCOSTCENTERIC:
			setManufacturingCostcenterIC((ManufacturingCostcenterICType) value);
			break;
		case MANUFACTURINGCOSTCENTERVERSION:
			setManufacturingCostcenterVersion((ManufacturingCostcenterVersionType) value);
			break;
		case MANUFACTURINGGLOBALUSE:
			setManufacturingGlobalUse((ManufacturingGlobalUseType) value);
			break;
		case MANUFACTURINGINCIDENCE:
			setManufacturingIncidence((ManufacturingIncidenceType) value);
			break;
		case MANUFACTURINGINDIRECTCOST:
			setManufacturingIndirectCost((ManufacturingIndirectCostType) value);
			break;
		case MANUFACTURINGINDIRECTCOSTVALUE:
			setManufacturingIndirectCostValue((ManufacturingIndirectCostValueType) value);
			break;
		case MANUFACTURINGMACHINE:
			setManufacturingMachine((ManufacturingMachineType) value);
			break;
		case MANUFACTURINGMACHINECOST:
			setManufacturingMachineCost((ManufacturingMachineCostType) value);
			break;
		case MANUFACTURINGMACHINESTATION:
			setManufacturingMachineStation((ManufacturingMachineStationType) value);
			break;
		case MANUFACTURINGMACHINETYPE:
			setManufacturingMachineType((ManufacturingMachineTypeType) value);
			break;
		case MANUFACTURINGMAINTEANCEORDER:
			setManufacturingMainteanceOrder((ManufacturingMainteanceOrderType) value);
			break;
		case MANUFACTURINGMAINTENANCE:
			setManufacturingMaintenance((ManufacturingMaintenanceType) value);
			break;
		case MANUFACTURINGMAINTENANCEPERIODICITY:
			setManufacturingMaintenancePeriodicity((ManufacturingMaintenancePeriodicityType) value);
			break;
		case MANUFACTURINGMAINTENANCESCHEDULE:
			setManufacturingMaintenanceSchedule((ManufacturingMaintenanceScheduleType) value);
			break;
		case MANUFACTURINGMAINTENANCETASK:
			setManufacturingMaintenanceTask((ManufacturingMaintenanceTaskType) value);
			break;
		case MANUFACTURINGMAINTENANCEWORKER:
			setManufacturingMaintenanceWorker((ManufacturingMaintenanceWorkerType) value);
			break;
		case MANUFACTURINGMEASUREGROUP:
			setManufacturingMeasureGroup((ManufacturingMeasureGroupType) value);
			break;
		case MANUFACTURINGMEASURESHIFT:
			setManufacturingMeasureShift((ManufacturingMeasureShiftType) value);
			break;
		case MANUFACTURINGMEASURETIME:
			setManufacturingMeasureTime((ManufacturingMeasureTimeType) value);
			break;
		case MANUFACTURINGMEASUREVALUES:
			setManufacturingMeasureValues((ManufacturingMeasureValuesType) value);
			break;
		case MANUFACTURINGOPERATION:
			setManufacturingOperation((ManufacturingOperationType) value);
			break;
		case MANUFACTURINGOPERATIONEMPLOYEE:
			setManufacturingOperationEmployee((ManufacturingOperationEmployeeType) value);
			break;
		case MANUFACTURINGOPERATIONINDIRECTCOST:
			setManufacturingOperationIndirectCost((ManufacturingOperationIndirectCostType) value);
			break;
		case MANUFACTURINGOPERATIONMACHINE:
			setManufacturingOperationMachine((ManufacturingOperationMachineType) value);
			break;
		case MANUFACTURINGOPERATIONPRODUCT:
			setManufacturingOperationProduct((ManufacturingOperationProductType) value);
			break;
		case MANUFACTURINGPERIODICCONTROL:
			setManufacturingPeriodicControl((ManufacturingPeriodicControlType) value);
			break;
		case MANUFACTURINGPROCESSPLAN:
			setManufacturingProcessPlan((ManufacturingProcessPlanType) value);
			break;
		case MANUFACTURINGPRODUCTIONLINE:
			setManufacturingProductionLine((ManufacturingProductionLineType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNEMPLOYEE:
			setManufacturingProductionRunEmployee((ManufacturingProductionRunEmployeeType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS:
			setManufacturingProductionRunIndirectCosts((ManufacturingProductionRunIndirectCostsType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNINVOICELINE:
			setManufacturingProductionRunInvoiceLine((ManufacturingProductionRunInvoiceLineType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNMACHINE:
			setManufacturingProductionRunMachine((ManufacturingProductionRunMachineType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNTOOLSET:
			setManufacturingProductionRunToolset((ManufacturingProductionRunToolsetType) value);
			break;
		case MANUFACTURINGSECTION:
			setManufacturingSection((ManufacturingSectionType) value);
			break;
		case MANUFACTURINGTEST:
			setManufacturingTest((ManufacturingTestType) value);
			break;
		case MANUFACTURINGTOOLSET:
			setManufacturingToolset((ManufacturingToolsetType) value);
			break;
		case MANUFACTURINGTOOLSETTYPE:
			setManufacturingToolsetType((ManufacturingToolsetTypeType) value);
			break;
		case MANUFACTURINGVALUE:
			setManufacturingValue((ManufacturingValueType) value);
			break;
		case MANUFACTURINGVERSION:
			setManufacturingVersion((ManufacturingVersionType) value);
			break;
		case MANUFACTURINGWORKCENTER:
			setManufacturingWorkCenter((ManufacturingWorkCenterType) value);
			break;
		case MANUFACTURINGWORKEFFORTEMPLOYEE:
			setManufacturingWorkEffortEmployee((ManufacturingWorkEffortEmployeeType) value);
			break;
		case MANUFACTURINGWORKEFFORTINCIDENCE:
			setManufacturingWorkEffortIncidence((ManufacturingWorkEffortIncidenceType) value);
			break;
		case MANUFACTURINGWORKREQUIREMENT:
			setManufacturingWorkRequirement((ManufacturingWorkRequirementType) value);
			break;
		case MANUFACTURINGWORKREQUIREMENTOPERATION:
			setManufacturingWorkRequirementOperation((ManufacturingWorkRequirementOperationType) value);
			break;
		case MANUFACTURINGWORKREQUIREMENTPRODUCT:
			setManufacturingWorkRequirementProduct((ManufacturingWorkRequirementProductType) value);
			break;
		case MARKETINGCAMPAIGN:
			setMarketingCampaign((MarketingCampaignType) value);
			break;
		case MARKETINGCHANNEL:
			setMarketingChannel((MarketingChannelType) value);
			break;
		case MATERIALMGMTABCACTIVITY:
			setMaterialMgmtABCActivity((MaterialMgmtABCActivityType) value);
			break;
		case MATERIALMGMTCOSTING:
			setMaterialMgmtCosting((MaterialMgmtCostingType) value);
			break;
		case MATERIALMGMTINTERNALCONSUMPTION:
			setMaterialMgmtInternalConsumption((MaterialMgmtInternalConsumptionType) value);
			break;
		case MATERIALMGMTINTERNALCONSUMPTIONLINE:
			setMaterialMgmtInternalConsumptionLine((MaterialMgmtInternalConsumptionLineType) value);
			break;
		case MATERIALMGMTINTERNALMOVEMENT:
			setMaterialMgmtInternalMovement((MaterialMgmtInternalMovementType) value);
			break;
		case MATERIALMGMTINTERNALMOVEMENTLINE:
			setMaterialMgmtInternalMovementLine((MaterialMgmtInternalMovementLineType) value);
			break;
		case MATERIALMGMTINVENTORYCOUNT:
			setMaterialMgmtInventoryCount((MaterialMgmtInventoryCountType) value);
			break;
		case MATERIALMGMTINVENTORYCOUNTLINE:
			setMaterialMgmtInventoryCountLine((MaterialMgmtInventoryCountLineType) value);
			break;
		case MATERIALMGMTMATERIALTRANSACTION:
			setMaterialMgmtMaterialTransaction((MaterialMgmtMaterialTransactionType) value);
			break;
		case MATERIALMGMTPRODUCTIONPLAN:
			setMaterialMgmtProductionPlan((MaterialMgmtProductionPlanType) value);
			break;
		case MATERIALMGMTPRODUCTIONTRANSACTION:
			setMaterialMgmtProductionTransaction((MaterialMgmtProductionTransactionType) value);
			break;
		case MATERIALMGMTSHIPMENTINOUT:
			setMaterialMgmtShipmentInOut((MaterialMgmtShipmentInOutType) value);
			break;
		case MATERIALMGMTSHIPMENTINOUTLINE:
			setMaterialMgmtShipmentInOutLine((MaterialMgmtShipmentInOutLineType) value);
			break;
		case MATERIALMGMTSTORAGEDETAIL:
			setMaterialMgmtStorageDetail((MaterialMgmtStorageDetailType) value);
			break;
		case MATERIALMGMTSTORAGEPENDING:
			setMaterialMgmtStoragePending((MaterialMgmtStoragePendingType) value);
			break;
		case MODELIMPLEMENTATIONPARAMETER:
			setModelImplementationParameter((ModelImplementationParameterType) value);
			break;
		case MODULEDBPREFIX:
			setModuleDBPrefix((ModuleDBPrefixType) value);
			break;
		case MODULEDEPENDENCY:
			setModuleDependency((ModuleDependencyType) value);
			break;
		case MODULELOG:
			setModuleLog((ModuleLogType) value);
			break;
		case MODULETRL:
			setModuleTrl((ModuleTrlType) value);
			break;
		case NAMINGEXCEPTION:
			setNamingException((NamingExceptionType) value);
			break;
		case OBCLKERTEMPLATE:
			setOBCLKERTemplate((OBCLKERTemplateType) value);
			break;
		case OBCLKERTEMPLATEDEPENDENCY:
			setOBCLKERTemplateDependency((OBCLKERTemplateDependencyType) value);
			break;
		case OBCLKERUIDEFINITION:
			setOBCLKERUIDefinition((OBCLKERUIDefinitionType) value);
			break;
		case OBCQLQUERYCOLUMN:
			setOBCQLQueryColumn((OBCQLQueryColumnType) value);
			break;
		case OBCQLQUERYCOLUMNTRL:
			setOBCQLQueryColumnTrl((OBCQLQueryColumnTrlType) value);
			break;
		case OBCQLWIDGETQUERY:
			setOBCQLWidgetQuery((OBCQLWidgetQueryType) value);
			break;
		case OBKMOWIDGETCLASS:
			setOBKMOWidgetClass((OBKMOWidgetClassType) value);
			break;
		case OBKMOWIDGETCLASSACCESS:
			setOBKMOWidgetClassAccess((OBKMOWidgetClassAccessType) value);
			break;
		case OBKMOWIDGETCLASSMENU:
			setOBKMOWidgetClassMenu((OBKMOWidgetClassMenuType) value);
			break;
		case OBKMOWIDGETCLASSMENUTRL:
			setOBKMOWidgetClassMenuTrl((OBKMOWidgetClassMenuTrlType) value);
			break;
		case OBKMOWIDGETCLASSTRL:
			setOBKMOWidgetClassTrl((OBKMOWidgetClassTrlType) value);
			break;
		case OBKMOWIDGETINSTANCE:
			setOBKMOWidgetInstance((OBKMOWidgetInstanceType) value);
			break;
		case OBKMOWIDGETLIST:
			setOBKMOWidgetList((OBKMOWidgetListType) value);
			break;
		case OBKMOWIDGETREFERENCE:
			setOBKMOWidgetReference((OBKMOWidgetReferenceType) value);
			break;
		case OBKMOWIDGETURL:
			setOBKMOWidgetURL((OBKMOWidgetURLType) value);
			break;
		case OBSEIGDEFAULTS:
			setOBSEIGDefaults((OBSEIGDefaultsType) value);
			break;
		case OBSERDSDATASOURCE:
			setOBSERDSDatasource((OBSERDSDatasourceType) value);
			break;
		case OBSERDSDATASOURCEFIELD:
			setOBSERDSDatasourceField((OBSERDSDatasourceFieldType) value);
			break;
		case OBSOIDUSERIDENTIFIER:
			setOBSOIDUserIdentifier((OBSOIDUserIdentifierType) value);
			break;
		case OBUIAPPMENUPARAMETERS:
			setOBUIAPPMenuParameters((OBUIAPPMenuParametersType) value);
			break;
		case OBUIAPPNAVBARROLEACCESS:
			setOBUIAPPNavbarRoleaccess((OBUIAPPNavbarRoleaccessType) value);
			break;
		case OBUIAPPNAVIGATIONBARCOMPONENT:
			setOBUIAPPNavigationBarComponent((OBUIAPPNavigationBarComponentType) value);
			break;
		case OBUIAPPNOTE:
			setOBUIAPPNote((OBUIAPPNoteType) value);
			break;
		case OBUIAPPPARAMETER:
			setOBUIAPPParameter((OBUIAPPParameterType) value);
			break;
		case OBUIAPPPARAMETERTRL:
			setOBUIAPPParameterTrl((OBUIAPPParameterTrlType) value);
			break;
		case OBUIAPPPARAMETERVALUE:
			setOBUIAPPParameterValue((OBUIAPPParameterValueType) value);
			break;
		case OBUIAPPPROCESS:
			setOBUIAPPProcess((OBUIAPPProcessType) value);
			break;
		case OBUIAPPPROCESSACCESS:
			setOBUIAPPProcessAccess((OBUIAPPProcessAccessType) value);
			break;
		case OBUIAPPREFWINDOW:
			setOBUIAPPRefWindow((OBUIAPPRefWindowType) value);
			break;
		case OBUIAPPUIPERSONALIZATION:
			setOBUIAPPUIPersonalization((OBUIAPPUIPersonalizationType) value);
			break;
		case OBUIAPPVIEWIMPLEMENTATION:
			setOBUIAPPViewImplementation((OBUIAPPViewImplementationType) value);
			break;
		case OBUISELSELECTOR:
			setOBUISELSelector((OBUISELSelectorType) value);
			break;
		case OBUISELSELECTORFIELD:
			setOBUISELSelectorField((OBUISELSelectorFieldType) value);
			break;
		case OBUISELSELECTORFIELDTRL:
			setOBUISELSelectorFieldTrl((OBUISELSelectorFieldTrlType) value);
			break;
		case OBUISELSELECTORTRL:
			setOBUISELSelectorTrl((OBUISELSelectorTrlType) value);
			break;
		case ORDER:
			setOrder((OrderType) value);
			break;
		case ORDERDISCOUNT:
			setOrderDiscount((OrderDiscountType) value);
			break;
		case ORDERLINE:
			setOrderLine((OrderLineType) value);
			break;
		case ORDERLINEOFFER:
			setOrderLineOffer((OrderLineOfferType) value);
			break;
		case ORDERLINETAX:
			setOrderLineTax((OrderLineTaxType) value);
			break;
		case ORDERTAX:
			setOrderTax((OrderTaxType) value);
			break;
		case ORGANIZATION:
			setOrganization((OrganizationType) value);
			break;
		case ORGANIZATIONACCTSCHEMA:
			setOrganizationAcctSchema((OrganizationAcctSchemaType) value);
			break;
		case ORGANIZATIONCLOSING:
			setOrganizationClosing((OrganizationClosingType) value);
			break;
		case ORGANIZATIONINFORMATION:
			setOrganizationInformation((OrganizationInformationType) value);
			break;
		case ORGANIZATIONMODULEV:
			setOrganizationModuleV((OrganizationModuleVType) value);
			break;
		case ORGANIZATIONTYPE:
			setOrganizationType((OrganizationTypeType) value);
			break;
		case PERIODCONTROLLOG:
			setPeriodControlLog((PeriodControlLogType) value);
			break;
		case PRICINGADJUSTMENT:
			setPricingAdjustment((PricingAdjustmentType) value);
			break;
		case PRICINGADJUSTMENTBUSINESSPARTNER:
			setPricingAdjustmentBusinessPartner((PricingAdjustmentBusinessPartnerType) value);
			break;
		case PRICINGADJUSTMENTBUSINESSPARTNERGROUP:
			setPricingAdjustmentBusinessPartnerGroup((PricingAdjustmentBusinessPartnerGroupType) value);
			break;
		case PRICINGADJUSTMENTPRICELIST:
			setPricingAdjustmentPriceList((PricingAdjustmentPriceListType) value);
			break;
		case PRICINGADJUSTMENTPRODUCT:
			setPricingAdjustmentProduct((PricingAdjustmentProductType) value);
			break;
		case PRICINGADJUSTMENTPRODUCTCATEGORY:
			setPricingAdjustmentProductCategory((PricingAdjustmentProductCategoryType) value);
			break;
		case PRICINGDISCOUNT:
			setPricingDiscount((PricingDiscountType) value);
			break;
		case PRICINGPRICELIST:
			setPricingPriceList((PricingPriceListType) value);
			break;
		case PRICINGPRICELISTSCHEMA:
			setPricingPriceListSchema((PricingPriceListSchemaType) value);
			break;
		case PRICINGPRICELISTSCHEMELINE:
			setPricingPriceListSchemeLine((PricingPriceListSchemeLineType) value);
			break;
		case PRICINGPRICELISTVERSION:
			setPricingPriceListVersion((PricingPriceListVersionType) value);
			break;
		case PRICINGPRODUCTPRICE:
			setPricingProductPrice((PricingProductPriceType) value);
			break;
		case PRICINGVOLUMEDISCOUNT:
			setPricingVolumeDiscount((PricingVolumeDiscountType) value);
			break;
		case PRICINGVOLUMEDISCOUNTBUSINESSPARTNER:
			setPricingVolumeDiscountBusinessPartner((PricingVolumeDiscountBusinessPartnerType) value);
			break;
		case PRICINGVOLUMEDISCOUNTINVOICE:
			setPricingVolumeDiscountInvoice((PricingVolumeDiscountInvoiceType) value);
			break;
		case PRICINGVOLUMEDISCOUNTPRODUCT:
			setPricingVolumeDiscountProduct((PricingVolumeDiscountProductType) value);
			break;
		case PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY:
			setPricingVolumeDiscountProductCategory((PricingVolumeDiscountProductCategoryType) value);
			break;
		case PRICINGVOLUMEDISCOUNTSCALE:
			setPricingVolumeDiscountScale((PricingVolumeDiscountScaleType) value);
			break;
		case PROCESSEXECUTION:
			setProcessExecution((ProcessExecutionType) value);
			break;
		case PROCESSREQUEST:
			setProcessRequest((ProcessRequestType) value);
			break;
		case PROCESSRUN:
			setProcessRun((ProcessRunType) value);
			break;
		case PROCUREMENTPOINVOICEMATCH:
			setProcurementPOInvoiceMatch((ProcurementPOInvoiceMatchType) value);
			break;
		case PROCUREMENTRECEIPTINVOICEMATCH:
			setProcurementReceiptInvoiceMatch((ProcurementReceiptInvoiceMatchType) value);
			break;
		case PROCUREMENTREQUISITION:
			setProcurementRequisition((ProcurementRequisitionType) value);
			break;
		case PROCUREMENTREQUISITIONLINE:
			setProcurementRequisitionLine((ProcurementRequisitionLineType) value);
			break;
		case PROCUREMENTREQUISITIONPOMATCH:
			setProcurementRequisitionPOMatch((ProcurementRequisitionPOMatchType) value);
			break;
		case PRODUCT:
			setProduct((ProductType) value);
			break;
		case PRODUCTACCOUNTS:
			setProductAccounts((ProductAccountsType) value);
			break;
		case PRODUCTBOM:
			setProductBOM((ProductBOMType) value);
			break;
		case PRODUCTBYPRICEANDWAREHOUSE:
			setProductByPriceAndWarehouse((ProductByPriceAndWarehouseType) value);
			break;
		case PRODUCTCATEGORY:
			setProductCategory((ProductCategoryType) value);
			break;
		case PRODUCTCATEGORYACCOUNTS:
			setProductCategoryAccounts((ProductCategoryAccountsType) value);
			break;
		case PRODUCTCUSTOMER:
			setProductCustomer((ProductCustomerType) value);
			break;
		case PRODUCTORG:
			setProductOrg((ProductOrgType) value);
			break;
		case PRODUCTSTOCKVIEW:
			setProductStockView((ProductStockViewType) value);
			break;
		case PRODUCTSUBSTITUTE:
			setProductSubstitute((ProductSubstituteType) value);
			break;
		case PRODUCTTRL:
			setProductTrl((ProductTrlType) value);
			break;
		case PRODUCTUOM:
			setProductUOM((ProductUOMType) value);
			break;
		case PROJECT:
			setProject((ProjectType) value);
			break;
		case PROJECTACCOUNTS:
			setProjectAccounts((ProjectAccountsType) value);
			break;
		case PROJECTISSUE:
			setProjectIssue((ProjectIssueType) value);
			break;
		case PROJECTLINE:
			setProjectLine((ProjectLineType) value);
			break;
		case PROJECTPHASE:
			setProjectPhase((ProjectPhaseType) value);
			break;
		case PROJECTPROJECTPROPOSALTASK:
			setProjectProjectProposalTask((ProjectProjectProposalTaskType) value);
			break;
		case PROJECTPROPOSAL:
			setProjectProposal((ProjectProposalType) value);
			break;
		case PROJECTPROPOSALLINE:
			setProjectProposalLine((ProjectProposalLineType) value);
			break;
		case PROJECTSTANDARDPHASE:
			setProjectStandardPhase((ProjectStandardPhaseType) value);
			break;
		case PROJECTSTANDARDTASK:
			setProjectStandardTask((ProjectStandardTaskType) value);
			break;
		case PROJECTTASK:
			setProjectTask((ProjectTaskType) value);
			break;
		case PROJECTTYPE:
			setProjectType((ProjectTypeType) value);
			break;
		case PROJECTVENDOR:
			setProjectVendor((ProjectVendorType) value);
			break;
		case REFERENCEDATASTORE:
			setReferenceDataStore((ReferenceDataStoreType) value);
			break;
		case REGION:
			setRegion((RegionType) value);
			break;
		case RESOURCE:
			setResource((ResourceType) value);
			break;
		case RESOURCEASSIGNMENT:
			setResourceAssignment((ResourceAssignmentType) value);
			break;
		case RESOURCETYPE:
			setResourceType((ResourceTypeType) value);
			break;
		case RESOURCEUNAVAILABLE:
			setResourceUnAvailable((ResourceUnAvailableType) value);
			break;
		case RETURNMATERIALORDERPICKEDITLINES:
			setReturnMaterialOrderPickEditLines((ReturnMaterialOrderPickEditLinesType) value);
			break;
		case RETURNMATERIALRECEIPTPICKEDIT:
			setReturnMaterialReceiptPickEdit((ReturnMaterialReceiptPickEditType) value);
			break;
		case RETURNMATERIALSHIPMENTPICKEDIT:
			setReturnMaterialShipmentPickEdit((ReturnMaterialShipmentPickEditType) value);
			break;
		case RETURNREASON:
			setReturnReason((ReturnReasonType) value);
			break;
		case REVERSEDINVOICES:
			setReversedInvoices((ReversedInvoicesType) value);
			break;
		case SQLSCRIPT:
			setSQLScript((SQLScriptType) value);
			break;
		case SALARYCATEGORY:
			setSalaryCategory((SalaryCategoryType) value);
			break;
		case SALARYCATEGORYCOST:
			setSalaryCategoryCost((SalaryCategoryCostType) value);
			break;
		case SALESCOMMISSION:
			setSalesCommission((SalesCommissionType) value);
			break;
		case SALESCOMMISSIONAMOUNT:
			setSalesCommissionAmount((SalesCommissionAmountType) value);
			break;
		case SALESCOMMISSIONDETAIL:
			setSalesCommissionDetail((SalesCommissionDetailType) value);
			break;
		case SALESCOMMISSIONLINE:
			setSalesCommissionLine((SalesCommissionLineType) value);
			break;
		case SALESCOMMISSIONRUN:
			setSalesCommissionRun((SalesCommissionRunType) value);
			break;
		case SALESREGION:
			setSalesRegion((SalesRegionType) value);
			break;
		case SERIALNUMBERCONTROL:
			setSerialNumberControl((SerialNumberControlType) value);
			break;
		case SHIPPINGFREIGHTCATEGORY:
			setShippingFreightCategory((ShippingFreightCategoryType) value);
			break;
		case SHIPPINGSHIPPINGCOMPANY:
			setShippingShippingCompany((ShippingShippingCompanyType) value);
			break;
		case SHIPPINGSHIPPINGCOMPANYFREIGHT:
			setShippingShippingCompanyFreight((ShippingShippingCompanyFreightType) value);
			break;
		case TIMEANDEXPENSESHEET:
			setTimeAndExpenseSheet((TimeAndExpenseSheetType) value);
			break;
		case TIMEANDEXPENSESHEETLINE:
			setTimeAndExpenseSheetLine((TimeAndExpenseSheetLineType) value);
			break;
		case TIMEANDEXPENSESHEETLINEV:
			setTimeAndExpenseSheetLineV((TimeAndExpenseSheetLineVType) value);
			break;
		case TIMETYPE:
			setTimeType((TimeTypeType) value);
			break;
		case UOM:
			setUOM((UOMType) value);
			break;
		case UOMCONVERSION:
			setUOMConversion((UOMConversionType) value);
			break;
		case UOMTRL:
			setUOMTrl((UOMTrlType) value);
			break;
		case VENDORACCOUNTS:
			setVendorAccounts((VendorAccountsType) value);
			break;
		case WAREHOUSE:
			setWarehouse((WarehouseType) value);
			break;
		case WAREHOUSEACCOUNTS:
			setWarehouseAccounts((WarehouseAccountsType) value);
			break;
		case WAREHOUSESHIPPER:
			setWarehouseShipper((WarehouseShipperType) value);
			break;
		case OBUIAPPVIEWROLEACCESS:
			setObuiappViewRoleAccess((ObuiappViewRoleAccessType) value);
			break;
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
