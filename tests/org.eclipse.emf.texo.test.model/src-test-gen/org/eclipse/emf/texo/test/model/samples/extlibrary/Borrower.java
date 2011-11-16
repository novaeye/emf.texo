package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>Borrower</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Borrower")
public class Borrower extends Person {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Lendable.class)
  @OrderColumn()
  @JoinTable(name = "Borrower_borrowed")
  private List<Lendable> borrowed = new ArrayList<Lendable>();

  /**
   * Returns the value of '<em><b>borrowed</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>borrowed</b></em>' feature
   * @generated
   */
  public List<Lendable> getBorrowed() {
    return borrowed;
  }

  /**
   * Adds to the <em>borrowed</em> feature.
   * @generated
   */
  public void addToBorrowed(Lendable borrowedValue) {
    if (!borrowed.contains(borrowedValue)) {

      borrowed.add(borrowedValue);
    }

  }

  /**			
   * Removes from the <em>borrowed</em> feature.
   * @generated
   */
  public void removeFromBorrowed(Lendable borrowedValue) {
    if (borrowed.contains(borrowedValue)) {
      borrowed.remove(borrowedValue);
    }
  }

  /**			
   * Clears the <em>borrowed</em> feature.
   * @generated
   */
  public void clearBorrowed() {
    while (!borrowed.isEmpty()) {
      removeFromBorrowed(borrowed.get(0));
    }
  }

  /**
   * Sets the '{@link Borrower#getBorrowed() <em>borrowed</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Borrower#getBorrowed() borrowed}' feature.
   * @generated
   */
  public void setBorrowed(List<Lendable> newBorrowed) {
    borrowed = newBorrowed;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Borrower ";
  }
}
