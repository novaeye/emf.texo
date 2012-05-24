package org.eclipse.emf.texo.test.model.issues.bz331009;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/**
 * A representation of the model object '<em><b>Event</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
 * begin-model-doc --> Событие <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity(name = "Event")
public class Event extends Identifiable {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic()
  private EventType eventType = EventType.COORDINATES;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Полученное сообщение <!-- end-model-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Message message = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
  private Coordinates coordinates = null;

  /**
   * Returns the value of '<em><b>eventType</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>eventType</b></em>' feature
   * @generated
   */
  public EventType getEventType() {
    return eventType;
  }

  /**
   * Sets the '{@link Event#getEventType() <em>eventType</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Event#getEventType() eventType}' feature.
   * @generated
   */
  public void setEventType(EventType newEventType) {
    eventType = newEventType;
  }

  /**
   * Returns the value of '<em><b>message</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Полученное сообщение <!-- end-model-doc -->
   * 
   * @return the value of '<em><b>message</b></em>' feature
   * @generated
   */
  public Message getMessage() {
    return message;
  }

  /**
   * Sets the '{@link Event#getMessage() <em>message</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Полученное сообщение <!-- end-model-doc -->
   * 
   * @param the
   *          new value of the '{@link Event#getMessage() message}' feature.
   * @generated
   */
  public void setMessage(Message newMessage) {
    message = newMessage;
  }

  /**
   * Returns the value of '<em><b>coordinates</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>coordinates</b></em>' feature
   * @generated
   */
  public Coordinates getCoordinates() {
    return coordinates;
  }

  /**
   * Sets the '{@link Event#getCoordinates() <em>coordinates</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Event#getCoordinates() coordinates}' feature.
   * @generated
   */
  public void setCoordinates(Coordinates newCoordinates) {
    coordinates = newCoordinates;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Event " + " [eventType: " + getEventType() + "]";
  }
}
