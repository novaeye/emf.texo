package org.eclipse.emf.texo.test.model.schemaconstructs.mixed;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>LetterBodyType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "LetterBodyType")
public class LetterBodyType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<LetterBodyTypeMixedFeatureGroup> mixed = new ArrayList<LetterBodyTypeMixedFeatureGroup>();

  /**
   * Returns the value of '<em><b>mixed</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>mixed</b></em>' feature
   * @generated
   */
  public List<LetterBodyTypeMixedFeatureGroup> getMixed() {
    return mixed;
  }

  /**
   * Sets the '{@link LetterBodyType#getMixed() <em>mixed</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getMixed() mixed}' feature.
   * @generated
   */
  public void setMixed(List<LetterBodyTypeMixedFeatureGroup> newMixed) {
    mixed = newMixed;
  }

  /**
   * Returns the value of '<em><b>salutation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>salutation</b></em>' feature
   * @generated
   */
  public SalutationType getSalutation() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.SALUTATION);
  }

  /**
   * Sets the '{@link LetterBodyType#getSalutation() <em>salutation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getSalutation() salutation}' feature.
   * @generated
   */
  public void setSalutation(SalutationType newSalutation) {
    setMixed(LetterBodyTypeMixedFeatureGroup.createFeatureGroupList(LetterBodyTypeMixedFeatureGroup.Feature.SALUTATION,
        Collections.singletonList(newSalutation)));
  }

  /**
   * Returns the value of '<em><b>quantity</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>quantity</b></em>' feature
   * @generated
   */
  public BigInteger getQuantity() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.QUANTITY);
  }

  /**
   * Sets the '{@link LetterBodyType#getQuantity() <em>quantity</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getQuantity() quantity}' feature.
   * @generated
   */
  public void setQuantity(BigInteger newQuantity) {
    setMixed(LetterBodyTypeMixedFeatureGroup.createFeatureGroupList(LetterBodyTypeMixedFeatureGroup.Feature.QUANTITY,
        Collections.singletonList(newQuantity)));
  }

  /**
   * Returns the value of '<em><b>productName</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>productName</b></em>' feature
   * @generated
   */
  public String getProductName() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.PRODUCTNAME);
  }

  /**
   * Sets the '{@link LetterBodyType#getProductName() <em>productName</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getProductName() productName}' feature.
   * @generated
   */
  public void setProductName(String newProductName) {
    setMixed(LetterBodyTypeMixedFeatureGroup.createFeatureGroupList(
        LetterBodyTypeMixedFeatureGroup.Feature.PRODUCTNAME, Collections.singletonList(newProductName)));
  }

  /**
   * Returns the value of '<em><b>shipDate</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>shipDate</b></em>' feature
   * @generated
   */
  public Date getShipDate() {
    return LetterBodyTypeMixedFeatureGroup.getSingleFeatureMapValue(getMixed(),
        LetterBodyTypeMixedFeatureGroup.Feature.SHIPDATE);
  }

  /**
   * Sets the '{@link LetterBodyType#getShipDate() <em>shipDate</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link LetterBodyType#getShipDate() shipDate}' feature.
   * @generated
   */
  public void setShipDate(Date newShipDate) {
    setMixed(LetterBodyTypeMixedFeatureGroup.createFeatureGroupList(LetterBodyTypeMixedFeatureGroup.Feature.SHIPDATE,
        Collections.singletonList(newShipDate)));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "LetterBodyType " + " [quantity: " + getQuantity() + "]" + " [productName: " + getProductName() + "]"
        + " [shipDate: " + getShipDate() + "]";
  }
}
