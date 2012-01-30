package org.eclipse.emf.texo.test.model.schemaconstructs.groupall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>SimpleAllMapType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "SimpleAllMapType")
public class SimpleAllMapType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private List<SimpleAllMapTypeAllMapFeatureGroup> allMap = new ArrayList<SimpleAllMapTypeAllMapFeatureGroup>();

  /**
   * Returns the value of '<em><b>allMap</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>allMap</b></em>' feature
   * @generated
   */
  public List<SimpleAllMapTypeAllMapFeatureGroup> getAllMap() {
    return allMap;
  }

  /**
   * Sets the '{@link SimpleAllMapType#getAllMap() <em>allMap</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleAllMapType#getAllMap() allMap}' feature.
   * @generated
   */
  public void setAllMap(List<SimpleAllMapTypeAllMapFeatureGroup> newAllMap) {
    allMap = newAllMap;
  }

  /**
   * Returns the value of '<em><b>aaa</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>aaa</b></em>' feature
   * @generated
   */
  public String getAaa() {
    return SimpleAllMapTypeAllMapFeatureGroup.getSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.AAA);
  }

  /**
   * Sets the '{@link SimpleAllMapType#getAaa() <em>aaa</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleAllMapType#getAaa() aaa}' feature.
   * @generated
   */
  public void setAaa(String newAaa) {
    setAllMap(SimpleAllMapTypeAllMapFeatureGroup.createFeatureGroupList(SimpleAllMapTypeAllMapFeatureGroup.Feature.AAA,
        Collections.singletonList(newAaa)));
  }

  /**
   * Returns the value of '<em><b>bbb</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bbb</b></em>' feature
   * @generated
   */
  public String getBbb() {
    return SimpleAllMapTypeAllMapFeatureGroup.getSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.BBB);
  }

  /**
   * Sets the '{@link SimpleAllMapType#getBbb() <em>bbb</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleAllMapType#getBbb() bbb}' feature.
   * @generated
   */
  public void setBbb(String newBbb) {
    setAllMap(SimpleAllMapTypeAllMapFeatureGroup.createFeatureGroupList(SimpleAllMapTypeAllMapFeatureGroup.Feature.BBB,
        Collections.singletonList(newBbb)));
  }

  /**
   * Returns the value of '<em><b>ccc</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>ccc</b></em>' feature
   * @generated
   */
  public String getCcc() {
    return SimpleAllMapTypeAllMapFeatureGroup.getSingleFeatureMapValue(getAllMap(),
        SimpleAllMapTypeAllMapFeatureGroup.Feature.CCC);
  }

  /**
   * Sets the '{@link SimpleAllMapType#getCcc() <em>ccc</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link SimpleAllMapType#getCcc() ccc}' feature.
   * @generated
   */
  public void setCcc(String newCcc) {
    setAllMap(SimpleAllMapTypeAllMapFeatureGroup.createFeatureGroupList(SimpleAllMapTypeAllMapFeatureGroup.Feature.CCC,
        Collections.singletonList(newCcc)));
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "SimpleAllMapType " + " [aaa: " + getAaa() + "]" + " [bbb: " + getBbb() + "]" + " [ccc: " + getCcc() + "]";
  }
}
