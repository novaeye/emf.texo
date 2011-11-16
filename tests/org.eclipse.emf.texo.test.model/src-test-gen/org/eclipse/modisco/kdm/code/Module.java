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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Module")
public class Module extends CodeItem {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractCodeElement.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<AbstractCodeElement> codeElement = new ArrayList<AbstractCodeElement>();

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public List<AbstractCodeElement> getCodeElement() {
    return codeElement;
  }

  /**
   * Adds to the <em>codeElement</em> feature.
   * @generated
   */
  public void addToCodeElement(AbstractCodeElement codeElementValue) {
    if (!codeElement.contains(codeElementValue)) {

      codeElement.add(codeElementValue);
    }

  }

  /**			
   * Removes from the <em>codeElement</em> feature.
   * @generated
   */
  public void removeFromCodeElement(AbstractCodeElement codeElementValue) {
    if (codeElement.contains(codeElementValue)) {
      codeElement.remove(codeElementValue);
    }
  }

  /**			
   * Clears the <em>codeElement</em> feature.
   * @generated
   */
  public void clearCodeElement() {
    while (!codeElement.isEmpty()) {
      removeFromCodeElement(codeElement.get(0));
    }
  }

  /**
   * Sets the '{@link Module#getCodeElement() <em>codeElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Module#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(List<AbstractCodeElement> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Module ";
  }
}
