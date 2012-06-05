package org.eclipse.graphiti.mm.pictograms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.graphiti.mm.algorithms.styles.PrecisionPoint;

/**
 * A representation of the model object '<em><b>CurvedConnection</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
@Entity(name = "pi_CurvedConnection")
public class CurvedConnection extends Connection {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<PrecisionPoint> controlPoints = new ArrayList<PrecisionPoint>();

  /**
   * Returns the value of '<em><b>controlPoints</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>controlPoints</b></em>' feature
   * @generated
   */
  public List<PrecisionPoint> getControlPoints() {
    return controlPoints;
  }

  /**
   * Adds to the <em>controlPoints</em> feature.
   * 
   * @generated
   */
  public void addToControlPoints(PrecisionPoint controlPointsValue) {
    if (!controlPoints.contains(controlPointsValue)) {
      controlPoints.add(controlPointsValue);
    }
  }

  /**
   * Removes from the <em>controlPoints</em> feature.
   * 
   * @generated
   */
  public void removeFromControlPoints(PrecisionPoint controlPointsValue) {
    if (controlPoints.contains(controlPointsValue)) {
      controlPoints.remove(controlPointsValue);
    }
  }

  /**
   * Clears the <em>controlPoints</em> feature.
   * 
   * @generated
   */
  public void clearControlPoints() {
    while (!controlPoints.isEmpty()) {
      removeFromControlPoints(controlPoints.iterator().next());
    }
  }

  /**
   * Sets the '{@link CurvedConnection#getControlPoints() <em>controlPoints</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link CurvedConnection#getControlPoints() controlPoints}' feature.
   * @generated
   */
  public void setControlPoints(List<PrecisionPoint> newControlPoints) {
    controlPoints = newControlPoints;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "CurvedConnection ";
  }
}
