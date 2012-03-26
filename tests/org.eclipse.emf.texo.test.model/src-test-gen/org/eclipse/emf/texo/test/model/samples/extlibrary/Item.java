package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Item</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Item")
public abstract class Item extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Temporal(TemporalType.DATE)
  private Date publicationDate = null;

  /**
   * Returns the value of '<em><b>publicationDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>publicationDate</b></em>' feature
   * @generated
   */
  public Date getPublicationDate() {
    return publicationDate;
  }

  /**
   * Sets the '{@link Item#getPublicationDate() <em>publicationDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Item#getPublicationDate() publicationDate}' feature.
   * @generated
   */
  public void setPublicationDate(Date newPublicationDate) {
    publicationDate = newPublicationDate;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Item " + " [publicationDate: " + getPublicationDate() + "]";
  }
}
