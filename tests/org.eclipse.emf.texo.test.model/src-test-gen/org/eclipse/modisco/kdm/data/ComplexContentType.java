package org.eclipse.modisco.kdm.data;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/**
 * A representation of the model object '<em><b>ComplexContentType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "ComplexContentType")
public class ComplexContentType extends AbstractContentElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractContentElement.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<AbstractContentElement> contentElement = new ArrayList<AbstractContentElement>();

  /**
   * Returns the value of '<em><b>contentElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>contentElement</b></em>' feature
   * @generated
   */
  public List<AbstractContentElement> getContentElement() {
    return contentElement;
  }

  /**
   * Adds to the <em>contentElement</em> feature.
   * @generated
   */
  public void addToContentElement(AbstractContentElement contentElementValue) {
    if (!contentElement.contains(contentElementValue)) {

      contentElement.add(contentElementValue);
    }

  }

  /**			
   * Removes from the <em>contentElement</em> feature.
   * @generated
   */
  public void removeFromContentElement(AbstractContentElement contentElementValue) {
    if (contentElement.contains(contentElementValue)) {
      contentElement.remove(contentElementValue);
    }
  }

  /**			
   * Clears the <em>contentElement</em> feature.
   * @generated
   */
  public void clearContentElement() {
    while (!contentElement.isEmpty()) {
      removeFromContentElement(contentElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link ComplexContentType#getContentElement() <em>contentElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ComplexContentType#getContentElement() contentElement}' feature.
   * @generated
   */
  public void setContentElement(List<AbstractContentElement> newContentElement) {
    contentElement = newContentElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "ComplexContentType ";
  }
}
