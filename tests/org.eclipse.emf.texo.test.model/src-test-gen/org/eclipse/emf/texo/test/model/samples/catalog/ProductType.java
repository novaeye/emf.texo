package org.eclipse.emf.texo.test.model.samples.catalog;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>ProductType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> My producttype documentation <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "ProductType")
public class ProductType extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String code = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My description documentation <!--
   * end-model-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String description = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private List<StringType> remark = new ArrayList<StringType>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.ALL }, optional = false)
  private PriceType price = null;

  /**
   * Returns the value of '<em><b>code</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>code</b></em>' feature
   * @generated
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets the '{@link ProductType#getCode() <em>code</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ProductType#getCode() code}' feature.
   * @generated
   */
  public void setCode(String newCode) {
    code = newCode;
  }

  /**
   * Returns the value of '<em><b>description</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My description documentation <!--
   * end-model-doc -->
   * 
   * @return the value of '<em><b>description</b></em>' feature
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the '{@link ProductType#getDescription() <em>description</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> My description documentation <!--
   * end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link ProductType#getDescription() description}' feature.
   * @generated
   */
  public void setDescription(String newDescription) {
    description = newDescription;
  }

  /**
   * Returns the value of '<em><b>remark</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>remark</b></em>' feature
   * @generated
   */
  public List<StringType> getRemark() {
    return remark;
  }

  /**
   * Adds to the <em>remark</em> feature.
   * 
   * @generated
   */
  public void addToRemark(StringType remarkValue) {
    if (!remark.contains(remarkValue)) {
      remark.add(remarkValue);
    }
  }

  /**
   * Removes from the <em>remark</em> feature.
   * 
   * @generated
   */
  public void removeFromRemark(StringType remarkValue) {
    if (remark.contains(remarkValue)) {
      remark.remove(remarkValue);
    }
  }

  /**
   * Clears the <em>remark</em> feature.
   * 
   * @generated
   */
  public void clearRemark() {
    while (!remark.isEmpty()) {
      removeFromRemark(remark.iterator().next());
    }
  }

  /**
   * Sets the '{@link ProductType#getRemark() <em>remark</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ProductType#getRemark() remark}' feature.
   * @generated
   */
  public void setRemark(List<StringType> newRemark) {
    remark = newRemark;
  }

  /**
   * Returns the value of '<em><b>price</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>price</b></em>' feature
   * @generated
   */
  public PriceType getPrice() {
    return price;
  }

  /**
   * Sets the '{@link ProductType#getPrice() <em>price</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ProductType#getPrice() price}' feature.
   * @generated
   */
  public void setPrice(PriceType newPrice) {
    price = newPrice;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ProductType " + " [code: " + getCode() + "]" + " [description: " + getDescription() + "]";
  }
}
