package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.emf.texo.test.TexoTestQNameConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>ResourceType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_ResourceType")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter"),
    @Converter(converterClass = TexoTestQNameConverter.class, name = "TexoTestQNameConverter") })
public class ResourceType extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<AbstractPlatformElement> platformElement = new HashSet<AbstractPlatformElement>();

  /**
   * Returns the value of '<em><b>platformElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>platformElement</b></em>' feature
   * @generated
   */
  public Set<AbstractPlatformElement> getPlatformElement() {
    return platformElement;
  }

  /**
   * Adds to the <em>platformElement</em> feature.
   * 
   * @param platformElementValue
   *          the value to add
   * 
   * @generated
   */
  public void addToPlatformElement(AbstractPlatformElement platformElementValue) {
    if (!platformElement.contains(platformElementValue)) {
      platformElement.add(platformElementValue);
    }
  }

  /**
   * Removes from the <em>platformElement</em> feature.
   * 
   * @param platformElementValue
   *          the value to remove
   * 
   * @generated
   */
  public void removeFromPlatformElement(AbstractPlatformElement platformElementValue) {
    if (platformElement.contains(platformElementValue)) {
      platformElement.remove(platformElementValue);
    }
  }

  /**
   * Clears the <em>platformElement</em> feature.
   * 
   * @generated
   */
  public void clearPlatformElement() {
    while (!platformElement.isEmpty()) {
      removeFromPlatformElement(platformElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link ResourceType#getPlatformElement() <em>platformElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param newPlatformElement
   *          the new value of the '{@link ResourceType#getPlatformElement() platformElement}' feature.
   * @generated
   */
  public void setPlatformElement(Set<AbstractPlatformElement> newPlatformElement) {
    platformElement = newPlatformElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ResourceType ";
  }
}
