package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>CompositeType</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "CompositeType")
public class CompositeType extends Datatype {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ItemUnit.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<ItemUnit> itemUnit = new ArrayList<ItemUnit>();

  /**
   * Returns the value of '<em><b>itemUnit</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>itemUnit</b></em>' feature
   * @generated
   */
  public List<ItemUnit> getItemUnit() {
    return itemUnit;
  }

  /**
   * Adds to the <em>itemUnit</em> feature.
   * @generated
   */
  public void addToItemUnit(ItemUnit itemUnitValue) {
    if (!itemUnit.contains(itemUnitValue)) {

      itemUnit.add(itemUnitValue);
    }

  }

  /**			
   * Removes from the <em>itemUnit</em> feature.
   * @generated
   */
  public void removeFromItemUnit(ItemUnit itemUnitValue) {
    if (itemUnit.contains(itemUnitValue)) {
      itemUnit.remove(itemUnitValue);
    }
  }

  /**			
   * Clears the <em>itemUnit</em> feature.
   * @generated
   */
  public void clearItemUnit() {
    while (!itemUnit.isEmpty()) {
      removeFromItemUnit(itemUnit.get(0));
    }
  }

  /**
   * Sets the '{@link CompositeType#getItemUnit() <em>itemUnit</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link CompositeType#getItemUnit() itemUnit}' feature.
   * @generated
   */
  public void setItemUnit(List<ItemUnit> newItemUnit) {
    itemUnit = newItemUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "CompositeType ";
  }
}
