package org.eclipse.modisco.kdm.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;

/** 
 * A representation of the model object '<em><b>ActionElement</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "ActionElement")
public class ActionElement extends AbstractCodeElement {

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
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractCodeElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractCodeElement> codeElement = new HashSet<AbstractCodeElement>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractActionRelationship.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<AbstractActionRelationship> actionRelation = new ArrayList<AbstractActionRelationship>();

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
   * Sets the '{@link ActionElement#getKind() <em>kind</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ActionElement#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public Set<AbstractCodeElement> getCodeElement() {
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
    for (AbstractCodeElement codeElementElement : codeElement) {
      removeFromCodeElement(codeElementElement);
    }
  }

  /**
   * Sets the '{@link ActionElement#getCodeElement() <em>codeElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ActionElement#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(Set<AbstractCodeElement> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * Returns the value of '<em><b>actionRelation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>actionRelation</b></em>' feature
   * @generated
   */
  public List<AbstractActionRelationship> getActionRelation() {
    return actionRelation;
  }

  /**
   * Adds to the <em>actionRelation</em> feature.
   * @generated
   */
  public void addToActionRelation(AbstractActionRelationship actionRelationValue) {
    if (!actionRelation.contains(actionRelationValue)) {

      actionRelation.add(actionRelationValue);
    }

  }

  /**			
   * Removes from the <em>actionRelation</em> feature.
   * @generated
   */
  public void removeFromActionRelation(AbstractActionRelationship actionRelationValue) {
    if (actionRelation.contains(actionRelationValue)) {
      actionRelation.remove(actionRelationValue);
    }
  }

  /**			
   * Clears the <em>actionRelation</em> feature.
   * @generated
   */
  public void clearActionRelation() {
    for (AbstractActionRelationship actionRelationElement : actionRelation) {
      removeFromActionRelation(actionRelationElement);
    }
  }

  /**
   * Sets the '{@link ActionElement#getActionRelation() <em>actionRelation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ActionElement#getActionRelation() actionRelation}' feature.
   * @generated
   */
  public void setActionRelation(List<AbstractActionRelationship> newActionRelation) {
    actionRelation = newActionRelation;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "ActionElement " + " [kind: " + getKind() + "]";
  }
}
