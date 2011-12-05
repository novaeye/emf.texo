package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OpenbravoType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OpenbravoType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OpenbravoTypeGroupFeatureGroup> group = new ArrayList<OpenbravoTypeGroupFeatureGroup>();

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String created = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String obRevision = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String obVersion = null;

	/**
	 * Returns the value of '<em><b>group</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>group</b></em>' feature
	 * @generated
	 */
	public List<OpenbravoTypeGroupFeatureGroup> getGroup() {
		return group;
	}

	/**
	 * Sets the '{@link OpenbravoType#getGroup() <em>group</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getGroup() group}' feature.
	 * @generated
	 */
	public void setGroup(List<OpenbravoTypeGroupFeatureGroup> newGroup) {
		group = newGroup;
	}

	/**
	 * Returns the value of '<em><b>aDAcctProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAcctProcess</b></em>' feature
	 * @generated
	 */
	public List<ADAcctProcessType> getADAcctProcess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADACCTPROCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAcctProcess() <em>aDAcctProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAcctProcess() aDAcctProcess}' feature.
	 * @generated
	 */
	public void setADAcctProcess(List<ADAcctProcessType> newADAcctProcess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADACCTPROCESS,
				newADAcctProcess));
	}

	/**
	 * Returns the value of '<em><b>aDAlert</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlert</b></em>' feature
	 * @generated
	 */
	public List<ADAlertType> getADAlert() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADALERT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlert() <em>aDAlert</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlert() aDAlert}' feature.
	 * @generated
	 */
	public void setADAlert(List<ADAlertType> newADAlert) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADALERT, newADAlert));
	}

	/**
	 * Returns the value of '<em><b>aDAlertRecipient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRecipient</b></em>' feature
	 * @generated
	 */
	public List<ADAlertRecipientType> getADAlertRecipient() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADALERTRECIPIENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlertRecipient() <em>aDAlertRecipient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlertRecipient() aDAlertRecipient}' feature.
	 * @generated
	 */
	public void setADAlertRecipient(
			List<ADAlertRecipientType> newADAlertRecipient) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADALERTRECIPIENT,
				newADAlertRecipient));
	}

	/**
	 * Returns the value of '<em><b>aDAlertRule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRule</b></em>' feature
	 * @generated
	 */
	public List<ADAlertRuleType> getADAlertRule() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADALERTRULE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlertRule() <em>aDAlertRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlertRule() aDAlertRule}' feature.
	 * @generated
	 */
	public void setADAlertRule(List<ADAlertRuleType> newADAlertRule) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADALERTRULE,
				newADAlertRule));
	}

	/**
	 * Returns the value of '<em><b>aDAlertRuleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRuleTrl</b></em>' feature
	 * @generated
	 */
	public List<ADAlertRuleTrlType> getADAlertRuleTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADALERTRULETRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAlertRuleTrl() <em>aDAlertRuleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAlertRuleTrl() aDAlertRuleTrl}' feature.
	 * @generated
	 */
	public void setADAlertRuleTrl(List<ADAlertRuleTrlType> newADAlertRuleTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADALERTRULETRL,
				newADAlertRuleTrl));
	}

	/**
	 * Returns the value of '<em><b>aDAttachment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAttachment</b></em>' feature
	 * @generated
	 */
	public List<ADAttachmentType> getADAttachment() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADATTACHMENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAttachment() <em>aDAttachment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAttachment() aDAttachment}' feature.
	 * @generated
	 */
	public void setADAttachment(List<ADAttachmentType> newADAttachment) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADATTACHMENT,
				newADAttachment));
	}

	/**
	 * Returns the value of '<em><b>aDAuxiliaryInput</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAuxiliaryInput</b></em>' feature
	 * @generated
	 */
	public List<ADAuxiliaryInputType> getADAuxiliaryInput() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADAUXILIARYINPUT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAuxiliaryInput() <em>aDAuxiliaryInput</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAuxiliaryInput() aDAuxiliaryInput}' feature.
	 * @generated
	 */
	public void setADAuxiliaryInput(
			List<ADAuxiliaryInputType> newADAuxiliaryInput) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADAUXILIARYINPUT,
				newADAuxiliaryInput));
	}

	/**
	 * Returns the value of '<em><b>aDCallout</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDCallout</b></em>' feature
	 * @generated
	 */
	public List<ADCalloutType> getADCallout() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADCALLOUT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADCallout() <em>aDCallout</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADCallout() aDCallout}' feature.
	 * @generated
	 */
	public void setADCallout(List<ADCalloutType> newADCallout) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADCALLOUT, newADCallout));
	}

	/**
	 * Returns the value of '<em><b>aDClient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClient</b></em>' feature
	 * @generated
	 */
	public List<ADClientType> getADClient() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADCLIENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADClient() <em>aDClient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADClient() aDClient}' feature.
	 * @generated
	 */
	public void setADClient(List<ADClientType> newADClient) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADCLIENT, newADClient));
	}

	/**
	 * Returns the value of '<em><b>aDClientModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClientModule</b></em>' feature
	 * @generated
	 */
	public List<ADClientModuleType> getADClientModule() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADCLIENTMODULE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADClientModule() <em>aDClientModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADClientModule() aDClientModule}' feature.
	 * @generated
	 */
	public void setADClientModule(List<ADClientModuleType> newADClientModule) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADCLIENTMODULE,
				newADClientModule));
	}

	/**
	 * Returns the value of '<em><b>aDColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumn</b></em>' feature
	 * @generated
	 */
	public List<ADColumnType> getADColumn() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADCOLUMN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADColumn() <em>aDColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADColumn() aDColumn}' feature.
	 * @generated
	 */
	public void setADColumn(List<ADColumnType> newADColumn) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADCOLUMN, newADColumn));
	}

	/**
	 * Returns the value of '<em><b>aDEPInstancePara</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDEPInstancePara</b></em>' feature
	 * @generated
	 */
	public List<ADEPInstanceParaType> getADEPInstancePara() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADEPINSTANCEPARA);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADEPInstancePara() <em>aDEPInstancePara</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADEPInstancePara() aDEPInstancePara}' feature.
	 * @generated
	 */
	public void setADEPInstancePara(
			List<ADEPInstanceParaType> newADEPInstancePara) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADEPINSTANCEPARA,
				newADEPInstancePara));
	}

	/**
	 * Returns the value of '<em><b>aDEPProcedures</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDEPProcedures</b></em>' feature
	 * @generated
	 */
	public List<ADEPProceduresType> getADEPProcedures() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADEPPROCEDURES);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADEPProcedures() <em>aDEPProcedures</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADEPProcedures() aDEPProcedures}' feature.
	 * @generated
	 */
	public void setADEPProcedures(List<ADEPProceduresType> newADEPProcedures) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADEPPROCEDURES,
				newADEPProcedures));
	}

	/**
	 * Returns the value of '<em><b>aDElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDElement</b></em>' feature
	 * @generated
	 */
	public List<ADElementType> getADElement() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADELEMENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADElement() <em>aDElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADElement() aDElement}' feature.
	 * @generated
	 */
	public void setADElement(List<ADElementType> newADElement) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADELEMENT, newADElement));
	}

	/**
	 * Returns the value of '<em><b>aDElementTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDElementTrl</b></em>' feature
	 * @generated
	 */
	public List<ADElementTrlType> getADElementTrl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADELEMENTTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADElementTrl() <em>aDElementTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADElementTrl() aDElementTrl}' feature.
	 * @generated
	 */
	public void setADElementTrl(List<ADElementTrlType> newADElementTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADELEMENTTRL,
				newADElementTrl));
	}

	/**
	 * Returns the value of '<em><b>aDErrorLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDErrorLog</b></em>' feature
	 * @generated
	 */
	public List<ADErrorLogType> getADErrorLog() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADERRORLOG);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADErrorLog() <em>aDErrorLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADErrorLog() aDErrorLog}' feature.
	 * @generated
	 */
	public void setADErrorLog(List<ADErrorLogType> newADErrorLog) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADERRORLOG,
				newADErrorLog));
	}

	/**
	 * Returns the value of '<em><b>aDExtensionPoints</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDExtensionPoints</b></em>' feature
	 * @generated
	 */
	public List<ADExtensionPointsType> getADExtensionPoints() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADEXTENSIONPOINTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADExtensionPoints() <em>aDExtensionPoints</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADExtensionPoints() aDExtensionPoints}' feature.
	 * @generated
	 */
	public void setADExtensionPoints(
			List<ADExtensionPointsType> newADExtensionPoints) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADEXTENSIONPOINTS,
				newADExtensionPoints));
	}

	/**
	 * Returns the value of '<em><b>aDField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDField</b></em>' feature
	 * @generated
	 */
	public List<ADFieldType> getADField() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADFIELD);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADField() <em>aDField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADField() aDField}' feature.
	 * @generated
	 */
	public void setADField(List<ADFieldType> newADField) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFIELD, newADField));
	}

	/**
	 * Returns the value of '<em><b>aDFieldGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldGroup</b></em>' feature
	 * @generated
	 */
	public List<ADFieldGroupType> getADFieldGroup() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADFIELDGROUP);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFieldGroup() <em>aDFieldGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFieldGroup() aDFieldGroup}' feature.
	 * @generated
	 */
	public void setADFieldGroup(List<ADFieldGroupType> newADFieldGroup) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFIELDGROUP,
				newADFieldGroup));
	}

	/**
	 * Returns the value of '<em><b>aDFieldGroupTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldGroupTrl</b></em>' feature
	 * @generated
	 */
	public List<ADFieldGroupTrlType> getADFieldGroupTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADFIELDGROUPTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFieldGroupTrl() <em>aDFieldGroupTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFieldGroupTrl() aDFieldGroupTrl}' feature.
	 * @generated
	 */
	public void setADFieldGroupTrl(List<ADFieldGroupTrlType> newADFieldGroupTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFIELDGROUPTRL,
				newADFieldGroupTrl));
	}

	/**
	 * Returns the value of '<em><b>aDFieldTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldTrl</b></em>' feature
	 * @generated
	 */
	public List<ADFieldTrlType> getADFieldTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADFIELDTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFieldTrl() <em>aDFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFieldTrl() aDFieldTrl}' feature.
	 * @generated
	 */
	public void setADFieldTrl(List<ADFieldTrlType> newADFieldTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFIELDTRL,
				newADFieldTrl));
	}

	/**
	 * Returns the value of '<em><b>aDFileType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFileType</b></em>' feature
	 * @generated
	 */
	public List<ADFileTypeType> getADFileType() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADFILETYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFileType() <em>aDFileType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFileType() aDFileType}' feature.
	 * @generated
	 */
	public void setADFileType(List<ADFileTypeType> newADFileType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFILETYPE,
				newADFileType));
	}

	/**
	 * Returns the value of '<em><b>aDForm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDForm</b></em>' feature
	 * @generated
	 */
	public List<ADFormType> getADForm() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADFORM);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADForm() <em>aDForm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADForm() aDForm}' feature.
	 * @generated
	 */
	public void setADForm(List<ADFormType> newADForm) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFORM, newADForm));
	}

	/**
	 * Returns the value of '<em><b>aDFormAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormAccess</b></em>' feature
	 * @generated
	 */
	public List<ADFormAccessType> getADFormAccess() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADFORMACCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFormAccess() <em>aDFormAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFormAccess() aDFormAccess}' feature.
	 * @generated
	 */
	public void setADFormAccess(List<ADFormAccessType> newADFormAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFORMACCESS,
				newADFormAccess));
	}

	/**
	 * Returns the value of '<em><b>aDFormTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormTrl</b></em>' feature
	 * @generated
	 */
	public List<ADFormTrlType> getADFormTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADFORMTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADFormTrl() <em>aDFormTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADFormTrl() aDFormTrl}' feature.
	 * @generated
	 */
	public void setADFormTrl(List<ADFormTrlType> newADFormTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADFORMTRL, newADFormTrl));
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLog</b></em>' feature
	 * @generated
	 */
	public List<ADHeartbeatLogType> getADHeartbeatLog() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADHEARTBEATLOG);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADHeartbeatLog() <em>aDHeartbeatLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADHeartbeatLog() aDHeartbeatLog}' feature.
	 * @generated
	 */
	public void setADHeartbeatLog(List<ADHeartbeatLogType> newADHeartbeatLog) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADHEARTBEATLOG,
				newADHeartbeatLog));
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQuery</b></em>' feature
	 * @generated
	 */
	public List<ADHeartbeatLogCustomQueryType> getADHeartbeatLogCustomQuery() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERY);
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
			List<ADHeartbeatLogCustomQueryType> newADHeartbeatLogCustomQuery) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERY,
						newADHeartbeatLogCustomQuery));
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQueryRow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQueryRow</b></em>' feature
	 * @generated
	 */
	public List<ADHeartbeatLogCustomQueryRowType> getADHeartbeatLogCustomQueryRow() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERYROW);
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
			List<ADHeartbeatLogCustomQueryRowType> newADHeartbeatLogCustomQueryRow) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERYROW,
						newADHeartbeatLogCustomQueryRow));
	}

	/**
	 * Returns the value of '<em><b>aDImage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDImage</b></em>' feature
	 * @generated
	 */
	public List<ADImageType> getADImage() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADIMAGE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADImage() <em>aDImage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADImage() aDImage}' feature.
	 * @generated
	 */
	public void setADImage(List<ADImageType> newADImage) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADIMAGE, newADImage));
	}

	/**
	 * Returns the value of '<em><b>aDLanguage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDLanguage</b></em>' feature
	 * @generated
	 */
	public List<ADLanguageType> getADLanguage() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADLANGUAGE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADLanguage() <em>aDLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADLanguage() aDLanguage}' feature.
	 * @generated
	 */
	public void setADLanguage(List<ADLanguageType> newADLanguage) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADLANGUAGE,
				newADLanguage));
	}

	/**
	 * Returns the value of '<em><b>aDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDList</b></em>' feature
	 * @generated
	 */
	public List<ADListType> getADList() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADLIST);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADList() <em>aDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADList() aDList}' feature.
	 * @generated
	 */
	public void setADList(List<ADListType> newADList) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADLIST, newADList));
	}

	/**
	 * Returns the value of '<em><b>aDListTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDListTrl</b></em>' feature
	 * @generated
	 */
	public List<ADListTrlType> getADListTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADLISTTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADListTrl() <em>aDListTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADListTrl() aDListTrl}' feature.
	 * @generated
	 */
	public void setADListTrl(List<ADListTrlType> newADListTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADLISTTRL, newADListTrl));
	}

	/**
	 * Returns the value of '<em><b>aDMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenu</b></em>' feature
	 * @generated
	 */
	public List<ADMenuType> getADMenu() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADMENU);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMenu() <em>aDMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMenu() aDMenu}' feature.
	 * @generated
	 */
	public void setADMenu(List<ADMenuType> newADMenu) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMENU, newADMenu));
	}

	/**
	 * Returns the value of '<em><b>aDMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenuTrl</b></em>' feature
	 * @generated
	 */
	public List<ADMenuTrlType> getADMenuTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADMENUTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMenuTrl() <em>aDMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMenuTrl() aDMenuTrl}' feature.
	 * @generated
	 */
	public void setADMenuTrl(List<ADMenuTrlType> newADMenuTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMENUTRL, newADMenuTrl));
	}

	/**
	 * Returns the value of '<em><b>aDMessage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessage</b></em>' feature
	 * @generated
	 */
	public List<ADMessageType> getADMessage() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADMESSAGE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMessage() <em>aDMessage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMessage() aDMessage}' feature.
	 * @generated
	 */
	public void setADMessage(List<ADMessageType> newADMessage) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMESSAGE, newADMessage));
	}

	/**
	 * Returns the value of '<em><b>aDMessageTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessageTrl</b></em>' feature
	 * @generated
	 */
	public List<ADMessageTrlType> getADMessageTrl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADMESSAGETRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMessageTrl() <em>aDMessageTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMessageTrl() aDMessageTrl}' feature.
	 * @generated
	 */
	public void setADMessageTrl(List<ADMessageTrlType> newADMessageTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMESSAGETRL,
				newADMessageTrl));
	}

	/**
	 * Returns the value of '<em><b>aDModelImplementation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementation</b></em>' feature
	 * @generated
	 */
	public List<ADModelImplementationType> getADModelImplementation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATION);
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
			List<ADModelImplementationType> newADModelImplementation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATION,
				newADModelImplementation));
	}

	/**
	 * Returns the value of '<em><b>aDModelImplementationMapping</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementationMapping</b></em>' feature
	 * @generated
	 */
	public List<ADModelImplementationMappingType> getADModelImplementationMapping() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATIONMAPPING);
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
			List<ADModelImplementationMappingType> newADModelImplementationMapping) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATIONMAPPING,
						newADModelImplementationMapping));
	}

	/**
	 * Returns the value of '<em><b>aDModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModule</b></em>' feature
	 * @generated
	 */
	public List<ADModuleType> getADModule() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADMODULE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModule() <em>aDModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModule() aDModule}' feature.
	 * @generated
	 */
	public void setADModule(List<ADModuleType> newADModule) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULE, newADModule));
	}

	/**
	 * Returns the value of '<em><b>aDModuleDBPrefixInstall</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleDBPrefixInstall</b></em>' feature
	 * @generated
	 */
	public List<ADModuleDBPrefixInstallType> getADModuleDBPrefixInstall() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEDBPREFIXINSTALL);
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
			List<ADModuleDBPrefixInstallType> newADModuleDBPrefixInstall) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEDBPREFIXINSTALL,
				newADModuleDBPrefixInstall));
	}

	/**
	 * Returns the value of '<em><b>aDModuleDependencyInst</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleDependencyInst</b></em>' feature
	 * @generated
	 */
	public List<ADModuleDependencyInstType> getADModuleDependencyInst() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEDEPENDENCYINST);
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
			List<ADModuleDependencyInstType> newADModuleDependencyInst) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEDEPENDENCYINST,
				newADModuleDependencyInst));
	}

	/**
	 * Returns the value of '<em><b>aDModuleInstall</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleInstall</b></em>' feature
	 * @generated
	 */
	public List<ADModuleInstallType> getADModuleInstall() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEINSTALL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModuleInstall() <em>aDModuleInstall</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModuleInstall() aDModuleInstall}' feature.
	 * @generated
	 */
	public void setADModuleInstall(List<ADModuleInstallType> newADModuleInstall) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEINSTALL,
				newADModuleInstall));
	}

	/**
	 * Returns the value of '<em><b>aDModuleMerge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleMerge</b></em>' feature
	 * @generated
	 */
	public List<ADModuleMergeType> getADModuleMerge() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEMERGE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADModuleMerge() <em>aDModuleMerge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADModuleMerge() aDModuleMerge}' feature.
	 * @generated
	 */
	public void setADModuleMerge(List<ADModuleMergeType> newADModuleMerge) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMODULEMERGE,
				newADModuleMerge));
	}

	/**
	 * Returns the value of '<em><b>aDMonth</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMonth</b></em>' feature
	 * @generated
	 */
	public List<ADMonthType> getADMonth() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADMONTH);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMonth() <em>aDMonth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMonth() aDMonth}' feature.
	 * @generated
	 */
	public void setADMonth(List<ADMonthType> newADMonth) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMONTH, newADMonth));
	}

	/**
	 * Returns the value of '<em><b>aDMonthTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMonthTrl</b></em>' feature
	 * @generated
	 */
	public List<ADMonthTrlType> getADMonthTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADMONTHTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADMonthTrl() <em>aDMonthTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADMonthTrl() aDMonthTrl}' feature.
	 * @generated
	 */
	public void setADMonthTrl(List<ADMonthTrlType> newADMonthTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADMONTHTRL,
				newADMonthTrl));
	}

	/**
	 * Returns the value of '<em><b>aDOrgModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDOrgModule</b></em>' feature
	 * @generated
	 */
	public List<ADOrgModuleType> getADOrgModule() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADORGMODULE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADOrgModule() <em>aDOrgModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADOrgModule() aDOrgModule}' feature.
	 * @generated
	 */
	public void setADOrgModule(List<ADOrgModuleType> newADOrgModule) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADORGMODULE,
				newADOrgModule));
	}

	/**
	 * Returns the value of '<em><b>aDParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDParameter</b></em>' feature
	 * @generated
	 */
	public List<ADParameterType> getADParameter() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADPARAMETER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADParameter() <em>aDParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADParameter() aDParameter}' feature.
	 * @generated
	 */
	public void setADParameter(List<ADParameterType> newADParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPARAMETER,
				newADParameter));
	}

	/**
	 * Returns the value of '<em><b>aDPreference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDPreference</b></em>' feature
	 * @generated
	 */
	public List<ADPreferenceType> getADPreference() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADPREFERENCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADPreference() <em>aDPreference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADPreference() aDPreference}' feature.
	 * @generated
	 */
	public void setADPreference(List<ADPreferenceType> newADPreference) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPREFERENCE,
				newADPreference));
	}

	/**
	 * Returns the value of '<em><b>aDProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcess</b></em>' feature
	 * @generated
	 */
	public List<ADProcessType> getADProcess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcess() <em>aDProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcess() aDProcess}' feature.
	 * @generated
	 */
	public void setADProcess(List<ADProcessType> newADProcess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESS, newADProcess));
	}

	/**
	 * Returns the value of '<em><b>aDProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessAccess</b></em>' feature
	 * @generated
	 */
	public List<ADProcessAccessType> getADProcessAccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSACCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessAccess() <em>aDProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessAccess() aDProcessAccess}' feature.
	 * @generated
	 */
	public void setADProcessAccess(List<ADProcessAccessType> newADProcessAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSACCESS,
				newADProcessAccess));
	}

	/**
	 * Returns the value of '<em><b>aDProcessInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessInstance</b></em>' feature
	 * @generated
	 */
	public List<ADProcessInstanceType> getADProcessInstance() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSINSTANCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessInstance() <em>aDProcessInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessInstance() aDProcessInstance}' feature.
	 * @generated
	 */
	public void setADProcessInstance(
			List<ADProcessInstanceType> newADProcessInstance) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSINSTANCE,
				newADProcessInstance));
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameter</b></em>' feature
	 * @generated
	 */
	public List<ADProcessParameterType> getADProcessParameter() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETER);
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
			List<ADProcessParameterType> newADProcessParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETER,
				newADProcessParameter));
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameterTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterTrl</b></em>' feature
	 * @generated
	 */
	public List<ADProcessParameterTrlType> getADProcessParameterTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETERTRL);
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
			List<ADProcessParameterTrlType> newADProcessParameterTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETERTRL,
				newADProcessParameterTrl));
	}

	/**
	 * Returns the value of '<em><b>aDProcessScheduling</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessScheduling</b></em>' feature
	 * @generated
	 */
	public List<ADProcessSchedulingType> getADProcessScheduling() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSSCHEDULING);
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
			List<ADProcessSchedulingType> newADProcessScheduling) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSSCHEDULING,
				newADProcessScheduling));
	}

	/**
	 * Returns the value of '<em><b>aDProcessTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessTrl</b></em>' feature
	 * @generated
	 */
	public List<ADProcessTrlType> getADProcessTrl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADProcessTrl() <em>aDProcessTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADProcessTrl() aDProcessTrl}' feature.
	 * @generated
	 */
	public void setADProcessTrl(List<ADProcessTrlType> newADProcessTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADPROCESSTRL,
				newADProcessTrl));
	}

	/**
	 * Returns the value of '<em><b>aDReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReference</b></em>' feature
	 * @generated
	 */
	public List<ADReferenceType> getADReference() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADREFERENCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADReference() <em>aDReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADReference() aDReference}' feature.
	 * @generated
	 */
	public void setADReference(List<ADReferenceType> newADReference) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADREFERENCE,
				newADReference));
	}

	/**
	 * Returns the value of '<em><b>aDReferenceTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferenceTrl</b></em>' feature
	 * @generated
	 */
	public List<ADReferenceTrlType> getADReferenceTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADREFERENCETRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADReferenceTrl() <em>aDReferenceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADReferenceTrl() aDReferenceTrl}' feature.
	 * @generated
	 */
	public void setADReferenceTrl(List<ADReferenceTrlType> newADReferenceTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADREFERENCETRL,
				newADReferenceTrl));
	}

	/**
	 * Returns the value of '<em><b>aDReferencedTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDReferencedTable</b></em>' feature
	 * @generated
	 */
	public List<ADReferencedTableType> getADReferencedTable() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADREFERENCEDTABLE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADReferencedTable() <em>aDReferencedTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADReferencedTable() aDReferencedTable}' feature.
	 * @generated
	 */
	public void setADReferencedTable(
			List<ADReferencedTableType> newADReferencedTable) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADREFERENCEDTABLE,
				newADReferencedTable));
	}

	/**
	 * Returns the value of '<em><b>aDRegistration</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRegistration</b></em>' feature
	 * @generated
	 */
	public List<ADRegistrationType> getADRegistration() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADREGISTRATION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADRegistration() <em>aDRegistration</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADRegistration() aDRegistration}' feature.
	 * @generated
	 */
	public void setADRegistration(List<ADRegistrationType> newADRegistration) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADREGISTRATION,
				newADRegistration));
	}

	/**
	 * Returns the value of '<em><b>aDRole</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRole</b></em>' feature
	 * @generated
	 */
	public List<ADRoleType> getADRole() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADROLE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADRole() <em>aDRole</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADRole() aDRole}' feature.
	 * @generated
	 */
	public void setADRole(List<ADRoleType> newADRole) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADROLE, newADRole));
	}

	/**
	 * Returns the value of '<em><b>aDRoleOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRoleOrganization</b></em>' feature
	 * @generated
	 */
	public List<ADRoleOrganizationType> getADRoleOrganization() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADROLEORGANIZATION);
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
			List<ADRoleOrganizationType> newADRoleOrganization) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADROLEORGANIZATION,
				newADRoleOrganization));
	}

	/**
	 * Returns the value of '<em><b>aDSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelector</b></em>' feature
	 * @generated
	 */
	public List<ADSelectorType> getADSelector() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADSELECTOR);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSelector() <em>aDSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSelector() aDSelector}' feature.
	 * @generated
	 */
	public void setADSelector(List<ADSelectorType> newADSelector) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSELECTOR,
				newADSelector));
	}

	/**
	 * Returns the value of '<em><b>aDSelectorColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSelectorColumn</b></em>' feature
	 * @generated
	 */
	public List<ADSelectorColumnType> getADSelectorColumn() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADSELECTORCOLUMN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSelectorColumn() <em>aDSelectorColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSelectorColumn() aDSelectorColumn}' feature.
	 * @generated
	 */
	public void setADSelectorColumn(
			List<ADSelectorColumnType> newADSelectorColumn) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSELECTORCOLUMN,
				newADSelectorColumn));
	}

	/**
	 * Returns the value of '<em><b>aDSequence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSequence</b></em>' feature
	 * @generated
	 */
	public List<ADSequenceType> getADSequence() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADSEQUENCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSequence() <em>aDSequence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSequence() aDSequence}' feature.
	 * @generated
	 */
	public void setADSequence(List<ADSequenceType> newADSequence) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSEQUENCE,
				newADSequence));
	}

	/**
	 * Returns the value of '<em><b>aDSession</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSession</b></em>' feature
	 * @generated
	 */
	public List<ADSessionType> getADSession() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADSESSION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSession() <em>aDSession</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSession() aDSession}' feature.
	 * @generated
	 */
	public void setADSession(List<ADSessionType> newADSession) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSESSION, newADSession));
	}

	/**
	 * Returns the value of '<em><b>aDSessionStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSessionStatus</b></em>' feature
	 * @generated
	 */
	public List<ADSessionStatusType> getADSessionStatus() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADSESSIONSTATUS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSessionStatus() <em>aDSessionStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSessionStatus() aDSessionStatus}' feature.
	 * @generated
	 */
	public void setADSessionStatus(List<ADSessionStatusType> newADSessionStatus) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSESSIONSTATUS,
				newADSessionStatus));
	}

	/**
	 * Returns the value of '<em><b>aDSessionUsageAudit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSessionUsageAudit</b></em>' feature
	 * @generated
	 */
	public List<ADSessionUsageAuditType> getADSessionUsageAudit() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADSESSIONUSAGEAUDIT);
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
			List<ADSessionUsageAuditType> newADSessionUsageAudit) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSESSIONUSAGEAUDIT,
				newADSessionUsageAudit));
	}

	/**
	 * Returns the value of '<em><b>aDSystem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystem</b></em>' feature
	 * @generated
	 */
	public List<ADSystemType> getADSystem() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADSYSTEM);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADSystem() <em>aDSystem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADSystem() aDSystem}' feature.
	 * @generated
	 */
	public void setADSystem(List<ADSystemType> newADSystem) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSYSTEM, newADSystem));
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformation</b></em>' feature
	 * @generated
	 */
	public List<ADSystemInformationType> getADSystemInformation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADSYSTEMINFORMATION);
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
			List<ADSystemInformationType> newADSystemInformation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADSYSTEMINFORMATION,
				newADSystemInformation));
	}

	/**
	 * Returns the value of '<em><b>aDTab</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTab</b></em>' feature
	 * @generated
	 */
	public List<ADTabType> getADTab() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADTAB);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTab() <em>aDTab</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTab() aDTab}' feature.
	 * @generated
	 */
	public void setADTab(List<ADTabType> newADTab) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTAB, newADTab));
	}

	/**
	 * Returns the value of '<em><b>aDTabTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTabTrl</b></em>' feature
	 * @generated
	 */
	public List<ADTabTrlType> getADTabTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADTABTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTabTrl() <em>aDTabTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTabTrl() aDTabTrl}' feature.
	 * @generated
	 */
	public void setADTabTrl(List<ADTabTrlType> newADTabTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTABTRL, newADTabTrl));
	}

	/**
	 * Returns the value of '<em><b>aDTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTable</b></em>' feature
	 * @generated
	 */
	public List<ADTableType> getADTable() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADTABLE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTable() <em>aDTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTable() aDTable}' feature.
	 * @generated
	 */
	public void setADTable(List<ADTableType> newADTable) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTABLE, newADTable));
	}

	/**
	 * Returns the value of '<em><b>aDTableAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTableAccess</b></em>' feature
	 * @generated
	 */
	public List<ADTableAccessType> getADTableAccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADTABLEACCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTableAccess() <em>aDTableAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTableAccess() aDTableAccess}' feature.
	 * @generated
	 */
	public void setADTableAccess(List<ADTableAccessType> newADTableAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTABLEACCESS,
				newADTableAccess));
	}

	/**
	 * Returns the value of '<em><b>aDTablePostV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTablePostV</b></em>' feature
	 * @generated
	 */
	public List<ADTablePostVType> getADTablePostV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADTABLEPOSTV);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTablePostV() <em>aDTablePostV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTablePostV() aDTablePostV}' feature.
	 * @generated
	 */
	public void setADTablePostV(List<ADTablePostVType> newADTablePostV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTABLEPOSTV,
				newADTablePostV));
	}

	/**
	 * Returns the value of '<em><b>aDTextInterface</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTextInterface</b></em>' feature
	 * @generated
	 */
	public List<ADTextInterfaceType> getADTextInterface() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADTEXTINTERFACE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTextInterface() <em>aDTextInterface</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTextInterface() aDTextInterface}' feature.
	 * @generated
	 */
	public void setADTextInterface(List<ADTextInterfaceType> newADTextInterface) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTEXTINTERFACE,
				newADTextInterface));
	}

	/**
	 * Returns the value of '<em><b>aDTextInterfaceTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTextInterfaceTrl</b></em>' feature
	 * @generated
	 */
	public List<ADTextInterfaceTrlType> getADTextInterfaceTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADTEXTINTERFACETRL);
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
			List<ADTextInterfaceTrlType> newADTextInterfaceTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTEXTINTERFACETRL,
				newADTextInterfaceTrl));
	}

	/**
	 * Returns the value of '<em><b>aDTree</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTree</b></em>' feature
	 * @generated
	 */
	public List<ADTreeType> getADTree() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADTREE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTree() <em>aDTree</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTree() aDTree}' feature.
	 * @generated
	 */
	public void setADTree(List<ADTreeType> newADTree) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTREE, newADTree));
	}

	/**
	 * Returns the value of '<em><b>aDTreeNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTreeNode</b></em>' feature
	 * @generated
	 */
	public List<ADTreeNodeType> getADTreeNode() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADTREENODE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADTreeNode() <em>aDTreeNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADTreeNode() aDTreeNode}' feature.
	 * @generated
	 */
	public void setADTreeNode(List<ADTreeNodeType> newADTreeNode) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADTREENODE,
				newADTreeNode));
	}

	/**
	 * Returns the value of '<em><b>aDUser</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUser</b></em>' feature
	 * @generated
	 */
	public List<ADUserType> getADUser() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADUSER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADUser() <em>aDUser</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADUser() aDUser}' feature.
	 * @generated
	 */
	public void setADUser(List<ADUserType> newADUser) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADUSER, newADUser));
	}

	/**
	 * Returns the value of '<em><b>aDUserRoles</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserRoles</b></em>' feature
	 * @generated
	 */
	public List<ADUserRolesType> getADUserRoles() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADUSERROLES);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADUserRoles() <em>aDUserRoles</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADUserRoles() aDUserRoles}' feature.
	 * @generated
	 */
	public void setADUserRoles(List<ADUserRolesType> newADUserRoles) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADUSERROLES,
				newADUserRoles));
	}

	/**
	 * Returns the value of '<em><b>aDValidation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDValidation</b></em>' feature
	 * @generated
	 */
	public List<ADValidationType> getADValidation() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADVALIDATION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADValidation() <em>aDValidation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADValidation() aDValidation}' feature.
	 * @generated
	 */
	public void setADValidation(List<ADValidationType> newADValidation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADVALIDATION,
				newADValidation));
	}

	/**
	 * Returns the value of '<em><b>aDWindow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindow</b></em>' feature
	 * @generated
	 */
	public List<ADWindowType> getADWindow() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADWINDOW);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADWindow() <em>aDWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADWindow() aDWindow}' feature.
	 * @generated
	 */
	public void setADWindow(List<ADWindowType> newADWindow) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADWINDOW, newADWindow));
	}

	/**
	 * Returns the value of '<em><b>aDWindowAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowAccess</b></em>' feature
	 * @generated
	 */
	public List<ADWindowAccessType> getADWindowAccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADWINDOWACCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADWindowAccess() <em>aDWindowAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADWindowAccess() aDWindowAccess}' feature.
	 * @generated
	 */
	public void setADWindowAccess(List<ADWindowAccessType> newADWindowAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADWINDOWACCESS,
				newADWindowAccess));
	}

	/**
	 * Returns the value of '<em><b>aDWindowTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowTrl</b></em>' feature
	 * @generated
	 */
	public List<ADWindowTrlType> getADWindowTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ADWINDOWTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADWindowTrl() <em>aDWindowTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADWindowTrl() aDWindowTrl}' feature.
	 * @generated
	 */
	public void setADWindowTrl(List<ADWindowTrlType> newADWindowTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADWINDOWTRL,
				newADWindowTrl));
	}

	/**
	 * Returns the value of '<em><b>aDAuditTrail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAuditTrail</b></em>' feature
	 * @generated
	 */
	public List<ADAuditTrailType> getADAuditTrail() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ADAUDITTRAIL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAuditTrail() <em>aDAuditTrail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAuditTrail() aDAuditTrail}' feature.
	 * @generated
	 */
	public void setADAuditTrail(List<ADAuditTrailType> newADAuditTrail) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADAUDITTRAIL,
				newADAuditTrail));
	}

	/**
	 * Returns the value of '<em><b>aDAuditTrailRaw</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAuditTrailRaw</b></em>' feature
	 * @generated
	 */
	public List<ADAuditTrailRawType> getADAuditTrailRaw() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADAUDITTRAILRAW);
	}

	/**
	 * Sets the '{@link OpenbravoType#getADAuditTrailRaw() <em>aDAuditTrailRaw</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getADAuditTrailRaw() aDAuditTrailRaw}' feature.
	 * @generated
	 */
	public void setADAuditTrailRaw(List<ADAuditTrailRawType> newADAuditTrailRaw) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADAUDITTRAILRAW,
				newADAuditTrailRaw));
	}

	/**
	 * Returns the value of '<em><b>aDCreateFactTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDCreateFactTemplate</b></em>' feature
	 * @generated
	 */
	public List<ADCreateFactTemplateType> getADCreateFactTemplate() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ADCREATEFACTTEMPLATE);
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
			List<ADCreateFactTemplateType> newADCreateFactTemplate) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ADCREATEFACTTEMPLATE,
				newADCreateFactTemplate));
	}

	/**
	 * Returns the value of '<em><b>aPRMFinAccTransactionAcctV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinAccTransactionAcctV</b></em>' feature
	 * @generated
	 */
	public List<APRMFinAccTransactionAcctVType> getAPRMFinAccTransactionAcctV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONACCTV);
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
			List<APRMFinAccTransactionAcctVType> newAPRMFinAccTransactionAcctV) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONACCTV,
						newAPRMFinAccTransactionAcctV));
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTransactionV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTransactionV</b></em>' feature
	 * @generated
	 */
	public List<APRMFinaccTransactionVType> getAPRMFinaccTransactionV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONV);
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
			List<APRMFinaccTransactionVType> newAPRMFinaccTransactionV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONV,
				newAPRMFinaccTransactionV));
	}

	/**
	 * Returns the value of '<em><b>aPRMFinaccTrxFullAcctV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMFinaccTrxFullAcctV</b></em>' feature
	 * @generated
	 */
	public List<APRMFinaccTrxFullAcctVType> getAPRMFinaccTrxFullAcctV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.APRMFINACCTRXFULLACCTV);
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
			List<APRMFinaccTrxFullAcctVType> newAPRMFinaccTrxFullAcctV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.APRMFINACCTRXFULLACCTV,
				newAPRMFinaccTrxFullAcctV));
	}

	/**
	 * Returns the value of '<em><b>aPRMPendingPaymentInvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMPendingPaymentInvoice</b></em>' feature
	 * @generated
	 */
	public List<APRMPendingPaymentInvoiceType> getAPRMPendingPaymentInvoice() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.APRMPENDINGPAYMENTINVOICE);
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
			List<APRMPendingPaymentInvoiceType> newAPRMPendingPaymentInvoice) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.APRMPENDINGPAYMENTINVOICE,
						newAPRMPendingPaymentInvoice));
	}

	/**
	 * Returns the value of '<em><b>aPRMRecDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMRecDetailV</b></em>' feature
	 * @generated
	 */
	public List<APRMRecDetailVType> getAPRMRecDetailV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.APRMRECDETAILV);
	}

	/**
	 * Sets the '{@link OpenbravoType#getAPRMRecDetailV() <em>aPRMRecDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAPRMRecDetailV() aPRMRecDetailV}' feature.
	 * @generated
	 */
	public void setAPRMRecDetailV(List<APRMRecDetailVType> newAPRMRecDetailV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.APRMRECDETAILV,
				newAPRMRecDetailV));
	}

	/**
	 * Returns the value of '<em><b>aPRMReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aPRMReconciliation</b></em>' feature
	 * @generated
	 */
	public List<APRMReconciliationType> getAPRMReconciliation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.APRMRECONCILIATION);
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
			List<APRMReconciliationType> newAPRMReconciliation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.APRMRECONCILIATION,
				newAPRMReconciliation));
	}

	/**
	 * Returns the value of '<em><b>acctSchemaTableDocType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>acctSchemaTableDocType</b></em>' feature
	 * @generated
	 */
	public List<AcctSchemaTableDocTypeType> getAcctSchemaTableDocType() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ACCTSCHEMATABLEDOCTYPE);
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
			List<AcctSchemaTableDocTypeType> newAcctSchemaTableDocType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ACCTSCHEMATABLEDOCTYPE,
				newAcctSchemaTableDocType));
	}

	/**
	 * Returns the value of '<em><b>activeProposalV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activeProposalV</b></em>' feature
	 * @generated
	 */
	public List<ActiveProposalVType> getActiveProposalV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ACTIVEPROPOSALV);
	}

	/**
	 * Sets the '{@link OpenbravoType#getActiveProposalV() <em>activeProposalV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getActiveProposalV() activeProposalV}' feature.
	 * @generated
	 */
	public void setActiveProposalV(List<ActiveProposalVType> newActiveProposalV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ACTIVEPROPOSALV,
				newActiveProposalV));
	}

	/**
	 * Returns the value of '<em><b>approvedVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>approvedVendor</b></em>' feature
	 * @generated
	 */
	public List<ApprovedVendorType> getApprovedVendor() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.APPROVEDVENDOR);
	}

	/**
	 * Sets the '{@link OpenbravoType#getApprovedVendor() <em>approvedVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getApprovedVendor() approvedVendor}' feature.
	 * @generated
	 */
	public void setApprovedVendor(List<ApprovedVendorType> newApprovedVendor) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.APPROVEDVENDOR,
				newApprovedVendor));
	}

	/**
	 * Returns the value of '<em><b>attribute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attribute</b></em>' feature
	 * @generated
	 */
	public List<AttributeType> getAttribute() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttribute() <em>attribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttribute() attribute}' feature.
	 * @generated
	 */
	public void setAttribute(List<AttributeType> newAttribute) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTE, newAttribute));
	}

	/**
	 * Returns the value of '<em><b>attributeInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeInstance</b></em>' feature
	 * @generated
	 */
	public List<AttributeInstanceType> getAttributeInstance() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTEINSTANCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeInstance() <em>attributeInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeInstance() attributeInstance}' feature.
	 * @generated
	 */
	public void setAttributeInstance(
			List<AttributeInstanceType> newAttributeInstance) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTEINSTANCE,
				newAttributeInstance));
	}

	/**
	 * Returns the value of '<em><b>attributeSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSet</b></em>' feature
	 * @generated
	 */
	public List<AttributeSetType> getAttributeSet() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTESET);
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeSet() <em>attributeSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeSet() attributeSet}' feature.
	 * @generated
	 */
	public void setAttributeSet(List<AttributeSetType> newAttributeSet) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTESET,
				newAttributeSet));
	}

	/**
	 * Returns the value of '<em><b>attributeSetInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeSetInstance</b></em>' feature
	 * @generated
	 */
	public List<AttributeSetInstanceType> getAttributeSetInstance() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTESETINSTANCE);
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
			List<AttributeSetInstanceType> newAttributeSetInstance) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTESETINSTANCE,
				newAttributeSetInstance));
	}

	/**
	 * Returns the value of '<em><b>attributeUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeUse</b></em>' feature
	 * @generated
	 */
	public List<AttributeUseType> getAttributeUse() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTEUSE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeUse() <em>attributeUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeUse() attributeUse}' feature.
	 * @generated
	 */
	public void setAttributeUse(List<AttributeUseType> newAttributeUse) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTEUSE,
				newAttributeUse));
	}

	/**
	 * Returns the value of '<em><b>attributeValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeValue</b></em>' feature
	 * @generated
	 */
	public List<AttributeValueType> getAttributeValue() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTEVALUE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getAttributeValue() <em>attributeValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getAttributeValue() attributeValue}' feature.
	 * @generated
	 */
	public void setAttributeValue(List<AttributeValueType> newAttributeValue) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ATTRIBUTEVALUE,
				newAttributeValue));
	}

	/**
	 * Returns the value of '<em><b>bank</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bank</b></em>' feature
	 * @generated
	 */
	public List<BankType> getBank() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.BANK);
	}

	/**
	 * Sets the '{@link OpenbravoType#getBank() <em>bank</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBank() bank}' feature.
	 * @generated
	 */
	public void setBank(List<BankType> newBank) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BANK, newBank));
	}

	/**
	 * Returns the value of '<em><b>bankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccount</b></em>' feature
	 * @generated
	 */
	public List<BankAccountType> getBankAccount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.BANKACCOUNT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(List<BankAccountType> newBankAccount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BANKACCOUNT,
				newBankAccount));
	}

	/**
	 * Returns the value of '<em><b>bankAccountAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccountAccounts</b></em>' feature
	 * @generated
	 */
	public List<BankAccountAccountsType> getBankAccountAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.BANKACCOUNTACCOUNTS);
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
			List<BankAccountAccountsType> newBankAccountAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BANKACCOUNTACCOUNTS,
				newBankAccountAccounts));
	}

	/**
	 * Returns the value of '<em><b>businessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartner</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerType> getBusinessPartner() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(List<BusinessPartnerType> newBusinessPartner) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNER,
				newBusinessPartner));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerBankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerBankAccount</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerBankAccountType> getBusinessPartnerBankAccount() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERBANKACCOUNT);
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
			List<BusinessPartnerBankAccountType> newBusinessPartnerBankAccount) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERBANKACCOUNT,
						newBusinessPartnerBankAccount));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategory</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerCategoryType> getBusinessPartnerCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORY);
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
			List<BusinessPartnerCategoryType> newBusinessPartnerCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORY,
				newBusinessPartnerCategory));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerCategoryAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerCategoryAccount</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerCategoryAccountType> getBusinessPartnerCategoryAccount() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORYACCOUNT);
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
			List<BusinessPartnerCategoryAccountType> newBusinessPartnerCategoryAccount) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORYACCOUNT,
						newBusinessPartnerCategoryAccount));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerDiscount</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerDiscountType> getBusinessPartnerDiscount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERDISCOUNT);
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
			List<BusinessPartnerDiscountType> newBusinessPartnerDiscount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERDISCOUNT,
				newBusinessPartnerDiscount));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerLocation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerLocation</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerLocationType> getBusinessPartnerLocation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERLOCATION);
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
			List<BusinessPartnerLocationType> newBusinessPartnerLocation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERLOCATION,
				newBusinessPartnerLocation));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerProductTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerProductTemplate</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerProductTemplateType> getBusinessPartnerProductTemplate() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERPRODUCTTEMPLATE);
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
			List<BusinessPartnerProductTemplateType> newBusinessPartnerProductTemplate) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERPRODUCTTEMPLATE,
						newBusinessPartnerProductTemplate));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerTaxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerTaxCategory</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerTaxCategoryType> getBusinessPartnerTaxCategory() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERTAXCATEGORY);
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
			List<BusinessPartnerTaxCategoryType> newBusinessPartnerTaxCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERTAXCATEGORY,
						newBusinessPartnerTaxCategory));
	}

	/**
	 * Returns the value of '<em><b>businessPartnerWithholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>businessPartnerWithholding</b></em>' feature
	 * @generated
	 */
	public List<BusinessPartnerWithholdingType> getBusinessPartnerWithholding() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERWITHHOLDING);
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
			List<BusinessPartnerWithholdingType> newBusinessPartnerWithholding) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.BUSINESSPARTNERWITHHOLDING,
						newBusinessPartnerWithholding));
	}

	/**
	 * Returns the value of '<em><b>cAcctSchemaProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cAcctSchemaProcess</b></em>' feature
	 * @generated
	 */
	public List<CAcctSchemaProcessType> getCAcctSchemaProcess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.CACCTSCHEMAPROCESS);
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
			List<CAcctSchemaProcessType> newCAcctSchemaProcess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CACCTSCHEMAPROCESS,
				newCAcctSchemaProcess));
	}

	/**
	 * Returns the value of '<em><b>city</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>city</b></em>' feature
	 * @generated
	 */
	public List<CityType> getCity() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.CITY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(List<CityType> newCity) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CITY, newCity));
	}

	/**
	 * Returns the value of '<em><b>clientInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformation</b></em>' feature
	 * @generated
	 */
	public List<ClientInformationType> getClientInformation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.CLIENTINFORMATION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getClientInformation() <em>clientInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getClientInformation() clientInformation}' feature.
	 * @generated
	 */
	public void setClientInformation(
			List<ClientInformationType> newClientInformation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CLIENTINFORMATION,
				newClientInformation));
	}

	/**
	 * Returns the value of '<em><b>conditionGoods</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>conditionGoods</b></em>' feature
	 * @generated
	 */
	public List<ConditionGoodsType> getConditionGoods() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.CONDITIONGOODS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getConditionGoods() <em>conditionGoods</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getConditionGoods() conditionGoods}' feature.
	 * @generated
	 */
	public void setConditionGoods(List<ConditionGoodsType> newConditionGoods) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CONDITIONGOODS,
				newConditionGoods));
	}

	/**
	 * Returns the value of '<em><b>contactEmailInteraction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>contactEmailInteraction</b></em>' feature
	 * @generated
	 */
	public List<ContactEmailInteractionType> getContactEmailInteraction() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.CONTACTEMAILINTERACTION);
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
			List<ContactEmailInteractionType> newContactEmailInteraction) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CONTACTEMAILINTERACTION,
				newContactEmailInteraction));
	}

	/**
	 * Returns the value of '<em><b>country</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>country</b></em>' feature
	 * @generated
	 */
	public List<CountryType> getCountry() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.COUNTRY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(List<CountryType> newCountry) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.COUNTRY, newCountry));
	}

	/**
	 * Returns the value of '<em><b>countryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>countryTrl</b></em>' feature
	 * @generated
	 */
	public List<CountryTrlType> getCountryTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.COUNTRYTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getCountryTrl() <em>countryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCountryTrl() countryTrl}' feature.
	 * @generated
	 */
	public void setCountryTrl(List<CountryTrlType> newCountryTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.COUNTRYTRL,
				newCountryTrl));
	}

	/**
	 * Returns the value of '<em><b>currency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currency</b></em>' feature
	 * @generated
	 */
	public List<CurrencyType> getCurrency() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.CURRENCY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(List<CurrencyType> newCurrency) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CURRENCY, newCurrency));
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRate</b></em>' feature
	 * @generated
	 */
	public List<CurrencyConversionRateType> getCurrencyConversionRate() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATE);
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
			List<CurrencyConversionRateType> newCurrencyConversionRate) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATE,
				newCurrencyConversionRate));
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRateDoc</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRateDoc</b></em>' feature
	 * @generated
	 */
	public List<CurrencyConversionRateDocType> getCurrencyConversionRateDoc() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATEDOC);
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
			List<CurrencyConversionRateDocType> newCurrencyConversionRateDoc) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATEDOC,
						newCurrencyConversionRateDoc));
	}

	/**
	 * Returns the value of '<em><b>currencyTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyTrl</b></em>' feature
	 * @generated
	 */
	public List<CurrencyTrlType> getCurrencyTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.CURRENCYTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getCurrencyTrl() <em>currencyTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCurrencyTrl() currencyTrl}' feature.
	 * @generated
	 */
	public void setCurrencyTrl(List<CurrencyTrlType> newCurrencyTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CURRENCYTRL,
				newCurrencyTrl));
	}

	/**
	 * Returns the value of '<em><b>customerAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>customerAccounts</b></em>' feature
	 * @generated
	 */
	public List<CustomerAccountsType> getCustomerAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.CUSTOMERACCOUNTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getCustomerAccounts() <em>customerAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCustomerAccounts() customerAccounts}' feature.
	 * @generated
	 */
	public void setCustomerAccounts(
			List<CustomerAccountsType> newCustomerAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.CUSTOMERACCOUNTS,
				newCustomerAccounts));
	}

	/**
	 * Returns the value of '<em><b>dataPackage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataPackage</b></em>' feature
	 * @generated
	 */
	public List<DataPackageType> getDataPackage() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.DATAPACKAGE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataPackage() <em>dataPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataPackage() dataPackage}' feature.
	 * @generated
	 */
	public void setDataPackage(List<DataPackageType> newDataPackage) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DATAPACKAGE,
				newDataPackage));
	}

	/**
	 * Returns the value of '<em><b>dataSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSet</b></em>' feature
	 * @generated
	 */
	public List<DataSetType> getDataSet() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.DATASET);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataSet() <em>dataSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataSet() dataSet}' feature.
	 * @generated
	 */
	public void setDataSet(List<DataSetType> newDataSet) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DATASET, newDataSet));
	}

	/**
	 * Returns the value of '<em><b>dataSetColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetColumn</b></em>' feature
	 * @generated
	 */
	public List<DataSetColumnType> getDataSetColumn() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.DATASETCOLUMN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataSetColumn() <em>dataSetColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataSetColumn() dataSetColumn}' feature.
	 * @generated
	 */
	public void setDataSetColumn(List<DataSetColumnType> newDataSetColumn) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DATASETCOLUMN,
				newDataSetColumn));
	}

	/**
	 * Returns the value of '<em><b>dataSetTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetTable</b></em>' feature
	 * @generated
	 */
	public List<DataSetTableType> getDataSetTable() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.DATASETTABLE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDataSetTable() <em>dataSetTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDataSetTable() dataSetTable}' feature.
	 * @generated
	 */
	public void setDataSetTable(List<DataSetTableType> newDataSetTable) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DATASETTABLE,
				newDataSetTable));
	}

	/**
	 * Returns the value of '<em><b>documentTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTemplate</b></em>' feature
	 * @generated
	 */
	public List<DocumentTemplateType> getDocumentTemplate() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.DOCUMENTTEMPLATE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDocumentTemplate() <em>documentTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDocumentTemplate() documentTemplate}' feature.
	 * @generated
	 */
	public void setDocumentTemplate(
			List<DocumentTemplateType> newDocumentTemplate) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DOCUMENTTEMPLATE,
				newDocumentTemplate));
	}

	/**
	 * Returns the value of '<em><b>documentType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentType</b></em>' feature
	 * @generated
	 */
	public List<DocumentTypeType> getDocumentType() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.DOCUMENTTYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(List<DocumentTypeType> newDocumentType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DOCUMENTTYPE,
				newDocumentType));
	}

	/**
	 * Returns the value of '<em><b>documentTypeTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>documentTypeTrl</b></em>' feature
	 * @generated
	 */
	public List<DocumentTypeTrlType> getDocumentTypeTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.DOCUMENTTYPETRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getDocumentTypeTrl() <em>documentTypeTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getDocumentTypeTrl() documentTypeTrl}' feature.
	 * @generated
	 */
	public void setDocumentTypeTrl(List<DocumentTypeTrlType> newDocumentTypeTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.DOCUMENTTYPETRL,
				newDocumentTypeTrl));
	}

	/**
	 * Returns the value of '<em><b>emailInteraction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailInteraction</b></em>' feature
	 * @generated
	 */
	public List<EmailInteractionType> getEmailInteraction() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.EMAILINTERACTION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmailInteraction() <em>emailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmailInteraction() emailInteraction}' feature.
	 * @generated
	 */
	public void setEmailInteraction(
			List<EmailInteractionType> newEmailInteraction) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EMAILINTERACTION,
				newEmailInteraction));
	}

	/**
	 * Returns the value of '<em><b>emailServerConfiguration</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailServerConfiguration</b></em>' feature
	 * @generated
	 */
	public List<EmailServerConfigurationType> getEmailServerConfiguration() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.EMAILSERVERCONFIGURATION);
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
			List<EmailServerConfigurationType> newEmailServerConfiguration) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.EMAILSERVERCONFIGURATION,
						newEmailServerConfiguration));
	}

	/**
	 * Returns the value of '<em><b>emailTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>emailTemplate</b></em>' feature
	 * @generated
	 */
	public List<EmailTemplateType> getEmailTemplate() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.EMAILTEMPLATE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmailTemplate() <em>emailTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmailTemplate() emailTemplate}' feature.
	 * @generated
	 */
	public void setEmailTemplate(List<EmailTemplateType> newEmailTemplate) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EMAILTEMPLATE,
				newEmailTemplate));
	}

	/**
	 * Returns the value of '<em><b>employeeAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeAccounts</b></em>' feature
	 * @generated
	 */
	public List<EmployeeAccountsType> getEmployeeAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.EMPLOYEEACCOUNTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getEmployeeAccounts() <em>employeeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getEmployeeAccounts() employeeAccounts}' feature.
	 * @generated
	 */
	public void setEmployeeAccounts(
			List<EmployeeAccountsType> newEmployeeAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EMPLOYEEACCOUNTS,
				newEmployeeAccounts));
	}

	/**
	 * Returns the value of '<em><b>employeeSalaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>employeeSalaryCategory</b></em>' feature
	 * @generated
	 */
	public List<EmployeeSalaryCategoryType> getEmployeeSalaryCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.EMPLOYEESALARYCATEGORY);
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
			List<EmployeeSalaryCategoryType> newEmployeeSalaryCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EMPLOYEESALARYCATEGORY,
				newEmployeeSalaryCategory));
	}

	/**
	 * Returns the value of '<em><b>expenseType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>expenseType</b></em>' feature
	 * @generated
	 */
	public List<ExpenseTypeType> getExpenseType() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.EXPENSETYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getExpenseType() <em>expenseType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getExpenseType() expenseType}' feature.
	 * @generated
	 */
	public void setExpenseType(List<ExpenseTypeType> newExpenseType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EXPENSETYPE,
				newExpenseType));
	}

	/**
	 * Returns the value of '<em><b>externalPOS</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOS</b></em>' feature
	 * @generated
	 */
	public List<ExternalPOSType> getExternalPOS() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.EXTERNALPOS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getExternalPOS() <em>externalPOS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getExternalPOS() externalPOS}' feature.
	 * @generated
	 */
	public void setExternalPOS(List<ExternalPOSType> newExternalPOS) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EXTERNALPOS,
				newExternalPOS));
	}

	/**
	 * Returns the value of '<em><b>externalPOSCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSCategory</b></em>' feature
	 * @generated
	 */
	public List<ExternalPOSCategoryType> getExternalPOSCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.EXTERNALPOSCATEGORY);
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
			List<ExternalPOSCategoryType> newExternalPOSCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EXTERNALPOSCATEGORY,
				newExternalPOSCategory));
	}

	/**
	 * Returns the value of '<em><b>externalPOSProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalPOSProduct</b></em>' feature
	 * @generated
	 */
	public List<ExternalPOSProductType> getExternalPOSProduct() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.EXTERNALPOSPRODUCT);
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
			List<ExternalPOSProductType> newExternalPOSProduct) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.EXTERNALPOSPRODUCT,
				newExternalPOSProduct));
	}

	/**
	 * Returns the value of '<em><b>fINBankStatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatement</b></em>' feature
	 * @generated
	 */
	public List<FINBankStatementType> getFINBankStatement() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINBANKSTATEMENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINBankStatement() <em>fINBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINBankStatement() fINBankStatement}' feature.
	 * @generated
	 */
	public void setFINBankStatement(
			List<FINBankStatementType> newFINBankStatement) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINBANKSTATEMENT,
				newFINBankStatement));
	}

	/**
	 * Returns the value of '<em><b>fINBankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINBankStatementLine</b></em>' feature
	 * @generated
	 */
	public List<FINBankStatementLineType> getFINBankStatementLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINBANKSTATEMENTLINE);
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
			List<FINBankStatementLineType> newFINBankStatementLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINBANKSTATEMENTLINE,
				newFINBankStatementLine));
	}

	/**
	 * Returns the value of '<em><b>fINFinaccTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinaccTransaction</b></em>' feature
	 * @generated
	 */
	public List<FINFinaccTransactionType> getFINFinaccTransaction() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINFINACCTRANSACTION);
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
			List<FINFinaccTransactionType> newFINFinaccTransaction) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINFINACCTRANSACTION,
				newFINFinaccTransaction));
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccount</b></em>' feature
	 * @generated
	 */
	public List<FINFinancialAccountType> getFINFinancialAccount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNT);
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
			List<FINFinancialAccountType> newFINFinancialAccount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNT,
				newFINFinancialAccount));
	}

	/**
	 * Returns the value of '<em><b>fINFinancialAccountAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINFinancialAccountAcct</b></em>' feature
	 * @generated
	 */
	public List<FINFinancialAccountAcctType> getFINFinancialAccountAcct() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNTACCT);
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
			List<FINFinancialAccountAcctType> newFINFinancialAccountAcct) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNTACCT,
				newFINFinancialAccountAcct));
	}

	/**
	 * Returns the value of '<em><b>fINPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPayment</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentType> getFINPayment() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPayment() <em>fINPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPayment() fINPayment}' feature.
	 * @generated
	 */
	public void setFINPayment(List<FINPaymentType> newFINPayment) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENT,
				newFINPayment));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentMethod</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentMethodType> getFINPaymentMethod() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTMETHOD);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentMethod() <em>fINPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentMethod() fINPaymentMethod}' feature.
	 * @generated
	 */
	public void setFINPaymentMethod(
			List<FINPaymentMethodType> newFINPaymentMethod) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTMETHOD,
				newFINPaymentMethod));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentCredit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentCredit</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentCreditType> getFINPaymentCredit() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTCREDIT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentCredit() <em>fINPaymentCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentCredit() fINPaymentCredit}' feature.
	 * @generated
	 */
	public void setFINPaymentCredit(
			List<FINPaymentCreditType> newFINPaymentCredit) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTCREDIT,
				newFINPaymentCredit));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetail</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentDetailType> getFINPaymentDetail() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTDETAIL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentDetail() <em>fINPaymentDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentDetail() fINPaymentDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentDetail(
			List<FINPaymentDetailType> newFINPaymentDetail) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTDETAIL,
				newFINPaymentDetail));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentDetailV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentDetailVType> getFINPaymentDetailV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTDETAILV);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINPaymentDetailV() <em>fINPaymentDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINPaymentDetailV() fINPaymentDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailV(
			List<FINPaymentDetailVType> newFINPaymentDetailV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTDETAILV,
				newFINPaymentDetailV));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPriority</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPriority</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentPriorityType> getFINPaymentPriority() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPRIORITY);
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
			List<FINPaymentPriorityType> newFINPaymentPriority) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPRIORITY,
				newFINPaymentPriority));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetail</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentPropDetailType> getFINPaymentPropDetail() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAIL);
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
			List<FINPaymentPropDetailType> newFINPaymentPropDetail) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAIL,
				newFINPaymentPropDetail));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentPropDetailV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentPropDetailV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentPropDetailVType> getFINPaymentPropDetailV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAILV);
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
			List<FINPaymentPropDetailVType> newFINPaymentPropDetailV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAILV,
				newFINPaymentPropDetailV));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentProposal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentProposal</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentProposalType> getFINPaymentProposal() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPROPOSAL);
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
			List<FINPaymentProposalType> newFINPaymentProposal) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTPROPOSAL,
				newFINPaymentProposal));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedInvV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedInvV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentSchedInvVType> getFINPaymentSchedInvV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDINVV);
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
			List<FINPaymentSchedInvVType> newFINPaymentSchedInvV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDINVV,
				newFINPaymentSchedInvV));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedOrdV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedOrdV</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentSchedOrdVType> getFINPaymentSchedOrdV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDORDV);
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
			List<FINPaymentSchedOrdVType> newFINPaymentSchedOrdV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDORDV,
				newFINPaymentSchedOrdV));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentSchedule</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentScheduleType> getFINPaymentSchedule() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULE);
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
			List<FINPaymentScheduleType> newFINPaymentSchedule) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULE,
				newFINPaymentSchedule));
	}

	/**
	 * Returns the value of '<em><b>fINPaymentScheduleDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINPaymentScheduleDetail</b></em>' feature
	 * @generated
	 */
	public List<FINPaymentScheduleDetailType> getFINPaymentScheduleDetail() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULEDETAIL);
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
			List<FINPaymentScheduleDetailType> newFINPaymentScheduleDetail) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULEDETAIL,
						newFINPaymentScheduleDetail));
	}

	/**
	 * Returns the value of '<em><b>fINReconciliation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliation</b></em>' feature
	 * @generated
	 */
	public List<FINReconciliationType> getFINReconciliation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINRECONCILIATION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFINReconciliation() <em>fINReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFINReconciliation() fINReconciliation}' feature.
	 * @generated
	 */
	public void setFINReconciliation(
			List<FINReconciliationType> newFINReconciliation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINRECONCILIATION,
				newFINReconciliation));
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineTemp</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineTemp</b></em>' feature
	 * @generated
	 */
	public List<FINReconciliationLineTempType> getFINReconciliationLineTemp() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINETEMP);
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
			List<FINReconciliationLineTempType> newFINReconciliationLineTemp) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINETEMP,
						newFINReconciliationLineTemp));
	}

	/**
	 * Returns the value of '<em><b>fINReconciliationLineV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>fINReconciliationLineV</b></em>' feature
	 * @generated
	 */
	public List<FINReconciliationLineVType> getFINReconciliationLineV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINEV);
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
			List<FINReconciliationLineVType> newFINReconciliationLineV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINEV,
				newFINReconciliationLineV));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingCombination</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingCombination</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAccountingCombinationType> getFinancialMgmtAccountingCombination() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGCOMBINATION);
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
			List<FinancialMgmtAccountingCombinationType> newFinancialMgmtAccountingCombination) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGCOMBINATION,
						newFinancialMgmtAccountingCombination));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingFact</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingFact</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAccountingFactType> getFinancialMgmtAccountingFact() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGFACT);
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
			List<FinancialMgmtAccountingFactType> newFinancialMgmtAccountingFact) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGFACT,
						newFinancialMgmtAccountingFact));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingReport</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingReport</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAccountingReportType> getFinancialMgmtAccountingReport() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGREPORT);
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
			List<FinancialMgmtAccountingReportType> newFinancialMgmtAccountingReport) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGREPORT,
						newFinancialMgmtAccountingReport));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAccountingRptElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAccountingRptElement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAccountingRptElementType> getFinancialMgmtAccountingRptElement() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGRPTELEMENT);
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
			List<FinancialMgmtAccountingRptElementType> newFinancialMgmtAccountingRptElement) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGRPTELEMENT,
						newFinancialMgmtAccountingRptElement));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctCFS</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctCFS</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctCFSType> getFinancialMgmtAcctCFS() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTCFS);
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
			List<FinancialMgmtAcctCFSType> newFinancialMgmtAcctCFS) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTCFS,
				newFinancialMgmtAcctCFS));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptGroup</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctRptGroupType> getFinancialMgmtAcctRptGroup() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTGROUP);
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
			List<FinancialMgmtAcctRptGroupType> newFinancialMgmtAcctRptGroup) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTGROUP,
						newFinancialMgmtAcctRptGroup));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctRptNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctRptNode</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctRptNodeType> getFinancialMgmtAcctRptNode() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTNODE);
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
			List<FinancialMgmtAcctRptNodeType> newFinancialMgmtAcctRptNode) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTNODE,
						newFinancialMgmtAcctRptNode));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchema</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaType> getFinancialMgmtAcctSchema() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMA);
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
			List<FinancialMgmtAcctSchemaType> newFinancialMgmtAcctSchema) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMA,
				newFinancialMgmtAcctSchema));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaDefault</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaDefault</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaDefaultType> getFinancialMgmtAcctSchemaDefault() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMADEFAULT);
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
			List<FinancialMgmtAcctSchemaDefaultType> newFinancialMgmtAcctSchemaDefault) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMADEFAULT,
						newFinancialMgmtAcctSchemaDefault));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaElement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaElementType> getFinancialMgmtAcctSchemaElement() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAELEMENT);
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
			List<FinancialMgmtAcctSchemaElementType> newFinancialMgmtAcctSchemaElement) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAELEMENT,
						newFinancialMgmtAcctSchemaElement));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaGL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaGL</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaGLType> getFinancialMgmtAcctSchemaGL() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAGL);
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
			List<FinancialMgmtAcctSchemaGLType> newFinancialMgmtAcctSchemaGL) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAGL,
						newFinancialMgmtAcctSchemaGL));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAcctSchemaTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAcctSchemaTable</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAcctSchemaTableType> getFinancialMgmtAcctSchemaTable() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMATABLE);
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
			List<FinancialMgmtAcctSchemaTableType> newFinancialMgmtAcctSchemaTable) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMATABLE,
						newFinancialMgmtAcctSchemaTable));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortization</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAmortizationType> getFinancialMgmtAmortization() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATION);
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
			List<FinancialMgmtAmortizationType> newFinancialMgmtAmortization) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATION,
						newFinancialMgmtAmortization));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAmortizationLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAmortizationLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAmortizationLineType> getFinancialMgmtAmortizationLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATIONLINE);
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
			List<FinancialMgmtAmortizationLineType> newFinancialMgmtAmortizationLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATIONLINE,
						newFinancialMgmtAmortizationLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAsset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAsset</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetType> getFinancialMgmtAsset() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSET);
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
			List<FinancialMgmtAssetType> newFinancialMgmtAsset) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSET,
				newFinancialMgmtAsset));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetAccountsType> getFinancialMgmtAssetAccounts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETACCOUNTS);
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
			List<FinancialMgmtAssetAccountsType> newFinancialMgmtAssetAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETACCOUNTS,
						newFinancialMgmtAssetAccounts));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroup</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetGroupType> getFinancialMgmtAssetGroup() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUP);
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
			List<FinancialMgmtAssetGroupType> newFinancialMgmtAssetGroup) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUP,
				newFinancialMgmtAssetGroup));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtAssetGroupAcct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtAssetGroupAcct</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtAssetGroupAcctType> getFinancialMgmtAssetGroupAcct() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUPACCT);
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
			List<FinancialMgmtAssetGroupAcctType> newFinancialMgmtAssetGroupAcct) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUPACCT,
						newFinancialMgmtAssetGroupAcct));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankFileFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankFileFormat</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBankFileFormatType> getFinancialMgmtBankFileFormat() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKFILEFORMAT);
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
			List<FinancialMgmtBankFileFormatType> newFinancialMgmtBankFileFormat) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKFILEFORMAT,
						newFinancialMgmtBankFileFormat));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBankStatementType> getFinancialMgmtBankStatement() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENT);
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
			List<FinancialMgmtBankStatementType> newFinancialMgmtBankStatement) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENT,
						newFinancialMgmtBankStatement));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBankStatementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBankStatementLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBankStatementLineType> getFinancialMgmtBankStatementLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENTLINE);
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
			List<FinancialMgmtBankStatementLineType> newFinancialMgmtBankStatementLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENTLINE,
						newFinancialMgmtBankStatementLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBudget</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudget</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBudgetType> getFinancialMgmtBudget() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGET);
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
			List<FinancialMgmtBudgetType> newFinancialMgmtBudget) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGET,
				newFinancialMgmtBudget));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtBudgetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtBudgetLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtBudgetLineType> getFinancialMgmtBudgetLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGETLINE);
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
			List<FinancialMgmtBudgetLineType> newFinancialMgmtBudgetLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGETLINE,
				newFinancialMgmtBudgetLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCalendar</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCalendar</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtCalendarType> getFinancialMgmtCalendar() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCALENDAR);
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
			List<FinancialMgmtCalendarType> newFinancialMgmtCalendar) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCALENDAR,
				newFinancialMgmtCalendar));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBook</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBook</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtCashBookType> getFinancialMgmtCashBook() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOK);
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
			List<FinancialMgmtCashBookType> newFinancialMgmtCashBook) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOK,
				newFinancialMgmtCashBook));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashBookAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashBookAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtCashBookAccountsType> getFinancialMgmtCashBookAccounts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOKACCOUNTS);
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
			List<FinancialMgmtCashBookAccountsType> newFinancialMgmtCashBookAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOKACCOUNTS,
						newFinancialMgmtCashBookAccounts));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtCashJournal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtCashJournal</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtCashJournalType> getFinancialMgmtCashJournal() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHJOURNAL);
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
			List<FinancialMgmtCashJournalType> newFinancialMgmtCashJournal) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHJOURNAL,
						newFinancialMgmtCashJournal));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDPManagementType> getFinancialMgmtDPManagement() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENT);
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
			List<FinancialMgmtDPManagementType> newFinancialMgmtDPManagement) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENT,
						newFinancialMgmtDPManagement));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDPManagementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDPManagementLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDPManagementLineType> getFinancialMgmtDPManagementLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENTLINE);
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
			List<FinancialMgmtDPManagementLineType> newFinancialMgmtDPManagementLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENTLINE,
						newFinancialMgmtDPManagementLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPayment</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentType> getFinancialMgmtDebtPayment() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENT);
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
			List<FinancialMgmtDebtPaymentType> newFinancialMgmtDebtPayment) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENT,
						newFinancialMgmtDebtPayment));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalReplace</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalReplace</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentBalReplaceType> getFinancialMgmtDebtPaymentBalReplace() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALREPLACE);
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
			List<FinancialMgmtDebtPaymentBalReplaceType> newFinancialMgmtDebtPaymentBalReplace) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALREPLACE,
						newFinancialMgmtDebtPaymentBalReplace));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentBalancing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentBalancing</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentBalancingType> getFinancialMgmtDebtPaymentBalancing() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALANCING);
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
			List<FinancialMgmtDebtPaymentBalancingType> newFinancialMgmtDebtPaymentBalancing) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALANCING,
						newFinancialMgmtDebtPaymentBalancing));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentCancelV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentCancelV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentCancelVType> getFinancialMgmtDebtPaymentCancelV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTCANCELV);
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
			List<FinancialMgmtDebtPaymentCancelVType> newFinancialMgmtDebtPaymentCancelV) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTCANCELV,
						newFinancialMgmtDebtPaymentCancelV));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDebtPaymentGenerateV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDebtPaymentGenerateV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDebtPaymentGenerateVType> getFinancialMgmtDebtPaymentGenerateV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTGENERATEV);
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
			List<FinancialMgmtDebtPaymentGenerateVType> newFinancialMgmtDebtPaymentGenerateV) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTGENERATEV,
						newFinancialMgmtDebtPaymentGenerateV));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtDimension</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtDimensionType> getFinancialMgmtDimension() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDIMENSION);
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
			List<FinancialMgmtDimensionType> newFinancialMgmtDimension) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTDIMENSION,
				newFinancialMgmtDimension));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementType> getFinancialMgmtElement() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENT);
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
			List<FinancialMgmtElementType> newFinancialMgmtElement) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENT,
				newFinancialMgmtElement));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValue</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementValueType> getFinancialMgmtElementValue() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUE);
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
			List<FinancialMgmtElementValueType> newFinancialMgmtElementValue) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUE,
						newFinancialMgmtElementValue));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueOperand</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueOperand</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementValueOperandType> getFinancialMgmtElementValueOperand() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUEOPERAND);
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
			List<FinancialMgmtElementValueOperandType> newFinancialMgmtElementValueOperand) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUEOPERAND,
						newFinancialMgmtElementValueOperand));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtElementValueTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtElementValueTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtElementValueTrlType> getFinancialMgmtElementValueTrl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUETRL);
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
			List<FinancialMgmtElementValueTrlType> newFinancialMgmtElementValueTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUETRL,
						newFinancialMgmtElementValueTrl));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtFinAccPaymentMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtFinAccPaymentMethod</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtFinAccPaymentMethodType> getFinancialMgmtFinAccPaymentMethod() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTFINACCPAYMENTMETHOD);
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
			List<FinancialMgmtFinAccPaymentMethodType> newFinancialMgmtFinAccPaymentMethod) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTFINACCPAYMENTMETHOD,
						newFinancialMgmtFinAccPaymentMethod));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLBatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLBatch</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLBatchType> getFinancialMgmtGLBatch() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLBATCH);
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
			List<FinancialMgmtGLBatchType> newFinancialMgmtGLBatch) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLBATCH,
				newFinancialMgmtGLBatch));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLCategory</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLCategoryType> getFinancialMgmtGLCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCATEGORY);
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
			List<FinancialMgmtGLCategoryType> newFinancialMgmtGLCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCATEGORY,
				newFinancialMgmtGLCategory));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLCharge</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLCharge</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLChargeType> getFinancialMgmtGLCharge() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGE);
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
			List<FinancialMgmtGLChargeType> newFinancialMgmtGLCharge) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGE,
				newFinancialMgmtGLCharge));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLChargeAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLChargeAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLChargeAccountsType> getFinancialMgmtGLChargeAccounts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGEACCOUNTS);
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
			List<FinancialMgmtGLChargeAccountsType> newFinancialMgmtGLChargeAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGEACCOUNTS,
						newFinancialMgmtGLChargeAccounts));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItem</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLItemType> getFinancialMgmtGLItem() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEM);
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
			List<FinancialMgmtGLItemType> newFinancialMgmtGLItem) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEM,
				newFinancialMgmtGLItem));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLItemAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLItemAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLItemAccountsType> getFinancialMgmtGLItemAccounts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEMACCOUNTS);
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
			List<FinancialMgmtGLItemAccountsType> newFinancialMgmtGLItemAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEMACCOUNTS,
						newFinancialMgmtGLItemAccounts));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournal</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLJournalType> getFinancialMgmtGLJournal() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNAL);
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
			List<FinancialMgmtGLJournalType> newFinancialMgmtGLJournal) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNAL,
				newFinancialMgmtGLJournal));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtGLJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtGLJournalLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtGLJournalLineType> getFinancialMgmtGLJournalLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNALLINE);
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
			List<FinancialMgmtGLJournalLineType> newFinancialMgmtGLJournalLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNALLINE,
						newFinancialMgmtGLJournalLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtIncoterms</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtIncoterms</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtIncotermsType> getFinancialMgmtIncoterms() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTINCOTERMS);
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
			List<FinancialMgmtIncotermsType> newFinancialMgmtIncoterms) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTINCOTERMS,
				newFinancialMgmtIncoterms));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtJournalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtJournalLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtJournalLineType> getFinancialMgmtJournalLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTJOURNALLINE);
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
			List<FinancialMgmtJournalLineType> newFinancialMgmtJournalLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTJOURNALLINE,
						newFinancialMgmtJournalLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtMatchingAlgorithm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtMatchingAlgorithm</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtMatchingAlgorithmType> getFinancialMgmtMatchingAlgorithm() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTMATCHINGALGORITHM);
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
			List<FinancialMgmtMatchingAlgorithmType> newFinancialMgmtMatchingAlgorithm) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTMATCHINGALGORITHM,
						newFinancialMgmtMatchingAlgorithm));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtNonBusinessDay</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtNonBusinessDay</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtNonBusinessDayType> getFinancialMgmtNonBusinessDay() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTNONBUSINESSDAY);
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
			List<FinancialMgmtNonBusinessDayType> newFinancialMgmtNonBusinessDay) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTNONBUSINESSDAY,
						newFinancialMgmtNonBusinessDay));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionHistoryV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionHistoryV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentExecutionHistoryVType> getFinancialMgmtPaymentExecutionHistoryV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONHISTORYV);
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
			List<FinancialMgmtPaymentExecutionHistoryVType> newFinancialMgmtPaymentExecutionHistoryV) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONHISTORYV,
						newFinancialMgmtPaymentExecutionHistoryV));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionProcess</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentExecutionProcessType> getFinancialMgmtPaymentExecutionProcess() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESS);
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
			List<FinancialMgmtPaymentExecutionProcessType> newFinancialMgmtPaymentExecutionProcess) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESS,
						newFinancialMgmtPaymentExecutionProcess));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentExecutionProcessParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentExecutionProcessParameter</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentExecutionProcessParameterType> getFinancialMgmtPaymentExecutionProcessParameter() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER);
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
			List<FinancialMgmtPaymentExecutionProcessParameterType> newFinancialMgmtPaymentExecutionProcessParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER,
						newFinancialMgmtPaymentExecutionProcessParameter));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRun</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentRunType> getFinancialMgmtPaymentRun() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUN);
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
			List<FinancialMgmtPaymentRunType> newFinancialMgmtPaymentRun) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUN,
				newFinancialMgmtPaymentRun));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunParameter</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentRunParameterType> getFinancialMgmtPaymentRunParameter() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPARAMETER);
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
			List<FinancialMgmtPaymentRunParameterType> newFinancialMgmtPaymentRunParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPARAMETER,
						newFinancialMgmtPaymentRunParameter));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentRunPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentRunPayment</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentRunPaymentType> getFinancialMgmtPaymentRunPayment() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPAYMENT);
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
			List<FinancialMgmtPaymentRunPaymentType> newFinancialMgmtPaymentRunPayment) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPAYMENT,
						newFinancialMgmtPaymentRunPayment));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTerm</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTerm</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentTermType> getFinancialMgmtPaymentTerm() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERM);
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
			List<FinancialMgmtPaymentTermType> newFinancialMgmtPaymentTerm) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERM,
						newFinancialMgmtPaymentTerm));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentTermLineType> getFinancialMgmtPaymentTermLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMLINE);
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
			List<FinancialMgmtPaymentTermLineType> newFinancialMgmtPaymentTermLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMLINE,
						newFinancialMgmtPaymentTermLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPaymentTermTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPaymentTermTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPaymentTermTrlType> getFinancialMgmtPaymentTermTrl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMTRL);
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
			List<FinancialMgmtPaymentTermTrlType> newFinancialMgmtPaymentTermTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMTRL,
						newFinancialMgmtPaymentTermTrl));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriod</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPeriodType> getFinancialMgmtPeriod() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIOD);
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
			List<FinancialMgmtPeriodType> newFinancialMgmtPeriod) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIOD,
				newFinancialMgmtPeriod));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPeriodControlType> getFinancialMgmtPeriodControl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROL);
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
			List<FinancialMgmtPeriodControlType> newFinancialMgmtPeriodControl) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROL,
						newFinancialMgmtPeriodControl));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPeriodControlV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPeriodControlV</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPeriodControlVType> getFinancialMgmtPeriodControlV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROLV);
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
			List<FinancialMgmtPeriodControlVType> newFinancialMgmtPeriodControlV) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROLV,
						newFinancialMgmtPeriodControlV));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtPromissoryFormat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtPromissoryFormat</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtPromissoryFormatType> getFinancialMgmtPromissoryFormat() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPROMISSORYFORMAT);
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
			List<FinancialMgmtPromissoryFormatType> newFinancialMgmtPromissoryFormat) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTPROMISSORYFORMAT,
						newFinancialMgmtPromissoryFormat));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittance</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtRemittanceType> getFinancialMgmtRemittance() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCE);
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
			List<FinancialMgmtRemittanceType> newFinancialMgmtRemittance) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCE,
				newFinancialMgmtRemittance));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceLine</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtRemittanceLineType> getFinancialMgmtRemittanceLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCELINE);
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
			List<FinancialMgmtRemittanceLineType> newFinancialMgmtRemittanceLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCELINE,
						newFinancialMgmtRemittanceLine));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceParameter</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtRemittanceParameterType> getFinancialMgmtRemittanceParameter() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCEPARAMETER);
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
			List<FinancialMgmtRemittanceParameterType> newFinancialMgmtRemittanceParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCEPARAMETER,
						newFinancialMgmtRemittanceParameter));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtRemittanceType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtRemittanceType</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtRemittanceTypeType> getFinancialMgmtRemittanceType() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCETYPE);
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
			List<FinancialMgmtRemittanceTypeType> newFinancialMgmtRemittanceType) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCETYPE,
						newFinancialMgmtRemittanceType));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtSettlement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtSettlement</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtSettlementType> getFinancialMgmtSettlement() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTSETTLEMENT);
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
			List<FinancialMgmtSettlementType> newFinancialMgmtSettlement) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTSETTLEMENT,
				newFinancialMgmtSettlement));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxCategory</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxCategoryType> getFinancialMgmtTaxCategory() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORY);
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
			List<FinancialMgmtTaxCategoryType> newFinancialMgmtTaxCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORY,
						newFinancialMgmtTaxCategory));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxCategoryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxCategoryTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxCategoryTrlType> getFinancialMgmtTaxCategoryTrl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORYTRL);
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
			List<FinancialMgmtTaxCategoryTrlType> newFinancialMgmtTaxCategoryTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORYTRL,
						newFinancialMgmtTaxCategoryTrl));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxPayment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxPayment</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxPaymentType> getFinancialMgmtTaxPayment() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXPAYMENT);
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
			List<FinancialMgmtTaxPaymentType> newFinancialMgmtTaxPayment) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXPAYMENT,
				newFinancialMgmtTaxPayment));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRate</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRateType> getFinancialMgmtTaxRate() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATE);
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
			List<FinancialMgmtTaxRateType> newFinancialMgmtTaxRate) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATE,
				newFinancialMgmtTaxRate));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRateAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRateAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRateAccountsType> getFinancialMgmtTaxRateAccounts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATEACCOUNTS);
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
			List<FinancialMgmtTaxRateAccountsType> newFinancialMgmtTaxRateAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATEACCOUNTS,
						newFinancialMgmtTaxRateAccounts));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegister</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegister</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterType> getFinancialMgmtTaxRegister() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTER);
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
			List<FinancialMgmtTaxRegisterType> newFinancialMgmtTaxRegister) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTER,
						newFinancialMgmtTaxRegister));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterType</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterTypeType> getFinancialMgmtTaxRegisterType() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPE);
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
			List<FinancialMgmtTaxRegisterTypeType> newFinancialMgmtTaxRegisterType) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPE,
						newFinancialMgmtTaxRegisterType));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterTypeLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterTypeLines</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterTypeLinesType> getFinancialMgmtTaxRegisterTypeLines() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPELINES);
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
			List<FinancialMgmtTaxRegisterTypeLinesType> newFinancialMgmtTaxRegisterTypeLines) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPELINES,
						newFinancialMgmtTaxRegisterTypeLines));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxRegisterline</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxRegisterline</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxRegisterlineType> getFinancialMgmtTaxRegisterline() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERLINE);
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
			List<FinancialMgmtTaxRegisterlineType> newFinancialMgmtTaxRegisterline) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERLINE,
						newFinancialMgmtTaxRegisterline));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxReport</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxReport</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxReportType> getFinancialMgmtTaxReport() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREPORT);
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
			List<FinancialMgmtTaxReportType> newFinancialMgmtTaxReport) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREPORT,
				newFinancialMgmtTaxReport));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxTrl</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxTrlType> getFinancialMgmtTaxTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXTRL);
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
			List<FinancialMgmtTaxTrlType> newFinancialMgmtTaxTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXTRL,
				newFinancialMgmtTaxTrl));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtTaxZone</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtTaxZone</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtTaxZoneType> getFinancialMgmtTaxZone() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXZONE);
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
			List<FinancialMgmtTaxZoneType> newFinancialMgmtTaxZone) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXZONE,
				newFinancialMgmtTaxZone));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholding</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholding</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtWithholdingType> getFinancialMgmtWithholding() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDING);
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
			List<FinancialMgmtWithholdingType> newFinancialMgmtWithholding) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDING,
						newFinancialMgmtWithholding));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtWithholdingAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtWithholdingAccounts</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtWithholdingAccountsType> getFinancialMgmtWithholdingAccounts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDINGACCOUNTS);
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
			List<FinancialMgmtWithholdingAccountsType> newFinancialMgmtWithholdingAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDINGACCOUNTS,
						newFinancialMgmtWithholdingAccounts));
	}

	/**
	 * Returns the value of '<em><b>financialMgmtYear</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>financialMgmtYear</b></em>' feature
	 * @generated
	 */
	public List<FinancialMgmtYearType> getFinancialMgmtYear() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTYEAR);
	}

	/**
	 * Sets the '{@link OpenbravoType#getFinancialMgmtYear() <em>financialMgmtYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getFinancialMgmtYear() financialMgmtYear}' feature.
	 * @generated
	 */
	public void setFinancialMgmtYear(
			List<FinancialMgmtYearType> newFinancialMgmtYear) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.FINANCIALMGMTYEAR,
				newFinancialMgmtYear));
	}

	/**
	 * Returns the value of '<em><b>greeting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greeting</b></em>' feature
	 * @generated
	 */
	public List<GreetingType> getGreeting() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.GREETING);
	}

	/**
	 * Sets the '{@link OpenbravoType#getGreeting() <em>greeting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getGreeting() greeting}' feature.
	 * @generated
	 */
	public void setGreeting(List<GreetingType> newGreeting) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.GREETING, newGreeting));
	}

	/**
	 * Returns the value of '<em><b>greetingTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greetingTrl</b></em>' feature
	 * @generated
	 */
	public List<GreetingTrlType> getGreetingTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.GREETINGTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getGreetingTrl() <em>greetingTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getGreetingTrl() greetingTrl}' feature.
	 * @generated
	 */
	public void setGreetingTrl(List<GreetingTrlType> newGreetingTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.GREETINGTRL,
				newGreetingTrl));
	}

	/**
	 * Returns the value of '<em><b>invoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoice</b></em>' feature
	 * @generated
	 */
	public List<InvoiceType> getInvoice() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.INVOICE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(List<InvoiceType> newInvoice) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICE, newInvoice));
	}

	/**
	 * Returns the value of '<em><b>invoiceDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceDiscount</b></em>' feature
	 * @generated
	 */
	public List<InvoiceDiscountType> getInvoiceDiscount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICEDISCOUNT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceDiscount() <em>invoiceDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceDiscount() invoiceDiscount}' feature.
	 * @generated
	 */
	public void setInvoiceDiscount(List<InvoiceDiscountType> newInvoiceDiscount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICEDISCOUNT,
				newInvoiceDiscount));
	}

	/**
	 * Returns the value of '<em><b>invoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLine</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineType> getInvoiceLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLine() <em>invoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLine() invoiceLine}' feature.
	 * @generated
	 */
	public void setInvoiceLine(List<InvoiceLineType> newInvoiceLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINE,
				newInvoiceLine));
	}

	/**
	 * Returns the value of '<em><b>invoiceLineAccountingDimension</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineAccountingDimension</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineAccountingDimensionType> getInvoiceLineAccountingDimension() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINEACCOUNTINGDIMENSION);
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
			List<InvoiceLineAccountingDimensionType> newInvoiceLineAccountingDimension) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINEACCOUNTINGDIMENSION,
						newInvoiceLineAccountingDimension));
	}

	/**
	 * Returns the value of '<em><b>invoiceLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineOffer</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineOfferType> getInvoiceLineOffer() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINEOFFER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLineOffer() <em>invoiceLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLineOffer() invoiceLineOffer}' feature.
	 * @generated
	 */
	public void setInvoiceLineOffer(
			List<InvoiceLineOfferType> newInvoiceLineOffer) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINEOFFER,
				newInvoiceLineOffer));
	}

	/**
	 * Returns the value of '<em><b>invoiceLineTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceLineTax</b></em>' feature
	 * @generated
	 */
	public List<InvoiceLineTaxType> getInvoiceLineTax() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINETAX);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceLineTax() <em>invoiceLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceLineTax() invoiceLineTax}' feature.
	 * @generated
	 */
	public void setInvoiceLineTax(List<InvoiceLineTaxType> newInvoiceLineTax) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICELINETAX,
				newInvoiceLineTax));
	}

	/**
	 * Returns the value of '<em><b>invoiceSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceSchedule</b></em>' feature
	 * @generated
	 */
	public List<InvoiceScheduleType> getInvoiceSchedule() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICESCHEDULE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceSchedule() <em>invoiceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceSchedule() invoiceSchedule}' feature.
	 * @generated
	 */
	public void setInvoiceSchedule(List<InvoiceScheduleType> newInvoiceSchedule) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICESCHEDULE,
				newInvoiceSchedule));
	}

	/**
	 * Returns the value of '<em><b>invoiceTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceTax</b></em>' feature
	 * @generated
	 */
	public List<InvoiceTaxType> getInvoiceTax() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.INVOICETAX);
	}

	/**
	 * Sets the '{@link OpenbravoType#getInvoiceTax() <em>invoiceTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getInvoiceTax() invoiceTax}' feature.
	 * @generated
	 */
	public void setInvoiceTax(List<InvoiceTaxType> newInvoiceTax) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.INVOICETAX,
				newInvoiceTax));
	}

	/**
	 * Returns the value of '<em><b>location</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>location</b></em>' feature
	 * @generated
	 */
	public List<LocationType> getLocation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.LOCATION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getLocation() <em>location</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLocation() location}' feature.
	 * @generated
	 */
	public void setLocation(List<LocationType> newLocation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.LOCATION, newLocation));
	}

	/**
	 * Returns the value of '<em><b>locator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locator</b></em>' feature
	 * @generated
	 */
	public List<LocatorType> getLocator() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.LOCATOR);
	}

	/**
	 * Sets the '{@link OpenbravoType#getLocator() <em>locator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLocator() locator}' feature.
	 * @generated
	 */
	public void setLocator(List<LocatorType> newLocator) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.LOCATOR, newLocator));
	}

	/**
	 * Returns the value of '<em><b>lot</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lot</b></em>' feature
	 * @generated
	 */
	public List<LotType> getLot() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.LOT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getLot() <em>lot</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLot() lot}' feature.
	 * @generated
	 */
	public void setLot(List<LotType> newLot) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.LOT, newLot));
	}

	/**
	 * Returns the value of '<em><b>lotControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lotControl</b></em>' feature
	 * @generated
	 */
	public List<LotControlType> getLotControl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.LOTCONTROL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getLotControl() <em>lotControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getLotControl() lotControl}' feature.
	 * @generated
	 */
	public void setLotControl(List<LotControlType> newLotControl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.LOTCONTROL,
				newLotControl));
	}

	/**
	 * Returns the value of '<em><b>mRPPlanner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanner</b></em>' feature
	 * @generated
	 */
	public List<MRPPlannerType> getMRPPlanner() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.MRPPLANNER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPlanner() <em>mRPPlanner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPlanner() mRPPlanner}' feature.
	 * @generated
	 */
	public void setMRPPlanner(List<MRPPlannerType> newMRPPlanner) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPLANNER,
				newMRPPlanner));
	}

	/**
	 * Returns the value of '<em><b>mRPPlanningMethod</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanningMethod</b></em>' feature
	 * @generated
	 */
	public List<MRPPlanningMethodType> getMRPPlanningMethod() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHOD);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPlanningMethod() <em>mRPPlanningMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPlanningMethod() mRPPlanningMethod}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethod(
			List<MRPPlanningMethodType> newMRPPlanningMethod) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHOD,
				newMRPPlanningMethod));
	}

	/**
	 * Returns the value of '<em><b>mRPPlanningMethodLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPlanningMethodLine</b></em>' feature
	 * @generated
	 */
	public List<MRPPlanningMethodLineType> getMRPPlanningMethodLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHODLINE);
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
			List<MRPPlanningMethodLineType> newMRPPlanningMethodLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHODLINE,
				newMRPPlanningMethodLine));
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRun</b></em>' feature
	 * @generated
	 */
	public List<MRPProductionRunType> getMRPProductionRun() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPProductionRun() <em>mRPProductionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPProductionRun() mRPProductionRun}' feature.
	 * @generated
	 */
	public void setMRPProductionRun(
			List<MRPProductionRunType> newMRPProductionRun) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUN,
				newMRPProductionRun));
	}

	/**
	 * Returns the value of '<em><b>mRPProductionRunLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPProductionRunLine</b></em>' feature
	 * @generated
	 */
	public List<MRPProductionRunLineType> getMRPProductionRunLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUNLINE);
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
			List<MRPProductionRunLineType> newMRPProductionRunLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUNLINE,
				newMRPProductionRunLine));
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRun</b></em>' feature
	 * @generated
	 */
	public List<MRPPurchasingRunType> getMRPPurchasingRun() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPPurchasingRun() <em>mRPPurchasingRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPPurchasingRun() mRPPurchasingRun}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRun(
			List<MRPPurchasingRunType> newMRPPurchasingRun) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUN,
				newMRPPurchasingRun));
	}

	/**
	 * Returns the value of '<em><b>mRPPurchasingRunLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPPurchasingRunLine</b></em>' feature
	 * @generated
	 */
	public List<MRPPurchasingRunLineType> getMRPPurchasingRunLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUNLINE);
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
			List<MRPPurchasingRunLineType> newMRPPurchasingRunLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUNLINE,
				newMRPPurchasingRunLine));
	}

	/**
	 * Returns the value of '<em><b>mRPSalesForecast</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecast</b></em>' feature
	 * @generated
	 */
	public List<MRPSalesForecastType> getMRPSalesForecast() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPSALESFORECAST);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMRPSalesForecast() <em>mRPSalesForecast</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMRPSalesForecast() mRPSalesForecast}' feature.
	 * @generated
	 */
	public void setMRPSalesForecast(
			List<MRPSalesForecastType> newMRPSalesForecast) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPSALESFORECAST,
				newMRPSalesForecast));
	}

	/**
	 * Returns the value of '<em><b>mRPSalesForecastLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mRPSalesForecastLine</b></em>' feature
	 * @generated
	 */
	public List<MRPSalesForecastLineType> getMRPSalesForecastLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MRPSALESFORECASTLINE);
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
			List<MRPSalesForecastLineType> newMRPSalesForecastLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MRPSALESFORECASTLINE,
				newMRPSalesForecastLine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingActivity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingActivity</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingActivityType> getManufacturingActivity() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITY);
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
			List<ManufacturingActivityType> newManufacturingActivity) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITY,
				newManufacturingActivity));
	}

	/**
	 * Returns the value of '<em><b>manufacturingActivityToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingActivityToolset</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingActivityToolsetType> getManufacturingActivityToolset() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITYTOOLSET);
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
			List<ManufacturingActivityToolsetType> newManufacturingActivityToolset) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITYTOOLSET,
						newManufacturingActivityToolset));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCase</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCaseType> getManufacturingCase() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCASE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingCase() <em>manufacturingCase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingCase() manufacturingCase}' feature.
	 * @generated
	 */
	public void setManufacturingCase(
			List<ManufacturingCaseType> newManufacturingCase) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCASE,
				newManufacturingCase));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCheckPoint</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPoint</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCheckPointType> getManufacturingCheckPoint() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINT);
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
			List<ManufacturingCheckPointType> newManufacturingCheckPoint) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINT,
				newManufacturingCheckPoint));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCheckPointSet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPointSet</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCheckPointSetType> getManufacturingCheckPointSet() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSET);
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
			List<ManufacturingCheckPointSetType> newManufacturingCheckPointSet) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSET,
						newManufacturingCheckPointSet));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCheckPointShift</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCheckPointShift</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCheckPointShiftType> getManufacturingCheckPointShift() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSHIFT);
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
			List<ManufacturingCheckPointShiftType> newManufacturingCheckPointShift) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSHIFT,
						newManufacturingCheckPointShift));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostCenter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostCenter</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostCenterType> getManufacturingCostCenter() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTER);
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
			List<ManufacturingCostCenterType> newManufacturingCostCenter) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTER,
				newManufacturingCostCenter));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostCenterMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostCenterMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostCenterMachineType> getManufacturingCostCenterMachine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERMACHINE);
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
			List<ManufacturingCostCenterMachineType> newManufacturingCostCenterMachine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERMACHINE,
						newManufacturingCostCenterMachine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostcenterEmployeeType> getManufacturingCostcenterEmployee() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTEREMPLOYEE);
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
			List<ManufacturingCostcenterEmployeeType> newManufacturingCostcenterEmployee) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTEREMPLOYEE,
						newManufacturingCostcenterEmployee));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterIC</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterIC</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostcenterICType> getManufacturingCostcenterIC() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERIC);
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
			List<ManufacturingCostcenterICType> newManufacturingCostcenterIC) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERIC,
						newManufacturingCostcenterIC));
	}

	/**
	 * Returns the value of '<em><b>manufacturingCostcenterVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingCostcenterVersion</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingCostcenterVersionType> getManufacturingCostcenterVersion() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERVERSION);
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
			List<ManufacturingCostcenterVersionType> newManufacturingCostcenterVersion) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERVERSION,
						newManufacturingCostcenterVersion));
	}

	/**
	 * Returns the value of '<em><b>manufacturingGlobalUse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingGlobalUse</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingGlobalUseType> getManufacturingGlobalUse() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGGLOBALUSE);
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
			List<ManufacturingGlobalUseType> newManufacturingGlobalUse) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGGLOBALUSE,
				newManufacturingGlobalUse));
	}

	/**
	 * Returns the value of '<em><b>manufacturingIncidence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIncidence</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingIncidenceType> getManufacturingIncidence() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGINCIDENCE);
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
			List<ManufacturingIncidenceType> newManufacturingIncidence) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGINCIDENCE,
				newManufacturingIncidence));
	}

	/**
	 * Returns the value of '<em><b>manufacturingIndirectCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIndirectCost</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingIndirectCostType> getManufacturingIndirectCost() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOST);
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
			List<ManufacturingIndirectCostType> newManufacturingIndirectCost) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOST,
						newManufacturingIndirectCost));
	}

	/**
	 * Returns the value of '<em><b>manufacturingIndirectCostValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingIndirectCostValue</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingIndirectCostValueType> getManufacturingIndirectCostValue() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOSTVALUE);
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
			List<ManufacturingIndirectCostValueType> newManufacturingIndirectCostValue) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOSTVALUE,
						newManufacturingIndirectCostValue));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMachineType> getManufacturingMachine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINE);
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
			List<ManufacturingMachineType> newManufacturingMachine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINE,
				newManufacturingMachine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineCost</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMachineCostType> getManufacturingMachineCost() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINECOST);
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
			List<ManufacturingMachineCostType> newManufacturingMachineCost) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINECOST,
						newManufacturingMachineCost));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineStation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineStation</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMachineStationType> getManufacturingMachineStation() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINESTATION);
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
			List<ManufacturingMachineStationType> newManufacturingMachineStation) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINESTATION,
						newManufacturingMachineStation));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMachineType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMachineType</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMachineTypeType> getManufacturingMachineType() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINETYPE);
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
			List<ManufacturingMachineTypeType> newManufacturingMachineType) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINETYPE,
						newManufacturingMachineType));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMainteanceOrder</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMainteanceOrder</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMainteanceOrderType> getManufacturingMainteanceOrder() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTEANCEORDER);
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
			List<ManufacturingMainteanceOrderType> newManufacturingMainteanceOrder) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTEANCEORDER,
						newManufacturingMainteanceOrder));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenance</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceType> getManufacturingMaintenance() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCE);
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
			List<ManufacturingMaintenanceType> newManufacturingMaintenance) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCE,
						newManufacturingMaintenance));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenancePeriodicity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenancePeriodicity</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenancePeriodicityType> getManufacturingMaintenancePeriodicity() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEPERIODICITY);
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
			List<ManufacturingMaintenancePeriodicityType> newManufacturingMaintenancePeriodicity) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEPERIODICITY,
						newManufacturingMaintenancePeriodicity));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceSchedule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceSchedule</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceScheduleType> getManufacturingMaintenanceSchedule() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCESCHEDULE);
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
			List<ManufacturingMaintenanceScheduleType> newManufacturingMaintenanceSchedule) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCESCHEDULE,
						newManufacturingMaintenanceSchedule));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceTask</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceTaskType> getManufacturingMaintenanceTask() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCETASK);
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
			List<ManufacturingMaintenanceTaskType> newManufacturingMaintenanceTask) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCETASK,
						newManufacturingMaintenanceTask));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMaintenanceWorker</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMaintenanceWorker</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMaintenanceWorkerType> getManufacturingMaintenanceWorker() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEWORKER);
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
			List<ManufacturingMaintenanceWorkerType> newManufacturingMaintenanceWorker) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEWORKER,
						newManufacturingMaintenanceWorker));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureGroup</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureGroupType> getManufacturingMeasureGroup() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREGROUP);
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
			List<ManufacturingMeasureGroupType> newManufacturingMeasureGroup) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREGROUP,
						newManufacturingMeasureGroup));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureShift</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureShift</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureShiftType> getManufacturingMeasureShift() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURESHIFT);
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
			List<ManufacturingMeasureShiftType> newManufacturingMeasureShift) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURESHIFT,
						newManufacturingMeasureShift));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureTime</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureTimeType> getManufacturingMeasureTime() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURETIME);
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
			List<ManufacturingMeasureTimeType> newManufacturingMeasureTime) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURETIME,
						newManufacturingMeasureTime));
	}

	/**
	 * Returns the value of '<em><b>manufacturingMeasureValues</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingMeasureValues</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingMeasureValuesType> getManufacturingMeasureValues() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREVALUES);
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
			List<ManufacturingMeasureValuesType> newManufacturingMeasureValues) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREVALUES,
						newManufacturingMeasureValues));
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperation</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationType> getManufacturingOperation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATION);
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
			List<ManufacturingOperationType> newManufacturingOperation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATION,
				newManufacturingOperation));
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationEmployeeType> getManufacturingOperationEmployee() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONEMPLOYEE);
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
			List<ManufacturingOperationEmployeeType> newManufacturingOperationEmployee) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONEMPLOYEE,
						newManufacturingOperationEmployee));
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationIndirectCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationIndirectCost</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationIndirectCostType> getManufacturingOperationIndirectCost() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONINDIRECTCOST);
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
			List<ManufacturingOperationIndirectCostType> newManufacturingOperationIndirectCost) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONINDIRECTCOST,
						newManufacturingOperationIndirectCost));
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationMachineType> getManufacturingOperationMachine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONMACHINE);
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
			List<ManufacturingOperationMachineType> newManufacturingOperationMachine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONMACHINE,
						newManufacturingOperationMachine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingOperationProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingOperationProduct</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingOperationProductType> getManufacturingOperationProduct() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONPRODUCT);
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
			List<ManufacturingOperationProductType> newManufacturingOperationProduct) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONPRODUCT,
						newManufacturingOperationProduct));
	}

	/**
	 * Returns the value of '<em><b>manufacturingPeriodicControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingPeriodicControl</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingPeriodicControlType> getManufacturingPeriodicControl() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPERIODICCONTROL);
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
			List<ManufacturingPeriodicControlType> newManufacturingPeriodicControl) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPERIODICCONTROL,
						newManufacturingPeriodicControl));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProcessPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProcessPlan</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProcessPlanType> getManufacturingProcessPlan() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPROCESSPLAN);
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
			List<ManufacturingProcessPlanType> newManufacturingProcessPlan) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPROCESSPLAN,
						newManufacturingProcessPlan));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionLine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionLineType> getManufacturingProductionLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONLINE);
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
			List<ManufacturingProductionLineType> newManufacturingProductionLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONLINE,
						newManufacturingProductionLine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunEmployeeType> getManufacturingProductionRunEmployee() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNEMPLOYEE);
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
			List<ManufacturingProductionRunEmployeeType> newManufacturingProductionRunEmployee) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNEMPLOYEE,
						newManufacturingProductionRunEmployee));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunIndirectCosts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunIndirectCosts</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunIndirectCostsType> getManufacturingProductionRunIndirectCosts() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS);
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
			List<ManufacturingProductionRunIndirectCostsType> newManufacturingProductionRunIndirectCosts) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS,
						newManufacturingProductionRunIndirectCosts));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunInvoiceLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunInvoiceLine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunInvoiceLineType> getManufacturingProductionRunInvoiceLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINVOICELINE);
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
			List<ManufacturingProductionRunInvoiceLineType> newManufacturingProductionRunInvoiceLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINVOICELINE,
						newManufacturingProductionRunInvoiceLine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunMachine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunMachine</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunMachineType> getManufacturingProductionRunMachine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNMACHINE);
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
			List<ManufacturingProductionRunMachineType> newManufacturingProductionRunMachine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNMACHINE,
						newManufacturingProductionRunMachine));
	}

	/**
	 * Returns the value of '<em><b>manufacturingProductionRunToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingProductionRunToolset</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingProductionRunToolsetType> getManufacturingProductionRunToolset() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNTOOLSET);
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
			List<ManufacturingProductionRunToolsetType> newManufacturingProductionRunToolset) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNTOOLSET,
						newManufacturingProductionRunToolset));
	}

	/**
	 * Returns the value of '<em><b>manufacturingSection</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingSection</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingSectionType> getManufacturingSection() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGSECTION);
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
			List<ManufacturingSectionType> newManufacturingSection) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGSECTION,
				newManufacturingSection));
	}

	/**
	 * Returns the value of '<em><b>manufacturingTest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingTest</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingTestType> getManufacturingTest() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGTEST);
	}

	/**
	 * Sets the '{@link OpenbravoType#getManufacturingTest() <em>manufacturingTest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getManufacturingTest() manufacturingTest}' feature.
	 * @generated
	 */
	public void setManufacturingTest(
			List<ManufacturingTestType> newManufacturingTest) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGTEST,
				newManufacturingTest));
	}

	/**
	 * Returns the value of '<em><b>manufacturingToolset</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingToolset</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingToolsetType> getManufacturingToolset() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSET);
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
			List<ManufacturingToolsetType> newManufacturingToolset) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSET,
				newManufacturingToolset));
	}

	/**
	 * Returns the value of '<em><b>manufacturingToolsetType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingToolsetType</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingToolsetTypeType> getManufacturingToolsetType() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSETTYPE);
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
			List<ManufacturingToolsetTypeType> newManufacturingToolsetType) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSETTYPE,
						newManufacturingToolsetType));
	}

	/**
	 * Returns the value of '<em><b>manufacturingValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingValue</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingValueType> getManufacturingValue() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGVALUE);
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
			List<ManufacturingValueType> newManufacturingValue) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGVALUE,
				newManufacturingValue));
	}

	/**
	 * Returns the value of '<em><b>manufacturingVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingVersion</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingVersionType> getManufacturingVersion() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGVERSION);
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
			List<ManufacturingVersionType> newManufacturingVersion) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGVERSION,
				newManufacturingVersion));
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkCenter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkCenter</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkCenterType> getManufacturingWorkCenter() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKCENTER);
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
			List<ManufacturingWorkCenterType> newManufacturingWorkCenter) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKCENTER,
				newManufacturingWorkCenter));
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortEmployee</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortEmployee</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkEffortEmployeeType> getManufacturingWorkEffortEmployee() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTEMPLOYEE);
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
			List<ManufacturingWorkEffortEmployeeType> newManufacturingWorkEffortEmployee) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTEMPLOYEE,
						newManufacturingWorkEffortEmployee));
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkEffortIncidence</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkEffortIncidence</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkEffortIncidenceType> getManufacturingWorkEffortIncidence() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTINCIDENCE);
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
			List<ManufacturingWorkEffortIncidenceType> newManufacturingWorkEffortIncidence) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTINCIDENCE,
						newManufacturingWorkEffortIncidence));
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirement</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkRequirementType> getManufacturingWorkRequirement() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENT);
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
			List<ManufacturingWorkRequirementType> newManufacturingWorkRequirement) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENT,
						newManufacturingWorkRequirement));
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementOperation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementOperation</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkRequirementOperationType> getManufacturingWorkRequirementOperation() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTOPERATION);
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
			List<ManufacturingWorkRequirementOperationType> newManufacturingWorkRequirementOperation) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTOPERATION,
						newManufacturingWorkRequirementOperation));
	}

	/**
	 * Returns the value of '<em><b>manufacturingWorkRequirementProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>manufacturingWorkRequirementProduct</b></em>' feature
	 * @generated
	 */
	public List<ManufacturingWorkRequirementProductType> getManufacturingWorkRequirementProduct() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTPRODUCT);
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
			List<ManufacturingWorkRequirementProductType> newManufacturingWorkRequirementProduct) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTPRODUCT,
						newManufacturingWorkRequirementProduct));
	}

	/**
	 * Returns the value of '<em><b>marketingCampaign</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>marketingCampaign</b></em>' feature
	 * @generated
	 */
	public List<MarketingCampaignType> getMarketingCampaign() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MARKETINGCAMPAIGN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMarketingCampaign() <em>marketingCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMarketingCampaign() marketingCampaign}' feature.
	 * @generated
	 */
	public void setMarketingCampaign(
			List<MarketingCampaignType> newMarketingCampaign) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MARKETINGCAMPAIGN,
				newMarketingCampaign));
	}

	/**
	 * Returns the value of '<em><b>marketingChannel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>marketingChannel</b></em>' feature
	 * @generated
	 */
	public List<MarketingChannelType> getMarketingChannel() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MARKETINGCHANNEL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getMarketingChannel() <em>marketingChannel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getMarketingChannel() marketingChannel}' feature.
	 * @generated
	 */
	public void setMarketingChannel(
			List<MarketingChannelType> newMarketingChannel) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MARKETINGCHANNEL,
				newMarketingChannel));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtABCActivity</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtABCActivity</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtABCActivityType> getMaterialMgmtABCActivity() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTABCACTIVITY);
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
			List<MaterialMgmtABCActivityType> newMaterialMgmtABCActivity) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTABCACTIVITY,
				newMaterialMgmtABCActivity));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtCosting</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtCosting</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtCostingType> getMaterialMgmtCosting() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTCOSTING);
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
			List<MaterialMgmtCostingType> newMaterialMgmtCosting) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTCOSTING,
				newMaterialMgmtCosting));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumption</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumption</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInternalConsumptionType> getMaterialMgmtInternalConsumption() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTION);
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
			List<MaterialMgmtInternalConsumptionType> newMaterialMgmtInternalConsumption) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTION,
						newMaterialMgmtInternalConsumption));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalConsumptionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalConsumptionLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInternalConsumptionLineType> getMaterialMgmtInternalConsumptionLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTIONLINE);
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
			List<MaterialMgmtInternalConsumptionLineType> newMaterialMgmtInternalConsumptionLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTIONLINE,
						newMaterialMgmtInternalConsumptionLine));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovement</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovement</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInternalMovementType> getMaterialMgmtInternalMovement() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENT);
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
			List<MaterialMgmtInternalMovementType> newMaterialMgmtInternalMovement) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENT,
						newMaterialMgmtInternalMovement));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInternalMovementLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInternalMovementLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInternalMovementLineType> getMaterialMgmtInternalMovementLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENTLINE);
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
			List<MaterialMgmtInternalMovementLineType> newMaterialMgmtInternalMovementLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENTLINE,
						newMaterialMgmtInternalMovementLine));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCount</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInventoryCountType> getMaterialMgmtInventoryCount() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNT);
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
			List<MaterialMgmtInventoryCountType> newMaterialMgmtInventoryCount) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNT,
						newMaterialMgmtInventoryCount));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtInventoryCountLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtInventoryCountLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtInventoryCountLineType> getMaterialMgmtInventoryCountLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNTLINE);
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
			List<MaterialMgmtInventoryCountLineType> newMaterialMgmtInventoryCountLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNTLINE,
						newMaterialMgmtInventoryCountLine));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtMaterialTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtMaterialTransaction</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtMaterialTransactionType> getMaterialMgmtMaterialTransaction() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTMATERIALTRANSACTION);
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
			List<MaterialMgmtMaterialTransactionType> newMaterialMgmtMaterialTransaction) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTMATERIALTRANSACTION,
						newMaterialMgmtMaterialTransaction));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionPlan</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionPlan</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtProductionPlanType> getMaterialMgmtProductionPlan() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONPLAN);
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
			List<MaterialMgmtProductionPlanType> newMaterialMgmtProductionPlan) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONPLAN,
						newMaterialMgmtProductionPlan));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtProductionTransaction</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtProductionTransaction</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtProductionTransactionType> getMaterialMgmtProductionTransaction() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONTRANSACTION);
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
			List<MaterialMgmtProductionTransactionType> newMaterialMgmtProductionTransaction) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONTRANSACTION,
						newMaterialMgmtProductionTransaction));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOut</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOut</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtShipmentInOutType> getMaterialMgmtShipmentInOut() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUT);
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
			List<MaterialMgmtShipmentInOutType> newMaterialMgmtShipmentInOut) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUT,
						newMaterialMgmtShipmentInOut));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtShipmentInOutLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtShipmentInOutLine</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtShipmentInOutLineType> getMaterialMgmtShipmentInOutLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUTLINE);
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
			List<MaterialMgmtShipmentInOutLineType> newMaterialMgmtShipmentInOutLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUTLINE,
						newMaterialMgmtShipmentInOutLine));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStorageDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStorageDetail</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtStorageDetailType> getMaterialMgmtStorageDetail() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEDETAIL);
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
			List<MaterialMgmtStorageDetailType> newMaterialMgmtStorageDetail) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEDETAIL,
						newMaterialMgmtStorageDetail));
	}

	/**
	 * Returns the value of '<em><b>materialMgmtStoragePending</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>materialMgmtStoragePending</b></em>' feature
	 * @generated
	 */
	public List<MaterialMgmtStoragePendingType> getMaterialMgmtStoragePending() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEPENDING);
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
			List<MaterialMgmtStoragePendingType> newMaterialMgmtStoragePending) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEPENDING,
						newMaterialMgmtStoragePending));
	}

	/**
	 * Returns the value of '<em><b>modelImplementationParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>modelImplementationParameter</b></em>' feature
	 * @generated
	 */
	public List<ModelImplementationParameterType> getModelImplementationParameter() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.MODELIMPLEMENTATIONPARAMETER);
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
			List<ModelImplementationParameterType> newModelImplementationParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.MODELIMPLEMENTATIONPARAMETER,
						newModelImplementationParameter));
	}

	/**
	 * Returns the value of '<em><b>moduleDBPrefix</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleDBPrefix</b></em>' feature
	 * @generated
	 */
	public List<ModuleDBPrefixType> getModuleDBPrefix() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MODULEDBPREFIX);
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleDBPrefix() <em>moduleDBPrefix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleDBPrefix() moduleDBPrefix}' feature.
	 * @generated
	 */
	public void setModuleDBPrefix(List<ModuleDBPrefixType> newModuleDBPrefix) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MODULEDBPREFIX,
				newModuleDBPrefix));
	}

	/**
	 * Returns the value of '<em><b>moduleDependency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleDependency</b></em>' feature
	 * @generated
	 */
	public List<ModuleDependencyType> getModuleDependency() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.MODULEDEPENDENCY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleDependency() <em>moduleDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleDependency() moduleDependency}' feature.
	 * @generated
	 */
	public void setModuleDependency(
			List<ModuleDependencyType> newModuleDependency) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MODULEDEPENDENCY,
				newModuleDependency));
	}

	/**
	 * Returns the value of '<em><b>moduleLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleLog</b></em>' feature
	 * @generated
	 */
	public List<ModuleLogType> getModuleLog() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.MODULELOG);
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleLog() <em>moduleLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleLog() moduleLog}' feature.
	 * @generated
	 */
	public void setModuleLog(List<ModuleLogType> newModuleLog) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MODULELOG, newModuleLog));
	}

	/**
	 * Returns the value of '<em><b>moduleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleTrl</b></em>' feature
	 * @generated
	 */
	public List<ModuleTrlType> getModuleTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.MODULETRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getModuleTrl() <em>moduleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getModuleTrl() moduleTrl}' feature.
	 * @generated
	 */
	public void setModuleTrl(List<ModuleTrlType> newModuleTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.MODULETRL, newModuleTrl));
	}

	/**
	 * Returns the value of '<em><b>namingException</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>namingException</b></em>' feature
	 * @generated
	 */
	public List<NamingExceptionType> getNamingException() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.NAMINGEXCEPTION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getNamingException() <em>namingException</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getNamingException() namingException}' feature.
	 * @generated
	 */
	public void setNamingException(List<NamingExceptionType> newNamingException) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.NAMINGEXCEPTION,
				newNamingException));
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplate</b></em>' feature
	 * @generated
	 */
	public List<OBCLKERTemplateType> getOBCLKERTemplate() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCLKERTemplate() <em>oBCLKERTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCLKERTemplate() oBCLKERTemplate}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplate(List<OBCLKERTemplateType> newOBCLKERTemplate) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATE,
				newOBCLKERTemplate));
	}

	/**
	 * Returns the value of '<em><b>oBCLKERTemplateDependency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERTemplateDependency</b></em>' feature
	 * @generated
	 */
	public List<OBCLKERTemplateDependencyType> getOBCLKERTemplateDependency() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATEDEPENDENCY);
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
			List<OBCLKERTemplateDependencyType> newOBCLKERTemplateDependency) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATEDEPENDENCY,
						newOBCLKERTemplateDependency));
	}

	/**
	 * Returns the value of '<em><b>oBCLKERUIDefinition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCLKERUIDefinition</b></em>' feature
	 * @generated
	 */
	public List<OBCLKERUIDefinitionType> getOBCLKERUIDefinition() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBCLKERUIDEFINITION);
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
			List<OBCLKERUIDefinitionType> newOBCLKERUIDefinition) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBCLKERUIDEFINITION,
				newOBCLKERUIDefinition));
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumn</b></em>' feature
	 * @generated
	 */
	public List<OBCQLQueryColumnType> getOBCQLQueryColumn() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCQLQueryColumn() <em>oBCQLQueryColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCQLQueryColumn() oBCQLQueryColumn}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumn(
			List<OBCQLQueryColumnType> newOBCQLQueryColumn) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMN,
				newOBCQLQueryColumn));
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumnTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumnTrl</b></em>' feature
	 * @generated
	 */
	public List<OBCQLQueryColumnTrlType> getOBCQLQueryColumnTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMNTRL);
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
			List<OBCQLQueryColumnTrlType> newOBCQLQueryColumnTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMNTRL,
				newOBCQLQueryColumnTrl));
	}

	/**
	 * Returns the value of '<em><b>oBCQLWidgetQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLWidgetQuery</b></em>' feature
	 * @generated
	 */
	public List<OBCQLWidgetQueryType> getOBCQLWidgetQuery() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBCQLWIDGETQUERY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBCQLWidgetQuery() <em>oBCQLWidgetQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBCQLWidgetQuery() oBCQLWidgetQuery}' feature.
	 * @generated
	 */
	public void setOBCQLWidgetQuery(
			List<OBCQLWidgetQueryType> newOBCQLWidgetQuery) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBCQLWIDGETQUERY,
				newOBCQLWidgetQuery));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClass</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClass</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassType> getOBKMOWidgetClass() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetClass() <em>oBKMOWidgetClass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetClass() oBKMOWidgetClass}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClass(
			List<OBKMOWidgetClassType> newOBKMOWidgetClass) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASS,
				newOBKMOWidgetClass));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassAccess</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassAccessType> getOBKMOWidgetClassAccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSACCESS);
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
			List<OBKMOWidgetClassAccessType> newOBKMOWidgetClassAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSACCESS,
				newOBKMOWidgetClassAccess));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenu</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassMenuType> getOBKMOWidgetClassMenu() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENU);
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
			List<OBKMOWidgetClassMenuType> newOBKMOWidgetClassMenu) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENU,
				newOBKMOWidgetClassMenu));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassMenuTrl</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassMenuTrlType> getOBKMOWidgetClassMenuTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENUTRL);
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
			List<OBKMOWidgetClassMenuTrlType> newOBKMOWidgetClassMenuTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENUTRL,
				newOBKMOWidgetClassMenuTrl));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetClassTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetClassTrl</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetClassTrlType> getOBKMOWidgetClassTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSTRL);
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
			List<OBKMOWidgetClassTrlType> newOBKMOWidgetClassTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSTRL,
				newOBKMOWidgetClassTrl));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetInstance</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetInstanceType> getOBKMOWidgetInstance() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETINSTANCE);
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
			List<OBKMOWidgetInstanceType> newOBKMOWidgetInstance) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETINSTANCE,
				newOBKMOWidgetInstance));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetList</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetListType> getOBKMOWidgetList() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETLIST);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetList() <em>oBKMOWidgetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetList() oBKMOWidgetList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetList(List<OBKMOWidgetListType> newOBKMOWidgetList) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETLIST,
				newOBKMOWidgetList));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetReference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetReference</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetReferenceType> getOBKMOWidgetReference() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETREFERENCE);
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
			List<OBKMOWidgetReferenceType> newOBKMOWidgetReference) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETREFERENCE,
				newOBKMOWidgetReference));
	}

	/**
	 * Returns the value of '<em><b>oBKMOWidgetURL</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBKMOWidgetURL</b></em>' feature
	 * @generated
	 */
	public List<OBKMOWidgetURLType> getOBKMOWidgetURL() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETURL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBKMOWidgetURL() <em>oBKMOWidgetURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBKMOWidgetURL() oBKMOWidgetURL}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetURL(List<OBKMOWidgetURLType> newOBKMOWidgetURL) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBKMOWIDGETURL,
				newOBKMOWidgetURL));
	}

	/**
	 * Returns the value of '<em><b>oBSEIGDefaults</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSEIGDefaults</b></em>' feature
	 * @generated
	 */
	public List<OBSEIGDefaultsType> getOBSEIGDefaults() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBSEIGDEFAULTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBSEIGDefaults() <em>oBSEIGDefaults</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBSEIGDefaults() oBSEIGDefaults}' feature.
	 * @generated
	 */
	public void setOBSEIGDefaults(List<OBSEIGDefaultsType> newOBSEIGDefaults) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBSEIGDEFAULTS,
				newOBSEIGDefaults));
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasource</b></em>' feature
	 * @generated
	 */
	public List<OBSERDSDatasourceType> getOBSERDSDatasource() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBSERDSDatasource() <em>oBSERDSDatasource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBSERDSDatasource() oBSERDSDatasource}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasource(
			List<OBSERDSDatasourceType> newOBSERDSDatasource) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCE,
				newOBSERDSDatasource));
	}

	/**
	 * Returns the value of '<em><b>oBSERDSDatasourceField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSERDSDatasourceField</b></em>' feature
	 * @generated
	 */
	public List<OBSERDSDatasourceFieldType> getOBSERDSDatasourceField() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCEFIELD);
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
			List<OBSERDSDatasourceFieldType> newOBSERDSDatasourceField) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCEFIELD,
				newOBSERDSDatasourceField));
	}

	/**
	 * Returns the value of '<em><b>oBSOIDUserIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBSOIDUserIdentifier</b></em>' feature
	 * @generated
	 */
	public List<OBSOIDUserIdentifierType> getOBSOIDUserIdentifier() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBSOIDUSERIDENTIFIER);
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
			List<OBSOIDUserIdentifierType> newOBSOIDUserIdentifier) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBSOIDUSERIDENTIFIER,
				newOBSOIDUserIdentifier));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPMenuParameters</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPMenuParameters</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPMenuParametersType> getOBUIAPPMenuParameters() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPMENUPARAMETERS);
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
			List<OBUIAPPMenuParametersType> newOBUIAPPMenuParameters) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPMENUPARAMETERS,
				newOBUIAPPMenuParameters));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNavbarRoleaccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavbarRoleaccess</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPNavbarRoleaccessType> getOBUIAPPNavbarRoleaccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPNAVBARROLEACCESS);
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
			List<OBUIAPPNavbarRoleaccessType> newOBUIAPPNavbarRoleaccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPNAVBARROLEACCESS,
				newOBUIAPPNavbarRoleaccess));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNavigationBarComponent</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNavigationBarComponent</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPNavigationBarComponentType> getOBUIAPPNavigationBarComponent() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPNAVIGATIONBARCOMPONENT);
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
			List<OBUIAPPNavigationBarComponentType> newOBUIAPPNavigationBarComponent) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPNAVIGATIONBARCOMPONENT,
						newOBUIAPPNavigationBarComponent));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPNote</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPNote</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPNoteType> getOBUIAPPNote() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPNOTE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPNote() <em>oBUIAPPNote</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPNote() oBUIAPPNote}' feature.
	 * @generated
	 */
	public void setOBUIAPPNote(List<OBUIAPPNoteType> newOBUIAPPNote) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPNOTE,
				newOBUIAPPNote));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameter</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameter</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPParameterType> getOBUIAPPParameter() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPParameter() <em>oBUIAPPParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPParameter() oBUIAPPParameter}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameter(
			List<OBUIAPPParameterType> newOBUIAPPParameter) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETER,
				newOBUIAPPParameter));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterTrl</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPParameterTrlType> getOBUIAPPParameterTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERTRL);
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
			List<OBUIAPPParameterTrlType> newOBUIAPPParameterTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERTRL,
				newOBUIAPPParameterTrl));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPParameterValue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPParameterValue</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPParameterValueType> getOBUIAPPParameterValue() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERVALUE);
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
			List<OBUIAPPParameterValueType> newOBUIAPPParameterValue) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERVALUE,
				newOBUIAPPParameterValue));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPProcess</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPProcessType> getOBUIAPPProcess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPROCESS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPProcess() <em>oBUIAPPProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPProcess() oBUIAPPProcess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcess(List<OBUIAPPProcessType> newOBUIAPPProcess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPROCESS,
				newOBUIAPPProcess));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPProcessAccess</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPProcessAccessType> getOBUIAPPProcessAccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPROCESSACCESS);
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
			List<OBUIAPPProcessAccessType> newOBUIAPPProcessAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPPROCESSACCESS,
				newOBUIAPPProcessAccess));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPRefWindow</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPRefWindow</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPRefWindowType> getOBUIAPPRefWindow() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPREFWINDOW);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUIAPPRefWindow() <em>oBUIAPPRefWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUIAPPRefWindow() oBUIAPPRefWindow}' feature.
	 * @generated
	 */
	public void setOBUIAPPRefWindow(
			List<OBUIAPPRefWindowType> newOBUIAPPRefWindow) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPREFWINDOW,
				newOBUIAPPRefWindow));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPUIPersonalization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPUIPersonalization</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPUIPersonalizationType> getOBUIAPPUIPersonalization() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPUIPERSONALIZATION);
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
			List<OBUIAPPUIPersonalizationType> newOBUIAPPUIPersonalization) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPUIPERSONALIZATION,
						newOBUIAPPUIPersonalization));
	}

	/**
	 * Returns the value of '<em><b>oBUIAPPViewImplementation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUIAPPViewImplementation</b></em>' feature
	 * @generated
	 */
	public List<OBUIAPPViewImplementationType> getOBUIAPPViewImplementation() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPVIEWIMPLEMENTATION);
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
			List<OBUIAPPViewImplementationType> newOBUIAPPViewImplementation) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPVIEWIMPLEMENTATION,
						newOBUIAPPViewImplementation));
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelector</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelector</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorType> getOBUISELSelector() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTOR);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOBUISELSelector() <em>oBUISELSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOBUISELSelector() oBUISELSelector}' feature.
	 * @generated
	 */
	public void setOBUISELSelector(List<OBUISELSelectorType> newOBUISELSelector) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTOR,
				newOBUISELSelector));
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorField</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorField</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorFieldType> getOBUISELSelectorField() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELD);
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
			List<OBUISELSelectorFieldType> newOBUISELSelectorField) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELD,
				newOBUISELSelectorField));
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorFieldTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorFieldTrl</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorFieldTrlType> getOBUISELSelectorFieldTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELDTRL);
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
			List<OBUISELSelectorFieldTrlType> newOBUISELSelectorFieldTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELDTRL,
				newOBUISELSelectorFieldTrl));
	}

	/**
	 * Returns the value of '<em><b>oBUISELSelectorTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBUISELSelectorTrl</b></em>' feature
	 * @generated
	 */
	public List<OBUISELSelectorTrlType> getOBUISELSelectorTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTORTRL);
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
			List<OBUISELSelectorTrlType> newOBUISELSelectorTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUISELSELECTORTRL,
				newOBUISELSelectorTrl));
	}

	/**
	 * Returns the value of '<em><b>order</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>order</b></em>' feature
	 * @generated
	 */
	public List<OrderType> getOrder() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ORDER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrder() <em>order</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrder() order}' feature.
	 * @generated
	 */
	public void setOrder(List<OrderType> newOrder) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORDER, newOrder));
	}

	/**
	 * Returns the value of '<em><b>orderDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDiscount</b></em>' feature
	 * @generated
	 */
	public List<OrderDiscountType> getOrderDiscount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERDISCOUNT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderDiscount() <em>orderDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderDiscount() orderDiscount}' feature.
	 * @generated
	 */
	public void setOrderDiscount(List<OrderDiscountType> newOrderDiscount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERDISCOUNT,
				newOrderDiscount));
	}

	/**
	 * Returns the value of '<em><b>orderLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLine</b></em>' feature
	 * @generated
	 */
	public List<OrderLineType> getOrderLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ORDERLINE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderLine() <em>orderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderLine() orderLine}' feature.
	 * @generated
	 */
	public void setOrderLine(List<OrderLineType> newOrderLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERLINE, newOrderLine));
	}

	/**
	 * Returns the value of '<em><b>orderLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineOffer</b></em>' feature
	 * @generated
	 */
	public List<OrderLineOfferType> getOrderLineOffer() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERLINEOFFER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderLineOffer() <em>orderLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderLineOffer() orderLineOffer}' feature.
	 * @generated
	 */
	public void setOrderLineOffer(List<OrderLineOfferType> newOrderLineOffer) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERLINEOFFER,
				newOrderLineOffer));
	}

	/**
	 * Returns the value of '<em><b>orderLineTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineTax</b></em>' feature
	 * @generated
	 */
	public List<OrderLineTaxType> getOrderLineTax() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ORDERLINETAX);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderLineTax() <em>orderLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderLineTax() orderLineTax}' feature.
	 * @generated
	 */
	public void setOrderLineTax(List<OrderLineTaxType> newOrderLineTax) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERLINETAX,
				newOrderLineTax));
	}

	/**
	 * Returns the value of '<em><b>orderTax</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderTax</b></em>' feature
	 * @generated
	 */
	public List<OrderTaxType> getOrderTax() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.ORDERTAX);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrderTax() <em>orderTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrderTax() orderTax}' feature.
	 * @generated
	 */
	public void setOrderTax(List<OrderTaxType> newOrderTax) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORDERTAX, newOrderTax));
	}

	/**
	 * Returns the value of '<em><b>organization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organization</b></em>' feature
	 * @generated
	 */
	public List<OrganizationType> getOrganization() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(List<OrganizationType> newOrganization) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATION,
				newOrganization));
	}

	/**
	 * Returns the value of '<em><b>organizationAcctSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationAcctSchema</b></em>' feature
	 * @generated
	 */
	public List<OrganizationAcctSchemaType> getOrganizationAcctSchema() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONACCTSCHEMA);
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
			List<OrganizationAcctSchemaType> newOrganizationAcctSchema) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONACCTSCHEMA,
				newOrganizationAcctSchema));
	}

	/**
	 * Returns the value of '<em><b>organizationClosing</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationClosing</b></em>' feature
	 * @generated
	 */
	public List<OrganizationClosingType> getOrganizationClosing() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONCLOSING);
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
			List<OrganizationClosingType> newOrganizationClosing) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONCLOSING,
				newOrganizationClosing));
	}

	/**
	 * Returns the value of '<em><b>organizationInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformation</b></em>' feature
	 * @generated
	 */
	public List<OrganizationInformationType> getOrganizationInformation() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONINFORMATION);
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
			List<OrganizationInformationType> newOrganizationInformation) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONINFORMATION,
				newOrganizationInformation));
	}

	/**
	 * Returns the value of '<em><b>organizationModuleV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationModuleV</b></em>' feature
	 * @generated
	 */
	public List<OrganizationModuleVType> getOrganizationModuleV() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONMODULEV);
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
			List<OrganizationModuleVType> newOrganizationModuleV) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONMODULEV,
				newOrganizationModuleV));
	}

	/**
	 * Returns the value of '<em><b>organizationType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationType</b></em>' feature
	 * @generated
	 */
	public List<OrganizationTypeType> getOrganizationType() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONTYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getOrganizationType() <em>organizationType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getOrganizationType() organizationType}' feature.
	 * @generated
	 */
	public void setOrganizationType(
			List<OrganizationTypeType> newOrganizationType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.ORGANIZATIONTYPE,
				newOrganizationType));
	}

	/**
	 * Returns the value of '<em><b>periodControlLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>periodControlLog</b></em>' feature
	 * @generated
	 */
	public List<PeriodControlLogType> getPeriodControlLog() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PERIODCONTROLLOG);
	}

	/**
	 * Sets the '{@link OpenbravoType#getPeriodControlLog() <em>periodControlLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPeriodControlLog() periodControlLog}' feature.
	 * @generated
	 */
	public void setPeriodControlLog(
			List<PeriodControlLogType> newPeriodControlLog) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PERIODCONTROLLOG,
				newPeriodControlLog));
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustment</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentType> getPricingAdjustment() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingAdjustment() <em>pricingAdjustment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingAdjustment() pricingAdjustment}' feature.
	 * @generated
	 */
	public void setPricingAdjustment(
			List<PricingAdjustmentType> newPricingAdjustment) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENT,
				newPricingAdjustment));
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartner</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentBusinessPartnerType> getPricingAdjustmentBusinessPartner() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNER);
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
			List<PricingAdjustmentBusinessPartnerType> newPricingAdjustmentBusinessPartner) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNER,
						newPricingAdjustmentBusinessPartner));
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentBusinessPartnerGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentBusinessPartnerGroup</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentBusinessPartnerGroupType> getPricingAdjustmentBusinessPartnerGroup() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNERGROUP);
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
			List<PricingAdjustmentBusinessPartnerGroupType> newPricingAdjustmentBusinessPartnerGroup) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNERGROUP,
						newPricingAdjustmentBusinessPartnerGroup));
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentPriceList</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentPriceListType> getPricingAdjustmentPriceList() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRICELIST);
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
			List<PricingAdjustmentPriceListType> newPricingAdjustmentPriceList) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRICELIST,
						newPricingAdjustmentPriceList));
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProduct</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentProductType> getPricingAdjustmentProduct() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCT);
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
			List<PricingAdjustmentProductType> newPricingAdjustmentProduct) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCT,
						newPricingAdjustmentProduct));
	}

	/**
	 * Returns the value of '<em><b>pricingAdjustmentProductCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingAdjustmentProductCategory</b></em>' feature
	 * @generated
	 */
	public List<PricingAdjustmentProductCategoryType> getPricingAdjustmentProductCategory() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCTCATEGORY);
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
			List<PricingAdjustmentProductCategoryType> newPricingAdjustmentProductCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCTCATEGORY,
						newPricingAdjustmentProductCategory));
	}

	/**
	 * Returns the value of '<em><b>pricingDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingDiscount</b></em>' feature
	 * @generated
	 */
	public List<PricingDiscountType> getPricingDiscount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGDISCOUNT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingDiscount() <em>pricingDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingDiscount() pricingDiscount}' feature.
	 * @generated
	 */
	public void setPricingDiscount(List<PricingDiscountType> newPricingDiscount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGDISCOUNT,
				newPricingDiscount));
	}

	/**
	 * Returns the value of '<em><b>pricingPriceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceList</b></em>' feature
	 * @generated
	 */
	public List<PricingPriceListType> getPricingPriceList() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELIST);
	}

	/**
	 * Sets the '{@link OpenbravoType#getPricingPriceList() <em>pricingPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getPricingPriceList() pricingPriceList}' feature.
	 * @generated
	 */
	public void setPricingPriceList(
			List<PricingPriceListType> newPricingPriceList) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELIST,
				newPricingPriceList));
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListSchema</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListSchema</b></em>' feature
	 * @generated
	 */
	public List<PricingPriceListSchemaType> getPricingPriceListSchema() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMA);
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
			List<PricingPriceListSchemaType> newPricingPriceListSchema) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMA,
				newPricingPriceListSchema));
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListSchemeLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListSchemeLine</b></em>' feature
	 * @generated
	 */
	public List<PricingPriceListSchemeLineType> getPricingPriceListSchemeLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMELINE);
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
			List<PricingPriceListSchemeLineType> newPricingPriceListSchemeLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMELINE,
						newPricingPriceListSchemeLine));
	}

	/**
	 * Returns the value of '<em><b>pricingPriceListVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingPriceListVersion</b></em>' feature
	 * @generated
	 */
	public List<PricingPriceListVersionType> getPricingPriceListVersion() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELISTVERSION);
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
			List<PricingPriceListVersionType> newPricingPriceListVersion) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRICELISTVERSION,
				newPricingPriceListVersion));
	}

	/**
	 * Returns the value of '<em><b>pricingProductPrice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingProductPrice</b></em>' feature
	 * @generated
	 */
	public List<PricingProductPriceType> getPricingProductPrice() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRODUCTPRICE);
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
			List<PricingProductPriceType> newPricingProductPrice) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGPRODUCTPRICE,
				newPricingProductPrice));
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscount</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountType> getPricingVolumeDiscount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNT);
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
			List<PricingVolumeDiscountType> newPricingVolumeDiscount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNT,
				newPricingVolumeDiscount));
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountBusinessPartner</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountBusinessPartnerType> getPricingVolumeDiscountBusinessPartner() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTBUSINESSPARTNER);
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
			List<PricingVolumeDiscountBusinessPartnerType> newPricingVolumeDiscountBusinessPartner) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTBUSINESSPARTNER,
						newPricingVolumeDiscountBusinessPartner));
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountInvoice</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountInvoice</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountInvoiceType> getPricingVolumeDiscountInvoice() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTINVOICE);
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
			List<PricingVolumeDiscountInvoiceType> newPricingVolumeDiscountInvoice) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTINVOICE,
						newPricingVolumeDiscountInvoice));
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProduct</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProduct</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountProductType> getPricingVolumeDiscountProduct() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCT);
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
			List<PricingVolumeDiscountProductType> newPricingVolumeDiscountProduct) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCT,
						newPricingVolumeDiscountProduct));
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountProductCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountProductCategory</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountProductCategoryType> getPricingVolumeDiscountProductCategory() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY);
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
			List<PricingVolumeDiscountProductCategoryType> newPricingVolumeDiscountProductCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY,
						newPricingVolumeDiscountProductCategory));
	}

	/**
	 * Returns the value of '<em><b>pricingVolumeDiscountScale</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>pricingVolumeDiscountScale</b></em>' feature
	 * @generated
	 */
	public List<PricingVolumeDiscountScaleType> getPricingVolumeDiscountScale() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTSCALE);
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
			List<PricingVolumeDiscountScaleType> newPricingVolumeDiscountScale) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTSCALE,
						newPricingVolumeDiscountScale));
	}

	/**
	 * Returns the value of '<em><b>processExecution</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processExecution</b></em>' feature
	 * @generated
	 */
	public List<ProcessExecutionType> getProcessExecution() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROCESSEXECUTION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcessExecution() <em>processExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcessExecution() processExecution}' feature.
	 * @generated
	 */
	public void setProcessExecution(
			List<ProcessExecutionType> newProcessExecution) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROCESSEXECUTION,
				newProcessExecution));
	}

	/**
	 * Returns the value of '<em><b>processRequest</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRequest</b></em>' feature
	 * @generated
	 */
	public List<ProcessRequestType> getProcessRequest() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROCESSREQUEST);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcessRequest() <em>processRequest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcessRequest() processRequest}' feature.
	 * @generated
	 */
	public void setProcessRequest(List<ProcessRequestType> newProcessRequest) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROCESSREQUEST,
				newProcessRequest));
	}

	/**
	 * Returns the value of '<em><b>processRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRun</b></em>' feature
	 * @generated
	 */
	public List<ProcessRunType> getProcessRun() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PROCESSRUN);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProcessRun() <em>processRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProcessRun() processRun}' feature.
	 * @generated
	 */
	public void setProcessRun(List<ProcessRunType> newProcessRun) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROCESSRUN,
				newProcessRun));
	}

	/**
	 * Returns the value of '<em><b>procurementPOInvoiceMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementPOInvoiceMatch</b></em>' feature
	 * @generated
	 */
	public List<ProcurementPOInvoiceMatchType> getProcurementPOInvoiceMatch() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTPOINVOICEMATCH);
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
			List<ProcurementPOInvoiceMatchType> newProcurementPOInvoiceMatch) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTPOINVOICEMATCH,
						newProcurementPOInvoiceMatch));
	}

	/**
	 * Returns the value of '<em><b>procurementReceiptInvoiceMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementReceiptInvoiceMatch</b></em>' feature
	 * @generated
	 */
	public List<ProcurementReceiptInvoiceMatchType> getProcurementReceiptInvoiceMatch() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTRECEIPTINVOICEMATCH);
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
			List<ProcurementReceiptInvoiceMatchType> newProcurementReceiptInvoiceMatch) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTRECEIPTINVOICEMATCH,
						newProcurementReceiptInvoiceMatch));
	}

	/**
	 * Returns the value of '<em><b>procurementRequisition</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisition</b></em>' feature
	 * @generated
	 */
	public List<ProcurementRequisitionType> getProcurementRequisition() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITION);
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
			List<ProcurementRequisitionType> newProcurementRequisition) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITION,
				newProcurementRequisition));
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionLine</b></em>' feature
	 * @generated
	 */
	public List<ProcurementRequisitionLineType> getProcurementRequisitionLine() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONLINE);
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
			List<ProcurementRequisitionLineType> newProcurementRequisitionLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONLINE,
						newProcurementRequisitionLine));
	}

	/**
	 * Returns the value of '<em><b>procurementRequisitionPOMatch</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procurementRequisitionPOMatch</b></em>' feature
	 * @generated
	 */
	public List<ProcurementRequisitionPOMatchType> getProcurementRequisitionPOMatch() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONPOMATCH);
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
			List<ProcurementRequisitionPOMatchType> newProcurementRequisitionPOMatch) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONPOMATCH,
						newProcurementRequisitionPOMatch));
	}

	/**
	 * Returns the value of '<em><b>product</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>product</b></em>' feature
	 * @generated
	 */
	public List<ProductType> getProduct() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PRODUCT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(List<ProductType> newProduct) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCT, newProduct));
	}

	/**
	 * Returns the value of '<em><b>productAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccounts</b></em>' feature
	 * @generated
	 */
	public List<ProductAccountsType> getProductAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTACCOUNTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductAccounts() <em>productAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductAccounts() productAccounts}' feature.
	 * @generated
	 */
	public void setProductAccounts(List<ProductAccountsType> newProductAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTACCOUNTS,
				newProductAccounts));
	}

	/**
	 * Returns the value of '<em><b>productBOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productBOM</b></em>' feature
	 * @generated
	 */
	public List<ProductBOMType> getProductBOM() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTBOM);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductBOM() <em>productBOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductBOM() productBOM}' feature.
	 * @generated
	 */
	public void setProductBOM(List<ProductBOMType> newProductBOM) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTBOM,
				newProductBOM));
	}

	/**
	 * Returns the value of '<em><b>productByPriceAndWarehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productByPriceAndWarehouse</b></em>' feature
	 * @generated
	 */
	public List<ProductByPriceAndWarehouseType> getProductByPriceAndWarehouse() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTBYPRICEANDWAREHOUSE);
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
			List<ProductByPriceAndWarehouseType> newProductByPriceAndWarehouse) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTBYPRICEANDWAREHOUSE,
						newProductByPriceAndWarehouse));
	}

	/**
	 * Returns the value of '<em><b>productCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategory</b></em>' feature
	 * @generated
	 */
	public List<ProductCategoryType> getProductCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTCATEGORY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductCategory() <em>productCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductCategory() productCategory}' feature.
	 * @generated
	 */
	public void setProductCategory(List<ProductCategoryType> newProductCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTCATEGORY,
				newProductCategory));
	}

	/**
	 * Returns the value of '<em><b>productCategoryAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCategoryAccounts</b></em>' feature
	 * @generated
	 */
	public List<ProductCategoryAccountsType> getProductCategoryAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTCATEGORYACCOUNTS);
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
			List<ProductCategoryAccountsType> newProductCategoryAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTCATEGORYACCOUNTS,
				newProductCategoryAccounts));
	}

	/**
	 * Returns the value of '<em><b>productCustomer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productCustomer</b></em>' feature
	 * @generated
	 */
	public List<ProductCustomerType> getProductCustomer() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTCUSTOMER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductCustomer() <em>productCustomer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductCustomer() productCustomer}' feature.
	 * @generated
	 */
	public void setProductCustomer(List<ProductCustomerType> newProductCustomer) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTCUSTOMER,
				newProductCustomer));
	}

	/**
	 * Returns the value of '<em><b>productOrg</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productOrg</b></em>' feature
	 * @generated
	 */
	public List<ProductOrgType> getProductOrg() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTORG);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductOrg() <em>productOrg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductOrg() productOrg}' feature.
	 * @generated
	 */
	public void setProductOrg(List<ProductOrgType> newProductOrg) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTORG,
				newProductOrg));
	}

	/**
	 * Returns the value of '<em><b>productStockView</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productStockView</b></em>' feature
	 * @generated
	 */
	public List<ProductStockViewType> getProductStockView() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTSTOCKVIEW);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductStockView() <em>productStockView</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductStockView() productStockView}' feature.
	 * @generated
	 */
	public void setProductStockView(
			List<ProductStockViewType> newProductStockView) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTSTOCKVIEW,
				newProductStockView));
	}

	/**
	 * Returns the value of '<em><b>productSubstitute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productSubstitute</b></em>' feature
	 * @generated
	 */
	public List<ProductSubstituteType> getProductSubstitute() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTSUBSTITUTE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductSubstitute() <em>productSubstitute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductSubstitute() productSubstitute}' feature.
	 * @generated
	 */
	public void setProductSubstitute(
			List<ProductSubstituteType> newProductSubstitute) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTSUBSTITUTE,
				newProductSubstitute));
	}

	/**
	 * Returns the value of '<em><b>productTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productTrl</b></em>' feature
	 * @generated
	 */
	public List<ProductTrlType> getProductTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductTrl() <em>productTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductTrl() productTrl}' feature.
	 * @generated
	 */
	public void setProductTrl(List<ProductTrlType> newProductTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTTRL,
				newProductTrl));
	}

	/**
	 * Returns the value of '<em><b>productUOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productUOM</b></em>' feature
	 * @generated
	 */
	public List<ProductUOMType> getProductUOM() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTUOM);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProductUOM() <em>productUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProductUOM() productUOM}' feature.
	 * @generated
	 */
	public void setProductUOM(List<ProductUOMType> newProductUOM) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PRODUCTUOM,
				newProductUOM));
	}

	/**
	 * Returns the value of '<em><b>project</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>project</b></em>' feature
	 * @generated
	 */
	public List<ProjectType> getProject() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PROJECT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(List<ProjectType> newProject) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECT, newProject));
	}

	/**
	 * Returns the value of '<em><b>projectAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccounts</b></em>' feature
	 * @generated
	 */
	public List<ProjectAccountsType> getProjectAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTACCOUNTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectAccounts() <em>projectAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectAccounts() projectAccounts}' feature.
	 * @generated
	 */
	public void setProjectAccounts(List<ProjectAccountsType> newProjectAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTACCOUNTS,
				newProjectAccounts));
	}

	/**
	 * Returns the value of '<em><b>projectIssue</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectIssue</b></em>' feature
	 * @generated
	 */
	public List<ProjectIssueType> getProjectIssue() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROJECTISSUE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectIssue() <em>projectIssue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectIssue() projectIssue}' feature.
	 * @generated
	 */
	public void setProjectIssue(List<ProjectIssueType> newProjectIssue) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTISSUE,
				newProjectIssue));
	}

	/**
	 * Returns the value of '<em><b>projectLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectLine</b></em>' feature
	 * @generated
	 */
	public List<ProjectLineType> getProjectLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PROJECTLINE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectLine() <em>projectLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectLine() projectLine}' feature.
	 * @generated
	 */
	public void setProjectLine(List<ProjectLineType> newProjectLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTLINE,
				newProjectLine));
	}

	/**
	 * Returns the value of '<em><b>projectPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectPhase</b></em>' feature
	 * @generated
	 */
	public List<ProjectPhaseType> getProjectPhase() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPHASE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(List<ProjectPhaseType> newProjectPhase) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPHASE,
				newProjectPhase));
	}

	/**
	 * Returns the value of '<em><b>projectProjectProposalTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProjectProposalTask</b></em>' feature
	 * @generated
	 */
	public List<ProjectProjectProposalTaskType> getProjectProjectProposalTask() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPROJECTPROPOSALTASK);
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
			List<ProjectProjectProposalTaskType> newProjectProjectProposalTask) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPROJECTPROPOSALTASK,
						newProjectProjectProposalTask));
	}

	/**
	 * Returns the value of '<em><b>projectProposal</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposal</b></em>' feature
	 * @generated
	 */
	public List<ProjectProposalType> getProjectProposal() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPROPOSAL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectProposal() <em>projectProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectProposal() projectProposal}' feature.
	 * @generated
	 */
	public void setProjectProposal(List<ProjectProposalType> newProjectProposal) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPROPOSAL,
				newProjectProposal));
	}

	/**
	 * Returns the value of '<em><b>projectProposalLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectProposalLine</b></em>' feature
	 * @generated
	 */
	public List<ProjectProposalLineType> getProjectProposalLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPROPOSALLINE);
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
			List<ProjectProposalLineType> newProjectProposalLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTPROPOSALLINE,
				newProjectProposalLine));
	}

	/**
	 * Returns the value of '<em><b>projectStandardPhase</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardPhase</b></em>' feature
	 * @generated
	 */
	public List<ProjectStandardPhaseType> getProjectStandardPhase() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTSTANDARDPHASE);
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
			List<ProjectStandardPhaseType> newProjectStandardPhase) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTSTANDARDPHASE,
				newProjectStandardPhase));
	}

	/**
	 * Returns the value of '<em><b>projectStandardTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectStandardTask</b></em>' feature
	 * @generated
	 */
	public List<ProjectStandardTaskType> getProjectStandardTask() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTSTANDARDTASK);
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
			List<ProjectStandardTaskType> newProjectStandardTask) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTSTANDARDTASK,
				newProjectStandardTask));
	}

	/**
	 * Returns the value of '<em><b>projectTask</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectTask</b></em>' feature
	 * @generated
	 */
	public List<ProjectTaskType> getProjectTask() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PROJECTTASK);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectTask() <em>projectTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectTask() projectTask}' feature.
	 * @generated
	 */
	public void setProjectTask(List<ProjectTaskType> newProjectTask) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTTASK,
				newProjectTask));
	}

	/**
	 * Returns the value of '<em><b>projectType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectType</b></em>' feature
	 * @generated
	 */
	public List<ProjectTypeType> getProjectType() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.PROJECTTYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectType() <em>projectType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectType() projectType}' feature.
	 * @generated
	 */
	public void setProjectType(List<ProjectTypeType> newProjectType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTTYPE,
				newProjectType));
	}

	/**
	 * Returns the value of '<em><b>projectVendor</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectVendor</b></em>' feature
	 * @generated
	 */
	public List<ProjectVendorType> getProjectVendor() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTVENDOR);
	}

	/**
	 * Sets the '{@link OpenbravoType#getProjectVendor() <em>projectVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getProjectVendor() projectVendor}' feature.
	 * @generated
	 */
	public void setProjectVendor(List<ProjectVendorType> newProjectVendor) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.PROJECTVENDOR,
				newProjectVendor));
	}

	/**
	 * Returns the value of '<em><b>referenceDataStore</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceDataStore</b></em>' feature
	 * @generated
	 */
	public List<ReferenceDataStoreType> getReferenceDataStore() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.REFERENCEDATASTORE);
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
			List<ReferenceDataStoreType> newReferenceDataStore) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.REFERENCEDATASTORE,
				newReferenceDataStore));
	}

	/**
	 * Returns the value of '<em><b>region</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>region</b></em>' feature
	 * @generated
	 */
	public List<RegionType> getRegion() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.REGION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(List<RegionType> newRegion) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.REGION, newRegion));
	}

	/**
	 * Returns the value of '<em><b>resource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resource</b></em>' feature
	 * @generated
	 */
	public List<ResourceType> getResource() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.RESOURCE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getResource() <em>resource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getResource() resource}' feature.
	 * @generated
	 */
	public void setResource(List<ResourceType> newResource) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.RESOURCE, newResource));
	}

	/**
	 * Returns the value of '<em><b>resourceAssignment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceAssignment</b></em>' feature
	 * @generated
	 */
	public List<ResourceAssignmentType> getResourceAssignment() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.RESOURCEASSIGNMENT);
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
			List<ResourceAssignmentType> newResourceAssignment) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.RESOURCEASSIGNMENT,
				newResourceAssignment));
	}

	/**
	 * Returns the value of '<em><b>resourceType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceType</b></em>' feature
	 * @generated
	 */
	public List<ResourceTypeType> getResourceType() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.RESOURCETYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getResourceType() <em>resourceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getResourceType() resourceType}' feature.
	 * @generated
	 */
	public void setResourceType(List<ResourceTypeType> newResourceType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.RESOURCETYPE,
				newResourceType));
	}

	/**
	 * Returns the value of '<em><b>resourceUnAvailable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceUnAvailable</b></em>' feature
	 * @generated
	 */
	public List<ResourceUnAvailableType> getResourceUnAvailable() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.RESOURCEUNAVAILABLE);
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
			List<ResourceUnAvailableType> newResourceUnAvailable) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.RESOURCEUNAVAILABLE,
				newResourceUnAvailable));
	}

	/**
	 * Returns the value of '<em><b>returnMaterialOrderPickEditLines</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialOrderPickEditLines</b></em>' feature
	 * @generated
	 */
	public List<ReturnMaterialOrderPickEditLinesType> getReturnMaterialOrderPickEditLines() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNMATERIALORDERPICKEDITLINES);
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
			List<ReturnMaterialOrderPickEditLinesType> newReturnMaterialOrderPickEditLines) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNMATERIALORDERPICKEDITLINES,
						newReturnMaterialOrderPickEditLines));
	}

	/**
	 * Returns the value of '<em><b>returnMaterialReceiptPickEdit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialReceiptPickEdit</b></em>' feature
	 * @generated
	 */
	public List<ReturnMaterialReceiptPickEditType> getReturnMaterialReceiptPickEdit() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNMATERIALRECEIPTPICKEDIT);
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
			List<ReturnMaterialReceiptPickEditType> newReturnMaterialReceiptPickEdit) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNMATERIALRECEIPTPICKEDIT,
						newReturnMaterialReceiptPickEdit));
	}

	/**
	 * Returns the value of '<em><b>returnMaterialShipmentPickEdit</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnMaterialShipmentPickEdit</b></em>' feature
	 * @generated
	 */
	public List<ReturnMaterialShipmentPickEditType> getReturnMaterialShipmentPickEdit() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNMATERIALSHIPMENTPICKEDIT);
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
			List<ReturnMaterialShipmentPickEditType> newReturnMaterialShipmentPickEdit) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNMATERIALSHIPMENTPICKEDIT,
						newReturnMaterialShipmentPickEdit));
	}

	/**
	 * Returns the value of '<em><b>returnReason</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>returnReason</b></em>' feature
	 * @generated
	 */
	public List<ReturnReasonType> getReturnReason() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.RETURNREASON);
	}

	/**
	 * Sets the '{@link OpenbravoType#getReturnReason() <em>returnReason</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReturnReason() returnReason}' feature.
	 * @generated
	 */
	public void setReturnReason(List<ReturnReasonType> newReturnReason) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.RETURNREASON,
				newReturnReason));
	}

	/**
	 * Returns the value of '<em><b>reversedInvoices</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reversedInvoices</b></em>' feature
	 * @generated
	 */
	public List<ReversedInvoicesType> getReversedInvoices() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.REVERSEDINVOICES);
	}

	/**
	 * Sets the '{@link OpenbravoType#getReversedInvoices() <em>reversedInvoices</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getReversedInvoices() reversedInvoices}' feature.
	 * @generated
	 */
	public void setReversedInvoices(
			List<ReversedInvoicesType> newReversedInvoices) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.REVERSEDINVOICES,
				newReversedInvoices));
	}

	/**
	 * Returns the value of '<em><b>sQLScript</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sQLScript</b></em>' feature
	 * @generated
	 */
	public List<SQLScriptType> getSQLScript() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.SQLSCRIPT);
	}

	/**
	 * Sets the '{@link OpenbravoType#getSQLScript() <em>sQLScript</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSQLScript() sQLScript}' feature.
	 * @generated
	 */
	public void setSQLScript(List<SQLScriptType> newSQLScript) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SQLSCRIPT, newSQLScript));
	}

	/**
	 * Returns the value of '<em><b>salaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategory</b></em>' feature
	 * @generated
	 */
	public List<SalaryCategoryType> getSalaryCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALARYCATEGORY);
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalaryCategory() <em>salaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalaryCategory() salaryCategory}' feature.
	 * @generated
	 */
	public void setSalaryCategory(List<SalaryCategoryType> newSalaryCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALARYCATEGORY,
				newSalaryCategory));
	}

	/**
	 * Returns the value of '<em><b>salaryCategoryCost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategoryCost</b></em>' feature
	 * @generated
	 */
	public List<SalaryCategoryCostType> getSalaryCategoryCost() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALARYCATEGORYCOST);
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
			List<SalaryCategoryCostType> newSalaryCategoryCost) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALARYCATEGORYCOST,
				newSalaryCategoryCost));
	}

	/**
	 * Returns the value of '<em><b>salesCommission</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommission</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionType> getSalesCommission() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesCommission() <em>salesCommission</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesCommission() salesCommission}' feature.
	 * @generated
	 */
	public void setSalesCommission(List<SalesCommissionType> newSalesCommission) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSION,
				newSalesCommission));
	}

	/**
	 * Returns the value of '<em><b>salesCommissionAmount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionAmount</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionAmountType> getSalesCommissionAmount() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONAMOUNT);
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
			List<SalesCommissionAmountType> newSalesCommissionAmount) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONAMOUNT,
				newSalesCommissionAmount));
	}

	/**
	 * Returns the value of '<em><b>salesCommissionDetail</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionDetail</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionDetailType> getSalesCommissionDetail() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONDETAIL);
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
			List<SalesCommissionDetailType> newSalesCommissionDetail) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONDETAIL,
				newSalesCommissionDetail));
	}

	/**
	 * Returns the value of '<em><b>salesCommissionLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionLine</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionLineType> getSalesCommissionLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONLINE);
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
			List<SalesCommissionLineType> newSalesCommissionLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONLINE,
				newSalesCommissionLine));
	}

	/**
	 * Returns the value of '<em><b>salesCommissionRun</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesCommissionRun</b></em>' feature
	 * @generated
	 */
	public List<SalesCommissionRunType> getSalesCommissionRun() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONRUN);
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
			List<SalesCommissionRunType> newSalesCommissionRun) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALESCOMMISSIONRUN,
				newSalesCommissionRun));
	}

	/**
	 * Returns the value of '<em><b>salesRegion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salesRegion</b></em>' feature
	 * @generated
	 */
	public List<SalesRegionType> getSalesRegion() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.SALESREGION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(List<SalesRegionType> newSalesRegion) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SALESREGION,
				newSalesRegion));
	}

	/**
	 * Returns the value of '<em><b>serialNumberControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serialNumberControl</b></em>' feature
	 * @generated
	 */
	public List<SerialNumberControlType> getSerialNumberControl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SERIALNUMBERCONTROL);
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
			List<SerialNumberControlType> newSerialNumberControl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SERIALNUMBERCONTROL,
				newSerialNumberControl));
	}

	/**
	 * Returns the value of '<em><b>shippingFreightCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingFreightCategory</b></em>' feature
	 * @generated
	 */
	public List<ShippingFreightCategoryType> getShippingFreightCategory() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SHIPPINGFREIGHTCATEGORY);
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
			List<ShippingFreightCategoryType> newShippingFreightCategory) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SHIPPINGFREIGHTCATEGORY,
				newShippingFreightCategory));
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompany</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompany</b></em>' feature
	 * @generated
	 */
	public List<ShippingShippingCompanyType> getShippingShippingCompany() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANY);
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
			List<ShippingShippingCompanyType> newShippingShippingCompany) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANY,
				newShippingShippingCompany));
	}

	/**
	 * Returns the value of '<em><b>shippingShippingCompanyFreight</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>shippingShippingCompanyFreight</b></em>' feature
	 * @generated
	 */
	public List<ShippingShippingCompanyFreightType> getShippingShippingCompanyFreight() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANYFREIGHT);
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
			List<ShippingShippingCompanyFreightType> newShippingShippingCompanyFreight) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANYFREIGHT,
						newShippingShippingCompanyFreight));
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheet</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheet</b></em>' feature
	 * @generated
	 */
	public List<TimeAndExpenseSheetType> getTimeAndExpenseSheet() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEET);
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
			List<TimeAndExpenseSheetType> newTimeAndExpenseSheet) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEET,
				newTimeAndExpenseSheet));
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLine</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLine</b></em>' feature
	 * @generated
	 */
	public List<TimeAndExpenseSheetLineType> getTimeAndExpenseSheetLine() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINE);
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
			List<TimeAndExpenseSheetLineType> newTimeAndExpenseSheetLine) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINE,
				newTimeAndExpenseSheetLine));
	}

	/**
	 * Returns the value of '<em><b>timeAndExpenseSheetLineV</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeAndExpenseSheetLineV</b></em>' feature
	 * @generated
	 */
	public List<TimeAndExpenseSheetLineVType> getTimeAndExpenseSheetLineV() {
		return OpenbravoTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						OpenbravoTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINEV);
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
			List<TimeAndExpenseSheetLineVType> newTimeAndExpenseSheetLineV) {
		setGroup(OpenbravoTypeGroupFeatureGroup
				.createFeatureGroupList(
						OpenbravoTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINEV,
						newTimeAndExpenseSheetLineV));
	}

	/**
	 * Returns the value of '<em><b>timeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>timeType</b></em>' feature
	 * @generated
	 */
	public List<TimeTypeType> getTimeType() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.TIMETYPE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getTimeType() <em>timeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getTimeType() timeType}' feature.
	 * @generated
	 */
	public void setTimeType(List<TimeTypeType> newTimeType) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.TIMETYPE, newTimeType));
	}

	/**
	 * Returns the value of '<em><b>uOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOM</b></em>' feature
	 * @generated
	 */
	public List<UOMType> getUOM() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.UOM);
	}

	/**
	 * Sets the '{@link OpenbravoType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(List<UOMType> newUOM) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.UOM, newUOM));
	}

	/**
	 * Returns the value of '<em><b>uOMConversion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMConversion</b></em>' feature
	 * @generated
	 */
	public List<UOMConversionType> getUOMConversion() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.UOMCONVERSION);
	}

	/**
	 * Sets the '{@link OpenbravoType#getUOMConversion() <em>uOMConversion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getUOMConversion() uOMConversion}' feature.
	 * @generated
	 */
	public void setUOMConversion(List<UOMConversionType> newUOMConversion) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.UOMCONVERSION,
				newUOMConversion));
	}

	/**
	 * Returns the value of '<em><b>uOMTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMTrl</b></em>' feature
	 * @generated
	 */
	public List<UOMTrlType> getUOMTrl() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.UOMTRL);
	}

	/**
	 * Sets the '{@link OpenbravoType#getUOMTrl() <em>uOMTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getUOMTrl() uOMTrl}' feature.
	 * @generated
	 */
	public void setUOMTrl(List<UOMTrlType> newUOMTrl) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.UOMTRL, newUOMTrl));
	}

	/**
	 * Returns the value of '<em><b>vendorAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccounts</b></em>' feature
	 * @generated
	 */
	public List<VendorAccountsType> getVendorAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.VENDORACCOUNTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getVendorAccounts() <em>vendorAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getVendorAccounts() vendorAccounts}' feature.
	 * @generated
	 */
	public void setVendorAccounts(List<VendorAccountsType> newVendorAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.VENDORACCOUNTS,
				newVendorAccounts));
	}

	/**
	 * Returns the value of '<em><b>warehouse</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouse</b></em>' feature
	 * @generated
	 */
	public List<WarehouseType> getWarehouse() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), OpenbravoTypeGroupFeatureGroup.Feature.WAREHOUSE);
	}

	/**
	 * Sets the '{@link OpenbravoType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(List<WarehouseType> newWarehouse) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.WAREHOUSE, newWarehouse));
	}

	/**
	 * Returns the value of '<em><b>warehouseAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccounts</b></em>' feature
	 * @generated
	 */
	public List<WarehouseAccountsType> getWarehouseAccounts() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.WAREHOUSEACCOUNTS);
	}

	/**
	 * Sets the '{@link OpenbravoType#getWarehouseAccounts() <em>warehouseAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getWarehouseAccounts() warehouseAccounts}' feature.
	 * @generated
	 */
	public void setWarehouseAccounts(
			List<WarehouseAccountsType> newWarehouseAccounts) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.WAREHOUSEACCOUNTS,
				newWarehouseAccounts));
	}

	/**
	 * Returns the value of '<em><b>warehouseShipper</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseShipper</b></em>' feature
	 * @generated
	 */
	public List<WarehouseShipperType> getWarehouseShipper() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.WAREHOUSESHIPPER);
	}

	/**
	 * Sets the '{@link OpenbravoType#getWarehouseShipper() <em>warehouseShipper</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getWarehouseShipper() warehouseShipper}' feature.
	 * @generated
	 */
	public void setWarehouseShipper(
			List<WarehouseShipperType> newWarehouseShipper) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.WAREHOUSESHIPPER,
				newWarehouseShipper));
	}

	/**
	 * Returns the value of '<em><b>obuiappViewRoleAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obuiappViewRoleAccess</b></em>' feature
	 * @generated
	 */
	public List<ObuiappViewRoleAccessType> getObuiappViewRoleAccess() {
		return OpenbravoTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPVIEWROLEACCESS);
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
			List<ObuiappViewRoleAccessType> newObuiappViewRoleAccess) {
		setGroup(OpenbravoTypeGroupFeatureGroup.createFeatureGroupList(
				OpenbravoTypeGroupFeatureGroup.Feature.OBUIAPPVIEWROLEACCESS,
				newObuiappViewRoleAccess));
	}

	/**
	 * Returns the value of '<em><b>created</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>created</b></em>' feature
	 * @generated
	 */
	public String getCreated() {
		return created;
	}

	/**
	 * Sets the '{@link OpenbravoType#getCreated() <em>created</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getCreated() created}' feature.
	 * @generated
	 */
	public void setCreated(String newCreated) {
		created = newCreated;
	}

	/**
	 * Returns the value of '<em><b>obRevision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obRevision</b></em>' feature
	 * @generated
	 */
	public String getObRevision() {
		return obRevision;
	}

	/**
	 * Sets the '{@link OpenbravoType#getObRevision() <em>obRevision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getObRevision() obRevision}' feature.
	 * @generated
	 */
	public void setObRevision(String newObRevision) {
		obRevision = newObRevision;
	}

	/**
	 * Returns the value of '<em><b>obVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>obVersion</b></em>' feature
	 * @generated
	 */
	public String getObVersion() {
		return obVersion;
	}

	/**
	 * Sets the '{@link OpenbravoType#getObVersion() <em>obVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OpenbravoType#getObVersion() obVersion}' feature.
	 * @generated
	 */
	public void setObVersion(String newObVersion) {
		obVersion = newObVersion;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OpenbravoType " + " [created: " + getCreated() + "]"
				+ " [obRevision: " + getObRevision() + "]" + " [obVersion: "
				+ getObVersion() + "]";
	}
}
