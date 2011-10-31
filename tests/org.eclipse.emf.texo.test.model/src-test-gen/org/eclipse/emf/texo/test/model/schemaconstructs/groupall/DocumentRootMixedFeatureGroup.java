package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.LetterBodyType;

/** 
 * A representation for the Feature Group '<em><b>DocumentRoot.mixed</b></em>'.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated 
 */
public class DocumentRootMixedFeatureGroup {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    TEXT, CDATA, COMMENT, ADDRESS, ADDRESSGROUP, SIMPLEALL, SIMPLEALLMAP
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Returns only the values from the feature group which have the feature
   * equal to the parameter.
   * 
   * @param featureGroup
   *          the featureGroup List to filter
   * @param filterByFeature
   *          filters by this enum
   * @return a list with instances corresponding to the feature kind
   * @see Collections#unmodifiableList(List)
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static <T> List<T> createUnmodifiableValueList(List<DocumentRootMixedFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final DocumentRootMixedFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        result.add(group.getValue());
      }
    }
    return (List<T>) Collections.unmodifiableList(result);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Returns a single value from the feature group which has the feature
   * equal to the parameter. The first found value is returned. If no value can be found then null is returned.
   * 
   * @param featureGroup
   *          the featureGroup List to filter
   * @param filterByFeature
   *          filters by this enum
   * @return an instance corresponding to the feature kind or null if not found.
   * @generated
   */
  @SuppressWarnings("unchecked")
  public static <T> T getSingleFeatureMapValue(List<DocumentRootMixedFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final DocumentRootMixedFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        return (T) group.getValue();
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Creates a list of group instances set with the passed feature and
   * values.
   * 
   * @param feature
   *          the feature to set
   * @param values
   *          the values to set as value of each group instance in the result.
   * @return a list with instances of this class, set with the Feature and values
   * @generated
   */
  public static List<DocumentRootMixedFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<DocumentRootMixedFeatureGroup> result = new ArrayList<DocumentRootMixedFeatureGroup>();
    for (Object value : values) {
      final DocumentRootMixedFeatureGroup group = new DocumentRootMixedFeatureGroup();
      group.setValue(feature, value);
      result.add(group);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private Feature feature = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private String text;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private String cDATA;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private String comment;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = AddressType.class)
  @JoinColumns({ @JoinColumn() })
  private AddressType address;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = AddressGroupType.class)
  @JoinColumns({ @JoinColumn() })
  private AddressGroupType addressGroup;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = SimpleAllType.class)
  @JoinColumns({ @JoinColumn() })
  private SimpleAllType simpleAll;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = SimpleAllMapType.class)
  @JoinColumns({ @JoinColumn() })
  private SimpleAllMapType simpleAllMap;

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>text</b></em>' feature
   * @generated
   */
  public String getText() {
    return text;
  }

  /**
   * Sets the '{@link LetterBodyType#getText() <em>text</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>cDATA</b></em>' feature
   * @generated
   */
  public String getCDATA() {
    return cDATA;
  }

  /**
   * Sets the '{@link LetterBodyType#getCDATA() <em>cDATA</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets the '{@link LetterBodyType#getComment() <em>comment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link LetterBodyType#getComment() comment}' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
    setFeature(Feature.COMMENT);
  }

  /**
   * Returns the value of '<em><b>address</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>address</b></em>' feature
   * @generated
   */
  public AddressType getAddress() {
    return address;
  }

  /**
   * Sets the '{@link DocumentRoot#getAddress() <em>address</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getAddress() address}' feature.
   * @generated
   */
  public void setAddress(AddressType newAddress) {
    address = newAddress;
    setFeature(Feature.ADDRESS);
  }

  /**
   * Returns the value of '<em><b>addressGroup</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>addressGroup</b></em>' feature
   * @generated
   */
  public AddressGroupType getAddressGroup() {
    return addressGroup;
  }

  /**
   * Sets the '{@link DocumentRoot#getAddressGroup() <em>addressGroup</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getAddressGroup() addressGroup}' feature.
   * @generated
   */
  public void setAddressGroup(AddressGroupType newAddressGroup) {
    addressGroup = newAddressGroup;
    setFeature(Feature.ADDRESSGROUP);
  }

  /**
   * Returns the value of '<em><b>simpleAll</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>simpleAll</b></em>' feature
   * @generated
   */
  public SimpleAllType getSimpleAll() {
    return simpleAll;
  }

  /**
   * Sets the '{@link DocumentRoot#getSimpleAll() <em>simpleAll</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getSimpleAll() simpleAll}' feature.
   * @generated
   */
  public void setSimpleAll(SimpleAllType newSimpleAll) {
    simpleAll = newSimpleAll;
    setFeature(Feature.SIMPLEALL);
  }

  /**
   * Returns the value of '<em><b>simpleAllMap</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>simpleAllMap</b></em>' feature
   * @generated
   */
  public SimpleAllMapType getSimpleAllMap() {
    return simpleAllMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getSimpleAllMap() <em>simpleAllMap</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getSimpleAllMap() simpleAllMap}' feature.
   * @generated
   */
  public void setSimpleAllMap(SimpleAllMapType newSimpleAllMap) {
    simpleAllMap = newSimpleAllMap;
    setFeature(Feature.SIMPLEALLMAP);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    case ADDRESS:
      return getAddress();
    case ADDRESSGROUP:
      return getAddressGroup();
    case SIMPLEALL:
      return getSimpleAll();
    case SIMPLEALLMAP:
      return getSimpleAllMap();
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
    case ADDRESS:
      setAddress((AddressType) value);
      break;
    case ADDRESSGROUP:
      setAddressGroup((AddressGroupType) value);
      break;
    case SIMPLEALL:
      setSimpleAll((SimpleAllType) value);
      break;
    case SIMPLEALLMAP:
      setSimpleAllMap((SimpleAllMapType) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
