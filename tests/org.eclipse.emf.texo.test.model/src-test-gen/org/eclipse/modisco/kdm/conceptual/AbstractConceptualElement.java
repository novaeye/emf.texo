package org.eclipse.modisco.kdm.conceptual;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.modisco.kdm.action.ActionElement;
import org.eclipse.modisco.kdm.core.KDMEntity;
import org.eclipse.modisco.kdm.source.SourceRef;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>AbstractConceptualElement</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "conceptual_AbstractConceptualElement")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public abstract class AbstractConceptualElement extends KDMEntity {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<SourceRef> source = new HashSet<SourceRef>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Set<KDMEntity> implementation = new HashSet<KDMEntity>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractConceptualRelationship> conceptualRelation = new HashSet<AbstractConceptualRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<ActionElement> abstraction = new HashSet<ActionElement>();

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
   * @param sourceValue
   *          the value to add
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
   * @param sourceValue
   *          the value to remove
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
   * Sets the '{@link AbstractConceptualElement#getSource() <em>source</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newSource
   *          the new value of the '{@link AbstractConceptualElement#getSource() source}' feature.
   * @generated
   */
  public void setSource(Set<SourceRef> newSource) {
    source = newSource;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<KDMEntity> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * 
   * @param implementationValue
   *          the value to add
   * 
   * @generated
   */
  public void addToImplementation(KDMEntity implementationValue) {
    if (!implementation.contains(implementationValue)) {
      implementation.add(implementationValue);
    }
  }

  /**
   * Removes from the <em>implementation</em> feature.
   * 
   * @param implementationValue
   *          the value to remove
   * 
   * @generated
   */
  public void removeFromImplementation(KDMEntity implementationValue) {
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
   * Sets the '{@link AbstractConceptualElement#getImplementation() <em>implementation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newImplementation
   *          the new value of the '{@link AbstractConceptualElement#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<KDMEntity> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>conceptualRelation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>conceptualRelation</b></em>' feature
   * @generated
   */
  public Set<AbstractConceptualRelationship> getConceptualRelation() {
    return conceptualRelation;
  }

  /**
   * Adds to the <em>conceptualRelation</em> feature.
   * 
   * @param conceptualRelationValue
   *          the value to add
   * 
   * @generated
   */
  public void addToConceptualRelation(AbstractConceptualRelationship conceptualRelationValue) {
    if (!conceptualRelation.contains(conceptualRelationValue)) {
      conceptualRelation.add(conceptualRelationValue);
    }
  }

  /**
   * Removes from the <em>conceptualRelation</em> feature.
   * 
   * @param conceptualRelationValue
   *          the value to remove
   * 
   * @generated
   */
  public void removeFromConceptualRelation(AbstractConceptualRelationship conceptualRelationValue) {
    if (conceptualRelation.contains(conceptualRelationValue)) {
      conceptualRelation.remove(conceptualRelationValue);
    }
  }

  /**
   * Clears the <em>conceptualRelation</em> feature.
   * 
   * @generated
   */
  public void clearConceptualRelation() {
    while (!conceptualRelation.isEmpty()) {
      removeFromConceptualRelation(conceptualRelation.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractConceptualElement#getConceptualRelation() <em>conceptualRelation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newConceptualRelation
   *          the new value of the '{@link AbstractConceptualElement#getConceptualRelation() conceptualRelation}'
   *          feature.
   * @generated
   */
  public void setConceptualRelation(Set<AbstractConceptualRelationship> newConceptualRelation) {
    conceptualRelation = newConceptualRelation;
  }

  /**
   * Returns the value of '<em><b>abstraction</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>abstraction</b></em>' feature
   * @generated
   */
  public Set<ActionElement> getAbstraction() {
    return abstraction;
  }

  /**
   * Adds to the <em>abstraction</em> feature.
   * 
   * @param abstractionValue
   *          the value to add
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
   * @param abstractionValue
   *          the value to remove
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
   * Sets the '{@link AbstractConceptualElement#getAbstraction() <em>abstraction</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newAbstraction
   *          the new value of the '{@link AbstractConceptualElement#getAbstraction() abstraction}' feature.
   * @generated
   */
  public void setAbstraction(Set<ActionElement> newAbstraction) {
    abstraction = newAbstraction;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractConceptualElement ";
  }
}
