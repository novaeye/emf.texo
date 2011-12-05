package com.openbravo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ResultType</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ResultType {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<ResultTypeMixedFeatureGroup> mixed = new ArrayList<ResultTypeMixedFeatureGroup>();

	/**
	 * Returns the value of '<em><b>mixed</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>mixed</b></em>' feature
	 * @generated
	 */
	public List<ResultTypeMixedFeatureGroup> getMixed() {
		return mixed;
	}

	/**
	 * Sets the '{@link ResultType#getMixed() <em>mixed</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getMixed() mixed}' feature.
	 * @generated
	 */
	public void setMixed(List<ResultTypeMixedFeatureGroup> newMixed) {
		mixed = newMixed;
	}

	/**
	 * Returns the value of '<em><b>msg</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>msg</b></em>' feature
	 * @generated
	 */
	public String getMsg() {
		return ResultTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
				ResultTypeMixedFeatureGroup.Feature.MSG);
	}

	/**
	 * Sets the '{@link ResultType#getMsg() <em>msg</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getMsg() msg}' feature.
	 * @generated
	 */
	public void setMsg(String newMsg) {
		setMixed(ResultTypeMixedFeatureGroup.createFeatureGroupList(
				ResultTypeMixedFeatureGroup.Feature.MSG,
				Collections.singletonList(newMsg)));
	}

	/**
	 * Returns the value of '<em><b>log</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>log</b></em>' feature
	 * @generated
	 */
	public String getLog() {
		return ResultTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
				ResultTypeMixedFeatureGroup.Feature.LOG);
	}

	/**
	 * Sets the '{@link ResultType#getLog() <em>log</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getLog() log}' feature.
	 * @generated
	 */
	public void setLog(String newLog) {
		setMixed(ResultTypeMixedFeatureGroup.createFeatureGroupList(
				ResultTypeMixedFeatureGroup.Feature.LOG,
				Collections.singletonList(newLog)));
	}

	/**
	 * Returns the value of '<em><b>warning</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>warning</b></em>' feature
	 * @generated
	 */
	public String getWarning() {
		return ResultTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
				ResultTypeMixedFeatureGroup.Feature.WARNING);
	}

	/**
	 * Sets the '{@link ResultType#getWarning() <em>warning</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getWarning() warning}' feature.
	 * @generated
	 */
	public void setWarning(String newWarning) {
		setMixed(ResultTypeMixedFeatureGroup.createFeatureGroupList(
				ResultTypeMixedFeatureGroup.Feature.WARNING,
				Collections.singletonList(newWarning)));
	}

	/**
	 * Returns the value of '<em><b>inserted</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>inserted</b></em>' feature
	 * @generated
	 */
	public ResultEntitiesType getInserted() {
		return ResultTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
				ResultTypeMixedFeatureGroup.Feature.INSERTED);
	}

	/**
	 * Sets the '{@link ResultType#getInserted() <em>inserted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getInserted() inserted}' feature.
	 * @generated
	 */
	public void setInserted(ResultEntitiesType newInserted) {
		setMixed(ResultTypeMixedFeatureGroup.createFeatureGroupList(
				ResultTypeMixedFeatureGroup.Feature.INSERTED,
				Collections.singletonList(newInserted)));
	}

	/**
	 * Returns the value of '<em><b>updated</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>updated</b></em>' feature
	 * @generated
	 */
	public ResultEntitiesType getUpdated() {
		return ResultTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
				ResultTypeMixedFeatureGroup.Feature.UPDATED);
	}

	/**
	 * Sets the '{@link ResultType#getUpdated() <em>updated</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getUpdated() updated}' feature.
	 * @generated
	 */
	public void setUpdated(ResultEntitiesType newUpdated) {
		setMixed(ResultTypeMixedFeatureGroup.createFeatureGroupList(
				ResultTypeMixedFeatureGroup.Feature.UPDATED,
				Collections.singletonList(newUpdated)));
	}

	/**
	 * Returns the value of '<em><b>deleted</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>deleted</b></em>' feature
	 * @generated
	 */
	public ResultEntitiesType getDeleted() {
		return ResultTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
				ResultTypeMixedFeatureGroup.Feature.DELETED);
	}

	/**
	 * Sets the '{@link ResultType#getDeleted() <em>deleted</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ResultType#getDeleted() deleted}' feature.
	 * @generated
	 */
	public void setDeleted(ResultEntitiesType newDeleted) {
		setMixed(ResultTypeMixedFeatureGroup.createFeatureGroupList(
				ResultTypeMixedFeatureGroup.Feature.DELETED,
				Collections.singletonList(newDeleted)));
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ResultType " + " [msg: " + getMsg() + "]" + " [log: "
				+ getLog() + "]" + " [warning: " + getWarning() + "]";
	}
}
