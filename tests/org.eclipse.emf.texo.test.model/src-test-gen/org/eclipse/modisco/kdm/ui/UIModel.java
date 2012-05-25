package org.eclipse.modisco.kdm.ui;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.kdm.KDMModel;

/**
 * A representation of the model object '<em><b>UIModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ui_UIModel")
public class UIModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractUIElement> uIElement = new HashSet<AbstractUIElement>();

  /**
   * Returns the value of '<em><b>UIElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>UIElement</b></em>' feature
   * @generated
   */
  public Set<AbstractUIElement> getUIElement() {
    return uIElement;
  }

  /**
   * Adds to the <em>UIElement</em> feature.
   * 
   * @generated
   */
  public void addToUIElement(AbstractUIElement uIElementValue) {
    if (!uIElement.contains(uIElementValue)) {
      uIElement.add(uIElementValue);
    }
  }

  /**
   * Removes from the <em>UIElement</em> feature.
   * 
   * @generated
   */
  public void removeFromUIElement(AbstractUIElement uIElementValue) {
    if (uIElement.contains(uIElementValue)) {
      uIElement.remove(uIElementValue);
    }
  }

  /**
   * Clears the <em>UIElement</em> feature.
   * 
   * @generated
   */
  public void clearUIElement() {
    while (!uIElement.isEmpty()) {
      removeFromUIElement(uIElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link UIModel#getUIElement() <em>UIElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link UIModel#getUIElement() UIElement}' feature.
   * @generated
   */
  public void setUIElement(Set<AbstractUIElement> newUIElement) {
    uIElement = newUIElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "UIModel ";
  }
}
