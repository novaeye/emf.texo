package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Tariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Информация о тарифе <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "Tariff")
public abstract class Tariff extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic()
  private boolean active = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежи за объем <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @Access(AccessType.FIELD)
  private List<VolumePayment> volumePayments = new ArrayList<VolumePayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Периодические платежи <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @Access(AccessType.FIELD)
  private List<PeriodicalPayment> periodicalPayments = new ArrayList<PeriodicalPayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Первоначальные платежи <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @Access(AccessType.FIELD)
  private List<OneTimePayment> initialPayment = new ArrayList<OneTimePayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Услуги <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  @Access(AccessType.FIELD)
  private List<Service> services = new ArrayList<Service>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Tariff#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link Tariff#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>active</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>active</b></em>' feature
   * @generated
   */
  public boolean isActive() {
    return active;
  }

  /**
   * Sets the '{@link Tariff#isActive() <em>active</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link Tariff#isActive() active}' feature.
   * @generated
   */
  public void setActive(boolean newActive) {
    active = newActive;
  }

  /**
   * Returns the value of '<em><b>volumePayments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежи за объем <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>volumePayments</b></em>' feature
   * @generated
   */
  public List<VolumePayment> getVolumePayments() {
    return volumePayments;
  }

  /**
   * Returns the value of '<em><b>periodicalPayments</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Периодические платежи <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>periodicalPayments</b></em>' feature
   * @generated
   */
  public List<PeriodicalPayment> getPeriodicalPayments() {
    return periodicalPayments;
  }

  /**
   * Returns the value of '<em><b>initialPayment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Первоначальные платежи <!-- end-model-doc
   * -->
   * 
   * @return the value of '<em><b>initialPayment</b></em>' feature
   * @generated
   */
  public List<OneTimePayment> getInitialPayment() {
    return initialPayment;
  }

  /**
   * Returns the value of '<em><b>services</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Услуги <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>services</b></em>' feature
   * @generated
   */
  public List<Service> getServices() {
    return services;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Tariff " + " [name: " + getName() + "]" + " [active: " + isActive() + "]";
  }
}
