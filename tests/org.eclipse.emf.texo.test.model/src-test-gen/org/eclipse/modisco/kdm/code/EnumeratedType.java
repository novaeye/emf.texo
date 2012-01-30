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
 * A representation of the model object '<em><b>EnumeratedType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "EnumeratedType")
public class EnumeratedType extends Datatype {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Value.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Value> value = new ArrayList<Value>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = CodeItem.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<CodeItem> codeElement = new ArrayList<CodeItem>();

  /**
   * Returns the value of '<em><b>value</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>value</b></em>' feature
   * @generated
   */
  public List<Value> getValue() {
    return value;
  }

  /**
   * Adds to the <em>value</em> feature.
   * 
   * @generated
   */
  public void addToValue(Value valueValue) {
    if (!value.contains(valueValue)) {

      value.add(valueValue);
    }

  }

  /**
   * Removes from the <em>value</em> feature.
   * 
   * @generated
   */
  public void removeFromValue(Value valueValue) {
    if (value.contains(valueValue)) {
      value.remove(valueValue);
    }
  }

  /**
   * Clears the <em>value</em> feature.
   * 
   * @generated
   */
  public void clearValue() {
    while (!value.isEmpty()) {
      removeFromValue(value.iterator().next());
    }
  }

  /**
   * Sets the '{@link EnumeratedType#getValue() <em>value</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link EnumeratedType#getValue() value}' feature.
   * @generated
   */
  public void setValue(List<Value> newValue) {
    value = newValue;
  }

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public List<CodeItem> getCodeElement() {
    return codeElement;
  }

  /**
   * Adds to the <em>codeElement</em> feature.
   * 
   * @generated
   */
  public void addToCodeElement(CodeItem codeElementValue) {
    if (!codeElement.contains(codeElementValue)) {

      codeElement.add(codeElementValue);
    }

  }

  /**
   * Removes from the <em>codeElement</em> feature.
   * 
   * @generated
   */
  public void removeFromCodeElement(CodeItem codeElementValue) {
    if (codeElement.contains(codeElementValue)) {
      codeElement.remove(codeElementValue);
    }
  }

  /**
   * Clears the <em>codeElement</em> feature.
   * 
   * @generated
   */
  public void clearCodeElement() {
    while (!codeElement.isEmpty()) {
      removeFromCodeElement(codeElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link EnumeratedType#getCodeElement() <em>codeElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link EnumeratedType#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(List<CodeItem> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "EnumeratedType ";
  }
}
