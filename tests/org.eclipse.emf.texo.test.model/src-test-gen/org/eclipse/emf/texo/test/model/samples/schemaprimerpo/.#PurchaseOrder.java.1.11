package org.eclipse.emf.texo.test.model.samples.schemaprimerpo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * A representation of the model object '<em><b>PurchaseOrder</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "PurchaseOrder")
public class PurchaseOrder {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = USAddress.class)
  @JoinColumns({ @JoinColumn() })
  private USAddress shipTo = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = USAddress.class)
  @JoinColumns({ @JoinColumn() })
  private USAddress billTo = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String comment = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Item.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Item> items = new ArrayList<Item>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Temporal(TemporalType.DATE)
  private Date orderDate = null;

  /**
   * Returns the value of '<em><b>shipTo</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>shipTo</b></em>' feature
   * @generated
   */
  public USAddress getShipTo() {
    return shipTo;
  }

  /**
   * Sets the '{@link PurchaseOrder#getShipTo() <em>shipTo</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link PurchaseOrder#getShipTo() shipTo}' feature.
   * @generated
   */
  public void setShipTo(USAddress newShipTo) {
    shipTo = newShipTo;
  }

  /**
   * Returns the value of '<em><b>billTo</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>billTo</b></em>' feature
   * @generated
   */
  public USAddress getBillTo() {
    return billTo;
  }

  /**
   * Sets the '{@link PurchaseOrder#getBillTo() <em>billTo</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link PurchaseOrder#getBillTo() billTo}' feature.
   * @generated
   */
  public void setBillTo(USAddress newBillTo) {
    billTo = newBillTo;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>comment</b></em>' feature
   * @generated
   */
  public String getComment() {
    return comment;
  }

  /**
   * Sets the '{@link PurchaseOrder#getComment() <em>comment</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link PurchaseOrder#getComment() comment}' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>items</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>items</b></em>' feature
   * @generated
   */
  public List<Item> getItems() {
    return items;
  }

  /**
   * Adds to the <em>items</em> feature.
   * @generated
   */
  public void addToItems(Item itemsValue) {
    if (!items.contains(itemsValue)) {

      items.add(itemsValue);
    }

  }

  /**			
   * Removes from the <em>items</em> feature.
   * @generated
   */
  public void removeFromItems(Item itemsValue) {
    if (items.contains(itemsValue)) {
      items.remove(itemsValue);
    }
  }

  /**			
   * Clears the <em>items</em> feature.
   * @generated
   */
  public void clearItems() {
    for (Item itemsElement : items) {
      removeFromItems(itemsElement);
    }
  }

  /**
   * Sets the '{@link PurchaseOrder#getItems() <em>items</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link PurchaseOrder#getItems() items}' feature.
   * @generated
   */
  public void setItems(List<Item> newItems) {
    items = newItems;
  }

  /**
   * Returns the value of '<em><b>orderDate</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>orderDate</b></em>' feature
   * @generated
   */
  public Date getOrderDate() {
    return orderDate;
  }

  /**
   * Sets the '{@link PurchaseOrder#getOrderDate() <em>orderDate</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link PurchaseOrder#getOrderDate() orderDate}' feature.
   * @generated
   */
  public void setOrderDate(Date newOrderDate) {
    orderDate = newOrderDate;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "PurchaseOrder " + " [comment: " + getComment() + "]" + " [orderDate: " + getOrderDate() + "]";
  }
}
