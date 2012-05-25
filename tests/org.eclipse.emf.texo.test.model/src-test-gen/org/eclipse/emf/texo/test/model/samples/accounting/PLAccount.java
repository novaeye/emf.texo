package org.eclipse.emf.texo.test.model.samples.accounting;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

/**
 * A representation of the model object '<em><b>PLAccount</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "accounting_PLAccount")
@PrimaryKeyJoinColumns({ @PrimaryKeyJoinColumn(name = "parent_id") })
public class PLAccount extends Account {

  /**
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PLAccount ";
  }
}
