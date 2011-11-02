package org.eclipse.modisco.kdm.kdm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.modisco.kdm.core.ModelElement;

/** 
 * A representation of the model object '<em><b>TaggedRef</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "TaggedRef")
public class TaggedRef extends ExtendedValue {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = ModelElement.class)
  @JoinColumns({ @JoinColumn() })
  private ModelElement ref = null;

  /**
   * Returns the value of '<em><b>ref</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>ref</b></em>' feature
   * @generated
   */
  public ModelElement getRef() {
    return ref;
  }

  /**
   * Sets the '{@link TaggedRef#getRef() <em>ref</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link TaggedRef#getRef() ref}' feature.
   * @generated
   */
  public void setRef(ModelElement newRef) {
    ref = newRef;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "TaggedRef ";
  }
}
