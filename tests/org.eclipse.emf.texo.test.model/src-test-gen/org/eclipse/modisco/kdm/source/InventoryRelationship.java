package org.eclipse.modisco.kdm.source;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.modisco.kdm.core.KDMEntity;

/** 
 * A representation of the model object '<em><b>InventoryRelationship</b></em>'.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated 
 */
@Entity(name = "InventoryRelationship")
public class InventoryRelationship extends AbstractInventoryRelationship {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = KDMEntity.class)
  @JoinColumns({ @JoinColumn() })
  private KDMEntity to = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = AbstractInventoryElement.class)
  @JoinColumns({ @JoinColumn() })
  private AbstractInventoryElement from = null;

  /**
   * Returns the value of '<em><b>to</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>to</b></em>' feature
   * @generated
   */
  public KDMEntity getTo() {
    return to;
  }

  /**
   * Sets the '{@link InventoryRelationship#getTo() <em>to</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link InventoryRelationship#getTo() to}' feature.
   * @generated
   */
  public void setTo(KDMEntity newTo) {
    to = newTo;
  }

  /**
   * Returns the value of '<em><b>from</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>from</b></em>' feature
   * @generated
   */
  public AbstractInventoryElement getFrom() {
    return from;
  }

  /**
   * Sets the '{@link InventoryRelationship#getFrom() <em>from</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link InventoryRelationship#getFrom() from}' feature.
   * @generated
   */
  public void setFrom(AbstractInventoryElement newFrom) {
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
    return "InventoryRelationship ";
  }
}
