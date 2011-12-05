package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADHeartbeatLogType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADHeartbeatLogType {

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
	private String systemIdentifier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean enableHeartbeat = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean proxyRequired = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String proxyServer = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long proxyPort = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal activityRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal complexityRate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String operatingSystem = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String operatingSystemVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String database = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String databaseVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String servletContainer = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String servletContainerVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String webServer = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String webServerVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String javaVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String antVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String openbravoVersion = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String openbravoInstallMode = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfRegisteredUsers = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String codeRevision = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String beatType = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String databaseIdentifier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String macIdentifier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String installedModules = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String activationKeyIdentifier = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime firstLogin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private DateTime lastLogin = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long totalLogins = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long totalLoginsLastMonth = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal concurrentUsersAverage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Decimal usagePercentage = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long maximumConcurrentUsers = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfClients = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long numberOfOrganizations = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean usageAuditEnabled = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String instancePurpose = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long rejectedLoginsDueConcUsers = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long instanceNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean enableCustomQueries = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ADHeartbeatLogCustomQueryListType aDHeartbeatLogCustomQueryList = null;

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
	private List<ADHeartbeatLogTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADHeartbeatLogTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADHeartbeatLogType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getId() id}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getClient() client}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getActive() active}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>systemIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>systemIdentifier</b></em>' feature
	 * @generated
	 */
	public String getSystemIdentifier() {
		return systemIdentifier;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getSystemIdentifier() <em>systemIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getSystemIdentifier() systemIdentifier}' feature.
	 * @generated
	 */
	public void setSystemIdentifier(String newSystemIdentifier) {
		systemIdentifier = newSystemIdentifier;
	}

	/**
	 * Returns the value of '<em><b>enableHeartbeat</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>enableHeartbeat</b></em>' feature
	 * @generated
	 */
	public Boolean getEnableHeartbeat() {
		return enableHeartbeat;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getEnableHeartbeat() <em>enableHeartbeat</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getEnableHeartbeat() enableHeartbeat}' feature.
	 * @generated
	 */
	public void setEnableHeartbeat(Boolean newEnableHeartbeat) {
		enableHeartbeat = newEnableHeartbeat;
	}

	/**
	 * Returns the value of '<em><b>proxyRequired</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>proxyRequired</b></em>' feature
	 * @generated
	 */
	public Boolean getProxyRequired() {
		return proxyRequired;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getProxyRequired() <em>proxyRequired</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getProxyRequired() proxyRequired}' feature.
	 * @generated
	 */
	public void setProxyRequired(Boolean newProxyRequired) {
		proxyRequired = newProxyRequired;
	}

	/**
	 * Returns the value of '<em><b>proxyServer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>proxyServer</b></em>' feature
	 * @generated
	 */
	public String getProxyServer() {
		return proxyServer;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getProxyServer() <em>proxyServer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getProxyServer() proxyServer}' feature.
	 * @generated
	 */
	public void setProxyServer(String newProxyServer) {
		proxyServer = newProxyServer;
	}

	/**
	 * Returns the value of '<em><b>proxyPort</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>proxyPort</b></em>' feature
	 * @generated
	 */
	public Long getProxyPort() {
		return proxyPort;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getProxyPort() <em>proxyPort</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getProxyPort() proxyPort}' feature.
	 * @generated
	 */
	public void setProxyPort(Long newProxyPort) {
		proxyPort = newProxyPort;
	}

	/**
	 * Returns the value of '<em><b>activityRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activityRate</b></em>' feature
	 * @generated
	 */
	public Decimal getActivityRate() {
		return activityRate;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getActivityRate() <em>activityRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getActivityRate() activityRate}' feature.
	 * @generated
	 */
	public void setActivityRate(Decimal newActivityRate) {
		activityRate = newActivityRate;
	}

	/**
	 * Returns the value of '<em><b>complexityRate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>complexityRate</b></em>' feature
	 * @generated
	 */
	public Decimal getComplexityRate() {
		return complexityRate;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getComplexityRate() <em>complexityRate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getComplexityRate() complexityRate}' feature.
	 * @generated
	 */
	public void setComplexityRate(Decimal newComplexityRate) {
		complexityRate = newComplexityRate;
	}

	/**
	 * Returns the value of '<em><b>operatingSystem</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>operatingSystem</b></em>' feature
	 * @generated
	 */
	public String getOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getOperatingSystem() <em>operatingSystem</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getOperatingSystem() operatingSystem}' feature.
	 * @generated
	 */
	public void setOperatingSystem(String newOperatingSystem) {
		operatingSystem = newOperatingSystem;
	}

	/**
	 * Returns the value of '<em><b>operatingSystemVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>operatingSystemVersion</b></em>' feature
	 * @generated
	 */
	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getOperatingSystemVersion() <em>operatingSystemVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getOperatingSystemVersion() operatingSystemVersion}' feature.
	 * @generated
	 */
	public void setOperatingSystemVersion(String newOperatingSystemVersion) {
		operatingSystemVersion = newOperatingSystemVersion;
	}

	/**
	 * Returns the value of '<em><b>database</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>database</b></em>' feature
	 * @generated
	 */
	public String getDatabase() {
		return database;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getDatabase() <em>database</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getDatabase() database}' feature.
	 * @generated
	 */
	public void setDatabase(String newDatabase) {
		database = newDatabase;
	}

	/**
	 * Returns the value of '<em><b>databaseVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>databaseVersion</b></em>' feature
	 * @generated
	 */
	public String getDatabaseVersion() {
		return databaseVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getDatabaseVersion() <em>databaseVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getDatabaseVersion() databaseVersion}' feature.
	 * @generated
	 */
	public void setDatabaseVersion(String newDatabaseVersion) {
		databaseVersion = newDatabaseVersion;
	}

	/**
	 * Returns the value of '<em><b>servletContainer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>servletContainer</b></em>' feature
	 * @generated
	 */
	public String getServletContainer() {
		return servletContainer;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getServletContainer() <em>servletContainer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getServletContainer() servletContainer}' feature.
	 * @generated
	 */
	public void setServletContainer(String newServletContainer) {
		servletContainer = newServletContainer;
	}

	/**
	 * Returns the value of '<em><b>servletContainerVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>servletContainerVersion</b></em>' feature
	 * @generated
	 */
	public String getServletContainerVersion() {
		return servletContainerVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getServletContainerVersion() <em>servletContainerVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getServletContainerVersion() servletContainerVersion}' feature.
	 * @generated
	 */
	public void setServletContainerVersion(String newServletContainerVersion) {
		servletContainerVersion = newServletContainerVersion;
	}

	/**
	 * Returns the value of '<em><b>webServer</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>webServer</b></em>' feature
	 * @generated
	 */
	public String getWebServer() {
		return webServer;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getWebServer() <em>webServer</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getWebServer() webServer}' feature.
	 * @generated
	 */
	public void setWebServer(String newWebServer) {
		webServer = newWebServer;
	}

	/**
	 * Returns the value of '<em><b>webServerVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>webServerVersion</b></em>' feature
	 * @generated
	 */
	public String getWebServerVersion() {
		return webServerVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getWebServerVersion() <em>webServerVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getWebServerVersion() webServerVersion}' feature.
	 * @generated
	 */
	public void setWebServerVersion(String newWebServerVersion) {
		webServerVersion = newWebServerVersion;
	}

	/**
	 * Returns the value of '<em><b>javaVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>javaVersion</b></em>' feature
	 * @generated
	 */
	public String getJavaVersion() {
		return javaVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getJavaVersion() <em>javaVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getJavaVersion() javaVersion}' feature.
	 * @generated
	 */
	public void setJavaVersion(String newJavaVersion) {
		javaVersion = newJavaVersion;
	}

	/**
	 * Returns the value of '<em><b>antVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>antVersion</b></em>' feature
	 * @generated
	 */
	public String getAntVersion() {
		return antVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getAntVersion() <em>antVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getAntVersion() antVersion}' feature.
	 * @generated
	 */
	public void setAntVersion(String newAntVersion) {
		antVersion = newAntVersion;
	}

	/**
	 * Returns the value of '<em><b>openbravoVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>openbravoVersion</b></em>' feature
	 * @generated
	 */
	public String getOpenbravoVersion() {
		return openbravoVersion;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getOpenbravoVersion() <em>openbravoVersion</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getOpenbravoVersion() openbravoVersion}' feature.
	 * @generated
	 */
	public void setOpenbravoVersion(String newOpenbravoVersion) {
		openbravoVersion = newOpenbravoVersion;
	}

	/**
	 * Returns the value of '<em><b>openbravoInstallMode</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>openbravoInstallMode</b></em>' feature
	 * @generated
	 */
	public String getOpenbravoInstallMode() {
		return openbravoInstallMode;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getOpenbravoInstallMode() <em>openbravoInstallMode</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getOpenbravoInstallMode() openbravoInstallMode}' feature.
	 * @generated
	 */
	public void setOpenbravoInstallMode(String newOpenbravoInstallMode) {
		openbravoInstallMode = newOpenbravoInstallMode;
	}

	/**
	 * Returns the value of '<em><b>numberOfRegisteredUsers</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfRegisteredUsers</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfRegisteredUsers() {
		return numberOfRegisteredUsers;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getNumberOfRegisteredUsers() <em>numberOfRegisteredUsers</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getNumberOfRegisteredUsers() numberOfRegisteredUsers}' feature.
	 * @generated
	 */
	public void setNumberOfRegisteredUsers(Long newNumberOfRegisteredUsers) {
		numberOfRegisteredUsers = newNumberOfRegisteredUsers;
	}

	/**
	 * Returns the value of '<em><b>codeRevision</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>codeRevision</b></em>' feature
	 * @generated
	 */
	public String getCodeRevision() {
		return codeRevision;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getCodeRevision() <em>codeRevision</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getCodeRevision() codeRevision}' feature.
	 * @generated
	 */
	public void setCodeRevision(String newCodeRevision) {
		codeRevision = newCodeRevision;
	}

	/**
	 * Returns the value of '<em><b>beatType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>beatType</b></em>' feature
	 * @generated
	 */
	public String getBeatType() {
		return beatType;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getBeatType() <em>beatType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getBeatType() beatType}' feature.
	 * @generated
	 */
	public void setBeatType(String newBeatType) {
		beatType = newBeatType;
	}

	/**
	 * Returns the value of '<em><b>databaseIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>databaseIdentifier</b></em>' feature
	 * @generated
	 */
	public String getDatabaseIdentifier() {
		return databaseIdentifier;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getDatabaseIdentifier() <em>databaseIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getDatabaseIdentifier() databaseIdentifier}' feature.
	 * @generated
	 */
	public void setDatabaseIdentifier(String newDatabaseIdentifier) {
		databaseIdentifier = newDatabaseIdentifier;
	}

	/**
	 * Returns the value of '<em><b>macIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>macIdentifier</b></em>' feature
	 * @generated
	 */
	public String getMacIdentifier() {
		return macIdentifier;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getMacIdentifier() <em>macIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getMacIdentifier() macIdentifier}' feature.
	 * @generated
	 */
	public void setMacIdentifier(String newMacIdentifier) {
		macIdentifier = newMacIdentifier;
	}

	/**
	 * Returns the value of '<em><b>installedModules</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>installedModules</b></em>' feature
	 * @generated
	 */
	public String getInstalledModules() {
		return installedModules;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getInstalledModules() <em>installedModules</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getInstalledModules() installedModules}' feature.
	 * @generated
	 */
	public void setInstalledModules(String newInstalledModules) {
		installedModules = newInstalledModules;
	}

	/**
	 * Returns the value of '<em><b>activationKeyIdentifier</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>activationKeyIdentifier</b></em>' feature
	 * @generated
	 */
	public String getActivationKeyIdentifier() {
		return activationKeyIdentifier;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getActivationKeyIdentifier() <em>activationKeyIdentifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getActivationKeyIdentifier() activationKeyIdentifier}' feature.
	 * @generated
	 */
	public void setActivationKeyIdentifier(String newActivationKeyIdentifier) {
		activationKeyIdentifier = newActivationKeyIdentifier;
	}

	/**
	 * Returns the value of '<em><b>firstLogin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>firstLogin</b></em>' feature
	 * @generated
	 */
	public DateTime getFirstLogin() {
		return firstLogin;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getFirstLogin() <em>firstLogin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getFirstLogin() firstLogin}' feature.
	 * @generated
	 */
	public void setFirstLogin(DateTime newFirstLogin) {
		firstLogin = newFirstLogin;
	}

	/**
	 * Returns the value of '<em><b>lastLogin</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>lastLogin</b></em>' feature
	 * @generated
	 */
	public DateTime getLastLogin() {
		return lastLogin;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getLastLogin() <em>lastLogin</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getLastLogin() lastLogin}' feature.
	 * @generated
	 */
	public void setLastLogin(DateTime newLastLogin) {
		lastLogin = newLastLogin;
	}

	/**
	 * Returns the value of '<em><b>totalLogins</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>totalLogins</b></em>' feature
	 * @generated
	 */
	public Long getTotalLogins() {
		return totalLogins;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getTotalLogins() <em>totalLogins</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getTotalLogins() totalLogins}' feature.
	 * @generated
	 */
	public void setTotalLogins(Long newTotalLogins) {
		totalLogins = newTotalLogins;
	}

	/**
	 * Returns the value of '<em><b>totalLoginsLastMonth</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>totalLoginsLastMonth</b></em>' feature
	 * @generated
	 */
	public Long getTotalLoginsLastMonth() {
		return totalLoginsLastMonth;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getTotalLoginsLastMonth() <em>totalLoginsLastMonth</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getTotalLoginsLastMonth() totalLoginsLastMonth}' feature.
	 * @generated
	 */
	public void setTotalLoginsLastMonth(Long newTotalLoginsLastMonth) {
		totalLoginsLastMonth = newTotalLoginsLastMonth;
	}

	/**
	 * Returns the value of '<em><b>concurrentUsersAverage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>concurrentUsersAverage</b></em>' feature
	 * @generated
	 */
	public Decimal getConcurrentUsersAverage() {
		return concurrentUsersAverage;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getConcurrentUsersAverage() <em>concurrentUsersAverage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getConcurrentUsersAverage() concurrentUsersAverage}' feature.
	 * @generated
	 */
	public void setConcurrentUsersAverage(Decimal newConcurrentUsersAverage) {
		concurrentUsersAverage = newConcurrentUsersAverage;
	}

	/**
	 * Returns the value of '<em><b>usagePercentage</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>usagePercentage</b></em>' feature
	 * @generated
	 */
	public Decimal getUsagePercentage() {
		return usagePercentage;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getUsagePercentage() <em>usagePercentage</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getUsagePercentage() usagePercentage}' feature.
	 * @generated
	 */
	public void setUsagePercentage(Decimal newUsagePercentage) {
		usagePercentage = newUsagePercentage;
	}

	/**
	 * Returns the value of '<em><b>maximumConcurrentUsers</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>maximumConcurrentUsers</b></em>' feature
	 * @generated
	 */
	public Long getMaximumConcurrentUsers() {
		return maximumConcurrentUsers;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getMaximumConcurrentUsers() <em>maximumConcurrentUsers</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getMaximumConcurrentUsers() maximumConcurrentUsers}' feature.
	 * @generated
	 */
	public void setMaximumConcurrentUsers(Long newMaximumConcurrentUsers) {
		maximumConcurrentUsers = newMaximumConcurrentUsers;
	}

	/**
	 * Returns the value of '<em><b>numberOfClients</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfClients</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfClients() {
		return numberOfClients;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getNumberOfClients() <em>numberOfClients</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getNumberOfClients() numberOfClients}' feature.
	 * @generated
	 */
	public void setNumberOfClients(Long newNumberOfClients) {
		numberOfClients = newNumberOfClients;
	}

	/**
	 * Returns the value of '<em><b>numberOfOrganizations</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>numberOfOrganizations</b></em>' feature
	 * @generated
	 */
	public Long getNumberOfOrganizations() {
		return numberOfOrganizations;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getNumberOfOrganizations() <em>numberOfOrganizations</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getNumberOfOrganizations() numberOfOrganizations}' feature.
	 * @generated
	 */
	public void setNumberOfOrganizations(Long newNumberOfOrganizations) {
		numberOfOrganizations = newNumberOfOrganizations;
	}

	/**
	 * Returns the value of '<em><b>usageAuditEnabled</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>usageAuditEnabled</b></em>' feature
	 * @generated
	 */
	public Boolean getUsageAuditEnabled() {
		return usageAuditEnabled;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getUsageAuditEnabled() <em>usageAuditEnabled</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getUsageAuditEnabled() usageAuditEnabled}' feature.
	 * @generated
	 */
	public void setUsageAuditEnabled(Boolean newUsageAuditEnabled) {
		usageAuditEnabled = newUsageAuditEnabled;
	}

	/**
	 * Returns the value of '<em><b>instancePurpose</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>instancePurpose</b></em>' feature
	 * @generated
	 */
	public String getInstancePurpose() {
		return instancePurpose;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getInstancePurpose() <em>instancePurpose</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getInstancePurpose() instancePurpose}' feature.
	 * @generated
	 */
	public void setInstancePurpose(String newInstancePurpose) {
		instancePurpose = newInstancePurpose;
	}

	/**
	 * Returns the value of '<em><b>rejectedLoginsDueConcUsers</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rejectedLoginsDueConcUsers</b></em>' feature
	 * @generated
	 */
	public Long getRejectedLoginsDueConcUsers() {
		return rejectedLoginsDueConcUsers;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getRejectedLoginsDueConcUsers() <em>rejectedLoginsDueConcUsers</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getRejectedLoginsDueConcUsers() rejectedLoginsDueConcUsers}' feature.
	 * @generated
	 */
	public void setRejectedLoginsDueConcUsers(Long newRejectedLoginsDueConcUsers) {
		rejectedLoginsDueConcUsers = newRejectedLoginsDueConcUsers;
	}

	/**
	 * Returns the value of '<em><b>instanceNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>instanceNumber</b></em>' feature
	 * @generated
	 */
	public Long getInstanceNumber() {
		return instanceNumber;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getInstanceNumber() <em>instanceNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getInstanceNumber() instanceNumber}' feature.
	 * @generated
	 */
	public void setInstanceNumber(Long newInstanceNumber) {
		instanceNumber = newInstanceNumber;
	}

	/**
	 * Returns the value of '<em><b>enableCustomQueries</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>enableCustomQueries</b></em>' feature
	 * @generated
	 */
	public Boolean getEnableCustomQueries() {
		return enableCustomQueries;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getEnableCustomQueries() <em>enableCustomQueries</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getEnableCustomQueries() enableCustomQueries}' feature.
	 * @generated
	 */
	public void setEnableCustomQueries(Boolean newEnableCustomQueries) {
		enableCustomQueries = newEnableCustomQueries;
	}

	/**
	 * Returns the value of '<em><b>aDHeartbeatLogCustomQueryList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDHeartbeatLogCustomQueryList</b></em>' feature
	 * @generated
	 */
	public ADHeartbeatLogCustomQueryListType getADHeartbeatLogCustomQueryList() {
		return aDHeartbeatLogCustomQueryList;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getADHeartbeatLogCustomQueryList() <em>aDHeartbeatLogCustomQueryList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getADHeartbeatLogCustomQueryList() aDHeartbeatLogCustomQueryList}' feature.
	 * @generated
	 */
	public void setADHeartbeatLogCustomQueryList(
			ADHeartbeatLogCustomQueryListType newADHeartbeatLogCustomQueryList) {
		aDHeartbeatLogCustomQueryList = newADHeartbeatLogCustomQueryList;
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
	 * Sets the '{@link ADHeartbeatLogType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getId1() id1}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADHeartbeatLogType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#isReference() reference}' feature.
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
	public List<ADHeartbeatLogTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADHeartbeatLogType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADHeartbeatLogType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADHeartbeatLogTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADHeartbeatLogType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference: "
				+ isReference() + "]";
	}
}
