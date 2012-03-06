package org.eclipse.modisco.kdm.build;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.core.KDMEntity;

/**
 * A representation of the model object '<em><b>BuildResource</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "BuildResource")
public class BuildResource extends AbstractBuildElement {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = KDMEntity.class)
  @JoinTable(name = "BuildResource_implementation")
  private Set<KDMEntity> implementation = new HashSet<KDMEntity>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = AbstractBuildElement.class)
  @JoinTable(name = "BuildResource_groupedBuild")
  private Set<AbstractBuildElement> groupedBuild = new HashSet<AbstractBuildElement>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = AbstractBuildElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractBuildElement> buildElement = new HashSet<AbstractBuildElement>();

  /**
   * Returns the value of '<em><b>implementation</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>implementation</b></em>' feature
   * @generated
   */
  public Set<KDMEntity> getImplementation() {
    return implementation;
  }

  /**
   * Adds to the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void addToImplementation(KDMEntity implementationValue) {
    if (!implementation.contains(implementationValue)) {
      implementation.add(implementationValue);
    }
  }

  /**
   * Removes from the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void removeFromImplementation(KDMEntity implementationValue) {
    if (implementation.contains(implementationValue)) {
      implementation.remove(implementationValue);
    }
  }

  /**
   * Clears the <em>implementation</em> feature.
   * 
   * @generated
   */
  public void clearImplementation() {
    while (!implementation.isEmpty()) {
      removeFromImplementation(implementation.iterator().next());
    }
  }

  /**
   * Sets the '{@link BuildResource#getImplementation() <em>implementation</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link BuildResource#getImplementation() implementation}' feature.
   * @generated
   */
  public void setImplementation(Set<KDMEntity> newImplementation) {
    implementation = newImplementation;
  }

  /**
   * Returns the value of '<em><b>groupedBuild</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>groupedBuild</b></em>' feature
   * @generated
   */
  public Set<AbstractBuildElement> getGroupedBuild() {
    return groupedBuild;
  }

  /**
   * Adds to the <em>groupedBuild</em> feature.
   * 
   * @generated
   */
  public void addToGroupedBuild(AbstractBuildElement groupedBuildValue) {
    if (!groupedBuild.contains(groupedBuildValue)) {
      groupedBuild.add(groupedBuildValue);
    }
  }

  /**
   * Removes from the <em>groupedBuild</em> feature.
   * 
   * @generated
   */
  public void removeFromGroupedBuild(AbstractBuildElement groupedBuildValue) {
    if (groupedBuild.contains(groupedBuildValue)) {
      groupedBuild.remove(groupedBuildValue);
    }
  }

  /**
   * Clears the <em>groupedBuild</em> feature.
   * 
   * @generated
   */
  public void clearGroupedBuild() {
    while (!groupedBuild.isEmpty()) {
      removeFromGroupedBuild(groupedBuild.iterator().next());
    }
  }

  /**
   * Sets the '{@link BuildResource#getGroupedBuild() <em>groupedBuild</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link BuildResource#getGroupedBuild() groupedBuild}' feature.
   * @generated
   */
  public void setGroupedBuild(Set<AbstractBuildElement> newGroupedBuild) {
    groupedBuild = newGroupedBuild;
  }

  /**
   * Returns the value of '<em><b>buildElement</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>buildElement</b></em>' feature
   * @generated
   */
  public Set<AbstractBuildElement> getBuildElement() {
    return buildElement;
  }

  /**
   * Adds to the <em>buildElement</em> feature.
   * 
   * @generated
   */
  public void addToBuildElement(AbstractBuildElement buildElementValue) {
    if (!buildElement.contains(buildElementValue)) {
      buildElement.add(buildElementValue);
    }
  }

  /**
   * Removes from the <em>buildElement</em> feature.
   * 
   * @generated
   */
  public void removeFromBuildElement(AbstractBuildElement buildElementValue) {
    if (buildElement.contains(buildElementValue)) {
      buildElement.remove(buildElementValue);
    }
  }

  /**
   * Clears the <em>buildElement</em> feature.
   * 
   * @generated
   */
  public void clearBuildElement() {
    while (!buildElement.isEmpty()) {
      removeFromBuildElement(buildElement.iterator().next());
    }
  }

  /**
   * Sets the '{@link BuildResource#getBuildElement() <em>buildElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link BuildResource#getBuildElement() buildElement}' feature.
   * @generated
   */
  public void setBuildElement(Set<AbstractBuildElement> newBuildElement) {
    buildElement = newBuildElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BuildResource ";
  }
}
