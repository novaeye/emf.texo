package org.eclipse.emf.texo.test.model.samples.extendedpo2;

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
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>PurchaseOrder</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "PurchaseOrder")
public class PurchaseOrder extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = Item.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Item> items = new ArrayList<Item>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false, targetEntity = Address.class)
  @JoinColumns({ @JoinColumn() })
  private Address billTo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = true, targetEntity = Address.class)
  @JoinColumns({ @JoinColumn() })
  private Address shipTo = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private String comment = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  @Temporal(TemporalType.DATE)
  private Date orderDate = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = true)
  private OrderStatus status = OrderStatus.PENDING;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = false, targetEntity = Customer.class)
  @JoinColumns({ @JoinColumn() })
  private Customer customer = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = PurchaseOrder.class)
  @JoinColumns({ @JoinColumn() })
  private PurchaseOrder previousOrder = null;

  /**
   * Returns the value of '<em><b>items</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>items</b></em>' feature
   * @generated
   */
  public List<Item> getItems() {
    return items;
  }

  /**
   * Adds to the <em>items</em> feature.
   * 
   * @generated
   */
  public void addToItems(Item itemsValue) {
    if (!items.contains(itemsValue)) {
      items.add(itemsValue);
    }
  }

  /**
   * Removes from the <em>items</em> feature.
   * 
   * @generated
   */
  public void removeFromItems(Item itemsValue) {
    if (items.contains(itemsValue)) {
      items.remove(itemsValue);
    }
  }

  /**
   * Clears the <em>items</em> feature.
   * 
   * @generated
   */
  public void clearItems() {
    while (!items.isEmpty()) {
      removeFromItems(items.iterator().next());
    }
  }

  /**
   * Sets the '{@link PurchaseOrder#getItems() <em>items</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getItems() items}' feature.
   * @generated
   */
  public void setItems(List<Item> newItems) {
    items = newItems;
  }

  /**
   * Returns the value of '<em><b>billTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>billTo</b></em>' feature
   * @generated
   */
  public Address getBillTo() {
    return billTo;
  }

  /**
   * Sets the '{@link PurchaseOrder#getBillTo() <em>billTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getBillTo() billTo}' feature.
   * @generated
   */
  public void setBillTo(Address newBillTo) {
    billTo = newBillTo;
  }

  /**
   * Returns the value of '<em><b>shipTo</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shipTo</b></em>' feature
   * @generated
   */
  public Address getShipTo() {
    return shipTo;
  }

  /**
   * Sets the '{@link PurchaseOrder#getShipTo() <em>shipTo</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getShipTo() shipTo}' feature.
   * @generated
   */
  public void setShipTo(Address newShipTo) {
    shipTo = newShipTo;
  }

  /**
   * Returns the value of '<em><b>comment</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getComment() comment}' feature.
   * @generated
   */
  public void setComment(String newComment) {
    comment = newComment;
  }

  /**
   * Returns the value of '<em><b>orderDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
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
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getOrderDate() orderDate}' feature.
   * @generated
   */
  public void setOrderDate(Date newOrderDate) {
    orderDate = newOrderDate;
  }

  /**
   * Returns the value of '<em><b>status</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>status</b></em>' feature
   * @generated
   */
  public OrderStatus getStatus() {
    return status;
  }

  /**
   * Sets the '{@link PurchaseOrder#getStatus() <em>status</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getStatus() status}' feature.
   * @generated
   */
  public void setStatus(OrderStatus newStatus) {
    status = newStatus;
  }

  /**
   * Returns the value of '<em><b>totalAmount</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>totalAmount</b></em>' feature
   * @generatedNOT
   */
  public int getTotalAmount() {
    return 0;
  }

  /**
   * Returns the value of '<em><b>customer</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>customer</b></em>' feature
   * @generated
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * Sets the '{@link PurchaseOrder#getCustomer() <em>customer</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getCustomer() customer}' feature.
   * @generated
   */
  public void setCustomer(Customer newCustomer) {
    customer = newCustomer;
  }

  /**
   * Returns the value of '<em><b>previousOrder</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>previousOrder</b></em>' feature
   * @generated
   */
  public PurchaseOrder getPreviousOrder() {
    return previousOrder;
  }

  /**
   * Sets the '{@link PurchaseOrder#getPreviousOrder() <em>previousOrder</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PurchaseOrder#getPreviousOrder() previousOrder}' feature.
   * @generated
   */
  public void setPreviousOrder(PurchaseOrder newPreviousOrder) {
    previousOrder = newPreviousOrder;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PurchaseOrder " + " [comment: " + getComment() + "]" + " [orderDate: " + getOrderDate() + "]"
        + " [status: " + getStatus() + "]" + " [totalAmount: " + getTotalAmount() + "]";
  }
}
