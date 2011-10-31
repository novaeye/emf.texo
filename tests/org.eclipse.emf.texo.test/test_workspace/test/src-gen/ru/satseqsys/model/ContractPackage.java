package ru.satseqsys.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** 
 * A representation of the model object '<em><b>ContractPackage</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Пакет контрактов
 * <!-- end-model-doc -->
 * @generated 
 */
public class ContractPackage {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Person client = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private User user = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Контракты
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private List<Contract> contracts = new ArrayList<Contract>();

	/**
	 * Returns the value of '<em><b>client</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>client</b></em>' feature
	 * @generated
	 */
	public Person getClient() {
		return client;
	}

	/**
	 * Sets the '{@link ContractPackage#getClient() <em>client</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ContractPackage#getClient() client}' feature.
	 * @generated
	 */
	public void setClient(Person newClient) {
		client = newClient;
	}

	/**
	 * Returns the value of '<em><b>user</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>user</b></em>' feature
	 * @generated
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the '{@link ContractPackage#getUser() <em>user</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link ContractPackage#getUser() user}' feature.
	 * @generated
	 */
	public void setUser(User newUser) {
		user = newUser;
	}

	/**
	 * Returns the value of '<em><b>contracts</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToContracts(ru.satseqsys.model.Contract value)}
	 * and {@link #removeFromContracts(Contract value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Контракты
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>contracts</b></em>' feature
	 * @generated
	 */
	public List<Contract> getContracts() {
		return Collections.unmodifiableList(contracts);
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "ContractPackage ";
	}
}
