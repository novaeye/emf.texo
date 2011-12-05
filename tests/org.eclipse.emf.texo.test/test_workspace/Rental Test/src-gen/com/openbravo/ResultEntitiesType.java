package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ResultEntitiesType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ResultEntitiesType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ResultEntitiesTypeGroupFeatureGroup> group = new ArrayList<ResultEntitiesTypeGroupFeatureGroup>();

	/**
	 * Returns the value of '<em><b>group</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>group</b></em>' feature
	 * @generated
	 */
	public List<ResultEntitiesTypeGroupFeatureGroup> getGroup() {
		return group;
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getGroup() <em>group</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getGroup() group}' feature.
	 * @generated
	 */
	public void setGroup(List<ResultEntitiesTypeGroupFeatureGroup> newGroup) {
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
	public List<ResultEntityType> getADAcctProcess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADACCTPROCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAcctProcess() <em>aDAcctProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAcctProcess() aDAcctProcess}' feature.
	 * @generated
	 */
	public void setADAcctProcess(List<ResultEntityType> newADAcctProcess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADACCTPROCESS,
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
	public List<ResultEntityType> getADAlert() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlert() <em>aDAlert</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlert() aDAlert}' feature.
	 * @generated
	 */
	public void setADAlert(List<ResultEntityType> newADAlert) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERT,
						newADAlert));
	}

	/**
	 * Returns the value of '<em><b>aDAlertRecipient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDAlertRecipient</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADAlertRecipient() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERTRECIPIENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlertRecipient() <em>aDAlertRecipient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlertRecipient() aDAlertRecipient}' feature.
	 * @generated
	 */
	public void setADAlertRecipient(List<ResultEntityType> newADAlertRecipient) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERTRECIPIENT,
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
	public List<ResultEntityType> getADAlertRule() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERTRULE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlertRule() <em>aDAlertRule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlertRule() aDAlertRule}' feature.
	 * @generated
	 */
	public void setADAlertRule(List<ResultEntityType> newADAlertRule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERTRULE,
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
	public List<ResultEntityType> getADAlertRuleTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERTRULETRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAlertRuleTrl() <em>aDAlertRuleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAlertRuleTrl() aDAlertRuleTrl}' feature.
	 * @generated
	 */
	public void setADAlertRuleTrl(List<ResultEntityType> newADAlertRuleTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADALERTRULETRL,
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
	public List<ResultEntityType> getADAttachment() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADATTACHMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAttachment() <em>aDAttachment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAttachment() aDAttachment}' feature.
	 * @generated
	 */
	public void setADAttachment(List<ResultEntityType> newADAttachment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADATTACHMENT,
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
	public List<ResultEntityType> getADAuxiliaryInput() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADAUXILIARYINPUT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAuxiliaryInput() <em>aDAuxiliaryInput</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAuxiliaryInput() aDAuxiliaryInput}' feature.
	 * @generated
	 */
	public void setADAuxiliaryInput(List<ResultEntityType> newADAuxiliaryInput) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADAUXILIARYINPUT,
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
	public List<ResultEntityType> getADCallout() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCALLOUT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADCallout() <em>aDCallout</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADCallout() aDCallout}' feature.
	 * @generated
	 */
	public void setADCallout(List<ResultEntityType> newADCallout) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCALLOUT,
				newADCallout));
	}

	/**
	 * Returns the value of '<em><b>aDClient</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClient</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADClient() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCLIENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADClient() <em>aDClient</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADClient() aDClient}' feature.
	 * @generated
	 */
	public void setADClient(List<ResultEntityType> newADClient) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCLIENT,
				newADClient));
	}

	/**
	 * Returns the value of '<em><b>aDClientModule</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDClientModule</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADClientModule() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCLIENTMODULE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADClientModule() <em>aDClientModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADClientModule() aDClientModule}' feature.
	 * @generated
	 */
	public void setADClientModule(List<ResultEntityType> newADClientModule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCLIENTMODULE,
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
	public List<ResultEntityType> getADColumn() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCOLUMN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADColumn() <em>aDColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADColumn() aDColumn}' feature.
	 * @generated
	 */
	public void setADColumn(List<ResultEntityType> newADColumn) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADCOLUMN,
				newADColumn));
	}

	/**
	 * Returns the value of '<em><b>aDEPInstancePara</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDEPInstancePara</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADEPInstancePara() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADEPINSTANCEPARA);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADEPInstancePara() <em>aDEPInstancePara</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADEPInstancePara() aDEPInstancePara}' feature.
	 * @generated
	 */
	public void setADEPInstancePara(List<ResultEntityType> newADEPInstancePara) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADEPINSTANCEPARA,
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
	public List<ResultEntityType> getADEPProcedures() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADEPPROCEDURES);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADEPProcedures() <em>aDEPProcedures</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADEPProcedures() aDEPProcedures}' feature.
	 * @generated
	 */
	public void setADEPProcedures(List<ResultEntityType> newADEPProcedures) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADEPPROCEDURES,
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
	public List<ResultEntityType> getADElement() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADELEMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADElement() <em>aDElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADElement() aDElement}' feature.
	 * @generated
	 */
	public void setADElement(List<ResultEntityType> newADElement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADELEMENT,
				newADElement));
	}

	/**
	 * Returns the value of '<em><b>aDElementTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDElementTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADElementTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADELEMENTTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADElementTrl() <em>aDElementTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADElementTrl() aDElementTrl}' feature.
	 * @generated
	 */
	public void setADElementTrl(List<ResultEntityType> newADElementTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADELEMENTTRL,
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
	public List<ResultEntityType> getADErrorLog() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADERRORLOG);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADErrorLog() <em>aDErrorLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADErrorLog() aDErrorLog}' feature.
	 * @generated
	 */
	public void setADErrorLog(List<ResultEntityType> newADErrorLog) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADERRORLOG,
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
	public List<ResultEntityType> getADExtensionPoints() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADEXTENSIONPOINTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADExtensionPoints() <em>aDExtensionPoints</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADExtensionPoints() aDExtensionPoints}' feature.
	 * @generated
	 */
	public void setADExtensionPoints(List<ResultEntityType> newADExtensionPoints) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADEXTENSIONPOINTS,
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
	public List<ResultEntityType> getADField() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELD);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADField() <em>aDField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADField() aDField}' feature.
	 * @generated
	 */
	public void setADField(List<ResultEntityType> newADField) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELD,
						newADField));
	}

	/**
	 * Returns the value of '<em><b>aDFieldGroup</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFieldGroup</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADFieldGroup() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELDGROUP);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFieldGroup() <em>aDFieldGroup</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFieldGroup() aDFieldGroup}' feature.
	 * @generated
	 */
	public void setADFieldGroup(List<ResultEntityType> newADFieldGroup) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELDGROUP,
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
	public List<ResultEntityType> getADFieldGroupTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELDGROUPTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFieldGroupTrl() <em>aDFieldGroupTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFieldGroupTrl() aDFieldGroupTrl}' feature.
	 * @generated
	 */
	public void setADFieldGroupTrl(List<ResultEntityType> newADFieldGroupTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELDGROUPTRL,
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
	public List<ResultEntityType> getADFieldTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELDTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFieldTrl() <em>aDFieldTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFieldTrl() aDFieldTrl}' feature.
	 * @generated
	 */
	public void setADFieldTrl(List<ResultEntityType> newADFieldTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFIELDTRL,
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
	public List<ResultEntityType> getADFileType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFILETYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFileType() <em>aDFileType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFileType() aDFileType}' feature.
	 * @generated
	 */
	public void setADFileType(List<ResultEntityType> newADFileType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFILETYPE,
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
	public List<ResultEntityType> getADForm() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADFORM);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADForm() <em>aDForm</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADForm() aDForm}' feature.
	 * @generated
	 */
	public void setADForm(List<ResultEntityType> newADForm) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFORM, newADForm));
	}

	/**
	 * Returns the value of '<em><b>aDFormAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDFormAccess</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADFormAccess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFORMACCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFormAccess() <em>aDFormAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFormAccess() aDFormAccess}' feature.
	 * @generated
	 */
	public void setADFormAccess(List<ResultEntityType> newADFormAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFORMACCESS,
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
	public List<ResultEntityType> getADFormTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFORMTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADFormTrl() <em>aDFormTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADFormTrl() aDFormTrl}' feature.
	 * @generated
	 */
	public void setADFormTrl(List<ResultEntityType> newADFormTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADFORMTRL,
				newADFormTrl));
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLog</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLog</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADHeartbeatLog() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADHEARTBEATLOG);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADHeartbeatLog() <em>aDHeartbeatLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADHeartbeatLog() aDHeartbeatLog}' feature.
	 * @generated
	 */
	public void setADHeartbeatLog(List<ResultEntityType> newADHeartbeatLog) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADHEARTBEATLOG,
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
	public List<ResultEntityType> getADHeartbeatLogCustomQuery() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERY);
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
			List<ResultEntityType> newADHeartbeatLogCustomQuery) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERY,
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
	public List<ResultEntityType> getADHeartbeatLogCustomQueryRow() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERYROW);
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
			List<ResultEntityType> newADHeartbeatLogCustomQueryRow) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADHEARTBEATLOGCUSTOMQUERYROW,
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
	public List<ResultEntityType> getADImage() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADIMAGE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADImage() <em>aDImage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADImage() aDImage}' feature.
	 * @generated
	 */
	public void setADImage(List<ResultEntityType> newADImage) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADIMAGE,
						newADImage));
	}

	/**
	 * Returns the value of '<em><b>aDLanguage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDLanguage</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADLanguage() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADLANGUAGE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADLanguage() <em>aDLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADLanguage() aDLanguage}' feature.
	 * @generated
	 */
	public void setADLanguage(List<ResultEntityType> newADLanguage) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADLANGUAGE,
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
	public List<ResultEntityType> getADList() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADLIST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADList() <em>aDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADList() aDList}' feature.
	 * @generated
	 */
	public void setADList(List<ResultEntityType> newADList) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADLIST, newADList));
	}

	/**
	 * Returns the value of '<em><b>aDListTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDListTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADListTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADLISTTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADListTrl() <em>aDListTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADListTrl() aDListTrl}' feature.
	 * @generated
	 */
	public void setADListTrl(List<ResultEntityType> newADListTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADLISTTRL,
				newADListTrl));
	}

	/**
	 * Returns the value of '<em><b>aDMenu</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenu</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADMenu() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADMENU);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMenu() <em>aDMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMenu() aDMenu}' feature.
	 * @generated
	 */
	public void setADMenu(List<ResultEntityType> newADMenu) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMENU, newADMenu));
	}

	/**
	 * Returns the value of '<em><b>aDMenuTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenuTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADMenuTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMENUTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMenuTrl() <em>aDMenuTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMenuTrl() aDMenuTrl}' feature.
	 * @generated
	 */
	public void setADMenuTrl(List<ResultEntityType> newADMenuTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMENUTRL,
				newADMenuTrl));
	}

	/**
	 * Returns the value of '<em><b>aDMessage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessage</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADMessage() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMESSAGE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMessage() <em>aDMessage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMessage() aDMessage}' feature.
	 * @generated
	 */
	public void setADMessage(List<ResultEntityType> newADMessage) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMESSAGE,
				newADMessage));
	}

	/**
	 * Returns the value of '<em><b>aDMessageTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMessageTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADMessageTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMESSAGETRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMessageTrl() <em>aDMessageTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMessageTrl() aDMessageTrl}' feature.
	 * @generated
	 */
	public void setADMessageTrl(List<ResultEntityType> newADMessageTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMESSAGETRL,
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
	public List<ResultEntityType> getADModelImplementation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATION);
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
			List<ResultEntityType> newADModelImplementation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATION,
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
	public List<ResultEntityType> getADModelImplementationMapping() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATIONMAPPING);
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
			List<ResultEntityType> newADModelImplementationMapping) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODELIMPLEMENTATIONMAPPING,
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
	public List<ResultEntityType> getADModule() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModule() <em>aDModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModule() aDModule}' feature.
	 * @generated
	 */
	public void setADModule(List<ResultEntityType> newADModule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULE,
				newADModule));
	}

	/**
	 * Returns the value of '<em><b>aDModuleDBPrefixInstall</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModuleDBPrefixInstall</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADModuleDBPrefixInstall() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEDBPREFIXINSTALL);
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
			List<ResultEntityType> newADModuleDBPrefixInstall) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEDBPREFIXINSTALL,
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
	public List<ResultEntityType> getADModuleDependencyInst() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEDEPENDENCYINST);
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
			List<ResultEntityType> newADModuleDependencyInst) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEDEPENDENCYINST,
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
	public List<ResultEntityType> getADModuleInstall() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEINSTALL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModuleInstall() <em>aDModuleInstall</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModuleInstall() aDModuleInstall}' feature.
	 * @generated
	 */
	public void setADModuleInstall(List<ResultEntityType> newADModuleInstall) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEINSTALL,
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
	public List<ResultEntityType> getADModuleMerge() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEMERGE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADModuleMerge() <em>aDModuleMerge</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADModuleMerge() aDModuleMerge}' feature.
	 * @generated
	 */
	public void setADModuleMerge(List<ResultEntityType> newADModuleMerge) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMODULEMERGE,
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
	public List<ResultEntityType> getADMonth() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMONTH);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMonth() <em>aDMonth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMonth() aDMonth}' feature.
	 * @generated
	 */
	public void setADMonth(List<ResultEntityType> newADMonth) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADMONTH,
						newADMonth));
	}

	/**
	 * Returns the value of '<em><b>aDMonthTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMonthTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADMonthTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMONTHTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADMonthTrl() <em>aDMonthTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADMonthTrl() aDMonthTrl}' feature.
	 * @generated
	 */
	public void setADMonthTrl(List<ResultEntityType> newADMonthTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADMONTHTRL,
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
	public List<ResultEntityType> getADOrgModule() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADORGMODULE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADOrgModule() <em>aDOrgModule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADOrgModule() aDOrgModule}' feature.
	 * @generated
	 */
	public void setADOrgModule(List<ResultEntityType> newADOrgModule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADORGMODULE,
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
	public List<ResultEntityType> getADParameter() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPARAMETER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADParameter() <em>aDParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADParameter() aDParameter}' feature.
	 * @generated
	 */
	public void setADParameter(List<ResultEntityType> newADParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPARAMETER,
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
	public List<ResultEntityType> getADPreference() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPREFERENCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADPreference() <em>aDPreference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADPreference() aDPreference}' feature.
	 * @generated
	 */
	public void setADPreference(List<ResultEntityType> newADPreference) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPREFERENCE,
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
	public List<ResultEntityType> getADProcess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcess() <em>aDProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcess() aDProcess}' feature.
	 * @generated
	 */
	public void setADProcess(List<ResultEntityType> newADProcess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESS,
				newADProcess));
	}

	/**
	 * Returns the value of '<em><b>aDProcessAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessAccess</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADProcessAccess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSACCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessAccess() <em>aDProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessAccess() aDProcessAccess}' feature.
	 * @generated
	 */
	public void setADProcessAccess(List<ResultEntityType> newADProcessAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSACCESS,
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
	public List<ResultEntityType> getADProcessInstance() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSINSTANCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessInstance() <em>aDProcessInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessInstance() aDProcessInstance}' feature.
	 * @generated
	 */
	public void setADProcessInstance(List<ResultEntityType> newADProcessInstance) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSINSTANCE,
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
	public List<ResultEntityType> getADProcessParameter() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessParameter() <em>aDProcessParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessParameter() aDProcessParameter}' feature.
	 * @generated
	 */
	public void setADProcessParameter(
			List<ResultEntityType> newADProcessParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETER,
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
	public List<ResultEntityType> getADProcessParameterTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETERTRL);
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
			List<ResultEntityType> newADProcessParameterTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSPARAMETERTRL,
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
	public List<ResultEntityType> getADProcessScheduling() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSSCHEDULING);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessScheduling() <em>aDProcessScheduling</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessScheduling() aDProcessScheduling}' feature.
	 * @generated
	 */
	public void setADProcessScheduling(
			List<ResultEntityType> newADProcessScheduling) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSSCHEDULING,
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
	public List<ResultEntityType> getADProcessTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADProcessTrl() <em>aDProcessTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADProcessTrl() aDProcessTrl}' feature.
	 * @generated
	 */
	public void setADProcessTrl(List<ResultEntityType> newADProcessTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADPROCESSTRL,
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
	public List<ResultEntityType> getADReference() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREFERENCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADReference() <em>aDReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADReference() aDReference}' feature.
	 * @generated
	 */
	public void setADReference(List<ResultEntityType> newADReference) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREFERENCE,
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
	public List<ResultEntityType> getADReferenceTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREFERENCETRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADReferenceTrl() <em>aDReferenceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADReferenceTrl() aDReferenceTrl}' feature.
	 * @generated
	 */
	public void setADReferenceTrl(List<ResultEntityType> newADReferenceTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREFERENCETRL,
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
	public List<ResultEntityType> getADReferencedTable() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREFERENCEDTABLE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADReferencedTable() <em>aDReferencedTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADReferencedTable() aDReferencedTable}' feature.
	 * @generated
	 */
	public void setADReferencedTable(List<ResultEntityType> newADReferencedTable) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREFERENCEDTABLE,
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
	public List<ResultEntityType> getADRegistration() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREGISTRATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADRegistration() <em>aDRegistration</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADRegistration() aDRegistration}' feature.
	 * @generated
	 */
	public void setADRegistration(List<ResultEntityType> newADRegistration) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADREGISTRATION,
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
	public List<ResultEntityType> getADRole() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADROLE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADRole() <em>aDRole</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADRole() aDRole}' feature.
	 * @generated
	 */
	public void setADRole(List<ResultEntityType> newADRole) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADROLE, newADRole));
	}

	/**
	 * Returns the value of '<em><b>aDRoleOrganization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDRoleOrganization</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADRoleOrganization() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADROLEORGANIZATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADRoleOrganization() <em>aDRoleOrganization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADRoleOrganization() aDRoleOrganization}' feature.
	 * @generated
	 */
	public void setADRoleOrganization(
			List<ResultEntityType> newADRoleOrganization) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADROLEORGANIZATION,
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
	public List<ResultEntityType> getADSelector() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSELECTOR);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSelector() <em>aDSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSelector() aDSelector}' feature.
	 * @generated
	 */
	public void setADSelector(List<ResultEntityType> newADSelector) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSELECTOR,
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
	public List<ResultEntityType> getADSelectorColumn() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSELECTORCOLUMN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSelectorColumn() <em>aDSelectorColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSelectorColumn() aDSelectorColumn}' feature.
	 * @generated
	 */
	public void setADSelectorColumn(List<ResultEntityType> newADSelectorColumn) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSELECTORCOLUMN,
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
	public List<ResultEntityType> getADSequence() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSEQUENCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSequence() <em>aDSequence</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSequence() aDSequence}' feature.
	 * @generated
	 */
	public void setADSequence(List<ResultEntityType> newADSequence) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSEQUENCE,
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
	public List<ResultEntityType> getADSession() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSESSION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSession() <em>aDSession</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSession() aDSession}' feature.
	 * @generated
	 */
	public void setADSession(List<ResultEntityType> newADSession) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSESSION,
				newADSession));
	}

	/**
	 * Returns the value of '<em><b>aDSessionStatus</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSessionStatus</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADSessionStatus() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSESSIONSTATUS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSessionStatus() <em>aDSessionStatus</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSessionStatus() aDSessionStatus}' feature.
	 * @generated
	 */
	public void setADSessionStatus(List<ResultEntityType> newADSessionStatus) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSESSIONSTATUS,
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
	public List<ResultEntityType> getADSessionUsageAudit() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADSESSIONUSAGEAUDIT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSessionUsageAudit() <em>aDSessionUsageAudit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSessionUsageAudit() aDSessionUsageAudit}' feature.
	 * @generated
	 */
	public void setADSessionUsageAudit(
			List<ResultEntityType> newADSessionUsageAudit) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADSESSIONUSAGEAUDIT,
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
	public List<ResultEntityType> getADSystem() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSYSTEM);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSystem() <em>aDSystem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSystem() aDSystem}' feature.
	 * @generated
	 */
	public void setADSystem(List<ResultEntityType> newADSystem) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADSYSTEM,
				newADSystem));
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformation</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADSystemInformation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADSYSTEMINFORMATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADSystemInformation() <em>aDSystemInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADSystemInformation() aDSystemInformation}' feature.
	 * @generated
	 */
	public void setADSystemInformation(
			List<ResultEntityType> newADSystemInformation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADSYSTEMINFORMATION,
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
	public List<ResultEntityType> getADTab() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADTAB);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTab() <em>aDTab</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTab() aDTab}' feature.
	 * @generated
	 */
	public void setADTab(List<ResultEntityType> newADTab) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTAB, newADTab));
	}

	/**
	 * Returns the value of '<em><b>aDTabTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTabTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADTabTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTabTrl() <em>aDTabTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTabTrl() aDTabTrl}' feature.
	 * @generated
	 */
	public void setADTabTrl(List<ResultEntityType> newADTabTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABTRL,
				newADTabTrl));
	}

	/**
	 * Returns the value of '<em><b>aDTable</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTable</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADTable() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABLE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTable() <em>aDTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTable() aDTable}' feature.
	 * @generated
	 */
	public void setADTable(List<ResultEntityType> newADTable) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABLE,
						newADTable));
	}

	/**
	 * Returns the value of '<em><b>aDTableAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTableAccess</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADTableAccess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABLEACCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTableAccess() <em>aDTableAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTableAccess() aDTableAccess}' feature.
	 * @generated
	 */
	public void setADTableAccess(List<ResultEntityType> newADTableAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABLEACCESS,
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
	public List<ResultEntityType> getADTablePostV() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABLEPOSTV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTablePostV() <em>aDTablePostV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTablePostV() aDTablePostV}' feature.
	 * @generated
	 */
	public void setADTablePostV(List<ResultEntityType> newADTablePostV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTABLEPOSTV,
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
	public List<ResultEntityType> getADTextInterface() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTEXTINTERFACE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTextInterface() <em>aDTextInterface</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTextInterface() aDTextInterface}' feature.
	 * @generated
	 */
	public void setADTextInterface(List<ResultEntityType> newADTextInterface) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTEXTINTERFACE,
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
	public List<ResultEntityType> getADTextInterfaceTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTEXTINTERFACETRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTextInterfaceTrl() <em>aDTextInterfaceTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTextInterfaceTrl() aDTextInterfaceTrl}' feature.
	 * @generated
	 */
	public void setADTextInterfaceTrl(
			List<ResultEntityType> newADTextInterfaceTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTEXTINTERFACETRL,
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
	public List<ResultEntityType> getADTree() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADTREE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTree() <em>aDTree</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTree() aDTree}' feature.
	 * @generated
	 */
	public void setADTree(List<ResultEntityType> newADTree) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTREE, newADTree));
	}

	/**
	 * Returns the value of '<em><b>aDTreeNode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTreeNode</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADTreeNode() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTREENODE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADTreeNode() <em>aDTreeNode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADTreeNode() aDTreeNode}' feature.
	 * @generated
	 */
	public void setADTreeNode(List<ResultEntityType> newADTreeNode) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADTREENODE,
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
	public List<ResultEntityType> getADUser() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ADUSER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADUser() <em>aDUser</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADUser() aDUser}' feature.
	 * @generated
	 */
	public void setADUser(List<ResultEntityType> newADUser) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADUSER, newADUser));
	}

	/**
	 * Returns the value of '<em><b>aDUserRoles</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDUserRoles</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADUserRoles() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADUSERROLES);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADUserRoles() <em>aDUserRoles</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADUserRoles() aDUserRoles}' feature.
	 * @generated
	 */
	public void setADUserRoles(List<ResultEntityType> newADUserRoles) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADUSERROLES,
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
	public List<ResultEntityType> getADValidation() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADVALIDATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADValidation() <em>aDValidation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADValidation() aDValidation}' feature.
	 * @generated
	 */
	public void setADValidation(List<ResultEntityType> newADValidation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADVALIDATION,
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
	public List<ResultEntityType> getADWindow() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADWINDOW);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADWindow() <em>aDWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADWindow() aDWindow}' feature.
	 * @generated
	 */
	public void setADWindow(List<ResultEntityType> newADWindow) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADWINDOW,
				newADWindow));
	}

	/**
	 * Returns the value of '<em><b>aDWindowAccess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowAccess</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getADWindowAccess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADWINDOWACCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADWindowAccess() <em>aDWindowAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADWindowAccess() aDWindowAccess}' feature.
	 * @generated
	 */
	public void setADWindowAccess(List<ResultEntityType> newADWindowAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADWINDOWACCESS,
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
	public List<ResultEntityType> getADWindowTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADWINDOWTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADWindowTrl() <em>aDWindowTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADWindowTrl() aDWindowTrl}' feature.
	 * @generated
	 */
	public void setADWindowTrl(List<ResultEntityType> newADWindowTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADWINDOWTRL,
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
	public List<ResultEntityType> getADAuditTrail() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADAUDITTRAIL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAuditTrail() <em>aDAuditTrail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAuditTrail() aDAuditTrail}' feature.
	 * @generated
	 */
	public void setADAuditTrail(List<ResultEntityType> newADAuditTrail) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADAUDITTRAIL,
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
	public List<ResultEntityType> getADAuditTrailRaw() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADAUDITTRAILRAW);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADAuditTrailRaw() <em>aDAuditTrailRaw</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADAuditTrailRaw() aDAuditTrailRaw}' feature.
	 * @generated
	 */
	public void setADAuditTrailRaw(List<ResultEntityType> newADAuditTrailRaw) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ADAUDITTRAILRAW,
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
	public List<ResultEntityType> getADCreateFactTemplate() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADCREATEFACTTEMPLATE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getADCreateFactTemplate() <em>aDCreateFactTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getADCreateFactTemplate() aDCreateFactTemplate}' feature.
	 * @generated
	 */
	public void setADCreateFactTemplate(
			List<ResultEntityType> newADCreateFactTemplate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ADCREATEFACTTEMPLATE,
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
	public List<ResultEntityType> getAPRMFinAccTransactionAcctV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONACCTV);
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
			List<ResultEntityType> newAPRMFinAccTransactionAcctV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONACCTV,
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
	public List<ResultEntityType> getAPRMFinaccTransactionV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONV);
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
			List<ResultEntityType> newAPRMFinaccTransactionV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMFINACCTRANSACTIONV,
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
	public List<ResultEntityType> getAPRMFinaccTrxFullAcctV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMFINACCTRXFULLACCTV);
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
			List<ResultEntityType> newAPRMFinaccTrxFullAcctV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMFINACCTRXFULLACCTV,
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
	public List<ResultEntityType> getAPRMPendingPaymentInvoice() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMPENDINGPAYMENTINVOICE);
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
			List<ResultEntityType> newAPRMPendingPaymentInvoice) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.APRMPENDINGPAYMENTINVOICE,
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
	public List<ResultEntityType> getAPRMRecDetailV() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.APRMRECDETAILV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMRecDetailV() <em>aPRMRecDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMRecDetailV() aPRMRecDetailV}' feature.
	 * @generated
	 */
	public void setAPRMRecDetailV(List<ResultEntityType> newAPRMRecDetailV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.APRMRECDETAILV,
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
	public List<ResultEntityType> getAPRMReconciliation() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.APRMRECONCILIATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAPRMReconciliation() <em>aPRMReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAPRMReconciliation() aPRMReconciliation}' feature.
	 * @generated
	 */
	public void setAPRMReconciliation(
			List<ResultEntityType> newAPRMReconciliation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.APRMRECONCILIATION,
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
	public List<ResultEntityType> getAcctSchemaTableDocType() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ACCTSCHEMATABLEDOCTYPE);
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
			List<ResultEntityType> newAcctSchemaTableDocType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ACCTSCHEMATABLEDOCTYPE,
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
	public List<ResultEntityType> getActiveProposalV() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ACTIVEPROPOSALV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getActiveProposalV() <em>activeProposalV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getActiveProposalV() activeProposalV}' feature.
	 * @generated
	 */
	public void setActiveProposalV(List<ResultEntityType> newActiveProposalV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ACTIVEPROPOSALV,
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
	public List<ResultEntityType> getApprovedVendor() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.APPROVEDVENDOR);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getApprovedVendor() <em>approvedVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getApprovedVendor() approvedVendor}' feature.
	 * @generated
	 */
	public void setApprovedVendor(List<ResultEntityType> newApprovedVendor) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.APPROVEDVENDOR,
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
	public List<ResultEntityType> getAttribute() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttribute() <em>attribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttribute() attribute}' feature.
	 * @generated
	 */
	public void setAttribute(List<ResultEntityType> newAttribute) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTE,
				newAttribute));
	}

	/**
	 * Returns the value of '<em><b>attributeInstance</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>attributeInstance</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getAttributeInstance() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTEINSTANCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeInstance() <em>attributeInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeInstance() attributeInstance}' feature.
	 * @generated
	 */
	public void setAttributeInstance(List<ResultEntityType> newAttributeInstance) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTEINSTANCE,
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
	public List<ResultEntityType> getAttributeSet() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTESET);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeSet() <em>attributeSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeSet() attributeSet}' feature.
	 * @generated
	 */
	public void setAttributeSet(List<ResultEntityType> newAttributeSet) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTESET,
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
	public List<ResultEntityType> getAttributeSetInstance() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTESETINSTANCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeSetInstance() <em>attributeSetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeSetInstance() attributeSetInstance}' feature.
	 * @generated
	 */
	public void setAttributeSetInstance(
			List<ResultEntityType> newAttributeSetInstance) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTESETINSTANCE,
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
	public List<ResultEntityType> getAttributeUse() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTEUSE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeUse() <em>attributeUse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeUse() attributeUse}' feature.
	 * @generated
	 */
	public void setAttributeUse(List<ResultEntityType> newAttributeUse) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTEUSE,
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
	public List<ResultEntityType> getAttributeValue() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTEVALUE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getAttributeValue() <em>attributeValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getAttributeValue() attributeValue}' feature.
	 * @generated
	 */
	public void setAttributeValue(List<ResultEntityType> newAttributeValue) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ATTRIBUTEVALUE,
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
	public List<ResultEntityType> getBank() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.BANK);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBank() <em>bank</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBank() bank}' feature.
	 * @generated
	 */
	public void setBank(List<ResultEntityType> newBank) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.BANK, newBank));
	}

	/**
	 * Returns the value of '<em><b>bankAccount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bankAccount</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getBankAccount() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.BANKACCOUNT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBankAccount() <em>bankAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBankAccount() bankAccount}' feature.
	 * @generated
	 */
	public void setBankAccount(List<ResultEntityType> newBankAccount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.BANKACCOUNT,
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
	public List<ResultEntityType> getBankAccountAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BANKACCOUNTACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBankAccountAccounts() <em>bankAccountAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBankAccountAccounts() bankAccountAccounts}' feature.
	 * @generated
	 */
	public void setBankAccountAccounts(
			List<ResultEntityType> newBankAccountAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BANKACCOUNTACCOUNTS,
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
	public List<ResultEntityType> getBusinessPartner() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getBusinessPartner() <em>businessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getBusinessPartner() businessPartner}' feature.
	 * @generated
	 */
	public void setBusinessPartner(List<ResultEntityType> newBusinessPartner) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNER,
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
	public List<ResultEntityType> getBusinessPartnerBankAccount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERBANKACCOUNT);
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
			List<ResultEntityType> newBusinessPartnerBankAccount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERBANKACCOUNT,
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
	public List<ResultEntityType> getBusinessPartnerCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORY);
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
			List<ResultEntityType> newBusinessPartnerCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORY,
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
	public List<ResultEntityType> getBusinessPartnerCategoryAccount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORYACCOUNT);
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
			List<ResultEntityType> newBusinessPartnerCategoryAccount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERCATEGORYACCOUNT,
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
	public List<ResultEntityType> getBusinessPartnerDiscount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERDISCOUNT);
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
			List<ResultEntityType> newBusinessPartnerDiscount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERDISCOUNT,
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
	public List<ResultEntityType> getBusinessPartnerLocation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERLOCATION);
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
			List<ResultEntityType> newBusinessPartnerLocation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERLOCATION,
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
	public List<ResultEntityType> getBusinessPartnerProductTemplate() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERPRODUCTTEMPLATE);
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
			List<ResultEntityType> newBusinessPartnerProductTemplate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERPRODUCTTEMPLATE,
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
	public List<ResultEntityType> getBusinessPartnerTaxCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERTAXCATEGORY);
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
			List<ResultEntityType> newBusinessPartnerTaxCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERTAXCATEGORY,
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
	public List<ResultEntityType> getBusinessPartnerWithholding() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERWITHHOLDING);
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
			List<ResultEntityType> newBusinessPartnerWithholding) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.BUSINESSPARTNERWITHHOLDING,
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
	public List<ResultEntityType> getCAcctSchemaProcess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.CACCTSCHEMAPROCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCAcctSchemaProcess() <em>cAcctSchemaProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCAcctSchemaProcess() cAcctSchemaProcess}' feature.
	 * @generated
	 */
	public void setCAcctSchemaProcess(
			List<ResultEntityType> newCAcctSchemaProcess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CACCTSCHEMAPROCESS,
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
	public List<ResultEntityType> getCity() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.CITY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCity() <em>city</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCity() city}' feature.
	 * @generated
	 */
	public void setCity(List<ResultEntityType> newCity) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CITY, newCity));
	}

	/**
	 * Returns the value of '<em><b>clientInformation</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformation</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getClientInformation() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.CLIENTINFORMATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getClientInformation() <em>clientInformation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getClientInformation() clientInformation}' feature.
	 * @generated
	 */
	public void setClientInformation(List<ResultEntityType> newClientInformation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CLIENTINFORMATION,
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
	public List<ResultEntityType> getConditionGoods() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.CONDITIONGOODS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getConditionGoods() <em>conditionGoods</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getConditionGoods() conditionGoods}' feature.
	 * @generated
	 */
	public void setConditionGoods(List<ResultEntityType> newConditionGoods) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CONDITIONGOODS,
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
	public List<ResultEntityType> getContactEmailInteraction() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.CONTACTEMAILINTERACTION);
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
			List<ResultEntityType> newContactEmailInteraction) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.CONTACTEMAILINTERACTION,
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
	public List<ResultEntityType> getCountry() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.COUNTRY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCountry() <em>country</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCountry() country}' feature.
	 * @generated
	 */
	public void setCountry(List<ResultEntityType> newCountry) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.COUNTRY,
						newCountry));
	}

	/**
	 * Returns the value of '<em><b>countryTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>countryTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getCountryTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.COUNTRYTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCountryTrl() <em>countryTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCountryTrl() countryTrl}' feature.
	 * @generated
	 */
	public void setCountryTrl(List<ResultEntityType> newCountryTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.COUNTRYTRL,
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
	public List<ResultEntityType> getCurrency() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(List<ResultEntityType> newCurrency) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCY,
				newCurrency));
	}

	/**
	 * Returns the value of '<em><b>currencyConversionRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currencyConversionRate</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getCurrencyConversionRate() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATE);
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
			List<ResultEntityType> newCurrencyConversionRate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATE,
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
	public List<ResultEntityType> getCurrencyConversionRateDoc() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATEDOC);
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
			List<ResultEntityType> newCurrencyConversionRateDoc) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCYCONVERSIONRATEDOC,
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
	public List<ResultEntityType> getCurrencyTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCYTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCurrencyTrl() <em>currencyTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCurrencyTrl() currencyTrl}' feature.
	 * @generated
	 */
	public void setCurrencyTrl(List<ResultEntityType> newCurrencyTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CURRENCYTRL,
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
	public List<ResultEntityType> getCustomerAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.CUSTOMERACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getCustomerAccounts() <em>customerAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getCustomerAccounts() customerAccounts}' feature.
	 * @generated
	 */
	public void setCustomerAccounts(List<ResultEntityType> newCustomerAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.CUSTOMERACCOUNTS,
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
	public List<ResultEntityType> getDataPackage() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.DATAPACKAGE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataPackage() <em>dataPackage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataPackage() dataPackage}' feature.
	 * @generated
	 */
	public void setDataPackage(List<ResultEntityType> newDataPackage) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.DATAPACKAGE,
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
	public List<ResultEntityType> getDataSet() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.DATASET);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataSet() <em>dataSet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataSet() dataSet}' feature.
	 * @generated
	 */
	public void setDataSet(List<ResultEntityType> newDataSet) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.DATASET,
						newDataSet));
	}

	/**
	 * Returns the value of '<em><b>dataSetColumn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataSetColumn</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getDataSetColumn() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.DATASETCOLUMN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataSetColumn() <em>dataSetColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataSetColumn() dataSetColumn}' feature.
	 * @generated
	 */
	public void setDataSetColumn(List<ResultEntityType> newDataSetColumn) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.DATASETCOLUMN,
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
	public List<ResultEntityType> getDataSetTable() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.DATASETTABLE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDataSetTable() <em>dataSetTable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDataSetTable() dataSetTable}' feature.
	 * @generated
	 */
	public void setDataSetTable(List<ResultEntityType> newDataSetTable) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.DATASETTABLE,
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
	public List<ResultEntityType> getDocumentTemplate() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.DOCUMENTTEMPLATE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDocumentTemplate() <em>documentTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDocumentTemplate() documentTemplate}' feature.
	 * @generated
	 */
	public void setDocumentTemplate(List<ResultEntityType> newDocumentTemplate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.DOCUMENTTEMPLATE,
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
	public List<ResultEntityType> getDocumentType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.DOCUMENTTYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDocumentType() <em>documentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDocumentType() documentType}' feature.
	 * @generated
	 */
	public void setDocumentType(List<ResultEntityType> newDocumentType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.DOCUMENTTYPE,
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
	public List<ResultEntityType> getDocumentTypeTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.DOCUMENTTYPETRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getDocumentTypeTrl() <em>documentTypeTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getDocumentTypeTrl() documentTypeTrl}' feature.
	 * @generated
	 */
	public void setDocumentTypeTrl(List<ResultEntityType> newDocumentTypeTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.DOCUMENTTYPETRL,
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
	public List<ResultEntityType> getEmailInteraction() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.EMAILINTERACTION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmailInteraction() <em>emailInteraction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmailInteraction() emailInteraction}' feature.
	 * @generated
	 */
	public void setEmailInteraction(List<ResultEntityType> newEmailInteraction) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.EMAILINTERACTION,
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
	public List<ResultEntityType> getEmailServerConfiguration() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.EMAILSERVERCONFIGURATION);
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
			List<ResultEntityType> newEmailServerConfiguration) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.EMAILSERVERCONFIGURATION,
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
	public List<ResultEntityType> getEmailTemplate() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.EMAILTEMPLATE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmailTemplate() <em>emailTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmailTemplate() emailTemplate}' feature.
	 * @generated
	 */
	public void setEmailTemplate(List<ResultEntityType> newEmailTemplate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.EMAILTEMPLATE,
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
	public List<ResultEntityType> getEmployeeAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.EMPLOYEEACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getEmployeeAccounts() <em>employeeAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getEmployeeAccounts() employeeAccounts}' feature.
	 * @generated
	 */
	public void setEmployeeAccounts(List<ResultEntityType> newEmployeeAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.EMPLOYEEACCOUNTS,
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
	public List<ResultEntityType> getEmployeeSalaryCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.EMPLOYEESALARYCATEGORY);
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
			List<ResultEntityType> newEmployeeSalaryCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.EMPLOYEESALARYCATEGORY,
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
	public List<ResultEntityType> getExpenseType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.EXPENSETYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExpenseType() <em>expenseType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExpenseType() expenseType}' feature.
	 * @generated
	 */
	public void setExpenseType(List<ResultEntityType> newExpenseType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.EXPENSETYPE,
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
	public List<ResultEntityType> getExternalPOS() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.EXTERNALPOS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExternalPOS() <em>externalPOS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExternalPOS() externalPOS}' feature.
	 * @generated
	 */
	public void setExternalPOS(List<ResultEntityType> newExternalPOS) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.EXTERNALPOS,
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
	public List<ResultEntityType> getExternalPOSCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.EXTERNALPOSCATEGORY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExternalPOSCategory() <em>externalPOSCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExternalPOSCategory() externalPOSCategory}' feature.
	 * @generated
	 */
	public void setExternalPOSCategory(
			List<ResultEntityType> newExternalPOSCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.EXTERNALPOSCATEGORY,
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
	public List<ResultEntityType> getExternalPOSProduct() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.EXTERNALPOSPRODUCT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getExternalPOSProduct() <em>externalPOSProduct</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getExternalPOSProduct() externalPOSProduct}' feature.
	 * @generated
	 */
	public void setExternalPOSProduct(
			List<ResultEntityType> newExternalPOSProduct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.EXTERNALPOSPRODUCT,
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
	public List<ResultEntityType> getFINBankStatement() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINBANKSTATEMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINBankStatement() <em>fINBankStatement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINBankStatement() fINBankStatement}' feature.
	 * @generated
	 */
	public void setFINBankStatement(List<ResultEntityType> newFINBankStatement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINBANKSTATEMENT,
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
	public List<ResultEntityType> getFINBankStatementLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINBANKSTATEMENTLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINBankStatementLine() <em>fINBankStatementLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINBankStatementLine() fINBankStatementLine}' feature.
	 * @generated
	 */
	public void setFINBankStatementLine(
			List<ResultEntityType> newFINBankStatementLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINBANKSTATEMENTLINE,
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
	public List<ResultEntityType> getFINFinaccTransaction() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINFINACCTRANSACTION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINFinaccTransaction() <em>fINFinaccTransaction</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINFinaccTransaction() fINFinaccTransaction}' feature.
	 * @generated
	 */
	public void setFINFinaccTransaction(
			List<ResultEntityType> newFINFinaccTransaction) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINFINACCTRANSACTION,
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
	public List<ResultEntityType> getFINFinancialAccount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINFinancialAccount() <em>fINFinancialAccount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINFinancialAccount() fINFinancialAccount}' feature.
	 * @generated
	 */
	public void setFINFinancialAccount(
			List<ResultEntityType> newFINFinancialAccount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNT,
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
	public List<ResultEntityType> getFINFinancialAccountAcct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNTACCT);
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
			List<ResultEntityType> newFINFinancialAccountAcct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINFINANCIALACCOUNTACCT,
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
	public List<ResultEntityType> getFINPayment() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPayment() <em>fINPayment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPayment() fINPayment}' feature.
	 * @generated
	 */
	public void setFINPayment(List<ResultEntityType> newFINPayment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENT,
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
	public List<ResultEntityType> getFINPaymentMethod() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTMETHOD);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentMethod() <em>fINPaymentMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentMethod() fINPaymentMethod}' feature.
	 * @generated
	 */
	public void setFINPaymentMethod(List<ResultEntityType> newFINPaymentMethod) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTMETHOD,
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
	public List<ResultEntityType> getFINPaymentCredit() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTCREDIT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentCredit() <em>fINPaymentCredit</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentCredit() fINPaymentCredit}' feature.
	 * @generated
	 */
	public void setFINPaymentCredit(List<ResultEntityType> newFINPaymentCredit) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTCREDIT,
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
	public List<ResultEntityType> getFINPaymentDetail() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTDETAIL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentDetail() <em>fINPaymentDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentDetail() fINPaymentDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentDetail(List<ResultEntityType> newFINPaymentDetail) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTDETAIL,
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
	public List<ResultEntityType> getFINPaymentDetailV() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTDETAILV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentDetailV() <em>fINPaymentDetailV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentDetailV() fINPaymentDetailV}' feature.
	 * @generated
	 */
	public void setFINPaymentDetailV(List<ResultEntityType> newFINPaymentDetailV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTDETAILV,
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
	public List<ResultEntityType> getFINPaymentPriority() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPRIORITY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentPriority() <em>fINPaymentPriority</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentPriority() fINPaymentPriority}' feature.
	 * @generated
	 */
	public void setFINPaymentPriority(
			List<ResultEntityType> newFINPaymentPriority) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPRIORITY,
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
	public List<ResultEntityType> getFINPaymentPropDetail() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAIL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentPropDetail() <em>fINPaymentPropDetail</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentPropDetail() fINPaymentPropDetail}' feature.
	 * @generated
	 */
	public void setFINPaymentPropDetail(
			List<ResultEntityType> newFINPaymentPropDetail) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAIL,
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
	public List<ResultEntityType> getFINPaymentPropDetailV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAILV);
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
			List<ResultEntityType> newFINPaymentPropDetailV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPROPDETAILV,
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
	public List<ResultEntityType> getFINPaymentProposal() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPROPOSAL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentProposal() <em>fINPaymentProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentProposal() fINPaymentProposal}' feature.
	 * @generated
	 */
	public void setFINPaymentProposal(
			List<ResultEntityType> newFINPaymentProposal) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTPROPOSAL,
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
	public List<ResultEntityType> getFINPaymentSchedInvV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDINVV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentSchedInvV() <em>fINPaymentSchedInvV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentSchedInvV() fINPaymentSchedInvV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedInvV(
			List<ResultEntityType> newFINPaymentSchedInvV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDINVV,
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
	public List<ResultEntityType> getFINPaymentSchedOrdV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDORDV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentSchedOrdV() <em>fINPaymentSchedOrdV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentSchedOrdV() fINPaymentSchedOrdV}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedOrdV(
			List<ResultEntityType> newFINPaymentSchedOrdV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDORDV,
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
	public List<ResultEntityType> getFINPaymentSchedule() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINPaymentSchedule() <em>fINPaymentSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINPaymentSchedule() fINPaymentSchedule}' feature.
	 * @generated
	 */
	public void setFINPaymentSchedule(
			List<ResultEntityType> newFINPaymentSchedule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULE,
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
	public List<ResultEntityType> getFINPaymentScheduleDetail() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULEDETAIL);
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
			List<ResultEntityType> newFINPaymentScheduleDetail) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINPAYMENTSCHEDULEDETAIL,
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
	public List<ResultEntityType> getFINReconciliation() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINRECONCILIATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFINReconciliation() <em>fINReconciliation</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFINReconciliation() fINReconciliation}' feature.
	 * @generated
	 */
	public void setFINReconciliation(List<ResultEntityType> newFINReconciliation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINRECONCILIATION,
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
	public List<ResultEntityType> getFINReconciliationLineTemp() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINETEMP);
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
			List<ResultEntityType> newFINReconciliationLineTemp) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINETEMP,
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
	public List<ResultEntityType> getFINReconciliationLineV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINEV);
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
			List<ResultEntityType> newFINReconciliationLineV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINRECONCILIATIONLINEV,
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
	public List<ResultEntityType> getFinancialMgmtAccountingCombination() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGCOMBINATION);
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
			List<ResultEntityType> newFinancialMgmtAccountingCombination) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGCOMBINATION,
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
	public List<ResultEntityType> getFinancialMgmtAccountingFact() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGFACT);
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
			List<ResultEntityType> newFinancialMgmtAccountingFact) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGFACT,
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
	public List<ResultEntityType> getFinancialMgmtAccountingReport() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGREPORT);
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
			List<ResultEntityType> newFinancialMgmtAccountingReport) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGREPORT,
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
	public List<ResultEntityType> getFinancialMgmtAccountingRptElement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGRPTELEMENT);
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
			List<ResultEntityType> newFinancialMgmtAccountingRptElement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCOUNTINGRPTELEMENT,
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
	public List<ResultEntityType> getFinancialMgmtAcctCFS() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTCFS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAcctCFS() <em>financialMgmtAcctCFS</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAcctCFS() financialMgmtAcctCFS}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAcctCFS(
			List<ResultEntityType> newFinancialMgmtAcctCFS) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTCFS,
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
	public List<ResultEntityType> getFinancialMgmtAcctRptGroup() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTGROUP);
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
			List<ResultEntityType> newFinancialMgmtAcctRptGroup) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTGROUP,
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
	public List<ResultEntityType> getFinancialMgmtAcctRptNode() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTNODE);
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
			List<ResultEntityType> newFinancialMgmtAcctRptNode) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTRPTNODE,
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
	public List<ResultEntityType> getFinancialMgmtAcctSchema() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMA);
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
			List<ResultEntityType> newFinancialMgmtAcctSchema) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMA,
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
	public List<ResultEntityType> getFinancialMgmtAcctSchemaDefault() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMADEFAULT);
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
			List<ResultEntityType> newFinancialMgmtAcctSchemaDefault) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMADEFAULT,
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
	public List<ResultEntityType> getFinancialMgmtAcctSchemaElement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAELEMENT);
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
			List<ResultEntityType> newFinancialMgmtAcctSchemaElement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAELEMENT,
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
	public List<ResultEntityType> getFinancialMgmtAcctSchemaGL() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAGL);
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
			List<ResultEntityType> newFinancialMgmtAcctSchemaGL) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMAGL,
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
	public List<ResultEntityType> getFinancialMgmtAcctSchemaTable() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMATABLE);
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
			List<ResultEntityType> newFinancialMgmtAcctSchemaTable) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTACCTSCHEMATABLE,
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
	public List<ResultEntityType> getFinancialMgmtAmortization() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATION);
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
			List<ResultEntityType> newFinancialMgmtAmortization) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATION,
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
	public List<ResultEntityType> getFinancialMgmtAmortizationLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATIONLINE);
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
			List<ResultEntityType> newFinancialMgmtAmortizationLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTAMORTIZATIONLINE,
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
	public List<ResultEntityType> getFinancialMgmtAsset() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSET);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtAsset() <em>financialMgmtAsset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtAsset() financialMgmtAsset}' feature.
	 * @generated
	 */
	public void setFinancialMgmtAsset(
			List<ResultEntityType> newFinancialMgmtAsset) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSET,
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
	public List<ResultEntityType> getFinancialMgmtAssetAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETACCOUNTS);
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
			List<ResultEntityType> newFinancialMgmtAssetAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETACCOUNTS,
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
	public List<ResultEntityType> getFinancialMgmtAssetGroup() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUP);
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
			List<ResultEntityType> newFinancialMgmtAssetGroup) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUP,
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
	public List<ResultEntityType> getFinancialMgmtAssetGroupAcct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUPACCT);
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
			List<ResultEntityType> newFinancialMgmtAssetGroupAcct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTASSETGROUPACCT,
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
	public List<ResultEntityType> getFinancialMgmtBankFileFormat() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKFILEFORMAT);
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
			List<ResultEntityType> newFinancialMgmtBankFileFormat) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKFILEFORMAT,
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
	public List<ResultEntityType> getFinancialMgmtBankStatement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENT);
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
			List<ResultEntityType> newFinancialMgmtBankStatement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENT,
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
	public List<ResultEntityType> getFinancialMgmtBankStatementLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENTLINE);
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
			List<ResultEntityType> newFinancialMgmtBankStatementLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBANKSTATEMENTLINE,
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
	public List<ResultEntityType> getFinancialMgmtBudget() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGET);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtBudget() <em>financialMgmtBudget</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtBudget() financialMgmtBudget}' feature.
	 * @generated
	 */
	public void setFinancialMgmtBudget(
			List<ResultEntityType> newFinancialMgmtBudget) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGET,
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
	public List<ResultEntityType> getFinancialMgmtBudgetLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGETLINE);
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
			List<ResultEntityType> newFinancialMgmtBudgetLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTBUDGETLINE,
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
	public List<ResultEntityType> getFinancialMgmtCalendar() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCALENDAR);
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
			List<ResultEntityType> newFinancialMgmtCalendar) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCALENDAR,
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
	public List<ResultEntityType> getFinancialMgmtCashBook() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOK);
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
			List<ResultEntityType> newFinancialMgmtCashBook) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOK,
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
	public List<ResultEntityType> getFinancialMgmtCashBookAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOKACCOUNTS);
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
			List<ResultEntityType> newFinancialMgmtCashBookAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHBOOKACCOUNTS,
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
	public List<ResultEntityType> getFinancialMgmtCashJournal() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHJOURNAL);
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
			List<ResultEntityType> newFinancialMgmtCashJournal) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTCASHJOURNAL,
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
	public List<ResultEntityType> getFinancialMgmtDPManagement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENT);
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
			List<ResultEntityType> newFinancialMgmtDPManagement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENT,
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
	public List<ResultEntityType> getFinancialMgmtDPManagementLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENTLINE);
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
			List<ResultEntityType> newFinancialMgmtDPManagementLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDPMANAGEMENTLINE,
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
	public List<ResultEntityType> getFinancialMgmtDebtPayment() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENT);
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
			List<ResultEntityType> newFinancialMgmtDebtPayment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENT,
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
	public List<ResultEntityType> getFinancialMgmtDebtPaymentBalReplace() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALREPLACE);
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
			List<ResultEntityType> newFinancialMgmtDebtPaymentBalReplace) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALREPLACE,
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
	public List<ResultEntityType> getFinancialMgmtDebtPaymentBalancing() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALANCING);
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
			List<ResultEntityType> newFinancialMgmtDebtPaymentBalancing) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTBALANCING,
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
	public List<ResultEntityType> getFinancialMgmtDebtPaymentCancelV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTCANCELV);
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
			List<ResultEntityType> newFinancialMgmtDebtPaymentCancelV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTCANCELV,
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
	public List<ResultEntityType> getFinancialMgmtDebtPaymentGenerateV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTGENERATEV);
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
			List<ResultEntityType> newFinancialMgmtDebtPaymentGenerateV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDEBTPAYMENTGENERATEV,
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
	public List<ResultEntityType> getFinancialMgmtDimension() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDIMENSION);
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
			List<ResultEntityType> newFinancialMgmtDimension) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTDIMENSION,
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
	public List<ResultEntityType> getFinancialMgmtElement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtElement() <em>financialMgmtElement</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtElement() financialMgmtElement}' feature.
	 * @generated
	 */
	public void setFinancialMgmtElement(
			List<ResultEntityType> newFinancialMgmtElement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENT,
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
	public List<ResultEntityType> getFinancialMgmtElementValue() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUE);
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
			List<ResultEntityType> newFinancialMgmtElementValue) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUE,
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
	public List<ResultEntityType> getFinancialMgmtElementValueOperand() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUEOPERAND);
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
			List<ResultEntityType> newFinancialMgmtElementValueOperand) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUEOPERAND,
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
	public List<ResultEntityType> getFinancialMgmtElementValueTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUETRL);
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
			List<ResultEntityType> newFinancialMgmtElementValueTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTELEMENTVALUETRL,
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
	public List<ResultEntityType> getFinancialMgmtFinAccPaymentMethod() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTFINACCPAYMENTMETHOD);
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
			List<ResultEntityType> newFinancialMgmtFinAccPaymentMethod) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTFINACCPAYMENTMETHOD,
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
	public List<ResultEntityType> getFinancialMgmtGLBatch() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLBATCH);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLBatch() <em>financialMgmtGLBatch</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLBatch() financialMgmtGLBatch}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLBatch(
			List<ResultEntityType> newFinancialMgmtGLBatch) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLBATCH,
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
	public List<ResultEntityType> getFinancialMgmtGLCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCATEGORY);
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
			List<ResultEntityType> newFinancialMgmtGLCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCATEGORY,
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
	public List<ResultEntityType> getFinancialMgmtGLCharge() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGE);
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
			List<ResultEntityType> newFinancialMgmtGLCharge) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGE,
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
	public List<ResultEntityType> getFinancialMgmtGLChargeAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGEACCOUNTS);
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
			List<ResultEntityType> newFinancialMgmtGLChargeAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLCHARGEACCOUNTS,
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
	public List<ResultEntityType> getFinancialMgmtGLItem() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEM);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtGLItem() <em>financialMgmtGLItem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtGLItem() financialMgmtGLItem}' feature.
	 * @generated
	 */
	public void setFinancialMgmtGLItem(
			List<ResultEntityType> newFinancialMgmtGLItem) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEM,
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
	public List<ResultEntityType> getFinancialMgmtGLItemAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEMACCOUNTS);
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
			List<ResultEntityType> newFinancialMgmtGLItemAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLITEMACCOUNTS,
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
	public List<ResultEntityType> getFinancialMgmtGLJournal() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNAL);
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
			List<ResultEntityType> newFinancialMgmtGLJournal) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNAL,
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
	public List<ResultEntityType> getFinancialMgmtGLJournalLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNALLINE);
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
			List<ResultEntityType> newFinancialMgmtGLJournalLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTGLJOURNALLINE,
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
	public List<ResultEntityType> getFinancialMgmtIncoterms() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTINCOTERMS);
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
			List<ResultEntityType> newFinancialMgmtIncoterms) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTINCOTERMS,
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
	public List<ResultEntityType> getFinancialMgmtJournalLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTJOURNALLINE);
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
			List<ResultEntityType> newFinancialMgmtJournalLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTJOURNALLINE,
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
	public List<ResultEntityType> getFinancialMgmtMatchingAlgorithm() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTMATCHINGALGORITHM);
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
			List<ResultEntityType> newFinancialMgmtMatchingAlgorithm) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTMATCHINGALGORITHM,
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
	public List<ResultEntityType> getFinancialMgmtNonBusinessDay() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTNONBUSINESSDAY);
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
			List<ResultEntityType> newFinancialMgmtNonBusinessDay) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTNONBUSINESSDAY,
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
	public List<ResultEntityType> getFinancialMgmtPaymentExecutionHistoryV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONHISTORYV);
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
			List<ResultEntityType> newFinancialMgmtPaymentExecutionHistoryV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONHISTORYV,
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
	public List<ResultEntityType> getFinancialMgmtPaymentExecutionProcess() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESS);
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
			List<ResultEntityType> newFinancialMgmtPaymentExecutionProcess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESS,
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
	public List<ResultEntityType> getFinancialMgmtPaymentExecutionProcessParameter() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER);
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
			List<ResultEntityType> newFinancialMgmtPaymentExecutionProcessParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTEXECUTIONPROCESSPARAMETER,
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
	public List<ResultEntityType> getFinancialMgmtPaymentRun() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUN);
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
			List<ResultEntityType> newFinancialMgmtPaymentRun) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUN,
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
	public List<ResultEntityType> getFinancialMgmtPaymentRunParameter() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPARAMETER);
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
			List<ResultEntityType> newFinancialMgmtPaymentRunParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPARAMETER,
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
	public List<ResultEntityType> getFinancialMgmtPaymentRunPayment() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPAYMENT);
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
			List<ResultEntityType> newFinancialMgmtPaymentRunPayment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTRUNPAYMENT,
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
	public List<ResultEntityType> getFinancialMgmtPaymentTerm() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERM);
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
			List<ResultEntityType> newFinancialMgmtPaymentTerm) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERM,
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
	public List<ResultEntityType> getFinancialMgmtPaymentTermLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMLINE);
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
			List<ResultEntityType> newFinancialMgmtPaymentTermLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMLINE,
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
	public List<ResultEntityType> getFinancialMgmtPaymentTermTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMTRL);
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
			List<ResultEntityType> newFinancialMgmtPaymentTermTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPAYMENTTERMTRL,
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
	public List<ResultEntityType> getFinancialMgmtPeriod() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIOD);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtPeriod() <em>financialMgmtPeriod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtPeriod() financialMgmtPeriod}' feature.
	 * @generated
	 */
	public void setFinancialMgmtPeriod(
			List<ResultEntityType> newFinancialMgmtPeriod) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIOD,
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
	public List<ResultEntityType> getFinancialMgmtPeriodControl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROL);
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
			List<ResultEntityType> newFinancialMgmtPeriodControl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROL,
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
	public List<ResultEntityType> getFinancialMgmtPeriodControlV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROLV);
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
			List<ResultEntityType> newFinancialMgmtPeriodControlV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPERIODCONTROLV,
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
	public List<ResultEntityType> getFinancialMgmtPromissoryFormat() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPROMISSORYFORMAT);
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
			List<ResultEntityType> newFinancialMgmtPromissoryFormat) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTPROMISSORYFORMAT,
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
	public List<ResultEntityType> getFinancialMgmtRemittance() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCE);
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
			List<ResultEntityType> newFinancialMgmtRemittance) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCE,
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
	public List<ResultEntityType> getFinancialMgmtRemittanceLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCELINE);
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
			List<ResultEntityType> newFinancialMgmtRemittanceLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCELINE,
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
	public List<ResultEntityType> getFinancialMgmtRemittanceParameter() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCEPARAMETER);
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
			List<ResultEntityType> newFinancialMgmtRemittanceParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCEPARAMETER,
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
	public List<ResultEntityType> getFinancialMgmtRemittanceType() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCETYPE);
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
			List<ResultEntityType> newFinancialMgmtRemittanceType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTREMITTANCETYPE,
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
	public List<ResultEntityType> getFinancialMgmtSettlement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTSETTLEMENT);
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
			List<ResultEntityType> newFinancialMgmtSettlement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTSETTLEMENT,
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
	public List<ResultEntityType> getFinancialMgmtTaxCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORY);
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
			List<ResultEntityType> newFinancialMgmtTaxCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORY,
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
	public List<ResultEntityType> getFinancialMgmtTaxCategoryTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORYTRL);
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
			List<ResultEntityType> newFinancialMgmtTaxCategoryTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXCATEGORYTRL,
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
	public List<ResultEntityType> getFinancialMgmtTaxPayment() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXPAYMENT);
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
			List<ResultEntityType> newFinancialMgmtTaxPayment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXPAYMENT,
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
	public List<ResultEntityType> getFinancialMgmtTaxRate() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxRate() <em>financialMgmtTaxRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxRate() financialMgmtTaxRate}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxRate(
			List<ResultEntityType> newFinancialMgmtTaxRate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATE,
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
	public List<ResultEntityType> getFinancialMgmtTaxRateAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATEACCOUNTS);
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
			List<ResultEntityType> newFinancialMgmtTaxRateAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXRATEACCOUNTS,
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
	public List<ResultEntityType> getFinancialMgmtTaxRegister() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTER);
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
			List<ResultEntityType> newFinancialMgmtTaxRegister) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTER,
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
	public List<ResultEntityType> getFinancialMgmtTaxRegisterType() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPE);
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
			List<ResultEntityType> newFinancialMgmtTaxRegisterType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPE,
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
	public List<ResultEntityType> getFinancialMgmtTaxRegisterTypeLines() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPELINES);
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
			List<ResultEntityType> newFinancialMgmtTaxRegisterTypeLines) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERTYPELINES,
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
	public List<ResultEntityType> getFinancialMgmtTaxRegisterline() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERLINE);
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
			List<ResultEntityType> newFinancialMgmtTaxRegisterline) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREGISTERLINE,
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
	public List<ResultEntityType> getFinancialMgmtTaxReport() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREPORT);
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
			List<ResultEntityType> newFinancialMgmtTaxReport) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXREPORT,
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
	public List<ResultEntityType> getFinancialMgmtTaxTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxTrl() <em>financialMgmtTaxTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxTrl() financialMgmtTaxTrl}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxTrl(
			List<ResultEntityType> newFinancialMgmtTaxTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXTRL,
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
	public List<ResultEntityType> getFinancialMgmtTaxZone() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXZONE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtTaxZone() <em>financialMgmtTaxZone</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtTaxZone() financialMgmtTaxZone}' feature.
	 * @generated
	 */
	public void setFinancialMgmtTaxZone(
			List<ResultEntityType> newFinancialMgmtTaxZone) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTTAXZONE,
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
	public List<ResultEntityType> getFinancialMgmtWithholding() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDING);
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
			List<ResultEntityType> newFinancialMgmtWithholding) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDING,
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
	public List<ResultEntityType> getFinancialMgmtWithholdingAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDINGACCOUNTS);
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
			List<ResultEntityType> newFinancialMgmtWithholdingAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTWITHHOLDINGACCOUNTS,
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
	public List<ResultEntityType> getFinancialMgmtYear() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTYEAR);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getFinancialMgmtYear() <em>financialMgmtYear</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getFinancialMgmtYear() financialMgmtYear}' feature.
	 * @generated
	 */
	public void setFinancialMgmtYear(List<ResultEntityType> newFinancialMgmtYear) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.FINANCIALMGMTYEAR,
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
	public List<ResultEntityType> getGreeting() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.GREETING);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getGreeting() <em>greeting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getGreeting() greeting}' feature.
	 * @generated
	 */
	public void setGreeting(List<ResultEntityType> newGreeting) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.GREETING,
				newGreeting));
	}

	/**
	 * Returns the value of '<em><b>greetingTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>greetingTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getGreetingTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.GREETINGTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getGreetingTrl() <em>greetingTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getGreetingTrl() greetingTrl}' feature.
	 * @generated
	 */
	public void setGreetingTrl(List<ResultEntityType> newGreetingTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.GREETINGTRL,
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
	public List<ResultEntityType> getInvoice() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoice() <em>invoice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoice() invoice}' feature.
	 * @generated
	 */
	public void setInvoice(List<ResultEntityType> newInvoice) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICE,
						newInvoice));
	}

	/**
	 * Returns the value of '<em><b>invoiceDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>invoiceDiscount</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getInvoiceDiscount() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICEDISCOUNT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceDiscount() <em>invoiceDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceDiscount() invoiceDiscount}' feature.
	 * @generated
	 */
	public void setInvoiceDiscount(List<ResultEntityType> newInvoiceDiscount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICEDISCOUNT,
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
	public List<ResultEntityType> getInvoiceLine() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLine() <em>invoiceLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLine() invoiceLine}' feature.
	 * @generated
	 */
	public void setInvoiceLine(List<ResultEntityType> newInvoiceLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINE,
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
	public List<ResultEntityType> getInvoiceLineAccountingDimension() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINEACCOUNTINGDIMENSION);
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
			List<ResultEntityType> newInvoiceLineAccountingDimension) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINEACCOUNTINGDIMENSION,
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
	public List<ResultEntityType> getInvoiceLineOffer() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINEOFFER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLineOffer() <em>invoiceLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLineOffer() invoiceLineOffer}' feature.
	 * @generated
	 */
	public void setInvoiceLineOffer(List<ResultEntityType> newInvoiceLineOffer) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINEOFFER,
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
	public List<ResultEntityType> getInvoiceLineTax() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINETAX);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceLineTax() <em>invoiceLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceLineTax() invoiceLineTax}' feature.
	 * @generated
	 */
	public void setInvoiceLineTax(List<ResultEntityType> newInvoiceLineTax) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICELINETAX,
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
	public List<ResultEntityType> getInvoiceSchedule() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICESCHEDULE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceSchedule() <em>invoiceSchedule</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceSchedule() invoiceSchedule}' feature.
	 * @generated
	 */
	public void setInvoiceSchedule(List<ResultEntityType> newInvoiceSchedule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICESCHEDULE,
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
	public List<ResultEntityType> getInvoiceTax() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICETAX);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getInvoiceTax() <em>invoiceTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getInvoiceTax() invoiceTax}' feature.
	 * @generated
	 */
	public void setInvoiceTax(List<ResultEntityType> newInvoiceTax) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.INVOICETAX,
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
	public List<ResultEntityType> getLocation() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.LOCATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLocation() <em>location</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLocation() location}' feature.
	 * @generated
	 */
	public void setLocation(List<ResultEntityType> newLocation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.LOCATION,
				newLocation));
	}

	/**
	 * Returns the value of '<em><b>locator</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>locator</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getLocator() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.LOCATOR);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLocator() <em>locator</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLocator() locator}' feature.
	 * @generated
	 */
	public void setLocator(List<ResultEntityType> newLocator) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.LOCATOR,
						newLocator));
	}

	/**
	 * Returns the value of '<em><b>lot</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lot</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getLot() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.LOT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLot() <em>lot</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLot() lot}' feature.
	 * @generated
	 */
	public void setLot(List<ResultEntityType> newLot) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.LOT, newLot));
	}

	/**
	 * Returns the value of '<em><b>lotControl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lotControl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getLotControl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.LOTCONTROL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getLotControl() <em>lotControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getLotControl() lotControl}' feature.
	 * @generated
	 */
	public void setLotControl(List<ResultEntityType> newLotControl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.LOTCONTROL,
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
	public List<ResultEntityType> getMRPPlanner() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPLANNER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPlanner() <em>mRPPlanner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPlanner() mRPPlanner}' feature.
	 * @generated
	 */
	public void setMRPPlanner(List<ResultEntityType> newMRPPlanner) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPLANNER,
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
	public List<ResultEntityType> getMRPPlanningMethod() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHOD);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPlanningMethod() <em>mRPPlanningMethod</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPlanningMethod() mRPPlanningMethod}' feature.
	 * @generated
	 */
	public void setMRPPlanningMethod(List<ResultEntityType> newMRPPlanningMethod) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHOD,
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
	public List<ResultEntityType> getMRPPlanningMethodLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHODLINE);
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
			List<ResultEntityType> newMRPPlanningMethodLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPLANNINGMETHODLINE,
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
	public List<ResultEntityType> getMRPProductionRun() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPProductionRun() <em>mRPProductionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPProductionRun() mRPProductionRun}' feature.
	 * @generated
	 */
	public void setMRPProductionRun(List<ResultEntityType> newMRPProductionRun) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUN,
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
	public List<ResultEntityType> getMRPProductionRunLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUNLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPProductionRunLine() <em>mRPProductionRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPProductionRunLine() mRPProductionRunLine}' feature.
	 * @generated
	 */
	public void setMRPProductionRunLine(
			List<ResultEntityType> newMRPProductionRunLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPRODUCTIONRUNLINE,
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
	public List<ResultEntityType> getMRPPurchasingRun() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPurchasingRun() <em>mRPPurchasingRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPurchasingRun() mRPPurchasingRun}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRun(List<ResultEntityType> newMRPPurchasingRun) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUN,
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
	public List<ResultEntityType> getMRPPurchasingRunLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUNLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPPurchasingRunLine() <em>mRPPurchasingRunLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPPurchasingRunLine() mRPPurchasingRunLine}' feature.
	 * @generated
	 */
	public void setMRPPurchasingRunLine(
			List<ResultEntityType> newMRPPurchasingRunLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPPURCHASINGRUNLINE,
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
	public List<ResultEntityType> getMRPSalesForecast() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPSALESFORECAST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPSalesForecast() <em>mRPSalesForecast</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPSalesForecast() mRPSalesForecast}' feature.
	 * @generated
	 */
	public void setMRPSalesForecast(List<ResultEntityType> newMRPSalesForecast) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MRPSALESFORECAST,
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
	public List<ResultEntityType> getMRPSalesForecastLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPSALESFORECASTLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMRPSalesForecastLine() <em>mRPSalesForecastLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMRPSalesForecastLine() mRPSalesForecastLine}' feature.
	 * @generated
	 */
	public void setMRPSalesForecastLine(
			List<ResultEntityType> newMRPSalesForecastLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MRPSALESFORECASTLINE,
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
	public List<ResultEntityType> getManufacturingActivity() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITY);
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
			List<ResultEntityType> newManufacturingActivity) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITY,
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
	public List<ResultEntityType> getManufacturingActivityToolset() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITYTOOLSET);
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
			List<ResultEntityType> newManufacturingActivityToolset) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGACTIVITYTOOLSET,
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
	public List<ResultEntityType> getManufacturingCase() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCASE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingCase() <em>manufacturingCase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingCase() manufacturingCase}' feature.
	 * @generated
	 */
	public void setManufacturingCase(List<ResultEntityType> newManufacturingCase) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCASE,
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
	public List<ResultEntityType> getManufacturingCheckPoint() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINT);
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
			List<ResultEntityType> newManufacturingCheckPoint) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINT,
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
	public List<ResultEntityType> getManufacturingCheckPointSet() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSET);
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
			List<ResultEntityType> newManufacturingCheckPointSet) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSET,
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
	public List<ResultEntityType> getManufacturingCheckPointShift() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSHIFT);
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
			List<ResultEntityType> newManufacturingCheckPointShift) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCHECKPOINTSHIFT,
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
	public List<ResultEntityType> getManufacturingCostCenter() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTER);
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
			List<ResultEntityType> newManufacturingCostCenter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTER,
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
	public List<ResultEntityType> getManufacturingCostCenterMachine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERMACHINE);
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
			List<ResultEntityType> newManufacturingCostCenterMachine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERMACHINE,
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
	public List<ResultEntityType> getManufacturingCostcenterEmployee() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTEREMPLOYEE);
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
			List<ResultEntityType> newManufacturingCostcenterEmployee) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTEREMPLOYEE,
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
	public List<ResultEntityType> getManufacturingCostcenterIC() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERIC);
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
			List<ResultEntityType> newManufacturingCostcenterIC) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERIC,
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
	public List<ResultEntityType> getManufacturingCostcenterVersion() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERVERSION);
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
			List<ResultEntityType> newManufacturingCostcenterVersion) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGCOSTCENTERVERSION,
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
	public List<ResultEntityType> getManufacturingGlobalUse() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGGLOBALUSE);
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
			List<ResultEntityType> newManufacturingGlobalUse) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGGLOBALUSE,
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
	public List<ResultEntityType> getManufacturingIncidence() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGINCIDENCE);
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
			List<ResultEntityType> newManufacturingIncidence) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGINCIDENCE,
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
	public List<ResultEntityType> getManufacturingIndirectCost() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOST);
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
			List<ResultEntityType> newManufacturingIndirectCost) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOST,
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
	public List<ResultEntityType> getManufacturingIndirectCostValue() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOSTVALUE);
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
			List<ResultEntityType> newManufacturingIndirectCostValue) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGINDIRECTCOSTVALUE,
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
	public List<ResultEntityType> getManufacturingMachine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingMachine() <em>manufacturingMachine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingMachine() manufacturingMachine}' feature.
	 * @generated
	 */
	public void setManufacturingMachine(
			List<ResultEntityType> newManufacturingMachine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINE,
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
	public List<ResultEntityType> getManufacturingMachineCost() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINECOST);
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
			List<ResultEntityType> newManufacturingMachineCost) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINECOST,
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
	public List<ResultEntityType> getManufacturingMachineStation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINESTATION);
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
			List<ResultEntityType> newManufacturingMachineStation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINESTATION,
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
	public List<ResultEntityType> getManufacturingMachineType() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINETYPE);
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
			List<ResultEntityType> newManufacturingMachineType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMACHINETYPE,
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
	public List<ResultEntityType> getManufacturingMainteanceOrder() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTEANCEORDER);
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
			List<ResultEntityType> newManufacturingMainteanceOrder) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTEANCEORDER,
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
	public List<ResultEntityType> getManufacturingMaintenance() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCE);
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
			List<ResultEntityType> newManufacturingMaintenance) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCE,
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
	public List<ResultEntityType> getManufacturingMaintenancePeriodicity() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEPERIODICITY);
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
			List<ResultEntityType> newManufacturingMaintenancePeriodicity) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEPERIODICITY,
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
	public List<ResultEntityType> getManufacturingMaintenanceSchedule() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCESCHEDULE);
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
			List<ResultEntityType> newManufacturingMaintenanceSchedule) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCESCHEDULE,
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
	public List<ResultEntityType> getManufacturingMaintenanceTask() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCETASK);
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
			List<ResultEntityType> newManufacturingMaintenanceTask) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCETASK,
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
	public List<ResultEntityType> getManufacturingMaintenanceWorker() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEWORKER);
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
			List<ResultEntityType> newManufacturingMaintenanceWorker) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMAINTENANCEWORKER,
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
	public List<ResultEntityType> getManufacturingMeasureGroup() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREGROUP);
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
			List<ResultEntityType> newManufacturingMeasureGroup) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREGROUP,
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
	public List<ResultEntityType> getManufacturingMeasureShift() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURESHIFT);
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
			List<ResultEntityType> newManufacturingMeasureShift) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURESHIFT,
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
	public List<ResultEntityType> getManufacturingMeasureTime() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURETIME);
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
			List<ResultEntityType> newManufacturingMeasureTime) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASURETIME,
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
	public List<ResultEntityType> getManufacturingMeasureValues() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREVALUES);
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
			List<ResultEntityType> newManufacturingMeasureValues) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGMEASUREVALUES,
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
	public List<ResultEntityType> getManufacturingOperation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATION);
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
			List<ResultEntityType> newManufacturingOperation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATION,
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
	public List<ResultEntityType> getManufacturingOperationEmployee() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONEMPLOYEE);
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
			List<ResultEntityType> newManufacturingOperationEmployee) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONEMPLOYEE,
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
	public List<ResultEntityType> getManufacturingOperationIndirectCost() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONINDIRECTCOST);
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
			List<ResultEntityType> newManufacturingOperationIndirectCost) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONINDIRECTCOST,
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
	public List<ResultEntityType> getManufacturingOperationMachine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONMACHINE);
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
			List<ResultEntityType> newManufacturingOperationMachine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONMACHINE,
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
	public List<ResultEntityType> getManufacturingOperationProduct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONPRODUCT);
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
			List<ResultEntityType> newManufacturingOperationProduct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGOPERATIONPRODUCT,
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
	public List<ResultEntityType> getManufacturingPeriodicControl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPERIODICCONTROL);
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
			List<ResultEntityType> newManufacturingPeriodicControl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPERIODICCONTROL,
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
	public List<ResultEntityType> getManufacturingProcessPlan() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPROCESSPLAN);
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
			List<ResultEntityType> newManufacturingProcessPlan) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPROCESSPLAN,
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
	public List<ResultEntityType> getManufacturingProductionLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONLINE);
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
			List<ResultEntityType> newManufacturingProductionLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONLINE,
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
	public List<ResultEntityType> getManufacturingProductionRunEmployee() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNEMPLOYEE);
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
			List<ResultEntityType> newManufacturingProductionRunEmployee) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNEMPLOYEE,
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
	public List<ResultEntityType> getManufacturingProductionRunIndirectCosts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS);
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
			List<ResultEntityType> newManufacturingProductionRunIndirectCosts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINDIRECTCOSTS,
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
	public List<ResultEntityType> getManufacturingProductionRunInvoiceLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINVOICELINE);
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
			List<ResultEntityType> newManufacturingProductionRunInvoiceLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNINVOICELINE,
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
	public List<ResultEntityType> getManufacturingProductionRunMachine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNMACHINE);
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
			List<ResultEntityType> newManufacturingProductionRunMachine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNMACHINE,
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
	public List<ResultEntityType> getManufacturingProductionRunToolset() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNTOOLSET);
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
			List<ResultEntityType> newManufacturingProductionRunToolset) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGPRODUCTIONRUNTOOLSET,
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
	public List<ResultEntityType> getManufacturingSection() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGSECTION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingSection() <em>manufacturingSection</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingSection() manufacturingSection}' feature.
	 * @generated
	 */
	public void setManufacturingSection(
			List<ResultEntityType> newManufacturingSection) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGSECTION,
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
	public List<ResultEntityType> getManufacturingTest() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGTEST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingTest() <em>manufacturingTest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingTest() manufacturingTest}' feature.
	 * @generated
	 */
	public void setManufacturingTest(List<ResultEntityType> newManufacturingTest) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGTEST,
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
	public List<ResultEntityType> getManufacturingToolset() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSET);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingToolset() <em>manufacturingToolset</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingToolset() manufacturingToolset}' feature.
	 * @generated
	 */
	public void setManufacturingToolset(
			List<ResultEntityType> newManufacturingToolset) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSET,
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
	public List<ResultEntityType> getManufacturingToolsetType() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSETTYPE);
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
			List<ResultEntityType> newManufacturingToolsetType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGTOOLSETTYPE,
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
	public List<ResultEntityType> getManufacturingValue() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGVALUE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingValue() <em>manufacturingValue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingValue() manufacturingValue}' feature.
	 * @generated
	 */
	public void setManufacturingValue(
			List<ResultEntityType> newManufacturingValue) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGVALUE,
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
	public List<ResultEntityType> getManufacturingVersion() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGVERSION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getManufacturingVersion() <em>manufacturingVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getManufacturingVersion() manufacturingVersion}' feature.
	 * @generated
	 */
	public void setManufacturingVersion(
			List<ResultEntityType> newManufacturingVersion) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGVERSION,
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
	public List<ResultEntityType> getManufacturingWorkCenter() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKCENTER);
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
			List<ResultEntityType> newManufacturingWorkCenter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKCENTER,
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
	public List<ResultEntityType> getManufacturingWorkEffortEmployee() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTEMPLOYEE);
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
			List<ResultEntityType> newManufacturingWorkEffortEmployee) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTEMPLOYEE,
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
	public List<ResultEntityType> getManufacturingWorkEffortIncidence() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTINCIDENCE);
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
			List<ResultEntityType> newManufacturingWorkEffortIncidence) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKEFFORTINCIDENCE,
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
	public List<ResultEntityType> getManufacturingWorkRequirement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENT);
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
			List<ResultEntityType> newManufacturingWorkRequirement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENT,
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
	public List<ResultEntityType> getManufacturingWorkRequirementOperation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTOPERATION);
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
			List<ResultEntityType> newManufacturingWorkRequirementOperation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTOPERATION,
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
	public List<ResultEntityType> getManufacturingWorkRequirementProduct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTPRODUCT);
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
			List<ResultEntityType> newManufacturingWorkRequirementProduct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MANUFACTURINGWORKREQUIREMENTPRODUCT,
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
	public List<ResultEntityType> getMarketingCampaign() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MARKETINGCAMPAIGN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMarketingCampaign() <em>marketingCampaign</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMarketingCampaign() marketingCampaign}' feature.
	 * @generated
	 */
	public void setMarketingCampaign(List<ResultEntityType> newMarketingCampaign) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MARKETINGCAMPAIGN,
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
	public List<ResultEntityType> getMarketingChannel() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MARKETINGCHANNEL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMarketingChannel() <em>marketingChannel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMarketingChannel() marketingChannel}' feature.
	 * @generated
	 */
	public void setMarketingChannel(List<ResultEntityType> newMarketingChannel) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MARKETINGCHANNEL,
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
	public List<ResultEntityType> getMaterialMgmtABCActivity() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTABCACTIVITY);
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
			List<ResultEntityType> newMaterialMgmtABCActivity) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTABCACTIVITY,
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
	public List<ResultEntityType> getMaterialMgmtCosting() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTCOSTING);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getMaterialMgmtCosting() <em>materialMgmtCosting</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getMaterialMgmtCosting() materialMgmtCosting}' feature.
	 * @generated
	 */
	public void setMaterialMgmtCosting(
			List<ResultEntityType> newMaterialMgmtCosting) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTCOSTING,
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
	public List<ResultEntityType> getMaterialMgmtInternalConsumption() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTION);
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
			List<ResultEntityType> newMaterialMgmtInternalConsumption) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTION,
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
	public List<ResultEntityType> getMaterialMgmtInternalConsumptionLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTIONLINE);
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
			List<ResultEntityType> newMaterialMgmtInternalConsumptionLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALCONSUMPTIONLINE,
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
	public List<ResultEntityType> getMaterialMgmtInternalMovement() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENT);
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
			List<ResultEntityType> newMaterialMgmtInternalMovement) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENT,
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
	public List<ResultEntityType> getMaterialMgmtInternalMovementLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENTLINE);
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
			List<ResultEntityType> newMaterialMgmtInternalMovementLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINTERNALMOVEMENTLINE,
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
	public List<ResultEntityType> getMaterialMgmtInventoryCount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNT);
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
			List<ResultEntityType> newMaterialMgmtInventoryCount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNT,
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
	public List<ResultEntityType> getMaterialMgmtInventoryCountLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNTLINE);
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
			List<ResultEntityType> newMaterialMgmtInventoryCountLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTINVENTORYCOUNTLINE,
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
	public List<ResultEntityType> getMaterialMgmtMaterialTransaction() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTMATERIALTRANSACTION);
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
			List<ResultEntityType> newMaterialMgmtMaterialTransaction) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTMATERIALTRANSACTION,
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
	public List<ResultEntityType> getMaterialMgmtProductionPlan() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONPLAN);
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
			List<ResultEntityType> newMaterialMgmtProductionPlan) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONPLAN,
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
	public List<ResultEntityType> getMaterialMgmtProductionTransaction() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONTRANSACTION);
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
			List<ResultEntityType> newMaterialMgmtProductionTransaction) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTPRODUCTIONTRANSACTION,
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
	public List<ResultEntityType> getMaterialMgmtShipmentInOut() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUT);
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
			List<ResultEntityType> newMaterialMgmtShipmentInOut) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUT,
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
	public List<ResultEntityType> getMaterialMgmtShipmentInOutLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUTLINE);
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
			List<ResultEntityType> newMaterialMgmtShipmentInOutLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSHIPMENTINOUTLINE,
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
	public List<ResultEntityType> getMaterialMgmtStorageDetail() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEDETAIL);
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
			List<ResultEntityType> newMaterialMgmtStorageDetail) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEDETAIL,
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
	public List<ResultEntityType> getMaterialMgmtStoragePending() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEPENDING);
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
			List<ResultEntityType> newMaterialMgmtStoragePending) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MATERIALMGMTSTORAGEPENDING,
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
	public List<ResultEntityType> getModelImplementationParameter() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.MODELIMPLEMENTATIONPARAMETER);
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
			List<ResultEntityType> newModelImplementationParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.MODELIMPLEMENTATIONPARAMETER,
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
	public List<ResultEntityType> getModuleDBPrefix() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULEDBPREFIX);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleDBPrefix() <em>moduleDBPrefix</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleDBPrefix() moduleDBPrefix}' feature.
	 * @generated
	 */
	public void setModuleDBPrefix(List<ResultEntityType> newModuleDBPrefix) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULEDBPREFIX,
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
	public List<ResultEntityType> getModuleDependency() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULEDEPENDENCY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleDependency() <em>moduleDependency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleDependency() moduleDependency}' feature.
	 * @generated
	 */
	public void setModuleDependency(List<ResultEntityType> newModuleDependency) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULEDEPENDENCY,
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
	public List<ResultEntityType> getModuleLog() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULELOG);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleLog() <em>moduleLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleLog() moduleLog}' feature.
	 * @generated
	 */
	public void setModuleLog(List<ResultEntityType> newModuleLog) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULELOG,
				newModuleLog));
	}

	/**
	 * Returns the value of '<em><b>moduleTrl</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>moduleTrl</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getModuleTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULETRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getModuleTrl() <em>moduleTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getModuleTrl() moduleTrl}' feature.
	 * @generated
	 */
	public void setModuleTrl(List<ResultEntityType> newModuleTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.MODULETRL,
				newModuleTrl));
	}

	/**
	 * Returns the value of '<em><b>namingException</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>namingException</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getNamingException() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.NAMINGEXCEPTION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getNamingException() <em>namingException</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getNamingException() namingException}' feature.
	 * @generated
	 */
	public void setNamingException(List<ResultEntityType> newNamingException) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.NAMINGEXCEPTION,
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
	public List<ResultEntityType> getOBCLKERTemplate() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCLKERTemplate() <em>oBCLKERTemplate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCLKERTemplate() oBCLKERTemplate}' feature.
	 * @generated
	 */
	public void setOBCLKERTemplate(List<ResultEntityType> newOBCLKERTemplate) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATE,
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
	public List<ResultEntityType> getOBCLKERTemplateDependency() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATEDEPENDENCY);
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
			List<ResultEntityType> newOBCLKERTemplateDependency) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBCLKERTEMPLATEDEPENDENCY,
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
	public List<ResultEntityType> getOBCLKERUIDefinition() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBCLKERUIDEFINITION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCLKERUIDefinition() <em>oBCLKERUIDefinition</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCLKERUIDefinition() oBCLKERUIDefinition}' feature.
	 * @generated
	 */
	public void setOBCLKERUIDefinition(
			List<ResultEntityType> newOBCLKERUIDefinition) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBCLKERUIDEFINITION,
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
	public List<ResultEntityType> getOBCQLQueryColumn() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCQLQueryColumn() <em>oBCQLQueryColumn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCQLQueryColumn() oBCQLQueryColumn}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumn(List<ResultEntityType> newOBCQLQueryColumn) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMN,
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
	public List<ResultEntityType> getOBCQLQueryColumnTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMNTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCQLQueryColumnTrl() <em>oBCQLQueryColumnTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCQLQueryColumnTrl() oBCQLQueryColumnTrl}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnTrl(
			List<ResultEntityType> newOBCQLQueryColumnTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBCQLQUERYCOLUMNTRL,
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
	public List<ResultEntityType> getOBCQLWidgetQuery() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBCQLWIDGETQUERY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBCQLWidgetQuery() <em>oBCQLWidgetQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBCQLWidgetQuery() oBCQLWidgetQuery}' feature.
	 * @generated
	 */
	public void setOBCQLWidgetQuery(List<ResultEntityType> newOBCQLWidgetQuery) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBCQLWIDGETQUERY,
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
	public List<ResultEntityType> getOBKMOWidgetClass() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClass() <em>oBKMOWidgetClass</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClass() oBKMOWidgetClass}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClass(List<ResultEntityType> newOBKMOWidgetClass) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASS,
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
	public List<ResultEntityType> getOBKMOWidgetClassAccess() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSACCESS);
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
			List<ResultEntityType> newOBKMOWidgetClassAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSACCESS,
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
	public List<ResultEntityType> getOBKMOWidgetClassMenu() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENU);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClassMenu() <em>oBKMOWidgetClassMenu</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClassMenu() oBKMOWidgetClassMenu}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassMenu(
			List<ResultEntityType> newOBKMOWidgetClassMenu) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENU,
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
	public List<ResultEntityType> getOBKMOWidgetClassMenuTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENUTRL);
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
			List<ResultEntityType> newOBKMOWidgetClassMenuTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSMENUTRL,
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
	public List<ResultEntityType> getOBKMOWidgetClassTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetClassTrl() <em>oBKMOWidgetClassTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetClassTrl() oBKMOWidgetClassTrl}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetClassTrl(
			List<ResultEntityType> newOBKMOWidgetClassTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETCLASSTRL,
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
	public List<ResultEntityType> getOBKMOWidgetInstance() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETINSTANCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetInstance() <em>oBKMOWidgetInstance</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetInstance() oBKMOWidgetInstance}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetInstance(
			List<ResultEntityType> newOBKMOWidgetInstance) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETINSTANCE,
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
	public List<ResultEntityType> getOBKMOWidgetList() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETLIST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetList() <em>oBKMOWidgetList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetList() oBKMOWidgetList}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetList(List<ResultEntityType> newOBKMOWidgetList) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETLIST,
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
	public List<ResultEntityType> getOBKMOWidgetReference() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETREFERENCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetReference() <em>oBKMOWidgetReference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetReference() oBKMOWidgetReference}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetReference(
			List<ResultEntityType> newOBKMOWidgetReference) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETREFERENCE,
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
	public List<ResultEntityType> getOBKMOWidgetURL() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETURL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBKMOWidgetURL() <em>oBKMOWidgetURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBKMOWidgetURL() oBKMOWidgetURL}' feature.
	 * @generated
	 */
	public void setOBKMOWidgetURL(List<ResultEntityType> newOBKMOWidgetURL) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBKMOWIDGETURL,
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
	public List<ResultEntityType> getOBSEIGDefaults() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBSEIGDEFAULTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSEIGDefaults() <em>oBSEIGDefaults</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSEIGDefaults() oBSEIGDefaults}' feature.
	 * @generated
	 */
	public void setOBSEIGDefaults(List<ResultEntityType> newOBSEIGDefaults) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBSEIGDEFAULTS,
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
	public List<ResultEntityType> getOBSERDSDatasource() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSERDSDatasource() <em>oBSERDSDatasource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSERDSDatasource() oBSERDSDatasource}' feature.
	 * @generated
	 */
	public void setOBSERDSDatasource(List<ResultEntityType> newOBSERDSDatasource) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCE,
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
	public List<ResultEntityType> getOBSERDSDatasourceField() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCEFIELD);
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
			List<ResultEntityType> newOBSERDSDatasourceField) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBSERDSDATASOURCEFIELD,
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
	public List<ResultEntityType> getOBSOIDUserIdentifier() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBSOIDUSERIDENTIFIER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBSOIDUserIdentifier() <em>oBSOIDUserIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBSOIDUserIdentifier() oBSOIDUserIdentifier}' feature.
	 * @generated
	 */
	public void setOBSOIDUserIdentifier(
			List<ResultEntityType> newOBSOIDUserIdentifier) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBSOIDUSERIDENTIFIER,
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
	public List<ResultEntityType> getOBUIAPPMenuParameters() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPMENUPARAMETERS);
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
			List<ResultEntityType> newOBUIAPPMenuParameters) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPMENUPARAMETERS,
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
	public List<ResultEntityType> getOBUIAPPNavbarRoleaccess() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPNAVBARROLEACCESS);
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
			List<ResultEntityType> newOBUIAPPNavbarRoleaccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPNAVBARROLEACCESS,
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
	public List<ResultEntityType> getOBUIAPPNavigationBarComponent() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPNAVIGATIONBARCOMPONENT);
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
			List<ResultEntityType> newOBUIAPPNavigationBarComponent) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPNAVIGATIONBARCOMPONENT,
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
	public List<ResultEntityType> getOBUIAPPNote() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPNOTE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPNote() <em>oBUIAPPNote</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPNote() oBUIAPPNote}' feature.
	 * @generated
	 */
	public void setOBUIAPPNote(List<ResultEntityType> newOBUIAPPNote) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPNOTE,
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
	public List<ResultEntityType> getOBUIAPPParameter() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPParameter() <em>oBUIAPPParameter</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPParameter() oBUIAPPParameter}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameter(List<ResultEntityType> newOBUIAPPParameter) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETER,
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
	public List<ResultEntityType> getOBUIAPPParameterTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPParameterTrl() <em>oBUIAPPParameterTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPParameterTrl() oBUIAPPParameterTrl}' feature.
	 * @generated
	 */
	public void setOBUIAPPParameterTrl(
			List<ResultEntityType> newOBUIAPPParameterTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERTRL,
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
	public List<ResultEntityType> getOBUIAPPParameterValue() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERVALUE);
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
			List<ResultEntityType> newOBUIAPPParameterValue) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPARAMETERVALUE,
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
	public List<ResultEntityType> getOBUIAPPProcess() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPROCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPProcess() <em>oBUIAPPProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPProcess() oBUIAPPProcess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcess(List<ResultEntityType> newOBUIAPPProcess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPROCESS,
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
	public List<ResultEntityType> getOBUIAPPProcessAccess() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPROCESSACCESS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPProcessAccess() <em>oBUIAPPProcessAccess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPProcessAccess() oBUIAPPProcessAccess}' feature.
	 * @generated
	 */
	public void setOBUIAPPProcessAccess(
			List<ResultEntityType> newOBUIAPPProcessAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPPROCESSACCESS,
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
	public List<ResultEntityType> getOBUIAPPRefWindow() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPREFWINDOW);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUIAPPRefWindow() <em>oBUIAPPRefWindow</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUIAPPRefWindow() oBUIAPPRefWindow}' feature.
	 * @generated
	 */
	public void setOBUIAPPRefWindow(List<ResultEntityType> newOBUIAPPRefWindow) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPREFWINDOW,
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
	public List<ResultEntityType> getOBUIAPPUIPersonalization() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPUIPERSONALIZATION);
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
			List<ResultEntityType> newOBUIAPPUIPersonalization) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPUIPERSONALIZATION,
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
	public List<ResultEntityType> getOBUIAPPViewImplementation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPVIEWIMPLEMENTATION);
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
			List<ResultEntityType> newOBUIAPPViewImplementation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPVIEWIMPLEMENTATION,
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
	public List<ResultEntityType> getOBUISELSelector() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTOR);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelector() <em>oBUISELSelector</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelector() oBUISELSelector}' feature.
	 * @generated
	 */
	public void setOBUISELSelector(List<ResultEntityType> newOBUISELSelector) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTOR,
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
	public List<ResultEntityType> getOBUISELSelectorField() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELD);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelectorField() <em>oBUISELSelectorField</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelectorField() oBUISELSelectorField}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorField(
			List<ResultEntityType> newOBUISELSelectorField) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELD,
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
	public List<ResultEntityType> getOBUISELSelectorFieldTrl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELDTRL);
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
			List<ResultEntityType> newOBUISELSelectorFieldTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTORFIELDTRL,
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
	public List<ResultEntityType> getOBUISELSelectorTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTORTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOBUISELSelectorTrl() <em>oBUISELSelectorTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOBUISELSelectorTrl() oBUISELSelectorTrl}' feature.
	 * @generated
	 */
	public void setOBUISELSelectorTrl(
			List<ResultEntityType> newOBUISELSelectorTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.OBUISELSELECTORTRL,
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
	public List<ResultEntityType> getOrder() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.ORDER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrder() <em>order</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrder() order}' feature.
	 * @generated
	 */
	public void setOrder(List<ResultEntityType> newOrder) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDER, newOrder));
	}

	/**
	 * Returns the value of '<em><b>orderDiscount</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderDiscount</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getOrderDiscount() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERDISCOUNT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderDiscount() <em>orderDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderDiscount() orderDiscount}' feature.
	 * @generated
	 */
	public void setOrderDiscount(List<ResultEntityType> newOrderDiscount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERDISCOUNT,
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
	public List<ResultEntityType> getOrderLine() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderLine() <em>orderLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderLine() orderLine}' feature.
	 * @generated
	 */
	public void setOrderLine(List<ResultEntityType> newOrderLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERLINE,
				newOrderLine));
	}

	/**
	 * Returns the value of '<em><b>orderLineOffer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>orderLineOffer</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getOrderLineOffer() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERLINEOFFER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderLineOffer() <em>orderLineOffer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderLineOffer() orderLineOffer}' feature.
	 * @generated
	 */
	public void setOrderLineOffer(List<ResultEntityType> newOrderLineOffer) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERLINEOFFER,
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
	public List<ResultEntityType> getOrderLineTax() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERLINETAX);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderLineTax() <em>orderLineTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderLineTax() orderLineTax}' feature.
	 * @generated
	 */
	public void setOrderLineTax(List<ResultEntityType> newOrderLineTax) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERLINETAX,
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
	public List<ResultEntityType> getOrderTax() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERTAX);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrderTax() <em>orderTax</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrderTax() orderTax}' feature.
	 * @generated
	 */
	public void setOrderTax(List<ResultEntityType> newOrderTax) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORDERTAX,
				newOrderTax));
	}

	/**
	 * Returns the value of '<em><b>organization</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organization</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getOrganization() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganization() organization}' feature.
	 * @generated
	 */
	public void setOrganization(List<ResultEntityType> newOrganization) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATION,
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
	public List<ResultEntityType> getOrganizationAcctSchema() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONACCTSCHEMA);
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
			List<ResultEntityType> newOrganizationAcctSchema) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONACCTSCHEMA,
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
	public List<ResultEntityType> getOrganizationClosing() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONCLOSING);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationClosing() <em>organizationClosing</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationClosing() organizationClosing}' feature.
	 * @generated
	 */
	public void setOrganizationClosing(
			List<ResultEntityType> newOrganizationClosing) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONCLOSING,
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
	public List<ResultEntityType> getOrganizationInformation() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONINFORMATION);
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
			List<ResultEntityType> newOrganizationInformation) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONINFORMATION,
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
	public List<ResultEntityType> getOrganizationModuleV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONMODULEV);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationModuleV() <em>organizationModuleV</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationModuleV() organizationModuleV}' feature.
	 * @generated
	 */
	public void setOrganizationModuleV(
			List<ResultEntityType> newOrganizationModuleV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONMODULEV,
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
	public List<ResultEntityType> getOrganizationType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONTYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getOrganizationType() <em>organizationType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getOrganizationType() organizationType}' feature.
	 * @generated
	 */
	public void setOrganizationType(List<ResultEntityType> newOrganizationType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.ORGANIZATIONTYPE,
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
	public List<ResultEntityType> getPeriodControlLog() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PERIODCONTROLLOG);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPeriodControlLog() <em>periodControlLog</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPeriodControlLog() periodControlLog}' feature.
	 * @generated
	 */
	public void setPeriodControlLog(List<ResultEntityType> newPeriodControlLog) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PERIODCONTROLLOG,
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
	public List<ResultEntityType> getPricingAdjustment() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingAdjustment() <em>pricingAdjustment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingAdjustment() pricingAdjustment}' feature.
	 * @generated
	 */
	public void setPricingAdjustment(List<ResultEntityType> newPricingAdjustment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENT,
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
	public List<ResultEntityType> getPricingAdjustmentBusinessPartner() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNER);
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
			List<ResultEntityType> newPricingAdjustmentBusinessPartner) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNER,
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
	public List<ResultEntityType> getPricingAdjustmentBusinessPartnerGroup() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNERGROUP);
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
			List<ResultEntityType> newPricingAdjustmentBusinessPartnerGroup) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTBUSINESSPARTNERGROUP,
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
	public List<ResultEntityType> getPricingAdjustmentPriceList() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRICELIST);
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
			List<ResultEntityType> newPricingAdjustmentPriceList) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRICELIST,
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
	public List<ResultEntityType> getPricingAdjustmentProduct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCT);
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
			List<ResultEntityType> newPricingAdjustmentProduct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCT,
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
	public List<ResultEntityType> getPricingAdjustmentProductCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCTCATEGORY);
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
			List<ResultEntityType> newPricingAdjustmentProductCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGADJUSTMENTPRODUCTCATEGORY,
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
	public List<ResultEntityType> getPricingDiscount() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGDISCOUNT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingDiscount() <em>pricingDiscount</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingDiscount() pricingDiscount}' feature.
	 * @generated
	 */
	public void setPricingDiscount(List<ResultEntityType> newPricingDiscount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGDISCOUNT,
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
	public List<ResultEntityType> getPricingPriceList() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELIST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingPriceList() <em>pricingPriceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingPriceList() pricingPriceList}' feature.
	 * @generated
	 */
	public void setPricingPriceList(List<ResultEntityType> newPricingPriceList) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELIST,
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
	public List<ResultEntityType> getPricingPriceListSchema() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMA);
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
			List<ResultEntityType> newPricingPriceListSchema) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMA,
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
	public List<ResultEntityType> getPricingPriceListSchemeLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMELINE);
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
			List<ResultEntityType> newPricingPriceListSchemeLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELISTSCHEMELINE,
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
	public List<ResultEntityType> getPricingPriceListVersion() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELISTVERSION);
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
			List<ResultEntityType> newPricingPriceListVersion) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRICELISTVERSION,
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
	public List<ResultEntityType> getPricingProductPrice() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRODUCTPRICE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getPricingProductPrice() <em>pricingProductPrice</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getPricingProductPrice() pricingProductPrice}' feature.
	 * @generated
	 */
	public void setPricingProductPrice(
			List<ResultEntityType> newPricingProductPrice) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGPRODUCTPRICE,
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
	public List<ResultEntityType> getPricingVolumeDiscount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNT);
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
			List<ResultEntityType> newPricingVolumeDiscount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNT,
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
	public List<ResultEntityType> getPricingVolumeDiscountBusinessPartner() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTBUSINESSPARTNER);
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
			List<ResultEntityType> newPricingVolumeDiscountBusinessPartner) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTBUSINESSPARTNER,
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
	public List<ResultEntityType> getPricingVolumeDiscountInvoice() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTINVOICE);
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
			List<ResultEntityType> newPricingVolumeDiscountInvoice) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTINVOICE,
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
	public List<ResultEntityType> getPricingVolumeDiscountProduct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCT);
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
			List<ResultEntityType> newPricingVolumeDiscountProduct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCT,
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
	public List<ResultEntityType> getPricingVolumeDiscountProductCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY);
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
			List<ResultEntityType> newPricingVolumeDiscountProductCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTPRODUCTCATEGORY,
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
	public List<ResultEntityType> getPricingVolumeDiscountScale() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTSCALE);
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
			List<ResultEntityType> newPricingVolumeDiscountScale) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRICINGVOLUMEDISCOUNTSCALE,
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
	public List<ResultEntityType> getProcessExecution() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROCESSEXECUTION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcessExecution() <em>processExecution</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcessExecution() processExecution}' feature.
	 * @generated
	 */
	public void setProcessExecution(List<ResultEntityType> newProcessExecution) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROCESSEXECUTION,
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
	public List<ResultEntityType> getProcessRequest() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROCESSREQUEST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcessRequest() <em>processRequest</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcessRequest() processRequest}' feature.
	 * @generated
	 */
	public void setProcessRequest(List<ResultEntityType> newProcessRequest) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROCESSREQUEST,
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
	public List<ResultEntityType> getProcessRun() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROCESSRUN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProcessRun() <em>processRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProcessRun() processRun}' feature.
	 * @generated
	 */
	public void setProcessRun(List<ResultEntityType> newProcessRun) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROCESSRUN,
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
	public List<ResultEntityType> getProcurementPOInvoiceMatch() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTPOINVOICEMATCH);
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
			List<ResultEntityType> newProcurementPOInvoiceMatch) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTPOINVOICEMATCH,
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
	public List<ResultEntityType> getProcurementReceiptInvoiceMatch() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTRECEIPTINVOICEMATCH);
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
			List<ResultEntityType> newProcurementReceiptInvoiceMatch) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTRECEIPTINVOICEMATCH,
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
	public List<ResultEntityType> getProcurementRequisition() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITION);
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
			List<ResultEntityType> newProcurementRequisition) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITION,
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
	public List<ResultEntityType> getProcurementRequisitionLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONLINE);
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
			List<ResultEntityType> newProcurementRequisitionLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONLINE,
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
	public List<ResultEntityType> getProcurementRequisitionPOMatch() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONPOMATCH);
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
			List<ResultEntityType> newProcurementRequisitionPOMatch) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROCUREMENTREQUISITIONPOMATCH,
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
	public List<ResultEntityType> getProduct() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProduct() <em>product</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProduct() product}' feature.
	 * @generated
	 */
	public void setProduct(List<ResultEntityType> newProduct) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCT,
						newProduct));
	}

	/**
	 * Returns the value of '<em><b>productAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>productAccounts</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getProductAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductAccounts() <em>productAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductAccounts() productAccounts}' feature.
	 * @generated
	 */
	public void setProductAccounts(List<ResultEntityType> newProductAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTACCOUNTS,
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
	public List<ResultEntityType> getProductBOM() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTBOM);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductBOM() <em>productBOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductBOM() productBOM}' feature.
	 * @generated
	 */
	public void setProductBOM(List<ResultEntityType> newProductBOM) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTBOM,
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
	public List<ResultEntityType> getProductByPriceAndWarehouse() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTBYPRICEANDWAREHOUSE);
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
			List<ResultEntityType> newProductByPriceAndWarehouse) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTBYPRICEANDWAREHOUSE,
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
	public List<ResultEntityType> getProductCategory() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTCATEGORY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductCategory() <em>productCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductCategory() productCategory}' feature.
	 * @generated
	 */
	public void setProductCategory(List<ResultEntityType> newProductCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTCATEGORY,
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
	public List<ResultEntityType> getProductCategoryAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTCATEGORYACCOUNTS);
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
			List<ResultEntityType> newProductCategoryAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTCATEGORYACCOUNTS,
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
	public List<ResultEntityType> getProductCustomer() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTCUSTOMER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductCustomer() <em>productCustomer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductCustomer() productCustomer}' feature.
	 * @generated
	 */
	public void setProductCustomer(List<ResultEntityType> newProductCustomer) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTCUSTOMER,
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
	public List<ResultEntityType> getProductOrg() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTORG);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductOrg() <em>productOrg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductOrg() productOrg}' feature.
	 * @generated
	 */
	public void setProductOrg(List<ResultEntityType> newProductOrg) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTORG,
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
	public List<ResultEntityType> getProductStockView() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTSTOCKVIEW);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductStockView() <em>productStockView</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductStockView() productStockView}' feature.
	 * @generated
	 */
	public void setProductStockView(List<ResultEntityType> newProductStockView) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTSTOCKVIEW,
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
	public List<ResultEntityType> getProductSubstitute() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTSUBSTITUTE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductSubstitute() <em>productSubstitute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductSubstitute() productSubstitute}' feature.
	 * @generated
	 */
	public void setProductSubstitute(List<ResultEntityType> newProductSubstitute) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTSUBSTITUTE,
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
	public List<ResultEntityType> getProductTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductTrl() <em>productTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductTrl() productTrl}' feature.
	 * @generated
	 */
	public void setProductTrl(List<ResultEntityType> newProductTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTTRL,
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
	public List<ResultEntityType> getProductUOM() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTUOM);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProductUOM() <em>productUOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProductUOM() productUOM}' feature.
	 * @generated
	 */
	public void setProductUOM(List<ResultEntityType> newProductUOM) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PRODUCTUOM,
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
	public List<ResultEntityType> getProject() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProject() <em>project</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProject() project}' feature.
	 * @generated
	 */
	public void setProject(List<ResultEntityType> newProject) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECT,
						newProject));
	}

	/**
	 * Returns the value of '<em><b>projectAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>projectAccounts</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getProjectAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectAccounts() <em>projectAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectAccounts() projectAccounts}' feature.
	 * @generated
	 */
	public void setProjectAccounts(List<ResultEntityType> newProjectAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTACCOUNTS,
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
	public List<ResultEntityType> getProjectIssue() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTISSUE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectIssue() <em>projectIssue</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectIssue() projectIssue}' feature.
	 * @generated
	 */
	public void setProjectIssue(List<ResultEntityType> newProjectIssue) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTISSUE,
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
	public List<ResultEntityType> getProjectLine() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectLine() <em>projectLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectLine() projectLine}' feature.
	 * @generated
	 */
	public void setProjectLine(List<ResultEntityType> newProjectLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTLINE,
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
	public List<ResultEntityType> getProjectPhase() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPHASE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectPhase() <em>projectPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectPhase() projectPhase}' feature.
	 * @generated
	 */
	public void setProjectPhase(List<ResultEntityType> newProjectPhase) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPHASE,
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
	public List<ResultEntityType> getProjectProjectProposalTask() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPROJECTPROPOSALTASK);
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
			List<ResultEntityType> newProjectProjectProposalTask) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPROJECTPROPOSALTASK,
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
	public List<ResultEntityType> getProjectProposal() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPROPOSAL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectProposal() <em>projectProposal</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectProposal() projectProposal}' feature.
	 * @generated
	 */
	public void setProjectProposal(List<ResultEntityType> newProjectProposal) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPROPOSAL,
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
	public List<ResultEntityType> getProjectProposalLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPROPOSALLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectProposalLine() <em>projectProposalLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectProposalLine() projectProposalLine}' feature.
	 * @generated
	 */
	public void setProjectProposalLine(
			List<ResultEntityType> newProjectProposalLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTPROPOSALLINE,
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
	public List<ResultEntityType> getProjectStandardPhase() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTSTANDARDPHASE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectStandardPhase() <em>projectStandardPhase</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectStandardPhase() projectStandardPhase}' feature.
	 * @generated
	 */
	public void setProjectStandardPhase(
			List<ResultEntityType> newProjectStandardPhase) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTSTANDARDPHASE,
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
	public List<ResultEntityType> getProjectStandardTask() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTSTANDARDTASK);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectStandardTask() <em>projectStandardTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectStandardTask() projectStandardTask}' feature.
	 * @generated
	 */
	public void setProjectStandardTask(
			List<ResultEntityType> newProjectStandardTask) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTSTANDARDTASK,
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
	public List<ResultEntityType> getProjectTask() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTTASK);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectTask() <em>projectTask</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectTask() projectTask}' feature.
	 * @generated
	 */
	public void setProjectTask(List<ResultEntityType> newProjectTask) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTTASK,
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
	public List<ResultEntityType> getProjectType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTTYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectType() <em>projectType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectType() projectType}' feature.
	 * @generated
	 */
	public void setProjectType(List<ResultEntityType> newProjectType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTTYPE,
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
	public List<ResultEntityType> getProjectVendor() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTVENDOR);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getProjectVendor() <em>projectVendor</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getProjectVendor() projectVendor}' feature.
	 * @generated
	 */
	public void setProjectVendor(List<ResultEntityType> newProjectVendor) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.PROJECTVENDOR,
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
	public List<ResultEntityType> getReferenceDataStore() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.REFERENCEDATASTORE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReferenceDataStore() <em>referenceDataStore</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReferenceDataStore() referenceDataStore}' feature.
	 * @generated
	 */
	public void setReferenceDataStore(
			List<ResultEntityType> newReferenceDataStore) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.REFERENCEDATASTORE,
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
	public List<ResultEntityType> getRegion() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.REGION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getRegion() <em>region</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getRegion() region}' feature.
	 * @generated
	 */
	public void setRegion(List<ResultEntityType> newRegion) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.REGION, newRegion));
	}

	/**
	 * Returns the value of '<em><b>resource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resource</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getResource() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResource() <em>resource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResource() resource}' feature.
	 * @generated
	 */
	public void setResource(List<ResultEntityType> newResource) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCE,
				newResource));
	}

	/**
	 * Returns the value of '<em><b>resourceAssignment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>resourceAssignment</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getResourceAssignment() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCEASSIGNMENT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResourceAssignment() <em>resourceAssignment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResourceAssignment() resourceAssignment}' feature.
	 * @generated
	 */
	public void setResourceAssignment(
			List<ResultEntityType> newResourceAssignment) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCEASSIGNMENT,
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
	public List<ResultEntityType> getResourceType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCETYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResourceType() <em>resourceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResourceType() resourceType}' feature.
	 * @generated
	 */
	public void setResourceType(List<ResultEntityType> newResourceType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCETYPE,
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
	public List<ResultEntityType> getResourceUnAvailable() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCEUNAVAILABLE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getResourceUnAvailable() <em>resourceUnAvailable</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getResourceUnAvailable() resourceUnAvailable}' feature.
	 * @generated
	 */
	public void setResourceUnAvailable(
			List<ResultEntityType> newResourceUnAvailable) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.RESOURCEUNAVAILABLE,
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
	public List<ResultEntityType> getReturnMaterialOrderPickEditLines() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNMATERIALORDERPICKEDITLINES);
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
			List<ResultEntityType> newReturnMaterialOrderPickEditLines) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNMATERIALORDERPICKEDITLINES,
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
	public List<ResultEntityType> getReturnMaterialReceiptPickEdit() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNMATERIALRECEIPTPICKEDIT);
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
			List<ResultEntityType> newReturnMaterialReceiptPickEdit) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNMATERIALRECEIPTPICKEDIT,
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
	public List<ResultEntityType> getReturnMaterialShipmentPickEdit() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNMATERIALSHIPMENTPICKEDIT);
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
			List<ResultEntityType> newReturnMaterialShipmentPickEdit) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNMATERIALSHIPMENTPICKEDIT,
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
	public List<ResultEntityType> getReturnReason() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNREASON);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReturnReason() <em>returnReason</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReturnReason() returnReason}' feature.
	 * @generated
	 */
	public void setReturnReason(List<ResultEntityType> newReturnReason) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.RETURNREASON,
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
	public List<ResultEntityType> getReversedInvoices() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.REVERSEDINVOICES);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getReversedInvoices() <em>reversedInvoices</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getReversedInvoices() reversedInvoices}' feature.
	 * @generated
	 */
	public void setReversedInvoices(List<ResultEntityType> newReversedInvoices) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.REVERSEDINVOICES,
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
	public List<ResultEntityType> getSQLScript() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.SQLSCRIPT);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSQLScript() <em>sQLScript</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSQLScript() sQLScript}' feature.
	 * @generated
	 */
	public void setSQLScript(List<ResultEntityType> newSQLScript) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.SQLSCRIPT,
				newSQLScript));
	}

	/**
	 * Returns the value of '<em><b>salaryCategory</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>salaryCategory</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getSalaryCategory() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALARYCATEGORY);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalaryCategory() <em>salaryCategory</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalaryCategory() salaryCategory}' feature.
	 * @generated
	 */
	public void setSalaryCategory(List<ResultEntityType> newSalaryCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALARYCATEGORY,
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
	public List<ResultEntityType> getSalaryCategoryCost() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALARYCATEGORYCOST);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalaryCategoryCost() <em>salaryCategoryCost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalaryCategoryCost() salaryCategoryCost}' feature.
	 * @generated
	 */
	public void setSalaryCategoryCost(
			List<ResultEntityType> newSalaryCategoryCost) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALARYCATEGORYCOST,
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
	public List<ResultEntityType> getSalesCommission() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommission() <em>salesCommission</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommission() salesCommission}' feature.
	 * @generated
	 */
	public void setSalesCommission(List<ResultEntityType> newSalesCommission) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSION,
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
	public List<ResultEntityType> getSalesCommissionAmount() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONAMOUNT);
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
			List<ResultEntityType> newSalesCommissionAmount) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONAMOUNT,
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
	public List<ResultEntityType> getSalesCommissionDetail() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONDETAIL);
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
			List<ResultEntityType> newSalesCommissionDetail) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONDETAIL,
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
	public List<ResultEntityType> getSalesCommissionLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONLINE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommissionLine() <em>salesCommissionLine</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommissionLine() salesCommissionLine}' feature.
	 * @generated
	 */
	public void setSalesCommissionLine(
			List<ResultEntityType> newSalesCommissionLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONLINE,
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
	public List<ResultEntityType> getSalesCommissionRun() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONRUN);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesCommissionRun() <em>salesCommissionRun</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesCommissionRun() salesCommissionRun}' feature.
	 * @generated
	 */
	public void setSalesCommissionRun(
			List<ResultEntityType> newSalesCommissionRun) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALESCOMMISSIONRUN,
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
	public List<ResultEntityType> getSalesRegion() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALESREGION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSalesRegion() <em>salesRegion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSalesRegion() salesRegion}' feature.
	 * @generated
	 */
	public void setSalesRegion(List<ResultEntityType> newSalesRegion) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.SALESREGION,
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
	public List<ResultEntityType> getSerialNumberControl() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SERIALNUMBERCONTROL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getSerialNumberControl() <em>serialNumberControl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getSerialNumberControl() serialNumberControl}' feature.
	 * @generated
	 */
	public void setSerialNumberControl(
			List<ResultEntityType> newSerialNumberControl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SERIALNUMBERCONTROL,
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
	public List<ResultEntityType> getShippingFreightCategory() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SHIPPINGFREIGHTCATEGORY);
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
			List<ResultEntityType> newShippingFreightCategory) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SHIPPINGFREIGHTCATEGORY,
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
	public List<ResultEntityType> getShippingShippingCompany() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANY);
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
			List<ResultEntityType> newShippingShippingCompany) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANY,
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
	public List<ResultEntityType> getShippingShippingCompanyFreight() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANYFREIGHT);
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
			List<ResultEntityType> newShippingShippingCompanyFreight) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.SHIPPINGSHIPPINGCOMPANYFREIGHT,
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
	public List<ResultEntityType> getTimeAndExpenseSheet() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEET);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getTimeAndExpenseSheet() <em>timeAndExpenseSheet</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getTimeAndExpenseSheet() timeAndExpenseSheet}' feature.
	 * @generated
	 */
	public void setTimeAndExpenseSheet(
			List<ResultEntityType> newTimeAndExpenseSheet) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEET,
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
	public List<ResultEntityType> getTimeAndExpenseSheetLine() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINE);
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
			List<ResultEntityType> newTimeAndExpenseSheetLine) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINE,
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
	public List<ResultEntityType> getTimeAndExpenseSheetLineV() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINEV);
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
			List<ResultEntityType> newTimeAndExpenseSheetLineV) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.TIMEANDEXPENSESHEETLINEV,
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
	public List<ResultEntityType> getTimeType() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.TIMETYPE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getTimeType() <em>timeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getTimeType() timeType}' feature.
	 * @generated
	 */
	public void setTimeType(List<ResultEntityType> newTimeType) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.TIMETYPE,
				newTimeType));
	}

	/**
	 * Returns the value of '<em><b>uOM</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOM</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getUOM() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.UOM);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getUOM() <em>uOM</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getUOM() uOM}' feature.
	 * @generated
	 */
	public void setUOM(List<ResultEntityType> newUOM) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.UOM, newUOM));
	}

	/**
	 * Returns the value of '<em><b>uOMConversion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uOMConversion</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getUOMConversion() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.UOMCONVERSION);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getUOMConversion() <em>uOMConversion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getUOMConversion() uOMConversion}' feature.
	 * @generated
	 */
	public void setUOMConversion(List<ResultEntityType> newUOMConversion) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.UOMCONVERSION,
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
	public List<ResultEntityType> getUOMTrl() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(), ResultEntitiesTypeGroupFeatureGroup.Feature.UOMTRL);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getUOMTrl() <em>uOMTrl</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getUOMTrl() uOMTrl}' feature.
	 * @generated
	 */
	public void setUOMTrl(List<ResultEntityType> newUOMTrl) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.UOMTRL, newUOMTrl));
	}

	/**
	 * Returns the value of '<em><b>vendorAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>vendorAccounts</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getVendorAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.VENDORACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getVendorAccounts() <em>vendorAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getVendorAccounts() vendorAccounts}' feature.
	 * @generated
	 */
	public void setVendorAccounts(List<ResultEntityType> newVendorAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.VENDORACCOUNTS,
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
	public List<ResultEntityType> getWarehouse() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.WAREHOUSE);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getWarehouse() <em>warehouse</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getWarehouse() warehouse}' feature.
	 * @generated
	 */
	public void setWarehouse(List<ResultEntityType> newWarehouse) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.WAREHOUSE,
				newWarehouse));
	}

	/**
	 * Returns the value of '<em><b>warehouseAccounts</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warehouseAccounts</b></em>' feature
	 * @generated
	 */
	public List<ResultEntityType> getWarehouseAccounts() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.WAREHOUSEACCOUNTS);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getWarehouseAccounts() <em>warehouseAccounts</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getWarehouseAccounts() warehouseAccounts}' feature.
	 * @generated
	 */
	public void setWarehouseAccounts(List<ResultEntityType> newWarehouseAccounts) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.WAREHOUSEACCOUNTS,
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
	public List<ResultEntityType> getWarehouseShipper() {
		return ResultEntitiesTypeGroupFeatureGroup.createUnmodifiableValueList(
				getGroup(),
				ResultEntitiesTypeGroupFeatureGroup.Feature.WAREHOUSESHIPPER);
	}

	/**
	 * Sets the '{@link ResultEntitiesType#getWarehouseShipper() <em>warehouseShipper</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultEntitiesType#getWarehouseShipper() warehouseShipper}' feature.
	 * @generated
	 */
	public void setWarehouseShipper(List<ResultEntityType> newWarehouseShipper) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup.createFeatureGroupList(
				ResultEntitiesTypeGroupFeatureGroup.Feature.WAREHOUSESHIPPER,
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
	public List<ResultEntityType> getObuiappViewRoleAccess() {
		return ResultEntitiesTypeGroupFeatureGroup
				.createUnmodifiableValueList(
						getGroup(),
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPVIEWROLEACCESS);
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
			List<ResultEntityType> newObuiappViewRoleAccess) {
		setGroup(ResultEntitiesTypeGroupFeatureGroup
				.createFeatureGroupList(
						ResultEntitiesTypeGroupFeatureGroup.Feature.OBUIAPPVIEWROLEACCESS,
						newObuiappViewRoleAccess));
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ResultEntitiesType ";
	}
}
