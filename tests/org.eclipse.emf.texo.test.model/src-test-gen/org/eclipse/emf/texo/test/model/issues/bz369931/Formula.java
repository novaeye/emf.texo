package org.eclipse.emf.texo.test.model.issues.bz369931;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>Formula</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Formula")
public class Formula {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  @Enumerated(EnumType.STRING)
  private FormulaType formulaType = null;

  /**
   * Returns the value of '<em><b>formulaType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>formulaType</b></em>' feature
   * @generated
   */
  public FormulaType getFormulaType() {
    return formulaType;
  }

  /**
   * Sets the '{@link Formula#getFormulaType() <em>formulaType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Formula#getFormulaType() formulaType}' feature.
   * @generated
   */
  public void setFormulaType(FormulaType newFormulaType) {
    formulaType = newFormulaType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Formula " + " [formulaType: " + getFormulaType() + "]";
  }
}
