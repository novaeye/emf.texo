package org.eclipse.emf.texo.test.model.samples.extlibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;

/** 
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated 
 */
@Entity(name = "Library")
public class Library extends Identifiable implements Addressable {

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String name = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Item.class)
  @JoinColumns({ @JoinColumn() })
  private Set<Item> stock = new HashSet<Item>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToMany(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, targetEntity = Book.class)
  @JoinTable(name = "Library_books")
  private Set<Book> books = new HashSet<Book>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @OneToMany(cascade = { CascadeType.ALL }, orphanRemoval = true, targetEntity = Library.class)
  @OrderColumn()
  @JoinColumns({ @JoinColumn() })
  private List<Library> branches = new ArrayList<Library>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @ManyToOne(cascade = { CascadeType.ALL, CascadeType.PERSIST, CascadeType.REFRESH }, optional = true, targetEntity = Library.class)
  @JoinColumns({ @JoinColumn() })
  private Library parentBranch = null;

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  private List<LibraryPeopleFeatureGroup> people = new ArrayList<LibraryPeopleFeatureGroup>();

  /** 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  @Basic(optional = true)
  private String address = null;

  /**
   * Returns the value of '<em><b>name</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>name</b></em>' feature
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the '{@link Library#getName() <em>name</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getName() name}' feature.
   * @generated
   */
  public void setName(String newName) {
    name = newName;
  }

  /**
   * Returns the value of '<em><b>writers</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>writers</b></em>' feature
   * @generated
   */
  public List<Writer> getWriters() {
    return LibraryPeopleFeatureGroup
        .createUnmodifiableValueList(getPeople(), LibraryPeopleFeatureGroup.Feature.WRITERS);
  }

  /**
   * Sets the '{@link Library#getWriters() <em>writers</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getWriters() writers}' feature.
   * @generated
   */
  public void setWriters(List<Writer> newWriters) {
    setPeople(LibraryPeopleFeatureGroup.createFeatureGroupList(LibraryPeopleFeatureGroup.Feature.WRITERS, newWriters));
  }

  /**
   * Returns the value of '<em><b>employees</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>employees</b></em>' feature
   * @generated
   */
  public List<Employee> getEmployees() {
    return LibraryPeopleFeatureGroup.createUnmodifiableValueList(getPeople(),
        LibraryPeopleFeatureGroup.Feature.EMPLOYEES);
  }

  /**
   * Sets the '{@link Library#getEmployees() <em>employees</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getEmployees() employees}' feature.
   * @generated
   */
  public void setEmployees(List<Employee> newEmployees) {
    setPeople(LibraryPeopleFeatureGroup.createFeatureGroupList(LibraryPeopleFeatureGroup.Feature.EMPLOYEES,
        newEmployees));
  }

  /**
   * Returns the value of '<em><b>borrowers</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>borrowers</b></em>' feature
   * @generated
   */
  public List<Borrower> getBorrowers() {
    return LibraryPeopleFeatureGroup.createUnmodifiableValueList(getPeople(),
        LibraryPeopleFeatureGroup.Feature.BORROWERS);
  }

  /**
   * Sets the '{@link Library#getBorrowers() <em>borrowers</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getBorrowers() borrowers}' feature.
   * @generated
   */
  public void setBorrowers(List<Borrower> newBorrowers) {
    setPeople(LibraryPeopleFeatureGroup.createFeatureGroupList(LibraryPeopleFeatureGroup.Feature.BORROWERS,
        newBorrowers));
  }

  /**
   * Returns the value of '<em><b>stock</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>stock</b></em>' feature
   * @generated
   */
  public Set<Item> getStock() {
    return stock;
  }

  /**
   * Adds to the <em>stock</em> feature.
   * @generated
   */
  public void addToStock(Item stockValue) {
    if (!stock.contains(stockValue)) {

      stock.add(stockValue);
    }

  }

  /**			
   * Removes from the <em>stock</em> feature.
   * @generated
   */
  public void removeFromStock(Item stockValue) {
    if (stock.contains(stockValue)) {
      stock.remove(stockValue);
    }
  }

  /**			
   * Clears the <em>stock</em> feature.
   * @generated
   */
  public void clearStock() {
    for (Item stockElement : stock) {
      removeFromStock(stockElement);
    }
  }

  /**
   * Sets the '{@link Library#getStock() <em>stock</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getStock() stock}' feature.
   * @generated
   */
  public void setStock(Set<Item> newStock) {
    stock = newStock;
  }

  /**
   * Returns the value of '<em><b>books</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>books</b></em>' feature
   * @generated
   */
  public Set<Book> getBooks() {
    return books;
  }

  /**
   * Adds to the <em>books</em> feature.
   * @generated
   */
  public void addToBooks(Book booksValue) {
    if (!books.contains(booksValue)) {

      books.add(booksValue);
    }

  }

  /**			
   * Removes from the <em>books</em> feature.
   * @generated
   */
  public void removeFromBooks(Book booksValue) {
    if (books.contains(booksValue)) {
      books.remove(booksValue);
    }
  }

  /**			
   * Clears the <em>books</em> feature.
   * @generated
   */
  public void clearBooks() {
    for (Book booksElement : books) {
      removeFromBooks(booksElement);
    }
  }

  /**
   * Sets the '{@link Library#getBooks() <em>books</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getBooks() books}' feature.
   * @generated
   */
  public void setBooks(Set<Book> newBooks) {
    books = newBooks;
  }

  /**
   * Returns the value of '<em><b>branches</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>branches</b></em>' feature
   * @generated
   */
  public List<Library> getBranches() {
    return branches;
  }

  /**
   * Adds to the <em>branches</em> feature.
   * @generated
   */
  public void addToBranches(Library branchesValue) {
    if (!branches.contains(branchesValue)) {

      branches.add(branchesValue);
    }

  }

  /**			
   * Removes from the <em>branches</em> feature.
   * @generated
   */
  public void removeFromBranches(Library branchesValue) {
    if (branches.contains(branchesValue)) {
      branches.remove(branchesValue);
    }
  }

  /**			
   * Clears the <em>branches</em> feature.
   * @generated
   */
  public void clearBranches() {
    for (Library branchesElement : branches) {
      removeFromBranches(branchesElement);
    }
  }

  /**
   * Sets the '{@link Library#getBranches() <em>branches</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getBranches() branches}' feature.
   * @generated
   */
  public void setBranches(List<Library> newBranches) {
    branches = newBranches;
  }

  /**
   * Returns the value of '<em><b>parentBranch</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>parentBranch</b></em>' feature
   * @generated
   */
  public Library getParentBranch() {
    return parentBranch;
  }

  /**
   * Sets the '{@link Library#getParentBranch() <em>parentBranch</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getParentBranch() parentBranch}' feature.
   * @generated
   */
  public void setParentBranch(Library newParentBranch) {
    parentBranch = newParentBranch;
  }

  /**
   * Returns the value of '<em><b>people</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>people</b></em>' feature
   * @generated
   */
  public List<LibraryPeopleFeatureGroup> getPeople() {
    return people;
  }

  /**
   * Sets the '{@link Library#getPeople() <em>people</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getPeople() people}' feature.
   * @generated
   */
  public void setPeople(List<LibraryPeopleFeatureGroup> newPeople) {
    people = newPeople;
  }

  /**
   * Returns the value of '<em><b>address</b></em>' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the value of '<em><b>address</b></em>' feature
   * @generated
   */
  public String getAddress() {
    return address;
  }

  /**
   * Sets the '{@link Library#getAddress() <em>address</em>}' feature.
   *
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param the new value of the '{@link Library#getAddress() address}' feature.
   * @generated
   */
  public void setAddress(String newAddress) {
    address = newAddress;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    return "Library " + " [name: " + getName() + "]" + " [address: " + getAddress() + "]";
  }
}
