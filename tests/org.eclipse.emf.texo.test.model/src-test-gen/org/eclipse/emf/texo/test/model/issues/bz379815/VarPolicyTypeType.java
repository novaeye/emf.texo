package org.eclipse.emf.texo.test.model.issues.bz379815;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>VarPolicyTypeType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "bz379815_VarPolicyTypeType")
@Table(name = "DPL_bz379815_VarPolicyTypeType")
public class VarPolicyTypeType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  @Column(name = "T_type")
  @Enumerated(EnumType.STRING)
  private TypeType type = TypeType.EROSION;

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public TypeType getType() {
    return type;
  }

  /**
   * Sets the '{@link VarPolicyTypeType#getType() <em>type</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link VarPolicyTypeType#getType() type}' feature.
   * @generated
   */
  public void setType(TypeType newType) {
    type = newType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "VarPolicyTypeType " + " [type: " + getType() + "]";
  }
}
