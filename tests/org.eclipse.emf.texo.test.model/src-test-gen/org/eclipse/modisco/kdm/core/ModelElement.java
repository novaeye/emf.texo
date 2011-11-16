package org.eclipse.modisco.kdm.core;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.kdm.ExtendedValue;
import org.eclipse.modisco.kdm.kdm.Stereotype;

/** 
 * A representation of the model object '<em><b>ModelElement</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A model element is an element that represents some aspect of the existing system.
 In the meta-model, a ModelElement is the base for all meta-elements of KDM. All other meta-elements are either direct
 or indirect subclasses of ModelElement. ModelElement is an abstract meta-model element.
 A ModelElement can be extended through the lightweight extension mechanism.
 * <!-- end-model-doc -->
 * @generated 
 */
@Entity(name = "ModelElement")
public abstract class ModelElement extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of stereotype applied to current
   * element. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Stereotype.class)
  @JoinTable(name = "ModelElement_stereotype")
  private Set<Stereotype> stereotype = new HashSet<Stereotype>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of tagged values determined by the
   * stereotype. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ExtendedValue.class)
  @JoinColumns({ @JoinColumn() })
  private Set<ExtendedValue> taggedValue = new HashSet<ExtendedValue>();

  /**
   * Returns the value of '<em><b>stereotype</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToStereotype(org.eclipse.modisco.kdm.kdm.Stereotype value)} and {@link #removeFromStereotype(Stereotype value)}
   * methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of stereotype applied to current
   * element. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>stereotype</b></em>' feature
   * @generated
   */
  public Set<Stereotype> getStereotype() {
    return stereotype;
  }

  /**
   * Adds to the <em>stereotype</em> feature.
   * @generated
   */
  public void addToStereotype(Stereotype stereotypeValue) {
    if (!stereotype.contains(stereotypeValue)) {

      stereotype.add(stereotypeValue);
    }

  }

  /**			
   * Removes from the <em>stereotype</em> feature.
   * @generated
   */
  public void removeFromStereotype(Stereotype stereotypeValue) {
    if (stereotype.contains(stereotypeValue)) {
      stereotype.remove(stereotypeValue);
    }
  }

  /**			
   * Clears the <em>stereotype</em> feature.
   * @generated
   */
  public void clearStereotype() {
    while (!stereotype.isEmpty()) {
      removeFromStereotype(stereotype.iterator().next());
    }
  }

  /**
   * Sets the '{@link ModelElement#getStereotype() <em>stereotype</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of stereotype applied to current
   * element. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ModelElement#getStereotype() stereotype}' feature.
   * @generated
   */
  public void setStereotype(Set<Stereotype> newStereotype) {
    stereotype = newStereotype;
  }

  /**
   * Returns the value of '<em><b>taggedValue</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToTaggedValue(org.eclipse.modisco.kdm.kdm.ExtendedValue value)} and
   * {@link #removeFromTaggedValue(ExtendedValue value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of tagged values determined by the
   * stereotype. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>taggedValue</b></em>' feature
   * @generated
   */
  public Set<ExtendedValue> getTaggedValue() {
    return taggedValue;
  }

  /**
   * Adds to the <em>taggedValue</em> feature.
   * @generated
   */
  public void addToTaggedValue(ExtendedValue taggedValueValue) {
    if (!taggedValue.contains(taggedValueValue)) {

      taggedValue.add(taggedValueValue);
    }

  }

  /**			
   * Removes from the <em>taggedValue</em> feature.
   * @generated
   */
  public void removeFromTaggedValue(ExtendedValue taggedValueValue) {
    if (taggedValue.contains(taggedValueValue)) {
      taggedValue.remove(taggedValueValue);
    }
  }

  /**			
   * Clears the <em>taggedValue</em> feature.
   * @generated
   */
  public void clearTaggedValue() {
    while (!taggedValue.isEmpty()) {
      removeFromTaggedValue(taggedValue.iterator().next());
    }
  }

  /**
   * Sets the '{@link ModelElement#getTaggedValue() <em>taggedValue</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of tagged values determined by the
   * stereotype. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ModelElement#getTaggedValue() taggedValue}' feature.
   * @generated
   */
  public void setTaggedValue(Set<ExtendedValue> newTaggedValue) {
    taggedValue = newTaggedValue;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "ModelElement ";
  }
}
