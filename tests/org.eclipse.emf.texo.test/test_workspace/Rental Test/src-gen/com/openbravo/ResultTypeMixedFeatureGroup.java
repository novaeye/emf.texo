package com.openbravo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation for the Feature Group '<em><b>ResultType.mixed</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ResultTypeMixedFeatureGroup {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Is used to identify which feature is set in this feature group.
	 * @generated 
	 */
	public static enum Feature {
		TEXT, CDATA, COMMENT, MSG, LOG, WARNING, INSERTED, UPDATED, DELETED
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
			List<ResultTypeMixedFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final ResultTypeMixedFeatureGroup group : featureGroup) {
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
			List<ResultTypeMixedFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final ResultTypeMixedFeatureGroup group : featureGroup) {
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
	public static List<ResultTypeMixedFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<ResultTypeMixedFeatureGroup> result = new ArrayList<ResultTypeMixedFeatureGroup>();
		for (Object value : values) {
			final ResultTypeMixedFeatureGroup group = new ResultTypeMixedFeatureGroup();
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
	private String text;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String cDATA;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String comment;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String msg;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String log;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String warning;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntitiesType inserted;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntitiesType updated;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private ResultEntitiesType deleted;

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
	 * Returns the value of '<em><b>text</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>text</b></em>' feature
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the '{@link LetterBodyType#getText() <em>text</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LetterBodyType#getText() text}' feature.
	 * @generated
	 */
	public void setText(String newText) {
		text = newText;
		setFeature(Feature.TEXT);
	}

	/**
	 * Returns the value of '<em><b>cDATA</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cDATA</b></em>' feature
	 * @generated
	 */
	public String getCDATA() {
		return cDATA;
	}

	/**
	 * Sets the '{@link LetterBodyType#getCDATA() <em>cDATA</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LetterBodyType#getCDATA() cDATA}' feature.
	 * @generated
	 */
	public void setCDATA(String newCDATA) {
		cDATA = newCDATA;
		setFeature(Feature.CDATA);
	}

	/**
	 * Returns the value of '<em><b>comment</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>comment</b></em>' feature
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the '{@link LetterBodyType#getComment() <em>comment</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link LetterBodyType#getComment() comment}' feature.
	 * @generated
	 */
	public void setComment(String newComment) {
		comment = newComment;
		setFeature(Feature.COMMENT);
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
		return msg;
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
		msg = newMsg;
		setFeature(Feature.MSG);
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
		return log;
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
		log = newLog;
		setFeature(Feature.LOG);
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
		return warning;
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
		warning = newWarning;
		setFeature(Feature.WARNING);
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
		return inserted;
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
		inserted = newInserted;
		setFeature(Feature.INSERTED);
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
		return updated;
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
		updated = newUpdated;
		setFeature(Feature.UPDATED);
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
		return deleted;
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
		deleted = newDeleted;
		setFeature(Feature.DELETED);
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
		case TEXT:
			return getText();
		case CDATA:
			return getCDATA();
		case COMMENT:
			return getComment();
		case MSG:
			return getMsg();
		case LOG:
			return getLog();
		case WARNING:
			return getWarning();
		case INSERTED:
			return getInserted();
		case UPDATED:
			return getUpdated();
		case DELETED:
			return getDeleted();
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
		case TEXT:
			setText((String) value);
			break;
		case CDATA:
			setCDATA((String) value);
			break;
		case COMMENT:
			setComment((String) value);
			break;
		case MSG:
			setMsg((String) value);
			break;
		case LOG:
			setLog((String) value);
			break;
		case WARNING:
			setWarning((String) value);
			break;
		case INSERTED:
			setInserted((ResultEntitiesType) value);
			break;
		case UPDATED:
			setUpdated((ResultEntitiesType) value);
			break;
		case DELETED:
			setDeleted((ResultEntitiesType) value);
			break;
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
