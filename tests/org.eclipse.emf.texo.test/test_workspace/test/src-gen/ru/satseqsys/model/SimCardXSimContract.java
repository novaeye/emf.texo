package ru.satseqsys.model;

/** 
 * A representation of the model object '<em><b>SimCardXSimContract</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Привязка сим-карты к контракту
 * <!-- end-model-doc -->
 * @generated 
 */
public class SimCardXSimContract {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Сим-карта
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private SimCard simCard = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Контракт
	 * <!-- end-model-doc -->
	 * @generated 
	 */
	private SimContract simContract = null;

	/**
	 * Returns the value of '<em><b>simCard</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Сим-карта
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>simCard</b></em>' feature
	 * @generated
	 */
	public SimCard getSimCard() {
		return simCard;
	}

	/**
	 * Sets the '{@link SimCardXSimContract#getSimCard() <em>simCard</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Сим-карта
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link SimCardXSimContract#getSimCard() simCard}' feature.
	 * @generated
	 */
	public void setSimCard(SimCard newSimCard) {
		simCard = newSimCard;
	}

	/**
	 * Returns the value of '<em><b>simContract</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Контракт
	 * <!-- end-model-doc -->
	 * @return the value of '<em><b>simContract</b></em>' feature
	 * @generated
	 */
	public SimContract getSimContract() {
		return simContract;
	}

	/**
	 * Sets the '{@link SimCardXSimContract#getSimContract() <em>simContract</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Контракт
	 * <!-- end-model-doc -->
	 * @param the new value of the '{@link SimCardXSimContract#getSimContract() simContract}' feature.
	 * @generated
	 */
	public void setSimContract(SimContract newSimContract) {
		simContract = newSimContract;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "SimCardXSimContract ";
	}
}
