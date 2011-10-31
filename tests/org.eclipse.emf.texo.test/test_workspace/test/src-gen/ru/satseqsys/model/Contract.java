package ru.satseqsys.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/** 
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Информация о договоре
 * <!-- end-model-doc -->
 * @generated 
 */
public class Contract {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата подписания
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Date signDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private SimCard simCard = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private PaymentInfo paymentInfo = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ТС
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Car car = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Секретные вопросы
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<SecretQuestion> secretQuestions = new ArrayList<SecretQuestion>();

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер контракта
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String number = null;

	/**
	 * Returns the value of '<em><b>signDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата подписания
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>signDate</b></em>' feature
	 * @generated
	 */
	public Date getSignDate() {
		return signDate;
	}

	/**
	 * Sets the '{@link Contract#getSignDate() <em>signDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Дата подписания
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Contract#getSignDate() signDate}' feature.
	 * @generated
	 */
	public void setSignDate(Date newSignDate) {
		signDate = newSignDate;
	}

	/**
	 * Returns the value of '<em><b>simCard</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>simCard</b></em>' feature
	 * @generated
	 */
	public SimCard getSimCard() {
		return simCard;
	}

	/**
	 * Sets the '{@link Contract#getSimCard() <em>simCard</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Contract#getSimCard() simCard}' feature.
	 * @generated
	 */
	public void setSimCard(SimCard newSimCard) {
		simCard = newSimCard;
	}

	/**
	 * Returns the value of '<em><b>paymentInfo</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>paymentInfo</b></em>' feature
	 * @generated
	 */
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	/**
	 * Sets the '{@link Contract#getPaymentInfo() <em>paymentInfo</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link Contract#getPaymentInfo() paymentInfo}' feature.
	 * @generated
	 */
	public void setPaymentInfo(PaymentInfo newPaymentInfo) {
		paymentInfo = newPaymentInfo;
	}

	/**
	 * Returns the value of '<em><b>car</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ТС
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>car</b></em>' feature
	 * @generated
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * Sets the '{@link Contract#getCar() <em>car</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ТС
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Contract#getCar() car}' feature.
	 * @generated
	 */
	public void setCar(Car newCar) {
		car = newCar;
	}

	/**
	 * Returns the value of '<em><b>secretQuestions</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToSecretQuestions(ru.satseqsys.model.SecretQuestion value)}
	 * and {@link #removeFromSecretQuestions(SecretQuestion value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Секретные вопросы
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>secretQuestions</b></em>' feature
	 * @generated
	 */
	public List<SecretQuestion> getSecretQuestions() {
		return Collections.unmodifiableList(secretQuestions);
	}

	/**
	 * Returns the value of '<em><b>number</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер контракта
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>number</b></em>' feature
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the '{@link Contract#getNumber() <em>number</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Номер контракта
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link Contract#getNumber() number}' feature.
	 * @generated
	 */
	public void setNumber(String newNumber) {
		number = newNumber;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "Contract " + " [signDate: " + getSignDate() + "]"
				+ " [number: " + getNumber() + "]";
	}
}
