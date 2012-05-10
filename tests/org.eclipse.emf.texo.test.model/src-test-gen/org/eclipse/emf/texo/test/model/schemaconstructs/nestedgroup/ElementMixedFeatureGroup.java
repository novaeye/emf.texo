package org.eclipse.emf.texo.test.model.schemaconstructs.nestedgroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.schemaconstructs.mixed.LetterBodyType;

/**
 * A representation for the Feature Group '<em><b>Element.mixed</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Element_mixed")
public class ElementMixedFeatureGroup {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Is used to identify which feature is set in this feature group.
   * 
   * @generated
   */
  public static enum Feature {
    TEXT, CDATA, COMMENT, NAME, TRUE, C, RECURSIVE
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
  public static <T> List<T> createUnmodifiableValueList(List<ElementMixedFeatureGroup> featureGroup,
      Feature filterByFeature) {
    final List<Object> result = new ArrayList<Object>();
    for (final ElementMixedFeatureGroup group : featureGroup) {
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
  public static <T> T getSingleFeatureMapValue(List<ElementMixedFeatureGroup> featureGroup, Feature filterByFeature) {
    for (final ElementMixedFeatureGroup group : featureGroup) {
      if (group.getFeature() == filterByFeature) {
        return (T) group.getValue();
      }
    }
    return null;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> Sets a single value in a feature group, if there is already a value
   * set in the feature for the feature in question then it is replaced by the new value.
   * 
   * @param featureGroup
   *          the featureGroup List to find the value
   * @param feature
   *          sets this feature
   * @param value
   *          the value to set
   * @generated
   */
  public static void setSingleFeatureMapValue(List<ElementMixedFeatureGroup> featureGroup, Feature feature, Object value) {
    for (final ElementMixedFeatureGroup group : featureGroup) {
      if (group.getFeature() == feature) {
        group.setValue(feature, value);
        return;
      }
    }
    final ElementMixedFeatureGroup entry = new ElementMixedFeatureGroup();
    entry.setValue(feature, value);
    featureGroup.add(entry);
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
  public static List<ElementMixedFeatureGroup> createFeatureGroupList(Feature feature, List<?> values) {
    final List<ElementMixedFeatureGroup> result = new ArrayList<ElementMixedFeatureGroup>();
    for (Object value : values) {
      final ElementMixedFeatureGroup group = new ElementMixedFeatureGroup();
      group.setValue(feature, value);
      result.add(group);
    }
    return result;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic
  @Enumerated(EnumType.STRING)
  private Feature feature = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Lob
  private String text;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Lob
  private String cDATA;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Lob
  private String comment;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ElementTrueFeatureGroup.class)
  @JoinTable()
  private ElementTrueFeatureGroup true_;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = Element.class)
  @JoinColumns({ @JoinColumn() })
  private Element recursive;

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
   * 
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
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getText() text}' feature.
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
   * 
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
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getCDATA() cDATA}' feature.
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
   * 
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
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getComment() comment}' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
    setFeature(Feature.COMMENT);
  }

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Element#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Element#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
    setFeature(Feature.NAME);
  }

  /**
   * Returns the value of '<em><b>true</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>true</b></em>' feature
   * @generated
   */
  public ElementTrueFeatureGroup getTrue() {
    return true_;
  }

  /**
   * Sets the '{@link Element#getTrue() <em>true</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Element#getTrue() true}' feature.
   * @generated
   */
  public void setTrue(ElementTrueFeatureGroup newTrue) {
    true_ = newTrue;
    setFeature(Feature.TRUE);
  }

  /**
   * Returns the value of '<em><b>c</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>c</b></em>' feature
   * @generated
   */
  public CType getC() {
    if (getTrue() == null) {
      return null;
    }
    return getTrue().getC();
  }

  /**
   * Sets the '{@link Element#getC() <em>c</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Element#getC() c}' feature.
   * @generated
   */
  public void setC(CType newC) {
    if (getTrue() == null) {
      setTrue(new ElementTrueFeatureGroup());
    }
    getTrue().setC(newC);
  }

  /**
   * Returns the value of '<em><b>recursive</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>recursive</b></em>' feature
   * @generated
   */
  public Element getRecursive() {
    return recursive;
  }

  /**
   * Sets the '{@link Element#getRecursive() <em>recursive</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Element#getRecursive() recursive}' feature.
   * @generated
   */
  public void setRecursive(Element newRecursive) {
    recursive = newRecursive;
    setFeature(Feature.RECURSIVE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
    case NAME:
      return getName();
    case TRUE:
      return getTrue();
    case C:
      return getC();
    case RECURSIVE:
      return getRecursive();
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param feature
   *          the feature to set
   * @param the
   *          value to set in this instance
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
    case NAME:
      setName((String) value);
      break;
    case TRUE:
      setTrue((ElementTrueFeatureGroup) value);
      break;
    case C:
      setC((CType) value);
      break;
    case RECURSIVE:
      setRecursive((Element) value);
      break;
    default:
      throw new IllegalStateException("Feature kind " + getFeature() + " is not supported for this object " + this);
    }
  }
}
