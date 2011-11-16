package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderColumn;

/** 
 * A representation of the model object '<em><b>VideoCassette</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "VideoCassette")
public class VideoCassette extends AudioVisualItem {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Person.class)
  @OrderColumn()
  @JoinTable(name = "VideoCassette_cast")
  private List<Person> cast = new ArrayList<Person>();

  /**
   * Returns the value of '<em><b>cast</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>cast</b></em>' feature
   * @generated
   */
  public List<Person> getCast() {
    return cast;
  }

  /**
   * Adds to the <em>cast</em> feature.
   * @generated
   */
  public void addToCast(Person castValue) {
    if (!cast.contains(castValue)) {

      cast.add(castValue);
    }

  }

  /**			
   * Removes from the <em>cast</em> feature.
   * @generated
   */
  public void removeFromCast(Person castValue) {
    if (cast.contains(castValue)) {
      cast.remove(castValue);
    }
  }

  /**			
   * Clears the <em>cast</em> feature.
   * @generated
   */
  public void clearCast() {
    while (!cast.isEmpty()) {
      removeFromCast(cast.get(0));
    }
  }

  /**
   * Sets the '{@link VideoCassette#getCast() <em>cast</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link VideoCassette#getCast() cast}' feature.
   * @generated
   */
  public void setCast(List<Person> newCast) {
    cast = newCast;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "VideoCassette ";
  }
}
