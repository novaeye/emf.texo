/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToMany.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>One To Many</b></em>'. <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface OneToMany { Class targetEntity() default void.class;
 *                  CascadeType[] cascade() default {}; FetchType fetch() default LAZY; String mappedBy() default ""; }
 * 
 * 
 *                  <!-- end-model-doc -->
 * 
 *                  <p>
 *                  The following features are supported:
 *                  <ul>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderBy <em>Order By</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderColumn <em>Order Column
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKey <em>Map Key</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyClass <em>Map Key Class
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyTemporal <em>Map Key
 *                  Temporal</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyEnumerated <em>Map Key
 *                  Enumerated</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyConvert <em>Map Key
 *                  Convert</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyAttributeOverride <em>
 *                  Map Key Attribute Override</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyAssociationOverride
 *                  <em>Map Key Association Override</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyColumn <em>Map Key
 *                  Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyJoinColumn <em>Map Key
 *                  Join Column</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getConverter <em>Converter</em>}
 *                  </li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTypeConverter <em>Type
 *                  Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getObjectTypeConverter <em>
 *                  Object Type Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getStructConverter <em>Struct
 *                  Converter</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinTable <em>Join Table
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinColumn <em>Join Column
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getCascade <em>Cascade</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getPrivateOwned <em>Private
 *                  Owned</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinFetch <em>Join Fetch
 *                  </em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getProperty <em>Property</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccessMethods <em>Access
 *                  Methods</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccess <em>Access</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getFetch <em>Fetch</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMappedBy <em>Mapped By</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getName <em>Name</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#isOrphanRemoval <em>Orphan
 *                  Removal</em>}</li>
 *                  <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTargetEntity <em>Target
 *                  Entity</em>}</li>
 *                  </ul>
 *                  </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany()
 * @model extendedMetaData="name='one-to-many' kind='elementOnly'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface OneToMany extends BaseOrmAnnotation {
  /**
   * Returns the value of the '<em><b>Order By</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Order By</em>' attribute.
   * @see #setOrderBy(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_OrderBy()
   * @model dataType="org.eclipse.emf.texo.orm.annotations.model.orm.OrderBy"
   *        extendedMetaData="kind='element' name='order-by' namespace='##targetNamespace'"
   * @generated
   */
  String getOrderBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderBy
   * <em>Order By</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Order By</em>' attribute.
   * @see #getOrderBy()
   * @generated
   */
  void setOrderBy(String value);

  /**
   * Returns the value of the '<em><b>Order Column</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Order Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Order Column</em>' containment reference.
   * @see #setOrderColumn(OrderColumn)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_OrderColumn()
   * @model containment="true" extendedMetaData="kind='element' name='order-column' namespace='##targetNamespace'"
   * @generated
   */
  OrderColumn getOrderColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderColumn
   * <em>Order Column</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Order Column</em>' containment reference.
   * @see #getOrderColumn()
   * @generated
   */
  void setOrderColumn(OrderColumn value);

  /**
   * Returns the value of the '<em><b>Map Key</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key</em>' containment reference.
   * @see #setMapKey(MapKey)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKey()
   * @model containment="true" extendedMetaData="kind='element' name='map-key' namespace='##targetNamespace'"
   * @generated
   */
  MapKey getMapKey();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKey <em>Map Key</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Map Key</em>' containment reference.
   * @see #getMapKey()
   * @generated
   */
  void setMapKey(MapKey value);

  /**
   * Returns the value of the '<em><b>Map Key Class</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Class</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Class</em>' containment reference.
   * @see #setMapKeyClass(MapKeyClass)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyClass()
   * @model containment="true" extendedMetaData="kind='element' name='map-key-class' namespace='##targetNamespace'"
   * @generated
   */
  MapKeyClass getMapKeyClass();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyClass
   * <em>Map Key Class</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Map Key Class</em>' containment reference.
   * @see #getMapKeyClass()
   * @generated
   */
  void setMapKeyClass(MapKeyClass value);

  /**
   * Returns the value of the '<em><b>Map Key Temporal</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Temporal}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Temporal</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Temporal</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Temporal
   * @see #isSetMapKeyTemporal()
   * @see #unsetMapKeyTemporal()
   * @see #setMapKeyTemporal(Temporal)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyTemporal()
   * @model unsettable="true" extendedMetaData="kind='element' name='map-key-temporal' namespace='##targetNamespace'"
   * @generated
   */
  Temporal getMapKeyTemporal();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyTemporal
   * <em>Map Key Temporal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Map Key Temporal</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Temporal
   * @see #isSetMapKeyTemporal()
   * @see #unsetMapKeyTemporal()
   * @see #getMapKeyTemporal()
   * @generated
   */
  void setMapKeyTemporal(Temporal value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyTemporal
   * <em>Map Key Temporal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetMapKeyTemporal()
   * @see #getMapKeyTemporal()
   * @see #setMapKeyTemporal(Temporal)
   * @generated
   */
  void unsetMapKeyTemporal();

  /**
   * Returns whether the value of the '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'
   * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Map Key Temporal</em>' attribute is set.
   * @see #unsetMapKeyTemporal()
   * @see #getMapKeyTemporal()
   * @see #setMapKeyTemporal(Temporal)
   * @generated
   */
  boolean isSetMapKeyTemporal();

  /**
   * Returns the value of the '<em><b>Map Key Enumerated</b></em>' attribute. The literals are from the enumeration
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Enumerated</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Enumerated</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated
   * @see #isSetMapKeyEnumerated()
   * @see #unsetMapKeyEnumerated()
   * @see #setMapKeyEnumerated(Enumerated)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyEnumerated()
   * @model unsettable="true" extendedMetaData="kind='element' name='map-key-enumerated' namespace='##targetNamespace'"
   * @generated
   */
  Enumerated getMapKeyEnumerated();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyEnumerated
   * <em>Map Key Enumerated</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Map Key Enumerated</em>' attribute.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated
   * @see #isSetMapKeyEnumerated()
   * @see #unsetMapKeyEnumerated()
   * @see #getMapKeyEnumerated()
   * @generated
   */
  void setMapKeyEnumerated(Enumerated value);

  /**
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyEnumerated
   * <em>Map Key Enumerated</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetMapKeyEnumerated()
   * @see #getMapKeyEnumerated()
   * @see #setMapKeyEnumerated(Enumerated)
   * @generated
   */
  void unsetMapKeyEnumerated();

  /**
   * Returns whether the value of the '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'
   * attribute is set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return whether the value of the '<em>Map Key Enumerated</em>' attribute is set.
   * @see #unsetMapKeyEnumerated()
   * @see #getMapKeyEnumerated()
   * @see #setMapKeyEnumerated(Enumerated)
   * @generated
   */
  boolean isSetMapKeyEnumerated();

  /**
   * Returns the value of the '<em><b>Map Key Convert</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Convert</em>' attribute isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Convert</em>' attribute.
   * @see #setMapKeyConvert(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyConvert()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String"
   *        extendedMetaData="kind='element' name='map-key-convert' namespace='##targetNamespace'"
   * @generated
   */
  String getMapKeyConvert();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyConvert
   * <em>Map Key Convert</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Map Key Convert</em>' attribute.
   * @see #getMapKeyConvert()
   * @generated
   */
  void setMapKeyConvert(String value);

  /**
   * Returns the value of the '<em><b>Map Key Attribute Override</b></em>' containment reference list. The list contents
   * are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Attribute Override</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Attribute Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyAttributeOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-attribute-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AttributeOverride> getMapKeyAttributeOverride();

  /**
   * Returns the value of the '<em><b>Map Key Association Override</b></em>' containment reference list. The list
   * contents are of type {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride}. <!--
   * begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Association Override</em>' containment reference list isn't clear, there really
   * should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Association Override</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyAssociationOverride()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-association-override' namespace='##targetNamespace'"
   * @generated
   */
  EList<AssociationOverride> getMapKeyAssociationOverride();

  /**
   * Returns the value of the '<em><b>Map Key Column</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Column</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Column</em>' containment reference.
   * @see #setMapKeyColumn(MapKeyColumn)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyColumn()
   * @model containment="true" extendedMetaData="kind='element' name='map-key-column' namespace='##targetNamespace'"
   * @generated
   */
  MapKeyColumn getMapKeyColumn();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyColumn
   * <em>Map Key Column</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Map Key Column</em>' containment reference.
   * @see #getMapKeyColumn()
   * @generated
   */
  void setMapKeyColumn(MapKeyColumn value);

  /**
   * Returns the value of the '<em><b>Map Key Join Column</b></em>' containment reference list. The list contents are of
   * type {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn}. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map Key Join Column</em>' containment reference list isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Map Key Join Column</em>' containment reference list.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MapKeyJoinColumn()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='map-key-join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<MapKeyJoinColumn> getMapKeyJoinColumn();

  /**
   * Returns the value of the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Converter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Converter</em>' containment reference.
   * @see #setConverter(Converter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_Converter()
   * @model containment="true" extendedMetaData="kind='element' name='converter' namespace='##targetNamespace'"
   * @generated
   */
  Converter getConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getConverter
   * <em>Converter</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Converter</em>' containment reference.
   * @see #getConverter()
   * @generated
   */
  void setConverter(Converter value);

  /**
   * Returns the value of the '<em><b>Type Converter</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Converter</em>' containment reference isn't clear, there really should be more of a
   * description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Type Converter</em>' containment reference.
   * @see #setTypeConverter(TypeConverter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_TypeConverter()
   * @model containment="true" extendedMetaData="kind='element' name='type-converter' namespace='##targetNamespace'"
   * @generated
   */
  TypeConverter getTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTypeConverter
   * <em>Type Converter</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Type Converter</em>' containment reference.
   * @see #getTypeConverter()
   * @generated
   */
  void setTypeConverter(TypeConverter value);

  /**
   * Returns the value of the '<em><b>Object Type Converter</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Object Type Converter</em>' containment reference isn't clear, there really should be
   * more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Object Type Converter</em>' containment reference.
   * @see #setObjectTypeConverter(ObjectTypeConverter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_ObjectTypeConverter()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='object-type-converter' namespace='##targetNamespace'"
   * @generated
   */
  ObjectTypeConverter getObjectTypeConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getObjectTypeConverter
   * <em>Object Type Converter</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Object Type Converter</em>' containment reference.
   * @see #getObjectTypeConverter()
   * @generated
   */
  void setObjectTypeConverter(ObjectTypeConverter value);

  /**
   * Returns the value of the '<em><b>Struct Converter</b></em>' containment reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Converter</em>' containment reference isn't clear, there really should be more of
   * a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Struct Converter</em>' containment reference.
   * @see #setStructConverter(StructConverter)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_StructConverter()
   * @model containment="true" extendedMetaData="kind='element' name='struct-converter' namespace='##targetNamespace'"
   * @generated
   */
  StructConverter getStructConverter();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getStructConverter
   * <em>Struct Converter</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Struct Converter</em>' containment reference.
   * @see #getStructConverter()
   * @generated
   */
  void setStructConverter(StructConverter value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_JoinTable()
   * @model containment="true" extendedMetaData="kind='element' name='join-table' namespace='##targetNamespace'"
   * @generated
   */
  JoinTable getJoinTable();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinTable
   * <em>Join Table</em>}' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Join Table</em>' containment reference.
   * @see #getJoinTable()
   * @generated
   */
  void setJoinTable(JoinTable value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_JoinColumn()
   * @model containment="true" extendedMetaData="kind='element' name='join-column' namespace='##targetNamespace'"
   * @generated
   */
  EList<JoinColumn> getJoinColumn();

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_Cascade()
   * @model containment="true" extendedMetaData="kind='element' name='cascade' namespace='##targetNamespace'"
   * @generated
   */
  CascadeType getCascade();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getCascade <em>Cascade</em>}
   * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_PrivateOwned()
   * @model containment="true" extendedMetaData="kind='element' name='private-owned' namespace='##targetNamespace'"
   * @generated
   */
  EmptyType getPrivateOwned();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getPrivateOwned
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_JoinFetch()
   * @model unsettable="true" extendedMetaData="kind='element' name='join-fetch' namespace='##targetNamespace'"
   * @generated
   */
  JoinFetchType getJoinFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinFetch
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinFetch
   * <em>Join Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetJoinFetch()
   * @see #getJoinFetch()
   * @see #setJoinFetch(JoinFetchType)
   * @generated
   */
  void unsetJoinFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinFetch
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_Property()
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_AccessMethods()
   * @model containment="true" extendedMetaData="kind='element' name='access-methods' namespace='##targetNamespace'"
   * @generated
   */
  AccessMethods getAccessMethods();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccessMethods
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_Access()
   * @model unsettable="true" extendedMetaData="kind='attribute' name='access'"
   * @generated
   */
  AccessType getAccess();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccess <em>Access</em>}'
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccess <em>Access</em>}
   * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetAccess()
   * @see #getAccess()
   * @see #setAccess(AccessType)
   * @generated
   */
  void unsetAccess();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccess
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_Fetch()
   * @model unsettable="true" extendedMetaData="kind='attribute' name='fetch'"
   * @generated
   */
  FetchType getFetch();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getFetch <em>Fetch</em>}'
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getFetch <em>Fetch</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetFetch()
   * @see #getFetch()
   * @see #setFetch(FetchType)
   * @generated
   */
  void unsetFetch();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getFetch
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
   * Returns the value of the '<em><b>Mapped By</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped By</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Mapped By</em>' attribute.
   * @see #setMappedBy(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_MappedBy()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData="kind='attribute' name='mapped-by'"
   * @generated
   */
  String getMappedBy();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMappedBy
   * <em>Mapped By</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Mapped By</em>' attribute.
   * @see #getMappedBy()
   * @generated
   */
  void setMappedBy(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_Name()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='attribute' name='name'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getName <em>Name</em>}'
   * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_OrphanRemoval()
   * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
   *        extendedMetaData="kind='attribute' name='orphan-removal'"
   * @generated
   */
  boolean isOrphanRemoval();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#isOrphanRemoval
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
   * Unsets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#isOrphanRemoval
   * <em>Orphan Removal</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isSetOrphanRemoval()
   * @see #isOrphanRemoval()
   * @see #setOrphanRemoval(boolean)
   * @generated
   */
  void unsetOrphanRemoval();

  /**
   * Returns whether the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#isOrphanRemoval
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
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getOneToMany_TargetEntity()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" extendedMetaData="kind='attribute' name='target-entity'"
   * @generated
   */
  String getTargetEntity();

  /**
   * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTargetEntity
   * <em>Target Entity</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Target Entity</em>' attribute.
   * @see #getTargetEntity()
   * @generated
   */
  void setTargetEntity(String value);

} // OneToMany
