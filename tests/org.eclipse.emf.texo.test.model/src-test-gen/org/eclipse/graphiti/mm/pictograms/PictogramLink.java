package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.graphiti.mm.PropertyContainer;
import org.eclipse.persistence.annotations.Convert;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>PictogramLink</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_PictogramLink")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class PictogramLink extends PropertyContainer {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, mappedBy = "link")
  private PictogramElement pictogramElement = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ElementCollection()
  @Convert("TexoTestObjectConverter")
  @CollectionTable(name = "pi_PictogramLink_businessObjects")
  private List<Object> businessObjects = new ArrayList<Object>();

  /**
   * Returns the value of '<em><b>pictogramElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>pictogramElement</b></em>' feature
   * @generated
   */
  public PictogramElement getPictogramElement() {
    return pictogramElement;
  }

  /**
   * Sets the '{@link PictogramLink#getPictogramElement() <em>pictogramElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PictogramLink#getPictogramElement() pictogramElement}' feature.
   * @generated
   */
  public void setPictogramElement(PictogramElement newPictogramElement) {
    pictogramElement = newPictogramElement;
  }

  /**
   * Returns the value of '<em><b>businessObjects</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>businessObjects</b></em>' feature
   * @generated
   */
  public List<Object> getBusinessObjects() {
    return businessObjects;
  }

  /**
   * Adds to the <em>businessObjects</em> feature.
   * 
   * @generated
   */
  public void addToBusinessObjects(Object businessObjectsValue) {
    if (!businessObjects.contains(businessObjectsValue)) {
      businessObjects.add(businessObjectsValue);
    }
  }

  /**
   * Removes from the <em>businessObjects</em> feature.
   * 
   * @generated
   */
  public void removeFromBusinessObjects(Object businessObjectsValue) {
    if (businessObjects.contains(businessObjectsValue)) {
      businessObjects.remove(businessObjectsValue);
    }
  }

  /**
   * Clears the <em>businessObjects</em> feature.
   * 
   * @generated
   */
  public void clearBusinessObjects() {
    while (!businessObjects.isEmpty()) {
      removeFromBusinessObjects(businessObjects.iterator().next());
    }
  }

  /**
   * Sets the '{@link PictogramLink#getBusinessObjects() <em>businessObjects</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link PictogramLink#getBusinessObjects() businessObjects}' feature.
   * @generated
   */
  public void setBusinessObjects(List<Object> newBusinessObjects) {
    businessObjects = newBusinessObjects;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "PictogramLink ";
  }
}
