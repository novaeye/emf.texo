package org.eclipse.emf.texo.test.model.samples.rental;

/** 
 * A representation of the model object '<em><b>RentalCar</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RentalCar extends RentalUnit {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RentalCarSize size = RentalCarSize.SMALL;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RentalCarDriver currentDriver = null;

	/**
	 * Returns the value of '<em><b>size</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>size</b></em>' feature
	 * @generated
	 */
	public RentalCarSize getSize() {
		return size;
	}

	/**
	 * Sets the '{@link RentalCar#getSize() <em>size</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalCar#getSize() size}' feature.
	 * @generated
	 */
	public void setSize(RentalCarSize newSize) {
		size = newSize;
	}

	/**
	 * Returns the value of '<em><b>currentDriver</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToCurrentDriver(org.eclipse.emf.texo.test.model.samples.rental.RentalCarDriver value)}
	 * and {@link #removeFromCurrentDriver(RentalCarDriver value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>currentDriver</b></em>' feature
	 * @generated
	 */
	public RentalCarDriver getCurrentDriver() {
		return currentDriver;
	}

	/**
	 * Sets the '{@link RentalCar#getCurrentDriver() <em>currentDriver</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalCar#getCurrentDriver() currentDriver}' feature.
	 * @generated
	 */
	public void setCurrentDriver(RentalCarDriver newCurrentDriver) {
		if (currentDriver != newCurrentDriver) {
			if (currentDriver != null) {
				RentalCarDriver tempCurrentDriver = currentDriver;
				currentDriver = null;
				tempCurrentDriver.setCurrentRentalCar(null);
			}
			currentDriver = newCurrentDriver;
			if (currentDriver != null) {
				currentDriver.setCurrentRentalCar(this);
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
		return "RentalCar " + " [size: " + getSize() + "]";
	}
}
