package org.eclipse.modisco.kdm.platform;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * A representation of the model object '<em><b>DeployedSoftwareSystem</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "DeployedSoftwareSystem")
public class DeployedSoftwareSystem extends AbstractPlatformElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = DeployedComponent.class)
  @JoinTable(name = "DeployedSoftwareSystem_groupedComponent")
  private Set<DeployedComponent> groupedComponent = new HashSet<DeployedComponent>();

  /**
   * Returns the value of '<em><b>groupedComponent</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedComponent</b></em>' feature
   * @generated
   */
  public Set<DeployedComponent> getGroupedComponent() {
    return groupedComponent;
  }

  /**
   * Adds to the <em>groupedComponent</em> feature.
   * 
   * @generated
   */
  public void addToGroupedComponent(DeployedComponent groupedComponentValue) {
    if (!groupedComponent.contains(groupedComponentValue)) {
      groupedComponent.add(groupedComponentValue);
    }
  }

  /**
   * Removes from the <em>groupedComponent</em> feature.
   * 
   * @generated
   */
  public void removeFromGroupedComponent(DeployedComponent groupedComponentValue) {
    if (groupedComponent.contains(groupedComponentValue)) {
      groupedComponent.remove(groupedComponentValue);
    }
  }

  /**
   * Clears the <em>groupedComponent</em> feature.
   * 
   * @generated
   */
  public void clearGroupedComponent() {
    while (!groupedComponent.isEmpty()) {
      removeFromGroupedComponent(groupedComponent.iterator().next());
    }
  }

  /**
   * Sets the '{@link DeployedSoftwareSystem#getGroupedComponent() <em>groupedComponent</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link DeployedSoftwareSystem#getGroupedComponent() groupedComponent}' feature.
   * @generated
   */
  public void setGroupedComponent(Set<DeployedComponent> newGroupedComponent) {
    groupedComponent = newGroupedComponent;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "DeployedSoftwareSystem ";
  }
}
