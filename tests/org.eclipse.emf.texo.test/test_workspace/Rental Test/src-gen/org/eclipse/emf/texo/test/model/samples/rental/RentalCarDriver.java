package org.eclipse.emf.texo.test.model.samples.rental;

import org.eclipse.emf.texo.demo.BaseObject;

/** 
 * A representation of the model object '<em><b>RentalCarDriver</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RentalCarDriver extends BaseObject {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String name = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RentalCar currentRentalCar = null;

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link RentalCarDriver#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalCarDriver#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>currentRentalCar</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToCurrentRentalCar(org.eclipse.emf.texo.test.model.samples.rental.RentalCar value)}
	 * and {@link #removeFromCurrentRentalCar(RentalCar value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currentRentalCar</b></em>' feature
	 * @generated
	 */
	public RentalCar getCurrentRentalCar() {
		return currentRentalCar;
	}

	/**
	 * Sets the '{@link RentalCarDriver#getCurrentRentalCar() <em>currentRentalCar</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalCarDriver#getCurrentRentalCar() currentRentalCar}' feature.
	 * @generated
	 */
	public void setCurrentRentalCar(RentalCar newCurrentRentalCar) {
		if (currentRentalCar != newCurrentRentalCar) {
			if (currentRentalCar != null) {
				RentalCar tempCurrentRentalCar = currentRentalCar;
				currentRentalCar = null;
				tempCurrentRentalCar.setCurrentDriver(null);
			}
			currentRentalCar = newCurrentRentalCar;
			if (currentRentalCar != null) {
				currentRentalCar.setCurrentDriver(this);
			}
		}
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "RentalCarDriver " + " [name: " + getName() + "]";
	}
}
