package org.eclipse.modisco.kdm.data;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.code.ItemUnit;

/** 
 * A representation of the model object '<em><b>ColumnSet</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "ColumnSet")
public class ColumnSet extends DataContainer {

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
    for (ItemUnit itemUnitElement : itemUnit) {
      removeFromItemUnit(itemUnitElement);
    }
  }

  /**
   * Sets the '{@link ColumnSet#getItemUnit() <em>itemUnit</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ColumnSet#getItemUnit() itemUnit}' feature.
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
    return "ColumnSet ";
  }
}
