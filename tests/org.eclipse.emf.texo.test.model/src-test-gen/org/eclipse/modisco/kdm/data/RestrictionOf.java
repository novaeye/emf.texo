package org.eclipse.modisco.kdm.data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/** 
 * A representation of the model object '<em><b>RestrictionOf</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "RestrictionOf")
public class RestrictionOf extends AbstractDataRelationship {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = ComplexContentType.class)
  @JoinColumns({ @JoinColumn() })
  private ComplexContentType to = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = ComplexContentType.class)
  @JoinColumns({ @JoinColumn() })
  private ComplexContentType from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public ComplexContentType getTo() {
    return to;
  }

  /**
   * Sets the '{@link RestrictionOf#getTo() <em>to</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RestrictionOf#getTo() to}' feature.
   * @generated
   */
  public void setTo(ComplexContentType newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public ComplexContentType getFrom() {
    return from;
  }

  /**
   * Sets the '{@link RestrictionOf#getFrom() <em>from</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RestrictionOf#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(ComplexContentType newFrom) {
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
    return "RestrictionOf ";
  }
}
