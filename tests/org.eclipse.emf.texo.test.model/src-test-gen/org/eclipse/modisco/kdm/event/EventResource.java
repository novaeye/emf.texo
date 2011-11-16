package org.eclipse.modisco.kdm.event;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;

/** 
 * A representation of the model object '<em><b>EventResource</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "EventResource")
public class EventResource extends AbstractEventElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = AbstractEventElement.class)
  @JoinColumns({ @JoinColumn() })
  private Set<AbstractEventElement> eventElement = new HashSet<AbstractEventElement>();

  /**
   * Returns the value of '<em><b>eventElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>eventElement</b></em>' feature
   * @generated
   */
  public Set<AbstractEventElement> getEventElement() {
    return eventElement;
  }

  /**
   * Adds to the <em>eventElement</em> feature.
   * @generated
   */
  public void addToEventElement(AbstractEventElement eventElementValue) {
    if (!eventElement.contains(eventElementValue)) {

      eventElement.add(eventElementValue);
    }

  }

  /**			
   * Removes from the <em>eventElement</em> feature.
   * @generated
   */
  public void removeFromEventElement(AbstractEventElement eventElementValue) {
    if (eventElement.contains(eventElementValue)) {
      eventElement.remove(eventElementValue);
    }
  }

  /**			
   * Clears the <em>eventElement</em> feature.
   * @generated
   */
  public void clearEventElement() {
    while (!eventElement.isEmpty()) {
      removeFromEventElement(eventElement.get(0));
    }
  }

  /**
   * Sets the '{@link EventResource#getEventElement() <em>eventElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link EventResource#getEventElement() eventElement}' feature.
   * @generated
   */
  public void setEventElement(Set<AbstractEventElement> newEventElement) {
    eventElement = newEventElement;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "EventResource ";
  }
}
