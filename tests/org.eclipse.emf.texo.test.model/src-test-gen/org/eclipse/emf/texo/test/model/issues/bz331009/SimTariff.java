package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;

/**
 * A representation of the model object '<em><b>SimTariff</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Тариф оператора сотовой связи <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "SimTariff")
public class SimTariff implements Tariff {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private boolean active = false;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Платежи за объем <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = VolumePayment.class)
  @OrderColumn()
  @JoinTable(name = "Tariff_volumePayments")
  private List<VolumePayment> volumePayments = new ArrayList<VolumePayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Периодические платежи <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = PeriodicalPayment.class)
  @OrderColumn()
  @JoinTable(name = "Tariff_periodicalPayments")
  private List<PeriodicalPayment> periodicalPayments = new ArrayList<PeriodicalPayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Первоначальные платежи <!-- end-model-doc
   * -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = OneTimePayment.class)
  @OrderColumn()
  @JoinTable(name = "Tariff_initialPayment")
  private List<OneTimePayment> initialPayment = new ArrayList<OneTimePayment>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Услуги <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Service.class)
  @OrderColumn()
  @JoinTable(name = "Tariff_services")
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
   * Sets the '{@link SimTariff#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Название <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link SimTariff#getName() name}' feature.
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
   * Sets the '{@link SimTariff#isActive() <em>active</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Активен ли <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link SimTariff#isActive() active}' feature.
   * @generated
   */
  public void setActive(boolean newActive) {
    active = newActive;
  }

  /**
   * Returns the value of '<em><b>volumePayments</b></em>' feature. Note: the returned collection is Unmodifiable use
   * the {#addToVolumePayments(org.eclipse.emf.texo.test.model.issues.bz331009.VolumePayment value)} and
   * {@link #removeFromVolumePayments(VolumePayment value)} methods to modify this feature.
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
   * Returns the value of '<em><b>periodicalPayments</b></em>' feature. Note: the returned collection is Unmodifiable
   * use the {#addToPeriodicalPayments(org.eclipse.emf.texo.test.model.issues.bz331009.PeriodicalPayment value)} and
   * {@link #removeFromPeriodicalPayments(PeriodicalPayment value)} methods to modify this feature.
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
   * Returns the value of '<em><b>initialPayment</b></em>' feature. Note: the returned collection is Unmodifiable use
   * the {#addToInitialPayment(org.eclipse.emf.texo.test.model.issues.bz331009.OneTimePayment value)} and
   * {@link #removeFromInitialPayment(OneTimePayment value)} methods to modify this feature.
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
   * Returns the value of '<em><b>services</b></em>' feature. Note: the returned collection is Unmodifiable use the
   * {#addToServices(org.eclipse.emf.texo.test.model.issues.bz331009.Service value)} and
   * {@link #removeFromServices(Service value)} methods to modify this feature.
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
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "SimTariff " + " [name: " + getName() + "]" + " [active: " + isActive() + "]";
  }
}
