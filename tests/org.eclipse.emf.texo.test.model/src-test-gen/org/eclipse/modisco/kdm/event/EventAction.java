package org.eclipse.modisco.kdm.event;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;

/** 
 * A representation of the model object '<em><b>EventAction</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "EventAction")
public class EventAction extends AbstractEventElement {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String kind = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Event.class)
  @JoinColumns({ @JoinColumn() })
  private Set<Event> eventElement = new HashSet<Event>();

  /**
   * Returns the value of '<em><b>kind</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>kind</b></em>' feature
   * @generated
   */
  public String getKind() {
    return kind;
  }

  /**
   * Sets the '{@link EventAction#getKind() <em>kind</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link EventAction#getKind() kind}' feature.
   * @generated
   */
  public void setKind(String newKind) {
    kind = newKind;
  }

  /**
   * Returns the value of '<em><b>eventElement</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>eventElement</b></em>' feature
   * @generated
   */
  public Set<Event> getEventElement() {
    return eventElement;
  }

  /**
   * Adds to the <em>eventElement</em> feature.
   * @generated
   */
  public void addToEventElement(Event eventElementValue) {
    if (!eventElement.contains(eventElementValue)) {

      eventElement.add(eventElementValue);
    }

  }

  /**			
   * Removes from the <em>eventElement</em> feature.
   * @generated
   */
  public void removeFromEventElement(Event eventElementValue) {
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
   * Sets the '{@link EventAction#getEventElement() <em>eventElement</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link EventAction#getEventElement() eventElement}' feature.
   * @generated
   */
  public void setEventElement(Set<Event> newEventElement) {
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
    return "EventAction " + " [kind: " + getKind() + "]";
  }
}
