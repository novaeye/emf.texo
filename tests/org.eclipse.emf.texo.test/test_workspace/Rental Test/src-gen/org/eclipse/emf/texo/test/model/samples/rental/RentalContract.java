package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.texo.demo.BaseObject;

/** 
 * A representation of the model object '<em><b>RentalContract</b></em>'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated 
 */
public class RentalContract extends BaseObject {

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
	private Set<RentalContractLine> rentalContractLines = new HashSet<RentalContractLine>();

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
	 * Returns the value of '<em><b>rentalContractLines</b></em>' feature.
	 * Note: the returned collection is Unmodifiable use the {#addToRentalContractLines(org.eclipse.emf.texo.test.model.samples.rental.RentalContractLine value)}
	 * and {@link #removeFromRentalContractLines(RentalContractLine value)} methods 
	 * to modify this feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of '<em><b>rentalContractLines</b></em>' feature
	 * @generated
	 */
	public Set<RentalContractLine> getRentalContractLines() {
		return Collections.unmodifiableSet(rentalContractLines);
	}

	/**
	 * Adds to the <em>rentalContractLines</em> feature.
	 * @generated
	 */
	public void addToRentalContractLines(RentalContractLine value) {
		if (!rentalContractLines.contains(value)) {
			rentalContractLines.add(value);
		}
	}

	/**			
	 * Removes from the <em>rentalContractLines</em> feature.
	 * @generated
	 */
	public void removeFromRentalContractLines(RentalContractLine value) {
		if (rentalContractLines.contains(value)) {
			rentalContractLines.remove(value);
		}
	}

	/**			
	 * Clears the <em>rentalContractLines</em> feature.
	 * @generated
	 */
	public void clearRentalContractLines() {
		for (RentalContractLine value : rentalContractLines) {
			removeFromRentalContractLines(value);
		}
	}

	/**
	 * Sets the '{@link RentalContract#getRentalContractLines() <em>rentalContractLines</em>}' feature.
	 *
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param the new value of the '{@link RentalContract#getRentalContractLines() rentalContractLines}' feature.
	 * @generated
	 */
	public void setRentalContractLines(
			Set<RentalContractLine> newRentalContractLines) {
		clearRentalContractLines();
		for (RentalContractLine value : newRentalContractLines) {
			addToRentalContractLines(value);
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
		return "RentalContract " + " [rentToBusinessPartner: "
				+ getRentToBusinessPartner() + "]" + " [startDate: "
				+ getStartDate() + "]" + " [endDate: " + getEndDate() + "]"
				+ " [cost: " + getCost() + "]";
	}
}
