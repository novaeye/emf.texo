package org.eclipse.emf.texo.test.model.samples.rental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/** 
 * A representation of the model object '<em><b>RentalContract</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "RentalContract")
public class RentalContract extends Identifiable {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private String rentToBusinessPartner = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Temporal(TemporalType.DATE)
  private Date startDate = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Temporal(TemporalType.DATE)
  private Date endDate = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = false)
  private float cost = 0.0f;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = RentalContractLine.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<RentalContractLine> rentalContractLines = new ArrayList<RentalContractLine>();

  /**
   * Returns the value of '<em><b>rentToBusinessPartner</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>rentToBusinessPartner</b></em>' feature
   * @generated
   */
  public String getRentToBusinessPartner() {
    return rentToBusinessPartner;
  }

  /**
   * Sets the '{@link RentalContract#getRentToBusinessPartner() <em>rentToBusinessPartner</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalContract#getRentToBusinessPartner() rentToBusinessPartner}' feature.
   * @generated
   */
  public void setRentToBusinessPartner(String newRentToBusinessPartner) {
    rentToBusinessPartner = newRentToBusinessPartner;
  }

  /**
   * Returns the value of '<em><b>startDate</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>startDate</b></em>' feature
   * @generated
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * Sets the '{@link RentalContract#getStartDate() <em>startDate</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalContract#getStartDate() startDate}' feature.
   * @generated
   */
  public void setStartDate(Date newStartDate) {
    startDate = newStartDate;
  }

  /**
   * Returns the value of '<em><b>endDate</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>endDate</b></em>' feature
   * @generated
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Sets the '{@link RentalContract#getEndDate() <em>endDate</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalContract#getEndDate() endDate}' feature.
   * @generated
   */
  public void setEndDate(Date newEndDate) {
    endDate = newEndDate;
  }

  /**
   * Returns the value of '<em><b>cost</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>cost</b></em>' feature
   * @generated
   */
  public float getCost() {
    return cost;
  }

  /**
   * Sets the '{@link RentalContract#getCost() <em>cost</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalContract#getCost() cost}' feature.
   * @generated
   */
  public void setCost(float newCost) {
    cost = newCost;
  }

  /**
   * Returns the value of '<em><b>rentalContractLines</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>rentalContractLines</b></em>' feature
   * @generated
   */
  public List<RentalContractLine> getRentalContractLines() {
    return rentalContractLines;
  }

  /**
   * Adds to the <em>rentalContractLines</em> feature.
   * @generated
   */
  public void addToRentalContractLines(RentalContractLine rentalContractLinesValue) {
    if (!rentalContractLines.contains(rentalContractLinesValue)) {

      rentalContractLines.add(rentalContractLinesValue);
    }

  }

  /**			
   * Removes from the <em>rentalContractLines</em> feature.
   * @generated
   */
  public void removeFromRentalContractLines(RentalContractLine rentalContractLinesValue) {
    if (rentalContractLines.contains(rentalContractLinesValue)) {
      rentalContractLines.remove(rentalContractLinesValue);
    }
  }

  /**			
   * Clears the <em>rentalContractLines</em> feature.
   * @generated
   */
  public void clearRentalContractLines() {
    while (!rentalContractLines.isEmpty()) {
      removeFromRentalContractLines(rentalContractLines.get(0));
    }
  }

  /**
   * Sets the '{@link RentalContract#getRentalContractLines() <em>rentalContractLines</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link RentalContract#getRentalContractLines() rentalContractLines}' feature.
   * @generated
   */
  public void setRentalContractLines(List<RentalContractLine> newRentalContractLines) {
    rentalContractLines = newRentalContractLines;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "RentalContract " + " [rentToBusinessPartner: " + getRentToBusinessPartner() + "]" + " [startDate: "
        + getStartDate() + "]" + " [endDate: " + getEndDate() + "]" + " [cost: " + getCost() + "]";
  }
}
