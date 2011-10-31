package ru.satseqsys.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation of the model object '<em><b>PaymentInfo</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Платежная информация
 * <!-- end-model-doc -->
 * @generated 
 */
public class PaymentInfo {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тариф
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private Tariff tariff = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Фактические платежи
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<PaymentItem> factPayments = new ArrayList<PaymentItem>();

	/**
	 * Returns the value of '<em><b>tariff</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тариф
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>tariff</b></em>' feature
	 * @generated
	 */
	public Tariff getTariff() {
		return tariff;
	}

	/**
	 * Sets the '{@link PaymentInfo#getTariff() <em>tariff</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Тариф
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link PaymentInfo#getTariff() tariff}' feature.
	 * @generated
	 */
	public void setTariff(Tariff newTariff) {
		tariff = newTariff;
	}

	/**
	 * Returns the value of '<em><b>factPayments</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToFactPayments(ru.satseqsys.model.PaymentItem value)}
	 * and {@link #removeFromFactPayments(PaymentItem value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Фактические платежи
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>factPayments</b></em>' feature
	 * @generated
	 */
	public List<PaymentItem> getFactPayments() {
		return Collections.unmodifiableList(factPayments);
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "PaymentInfo ";
	}
}
