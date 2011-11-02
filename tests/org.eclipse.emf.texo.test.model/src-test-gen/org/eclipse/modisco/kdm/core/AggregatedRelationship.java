package org.eclipse.modisco.kdm.core;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>AggregatedRelationship</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc --> <!-- begin-model-doc --> The set of aggregated relationships for a given entity represents all
 * primitive relationships between the entities that are transitively owned by the given entity as well as the entity
 * itself. This is a concrete class, because an AggregatedRelationship can be instantiated, and exchanged.
 * AggregatedRelations are meant to be built on demand (and exchanged too, if necessary). The lifecycle of the
 * Aggregated Relationships can be explicitly managed by the operations of the KDMEntity class. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "AggregatedRelationship")
public class AggregatedRelationship extends ModelElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The source container of the relationships in
   * the aggregated set. All relationships in the aggregated set should originate from the source container or from some
   * entity that is contained directly or indirectly in the source container. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = KDMEntity.class)
  @JoinColumns({ @JoinColumn() })
  private KDMEntity from = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The target container of the relationships in
   * the aggregated set. All relations in the aggregated set should terminate at the target container or at some entity
   * that is contained directly or indirectly in the target container. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = KDMEntity.class)
  @JoinColumns({ @JoinColumn() })
  private KDMEntity to = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of primitive KDM relationships
   * represented by the aggregated relationship. <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = KDMRelationship.class)
  @JoinTable(name = "AggregatedRelationship_relation")
  private Set<KDMRelationship> relation = new HashSet<KDMRelationship>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The number of primitive relationships in the
   * aggregated set. <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private Integer density = null;

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The source container of the relationships in
   * the aggregated set. All relationships in the aggregated set should originate from the source container or from some
   * entity that is contained directly or indirectly in the source container. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public KDMEntity getFrom() {
    return from;
  }

  /**
   * Sets the '{@link AggregatedRelationship#getFrom() <em>from</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The source container of the relationships in
   * the aggregated set. All relationships in the aggregated set should originate from the source container or from some
   * entity that is contained directly or indirectly in the source container. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link AggregatedRelationship#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(KDMEntity newFrom) {
    from = newFrom;
  }

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The target container of the relationships in
   * the aggregated set. All relations in the aggregated set should terminate at the target container or at some entity
   * that is contained directly or indirectly in the target container. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public KDMEntity getTo() {
    return to;
  }

  /**
   * Sets the '{@link AggregatedRelationship#getTo() <em>to</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The target container of the relationships in
   * the aggregated set. All relations in the aggregated set should terminate at the target container or at some entity
   * that is contained directly or indirectly in the target container. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link AggregatedRelationship#getTo() to}' feature.
   * @generated
   */
  public void setTo(KDMEntity newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>relation</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToRelation(org.eclipse.modisco.kdm.core.KDMRelationship value)} and
   * {@link #removeFromRelation(KDMRelationship value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of primitive KDM relationships
   * represented by the aggregated relationship. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>relation</b></em>' feature
   * @generated
   */
  public Set<KDMRelationship> getRelation() {
    return relation;
  }

  /**
   * Adds to the <em>relation</em> feature.
   * @generated
   */
  public void addToRelation(KDMRelationship relationValue) {
    if (!relation.contains(relationValue)) {

      relation.add(relationValue);
    }

  }

  /**			
   * Removes from the <em>relation</em> feature.
   * @generated
   */
  public void removeFromRelation(KDMRelationship relationValue) {
    if (relation.contains(relationValue)) {
      relation.remove(relationValue);
    }
  }

  /**			
   * Clears the <em>relation</em> feature.
   * @generated
   */
  public void clearRelation() {
    for (KDMRelationship relationElement : relation) {
      removeFromRelation(relationElement);
    }
  }

  /**
   * Sets the '{@link AggregatedRelationship#getRelation() <em>relation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of primitive KDM relationships
   * represented by the aggregated relationship. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link AggregatedRelationship#getRelation() relation}' feature.
   * @generated
   */
  public void setRelation(Set<KDMRelationship> newRelation) {
    relation = newRelation;
  }

  /**
   * Returns the value of '<em><b>density</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The number of primitive relationships in the
   * aggregated set. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>density</b></em>' feature
   * @generated
   */
  public Integer getDensity() {
    return density;
  }

  /**
   * Sets the '{@link AggregatedRelationship#getDensity() <em>density</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The number of primitive relationships in the
   * aggregated set. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link AggregatedRelationship#getDensity() density}' feature.
   * @generated
   */
  public void setDensity(Integer newDensity) {
    density = newDensity;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "AggregatedRelationship " + " [density: " + getDensity() + "]";
  }
}
