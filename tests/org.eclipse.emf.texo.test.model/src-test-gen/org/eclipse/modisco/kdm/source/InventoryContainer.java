package org.eclipse.modisco.kdm.source;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>InventoryContainer</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "InventoryContainer")
public class InventoryContainer extends AbstractInventoryElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractInventoryElement> inventoryElement = new HashSet<AbstractInventoryElement>();

  /**
   * Returns the value of '<em><b>inventoryElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * Sets the '{@link InventoryContainer#getInventoryElement() <em>inventoryElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link InventoryContainer#getInventoryElement() inventoryElement}' feature.
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
    return "InventoryContainer ";
  }
}
