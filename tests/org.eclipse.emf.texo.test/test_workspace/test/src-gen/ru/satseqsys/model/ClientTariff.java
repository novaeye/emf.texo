package ru.satseqsys.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ClientTariff</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class ClientTariff implements Tariff {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Название
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private String name = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Активен ли
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private boolean active = false;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Платежи за объем
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<VolumePayment> volumePayments = new ArrayList<VolumePayment>();

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Периодические платежи
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<PeriodicalPayment> periodicalPayments = new ArrayList<PeriodicalPayment>();

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Первоначальные платежи
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<OneTimePayment> initialPayment = new ArrayList<OneTimePayment>();

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Услуги
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<Service> services = new ArrayList<Service>();

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Название
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link ClientTariff#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Название
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link ClientTariff#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>active</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Активен ли
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>active</b></em>' feature
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * Sets the '{@link ClientTariff#isActive() <em>active</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Активен ли
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link ClientTariff#isActive() active}' feature.
	 * @generated
	 */
	public void setActive(boolean newActive) {
		active = newActive;
	}

	/**
	 * Returns the value of '<em><b>volumePayments</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToVolumePayments(ru.satseqsys.model.VolumePayment value)}
	 * and {@link #removeFromVolumePayments(VolumePayment value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Платежи за объем
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>volumePayments</b></em>' feature
	 * @generated
	 */
	public List<VolumePayment> getVolumePayments() {
		return Collections.unmodifiableList(volumePayments);
	}

	/**
	 * Returns the value of '<em><b>periodicalPayments</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToPeriodicalPayments(ru.satseqsys.model.PeriodicalPayment value)}
	 * and {@link #removeFromPeriodicalPayments(PeriodicalPayment value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Периодические платежи
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>periodicalPayments</b></em>' feature
	 * @generated
	 */
	public List<PeriodicalPayment> getPeriodicalPayments() {
		return Collections.unmodifiableList(periodicalPayments);
	}

	/**
	 * Returns the value of '<em><b>initialPayment</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToInitialPayment(ru.satseqsys.model.OneTimePayment value)}
	 * and {@link #removeFromInitialPayment(OneTimePayment value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Первоначальные платежи
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>initialPayment</b></em>' feature
	 * @generated
	 */
	public List<OneTimePayment> getInitialPayment() {
		return Collections.unmodifiableList(initialPayment);
	}

	/**
	 * Returns the value of '<em><b>services</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToServices(ru.satseqsys.model.Service value)}
	 * and {@link #removeFromServices(Service value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Услуги
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>services</b></em>' feature
	 * @generated
	 */
	public List<Service> getServices() {
		return Collections.unmodifiableList(services);
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ClientTariff " + " [name: " + getName() + "]" + " [active: "
				+ isActive() + "]";
	}
}
