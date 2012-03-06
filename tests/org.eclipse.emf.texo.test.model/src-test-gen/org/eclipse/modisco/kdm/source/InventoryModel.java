package org.eclipse.modisco.kdm.source;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.kdm.KDMModel;

/**
 * A representation of the model object '<em><b>InventoryModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> The InventoryModel is a specific KDM model which corresponds to the physical (engineering)
 * view of the existing software system. InventoryModel is a container for the instances of InventoryItems.
 * InventoryModel corresponds to the inventory of the physical artifacts of the existing software system. <!--
 * end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "InventoryModel")
public class InventoryModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of inventory elements owned by the
   * inventory model. <!-- end-model-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = AbstractInventoryElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractInventoryElement> inventoryElement = new HashSet<AbstractInventoryElement>();

  /**
   * Returns the value of '<em><b>inventoryElement</b></em>' feature. Note: the returned collection is Unmodifiable use
   * the {#addToInventoryElement(org.eclipse.modisco.kdm.source.AbstractInventoryElement value)} and
   * {@link #removeFromInventoryElement(AbstractInventoryElement value)} methods to modify this feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of inventory elements owned by the
   * inventory model. <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>inventoryElement</b></em>' feature
   * @generated
   */
  public Set<AbstractInventoryElement> getInventoryElement() {
    return inventoryElement;
  }

  /**
   * Adds to the <em>inventoryElement</em> feature.
   * 
   * @generated
   */
  public void addToInventoryElement(AbstractInventoryElement inventoryElementValue) {
    if (!inventoryElement.contains(inventoryElementValue)) {
      inventoryElement.add(inventoryElementValue);
    }
  }

  /**
   * Removes from the <em>inventoryElement</em> feature.
   * 
   * @generated
   */
  public void removeFromInventoryElement(AbstractInventoryElement inventoryElementValue) {
    if (inventoryElement.contains(inventoryElementValue)) {
      inventoryElement.remove(inventoryElementValue);
    }
  }

  /**
   * Clears the <em>inventoryElement</em> feature.
   * 
   * @generated
   */
  public void clearInventoryElement() {
    while (!inventoryElement.isEmpty()) {
      removeFromInventoryElement(inventoryElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link InventoryModel#getInventoryElement() <em>inventoryElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The set of inventory elements owned by the
   * inventory model. <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link InventoryModel#getInventoryElement() inventoryElement}' feature.
   * @generated
   */
  public void setInventoryElement(Set<AbstractInventoryElement> newInventoryElement) {
    inventoryElement = newInventoryElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "InventoryModel ";
  }
}
