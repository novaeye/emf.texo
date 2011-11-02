package org.eclipse.emf.texo.test.model.schemaconstructs.substitution;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/** 
 * A representation of the model object '<em><b>DocumentRoot</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
public class DocumentRoot {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private List<DocumentRootMixedFeatureGroup> mixed = new ArrayList<DocumentRootMixedFeatureGroup>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ElementCollection()
  @CollectionTable(name = "DocumentRoot_xMLNSPrefixMap")
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ElementCollection()
  @CollectionTable(name = "DocumentRoot_xSISchemaLocation")
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private EvenType even = EvenType._2;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private BigInteger mySimpleAbstract = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = EvenComplexNumberType.class)
  @JoinColumns({ @JoinColumn() })
  private EvenComplexNumberType evenComplexNumber = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = ComplexNumber.class)
  @JoinColumns({ @JoinColumn() })
  private ComplexNumber myComplexAbstract = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = MultiNumberType.class)
  @JoinColumns({ @JoinColumn() })
  private MultiNumberType multiNumber = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = NumberType.class)
  @JoinColumns({ @JoinColumn() })
  private NumberType number = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private OddType odd = OddType._1;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = OddComplexNumberType.class)
  @JoinColumns({ @JoinColumn() })
  private OddComplexNumberType oddComplexNumber = null;

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<DocumentRootMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link DocumentRoot#getMixed() <em>mixed</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<DocumentRootMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>xMLNSPrefixMap</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>xMLNSPrefixMap</b></em>' feature
   * @generated
   */
  public Map<String, String> getXMLNSPrefixMap() {
    return xMLNSPrefixMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getXMLNSPrefixMap() <em>xMLNSPrefixMap</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getXMLNSPrefixMap() xMLNSPrefixMap}' feature.
   * @generated
   */
  public void setXMLNSPrefixMap(Map<String, String> newXMLNSPrefixMap) {
    xMLNSPrefixMap = newXMLNSPrefixMap;
  }

  /**
   * Returns the value of '<em><b>xSISchemaLocation</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>xSISchemaLocation</b></em>' feature
   * @generated
   */
  public Map<String, String> getXSISchemaLocation() {
    return xSISchemaLocation;
  }

  /**
   * Sets the '{@link DocumentRoot#getXSISchemaLocation() <em>xSISchemaLocation</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getXSISchemaLocation() xSISchemaLocation}' feature.
   * @generated
   */
  public void setXSISchemaLocation(Map<String, String> newXSISchemaLocation) {
    xSISchemaLocation = newXSISchemaLocation;
  }

  /**
   * Returns the value of '<em><b>even</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>even</b></em>' feature
   * @generated
   */
  public EvenType getEven() {
    return even;
  }

  /**
   * Sets the '{@link DocumentRoot#getEven() <em>even</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getEven() even}' feature.
   * @generated
   */
  public void setEven(EvenType newEven) {
    even = newEven;
  }

  /**
   * Returns the value of '<em><b>mySimpleAbstract</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>mySimpleAbstract</b></em>' feature
   * @generated
   */
  public BigInteger getMySimpleAbstract() {
    return mySimpleAbstract;
  }

  /**
   * Returns the value of '<em><b>evenComplexNumber</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>evenComplexNumber</b></em>' feature
   * @generated
   */
  public EvenComplexNumberType getEvenComplexNumber() {
    return evenComplexNumber;
  }

  /**
   * Sets the '{@link DocumentRoot#getEvenComplexNumber() <em>evenComplexNumber</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getEvenComplexNumber() evenComplexNumber}' feature.
   * @generated
   */
  public void setEvenComplexNumber(EvenComplexNumberType newEvenComplexNumber) {
    evenComplexNumber = newEvenComplexNumber;
  }

  /**
   * Returns the value of '<em><b>myComplexAbstract</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>myComplexAbstract</b></em>' feature
   * @generated
   */
  public ComplexNumber getMyComplexAbstract() {
    return myComplexAbstract;
  }

  /**
   * Returns the value of '<em><b>multiNumber</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>multiNumber</b></em>' feature
   * @generated
   */
  public MultiNumberType getMultiNumber() {
    return multiNumber;
  }

  /**
   * Sets the '{@link DocumentRoot#getMultiNumber() <em>multiNumber</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getMultiNumber() multiNumber}' feature.
   * @generated
   */
  public void setMultiNumber(MultiNumberType newMultiNumber) {
    multiNumber = newMultiNumber;
  }

  /**
   * Returns the value of '<em><b>number</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>number</b></em>' feature
   * @generated
   */
  public NumberType getNumber() {
    return number;
  }

  /**
   * Sets the '{@link DocumentRoot#getNumber() <em>number</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getNumber() number}' feature.
   * @generated
   */
  public void setNumber(NumberType newNumber) {
    number = newNumber;
  }

  /**
   * Returns the value of '<em><b>odd</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>odd</b></em>' feature
   * @generated
   */
  public OddType getOdd() {
    return odd;
  }

  /**
   * Sets the '{@link DocumentRoot#getOdd() <em>odd</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getOdd() odd}' feature.
   * @generated
   */
  public void setOdd(OddType newOdd) {
    odd = newOdd;
  }

  /**
   * Returns the value of '<em><b>oddComplexNumber</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>oddComplexNumber</b></em>' feature
   * @generated
   */
  public OddComplexNumberType getOddComplexNumber() {
    return oddComplexNumber;
  }

  /**
   * Sets the '{@link DocumentRoot#getOddComplexNumber() <em>oddComplexNumber</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getOddComplexNumber() oddComplexNumber}' feature.
   * @generated
   */
  public void setOddComplexNumber(OddComplexNumberType newOddComplexNumber) {
    oddComplexNumber = newOddComplexNumber;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot " + " [even: " + getEven() + "]" + " [mySimpleAbstract: " + getMySimpleAbstract() + "]"
        + " [odd: " + getOdd() + "]";
  }
}
