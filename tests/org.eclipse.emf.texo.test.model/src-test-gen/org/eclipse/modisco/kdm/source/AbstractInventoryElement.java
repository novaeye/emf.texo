package org.eclipse.modisco.kdm.source;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.core.KDMEntity;

/** 
 * A representation of the model object '<em><b>AbstractInventoryElement</b></em>'.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated 
 */
@Entity(name = "AbstractInventoryElement")
public abstract class AbstractInventoryElement extends KDMEntity {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractInventoryRelationship.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractInventoryRelationship> inventoryRelationship = new HashSet<AbstractInventoryRelationship>();

  /**
   * Returns the value of '<em><b>inventoryRelationship</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>inventoryRelationship</b></em>' feature
   * @generated
   */
  public Set<AbstractInventoryRelationship> getInventoryRelationship() {
    return inventoryRelationship;
  }

  /**
   * Adds to the <em>inventoryRelationship</em> feature.
   * @generated
   */
  public void addToInventoryRelationship(AbstractInventoryRelationship inventoryRelationshipValue) {
    if (!inventoryRelationship.contains(inventoryRelationshipValue)) {

      inventoryRelationship.add(inventoryRelationshipValue);
    }

  }

  /**			
   * Removes from the <em>inventoryRelationship</em> feature.
   * @generated
   */
  public void removeFromInventoryRelationship(AbstractInventoryRelationship inventoryRelationshipValue) {
    if (inventoryRelationship.contains(inventoryRelationshipValue)) {
      inventoryRelationship.remove(inventoryRelationshipValue);
    }
  }

  /**			
   * Clears the <em>inventoryRelationship</em> feature.
   * @generated
   */
  public void clearInventoryRelationship() {
    while (!inventoryRelationship.isEmpty()) {
      removeFromInventoryRelationship(inventoryRelationship.iterator().next());
    }
  }

  /**
   * Sets the '{@link AbstractInventoryElement#getInventoryRelationship() <em>inventoryRelationship</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link AbstractInventoryElement#getInventoryRelationship() inventoryRelationship}' feature.
   * @generated
   */
  public void setInventoryRelationship(Set<AbstractInventoryRelationship> newInventoryRelationship) {
    inventoryRelationship = newInventoryRelationship;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "AbstractInventoryElement ";
  }
}
