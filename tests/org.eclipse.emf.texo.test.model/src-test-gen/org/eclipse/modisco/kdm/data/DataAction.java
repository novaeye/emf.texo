package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.action.ActionElement;

/** 
 * A representation of the model object '<em><b>DataAction</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "DataAction")
public class DataAction extends AbstractDataElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String kind = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = ActionElement.class)
  @JoinTable(name = "DataAction_implementation")
  private Set<ActionElement> implementation = new HashSet<ActionElement>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = DataEvent.class)
  @JoinColumns({ @JoinColumn() })
  private Set<DataEvent> dataElement = new HashSet<DataEvent>();

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link DataAction#getKind() <em>kind</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataAction#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<ActionElement> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * @generated
   */
  public void addToImplementation(ActionElement implementationValue) {
    if (!implementation.contains(implementationValue)) {

      implementation.add(implementationValue);
    }

  }

  /**			
   * Removes from the <em>implementation</em> feature.
   * @generated
   */
  public void removeFromImplementation(ActionElement implementationValue) {
    if (implementation.contains(implementationValue)) {
      implementation.remove(implementationValue);
    }
  }

  /**			
   * Clears the <em>implementation</em> feature.
   * @generated
   */
  public void clearImplementation() {
    while (!implementation.isEmpty()) {
      removeFromImplementation(implementation.iterator().next());
    }
  }

  /**
   * Sets the '{@link DataAction#getImplementation() <em>implementation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataAction#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<ActionElement> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>dataElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>dataElement</b></em>' feature
   * @generated
   */
  public Set<DataEvent> getDataElement() {
    return dataElement;
  }

  /**
   * Adds to the <em>dataElement</em> feature.
   * @generated
   */
  public void addToDataElement(DataEvent dataElementValue) {
    if (!dataElement.contains(dataElementValue)) {

      dataElement.add(dataElementValue);
    }

  }

  /**			
   * Removes from the <em>dataElement</em> feature.
   * @generated
   */
  public void removeFromDataElement(DataEvent dataElementValue) {
    if (dataElement.contains(dataElementValue)) {
      dataElement.remove(dataElementValue);
    }
  }

  /**			
   * Clears the <em>dataElement</em> feature.
   * @generated
   */
  public void clearDataElement() {
    while (!dataElement.isEmpty()) {
      removeFromDataElement(dataElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link DataAction#getDataElement() <em>dataElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataAction#getDataElement() dataElement}' feature.
   * @generated
   */
  public void setDataElement(Set<DataEvent> newDataElement) {
    dataElement = newDataElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "DataAction " + " [kind: " + getKind() + "]";
  }
}
