package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Machine</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "platform_Machine")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class Machine extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<DeployedComponent> deployedComponent = new HashSet<DeployedComponent>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  private Set<DeployedResource> deployedResource = new HashSet<DeployedResource>();

  /**
   * Returns the value of '<em><b>deployedComponent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>deployedComponent</b></em>' feature
   * @generated
   */
  public Set<DeployedComponent> getDeployedComponent() {
    return deployedComponent;
  }

  /**
   * Adds to the <em>deployedComponent</em> feature.
   * 
   * @generated
   */
  public void addToDeployedComponent(DeployedComponent deployedComponentValue) {
    if (!deployedComponent.contains(deployedComponentValue)) {
      deployedComponent.add(deployedComponentValue);
    }
  }

  /**
   * Removes from the <em>deployedComponent</em> feature.
   * 
   * @generated
   */
  public void removeFromDeployedComponent(DeployedComponent deployedComponentValue) {
    if (deployedComponent.contains(deployedComponentValue)) {
      deployedComponent.remove(deployedComponentValue);
    }
  }

  /**
   * Clears the <em>deployedComponent</em> feature.
   * 
   * @generated
   */
  public void clearDeployedComponent() {
    while (!deployedComponent.isEmpty()) {
      removeFromDeployedComponent(deployedComponent.iterator().next());
    }
  }

  /**
   * Sets the '{@link Machine#getDeployedComponent() <em>deployedComponent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Machine#getDeployedComponent() deployedComponent}' feature.
   * @generated
   */
  public void setDeployedComponent(Set<DeployedComponent> newDeployedComponent) {
    deployedComponent = newDeployedComponent;
  }

  /**
   * Returns the value of '<em><b>deployedResource</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>deployedResource</b></em>' feature
   * @generated
   */
  public Set<DeployedResource> getDeployedResource() {
    return deployedResource;
  }

  /**
   * Adds to the <em>deployedResource</em> feature.
   * 
   * @generated
   */
  public void addToDeployedResource(DeployedResource deployedResourceValue) {
    if (!deployedResource.contains(deployedResourceValue)) {
      deployedResource.add(deployedResourceValue);
    }
  }

  /**
   * Removes from the <em>deployedResource</em> feature.
   * 
   * @generated
   */
  public void removeFromDeployedResource(DeployedResource deployedResourceValue) {
    if (deployedResource.contains(deployedResourceValue)) {
      deployedResource.remove(deployedResourceValue);
    }
  }

  /**
   * Clears the <em>deployedResource</em> feature.
   * 
   * @generated
   */
  public void clearDeployedResource() {
    while (!deployedResource.isEmpty()) {
      removeFromDeployedResource(deployedResource.iterator().next());
    }
  }

  /**
   * Sets the '{@link Machine#getDeployedResource() <em>deployedResource</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Machine#getDeployedResource() deployedResource}' feature.
   * @generated
   */
  public void setDeployedResource(Set<DeployedResource> newDeployedResource) {
    deployedResource = newDeployedResource;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Machine ";
  }
}
