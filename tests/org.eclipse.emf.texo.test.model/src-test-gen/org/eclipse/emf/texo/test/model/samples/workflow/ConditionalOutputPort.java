package org.eclipse.emf.texo.test.model.samples.workflow;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

/**
 * A representation of the model object '<em><b>ConditionalOutputPort</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_ConditionalOutputPort")
@PrimaryKeyJoinColumns({ @PrimaryKeyJoinColumn(name = "workflow_ConditionalOutputPort_parent_id") })
public class ConditionalOutputPort extends OutputPort {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Column(name = "COND")
  private String condition = null;

  /**
   * Returns the value of '<em><b>condition</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>condition</b></em>' feature
   * @generated
   */
  public String getCondition() {
    return condition;
  }

  /**
   * Sets the '{@link ConditionalOutputPort#getCondition() <em>condition</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ConditionalOutputPort#getCondition() condition}' feature.
   * @generated
   */
  public void setCondition(String newCondition) {
    condition = newCondition;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ConditionalOutputPort " + " [condition: " + getCondition() + "]";
  }
}
