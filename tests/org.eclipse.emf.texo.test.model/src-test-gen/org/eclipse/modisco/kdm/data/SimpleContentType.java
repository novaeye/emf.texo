package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * A representation of the model object '<em><b>SimpleContentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "SimpleContentType")
public class SimpleContentType extends ComplexContentType {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = ComplexContentType.class)
  @JoinTable(name = "SimpleContentType_type")
  private Set<ComplexContentType> type = new HashSet<ComplexContentType>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String kind = null;

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public Set<ComplexContentType> getType() {
    return type;
  }

  /**
   * Adds to the <em>type</em> feature.
   * @generated
   */
  public void addToType(ComplexContentType typeValue) {
    if (!type.contains(typeValue)) {

      type.add(typeValue);
    }

  }

  /**			
   * Removes from the <em>type</em> feature.
   * @generated
   */
  public void removeFromType(ComplexContentType typeValue) {
    if (type.contains(typeValue)) {
      type.remove(typeValue);
    }
  }

  /**			
   * Clears the <em>type</em> feature.
   * @generated
   */
  public void clearType() {
    for (ComplexContentType typeElement : type) {
      removeFromType(typeElement);
    }
  }

  /**
   * Sets the '{@link SimpleContentType#getType() <em>type</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link SimpleContentType#getType() type}' feature.
   * @generated
   */
  public void setType(Set<ComplexContentType> newType) {
    type = newType;
  }

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link SimpleContentType#getKind() <em>kind</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link SimpleContentType#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "SimpleContentType " + " [kind: " + getKind() + "]";
  }
}
