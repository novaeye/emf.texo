package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.Set;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableInterface;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Lendable</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "extlib_Lendable")
@DiscriminatorColumn(length = 255)
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
@Access(AccessType.PROPERTY)
public interface Lendable extends IdentifiableInterface {

  /**
   * Returns the value of '<em><b>copies</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>copies</b></em>' feature
   * @generated
   */
  public int getCopies();

  /**
   * Sets the '{@link Lendable#getCopies() <em>copies</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Lendable#getCopies() <em>copies</em>}' feature.
   * @generated
   */
  public void setCopies(int newCopies);

  /**
   * Returns the value of '<em><b>borrowers</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public Set<Borrower> getBorrowers();

  /**
   * Sets the '{@link Lendable#getBorrowers() <em>borrowers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Lendable#getBorrowers() <em>borrowers</em>}' feature.
   * @generated
   */
  public void setBorrowers(Set<Borrower> newBorrowers);

}
