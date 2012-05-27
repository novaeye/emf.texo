package org.eclipse.emf.texo.test.model.samples.workflow;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

/**
 * A representation of the model object '<em><b>Fault</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "workflow_Fault")
@PrimaryKeyJoinColumns({ @PrimaryKeyJoinColumn(name = "workflow_Fault_parent_id") })
public class Fault extends OutputPort {

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Fault ";
  }
}
