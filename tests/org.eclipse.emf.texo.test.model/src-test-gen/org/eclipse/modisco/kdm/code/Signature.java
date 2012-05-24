package org.eclipse.modisco.kdm.code;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Signature</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Signature")
public class Signature extends Datatype {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private List<ParameterUnit> parameterUnit = new ArrayList<ParameterUnit>();

  /**
   * Returns the value of '<em><b>parameterUnit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>parameterUnit</b></em>' feature
   * @generated
   */
  public List<ParameterUnit> getParameterUnit() {
    return parameterUnit;
  }

  /**
   * Adds to the <em>parameterUnit</em> feature.
   * 
   * @generated
   */
  public void addToParameterUnit(ParameterUnit parameterUnitValue) {
    if (!parameterUnit.contains(parameterUnitValue)) {
      parameterUnit.add(parameterUnitValue);
    }
  }

  /**
   * Removes from the <em>parameterUnit</em> feature.
   * 
   * @generated
   */
  public void removeFromParameterUnit(ParameterUnit parameterUnitValue) {
    if (parameterUnit.contains(parameterUnitValue)) {
      parameterUnit.remove(parameterUnitValue);
    }
  }

  /**
   * Clears the <em>parameterUnit</em> feature.
   * 
   * @generated
   */
  public void clearParameterUnit() {
    while (!parameterUnit.isEmpty()) {
      removeFromParameterUnit(parameterUnit.iterator().next());
    }
  }

  /**
   * Sets the '{@link Signature#getParameterUnit() <em>parameterUnit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Signature#getParameterUnit() parameterUnit}' feature.
   * @generated
   */
  public void setParameterUnit(List<ParameterUnit> newParameterUnit) {
    parameterUnit = newParameterUnit;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Signature ";
  }
}
