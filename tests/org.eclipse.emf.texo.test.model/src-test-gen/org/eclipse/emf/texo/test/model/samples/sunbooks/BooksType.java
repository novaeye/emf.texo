package org.eclipse.emf.texo.test.model.samples.sunbooks;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/**
 * A representation of the model object '<em><b>BooksType</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "BooksType")
public class BooksType {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL }, targetEntity = BookType.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<BookType> book = new ArrayList<BookType>();

  /**
   * Returns the value of '<em><b>book</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>book</b></em>' feature
   * @generated
   */
  public List<BookType> getBook() {
    return book;
  }

  /**
   * Adds to the <em>book</em> feature.
   * 
   * @generated
   */
  public void addToBook(BookType bookValue) {
    if (!book.contains(bookValue)) {
      book.add(bookValue);
    }
  }

  /**
   * Removes from the <em>book</em> feature.
   * 
   * @generated
   */
  public void removeFromBook(BookType bookValue) {
    if (book.contains(bookValue)) {
      book.remove(bookValue);
    }
  }

  /**
   * Clears the <em>book</em> feature.
   * 
   * @generated
   */
  public void clearBook() {
    while (!book.isEmpty()) {
      removeFromBook(book.iterator().next());
    }
  }

  /**
   * Sets the '{@link BooksType#getBook() <em>book</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link BooksType#getBook() book}' feature.
   * @generated
   */
  public void setBook(List<BookType> newBook) {
    book = newBook;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "BooksType ";
  }
}
