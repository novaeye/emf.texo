/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmPackage.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc --> <!-- begin-model-doc -->
 * 
 * @(#)eclipselink_orm_2_0.xsd 2.0 October 5 2008
 * 
 *                             <![CDATA[
 * 
 *                             This is the XML Schema for the native Eclipselink XML mapping file The file may be named
 *                             "META-INF/eclipselink-orm.xml" in the persistence archive or it may be named some other
 *                             name which would be used to locate the file as resource on the classpath.
 *                             Object/relational mapping files must indicate the object/relational mapping file schema
 *                             by using the persistence namespace:
 * 
 *                             http://www.eclipse.org/eclipselink/xsds/persistence/orm
 * 
 *                             and indicate the version of the schema by using the version element as shown below:
 * 
 *                             <entity-mappings xmlns="http://www.eclipse.org/eclipselink/xsds/persistence/orm"
 *                             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *                             xsi:schemaLocation="http://www.eclipse.org/eclipselink/xsds/persistence/orm
 *                             eclipselink_orm_2_0.xsd version="2.0"> ... </entity-mappings>
 * 
 *                             ]]> <!-- end-model-doc -->
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory
 * @model kind="package"
 * @generated
 */
public interface OrmPackage extends EPackage {
  /**
   * The package name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "orm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/eclipselink/xsds/persistence/orm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "orm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   */
  OrmPackage eINSTANCE = org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AccessMethodsImpl <em>Access Methods</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.AccessMethodsImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getAccessMethods()
   * @generated
   */
  int ACCESS_METHODS = 0;

  /**
   * The feature id for the '<em><b>Get Method</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_METHODS__GET_METHOD = 0;

  /**
   * The feature id for the '<em><b>Set Method</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCESS_METHODS__SET_METHOD = 1;

  /**
   * The number of structural features of the '<em>Access Methods</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ACCESS_METHODS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AssociationOverrideImpl <em>Association Override</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.AssociationOverrideImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getAssociationOverride()
   * @generated
   */
  int ASSOCIATION_OVERRIDE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OVERRIDE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OVERRIDE__JOIN_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OVERRIDE__JOIN_TABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OVERRIDE__NAME = 3;

  /**
   * The number of structural features of the '<em>Association Override</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_OVERRIDE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributeOverrideImpl <em>Attribute Override</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributeOverrideImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getAttributeOverride()
   * @generated
   */
  int ATTRIBUTE_OVERRIDE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OVERRIDE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OVERRIDE__COLUMN = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OVERRIDE__NAME = 2;

  /**
   * The number of structural features of the '<em>Attribute Override</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_OVERRIDE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl <em>Attributes</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.AttributesImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getAttributes()
   * @generated
   */
  int ATTRIBUTES = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ID = 1;

  /**
   * The feature id for the '<em><b>Embedded Id</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__EMBEDDED_ID = 2;

  /**
   * The feature id for the '<em><b>Basic</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__BASIC = 3;

  /**
   * The feature id for the '<em><b>Basic Collection</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__BASIC_COLLECTION = 4;

  /**
   * The feature id for the '<em><b>Basic Map</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__BASIC_MAP = 5;

  /**
   * The feature id for the '<em><b>Version</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__VERSION = 6;

  /**
   * The feature id for the '<em><b>Many To One</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__MANY_TO_ONE = 7;

  /**
   * The feature id for the '<em><b>One To Many</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ONE_TO_MANY = 8;

  /**
   * The feature id for the '<em><b>One To One</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ONE_TO_ONE = 9;

  /**
   * The feature id for the '<em><b>Variable One To One</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__VARIABLE_ONE_TO_ONE = 10;

  /**
   * The feature id for the '<em><b>Many To Many</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__MANY_TO_MANY = 11;

  /**
   * The feature id for the '<em><b>Element Collection</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__ELEMENT_COLLECTION = 12;

  /**
   * The feature id for the '<em><b>Embedded</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__EMBEDDED = 13;

  /**
   * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__TRANSFORMATION = 14;

  /**
   * The feature id for the '<em><b>Transient</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES__TRANSIENT = 15;

  /**
   * The number of structural features of the '<em>Attributes</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTES_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl <em>Basic</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getBasic()
   * @generated
   */
  int BASIC = 4;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int BASIC__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__GENERATED_VALUE = 1;

  /**
   * The feature id for the '<em><b>Lob</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__LOB = 2;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__TEMPORAL = 3;

  /**
   * The feature id for the '<em><b>Enumerated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__ENUMERATED = 4;

  /**
   * The feature id for the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__CONVERT = 5;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int BASIC__CONVERTER = 6;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__TYPE_CONVERTER = 7;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__OBJECT_TYPE_CONVERTER = 8;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__STRUCT_CONVERTER = 9;

  /**
   * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__TABLE_GENERATOR = 10;

  /**
   * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__SEQUENCE_GENERATOR = 11;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__PROPERTY = 12;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__ACCESS_METHODS = 13;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__ACCESS = 14;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__FETCH = 15;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__MUTABLE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__NAME = 17;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC__OPTIONAL = 18;

  /**
   * The number of structural features of the '<em>Basic</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_FEATURE_COUNT = 19;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl <em>Basic Collection</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicCollectionImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getBasicCollection()
   * @generated
   */
  int BASIC_COLLECTION = 5;

  /**
   * The feature id for the '<em><b>Value Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__VALUE_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__CONVERT = 1;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__CONVERTER = 2;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__TYPE_CONVERTER = 3;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__OBJECT_TYPE_CONVERTER = 4;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__STRUCT_CONVERTER = 5;

  /**
   * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__COLLECTION_TABLE = 6;

  /**
   * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__JOIN_FETCH = 7;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__PROPERTY = 8;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__ACCESS_METHODS = 9;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__ACCESS = 10;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__FETCH = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION__NAME = 12;

  /**
   * The number of structural features of the '<em>Basic Collection</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_COLLECTION_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl <em>Basic Map</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.BasicMapImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getBasicMap()
   * @generated
   */
  int BASIC_MAP = 6;

  /**
   * The feature id for the '<em><b>Key Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__KEY_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Key Converter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__KEY_CONVERTER = 1;

  /**
   * The feature id for the '<em><b>Value Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__VALUE_COLUMN = 2;

  /**
   * The feature id for the '<em><b>Value Converter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__VALUE_CONVERTER = 3;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__GROUP = 4;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__CONVERTER = 5;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__TYPE_CONVERTER = 6;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__OBJECT_TYPE_CONVERTER = 7;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__STRUCT_CONVERTER = 8;

  /**
   * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__COLLECTION_TABLE = 9;

  /**
   * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__JOIN_FETCH = 10;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__PROPERTY = 11;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__ACCESS_METHODS = 12;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__ACCESS = 13;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__FETCH = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP__NAME = 15;

  /**
   * The number of structural features of the '<em>Basic Map</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_MAP_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl <em>Cache</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCache()
   * @generated
   */
  int CACHE = 7;

  /**
   * The feature id for the '<em><b>Expiry</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__EXPIRY = 0;

  /**
   * The feature id for the '<em><b>Expiry Time Of Day</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__EXPIRY_TIME_OF_DAY = 1;

  /**
   * The feature id for the '<em><b>Always Refresh</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__ALWAYS_REFRESH = 2;

  /**
   * The feature id for the '<em><b>Coordination Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__COORDINATION_TYPE = 3;

  /**
   * The feature id for the '<em><b>Disable Hits</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__DISABLE_HITS = 4;

  /**
   * The feature id for the '<em><b>Refresh Only If Newer</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int CACHE__REFRESH_ONLY_IF_NEWER = 5;

  /**
   * The feature id for the '<em><b>Shared</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__SHARED = 6;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__SIZE = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE__TYPE = 8;

  /**
   * The number of structural features of the '<em>Cache</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheInterceptorImpl <em>Cache Interceptor</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CacheInterceptorImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCacheInterceptor()
   * @generated
   */
  int CACHE_INTERCEPTOR = 8;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_INTERCEPTOR__CLASS = 0;

  /**
   * The number of structural features of the '<em>Cache Interceptor</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CACHE_INTERCEPTOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CascadeTypeImpl <em>Cascade Type</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CascadeTypeImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCascadeType()
   * @generated
   */
  int CASCADE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Cascade All</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CASCADE_TYPE__CASCADE_ALL = 0;

  /**
   * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CASCADE_TYPE__CASCADE_PERSIST = 1;

  /**
   * The feature id for the '<em><b>Cascade Merge</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CASCADE_TYPE__CASCADE_MERGE = 2;

  /**
   * The feature id for the '<em><b>Cascade Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CASCADE_TYPE__CASCADE_REMOVE = 3;

  /**
   * The feature id for the '<em><b>Cascade Refresh</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CASCADE_TYPE__CASCADE_REFRESH = 4;

  /**
   * The number of structural features of the '<em>Cascade Type</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int CASCADE_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ChangeTrackingImpl <em>Change Tracking</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ChangeTrackingImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getChangeTracking()
   * @generated
   */
  int CHANGE_TRACKING = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_TRACKING__TYPE = 0;

  /**
   * The number of structural features of the '<em>Change Tracking</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CHANGE_TRACKING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CloneCopyPolicyImpl <em>Clone Copy Policy</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CloneCopyPolicyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCloneCopyPolicy()
   * @generated
   */
  int CLONE_COPY_POLICY = 11;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLONE_COPY_POLICY__METHOD = 0;

  /**
   * The feature id for the '<em><b>Working Copy Method</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int CLONE_COPY_POLICY__WORKING_COPY_METHOD = 1;

  /**
   * The number of structural features of the '<em>Clone Copy Policy</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CLONE_COPY_POLICY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CollectionTableImpl <em>Collection Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CollectionTableImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCollectionTable()
   * @generated
   */
  int COLLECTION_TABLE = 12;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TABLE__JOIN_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TABLE__UNIQUE_CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TABLE__CATALOG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TABLE__NAME = 3;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TABLE__SCHEMA = 4;

  /**
   * The number of structural features of the '<em>Collection Table</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TABLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ColumnImpl <em>Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getColumn()
   * @generated
   */
  int COLUMN = 13;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Insertable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__INSERTABLE = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__LENGTH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NAME = 3;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__NULLABLE = 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__PRECISION = 5;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__SCALE = 6;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__TABLE = 7;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__UNIQUE = 8;

  /**
   * The feature id for the '<em><b>Updatable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN__UPDATABLE = 9;

  /**
   * The number of structural features of the '<em>Column</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ColumnResultImpl <em>Column Result</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ColumnResultImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getColumnResult()
   * @generated
   */
  int COLUMN_RESULT = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLUMN_RESULT__NAME = 0;

  /**
   * The number of structural features of the '<em>Column Result</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int COLUMN_RESULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ConversionValueImpl <em>Conversion Value</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ConversionValueImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getConversionValue()
   * @generated
   */
  int CONVERSION_VALUE = 15;

  /**
   * The feature id for the '<em><b>Data Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_VALUE__DATA_VALUE = 0;

  /**
   * The feature id for the '<em><b>Object Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_VALUE__OBJECT_VALUE = 1;

  /**
   * The number of structural features of the '<em>Conversion Value</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERSION_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ConverterImpl <em>Converter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ConverterImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getConverter()
   * @generated
   */
  int CONVERTER = 16;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER__CLASS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER__NAME = 1;

  /**
   * The number of structural features of the '<em>Converter</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONVERTER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CopyPolicyImpl <em>Copy Policy</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CopyPolicyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCopyPolicy()
   * @generated
   */
  int COPY_POLICY = 17;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPY_POLICY__CLASS = 0;

  /**
   * The number of structural features of the '<em>Copy Policy</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int COPY_POLICY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.CustomizerImpl <em>Customizer</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.CustomizerImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCustomizer()
   * @generated
   */
  int CUSTOMIZER = 18;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMIZER__CLASS = 0;

  /**
   * The number of structural features of the '<em>Customizer</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOMIZER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.DiscriminatorClassImpl <em>Discriminator Class</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.DiscriminatorClassImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDiscriminatorClass()
   * @generated
   */
  int DISCRIMINATOR_CLASS = 19;

  /**
   * The feature id for the '<em><b>Discriminator</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_CLASS__DISCRIMINATOR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_CLASS__VALUE = 1;

  /**
   * The number of structural features of the '<em>Discriminator Class</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_CLASS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.DiscriminatorColumnImpl <em>Discriminator Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.DiscriminatorColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDiscriminatorColumn()
   * @generated
   */
  int DISCRIMINATOR_COLUMN = 20;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Discriminator Type</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_COLUMN__DISCRIMINATOR_TYPE = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_COLUMN__LENGTH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_COLUMN__NAME = 3;

  /**
   * The number of structural features of the '<em>Discriminator Column</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DISCRIMINATOR_COLUMN_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.DocumentRootImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 21;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Entity Mappings</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__ENTITY_MAPPINGS = 3;

  /**
   * The number of structural features of the '<em>Document Root</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EclipselinkCollectionTableImpl <em>Eclipselink Collection Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EclipselinkCollectionTableImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEclipselinkCollectionTable()
   * @generated
   */
  int ECLIPSELINK_COLLECTION_TABLE = 22;

  /**
   * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSELINK_COLLECTION_TABLE__PRIMARY_KEY_JOIN_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSELINK_COLLECTION_TABLE__UNIQUE_CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSELINK_COLLECTION_TABLE__CATALOG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSELINK_COLLECTION_TABLE__NAME = 3;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSELINK_COLLECTION_TABLE__SCHEMA = 4;

  /**
   * The number of structural features of the '<em>Eclipselink Collection Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECLIPSELINK_COLLECTION_TABLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl <em>Element Collection</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ElementCollectionImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getElementCollection()
   * @generated
   */
  int ELEMENT_COLLECTION = 23;

  /**
   * The feature id for the '<em><b>Order By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ORDER_BY = 0;

  /**
   * The feature id for the '<em><b>Order Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ORDER_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Map Key</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY = 2;

  /**
   * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_CLASS = 3;

  /**
   * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_TEMPORAL = 4;

  /**
   * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_ENUMERATED = 5;

  /**
   * The feature id for the '<em><b>Map Key Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_CONVERT = 6;

  /**
   * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_ATTRIBUTE_OVERRIDE = 7;

  /**
   * The feature id for the '<em><b>Map Key Association Override</b></em>' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_ASSOCIATION_OVERRIDE = 8;

  /**
   * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_COLUMN = 9;

  /**
   * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__MAP_KEY_JOIN_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__COLUMN = 11;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__TEMPORAL = 12;

  /**
   * The feature id for the '<em><b>Enumerated</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ENUMERATED = 13;

  /**
   * The feature id for the '<em><b>Lob</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__LOB = 14;

  /**
   * The feature id for the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__CONVERT = 15;

  /**
   * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ATTRIBUTE_OVERRIDE = 16;

  /**
   * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ASSOCIATION_OVERRIDE = 17;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__GROUP = 18;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__CONVERTER = 19;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__TYPE_CONVERTER = 20;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__OBJECT_TYPE_CONVERTER = 21;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__STRUCT_CONVERTER = 22;

  /**
   * The feature id for the '<em><b>Collection Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__COLLECTION_TABLE = 23;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__PROPERTY = 24;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ACCESS_METHODS = 25;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__ACCESS = 26;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__FETCH = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__NAME = 28;

  /**
   * The feature id for the '<em><b>Target Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION__TARGET_CLASS = 29;

  /**
   * The number of structural features of the '<em>Element Collection</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_COLLECTION_FEATURE_COUNT = 30;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl <em>Embeddable</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddableImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEmbeddable()
   * @generated
   */
  int EMBEDDABLE = 24;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Customizer</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__CUSTOMIZER = 1;

  /**
   * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__CHANGE_TRACKING = 2;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__CONVERTER = 3;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__TYPE_CONVERTER = 4;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__OBJECT_TYPE_CONVERTER = 5;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__STRUCT_CONVERTER = 6;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__ATTRIBUTES = 8;

  /**
   * The feature id for the '<em><b>Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__COPY_POLICY = 9;

  /**
   * The feature id for the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__INSTANTIATION_COPY_POLICY = 10;

  /**
   * The feature id for the '<em><b>Clone Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__CLONE_COPY_POLICY = 11;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__ACCESS = 12;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__CLASS = 13;

  /**
   * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__EXCLUDE_DEFAULT_MAPPINGS = 14;

  /**
   * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE__METADATA_COMPLETE = 15;

  /**
   * The number of structural features of the '<em>Embeddable</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDABLE_FEATURE_COUNT = 16;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl <em>Embedded</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEmbedded()
   * @generated
   */
  int EMBEDDED = 25;

  /**
   * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED__ATTRIBUTE_OVERRIDE = 0;

  /**
   * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED__ASSOCIATION_OVERRIDE = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED__PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED__ACCESS_METHODS = 3;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED__ACCESS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED__NAME = 5;

  /**
   * The number of structural features of the '<em>Embedded</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedIdImpl <em>Embedded Id</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmbeddedIdImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEmbeddedId()
   * @generated
   */
  int EMBEDDED_ID = 26;

  /**
   * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_ID__ATTRIBUTE_OVERRIDE = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_ID__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_ID__ACCESS_METHODS = 2;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_ID__ACCESS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBEDDED_ID__NAME = 4;

  /**
   * The number of structural features of the '<em>Embedded Id</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int EMBEDDED_ID_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmptyTypeImpl <em>Empty Type</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EmptyTypeImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEmptyType()
   * @generated
   */
  int EMPTY_TYPE = 27;

  /**
   * The number of structural features of the '<em>Empty Type</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMPTY_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 28;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Customizer</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CUSTOMIZER = 1;

  /**
   * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CHANGE_TRACKING = 2;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TABLE = 3;

  /**
   * The feature id for the '<em><b>Secondary Table</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SECONDARY_TABLE = 4;

  /**
   * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRIMARY_KEY_JOIN_COLUMN = 5;

  /**
   * The feature id for the '<em><b>Id Class</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY__ID_CLASS = 6;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRIMARY_KEY = 7;

  /**
   * The feature id for the '<em><b>Inheritance</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__INHERITANCE = 8;

  /**
   * The feature id for the '<em><b>Discriminator Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY__DISCRIMINATOR_VALUE = 9;

  /**
   * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__DISCRIMINATOR_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Optimistic Locking</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__OPTIMISTIC_LOCKING = 11;

  /**
   * The feature id for the '<em><b>Cache</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CACHE = 12;

  /**
   * The feature id for the '<em><b>Cache Interceptor</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CACHE_INTERCEPTOR = 13;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CONVERTER = 14;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TYPE_CONVERTER = 15;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__OBJECT_TYPE_CONVERTER = 16;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__STRUCT_CONVERTER = 17;

  /**
   * The feature id for the '<em><b>Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__COPY_POLICY = 18;

  /**
   * The feature id for the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__INSTANTIATION_COPY_POLICY = 19;

  /**
   * The feature id for the '<em><b>Clone Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CLONE_COPY_POLICY = 20;

  /**
   * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SEQUENCE_GENERATOR = 21;

  /**
   * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TABLE_GENERATOR = 22;

  /**
   * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAMED_QUERY = 23;

  /**
   * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAMED_NATIVE_QUERY = 24;

  /**
   * The feature id for the '<em><b>Named Stored Procedure Query</b></em>' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY__NAMED_STORED_PROCEDURE_QUERY = 25;

  /**
   * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__SQL_RESULT_SET_MAPPING = 26;

  /**
   * The feature id for the '<em><b>Query Redirectors</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__QUERY_REDIRECTORS = 27;

  /**
   * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXCLUDE_DEFAULT_LISTENERS = 28;

  /**
   * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXCLUDE_SUPERCLASS_LISTENERS = 29;

  /**
   * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITY_LISTENERS = 30;

  /**
   * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRE_PERSIST = 31;

  /**
   * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__POST_PERSIST = 32;

  /**
   * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRE_REMOVE = 33;

  /**
   * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__POST_REMOVE = 34;

  /**
   * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PRE_UPDATE = 35;

  /**
   * The feature id for the '<em><b>Post Update</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__POST_UPDATE = 36;

  /**
   * The feature id for the '<em><b>Post Load</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY__POST_LOAD = 37;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTY = 38;

  /**
   * The feature id for the '<em><b>Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTE_OVERRIDE = 39;

  /**
   * The feature id for the '<em><b>Association Override</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ASSOCIATION_OVERRIDE = 40;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTES = 41;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ACCESS = 42;

  /**
   * The feature id for the '<em><b>Cacheable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CACHEABLE = 43;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__CLASS = 44;

  /**
   * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__EXCLUDE_DEFAULT_MAPPINGS = 45;

  /**
   * The feature id for the '<em><b>Existence Checking</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY__EXISTENCE_CHECKING = 46;

  /**
   * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__METADATA_COMPLETE = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 48;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__READ_ONLY = 49;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 50;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityListenerImpl <em>Entity Listener</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityListenerImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEntityListener()
   * @generated
   */
  int ENTITY_LISTENER = 29;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__PRE_PERSIST = 1;

  /**
   * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__POST_PERSIST = 2;

  /**
   * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__PRE_REMOVE = 3;

  /**
   * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__POST_REMOVE = 4;

  /**
   * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__PRE_UPDATE = 5;

  /**
   * The feature id for the '<em><b>Post Update</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__POST_UPDATE = 6;

  /**
   * The feature id for the '<em><b>Post Load</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__POST_LOAD = 7;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER__CLASS = 8;

  /**
   * The number of structural features of the '<em>Entity Listener</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENER_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityListenersImpl <em>Entity Listeners</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityListenersImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEntityListeners()
   * @generated
   */
  int ENTITY_LISTENERS = 30;

  /**
   * The feature id for the '<em><b>Entity Listener</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENERS__ENTITY_LISTENER = 0;

  /**
   * The number of structural features of the '<em>Entity Listeners</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_LISTENERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl <em>Entity Mappings Type</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityMappingsTypeImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEntityMappingsType()
   * @generated
   */
  int ENTITY_MAPPINGS_TYPE = 31;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Persistence Unit Metadata</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__PERSISTENCE_UNIT_METADATA = 1;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__SCHEMA = 3;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__CATALOG = 4;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__ACCESS = 5;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__CONVERTER = 6;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__TYPE_CONVERTER = 7;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__OBJECT_TYPE_CONVERTER = 8;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__STRUCT_CONVERTER = 9;

  /**
   * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__SEQUENCE_GENERATOR = 10;

  /**
   * The feature id for the '<em><b>Table Generator</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__TABLE_GENERATOR = 11;

  /**
   * The feature id for the '<em><b>Named Query</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__NAMED_QUERY = 12;

  /**
   * The feature id for the '<em><b>Named Native Query</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__NAMED_NATIVE_QUERY = 13;

  /**
   * The feature id for the '<em><b>Named Stored Procedure Query</b></em>' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__NAMED_STORED_PROCEDURE_QUERY = 14;

  /**
   * The feature id for the '<em><b>Sql Result Set Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__SQL_RESULT_SET_MAPPING = 15;

  /**
   * The feature id for the '<em><b>Mapped Superclass</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__MAPPED_SUPERCLASS = 16;

  /**
   * The feature id for the '<em><b>Entity</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__ENTITY = 17;

  /**
   * The feature id for the '<em><b>Embeddable</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__EMBEDDABLE = 18;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE__VERSION = 19;

  /**
   * The number of structural features of the '<em>Entity Mappings Type</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_MAPPINGS_TYPE_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityResultImpl <em>Entity Result</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityResultImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEntityResult()
   * @generated
   */
  int ENTITY_RESULT = 32;

  /**
   * The feature id for the '<em><b>Field Result</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RESULT__FIELD_RESULT = 0;

  /**
   * The feature id for the '<em><b>Discriminator Column</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY_RESULT__DISCRIMINATOR_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Entity Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_RESULT__ENTITY_CLASS = 2;

  /**
   * The number of structural features of the '<em>Entity Result</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ENTITY_RESULT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.FieldResultImpl <em>Field Result</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.FieldResultImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getFieldResult()
   * @generated
   */
  int FIELD_RESULT = 33;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RESULT__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_RESULT__NAME = 1;

  /**
   * The number of structural features of the '<em>Field Result</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int FIELD_RESULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.GeneratedValueImpl <em>Generated Value</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.GeneratedValueImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getGeneratedValue()
   * @generated
   */
  int GENERATED_VALUE = 34;

  /**
   * The feature id for the '<em><b>Generator</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED_VALUE__GENERATOR = 0;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED_VALUE__STRATEGY = 1;

  /**
   * The number of structural features of the '<em>Generated Value</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERATED_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl <em>Id</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getId()
   * @generated
   */
  int ID = 35;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ID__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Generated Value</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__GENERATED_VALUE = 1;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__TEMPORAL = 2;

  /**
   * The feature id for the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__CONVERT = 3;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ID__CONVERTER = 4;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__TYPE_CONVERTER = 5;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__OBJECT_TYPE_CONVERTER = 6;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__STRUCT_CONVERTER = 7;

  /**
   * The feature id for the '<em><b>Table Generator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__TABLE_GENERATOR = 8;

  /**
   * The feature id for the '<em><b>Sequence Generator</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__SEQUENCE_GENERATOR = 9;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__PROPERTY = 10;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__ACCESS_METHODS = 11;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__ACCESS = 12;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__MUTABLE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID__NAME = 14;

  /**
   * The number of structural features of the '<em>Id</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdClassImpl <em>Id Class</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.IdClassImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getIdClass()
   * @generated
   */
  int ID_CLASS = 36;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_CLASS__CLASS = 0;

  /**
   * The number of structural features of the '<em>Id Class</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.InheritanceImpl <em>Inheritance</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.InheritanceImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getInheritance()
   * @generated
   */
  int INHERITANCE = 37;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INHERITANCE__STRATEGY = 0;

  /**
   * The number of structural features of the '<em>Inheritance</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int INHERITANCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.InstantiationCopyPolicyImpl <em>Instantiation Copy Policy</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.InstantiationCopyPolicyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getInstantiationCopyPolicy()
   * @generated
   */
  int INSTANTIATION_COPY_POLICY = 38;

  /**
   * The number of structural features of the '<em>Instantiation Copy Policy</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANTIATION_COPY_POLICY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinColumnImpl <em>Join Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getJoinColumn()
   * @generated
   */
  int JOIN_COLUMN = 39;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Insertable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__INSERTABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__NAME = 2;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__NULLABLE = 3;

  /**
   * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__REFERENCED_COLUMN_NAME = 4;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__TABLE = 5;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__UNIQUE = 6;

  /**
   * The feature id for the '<em><b>Updatable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_COLUMN__UPDATABLE = 7;

  /**
   * The number of structural features of the '<em>Join Column</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int JOIN_COLUMN_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl <em>Join Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.JoinTableImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getJoinTable()
   * @generated
   */
  int JOIN_TABLE = 40;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__JOIN_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Inverse Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__INVERSE_JOIN_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__UNIQUE_CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__CATALOG = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__NAME = 4;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE__SCHEMA = 5;

  /**
   * The number of structural features of the '<em>Join Table</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TABLE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.LobImpl <em>Lob</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.LobImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getLob()
   * @generated
   */
  int LOB = 41;

  /**
   * The number of structural features of the '<em>Lob</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOB_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl <em>Many To Many</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToManyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getManyToMany()
   * @generated
   */
  int MANY_TO_MANY = 42;

  /**
   * The feature id for the '<em><b>Order By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__ORDER_BY = 0;

  /**
   * The feature id for the '<em><b>Order Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__ORDER_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Map Key</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY = 2;

  /**
   * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_CLASS = 3;

  /**
   * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_TEMPORAL = 4;

  /**
   * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_ENUMERATED = 5;

  /**
   * The feature id for the '<em><b>Map Key Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_CONVERT = 6;

  /**
   * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE = 7;

  /**
   * The feature id for the '<em><b>Map Key Association Override</b></em>' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE = 8;

  /**
   * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_COLUMN = 9;

  /**
   * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAP_KEY_JOIN_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__CONVERTER = 11;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__TYPE_CONVERTER = 12;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__OBJECT_TYPE_CONVERTER = 13;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__STRUCT_CONVERTER = 14;

  /**
   * The feature id for the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__JOIN_TABLE = 15;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__CASCADE = 16;

  /**
   * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__JOIN_FETCH = 17;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__ACCESS_METHODS = 19;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__ACCESS = 20;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__FETCH = 21;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__MAPPED_BY = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__NAME = 23;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_MANY__TARGET_ENTITY = 24;

  /**
   * The number of structural features of the '<em>Many To Many</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_MANY_FEATURE_COUNT = 25;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl <em>Many To One</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getManyToOne()
   * @generated
   */
  int MANY_TO_ONE = 43;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__JOIN_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__JOIN_TABLE = 1;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__CASCADE = 2;

  /**
   * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__JOIN_FETCH = 3;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__PROPERTY = 4;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__ACCESS_METHODS = 5;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__ACCESS = 6;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__FETCH = 7;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__ID = 8;

  /**
   * The feature id for the '<em><b>Maps Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__MAPS_ID = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__NAME = 10;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__OPTIONAL = 11;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANY_TO_ONE__TARGET_ENTITY = 12;

  /**
   * The number of structural features of the '<em>Many To One</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MANY_TO_ONE_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyImpl <em>Map Key</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getMapKey()
   * @generated
   */
  int MAP_KEY = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY__NAME = 0;

  /**
   * The number of structural features of the '<em>Map Key</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyClassImpl <em>Map Key Class</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyClassImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getMapKeyClass()
   * @generated
   */
  int MAP_KEY_CLASS = 45;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_CLASS__CLASS = 0;

  /**
   * The number of structural features of the '<em>Map Key Class</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAP_KEY_CLASS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyColumnImpl <em>Map Key Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getMapKeyColumn()
   * @generated
   */
  int MAP_KEY_COLUMN = 46;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Insertable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__INSERTABLE = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__LENGTH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__NAME = 3;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__NULLABLE = 4;

  /**
   * The feature id for the '<em><b>Precision</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__PRECISION = 5;

  /**
   * The feature id for the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__SCALE = 6;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__TABLE = 7;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__UNIQUE = 8;

  /**
   * The feature id for the '<em><b>Updatable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN__UPDATABLE = 9;

  /**
   * The number of structural features of the '<em>Map Key Column</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAP_KEY_COLUMN_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl <em>Map Key Join Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.MapKeyJoinColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getMapKeyJoinColumn()
   * @generated
   */
  int MAP_KEY_JOIN_COLUMN = 47;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Insertable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__INSERTABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__NAME = 2;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__NULLABLE = 3;

  /**
   * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 4;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__TABLE = 5;

  /**
   * The feature id for the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__UNIQUE = 6;

  /**
   * The feature id for the '<em><b>Updatable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN__UPDATABLE = 7;

  /**
   * The number of structural features of the '<em>Map Key Join Column</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_KEY_JOIN_COLUMN_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl <em>Mapped Superclass</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.MappedSuperclassImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getMappedSuperclass()
   * @generated
   */
  int MAPPED_SUPERCLASS = 48;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Customizer</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CUSTOMIZER = 1;

  /**
   * The feature id for the '<em><b>Change Tracking</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CHANGE_TRACKING = 2;

  /**
   * The feature id for the '<em><b>Id Class</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__ID_CLASS = 3;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__PRIMARY_KEY = 4;

  /**
   * The feature id for the '<em><b>Optimistic Locking</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__OPTIMISTIC_LOCKING = 5;

  /**
   * The feature id for the '<em><b>Cache</b></em>' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CACHE = 6;

  /**
   * The feature id for the '<em><b>Cache Interceptor</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CACHE_INTERCEPTOR = 7;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CONVERTER = 8;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__TYPE_CONVERTER = 9;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__OBJECT_TYPE_CONVERTER = 10;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__STRUCT_CONVERTER = 11;

  /**
   * The feature id for the '<em><b>Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__COPY_POLICY = 12;

  /**
   * The feature id for the '<em><b>Instantiation Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__INSTANTIATION_COPY_POLICY = 13;

  /**
   * The feature id for the '<em><b>Clone Copy Policy</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CLONE_COPY_POLICY = 14;

  /**
   * The feature id for the '<em><b>Exclude Default Listeners</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_LISTENERS = 15;

  /**
   * The feature id for the '<em><b>Exclude Superclass Listeners</b></em>' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__EXCLUDE_SUPERCLASS_LISTENERS = 16;

  /**
   * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__ENTITY_LISTENERS = 17;

  /**
   * The feature id for the '<em><b>Pre Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__PRE_PERSIST = 18;

  /**
   * The feature id for the '<em><b>Post Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__POST_PERSIST = 19;

  /**
   * The feature id for the '<em><b>Pre Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__PRE_REMOVE = 20;

  /**
   * The feature id for the '<em><b>Post Remove</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__POST_REMOVE = 21;

  /**
   * The feature id for the '<em><b>Pre Update</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__PRE_UPDATE = 22;

  /**
   * The feature id for the '<em><b>Post Update</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__POST_UPDATE = 23;

  /**
   * The feature id for the '<em><b>Post Load</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__POST_LOAD = 24;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__PROPERTY = 25;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__ATTRIBUTES = 26;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__ACCESS = 27;

  /**
   * The feature id for the '<em><b>Cacheable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CACHEABLE = 28;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__CLASS = 29;

  /**
   * The feature id for the '<em><b>Exclude Default Mappings</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__EXCLUDE_DEFAULT_MAPPINGS = 30;

  /**
   * The feature id for the '<em><b>Existence Checking</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__EXISTENCE_CHECKING = 31;

  /**
   * The feature id for the '<em><b>Metadata Complete</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__METADATA_COMPLETE = 32;

  /**
   * The feature id for the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS__READ_ONLY = 33;

  /**
   * The number of structural features of the '<em>Mapped Superclass</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPED_SUPERCLASS_FEATURE_COUNT = 34;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedNativeQueryImpl <em>Named Native Query</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedNativeQueryImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getNamedNativeQuery()
   * @generated
   */
  int NAMED_NATIVE_QUERY = 49;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY__QUERY = 1;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY__HINT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY__NAME = 3;

  /**
   * The feature id for the '<em><b>Result Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY__RESULT_CLASS = 4;

  /**
   * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY__RESULT_SET_MAPPING = 5;

  /**
   * The number of structural features of the '<em>Named Native Query</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_NATIVE_QUERY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl <em>Named Query</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedQueryImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getNamedQuery()
   * @generated
   */
  int NAMED_QUERY = 50;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY__QUERY = 1;

  /**
   * The feature id for the '<em><b>Lock Mode</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY__LOCK_MODE = 2;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_QUERY__HINT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_QUERY__NAME = 4;

  /**
   * The number of structural features of the '<em>Named Query</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_QUERY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl <em>Named Stored Procedure Query</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getNamedStoredProcedureQuery()
   * @generated
   */
  int NAMED_STORED_PROCEDURE_QUERY = 51;

  /**
   * The feature id for the '<em><b>Hint</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__HINT = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__NAME = 2;

  /**
   * The feature id for the '<em><b>Procedure Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME = 3;

  /**
   * The feature id for the '<em><b>Result Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS = 4;

  /**
   * The feature id for the '<em><b>Result Set Mapping</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING = 5;

  /**
   * The feature id for the '<em><b>Returns Result Set</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET = 6;

  /**
   * The number of structural features of the '<em>Named Stored Procedure Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_STORED_PROCEDURE_QUERY_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ObjectTypeConverterImpl <em>Object Type Converter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ObjectTypeConverterImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getObjectTypeConverter()
   * @generated
   */
  int OBJECT_TYPE_CONVERTER = 52;

  /**
   * The feature id for the '<em><b>Conversion Value</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_CONVERTER__CONVERSION_VALUE = 0;

  /**
   * The feature id for the '<em><b>Default Object Value</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_CONVERTER__DEFAULT_OBJECT_VALUE = 1;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_CONVERTER__DATA_TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_CONVERTER__NAME = 3;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_CONVERTER__OBJECT_TYPE = 4;

  /**
   * The number of structural features of the '<em>Object Type Converter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_CONVERTER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl <em>One To Many</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOneToMany()
   * @generated
   */
  int ONE_TO_MANY = 53;

  /**
   * The feature id for the '<em><b>Order By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__ORDER_BY = 0;

  /**
   * The feature id for the '<em><b>Order Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__ORDER_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Map Key</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY = 2;

  /**
   * The feature id for the '<em><b>Map Key Class</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_CLASS = 3;

  /**
   * The feature id for the '<em><b>Map Key Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_TEMPORAL = 4;

  /**
   * The feature id for the '<em><b>Map Key Enumerated</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_ENUMERATED = 5;

  /**
   * The feature id for the '<em><b>Map Key Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_CONVERT = 6;

  /**
   * The feature id for the '<em><b>Map Key Attribute Override</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE = 7;

  /**
   * The feature id for the '<em><b>Map Key Association Override</b></em>' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE = 8;

  /**
   * The feature id for the '<em><b>Map Key Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_COLUMN = 9;

  /**
   * The feature id for the '<em><b>Map Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAP_KEY_JOIN_COLUMN = 10;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__CONVERTER = 11;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__TYPE_CONVERTER = 12;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__OBJECT_TYPE_CONVERTER = 13;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__STRUCT_CONVERTER = 14;

  /**
   * The feature id for the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__JOIN_TABLE = 15;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__JOIN_COLUMN = 16;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__CASCADE = 17;

  /**
   * The feature id for the '<em><b>Private Owned</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__PRIVATE_OWNED = 18;

  /**
   * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__JOIN_FETCH = 19;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__ACCESS_METHODS = 21;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__ACCESS = 22;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__FETCH = 23;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__MAPPED_BY = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__NAME = 25;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__ORPHAN_REMOVAL = 26;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_MANY__TARGET_ENTITY = 27;

  /**
   * The number of structural features of the '<em>One To Many</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_MANY_FEATURE_COUNT = 28;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl <em>One To One</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToOneImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOneToOne()
   * @generated
   */
  int ONE_TO_ONE = 54;

  /**
   * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__PRIMARY_KEY_JOIN_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__JOIN_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Join Table</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__JOIN_TABLE = 2;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__CASCADE = 3;

  /**
   * The feature id for the '<em><b>Private Owned</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__PRIVATE_OWNED = 4;

  /**
   * The feature id for the '<em><b>Join Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__JOIN_FETCH = 5;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__ACCESS_METHODS = 7;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__ACCESS = 8;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__FETCH = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__ID = 10;

  /**
   * The feature id for the '<em><b>Mapped By</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__MAPPED_BY = 11;

  /**
   * The feature id for the '<em><b>Maps Id</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__MAPS_ID = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__NAME = 13;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__OPTIONAL = 14;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__ORPHAN_REMOVAL = 15;

  /**
   * The feature id for the '<em><b>Target Entity</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE__TARGET_ENTITY = 16;

  /**
   * The number of structural features of the '<em>One To One</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONE_TO_ONE_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OptimisticLockingImpl <em>Optimistic Locking</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OptimisticLockingImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOptimisticLocking()
   * @generated
   */
  int OPTIMISTIC_LOCKING = 55;

  /**
   * The feature id for the '<em><b>Selected Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISTIC_LOCKING__SELECTED_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISTIC_LOCKING__CASCADE = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISTIC_LOCKING__TYPE = 2;

  /**
   * The number of structural features of the '<em>Optimistic Locking</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIMISTIC_LOCKING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl <em>Order Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrderColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOrderColumn()
   * @generated
   */
  int ORDER_COLUMN = 56;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Correction Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_COLUMN__CORRECTION_TYPE = 1;

  /**
   * The feature id for the '<em><b>Insertable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_COLUMN__INSERTABLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_COLUMN__NAME = 3;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_COLUMN__NULLABLE = 4;

  /**
   * The feature id for the '<em><b>Updatable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDER_COLUMN__UPDATABLE = 5;

  /**
   * The number of structural features of the '<em>Order Column</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int ORDER_COLUMN_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl <em>Persistence Unit Defaults</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitDefaultsImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPersistenceUnitDefaults()
   * @generated
   */
  int PERSISTENCE_UNIT_DEFAULTS = 57;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__SCHEMA = 1;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__CATALOG = 2;

  /**
   * The feature id for the '<em><b>Delimited Identifiers</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__DELIMITED_IDENTIFIERS = 3;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__ACCESS = 4;

  /**
   * The feature id for the '<em><b>Cascade Persist</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__CASCADE_PERSIST = 5;

  /**
   * The feature id for the '<em><b>Entity Listeners</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS__ENTITY_LISTENERS = 6;

  /**
   * The number of structural features of the '<em>Persistence Unit Defaults</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_DEFAULTS_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitMetadataImpl <em>Persistence Unit Metadata</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PersistenceUnitMetadataImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPersistenceUnitMetadata()
   * @generated
   */
  int PERSISTENCE_UNIT_METADATA = 58;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_METADATA__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Xml Mapping Metadata Complete</b></em>' containment reference.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_METADATA__XML_MAPPING_METADATA_COMPLETE = 1;

  /**
   * The feature id for the '<em><b>Exclude Default Mappings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_METADATA__EXCLUDE_DEFAULT_MAPPINGS = 2;

  /**
   * The feature id for the '<em><b>Persistence Unit Defaults</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_METADATA__PERSISTENCE_UNIT_DEFAULTS = 3;

  /**
   * The number of structural features of the '<em>Persistence Unit Metadata</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSISTENCE_UNIT_METADATA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostLoadImpl <em>Post Load</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostLoadImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPostLoad()
   * @generated
   */
  int POST_LOAD = 59;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_LOAD__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_LOAD__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Post Load</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_LOAD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostPersistImpl <em>Post Persist</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostPersistImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPostPersist()
   * @generated
   */
  int POST_PERSIST = 60;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_PERSIST__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_PERSIST__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Post Persist</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int POST_PERSIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostRemoveImpl <em>Post Remove</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostRemoveImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPostRemove()
   * @generated
   */
  int POST_REMOVE = 61;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_REMOVE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_REMOVE__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Post Remove</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int POST_REMOVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostUpdateImpl <em>Post Update</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PostUpdateImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPostUpdate()
   * @generated
   */
  int POST_UPDATE = 62;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_UPDATE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_UPDATE__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Post Update</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int POST_UPDATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrePersistImpl <em>Pre Persist</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrePersistImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPrePersist()
   * @generated
   */
  int PRE_PERSIST = 63;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_PERSIST__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_PERSIST__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Pre Persist</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int PRE_PERSIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PreRemoveImpl <em>Pre Remove</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PreRemoveImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPreRemove()
   * @generated
   */
  int PRE_REMOVE = 64;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_REMOVE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_REMOVE__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Pre Remove</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_REMOVE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PreUpdateImpl <em>Pre Update</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PreUpdateImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPreUpdate()
   * @generated
   */
  int PRE_UPDATE = 65;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE__METHOD_NAME = 1;

  /**
   * The number of structural features of the '<em>Pre Update</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_UPDATE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPrimaryKey()
   * @generated
   */
  int PRIMARY_KEY = 66;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Validation</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY__VALIDATION = 1;

  /**
   * The number of structural features of the '<em>Primary Key</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyJoinColumnImpl <em>Primary Key Join Column</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyJoinColumnImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getPrimaryKeyJoinColumn()
   * @generated
   */
  int PRIMARY_KEY_JOIN_COLUMN = 67;

  /**
   * The feature id for the '<em><b>Column Definition</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_JOIN_COLUMN__COLUMN_DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_JOIN_COLUMN__NAME = 1;

  /**
   * The feature id for the '<em><b>Referenced Column Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_JOIN_COLUMN__REFERENCED_COLUMN_NAME = 2;

  /**
   * The number of structural features of the '<em>Primary Key Join Column</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_JOIN_COLUMN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.PropertyImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 68;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE = 1;

  /**
   * The feature id for the '<em><b>Value Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__VALUE_TYPE = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryHintImpl <em>Query Hint</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryHintImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getQueryHint()
   * @generated
   */
  int QUERY_HINT = 69;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_HINT__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_HINT__NAME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_HINT__VALUE = 2;

  /**
   * The number of structural features of the '<em>Query Hint</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_HINT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl <em>Query Redirectors</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.QueryRedirectorsImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getQueryRedirectors()
   * @generated
   */
  int QUERY_REDIRECTORS = 70;

  /**
   * The feature id for the '<em><b>All Queries</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__ALL_QUERIES = 0;

  /**
   * The feature id for the '<em><b>Delete</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__DELETE = 1;

  /**
   * The feature id for the '<em><b>Insert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__INSERT = 2;

  /**
   * The feature id for the '<em><b>Read All</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__READ_ALL = 3;

  /**
   * The feature id for the '<em><b>Read Object</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__READ_OBJECT = 4;

  /**
   * The feature id for the '<em><b>Report</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__REPORT = 5;

  /**
   * The feature id for the '<em><b>Update</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS__UPDATE = 6;

  /**
   * The number of structural features of the '<em>Query Redirectors</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_REDIRECTORS_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ReadTransformerImpl <em>Read Transformer</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.ReadTransformerImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getReadTransformer()
   * @generated
   */
  int READ_TRANSFORMER = 71;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_TRANSFORMER__METHOD = 0;

  /**
   * The feature id for the '<em><b>Transformer Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_TRANSFORMER__TRANSFORMER_CLASS = 1;

  /**
   * The number of structural features of the '<em>Read Transformer</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_TRANSFORMER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.SecondaryTableImpl <em>Secondary Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.SecondaryTableImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getSecondaryTable()
   * @generated
   */
  int SECONDARY_TABLE = 72;

  /**
   * The feature id for the '<em><b>Primary Key Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_TABLE__PRIMARY_KEY_JOIN_COLUMN = 0;

  /**
   * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_TABLE__UNIQUE_CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_TABLE__CATALOG = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_TABLE__NAME = 3;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_TABLE__SCHEMA = 4;

  /**
   * The number of structural features of the '<em>Secondary Table</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SECONDARY_TABLE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.SequenceGeneratorImpl <em>Sequence Generator</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.SequenceGeneratorImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getSequenceGenerator()
   * @generated
   */
  int SEQUENCE_GENERATOR = 73;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__ALLOCATION_SIZE = 1;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__CATALOG = 2;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__INITIAL_VALUE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__NAME = 4;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__SCHEMA = 5;

  /**
   * The feature id for the '<em><b>Sequence Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR__SEQUENCE_NAME = 6;

  /**
   * The number of structural features of the '<em>Sequence Generator</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_GENERATOR_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.SqlResultSetMappingImpl <em>Sql Result Set Mapping</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.SqlResultSetMappingImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getSqlResultSetMapping()
   * @generated
   */
  int SQL_RESULT_SET_MAPPING = 74;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_RESULT_SET_MAPPING__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Entity Result</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_RESULT_SET_MAPPING__ENTITY_RESULT = 1;

  /**
   * The feature id for the '<em><b>Column Result</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_RESULT_SET_MAPPING__COLUMN_RESULT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_RESULT_SET_MAPPING__NAME = 3;

  /**
   * The number of structural features of the '<em>Sql Result Set Mapping</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int SQL_RESULT_SET_MAPPING_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl <em>Stored Procedure Parameter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.StoredProcedureParameterImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getStoredProcedureParameter()
   * @generated
   */
  int STORED_PROCEDURE_PARAMETER = 75;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER__DIRECTION = 0;

  /**
   * The feature id for the '<em><b>Jdbc Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER__JDBC_TYPE = 1;

  /**
   * The feature id for the '<em><b>Jdbc Type Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER__JDBC_TYPE_NAME = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER__NAME = 3;

  /**
   * The feature id for the '<em><b>Query Parameter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER__QUERY_PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER__TYPE = 5;

  /**
   * The number of structural features of the '<em>Stored Procedure Parameter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int STORED_PROCEDURE_PARAMETER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.StructConverterImpl <em>Struct Converter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.StructConverterImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getStructConverter()
   * @generated
   */
  int STRUCT_CONVERTER = 76;

  /**
   * The feature id for the '<em><b>Converter</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONVERTER__CONVERTER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONVERTER__NAME = 1;

  /**
   * The number of structural features of the '<em>Struct Converter</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_CONVERTER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.TableImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTable()
   * @generated
   */
  int TABLE = 77;

  /**
   * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__UNIQUE_CONSTRAINT = 0;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__CATALOG = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 2;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__SCHEMA = 3;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TableGeneratorImpl <em>Table Generator</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.TableGeneratorImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTableGenerator()
   * @generated
   */
  int TABLE_GENERATOR = 78;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Unique Constraint</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__UNIQUE_CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Allocation Size</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__ALLOCATION_SIZE = 2;

  /**
   * The feature id for the '<em><b>Catalog</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__CATALOG = 3;

  /**
   * The feature id for the '<em><b>Initial Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__INITIAL_VALUE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__NAME = 5;

  /**
   * The feature id for the '<em><b>Pk Column Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__PK_COLUMN_NAME = 6;

  /**
   * The feature id for the '<em><b>Pk Column Value</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__PK_COLUMN_VALUE = 7;

  /**
   * The feature id for the '<em><b>Schema</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__SCHEMA = 8;

  /**
   * The feature id for the '<em><b>Table</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__TABLE = 9;

  /**
   * The feature id for the '<em><b>Value Column Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR__VALUE_COLUMN_NAME = 10;

  /**
   * The number of structural features of the '<em>Table Generator</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_GENERATOR_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TimeOfDayImpl <em>Time Of Day</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.TimeOfDayImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTimeOfDay()
   * @generated
   */
  int TIME_OF_DAY = 79;

  /**
   * The feature id for the '<em><b>Hour</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__HOUR = 0;

  /**
   * The feature id for the '<em><b>Millisecond</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__MILLISECOND = 1;

  /**
   * The feature id for the '<em><b>Minute</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__MINUTE = 2;

  /**
   * The feature id for the '<em><b>Second</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIME_OF_DAY__SECOND = 3;

  /**
   * The number of structural features of the '<em>Time Of Day</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int TIME_OF_DAY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.TransformationImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTransformation()
   * @generated
   */
  int TRANSFORMATION = 80;

  /**
   * The feature id for the '<em><b>Read Transformer</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__READ_TRANSFORMER = 0;

  /**
   * The feature id for the '<em><b>Write Transformer</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__WRITE_TRANSFORMER = 1;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__ACCESS = 2;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__PROPERTY = 3;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__ACCESS_METHODS = 4;

  /**
   * The feature id for the '<em><b>Access1</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__ACCESS1 = 5;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__FETCH = 6;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__MUTABLE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__NAME = 8;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__OPTIONAL = 9;

  /**
   * The number of structural features of the '<em>Transformation</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TransientImpl <em>Transient</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.TransientImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTransient()
   * @generated
   */
  int TRANSIENT = 81;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSIENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Transient</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSIENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.TypeConverterImpl <em>Type Converter</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.TypeConverterImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTypeConverter()
   * @generated
   */
  int TYPE_CONVERTER = 82;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CONVERTER__DATA_TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CONVERTER__NAME = 1;

  /**
   * The feature id for the '<em><b>Object Type</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_CONVERTER__OBJECT_TYPE = 2;

  /**
   * The number of structural features of the '<em>Type Converter</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int TYPE_CONVERTER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.UniqueConstraintImpl <em>Unique Constraint</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.UniqueConstraintImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getUniqueConstraint()
   * @generated
   */
  int UNIQUE_CONSTRAINT = 83;

  /**
   * The feature id for the '<em><b>Column Name</b></em>' attribute list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_CONSTRAINT__COLUMN_NAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_CONSTRAINT__NAME = 1;

  /**
   * The number of structural features of the '<em>Unique Constraint</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl <em>Variable One To One</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.VariableOneToOneImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getVariableOneToOne()
   * @generated
   */
  int VARIABLE_ONE_TO_ONE = 84;

  /**
   * The feature id for the '<em><b>Cascade</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__CASCADE = 0;

  /**
   * The feature id for the '<em><b>Discriminator Column</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__DISCRIMINATOR_COLUMN = 1;

  /**
   * The feature id for the '<em><b>Discriminator Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__DISCRIMINATOR_CLASS = 2;

  /**
   * The feature id for the '<em><b>Join Column</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__JOIN_COLUMN = 3;

  /**
   * The feature id for the '<em><b>Private Owned</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__PRIVATE_OWNED = 4;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__ACCESS_METHODS = 6;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__ACCESS = 7;

  /**
   * The feature id for the '<em><b>Fetch</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__FETCH = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__NAME = 9;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__OPTIONAL = 10;

  /**
   * The feature id for the '<em><b>Orphan Removal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__ORPHAN_REMOVAL = 11;

  /**
   * The feature id for the '<em><b>Target Interface</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE__TARGET_INTERFACE = 12;

  /**
   * The number of structural features of the '<em>Variable One To One</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ONE_TO_ONE_FEATURE_COUNT = 13;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl <em>Version</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getVersion()
   * @generated
   */
  int VERSION = 85;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int VERSION__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Temporal</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__TEMPORAL = 1;

  /**
   * The feature id for the '<em><b>Convert</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__CONVERT = 2;

  /**
   * The feature id for the '<em><b>Converter</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int VERSION__CONVERTER = 3;

  /**
   * The feature id for the '<em><b>Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__TYPE_CONVERTER = 4;

  /**
   * The feature id for the '<em><b>Object Type Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__OBJECT_TYPE_CONVERTER = 5;

  /**
   * The feature id for the '<em><b>Struct Converter</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__STRUCT_CONVERTER = 6;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__PROPERTY = 7;

  /**
   * The feature id for the '<em><b>Access Methods</b></em>' containment reference.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__ACCESS_METHODS = 8;

  /**
   * The feature id for the '<em><b>Access</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__ACCESS = 9;

  /**
   * The feature id for the '<em><b>Mutable</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__MUTABLE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION__NAME = 11;

  /**
   * The number of structural features of the '<em>Version</em>' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERSION_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.WriteTransformerImpl <em>Write Transformer</em>}' class.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.WriteTransformerImpl
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getWriteTransformer()
   * @generated
   */
  int WRITE_TRANSFORMER = 86;

  /**
   * The feature id for the '<em><b>Column</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   * @ordered
   */
  int WRITE_TRANSFORMER__COLUMN = 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_TRANSFORMER__METHOD = 1;

  /**
   * The feature id for the '<em><b>Transformer Class</b></em>' attribute.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_TRANSFORMER__TRANSFORMER_CLASS = 2;

  /**
   * The number of structural features of the '<em>Write Transformer</em>' class.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_TRANSFORMER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType <em>Access Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getAccessType()
   * @generated
   */
  int ACCESS_TYPE = 87;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType <em>Cache Coordination Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCacheCoordinationType()
   * @generated
   */
  int CACHE_COORDINATION_TYPE = 88;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheType <em>Cache Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCacheType()
   * @generated
   */
  int CACHE_TYPE = 89;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType <em>Change Tracking Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getChangeTrackingType()
   * @generated
   */
  int CHANGE_TRACKING_TYPE = 90;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType <em>Direction Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDirectionType()
   * @generated
   */
  int DIRECTION_TYPE = 91;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType <em>Discriminator Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDiscriminatorType()
   * @generated
   */
  int DISCRIMINATOR_TYPE = 92;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EnumType <em>Enum Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EnumType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 94;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType <em>Existence Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getExistenceType()
   * @generated
   */
  int EXISTENCE_TYPE = 95;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType <em>Fetch Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getFetchType()
   * @generated
   */
  int FETCH_TYPE = 96;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType <em>Generation Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getGenerationType()
   * @generated
   */
  int GENERATION_TYPE = 97;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation <em>Id Validation</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getIdValidation()
   * @generated
   */
  int ID_VALIDATION = 98;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType <em>Inheritance Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getInheritanceType()
   * @generated
   */
  int INHERITANCE_TYPE = 99;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType <em>Join Fetch Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getJoinFetchType()
   * @generated
   */
  int JOIN_FETCH_TYPE = 100;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType <em>Lock Mode Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getLockModeType()
   * @generated
   */
  int LOCK_MODE_TYPE = 101;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType <em>Optimistic Locking Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOptimisticLockingType()
   * @generated
   */
  int OPTIMISTIC_LOCKING_TYPE = 102;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType <em>Order Column Correction Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOrderColumnCorrectionType()
   * @generated
   */
  int ORDER_COLUMN_CORRECTION_TYPE = 103;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType <em>Temporal Type</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTemporalType()
   * @generated
   */
  int TEMPORAL_TYPE = 105;

  /**
   * The meta object id for the '<em>Access Type Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getAccessTypeObject()
   * @generated
   */
  int ACCESS_TYPE_OBJECT = 106;

  /**
   * The meta object id for the '<em>Cache Coordination Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCacheCoordinationTypeObject()
   * @generated
   */
  int CACHE_COORDINATION_TYPE_OBJECT = 107;

  /**
   * The meta object id for the '<em>Cache Type Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getCacheTypeObject()
   * @generated
   */
  int CACHE_TYPE_OBJECT = 108;

  /**
   * The meta object id for the '<em>Change Tracking Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getChangeTrackingTypeObject()
   * @generated
   */
  int CHANGE_TRACKING_TYPE_OBJECT = 109;

  /**
   * The meta object id for the '<em>Direction Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDirectionTypeObject()
   * @generated
   */
  int DIRECTION_TYPE_OBJECT = 110;

  /**
   * The meta object id for the '<em>Discriminator Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDiscriminatorTypeObject()
   * @generated
   */
  int DISCRIMINATOR_TYPE_OBJECT = 111;

  /**
   * The meta object id for the '<em>Discriminator Value</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getDiscriminatorValue()
   * @generated
   */
  int DISCRIMINATOR_VALUE = 112;

  /**
   * The meta object id for the '<em>Enumerated Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEnumeratedObject()
   * @generated
   */
  int ENUMERATED_OBJECT = 113;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated <em>Enumerated</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEnumerated()
   * @generated
   */
  int ENUMERATED = 93;

  /**
   * The meta object id for the '<em>Enum Type Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EnumType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getEnumTypeObject()
   * @generated
   */
  int ENUM_TYPE_OBJECT = 114;

  /**
   * The meta object id for the '<em>Existence Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getExistenceTypeObject()
   * @generated
   */
  int EXISTENCE_TYPE_OBJECT = 115;

  /**
   * The meta object id for the '<em>Fetch Type Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getFetchTypeObject()
   * @generated
   */
  int FETCH_TYPE_OBJECT = 116;

  /**
   * The meta object id for the '<em>Generation Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getGenerationTypeObject()
   * @generated
   */
  int GENERATION_TYPE_OBJECT = 117;

  /**
   * The meta object id for the '<em>Id Validation Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getIdValidationObject()
   * @generated
   */
  int ID_VALIDATION_OBJECT = 118;

  /**
   * The meta object id for the '<em>Inheritance Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getInheritanceTypeObject()
   * @generated
   */
  int INHERITANCE_TYPE_OBJECT = 119;

  /**
   * The meta object id for the '<em>Join Fetch Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getJoinFetchTypeObject()
   * @generated
   */
  int JOIN_FETCH_TYPE_OBJECT = 120;

  /**
   * The meta object id for the '<em>Lock Mode Type Object</em>' data type. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getLockModeTypeObject()
   * @generated
   */
  int LOCK_MODE_TYPE_OBJECT = 121;

  /**
   * The meta object id for the '<em>Optimistic Locking Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOptimisticLockingTypeObject()
   * @generated
   */
  int OPTIMISTIC_LOCKING_TYPE_OBJECT = 122;

  /**
   * The meta object id for the '<em>Order By</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOrderBy()
   * @generated
   */
  int ORDER_BY = 123;

  /**
   * The meta object id for the '<em>Order Column Correction Type Object</em>' data type.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getOrderColumnCorrectionTypeObject()
   * @generated
   */
  int ORDER_COLUMN_CORRECTION_TYPE_OBJECT = 124;

  /**
   * The meta object id for the '<em>Temporal Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Temporal
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTemporalObject()
   * @generated
   */
  int TEMPORAL_OBJECT = 125;

  /**
   * The meta object id for the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Temporal <em>Temporal</em>}' enum.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Temporal
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTemporal()
   * @generated
   */
  int TEMPORAL = 104;

  /**
   * The meta object id for the '<em>Temporal Type Object</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getTemporalTypeObject()
   * @generated
   */
  int TEMPORAL_TYPE_OBJECT = 126;

  /**
   * The meta object id for the '<em>Version Type</em>' data type.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @see java.lang.String
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.impl.OrmPackageImpl#getVersionType()
   * @generated
   */
  int VERSION_TYPE = 127;

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods <em>Access Methods</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods
   * @generated
   */
  EClass getAccessMethods();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getGetMethod <em>Get Method</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Get Method</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getGetMethod()
   * @see #getAccessMethods()
   * @generated
   */
  EAttribute getAccessMethods_GetMethod();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getSetMethod <em>Set Method</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Set Method</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods#getSetMethod()
   * @see #getAccessMethods()
   * @generated
   */
  EAttribute getAccessMethods_SetMethod();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride <em>Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride
   * @generated
   */
  EClass getAssociationOverride();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getDescription()
   * @see #getAssociationOverride()
   * @generated
   */
  EAttribute getAssociationOverride_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinColumn <em>Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinColumn()
   * @see #getAssociationOverride()
   * @generated
   */
  EReference getAssociationOverride_JoinColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinTable <em>Join Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getJoinTable()
   * @see #getAssociationOverride()
   * @generated
   */
  EReference getAssociationOverride_JoinTable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride#getName()
   * @see #getAssociationOverride()
   * @generated
   */
  EAttribute getAssociationOverride_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride <em>Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride
   * @generated
   */
  EClass getAttributeOverride();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride#getDescription()
   * @see #getAttributeOverride()
   * @generated
   */
  EAttribute getAttributeOverride_Description();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride#getColumn <em>Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride#getColumn()
   * @see #getAttributeOverride()
   * @generated
   */
  EReference getAttributeOverride_Column();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride#getName()
   * @see #getAttributeOverride()
   * @generated
   */
  EAttribute getAttributeOverride_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes <em>Attributes</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Attributes</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes
   * @generated
   */
  EClass getAttributes();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getDescription()
   * @see #getAttributes()
   * @generated
   */
  EAttribute getAttributes_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getId <em>Id</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference list '<em>Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getId()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Id();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbeddedId <em>Embedded Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Embedded Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbeddedId()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_EmbeddedId();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasic <em>Basic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Basic</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasic()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Basic();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasicCollection <em>Basic Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Basic Collection</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasicCollection()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_BasicCollection();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasicMap <em>Basic Map</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Basic Map</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getBasicMap()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_BasicMap();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Version</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getVersion()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Version();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getManyToOne <em>Many To One</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Many To One</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getManyToOne()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_ManyToOne();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getOneToMany <em>One To Many</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>One To Many</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getOneToMany()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_OneToMany();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getOneToOne <em>One To One</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>One To One</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getOneToOne()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_OneToOne();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getVariableOneToOne <em>Variable One To One</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable One To One</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getVariableOneToOne()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_VariableOneToOne();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getManyToMany <em>Many To Many</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Many To Many</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getManyToMany()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_ManyToMany();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getElementCollection <em>Element Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element Collection</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getElementCollection()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_ElementCollection();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbedded <em>Embedded</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Embedded</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getEmbedded()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Embedded();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getTransformation <em>Transformation</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Transformation</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getTransformation()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Transformation();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getTransient <em>Transient</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Transient</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Attributes#getTransient()
   * @see #getAttributes()
   * @generated
   */
  EReference getAttributes_Transient();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic <em>Basic</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic
   * @generated
   */
  EClass getBasic();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getColumn()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_Column();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getGeneratedValue <em>Generated Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Generated Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getGeneratedValue()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_GeneratedValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getLob <em>Lob</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Lob</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getLob()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_Lob();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTemporal <em>Temporal</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTemporal()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Temporal();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getEnumerated <em>Enumerated</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getEnumerated()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Enumerated();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConvert <em>Convert</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConvert()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Convert();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConverter <em>Converter</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getConverter()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_Converter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTypeConverter()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_TypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getObjectTypeConverter()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getStructConverter <em>Struct Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getStructConverter()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTableGenerator <em>Table Generator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Table Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getTableGenerator()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_TableGenerator();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getSequenceGenerator <em>Sequence Generator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getSequenceGenerator()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_SequenceGenerator();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getProperty()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccessMethods()
   * @see #getBasic()
   * @generated
   */
  EReference getBasic_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getAccess()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getFetch()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Fetch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isMutable()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Mutable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#getName()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Basic#isOptional()
   * @see #getBasic()
   * @generated
   */
  EAttribute getBasic_Optional();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection <em>Basic Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Collection</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection
   * @generated
   */
  EClass getBasicCollection();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getValueColumn <em>Value Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Value Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getValueColumn()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_ValueColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getConvert <em>Convert</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getConvert()
   * @see #getBasicCollection()
   * @generated
   */
  EAttribute getBasicCollection_Convert();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getConverter()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_Converter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getTypeConverter <em>Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getTypeConverter()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_TypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getObjectTypeConverter()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getStructConverter()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_StructConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getCollectionTable <em>Collection Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getCollectionTable()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_CollectionTable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getJoinFetch <em>Join Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Join Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getJoinFetch()
   * @see #getBasicCollection()
   * @generated
   */
  EAttribute getBasicCollection_JoinFetch();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getProperty()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getAccessMethods <em>Access Methods</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getAccessMethods()
   * @see #getBasicCollection()
   * @generated
   */
  EReference getBasicCollection_AccessMethods();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getAccess()
   * @see #getBasicCollection()
   * @generated
   */
  EAttribute getBasicCollection_Access();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getFetch <em>Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getFetch()
   * @see #getBasicCollection()
   * @generated
   */
  EAttribute getBasicCollection_Fetch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicCollection#getName()
   * @see #getBasicCollection()
   * @generated
   */
  EAttribute getBasicCollection_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap <em>Basic Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Map</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap
   * @generated
   */
  EClass getBasicMap();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyColumn <em>Key Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Key Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyColumn()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_KeyColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyConverter <em>Key Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Key Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getKeyConverter()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_KeyConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueColumn <em>Value Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Value Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueColumn()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_ValueColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueConverter <em>Value Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Value Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getValueConverter()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_ValueConverter();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getGroup()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_Group();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getConverter()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_Converter();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getTypeConverter()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_TypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getObjectTypeConverter()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getStructConverter <em>Struct Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getStructConverter()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getCollectionTable <em>Collection Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Collection Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getCollectionTable()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_CollectionTable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getJoinFetch <em>Join Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Join Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getJoinFetch()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_JoinFetch();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getProperty()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccessMethods()
   * @see #getBasicMap()
   * @generated
   */
  EReference getBasicMap_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getAccess()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getFetch()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_Fetch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.BasicMap#getName()
   * @see #getBasicMap()
   * @generated
   */
  EAttribute getBasicMap_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache <em>Cache</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cache</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache
   * @generated
   */
  EClass getCache();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiry <em>Expiry</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expiry</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiry()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_Expiry();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiryTimeOfDay <em>Expiry Time Of Day</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Expiry Time Of Day</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getExpiryTimeOfDay()
   * @see #getCache()
   * @generated
   */
  EReference getCache_ExpiryTimeOfDay();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isAlwaysRefresh <em>Always Refresh</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Always Refresh</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isAlwaysRefresh()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_AlwaysRefresh();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getCoordinationType <em>Coordination Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Coordination Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getCoordinationType()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_CoordinationType();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isDisableHits <em>Disable Hits</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Disable Hits</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isDisableHits()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_DisableHits();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isRefreshOnlyIfNewer <em>Refresh Only If Newer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Refresh Only If Newer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isRefreshOnlyIfNewer()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_RefreshOnlyIfNewer();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isShared <em>Shared</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shared</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#isShared()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_Shared();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getSize <em>Size</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getSize()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_Size();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getType <em>Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Cache#getType()
   * @see #getCache()
   * @generated
   */
  EAttribute getCache_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor <em>Cache Interceptor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cache Interceptor</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor
   * @generated
   */
  EClass getCacheInterceptor();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor#getClass_ <em>Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor#getClass_()
   * @see #getCacheInterceptor()
   * @generated
   */
  EAttribute getCacheInterceptor_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType <em>Cascade Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Cascade Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType
   * @generated
   */
  EClass getCascadeType();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeAll <em>Cascade All</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cascade All</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeAll()
   * @see #getCascadeType()
   * @generated
   */
  EReference getCascadeType_CascadeAll();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadePersist <em>Cascade Persist</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadePersist()
   * @see #getCascadeType()
   * @generated
   */
  EReference getCascadeType_CascadePersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeMerge <em>Cascade Merge</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cascade Merge</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeMerge()
   * @see #getCascadeType()
   * @generated
   */
  EReference getCascadeType_CascadeMerge();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeRemove <em>Cascade Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cascade Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeRemove()
   * @see #getCascadeType()
   * @generated
   */
  EReference getCascadeType_CascadeRemove();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeRefresh <em>Cascade Refresh</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade Refresh</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType#getCascadeRefresh()
   * @see #getCascadeType()
   * @generated
   */
  EReference getCascadeType_CascadeRefresh();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking <em>Change Tracking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Change Tracking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking
   * @generated
   */
  EClass getChangeTracking();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking#getType <em>Type</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking#getType()
   * @see #getChangeTracking()
   * @generated
   */
  EAttribute getChangeTracking_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy <em>Clone Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Clone Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy
   * @generated
   */
  EClass getCloneCopyPolicy();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getMethod <em>Method</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getMethod()
   * @see #getCloneCopyPolicy()
   * @generated
   */
  EAttribute getCloneCopyPolicy_Method();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getWorkingCopyMethod <em>Working Copy Method</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Working Copy Method</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy#getWorkingCopyMethod()
   * @see #getCloneCopyPolicy()
   * @generated
   */
  EAttribute getCloneCopyPolicy_WorkingCopyMethod();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable <em>Collection Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable
   * @generated
   */
  EClass getCollectionTable();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getJoinColumn()
   * @see #getCollectionTable()
   * @generated
   */
  EReference getCollectionTable_JoinColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getUniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getUniqueConstraint()
   * @see #getCollectionTable()
   * @generated
   */
  EReference getCollectionTable_UniqueConstraint();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCatalog <em>Catalog</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getCatalog()
   * @see #getCollectionTable()
   * @generated
   */
  EAttribute getCollectionTable_Catalog();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getName()
   * @see #getCollectionTable()
   * @generated
   */
  EAttribute getCollectionTable_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable#getSchema()
   * @see #getCollectionTable()
   * @generated
   */
  EAttribute getCollectionTable_Schema();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column <em>Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column
   * @generated
   */
  EClass getColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#getColumnDefinition <em>Column Definition</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#getColumnDefinition()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#isInsertable <em>Insertable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Insertable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#isInsertable()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Insertable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#getLength <em>Length</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#getLength()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Length();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#getName()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#isNullable()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Nullable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#getPrecision <em>Precision</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#getPrecision()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Precision();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#getScale()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Scale();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#getTable <em>Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#getTable()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Table();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#isUnique()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Unique();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Column#isUpdatable <em>Updatable</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Updatable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Column#isUpdatable()
   * @see #getColumn()
   * @generated
   */
  EAttribute getColumn_Updatable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ColumnResult <em>Column Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Column Result</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ColumnResult
   * @generated
   */
  EClass getColumnResult();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ColumnResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ColumnResult#getName()
   * @see #getColumnResult()
   * @generated
   */
  EAttribute getColumnResult_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue <em>Conversion Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Conversion Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue
   * @generated
   */
  EClass getConversionValue();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getDataValue <em>Data Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Data Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getDataValue()
   * @see #getConversionValue()
   * @generated
   */
  EAttribute getConversionValue_DataValue();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getObjectValue <em>Object Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Object Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ConversionValue#getObjectValue()
   * @see #getConversionValue()
   * @generated
   */
  EAttribute getConversionValue_ObjectValue();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Converter <em>Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Converter
   * @generated
   */
  EClass getConverter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Converter#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Converter#getClass_()
   * @see #getConverter()
   * @generated
   */
  EAttribute getConverter_Class();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Converter#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Converter#getName()
   * @see #getConverter()
   * @generated
   */
  EAttribute getConverter_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy <em>Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy
   * @generated
   */
  EClass getCopyPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy#getClass_()
   * @see #getCopyPolicy()
   * @generated
   */
  EAttribute getCopyPolicy_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Customizer <em>Customizer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Customizer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Customizer
   * @generated
   */
  EClass getCustomizer();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Customizer#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Customizer#getClass_()
   * @see #getCustomizer()
   * @generated
   */
  EAttribute getCustomizer_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass <em>Discriminator Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminator Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass
   * @generated
   */
  EClass getDiscriminatorClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getDiscriminator <em>Discriminator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getDiscriminator()
   * @see #getDiscriminatorClass()
   * @generated
   */
  EAttribute getDiscriminatorClass_Discriminator();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getValue <em>Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorClass#getValue()
   * @see #getDiscriminatorClass()
   * @generated
   */
  EAttribute getDiscriminatorClass_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn <em>Discriminator Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Discriminator Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn
   * @generated
   */
  EClass getDiscriminatorColumn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getColumnDefinition()
   * @see #getDiscriminatorColumn()
   * @generated
   */
  EAttribute getDiscriminatorColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getDiscriminatorType <em>Discriminator Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getDiscriminatorType()
   * @see #getDiscriminatorColumn()
   * @generated
   */
  EAttribute getDiscriminatorColumn_DiscriminatorType();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getLength <em>Length</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getLength()
   * @see #getDiscriminatorColumn()
   * @generated
   */
  EAttribute getDiscriminatorColumn_Length();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn#getName()
   * @see #getDiscriminatorColumn()
   * @generated
   */
  EAttribute getDiscriminatorColumn_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getEntityMappings <em>Entity Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot#getEntityMappings()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_EntityMappings();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable <em>Eclipselink Collection Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Eclipselink Collection Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable
   * @generated
   */
  EClass getEclipselinkCollectionTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getPrimaryKeyJoinColumn()
   * @see #getEclipselinkCollectionTable()
   * @generated
   */
  EReference getEclipselinkCollectionTable_PrimaryKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getUniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getUniqueConstraint()
   * @see #getEclipselinkCollectionTable()
   * @generated
   */
  EReference getEclipselinkCollectionTable_UniqueConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCatalog <em>Catalog</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getCatalog()
   * @see #getEclipselinkCollectionTable()
   * @generated
   */
  EAttribute getEclipselinkCollectionTable_Catalog();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getName()
   * @see #getEclipselinkCollectionTable()
   * @generated
   */
  EAttribute getEclipselinkCollectionTable_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EclipselinkCollectionTable#getSchema()
   * @see #getEclipselinkCollectionTable()
   * @generated
   */
  EAttribute getEclipselinkCollectionTable_Schema();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection <em>Element Collection</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Collection</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection
   * @generated
   */
  EClass getElementCollection();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderBy <em>Order By</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Order By</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderBy()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_OrderBy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderColumn <em>Order Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Order Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getOrderColumn()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_OrderColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKey <em>Map Key</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Map Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKey()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_MapKey();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyClass <em>Map Key Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyClass()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_MapKeyClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyTemporal <em>Map Key Temporal</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyTemporal()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_MapKeyTemporal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyEnumerated()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_MapKeyEnumerated();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyConvert <em>Map Key Convert</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Key Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyConvert()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_MapKeyConvert();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyAttributeOverride()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_MapKeyAttributeOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyAssociationOverride <em>Map Key Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyAssociationOverride()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_MapKeyAssociationOverride();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyColumn <em>Map Key Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyColumn()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_MapKeyColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getMapKeyJoinColumn()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_MapKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getColumn <em>Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getColumn()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_Column();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTemporal <em>Temporal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTemporal()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Temporal();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getEnumerated <em>Enumerated</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getEnumerated()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Enumerated();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getLob <em>Lob</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lob</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getLob()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_Lob();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConvert <em>Convert</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConvert()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Convert();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAttributeOverride <em>Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAttributeOverride()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_AttributeOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAssociationOverride <em>Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAssociationOverride()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_AssociationOverride();

  /**
   * Returns the meta object for the attribute list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getGroup <em>Group</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getGroup()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Group();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getConverter()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_Converter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTypeConverter <em>Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTypeConverter()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_TypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getObjectTypeConverter()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getStructConverter()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_StructConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getCollectionTable <em>Collection Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getCollectionTable()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_CollectionTable();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getProperty()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccessMethods <em>Access Methods</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccessMethods()
   * @see #getElementCollection()
   * @generated
   */
  EReference getElementCollection_AccessMethods();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getAccess()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Access();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getFetch <em>Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getFetch()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Fetch();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getName()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTargetClass <em>Target Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection#getTargetClass()
   * @see #getElementCollection()
   * @generated
   */
  EAttribute getElementCollection_TargetClass();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable <em>Embeddable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Embeddable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable
   * @generated
   */
  EClass getEmbeddable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getDescription()
   * @see #getEmbeddable()
   * @generated
   */
  EAttribute getEmbeddable_Description();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCustomizer <em>Customizer</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Customizer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCustomizer()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_Customizer();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getChangeTracking <em>Change Tracking</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Change Tracking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getChangeTracking()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_ChangeTracking();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getConverter()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_Converter();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getTypeConverter()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_TypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getObjectTypeConverter()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getStructConverter()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_StructConverter();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getProperty()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAttributes <em>Attributes</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAttributes()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_Attributes();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCopyPolicy <em>Copy Policy</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCopyPolicy()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_CopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instantiation Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getInstantiationCopyPolicy()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_InstantiationCopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCloneCopyPolicy <em>Clone Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clone Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getCloneCopyPolicy()
   * @see #getEmbeddable()
   * @generated
   */
  EReference getEmbeddable_CloneCopyPolicy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getAccess()
   * @see #getEmbeddable()
   * @generated
   */
  EAttribute getEmbeddable_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#getClass_()
   * @see #getEmbeddable()
   * @generated
   */
  EAttribute getEmbeddable_Class();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isExcludeDefaultMappings()
   * @see #getEmbeddable()
   * @generated
   */
  EAttribute getEmbeddable_ExcludeDefaultMappings();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isMetadataComplete <em>Metadata Complete</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metadata Complete</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embeddable#isMetadataComplete()
   * @see #getEmbeddable()
   * @generated
   */
  EAttribute getEmbeddable_MetadataComplete();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded <em>Embedded</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedded</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded
   * @generated
   */
  EClass getEmbedded();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAttributeOverride <em>Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAttributeOverride()
   * @see #getEmbedded()
   * @generated
   */
  EReference getEmbedded_AttributeOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAssociationOverride <em>Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAssociationOverride()
   * @see #getEmbedded()
   * @generated
   */
  EReference getEmbedded_AssociationOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getProperty()
   * @see #getEmbedded()
   * @generated
   */
  EReference getEmbedded_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAccessMethods()
   * @see #getEmbedded()
   * @generated
   */
  EReference getEmbedded_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getAccess()
   * @see #getEmbedded()
   * @generated
   */
  EAttribute getEmbedded_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Embedded#getName()
   * @see #getEmbedded()
   * @generated
   */
  EAttribute getEmbedded_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId <em>Embedded Id</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Embedded Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId
   * @generated
   */
  EClass getEmbeddedId();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getAttributeOverride <em>Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getAttributeOverride()
   * @see #getEmbeddedId()
   * @generated
   */
  EReference getEmbeddedId_AttributeOverride();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getProperty()
   * @see #getEmbeddedId()
   * @generated
   */
  EReference getEmbeddedId_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getAccessMethods()
   * @see #getEmbeddedId()
   * @generated
   */
  EReference getEmbeddedId_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getAccess()
   * @see #getEmbeddedId()
   * @generated
   */
  EAttribute getEmbeddedId_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmbeddedId#getName()
   * @see #getEmbeddedId()
   * @generated
   */
  EAttribute getEmbeddedId_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType <em>Empty Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Empty Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType
   * @generated
   */
  EClass getEmptyType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDescription()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Description();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCustomizer <em>Customizer</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Customizer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCustomizer()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Customizer();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getChangeTracking <em>Change Tracking</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Change Tracking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getChangeTracking()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ChangeTracking();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTable()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Table();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSecondaryTable <em>Secondary Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Secondary Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSecondaryTable()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SecondaryTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKeyJoinColumn()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PrimaryKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getIdClass <em>Id Class</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getIdClass()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_IdClass();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKey <em>Primary Key</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Primary Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrimaryKey()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PrimaryKey();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInheritance <em>Inheritance</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Inheritance</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInheritance()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Inheritance();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorValue <em>Discriminator Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorValue()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_DiscriminatorValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorColumn <em>Discriminator Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getDiscriminatorColumn()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_DiscriminatorColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getOptimisticLocking <em>Optimistic Locking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optimistic Locking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getOptimisticLocking()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_OptimisticLocking();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCache <em>Cache</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cache</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCache()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Cache();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCacheInterceptor <em>Cache Interceptor</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cache Interceptor</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCacheInterceptor()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_CacheInterceptor();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getConverter <em>Converter</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getConverter()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Converter();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTypeConverter()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_TypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getObjectTypeConverter()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getStructConverter <em>Struct Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getStructConverter()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCopyPolicy <em>Copy Policy</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCopyPolicy()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_CopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instantiation Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getInstantiationCopyPolicy()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_InstantiationCopyPolicy();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCloneCopyPolicy <em>Clone Copy Policy</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Clone Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getCloneCopyPolicy()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_CloneCopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSequenceGenerator <em>Sequence Generator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSequenceGenerator()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SequenceGenerator();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTableGenerator <em>Table Generator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Table Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getTableGenerator()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_TableGenerator();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedQuery <em>Named Query</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Named Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedQuery()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_NamedQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedNativeQuery <em>Named Native Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedNativeQuery()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_NamedNativeQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Stored Procedure Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getNamedStoredProcedureQuery()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_NamedStoredProcedureQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getSqlResultSetMapping()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_SqlResultSetMapping();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getQueryRedirectors <em>Query Redirectors</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Query Redirectors</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getQueryRedirectors()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_QueryRedirectors();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeDefaultListeners()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ExcludeDefaultListeners();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExcludeSuperclassListeners()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_ExcludeSuperclassListeners();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getEntityListeners <em>Entity Listeners</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getEntityListeners()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_EntityListeners();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrePersist <em>Pre Persist</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPrePersist()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PrePersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostPersist <em>Post Persist</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostPersist()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PostPersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreRemove <em>Pre Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreRemove()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PreRemove();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostRemove <em>Post Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostRemove()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PostRemove();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreUpdate <em>Pre Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPreUpdate()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PreUpdate();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostUpdate <em>Post Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostUpdate()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PostUpdate();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostLoad <em>Post Load</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Post Load</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getPostLoad()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_PostLoad();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getProperty()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Property();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributeOverride <em>Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributeOverride()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_AttributeOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAssociationOverride <em>Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAssociationOverride()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_AssociationOverride();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributes <em>Attributes</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAttributes()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attributes();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getAccess()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCacheable <em>Cacheable</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cacheable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isCacheable()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Cacheable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getClass_()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Class();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isExcludeDefaultMappings()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_ExcludeDefaultMappings();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExistenceChecking <em>Existence Checking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Existence Checking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getExistenceChecking()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_ExistenceChecking();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isMetadataComplete <em>Metadata Complete</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Metadata Complete</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isMetadataComplete()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_MetadataComplete();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isReadOnly <em>Read Only</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Read Only</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Entity#isReadOnly()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_ReadOnly();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener <em>Entity Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Listener</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener
   * @generated
   */
  EClass getEntityListener();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getDescription()
   * @see #getEntityListener()
   * @generated
   */
  EAttribute getEntityListener_Description();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPrePersist <em>Pre Persist</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPrePersist()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PrePersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostPersist <em>Post Persist</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostPersist()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PostPersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPreRemove <em>Pre Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPreRemove()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PreRemove();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostRemove <em>Post Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostRemove()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PostRemove();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPreUpdate <em>Pre Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPreUpdate()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PreUpdate();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostUpdate <em>Post Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostUpdate()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PostUpdate();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostLoad <em>Post Load</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Load</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getPostLoad()
   * @see #getEntityListener()
   * @generated
   */
  EReference getEntityListener_PostLoad();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getClass_ <em>Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListener#getClass_()
   * @see #getEntityListener()
   * @generated
   */
  EAttribute getEntityListener_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners <em>Entity Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners
   * @generated
   */
  EClass getEntityListeners();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners#getEntityListener <em>Entity Listener</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Listener</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners#getEntityListener()
   * @see #getEntityListeners()
   * @generated
   */
  EReference getEntityListeners_EntityListener();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType <em>Entity Mappings Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Mappings Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType
   * @generated
   */
  EClass getEntityMappingsType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getDescription()
   * @see #getEntityMappingsType()
   * @generated
   */
  EAttribute getEntityMappingsType_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Persistence Unit Metadata</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPersistenceUnitMetadata()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_PersistenceUnitMetadata();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPackage <em>Package</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getPackage()
   * @see #getEntityMappingsType()
   * @generated
   */
  EAttribute getEntityMappingsType_Package();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSchema()
   * @see #getEntityMappingsType()
   * @generated
   */
  EAttribute getEntityMappingsType_Schema();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getCatalog <em>Catalog</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getCatalog()
   * @see #getEntityMappingsType()
   * @generated
   */
  EAttribute getEntityMappingsType_Catalog();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getAccess()
   * @see #getEntityMappingsType()
   * @generated
   */
  EAttribute getEntityMappingsType_Access();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getConverter()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_Converter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTypeConverter <em>Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTypeConverter()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_TypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getObjectTypeConverter()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getStructConverter()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_StructConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSequenceGenerator <em>Sequence Generator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSequenceGenerator()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_SequenceGenerator();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTableGenerator <em>Table Generator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Table Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getTableGenerator()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_TableGenerator();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedQuery <em>Named Query</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Named Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedQuery()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_NamedQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedNativeQuery <em>Named Native Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Native Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedNativeQuery()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_NamedNativeQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Named Stored Procedure Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getNamedStoredProcedureQuery()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_NamedStoredProcedureQuery();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sql Result Set Mapping</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getSqlResultSetMapping()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_SqlResultSetMapping();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getMappedSuperclass <em>Mapped Superclass</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapped Superclass</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getMappedSuperclass()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_MappedSuperclass();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getEntity <em>Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Entity</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getEntity()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_Entity();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getEmbeddable <em>Embeddable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Embeddable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getEmbeddable()
   * @see #getEntityMappingsType()
   * @generated
   */
  EReference getEntityMappingsType_Embeddable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getVersion <em>Version</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType#getVersion()
   * @see #getEntityMappingsType()
   * @generated
   */
  EAttribute getEntityMappingsType_Version();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult <em>Entity Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Result</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult
   * @generated
   */
  EClass getEntityResult();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult#getFieldResult <em>Field Result</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Field Result</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult#getFieldResult()
   * @see #getEntityResult()
   * @generated
   */
  EReference getEntityResult_FieldResult();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult#getDiscriminatorColumn <em>Discriminator Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Discriminator Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult#getDiscriminatorColumn()
   * @see #getEntityResult()
   * @generated
   */
  EAttribute getEntityResult_DiscriminatorColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult#getEntityClass <em>Entity Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Entity Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EntityResult#getEntityClass()
   * @see #getEntityResult()
   * @generated
   */
  EAttribute getEntityResult_EntityClass();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult <em>Field Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Result</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult
   * @generated
   */
  EClass getFieldResult();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getColumn()
   * @see #getFieldResult()
   * @generated
   */
  EAttribute getFieldResult_Column();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FieldResult#getName()
   * @see #getFieldResult()
   * @generated
   */
  EAttribute getFieldResult_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue <em>Generated Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Generated Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue
   * @generated
   */
  EClass getGeneratedValue();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getGenerator <em>Generator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getGenerator()
   * @see #getGeneratedValue()
   * @generated
   */
  EAttribute getGeneratedValue_Generator();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getStrategy <em>Strategy</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Strategy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GeneratedValue#getStrategy()
   * @see #getGeneratedValue()
   * @generated
   */
  EAttribute getGeneratedValue_Strategy();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id <em>Id</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id
   * @generated
   */
  EClass getId();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getColumn()
   * @see #getId()
   * @generated
   */
  EReference getId_Column();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getGeneratedValue <em>Generated Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Generated Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getGeneratedValue()
   * @see #getId()
   * @generated
   */
  EReference getId_GeneratedValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTemporal <em>Temporal</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTemporal()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Temporal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConvert <em>Convert</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConvert()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Convert();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConverter <em>Converter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getConverter()
   * @see #getId()
   * @generated
   */
  EReference getId_Converter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTypeConverter()
   * @see #getId()
   * @generated
   */
  EReference getId_TypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getObjectTypeConverter()
   * @see #getId()
   * @generated
   */
  EReference getId_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getStructConverter <em>Struct Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getStructConverter()
   * @see #getId()
   * @generated
   */
  EReference getId_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTableGenerator <em>Table Generator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Table Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getTableGenerator()
   * @see #getId()
   * @generated
   */
  EReference getId_TableGenerator();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getSequenceGenerator <em>Sequence Generator</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Sequence Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getSequenceGenerator()
   * @see #getId()
   * @generated
   */
  EReference getId_SequenceGenerator();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getProperty()
   * @see #getId()
   * @generated
   */
  EReference getId_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccessMethods()
   * @see #getId()
   * @generated
   */
  EReference getId_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getAccess()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#isMutable()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Mutable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Id#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Id#getName()
   * @see #getId()
   * @generated
   */
  EAttribute getId_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.IdClass <em>Id Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdClass
   * @generated
   */
  EClass getIdClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.IdClass#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdClass#getClass_()
   * @see #getIdClass()
   * @generated
   */
  EAttribute getIdClass_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Inheritance</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance
   * @generated
   */
  EClass getInheritance();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance#getStrategy <em>Strategy</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Strategy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance#getStrategy()
   * @see #getInheritance()
   * @generated
   */
  EAttribute getInheritance_Strategy();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Instantiation Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy
   * @generated
   */
  EClass getInstantiationCopyPolicy();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn <em>Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn
   * @generated
   */
  EClass getJoinColumn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getColumnDefinition()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isInsertable <em>Insertable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Insertable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isInsertable()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_Insertable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getName()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isNullable <em>Nullable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isNullable()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_Nullable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getReferencedColumnName()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_ReferencedColumnName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#getTable()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_Table();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isUnique()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_Unique();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isUpdatable <em>Updatable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Updatable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn#isUpdatable()
   * @see #getJoinColumn()
   * @generated
   */
  EAttribute getJoinColumn_Updatable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable <em>Join Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable
   * @generated
   */
  EClass getJoinTable();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getJoinColumn()
   * @see #getJoinTable()
   * @generated
   */
  EReference getJoinTable_JoinColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getInverseJoinColumn <em>Inverse Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inverse Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getInverseJoinColumn()
   * @see #getJoinTable()
   * @generated
   */
  EReference getJoinTable_InverseJoinColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getUniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getUniqueConstraint()
   * @see #getJoinTable()
   * @generated
   */
  EReference getJoinTable_UniqueConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getCatalog <em>Catalog</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getCatalog()
   * @see #getJoinTable()
   * @generated
   */
  EAttribute getJoinTable_Catalog();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getName()
   * @see #getJoinTable()
   * @generated
   */
  EAttribute getJoinTable_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable#getSchema()
   * @see #getJoinTable()
   * @generated
   */
  EAttribute getJoinTable_Schema();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Lob <em>Lob</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for class '<em>Lob</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Lob
   * @generated
   */
  EClass getLob();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany <em>Many To Many</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To Many</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany
   * @generated
   */
  EClass getManyToMany();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderBy <em>Order By</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Order By</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderBy()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_OrderBy();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderColumn <em>Order Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Order Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getOrderColumn()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_OrderColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKey <em>Map Key</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKey()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_MapKey();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyClass <em>Map Key Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Map Key Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyClass()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_MapKeyClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyTemporal()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_MapKeyTemporal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyEnumerated()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_MapKeyEnumerated();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyConvert <em>Map Key Convert</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Map Key Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyConvert()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_MapKeyConvert();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyAttributeOverride()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_MapKeyAttributeOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyAssociationOverride <em>Map Key Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyAssociationOverride()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_MapKeyAssociationOverride();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyColumn <em>Map Key Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Map Key Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyColumn()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_MapKeyColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMapKeyJoinColumn()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_MapKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getConverter()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_Converter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTypeConverter()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_TypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getObjectTypeConverter()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getStructConverter()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinTable <em>Join Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinTable()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_JoinTable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getCascade()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_Cascade();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinFetch <em>Join Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Join Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getJoinFetch()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_JoinFetch();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getProperty()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccessMethods()
   * @see #getManyToMany()
   * @generated
   */
  EReference getManyToMany_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getAccess()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getFetch()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_Fetch();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMappedBy <em>Mapped By</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getMappedBy()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_MappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getName()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTargetEntity <em>Target Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Target Entity</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToMany#getTargetEntity()
   * @see #getManyToMany()
   * @generated
   */
  EAttribute getManyToMany_TargetEntity();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne <em>Many To One</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Many To One</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne
   * @generated
   */
  EClass getManyToOne();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinColumn()
   * @see #getManyToOne()
   * @generated
   */
  EReference getManyToOne_JoinColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinTable <em>Join Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinTable()
   * @see #getManyToOne()
   * @generated
   */
  EReference getManyToOne_JoinTable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getCascade()
   * @see #getManyToOne()
   * @generated
   */
  EReference getManyToOne_Cascade();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinFetch <em>Join Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Join Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getJoinFetch()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_JoinFetch();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getProperty()
   * @see #getManyToOne()
   * @generated
   */
  EReference getManyToOne_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccessMethods()
   * @see #getManyToOne()
   * @generated
   */
  EReference getManyToOne_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getAccess()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getFetch()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_Fetch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isId <em>Id</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isId()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_Id();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getMapsId <em>Maps Id</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maps Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getMapsId()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_MapsId();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getName()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#isOptional()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_Optional();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getTargetEntity <em>Target Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Target Entity</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne#getTargetEntity()
   * @see #getManyToOne()
   * @generated
   */
  EAttribute getManyToOne_TargetEntity();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKey <em>Map Key</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKey
   * @generated
   */
  EClass getMapKey();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKey#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKey#getName()
   * @see #getMapKey()
   * @generated
   */
  EAttribute getMapKey_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass <em>Map Key Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Key Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass
   * @generated
   */
  EClass getMapKeyClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass#getClass_()
   * @see #getMapKeyClass()
   * @generated
   */
  EAttribute getMapKeyClass_Class();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn <em>Map Key Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Key Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn
   * @generated
   */
  EClass getMapKeyColumn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getColumnDefinition()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isInsertable <em>Insertable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Insertable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isInsertable()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Insertable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getLength <em>Length</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getLength()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Length();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getName()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isNullable <em>Nullable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isNullable()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Nullable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getPrecision <em>Precision</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Precision</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getPrecision()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Precision();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getScale <em>Scale</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scale</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getScale()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Scale();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getTable <em>Table</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#getTable()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Table();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUnique <em>Unique</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUnique()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Unique();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUpdatable <em>Updatable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Updatable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn#isUpdatable()
   * @see #getMapKeyColumn()
   * @generated
   */
  EAttribute getMapKeyColumn_Updatable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn <em>Map Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn
   * @generated
   */
  EClass getMapKeyJoinColumn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getColumnDefinition()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isInsertable <em>Insertable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Insertable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isInsertable()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_Insertable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getName()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isNullable <em>Nullable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isNullable()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_Nullable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getReferencedColumnName()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_ReferencedColumnName();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getTable <em>Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#getTable()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_Table();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isUnique <em>Unique</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Unique</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isUnique()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_Unique();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isUpdatable <em>Updatable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Updatable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn#isUpdatable()
   * @see #getMapKeyJoinColumn()
   * @generated
   */
  EAttribute getMapKeyJoinColumn_Updatable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass <em>Mapped Superclass</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapped Superclass</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass
   * @generated
   */
  EClass getMappedSuperclass();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getDescription()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_Description();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCustomizer <em>Customizer</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Customizer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCustomizer()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_Customizer();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getChangeTracking <em>Change Tracking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Change Tracking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getChangeTracking()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_ChangeTracking();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getIdClass <em>Id Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Id Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getIdClass()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_IdClass();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPrimaryKey <em>Primary Key</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Primary Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPrimaryKey()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PrimaryKey();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getOptimisticLocking <em>Optimistic Locking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optimistic Locking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getOptimisticLocking()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_OptimisticLocking();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCache <em>Cache</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cache</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCache()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_Cache();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCacheInterceptor <em>Cache Interceptor</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cache Interceptor</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCacheInterceptor()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_CacheInterceptor();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getConverter()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_Converter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getTypeConverter <em>Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getTypeConverter()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_TypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getObjectTypeConverter()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getStructConverter()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCopyPolicy <em>Copy Policy</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCopyPolicy()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_CopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instantiation Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getInstantiationCopyPolicy()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_InstantiationCopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCloneCopyPolicy <em>Clone Copy Policy</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Clone Copy Policy</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getCloneCopyPolicy()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_CloneCopyPolicy();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Default Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getExcludeDefaultListeners()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_ExcludeDefaultListeners();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Superclass Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getExcludeSuperclassListeners()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_ExcludeSuperclassListeners();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getEntityListeners <em>Entity Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getEntityListeners()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_EntityListeners();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPrePersist <em>Pre Persist</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPrePersist()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PrePersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostPersist <em>Post Persist</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostPersist()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PostPersist();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPreRemove <em>Pre Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPreRemove()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PreRemove();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostRemove <em>Post Remove</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostRemove()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PostRemove();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPreUpdate <em>Pre Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Pre Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPreUpdate()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PreUpdate();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostUpdate <em>Post Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostUpdate()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PostUpdate();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostLoad <em>Post Load</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Post Load</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getPostLoad()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_PostLoad();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getProperty()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getAttributes <em>Attributes</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getAttributes()
   * @see #getMappedSuperclass()
   * @generated
   */
  EReference getMappedSuperclass_Attributes();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getAccess()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_Access();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isCacheable <em>Cacheable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Cacheable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isCacheable()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_Cacheable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getClass_ <em>Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getClass_()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_Class();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclude Default Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isExcludeDefaultMappings()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_ExcludeDefaultMappings();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getExistenceChecking <em>Existence Checking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Existence Checking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#getExistenceChecking()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_ExistenceChecking();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isMetadataComplete <em>Metadata Complete</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Metadata Complete</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isMetadataComplete()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_MetadataComplete();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isReadOnly <em>Read Only</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Read Only</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.MappedSuperclass#isReadOnly()
   * @see #getMappedSuperclass()
   * @generated
   */
  EAttribute getMappedSuperclass_ReadOnly();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery <em>Named Native Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Native Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery
   * @generated
   */
  EClass getNamedNativeQuery();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getDescription()
   * @see #getNamedNativeQuery()
   * @generated
   */
  EAttribute getNamedNativeQuery_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getQuery <em>Query</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getQuery()
   * @see #getNamedNativeQuery()
   * @generated
   */
  EAttribute getNamedNativeQuery_Query();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getHint()
   * @see #getNamedNativeQuery()
   * @generated
   */
  EReference getNamedNativeQuery_Hint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getName()
   * @see #getNamedNativeQuery()
   * @generated
   */
  EAttribute getNamedNativeQuery_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getResultClass <em>Result Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Result Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getResultClass()
   * @see #getNamedNativeQuery()
   * @generated
   */
  EAttribute getNamedNativeQuery_ResultClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery#getResultSetMapping()
   * @see #getNamedNativeQuery()
   * @generated
   */
  EAttribute getNamedNativeQuery_ResultSetMapping();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery <em>Named Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery
   * @generated
   */
  EClass getNamedQuery();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getDescription()
   * @see #getNamedQuery()
   * @generated
   */
  EAttribute getNamedQuery_Description();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getQuery()
   * @see #getNamedQuery()
   * @generated
   */
  EAttribute getNamedQuery_Query();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getLockMode <em>Lock Mode</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Lock Mode</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getLockMode()
   * @see #getNamedQuery()
   * @generated
   */
  EAttribute getNamedQuery_LockMode();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Hint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getHint()
   * @see #getNamedQuery()
   * @generated
   */
  EReference getNamedQuery_Hint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery#getName()
   * @see #getNamedQuery()
   * @generated
   */
  EAttribute getNamedQuery_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Stored Procedure Query</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery
   * @generated
   */
  EClass getNamedStoredProcedureQuery();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getHint <em>Hint</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Hint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getHint()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EReference getNamedStoredProcedureQuery_Hint();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getParameter()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EReference getNamedStoredProcedureQuery_Parameter();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getName()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EAttribute getNamedStoredProcedureQuery_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getProcedureName <em>Procedure Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Procedure Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getProcedureName()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EAttribute getNamedStoredProcedureQuery_ProcedureName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultClass <em>Result Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultClass()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EAttribute getNamedStoredProcedureQuery_ResultClass();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultSetMapping <em>Result Set Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Result Set Mapping</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#getResultSetMapping()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EAttribute getNamedStoredProcedureQuery_ResultSetMapping();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isReturnsResultSet <em>Returns Result Set</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Returns Result Set</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery#isReturnsResultSet()
   * @see #getNamedStoredProcedureQuery()
   * @generated
   */
  EAttribute getNamedStoredProcedureQuery_ReturnsResultSet();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter
   * @generated
   */
  EClass getObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getConversionValue <em>Conversion Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Conversion Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getConversionValue()
   * @see #getObjectTypeConverter()
   * @generated
   */
  EReference getObjectTypeConverter_ConversionValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDefaultObjectValue <em>Default Object Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Object Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDefaultObjectValue()
   * @see #getObjectTypeConverter()
   * @generated
   */
  EAttribute getObjectTypeConverter_DefaultObjectValue();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDataType <em>Data Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getDataType()
   * @see #getObjectTypeConverter()
   * @generated
   */
  EAttribute getObjectTypeConverter_DataType();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getName()
   * @see #getObjectTypeConverter()
   * @generated
   */
  EAttribute getObjectTypeConverter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter#getObjectType()
   * @see #getObjectTypeConverter()
   * @generated
   */
  EAttribute getObjectTypeConverter_ObjectType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany <em>One To Many</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>One To Many</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany
   * @generated
   */
  EClass getOneToMany();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderBy <em>Order By</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Order By</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderBy()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_OrderBy();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderColumn <em>Order Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Order Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getOrderColumn()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_OrderColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKey <em>Map Key</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Map Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKey()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_MapKey();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyClass <em>Map Key Class</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Map Key Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyClass()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_MapKeyClass();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyTemporal <em>Map Key Temporal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Map Key Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyTemporal()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_MapKeyTemporal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyEnumerated <em>Map Key Enumerated</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map Key Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyEnumerated()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_MapKeyEnumerated();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyConvert <em>Map Key Convert</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Map Key Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyConvert()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_MapKeyConvert();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Attribute Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyAttributeOverride()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_MapKeyAttributeOverride();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyAssociationOverride <em>Map Key Association Override</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Association Override</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyAssociationOverride()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_MapKeyAssociationOverride();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyColumn <em>Map Key Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Map Key Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyColumn()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_MapKeyColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyJoinColumn <em>Map Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Map Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMapKeyJoinColumn()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_MapKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getConverter()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_Converter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTypeConverter()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_TypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getObjectTypeConverter()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getStructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getStructConverter()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_StructConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinTable <em>Join Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinTable()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_JoinTable();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinColumn()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_JoinColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getCascade()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_Cascade();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getPrivateOwned <em>Private Owned</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Private Owned</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getPrivateOwned()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_PrivateOwned();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinFetch <em>Join Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Join Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getJoinFetch()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_JoinFetch();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getProperty()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccessMethods()
   * @see #getOneToMany()
   * @generated
   */
  EReference getOneToMany_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getAccess()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getFetch()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_Fetch();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMappedBy <em>Mapped By</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getMappedBy()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_MappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getName()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#isOrphanRemoval <em>Orphan Removal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Orphan Removal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#isOrphanRemoval()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_OrphanRemoval();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTargetEntity <em>Target Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Target Entity</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany#getTargetEntity()
   * @see #getOneToMany()
   * @generated
   */
  EAttribute getOneToMany_TargetEntity();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne <em>One To One</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>One To One</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne
   * @generated
   */
  EClass getOneToOne();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrimaryKeyJoinColumn()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_PrimaryKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinColumn()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_JoinColumn();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinTable <em>Join Table</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Join Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinTable()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_JoinTable();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getCascade <em>Cascade</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getCascade()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_Cascade();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrivateOwned <em>Private Owned</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Private Owned</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getPrivateOwned()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_PrivateOwned();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch <em>Join Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Join Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getJoinFetch()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_JoinFetch();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getProperty()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccessMethods()
   * @see #getOneToOne()
   * @generated
   */
  EReference getOneToOne_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getAccess()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getFetch()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_Fetch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId <em>Id</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isId()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_Id();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMappedBy <em>Mapped By</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Mapped By</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMappedBy()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_MappedBy();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMapsId <em>Maps Id</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maps Id</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getMapsId()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_MapsId();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getName()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOptional()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_Optional();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval <em>Orphan Removal</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Orphan Removal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#isOrphanRemoval()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_OrphanRemoval();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getTargetEntity <em>Target Entity</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Target Entity</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OneToOne#getTargetEntity()
   * @see #getOneToOne()
   * @generated
   */
  EAttribute getOneToOne_TargetEntity();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking <em>Optimistic Locking</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Optimistic Locking</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking
   * @generated
   */
  EClass getOptimisticLocking();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getSelectedColumn <em>Selected Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selected Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getSelectedColumn()
   * @see #getOptimisticLocking()
   * @generated
   */
  EReference getOptimisticLocking_SelectedColumn();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#isCascade <em>Cascade</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Cascade</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#isCascade()
   * @see #getOptimisticLocking()
   * @generated
   */
  EAttribute getOptimisticLocking_Cascade();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getType <em>Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking#getType()
   * @see #getOptimisticLocking()
   * @generated
   */
  EAttribute getOptimisticLocking_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn <em>Order Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Order Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn
   * @generated
   */
  EClass getOrderColumn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getColumnDefinition()
   * @see #getOrderColumn()
   * @generated
   */
  EAttribute getOrderColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getCorrectionType <em>Correction Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Correction Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getCorrectionType()
   * @see #getOrderColumn()
   * @generated
   */
  EAttribute getOrderColumn_CorrectionType();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isInsertable <em>Insertable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Insertable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isInsertable()
   * @see #getOrderColumn()
   * @generated
   */
  EAttribute getOrderColumn_Insertable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#getName()
   * @see #getOrderColumn()
   * @generated
   */
  EAttribute getOrderColumn_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isNullable <em>Nullable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isNullable()
   * @see #getOrderColumn()
   * @generated
   */
  EAttribute getOrderColumn_Nullable();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isUpdatable <em>Updatable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Updatable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn#isUpdatable()
   * @see #getOrderColumn()
   * @generated
   */
  EAttribute getOrderColumn_Updatable();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence Unit Defaults</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults
   * @generated
   */
  EClass getPersistenceUnitDefaults();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDescription()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EAttribute getPersistenceUnitDefaults_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getSchema()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EAttribute getPersistenceUnitDefaults_Schema();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCatalog <em>Catalog</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCatalog()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EAttribute getPersistenceUnitDefaults_Catalog();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDelimitedIdentifiers <em>Delimited Identifiers</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Delimited Identifiers</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getDelimitedIdentifiers()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EReference getPersistenceUnitDefaults_DelimitedIdentifiers();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getAccess()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EAttribute getPersistenceUnitDefaults_Access();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCascadePersist <em>Cascade Persist</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cascade Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getCascadePersist()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EReference getPersistenceUnitDefaults_CascadePersist();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getEntityListeners <em>Entity Listeners</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entity Listeners</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitDefaults#getEntityListeners()
   * @see #getPersistenceUnitDefaults()
   * @generated
   */
  EReference getPersistenceUnitDefaults_EntityListeners();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata <em>Persistence Unit Metadata</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Persistence Unit Metadata</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata
   * @generated
   */
  EClass getPersistenceUnitMetadata();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getDescription()
   * @see #getPersistenceUnitMetadata()
   * @generated
   */
  EAttribute getPersistenceUnitMetadata_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete <em>Xml Mapping Metadata Complete</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Xml Mapping Metadata Complete</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getXmlMappingMetadataComplete()
   * @see #getPersistenceUnitMetadata()
   * @generated
   */
  EReference getPersistenceUnitMetadata_XmlMappingMetadataComplete();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getExcludeDefaultMappings <em>Exclude Default Mappings</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exclude Default Mappings</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getExcludeDefaultMappings()
   * @see #getPersistenceUnitMetadata()
   * @generated
   */
  EReference getPersistenceUnitMetadata_ExcludeDefaultMappings();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults <em>Persistence Unit Defaults</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Persistence Unit Defaults</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PersistenceUnitMetadata#getPersistenceUnitDefaults()
   * @see #getPersistenceUnitMetadata()
   * @generated
   */
  EReference getPersistenceUnitMetadata_PersistenceUnitDefaults();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad <em>Post Load</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Load</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad
   * @generated
   */
  EClass getPostLoad();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad#getDescription()
   * @see #getPostLoad()
   * @generated
   */
  EAttribute getPostLoad_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad#getMethodName()
   * @see #getPostLoad()
   * @generated
   */
  EAttribute getPostLoad_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist <em>Post Persist</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist
   * @generated
   */
  EClass getPostPersist();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist#getDescription()
   * @see #getPostPersist()
   * @generated
   */
  EAttribute getPostPersist_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist#getMethodName()
   * @see #getPostPersist()
   * @generated
   */
  EAttribute getPostPersist_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove <em>Post Remove</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove
   * @generated
   */
  EClass getPostRemove();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove#getDescription()
   * @see #getPostRemove()
   * @generated
   */
  EAttribute getPostRemove_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove#getMethodName()
   * @see #getPostRemove()
   * @generated
   */
  EAttribute getPostRemove_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate <em>Post Update</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate
   * @generated
   */
  EClass getPostUpdate();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate#getDescription()
   * @see #getPostUpdate()
   * @generated
   */
  EAttribute getPostUpdate_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate#getMethodName()
   * @see #getPostUpdate()
   * @generated
   */
  EAttribute getPostUpdate_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist <em>Pre Persist</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Persist</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist
   * @generated
   */
  EClass getPrePersist();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist#getDescription()
   * @see #getPrePersist()
   * @generated
   */
  EAttribute getPrePersist_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist#getMethodName()
   * @see #getPrePersist()
   * @generated
   */
  EAttribute getPrePersist_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove <em>Pre Remove</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Remove</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove
   * @generated
   */
  EClass getPreRemove();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove#getDescription()
   * @see #getPreRemove()
   * @generated
   */
  EAttribute getPreRemove_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove#getMethodName()
   * @see #getPreRemove()
   * @generated
   */
  EAttribute getPreRemove_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate <em>Pre Update</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate
   * @generated
   */
  EClass getPreUpdate();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate#getDescription()
   * @see #getPreUpdate()
   * @generated
   */
  EAttribute getPreUpdate_Description();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate#getMethodName <em>Method Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate#getMethodName()
   * @see #getPreUpdate()
   * @generated
   */
  EAttribute getPreUpdate_MethodName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey
   * @generated
   */
  EClass getPrimaryKey();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getColumn()
   * @see #getPrimaryKey()
   * @generated
   */
  EReference getPrimaryKey_Column();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getValidation <em>Validation</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Validation</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey#getValidation()
   * @see #getPrimaryKey()
   * @generated
   */
  EAttribute getPrimaryKey_Validation();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn
   * @generated
   */
  EClass getPrimaryKeyJoinColumn();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Definition</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn#getColumnDefinition()
   * @see #getPrimaryKeyJoinColumn()
   * @generated
   */
  EAttribute getPrimaryKeyJoinColumn_ColumnDefinition();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn#getName()
   * @see #getPrimaryKeyJoinColumn()
   * @generated
   */
  EAttribute getPrimaryKeyJoinColumn_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referenced Column Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn#getReferencedColumnName()
   * @see #getPrimaryKeyJoinColumn()
   * @generated
   */
  EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property <em>Property</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValue <em>Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValue()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Value();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValueType <em>Value Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Value Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Property#getValueType()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_ValueType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint <em>Query Hint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Hint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint
   * @generated
   */
  EClass getQueryHint();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint#getDescription()
   * @see #getQueryHint()
   * @generated
   */
  EAttribute getQueryHint_Description();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint#getName()
   * @see #getQueryHint()
   * @generated
   */
  EAttribute getQueryHint_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint#getValue()
   * @see #getQueryHint()
   * @generated
   */
  EAttribute getQueryHint_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors <em>Query Redirectors</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Query Redirectors</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors
   * @generated
   */
  EClass getQueryRedirectors();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getAllQueries <em>All Queries</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>All Queries</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getAllQueries()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_AllQueries();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getDelete <em>Delete</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Delete</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getDelete()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_Delete();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getInsert <em>Insert</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Insert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getInsert()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_Insert();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadAll <em>Read All</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Read All</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadAll()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_ReadAll();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadObject <em>Read Object</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Read Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReadObject()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_ReadObject();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReport <em>Report</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Report</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getReport()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_Report();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getUpdate <em>Update</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Update</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors#getUpdate()
   * @see #getQueryRedirectors()
   * @generated
   */
  EAttribute getQueryRedirectors_Update();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer <em>Read Transformer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Transformer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer
   * @generated
   */
  EClass getReadTransformer();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getMethod <em>Method</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getMethod()
   * @see #getReadTransformer()
   * @generated
   */
  EAttribute getReadTransformer_Method();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getTransformerClass <em>Transformer Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transformer Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ReadTransformer#getTransformerClass()
   * @see #getReadTransformer()
   * @generated
   */
  EAttribute getReadTransformer_TransformerClass();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable <em>Secondary Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Secondary Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable
   * @generated
   */
  EClass getSecondaryTable();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Primary Key Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getPrimaryKeyJoinColumn()
   * @see #getSecondaryTable()
   * @generated
   */
  EReference getSecondaryTable_PrimaryKeyJoinColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getUniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getUniqueConstraint()
   * @see #getSecondaryTable()
   * @generated
   */
  EReference getSecondaryTable_UniqueConstraint();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getCatalog <em>Catalog</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getCatalog()
   * @see #getSecondaryTable()
   * @generated
   */
  EAttribute getSecondaryTable_Catalog();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getName()
   * @see #getSecondaryTable()
   * @generated
   */
  EAttribute getSecondaryTable_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable#getSchema()
   * @see #getSecondaryTable()
   * @generated
   */
  EAttribute getSecondaryTable_Schema();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator <em>Sequence Generator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator
   * @generated
   */
  EClass getSequenceGenerator();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getDescription()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_Description();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getAllocationSize <em>Allocation Size</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allocation Size</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getAllocationSize()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_AllocationSize();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getCatalog <em>Catalog</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getCatalog()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_Catalog();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getInitialValue <em>Initial Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getInitialValue()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_InitialValue();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getName()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getSchema()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_Schema();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getSequenceName <em>Sequence Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sequence Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator#getSequenceName()
   * @see #getSequenceGenerator()
   * @generated
   */
  EAttribute getSequenceGenerator_SequenceName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping <em>Sql Result Set Mapping</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Sql Result Set Mapping</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping
   * @generated
   */
  EClass getSqlResultSetMapping();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getDescription()
   * @see #getSqlResultSetMapping()
   * @generated
   */
  EAttribute getSqlResultSetMapping_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getEntityResult <em>Entity Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Result</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getEntityResult()
   * @see #getSqlResultSetMapping()
   * @generated
   */
  EReference getSqlResultSetMapping_EntityResult();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getColumnResult <em>Column Result</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Column Result</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getColumnResult()
   * @see #getSqlResultSetMapping()
   * @generated
   */
  EReference getSqlResultSetMapping_ColumnResult();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping#getName()
   * @see #getSqlResultSetMapping()
   * @generated
   */
  EAttribute getSqlResultSetMapping_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter <em>Stored Procedure Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Stored Procedure Parameter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter
   * @generated
   */
  EClass getStoredProcedureParameter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getDirection()
   * @see #getStoredProcedureParameter()
   * @generated
   */
  EAttribute getStoredProcedureParameter_Direction();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcType <em>Jdbc Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jdbc Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcType()
   * @see #getStoredProcedureParameter()
   * @generated
   */
  EAttribute getStoredProcedureParameter_JdbcType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcTypeName <em>Jdbc Type Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jdbc Type Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getJdbcTypeName()
   * @see #getStoredProcedureParameter()
   * @generated
   */
  EAttribute getStoredProcedureParameter_JdbcTypeName();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getName <em>Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getName()
   * @see #getStoredProcedureParameter()
   * @generated
   */
  EAttribute getStoredProcedureParameter_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getQueryParameter <em>Query Parameter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Query Parameter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getQueryParameter()
   * @see #getStoredProcedureParameter()
   * @generated
   */
  EAttribute getStoredProcedureParameter_QueryParameter();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getType <em>Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter#getType()
   * @see #getStoredProcedureParameter()
   * @generated
   */
  EAttribute getStoredProcedureParameter_Type();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter <em>Struct Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter
   * @generated
   */
  EClass getStructConverter();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getConverter()
   * @see #getStructConverter()
   * @generated
   */
  EAttribute getStructConverter_Converter();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter#getName()
   * @see #getStructConverter()
   * @generated
   */
  EAttribute getStructConverter_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Table <em>Table</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Table#getUniqueConstraint <em>Unique Constraint</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Table#getUniqueConstraint()
   * @see #getTable()
   * @generated
   */
  EReference getTable_UniqueConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Table#getCatalog <em>Catalog</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Table#getCatalog()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Catalog();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Table#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Table#getSchema()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Schema();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator <em>Table Generator</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Table Generator</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator
   * @generated
   */
  EClass getTableGenerator();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getDescription <em>Description</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getDescription()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_Description();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getUniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getUniqueConstraint()
   * @see #getTableGenerator()
   * @generated
   */
  EReference getTableGenerator_UniqueConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getAllocationSize <em>Allocation Size</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Allocation Size</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getAllocationSize()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_AllocationSize();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getCatalog <em>Catalog</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Catalog</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getCatalog()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_Catalog();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getInitialValue <em>Initial Value</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Initial Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getInitialValue()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_InitialValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getName()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getPkColumnName <em>Pk Column Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Column Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getPkColumnName()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_PkColumnName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getPkColumnValue <em>Pk Column Value</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pk Column Value</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getPkColumnValue()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_PkColumnValue();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getSchema <em>Schema</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Schema</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getSchema()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_Schema();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getTable <em>Table</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getTable()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_Table();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getValueColumnName <em>Value Column Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Column Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator#getValueColumnName()
   * @see #getTableGenerator()
   * @generated
   */
  EAttribute getTableGenerator_ValueColumnName();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay <em>Time Of Day</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Time Of Day</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay
   * @generated
   */
  EClass getTimeOfDay();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getHour <em>Hour</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hour</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getHour()
   * @see #getTimeOfDay()
   * @generated
   */
  EAttribute getTimeOfDay_Hour();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMillisecond <em>Millisecond</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Millisecond</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMillisecond()
   * @see #getTimeOfDay()
   * @generated
   */
  EAttribute getTimeOfDay_Millisecond();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMinute <em>Minute</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Minute</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getMinute()
   * @see #getTimeOfDay()
   * @generated
   */
  EAttribute getTimeOfDay_Minute();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getSecond <em>Second</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Second</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TimeOfDay#getSecond()
   * @see #getTimeOfDay()
   * @generated
   */
  EAttribute getTimeOfDay_Second();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getReadTransformer <em>Read Transformer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Read Transformer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getReadTransformer()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_ReadTransformer();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getWriteTransformer <em>Write Transformer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Write Transformer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getWriteTransformer()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_WriteTransformer();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Access();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getProperty()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccessMethods <em>Access Methods</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccessMethods()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_AccessMethods();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess1 <em>Access1</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access1</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getAccess1()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Access1();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getFetch <em>Fetch</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getFetch()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Fetch();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isMutable <em>Mutable</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isMutable()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Mutable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#getName()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isOptional <em>Optional</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transformation#isOptional()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Optional();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transient <em>Transient</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Transient</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transient
   * @generated
   */
  EClass getTransient();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transient#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Transient#getName()
   * @see #getTransient()
   * @generated
   */
  EAttribute getTransient_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter <em>Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter
   * @generated
   */
  EClass getTypeConverter();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getDataType <em>Data Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Data Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getDataType()
   * @see #getTypeConverter()
   * @generated
   */
  EAttribute getTypeConverter_DataType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getName()
   * @see #getTypeConverter()
   * @generated
   */
  EAttribute getTypeConverter_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getObjectType <em>Object Type</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Object Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter#getObjectType()
   * @see #getTypeConverter()
   * @generated
   */
  EAttribute getTypeConverter_ObjectType();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint <em>Unique Constraint</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Constraint</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint
   * @generated
   */
  EClass getUniqueConstraint();

  /**
   * Returns the meta object for the attribute list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getColumnName <em>Column Name</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute list '<em>Column Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getColumnName()
   * @see #getUniqueConstraint()
   * @generated
   */
  EAttribute getUniqueConstraint_ColumnName();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint#getName()
   * @see #getUniqueConstraint()
   * @generated
   */
  EAttribute getUniqueConstraint_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne <em>Variable One To One</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable One To One</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne
   * @generated
   */
  EClass getVariableOneToOne();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getCascade <em>Cascade</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Cascade</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getCascade()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_Cascade();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getDiscriminatorColumn <em>Discriminator Column</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Discriminator Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getDiscriminatorColumn()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_DiscriminatorColumn();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getDiscriminatorClass <em>Discriminator Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Discriminator Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getDiscriminatorClass()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_DiscriminatorClass();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getJoinColumn <em>Join Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Join Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getJoinColumn()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_JoinColumn();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getPrivateOwned <em>Private Owned</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Private Owned</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getPrivateOwned()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_PrivateOwned();

  /**
   * Returns the meta object for the containment reference list '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getProperty <em>Property</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getProperty()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getAccessMethods <em>Access Methods</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getAccessMethods()
   * @see #getVariableOneToOne()
   * @generated
   */
  EReference getVariableOneToOne_AccessMethods();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getAccess <em>Access</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getAccess()
   * @see #getVariableOneToOne()
   * @generated
   */
  EAttribute getVariableOneToOne_Access();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getFetch <em>Fetch</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Fetch</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getFetch()
   * @see #getVariableOneToOne()
   * @generated
   */
  EAttribute getVariableOneToOne_Fetch();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getName <em>Name</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getName()
   * @see #getVariableOneToOne()
   * @generated
   */
  EAttribute getVariableOneToOne_Name();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#isOptional <em>Optional</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#isOptional()
   * @see #getVariableOneToOne()
   * @generated
   */
  EAttribute getVariableOneToOne_Optional();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#isOrphanRemoval <em>Orphan Removal</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Orphan Removal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#isOrphanRemoval()
   * @see #getVariableOneToOne()
   * @generated
   */
  EAttribute getVariableOneToOne_OrphanRemoval();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getTargetInterface <em>Target Interface</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Interface</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.VariableOneToOne#getTargetInterface()
   * @see #getVariableOneToOne()
   * @generated
   */
  EAttribute getVariableOneToOne_TargetInterface();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version <em>Version</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Version</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version
   * @generated
   */
  EClass getVersion();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getColumn()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_Column();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getTemporal <em>Temporal</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getTemporal()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Temporal();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getConvert <em>Convert</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Convert</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getConvert()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Convert();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getConverter <em>Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getConverter()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_Converter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getTypeConverter <em>Type Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getTypeConverter()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_TypeConverter();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getObjectTypeConverter <em>Object Type Converter</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Type Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getObjectTypeConverter()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_ObjectTypeConverter();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getStructConverter <em>Struct Converter</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Struct Converter</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getStructConverter()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_StructConverter();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getProperty()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_Property();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getAccessMethods <em>Access Methods</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Access Methods</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getAccessMethods()
   * @see #getVersion()
   * @generated
   */
  EReference getVersion_AccessMethods();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getAccess <em>Access</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Access</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getAccess()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Access();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#isMutable <em>Mutable</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mutable</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#isMutable()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Mutable();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Version#getName <em>Name</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Version#getName()
   * @see #getVersion()
   * @generated
   */
  EAttribute getVersion_Name();

  /**
   * Returns the meta object for class '{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer <em>Write Transformer</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Transformer</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer
   * @generated
   */
  EClass getWriteTransformer();

  /**
   * Returns the meta object for the containment reference '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getColumn <em>Column</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the containment reference '<em>Column</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getColumn()
   * @see #getWriteTransformer()
   * @generated
   */
  EReference getWriteTransformer_Column();

  /**
   * Returns the meta object for the attribute '
   * {@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getMethod <em>Method</em>}'. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getMethod()
   * @see #getWriteTransformer()
   * @generated
   */
  EAttribute getWriteTransformer_Method();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getTransformerClass <em>Transformer Class</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transformer Class</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.WriteTransformer#getTransformerClass()
   * @see #getWriteTransformer()
   * @generated
   */
  EAttribute getWriteTransformer_TransformerClass();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType <em>Access Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Access Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @generated
   */
  EEnum getAccessType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType <em>Cache Coordination Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cache Coordination Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType
   * @generated
   */
  EEnum getCacheCoordinationType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheType <em>Cache Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Cache Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheType
   * @generated
   */
  EEnum getCacheType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType <em>Change Tracking Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Change Tracking Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType
   * @generated
   */
  EEnum getChangeTrackingType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType <em>Direction Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Direction Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @generated
   */
  EEnum getDirectionType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType <em>Discriminator Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Discriminator Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType
   * @generated
   */
  EEnum getDiscriminatorType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enum Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EnumType
   * @generated
   */
  EEnum getEnumType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType <em>Existence Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Existence Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType
   * @generated
   */
  EEnum getExistenceType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType <em>Fetch Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Fetch Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @generated
   */
  EEnum getFetchType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType <em>Generation Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Generation Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType
   * @generated
   */
  EEnum getGenerationType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation <em>Id Validation</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Id Validation</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation
   * @generated
   */
  EEnum getIdValidation();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType <em>Inheritance Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Inheritance Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType
   * @generated
   */
  EEnum getInheritanceType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType <em>Join Fetch Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Join Fetch Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @generated
   */
  EEnum getJoinFetchType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType <em>Lock Mode Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Lock Mode Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType
   * @generated
   */
  EEnum getLockModeType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType <em>Optimistic Locking Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Optimistic Locking Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType
   * @generated
   */
  EEnum getOptimisticLockingType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType <em>Order Column Correction Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Order Column Correction Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType
   * @generated
   */
  EEnum getOrderColumnCorrectionType();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType <em>Temporal Type</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Temporal Type</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType
   * @generated
   */
  EEnum getTemporalType();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.AccessType <em>Access Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Access Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.AccessType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.AccessType"
   *        extendedMetaData="name='access-type:Object' baseType='access-type'"
   * @generated
   */
  EDataType getAccessTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType <em>Cache Coordination Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cache Coordination Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.CacheCoordinationType"
   *        extendedMetaData="name='cache-coordination-type:Object' baseType='cache-coordination-type'"
   * @generated
   */
  EDataType getCacheCoordinationTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheType <em>Cache Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Cache Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.CacheType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.CacheType"
   *        extendedMetaData="name='cache-type:Object' baseType='cache-type'"
   * @generated
   */
  EDataType getCacheTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType <em>Change Tracking Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Change Tracking Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTrackingType"
   *        extendedMetaData="name='change-tracking-type:Object' baseType='change-tracking-type'"
   * @generated
   */
  EDataType getChangeTrackingTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType <em>Direction Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Direction Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.DirectionType"
   *        extendedMetaData="name='direction-type:Object' baseType='direction-type'"
   * @generated
   */
  EDataType getDirectionTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType <em>Discriminator Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Discriminator Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorType"
   *        extendedMetaData="name='discriminator-type:Object' baseType='discriminator-type'"
   * @generated
   */
  EDataType getDiscriminatorTypeObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Discriminator Value</em>}'.
   * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Discriminator Value</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='discriminator-value' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getDiscriminatorValue();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated <em>Enumerated Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Enumerated Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated"
   *        extendedMetaData="name='enumerated:Object' baseType='enumerated'"
   * @generated
   */
  EDataType getEnumeratedObject();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated <em>Enumerated</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Enumerated</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated
   * @generated
   */
  EEnum getEnumerated();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.EnumType <em>Enum Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Enum Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.EnumType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.EnumType"
   *        extendedMetaData="name='enum-type:Object' baseType='enum-type'"
   * @generated
   */
  EDataType getEnumTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType <em>Existence Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Existence Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType"
   *        extendedMetaData="name='existence-type:Object' baseType='existence-type'"
   * @generated
   */
  EDataType getExistenceTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.FetchType <em>Fetch Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Fetch Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.FetchType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.FetchType"
   *        extendedMetaData="name='fetch-type:Object' baseType='fetch-type'"
   * @generated
   */
  EDataType getFetchTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType <em>Generation Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Generation Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.GenerationType"
   *        extendedMetaData="name='generation-type:Object' baseType='generation-type'"
   * @generated
   */
  EDataType getGenerationTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation <em>Id Validation Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Id Validation Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation"
   *        extendedMetaData="name='id-validation:Object' baseType='id-validation'"
   * @generated
   */
  EDataType getIdValidationObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType <em>Inheritance Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Inheritance Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.InheritanceType"
   *        extendedMetaData="name='inheritance-type:Object' baseType='inheritance-type'"
   * @generated
   */
  EDataType getInheritanceTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType <em>Join Fetch Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Join Fetch Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType"
   *        extendedMetaData="name='join-fetch-type:Object' baseType='join-fetch-type'"
   * @generated
   */
  EDataType getJoinFetchTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType <em>Lock Mode Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Lock Mode Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.LockModeType"
   *        extendedMetaData="name='lock-mode-type:Object' baseType='lock-mode-type'"
   * @generated
   */
  EDataType getLockModeTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType <em>Optimistic Locking Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Optimistic Locking Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLockingType"
   *        extendedMetaData="name='optimistic-locking-type:Object' baseType='optimistic-locking-type'"
   * @generated
   */
  EDataType getOptimisticLockingTypeObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Order By</em>}'.
   * <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * @return the meta object for data type '<em>Order By</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='order-by' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
   * @generated
   */
  EDataType getOrderBy();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType <em>Order Column Correction Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Order Column Correction Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumnCorrectionType"
   *        extendedMetaData="name='order-column-correction-type:Object' baseType='order-column-correction-type'"
   * @generated
   */
  EDataType getOrderColumnCorrectionTypeObject();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Temporal <em>Temporal Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Temporal Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Temporal
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.Temporal"
   *        extendedMetaData="name='temporal:Object' baseType='temporal'"
   * @generated
   */
  EDataType getTemporalObject();

  /**
   * Returns the meta object for enum '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Temporal <em>Temporal</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for enum '<em>Temporal</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.Temporal
   * @generated
   */
  EEnum getTemporal();

  /**
   * Returns the meta object for data type '{@link org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType <em>Temporal Type Object</em>}'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the meta object for data type '<em>Temporal Type Object</em>'.
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType
   * @model instanceClass="org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType"
   *        extendedMetaData="name='temporal-type:Object' baseType='temporal-type'"
   * @generated
   */
  EDataType getTemporalTypeObject();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>Version Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Version Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='versionType' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[0-9]+(\\.[0-9]+)*'"
   * @generated
   */
  EDataType getVersionType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OrmFactory getOrmFactory();

} // OrmPackage
