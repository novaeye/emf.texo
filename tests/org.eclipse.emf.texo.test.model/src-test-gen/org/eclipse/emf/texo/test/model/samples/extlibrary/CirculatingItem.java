package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>CirculatingItem</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "CirculatingItem")
public abstract class CirculatingItem extends Item implements Lendable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private int copies = 0;
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private Set<Borrower> borrowers = new HashSet<Borrower>();

  /**
   * Returns the value of '<em><b>copies</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>copies</b></em>' feature
   * @generated
   */
  public int getCopies() {
    return copies;
  }

  /**
   * Sets the '{@link CirculatingItem#getCopies() <em>copies</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CirculatingItem#getCopies() copies}' feature.
   * @generated
   */
  public void setCopies(int newCopies) {
    copies = newCopies;
  }

  /**
   * Returns the value of '<em><b>borrowers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public Set<Borrower> getBorrowers() {
    return borrowers;
  }

  /**
   * Adds to the <em>borrowers</em> feature.
   * 
   * @generated
   */
  public void addToBorrowers(Borrower borrowersValue) {
    if (!borrowers.contains(borrowersValue)) {
      borrowers.add(borrowersValue);
    }
  }

  /**
   * Removes from the <em>borrowers</em> feature.
   * 
   * @generated
   */
  public void removeFromBorrowers(Borrower borrowersValue) {
    if (borrowers.contains(borrowersValue)) {
      borrowers.remove(borrowersValue);
    }
  }

  /**
   * Clears the <em>borrowers</em> feature.
   * 
   * @generated
   */
  public void clearBorrowers() {
    while (!borrowers.isEmpty()) {
      removeFromBorrowers(borrowers.iterator().next());
    }
  }

  /**
   * Sets the '{@link CirculatingItem#getBorrowers() <em>borrowers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CirculatingItem#getBorrowers() borrowers}' feature.
   * @generated
   */
  public void setBorrowers(Set<Borrower> newBorrowers) {
    borrowers = newBorrowers;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CirculatingItem " + " [copies: " + getCopies() + "]";
  }
}
