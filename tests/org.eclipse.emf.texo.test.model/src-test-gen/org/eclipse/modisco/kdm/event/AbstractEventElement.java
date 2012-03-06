package org.eclipse.modisco.kdm.event;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;

/**
 * A representation of the model object '<em><b>AbstractEventElement</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "AbstractEventElement")
public abstract class AbstractEventElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = SourceRef.class)
  @JoinColumns({ @JoinColumn() })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = AbstractEventRelationship.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractEventRelationship> eventRelation = new HashSet<AbstractEventRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = ActionElement.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<ActionElement> abstraction = new ArrayList<ActionElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = AbstractCodeElement.class)
  @JoinTable(name = "AbstractEventElement_implementation")
  private Set<AbstractCodeElement> implementation = new HashSet<AbstractCodeElement>();

  /**
   * Returns the value of '<em><b>source</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>source</b></em>' feature
   * @generated
   */
  public Set<SourceRef> getSource() {
    return source;
  }

  /**
   * Adds to the <em>source</em> feature.
   * 
   * @generated
   */
  public void addToSource(SourceRef sourceValue) {
    if (!source.contains(sourceValue)) {
      source.add(sourceValue);
    }
  }

  /**
   * Removes from the <em>source</em> feature.
   * 
   * @generated
   */
  public void removeFromSource(SourceRef sourceValue) {
    if (source.contains(sourceValue)) {
      source.remove(sourceValue);
    }
  }

  /**
   * Clears the <em>source</em> feature.
   * 
   * @generated
   */
  public void clearSource() {
    while (!source.isEmpty()) {
      removeFromSource(source.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractEventElement#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractEventElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>eventRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>eventRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractEventRelationship> getEventRelation() {
    return eventRelation;
  }

  /**
   * Adds to the <em>eventRelation</em> feature.
   * 
   * @generated
   */
  public void addToEventRelation(AbstractEventRelationship eventRelationValue) {
    if (!eventRelation.contains(eventRelationValue)) {
      eventRelation.add(eventRelationValue);
    }
  }

  /**
   * Removes from the <em>eventRelation</em> feature.
   * 
   * @generated
   */
  public void removeFromEventRelation(AbstractEventRelationship eventRelationValue) {
    if (eventRelation.contains(eventRelationValue)) {
      eventRelation.remove(eventRelationValue);
    }
  }

  /**
   * Clears the <em>eventRelation</em> feature.
   * 
   * @generated
   */
  public void clearEventRelation() {
    while (!eventRelation.isEmpty()) {
      removeFromEventRelation(eventRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractEventElement#getEventRelation() <em>eventRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractEventElement#getEventRelation() eventRelation}' feature.
   * @generated
   */
  public void setEventRelation(Set<AbstractEventRelationship> newEventRelation) {
    eventRelation = newEventRelation;
  }

  /**
   * Returns the value of '<em><b>abstraction</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>abstraction</b></em>' feature
   * @generated
   */
  public List<ActionElement> getAbstraction() {
    return abstraction;
  }

  /**
   * Adds to the <em>abstraction</em> feature.
   * 
   * @generated
   */
  public void addToAbstraction(ActionElement abstractionValue) {
    if (!abstraction.contains(abstractionValue)) {
      abstraction.add(abstractionValue);
    }
  }

  /**
   * Removes from the <em>abstraction</em> feature.
   * 
   * @generated
   */
  public void removeFromAbstraction(ActionElement abstractionValue) {
    if (abstraction.contains(abstractionValue)) {
      abstraction.remove(abstractionValue);
    }
  }

  /**
   * Clears the <em>abstraction</em> feature.
   * 
   * @generated
   */
  public void clearAbstraction() {
    while (!abstraction.isEmpty()) {
      removeFromAbstraction(abstraction.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractEventElement#getAbstraction() <em>abstraction</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractEventElement#getAbstraction() abstraction}' feature.
   * @generated
   */
  public void setAbstraction(List<ActionElement> newAbstraction) {
    abstraction = newAbstraction;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void addToImplementation(AbstractCodeElement implementationValue) {
    if (!implementation.contains(implementationValue)) {
      implementation.add(implementationValue);
    }
  }

  /**
   * Removes from the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void removeFromImplementation(AbstractCodeElement implementationValue) {
    if (implementation.contains(implementationValue)) {
      implementation.remove(implementationValue);
    }
  }

  /**
   * Clears the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void clearImplementation() {
    while (!implementation.isEmpty()) {
      removeFromImplementation(implementation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractEventElement#getImplementation() <em>implementation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AbstractEventElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<AbstractCodeElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractEventElement ";
  }
}
