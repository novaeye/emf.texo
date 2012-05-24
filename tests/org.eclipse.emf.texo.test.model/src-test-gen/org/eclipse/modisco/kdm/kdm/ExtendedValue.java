package org.eclipse.modisco.kdm.kdm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.modisco.kdm.core.Element;

/**
 * A representation of the model object '<em><b>ExtendedValue</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "ExtendedValue")
public abstract class ExtendedValue extends Element {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false)
  private TagDefinition tag = null;

  /**
   * Returns the value of '<em><b>tag</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>tag</b></em>' feature
   * @generated
   */
  public TagDefinition getTag() {
    return tag;
  }

  /**
   * Sets the '{@link ExtendedValue#getTag() <em>tag</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ExtendedValue#getTag() tag}' feature.
   * @generated
   */
  public void setTag(TagDefinition newTag) {
    tag = newTag;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ExtendedValue ";
  }
}
