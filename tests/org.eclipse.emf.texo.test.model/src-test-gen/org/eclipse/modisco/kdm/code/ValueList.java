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
 * A representation of the model object '<em><b>ValueList</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ValueList")
public class ValueList extends ValueElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = ValueElement.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<ValueElement> valueElement = new ArrayList<ValueElement>();

  /**
   * Returns the value of '<em><b>valueElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>valueElement</b></em>' feature
   * @generated
   */
  public List<ValueElement> getValueElement() {
    return valueElement;
  }

  /**
   * Adds to the <em>valueElement</em> feature.
   * 
   * @generated
   */
  public void addToValueElement(ValueElement valueElementValue) {
    if (!valueElement.contains(valueElementValue)) {

      valueElement.add(valueElementValue);
    }

  }

  /**
   * Removes from the <em>valueElement</em> feature.
   * 
   * @generated
   */
  public void removeFromValueElement(ValueElement valueElementValue) {
    if (valueElement.contains(valueElementValue)) {
      valueElement.remove(valueElementValue);
    }
  }

  /**
   * Clears the <em>valueElement</em> feature.
   * 
   * @generated
   */
  public void clearValueElement() {
    while (!valueElement.isEmpty()) {
      removeFromValueElement(valueElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link ValueList#getValueElement() <em>valueElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ValueList#getValueElement() valueElement}' feature.
   * @generated
   */
  public void setValueElement(List<ValueElement> newValueElement) {
    valueElement = newValueElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ValueList ";
  }
}
