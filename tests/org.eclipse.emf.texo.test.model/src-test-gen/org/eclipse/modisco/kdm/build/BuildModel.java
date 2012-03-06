package org.eclipse.modisco.kdm.build;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import org.eclipse.modisco.kdm.kdm.KDMModel;

/**
 * A representation of the model object '<em><b>BuildModel</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "BuildModel")
public class BuildModel extends KDMModel {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = AbstractBuildElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractBuildElement> buildElement = new HashSet<AbstractBuildElement>();

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
   * Sets the '{@link BuildModel#getBuildElement() <em>buildElement</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link BuildModel#getBuildElement() buildElement}' feature.
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
    return "BuildModel ";
  }
}
