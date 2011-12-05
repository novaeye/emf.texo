package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADProcessType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADProcessType {

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
	private String helpComment = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String dataAccessLevel = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean userCanStartProcess = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String procedure = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean report = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean directPrint = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String javaClassName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean background = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean jasperReport = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String jRTemplateName = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String serviceType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean externalService = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String serviceSource = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType module = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String uIPattern = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean advancedFeature = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDColumnList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDMenuList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADModelImplementationListType aDModelImplementationList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessAccessListType1 aDProcessAccessList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDProcessInstanceList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessParameterListType aDProcessParameterList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessSchedulingListType aDProcessSchedulingList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADProcessTrlListType aDProcessTrlList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDTabList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType processExecutionList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ProcessRequestListType processRequestList = null;

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
	private List<ADProcessTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADProcessTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADProcessType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getId() id}' feature.
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
	 * Sets the '{@link ADProcessType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getClient() client}' feature.
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
	 * Sets the '{@link ADProcessType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADProcessType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getActive() active}' feature.
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
	 * Sets the '{@link ADProcessType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADProcessType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADProcessType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADProcessType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getUpdatedBy() updatedBy}' feature.
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
	 * Sets the '{@link ADProcessType#getSearchKey() <em>searchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getSearchKey() searchKey}' feature.
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
	 * Sets the '{@link ADProcessType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getName() name}' feature.
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
	 * Sets the '{@link ADProcessType#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
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
	 * Sets the '{@link ADProcessType#getHelpComment() <em>helpComment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getHelpComment() helpComment}' feature.
	 * @generated
	 */
	public void setHelpComment(String newHelpComment) {
		helpComment = newHelpComment;
	}

	/**
	 * Returns the value of '<em><b>dataAccessLevel</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>dataAccessLevel</b></em>' feature
	 * @generated
	 */
	public String getDataAccessLevel() {
		return dataAccessLevel;
	}

	/**
	 * Sets the '{@link ADProcessType#getDataAccessLevel() <em>dataAccessLevel</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getDataAccessLevel() dataAccessLevel}' feature.
	 * @generated
	 */
	public void setDataAccessLevel(String newDataAccessLevel) {
		dataAccessLevel = newDataAccessLevel;
	}

	/**
	 * Returns the value of '<em><b>userCanStartProcess</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>userCanStartProcess</b></em>' feature
	 * @generated
	 */
	public Boolean getUserCanStartProcess() {
		return userCanStartProcess;
	}

	/**
	 * Sets the '{@link ADProcessType#getUserCanStartProcess() <em>userCanStartProcess</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getUserCanStartProcess() userCanStartProcess}' feature.
	 * @generated
	 */
	public void setUserCanStartProcess(Boolean newUserCanStartProcess) {
		userCanStartProcess = newUserCanStartProcess;
	}

	/**
	 * Returns the value of '<em><b>procedure</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>procedure</b></em>' feature
	 * @generated
	 */
	public String getProcedure() {
		return procedure;
	}

	/**
	 * Sets the '{@link ADProcessType#getProcedure() <em>procedure</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getProcedure() procedure}' feature.
	 * @generated
	 */
	public void setProcedure(String newProcedure) {
		procedure = newProcedure;
	}

	/**
	 * Returns the value of '<em><b>report</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>report</b></em>' feature
	 * @generated
	 */
	public Boolean getReport() {
		return report;
	}

	/**
	 * Sets the '{@link ADProcessType#getReport() <em>report</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getReport() report}' feature.
	 * @generated
	 */
	public void setReport(Boolean newReport) {
		report = newReport;
	}

	/**
	 * Returns the value of '<em><b>directPrint</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>directPrint</b></em>' feature
	 * @generated
	 */
	public Boolean getDirectPrint() {
		return directPrint;
	}

	/**
	 * Sets the '{@link ADProcessType#getDirectPrint() <em>directPrint</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getDirectPrint() directPrint}' feature.
	 * @generated
	 */
	public void setDirectPrint(Boolean newDirectPrint) {
		directPrint = newDirectPrint;
	}

	/**
	 * Returns the value of '<em><b>javaClassName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>javaClassName</b></em>' feature
	 * @generated
	 */
	public String getJavaClassName() {
		return javaClassName;
	}

	/**
	 * Sets the '{@link ADProcessType#getJavaClassName() <em>javaClassName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getJavaClassName() javaClassName}' feature.
	 * @generated
	 */
	public void setJavaClassName(String newJavaClassName) {
		javaClassName = newJavaClassName;
	}

	/**
	 * Returns the value of '<em><b>background</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>background</b></em>' feature
	 * @generated
	 */
	public Boolean getBackground() {
		return background;
	}

	/**
	 * Sets the '{@link ADProcessType#getBackground() <em>background</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getBackground() background}' feature.
	 * @generated
	 */
	public void setBackground(Boolean newBackground) {
		background = newBackground;
	}

	/**
	 * Returns the value of '<em><b>jasperReport</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>jasperReport</b></em>' feature
	 * @generated
	 */
	public Boolean getJasperReport() {
		return jasperReport;
	}

	/**
	 * Sets the '{@link ADProcessType#getJasperReport() <em>jasperReport</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getJasperReport() jasperReport}' feature.
	 * @generated
	 */
	public void setJasperReport(Boolean newJasperReport) {
		jasperReport = newJasperReport;
	}

	/**
	 * Returns the value of '<em><b>jRTemplateName</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>jRTemplateName</b></em>' feature
	 * @generated
	 */
	public String getJRTemplateName() {
		return jRTemplateName;
	}

	/**
	 * Sets the '{@link ADProcessType#getJRTemplateName() <em>jRTemplateName</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getJRTemplateName() jRTemplateName}' feature.
	 * @generated
	 */
	public void setJRTemplateName(String newJRTemplateName) {
		jRTemplateName = newJRTemplateName;
	}

	/**
	 * Returns the value of '<em><b>serviceType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serviceType</b></em>' feature
	 * @generated
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * Sets the '{@link ADProcessType#getServiceType() <em>serviceType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getServiceType() serviceType}' feature.
	 * @generated
	 */
	public void setServiceType(String newServiceType) {
		serviceType = newServiceType;
	}

	/**
	 * Returns the value of '<em><b>externalService</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>externalService</b></em>' feature
	 * @generated
	 */
	public Boolean getExternalService() {
		return externalService;
	}

	/**
	 * Sets the '{@link ADProcessType#getExternalService() <em>externalService</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getExternalService() externalService}' feature.
	 * @generated
	 */
	public void setExternalService(Boolean newExternalService) {
		externalService = newExternalService;
	}

	/**
	 * Returns the value of '<em><b>serviceSource</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>serviceSource</b></em>' feature
	 * @generated
	 */
	public String getServiceSource() {
		return serviceSource;
	}

	/**
	 * Sets the '{@link ADProcessType#getServiceSource() <em>serviceSource</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getServiceSource() serviceSource}' feature.
	 * @generated
	 */
	public void setServiceSource(String newServiceSource) {
		serviceSource = newServiceSource;
	}

	/**
	 * Returns the value of '<em><b>module</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>module</b></em>' feature
	 * @generated
	 */
	public ReferenceType getModule() {
		return module;
	}

	/**
	 * Sets the '{@link ADProcessType#getModule() <em>module</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getModule() module}' feature.
	 * @generated
	 */
	public void setModule(ReferenceType newModule) {
		module = newModule;
	}

	/**
	 * Returns the value of '<em><b>uIPattern</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>uIPattern</b></em>' feature
	 * @generated
	 */
	public String getUIPattern() {
		return uIPattern;
	}

	/**
	 * Sets the '{@link ADProcessType#getUIPattern() <em>uIPattern</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getUIPattern() uIPattern}' feature.
	 * @generated
	 */
	public void setUIPattern(String newUIPattern) {
		uIPattern = newUIPattern;
	}

	/**
	 * Returns the value of '<em><b>advancedFeature</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>advancedFeature</b></em>' feature
	 * @generated
	 */
	public Boolean getAdvancedFeature() {
		return advancedFeature;
	}

	/**
	 * Sets the '{@link ADProcessType#getAdvancedFeature() <em>advancedFeature</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getAdvancedFeature() advancedFeature}' feature.
	 * @generated
	 */
	public void setAdvancedFeature(Boolean newAdvancedFeature) {
		advancedFeature = newAdvancedFeature;
	}

	/**
	 * Returns the value of '<em><b>aDColumnList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDColumnList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADColumnList() {
		return aDColumnList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADColumnList() <em>aDColumnList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADColumnList() aDColumnList}' feature.
	 * @generated
	 */
	public void setADColumnList(ReferenceType newADColumnList) {
		aDColumnList = newADColumnList;
	}

	/**
	 * Returns the value of '<em><b>aDMenuList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDMenuList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADMenuList() {
		return aDMenuList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADMenuList() <em>aDMenuList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADMenuList() aDMenuList}' feature.
	 * @generated
	 */
	public void setADMenuList(ReferenceType newADMenuList) {
		aDMenuList = newADMenuList;
	}

	/**
	 * Returns the value of '<em><b>aDModelImplementationList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDModelImplementationList</b></em>' feature
	 * @generated
	 */
	public ADModelImplementationListType getADModelImplementationList() {
		return aDModelImplementationList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADModelImplementationList() <em>aDModelImplementationList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADModelImplementationList() aDModelImplementationList}' feature.
	 * @generated
	 */
	public void setADModelImplementationList(
			ADModelImplementationListType newADModelImplementationList) {
		aDModelImplementationList = newADModelImplementationList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessAccessList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessAccessList</b></em>' feature
	 * @generated
	 */
	public ADProcessAccessListType1 getADProcessAccessList() {
		return aDProcessAccessList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADProcessAccessList() <em>aDProcessAccessList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADProcessAccessList() aDProcessAccessList}' feature.
	 * @generated
	 */
	public void setADProcessAccessList(
			ADProcessAccessListType1 newADProcessAccessList) {
		aDProcessAccessList = newADProcessAccessList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessInstanceList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessInstanceList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADProcessInstanceList() {
		return aDProcessInstanceList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADProcessInstanceList() <em>aDProcessInstanceList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADProcessInstanceList() aDProcessInstanceList}' feature.
	 * @generated
	 */
	public void setADProcessInstanceList(ReferenceType newADProcessInstanceList) {
		aDProcessInstanceList = newADProcessInstanceList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessParameterList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessParameterList</b></em>' feature
	 * @generated
	 */
	public ADProcessParameterListType getADProcessParameterList() {
		return aDProcessParameterList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADProcessParameterList() <em>aDProcessParameterList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADProcessParameterList() aDProcessParameterList}' feature.
	 * @generated
	 */
	public void setADProcessParameterList(
			ADProcessParameterListType newADProcessParameterList) {
		aDProcessParameterList = newADProcessParameterList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessSchedulingList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessSchedulingList</b></em>' feature
	 * @generated
	 */
	public ADProcessSchedulingListType getADProcessSchedulingList() {
		return aDProcessSchedulingList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADProcessSchedulingList() <em>aDProcessSchedulingList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADProcessSchedulingList() aDProcessSchedulingList}' feature.
	 * @generated
	 */
	public void setADProcessSchedulingList(
			ADProcessSchedulingListType newADProcessSchedulingList) {
		aDProcessSchedulingList = newADProcessSchedulingList;
	}

	/**
	 * Returns the value of '<em><b>aDProcessTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDProcessTrlList</b></em>' feature
	 * @generated
	 */
	public ADProcessTrlListType getADProcessTrlList() {
		return aDProcessTrlList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADProcessTrlList() <em>aDProcessTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADProcessTrlList() aDProcessTrlList}' feature.
	 * @generated
	 */
	public void setADProcessTrlList(ADProcessTrlListType newADProcessTrlList) {
		aDProcessTrlList = newADProcessTrlList;
	}

	/**
	 * Returns the value of '<em><b>aDTabList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDTabList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADTabList() {
		return aDTabList;
	}

	/**
	 * Sets the '{@link ADProcessType#getADTabList() <em>aDTabList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getADTabList() aDTabList}' feature.
	 * @generated
	 */
	public void setADTabList(ReferenceType newADTabList) {
		aDTabList = newADTabList;
	}

	/**
	 * Returns the value of '<em><b>processExecutionList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processExecutionList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getProcessExecutionList() {
		return processExecutionList;
	}

	/**
	 * Sets the '{@link ADProcessType#getProcessExecutionList() <em>processExecutionList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getProcessExecutionList() processExecutionList}' feature.
	 * @generated
	 */
	public void setProcessExecutionList(ReferenceType newProcessExecutionList) {
		processExecutionList = newProcessExecutionList;
	}

	/**
	 * Returns the value of '<em><b>processRequestList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>processRequestList</b></em>' feature
	 * @generated
	 */
	public ProcessRequestListType getProcessRequestList() {
		return processRequestList;
	}

	/**
	 * Sets the '{@link ADProcessType#getProcessRequestList() <em>processRequestList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getProcessRequestList() processRequestList}' feature.
	 * @generated
	 */
	public void setProcessRequestList(
			ProcessRequestListType newProcessRequestList) {
		processRequestList = newProcessRequestList;
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
	 * Sets the '{@link ADProcessType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getId1() id1}' feature.
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
	 * Sets the '{@link ADProcessType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADProcessType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#isReference() reference}' feature.
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
	public List<ADProcessTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADProcessType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADProcessType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADProcessTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADProcessType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
