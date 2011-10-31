package ru.satseqsys.model;

import java.math.BigDecimal;
import java.util.Date;

/** 
 * A representation of the model object '<em><b>PaymentItem</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Информация о платеже
 * <!-- end-model-doc -->
 * @generated 
 */
public interface PaymentItem {
	/**
	 * Returns the value of '<em><b>sum</em></b>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>sum</b></em>' feature
	 * @generated
	 */
	public BigDecimal getSum();

	/**
	 * Sets the '{@link PaymentItem#getSum() <em>sum</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PaymentItem#getSum() <em>sum</em>}' feature.
	 * @generated
	 */
	public void setSum(BigDecimal newSum);

	/**
	 * Returns the value of '<em><b>currency</em></b>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currency</b></em>' feature
	 * @generated
	 */
	public Currency getCurrency();

	/**
	 * Sets the '{@link PaymentItem#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PaymentItem#getCurrency() <em>currency</em>}' feature.
	 * @generated
	 */
	public void setCurrency(Currency newCurrency);

	/**
	 * Returns the value of '<em><b>date</em></b>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>date</b></em>' feature
	 * @generated
	 */
	public Date getDate();

	/**
	 * Sets the '{@link PaymentItem#getDate() <em>date</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PaymentItem#getDate() <em>date</em>}' feature.
	 * @generated
	 */
	public void setDate(Date newDate);

	/**
	 * Returns the value of '<em><b>description</em></b>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription();

	/**
	 * Sets the '{@link PaymentItem#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PaymentItem#getDescription() <em>description</em>}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription);

	/**
	 * Returns the value of '<em><b>paymentType</em></b>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentType</b></em>' feature
	 * @generated
	 */
	public PaymentType getPaymentType();

	/**
	 * Sets the '{@link PaymentItem#getPaymentType() <em>paymentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link PaymentItem#getPaymentType() <em>paymentType</em>}' feature.
	 * @generated
	 */
	public void setPaymentType(PaymentType newPaymentType);

}
