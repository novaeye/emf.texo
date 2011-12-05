package com.openbravo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation for the Feature Group '<em><b>ADExtensionPointsType.anyAttribute</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ADExtensionPointsTypeAnyAttributeFeatureGroup {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * Is used to identify which feature is set in this feature group.
	 * @generated 
	 */
	public static enum Feature {
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
			List<ADExtensionPointsTypeAnyAttributeFeatureGroup> featureGroup,
			Feature filterByFeature) {
		final List<Object> result = new ArrayList<Object>();
		for (final ADExtensionPointsTypeAnyAttributeFeatureGroup group : featureGroup) {
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
			List<ADExtensionPointsTypeAnyAttributeFeatureGroup> featureGroup,
			Feature filterByFeature) {
		for (final ADExtensionPointsTypeAnyAttributeFeatureGroup group : featureGroup) {
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
	public static List<ADExtensionPointsTypeAnyAttributeFeatureGroup> createFeatureGroupList(
			Feature feature, List<?> values) {
		final List<ADExtensionPointsTypeAnyAttributeFeatureGroup> result = new ArrayList<ADExtensionPointsTypeAnyAttributeFeatureGroup>();
		for (Object value : values) {
			final ADExtensionPointsTypeAnyAttributeFeatureGroup group = new ADExtensionPointsTypeAnyAttributeFeatureGroup();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of this feature map entry. The type of the returned value is based on the feature.
	 * @see #getFeature()
	 * @generated 
	 */
	public Object getValue() {
		switch (getFeature()) {
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
		default:
			throw new IllegalStateException("Feature kind " + getFeature()
					+ " is not supported for this object " + this);
		}
	}
}
