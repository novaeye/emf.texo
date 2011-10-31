package org.eclipse.emf.texo.test.model.samples.extlibrary;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/** 
 * A representation of the model object '<em><b>BookOnTape</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "BookOnTape")
public class BookOnTape extends AudioVisualItem {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = Person.class)
  @JoinColumns({ @JoinColumn() })
  private Person reader = null;
  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = Writer.class)
  @JoinColumns({ @JoinColumn() })
  private Writer author = null;

  /**
   * Returns the value of '<em><b>reader</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>reader</b></em>' feature
   * @generated
   */
  public Person getReader() {
    return reader;
  }

  /**
   * Sets the '{@link BookOnTape#getReader() <em>reader</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link BookOnTape#getReader() reader}' feature.
   * @generated
   */
  public void setReader(Person newReader) {
    reader = newReader;
  }

  /**
   * Returns the value of '<em><b>author</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>author</b></em>' feature
   * @generated
   */
  public Writer getAuthor() {
    return author;
  }

  /**
   * Sets the '{@link BookOnTape#getAuthor() <em>author</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link BookOnTape#getAuthor() author}' feature.
   * @generated
   */
  public void setAuthor(Writer newAuthor) {
    author = newAuthor;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "BookOnTape ";
  }
}
