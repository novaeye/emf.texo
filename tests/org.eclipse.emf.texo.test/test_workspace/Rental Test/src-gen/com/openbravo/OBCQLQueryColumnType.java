package com.openbravo;

import java.util.ArrayList;
import java.util.List;

/** 
 * A representation of the model object '<em><b>OBCQLQueryColumnType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class OBCQLQueryColumnType {

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
	private ReferenceType widgetQuery = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String displayExpression = null;

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
	private String summarizeType = null;

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
	private String linkExpression = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Long sequenceNumber = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType reference = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType referenceSearchKey = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String includeIn = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean hasLink = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ReferenceType tab = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Boolean canBeFiltered = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String whereClauseLeftPart = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private OBCQLQueryColumnTrlListType oBCQLQueryColumnTrlList = null;

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
	private boolean reference1 = false;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<OBCQLQueryColumnTypeAnyAttributeFeatureGroup> anyAttribute = new ArrayList<OBCQLQueryColumnTypeAnyAttributeFeatureGroup>();

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
	 * Sets the '{@link OBCQLQueryColumnType#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getId() id}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getClient() client}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getOrganization() <em>organization</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getOrganization() organization}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getActive() active}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getCreationDate() <em>creationDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getCreationDate() creationDate}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getCreatedBy() <em>createdBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getCreatedBy() createdBy}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getUpdated() updated}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getUpdatedBy() <em>updatedBy</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getUpdatedBy() updatedBy}' feature.
	 * @generated
	 */
	public void setUpdatedBy(ReferenceType newUpdatedBy) {
		updatedBy = newUpdatedBy;
	}

	/**
	 * Returns the value of '<em><b>widgetQuery</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>widgetQuery</b></em>' feature
	 * @generated
	 */
	public ReferenceType getWidgetQuery() {
		return widgetQuery;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getWidgetQuery() <em>widgetQuery</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getWidgetQuery() widgetQuery}' feature.
	 * @generated
	 */
	public void setWidgetQuery(ReferenceType newWidgetQuery) {
		widgetQuery = newWidgetQuery;
	}

	/**
	 * Returns the value of '<em><b>displayExpression</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>displayExpression</b></em>' feature
	 * @generated
	 */
	public String getDisplayExpression() {
		return displayExpression;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getDisplayExpression() <em>displayExpression</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getDisplayExpression() displayExpression}' feature.
	 * @generated
	 */
	public void setDisplayExpression(String newDisplayExpression) {
		displayExpression = newDisplayExpression;
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
	 * Sets the '{@link OBCQLQueryColumnType#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>summarizeType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>summarizeType</b></em>' feature
	 * @generated
	 */
	public String getSummarizeType() {
		return summarizeType;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getSummarizeType() <em>summarizeType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getSummarizeType() summarizeType}' feature.
	 * @generated
	 */
	public void setSummarizeType(String newSummarizeType) {
		summarizeType = newSummarizeType;
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
	 * Sets the '{@link OBCQLQueryColumnType#getWidth() <em>width</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getWidth() width}' feature.
	 * @generated
	 */
	public void setWidth(Long newWidth) {
		width = newWidth;
	}

	/**
	 * Returns the value of '<em><b>linkExpression</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>linkExpression</b></em>' feature
	 * @generated
	 */
	public String getLinkExpression() {
		return linkExpression;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getLinkExpression() <em>linkExpression</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getLinkExpression() linkExpression}' feature.
	 * @generated
	 */
	public void setLinkExpression(String newLinkExpression) {
		linkExpression = newLinkExpression;
	}

	/**
	 * Returns the value of '<em><b>sequenceNumber</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sequenceNumber</b></em>' feature
	 * @generated
	 */
	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getSequenceNumber() <em>sequenceNumber</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getSequenceNumber() sequenceNumber}' feature.
	 * @generated
	 */
	public void setSequenceNumber(Long newSequenceNumber) {
		sequenceNumber = newSequenceNumber;
	}

	/**
	 * Returns the value of '<em><b>reference</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reference</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReference() {
		return reference;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getReference() <em>reference</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getReference() reference}' feature.
	 * @generated
	 */
	public void setReference(ReferenceType newReference) {
		reference = newReference;
	}

	/**
	 * Returns the value of '<em><b>referenceSearchKey</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>referenceSearchKey</b></em>' feature
	 * @generated
	 */
	public ReferenceType getReferenceSearchKey() {
		return referenceSearchKey;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getReferenceSearchKey() <em>referenceSearchKey</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getReferenceSearchKey() referenceSearchKey}' feature.
	 * @generated
	 */
	public void setReferenceSearchKey(ReferenceType newReferenceSearchKey) {
		referenceSearchKey = newReferenceSearchKey;
	}

	/**
	 * Returns the value of '<em><b>includeIn</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>includeIn</b></em>' feature
	 * @generated
	 */
	public String getIncludeIn() {
		return includeIn;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getIncludeIn() <em>includeIn</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getIncludeIn() includeIn}' feature.
	 * @generated
	 */
	public void setIncludeIn(String newIncludeIn) {
		includeIn = newIncludeIn;
	}

	/**
	 * Returns the value of '<em><b>hasLink</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>hasLink</b></em>' feature
	 * @generated
	 */
	public Boolean getHasLink() {
		return hasLink;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getHasLink() <em>hasLink</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getHasLink() hasLink}' feature.
	 * @generated
	 */
	public void setHasLink(Boolean newHasLink) {
		hasLink = newHasLink;
	}

	/**
	 * Returns the value of '<em><b>tab</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>tab</b></em>' feature
	 * @generated
	 */
	public ReferenceType getTab() {
		return tab;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getTab() <em>tab</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getTab() tab}' feature.
	 * @generated
	 */
	public void setTab(ReferenceType newTab) {
		tab = newTab;
	}

	/**
	 * Returns the value of '<em><b>canBeFiltered</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>canBeFiltered</b></em>' feature
	 * @generated
	 */
	public Boolean getCanBeFiltered() {
		return canBeFiltered;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getCanBeFiltered() <em>canBeFiltered</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getCanBeFiltered() canBeFiltered}' feature.
	 * @generated
	 */
	public void setCanBeFiltered(Boolean newCanBeFiltered) {
		canBeFiltered = newCanBeFiltered;
	}

	/**
	 * Returns the value of '<em><b>whereClauseLeftPart</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>whereClauseLeftPart</b></em>' feature
	 * @generated
	 */
	public String getWhereClauseLeftPart() {
		return whereClauseLeftPart;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getWhereClauseLeftPart() <em>whereClauseLeftPart</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getWhereClauseLeftPart() whereClauseLeftPart}' feature.
	 * @generated
	 */
	public void setWhereClauseLeftPart(String newWhereClauseLeftPart) {
		whereClauseLeftPart = newWhereClauseLeftPart;
	}

	/**
	 * Returns the value of '<em><b>oBCQLQueryColumnTrlList</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>oBCQLQueryColumnTrlList</b></em>' feature
	 * @generated
	 */
	public OBCQLQueryColumnTrlListType getOBCQLQueryColumnTrlList() {
		return oBCQLQueryColumnTrlList;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getOBCQLQueryColumnTrlList() <em>oBCQLQueryColumnTrlList</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getOBCQLQueryColumnTrlList() oBCQLQueryColumnTrlList}' feature.
	 * @generated
	 */
	public void setOBCQLQueryColumnTrlList(
			OBCQLQueryColumnTrlListType newOBCQLQueryColumnTrlList) {
		oBCQLQueryColumnTrlList = newOBCQLQueryColumnTrlList;
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
	 * Sets the '{@link OBCQLQueryColumnType#getId1() <em>id1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getId1() id1}' feature.
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
	 * Sets the '{@link OBCQLQueryColumnType#getIdentifier() <em>identifier</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getIdentifier() identifier}' feature.
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		identifier = newIdentifier;
	}

	/**
	 * Returns the value of '<em><b>reference1</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>reference1</b></em>' feature
	 * @generated
	 */
	public boolean isReference1() {
		return reference1;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#isReference1() <em>reference1</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#isReference1() reference1}' feature.
	 * @generated
	 */
	public void setReference1(boolean newReference1) {
		reference1 = newReference1;
	}

	/**
	 * Returns the value of '<em><b>anyAttribute</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>anyAttribute</b></em>' feature
	 * @generated
	 */
	public List<OBCQLQueryColumnTypeAnyAttributeFeatureGroup> getAnyAttribute() {
		return anyAttribute;
	}

	/**
	 * Sets the '{@link OBCQLQueryColumnType#getAnyAttribute() <em>anyAttribute</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OBCQLQueryColumnType#getAnyAttribute() anyAttribute}' feature.
	 * @generated
	 */
	public void setAnyAttribute(
			List<OBCQLQueryColumnTypeAnyAttributeFeatureGroup> newAnyAttribute) {
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
		return "OBCQLQueryColumnType " + " [id1: " + getId1() + "]"
				+ " [identifier: " + getIdentifier() + "]" + " [reference1: "
				+ isReference1() + "]";
	}
}
