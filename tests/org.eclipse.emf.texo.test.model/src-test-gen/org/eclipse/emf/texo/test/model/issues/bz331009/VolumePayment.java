package org.eclipse.emf.texo.test.model.issues.bz331009;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * A representation of the model object '<em><b>VolumePayment</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Платеж за объем
 * <!-- end-model-doc -->
 * @generated 
 */
@Entity(name = "VolumePayment")
public class VolumePayment implements PaymentItem {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private BigDecimal volume = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> единицы объема <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = Units.class)
  @JoinColumns({ @JoinColumn() })
  private Units unit = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цена за единицу <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private BigDecimal price = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сумма платежа <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private BigDecimal sum = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private Currency currency = Currency.ROUBLES;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата платежа <!-- end-model-doc -->
   * 
   * @generated
   */
  @Temporal(TemporalType.DATE)
  private Date date = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип платежа <!-- end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private PaymentType paymentType = PaymentType.REQUIRED;

  /**
   * Returns the value of '<em><b>volume</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>volume</b></em>' feature
   * @generated
   */
  public BigDecimal getVolume() {
    return volume;
  }

  /**
   * Sets the '{@link VolumePayment#getVolume() <em>volume</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link VolumePayment#getVolume() volume}' feature.
   * @generated
   */
  public void setVolume(BigDecimal newVolume) {
    volume = newVolume;
  }

  /**
   * Returns the value of '<em><b>unit</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> единицы объема <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>unit</b></em>' feature
   * @generated
   */
  public Units getUnit() {
    return unit;
  }

  /**
   * Sets the '{@link VolumePayment#getUnit() <em>unit</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> единицы объема <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link VolumePayment#getUnit() unit}' feature.
   * @generated
   */
  public void setUnit(Units newUnit) {
    unit = newUnit;
  }

  /**
   * Returns the value of '<em><b>price</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цена за единицу <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>price</b></em>' feature
   * @generated
   */
  public BigDecimal getPrice() {
    return price;
  }

  /**
   * Sets the '{@link VolumePayment#getPrice() <em>price</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Цена за единицу <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link VolumePayment#getPrice() price}' feature.
   * @generated
   */
  public void setPrice(BigDecimal newPrice) {
    price = newPrice;
  }

  /**
   * Returns the value of '<em><b>sum</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сумма платежа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>sum</b></em>' feature
   * @generated
   */
  public BigDecimal getSum() {
    return sum;
  }

  /**
   * Sets the '{@link VolumePayment#getSum() <em>sum</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Сумма платежа <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link VolumePayment#getSum() sum}' feature.
   * @generated
   */
  public void setSum(BigDecimal newSum) {
    sum = newSum;
  }

  /**
   * Returns the value of '<em><b>currency</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>currency</b></em>' feature
   * @generated
   */
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the '{@link VolumePayment#getCurrency() <em>currency</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link VolumePayment#getCurrency() currency}' feature.
   * @generated
   */
  public void setCurrency(Currency newCurrency) {
    currency = newCurrency;
  }

  /**
   * Returns the value of '<em><b>date</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата платежа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>date</b></em>' feature
   * @generated
   */
  public Date getDate() {
    return date;
  }

  /**
   * Sets the '{@link VolumePayment#getDate() <em>date</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Дата платежа <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link VolumePayment#getDate() date}' feature.
   * @generated
   */
  public void setDate(Date newDate) {
    date = newDate;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link VolumePayment#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Описание <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link VolumePayment#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>paymentType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип платежа <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>paymentType</b></em>' feature
   * @generated
   */
  public PaymentType getPaymentType() {
    return paymentType;
  }

  /**
   * Sets the '{@link VolumePayment#getPaymentType() <em>paymentType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Тип платежа <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link VolumePayment#getPaymentType() paymentType}' feature.
   * @generated
   */
  public void setPaymentType(PaymentType newPaymentType) {
    paymentType = newPaymentType;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "VolumePayment " + " [volume: " + getVolume() + "]" + " [price: " + getPrice() + "]" + " [sum: " + getSum()
        + "]" + " [currency: " + getCurrency() + "]" + " [date: " + getDate() + "]" + " [description: "
        + getDescription() + "]" + " [paymentType: " + getPaymentType() + "]";
  }
}
