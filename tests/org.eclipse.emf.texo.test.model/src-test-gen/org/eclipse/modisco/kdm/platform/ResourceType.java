package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;

/** 
 * A representation of the model object '<em><b>ResourceType</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "ResourceType")
public class ResourceType extends AbstractPlatformElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractPlatformElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractPlatformElement> platformElement = new HashSet<AbstractPlatformElement>();

  /**
   * Returns the value of '<em><b>platformElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>platformElement</b></em>' feature
   * @generated
   */
  public Set<AbstractPlatformElement> getPlatformElement() {
    return platformElement;
  }

  /**
   * Adds to the <em>platformElement</em> feature.
   * @generated
   */
  public void addToPlatformElement(AbstractPlatformElement platformElementValue) {
    if (!platformElement.contains(platformElementValue)) {

      platformElement.add(platformElementValue);
    }

  }

  /**			
   * Removes from the <em>platformElement</em> feature.
   * @generated
   */
  public void removeFromPlatformElement(AbstractPlatformElement platformElementValue) {
    if (platformElement.contains(platformElementValue)) {
      platformElement.remove(platformElementValue);
    }
  }

  /**			
   * Clears the <em>platformElement</em> feature.
   * @generated
   */
  public void clearPlatformElement() {
    for (AbstractPlatformElement platformElementElement : platformElement) {
      removeFromPlatformElement(platformElementElement);
    }
  }

  /**
   * Sets the '{@link ResourceType#getPlatformElement() <em>platformElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link ResourceType#getPlatformElement() platformElement}' feature.
   * @generated
   */
  public void setPlatformElement(Set<AbstractPlatformElement> newPlatformElement) {
    platformElement = newPlatformElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "ResourceType ";
  }
}
