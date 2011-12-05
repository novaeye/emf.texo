package com.openbravo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation for the Feature Group '<em><b>ResultEntitiesType.group</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ResultEntitiesTypeGroupFeatureGroup {

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
			List<ResultEntitiesTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final ResultEntitiesTypeGroupFeatureGroup group : featureGroup) {
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
			List<ResultEntitiesTypeGroupFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final ResultEntitiesTypeGroupFeatureGroup group : featureGroup) {
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
	public static List<ResultEntitiesTypeGroupFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<ResultEntitiesTypeGroupFeatureGroup> result = new ArrayList<ResultEntitiesTypeGroupFeatureGroup>();
		for (Object value : values) {
			final ResultEntitiesTypeGroupFeatureGroup group = new ResultEntitiesTypeGroupFeatureGroup();
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
	private ResultEntityType aDAcctProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAlert;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAlertRecipient;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAlertRule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAlertRuleTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAttachment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAuxiliaryInput;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDCallout;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDClient;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDClientModule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDEPInstancePara;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDEPProcedures;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDElementTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDErrorLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDExtensionPoints;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDFieldGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDFieldGroupTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDFieldTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDFileType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDForm;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDFormAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDFormTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDHeartbeatLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDHeartbeatLogCustomQuery;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDHeartbeatLogCustomQueryRow;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDImage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDLanguage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDListTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDMenu;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDMenuTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDMessage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDMessageTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModelImplementation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModelImplementationMapping;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModuleDBPrefixInstall;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModuleDependencyInst;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModuleInstall;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDModuleMerge;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDMonth;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDMonthTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDOrgModule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDPreference;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcessAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcessInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcessParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcessParameterTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcessScheduling;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDProcessTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDReference;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDReferenceTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDReferencedTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDRegistration;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDRole;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDRoleOrganization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSelector;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSelectorColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSequence;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSession;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSessionStatus;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSessionUsageAudit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSystem;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDSystemInformation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTab;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTabTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTableAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTablePostV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTextInterface;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTextInterfaceTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTree;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDTreeNode;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDUser;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDUserRoles;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDValidation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDWindow;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDWindowAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDWindowTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAuditTrail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDAuditTrailRaw;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aDCreateFactTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aPRMFinAccTransactionAcctV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aPRMFinaccTransactionV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aPRMFinaccTrxFullAcctV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aPRMPendingPaymentInvoice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aPRMRecDetailV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType aPRMReconciliation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType acctSchemaTableDocType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType activeProposalV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType approvedVendor;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType attribute;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType attributeInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType attributeSet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType attributeSetInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType attributeUse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType attributeValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType bank;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType bankAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType bankAccountAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerBankAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerCategoryAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerLocation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerProductTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerTaxCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType businessPartnerWithholding;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType cAcctSchemaProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType city;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType clientInformation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType conditionGoods;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType contactEmailInteraction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType country;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType countryTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType currency;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType currencyConversionRate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType currencyConversionRateDoc;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType currencyTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType customerAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType dataPackage;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType dataSet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType dataSetColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType dataSetTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType documentTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType documentType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType documentTypeTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType emailInteraction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType emailServerConfiguration;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType emailTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType employeeAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType employeeSalaryCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType expenseType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType externalPOS;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType externalPOSCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType externalPOSProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINBankStatement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINBankStatementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINFinaccTransaction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINFinancialAccount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINFinancialAccountAcct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentMethod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentCredit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentDetailV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentPriority;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentPropDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentPropDetailV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentProposal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentSchedInvV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentSchedOrdV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentSchedule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINPaymentScheduleDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINReconciliation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINReconciliationLineTemp;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType fINReconciliationLineV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAccountingCombination;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAccountingFact;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAccountingReport;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAccountingRptElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctCFS;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctRptGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctRptNode;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctSchema;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctSchemaDefault;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctSchemaElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctSchemaGL;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAcctSchemaTable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAmortization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAmortizationLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAsset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAssetAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAssetGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtAssetGroupAcct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtBankFileFormat;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtBankStatement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtBankStatementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtBudget;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtBudgetLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtCalendar;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtCashBook;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtCashBookAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtCashJournal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDPManagement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDPManagementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDebtPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDebtPaymentBalReplace;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDebtPaymentBalancing;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDebtPaymentCancelV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDebtPaymentGenerateV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtDimension;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtElement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtElementValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtElementValueOperand;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtElementValueTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtFinAccPaymentMethod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLBatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLCharge;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLChargeAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLItem;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLItemAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLJournal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtGLJournalLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtIncoterms;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtJournalLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtMatchingAlgorithm;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtNonBusinessDay;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentExecutionHistoryV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentExecutionProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentExecutionProcessParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentRunParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentRunPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentTerm;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentTermLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPaymentTermTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPeriod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPeriodControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPeriodControlV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtPromissoryFormat;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtRemittance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtRemittanceLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtRemittanceParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtRemittanceType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtSettlement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxCategoryTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxPayment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxRate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxRateAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxRegister;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxRegisterType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxRegisterTypeLines;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxRegisterline;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxReport;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtTaxZone;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtWithholding;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtWithholdingAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType financialMgmtYear;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType greeting;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType greetingTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceLineAccountingDimension;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceLineOffer;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceLineTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceSchedule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType invoiceTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType location;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType locator;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType lot;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType lotControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPPlanner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPPlanningMethod;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPPlanningMethodLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPProductionRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPProductionRunLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPPurchasingRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPPurchasingRunLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPSalesForecast;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType mRPSalesForecastLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingActivity;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingActivityToolset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCase;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCheckPoint;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCheckPointSet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCheckPointShift;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCostCenter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCostCenterMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCostcenterEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCostcenterIC;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingCostcenterVersion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingGlobalUse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingIncidence;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingIndirectCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingIndirectCostValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMachineCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMachineStation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMachineType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMainteanceOrder;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMaintenance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMaintenancePeriodicity;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMaintenanceSchedule;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMaintenanceTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMaintenanceWorker;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMeasureGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMeasureShift;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMeasureTime;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingMeasureValues;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingOperation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingOperationEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingOperationIndirectCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingOperationMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingOperationProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingPeriodicControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProcessPlan;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProductionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProductionRunEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProductionRunIndirectCosts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProductionRunInvoiceLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProductionRunMachine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingProductionRunToolset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingSection;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingTest;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingToolset;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingToolsetType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingVersion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingWorkCenter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingWorkEffortEmployee;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingWorkEffortIncidence;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingWorkRequirement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingWorkRequirementOperation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType manufacturingWorkRequirementProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType marketingCampaign;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType marketingChannel;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtABCActivity;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtCosting;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtInternalConsumption;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtInternalConsumptionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtInternalMovement;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtInternalMovementLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtInventoryCount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtInventoryCountLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtMaterialTransaction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtProductionPlan;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtProductionTransaction;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtShipmentInOut;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtShipmentInOutLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtStorageDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType materialMgmtStoragePending;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType modelImplementationParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType moduleDBPrefix;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType moduleDependency;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType moduleLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType moduleTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType namingException;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBCLKERTemplate;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBCLKERTemplateDependency;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBCLKERUIDefinition;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBCQLQueryColumn;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBCQLQueryColumnTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBCQLWidgetQuery;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetClass;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetClassAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetClassMenu;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetClassMenuTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetClassTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetInstance;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetReference;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBKMOWidgetURL;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBSEIGDefaults;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBSERDSDatasource;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBSERDSDatasourceField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBSOIDUserIdentifier;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPMenuParameters;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPNavbarRoleaccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPNavigationBarComponent;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPNote;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPParameter;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPParameterTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPParameterValue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPProcess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPProcessAccess;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPRefWindow;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPUIPersonalization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUIAPPViewImplementation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUISELSelector;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUISELSelectorField;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUISELSelectorFieldTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType oBUISELSelectorTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType order;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType orderDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType orderLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType orderLineOffer;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType orderLineTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType orderTax;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType organization;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType organizationAcctSchema;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType organizationClosing;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType organizationInformation;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType organizationModuleV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType organizationType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType periodControlLog;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingAdjustment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingAdjustmentBusinessPartner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingAdjustmentBusinessPartnerGroup;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingAdjustmentPriceList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingAdjustmentProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingAdjustmentProductCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingPriceList;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingPriceListSchema;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingPriceListSchemeLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingPriceListVersion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingProductPrice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingVolumeDiscount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingVolumeDiscountBusinessPartner;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingVolumeDiscountInvoice;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingVolumeDiscountProduct;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingVolumeDiscountProductCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType pricingVolumeDiscountScale;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType processExecution;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType processRequest;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType processRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType procurementPOInvoiceMatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType procurementReceiptInvoiceMatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType procurementRequisition;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType procurementRequisitionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType procurementRequisitionPOMatch;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType product;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productBOM;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productByPriceAndWarehouse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productCategoryAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productCustomer;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productOrg;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productStockView;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productSubstitute;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType productUOM;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType project;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectIssue;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectPhase;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectProjectProposalTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectProposal;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectProposalLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectStandardPhase;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectStandardTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectTask;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType projectVendor;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType referenceDataStore;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType region;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType resource;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType resourceAssignment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType resourceType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType resourceUnAvailable;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType returnMaterialOrderPickEditLines;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType returnMaterialReceiptPickEdit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType returnMaterialShipmentPickEdit;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType returnReason;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType reversedInvoices;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType sQLScript;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salaryCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salaryCategoryCost;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salesCommission;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salesCommissionAmount;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salesCommissionDetail;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salesCommissionLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salesCommissionRun;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType salesRegion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType serialNumberControl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType shippingFreightCategory;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType shippingShippingCompany;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType shippingShippingCompanyFreight;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType timeAndExpenseSheet;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType timeAndExpenseSheetLine;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType timeAndExpenseSheetLineV;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType timeType;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType uOM;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType uOMConversion;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType uOMTrl;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType vendorAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType warehouse;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType warehouseAccounts;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType warehouseShipper;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntityType obuiappViewRoleAccess;

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
	public ResultEntityType getADAcctProcess() {
		return aDAcctProcess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAcctProcess() <em>aDAcctProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAcctProcess() aDAcctProcess}' feature.
	 * @generated
	 */
	public void setADAcctProcess(ResultEntityType newADAcctProcess) {
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
	public ResultEntityType getADAlert() {
		return aDAlert;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlert() <em>aDAlert</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlert() aDAlert}' feature.
	 * @generated
	 */
	public void setADAlert(ResultEntityType newADAlert) {
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
	public ResultEntityType getADAlertRecipient() {
		return aDAlertRecipient;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlertRecipient() <em>aDAlertRecipient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlertRecipient() aDAlertRecipient}' feature.
	 * @generated
	 */
	public void setADAlertRecipient(ResultEntityType newADAlertRecipient) {
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
	public ResultEntityType getADAlertRule() {
		return aDAlertRule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlertRule() <em>aDAlertRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlertRule() aDAlertRule}' feature.
	 * @generated
	 */
	public void setADAlertRule(ResultEntityType newADAlertRule) {
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
	public ResultEntityType getADAlertRuleTrl() {
		return aDAlertRuleTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlertRuleTrl() <em>aDAlertRuleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlertRuleTrl() aDAlertRuleTrl}' feature.
	 * @generated
	 */
	public void setADAlertRuleTrl(ResultEntityType newADAlertRuleTrl) {
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
	public ResultEntityType getADAttachment() {
		return aDAttachment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAttachment() <em>aDAttachment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAttachment() aDAttachment}' feature.
	 * @generated
	 */
	public void setADAttachment(ResultEntityType newADAttachment) {
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
	public ResultEntityType getADAuxiliaryInput() {
		return aDAuxiliaryInput;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAuxiliaryInput() <em>aDAuxiliaryInput</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAuxiliaryInput() aDAuxiliaryInput}' feature.
	 * @generated
	 */
	public void setADAuxiliaryInput(ResultEntityType newADAuxiliaryInput) {
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
	public ResultEntityType getADCallout() {
		return aDCallout;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADCallout() <em>aDCallout</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADCallout() aDCallout}' feature.
	 * @generated
	 */
	public void setADCallout(ResultEntityType newADCallout) {
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
	public ResultEntityType getADClient() {
		return aDClient;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADClient() <em>aDClient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADClient() aDClient}' feature.
	 * @generated
	 */
	public void setADClient(ResultEntityType newADClient) {
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
	public ResultEntityType getADClientModule() {
		return aDClientModule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADClientModule() <em>aDClientModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADClientModule() aDClientModule}' feature.
	 * @generated
	 */
	public void setADClientModule(ResultEntityType newADClientModule) {
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
	public ResultEntityType getADColumn() {
		return aDColumn;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADColumn() <em>aDColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADColumn() aDColumn}' feature.
	 * @generated
	 */
	public void setADColumn(ResultEntityType newADColumn) {
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
	public ResultEntityType getADEPInstancePara() {
		return aDEPInstancePara;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADEPInstancePara() <em>aDEPInstancePara</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADEPInstancePara() aDEPInstancePara}' feature.
	 * @generated
	 */
	public void setADEPInstancePara(ResultEntityType newADEPInstancePara) {
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
	public ResultEntityType getADEPProcedures() {
		return aDEPProcedures;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADEPProcedures() <em>aDEPProcedures</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADEPProcedures() aDEPProcedures}' feature.
	 * @generated
	 */
	public void setADEPProcedures(ResultEntityType newADEPProcedures) {
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
	public ResultEntityType getADElement() {
		return aDElement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADElement() <em>aDElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADElement() aDElement}' feature.
	 * @generated
	 */
	public void setADElement(ResultEntityType newADElement) {
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
	public ResultEntityType getADElementTrl() {
		return aDElementTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADElementTrl() <em>aDElementTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADElementTrl() aDElementTrl}' feature.
	 * @generated
	 */
	public void setADElementTrl(ResultEntityType newADElementTrl) {
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
	public ResultEntityType getADErrorLog() {
		return aDErrorLog;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADErrorLog() <em>aDErrorLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADErrorLog() aDErrorLog}' feature.
	 * @generated
	 */
	public void setADErrorLog(ResultEntityType newADErrorLog) {
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
	public ResultEntityType getADExtensionPoints() {
		return aDExtensionPoints;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADExtensionPoints() <em>aDExtensionPoints</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADExtensionPoints() aDExtensionPoints}' feature.
	 * @generated
	 */
	public void setADExtensionPoints(ResultEntityType newADExtensionPoints) {
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
	public ResultEntityType getADField() {
		return aDField;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADField() <em>aDField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADField() aDField}' feature.
	 * @generated
	 */
	public void setADField(ResultEntityType newADField) {
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
	public ResultEntityType getADFieldGroup() {
		return aDFieldGroup;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFieldGroup() <em>aDFieldGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFieldGroup() aDFieldGroup}' feature.
	 * @generated
	 */
	public void setADFieldGroup(ResultEntityType newADFieldGroup) {
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
	public ResultEntityType getADFieldGroupTrl() {
		return aDFieldGroupTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFieldGroupTrl() <em>aDFieldGroupTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFieldGroupTrl() aDFieldGroupTrl}' feature.
	 * @generated
	 */
	public void setADFieldGroupTrl(ResultEntityType newADFieldGroupTrl) {
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
	public ResultEntityType getADFieldTrl() {
		return aDFieldTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFieldTrl() <em>aDFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFieldTrl() aDFieldTrl}' feature.
	 * @generated
	 */
	public void setADFieldTrl(ResultEntityType newADFieldTrl) {
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
	public ResultEntityType getADFileType() {
		return aDFileType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFileType() <em>aDFileType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFileType() aDFileType}' feature.
	 * @generated
	 */
	public void setADFileType(ResultEntityType newADFileType) {
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
	public ResultEntityType getADForm() {
		return aDForm;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADForm() <em>aDForm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADForm() aDForm}' feature.
	 * @generated
	 */
	public void setADForm(ResultEntityType newADForm) {
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
	public ResultEntityType getADFormAccess() {
		return aDFormAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFormAccess() <em>aDFormAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFormAccess() aDFormAccess}' feature.
	 * @generated
	 */
	public void setADFormAccess(ResultEntityType newADFormAccess) {
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
	public ResultEntityType getADFormTrl() {
		return aDFormTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFormTrl() <em>aDFormTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFormTrl() aDFormTrl}' feature.
	 * @generated
	 */
	public void setADFormTrl(ResultEntityType newADFormTrl) {
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
	public ResultEntityType getADHeartbeatLog() {
		return aDHeartbeatLog;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADHeartbeatLog() <em>aDHeartbeatLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADHeartbeatLog() aDHeartbeatLog}' feature.
	 * @generated
	 */
	public void setADHeartbeatLog(ResultEntityType newADHeartbeatLog) {
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
	public ResultEntityType getADHeartbeatLogCustomQuery() {
		return aDHeartbeatLogCustomQuery;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADHeartbeatLogCustomQuery() <em>aDHeartbeatLogCustomQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADHeartbeatLogCustomQuery() aDHeartbeatLogCustomQuery}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQuery(
			ResultEntityType newADHeartbeatLogCustomQuery) {
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
	public ResultEntityType getADHeartbeatLogCustomQueryRow() {
		return aDHeartbeatLogCustomQueryRow;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADHeartbeatLogCustomQueryRow() <em>aDHeartbeatLogCustomQueryRow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADHeartbeatLogCustomQueryRow() aDHeartbeatLogCustomQueryRow}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQueryRow(
			ResultEntityType newADHeartbeatLogCustomQueryRow) {
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
	public ResultEntityType getADImage() {
		return aDImage;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADImage() <em>aDImage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADImage() aDImage}' feature.
	 * @generated
	 */
	public void setADImage(ResultEntityType newADImage) {
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
	public ResultEntityType getADLanguage() {
		return aDLanguage;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADLanguage() <em>aDLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADLanguage() aDLanguage}' feature.
	 * @generated
	 */
	public void setADLanguage(ResultEntityType newADLanguage) {
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
	public ResultEntityType getADList() {
		return aDList;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADList() <em>aDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADList() aDList}' feature.
	 * @generated
	 */
	public void setADList(ResultEntityType newADList) {
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
	public ResultEntityType getADListTrl() {
		return aDListTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADListTrl() <em>aDListTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADListTrl() aDListTrl}' feature.
	 * @generated
	 */
	public void setADListTrl(ResultEntityType newADListTrl) {
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
	public ResultEntityType getADMenu() {
		return aDMenu;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMenu() <em>aDMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMenu() aDMenu}' feature.
	 * @generated
	 */
	public void setADMenu(ResultEntityType newADMenu) {
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
	public ResultEntityType getADMenuTrl() {
		return aDMenuTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMenuTrl() <em>aDMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMenuTrl() aDMenuTrl}' feature.
	 * @generated
	 */
	public void setADMenuTrl(ResultEntityType newADMenuTrl) {
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
	public ResultEntityType getADMessage() {
		return aDMessage;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMessage() <em>aDMessage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMessage() aDMessage}' feature.
	 * @generated
	 */
	public void setADMessage(ResultEntityType newADMessage) {
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
	public ResultEntityType getADMessageTrl() {
		return aDMessageTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMessageTrl() <em>aDMessageTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMessageTrl() aDMessageTrl}' feature.
	 * @generated
	 */
	public void setADMessageTrl(ResultEntityType newADMessageTrl) {
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
	public ResultEntityType getADModelImplementation() {
		return aDModelImplementation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModelImplementation() <em>aDModelImplementation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModelImplementation() aDModelImplementation}' feature.
	 * @generated
	 */
	public void setADModelImplementation(
			ResultEntityType newADModelImplementation) {
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
	public ResultEntityType getADModelImplementationMapping() {
		return aDModelImplementationMapping;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModelImplementationMapping() <em>aDModelImplementationMapping</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModelImplementationMapping() aDModelImplementationMapping}' feature.
	 * @generated
	 */
	public void setADModelImplementationMapping(
			ResultEntityType newADModelImplementationMapping) {
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
	public ResultEntityType getADModule() {
		return aDModule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModule() <em>aDModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModule() aDModule}' feature.
	 * @generated
	 */
	public void setADModule(ResultEntityType newADModule) {
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
	public ResultEntityType getADModuleDBPrefixInstall() {
		return aDModuleDBPrefixInstall;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModuleDBPrefixInstall() <em>aDModuleDBPrefixInstall</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModuleDBPrefixInstall() aDModuleDBPrefixInstall}' feature.
	 * @generated
	 */
	public void setADModuleDBPrefixInstall(
			ResultEntityType newADModuleDBPrefixInstall) {
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
	public ResultEntityType getADModuleDependencyInst() {
		return aDModuleDependencyInst;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModuleDependencyInst() <em>aDModuleDependencyInst</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModuleDependencyInst() aDModuleDependencyInst}' feature.
	 * @generated
	 */
	public void setADModuleDependencyInst(
			ResultEntityType newADModuleDependencyInst) {
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
	public ResultEntityType getADModuleInstall() {
		return aDModuleInstall;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModuleInstall() <em>aDModuleInstall</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModuleInstall() aDModuleInstall}' feature.
	 * @generated
	 */
	public void setADModuleInstall(ResultEntityType newADModuleInstall) {
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
	public ResultEntityType getADModuleMerge() {
		return aDModuleMerge;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModuleMerge() <em>aDModuleMerge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModuleMerge() aDModuleMerge}' feature.
	 * @generated
	 */
	public void setADModuleMerge(ResultEntityType newADModuleMerge) {
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
	public ResultEntityType getADMonth() {
		return aDMonth;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMonth() <em>aDMonth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMonth() aDMonth}' feature.
	 * @generated
	 */
	public void setADMonth(ResultEntityType newADMonth) {
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
	public ResultEntityType getADMonthTrl() {
		return aDMonthTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMonthTrl() <em>aDMonthTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMonthTrl() aDMonthTrl}' feature.
	 * @generated
	 */
	public void setADMonthTrl(ResultEntityType newADMonthTrl) {
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
	public ResultEntityType getADOrgModule() {
		return aDOrgModule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADOrgModule() <em>aDOrgModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADOrgModule() aDOrgModule}' feature.
	 * @generated
	 */
	public void setADOrgModule(ResultEntityType newADOrgModule) {
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
	public ResultEntityType getADParameter() {
		return aDParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADParameter() <em>aDParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADParameter() aDParameter}' feature.
	 * @generated
	 */
	public void setADParameter(ResultEntityType newADParameter) {
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
	public ResultEntityType getADPreference() {
		return aDPreference;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADPreference() <em>aDPreference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADPreference() aDPreference}' feature.
	 * @generated
	 */
	public void setADPreference(ResultEntityType newADPreference) {
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
	public ResultEntityType getADProcess() {
		return aDProcess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcess() <em>aDProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcess() aDProcess}' feature.
	 * @generated
	 */
	public void setADProcess(ResultEntityType newADProcess) {
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
	public ResultEntityType getADProcessAccess() {
		return aDProcessAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessAccess() <em>aDProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessAccess() aDProcessAccess}' feature.
	 * @generated
	 */
	public void setADProcessAccess(ResultEntityType newADProcessAccess) {
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
	public ResultEntityType getADProcessInstance() {
		return aDProcessInstance;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessInstance() <em>aDProcessInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessInstance() aDProcessInstance}' feature.
	 * @generated
	 */
	public void setADProcessInstance(ResultEntityType newADProcessInstance) {
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
	public ResultEntityType getADProcessParameter() {
		return aDProcessParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessParameter() <em>aDProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessParameter() aDProcessParameter}' feature.
	 * @generated
	 */
	public void setADProcessParameter(ResultEntityType newADProcessParameter) {
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
	public ResultEntityType getADProcessParameterTrl() {
		return aDProcessParameterTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessParameterTrl() <em>aDProcessParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessParameterTrl() aDProcessParameterTrl}' feature.
	 * @generated
	 */
	public void setADProcessParameterTrl(
			ResultEntityType newADProcessParameterTrl) {
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
	public ResultEntityType getADProcessScheduling() {
		return aDProcessScheduling;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessScheduling() <em>aDProcessScheduling</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessScheduling() aDProcessScheduling}' feature.
	 * @generated
	 */
	public void setADProcessScheduling(ResultEntityType newADProcessScheduling) {
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
	public ResultEntityType getADProcessTrl() {
		return aDProcessTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessTrl() <em>aDProcessTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessTrl() aDProcessTrl}' feature.
	 * @generated
	 */
	public void setADProcessTrl(ResultEntityType newADProcessTrl) {
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
	public ResultEntityType getADReference() {
		return aDReference;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADReference() <em>aDReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADReference() aDReference}' feature.
	 * @generated
	 */
	public void setADReference(ResultEntityType newADReference) {
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
	public ResultEntityType getADReferenceTrl() {
		return aDReferenceTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADReferenceTrl() <em>aDReferenceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADReferenceTrl() aDReferenceTrl}' feature.
	 * @generated
	 */
	public void setADReferenceTrl(ResultEntityType newADReferenceTrl) {
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
	public ResultEntityType getADReferencedTable() {
		return aDReferencedTable;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADReferencedTable() <em>aDReferencedTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADReferencedTable() aDReferencedTable}' feature.
	 * @generated
	 */
	public void setADReferencedTable(ResultEntityType newADReferencedTable) {
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
	public ResultEntityType getADRegistration() {
		return aDRegistration;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADRegistration() <em>aDRegistration</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADRegistration() aDRegistration}' feature.
	 * @generated
	 */
	public void setADRegistration(ResultEntityType newADRegistration) {
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
	public ResultEntityType getADRole() {
		return aDRole;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADRole() <em>aDRole</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADRole() aDRole}' feature.
	 * @generated
	 */
	public void setADRole(ResultEntityType newADRole) {
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
	public ResultEntityType getADRoleOrganization() {
		return aDRoleOrganization;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADRoleOrganization() <em>aDRoleOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADRoleOrganization() aDRoleOrganization}' feature.
	 * @generated
	 */
	public void setADRoleOrganization(ResultEntityType newADRoleOrganization) {
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
	public ResultEntityType getADSelector() {
		return aDSelector;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSelector() <em>aDSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSelector() aDSelector}' feature.
	 * @generated
	 */
	public void setADSelector(ResultEntityType newADSelector) {
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
	public ResultEntityType getADSelectorColumn() {
		return aDSelectorColumn;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSelectorColumn() <em>aDSelectorColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSelectorColumn() aDSelectorColumn}' feature.
	 * @generated
	 */
	public void setADSelectorColumn(ResultEntityType newADSelectorColumn) {
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
	public ResultEntityType getADSequence() {
		return aDSequence;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSequence() <em>aDSequence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSequence() aDSequence}' feature.
	 * @generated
	 */
	public void setADSequence(ResultEntityType newADSequence) {
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
	public ResultEntityType getADSession() {
		return aDSession;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSession() <em>aDSession</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSession() aDSession}' feature.
	 * @generated
	 */
	public void setADSession(ResultEntityType newADSession) {
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
	public ResultEntityType getADSessionStatus() {
		return aDSessionStatus;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSessionStatus() <em>aDSessionStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSessionStatus() aDSessionStatus}' feature.
	 * @generated
	 */
	public void setADSessionStatus(ResultEntityType newADSessionStatus) {
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
	public ResultEntityType getADSessionUsageAudit() {
		return aDSessionUsageAudit;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSessionUsageAudit() <em>aDSessionUsageAudit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSessionUsageAudit() aDSessionUsageAudit}' feature.
	 * @generated
	 */
	public void setADSessionUsageAudit(ResultEntityType newADSessionUsageAudit) {
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
	public ResultEntityType getADSystem() {
		return aDSystem;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSystem() <em>aDSystem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSystem() aDSystem}' feature.
	 * @generated
	 */
	public void setADSystem(ResultEntityType newADSystem) {
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
	public ResultEntityType getADSystemInformation() {
		return aDSystemInformation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSystemInformation() <em>aDSystemInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSystemInformation() aDSystemInformation}' feature.
	 * @generated
	 */
	public void setADSystemInformation(ResultEntityType newADSystemInformation) {
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
	public ResultEntityType getADTab() {
		return aDTab;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTab() <em>aDTab</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTab() aDTab}' feature.
	 * @generated
	 */
	public void setADTab(ResultEntityType newADTab) {
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
	public ResultEntityType getADTabTrl() {
		return aDTabTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTabTrl() <em>aDTabTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTabTrl() aDTabTrl}' feature.
	 * @generated
	 */
	public void setADTabTrl(ResultEntityType newADTabTrl) {
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
	public ResultEntityType getADTable() {
		return aDTable;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTable() <em>aDTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTable() aDTable}' feature.
	 * @generated
	 */
	public void setADTable(ResultEntityType newADTable) {
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
	public ResultEntityType getADTableAccess() {
		return aDTableAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTableAccess() <em>aDTableAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTableAccess() aDTableAccess}' feature.
	 * @generated
	 */
	public void setADTableAccess(ResultEntityType newADTableAccess) {
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
	public ResultEntityType getADTablePostV() {
		return aDTablePostV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTablePostV() <em>aDTablePostV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTablePostV() aDTablePostV}' feature.
	 * @generated
	 */
	public void setADTablePostV(ResultEntityType newADTablePostV) {
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
	public ResultEntityType getADTextInterface() {
		return aDTextInterface;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTextInterface() <em>aDTextInterface</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTextInterface() aDTextInterface}' feature.
	 * @generated
	 */
	public void setADTextInterface(ResultEntityType newADTextInterface) {
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
	public ResultEntityType getADTextInterfaceTrl() {
		return aDTextInterfaceTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTextInterfaceTrl() <em>aDTextInterfaceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTextInterfaceTrl() aDTextInterfaceTrl}' feature.
	 * @generated
	 */
	public void setADTextInterfaceTrl(ResultEntityType newADTextInterfaceTrl) {
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
	public ResultEntityType getADTree() {
		return aDTree;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTree() <em>aDTree</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTree() aDTree}' feature.
	 * @generated
	 */
	public void setADTree(ResultEntityType newADTree) {
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
	public ResultEntityType getADTreeNode() {
		return aDTreeNode;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTreeNode() <em>aDTreeNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTreeNode() aDTreeNode}' feature.
	 * @generated
	 */
	public void setADTreeNode(ResultEntityType newADTreeNode) {
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
	public ResultEntityType getADUser() {
		return aDUser;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADUser() <em>aDUser</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADUser() aDUser}' feature.
	 * @generated
	 */
	public void setADUser(ResultEntityType newADUser) {
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
	public ResultEntityType getADUserRoles() {
		return aDUserRoles;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADUserRoles() <em>aDUserRoles</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADUserRoles() aDUserRoles}' feature.
	 * @generated
	 */
	public void setADUserRoles(ResultEntityType newADUserRoles) {
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
	public ResultEntityType getADValidation() {
		return aDValidation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADValidation() <em>aDValidation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADValidation() aDValidation}' feature.
	 * @generated
	 */
	public void setADValidation(ResultEntityType newADValidation) {
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
	public ResultEntityType getADWindow() {
		return aDWindow;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADWindow() <em>aDWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADWindow() aDWindow}' feature.
	 * @generated
	 */
	public void setADWindow(ResultEntityType newADWindow) {
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
	public ResultEntityType getADWindowAccess() {
		return aDWindowAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADWindowAccess() <em>aDWindowAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADWindowAccess() aDWindowAccess}' feature.
	 * @generated
	 */
	public void setADWindowAccess(ResultEntityType newADWindowAccess) {
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
	public ResultEntityType getADWindowTrl() {
		return aDWindowTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADWindowTrl() <em>aDWindowTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADWindowTrl() aDWindowTrl}' feature.
	 * @generated
	 */
	public void setADWindowTrl(ResultEntityType newADWindowTrl) {
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
	public ResultEntityType getADAuditTrail() {
		return aDAuditTrail;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAuditTrail() <em>aDAuditTrail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAuditTrail() aDAuditTrail}' feature.
	 * @generated
	 */
	public void setADAuditTrail(ResultEntityType newADAuditTrail) {
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
	public ResultEntityType getADAuditTrailRaw() {
		return aDAuditTrailRaw;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAuditTrailRaw() <em>aDAuditTrailRaw</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAuditTrailRaw() aDAuditTrailRaw}' feature.
	 * @generated
	 */
	public void setADAuditTrailRaw(ResultEntityType newADAuditTrailRaw) {
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
	public ResultEntityType getADCreateFactTemplate() {
		return aDCreateFactTemplate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADCreateFactTemplate() <em>aDCreateFactTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADCreateFactTemplate() aDCreateFactTemplate}' feature.
	 * @generated
	 */
	public void setADCreateFactTemplate(ResultEntityType newADCreateFactTemplate) {
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
	public ResultEntityType getAPRMFinAccTransactionAcctV() {
		return aPRMFinAccTransactionAcctV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMFinAccTransactionAcctV() <em>aPRMFinAccTransactionAcctV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMFinAccTransactionAcctV() aPRMFinAccTransactionAcctV}' feature.
	 * @generated
	 */
	public void setAPRMFinAccTransactionAcctV(
			ResultEntityType newAPRMFinAccTransactionAcctV) {
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
	public ResultEntityType getAPRMFinaccTransactionV() {
		return aPRMFinaccTransactionV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMFinaccTransactionV() <em>aPRMFinaccTransactionV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMFinaccTransactionV() aPRMFinaccTransactionV}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTransactionV(
			ResultEntityType newAPRMFinaccTransactionV) {
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
	public ResultEntityType getAPRMFinaccTrxFullAcctV() {
		return aPRMFinaccTrxFullAcctV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMFinaccTrxFullAcctV() <em>aPRMFinaccTrxFullAcctV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMFinaccTrxFullAcctV() aPRMFinaccTrxFullAcctV}' feature.
	 * @generated
	 */
	public void setAPRMFinaccTrxFullAcctV(
			ResultEntityType newAPRMFinaccTrxFullAcctV) {
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
	public ResultEntityType getAPRMPendingPaymentInvoice() {
		return aPRMPendingPaymentInvoice;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMPendingPaymentInvoice() <em>aPRMPendingPaymentInvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMPendingPaymentInvoice() aPRMPendingPaymentInvoice}' feature.
	 * @generated
	 */
	public void setAPRMPendingPaymentInvoice(
			ResultEntityType newAPRMPendingPaymentInvoice) {
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
	public ResultEntityType getAPRMRecDetailV() {
		return aPRMRecDetailV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMRecDetailV() <em>aPRMRecDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMRecDetailV() aPRMRecDetailV}' feature.
	 * @generated
	 */
	public void setAPRMRecDetailV(ResultEntityType newAPRMRecDetailV) {
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
	public ResultEntityType getAPRMReconciliation() {
		return aPRMReconciliation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMReconciliation() <em>aPRMReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMReconciliation() aPRMReconciliation}' feature.
	 * @generated
	 */
	public void setAPRMReconciliation(ResultEntityType newAPRMReconciliation) {
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
	public ResultEntityType getAcctSchemaTableDocType() {
		return acctSchemaTableDocType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAcctSchemaTableDocType() <em>acctSchemaTableDocType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAcctSchemaTableDocType() acctSchemaTableDocType}' feature.
	 * @generated
	 */
	public void setAcctSchemaTableDocType(
			ResultEntityType newAcctSchemaTableDocType) {
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
	public ResultEntityType getActiveProposalV() {
		return activeProposalV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getActiveProposalV() <em>activeProposalV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getActiveProposalV() activeProposalV}' feature.
	 * @generated
	 */
	public void setActiveProposalV(ResultEntityType newActiveProposalV) {
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
	public ResultEntityType getApprovedVendor() {
		return approvedVendor;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getApprovedVendor() <em>approvedVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getApprovedVendor() approvedVendor}' feature.
	 * @generated
	 */
	public void setApprovedVendor(ResultEntityType newApprovedVendor) {
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
	public ResultEntityType getAttribute() {
		return attribute;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttribute() <em>attribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttribute() attribute}' feature.
	 * @generated
	 */
	public void setAttribute(ResultEntityType newAttribute) {
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
	public ResultEntityType getAttributeInstance() {
		return attributeInstance;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeInstance() <em>attributeInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeInstance() attributeInstance}' feature.
	 * @generated
	 */
	public void setAttributeInstance(ResultEntityType newAttributeInstance) {
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
	public ResultEntityType getAttributeSet() {
		return attributeSet;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeSet() <em>attributeSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeSet() attributeSet}' feature.
	 * @generated
	 */
	public void setAttributeSet(ResultEntityType newAttributeSet) {
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
	public ResultEntityType getAttributeSetInstance() {
		return attributeSetInstance;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeSetInstance() <em>attributeSetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeSetInstance() attributeSetInstance}' feature.
	 * @generated
	 */
	public void setAttributeSetInstance(ResultEntityType newAttributeSetInstance) {
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
	public ResultEntityType getAttributeUse() {
		return attributeUse;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeUse() <em>attributeUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeUse() attributeUse}' feature.
	 * @generated
	 */
	public void setAttributeUse(ResultEntityType newAttributeUse) {
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
	public ResultEntityType getAttributeValue() {
		return attributeValue;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeValue() <em>attributeValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeValue() attributeValue}' feature.
	 * @generated
	 */
	public void setAttributeValue(ResultEntityType newAttributeValue) {
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
	public ResultEntityType getBank() {
		return bank;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBank() <em>bank</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBank() bank}' feature.
	 * @generated
	 */
	public void setBank(ResultEntityType newBank) {
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
	public ResultEntityType getBankAccount() {
		return bankAccount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(ResultEntityType newBankAccount) {
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
	public ResultEntityType getBankAccountAccounts() {
		return bankAccountAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBankAccountAccounts() <em>bankAccountAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBankAccountAccounts() bankAccountAccounts}' feature.
	 * @generated
	 */
	public void setBankAccountAccounts(ResultEntityType newBankAccountAccounts) {
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
	public ResultEntityType getBusinessPartner() {
		return businessPartner;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(ResultEntityType newBusinessPartner) {
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
	public ResultEntityType getBusinessPartnerBankAccount() {
		return businessPartnerBankAccount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerBankAccount() <em>businessPartnerBankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerBankAccount() businessPartnerBankAccount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerBankAccount(
			ResultEntityType newBusinessPartnerBankAccount) {
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
	public ResultEntityType getBusinessPartnerCategory() {
		return businessPartnerCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerCategory() <em>businessPartnerCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerCategory() businessPartnerCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategory(
			ResultEntityType newBusinessPartnerCategory) {
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
	public ResultEntityType getBusinessPartnerCategoryAccount() {
		return businessPartnerCategoryAccount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerCategoryAccount() <em>businessPartnerCategoryAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerCategoryAccount() businessPartnerCategoryAccount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerCategoryAccount(
			ResultEntityType newBusinessPartnerCategoryAccount) {
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
	public ResultEntityType getBusinessPartnerDiscount() {
		return businessPartnerDiscount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerDiscount() <em>businessPartnerDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerDiscount() businessPartnerDiscount}' feature.
	 * @generated
	 */
	public void setBusinessPartnerDiscount(
			ResultEntityType newBusinessPartnerDiscount) {
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
	public ResultEntityType getBusinessPartnerLocation() {
		return businessPartnerLocation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerLocation() <em>businessPartnerLocation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerLocation() businessPartnerLocation}' feature.
	 * @generated
	 */
	public void setBusinessPartnerLocation(
			ResultEntityType newBusinessPartnerLocation) {
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
	public ResultEntityType getBusinessPartnerProductTemplate() {
		return businessPartnerProductTemplate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerProductTemplate() <em>businessPartnerProductTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerProductTemplate() businessPartnerProductTemplate}' feature.
	 * @generated
	 */
	public void setBusinessPartnerProductTemplate(
			ResultEntityType newBusinessPartnerProductTemplate) {
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
	public ResultEntityType getBusinessPartnerTaxCategory() {
		return businessPartnerTaxCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerTaxCategory() <em>businessPartnerTaxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerTaxCategory() businessPartnerTaxCategory}' feature.
	 * @generated
	 */
	public void setBusinessPartnerTaxCategory(
			ResultEntityType newBusinessPartnerTaxCategory) {
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
	public ResultEntityType getBusinessPartnerWithholding() {
		return businessPartnerWithholding;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartnerWithholding() <em>businessPartnerWithholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartnerWithholding() businessPartnerWithholding}' feature.
	 * @generated
	 */
	public void setBusinessPartnerWithholding(
			ResultEntityType newBusinessPartnerWithholding) {
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
	public ResultEntityType getCAcctSchemaProcess() {
		return cAcctSchemaProcess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCAcctSchemaProcess() <em>cAcctSchemaProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCAcctSchemaProcess() cAcctSchemaProcess}' feature.
	 * @generated
	 */
	public void setCAcctSchemaProcess(ResultEntityType newCAcctSchemaProcess) {
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
	public ResultEntityType getCity() {
		return city;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(ResultEntityType newCity) {
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
	public ResultEntityType getClientInformation() {
		return clientInformation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getClientInformation() <em>clientInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getClientInformation() clientInformation}' feature.
	 * @generated
	 */
	public void setClientInformation(ResultEntityType newClientInformation) {
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
	public ResultEntityType getConditionGoods() {
		return conditionGoods;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getConditionGoods() <em>conditionGoods</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getConditionGoods() conditionGoods}' feature.
	 * @generated
	 */
	public void setConditionGoods(ResultEntityType newConditionGoods) {
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
	public ResultEntityType getContactEmailInteraction() {
		return contactEmailInteraction;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getContactEmailInteraction() <em>contactEmailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getContactEmailInteraction() contactEmailInteraction}' feature.
	 * @generated
	 */
	public void setContactEmailInteraction(
			ResultEntityType newContactEmailInteraction) {
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
	public ResultEntityType getCountry() {
		return country;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(ResultEntityType newCountry) {
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
	public ResultEntityType getCountryTrl() {
		return countryTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCountryTrl() <em>countryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCountryTrl() countryTrl}' feature.
	 * @generated
	 */
	public void setCountryTrl(ResultEntityType newCountryTrl) {
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
	public ResultEntityType getCurrency() {
		return currency;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(ResultEntityType newCurrency) {
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
	public ResultEntityType getCurrencyConversionRate() {
		return currencyConversionRate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCurrencyConversionRate() <em>currencyConversionRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCurrencyConversionRate() currencyConversionRate}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRate(
			ResultEntityType newCurrencyConversionRate) {
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
	public ResultEntityType getCurrencyConversionRateDoc() {
		return currencyConversionRateDoc;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCurrencyConversionRateDoc() <em>currencyConversionRateDoc</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCurrencyConversionRateDoc() currencyConversionRateDoc}' feature.
	 * @generated
	 */
	public void setCurrencyConversionRateDoc(
			ResultEntityType newCurrencyConversionRateDoc) {
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
	public ResultEntityType getCurrencyTrl() {
		return currencyTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCurrencyTrl() <em>currencyTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCurrencyTrl() currencyTrl}' feature.
	 * @generated
	 */
	public void setCurrencyTrl(ResultEntityType newCurrencyTrl) {
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
	public ResultEntityType getCustomerAccounts() {
		return customerAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCustomerAccounts() <em>customerAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCustomerAccounts() customerAccounts}' feature.
	 * @generated
	 */
	public void setCustomerAccounts(ResultEntityType newCustomerAccounts) {
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
	public ResultEntityType getDataPackage() {
		return dataPackage;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataPackage() <em>dataPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataPackage() dataPackage}' feature.
	 * @generated
	 */
	public void setDataPackage(ResultEntityType newDataPackage) {
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
	public ResultEntityType getDataSet() {
		return dataSet;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataSet() <em>dataSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataSet() dataSet}' feature.
	 * @generated
	 */
	public void setDataSet(ResultEntityType newDataSet) {
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
	public ResultEntityType getDataSetColumn() {
		return dataSetColumn;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataSetColumn() <em>dataSetColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataSetColumn() dataSetColumn}' feature.
	 * @generated
	 */
	public void setDataSetColumn(ResultEntityType newDataSetColumn) {
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
	public ResultEntityType getDataSetTable() {
		return dataSetTable;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataSetTable() <em>dataSetTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataSetTable() dataSetTable}' feature.
	 * @generated
	 */
	public void setDataSetTable(ResultEntityType newDataSetTable) {
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
	public ResultEntityType getDocumentTemplate() {
		return documentTemplate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDocumentTemplate() <em>documentTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDocumentTemplate() documentTemplate}' feature.
	 * @generated
	 */
	public void setDocumentTemplate(ResultEntityType newDocumentTemplate) {
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
	public ResultEntityType getDocumentType() {
		return documentType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(ResultEntityType newDocumentType) {
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
	public ResultEntityType getDocumentTypeTrl() {
		return documentTypeTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDocumentTypeTrl() <em>documentTypeTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDocumentTypeTrl() documentTypeTrl}' feature.
	 * @generated
	 */
	public void setDocumentTypeTrl(ResultEntityType newDocumentTypeTrl) {
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
	public ResultEntityType getEmailInteraction() {
		return emailInteraction;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmailInteraction() <em>emailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmailInteraction() emailInteraction}' feature.
	 * @generated
	 */
	public void setEmailInteraction(ResultEntityType newEmailInteraction) {
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
	public ResultEntityType getEmailServerConfiguration() {
		return emailServerConfiguration;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmailServerConfiguration() <em>emailServerConfiguration</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmailServerConfiguration() emailServerConfiguration}' feature.
	 * @generated
	 */
	public void setEmailServerConfiguration(
			ResultEntityType newEmailServerConfiguration) {
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
	public ResultEntityType getEmailTemplate() {
		return emailTemplate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmailTemplate() <em>emailTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmailTemplate() emailTemplate}' feature.
	 * @generated
	 */
	public void setEmailTemplate(ResultEntityType newEmailTemplate) {
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
	public ResultEntityType getEmployeeAccounts() {
		return employeeAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmployeeAccounts() <em>employeeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmployeeAccounts() employeeAccounts}' feature.
	 * @generated
	 */
	public void setEmployeeAccounts(ResultEntityType newEmployeeAccounts) {
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
	public ResultEntityType getEmployeeSalaryCategory() {
		return employeeSalaryCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmployeeSalaryCategory() <em>employeeSalaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmployeeSalaryCategory() employeeSalaryCategory}' feature.
	 * @generated
	 */
	public void setEmployeeSalaryCategory(
			ResultEntityType newEmployeeSalaryCategory) {
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
	public ResultEntityType getExpenseType() {
		return expenseType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExpenseType() <em>expenseType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExpenseType() expenseType}' feature.
	 * @generated
	 */
	public void setExpenseType(ResultEntityType newExpenseType) {
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
	public ResultEntityType getExternalPOS() {
		return externalPOS;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExternalPOS() <em>externalPOS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExternalPOS() externalPOS}' feature.
	 * @generated
	 */
	public void setExternalPOS(ResultEntityType newExternalPOS) {
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
	public ResultEntityType getExternalPOSCategory() {
		return externalPOSCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExternalPOSCategory() <em>externalPOSCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExternalPOSCategory() externalPOSCategory}' feature.
	 * @generated
	 */
	public void setExternalPOSCategory(ResultEntityType newExternalPOSCategory) {
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
	public ResultEntityType getExternalPOSProduct() {
		return externalPOSProduct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExternalPOSProduct() <em>externalPOSProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExternalPOSProduct() externalPOSProduct}' feature.
	 * @generated
	 */
	public void setExternalPOSProduct(ResultEntityType newExternalPOSProduct) {
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
	public ResultEntityType getFINBankStatement() {
		return fINBankStatement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINBankStatement() <em>fINBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINBankStatement() fINBankStatement}' feature.
	 * @generated
	 */
	public void setFINBankStatement(ResultEntityType newFINBankStatement) {
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
	public ResultEntityType getFINBankStatementLine() {
		return fINBankStatementLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINBankStatementLine() <em>fINBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINBankStatementLine() fINBankStatementLine}' feature.
	 * @generated
	 */
	public void setFINBankStatementLine(ResultEntityType newFINBankStatementLine) {
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
	public ResultEntityType getFINFinaccTransaction() {
		return fINFinaccTransaction;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINFinaccTransaction() <em>fINFinaccTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINFinaccTransaction() fINFinaccTransaction}' feature.
	 * @generated
	 */
	public void setFINFinaccTransaction(ResultEntityType newFINFinaccTransaction) {
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
	public ResultEntityType getFINFinancialAccount() {
		return fINFinancialAccount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINFinancialAccount() <em>fINFinancialAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINFinancialAccount() fINFinancialAccount}' feature.
	 * @generated
	 */
	public void setFINFinancialAccount(ResultEntityType newFINFinancialAccount) {
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
	public ResultEntityType getFINFinancialAccountAcct() {
		return fINFinancialAccountAcct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINFinancialAccountAcct() <em>fINFinancialAccountAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINFinancialAccountAcct() fINFinancialAccountAcct}' feature.
	 * @generated
	 */
	public void setFINFinancialAccountAcct(
			ResultEntityType newFINFinancialAccountAcct) {
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
	public ResultEntityType getFINPayment() {
		return fINPayment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPayment() <em>fINPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPayment() fINPayment}' feature.
	 * @generated
	 */
	public void setFINPayment(ResultEntityType newFINPayment) {
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
	public ResultEntityType getFINPaymentMethod() {
		return fINPaymentMethod;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentMethod() <em>fINPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentMethod() fINPaymentMethod}' feature.
	 * @generated
	 */
	public void setFINPaymentMethod(ResultEntityType newFINPaymentMethod) {
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
	public ResultEntityType getFINPaymentCredit() {
		return fINPaymentCredit;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentCredit() <em>fINPaymentCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentCredit() fINPaymentCredit}' feature.
	 * @generated
	 */
	public void setFINPaymentCredit(ResultEntityType newFINPaymentCredit) {
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
	public ResultEntityType getFINPaymentDetail() {
		return fINPaymentDetail;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentDetail() <em>fINPaymentDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentDetail() fINPaymentDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentDetail(ResultEntityType newFINPaymentDetail) {
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
	public ResultEntityType getFINPaymentDetailV() {
		return fINPaymentDetailV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentDetailV() <em>fINPaymentDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentDetailV() fINPaymentDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailV(ResultEntityType newFINPaymentDetailV) {
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
	public ResultEntityType getFINPaymentPriority() {
		return fINPaymentPriority;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentPriority() <em>fINPaymentPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentPriority() fINPaymentPriority}' feature.
	 * @generated
	 */
	public void setFINPaymentPriority(ResultEntityType newFINPaymentPriority) {
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
	public ResultEntityType getFINPaymentPropDetail() {
		return fINPaymentPropDetail;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentPropDetail() <em>fINPaymentPropDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentPropDetail() fINPaymentPropDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetail(ResultEntityType newFINPaymentPropDetail) {
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
	public ResultEntityType getFINPaymentPropDetailV() {
		return fINPaymentPropDetailV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentPropDetailV() <em>fINPaymentPropDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentPropDetailV() fINPaymentPropDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetailV(
			ResultEntityType newFINPaymentPropDetailV) {
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
	public ResultEntityType getFINPaymentProposal() {
		return fINPaymentProposal;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentProposal() <em>fINPaymentProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentProposal() fINPaymentProposal}' feature.
	 * @generated
	 */
	public void setFINPaymentProposal(ResultEntityType newFINPaymentProposal) {
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
	public ResultEntityType getFINPaymentSchedInvV() {
		return fINPaymentSchedInvV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentSchedInvV() <em>fINPaymentSchedInvV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentSchedInvV() fINPaymentSchedInvV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvV(ResultEntityType newFINPaymentSchedInvV) {
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
	public ResultEntityType getFINPaymentSchedOrdV() {
		return fINPaymentSchedOrdV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentSchedOrdV() <em>fINPaymentSchedOrdV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentSchedOrdV() fINPaymentSchedOrdV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdV(ResultEntityType newFINPaymentSchedOrdV) {
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
	public ResultEntityType getFINPaymentSchedule() {
		return fINPaymentSchedule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentSchedule() <em>fINPaymentSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentSchedule() fINPaymentSchedule}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedule(ResultEntityType newFINPaymentSchedule) {
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
	public ResultEntityType getFINPaymentScheduleDetail() {
		return fINPaymentScheduleDetail;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentScheduleDetail() <em>fINPaymentScheduleDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentScheduleDetail() fINPaymentScheduleDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentScheduleDetail(
			ResultEntityType newFINPaymentScheduleDetail) {
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
	public ResultEntityType getFINReconciliation() {
		return fINReconciliation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINReconciliation() <em>fINReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINReconciliation() fINReconciliation}' feature.
	 * @generated
	 */
	public void setFINReconciliation(ResultEntityType newFINReconciliation) {
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
	public ResultEntityType getFINReconciliationLineTemp() {
		return fINReconciliationLineTemp;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINReconciliationLineTemp() <em>fINReconciliationLineTemp</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINReconciliationLineTemp() fINReconciliationLineTemp}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineTemp(
			ResultEntityType newFINReconciliationLineTemp) {
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
	public ResultEntityType getFINReconciliationLineV() {
		return fINReconciliationLineV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINReconciliationLineV() <em>fINReconciliationLineV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINReconciliationLineV() fINReconciliationLineV}' feature.
	 * @generated
	 */
	public void setFINReconciliationLineV(
			ResultEntityType newFINReconciliationLineV) {
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
	public ResultEntityType getFinancialMgmtAccountingCombination() {
		return financialMgmtAccountingCombination;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAccountingCombination() <em>financialMgmtAccountingCombination</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAccountingCombination() financialMgmtAccountingCombination}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingCombination(
			ResultEntityType newFinancialMgmtAccountingCombination) {
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
	public ResultEntityType getFinancialMgmtAccountingFact() {
		return financialMgmtAccountingFact;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAccountingFact() <em>financialMgmtAccountingFact</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAccountingFact() financialMgmtAccountingFact}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingFact(
			ResultEntityType newFinancialMgmtAccountingFact) {
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
	public ResultEntityType getFinancialMgmtAccountingReport() {
		return financialMgmtAccountingReport;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAccountingReport() <em>financialMgmtAccountingReport</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAccountingReport() financialMgmtAccountingReport}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingReport(
			ResultEntityType newFinancialMgmtAccountingReport) {
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
	public ResultEntityType getFinancialMgmtAccountingRptElement() {
		return financialMgmtAccountingRptElement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAccountingRptElement() <em>financialMgmtAccountingRptElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAccountingRptElement() financialMgmtAccountingRptElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAccountingRptElement(
			ResultEntityType newFinancialMgmtAccountingRptElement) {
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
	public ResultEntityType getFinancialMgmtAcctCFS() {
		return financialMgmtAcctCFS;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctCFS() <em>financialMgmtAcctCFS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctCFS() financialMgmtAcctCFS}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctCFS(ResultEntityType newFinancialMgmtAcctCFS) {
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
	public ResultEntityType getFinancialMgmtAcctRptGroup() {
		return financialMgmtAcctRptGroup;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctRptGroup() <em>financialMgmtAcctRptGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctRptGroup() financialMgmtAcctRptGroup}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptGroup(
			ResultEntityType newFinancialMgmtAcctRptGroup) {
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
	public ResultEntityType getFinancialMgmtAcctRptNode() {
		return financialMgmtAcctRptNode;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctRptNode() <em>financialMgmtAcctRptNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctRptNode() financialMgmtAcctRptNode}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctRptNode(
			ResultEntityType newFinancialMgmtAcctRptNode) {
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
	public ResultEntityType getFinancialMgmtAcctSchema() {
		return financialMgmtAcctSchema;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctSchema() <em>financialMgmtAcctSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctSchema() financialMgmtAcctSchema}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchema(
			ResultEntityType newFinancialMgmtAcctSchema) {
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
	public ResultEntityType getFinancialMgmtAcctSchemaDefault() {
		return financialMgmtAcctSchemaDefault;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaDefault() <em>financialMgmtAcctSchemaDefault</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaDefault() financialMgmtAcctSchemaDefault}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaDefault(
			ResultEntityType newFinancialMgmtAcctSchemaDefault) {
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
	public ResultEntityType getFinancialMgmtAcctSchemaElement() {
		return financialMgmtAcctSchemaElement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaElement() <em>financialMgmtAcctSchemaElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaElement() financialMgmtAcctSchemaElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaElement(
			ResultEntityType newFinancialMgmtAcctSchemaElement) {
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
	public ResultEntityType getFinancialMgmtAcctSchemaGL() {
		return financialMgmtAcctSchemaGL;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaGL() <em>financialMgmtAcctSchemaGL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaGL() financialMgmtAcctSchemaGL}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaGL(
			ResultEntityType newFinancialMgmtAcctSchemaGL) {
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
	public ResultEntityType getFinancialMgmtAcctSchemaTable() {
		return financialMgmtAcctSchemaTable;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaTable() <em>financialMgmtAcctSchemaTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctSchemaTable() financialMgmtAcctSchemaTable}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctSchemaTable(
			ResultEntityType newFinancialMgmtAcctSchemaTable) {
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
	public ResultEntityType getFinancialMgmtAmortization() {
		return financialMgmtAmortization;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAmortization() <em>financialMgmtAmortization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAmortization() financialMgmtAmortization}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortization(
			ResultEntityType newFinancialMgmtAmortization) {
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
	public ResultEntityType getFinancialMgmtAmortizationLine() {
		return financialMgmtAmortizationLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAmortizationLine() <em>financialMgmtAmortizationLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAmortizationLine() financialMgmtAmortizationLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAmortizationLine(
			ResultEntityType newFinancialMgmtAmortizationLine) {
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
	public ResultEntityType getFinancialMgmtAsset() {
		return financialMgmtAsset;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAsset() <em>financialMgmtAsset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAsset() financialMgmtAsset}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAsset(ResultEntityType newFinancialMgmtAsset) {
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
	public ResultEntityType getFinancialMgmtAssetAccounts() {
		return financialMgmtAssetAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAssetAccounts() <em>financialMgmtAssetAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAssetAccounts() financialMgmtAssetAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetAccounts(
			ResultEntityType newFinancialMgmtAssetAccounts) {
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
	public ResultEntityType getFinancialMgmtAssetGroup() {
		return financialMgmtAssetGroup;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAssetGroup() <em>financialMgmtAssetGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAssetGroup() financialMgmtAssetGroup}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroup(
			ResultEntityType newFinancialMgmtAssetGroup) {
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
	public ResultEntityType getFinancialMgmtAssetGroupAcct() {
		return financialMgmtAssetGroupAcct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAssetGroupAcct() <em>financialMgmtAssetGroupAcct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAssetGroupAcct() financialMgmtAssetGroupAcct}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAssetGroupAcct(
			ResultEntityType newFinancialMgmtAssetGroupAcct) {
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
	public ResultEntityType getFinancialMgmtBankFileFormat() {
		return financialMgmtBankFileFormat;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtBankFileFormat() <em>financialMgmtBankFileFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtBankFileFormat() financialMgmtBankFileFormat}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankFileFormat(
			ResultEntityType newFinancialMgmtBankFileFormat) {
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
	public ResultEntityType getFinancialMgmtBankStatement() {
		return financialMgmtBankStatement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtBankStatement() <em>financialMgmtBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtBankStatement() financialMgmtBankStatement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatement(
			ResultEntityType newFinancialMgmtBankStatement) {
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
	public ResultEntityType getFinancialMgmtBankStatementLine() {
		return financialMgmtBankStatementLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtBankStatementLine() <em>financialMgmtBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtBankStatementLine() financialMgmtBankStatementLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBankStatementLine(
			ResultEntityType newFinancialMgmtBankStatementLine) {
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
	public ResultEntityType getFinancialMgmtBudget() {
		return financialMgmtBudget;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtBudget() <em>financialMgmtBudget</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtBudget() financialMgmtBudget}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudget(ResultEntityType newFinancialMgmtBudget) {
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
	public ResultEntityType getFinancialMgmtBudgetLine() {
		return financialMgmtBudgetLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtBudgetLine() <em>financialMgmtBudgetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtBudgetLine() financialMgmtBudgetLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudgetLine(
			ResultEntityType newFinancialMgmtBudgetLine) {
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
	public ResultEntityType getFinancialMgmtCalendar() {
		return financialMgmtCalendar;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtCalendar() <em>financialMgmtCalendar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtCalendar() financialMgmtCalendar}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCalendar(
			ResultEntityType newFinancialMgmtCalendar) {
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
	public ResultEntityType getFinancialMgmtCashBook() {
		return financialMgmtCashBook;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtCashBook() <em>financialMgmtCashBook</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtCashBook() financialMgmtCashBook}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBook(
			ResultEntityType newFinancialMgmtCashBook) {
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
	public ResultEntityType getFinancialMgmtCashBookAccounts() {
		return financialMgmtCashBookAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtCashBookAccounts() <em>financialMgmtCashBookAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtCashBookAccounts() financialMgmtCashBookAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashBookAccounts(
			ResultEntityType newFinancialMgmtCashBookAccounts) {
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
	public ResultEntityType getFinancialMgmtCashJournal() {
		return financialMgmtCashJournal;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtCashJournal() <em>financialMgmtCashJournal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtCashJournal() financialMgmtCashJournal}' feature.
	 * @generated
	 */
	public void setFinancialMgmtCashJournal(
			ResultEntityType newFinancialMgmtCashJournal) {
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
	public ResultEntityType getFinancialMgmtDPManagement() {
		return financialMgmtDPManagement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDPManagement() <em>financialMgmtDPManagement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDPManagement() financialMgmtDPManagement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagement(
			ResultEntityType newFinancialMgmtDPManagement) {
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
	public ResultEntityType getFinancialMgmtDPManagementLine() {
		return financialMgmtDPManagementLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDPManagementLine() <em>financialMgmtDPManagementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDPManagementLine() financialMgmtDPManagementLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDPManagementLine(
			ResultEntityType newFinancialMgmtDPManagementLine) {
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
	public ResultEntityType getFinancialMgmtDebtPayment() {
		return financialMgmtDebtPayment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDebtPayment() <em>financialMgmtDebtPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDebtPayment() financialMgmtDebtPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPayment(
			ResultEntityType newFinancialMgmtDebtPayment) {
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
	public ResultEntityType getFinancialMgmtDebtPaymentBalReplace() {
		return financialMgmtDebtPaymentBalReplace;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentBalReplace() <em>financialMgmtDebtPaymentBalReplace</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentBalReplace() financialMgmtDebtPaymentBalReplace}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalReplace(
			ResultEntityType newFinancialMgmtDebtPaymentBalReplace) {
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
	public ResultEntityType getFinancialMgmtDebtPaymentBalancing() {
		return financialMgmtDebtPaymentBalancing;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentBalancing() <em>financialMgmtDebtPaymentBalancing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentBalancing() financialMgmtDebtPaymentBalancing}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentBalancing(
			ResultEntityType newFinancialMgmtDebtPaymentBalancing) {
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
	public ResultEntityType getFinancialMgmtDebtPaymentCancelV() {
		return financialMgmtDebtPaymentCancelV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentCancelV() <em>financialMgmtDebtPaymentCancelV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentCancelV() financialMgmtDebtPaymentCancelV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentCancelV(
			ResultEntityType newFinancialMgmtDebtPaymentCancelV) {
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
	public ResultEntityType getFinancialMgmtDebtPaymentGenerateV() {
		return financialMgmtDebtPaymentGenerateV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentGenerateV() <em>financialMgmtDebtPaymentGenerateV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDebtPaymentGenerateV() financialMgmtDebtPaymentGenerateV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDebtPaymentGenerateV(
			ResultEntityType newFinancialMgmtDebtPaymentGenerateV) {
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
	public ResultEntityType getFinancialMgmtDimension() {
		return financialMgmtDimension;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtDimension() <em>financialMgmtDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtDimension() financialMgmtDimension}' feature.
	 * @generated
	 */
	public void setFinancialMgmtDimension(
			ResultEntityType newFinancialMgmtDimension) {
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
	public ResultEntityType getFinancialMgmtElement() {
		return financialMgmtElement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtElement() <em>financialMgmtElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtElement() financialMgmtElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElement(ResultEntityType newFinancialMgmtElement) {
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
	public ResultEntityType getFinancialMgmtElementValue() {
		return financialMgmtElementValue;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtElementValue() <em>financialMgmtElementValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtElementValue() financialMgmtElementValue}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValue(
			ResultEntityType newFinancialMgmtElementValue) {
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
	public ResultEntityType getFinancialMgmtElementValueOperand() {
		return financialMgmtElementValueOperand;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtElementValueOperand() <em>financialMgmtElementValueOperand</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtElementValueOperand() financialMgmtElementValueOperand}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueOperand(
			ResultEntityType newFinancialMgmtElementValueOperand) {
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
	public ResultEntityType getFinancialMgmtElementValueTrl() {
		return financialMgmtElementValueTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtElementValueTrl() <em>financialMgmtElementValueTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtElementValueTrl() financialMgmtElementValueTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElementValueTrl(
			ResultEntityType newFinancialMgmtElementValueTrl) {
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
	public ResultEntityType getFinancialMgmtFinAccPaymentMethod() {
		return financialMgmtFinAccPaymentMethod;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtFinAccPaymentMethod() <em>financialMgmtFinAccPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtFinAccPaymentMethod() financialMgmtFinAccPaymentMethod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtFinAccPaymentMethod(
			ResultEntityType newFinancialMgmtFinAccPaymentMethod) {
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
	public ResultEntityType getFinancialMgmtGLBatch() {
		return financialMgmtGLBatch;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLBatch() <em>financialMgmtGLBatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLBatch() financialMgmtGLBatch}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLBatch(ResultEntityType newFinancialMgmtGLBatch) {
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
	public ResultEntityType getFinancialMgmtGLCategory() {
		return financialMgmtGLCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLCategory() <em>financialMgmtGLCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLCategory() financialMgmtGLCategory}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLCategory(
			ResultEntityType newFinancialMgmtGLCategory) {
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
	public ResultEntityType getFinancialMgmtGLCharge() {
		return financialMgmtGLCharge;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLCharge() <em>financialMgmtGLCharge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLCharge() financialMgmtGLCharge}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLCharge(
			ResultEntityType newFinancialMgmtGLCharge) {
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
	public ResultEntityType getFinancialMgmtGLChargeAccounts() {
		return financialMgmtGLChargeAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLChargeAccounts() <em>financialMgmtGLChargeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLChargeAccounts() financialMgmtGLChargeAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLChargeAccounts(
			ResultEntityType newFinancialMgmtGLChargeAccounts) {
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
	public ResultEntityType getFinancialMgmtGLItem() {
		return financialMgmtGLItem;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLItem() <em>financialMgmtGLItem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLItem() financialMgmtGLItem}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItem(ResultEntityType newFinancialMgmtGLItem) {
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
	public ResultEntityType getFinancialMgmtGLItemAccounts() {
		return financialMgmtGLItemAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLItemAccounts() <em>financialMgmtGLItemAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLItemAccounts() financialMgmtGLItemAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItemAccounts(
			ResultEntityType newFinancialMgmtGLItemAccounts) {
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
	public ResultEntityType getFinancialMgmtGLJournal() {
		return financialMgmtGLJournal;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLJournal() <em>financialMgmtGLJournal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLJournal() financialMgmtGLJournal}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournal(
			ResultEntityType newFinancialMgmtGLJournal) {
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
	public ResultEntityType getFinancialMgmtGLJournalLine() {
		return financialMgmtGLJournalLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLJournalLine() <em>financialMgmtGLJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLJournalLine() financialMgmtGLJournalLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLJournalLine(
			ResultEntityType newFinancialMgmtGLJournalLine) {
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
	public ResultEntityType getFinancialMgmtIncoterms() {
		return financialMgmtIncoterms;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtIncoterms() <em>financialMgmtIncoterms</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtIncoterms() financialMgmtIncoterms}' feature.
	 * @generated
	 */
	public void setFinancialMgmtIncoterms(
			ResultEntityType newFinancialMgmtIncoterms) {
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
	public ResultEntityType getFinancialMgmtJournalLine() {
		return financialMgmtJournalLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtJournalLine() <em>financialMgmtJournalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtJournalLine() financialMgmtJournalLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtJournalLine(
			ResultEntityType newFinancialMgmtJournalLine) {
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
	public ResultEntityType getFinancialMgmtMatchingAlgorithm() {
		return financialMgmtMatchingAlgorithm;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtMatchingAlgorithm() <em>financialMgmtMatchingAlgorithm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtMatchingAlgorithm() financialMgmtMatchingAlgorithm}' feature.
	 * @generated
	 */
	public void setFinancialMgmtMatchingAlgorithm(
			ResultEntityType newFinancialMgmtMatchingAlgorithm) {
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
	public ResultEntityType getFinancialMgmtNonBusinessDay() {
		return financialMgmtNonBusinessDay;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtNonBusinessDay() <em>financialMgmtNonBusinessDay</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtNonBusinessDay() financialMgmtNonBusinessDay}' feature.
	 * @generated
	 */
	public void setFinancialMgmtNonBusinessDay(
			ResultEntityType newFinancialMgmtNonBusinessDay) {
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
	public ResultEntityType getFinancialMgmtPaymentExecutionHistoryV() {
		return financialMgmtPaymentExecutionHistoryV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentExecutionHistoryV() <em>financialMgmtPaymentExecutionHistoryV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentExecutionHistoryV() financialMgmtPaymentExecutionHistoryV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionHistoryV(
			ResultEntityType newFinancialMgmtPaymentExecutionHistoryV) {
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
	public ResultEntityType getFinancialMgmtPaymentExecutionProcess() {
		return financialMgmtPaymentExecutionProcess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentExecutionProcess() <em>financialMgmtPaymentExecutionProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentExecutionProcess() financialMgmtPaymentExecutionProcess}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionProcess(
			ResultEntityType newFinancialMgmtPaymentExecutionProcess) {
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
	public ResultEntityType getFinancialMgmtPaymentExecutionProcessParameter() {
		return financialMgmtPaymentExecutionProcessParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentExecutionProcessParameter() <em>financialMgmtPaymentExecutionProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentExecutionProcessParameter() financialMgmtPaymentExecutionProcessParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentExecutionProcessParameter(
			ResultEntityType newFinancialMgmtPaymentExecutionProcessParameter) {
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
	public ResultEntityType getFinancialMgmtPaymentRun() {
		return financialMgmtPaymentRun;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentRun() <em>financialMgmtPaymentRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentRun() financialMgmtPaymentRun}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRun(
			ResultEntityType newFinancialMgmtPaymentRun) {
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
	public ResultEntityType getFinancialMgmtPaymentRunParameter() {
		return financialMgmtPaymentRunParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentRunParameter() <em>financialMgmtPaymentRunParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentRunParameter() financialMgmtPaymentRunParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunParameter(
			ResultEntityType newFinancialMgmtPaymentRunParameter) {
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
	public ResultEntityType getFinancialMgmtPaymentRunPayment() {
		return financialMgmtPaymentRunPayment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentRunPayment() <em>financialMgmtPaymentRunPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentRunPayment() financialMgmtPaymentRunPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentRunPayment(
			ResultEntityType newFinancialMgmtPaymentRunPayment) {
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
	public ResultEntityType getFinancialMgmtPaymentTerm() {
		return financialMgmtPaymentTerm;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentTerm() <em>financialMgmtPaymentTerm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentTerm() financialMgmtPaymentTerm}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTerm(
			ResultEntityType newFinancialMgmtPaymentTerm) {
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
	public ResultEntityType getFinancialMgmtPaymentTermLine() {
		return financialMgmtPaymentTermLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentTermLine() <em>financialMgmtPaymentTermLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentTermLine() financialMgmtPaymentTermLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermLine(
			ResultEntityType newFinancialMgmtPaymentTermLine) {
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
	public ResultEntityType getFinancialMgmtPaymentTermTrl() {
		return financialMgmtPaymentTermTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPaymentTermTrl() <em>financialMgmtPaymentTermTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPaymentTermTrl() financialMgmtPaymentTermTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPaymentTermTrl(
			ResultEntityType newFinancialMgmtPaymentTermTrl) {
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
	public ResultEntityType getFinancialMgmtPeriod() {
		return financialMgmtPeriod;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPeriod() <em>financialMgmtPeriod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPeriod() financialMgmtPeriod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriod(ResultEntityType newFinancialMgmtPeriod) {
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
	public ResultEntityType getFinancialMgmtPeriodControl() {
		return financialMgmtPeriodControl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPeriodControl() <em>financialMgmtPeriodControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPeriodControl() financialMgmtPeriodControl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControl(
			ResultEntityType newFinancialMgmtPeriodControl) {
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
	public ResultEntityType getFinancialMgmtPeriodControlV() {
		return financialMgmtPeriodControlV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPeriodControlV() <em>financialMgmtPeriodControlV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPeriodControlV() financialMgmtPeriodControlV}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriodControlV(
			ResultEntityType newFinancialMgmtPeriodControlV) {
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
	public ResultEntityType getFinancialMgmtPromissoryFormat() {
		return financialMgmtPromissoryFormat;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPromissoryFormat() <em>financialMgmtPromissoryFormat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPromissoryFormat() financialMgmtPromissoryFormat}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPromissoryFormat(
			ResultEntityType newFinancialMgmtPromissoryFormat) {
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
	public ResultEntityType getFinancialMgmtRemittance() {
		return financialMgmtRemittance;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtRemittance() <em>financialMgmtRemittance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtRemittance() financialMgmtRemittance}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittance(
			ResultEntityType newFinancialMgmtRemittance) {
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
	public ResultEntityType getFinancialMgmtRemittanceLine() {
		return financialMgmtRemittanceLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtRemittanceLine() <em>financialMgmtRemittanceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtRemittanceLine() financialMgmtRemittanceLine}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceLine(
			ResultEntityType newFinancialMgmtRemittanceLine) {
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
	public ResultEntityType getFinancialMgmtRemittanceParameter() {
		return financialMgmtRemittanceParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtRemittanceParameter() <em>financialMgmtRemittanceParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtRemittanceParameter() financialMgmtRemittanceParameter}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceParameter(
			ResultEntityType newFinancialMgmtRemittanceParameter) {
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
	public ResultEntityType getFinancialMgmtRemittanceType() {
		return financialMgmtRemittanceType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtRemittanceType() <em>financialMgmtRemittanceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtRemittanceType() financialMgmtRemittanceType}' feature.
	 * @generated
	 */
	public void setFinancialMgmtRemittanceType(
			ResultEntityType newFinancialMgmtRemittanceType) {
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
	public ResultEntityType getFinancialMgmtSettlement() {
		return financialMgmtSettlement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtSettlement() <em>financialMgmtSettlement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtSettlement() financialMgmtSettlement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtSettlement(
			ResultEntityType newFinancialMgmtSettlement) {
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
	public ResultEntityType getFinancialMgmtTaxCategory() {
		return financialMgmtTaxCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxCategory() <em>financialMgmtTaxCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxCategory() financialMgmtTaxCategory}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxCategory(
			ResultEntityType newFinancialMgmtTaxCategory) {
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
	public ResultEntityType getFinancialMgmtTaxCategoryTrl() {
		return financialMgmtTaxCategoryTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxCategoryTrl() <em>financialMgmtTaxCategoryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxCategoryTrl() financialMgmtTaxCategoryTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxCategoryTrl(
			ResultEntityType newFinancialMgmtTaxCategoryTrl) {
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
	public ResultEntityType getFinancialMgmtTaxPayment() {
		return financialMgmtTaxPayment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxPayment() <em>financialMgmtTaxPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxPayment() financialMgmtTaxPayment}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxPayment(
			ResultEntityType newFinancialMgmtTaxPayment) {
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
	public ResultEntityType getFinancialMgmtTaxRate() {
		return financialMgmtTaxRate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRate() <em>financialMgmtTaxRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRate() financialMgmtTaxRate}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRate(ResultEntityType newFinancialMgmtTaxRate) {
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
	public ResultEntityType getFinancialMgmtTaxRateAccounts() {
		return financialMgmtTaxRateAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRateAccounts() <em>financialMgmtTaxRateAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRateAccounts() financialMgmtTaxRateAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRateAccounts(
			ResultEntityType newFinancialMgmtTaxRateAccounts) {
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
	public ResultEntityType getFinancialMgmtTaxRegister() {
		return financialMgmtTaxRegister;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRegister() <em>financialMgmtTaxRegister</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRegister() financialMgmtTaxRegister}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegister(
			ResultEntityType newFinancialMgmtTaxRegister) {
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
	public ResultEntityType getFinancialMgmtTaxRegisterType() {
		return financialMgmtTaxRegisterType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRegisterType() <em>financialMgmtTaxRegisterType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRegisterType() financialMgmtTaxRegisterType}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterType(
			ResultEntityType newFinancialMgmtTaxRegisterType) {
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
	public ResultEntityType getFinancialMgmtTaxRegisterTypeLines() {
		return financialMgmtTaxRegisterTypeLines;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRegisterTypeLines() <em>financialMgmtTaxRegisterTypeLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRegisterTypeLines() financialMgmtTaxRegisterTypeLines}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterTypeLines(
			ResultEntityType newFinancialMgmtTaxRegisterTypeLines) {
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
	public ResultEntityType getFinancialMgmtTaxRegisterline() {
		return financialMgmtTaxRegisterline;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRegisterline() <em>financialMgmtTaxRegisterline</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRegisterline() financialMgmtTaxRegisterline}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRegisterline(
			ResultEntityType newFinancialMgmtTaxRegisterline) {
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
	public ResultEntityType getFinancialMgmtTaxReport() {
		return financialMgmtTaxReport;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxReport() <em>financialMgmtTaxReport</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxReport() financialMgmtTaxReport}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxReport(
			ResultEntityType newFinancialMgmtTaxReport) {
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
	public ResultEntityType getFinancialMgmtTaxTrl() {
		return financialMgmtTaxTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxTrl() <em>financialMgmtTaxTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxTrl() financialMgmtTaxTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxTrl(ResultEntityType newFinancialMgmtTaxTrl) {
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
	public ResultEntityType getFinancialMgmtTaxZone() {
		return financialMgmtTaxZone;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxZone() <em>financialMgmtTaxZone</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxZone() financialMgmtTaxZone}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZone(ResultEntityType newFinancialMgmtTaxZone) {
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
	public ResultEntityType getFinancialMgmtWithholding() {
		return financialMgmtWithholding;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtWithholding() <em>financialMgmtWithholding</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtWithholding() financialMgmtWithholding}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholding(
			ResultEntityType newFinancialMgmtWithholding) {
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
	public ResultEntityType getFinancialMgmtWithholdingAccounts() {
		return financialMgmtWithholdingAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtWithholdingAccounts() <em>financialMgmtWithholdingAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtWithholdingAccounts() financialMgmtWithholdingAccounts}' feature.
	 * @generated
	 */
	public void setFinancialMgmtWithholdingAccounts(
			ResultEntityType newFinancialMgmtWithholdingAccounts) {
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
	public ResultEntityType getFinancialMgmtYear() {
		return financialMgmtYear;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtYear() <em>financialMgmtYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtYear() financialMgmtYear}' feature.
	 * @generated
	 */
	public void setFinancialMgmtYear(ResultEntityType newFinancialMgmtYear) {
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
	public ResultEntityType getGreeting() {
		return greeting;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getGreeting() <em>greeting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getGreeting() greeting}' feature.
	 * @generated
	 */
	public void setGreeting(ResultEntityType newGreeting) {
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
	public ResultEntityType getGreetingTrl() {
		return greetingTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getGreetingTrl() <em>greetingTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getGreetingTrl() greetingTrl}' feature.
	 * @generated
	 */
	public void setGreetingTrl(ResultEntityType newGreetingTrl) {
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
	public ResultEntityType getInvoice() {
		return invoice;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(ResultEntityType newInvoice) {
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
	public ResultEntityType getInvoiceDiscount() {
		return invoiceDiscount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceDiscount() <em>invoiceDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceDiscount() invoiceDiscount}' feature.
	 * @generated
	 */
	public void setInvoiceDiscount(ResultEntityType newInvoiceDiscount) {
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
	public ResultEntityType getInvoiceLine() {
		return invoiceLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLine() <em>invoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLine() invoiceLine}' feature.
	 * @generated
	 */
	public void setInvoiceLine(ResultEntityType newInvoiceLine) {
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
	public ResultEntityType getInvoiceLineAccountingDimension() {
		return invoiceLineAccountingDimension;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLineAccountingDimension() <em>invoiceLineAccountingDimension</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLineAccountingDimension() invoiceLineAccountingDimension}' feature.
	 * @generated
	 */
	public void setInvoiceLineAccountingDimension(
			ResultEntityType newInvoiceLineAccountingDimension) {
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
	public ResultEntityType getInvoiceLineOffer() {
		return invoiceLineOffer;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLineOffer() <em>invoiceLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLineOffer() invoiceLineOffer}' feature.
	 * @generated
	 */
	public void setInvoiceLineOffer(ResultEntityType newInvoiceLineOffer) {
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
	public ResultEntityType getInvoiceLineTax() {
		return invoiceLineTax;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLineTax() <em>invoiceLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLineTax() invoiceLineTax}' feature.
	 * @generated
	 */
	public void setInvoiceLineTax(ResultEntityType newInvoiceLineTax) {
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
	public ResultEntityType getInvoiceSchedule() {
		return invoiceSchedule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceSchedule() <em>invoiceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceSchedule() invoiceSchedule}' feature.
	 * @generated
	 */
	public void setInvoiceSchedule(ResultEntityType newInvoiceSchedule) {
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
	public ResultEntityType getInvoiceTax() {
		return invoiceTax;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceTax() <em>invoiceTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceTax() invoiceTax}' feature.
	 * @generated
	 */
	public void setInvoiceTax(ResultEntityType newInvoiceTax) {
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
	public ResultEntityType getLocation() {
		return location;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLocation() <em>location</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLocation() location}' feature.
	 * @generated
	 */
	public void setLocation(ResultEntityType newLocation) {
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
	public ResultEntityType getLocator() {
		return locator;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLocator() <em>locator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLocator() locator}' feature.
	 * @generated
	 */
	public void setLocator(ResultEntityType newLocator) {
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
	public ResultEntityType getLot() {
		return lot;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLot() <em>lot</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLot() lot}' feature.
	 * @generated
	 */
	public void setLot(ResultEntityType newLot) {
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
	public ResultEntityType getLotControl() {
		return lotControl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLotControl() <em>lotControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLotControl() lotControl}' feature.
	 * @generated
	 */
	public void setLotControl(ResultEntityType newLotControl) {
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
	public ResultEntityType getMRPPlanner() {
		return mRPPlanner;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPlanner() <em>mRPPlanner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPlanner() mRPPlanner}' feature.
	 * @generated
	 */
	public void setMRPPlanner(ResultEntityType newMRPPlanner) {
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
	public ResultEntityType getMRPPlanningMethod() {
		return mRPPlanningMethod;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPlanningMethod() <em>mRPPlanningMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPlanningMethod() mRPPlanningMethod}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethod(ResultEntityType newMRPPlanningMethod) {
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
	public ResultEntityType getMRPPlanningMethodLine() {
		return mRPPlanningMethodLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPlanningMethodLine() <em>mRPPlanningMethodLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPlanningMethodLine() mRPPlanningMethodLine}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethodLine(
			ResultEntityType newMRPPlanningMethodLine) {
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
	public ResultEntityType getMRPProductionRun() {
		return mRPProductionRun;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPProductionRun() <em>mRPProductionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPProductionRun() mRPProductionRun}' feature.
	 * @generated
	 */
	public void setMRPProductionRun(ResultEntityType newMRPProductionRun) {
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
	public ResultEntityType getMRPProductionRunLine() {
		return mRPProductionRunLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPProductionRunLine() <em>mRPProductionRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPProductionRunLine() mRPProductionRunLine}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLine(ResultEntityType newMRPProductionRunLine) {
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
	public ResultEntityType getMRPPurchasingRun() {
		return mRPPurchasingRun;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPurchasingRun() <em>mRPPurchasingRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPurchasingRun() mRPPurchasingRun}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRun(ResultEntityType newMRPPurchasingRun) {
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
	public ResultEntityType getMRPPurchasingRunLine() {
		return mRPPurchasingRunLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPurchasingRunLine() <em>mRPPurchasingRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPurchasingRunLine() mRPPurchasingRunLine}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLine(ResultEntityType newMRPPurchasingRunLine) {
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
	public ResultEntityType getMRPSalesForecast() {
		return mRPSalesForecast;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPSalesForecast() <em>mRPSalesForecast</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPSalesForecast() mRPSalesForecast}' feature.
	 * @generated
	 */
	public void setMRPSalesForecast(ResultEntityType newMRPSalesForecast) {
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
	public ResultEntityType getMRPSalesForecastLine() {
		return mRPSalesForecastLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPSalesForecastLine() <em>mRPSalesForecastLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPSalesForecastLine() mRPSalesForecastLine}' feature.
	 * @generated
	 */
	public void setMRPSalesForecastLine(ResultEntityType newMRPSalesForecastLine) {
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
	public ResultEntityType getManufacturingActivity() {
		return manufacturingActivity;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingActivity() <em>manufacturingActivity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingActivity() manufacturingActivity}' feature.
	 * @generated
	 */
	public void setManufacturingActivity(
			ResultEntityType newManufacturingActivity) {
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
	public ResultEntityType getManufacturingActivityToolset() {
		return manufacturingActivityToolset;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingActivityToolset() <em>manufacturingActivityToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingActivityToolset() manufacturingActivityToolset}' feature.
	 * @generated
	 */
	public void setManufacturingActivityToolset(
			ResultEntityType newManufacturingActivityToolset) {
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
	public ResultEntityType getManufacturingCase() {
		return manufacturingCase;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCase() <em>manufacturingCase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCase() manufacturingCase}' feature.
	 * @generated
	 */
	public void setManufacturingCase(ResultEntityType newManufacturingCase) {
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
	public ResultEntityType getManufacturingCheckPoint() {
		return manufacturingCheckPoint;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCheckPoint() <em>manufacturingCheckPoint</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCheckPoint() manufacturingCheckPoint}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPoint(
			ResultEntityType newManufacturingCheckPoint) {
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
	public ResultEntityType getManufacturingCheckPointSet() {
		return manufacturingCheckPointSet;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCheckPointSet() <em>manufacturingCheckPointSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCheckPointSet() manufacturingCheckPointSet}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPointSet(
			ResultEntityType newManufacturingCheckPointSet) {
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
	public ResultEntityType getManufacturingCheckPointShift() {
		return manufacturingCheckPointShift;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCheckPointShift() <em>manufacturingCheckPointShift</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCheckPointShift() manufacturingCheckPointShift}' feature.
	 * @generated
	 */
	public void setManufacturingCheckPointShift(
			ResultEntityType newManufacturingCheckPointShift) {
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
	public ResultEntityType getManufacturingCostCenter() {
		return manufacturingCostCenter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCostCenter() <em>manufacturingCostCenter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCostCenter() manufacturingCostCenter}' feature.
	 * @generated
	 */
	public void setManufacturingCostCenter(
			ResultEntityType newManufacturingCostCenter) {
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
	public ResultEntityType getManufacturingCostCenterMachine() {
		return manufacturingCostCenterMachine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCostCenterMachine() <em>manufacturingCostCenterMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCostCenterMachine() manufacturingCostCenterMachine}' feature.
	 * @generated
	 */
	public void setManufacturingCostCenterMachine(
			ResultEntityType newManufacturingCostCenterMachine) {
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
	public ResultEntityType getManufacturingCostcenterEmployee() {
		return manufacturingCostcenterEmployee;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCostcenterEmployee() <em>manufacturingCostcenterEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCostcenterEmployee() manufacturingCostcenterEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterEmployee(
			ResultEntityType newManufacturingCostcenterEmployee) {
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
	public ResultEntityType getManufacturingCostcenterIC() {
		return manufacturingCostcenterIC;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCostcenterIC() <em>manufacturingCostcenterIC</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCostcenterIC() manufacturingCostcenterIC}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterIC(
			ResultEntityType newManufacturingCostcenterIC) {
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
	public ResultEntityType getManufacturingCostcenterVersion() {
		return manufacturingCostcenterVersion;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCostcenterVersion() <em>manufacturingCostcenterVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCostcenterVersion() manufacturingCostcenterVersion}' feature.
	 * @generated
	 */
	public void setManufacturingCostcenterVersion(
			ResultEntityType newManufacturingCostcenterVersion) {
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
	public ResultEntityType getManufacturingGlobalUse() {
		return manufacturingGlobalUse;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingGlobalUse() <em>manufacturingGlobalUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingGlobalUse() manufacturingGlobalUse}' feature.
	 * @generated
	 */
	public void setManufacturingGlobalUse(
			ResultEntityType newManufacturingGlobalUse) {
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
	public ResultEntityType getManufacturingIncidence() {
		return manufacturingIncidence;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingIncidence() <em>manufacturingIncidence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingIncidence() manufacturingIncidence}' feature.
	 * @generated
	 */
	public void setManufacturingIncidence(
			ResultEntityType newManufacturingIncidence) {
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
	public ResultEntityType getManufacturingIndirectCost() {
		return manufacturingIndirectCost;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingIndirectCost() <em>manufacturingIndirectCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingIndirectCost() manufacturingIndirectCost}' feature.
	 * @generated
	 */
	public void setManufacturingIndirectCost(
			ResultEntityType newManufacturingIndirectCost) {
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
	public ResultEntityType getManufacturingIndirectCostValue() {
		return manufacturingIndirectCostValue;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingIndirectCostValue() <em>manufacturingIndirectCostValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingIndirectCostValue() manufacturingIndirectCostValue}' feature.
	 * @generated
	 */
	public void setManufacturingIndirectCostValue(
			ResultEntityType newManufacturingIndirectCostValue) {
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
	public ResultEntityType getManufacturingMachine() {
		return manufacturingMachine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMachine() <em>manufacturingMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMachine() manufacturingMachine}' feature.
	 * @generated
	 */
	public void setManufacturingMachine(ResultEntityType newManufacturingMachine) {
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
	public ResultEntityType getManufacturingMachineCost() {
		return manufacturingMachineCost;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMachineCost() <em>manufacturingMachineCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMachineCost() manufacturingMachineCost}' feature.
	 * @generated
	 */
	public void setManufacturingMachineCost(
			ResultEntityType newManufacturingMachineCost) {
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
	public ResultEntityType getManufacturingMachineStation() {
		return manufacturingMachineStation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMachineStation() <em>manufacturingMachineStation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMachineStation() manufacturingMachineStation}' feature.
	 * @generated
	 */
	public void setManufacturingMachineStation(
			ResultEntityType newManufacturingMachineStation) {
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
	public ResultEntityType getManufacturingMachineType() {
		return manufacturingMachineType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMachineType() <em>manufacturingMachineType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMachineType() manufacturingMachineType}' feature.
	 * @generated
	 */
	public void setManufacturingMachineType(
			ResultEntityType newManufacturingMachineType) {
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
	public ResultEntityType getManufacturingMainteanceOrder() {
		return manufacturingMainteanceOrder;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMainteanceOrder() <em>manufacturingMainteanceOrder</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMainteanceOrder() manufacturingMainteanceOrder}' feature.
	 * @generated
	 */
	public void setManufacturingMainteanceOrder(
			ResultEntityType newManufacturingMainteanceOrder) {
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
	public ResultEntityType getManufacturingMaintenance() {
		return manufacturingMaintenance;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMaintenance() <em>manufacturingMaintenance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMaintenance() manufacturingMaintenance}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenance(
			ResultEntityType newManufacturingMaintenance) {
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
	public ResultEntityType getManufacturingMaintenancePeriodicity() {
		return manufacturingMaintenancePeriodicity;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMaintenancePeriodicity() <em>manufacturingMaintenancePeriodicity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMaintenancePeriodicity() manufacturingMaintenancePeriodicity}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenancePeriodicity(
			ResultEntityType newManufacturingMaintenancePeriodicity) {
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
	public ResultEntityType getManufacturingMaintenanceSchedule() {
		return manufacturingMaintenanceSchedule;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMaintenanceSchedule() <em>manufacturingMaintenanceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMaintenanceSchedule() manufacturingMaintenanceSchedule}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceSchedule(
			ResultEntityType newManufacturingMaintenanceSchedule) {
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
	public ResultEntityType getManufacturingMaintenanceTask() {
		return manufacturingMaintenanceTask;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMaintenanceTask() <em>manufacturingMaintenanceTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMaintenanceTask() manufacturingMaintenanceTask}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceTask(
			ResultEntityType newManufacturingMaintenanceTask) {
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
	public ResultEntityType getManufacturingMaintenanceWorker() {
		return manufacturingMaintenanceWorker;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMaintenanceWorker() <em>manufacturingMaintenanceWorker</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMaintenanceWorker() manufacturingMaintenanceWorker}' feature.
	 * @generated
	 */
	public void setManufacturingMaintenanceWorker(
			ResultEntityType newManufacturingMaintenanceWorker) {
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
	public ResultEntityType getManufacturingMeasureGroup() {
		return manufacturingMeasureGroup;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMeasureGroup() <em>manufacturingMeasureGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMeasureGroup() manufacturingMeasureGroup}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureGroup(
			ResultEntityType newManufacturingMeasureGroup) {
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
	public ResultEntityType getManufacturingMeasureShift() {
		return manufacturingMeasureShift;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMeasureShift() <em>manufacturingMeasureShift</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMeasureShift() manufacturingMeasureShift}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureShift(
			ResultEntityType newManufacturingMeasureShift) {
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
	public ResultEntityType getManufacturingMeasureTime() {
		return manufacturingMeasureTime;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMeasureTime() <em>manufacturingMeasureTime</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMeasureTime() manufacturingMeasureTime}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureTime(
			ResultEntityType newManufacturingMeasureTime) {
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
	public ResultEntityType getManufacturingMeasureValues() {
		return manufacturingMeasureValues;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMeasureValues() <em>manufacturingMeasureValues</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMeasureValues() manufacturingMeasureValues}' feature.
	 * @generated
	 */
	public void setManufacturingMeasureValues(
			ResultEntityType newManufacturingMeasureValues) {
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
	public ResultEntityType getManufacturingOperation() {
		return manufacturingOperation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingOperation() <em>manufacturingOperation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingOperation() manufacturingOperation}' feature.
	 * @generated
	 */
	public void setManufacturingOperation(
			ResultEntityType newManufacturingOperation) {
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
	public ResultEntityType getManufacturingOperationEmployee() {
		return manufacturingOperationEmployee;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingOperationEmployee() <em>manufacturingOperationEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingOperationEmployee() manufacturingOperationEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingOperationEmployee(
			ResultEntityType newManufacturingOperationEmployee) {
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
	public ResultEntityType getManufacturingOperationIndirectCost() {
		return manufacturingOperationIndirectCost;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingOperationIndirectCost() <em>manufacturingOperationIndirectCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingOperationIndirectCost() manufacturingOperationIndirectCost}' feature.
	 * @generated
	 */
	public void setManufacturingOperationIndirectCost(
			ResultEntityType newManufacturingOperationIndirectCost) {
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
	public ResultEntityType getManufacturingOperationMachine() {
		return manufacturingOperationMachine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingOperationMachine() <em>manufacturingOperationMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingOperationMachine() manufacturingOperationMachine}' feature.
	 * @generated
	 */
	public void setManufacturingOperationMachine(
			ResultEntityType newManufacturingOperationMachine) {
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
	public ResultEntityType getManufacturingOperationProduct() {
		return manufacturingOperationProduct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingOperationProduct() <em>manufacturingOperationProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingOperationProduct() manufacturingOperationProduct}' feature.
	 * @generated
	 */
	public void setManufacturingOperationProduct(
			ResultEntityType newManufacturingOperationProduct) {
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
	public ResultEntityType getManufacturingPeriodicControl() {
		return manufacturingPeriodicControl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingPeriodicControl() <em>manufacturingPeriodicControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingPeriodicControl() manufacturingPeriodicControl}' feature.
	 * @generated
	 */
	public void setManufacturingPeriodicControl(
			ResultEntityType newManufacturingPeriodicControl) {
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
	public ResultEntityType getManufacturingProcessPlan() {
		return manufacturingProcessPlan;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProcessPlan() <em>manufacturingProcessPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProcessPlan() manufacturingProcessPlan}' feature.
	 * @generated
	 */
	public void setManufacturingProcessPlan(
			ResultEntityType newManufacturingProcessPlan) {
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
	public ResultEntityType getManufacturingProductionLine() {
		return manufacturingProductionLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProductionLine() <em>manufacturingProductionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProductionLine() manufacturingProductionLine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionLine(
			ResultEntityType newManufacturingProductionLine) {
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
	public ResultEntityType getManufacturingProductionRunEmployee() {
		return manufacturingProductionRunEmployee;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProductionRunEmployee() <em>manufacturingProductionRunEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProductionRunEmployee() manufacturingProductionRunEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunEmployee(
			ResultEntityType newManufacturingProductionRunEmployee) {
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
	public ResultEntityType getManufacturingProductionRunIndirectCosts() {
		return manufacturingProductionRunIndirectCosts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProductionRunIndirectCosts() <em>manufacturingProductionRunIndirectCosts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProductionRunIndirectCosts() manufacturingProductionRunIndirectCosts}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunIndirectCosts(
			ResultEntityType newManufacturingProductionRunIndirectCosts) {
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
	public ResultEntityType getManufacturingProductionRunInvoiceLine() {
		return manufacturingProductionRunInvoiceLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProductionRunInvoiceLine() <em>manufacturingProductionRunInvoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProductionRunInvoiceLine() manufacturingProductionRunInvoiceLine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunInvoiceLine(
			ResultEntityType newManufacturingProductionRunInvoiceLine) {
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
	public ResultEntityType getManufacturingProductionRunMachine() {
		return manufacturingProductionRunMachine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProductionRunMachine() <em>manufacturingProductionRunMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProductionRunMachine() manufacturingProductionRunMachine}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunMachine(
			ResultEntityType newManufacturingProductionRunMachine) {
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
	public ResultEntityType getManufacturingProductionRunToolset() {
		return manufacturingProductionRunToolset;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingProductionRunToolset() <em>manufacturingProductionRunToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingProductionRunToolset() manufacturingProductionRunToolset}' feature.
	 * @generated
	 */
	public void setManufacturingProductionRunToolset(
			ResultEntityType newManufacturingProductionRunToolset) {
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
	public ResultEntityType getManufacturingSection() {
		return manufacturingSection;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingSection() <em>manufacturingSection</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingSection() manufacturingSection}' feature.
	 * @generated
	 */
	public void setManufacturingSection(ResultEntityType newManufacturingSection) {
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
	public ResultEntityType getManufacturingTest() {
		return manufacturingTest;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingTest() <em>manufacturingTest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingTest() manufacturingTest}' feature.
	 * @generated
	 */
	public void setManufacturingTest(ResultEntityType newManufacturingTest) {
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
	public ResultEntityType getManufacturingToolset() {
		return manufacturingToolset;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingToolset() <em>manufacturingToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingToolset() manufacturingToolset}' feature.
	 * @generated
	 */
	public void setManufacturingToolset(ResultEntityType newManufacturingToolset) {
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
	public ResultEntityType getManufacturingToolsetType() {
		return manufacturingToolsetType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingToolsetType() <em>manufacturingToolsetType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingToolsetType() manufacturingToolsetType}' feature.
	 * @generated
	 */
	public void setManufacturingToolsetType(
			ResultEntityType newManufacturingToolsetType) {
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
	public ResultEntityType getManufacturingValue() {
		return manufacturingValue;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingValue() <em>manufacturingValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingValue() manufacturingValue}' feature.
	 * @generated
	 */
	public void setManufacturingValue(ResultEntityType newManufacturingValue) {
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
	public ResultEntityType getManufacturingVersion() {
		return manufacturingVersion;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingVersion() <em>manufacturingVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingVersion() manufacturingVersion}' feature.
	 * @generated
	 */
	public void setManufacturingVersion(ResultEntityType newManufacturingVersion) {
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
	public ResultEntityType getManufacturingWorkCenter() {
		return manufacturingWorkCenter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingWorkCenter() <em>manufacturingWorkCenter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingWorkCenter() manufacturingWorkCenter}' feature.
	 * @generated
	 */
	public void setManufacturingWorkCenter(
			ResultEntityType newManufacturingWorkCenter) {
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
	public ResultEntityType getManufacturingWorkEffortEmployee() {
		return manufacturingWorkEffortEmployee;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingWorkEffortEmployee() <em>manufacturingWorkEffortEmployee</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingWorkEffortEmployee() manufacturingWorkEffortEmployee}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortEmployee(
			ResultEntityType newManufacturingWorkEffortEmployee) {
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
	public ResultEntityType getManufacturingWorkEffortIncidence() {
		return manufacturingWorkEffortIncidence;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingWorkEffortIncidence() <em>manufacturingWorkEffortIncidence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingWorkEffortIncidence() manufacturingWorkEffortIncidence}' feature.
	 * @generated
	 */
	public void setManufacturingWorkEffortIncidence(
			ResultEntityType newManufacturingWorkEffortIncidence) {
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
	public ResultEntityType getManufacturingWorkRequirement() {
		return manufacturingWorkRequirement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingWorkRequirement() <em>manufacturingWorkRequirement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingWorkRequirement() manufacturingWorkRequirement}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirement(
			ResultEntityType newManufacturingWorkRequirement) {
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
	public ResultEntityType getManufacturingWorkRequirementOperation() {
		return manufacturingWorkRequirementOperation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingWorkRequirementOperation() <em>manufacturingWorkRequirementOperation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingWorkRequirementOperation() manufacturingWorkRequirementOperation}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementOperation(
			ResultEntityType newManufacturingWorkRequirementOperation) {
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
	public ResultEntityType getManufacturingWorkRequirementProduct() {
		return manufacturingWorkRequirementProduct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingWorkRequirementProduct() <em>manufacturingWorkRequirementProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingWorkRequirementProduct() manufacturingWorkRequirementProduct}' feature.
	 * @generated
	 */
	public void setManufacturingWorkRequirementProduct(
			ResultEntityType newManufacturingWorkRequirementProduct) {
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
	public ResultEntityType getMarketingCampaign() {
		return marketingCampaign;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMarketingCampaign() <em>marketingCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMarketingCampaign() marketingCampaign}' feature.
	 * @generated
	 */
	public void setMarketingCampaign(ResultEntityType newMarketingCampaign) {
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
	public ResultEntityType getMarketingChannel() {
		return marketingChannel;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMarketingChannel() <em>marketingChannel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMarketingChannel() marketingChannel}' feature.
	 * @generated
	 */
	public void setMarketingChannel(ResultEntityType newMarketingChannel) {
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
	public ResultEntityType getMaterialMgmtABCActivity() {
		return materialMgmtABCActivity;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtABCActivity() <em>materialMgmtABCActivity</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtABCActivity() materialMgmtABCActivity}' feature.
	 * @generated
	 */
	public void setMaterialMgmtABCActivity(
			ResultEntityType newMaterialMgmtABCActivity) {
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
	public ResultEntityType getMaterialMgmtCosting() {
		return materialMgmtCosting;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtCosting() <em>materialMgmtCosting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtCosting() materialMgmtCosting}' feature.
	 * @generated
	 */
	public void setMaterialMgmtCosting(ResultEntityType newMaterialMgmtCosting) {
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
	public ResultEntityType getMaterialMgmtInternalConsumption() {
		return materialMgmtInternalConsumption;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtInternalConsumption() <em>materialMgmtInternalConsumption</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtInternalConsumption() materialMgmtInternalConsumption}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumption(
			ResultEntityType newMaterialMgmtInternalConsumption) {
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
	public ResultEntityType getMaterialMgmtInternalConsumptionLine() {
		return materialMgmtInternalConsumptionLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtInternalConsumptionLine() <em>materialMgmtInternalConsumptionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtInternalConsumptionLine() materialMgmtInternalConsumptionLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalConsumptionLine(
			ResultEntityType newMaterialMgmtInternalConsumptionLine) {
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
	public ResultEntityType getMaterialMgmtInternalMovement() {
		return materialMgmtInternalMovement;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtInternalMovement() <em>materialMgmtInternalMovement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtInternalMovement() materialMgmtInternalMovement}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovement(
			ResultEntityType newMaterialMgmtInternalMovement) {
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
	public ResultEntityType getMaterialMgmtInternalMovementLine() {
		return materialMgmtInternalMovementLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtInternalMovementLine() <em>materialMgmtInternalMovementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtInternalMovementLine() materialMgmtInternalMovementLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInternalMovementLine(
			ResultEntityType newMaterialMgmtInternalMovementLine) {
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
	public ResultEntityType getMaterialMgmtInventoryCount() {
		return materialMgmtInventoryCount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtInventoryCount() <em>materialMgmtInventoryCount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtInventoryCount() materialMgmtInventoryCount}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCount(
			ResultEntityType newMaterialMgmtInventoryCount) {
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
	public ResultEntityType getMaterialMgmtInventoryCountLine() {
		return materialMgmtInventoryCountLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtInventoryCountLine() <em>materialMgmtInventoryCountLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtInventoryCountLine() materialMgmtInventoryCountLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtInventoryCountLine(
			ResultEntityType newMaterialMgmtInventoryCountLine) {
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
	public ResultEntityType getMaterialMgmtMaterialTransaction() {
		return materialMgmtMaterialTransaction;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtMaterialTransaction() <em>materialMgmtMaterialTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtMaterialTransaction() materialMgmtMaterialTransaction}' feature.
	 * @generated
	 */
	public void setMaterialMgmtMaterialTransaction(
			ResultEntityType newMaterialMgmtMaterialTransaction) {
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
	public ResultEntityType getMaterialMgmtProductionPlan() {
		return materialMgmtProductionPlan;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtProductionPlan() <em>materialMgmtProductionPlan</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtProductionPlan() materialMgmtProductionPlan}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionPlan(
			ResultEntityType newMaterialMgmtProductionPlan) {
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
	public ResultEntityType getMaterialMgmtProductionTransaction() {
		return materialMgmtProductionTransaction;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtProductionTransaction() <em>materialMgmtProductionTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtProductionTransaction() materialMgmtProductionTransaction}' feature.
	 * @generated
	 */
	public void setMaterialMgmtProductionTransaction(
			ResultEntityType newMaterialMgmtProductionTransaction) {
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
	public ResultEntityType getMaterialMgmtShipmentInOut() {
		return materialMgmtShipmentInOut;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtShipmentInOut() <em>materialMgmtShipmentInOut</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtShipmentInOut() materialMgmtShipmentInOut}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOut(
			ResultEntityType newMaterialMgmtShipmentInOut) {
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
	public ResultEntityType getMaterialMgmtShipmentInOutLine() {
		return materialMgmtShipmentInOutLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtShipmentInOutLine() <em>materialMgmtShipmentInOutLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtShipmentInOutLine() materialMgmtShipmentInOutLine}' feature.
	 * @generated
	 */
	public void setMaterialMgmtShipmentInOutLine(
			ResultEntityType newMaterialMgmtShipmentInOutLine) {
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
	public ResultEntityType getMaterialMgmtStorageDetail() {
		return materialMgmtStorageDetail;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtStorageDetail() <em>materialMgmtStorageDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtStorageDetail() materialMgmtStorageDetail}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStorageDetail(
			ResultEntityType newMaterialMgmtStorageDetail) {
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
	public ResultEntityType getMaterialMgmtStoragePending() {
		return materialMgmtStoragePending;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtStoragePending() <em>materialMgmtStoragePending</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtStoragePending() materialMgmtStoragePending}' feature.
	 * @generated
	 */
	public void setMaterialMgmtStoragePending(
			ResultEntityType newMaterialMgmtStoragePending) {
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
	public ResultEntityType getModelImplementationParameter() {
		return modelImplementationParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModelImplementationParameter() <em>modelImplementationParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModelImplementationParameter() modelImplementationParameter}' feature.
	 * @generated
	 */
	public void setModelImplementationParameter(
			ResultEntityType newModelImplementationParameter) {
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
	public ResultEntityType getModuleDBPrefix() {
		return moduleDBPrefix;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleDBPrefix() <em>moduleDBPrefix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleDBPrefix() moduleDBPrefix}' feature.
	 * @generated
	 */
	public void setModuleDBPrefix(ResultEntityType newModuleDBPrefix) {
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
	public ResultEntityType getModuleDependency() {
		return moduleDependency;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleDependency() <em>moduleDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleDependency() moduleDependency}' feature.
	 * @generated
	 */
	public void setModuleDependency(ResultEntityType newModuleDependency) {
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
	public ResultEntityType getModuleLog() {
		return moduleLog;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleLog() <em>moduleLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleLog() moduleLog}' feature.
	 * @generated
	 */
	public void setModuleLog(ResultEntityType newModuleLog) {
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
	public ResultEntityType getModuleTrl() {
		return moduleTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleTrl() <em>moduleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleTrl() moduleTrl}' feature.
	 * @generated
	 */
	public void setModuleTrl(ResultEntityType newModuleTrl) {
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
	public ResultEntityType getNamingException() {
		return namingException;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getNamingException() <em>namingException</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getNamingException() namingException}' feature.
	 * @generated
	 */
	public void setNamingException(ResultEntityType newNamingException) {
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
	public ResultEntityType getOBCLKERTemplate() {
		return oBCLKERTemplate;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCLKERTemplate() <em>oBCLKERTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCLKERTemplate() oBCLKERTemplate}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplate(ResultEntityType newOBCLKERTemplate) {
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
	public ResultEntityType getOBCLKERTemplateDependency() {
		return oBCLKERTemplateDependency;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCLKERTemplateDependency() <em>oBCLKERTemplateDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCLKERTemplateDependency() oBCLKERTemplateDependency}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplateDependency(
			ResultEntityType newOBCLKERTemplateDependency) {
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
	public ResultEntityType getOBCLKERUIDefinition() {
		return oBCLKERUIDefinition;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCLKERUIDefinition() <em>oBCLKERUIDefinition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCLKERUIDefinition() oBCLKERUIDefinition}' feature.
	 * @generated
	 */
	public void setOBCLKERUIDefinition(ResultEntityType newOBCLKERUIDefinition) {
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
	public ResultEntityType getOBCQLQueryColumn() {
		return oBCQLQueryColumn;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCQLQueryColumn() <em>oBCQLQueryColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCQLQueryColumn() oBCQLQueryColumn}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumn(ResultEntityType newOBCQLQueryColumn) {
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
	public ResultEntityType getOBCQLQueryColumnTrl() {
		return oBCQLQueryColumnTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCQLQueryColumnTrl() <em>oBCQLQueryColumnTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCQLQueryColumnTrl() oBCQLQueryColumnTrl}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnTrl(ResultEntityType newOBCQLQueryColumnTrl) {
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
	public ResultEntityType getOBCQLWidgetQuery() {
		return oBCQLWidgetQuery;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCQLWidgetQuery() <em>oBCQLWidgetQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCQLWidgetQuery() oBCQLWidgetQuery}' feature.
	 * @generated
	 */
	public void setOBCQLWidgetQuery(ResultEntityType newOBCQLWidgetQuery) {
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
	public ResultEntityType getOBKMOWidgetClass() {
		return oBKMOWidgetClass;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClass() <em>oBKMOWidgetClass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClass() oBKMOWidgetClass}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClass(ResultEntityType newOBKMOWidgetClass) {
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
	public ResultEntityType getOBKMOWidgetClassAccess() {
		return oBKMOWidgetClassAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClassAccess() <em>oBKMOWidgetClassAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClassAccess() oBKMOWidgetClassAccess}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassAccess(
			ResultEntityType newOBKMOWidgetClassAccess) {
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
	public ResultEntityType getOBKMOWidgetClassMenu() {
		return oBKMOWidgetClassMenu;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClassMenu() <em>oBKMOWidgetClassMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClassMenu() oBKMOWidgetClassMenu}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenu(ResultEntityType newOBKMOWidgetClassMenu) {
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
	public ResultEntityType getOBKMOWidgetClassMenuTrl() {
		return oBKMOWidgetClassMenuTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClassMenuTrl() <em>oBKMOWidgetClassMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClassMenuTrl() oBKMOWidgetClassMenuTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenuTrl(
			ResultEntityType newOBKMOWidgetClassMenuTrl) {
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
	public ResultEntityType getOBKMOWidgetClassTrl() {
		return oBKMOWidgetClassTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClassTrl() <em>oBKMOWidgetClassTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClassTrl() oBKMOWidgetClassTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassTrl(ResultEntityType newOBKMOWidgetClassTrl) {
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
	public ResultEntityType getOBKMOWidgetInstance() {
		return oBKMOWidgetInstance;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetInstance() <em>oBKMOWidgetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetInstance() oBKMOWidgetInstance}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstance(ResultEntityType newOBKMOWidgetInstance) {
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
	public ResultEntityType getOBKMOWidgetList() {
		return oBKMOWidgetList;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetList() <em>oBKMOWidgetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetList() oBKMOWidgetList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetList(ResultEntityType newOBKMOWidgetList) {
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
	public ResultEntityType getOBKMOWidgetReference() {
		return oBKMOWidgetReference;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetReference() <em>oBKMOWidgetReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetReference() oBKMOWidgetReference}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetReference(ResultEntityType newOBKMOWidgetReference) {
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
	public ResultEntityType getOBKMOWidgetURL() {
		return oBKMOWidgetURL;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetURL() <em>oBKMOWidgetURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetURL() oBKMOWidgetURL}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetURL(ResultEntityType newOBKMOWidgetURL) {
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
	public ResultEntityType getOBSEIGDefaults() {
		return oBSEIGDefaults;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSEIGDefaults() <em>oBSEIGDefaults</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSEIGDefaults() oBSEIGDefaults}' feature.
	 * @generated
	 */
	public void setOBSEIGDefaults(ResultEntityType newOBSEIGDefaults) {
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
	public ResultEntityType getOBSERDSDatasource() {
		return oBSERDSDatasource;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSERDSDatasource() <em>oBSERDSDatasource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSERDSDatasource() oBSERDSDatasource}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasource(ResultEntityType newOBSERDSDatasource) {
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
	public ResultEntityType getOBSERDSDatasourceField() {
		return oBSERDSDatasourceField;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSERDSDatasourceField() <em>oBSERDSDatasourceField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSERDSDatasourceField() oBSERDSDatasourceField}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasourceField(
			ResultEntityType newOBSERDSDatasourceField) {
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
	public ResultEntityType getOBSOIDUserIdentifier() {
		return oBSOIDUserIdentifier;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSOIDUserIdentifier() <em>oBSOIDUserIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSOIDUserIdentifier() oBSOIDUserIdentifier}' feature.
	 * @generated
	 */
	public void setOBSOIDUserIdentifier(ResultEntityType newOBSOIDUserIdentifier) {
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
	public ResultEntityType getOBUIAPPMenuParameters() {
		return oBUIAPPMenuParameters;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPMenuParameters() <em>oBUIAPPMenuParameters</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPMenuParameters() oBUIAPPMenuParameters}' feature.
	 * @generated
	 */
	public void setOBUIAPPMenuParameters(
			ResultEntityType newOBUIAPPMenuParameters) {
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
	public ResultEntityType getOBUIAPPNavbarRoleaccess() {
		return oBUIAPPNavbarRoleaccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPNavbarRoleaccess() <em>oBUIAPPNavbarRoleaccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPNavbarRoleaccess() oBUIAPPNavbarRoleaccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavbarRoleaccess(
			ResultEntityType newOBUIAPPNavbarRoleaccess) {
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
	public ResultEntityType getOBUIAPPNavigationBarComponent() {
		return oBUIAPPNavigationBarComponent;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPNavigationBarComponent() <em>oBUIAPPNavigationBarComponent</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPNavigationBarComponent() oBUIAPPNavigationBarComponent}' feature.
	 * @generated
	 */
	public void setOBUIAPPNavigationBarComponent(
			ResultEntityType newOBUIAPPNavigationBarComponent) {
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
	public ResultEntityType getOBUIAPPNote() {
		return oBUIAPPNote;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPNote() <em>oBUIAPPNote</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPNote() oBUIAPPNote}' feature.
	 * @generated
	 */
	public void setOBUIAPPNote(ResultEntityType newOBUIAPPNote) {
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
	public ResultEntityType getOBUIAPPParameter() {
		return oBUIAPPParameter;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPParameter() <em>oBUIAPPParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPParameter() oBUIAPPParameter}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameter(ResultEntityType newOBUIAPPParameter) {
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
	public ResultEntityType getOBUIAPPParameterTrl() {
		return oBUIAPPParameterTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPParameterTrl() <em>oBUIAPPParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPParameterTrl() oBUIAPPParameterTrl}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterTrl(ResultEntityType newOBUIAPPParameterTrl) {
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
	public ResultEntityType getOBUIAPPParameterValue() {
		return oBUIAPPParameterValue;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPParameterValue() <em>oBUIAPPParameterValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPParameterValue() oBUIAPPParameterValue}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterValue(
			ResultEntityType newOBUIAPPParameterValue) {
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
	public ResultEntityType getOBUIAPPProcess() {
		return oBUIAPPProcess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPProcess() <em>oBUIAPPProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPProcess() oBUIAPPProcess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcess(ResultEntityType newOBUIAPPProcess) {
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
	public ResultEntityType getOBUIAPPProcessAccess() {
		return oBUIAPPProcessAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPProcessAccess() <em>oBUIAPPProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPProcessAccess() oBUIAPPProcessAccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcessAccess(ResultEntityType newOBUIAPPProcessAccess) {
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
	public ResultEntityType getOBUIAPPRefWindow() {
		return oBUIAPPRefWindow;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPRefWindow() <em>oBUIAPPRefWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPRefWindow() oBUIAPPRefWindow}' feature.
	 * @generated
	 */
	public void setOBUIAPPRefWindow(ResultEntityType newOBUIAPPRefWindow) {
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
	public ResultEntityType getOBUIAPPUIPersonalization() {
		return oBUIAPPUIPersonalization;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPUIPersonalization() <em>oBUIAPPUIPersonalization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPUIPersonalization() oBUIAPPUIPersonalization}' feature.
	 * @generated
	 */
	public void setOBUIAPPUIPersonalization(
			ResultEntityType newOBUIAPPUIPersonalization) {
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
	public ResultEntityType getOBUIAPPViewImplementation() {
		return oBUIAPPViewImplementation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPViewImplementation() <em>oBUIAPPViewImplementation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPViewImplementation() oBUIAPPViewImplementation}' feature.
	 * @generated
	 */
	public void setOBUIAPPViewImplementation(
			ResultEntityType newOBUIAPPViewImplementation) {
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
	public ResultEntityType getOBUISELSelector() {
		return oBUISELSelector;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelector() <em>oBUISELSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelector() oBUISELSelector}' feature.
	 * @generated
	 */
	public void setOBUISELSelector(ResultEntityType newOBUISELSelector) {
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
	public ResultEntityType getOBUISELSelectorField() {
		return oBUISELSelectorField;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelectorField() <em>oBUISELSelectorField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelectorField() oBUISELSelectorField}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorField(ResultEntityType newOBUISELSelectorField) {
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
	public ResultEntityType getOBUISELSelectorFieldTrl() {
		return oBUISELSelectorFieldTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelectorFieldTrl() <em>oBUISELSelectorFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelectorFieldTrl() oBUISELSelectorFieldTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorFieldTrl(
			ResultEntityType newOBUISELSelectorFieldTrl) {
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
	public ResultEntityType getOBUISELSelectorTrl() {
		return oBUISELSelectorTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelectorTrl() <em>oBUISELSelectorTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelectorTrl() oBUISELSelectorTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorTrl(ResultEntityType newOBUISELSelectorTrl) {
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
	public ResultEntityType getOrder() {
		return order;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrder() <em>order</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrder() order}' feature.
	 * @generated
	 */
	public void setOrder(ResultEntityType newOrder) {
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
	public ResultEntityType getOrderDiscount() {
		return orderDiscount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderDiscount() <em>orderDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderDiscount() orderDiscount}' feature.
	 * @generated
	 */
	public void setOrderDiscount(ResultEntityType newOrderDiscount) {
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
	public ResultEntityType getOrderLine() {
		return orderLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderLine() <em>orderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderLine() orderLine}' feature.
	 * @generated
	 */
	public void setOrderLine(ResultEntityType newOrderLine) {
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
	public ResultEntityType getOrderLineOffer() {
		return orderLineOffer;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderLineOffer() <em>orderLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderLineOffer() orderLineOffer}' feature.
	 * @generated
	 */
	public void setOrderLineOffer(ResultEntityType newOrderLineOffer) {
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
	public ResultEntityType getOrderLineTax() {
		return orderLineTax;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderLineTax() <em>orderLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderLineTax() orderLineTax}' feature.
	 * @generated
	 */
	public void setOrderLineTax(ResultEntityType newOrderLineTax) {
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
	public ResultEntityType getOrderTax() {
		return orderTax;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderTax() <em>orderTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderTax() orderTax}' feature.
	 * @generated
	 */
	public void setOrderTax(ResultEntityType newOrderTax) {
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
	public ResultEntityType getOrganization() {
		return organization;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(ResultEntityType newOrganization) {
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
	public ResultEntityType getOrganizationAcctSchema() {
		return organizationAcctSchema;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationAcctSchema() <em>organizationAcctSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationAcctSchema() organizationAcctSchema}' feature.
	 * @generated
	 */
	public void setOrganizationAcctSchema(
			ResultEntityType newOrganizationAcctSchema) {
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
	public ResultEntityType getOrganizationClosing() {
		return organizationClosing;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationClosing() <em>organizationClosing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationClosing() organizationClosing}' feature.
	 * @generated
	 */
	public void setOrganizationClosing(ResultEntityType newOrganizationClosing) {
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
	public ResultEntityType getOrganizationInformation() {
		return organizationInformation;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationInformation() <em>organizationInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationInformation() organizationInformation}' feature.
	 * @generated
	 */
	public void setOrganizationInformation(
			ResultEntityType newOrganizationInformation) {
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
	public ResultEntityType getOrganizationModuleV() {
		return organizationModuleV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationModuleV() <em>organizationModuleV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationModuleV() organizationModuleV}' feature.
	 * @generated
	 */
	public void setOrganizationModuleV(ResultEntityType newOrganizationModuleV) {
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
	public ResultEntityType getOrganizationType() {
		return organizationType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationType() <em>organizationType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationType() organizationType}' feature.
	 * @generated
	 */
	public void setOrganizationType(ResultEntityType newOrganizationType) {
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
	public ResultEntityType getPeriodControlLog() {
		return periodControlLog;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPeriodControlLog() <em>periodControlLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPeriodControlLog() periodControlLog}' feature.
	 * @generated
	 */
	public void setPeriodControlLog(ResultEntityType newPeriodControlLog) {
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
	public ResultEntityType getPricingAdjustment() {
		return pricingAdjustment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustment() <em>pricingAdjustment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustment() pricingAdjustment}' feature.
	 * @generated
	 */
	public void setPricingAdjustment(ResultEntityType newPricingAdjustment) {
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
	public ResultEntityType getPricingAdjustmentBusinessPartner() {
		return pricingAdjustmentBusinessPartner;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustmentBusinessPartner() <em>pricingAdjustmentBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustmentBusinessPartner() pricingAdjustmentBusinessPartner}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartner(
			ResultEntityType newPricingAdjustmentBusinessPartner) {
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
	public ResultEntityType getPricingAdjustmentBusinessPartnerGroup() {
		return pricingAdjustmentBusinessPartnerGroup;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustmentBusinessPartnerGroup() <em>pricingAdjustmentBusinessPartnerGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustmentBusinessPartnerGroup() pricingAdjustmentBusinessPartnerGroup}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentBusinessPartnerGroup(
			ResultEntityType newPricingAdjustmentBusinessPartnerGroup) {
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
	public ResultEntityType getPricingAdjustmentPriceList() {
		return pricingAdjustmentPriceList;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustmentPriceList() <em>pricingAdjustmentPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustmentPriceList() pricingAdjustmentPriceList}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentPriceList(
			ResultEntityType newPricingAdjustmentPriceList) {
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
	public ResultEntityType getPricingAdjustmentProduct() {
		return pricingAdjustmentProduct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustmentProduct() <em>pricingAdjustmentProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustmentProduct() pricingAdjustmentProduct}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProduct(
			ResultEntityType newPricingAdjustmentProduct) {
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
	public ResultEntityType getPricingAdjustmentProductCategory() {
		return pricingAdjustmentProductCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustmentProductCategory() <em>pricingAdjustmentProductCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustmentProductCategory() pricingAdjustmentProductCategory}' feature.
	 * @generated
	 */
	public void setPricingAdjustmentProductCategory(
			ResultEntityType newPricingAdjustmentProductCategory) {
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
	public ResultEntityType getPricingDiscount() {
		return pricingDiscount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingDiscount() <em>pricingDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingDiscount() pricingDiscount}' feature.
	 * @generated
	 */
	public void setPricingDiscount(ResultEntityType newPricingDiscount) {
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
	public ResultEntityType getPricingPriceList() {
		return pricingPriceList;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingPriceList() <em>pricingPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingPriceList() pricingPriceList}' feature.
	 * @generated
	 */
	public void setPricingPriceList(ResultEntityType newPricingPriceList) {
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
	public ResultEntityType getPricingPriceListSchema() {
		return pricingPriceListSchema;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingPriceListSchema() <em>pricingPriceListSchema</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingPriceListSchema() pricingPriceListSchema}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchema(
			ResultEntityType newPricingPriceListSchema) {
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
	public ResultEntityType getPricingPriceListSchemeLine() {
		return pricingPriceListSchemeLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingPriceListSchemeLine() <em>pricingPriceListSchemeLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingPriceListSchemeLine() pricingPriceListSchemeLine}' feature.
	 * @generated
	 */
	public void setPricingPriceListSchemeLine(
			ResultEntityType newPricingPriceListSchemeLine) {
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
	public ResultEntityType getPricingPriceListVersion() {
		return pricingPriceListVersion;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingPriceListVersion() <em>pricingPriceListVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingPriceListVersion() pricingPriceListVersion}' feature.
	 * @generated
	 */
	public void setPricingPriceListVersion(
			ResultEntityType newPricingPriceListVersion) {
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
	public ResultEntityType getPricingProductPrice() {
		return pricingProductPrice;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingProductPrice() <em>pricingProductPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingProductPrice() pricingProductPrice}' feature.
	 * @generated
	 */
	public void setPricingProductPrice(ResultEntityType newPricingProductPrice) {
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
	public ResultEntityType getPricingVolumeDiscount() {
		return pricingVolumeDiscount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingVolumeDiscount() <em>pricingVolumeDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingVolumeDiscount() pricingVolumeDiscount}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscount(
			ResultEntityType newPricingVolumeDiscount) {
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
	public ResultEntityType getPricingVolumeDiscountBusinessPartner() {
		return pricingVolumeDiscountBusinessPartner;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingVolumeDiscountBusinessPartner() <em>pricingVolumeDiscountBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingVolumeDiscountBusinessPartner() pricingVolumeDiscountBusinessPartner}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountBusinessPartner(
			ResultEntityType newPricingVolumeDiscountBusinessPartner) {
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
	public ResultEntityType getPricingVolumeDiscountInvoice() {
		return pricingVolumeDiscountInvoice;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingVolumeDiscountInvoice() <em>pricingVolumeDiscountInvoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingVolumeDiscountInvoice() pricingVolumeDiscountInvoice}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountInvoice(
			ResultEntityType newPricingVolumeDiscountInvoice) {
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
	public ResultEntityType getPricingVolumeDiscountProduct() {
		return pricingVolumeDiscountProduct;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingVolumeDiscountProduct() <em>pricingVolumeDiscountProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingVolumeDiscountProduct() pricingVolumeDiscountProduct}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProduct(
			ResultEntityType newPricingVolumeDiscountProduct) {
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
	public ResultEntityType getPricingVolumeDiscountProductCategory() {
		return pricingVolumeDiscountProductCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingVolumeDiscountProductCategory() <em>pricingVolumeDiscountProductCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingVolumeDiscountProductCategory() pricingVolumeDiscountProductCategory}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountProductCategory(
			ResultEntityType newPricingVolumeDiscountProductCategory) {
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
	public ResultEntityType getPricingVolumeDiscountScale() {
		return pricingVolumeDiscountScale;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingVolumeDiscountScale() <em>pricingVolumeDiscountScale</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingVolumeDiscountScale() pricingVolumeDiscountScale}' feature.
	 * @generated
	 */
	public void setPricingVolumeDiscountScale(
			ResultEntityType newPricingVolumeDiscountScale) {
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
	public ResultEntityType getProcessExecution() {
		return processExecution;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcessExecution() <em>processExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcessExecution() processExecution}' feature.
	 * @generated
	 */
	public void setProcessExecution(ResultEntityType newProcessExecution) {
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
	public ResultEntityType getProcessRequest() {
		return processRequest;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcessRequest() <em>processRequest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcessRequest() processRequest}' feature.
	 * @generated
	 */
	public void setProcessRequest(ResultEntityType newProcessRequest) {
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
	public ResultEntityType getProcessRun() {
		return processRun;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcessRun() <em>processRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcessRun() processRun}' feature.
	 * @generated
	 */
	public void setProcessRun(ResultEntityType newProcessRun) {
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
	public ResultEntityType getProcurementPOInvoiceMatch() {
		return procurementPOInvoiceMatch;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcurementPOInvoiceMatch() <em>procurementPOInvoiceMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcurementPOInvoiceMatch() procurementPOInvoiceMatch}' feature.
	 * @generated
	 */
	public void setProcurementPOInvoiceMatch(
			ResultEntityType newProcurementPOInvoiceMatch) {
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
	public ResultEntityType getProcurementReceiptInvoiceMatch() {
		return procurementReceiptInvoiceMatch;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcurementReceiptInvoiceMatch() <em>procurementReceiptInvoiceMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcurementReceiptInvoiceMatch() procurementReceiptInvoiceMatch}' feature.
	 * @generated
	 */
	public void setProcurementReceiptInvoiceMatch(
			ResultEntityType newProcurementReceiptInvoiceMatch) {
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
	public ResultEntityType getProcurementRequisition() {
		return procurementRequisition;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcurementRequisition() <em>procurementRequisition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcurementRequisition() procurementRequisition}' feature.
	 * @generated
	 */
	public void setProcurementRequisition(
			ResultEntityType newProcurementRequisition) {
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
	public ResultEntityType getProcurementRequisitionLine() {
		return procurementRequisitionLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcurementRequisitionLine() <em>procurementRequisitionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcurementRequisitionLine() procurementRequisitionLine}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionLine(
			ResultEntityType newProcurementRequisitionLine) {
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
	public ResultEntityType getProcurementRequisitionPOMatch() {
		return procurementRequisitionPOMatch;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcurementRequisitionPOMatch() <em>procurementRequisitionPOMatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcurementRequisitionPOMatch() procurementRequisitionPOMatch}' feature.
	 * @generated
	 */
	public void setProcurementRequisitionPOMatch(
			ResultEntityType newProcurementRequisitionPOMatch) {
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
	public ResultEntityType getProduct() {
		return product;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(ResultEntityType newProduct) {
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
	public ResultEntityType getProductAccounts() {
		return productAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductAccounts() <em>productAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductAccounts() productAccounts}' feature.
	 * @generated
	 */
	public void setProductAccounts(ResultEntityType newProductAccounts) {
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
	public ResultEntityType getProductBOM() {
		return productBOM;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductBOM() <em>productBOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductBOM() productBOM}' feature.
	 * @generated
	 */
	public void setProductBOM(ResultEntityType newProductBOM) {
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
	public ResultEntityType getProductByPriceAndWarehouse() {
		return productByPriceAndWarehouse;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductByPriceAndWarehouse() <em>productByPriceAndWarehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductByPriceAndWarehouse() productByPriceAndWarehouse}' feature.
	 * @generated
	 */
	public void setProductByPriceAndWarehouse(
			ResultEntityType newProductByPriceAndWarehouse) {
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
	public ResultEntityType getProductCategory() {
		return productCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductCategory() <em>productCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductCategory() productCategory}' feature.
	 * @generated
	 */
	public void setProductCategory(ResultEntityType newProductCategory) {
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
	public ResultEntityType getProductCategoryAccounts() {
		return productCategoryAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductCategoryAccounts() <em>productCategoryAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductCategoryAccounts() productCategoryAccounts}' feature.
	 * @generated
	 */
	public void setProductCategoryAccounts(
			ResultEntityType newProductCategoryAccounts) {
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
	public ResultEntityType getProductCustomer() {
		return productCustomer;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductCustomer() <em>productCustomer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductCustomer() productCustomer}' feature.
	 * @generated
	 */
	public void setProductCustomer(ResultEntityType newProductCustomer) {
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
	public ResultEntityType getProductOrg() {
		return productOrg;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductOrg() <em>productOrg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductOrg() productOrg}' feature.
	 * @generated
	 */
	public void setProductOrg(ResultEntityType newProductOrg) {
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
	public ResultEntityType getProductStockView() {
		return productStockView;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductStockView() <em>productStockView</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductStockView() productStockView}' feature.
	 * @generated
	 */
	public void setProductStockView(ResultEntityType newProductStockView) {
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
	public ResultEntityType getProductSubstitute() {
		return productSubstitute;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductSubstitute() <em>productSubstitute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductSubstitute() productSubstitute}' feature.
	 * @generated
	 */
	public void setProductSubstitute(ResultEntityType newProductSubstitute) {
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
	public ResultEntityType getProductTrl() {
		return productTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductTrl() <em>productTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductTrl() productTrl}' feature.
	 * @generated
	 */
	public void setProductTrl(ResultEntityType newProductTrl) {
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
	public ResultEntityType getProductUOM() {
		return productUOM;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductUOM() <em>productUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductUOM() productUOM}' feature.
	 * @generated
	 */
	public void setProductUOM(ResultEntityType newProductUOM) {
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
	public ResultEntityType getProject() {
		return project;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(ResultEntityType newProject) {
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
	public ResultEntityType getProjectAccounts() {
		return projectAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectAccounts() <em>projectAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectAccounts() projectAccounts}' feature.
	 * @generated
	 */
	public void setProjectAccounts(ResultEntityType newProjectAccounts) {
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
	public ResultEntityType getProjectIssue() {
		return projectIssue;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectIssue() <em>projectIssue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectIssue() projectIssue}' feature.
	 * @generated
	 */
	public void setProjectIssue(ResultEntityType newProjectIssue) {
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
	public ResultEntityType getProjectLine() {
		return projectLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectLine() <em>projectLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectLine() projectLine}' feature.
	 * @generated
	 */
	public void setProjectLine(ResultEntityType newProjectLine) {
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
	public ResultEntityType getProjectPhase() {
		return projectPhase;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(ResultEntityType newProjectPhase) {
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
	public ResultEntityType getProjectProjectProposalTask() {
		return projectProjectProposalTask;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectProjectProposalTask() <em>projectProjectProposalTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectProjectProposalTask() projectProjectProposalTask}' feature.
	 * @generated
	 */
	public void setProjectProjectProposalTask(
			ResultEntityType newProjectProjectProposalTask) {
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
	public ResultEntityType getProjectProposal() {
		return projectProposal;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectProposal() <em>projectProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectProposal() projectProposal}' feature.
	 * @generated
	 */
	public void setProjectProposal(ResultEntityType newProjectProposal) {
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
	public ResultEntityType getProjectProposalLine() {
		return projectProposalLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectProposalLine() <em>projectProposalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectProposalLine() projectProposalLine}' feature.
	 * @generated
	 */
	public void setProjectProposalLine(ResultEntityType newProjectProposalLine) {
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
	public ResultEntityType getProjectStandardPhase() {
		return projectStandardPhase;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectStandardPhase() <em>projectStandardPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectStandardPhase() projectStandardPhase}' feature.
	 * @generated
	 */
	public void setProjectStandardPhase(ResultEntityType newProjectStandardPhase) {
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
	public ResultEntityType getProjectStandardTask() {
		return projectStandardTask;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectStandardTask() <em>projectStandardTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectStandardTask() projectStandardTask}' feature.
	 * @generated
	 */
	public void setProjectStandardTask(ResultEntityType newProjectStandardTask) {
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
	public ResultEntityType getProjectTask() {
		return projectTask;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectTask() <em>projectTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectTask() projectTask}' feature.
	 * @generated
	 */
	public void setProjectTask(ResultEntityType newProjectTask) {
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
	public ResultEntityType getProjectType() {
		return projectType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectType() <em>projectType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectType() projectType}' feature.
	 * @generated
	 */
	public void setProjectType(ResultEntityType newProjectType) {
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
	public ResultEntityType getProjectVendor() {
		return projectVendor;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectVendor() <em>projectVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectVendor() projectVendor}' feature.
	 * @generated
	 */
	public void setProjectVendor(ResultEntityType newProjectVendor) {
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
	public ResultEntityType getReferenceDataStore() {
		return referenceDataStore;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReferenceDataStore() <em>referenceDataStore</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReferenceDataStore() referenceDataStore}' feature.
	 * @generated
	 */
	public void setReferenceDataStore(ResultEntityType newReferenceDataStore) {
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
	public ResultEntityType getRegion() {
		return region;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(ResultEntityType newRegion) {
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
	public ResultEntityType getResource() {
		return resource;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResource() <em>resource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResource() resource}' feature.
	 * @generated
	 */
	public void setResource(ResultEntityType newResource) {
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
	public ResultEntityType getResourceAssignment() {
		return resourceAssignment;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResourceAssignment() <em>resourceAssignment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResourceAssignment() resourceAssignment}' feature.
	 * @generated
	 */
	public void setResourceAssignment(ResultEntityType newResourceAssignment) {
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
	public ResultEntityType getResourceType() {
		return resourceType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResourceType() <em>resourceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResourceType() resourceType}' feature.
	 * @generated
	 */
	public void setResourceType(ResultEntityType newResourceType) {
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
	public ResultEntityType getResourceUnAvailable() {
		return resourceUnAvailable;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResourceUnAvailable() <em>resourceUnAvailable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResourceUnAvailable() resourceUnAvailable}' feature.
	 * @generated
	 */
	public void setResourceUnAvailable(ResultEntityType newResourceUnAvailable) {
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
	public ResultEntityType getReturnMaterialOrderPickEditLines() {
		return returnMaterialOrderPickEditLines;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReturnMaterialOrderPickEditLines() <em>returnMaterialOrderPickEditLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReturnMaterialOrderPickEditLines() returnMaterialOrderPickEditLines}' feature.
	 * @generated
	 */
	public void setReturnMaterialOrderPickEditLines(
			ResultEntityType newReturnMaterialOrderPickEditLines) {
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
	public ResultEntityType getReturnMaterialReceiptPickEdit() {
		return returnMaterialReceiptPickEdit;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReturnMaterialReceiptPickEdit() <em>returnMaterialReceiptPickEdit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReturnMaterialReceiptPickEdit() returnMaterialReceiptPickEdit}' feature.
	 * @generated
	 */
	public void setReturnMaterialReceiptPickEdit(
			ResultEntityType newReturnMaterialReceiptPickEdit) {
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
	public ResultEntityType getReturnMaterialShipmentPickEdit() {
		return returnMaterialShipmentPickEdit;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReturnMaterialShipmentPickEdit() <em>returnMaterialShipmentPickEdit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReturnMaterialShipmentPickEdit() returnMaterialShipmentPickEdit}' feature.
	 * @generated
	 */
	public void setReturnMaterialShipmentPickEdit(
			ResultEntityType newReturnMaterialShipmentPickEdit) {
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
	public ResultEntityType getReturnReason() {
		return returnReason;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReturnReason() <em>returnReason</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReturnReason() returnReason}' feature.
	 * @generated
	 */
	public void setReturnReason(ResultEntityType newReturnReason) {
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
	public ResultEntityType getReversedInvoices() {
		return reversedInvoices;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReversedInvoices() <em>reversedInvoices</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReversedInvoices() reversedInvoices}' feature.
	 * @generated
	 */
	public void setReversedInvoices(ResultEntityType newReversedInvoices) {
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
	public ResultEntityType getSQLScript() {
		return sQLScript;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSQLScript() <em>sQLScript</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSQLScript() sQLScript}' feature.
	 * @generated
	 */
	public void setSQLScript(ResultEntityType newSQLScript) {
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
	public ResultEntityType getSalaryCategory() {
		return salaryCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalaryCategory() <em>salaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalaryCategory() salaryCategory}' feature.
	 * @generated
	 */
	public void setSalaryCategory(ResultEntityType newSalaryCategory) {
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
	public ResultEntityType getSalaryCategoryCost() {
		return salaryCategoryCost;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalaryCategoryCost() <em>salaryCategoryCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalaryCategoryCost() salaryCategoryCost}' feature.
	 * @generated
	 */
	public void setSalaryCategoryCost(ResultEntityType newSalaryCategoryCost) {
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
	public ResultEntityType getSalesCommission() {
		return salesCommission;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommission() <em>salesCommission</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommission() salesCommission}' feature.
	 * @generated
	 */
	public void setSalesCommission(ResultEntityType newSalesCommission) {
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
	public ResultEntityType getSalesCommissionAmount() {
		return salesCommissionAmount;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommissionAmount() <em>salesCommissionAmount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommissionAmount() salesCommissionAmount}' feature.
	 * @generated
	 */
	public void setSalesCommissionAmount(
			ResultEntityType newSalesCommissionAmount) {
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
	public ResultEntityType getSalesCommissionDetail() {
		return salesCommissionDetail;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommissionDetail() <em>salesCommissionDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommissionDetail() salesCommissionDetail}' feature.
	 * @generated
	 */
	public void setSalesCommissionDetail(
			ResultEntityType newSalesCommissionDetail) {
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
	public ResultEntityType getSalesCommissionLine() {
		return salesCommissionLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommissionLine() <em>salesCommissionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommissionLine() salesCommissionLine}' feature.
	 * @generated
	 */
	public void setSalesCommissionLine(ResultEntityType newSalesCommissionLine) {
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
	public ResultEntityType getSalesCommissionRun() {
		return salesCommissionRun;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommissionRun() <em>salesCommissionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommissionRun() salesCommissionRun}' feature.
	 * @generated
	 */
	public void setSalesCommissionRun(ResultEntityType newSalesCommissionRun) {
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
	public ResultEntityType getSalesRegion() {
		return salesRegion;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(ResultEntityType newSalesRegion) {
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
	public ResultEntityType getSerialNumberControl() {
		return serialNumberControl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSerialNumberControl() <em>serialNumberControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSerialNumberControl() serialNumberControl}' feature.
	 * @generated
	 */
	public void setSerialNumberControl(ResultEntityType newSerialNumberControl) {
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
	public ResultEntityType getShippingFreightCategory() {
		return shippingFreightCategory;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getShippingFreightCategory() <em>shippingFreightCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getShippingFreightCategory() shippingFreightCategory}' feature.
	 * @generated
	 */
	public void setShippingFreightCategory(
			ResultEntityType newShippingFreightCategory) {
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
	public ResultEntityType getShippingShippingCompany() {
		return shippingShippingCompany;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getShippingShippingCompany() <em>shippingShippingCompany</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getShippingShippingCompany() shippingShippingCompany}' feature.
	 * @generated
	 */
	public void setShippingShippingCompany(
			ResultEntityType newShippingShippingCompany) {
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
	public ResultEntityType getShippingShippingCompanyFreight() {
		return shippingShippingCompanyFreight;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getShippingShippingCompanyFreight() <em>shippingShippingCompanyFreight</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getShippingShippingCompanyFreight() shippingShippingCompanyFreight}' feature.
	 * @generated
	 */
	public void setShippingShippingCompanyFreight(
			ResultEntityType newShippingShippingCompanyFreight) {
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
	public ResultEntityType getTimeAndExpenseSheet() {
		return timeAndExpenseSheet;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getTimeAndExpenseSheet() <em>timeAndExpenseSheet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getTimeAndExpenseSheet() timeAndExpenseSheet}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheet(ResultEntityType newTimeAndExpenseSheet) {
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
	public ResultEntityType getTimeAndExpenseSheetLine() {
		return timeAndExpenseSheetLine;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getTimeAndExpenseSheetLine() <em>timeAndExpenseSheetLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getTimeAndExpenseSheetLine() timeAndExpenseSheetLine}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLine(
			ResultEntityType newTimeAndExpenseSheetLine) {
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
	public ResultEntityType getTimeAndExpenseSheetLineV() {
		return timeAndExpenseSheetLineV;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getTimeAndExpenseSheetLineV() <em>timeAndExpenseSheetLineV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getTimeAndExpenseSheetLineV() timeAndExpenseSheetLineV}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheetLineV(
			ResultEntityType newTimeAndExpenseSheetLineV) {
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
	public ResultEntityType getTimeType() {
		return timeType;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getTimeType() <em>timeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getTimeType() timeType}' feature.
	 * @generated
	 */
	public void setTimeType(ResultEntityType newTimeType) {
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
	public ResultEntityType getUOM() {
		return uOM;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(ResultEntityType newUOM) {
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
	public ResultEntityType getUOMConversion() {
		return uOMConversion;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getUOMConversion() <em>uOMConversion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getUOMConversion() uOMConversion}' feature.
	 * @generated
	 */
	public void setUOMConversion(ResultEntityType newUOMConversion) {
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
	public ResultEntityType getUOMTrl() {
		return uOMTrl;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getUOMTrl() <em>uOMTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getUOMTrl() uOMTrl}' feature.
	 * @generated
	 */
	public void setUOMTrl(ResultEntityType newUOMTrl) {
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
	public ResultEntityType getVendorAccounts() {
		return vendorAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getVendorAccounts() <em>vendorAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getVendorAccounts() vendorAccounts}' feature.
	 * @generated
	 */
	public void setVendorAccounts(ResultEntityType newVendorAccounts) {
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
	public ResultEntityType getWarehouse() {
		return warehouse;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(ResultEntityType newWarehouse) {
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
	public ResultEntityType getWarehouseAccounts() {
		return warehouseAccounts;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getWarehouseAccounts() <em>warehouseAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getWarehouseAccounts() warehouseAccounts}' feature.
	 * @generated
	 */
	public void setWarehouseAccounts(ResultEntityType newWarehouseAccounts) {
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
	public ResultEntityType getWarehouseShipper() {
		return warehouseShipper;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getWarehouseShipper() <em>warehouseShipper</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getWarehouseShipper() warehouseShipper}' feature.
	 * @generated
	 */
	public void setWarehouseShipper(ResultEntityType newWarehouseShipper) {
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
	public ResultEntityType getObuiappViewRoleAccess() {
		return obuiappViewRoleAccess;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getObuiappViewRoleAccess() <em>obuiappViewRoleAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getObuiappViewRoleAccess() obuiappViewRoleAccess}' feature.
	 * @generated
	 */
	public void setObuiappViewRoleAccess(
			ResultEntityType newObuiappViewRoleAccess) {
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
			setADAcctProcess((ResultEntityType) value);
			break;
		case ADALERT:
			setADAlert((ResultEntityType) value);
			break;
		case ADALERTRECIPIENT:
			setADAlertRecipient((ResultEntityType) value);
			break;
		case ADALERTRULE:
			setADAlertRule((ResultEntityType) value);
			break;
		case ADALERTRULETRL:
			setADAlertRuleTrl((ResultEntityType) value);
			break;
		case ADATTACHMENT:
			setADAttachment((ResultEntityType) value);
			break;
		case ADAUXILIARYINPUT:
			setADAuxiliaryInput((ResultEntityType) value);
			break;
		case ADCALLOUT:
			setADCallout((ResultEntityType) value);
			break;
		case ADCLIENT:
			setADClient((ResultEntityType) value);
			break;
		case ADCLIENTMODULE:
			setADClientModule((ResultEntityType) value);
			break;
		case ADCOLUMN:
			setADColumn((ResultEntityType) value);
			break;
		case ADEPINSTANCEPARA:
			setADEPInstancePara((ResultEntityType) value);
			break;
		case ADEPPROCEDURES:
			setADEPProcedures((ResultEntityType) value);
			break;
		case ADELEMENT:
			setADElement((ResultEntityType) value);
			break;
		case ADELEMENTTRL:
			setADElementTrl((ResultEntityType) value);
			break;
		case ADERRORLOG:
			setADErrorLog((ResultEntityType) value);
			break;
		case ADEXTENSIONPOINTS:
			setADExtensionPoints((ResultEntityType) value);
			break;
		case ADFIELD:
			setADField((ResultEntityType) value);
			break;
		case ADFIELDGROUP:
			setADFieldGroup((ResultEntityType) value);
			break;
		case ADFIELDGROUPTRL:
			setADFieldGroupTrl((ResultEntityType) value);
			break;
		case ADFIELDTRL:
			setADFieldTrl((ResultEntityType) value);
			break;
		case ADFILETYPE:
			setADFileType((ResultEntityType) value);
			break;
		case ADFORM:
			setADForm((ResultEntityType) value);
			break;
		case ADFORMACCESS:
			setADFormAccess((ResultEntityType) value);
			break;
		case ADFORMTRL:
			setADFormTrl((ResultEntityType) value);
			break;
		case ADHEARTBEATLOG:
			setADHeartbeatLog((ResultEntityType) value);
			break;
		case ADHEARTBEATLOGCUSTOMQUERY:
			setADHeartbeatLogCustomQuery((ResultEntityType) value);
			break;
		case ADHEARTBEATLOGCUSTOMQUERYROW:
			setADHeartbeatLogCustomQueryRow((ResultEntityType) value);
			break;
		case ADIMAGE:
			setADImage((ResultEntityType) value);
			break;
		case ADLANGUAGE:
			setADLanguage((ResultEntityType) value);
			break;
		case ADLIST:
			setADList((ResultEntityType) value);
			break;
		case ADLISTTRL:
			setADListTrl((ResultEntityType) value);
			break;
		case ADMENU:
			setADMenu((ResultEntityType) value);
			break;
		case ADMENUTRL:
			setADMenuTrl((ResultEntityType) value);
			break;
		case ADMESSAGE:
			setADMessage((ResultEntityType) value);
			break;
		case ADMESSAGETRL:
			setADMessageTrl((ResultEntityType) value);
			break;
		case ADMODELIMPLEMENTATION:
			setADModelImplementation((ResultEntityType) value);
			break;
		case ADMODELIMPLEMENTATIONMAPPING:
			setADModelImplementationMapping((ResultEntityType) value);
			break;
		case ADMODULE:
			setADModule((ResultEntityType) value);
			break;
		case ADMODULEDBPREFIXINSTALL:
			setADModuleDBPrefixInstall((ResultEntityType) value);
			break;
		case ADMODULEDEPENDENCYINST:
			setADModuleDependencyInst((ResultEntityType) value);
			break;
		case ADMODULEINSTALL:
			setADModuleInstall((ResultEntityType) value);
			break;
		case ADMODULEMERGE:
			setADModuleMerge((ResultEntityType) value);
			break;
		case ADMONTH:
			setADMonth((ResultEntityType) value);
			break;
		case ADMONTHTRL:
			setADMonthTrl((ResultEntityType) value);
			break;
		case ADORGMODULE:
			setADOrgModule((ResultEntityType) value);
			break;
		case ADPARAMETER:
			setADParameter((ResultEntityType) value);
			break;
		case ADPREFERENCE:
			setADPreference((ResultEntityType) value);
			break;
		case ADPROCESS:
			setADProcess((ResultEntityType) value);
			break;
		case ADPROCESSACCESS:
			setADProcessAccess((ResultEntityType) value);
			break;
		case ADPROCESSINSTANCE:
			setADProcessInstance((ResultEntityType) value);
			break;
		case ADPROCESSPARAMETER:
			setADProcessParameter((ResultEntityType) value);
			break;
		case ADPROCESSPARAMETERTRL:
			setADProcessParameterTrl((ResultEntityType) value);
			break;
		case ADPROCESSSCHEDULING:
			setADProcessScheduling((ResultEntityType) value);
			break;
		case ADPROCESSTRL:
			setADProcessTrl((ResultEntityType) value);
			break;
		case ADREFERENCE:
			setADReference((ResultEntityType) value);
			break;
		case ADREFERENCETRL:
			setADReferenceTrl((ResultEntityType) value);
			break;
		case ADREFERENCEDTABLE:
			setADReferencedTable((ResultEntityType) value);
			break;
		case ADREGISTRATION:
			setADRegistration((ResultEntityType) value);
			break;
		case ADROLE:
			setADRole((ResultEntityType) value);
			break;
		case ADROLEORGANIZATION:
			setADRoleOrganization((ResultEntityType) value);
			break;
		case ADSELECTOR:
			setADSelector((ResultEntityType) value);
			break;
		case ADSELECTORCOLUMN:
			setADSelectorColumn((ResultEntityType) value);
			break;
		case ADSEQUENCE:
			setADSequence((ResultEntityType) value);
			break;
		case ADSESSION:
			setADSession((ResultEntityType) value);
			break;
		case ADSESSIONSTATUS:
			setADSessionStatus((ResultEntityType) value);
			break;
		case ADSESSIONUSAGEAUDIT:
			setADSessionUsageAudit((ResultEntityType) value);
			break;
		case ADSYSTEM:
			setADSystem((ResultEntityType) value);
			break;
		case ADSYSTEMINFORMATION:
			setADSystemInformation((ResultEntityType) value);
			break;
		case ADTAB:
			setADTab((ResultEntityType) value);
			break;
		case ADTABTRL:
			setADTabTrl((ResultEntityType) value);
			break;
		case ADTABLE:
			setADTable((ResultEntityType) value);
			break;
		case ADTABLEACCESS:
			setADTableAccess((ResultEntityType) value);
			break;
		case ADTABLEPOSTV:
			setADTablePostV((ResultEntityType) value);
			break;
		case ADTEXTINTERFACE:
			setADTextInterface((ResultEntityType) value);
			break;
		case ADTEXTINTERFACETRL:
			setADTextInterfaceTrl((ResultEntityType) value);
			break;
		case ADTREE:
			setADTree((ResultEntityType) value);
			break;
		case ADTREENODE:
			setADTreeNode((ResultEntityType) value);
			break;
		case ADUSER:
			setADUser((ResultEntityType) value);
			break;
		case ADUSERROLES:
			setADUserRoles((ResultEntityType) value);
			break;
		case ADVALIDATION:
			setADValidation((ResultEntityType) value);
			break;
		case ADWINDOW:
			setADWindow((ResultEntityType) value);
			break;
		case ADWINDOWACCESS:
			setADWindowAccess((ResultEntityType) value);
			break;
		case ADWINDOWTRL:
			setADWindowTrl((ResultEntityType) value);
			break;
		case ADAUDITTRAIL:
			setADAuditTrail((ResultEntityType) value);
			break;
		case ADAUDITTRAILRAW:
			setADAuditTrailRaw((ResultEntityType) value);
			break;
		case ADCREATEFACTTEMPLATE:
			setADCreateFactTemplate((ResultEntityType) value);
			break;
		case APRMFINACCTRANSACTIONACCTV:
			setAPRMFinAccTransactionAcctV((ResultEntityType) value);
			break;
		case APRMFINACCTRANSACTIONV:
			setAPRMFinaccTransactionV((ResultEntityType) value);
			break;
		case APRMFINACCTRXFULLACCTV:
			setAPRMFinaccTrxFullAcctV((ResultEntityType) value);
			break;
		case APRMPENDINGPAYMENTINVOICE:
			setAPRMPendingPaymentInvoice((ResultEntityType) value);
			break;
		case APRMRECDETAILV:
			setAPRMRecDetailV((ResultEntityType) value);
			break;
		case APRMRECONCILIATION:
			setAPRMReconciliation((ResultEntityType) value);
			break;
		case ACCTSCHEMATABLEDOCTYPE:
			setAcctSchemaTableDocType((ResultEntityType) value);
			break;
		case ACTIVEPROPOSALV:
			setActiveProposalV((ResultEntityType) value);
			break;
		case APPROVEDVENDOR:
			setApprovedVendor((ResultEntityType) value);
			break;
		case ATTRIBUTE:
			setAttribute((ResultEntityType) value);
			break;
		case ATTRIBUTEINSTANCE:
			setAttributeInstance((ResultEntityType) value);
			break;
		case ATTRIBUTESET:
			setAttributeSet((ResultEntityType) value);
			break;
		case ATTRIBUTESETINSTANCE:
			setAttributeSetInstance((ResultEntityType) value);
			break;
		case ATTRIBUTEUSE:
			setAttributeUse((ResultEntityType) value);
			break;
		case ATTRIBUTEVALUE:
			setAttributeValue((ResultEntityType) value);
			break;
		case BANK:
			setBank((ResultEntityType) value);
			break;
		case BANKACCOUNT:
			setBankAccount((ResultEntityType) value);
			break;
		case BANKACCOUNTACCOUNTS:
			setBankAccountAccounts((ResultEntityType) value);
			break;
		case BUSINESSPARTNER:
			setBusinessPartner((ResultEntityType) value);
			break;
		case BUSINESSPARTNERBANKACCOUNT:
			setBusinessPartnerBankAccount((ResultEntityType) value);
			break;
		case BUSINESSPARTNERCATEGORY:
			setBusinessPartnerCategory((ResultEntityType) value);
			break;
		case BUSINESSPARTNERCATEGORYACCOUNT:
			setBusinessPartnerCategoryAccount((ResultEntityType) value);
			break;
		case BUSINESSPARTNERDISCOUNT:
			setBusinessPartnerDiscount((ResultEntityType) value);
			break;
		case BUSINESSPARTNERLOCATION:
			setBusinessPartnerLocation((ResultEntityType) value);
			break;
		case BUSINESSPARTNERPRODUCTTEMPLATE:
			setBusinessPartnerProductTemplate((ResultEntityType) value);
			break;
		case BUSINESSPARTNERTAXCATEGORY:
			setBusinessPartnerTaxCategory((ResultEntityType) value);
			break;
		case BUSINESSPARTNERWITHHOLDING:
			setBusinessPartnerWithholding((ResultEntityType) value);
			break;
		case CACCTSCHEMAPROCESS:
			setCAcctSchemaProcess((ResultEntityType) value);
			break;
		case CITY:
			setCity((ResultEntityType) value);
			break;
		case CLIENTINFORMATION:
			setClientInformation((ResultEntityType) value);
			break;
		case CONDITIONGOODS:
			setConditionGoods((ResultEntityType) value);
			break;
		case CONTACTEMAILINTERACTION:
			setContactEmailInteraction((ResultEntityType) value);
			break;
		case COUNTRY:
			setCountry((ResultEntityType) value);
			break;
		case COUNTRYTRL:
			setCountryTrl((ResultEntityType) value);
			break;
		case CURRENCY:
			setCurrency((ResultEntityType) value);
			break;
		case CURRENCYCONVERSIONRATE:
			setCurrencyConversionRate((ResultEntityType) value);
			break;
		case CURRENCYCONVERSIONRATEDOC:
			setCurrencyConversionRateDoc((ResultEntityType) value);
			break;
		case CURRENCYTRL:
			setCurrencyTrl((ResultEntityType) value);
			break;
		case CUSTOMERACCOUNTS:
			setCustomerAccounts((ResultEntityType) value);
			break;
		case DATAPACKAGE:
			setDataPackage((ResultEntityType) value);
			break;
		case DATASET:
			setDataSet((ResultEntityType) value);
			break;
		case DATASETCOLUMN:
			setDataSetColumn((ResultEntityType) value);
			break;
		case DATASETTABLE:
			setDataSetTable((ResultEntityType) value);
			break;
		case DOCUMENTTEMPLATE:
			setDocumentTemplate((ResultEntityType) value);
			break;
		case DOCUMENTTYPE:
			setDocumentType((ResultEntityType) value);
			break;
		case DOCUMENTTYPETRL:
			setDocumentTypeTrl((ResultEntityType) value);
			break;
		case EMAILINTERACTION:
			setEmailInteraction((ResultEntityType) value);
			break;
		case EMAILSERVERCONFIGURATION:
			setEmailServerConfiguration((ResultEntityType) value);
			break;
		case EMAILTEMPLATE:
			setEmailTemplate((ResultEntityType) value);
			break;
		case EMPLOYEEACCOUNTS:
			setEmployeeAccounts((ResultEntityType) value);
			break;
		case EMPLOYEESALARYCATEGORY:
			setEmployeeSalaryCategory((ResultEntityType) value);
			break;
		case EXPENSETYPE:
			setExpenseType((ResultEntityType) value);
			break;
		case EXTERNALPOS:
			setExternalPOS((ResultEntityType) value);
			break;
		case EXTERNALPOSCATEGORY:
			setExternalPOSCategory((ResultEntityType) value);
			break;
		case EXTERNALPOSPRODUCT:
			setExternalPOSProduct((ResultEntityType) value);
			break;
		case FINBANKSTATEMENT:
			setFINBankStatement((ResultEntityType) value);
			break;
		case FINBANKSTATEMENTLINE:
			setFINBankStatementLine((ResultEntityType) value);
			break;
		case FINFINACCTRANSACTION:
			setFINFinaccTransaction((ResultEntityType) value);
			break;
		case FINFINANCIALACCOUNT:
			setFINFinancialAccount((ResultEntityType) value);
			break;
		case FINFINANCIALACCOUNTACCT:
			setFINFinancialAccountAcct((ResultEntityType) value);
			break;
		case FINPAYMENT:
			setFINPayment((ResultEntityType) value);
			break;
		case FINPAYMENTMETHOD:
			setFINPaymentMethod((ResultEntityType) value);
			break;
		case FINPAYMENTCREDIT:
			setFINPaymentCredit((ResultEntityType) value);
			break;
		case FINPAYMENTDETAIL:
			setFINPaymentDetail((ResultEntityType) value);
			break;
		case FINPAYMENTDETAILV:
			setFINPaymentDetailV((ResultEntityType) value);
			break;
		case FINPAYMENTPRIORITY:
			setFINPaymentPriority((ResultEntityType) value);
			break;
		case FINPAYMENTPROPDETAIL:
			setFINPaymentPropDetail((ResultEntityType) value);
			break;
		case FINPAYMENTPROPDETAILV:
			setFINPaymentPropDetailV((ResultEntityType) value);
			break;
		case FINPAYMENTPROPOSAL:
			setFINPaymentProposal((ResultEntityType) value);
			break;
		case FINPAYMENTSCHEDINVV:
			setFINPaymentSchedInvV((ResultEntityType) value);
			break;
		case FINPAYMENTSCHEDORDV:
			setFINPaymentSchedOrdV((ResultEntityType) value);
			break;
		case FINPAYMENTSCHEDULE:
			setFINPaymentSchedule((ResultEntityType) value);
			break;
		case FINPAYMENTSCHEDULEDETAIL:
			setFINPaymentScheduleDetail((ResultEntityType) value);
			break;
		case FINRECONCILIATION:
			setFINReconciliation((ResultEntityType) value);
			break;
		case FINRECONCILIATIONLINETEMP:
			setFINReconciliationLineTemp((ResultEntityType) value);
			break;
		case FINRECONCILIATIONLINEV:
			setFINReconciliationLineV((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCOUNTINGCOMBINATION:
			setFinancialMgmtAccountingCombination((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCOUNTINGFACT:
			setFinancialMgmtAccountingFact((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCOUNTINGREPORT:
			setFinancialMgmtAccountingReport((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCOUNTINGRPTELEMENT:
			setFinancialMgmtAccountingRptElement((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTCFS:
			setFinancialMgmtAcctCFS((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTRPTGROUP:
			setFinancialMgmtAcctRptGroup((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTRPTNODE:
			setFinancialMgmtAcctRptNode((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTSCHEMA:
			setFinancialMgmtAcctSchema((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTSCHEMADEFAULT:
			setFinancialMgmtAcctSchemaDefault((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTSCHEMAELEMENT:
			setFinancialMgmtAcctSchemaElement((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTSCHEMAGL:
			setFinancialMgmtAcctSchemaGL((ResultEntityType) value);
			break;
		case FINANCIALMGMTACCTSCHEMATABLE:
			setFinancialMgmtAcctSchemaTable((ResultEntityType) value);
			break;
		case FINANCIALMGMTAMORTIZATION:
			setFinancialMgmtAmortization((ResultEntityType) value);
			break;
		case FINANCIALMGMTAMORTIZATIONLINE:
			setFinancialMgmtAmortizationLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTASSET:
			setFinancialMgmtAsset((ResultEntityType) value);
			break;
		case FINANCIALMGMTASSETACCOUNTS:
			setFinancialMgmtAssetAccounts((ResultEntityType) value);
			break;
		case FINANCIALMGMTASSETGROUP:
			setFinancialMgmtAssetGroup((ResultEntityType) value);
			break;
		case FINANCIALMGMTASSETGROUPACCT:
			setFinancialMgmtAssetGroupAcct((ResultEntityType) value);
			break;
		case FINANCIALMGMTBANKFILEFORMAT:
			setFinancialMgmtBankFileFormat((ResultEntityType) value);
			break;
		case FINANCIALMGMTBANKSTATEMENT:
			setFinancialMgmtBankStatement((ResultEntityType) value);
			break;
		case FINANCIALMGMTBANKSTATEMENTLINE:
			setFinancialMgmtBankStatementLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTBUDGET:
			setFinancialMgmtBudget((ResultEntityType) value);
			break;
		case FINANCIALMGMTBUDGETLINE:
			setFinancialMgmtBudgetLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTCALENDAR:
			setFinancialMgmtCalendar((ResultEntityType) value);
			break;
		case FINANCIALMGMTCASHBOOK:
			setFinancialMgmtCashBook((ResultEntityType) value);
			break;
		case FINANCIALMGMTCASHBOOKACCOUNTS:
			setFinancialMgmtCashBookAccounts((ResultEntityType) value);
			break;
		case FINANCIALMGMTCASHJOURNAL:
			setFinancialMgmtCashJournal((ResultEntityType) value);
			break;
		case FINANCIALMGMTDPMANAGEMENT:
			setFinancialMgmtDPManagement((ResultEntityType) value);
			break;
		case FINANCIALMGMTDPMANAGEMENTLINE:
			setFinancialMgmtDPManagementLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENT:
			setFinancialMgmtDebtPayment((ResultEntityType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTBALREPLACE:
			setFinancialMgmtDebtPaymentBalReplace((ResultEntityType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTBALANCING:
			setFinancialMgmtDebtPaymentBalancing((ResultEntityType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTCANCELV:
			setFinancialMgmtDebtPaymentCancelV((ResultEntityType) value);
			break;
		case FINANCIALMGMTDEBTPAYMENTGENERATEV:
			setFinancialMgmtDebtPaymentGenerateV((ResultEntityType) value);
			break;
		case FINANCIALMGMTDIMENSION:
			setFinancialMgmtDimension((ResultEntityType) value);
			break;
		case FINANCIALMGMTELEMENT:
			setFinancialMgmtElement((ResultEntityType) value);
			break;
		case FINANCIALMGMTELEMENTVALUE:
			setFinancialMgmtElementValue((ResultEntityType) value);
			break;
		case FINANCIALMGMTELEMENTVALUEOPERAND:
			setFinancialMgmtElementValueOperand((ResultEntityType) value);
			break;
		case FINANCIALMGMTELEMENTVALUETRL:
			setFinancialMgmtElementValueTrl((ResultEntityType) value);
			break;
		case FINANCIALMGMTFINACCPAYMENTMETHOD:
			setFinancialMgmtFinAccPaymentMethod((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLBATCH:
			setFinancialMgmtGLBatch((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLCATEGORY:
			setFinancialMgmtGLCategory((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLCHARGE:
			setFinancialMgmtGLCharge((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLCHARGEACCOUNTS:
			setFinancialMgmtGLChargeAccounts((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLITEM:
			setFinancialMgmtGLItem((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLITEMACCOUNTS:
			setFinancialMgmtGLItemAccounts((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLJOURNAL:
			setFinancialMgmtGLJournal((ResultEntityType) value);
			break;
		case FINANCIALMGMTGLJOURNALLINE:
			setFinancialMgmtGLJournalLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTINCOTERMS:
			setFinancialMgmtIncoterms((ResultEntityType) value);
			break;
		case FINANCIALMGMTJOURNALLINE:
			setFinancialMgmtJournalLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTMATCHINGALGORITHM:
			setFinancialMgmtMatchingAlgorithm((ResultEntityType) value);
			break;
		case FINANCIALMGMTNONBUSINESSDAY:
			setFinancialMgmtNonBusinessDay((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTEXECUTIONHISTORYV:
			setFinancialMgmtPaymentExecutionHistoryV((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTEXECUTIONPROCESS:
			setFinancialMgmtPaymentExecutionProcess((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER:
			setFinancialMgmtPaymentExecutionProcessParameter((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTRUN:
			setFinancialMgmtPaymentRun((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTRUNPARAMETER:
			setFinancialMgmtPaymentRunParameter((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTRUNPAYMENT:
			setFinancialMgmtPaymentRunPayment((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTTERM:
			setFinancialMgmtPaymentTerm((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTTERMLINE:
			setFinancialMgmtPaymentTermLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTPAYMENTTERMTRL:
			setFinancialMgmtPaymentTermTrl((ResultEntityType) value);
			break;
		case FINANCIALMGMTPERIOD:
			setFinancialMgmtPeriod((ResultEntityType) value);
			break;
		case FINANCIALMGMTPERIODCONTROL:
			setFinancialMgmtPeriodControl((ResultEntityType) value);
			break;
		case FINANCIALMGMTPERIODCONTROLV:
			setFinancialMgmtPeriodControlV((ResultEntityType) value);
			break;
		case FINANCIALMGMTPROMISSORYFORMAT:
			setFinancialMgmtPromissoryFormat((ResultEntityType) value);
			break;
		case FINANCIALMGMTREMITTANCE:
			setFinancialMgmtRemittance((ResultEntityType) value);
			break;
		case FINANCIALMGMTREMITTANCELINE:
			setFinancialMgmtRemittanceLine((ResultEntityType) value);
			break;
		case FINANCIALMGMTREMITTANCEPARAMETER:
			setFinancialMgmtRemittanceParameter((ResultEntityType) value);
			break;
		case FINANCIALMGMTREMITTANCETYPE:
			setFinancialMgmtRemittanceType((ResultEntityType) value);
			break;
		case FINANCIALMGMTSETTLEMENT:
			setFinancialMgmtSettlement((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXCATEGORY:
			setFinancialMgmtTaxCategory((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXCATEGORYTRL:
			setFinancialMgmtTaxCategoryTrl((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXPAYMENT:
			setFinancialMgmtTaxPayment((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXRATE:
			setFinancialMgmtTaxRate((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXRATEACCOUNTS:
			setFinancialMgmtTaxRateAccounts((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXREGISTER:
			setFinancialMgmtTaxRegister((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXREGISTERTYPE:
			setFinancialMgmtTaxRegisterType((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXREGISTERTYPELINES:
			setFinancialMgmtTaxRegisterTypeLines((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXREGISTERLINE:
			setFinancialMgmtTaxRegisterline((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXREPORT:
			setFinancialMgmtTaxReport((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXTRL:
			setFinancialMgmtTaxTrl((ResultEntityType) value);
			break;
		case FINANCIALMGMTTAXZONE:
			setFinancialMgmtTaxZone((ResultEntityType) value);
			break;
		case FINANCIALMGMTWITHHOLDING:
			setFinancialMgmtWithholding((ResultEntityType) value);
			break;
		case FINANCIALMGMTWITHHOLDINGACCOUNTS:
			setFinancialMgmtWithholdingAccounts((ResultEntityType) value);
			break;
		case FINANCIALMGMTYEAR:
			setFinancialMgmtYear((ResultEntityType) value);
			break;
		case GREETING:
			setGreeting((ResultEntityType) value);
			break;
		case GREETINGTRL:
			setGreetingTrl((ResultEntityType) value);
			break;
		case INVOICE:
			setInvoice((ResultEntityType) value);
			break;
		case INVOICEDISCOUNT:
			setInvoiceDiscount((ResultEntityType) value);
			break;
		case INVOICELINE:
			setInvoiceLine((ResultEntityType) value);
			break;
		case INVOICELINEACCOUNTINGDIMENSION:
			setInvoiceLineAccountingDimension((ResultEntityType) value);
			break;
		case INVOICELINEOFFER:
			setInvoiceLineOffer((ResultEntityType) value);
			break;
		case INVOICELINETAX:
			setInvoiceLineTax((ResultEntityType) value);
			break;
		case INVOICESCHEDULE:
			setInvoiceSchedule((ResultEntityType) value);
			break;
		case INVOICETAX:
			setInvoiceTax((ResultEntityType) value);
			break;
		case LOCATION:
			setLocation((ResultEntityType) value);
			break;
		case LOCATOR:
			setLocator((ResultEntityType) value);
			break;
		case LOT:
			setLot((ResultEntityType) value);
			break;
		case LOTCONTROL:
			setLotControl((ResultEntityType) value);
			break;
		case MRPPLANNER:
			setMRPPlanner((ResultEntityType) value);
			break;
		case MRPPLANNINGMETHOD:
			setMRPPlanningMethod((ResultEntityType) value);
			break;
		case MRPPLANNINGMETHODLINE:
			setMRPPlanningMethodLine((ResultEntityType) value);
			break;
		case MRPPRODUCTIONRUN:
			setMRPProductionRun((ResultEntityType) value);
			break;
		case MRPPRODUCTIONRUNLINE:
			setMRPProductionRunLine((ResultEntityType) value);
			break;
		case MRPPURCHASINGRUN:
			setMRPPurchasingRun((ResultEntityType) value);
			break;
		case MRPPURCHASINGRUNLINE:
			setMRPPurchasingRunLine((ResultEntityType) value);
			break;
		case MRPSALESFORECAST:
			setMRPSalesForecast((ResultEntityType) value);
			break;
		case MRPSALESFORECASTLINE:
			setMRPSalesForecastLine((ResultEntityType) value);
			break;
		case MANUFACTURINGACTIVITY:
			setManufacturingActivity((ResultEntityType) value);
			break;
		case MANUFACTURINGACTIVITYTOOLSET:
			setManufacturingActivityToolset((ResultEntityType) value);
			break;
		case MANUFACTURINGCASE:
			setManufacturingCase((ResultEntityType) value);
			break;
		case MANUFACTURINGCHECKPOINT:
			setManufacturingCheckPoint((ResultEntityType) value);
			break;
		case MANUFACTURINGCHECKPOINTSET:
			setManufacturingCheckPointSet((ResultEntityType) value);
			break;
		case MANUFACTURINGCHECKPOINTSHIFT:
			setManufacturingCheckPointShift((ResultEntityType) value);
			break;
		case MANUFACTURINGCOSTCENTER:
			setManufacturingCostCenter((ResultEntityType) value);
			break;
		case MANUFACTURINGCOSTCENTERMACHINE:
			setManufacturingCostCenterMachine((ResultEntityType) value);
			break;
		case MANUFACTURINGCOSTCENTEREMPLOYEE:
			setManufacturingCostcenterEmployee((ResultEntityType) value);
			break;
		case MANUFACTURINGCOSTCENTERIC:
			setManufacturingCostcenterIC((ResultEntityType) value);
			break;
		case MANUFACTURINGCOSTCENTERVERSION:
			setManufacturingCostcenterVersion((ResultEntityType) value);
			break;
		case MANUFACTURINGGLOBALUSE:
			setManufacturingGlobalUse((ResultEntityType) value);
			break;
		case MANUFACTURINGINCIDENCE:
			setManufacturingIncidence((ResultEntityType) value);
			break;
		case MANUFACTURINGINDIRECTCOST:
			setManufacturingIndirectCost((ResultEntityType) value);
			break;
		case MANUFACTURINGINDIRECTCOSTVALUE:
			setManufacturingIndirectCostValue((ResultEntityType) value);
			break;
		case MANUFACTURINGMACHINE:
			setManufacturingMachine((ResultEntityType) value);
			break;
		case MANUFACTURINGMACHINECOST:
			setManufacturingMachineCost((ResultEntityType) value);
			break;
		case MANUFACTURINGMACHINESTATION:
			setManufacturingMachineStation((ResultEntityType) value);
			break;
		case MANUFACTURINGMACHINETYPE:
			setManufacturingMachineType((ResultEntityType) value);
			break;
		case MANUFACTURINGMAINTEANCEORDER:
			setManufacturingMainteanceOrder((ResultEntityType) value);
			break;
		case MANUFACTURINGMAINTENANCE:
			setManufacturingMaintenance((ResultEntityType) value);
			break;
		case MANUFACTURINGMAINTENANCEPERIODICITY:
			setManufacturingMaintenancePeriodicity((ResultEntityType) value);
			break;
		case MANUFACTURINGMAINTENANCESCHEDULE:
			setManufacturingMaintenanceSchedule((ResultEntityType) value);
			break;
		case MANUFACTURINGMAINTENANCETASK:
			setManufacturingMaintenanceTask((ResultEntityType) value);
			break;
		case MANUFACTURINGMAINTENANCEWORKER:
			setManufacturingMaintenanceWorker((ResultEntityType) value);
			break;
		case MANUFACTURINGMEASUREGROUP:
			setManufacturingMeasureGroup((ResultEntityType) value);
			break;
		case MANUFACTURINGMEASURESHIFT:
			setManufacturingMeasureShift((ResultEntityType) value);
			break;
		case MANUFACTURINGMEASURETIME:
			setManufacturingMeasureTime((ResultEntityType) value);
			break;
		case MANUFACTURINGMEASUREVALUES:
			setManufacturingMeasureValues((ResultEntityType) value);
			break;
		case MANUFACTURINGOPERATION:
			setManufacturingOperation((ResultEntityType) value);
			break;
		case MANUFACTURINGOPERATIONEMPLOYEE:
			setManufacturingOperationEmployee((ResultEntityType) value);
			break;
		case MANUFACTURINGOPERATIONINDIRECTCOST:
			setManufacturingOperationIndirectCost((ResultEntityType) value);
			break;
		case MANUFACTURINGOPERATIONMACHINE:
			setManufacturingOperationMachine((ResultEntityType) value);
			break;
		case MANUFACTURINGOPERATIONPRODUCT:
			setManufacturingOperationProduct((ResultEntityType) value);
			break;
		case MANUFACTURINGPERIODICCONTROL:
			setManufacturingPeriodicControl((ResultEntityType) value);
			break;
		case MANUFACTURINGPROCESSPLAN:
			setManufacturingProcessPlan((ResultEntityType) value);
			break;
		case MANUFACTURINGPRODUCTIONLINE:
			setManufacturingProductionLine((ResultEntityType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNEMPLOYEE:
			setManufacturingProductionRunEmployee((ResultEntityType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS:
			setManufacturingProductionRunIndirectCosts((ResultEntityType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNINVOICELINE:
			setManufacturingProductionRunInvoiceLine((ResultEntityType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNMACHINE:
			setManufacturingProductionRunMachine((ResultEntityType) value);
			break;
		case MANUFACTURINGPRODUCTIONRUNTOOLSET:
			setManufacturingProductionRunToolset((ResultEntityType) value);
			break;
		case MANUFACTURINGSECTION:
			setManufacturingSection((ResultEntityType) value);
			break;
		case MANUFACTURINGTEST:
			setManufacturingTest((ResultEntityType) value);
			break;
		case MANUFACTURINGTOOLSET:
			setManufacturingToolset((ResultEntityType) value);
			break;
		case MANUFACTURINGTOOLSETTYPE:
			setManufacturingToolsetType((ResultEntityType) value);
			break;
		case MANUFACTURINGVALUE:
			setManufacturingValue((ResultEntityType) value);
			break;
		case MANUFACTURINGVERSION:
			setManufacturingVersion((ResultEntityType) value);
			break;
		case MANUFACTURINGWORKCENTER:
			setManufacturingWorkCenter((ResultEntityType) value);
			break;
		case MANUFACTURINGWORKEFFORTEMPLOYEE:
			setManufacturingWorkEffortEmployee((ResultEntityType) value);
			break;
		case MANUFACTURINGWORKEFFORTINCIDENCE:
			setManufacturingWorkEffortIncidence((ResultEntityType) value);
			break;
		case MANUFACTURINGWORKREQUIREMENT:
			setManufacturingWorkRequirement((ResultEntityType) value);
			break;
		case MANUFACTURINGWORKREQUIREMENTOPERATION:
			setManufacturingWorkRequirementOperation((ResultEntityType) value);
			break;
		case MANUFACTURINGWORKREQUIREMENTPRODUCT:
			setManufacturingWorkRequirementProduct((ResultEntityType) value);
			break;
		case MARKETINGCAMPAIGN:
			setMarketingCampaign((ResultEntityType) value);
			break;
		case MARKETINGCHANNEL:
			setMarketingChannel((ResultEntityType) value);
			break;
		case MATERIALMGMTABCACTIVITY:
			setMaterialMgmtABCActivity((ResultEntityType) value);
			break;
		case MATERIALMGMTCOSTING:
			setMaterialMgmtCosting((ResultEntityType) value);
			break;
		case MATERIALMGMTINTERNALCONSUMPTION:
			setMaterialMgmtInternalConsumption((ResultEntityType) value);
			break;
		case MATERIALMGMTINTERNALCONSUMPTIONLINE:
			setMaterialMgmtInternalConsumptionLine((ResultEntityType) value);
			break;
		case MATERIALMGMTINTERNALMOVEMENT:
			setMaterialMgmtInternalMovement((ResultEntityType) value);
			break;
		case MATERIALMGMTINTERNALMOVEMENTLINE:
			setMaterialMgmtInternalMovementLine((ResultEntityType) value);
			break;
		case MATERIALMGMTINVENTORYCOUNT:
			setMaterialMgmtInventoryCount((ResultEntityType) value);
			break;
		case MATERIALMGMTINVENTORYCOUNTLINE:
			setMaterialMgmtInventoryCountLine((ResultEntityType) value);
			break;
		case MATERIALMGMTMATERIALTRANSACTION:
			setMaterialMgmtMaterialTransaction((ResultEntityType) value);
			break;
		case MATERIALMGMTPRODUCTIONPLAN:
			setMaterialMgmtProductionPlan((ResultEntityType) value);
			break;
		case MATERIALMGMTPRODUCTIONTRANSACTION:
			setMaterialMgmtProductionTransaction((ResultEntityType) value);
			break;
		case MATERIALMGMTSHIPMENTINOUT:
			setMaterialMgmtShipmentInOut((ResultEntityType) value);
			break;
		case MATERIALMGMTSHIPMENTINOUTLINE:
			setMaterialMgmtShipmentInOutLine((ResultEntityType) value);
			break;
		case MATERIALMGMTSTORAGEDETAIL:
			setMaterialMgmtStorageDetail((ResultEntityType) value);
			break;
		case MATERIALMGMTSTORAGEPENDING:
			setMaterialMgmtStoragePending((ResultEntityType) value);
			break;
		case MODELIMPLEMENTATIONPARAMETER:
			setModelImplementationParameter((ResultEntityType) value);
			break;
		case MODULEDBPREFIX:
			setModuleDBPrefix((ResultEntityType) value);
			break;
		case MODULEDEPENDENCY:
			setModuleDependency((ResultEntityType) value);
			break;
		case MODULELOG:
			setModuleLog((ResultEntityType) value);
			break;
		case MODULETRL:
			setModuleTrl((ResultEntityType) value);
			break;
		case NAMINGEXCEPTION:
			setNamingException((ResultEntityType) value);
			break;
		case OBCLKERTEMPLATE:
			setOBCLKERTemplate((ResultEntityType) value);
			break;
		case OBCLKERTEMPLATEDEPENDENCY:
			setOBCLKERTemplateDependency((ResultEntityType) value);
			break;
		case OBCLKERUIDEFINITION:
			setOBCLKERUIDefinition((ResultEntityType) value);
			break;
		case OBCQLQUERYCOLUMN:
			setOBCQLQueryColumn((ResultEntityType) value);
			break;
		case OBCQLQUERYCOLUMNTRL:
			setOBCQLQueryColumnTrl((ResultEntityType) value);
			break;
		case OBCQLWIDGETQUERY:
			setOBCQLWidgetQuery((ResultEntityType) value);
			break;
		case OBKMOWIDGETCLASS:
			setOBKMOWidgetClass((ResultEntityType) value);
			break;
		case OBKMOWIDGETCLASSACCESS:
			setOBKMOWidgetClassAccess((ResultEntityType) value);
			break;
		case OBKMOWIDGETCLASSMENU:
			setOBKMOWidgetClassMenu((ResultEntityType) value);
			break;
		case OBKMOWIDGETCLASSMENUTRL:
			setOBKMOWidgetClassMenuTrl((ResultEntityType) value);
			break;
		case OBKMOWIDGETCLASSTRL:
			setOBKMOWidgetClassTrl((ResultEntityType) value);
			break;
		case OBKMOWIDGETINSTANCE:
			setOBKMOWidgetInstance((ResultEntityType) value);
			break;
		case OBKMOWIDGETLIST:
			setOBKMOWidgetList((ResultEntityType) value);
			break;
		case OBKMOWIDGETREFERENCE:
			setOBKMOWidgetReference((ResultEntityType) value);
			break;
		case OBKMOWIDGETURL:
			setOBKMOWidgetURL((ResultEntityType) value);
			break;
		case OBSEIGDEFAULTS:
			setOBSEIGDefaults((ResultEntityType) value);
			break;
		case OBSERDSDATASOURCE:
			setOBSERDSDatasource((ResultEntityType) value);
			break;
		case OBSERDSDATASOURCEFIELD:
			setOBSERDSDatasourceField((ResultEntityType) value);
			break;
		case OBSOIDUSERIDENTIFIER:
			setOBSOIDUserIdentifier((ResultEntityType) value);
			break;
		case OBUIAPPMENUPARAMETERS:
			setOBUIAPPMenuParameters((ResultEntityType) value);
			break;
		case OBUIAPPNAVBARROLEACCESS:
			setOBUIAPPNavbarRoleaccess((ResultEntityType) value);
			break;
		case OBUIAPPNAVIGATIONBARCOMPONENT:
			setOBUIAPPNavigationBarComponent((ResultEntityType) value);
			break;
		case OBUIAPPNOTE:
			setOBUIAPPNote((ResultEntityType) value);
			break;
		case OBUIAPPPARAMETER:
			setOBUIAPPParameter((ResultEntityType) value);
			break;
		case OBUIAPPPARAMETERTRL:
			setOBUIAPPParameterTrl((ResultEntityType) value);
			break;
		case OBUIAPPPARAMETERVALUE:
			setOBUIAPPParameterValue((ResultEntityType) value);
			break;
		case OBUIAPPPROCESS:
			setOBUIAPPProcess((ResultEntityType) value);
			break;
		case OBUIAPPPROCESSACCESS:
			setOBUIAPPProcessAccess((ResultEntityType) value);
			break;
		case OBUIAPPREFWINDOW:
			setOBUIAPPRefWindow((ResultEntityType) value);
			break;
		case OBUIAPPUIPERSONALIZATION:
			setOBUIAPPUIPersonalization((ResultEntityType) value);
			break;
		case OBUIAPPVIEWIMPLEMENTATION:
			setOBUIAPPViewImplementation((ResultEntityType) value);
			break;
		case OBUISELSELECTOR:
			setOBUISELSelector((ResultEntityType) value);
			break;
		case OBUISELSELECTORFIELD:
			setOBUISELSelectorField((ResultEntityType) value);
			break;
		case OBUISELSELECTORFIELDTRL:
			setOBUISELSelectorFieldTrl((ResultEntityType) value);
			break;
		case OBUISELSELECTORTRL:
			setOBUISELSelectorTrl((ResultEntityType) value);
			break;
		case ORDER:
			setOrder((ResultEntityType) value);
			break;
		case ORDERDISCOUNT:
			setOrderDiscount((ResultEntityType) value);
			break;
		case ORDERLINE:
			setOrderLine((ResultEntityType) value);
			break;
		case ORDERLINEOFFER:
			setOrderLineOffer((ResultEntityType) value);
			break;
		case ORDERLINETAX:
			setOrderLineTax((ResultEntityType) value);
			break;
		case ORDERTAX:
			setOrderTax((ResultEntityType) value);
			break;
		case ORGANIZATION:
			setOrganization((ResultEntityType) value);
			break;
		case ORGANIZATIONACCTSCHEMA:
			setOrganizationAcctSchema((ResultEntityType) value);
			break;
		case ORGANIZATIONCLOSING:
			setOrganizationClosing((ResultEntityType) value);
			break;
		case ORGANIZATIONINFORMATION:
			setOrganizationInformation((ResultEntityType) value);
			break;
		case ORGANIZATIONMODULEV:
			setOrganizationModuleV((ResultEntityType) value);
			break;
		case ORGANIZATIONTYPE:
			setOrganizationType((ResultEntityType) value);
			break;
		case PERIODCONTROLLOG:
			setPeriodControlLog((ResultEntityType) value);
			break;
		case PRICINGADJUSTMENT:
			setPricingAdjustment((ResultEntityType) value);
			break;
		case PRICINGADJUSTMENTBUSINESSPARTNER:
			setPricingAdjustmentBusinessPartner((ResultEntityType) value);
			break;
		case PRICINGADJUSTMENTBUSINESSPARTNERGROUP:
			setPricingAdjustmentBusinessPartnerGroup((ResultEntityType) value);
			break;
		case PRICINGADJUSTMENTPRICELIST:
			setPricingAdjustmentPriceList((ResultEntityType) value);
			break;
		case PRICINGADJUSTMENTPRODUCT:
			setPricingAdjustmentProduct((ResultEntityType) value);
			break;
		case PRICINGADJUSTMENTPRODUCTCATEGORY:
			setPricingAdjustmentProductCategory((ResultEntityType) value);
			break;
		case PRICINGDISCOUNT:
			setPricingDiscount((ResultEntityType) value);
			break;
		case PRICINGPRICELIST:
			setPricingPriceList((ResultEntityType) value);
			break;
		case PRICINGPRICELISTSCHEMA:
			setPricingPriceListSchema((ResultEntityType) value);
			break;
		case PRICINGPRICELISTSCHEMELINE:
			setPricingPriceListSchemeLine((ResultEntityType) value);
			break;
		case PRICINGPRICELISTVERSION:
			setPricingPriceListVersion((ResultEntityType) value);
			break;
		case PRICINGPRODUCTPRICE:
			setPricingProductPrice((ResultEntityType) value);
			break;
		case PRICINGVOLUMEDISCOUNT:
			setPricingVolumeDiscount((ResultEntityType) value);
			break;
		case PRICINGVOLUMEDISCOUNTBUSINESSPARTNER:
			setPricingVolumeDiscountBusinessPartner((ResultEntityType) value);
			break;
		case PRICINGVOLUMEDISCOUNTINVOICE:
			setPricingVolumeDiscountInvoice((ResultEntityType) value);
			break;
		case PRICINGVOLUMEDISCOUNTPRODUCT:
			setPricingVolumeDiscountProduct((ResultEntityType) value);
			break;
		case PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY:
			setPricingVolumeDiscountProductCategory((ResultEntityType) value);
			break;
		case PRICINGVOLUMEDISCOUNTSCALE:
			setPricingVolumeDiscountScale((ResultEntityType) value);
			break;
		case PROCESSEXECUTION:
			setProcessExecution((ResultEntityType) value);
			break;
		case PROCESSREQUEST:
			setProcessRequest((ResultEntityType) value);
			break;
		case PROCESSRUN:
			setProcessRun((ResultEntityType) value);
			break;
		case PROCUREMENTPOINVOICEMATCH:
			setProcurementPOInvoiceMatch((ResultEntityType) value);
			break;
		case PROCUREMENTRECEIPTINVOICEMATCH:
			setProcurementReceiptInvoiceMatch((ResultEntityType) value);
			break;
		case PROCUREMENTREQUISITION:
			setProcurementRequisition((ResultEntityType) value);
			break;
		case PROCUREMENTREQUISITIONLINE:
			setProcurementRequisitionLine((ResultEntityType) value);
			break;
		case PROCUREMENTREQUISITIONPOMATCH:
			setProcurementRequisitionPOMatch((ResultEntityType) value);
			break;
		case PRODUCT:
			setProduct((ResultEntityType) value);
			break;
		case PRODUCTACCOUNTS:
			setProductAccounts((ResultEntityType) value);
			break;
		case PRODUCTBOM:
			setProductBOM((ResultEntityType) value);
			break;
		case PRODUCTBYPRICEANDWAREHOUSE:
			setProductByPriceAndWarehouse((ResultEntityType) value);
			break;
		case PRODUCTCATEGORY:
			setProductCategory((ResultEntityType) value);
			break;
		case PRODUCTCATEGORYACCOUNTS:
			setProductCategoryAccounts((ResultEntityType) value);
			break;
		case PRODUCTCUSTOMER:
			setProductCustomer((ResultEntityType) value);
			break;
		case PRODUCTORG:
			setProductOrg((ResultEntityType) value);
			break;
		case PRODUCTSTOCKVIEW:
			setProductStockView((ResultEntityType) value);
			break;
		case PRODUCTSUBSTITUTE:
			setProductSubstitute((ResultEntityType) value);
			break;
		case PRODUCTTRL:
			setProductTrl((ResultEntityType) value);
			break;
		case PRODUCTUOM:
			setProductUOM((ResultEntityType) value);
			break;
		case PROJECT:
			setProject((ResultEntityType) value);
			break;
		case PROJECTACCOUNTS:
			setProjectAccounts((ResultEntityType) value);
			break;
		case PROJECTISSUE:
			setProjectIssue((ResultEntityType) value);
			break;
		case PROJECTLINE:
			setProjectLine((ResultEntityType) value);
			break;
		case PROJECTPHASE:
			setProjectPhase((ResultEntityType) value);
			break;
		case PROJECTPROJECTPROPOSALTASK:
			setProjectProjectProposalTask((ResultEntityType) value);
			break;
		case PROJECTPROPOSAL:
			setProjectProposal((ResultEntityType) value);
			break;
		case PROJECTPROPOSALLINE:
			setProjectProposalLine((ResultEntityType) value);
			break;
		case PROJECTSTANDARDPHASE:
			setProjectStandardPhase((ResultEntityType) value);
			break;
		case PROJECTSTANDARDTASK:
			setProjectStandardTask((ResultEntityType) value);
			break;
		case PROJECTTASK:
			setProjectTask((ResultEntityType) value);
			break;
		case PROJECTTYPE:
			setProjectType((ResultEntityType) value);
			break;
		case PROJECTVENDOR:
			setProjectVendor((ResultEntityType) value);
			break;
		case REFERENCEDATASTORE:
			setReferenceDataStore((ResultEntityType) value);
			break;
		case REGION:
			setRegion((ResultEntityType) value);
			break;
		case RESOURCE:
			setResource((ResultEntityType) value);
			break;
		case RESOURCEASSIGNMENT:
			setResourceAssignment((ResultEntityType) value);
			break;
		case RESOURCETYPE:
			setResourceType((ResultEntityType) value);
			break;
		case RESOURCEUNAVAILABLE:
			setResourceUnAvailable((ResultEntityType) value);
			break;
		case RETURNMATERIALORDERPICKEDITLINES:
			setReturnMaterialOrderPickEditLines((ResultEntityType) value);
			break;
		case RETURNMATERIALRECEIPTPICKEDIT:
			setReturnMaterialReceiptPickEdit((ResultEntityType) value);
			break;
		case RETURNMATERIALSHIPMENTPICKEDIT:
			setReturnMaterialShipmentPickEdit((ResultEntityType) value);
			break;
		case RETURNREASON:
			setReturnReason((ResultEntityType) value);
			break;
		case REVERSEDINVOICES:
			setReversedInvoices((ResultEntityType) value);
			break;
		case SQLSCRIPT:
			setSQLScript((ResultEntityType) value);
			break;
		case SALARYCATEGORY:
			setSalaryCategory((ResultEntityType) value);
			break;
		case SALARYCATEGORYCOST:
			setSalaryCategoryCost((ResultEntityType) value);
			break;
		case SALESCOMMISSION:
			setSalesCommission((ResultEntityType) value);
			break;
		case SALESCOMMISSIONAMOUNT:
			setSalesCommissionAmount((ResultEntityType) value);
			break;
		case SALESCOMMISSIONDETAIL:
			setSalesCommissionDetail((ResultEntityType) value);
			break;
		case SALESCOMMISSIONLINE:
			setSalesCommissionLine((ResultEntityType) value);
			break;
		case SALESCOMMISSIONRUN:
			setSalesCommissionRun((ResultEntityType) value);
			break;
		case SALESREGION:
			setSalesRegion((ResultEntityType) value);
			break;
		case SERIALNUMBERCONTROL:
			setSerialNumberControl((ResultEntityType) value);
			break;
		case SHIPPINGFREIGHTCATEGORY:
			setShippingFreightCategory((ResultEntityType) value);
			break;
		case SHIPPINGSHIPPINGCOMPANY:
			setShippingShippingCompany((ResultEntityType) value);
			break;
		case SHIPPINGSHIPPINGCOMPANYFREIGHT:
			setShippingShippingCompanyFreight((ResultEntityType) value);
			break;
		case TIMEANDEXPENSESHEET:
			setTimeAndExpenseSheet((ResultEntityType) value);
			break;
		case TIMEANDEXPENSESHEETLINE:
			setTimeAndExpenseSheetLine((ResultEntityType) value);
			break;
		case TIMEANDEXPENSESHEETLINEV:
			setTimeAndExpenseSheetLineV((ResultEntityType) value);
			break;
		case TIMETYPE:
			setTimeType((ResultEntityType) value);
			break;
		case UOM:
			setUOM((ResultEntityType) value);
			break;
		case UOMCONVERSION:
			setUOMConversion((ResultEntityType) value);
			break;
		case UOMTRL:
			setUOMTrl((ResultEntityType) value);
			break;
		case VENDORACCOUNTS:
			setVendorAccounts((ResultEntityType) value);
			break;
		case WAREHOUSE:
			setWarehouse((ResultEntityType) value);
			break;
		case WAREHOUSEACCOUNTS:
			setWarehouseAccounts((ResultEntityType) value);
			break;
		case WAREHOUSESHIPPER:
			setWarehouseShipper((ResultEntityType) value);
			break;
		case OBUIAPPVIEWROLEACCESS:
			setObuiappViewRoleAccess((ResultEntityType) value);
			break;
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
