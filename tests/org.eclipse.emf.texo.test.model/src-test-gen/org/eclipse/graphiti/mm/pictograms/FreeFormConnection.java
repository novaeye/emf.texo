package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.graphiti.mm.algorithms.styles.Point;

/**
 * A representation of the model object '<em><b>FreeFormConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_FreeFormConnection")
public class FreeFormConnection extends Connection {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Point> bendpoints = new ArrayList<Point>();

  /**
   * Returns the value of '<em><b>bendpoints</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>bendpoints</b></em>' feature
   * @generated
   */
  public List<Point> getBendpoints() {
    return bendpoints;
  }

  /**
   * Adds to the <em>bendpoints</em> feature.
   * 
   * @generated
   */
  public void addToBendpoints(Point bendpointsValue) {
    if (!bendpoints.contains(bendpointsValue)) {
      bendpoints.add(bendpointsValue);
    }
  }

  /**
   * Removes from the <em>bendpoints</em> feature.
   * 
   * @generated
   */
  public void removeFromBendpoints(Point bendpointsValue) {
    if (bendpoints.contains(bendpointsValue)) {
      bendpoints.remove(bendpointsValue);
    }
  }

  /**
   * Clears the <em>bendpoints</em> feature.
   * 
   * @generated
   */
  public void clearBendpoints() {
    while (!bendpoints.isEmpty()) {
      removeFromBendpoints(bendpoints.iterator().next());
    }
  }

  /**
   * Sets the '{@link FreeFormConnection#getBendpoints() <em>bendpoints</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link FreeFormConnection#getBendpoints() bendpoints}' feature.
   * @generated
   */
  public void setBendpoints(List<Point> newBendpoints) {
    bendpoints = newBendpoints;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "FreeFormConnection ";
  }
}
