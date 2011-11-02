package org.eclipse.modisco.kdm.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/** 
 * A representation of the model object '<em><b>ContentItem</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "ContentItem")
public class ContentItem extends AbstractContentElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = ComplexContentType.class)
  @JoinColumns({ @JoinColumn() })
  private ComplexContentType type = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractContentElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractContentElement> contentElement = new HashSet<AbstractContentElement>();

  /**
   * Returns the value of '<em><b>type</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>type</b></em>' feature
   * @generated
   */
  public ComplexContentType getType() {
    return type;
  }

  /**
   * Sets the '{@link ContentItem#getType() <em>type</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ContentItem#getType() type}' feature.
   * @generated
   */
  public void setType(ComplexContentType newType) {
    type = newType;
  }

  /**
   * Returns the value of '<em><b>contentElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>contentElement</b></em>' feature
   * @generated
   */
  public Set<AbstractContentElement> getContentElement() {
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
    for (AbstractContentElement contentElementElement : contentElement) {
      removeFromContentElement(contentElementElement);
    }
  }

  /**
   * Sets the '{@link ContentItem#getContentElement() <em>contentElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ContentItem#getContentElement() contentElement}' feature.
   * @generated
   */
  public void setContentElement(Set<AbstractContentElement> newContentElement) {
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
    return "ContentItem ";
  }
}
