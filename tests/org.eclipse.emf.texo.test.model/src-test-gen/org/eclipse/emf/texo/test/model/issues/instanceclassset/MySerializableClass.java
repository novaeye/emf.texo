package org.eclipse.emf.texo.test.model.issues.instanceclassset;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.model.instanceclassset.NonEMF;

/**
 * A representation of the model object '<em><b>MySerializableClass</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "MySerializableClass")
public class MySerializableClass implements Serializable {

  /**
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String somethingInteresting = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = NonEMF.class)
  @JoinColumns({ @JoinColumn() })
  private NonEMF nonEMF = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = NonEMF.class)
  @OrderColumn()
  @JoinTable(name = "MySerializableClass_nonEMFs")
  private List<NonEMF> nonEMFs = new ArrayList<NonEMF>();

  /**
   * Returns the value of '<em><b>somethingInteresting</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>somethingInteresting</b></em>' feature
   * @generated
   */
  public String getSomethingInteresting() {
    return somethingInteresting;
  }

  /**
   * Sets the '{@link MySerializableClass#getSomethingInteresting() <em>somethingInteresting</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link MySerializableClass#getSomethingInteresting() somethingInteresting}' feature.
   * @generated
   */
  public void setSomethingInteresting(String newSomethingInteresting) {
    somethingInteresting = newSomethingInteresting;
  }

  /**
   * Returns the value of '<em><b>nonEMF</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>nonEMF</b></em>' feature
   * @generated
   */
  public NonEMF getNonEMF() {
    return nonEMF;
  }

  /**
   * Sets the '{@link MySerializableClass#getNonEMF() <em>nonEMF</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link MySerializableClass#getNonEMF() nonEMF}' feature.
   * @generated
   */
  public void setNonEMF(NonEMF newNonEMF) {
    nonEMF = newNonEMF;
  }

  /**
   * Returns the value of '<em><b>nonEMFs</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>nonEMFs</b></em>' feature
   * @generated
   */
  public List<NonEMF> getNonEMFs() {
    return nonEMFs;
  }

  /**
   * Adds to the <em>nonEMFs</em> feature.
   * @generated
   */
  public void addToNonEMFs(NonEMF nonEMFsValue) {
    if (!nonEMFs.contains(nonEMFsValue)) {

      nonEMFs.add(nonEMFsValue);
    }

  }

  /**			
   * Removes from the <em>nonEMFs</em> feature.
   * @generated
   */
  public void removeFromNonEMFs(NonEMF nonEMFsValue) {
    if (nonEMFs.contains(nonEMFsValue)) {
      nonEMFs.remove(nonEMFsValue);
    }
  }

  /**			
   * Clears the <em>nonEMFs</em> feature.
   * @generated
   */
  public void clearNonEMFs() {
    while (!nonEMFs.isEmpty()) {
      removeFromNonEMFs(nonEMFs.get(0));
    }
  }

  /**
   * Sets the '{@link MySerializableClass#getNonEMFs() <em>nonEMFs</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link MySerializableClass#getNonEMFs() nonEMFs}' feature.
   * @generated
   */
  public void setNonEMFs(List<NonEMF> newNonEMFs) {
    nonEMFs = newNonEMFs;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "MySerializableClass " + " [somethingInteresting: " + getSomethingInteresting() + "]";
  }
}
