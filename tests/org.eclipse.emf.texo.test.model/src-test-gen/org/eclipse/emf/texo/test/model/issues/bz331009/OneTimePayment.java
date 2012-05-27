package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

/**
 * A representation of the model object '<em><b>OneTimePayment</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> Разовый платеж <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "m_OneTimePayment")
@PrimaryKeyJoinColumns({ @PrimaryKeyJoinColumn(name = "m_OneTimePayment_parent_id") })
public class OneTimePayment extends PaymentItem {

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "OneTimePayment ";
  }
}
