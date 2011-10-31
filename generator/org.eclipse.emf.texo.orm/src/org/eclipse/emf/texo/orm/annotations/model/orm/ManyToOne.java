/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToOne.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Many To One</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface ManyToOne {
 * 				Class targetEntity() default
 * 				void.class;
 * 				CascadeType[] cascade() default {};
 * 				FetchType fetch()
 * 				default EAGER;
 * 				boolean optional() default true;
 * 				}
 * 
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getMapsId <em>Maps Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne()
 * @model extendedMetaData="name='many-to-one' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface ManyToOne extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Join Column</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Column</em>' containment reference list isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_JoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<JoinColumn> getJoinColumn();

  /**
   * Returns the value of the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Table</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Table</em>' containment reference.
   * @see #setJoinTable(JoinTable)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_JoinTable()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
   * @generated
   */
  JoinTable getJoinTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinTable <em>Join Table</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  void setJoinTable(JoinTable value);

  /**
   * Returns the value of the '<em><b>Cascade</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cascade</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cascade</em>' containment reference.
   * @see #setCascade(CascadeType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Cascade()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cascade' namespace='##targetNamespace'"
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getCascade <em>Cascade</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Cascade</em>' containment reference.
   * @see #getCascade()
   * @generated
   */
  void setCascade(CascadeType value);

  /**
   * Returns the value of the '<em><b>Join Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Join Fetch</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_JoinFetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
  JoinFetchType getJoinFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see #isSetJoinFetch()
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @generated
   */
  void setJoinFetch(JoinFetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinFetch <em>Join Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  void unsetJoinFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinFetch <em>Join Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Join Fetch</em>' attribute is set.
   * @see #unsetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  boolean isSetJoinFetch();

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Property()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
   * @generated
   */
  EList<Property> getProperty();

  /**
   * Returns the value of the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access Methods</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access Methods</em>' containment reference.
   * @see #setAccessMethods(AccessMethods)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_AccessMethods()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccessMethods <em>Access Methods</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access Methods</em>' containment reference.
   * @see #getAccessMethods()
   * @generated
   */
  void setAccessMethods(AccessMethods value);

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #setAccess(AccessType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Access()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see #isSetAccess()
   * @see #unsetAccess()
   * @see #getAccess()
   * @generated
   */
  void setAccess(AccessType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccess <em>Access</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Access</em>' attribute is set.
   * @see #unsetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  boolean isSetAccess();

  /**
   * Returns the value of the '<em><b>Fetch</b></em>' attribute.
   * The literals are from the enumeration {@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fetch</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #setFetch(FetchType)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Fetch()
   * @model unsettable="true"
   *        extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Fetch</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see #isSetFetch()
   * @see #unsetFetch()
   * @see #getFetch()
   * @generated
   */
  void setFetch(FetchType value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getFetch <em>Fetch</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getFetch <em>Fetch</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Fetch</em>' attribute is set.
   * @see #unsetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  boolean isSetFetch();

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #setId(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Id()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='id'"
   * @generated
   */
  boolean isId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isId <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #isSetId()
   * @see #unsetId()
   * @see #isId()
   * @generated
   */
  void setId(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isId <em>Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetId()
   * @see #isId()
   * @see #setId(boolean)
   * @generated
   */
  void unsetId();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isId <em>Id</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Id</em>' attribute is set.
   * @see #unsetId()
   * @see #isId()
   * @see #setId(boolean)
   * @generated
   */
  boolean isSetId();

  /**
   * Returns the value of the '<em><b>Maps Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Maps Id</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Maps Id</em>' attribute.
   * @see #setMapsId(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_MapsId()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='maps-id'"
   * @generated
   */
  String getMapsId();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getMapsId <em>Maps Id</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Maps Id</em>' attribute.
   * @see #getMapsId()
   * @generated
   */
  void setMapsId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #setOptional(boolean)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_Optional()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='optional'"
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isSetOptional()
   * @see #unsetOptional()
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see #isSetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  void unsetOptional();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isOptional <em>Optional</em>}' attribute is set.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return whether the value of the '<em>Optional</em>' attribute is set.
   * @see #unsetOptional()
   * @see #isOptional()
   * @see #setOptional(boolean)
   * @generated
   */
  boolean isSetOptional();

  /**
   * Returns the value of the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Entity</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Entity</em>' attribute.
   * @see #setTargetEntity(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getManyToOne_TargetEntity()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='attribute' name='target-entity'"
   * @generated
   */
  String getTargetEntity();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getTargetEntity <em>Target Entity</em>}' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Entity</em>' attribute.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(String value);

} // ManyToOne
