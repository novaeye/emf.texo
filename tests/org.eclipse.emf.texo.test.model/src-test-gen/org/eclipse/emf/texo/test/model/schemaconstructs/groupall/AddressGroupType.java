package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>AddressGroupType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "AddressGroupType")
public class AddressGroupType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String groupName = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = AddressType.class)
  @JoinColumns({ @JoinColumn() })
  private AddressType shipTo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = AddressType.class)
  @JoinColumns({ @JoinColumn() })
  private AddressType billTo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String simpleAddress = null;

  /**
   * Returns the value of '<em><b>groupName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupName</b></em>' feature
   * @generated
   */
  public String getGroupName() {
    return groupName;
  }

  /**
   * Sets the '{@link AddressGroupType#getGroupName() <em>groupName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressGroupType#getGroupName() groupName}' feature.
   * @generated
   */
  public void setGroupName(String newGroupName) {
    groupName = newGroupName;
  }

  /**
   * Returns the value of '<em><b>shipTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shipTo</b></em>' feature
   * @generated
   */
  public AddressType getShipTo() {
    return shipTo;
  }

  /**
   * Sets the '{@link AddressGroupType#getShipTo() <em>shipTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressGroupType#getShipTo() shipTo}' feature.
   * @generated
   */
  public void setShipTo(AddressType newShipTo) {
    shipTo = newShipTo;
  }

  /**
   * Returns the value of '<em><b>billTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>billTo</b></em>' feature
   * @generated
   */
  public AddressType getBillTo() {
    return billTo;
  }

  /**
   * Sets the '{@link AddressGroupType#getBillTo() <em>billTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressGroupType#getBillTo() billTo}' feature.
   * @generated
   */
  public void setBillTo(AddressType newBillTo) {
    billTo = newBillTo;
  }

  /**
   * Returns the value of '<em><b>simpleAddress</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>simpleAddress</b></em>' feature
   * @generated
   */
  public String getSimpleAddress() {
    return simpleAddress;
  }

  /**
   * Sets the '{@link AddressGroupType#getSimpleAddress() <em>simpleAddress</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link AddressGroupType#getSimpleAddress() simpleAddress}' feature.
   * @generated
   */
  public void setSimpleAddress(String newSimpleAddress) {
    simpleAddress = newSimpleAddress;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "AddressGroupType " + " [groupName: " + getGroupName() + "]" + " [simpleAddress: " + getSimpleAddress()
        + "]";
  }
}
