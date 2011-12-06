package org.eclipse.emf.texo.test.model.samples.rental;

/** 
 * A representation of the model object '<em><b>RentalBicycle</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RentalBicycle extends RentalUnit {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private RentalBicycleType type = RentalBicycleType.STANDARD;

	/**
	 * Returns the value of '<em><b>type</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>type</b></em>' feature
	 * @generated
	 */
	public RentalBicycleType getType() {
		return type;
	}

	/**
	 * Sets the '{@link RentalBicycle#getType() <em>type</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalBicycle#getType() type}' feature.
	 * @generated
	 */
	public void setType(RentalBicycleType newType) {
		type = newType;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "RentalBicycle " + " [type: " + getType() + "]";
	}
}
