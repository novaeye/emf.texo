/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToOne.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>One To One</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface OneToOne { Class targetEntity() default void.class;
 *                  CascadeType[] cascade() default {}; FetchType fetch() default EAGER; boolean optional() default
 *                  true; String mappedBy() default ""; boolean orphanRemoval() default false; }
 * 
 * 
 *                  <!-- end-model-doc -->
 * 
 *                  <p>
 *                  The following features are supported:
 *                  <ul>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrimaryKeyJoinColumn <em>
 *                  Primary Key Join Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinColumn <em>Join Column
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinTable <em>Join Table</em>}
 *                  </li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getCascade <em>Cascade</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrivateOwned <em>Private Owned
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch <em>Join Fetch</em>}
 *                  </li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getProperty <em>Property</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccessMethods <em>Access
 *                  Methods</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMappedBy <em>Mapped By</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMapsId <em>Maps Id</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getName <em>Name</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval <em>Orphan
 *                  Removal</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getTargetEntity <em>Target Entity
 *                  </em>}</li>
 *                  </ul>
 *                  </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne()
 * @model extendedMetaData="name='one-to-one' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface OneToOne extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Primary Key Join Column</b></em>' containment reference list. The list contents
   * are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key Join Column</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Primary Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_PrimaryKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='primary-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn();

  /**
   * Returns the value of the '<em><b>Join Column</b></em>' containment reference list. The list contents are of type
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Column</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_JoinColumn()
   * @model containment="true" extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<JoinColumn> getJoinColumn();

  /**
   * Returns the value of the '<em><b>Join Table</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Join Table</em>' containment reference.
   * @see #setJoinTable(JoinTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_JoinTable()
   * @model containment="true" extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
   * @generated
   */
  JoinTable getJoinTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinTable
   * <em>Join Table</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  void setJoinTable(JoinTable value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Cascade</em>' containment reference.
   * @see #setCascade(CascadeType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Cascade()
   * @model containment="true" extendedMetaData="kind='element' name='cascade' namespace='##targetNamespace'"
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getCascade <em>Cascade</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Cascade</em>' containment reference.
   * @see #getCascade()
   * @generated
   */
  void setCascade(CascadeType value);

  /**
   * Returns the value of the '<em><b>Private Owned</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Owned</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Private Owned</em>' containment reference.
   * @see #setPrivateOwned(EmptyType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_PrivateOwned()
   * @model containment="true" extendedMetaData="kind='element' name='private-owned' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getPrivateOwned();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrivateOwned
   * <em>Private Owned</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Private Owned</em>' containment reference.
   * @see #getPrivateOwned()
   * @generated
   */
  void setPrivateOwned(EmptyType value);

  /**
   * Returns the value of the '<em><b>Join Fetch</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Fetch</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_JoinFetch()
   * @model unsettable="true" extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
  JoinFetchType getJoinFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch
   * <em>Join Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @generated
   */
  void setJoinFetch(JoinFetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch
   * <em>Join Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  void unsetJoinFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch
   * <em>Join Fetch</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Join Fetch</em>' attribute is set.
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  boolean isSetJoinFetch();

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list. The list contents are of type
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Property()
   * @model containment="true" extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_AccessMethods()
   * @model containment="true" extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccessMethods
   * <em>Access Methods</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
  void setAccessMethods(AccessMethods value);

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Access()
   * @model unsettable="true" extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess
   * <em>Access</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #setFetch(FetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Fetch()
   * @model unsettable="true" extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch
   * <em>Fetch</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #setId(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Id()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  boolean isId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #isId()
   * @generated
   */
  void setId(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetId()
   * @see #isId()
   * @see #setId(boolean)
   * @generated
   */
  void unsetId();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}'
   * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Id</em>' attribute is set.
   * @see #unsetId()
   * @see #isId()
   * @see #setId(boolean)
   * @generated
   */
  boolean isSetId();

  /**
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_MappedBy()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData="kind='attribute' name='mapped-by'"
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMappedBy
   * <em>Mapped By</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Maps Id</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps Id</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Maps Id</em>' attribute.
   * @see #setMapsId(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_MapsId()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData="kind='attribute' name='maps-id'"
   * @generated
   */
  String getMapsId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMapsId <em>Maps Id</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Maps Id</em>' attribute.
   * @see #getMapsId()
   * @generated
   */
  void setMapsId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getName <em>Name</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #setOptional(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}
   * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional
   * <em>Optional</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  void unsetOptional();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional
   * <em>Optional</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Optional</em>' attribute is set.
   * @see #unsetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  boolean isSetOptional();

  /**
   * Returns the value of the '<em><b>Orphan Removal</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orphan Removal</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Orphan Removal</em>' attribute.
   * @see #isSetOrphanRemoval()
   * @see #unsetOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_OrphanRemoval()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='orphan-removal'"
   * @generated
   */
  boolean isOrphanRemoval();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval
   * <em>Orphan Removal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Orphan Removal</em>' attribute.
   * @see #isSetOrphanRemoval()
   * @see #unsetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @generated
   */
  void setOrphanRemoval(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval
   * <em>Orphan Removal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @generated
   */
  void unsetOrphanRemoval();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval
   * <em>Orphan Removal</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Orphan Removal</em>' attribute is set.
   * @see #unsetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @generated
   */
  boolean isSetOrphanRemoval();

  /**
   * Returns the value of the '<em><b>Target Entity</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Entity</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Target Entity</em>' attribute.
   * @see #setTargetEntity(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToOne_TargetEntity()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData="kind='attribute' name='target-entity'"
   * @generated
   */
  String getTargetEntity();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getTargetEntity
   * <em>Target Entity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Target Entity</em>' attribute.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(String value);

} // OneToOne
