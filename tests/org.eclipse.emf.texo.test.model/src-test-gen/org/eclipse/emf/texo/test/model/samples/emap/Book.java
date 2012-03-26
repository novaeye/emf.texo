package org.eclipse.emf.texo.test.model.samples.emap;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableInterface;

/**
 * A representation of the model object '<em><b>Book</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "Book")
@Table(name = "EMAP_BOOK")
public class Book implements IdentifiableInterface {

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Basic(optional = false)
  private String title = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @OneToMany(cascade = { CascadeType.ALL })
  @MapKeyClass(String.class)
  @MapKeyColumn(table = "Book_writers")
  @JoinTable(name = "Book_writers")
  private Map<String, Writer> writers = new LinkedHashMap<String, Writer>();

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Id()
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Access(AccessType.PROPERTY)
  private Long db_Id = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Version()
  @Access(AccessType.PROPERTY)
  private Integer db_version = null;

  /**
   * Returns the value of '<em><b>title</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>title</b></em>' feature
   * @generated
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the '{@link Book#getTitle() <em>title</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Book#getTitle() title}' feature.
   * @generated
   */
  public void setTitle(String newTitle) {
    title = newTitle;
  }

  /**
   * Returns the value of '<em><b>writers</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>writers</b></em>' feature
   * @generated
   */
  public Map<String, Writer> getWriters() {
    return writers;
  }

  /**
   * Sets the '{@link Book#getWriters() <em>writers</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Book#getWriters() writers}' feature.
   * @generated
   */
  public void setWriters(Map<String, Writer> newWriters) {
    writers = newWriters;
  }

  /**
   * Returns the value of '<em><b>db_Id</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>db_Id</b></em>' feature
   * @generated
   */
  public Long getDb_Id() {
    return db_Id;
  }

  /**
   * Sets the '{@link Book#getDb_Id() <em>db_Id</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Book#getDb_Id() db_Id}' feature.
   * @generated
   */
  public void setDb_Id(Long newDb_Id) {
    db_Id = newDb_Id;
  }

  /**
   * Returns the value of '<em><b>db_version</b></em>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>db_version</b></em>' feature
   * @generated
   */
  public Integer getDb_version() {
    return db_version;
  }

  /**
   * Sets the '{@link Book#getDb_version() <em>db_version</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link Book#getDb_version() db_version}' feature.
   * @generated
   */
  public void setDb_version(Integer newDb_version) {
    db_version = newDb_version;
  }

  /**
   * A toString method which prints the values of all EAttributes of this instance. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    return "Book " + " [title: " + getTitle() + "]" + " [db_Id: " + getDb_Id() + "]" + " [db_version: "
        + getDb_version() + "]";
  }
}
