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
