package org.eclipse.modisco.kdm.conceptual;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 * A representation of the model object '<em><b>ConceptualRole</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ConceptualRole")
public class ConceptualRole extends AbstractConceptualElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = AbstractConceptualElement.class)
  @JoinColumns({ @JoinColumn() })
  private AbstractConceptualElement conceptualElement = null;

  /**
   * Returns the value of '<em><b>conceptualElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>conceptualElement</b></em>' feature
   * @generated
   */
  public AbstractConceptualElement getConceptualElement() {
    return conceptualElement;
  }

  /**
   * Sets the '{@link ConceptualRole#getConceptualElement() <em>conceptualElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ConceptualRole#getConceptualElement() conceptualElement}' feature.
   * @generated
   */
  public void setConceptualElement(AbstractConceptualElement newConceptualElement) {
    conceptualElement = newConceptualElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ConceptualRole ";
  }
}
