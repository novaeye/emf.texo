package org.eclipse.modisco.kdm.code;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/** 
 * A representation of the model object '<em><b>DataElement</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "DataElement")
public class DataElement extends ComputationalObject {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = Datatype.class)
  @JoinColumns({ @JoinColumn() })
  private Datatype type = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String ext = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private Integer size = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Datatype.class)
  @JoinColumns({ @JoinColumn() })
  private Set<Datatype> codeElement = new HashSet<Datatype>();

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public Datatype getType() {
    return type;
  }

  /**
   * Sets the '{@link DataElement#getType() <em>type</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataElement#getType() type}' feature.
   * @generated
   */
  public void setType(Datatype newType) {
    type = newType;
  }

  /**
   * Returns the value of '<em><b>ext</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>ext</b></em>' feature
   * @generated
   */
  public String getExt() {
    return ext;
  }

  /**
   * Sets the '{@link DataElement#getExt() <em>ext</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataElement#getExt() ext}' feature.
   * @generated
   */
  public void setExt(String newExt) {
    ext = newExt;
  }

  /**
   * Returns the value of '<em><b>size</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>size</b></em>' feature
   * @generated
   */
  public Integer getSize() {
    return size;
  }

  /**
   * Sets the '{@link DataElement#getSize() <em>size</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataElement#getSize() size}' feature.
   * @generated
   */
  public void setSize(Integer newSize) {
    size = newSize;
  }

  /**
   * Returns the value of '<em><b>codeElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>codeElement</b></em>' feature
   * @generated
   */
  public Set<Datatype> getCodeElement() {
    return codeElement;
  }

  /**
   * Adds to the <em>codeElement</em> feature.
   * @generated
   */
  public void addToCodeElement(Datatype codeElementValue) {
    if (!codeElement.contains(codeElementValue)) {

      codeElement.add(codeElementValue);
    }

  }

  /**			
   * Removes from the <em>codeElement</em> feature.
   * @generated
   */
  public void removeFromCodeElement(Datatype codeElementValue) {
    if (codeElement.contains(codeElementValue)) {
      codeElement.remove(codeElementValue);
    }
  }

  /**			
   * Clears the <em>codeElement</em> feature.
   * @generated
   */
  public void clearCodeElement() {
    while (!codeElement.isEmpty()) {
      removeFromCodeElement(codeElement.get(0));
    }
  }

  /**
   * Sets the '{@link DataElement#getCodeElement() <em>codeElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DataElement#getCodeElement() codeElement}' feature.
   * @generated
   */
  public void setCodeElement(Set<Datatype> newCodeElement) {
    codeElement = newCodeElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "DataElement " + " [ext: " + getExt() + "]" + " [size: " + getSize() + "]";
  }
}
