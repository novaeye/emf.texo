package org.eclipse.emf.texo.test.model.schemaconstructs.anytype;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.ecore.EObject;

/**
 * A representation of the model object '<em><b>TestAny</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "TestAny")
public class TestAny {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String name = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = EObject.class)
  @JoinColumns({ @JoinColumn() })
  private Object singleAnyType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = EObject.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Object> multiAnyType = new ArrayList<Object>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String a = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<TestAnyMyAnyFeatureGroup> myAny = new ArrayList<TestAnyMyAnyFeatureGroup>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<TestAnyAnyFeatureGroup> any = new ArrayList<TestAnyAnyFeatureGroup>();

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link TestAny#getName() <em>name</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link TestAny#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>singleAnyType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>singleAnyType</b></em>' feature
   * @generated
   */
  public Object getSingleAnyType() {
    return singleAnyType;
  }

  /**
   * Sets the '{@link TestAny#getSingleAnyType() <em>singleAnyType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link TestAny#getSingleAnyType() singleAnyType}' feature.
   * @generated
   */
  public void setSingleAnyType(Object newSingleAnyType) {
    singleAnyType = newSingleAnyType;
  }

  /**
   * Returns the value of '<em><b>multiAnyType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>multiAnyType</b></em>' feature
   * @generated
   */
  public List<Object> getMultiAnyType() {
    return multiAnyType;
  }

  /**
   * Adds to the <em>multiAnyType</em> feature.
   * 
   * @generated
   */
  public void addToMultiAnyType(Object multiAnyTypeValue) {
    if (!multiAnyType.contains(multiAnyTypeValue)) {
      multiAnyType.add(multiAnyTypeValue);
    }
  }

  /**
   * Removes from the <em>multiAnyType</em> feature.
   * 
   * @generated
   */
  public void removeFromMultiAnyType(Object multiAnyTypeValue) {
    if (multiAnyType.contains(multiAnyTypeValue)) {
      multiAnyType.remove(multiAnyTypeValue);
    }
  }

  /**
   * Clears the <em>multiAnyType</em> feature.
   * 
   * @generated
   */
  public void clearMultiAnyType() {
    while (!multiAnyType.isEmpty()) {
      removeFromMultiAnyType(multiAnyType.iterator().next());
    }
  }

  /**
   * Sets the '{@link TestAny#getMultiAnyType() <em>multiAnyType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link TestAny#getMultiAnyType() multiAnyType}' feature.
   * @generated
   */
  public void setMultiAnyType(List<Object> newMultiAnyType) {
    multiAnyType = newMultiAnyType;
  }

  /**
   * Returns the value of '<em><b>a</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>a</b></em>' feature
   * @generated
   */
  public String getA() {
    return a;
  }

  /**
   * Sets the '{@link TestAny#getA() <em>a</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link TestAny#getA() a}' feature.
   * @generated
   */
  public void setA(String newA) {
    a = newA;
  }

  /**
   * Returns the value of '<em><b>myAny</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>myAny</b></em>' feature
   * @generated
   */
  public List<TestAnyMyAnyFeatureGroup> getMyAny() {
    return myAny;
  }

  /**
   * Sets the '{@link TestAny#getMyAny() <em>myAny</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link TestAny#getMyAny() myAny}' feature.
   * @generated
   */
  public void setMyAny(List<TestAnyMyAnyFeatureGroup> newMyAny) {
    myAny = newMyAny;
  }

  /**
   * Returns the value of '<em><b>any</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>any</b></em>' feature
   * @generated
   */
  public List<TestAnyAnyFeatureGroup> getAny() {
    return any;
  }

  /**
   * Sets the '{@link TestAny#getAny() <em>any</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link TestAny#getAny() any}' feature.
   * @generated
   */
  public void setAny(List<TestAnyAnyFeatureGroup> newAny) {
    any = newAny;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "TestAny " + " [name: " + getName() + "]" + " [a: " + getA() + "]";
  }
}
