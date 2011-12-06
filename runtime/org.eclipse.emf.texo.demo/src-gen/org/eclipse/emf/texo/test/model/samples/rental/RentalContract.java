package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * A representation of the model object '<em><b>RentalContract</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RentalContract {

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private String rentToBusinessPartner = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Date startDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private Date endDate = null;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private float cost = 0.0f;

	/** 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated 
	 */
	private List<RentalUnit> rentalUnits = new ArrayList<RentalUnit>();

	/**
	 * Returns the value of '<em><b>rentToBusinessPartner</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rentToBusinessPartner</b></em>' feature
	 * @generated
	 */
	public String getRentToBusinessPartner() {
		return rentToBusinessPartner;
	}

	/**
	 * Sets the '{@link RentalContract#getRentToBusinessPartner() <em>rentToBusinessPartner</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContract#getRentToBusinessPartner() rentToBusinessPartner}' feature.
	 * @generated
	 */
	public void setRentToBusinessPartner(String newRentToBusinessPartner) {
		rentToBusinessPartner = newRentToBusinessPartner;
	}

	/**
	 * Returns the value of '<em><b>startDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>startDate</b></em>' feature
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the '{@link RentalContract#getStartDate() <em>startDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContract#getStartDate() startDate}' feature.
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		startDate = newStartDate;
	}

	/**
	 * Returns the value of '<em><b>endDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>endDate</b></em>' feature
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * Sets the '{@link RentalContract#getEndDate() <em>endDate</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContract#getEndDate() endDate}' feature.
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		endDate = newEndDate;
	}

	/**
	 * Returns the value of '<em><b>cost</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>cost</b></em>' feature
	 * @generated
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * Sets the '{@link RentalContract#getCost() <em>cost</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContract#getCost() cost}' feature.
	 * @generated
	 */
	public void setCost(float newCost) {
		cost = newCost;
	}

	/**
	 * Returns the value of '<em><b>rentalUnits</b></em>' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rentalUnits</b></em>' feature
	 * @generated
	 */
	public List<RentalUnit> getRentalUnits() {
		return rentalUnits;
	}

	/**
	 * Adds to the <em>rentalUnits</em> feature.
	 * @generated
	 */
	public void addToRentalUnits(RentalUnit rentalUnitsValue) {
		if (!rentalUnits.contains(rentalUnitsValue)) {

			rentalUnits.add(rentalUnitsValue);
		}

	}

	/**			
	 * Removes from the <em>rentalUnits</em> feature.
	 * @generated
	 */
	public void removeFromRentalUnits(RentalUnit rentalUnitsValue) {
		if (rentalUnits.contains(rentalUnitsValue)) {
			rentalUnits.remove(rentalUnitsValue);
		}
	}

	/**			
	 * Clears the <em>rentalUnits</em> feature.
	 * @generated
	 */
	public void clearRentalUnits() {
		while (!rentalUnits.isEmpty()) {
			removeFromRentalUnits(rentalUnits.iterator().next());
		}
	}

	/**
	 * Sets the '{@link RentalContract#getRentalUnits() <em>rentalUnits</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContract#getRentalUnits() rentalUnits}' feature.
	 * @generated
	 */
	public void setRentalUnits(List<RentalUnit> newRentalUnits) {
		rentalUnits = newRentalUnits;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return "RentalContract " + " [rentToBusinessPartner: "
				+ getRentToBusinessPartner() + "]" + " [startDate: "
				+ getStartDate() + "]" + " [endDate: " + getEndDate() + "]"
				+ " [cost: " + getCost() + "]";
	}
}
