package org.eclipse.modisco.kdm.code;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>ParameterUnit</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ParameterUnit")
public class ParameterUnit extends DataElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private ParameterKind kind = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private Integer pos = null;

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public ParameterKind getKind() {
    return kind;
  }

  /**
   * Sets the '{@link ParameterUnit#getKind() <em>kind</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ParameterUnit#getKind() kind}' feature.
   * @generated
   */
  public void setKind(ParameterKind newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>pos</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pos</b></em>' feature
   * @generated
   */
  public Integer getPos() {
    return pos;
  }

  /**
   * Sets the '{@link ParameterUnit#getPos() <em>pos</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ParameterUnit#getPos() pos}' feature.
   * @generated
   */
  public void setPos(Integer newPos) {
    pos = newPos;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ParameterUnit " + " [kind: " + getKind() + "]" + " [pos: " + getPos() + "]";
  }
}
