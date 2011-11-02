package org.eclipse.modisco.kdm.action;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.modisco.kdm.code.AbstractCodeElement;

/** 
 * A representation of the model object '<em><b>EntryFlow</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "EntryFlow")
public class EntryFlow extends AbstractActionRelationship {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = ActionElement.class)
  @JoinColumns({ @JoinColumn() })
  private ActionElement to = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = AbstractCodeElement.class)
  @JoinColumns({ @JoinColumn() })
  private AbstractCodeElement from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public ActionElement getTo() {
    return to;
  }

  /**
   * Sets the '{@link EntryFlow#getTo() <em>to</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link EntryFlow#getTo() to}' feature.
   * @generated
   */
  public void setTo(ActionElement newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public AbstractCodeElement getFrom() {
    return from;
  }

  /**
   * Sets the '{@link EntryFlow#getFrom() <em>from</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link EntryFlow#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(AbstractCodeElement newFrom) {
    from = newFrom;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "EntryFlow ";
  }
}
