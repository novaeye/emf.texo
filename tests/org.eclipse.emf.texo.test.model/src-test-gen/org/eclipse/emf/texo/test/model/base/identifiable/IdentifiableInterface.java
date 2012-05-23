package org.eclipse.emf.texo.test.model.base.identifiable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * A representation of the model object '<em><b>IdentifiableInterface</b></em>'. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * 
 * @generated
 */
@MappedSuperclass()
@Access(AccessType.PROPERTY)
public interface IdentifiableInterface {
  /**
   * Returns the value of '<em><b>db_Id</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>db_Id</b></em>' feature
   * @generated
   */
  @Id()
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Access(AccessType.PROPERTY)
  public Long getDb_Id();

  /**
   * Sets the '{@link IdentifiableInterface#getDb_Id() <em>db_Id</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link IdentifiableInterface#getDb_Id() <em>db_Id</em>}' feature.
   * @generated
   */
  @Id()
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Access(AccessType.PROPERTY)
  public void setDb_Id(Long newDb_Id);

  /**
   * Returns the value of '<em><b>db_version</em></b>' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the value of '<em><b>db_version</b></em>' feature
   * @generated
   */
  @Version()
  @Access(AccessType.PROPERTY)
  public Integer getDb_version();

  /**
   * Sets the '{@link IdentifiableInterface#getDb_version() <em>db_version</em>}' feature.
   * 
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param the
   *          new value of the '{@link IdentifiableInterface#getDb_version() <em>db_version</em>}' feature.
   * @generated
   */
  @Version()
  @Access(AccessType.PROPERTY)
  public void setDb_version(Integer newDb_version);

}
