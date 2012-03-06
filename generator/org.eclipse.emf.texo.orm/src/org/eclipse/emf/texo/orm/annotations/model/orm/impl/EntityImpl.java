/**
 * <copyright>
 * </copyright>
 *
 * $Id: EntityImpl.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.Cache;
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor;
import org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking;
import org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Customizer;
import org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners;
import org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType;
import org.eclipse.emf.texo.orm.annotations.model.orm.IdClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance;
import org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostLoad;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostPersist;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostRemove;
import org.eclipse.emf.texo.orm.annotations.model.orm.PostUpdate;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrePersist;
import org.eclipse.emf.texo.orm.annotations.model.orm.PreRemove;
import org.eclipse.emf.texo.orm.annotations.model.orm.PreUpdate;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.QueryRedirectors;
import org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.Table;
import org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getDescription <em>Description</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCustomizer <em>Customizer</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getChangeTracking <em>Change Tracking</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getTable <em>Table</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getSecondaryTable <em>Secondary Table</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPrimaryKeyJoinColumn <em>Primary Key
 * Join Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getIdClass <em>Id Class</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPrimaryKey <em>Primary Key</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getInheritance <em>Inheritance</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getDiscriminatorValue <em>Discriminator
 * Value</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getDiscriminatorColumn <em>Discriminator
 * Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getOptimisticLocking <em>Optimistic Locking
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCache <em>Cache</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCacheInterceptor <em>Cache Interceptor
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getConverter <em>Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getTypeConverter <em>Type Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getObjectTypeConverter <em>Object Type
 * Converter</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getStructConverter <em>Struct Converter
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCopyPolicy <em>Copy Policy</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getInstantiationCopyPolicy <em>
 * Instantiation Copy Policy</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCloneCopyPolicy <em>Clone Copy Policy
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getSequenceGenerator <em>Sequence Generator
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getTableGenerator <em>Table Generator</em>}
 * </li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedQuery <em>Named Query</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedNativeQuery <em>Named Native Query
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedStoredProcedureQuery <em>Named
 * Stored Procedure Query</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getSqlResultSetMapping <em>Sql Result Set
 * Mapping</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getQueryRedirectors <em>Query Redirectors
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getExcludeDefaultListeners <em>Exclude
 * Default Listeners</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getExcludeSuperclassListeners <em>Exclude
 * Superclass Listeners</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getEntityListeners <em>Entity Listeners
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getProperty <em>Property</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAttributeOverride <em>Attribute Override
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAssociationOverride <em>Association
 * Override</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAccess <em>Access</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isCacheable <em>Cacheable</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getClass_ <em>Class</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isExcludeDefaultMappings <em>Exclude
 * Default Mappings</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getExistenceChecking <em>Existence Checking
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isMetadataComplete <em>Metadata Complete
 * </em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EntityImpl extends BaseOrmAnnotationImpl implements Entity {
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getCustomizer() <em>Customizer</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getCustomizer()
   * @generated
   * @ordered
   */
  protected Customizer customizer;

  /**
   * The cached value of the '{@link #getChangeTracking() <em>Change Tracking</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getChangeTracking()
   * @generated
   * @ordered
   */
  protected ChangeTracking changeTracking;

  /**
   * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getTable()
   * @generated
   * @ordered
   */
  protected Table table;

  /**
   * The cached value of the '{@link #getSecondaryTable() <em>Secondary Table</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSecondaryTable()
   * @generated
   * @ordered
   */
  protected EList<SecondaryTable> secondaryTable;

  /**
   * The cached value of the '{@link #getPrimaryKeyJoinColumn() <em>Primary Key Join Column</em>}' containment reference
   * list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPrimaryKeyJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<PrimaryKeyJoinColumn> primaryKeyJoinColumn;

  /**
   * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' containment reference. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getIdClass()
   * @generated
   * @ordered
   */
  protected IdClass idClass;

  /**
   * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getPrimaryKey()
   * @generated
   * @ordered
   */
  protected PrimaryKey primaryKey;

  /**
   * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getInheritance()
   * @generated
   * @ordered
   */
  protected Inheritance inheritance;

  /**
   * The default value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDiscriminatorValue()
   * @generated
   * @ordered
   */
  protected static final String DISCRIMINATOR_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDiscriminatorValue() <em>Discriminator Value</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDiscriminatorValue()
   * @generated
   * @ordered
   */
  protected String discriminatorValue = DISCRIMINATOR_VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDiscriminatorColumn() <em>Discriminator Column</em>}' containment reference.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getDiscriminatorColumn()
   * @generated
   * @ordered
   */
  protected DiscriminatorColumn discriminatorColumn;

  /**
   * The cached value of the '{@link #getOptimisticLocking() <em>Optimistic Locking</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOptimisticLocking()
   * @generated
   * @ordered
   */
  protected OptimisticLocking optimisticLocking;

  /**
   * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getCache()
   * @generated
   * @ordered
   */
  protected Cache cache;

  /**
   * The cached value of the '{@link #getCacheInterceptor() <em>Cache Interceptor</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCacheInterceptor()
   * @generated
   * @ordered
   */
  protected CacheInterceptor cacheInterceptor;

  /**
   * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getConverter()
   * @generated
   * @ordered
   */
  protected EList<Converter> converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<TypeConverter> typeConverter;

  /**
   * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference
   * list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getObjectTypeConverter()
   * @generated
   * @ordered
   */
  protected EList<ObjectTypeConverter> objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected EList<StructConverter> structConverter;

  /**
   * The cached value of the '{@link #getCopyPolicy() <em>Copy Policy</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getCopyPolicy()
   * @generated
   * @ordered
   */
  protected CopyPolicy copyPolicy;

  /**
   * The cached value of the '{@link #getInstantiationCopyPolicy() <em>Instantiation Copy Policy</em>}' containment
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getInstantiationCopyPolicy()
   * @generated
   * @ordered
   */
  protected InstantiationCopyPolicy instantiationCopyPolicy;

  /**
   * The cached value of the '{@link #getCloneCopyPolicy() <em>Clone Copy Policy</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getCloneCopyPolicy()
   * @generated
   * @ordered
   */
  protected CloneCopyPolicy cloneCopyPolicy;

  /**
   * The cached value of the '{@link #getSequenceGenerator() <em>Sequence Generator</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSequenceGenerator()
   * @generated
   * @ordered
   */
  protected SequenceGenerator sequenceGenerator;

  /**
   * The cached value of the '{@link #getTableGenerator() <em>Table Generator</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTableGenerator()
   * @generated
   * @ordered
   */
  protected TableGenerator tableGenerator;

  /**
   * The cached value of the '{@link #getNamedQuery() <em>Named Query</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNamedQuery()
   * @generated
   * @ordered
   */
  protected EList<NamedQuery> namedQuery;

  /**
   * The cached value of the '{@link #getNamedNativeQuery() <em>Named Native Query</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNamedNativeQuery()
   * @generated
   * @ordered
   */
  protected EList<NamedNativeQuery> namedNativeQuery;

  /**
   * The cached value of the '{@link #getNamedStoredProcedureQuery() <em>Named Stored Procedure Query</em>}' containment
   * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNamedStoredProcedureQuery()
   * @generated
   * @ordered
   */
  protected EList<NamedStoredProcedureQuery> namedStoredProcedureQuery;

  /**
   * The cached value of the '{@link #getSqlResultSetMapping() <em>Sql Result Set Mapping</em>}' containment reference
   * list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getSqlResultSetMapping()
   * @generated
   * @ordered
   */
  protected EList<SqlResultSetMapping> sqlResultSetMapping;

  /**
   * The cached value of the '{@link #getQueryRedirectors() <em>Query Redirectors</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getQueryRedirectors()
   * @generated
   * @ordered
   */
  protected QueryRedirectors queryRedirectors;

  /**
   * The cached value of the '{@link #getExcludeDefaultListeners() <em>Exclude Default Listeners</em>}' containment
   * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExcludeDefaultListeners()
   * @generated
   * @ordered
   */
  protected EmptyType excludeDefaultListeners;

  /**
   * The cached value of the '{@link #getExcludeSuperclassListeners() <em>Exclude Superclass Listeners</em>}'
   * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExcludeSuperclassListeners()
   * @generated
   * @ordered
   */
  protected EmptyType excludeSuperclassListeners;

  /**
   * The cached value of the '{@link #getEntityListeners() <em>Entity Listeners</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getEntityListeners()
   * @generated
   * @ordered
   */
  protected EntityListeners entityListeners;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAttributeOverride()
   * @generated
   * @ordered
   */
  protected EList<AttributeOverride> attributeOverride;

  /**
   * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference
   * list. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAssociationOverride()
   * @generated
   * @ordered
   */
  protected EList<AssociationOverride> associationOverride;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected Attributes attributes;

  /**
   * The default value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.FIELD;

  /**
   * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getAccess()
   * @generated
   * @ordered
   */
  protected AccessType access = ACCESS_EDEFAULT;

  /**
   * This is true if the Access attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean accessESet;

  /**
   * The default value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #isCacheable()
   * @generated
   * @ordered
   */
  protected static final boolean CACHEABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #isCacheable()
   * @generated
   * @ordered
   */
  protected boolean cacheable = CACHEABLE_EDEFAULT;

  /**
   * This is true if the Cacheable attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean cacheableESet;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isExcludeDefaultMappings() <em>Exclude Default Mappings</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isExcludeDefaultMappings()
   * @generated
   * @ordered
   */
  protected static final boolean EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExcludeDefaultMappings() <em>Exclude Default Mappings</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #isExcludeDefaultMappings()
   * @generated
   * @ordered
   */
  protected boolean excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;

  /**
   * This is true if the Exclude Default Mappings attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean excludeDefaultMappingsESet;

  /**
   * The default value of the '{@link #getExistenceChecking() <em>Existence Checking</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExistenceChecking()
   * @generated
   * @ordered
   */
  protected static final ExistenceType EXISTENCE_CHECKING_EDEFAULT = ExistenceType.CHECKCACHE;

  /**
   * The cached value of the '{@link #getExistenceChecking() <em>Existence Checking</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getExistenceChecking()
   * @generated
   * @ordered
   */
  protected ExistenceType existenceChecking = EXISTENCE_CHECKING_EDEFAULT;

  /**
   * This is true if the Existence Checking attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean existenceCheckingESet;

  /**
   * The default value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #isMetadataComplete()
   * @generated
   * @ordered
   */
  protected static final boolean METADATA_COMPLETE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute. <!-- begin-user-doc
   * --> <!-- end-user-doc -->
   * 
   * @see #isMetadataComplete()
   * @generated
   * @ordered
   */
  protected boolean metadataComplete = METADATA_COMPLETE_EDEFAULT;

  /**
   * This is true if the Metadata Complete attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean metadataCompleteESet;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #isReadOnly()
   * @generated
   * @ordered
   */
  protected static final boolean READ_ONLY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #isReadOnly()
   * @generated
   * @ordered
   */
  protected boolean readOnly = READ_ONLY_EDEFAULT;

  /**
   * This is true if the Read Only attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean readOnlyESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected EntityImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getEntity();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Customizer getCustomizer() {
    return customizer;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCustomizer(Customizer newCustomizer, NotificationChain msgs) {
    Customizer oldCustomizer = customizer;
    customizer = newCustomizer;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CUSTOMIZER,
          oldCustomizer, newCustomizer);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCustomizer(Customizer newCustomizer) {
    if (newCustomizer != customizer) {
      NotificationChain msgs = null;
      if (customizer != null)
        msgs = ((InternalEObject) customizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CUSTOMIZER, null, msgs);
      if (newCustomizer != null)
        msgs = ((InternalEObject) newCustomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CUSTOMIZER, null, msgs);
      msgs = basicSetCustomizer(newCustomizer, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CUSTOMIZER, newCustomizer, newCustomizer));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ChangeTracking getChangeTracking() {
    return changeTracking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetChangeTracking(ChangeTracking newChangeTracking, NotificationChain msgs) {
    ChangeTracking oldChangeTracking = changeTracking;
    changeTracking = newChangeTracking;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__CHANGE_TRACKING, oldChangeTracking, newChangeTracking);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setChangeTracking(ChangeTracking newChangeTracking) {
    if (newChangeTracking != changeTracking) {
      NotificationChain msgs = null;
      if (changeTracking != null)
        msgs = ((InternalEObject) changeTracking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CHANGE_TRACKING, null, msgs);
      if (newChangeTracking != null)
        msgs = ((InternalEObject) newChangeTracking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CHANGE_TRACKING, null, msgs);
      msgs = basicSetChangeTracking(newChangeTracking, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CHANGE_TRACKING, newChangeTracking,
          newChangeTracking));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Table getTable() {
    return table;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
    Table oldTable = table;
    table = newTable;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE,
          oldTable, newTable);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTable(Table newTable) {
    if (newTable != table) {
      NotificationChain msgs = null;
      if (table != null)
        msgs = ((InternalEObject) table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE, null,
            msgs);
      if (newTable != null)
        msgs = ((InternalEObject) newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE, null,
            msgs);
      msgs = basicSetTable(newTable, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE, newTable, newTable));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<SecondaryTable> getSecondaryTable() {
    if (secondaryTable == null) {
      secondaryTable = new EObjectContainmentEList<SecondaryTable>(SecondaryTable.class, this,
          OrmPackage.ENTITY__SECONDARY_TABLE);
    }
    return secondaryTable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
    if (primaryKeyJoinColumn == null) {
      primaryKeyJoinColumn = new EObjectContainmentEList<PrimaryKeyJoinColumn>(PrimaryKeyJoinColumn.class, this,
          OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN);
    }
    return primaryKeyJoinColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IdClass getIdClass() {
    return idClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetIdClass(IdClass newIdClass, NotificationChain msgs) {
    IdClass oldIdClass = idClass;
    idClass = newIdClass;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ID_CLASS,
          oldIdClass, newIdClass);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setIdClass(IdClass newIdClass) {
    if (newIdClass != idClass) {
      NotificationChain msgs = null;
      if (idClass != null)
        msgs = ((InternalEObject) idClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ID_CLASS,
            null, msgs);
      if (newIdClass != null)
        msgs = ((InternalEObject) newIdClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ID_CLASS,
            null, msgs);
      msgs = basicSetIdClass(newIdClass, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ID_CLASS, newIdClass, newIdClass));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public PrimaryKey getPrimaryKey() {
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
    PrimaryKey oldPrimaryKey = primaryKey;
    primaryKey = newPrimaryKey;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRIMARY_KEY,
          oldPrimaryKey, newPrimaryKey);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setPrimaryKey(PrimaryKey newPrimaryKey) {
    if (newPrimaryKey != primaryKey) {
      NotificationChain msgs = null;
      if (primaryKey != null)
        msgs = ((InternalEObject) primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__PRIMARY_KEY, null, msgs);
      if (newPrimaryKey != null)
        msgs = ((InternalEObject) newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__PRIMARY_KEY, null, msgs);
      msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRIMARY_KEY, newPrimaryKey,
          newPrimaryKey));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Inheritance getInheritance() {
    return inheritance;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs) {
    Inheritance oldInheritance = inheritance;
    inheritance = newInheritance;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INHERITANCE,
          oldInheritance, newInheritance);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setInheritance(Inheritance newInheritance) {
    if (newInheritance != inheritance) {
      NotificationChain msgs = null;
      if (inheritance != null)
        msgs = ((InternalEObject) inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__INHERITANCE, null, msgs);
      if (newInheritance != null)
        msgs = ((InternalEObject) newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__INHERITANCE, null, msgs);
      msgs = basicSetInheritance(newInheritance, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INHERITANCE, newInheritance,
          newInheritance));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getDiscriminatorValue() {
    return discriminatorValue;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDiscriminatorValue(String newDiscriminatorValue) {
    String oldDiscriminatorValue = discriminatorValue;
    discriminatorValue = newDiscriminatorValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_VALUE,
          oldDiscriminatorValue, discriminatorValue));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public DiscriminatorColumn getDiscriminatorColumn() {
    return discriminatorColumn;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn,
      NotificationChain msgs) {
    DiscriminatorColumn oldDiscriminatorColumn = discriminatorColumn;
    discriminatorColumn = newDiscriminatorColumn;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, newDiscriminatorColumn);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn) {
    if (newDiscriminatorColumn != discriminatorColumn) {
      NotificationChain msgs = null;
      if (discriminatorColumn != null)
        msgs = ((InternalEObject) discriminatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, null, msgs);
      if (newDiscriminatorColumn != null)
        msgs = ((InternalEObject) newDiscriminatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, null, msgs);
      msgs = basicSetDiscriminatorColumn(newDiscriminatorColumn, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_COLUMN,
          newDiscriminatorColumn, newDiscriminatorColumn));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public OptimisticLocking getOptimisticLocking() {
    return optimisticLocking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetOptimisticLocking(OptimisticLocking newOptimisticLocking, NotificationChain msgs) {
    OptimisticLocking oldOptimisticLocking = optimisticLocking;
    optimisticLocking = newOptimisticLocking;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__OPTIMISTIC_LOCKING, oldOptimisticLocking, newOptimisticLocking);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setOptimisticLocking(OptimisticLocking newOptimisticLocking) {
    if (newOptimisticLocking != optimisticLocking) {
      NotificationChain msgs = null;
      if (optimisticLocking != null)
        msgs = ((InternalEObject) optimisticLocking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__OPTIMISTIC_LOCKING, null, msgs);
      if (newOptimisticLocking != null)
        msgs = ((InternalEObject) newOptimisticLocking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__OPTIMISTIC_LOCKING, null, msgs);
      msgs = basicSetOptimisticLocking(newOptimisticLocking, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__OPTIMISTIC_LOCKING,
          newOptimisticLocking, newOptimisticLocking));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Cache getCache() {
    return cache;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCache(Cache newCache, NotificationChain msgs) {
    Cache oldCache = cache;
    cache = newCache;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE,
          oldCache, newCache);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCache(Cache newCache) {
    if (newCache != cache) {
      NotificationChain msgs = null;
      if (cache != null)
        msgs = ((InternalEObject) cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CACHE, null,
            msgs);
      if (newCache != null)
        msgs = ((InternalEObject) newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CACHE, null,
            msgs);
      msgs = basicSetCache(newCache, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE, newCache, newCache));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CacheInterceptor getCacheInterceptor() {
    return cacheInterceptor;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCacheInterceptor(CacheInterceptor newCacheInterceptor, NotificationChain msgs) {
    CacheInterceptor oldCacheInterceptor = cacheInterceptor;
    cacheInterceptor = newCacheInterceptor;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__CACHE_INTERCEPTOR, oldCacheInterceptor, newCacheInterceptor);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCacheInterceptor(CacheInterceptor newCacheInterceptor) {
    if (newCacheInterceptor != cacheInterceptor) {
      NotificationChain msgs = null;
      if (cacheInterceptor != null)
        msgs = ((InternalEObject) cacheInterceptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CACHE_INTERCEPTOR, null, msgs);
      if (newCacheInterceptor != null)
        msgs = ((InternalEObject) newCacheInterceptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CACHE_INTERCEPTOR, null, msgs);
      msgs = basicSetCacheInterceptor(newCacheInterceptor, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE_INTERCEPTOR, newCacheInterceptor,
          newCacheInterceptor));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Converter> getConverter() {
    if (converter == null) {
      converter = new EObjectContainmentEList<Converter>(Converter.class, this, OrmPackage.ENTITY__CONVERTER);
    }
    return converter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<TypeConverter> getTypeConverter() {
    if (typeConverter == null) {
      typeConverter = new EObjectContainmentEList<TypeConverter>(TypeConverter.class, this,
          OrmPackage.ENTITY__TYPE_CONVERTER);
    }
    return typeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
    if (objectTypeConverter == null) {
      objectTypeConverter = new EObjectContainmentEList<ObjectTypeConverter>(ObjectTypeConverter.class, this,
          OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER);
    }
    return objectTypeConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<StructConverter> getStructConverter() {
    if (structConverter == null) {
      structConverter = new EObjectContainmentEList<StructConverter>(StructConverter.class, this,
          OrmPackage.ENTITY__STRUCT_CONVERTER);
    }
    return structConverter;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CopyPolicy getCopyPolicy() {
    return copyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCopyPolicy(CopyPolicy newCopyPolicy, NotificationChain msgs) {
    CopyPolicy oldCopyPolicy = copyPolicy;
    copyPolicy = newCopyPolicy;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__COPY_POLICY,
          oldCopyPolicy, newCopyPolicy);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCopyPolicy(CopyPolicy newCopyPolicy) {
    if (newCopyPolicy != copyPolicy) {
      NotificationChain msgs = null;
      if (copyPolicy != null)
        msgs = ((InternalEObject) copyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__COPY_POLICY, null, msgs);
      if (newCopyPolicy != null)
        msgs = ((InternalEObject) newCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__COPY_POLICY, null, msgs);
      msgs = basicSetCopyPolicy(newCopyPolicy, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__COPY_POLICY, newCopyPolicy,
          newCopyPolicy));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public InstantiationCopyPolicy getInstantiationCopyPolicy() {
    return instantiationCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy,
      NotificationChain msgs) {
    InstantiationCopyPolicy oldInstantiationCopyPolicy = instantiationCopyPolicy;
    instantiationCopyPolicy = newInstantiationCopyPolicy;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, oldInstantiationCopyPolicy, newInstantiationCopyPolicy);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy) {
    if (newInstantiationCopyPolicy != instantiationCopyPolicy) {
      NotificationChain msgs = null;
      if (instantiationCopyPolicy != null)
        msgs = ((InternalEObject) instantiationCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, null, msgs);
      if (newInstantiationCopyPolicy != null)
        msgs = ((InternalEObject) newInstantiationCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, null, msgs);
      msgs = basicSetInstantiationCopyPolicy(newInstantiationCopyPolicy, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY,
          newInstantiationCopyPolicy, newInstantiationCopyPolicy));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public CloneCopyPolicy getCloneCopyPolicy() {
    return cloneCopyPolicy;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy, NotificationChain msgs) {
    CloneCopyPolicy oldCloneCopyPolicy = cloneCopyPolicy;
    cloneCopyPolicy = newCloneCopyPolicy;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__CLONE_COPY_POLICY, oldCloneCopyPolicy, newCloneCopyPolicy);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy) {
    if (newCloneCopyPolicy != cloneCopyPolicy) {
      NotificationChain msgs = null;
      if (cloneCopyPolicy != null)
        msgs = ((InternalEObject) cloneCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CLONE_COPY_POLICY, null, msgs);
      if (newCloneCopyPolicy != null)
        msgs = ((InternalEObject) newCloneCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__CLONE_COPY_POLICY, null, msgs);
      msgs = basicSetCloneCopyPolicy(newCloneCopyPolicy, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLONE_COPY_POLICY, newCloneCopyPolicy,
          newCloneCopyPolicy));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public SequenceGenerator getSequenceGenerator() {
    return sequenceGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetSequenceGenerator(SequenceGenerator newSequenceGenerator, NotificationChain msgs) {
    SequenceGenerator oldSequenceGenerator = sequenceGenerator;
    sequenceGenerator = newSequenceGenerator;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setSequenceGenerator(SequenceGenerator newSequenceGenerator) {
    if (newSequenceGenerator != sequenceGenerator) {
      NotificationChain msgs = null;
      if (sequenceGenerator != null)
        msgs = ((InternalEObject) sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__SEQUENCE_GENERATOR, null, msgs);
      if (newSequenceGenerator != null)
        msgs = ((InternalEObject) newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__SEQUENCE_GENERATOR, null, msgs);
      msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__SEQUENCE_GENERATOR,
          newSequenceGenerator, newSequenceGenerator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public TableGenerator getTableGenerator() {
    return tableGenerator;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetTableGenerator(TableGenerator newTableGenerator, NotificationChain msgs) {
    TableGenerator oldTableGenerator = tableGenerator;
    tableGenerator = newTableGenerator;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setTableGenerator(TableGenerator newTableGenerator) {
    if (newTableGenerator != tableGenerator) {
      NotificationChain msgs = null;
      if (tableGenerator != null)
        msgs = ((InternalEObject) tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__TABLE_GENERATOR, null, msgs);
      if (newTableGenerator != null)
        msgs = ((InternalEObject) newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__TABLE_GENERATOR, null, msgs);
      msgs = basicSetTableGenerator(newTableGenerator, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE_GENERATOR, newTableGenerator,
          newTableGenerator));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<NamedQuery> getNamedQuery() {
    if (namedQuery == null) {
      namedQuery = new EObjectContainmentEList<NamedQuery>(NamedQuery.class, this, OrmPackage.ENTITY__NAMED_QUERY);
    }
    return namedQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<NamedNativeQuery> getNamedNativeQuery() {
    if (namedNativeQuery == null) {
      namedNativeQuery = new EObjectContainmentEList<NamedNativeQuery>(NamedNativeQuery.class, this,
          OrmPackage.ENTITY__NAMED_NATIVE_QUERY);
    }
    return namedNativeQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<NamedStoredProcedureQuery> getNamedStoredProcedureQuery() {
    if (namedStoredProcedureQuery == null) {
      namedStoredProcedureQuery = new EObjectContainmentEList<NamedStoredProcedureQuery>(
          NamedStoredProcedureQuery.class, this, OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY);
    }
    return namedStoredProcedureQuery;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<SqlResultSetMapping> getSqlResultSetMapping() {
    if (sqlResultSetMapping == null) {
      sqlResultSetMapping = new EObjectContainmentEList<SqlResultSetMapping>(SqlResultSetMapping.class, this,
          OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING);
    }
    return sqlResultSetMapping;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public QueryRedirectors getQueryRedirectors() {
    return queryRedirectors;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetQueryRedirectors(QueryRedirectors newQueryRedirectors, NotificationChain msgs) {
    QueryRedirectors oldQueryRedirectors = queryRedirectors;
    queryRedirectors = newQueryRedirectors;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__QUERY_REDIRECTORS, oldQueryRedirectors, newQueryRedirectors);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setQueryRedirectors(QueryRedirectors newQueryRedirectors) {
    if (newQueryRedirectors != queryRedirectors) {
      NotificationChain msgs = null;
      if (queryRedirectors != null)
        msgs = ((InternalEObject) queryRedirectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__QUERY_REDIRECTORS, null, msgs);
      if (newQueryRedirectors != null)
        msgs = ((InternalEObject) newQueryRedirectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__QUERY_REDIRECTORS, null, msgs);
      msgs = basicSetQueryRedirectors(newQueryRedirectors, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__QUERY_REDIRECTORS, newQueryRedirectors,
          newQueryRedirectors));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EmptyType getExcludeDefaultListeners() {
    return excludeDefaultListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetExcludeDefaultListeners(EmptyType newExcludeDefaultListeners, NotificationChain msgs) {
    EmptyType oldExcludeDefaultListeners = excludeDefaultListeners;
    excludeDefaultListeners = newExcludeDefaultListeners;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, oldExcludeDefaultListeners, newExcludeDefaultListeners);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setExcludeDefaultListeners(EmptyType newExcludeDefaultListeners) {
    if (newExcludeDefaultListeners != excludeDefaultListeners) {
      NotificationChain msgs = null;
      if (excludeDefaultListeners != null)
        msgs = ((InternalEObject) excludeDefaultListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
      if (newExcludeDefaultListeners != null)
        msgs = ((InternalEObject) newExcludeDefaultListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
      msgs = basicSetExcludeDefaultListeners(newExcludeDefaultListeners, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS,
          newExcludeDefaultListeners, newExcludeDefaultListeners));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EmptyType getExcludeSuperclassListeners() {
    return excludeSuperclassListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners,
      NotificationChain msgs) {
    EmptyType oldExcludeSuperclassListeners = excludeSuperclassListeners;
    excludeSuperclassListeners = newExcludeSuperclassListeners;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, oldExcludeSuperclassListeners, newExcludeSuperclassListeners);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners) {
    if (newExcludeSuperclassListeners != excludeSuperclassListeners) {
      NotificationChain msgs = null;
      if (excludeSuperclassListeners != null)
        msgs = ((InternalEObject) excludeSuperclassListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
      if (newExcludeSuperclassListeners != null)
        msgs = ((InternalEObject) newExcludeSuperclassListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
      msgs = basicSetExcludeSuperclassListeners(newExcludeSuperclassListeners, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS,
          newExcludeSuperclassListeners, newExcludeSuperclassListeners));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EntityListeners getEntityListeners() {
    return entityListeners;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetEntityListeners(EntityListeners newEntityListeners, NotificationChain msgs) {
    EntityListeners oldEntityListeners = entityListeners;
    entityListeners = newEntityListeners;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          OrmPackage.ENTITY__ENTITY_LISTENERS, oldEntityListeners, newEntityListeners);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setEntityListeners(EntityListeners newEntityListeners) {
    if (newEntityListeners != entityListeners) {
      NotificationChain msgs = null;
      if (entityListeners != null)
        msgs = ((InternalEObject) entityListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__ENTITY_LISTENERS, null, msgs);
      if (newEntityListeners != null)
        msgs = ((InternalEObject) newEntityListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__ENTITY_LISTENERS, null, msgs);
      msgs = basicSetEntityListeners(newEntityListeners, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ENTITY_LISTENERS, newEntityListeners,
          newEntityListeners));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Property> getProperty() {
    if (property == null) {
      property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.ENTITY__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<AttributeOverride> getAttributeOverride() {
    if (attributeOverride == null) {
      attributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this,
          OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE);
    }
    return attributeOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<AssociationOverride> getAssociationOverride() {
    if (associationOverride == null) {
      associationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this,
          OrmPackage.ENTITY__ASSOCIATION_OVERRIDE);
    }
    return associationOverride;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public Attributes getAttributes() {
    return attributes;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs) {
    Attributes oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ATTRIBUTES,
          oldAttributes, newAttributes);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setAttributes(Attributes newAttributes) {
    if (newAttributes != attributes) {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject) attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject) newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
            - OrmPackage.ENTITY__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public AccessType getAccess() {
    return access;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setAccess(AccessType newAccess) {
    AccessType oldAccess = access;
    access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
    boolean oldAccessESet = accessESet;
    accessESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ACCESS, oldAccess, access,
          !oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetAccess() {
    AccessType oldAccess = access;
    boolean oldAccessESet = accessESet;
    access = ACCESS_EDEFAULT;
    accessESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__ACCESS, oldAccess, ACCESS_EDEFAULT,
          oldAccessESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetAccess() {
    return accessESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isCacheable() {
    return cacheable;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setCacheable(boolean newCacheable) {
    boolean oldCacheable = cacheable;
    cacheable = newCacheable;
    boolean oldCacheableESet = cacheableESet;
    cacheableESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHEABLE, oldCacheable, cacheable,
          !oldCacheableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetCacheable() {
    boolean oldCacheable = cacheable;
    boolean oldCacheableESet = cacheableESet;
    cacheable = CACHEABLE_EDEFAULT;
    cacheableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__CACHEABLE, oldCacheable,
          CACHEABLE_EDEFAULT, oldCacheableESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetCacheable() {
    return cacheableESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getClass_() {
    return class_;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setClass(String newClass) {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isExcludeDefaultMappings() {
    return excludeDefaultMappings;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setExcludeDefaultMappings(boolean newExcludeDefaultMappings) {
    boolean oldExcludeDefaultMappings = excludeDefaultMappings;
    excludeDefaultMappings = newExcludeDefaultMappings;
    boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
    excludeDefaultMappingsESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS,
          oldExcludeDefaultMappings, excludeDefaultMappings, !oldExcludeDefaultMappingsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetExcludeDefaultMappings() {
    boolean oldExcludeDefaultMappings = excludeDefaultMappings;
    boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
    excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;
    excludeDefaultMappingsESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS,
          oldExcludeDefaultMappings, EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT, oldExcludeDefaultMappingsESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetExcludeDefaultMappings() {
    return excludeDefaultMappingsESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public ExistenceType getExistenceChecking() {
    return existenceChecking;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setExistenceChecking(ExistenceType newExistenceChecking) {
    ExistenceType oldExistenceChecking = existenceChecking;
    existenceChecking = newExistenceChecking == null ? EXISTENCE_CHECKING_EDEFAULT : newExistenceChecking;
    boolean oldExistenceCheckingESet = existenceCheckingESet;
    existenceCheckingESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXISTENCE_CHECKING,
          oldExistenceChecking, existenceChecking, !oldExistenceCheckingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetExistenceChecking() {
    ExistenceType oldExistenceChecking = existenceChecking;
    boolean oldExistenceCheckingESet = existenceCheckingESet;
    existenceChecking = EXISTENCE_CHECKING_EDEFAULT;
    existenceCheckingESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__EXISTENCE_CHECKING,
          oldExistenceChecking, EXISTENCE_CHECKING_EDEFAULT, oldExistenceCheckingESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetExistenceChecking() {
    return existenceCheckingESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isMetadataComplete() {
    return metadataComplete;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setMetadataComplete(boolean newMetadataComplete) {
    boolean oldMetadataComplete = metadataComplete;
    metadataComplete = newMetadataComplete;
    boolean oldMetadataCompleteESet = metadataCompleteESet;
    metadataCompleteESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__METADATA_COMPLETE, oldMetadataComplete,
          metadataComplete, !oldMetadataCompleteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetMetadataComplete() {
    boolean oldMetadataComplete = metadataComplete;
    boolean oldMetadataCompleteESet = metadataCompleteESet;
    metadataComplete = METADATA_COMPLETE_EDEFAULT;
    metadataCompleteESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__METADATA_COMPLETE,
          oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetMetadataComplete() {
    return metadataCompleteESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public String getName() {
    return name;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isReadOnly() {
    return readOnly;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setReadOnly(boolean newReadOnly) {
    boolean oldReadOnly = readOnly;
    readOnly = newReadOnly;
    boolean oldReadOnlyESet = readOnlyESet;
    readOnlyESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__READ_ONLY, oldReadOnly, readOnly,
          !oldReadOnlyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetReadOnly() {
    boolean oldReadOnly = readOnly;
    boolean oldReadOnlyESet = readOnlyESet;
    readOnly = READ_ONLY_EDEFAULT;
    readOnlyESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__READ_ONLY, oldReadOnly,
          READ_ONLY_EDEFAULT, oldReadOnlyESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetReadOnly() {
    return readOnlyESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case OrmPackage.ENTITY__CUSTOMIZER:
      return basicSetCustomizer(null, msgs);
    case OrmPackage.ENTITY__CHANGE_TRACKING:
      return basicSetChangeTracking(null, msgs);
    case OrmPackage.ENTITY__TABLE:
      return basicSetTable(null, msgs);
    case OrmPackage.ENTITY__SECONDARY_TABLE:
      return ((InternalEList<?>) getSecondaryTable()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
      return ((InternalEList<?>) getPrimaryKeyJoinColumn()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__ID_CLASS:
      return basicSetIdClass(null, msgs);
    case OrmPackage.ENTITY__PRIMARY_KEY:
      return basicSetPrimaryKey(null, msgs);
    case OrmPackage.ENTITY__INHERITANCE:
      return basicSetInheritance(null, msgs);
    case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
      return basicSetDiscriminatorColumn(null, msgs);
    case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
      return basicSetOptimisticLocking(null, msgs);
    case OrmPackage.ENTITY__CACHE:
      return basicSetCache(null, msgs);
    case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
      return basicSetCacheInterceptor(null, msgs);
    case OrmPackage.ENTITY__CONVERTER:
      return ((InternalEList<?>) getConverter()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__TYPE_CONVERTER:
      return ((InternalEList<?>) getTypeConverter()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
      return ((InternalEList<?>) getObjectTypeConverter()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__STRUCT_CONVERTER:
      return ((InternalEList<?>) getStructConverter()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__COPY_POLICY:
      return basicSetCopyPolicy(null, msgs);
    case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
      return basicSetInstantiationCopyPolicy(null, msgs);
    case OrmPackage.ENTITY__CLONE_COPY_POLICY:
      return basicSetCloneCopyPolicy(null, msgs);
    case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
      return basicSetSequenceGenerator(null, msgs);
    case OrmPackage.ENTITY__TABLE_GENERATOR:
      return basicSetTableGenerator(null, msgs);
    case OrmPackage.ENTITY__NAMED_QUERY:
      return ((InternalEList<?>) getNamedQuery()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
      return ((InternalEList<?>) getNamedNativeQuery()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
      return ((InternalEList<?>) getNamedStoredProcedureQuery()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
      return ((InternalEList<?>) getSqlResultSetMapping()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__QUERY_REDIRECTORS:
      return basicSetQueryRedirectors(null, msgs);
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
      return basicSetExcludeDefaultListeners(null, msgs);
    case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
      return basicSetExcludeSuperclassListeners(null, msgs);
    case OrmPackage.ENTITY__ENTITY_LISTENERS:
      return basicSetEntityListeners(null, msgs);
    case OrmPackage.ENTITY__PROPERTY:
      return ((InternalEList<?>) getProperty()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
      return ((InternalEList<?>) getAttributeOverride()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
      return ((InternalEList<?>) getAssociationOverride()).basicRemove(otherEnd, msgs);
    case OrmPackage.ENTITY__ATTRIBUTES:
      return basicSetAttributes(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case OrmPackage.ENTITY__DESCRIPTION:
      return getDescription();
    case OrmPackage.ENTITY__CUSTOMIZER:
      return getCustomizer();
    case OrmPackage.ENTITY__CHANGE_TRACKING:
      return getChangeTracking();
    case OrmPackage.ENTITY__TABLE:
      return getTable();
    case OrmPackage.ENTITY__SECONDARY_TABLE:
      return getSecondaryTable();
    case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
      return getPrimaryKeyJoinColumn();
    case OrmPackage.ENTITY__ID_CLASS:
      return getIdClass();
    case OrmPackage.ENTITY__PRIMARY_KEY:
      return getPrimaryKey();
    case OrmPackage.ENTITY__INHERITANCE:
      return getInheritance();
    case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
      return getDiscriminatorValue();
    case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
      return getDiscriminatorColumn();
    case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
      return getOptimisticLocking();
    case OrmPackage.ENTITY__CACHE:
      return getCache();
    case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
      return getCacheInterceptor();
    case OrmPackage.ENTITY__CONVERTER:
      return getConverter();
    case OrmPackage.ENTITY__TYPE_CONVERTER:
      return getTypeConverter();
    case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
      return getObjectTypeConverter();
    case OrmPackage.ENTITY__STRUCT_CONVERTER:
      return getStructConverter();
    case OrmPackage.ENTITY__COPY_POLICY:
      return getCopyPolicy();
    case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
      return getInstantiationCopyPolicy();
    case OrmPackage.ENTITY__CLONE_COPY_POLICY:
      return getCloneCopyPolicy();
    case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
      return getSequenceGenerator();
    case OrmPackage.ENTITY__TABLE_GENERATOR:
      return getTableGenerator();
    case OrmPackage.ENTITY__NAMED_QUERY:
      return getNamedQuery();
    case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
      return getNamedNativeQuery();
    case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
      return getNamedStoredProcedureQuery();
    case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
      return getSqlResultSetMapping();
    case OrmPackage.ENTITY__QUERY_REDIRECTORS:
      return getQueryRedirectors();
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
      return getExcludeDefaultListeners();
    case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
      return getExcludeSuperclassListeners();
    case OrmPackage.ENTITY__ENTITY_LISTENERS:
      return getEntityListeners();
    case OrmPackage.ENTITY__PROPERTY:
      return getProperty();
    case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
      return getAttributeOverride();
    case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
      return getAssociationOverride();
    case OrmPackage.ENTITY__ATTRIBUTES:
      return getAttributes();
    case OrmPackage.ENTITY__ACCESS:
      return getAccess();
    case OrmPackage.ENTITY__CACHEABLE:
      return isCacheable();
    case OrmPackage.ENTITY__CLASS:
      return getClass_();
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS:
      return isExcludeDefaultMappings();
    case OrmPackage.ENTITY__EXISTENCE_CHECKING:
      return getExistenceChecking();
    case OrmPackage.ENTITY__METADATA_COMPLETE:
      return isMetadataComplete();
    case OrmPackage.ENTITY__NAME:
      return getName();
    case OrmPackage.ENTITY__READ_ONLY:
      return isReadOnly();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case OrmPackage.ENTITY__DESCRIPTION:
      setDescription((String) newValue);
      return;
    case OrmPackage.ENTITY__CUSTOMIZER:
      setCustomizer((Customizer) newValue);
      return;
    case OrmPackage.ENTITY__CHANGE_TRACKING:
      setChangeTracking((ChangeTracking) newValue);
      return;
    case OrmPackage.ENTITY__TABLE:
      setTable((Table) newValue);
      return;
    case OrmPackage.ENTITY__SECONDARY_TABLE:
      getSecondaryTable().clear();
      getSecondaryTable().addAll((Collection<? extends SecondaryTable>) newValue);
      return;
    case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
      getPrimaryKeyJoinColumn().clear();
      getPrimaryKeyJoinColumn().addAll((Collection<? extends PrimaryKeyJoinColumn>) newValue);
      return;
    case OrmPackage.ENTITY__ID_CLASS:
      setIdClass((IdClass) newValue);
      return;
    case OrmPackage.ENTITY__PRIMARY_KEY:
      setPrimaryKey((PrimaryKey) newValue);
      return;
    case OrmPackage.ENTITY__INHERITANCE:
      setInheritance((Inheritance) newValue);
      return;
    case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
      setDiscriminatorValue((String) newValue);
      return;
    case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
      setDiscriminatorColumn((DiscriminatorColumn) newValue);
      return;
    case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
      setOptimisticLocking((OptimisticLocking) newValue);
      return;
    case OrmPackage.ENTITY__CACHE:
      setCache((Cache) newValue);
      return;
    case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
      setCacheInterceptor((CacheInterceptor) newValue);
      return;
    case OrmPackage.ENTITY__CONVERTER:
      getConverter().clear();
      getConverter().addAll((Collection<? extends Converter>) newValue);
      return;
    case OrmPackage.ENTITY__TYPE_CONVERTER:
      getTypeConverter().clear();
      getTypeConverter().addAll((Collection<? extends TypeConverter>) newValue);
      return;
    case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
      getObjectTypeConverter().clear();
      getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>) newValue);
      return;
    case OrmPackage.ENTITY__STRUCT_CONVERTER:
      getStructConverter().clear();
      getStructConverter().addAll((Collection<? extends StructConverter>) newValue);
      return;
    case OrmPackage.ENTITY__COPY_POLICY:
      setCopyPolicy((CopyPolicy) newValue);
      return;
    case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
      setInstantiationCopyPolicy((InstantiationCopyPolicy) newValue);
      return;
    case OrmPackage.ENTITY__CLONE_COPY_POLICY:
      setCloneCopyPolicy((CloneCopyPolicy) newValue);
      return;
    case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
      setSequenceGenerator((SequenceGenerator) newValue);
      return;
    case OrmPackage.ENTITY__TABLE_GENERATOR:
      setTableGenerator((TableGenerator) newValue);
      return;
    case OrmPackage.ENTITY__NAMED_QUERY:
      getNamedQuery().clear();
      getNamedQuery().addAll((Collection<? extends NamedQuery>) newValue);
      return;
    case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
      getNamedNativeQuery().clear();
      getNamedNativeQuery().addAll((Collection<? extends NamedNativeQuery>) newValue);
      return;
    case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
      getNamedStoredProcedureQuery().clear();
      getNamedStoredProcedureQuery().addAll((Collection<? extends NamedStoredProcedureQuery>) newValue);
      return;
    case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
      getSqlResultSetMapping().clear();
      getSqlResultSetMapping().addAll((Collection<? extends SqlResultSetMapping>) newValue);
      return;
    case OrmPackage.ENTITY__QUERY_REDIRECTORS:
      setQueryRedirectors((QueryRedirectors) newValue);
      return;
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
      setExcludeDefaultListeners((EmptyType) newValue);
      return;
    case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
      setExcludeSuperclassListeners((EmptyType) newValue);
      return;
    case OrmPackage.ENTITY__ENTITY_LISTENERS:
      setEntityListeners((EntityListeners) newValue);
      return;
    case OrmPackage.ENTITY__PROPERTY:
      getProperty().clear();
      getProperty().addAll((Collection<? extends Property>) newValue);
      return;
    case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
      getAttributeOverride().clear();
      getAttributeOverride().addAll((Collection<? extends AttributeOverride>) newValue);
      return;
    case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
      getAssociationOverride().clear();
      getAssociationOverride().addAll((Collection<? extends AssociationOverride>) newValue);
      return;
    case OrmPackage.ENTITY__ATTRIBUTES:
      setAttributes((Attributes) newValue);
      return;
    case OrmPackage.ENTITY__ACCESS:
      setAccess((AccessType) newValue);
      return;
    case OrmPackage.ENTITY__CACHEABLE:
      setCacheable((Boolean) newValue);
      return;
    case OrmPackage.ENTITY__CLASS:
      setClass((String) newValue);
      return;
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS:
      setExcludeDefaultMappings((Boolean) newValue);
      return;
    case OrmPackage.ENTITY__EXISTENCE_CHECKING:
      setExistenceChecking((ExistenceType) newValue);
      return;
    case OrmPackage.ENTITY__METADATA_COMPLETE:
      setMetadataComplete((Boolean) newValue);
      return;
    case OrmPackage.ENTITY__NAME:
      setName((String) newValue);
      return;
    case OrmPackage.ENTITY__READ_ONLY:
      setReadOnly((Boolean) newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
    case OrmPackage.ENTITY__DESCRIPTION:
      setDescription(DESCRIPTION_EDEFAULT);
      return;
    case OrmPackage.ENTITY__CUSTOMIZER:
      setCustomizer((Customizer) null);
      return;
    case OrmPackage.ENTITY__CHANGE_TRACKING:
      setChangeTracking((ChangeTracking) null);
      return;
    case OrmPackage.ENTITY__TABLE:
      setTable((Table) null);
      return;
    case OrmPackage.ENTITY__SECONDARY_TABLE:
      getSecondaryTable().clear();
      return;
    case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
      getPrimaryKeyJoinColumn().clear();
      return;
    case OrmPackage.ENTITY__ID_CLASS:
      setIdClass((IdClass) null);
      return;
    case OrmPackage.ENTITY__PRIMARY_KEY:
      setPrimaryKey((PrimaryKey) null);
      return;
    case OrmPackage.ENTITY__INHERITANCE:
      setInheritance((Inheritance) null);
      return;
    case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
      setDiscriminatorValue(DISCRIMINATOR_VALUE_EDEFAULT);
      return;
    case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
      setDiscriminatorColumn((DiscriminatorColumn) null);
      return;
    case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
      setOptimisticLocking((OptimisticLocking) null);
      return;
    case OrmPackage.ENTITY__CACHE:
      setCache((Cache) null);
      return;
    case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
      setCacheInterceptor((CacheInterceptor) null);
      return;
    case OrmPackage.ENTITY__CONVERTER:
      getConverter().clear();
      return;
    case OrmPackage.ENTITY__TYPE_CONVERTER:
      getTypeConverter().clear();
      return;
    case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
      getObjectTypeConverter().clear();
      return;
    case OrmPackage.ENTITY__STRUCT_CONVERTER:
      getStructConverter().clear();
      return;
    case OrmPackage.ENTITY__COPY_POLICY:
      setCopyPolicy((CopyPolicy) null);
      return;
    case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
      setInstantiationCopyPolicy((InstantiationCopyPolicy) null);
      return;
    case OrmPackage.ENTITY__CLONE_COPY_POLICY:
      setCloneCopyPolicy((CloneCopyPolicy) null);
      return;
    case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
      setSequenceGenerator((SequenceGenerator) null);
      return;
    case OrmPackage.ENTITY__TABLE_GENERATOR:
      setTableGenerator((TableGenerator) null);
      return;
    case OrmPackage.ENTITY__NAMED_QUERY:
      getNamedQuery().clear();
      return;
    case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
      getNamedNativeQuery().clear();
      return;
    case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
      getNamedStoredProcedureQuery().clear();
      return;
    case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
      getSqlResultSetMapping().clear();
      return;
    case OrmPackage.ENTITY__QUERY_REDIRECTORS:
      setQueryRedirectors((QueryRedirectors) null);
      return;
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
      setExcludeDefaultListeners((EmptyType) null);
      return;
    case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
      setExcludeSuperclassListeners((EmptyType) null);
      return;
    case OrmPackage.ENTITY__ENTITY_LISTENERS:
      setEntityListeners((EntityListeners) null);
      return;
    case OrmPackage.ENTITY__PROPERTY:
      getProperty().clear();
      return;
    case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
      getAttributeOverride().clear();
      return;
    case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
      getAssociationOverride().clear();
      return;
    case OrmPackage.ENTITY__ATTRIBUTES:
      setAttributes((Attributes) null);
      return;
    case OrmPackage.ENTITY__ACCESS:
      unsetAccess();
      return;
    case OrmPackage.ENTITY__CACHEABLE:
      unsetCacheable();
      return;
    case OrmPackage.ENTITY__CLASS:
      setClass(CLASS_EDEFAULT);
      return;
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS:
      unsetExcludeDefaultMappings();
      return;
    case OrmPackage.ENTITY__EXISTENCE_CHECKING:
      unsetExistenceChecking();
      return;
    case OrmPackage.ENTITY__METADATA_COMPLETE:
      unsetMetadataComplete();
      return;
    case OrmPackage.ENTITY__NAME:
      setName(NAME_EDEFAULT);
      return;
    case OrmPackage.ENTITY__READ_ONLY:
      unsetReadOnly();
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
    case OrmPackage.ENTITY__DESCRIPTION:
      return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
    case OrmPackage.ENTITY__CUSTOMIZER:
      return customizer != null;
    case OrmPackage.ENTITY__CHANGE_TRACKING:
      return changeTracking != null;
    case OrmPackage.ENTITY__TABLE:
      return table != null;
    case OrmPackage.ENTITY__SECONDARY_TABLE:
      return secondaryTable != null && !secondaryTable.isEmpty();
    case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
      return primaryKeyJoinColumn != null && !primaryKeyJoinColumn.isEmpty();
    case OrmPackage.ENTITY__ID_CLASS:
      return idClass != null;
    case OrmPackage.ENTITY__PRIMARY_KEY:
      return primaryKey != null;
    case OrmPackage.ENTITY__INHERITANCE:
      return inheritance != null;
    case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
      return DISCRIMINATOR_VALUE_EDEFAULT == null ? discriminatorValue != null : !DISCRIMINATOR_VALUE_EDEFAULT
          .equals(discriminatorValue);
    case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
      return discriminatorColumn != null;
    case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
      return optimisticLocking != null;
    case OrmPackage.ENTITY__CACHE:
      return cache != null;
    case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
      return cacheInterceptor != null;
    case OrmPackage.ENTITY__CONVERTER:
      return converter != null && !converter.isEmpty();
    case OrmPackage.ENTITY__TYPE_CONVERTER:
      return typeConverter != null && !typeConverter.isEmpty();
    case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
      return objectTypeConverter != null && !objectTypeConverter.isEmpty();
    case OrmPackage.ENTITY__STRUCT_CONVERTER:
      return structConverter != null && !structConverter.isEmpty();
    case OrmPackage.ENTITY__COPY_POLICY:
      return copyPolicy != null;
    case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
      return instantiationCopyPolicy != null;
    case OrmPackage.ENTITY__CLONE_COPY_POLICY:
      return cloneCopyPolicy != null;
    case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
      return sequenceGenerator != null;
    case OrmPackage.ENTITY__TABLE_GENERATOR:
      return tableGenerator != null;
    case OrmPackage.ENTITY__NAMED_QUERY:
      return namedQuery != null && !namedQuery.isEmpty();
    case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
      return namedNativeQuery != null && !namedNativeQuery.isEmpty();
    case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
      return namedStoredProcedureQuery != null && !namedStoredProcedureQuery.isEmpty();
    case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
      return sqlResultSetMapping != null && !sqlResultSetMapping.isEmpty();
    case OrmPackage.ENTITY__QUERY_REDIRECTORS:
      return queryRedirectors != null;
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
      return excludeDefaultListeners != null;
    case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
      return excludeSuperclassListeners != null;
    case OrmPackage.ENTITY__ENTITY_LISTENERS:
      return entityListeners != null;
    case OrmPackage.ENTITY__PROPERTY:
      return property != null && !property.isEmpty();
    case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
      return attributeOverride != null && !attributeOverride.isEmpty();
    case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
      return associationOverride != null && !associationOverride.isEmpty();
    case OrmPackage.ENTITY__ATTRIBUTES:
      return attributes != null;
    case OrmPackage.ENTITY__ACCESS:
      return isSetAccess();
    case OrmPackage.ENTITY__CACHEABLE:
      return isSetCacheable();
    case OrmPackage.ENTITY__CLASS:
      return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
    case OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS:
      return isSetExcludeDefaultMappings();
    case OrmPackage.ENTITY__EXISTENCE_CHECKING:
      return isSetExistenceChecking();
    case OrmPackage.ENTITY__METADATA_COMPLETE:
      return isSetMetadataComplete();
    case OrmPackage.ENTITY__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case OrmPackage.ENTITY__READ_ONLY:
      return isSetReadOnly();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy())
      return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(", discriminatorValue: ");
    result.append(discriminatorValue);
    result.append(", access: ");
    if (accessESet)
      result.append(access);
    else
      result.append("<unset>");
    result.append(", cacheable: ");
    if (cacheableESet)
      result.append(cacheable);
    else
      result.append("<unset>");
    result.append(", class: ");
    result.append(class_);
    result.append(", excludeDefaultMappings: ");
    if (excludeDefaultMappingsESet)
      result.append(excludeDefaultMappings);
    else
      result.append("<unset>");
    result.append(", existenceChecking: ");
    if (existenceCheckingESet)
      result.append(existenceChecking);
    else
      result.append("<unset>");
    result.append(", metadataComplete: ");
    if (metadataCompleteESet)
      result.append(metadataComplete);
    else
      result.append("<unset>");
    result.append(", name: ");
    result.append(name);
    result.append(", readOnly: ");
    if (readOnlyESet)
      result.append(readOnly);
    else
      result.append("<unset>");
    result.append(')');
    return result.toString();
  }

  @Override
  public String getJavaAnnotation() {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getEntity_Name());

    final String jAnnotation = ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true);
    if (getDiscriminatorValue() != null) {
      return "@javax.persistence.DiscriminatorValue(\"" + getDiscriminatorValue() + "\")\n" + jAnnotation; //$NON-NLS-1$//$NON-NLS-2$
    }
    return jAnnotation;
  }
} // EntityImpl
