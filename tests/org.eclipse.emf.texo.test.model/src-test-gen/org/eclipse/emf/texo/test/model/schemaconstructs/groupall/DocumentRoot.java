package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
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
  private Map<String, String> xMLNSPrefixMap = new LinkedHashMap<String, String>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private Map<String, String> xSISchemaLocation = new LinkedHashMap<String, String>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = AddressType.class)
  @JoinColumns({ @JoinColumn() })
  private AddressType address = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = AddressGroupType.class)
  @JoinColumns({ @JoinColumn() })
  private AddressGroupType addressGroup = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = SimpleAllType.class)
  @JoinColumns({ @JoinColumn() })
  private SimpleAllType simpleAll = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = SimpleAllMapType.class)
  @JoinColumns({ @JoinColumn() })
  private SimpleAllMapType simpleAllMap = null;

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
   * Returns the value of '<em><b>address</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>address</b></em>' feature
   * @generated
   */
  public AddressType getAddress() {
    return address;
  }

  /**
   * Sets the '{@link DocumentRoot#getAddress() <em>address</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getAddress() address}' feature.
   * @generated
   */
  public void setAddress(AddressType newAddress) {
    address = newAddress;
  }

  /**
   * Returns the value of '<em><b>addressGroup</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>addressGroup</b></em>' feature
   * @generated
   */
  public AddressGroupType getAddressGroup() {
    return addressGroup;
  }

  /**
   * Sets the '{@link DocumentRoot#getAddressGroup() <em>addressGroup</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getAddressGroup() addressGroup}' feature.
   * @generated
   */
  public void setAddressGroup(AddressGroupType newAddressGroup) {
    addressGroup = newAddressGroup;
  }

  /**
   * Returns the value of '<em><b>simpleAll</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>simpleAll</b></em>' feature
   * @generated
   */
  public SimpleAllType getSimpleAll() {
    return simpleAll;
  }

  /**
   * Sets the '{@link DocumentRoot#getSimpleAll() <em>simpleAll</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getSimpleAll() simpleAll}' feature.
   * @generated
   */
  public void setSimpleAll(SimpleAllType newSimpleAll) {
    simpleAll = newSimpleAll;
  }

  /**
   * Returns the value of '<em><b>simpleAllMap</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>simpleAllMap</b></em>' feature
   * @generated
   */
  public SimpleAllMapType getSimpleAllMap() {
    return simpleAllMap;
  }

  /**
   * Sets the '{@link DocumentRoot#getSimpleAllMap() <em>simpleAllMap</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link DocumentRoot#getSimpleAllMap() simpleAllMap}' feature.
   * @generated
   */
  public void setSimpleAllMap(SimpleAllMapType newSimpleAllMap) {
    simpleAllMap = newSimpleAllMap;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "DocumentRoot ";
  }
}
