package ru.satseqsys.model;

import java.math.BigDecimal;
import java.util.Date;

/** 
 * A representation of the model object '<em><b>OneTimePayment</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Разовый платеж
 * <!-- end-model-doc -->
 * @generated 
 */
public class OneTimePayment implements PaymentItem {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Сумма платежа
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private BigDecimal sum = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Currency currency = Currency.ROUBLES;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата платежа
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Date date = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String description = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тип платежа
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private PaymentType paymentType = PaymentType.REQUIRED;

	/**
	 * Returns the value of '<em><b>sum</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Сумма платежа
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>sum</b></em>' feature
	 * @generated
	 */
	public BigDecimal getSum() {
		return sum;
	}

	/**
	 * Sets the '{@link OneTimePayment#getSum() <em>sum</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Сумма платежа
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link OneTimePayment#getSum() sum}' feature.
	 * @generated
	 */
	public void setSum(BigDecimal newSum) {
		sum = newSum;
	}

	/**
	 * Returns the value of '<em><b>currency</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currency</b></em>' feature
	 * @generated
	 */
	public Currency getCurrency() {
		return currency;
	}

	/**
	 * Sets the '{@link OneTimePayment#getCurrency() <em>currency</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link OneTimePayment#getCurrency() currency}' feature.
	 * @generated
	 */
	public void setCurrency(Currency newCurrency) {
		currency = newCurrency;
	}

	/**
	 * Returns the value of '<em><b>date</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата платежа
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>date</b></em>' feature
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Sets the '{@link OneTimePayment#getDate() <em>date</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата платежа
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link OneTimePayment#getDate() date}' feature.
	 * @generated
	 */
	public void setDate(Date newDate) {
		date = newDate;
	}

	/**
	 * Returns the value of '<em><b>description</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the '{@link OneTimePayment#getDescription() <em>description</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Описание
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link OneTimePayment#getDescription() description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>paymentType</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тип платежа
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>paymentType</b></em>' feature
	 * @generated
	 */
	public PaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * Sets the '{@link OneTimePayment#getPaymentType() <em>paymentType</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тип платежа
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link OneTimePayment#getPaymentType() paymentType}' feature.
	 * @generated
	 */
	public void setPaymentType(PaymentType newPaymentType) {
		paymentType = newPaymentType;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "OneTimePayment " + " [sum: " + getSum() + "]" + " [currency: "
				+ getCurrency() + "]" + " [date: " + getDate() + "]"
				+ " [description: " + getDescription() + "]"
				+ " [paymentType: " + getPaymentType() + "]";
	}
}
