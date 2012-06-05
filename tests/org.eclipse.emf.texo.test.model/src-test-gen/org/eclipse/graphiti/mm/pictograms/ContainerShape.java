package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/**
 * A representation of the model object '<em><b>ContainerShape</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "pi_ContainerShape")
public class ContainerShape extends Shape {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Shape> children = new ArrayList<Shape>();

  /**
   * Returns the value of '<em><b>children</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>children</b></em>' feature
   * @generated
   */
  public List<Shape> getChildren() {
    return children;
  }

  /**
   * Adds to the <em>children</em> feature.
   * 
   * @generated
   */
  public void addToChildren(Shape childrenValue) {
    if (!children.contains(childrenValue)) {
      children.add(childrenValue);
    }
  }

  /**
   * Removes from the <em>children</em> feature.
   * 
   * @generated
   */
  public void removeFromChildren(Shape childrenValue) {
    if (children.contains(childrenValue)) {
      children.remove(childrenValue);
    }
  }

  /**
   * Clears the <em>children</em> feature.
   * 
   * @generated
   */
  public void clearChildren() {
    while (!children.isEmpty()) {
      removeFromChildren(children.iterator().next());
    }
  }

  /**
   * Sets the '{@link ContainerShape#getChildren() <em>children</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link ContainerShape#getChildren() children}' feature.
   * @generated
   */
  public void setChildren(List<Shape> newChildren) {
    children = newChildren;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "ContainerShape ";
  }
}
