package org.eclipse.emf.texo.test.model.samples.rental;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * A representation of the model object '<em><b>RentalCar</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "RentalCar")
public class RentalCar extends RentalUnit {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private RentalCarSize size = RentalCarSize.SMALL;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = RentalCarDriver.class)
  private RentalCarDriver currentDriver = null;

  /**
   * Returns the value of '<em><b>size</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>size</b></em>' feature
   * @generated
   */
  public RentalCarSize getSize() {
    return size;
  }

  /**
   * Sets the '{@link RentalCar#getSize() <em>size</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link RentalCar#getSize() size}' feature.
   * @generated
   */
  public void setSize(RentalCarSize newSize) {
    size = newSize;
  }

  /**
   * Returns the value of '<em><b>currentDriver</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>currentDriver</b></em>' feature
   * @generated
   */
  public RentalCarDriver getCurrentDriver() {
    return currentDriver;
  }

  /**
   * Sets the '{@link RentalCar#getCurrentDriver() <em>currentDriver</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link RentalCar#getCurrentDriver() currentDriver}' feature.
   * @generated
   */
  public void setCurrentDriver(RentalCarDriver newCurrentDriver) {
    currentDriver = newCurrentDriver;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "RentalCar " + " [size: " + getSize() + "]";
  }
}
