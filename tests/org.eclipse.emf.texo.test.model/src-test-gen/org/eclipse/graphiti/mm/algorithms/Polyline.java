package org.eclipse.graphiti.mm.algorithms;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.TexoTestObjectConverter;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.persistence.annotations.Converter;
import org.eclipse.persistence.annotations.Converters;

/**
 * A representation of the model object '<em><b>Polyline</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "al_Polyline")
@Converters({ @Converter(converterClass = TexoTestObjectConverter.class, name = "TexoTestObjectConverter") })
public class Polyline extends GraphicsAlgorithm {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @OrderColumn()
  private List<Point> points = new ArrayList<Point>();

  /**
   * Returns the value of '<em><b>points</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>points</b></em>' feature
   * @generated
   */
  public List<Point> getPoints() {
    return points;
  }

  /**
   * Adds to the <em>points</em> feature.
   * 
   * @generated
   */
  public void addToPoints(Point pointsValue) {
    if (!points.contains(pointsValue)) {
      points.add(pointsValue);
    }
  }

  /**
   * Removes from the <em>points</em> feature.
   * 
   * @generated
   */
  public void removeFromPoints(Point pointsValue) {
    if (points.contains(pointsValue)) {
      points.remove(pointsValue);
    }
  }

  /**
   * Clears the <em>points</em> feature.
   * 
   * @generated
   */
  public void clearPoints() {
    while (!points.isEmpty()) {
      removeFromPoints(points.iterator().next());
    }
  }

  /**
   * Sets the '{@link Polyline#getPoints() <em>points</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Polyline#getPoints() points}' feature.
   * @generated
   */
  public void setPoints(List<Point> newPoints) {
    points = newPoints;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Polyline ";
  }
}
