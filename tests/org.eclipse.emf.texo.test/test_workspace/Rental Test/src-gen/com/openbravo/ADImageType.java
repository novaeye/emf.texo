package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ADImageType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADImageType {

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
	private String name = null;

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
	private Base64Binary bindaryData = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long width = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long height = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String mimetype = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSystemInformationYourCompanyLoginImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSystemInformationYourItServiceLoginImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSystemInformationYourCompanyMenuImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSystemInformationYourCompanyBigImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSystemInformationYourCompanyDocumentImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType aDSystemInformationProductionBannerImageIDList = null;

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
	private ReferenceType aDWindowList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationYourCompanyMenuImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationYourCompanyBigImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType clientInformationYourCompanyDocumentImageList = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType organizationInformationYourCompanyDocumentImageList = null;

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
	private List<ADImageTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<ADImageTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link ADImageType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getId() id}' feature.
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
	 * Sets the '{@link ADImageType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getClient() client}' feature.
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
	 * Sets the '{@link ADImageType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getOrganization() organization}' feature.
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
	 * Sets the '{@link ADImageType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getActive() active}' feature.
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
	 * Sets the '{@link ADImageType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link ADImageType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link ADImageType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getUpdated() updated}' feature.
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
	 * Sets the '{@link ADImageType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
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
	 * Sets the '{@link ADImageType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
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
	 * Sets the '{@link ADImageType#getImageURL() <em>imageURL</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getImageURL() imageURL}' feature.
	 * @generated
	 */
	public void setImageURL(String newImageURL) {
		imageURL = newImageURL;
	}

	/**
	 * Returns the value of '<em><b>bindaryData</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>bindaryData</b></em>' feature
	 * @generated
	 */
	public Base64Binary getBindaryData() {
		return bindaryData;
	}

	/**
	 * Sets the '{@link ADImageType#getBindaryData() <em>bindaryData</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getBindaryData() bindaryData}' feature.
	 * @generated
	 */
	public void setBindaryData(Base64Binary newBindaryData) {
		bindaryData = newBindaryData;
	}

	/**
	 * Returns the value of '<em><b>width</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>width</b></em>' feature
	 * @generated
	 */
	public Long getWidth() {
		return width;
	}

	/**
	 * Sets the '{@link ADImageType#getWidth() <em>width</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getWidth() width}' feature.
	 * @generated
	 */
	public void setWidth(Long newWidth) {
		width = newWidth;
	}

	/**
	 * Returns the value of '<em><b>height</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>height</b></em>' feature
	 * @generated
	 */
	public Long getHeight() {
		return height;
	}

	/**
	 * Sets the '{@link ADImageType#getHeight() <em>height</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getHeight() height}' feature.
	 * @generated
	 */
	public void setHeight(Long newHeight) {
		height = newHeight;
	}

	/**
	 * Returns the value of '<em><b>mimetype</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mimetype</b></em>' feature
	 * @generated
	 */
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * Sets the '{@link ADImageType#getMimetype() <em>mimetype</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getMimetype() mimetype}' feature.
	 * @generated
	 */
	public void setMimetype(String newMimetype) {
		mimetype = newMimetype;
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformationYourCompanyLoginImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformationYourCompanyLoginImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSystemInformationYourCompanyLoginImageList() {
		return aDSystemInformationYourCompanyLoginImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getADSystemInformationYourCompanyLoginImageList() <em>aDSystemInformationYourCompanyLoginImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADSystemInformationYourCompanyLoginImageList() aDSystemInformationYourCompanyLoginImageList}' feature.
	 * @generated
	 */
	public void setADSystemInformationYourCompanyLoginImageList(
			ReferenceType newADSystemInformationYourCompanyLoginImageList) {
		aDSystemInformationYourCompanyLoginImageList = newADSystemInformationYourCompanyLoginImageList;
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformationYourItServiceLoginImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformationYourItServiceLoginImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSystemInformationYourItServiceLoginImageList() {
		return aDSystemInformationYourItServiceLoginImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getADSystemInformationYourItServiceLoginImageList() <em>aDSystemInformationYourItServiceLoginImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADSystemInformationYourItServiceLoginImageList() aDSystemInformationYourItServiceLoginImageList}' feature.
	 * @generated
	 */
	public void setADSystemInformationYourItServiceLoginImageList(
			ReferenceType newADSystemInformationYourItServiceLoginImageList) {
		aDSystemInformationYourItServiceLoginImageList = newADSystemInformationYourItServiceLoginImageList;
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformationYourCompanyMenuImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformationYourCompanyMenuImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSystemInformationYourCompanyMenuImageList() {
		return aDSystemInformationYourCompanyMenuImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getADSystemInformationYourCompanyMenuImageList() <em>aDSystemInformationYourCompanyMenuImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADSystemInformationYourCompanyMenuImageList() aDSystemInformationYourCompanyMenuImageList}' feature.
	 * @generated
	 */
	public void setADSystemInformationYourCompanyMenuImageList(
			ReferenceType newADSystemInformationYourCompanyMenuImageList) {
		aDSystemInformationYourCompanyMenuImageList = newADSystemInformationYourCompanyMenuImageList;
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformationYourCompanyBigImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformationYourCompanyBigImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSystemInformationYourCompanyBigImageList() {
		return aDSystemInformationYourCompanyBigImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getADSystemInformationYourCompanyBigImageList() <em>aDSystemInformationYourCompanyBigImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADSystemInformationYourCompanyBigImageList() aDSystemInformationYourCompanyBigImageList}' feature.
	 * @generated
	 */
	public void setADSystemInformationYourCompanyBigImageList(
			ReferenceType newADSystemInformationYourCompanyBigImageList) {
		aDSystemInformationYourCompanyBigImageList = newADSystemInformationYourCompanyBigImageList;
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformationYourCompanyDocumentImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformationYourCompanyDocumentImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSystemInformationYourCompanyDocumentImageList() {
		return aDSystemInformationYourCompanyDocumentImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getADSystemInformationYourCompanyDocumentImageList() <em>aDSystemInformationYourCompanyDocumentImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADSystemInformationYourCompanyDocumentImageList() aDSystemInformationYourCompanyDocumentImageList}' feature.
	 * @generated
	 */
	public void setADSystemInformationYourCompanyDocumentImageList(
			ReferenceType newADSystemInformationYourCompanyDocumentImageList) {
		aDSystemInformationYourCompanyDocumentImageList = newADSystemInformationYourCompanyDocumentImageList;
	}

	/**
	 * Returns the value of '<em><b>aDSystemInformationProductionBannerImageIDList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDSystemInformationProductionBannerImageIDList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADSystemInformationProductionBannerImageIDList() {
		return aDSystemInformationProductionBannerImageIDList;
	}

	/**
	 * Sets the '{@link ADImageType#getADSystemInformationProductionBannerImageIDList() <em>aDSystemInformationProductionBannerImageIDList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADSystemInformationProductionBannerImageIDList() aDSystemInformationProductionBannerImageIDList}' feature.
	 * @generated
	 */
	public void setADSystemInformationProductionBannerImageIDList(
			ReferenceType newADSystemInformationProductionBannerImageIDList) {
		aDSystemInformationProductionBannerImageIDList = newADSystemInformationProductionBannerImageIDList;
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
	 * Sets the '{@link ADImageType#getADTabList() <em>aDTabList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADTabList() aDTabList}' feature.
	 * @generated
	 */
	public void setADTabList(ReferenceType newADTabList) {
		aDTabList = newADTabList;
	}

	/**
	 * Returns the value of '<em><b>aDWindowList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>aDWindowList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getADWindowList() {
		return aDWindowList;
	}

	/**
	 * Sets the '{@link ADImageType#getADWindowList() <em>aDWindowList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getADWindowList() aDWindowList}' feature.
	 * @generated
	 */
	public void setADWindowList(ReferenceType newADWindowList) {
		aDWindowList = newADWindowList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationYourCompanyMenuImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationYourCompanyMenuImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationYourCompanyMenuImageList() {
		return clientInformationYourCompanyMenuImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getClientInformationYourCompanyMenuImageList() <em>clientInformationYourCompanyMenuImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getClientInformationYourCompanyMenuImageList() clientInformationYourCompanyMenuImageList}' feature.
	 * @generated
	 */
	public void setClientInformationYourCompanyMenuImageList(
			ReferenceType newClientInformationYourCompanyMenuImageList) {
		clientInformationYourCompanyMenuImageList = newClientInformationYourCompanyMenuImageList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationYourCompanyBigImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationYourCompanyBigImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationYourCompanyBigImageList() {
		return clientInformationYourCompanyBigImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getClientInformationYourCompanyBigImageList() <em>clientInformationYourCompanyBigImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getClientInformationYourCompanyBigImageList() clientInformationYourCompanyBigImageList}' feature.
	 * @generated
	 */
	public void setClientInformationYourCompanyBigImageList(
			ReferenceType newClientInformationYourCompanyBigImageList) {
		clientInformationYourCompanyBigImageList = newClientInformationYourCompanyBigImageList;
	}

	/**
	 * Returns the value of '<em><b>clientInformationYourCompanyDocumentImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>clientInformationYourCompanyDocumentImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getClientInformationYourCompanyDocumentImageList() {
		return clientInformationYourCompanyDocumentImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getClientInformationYourCompanyDocumentImageList() <em>clientInformationYourCompanyDocumentImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getClientInformationYourCompanyDocumentImageList() clientInformationYourCompanyDocumentImageList}' feature.
	 * @generated
	 */
	public void setClientInformationYourCompanyDocumentImageList(
			ReferenceType newClientInformationYourCompanyDocumentImageList) {
		clientInformationYourCompanyDocumentImageList = newClientInformationYourCompanyDocumentImageList;
	}

	/**
	 * Returns the value of '<em><b>organizationInformationYourCompanyDocumentImageList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>organizationInformationYourCompanyDocumentImageList</b></em>' feature
	 * @generated
	 */
	public ReferenceType getOrganizationInformationYourCompanyDocumentImageList() {
		return organizationInformationYourCompanyDocumentImageList;
	}

	/**
	 * Sets the '{@link ADImageType#getOrganizationInformationYourCompanyDocumentImageList() <em>organizationInformationYourCompanyDocumentImageList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getOrganizationInformationYourCompanyDocumentImageList() organizationInformationYourCompanyDocumentImageList}' feature.
	 * @generated
	 */
	public void setOrganizationInformationYourCompanyDocumentImageList(
			ReferenceType newOrganizationInformationYourCompanyDocumentImageList) {
		organizationInformationYourCompanyDocumentImageList = newOrganizationInformationYourCompanyDocumentImageList;
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
	 * Sets the '{@link ADImageType#getProductList() <em>productList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getProductList() productList}' feature.
	 * @generated
	 */
	public void setProductList(ReferenceType newProductList) {
		productList = newProductList;
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
	 * Sets the '{@link ADImageType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getId1() id1}' feature.
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
	 * Sets the '{@link ADImageType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getIdentifier() identifier}' feature.
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
	 * Sets the '{@link ADImageType#isReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#isReference() reference}' feature.
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
	public List<ADImageTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link ADImageType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ADImageType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<ADImageTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "ADImageType " + " [id1: " + getId1() + "]" + " [identifier: "
				+ getIdentifier() + "]" + " [reference: " + isReference() + "]";
	}
}
