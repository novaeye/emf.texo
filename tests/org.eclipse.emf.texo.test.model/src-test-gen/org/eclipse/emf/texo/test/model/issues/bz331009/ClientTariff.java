package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;

/**
 * A representation of the model object '<em><b>ClientTariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "m_ClientTariff")
@PrimaryKeyJoinColumns({ @PrimaryKeyJoinColumn(name = "parent_id") })
public class ClientTariff extends Tariff {

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ClientTariff ";
  }
}
