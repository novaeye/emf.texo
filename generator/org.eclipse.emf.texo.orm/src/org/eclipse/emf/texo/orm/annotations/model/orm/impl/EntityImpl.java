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
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessMethods;
import org.eclipse.emf.texo.orm.annotations.model.orm.AccessType;
import org.eclipse.emf.texo.orm.annotations.model.orm.AdditionalCriteria;
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.Attributes;
import org.eclipse.emf.texo.orm.annotations.model.orm.Cache;
import org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor;
import org.eclipse.emf.texo.orm.annotations.model.orm.ChangeTracking;
import org.eclipse.emf.texo.orm.annotations.model.orm.ClassExtractor;
import org.eclipse.emf.texo.orm.annotations.model.orm.CloneCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.CopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Customizer;
import org.eclipse.emf.texo.orm.annotations.model.orm.DiscriminatorColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityListeners;
import org.eclipse.emf.texo.orm.annotations.model.orm.ExistenceType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchGroup;
import org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.IdClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.Index;
import org.eclipse.emf.texo.orm.annotations.model.orm.Inheritance;
import org.eclipse.emf.texo.orm.annotations.model.orm.InstantiationCopyPolicy;
import org.eclipse.emf.texo.orm.annotations.model.orm.Multitenant;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedNativeQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredFunctionQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedPlsqlStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredFunctionQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OptimisticLocking;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlRecord;
import org.eclipse.emf.texo.orm.annotations.model.orm.PlsqlTable;
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
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.SecondaryTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.SequenceGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.SqlResultSetMapping;
import org.eclipse.emf.texo.orm.annotations.model.orm.Struct;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.Table;
import org.eclipse.emf.texo.orm.annotations.model.orm.TableGenerator;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartitioning;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Entity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getMultitenant <em>Multitenant</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAdditionalCriteria <em>Additional Criteria</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCustomizer <em>Customizer</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getChangeTracking <em>Change Tracking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getSecondaryTable <em>Secondary Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPrimaryKeyJoinColumn <em>Primary Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isCascadeOnDelete <em>Cascade On Delete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getIdClass <em>Id Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getInheritance <em>Inheritance</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getDiscriminatorValue <em>Discriminator Value</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getDiscriminatorColumn <em>Discriminator Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getClassExtractor <em>Class Extractor</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getOptimisticLocking <em>Optimistic Locking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCacheInterceptor <em>Cache Interceptor</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getFetchGroup <em>Fetch Group</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCopyPolicy <em>Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getInstantiationCopyPolicy <em>Instantiation Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getCloneCopyPolicy <em>Clone Copy Policy</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getSequenceGenerator <em>Sequence Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getTableGenerator <em>Table Generator</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPartitioned <em>Partitioned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedQuery <em>Named Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedNativeQuery <em>Named Native Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedStoredProcedureQuery <em>Named Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedStoredFunctionQuery <em>Named Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedPlsqlStoredProcedureQuery <em>Named Plsql Stored Procedure Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getNamedPlsqlStoredFunctionQuery <em>Named Plsql Stored Function Query</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPlsqlRecord <em>Plsql Record</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPlsqlTable <em>Plsql Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getSqlResultSetMapping <em>Sql Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getQueryRedirectors <em>Query Redirectors</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getExcludeDefaultListeners <em>Exclude Default Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getExcludeSuperclassListeners <em>Exclude Superclass Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getEntityListeners <em>Entity Listeners</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPrePersist <em>Pre Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPostPersist <em>Post Persist</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPreRemove <em>Pre Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPostRemove <em>Post Remove</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPreUpdate <em>Pre Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPostUpdate <em>Post Update</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getPostLoad <em>Post Load</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAttributeOverride <em>Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAssociationOverride <em>Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isCacheable <em>Cacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isExcludeDefaultMappings <em>Exclude Default Mappings</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getExistenceChecking <em>Existence Checking</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isMetadataComplete <em>Metadata Complete</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#getParentClass <em>Parent Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.EntityImpl#isReadOnly <em>Read Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends BaseOrmAnnotationImpl implements Entity {
  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessMethods()
	 * @generated
	 * @ordered
	 */
	protected AccessMethods accessMethods;

		/**
	 * The cached value of the '{@link #getMultitenant() <em>Multitenant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultitenant()
	 * @generated
	 * @ordered
	 */
	protected Multitenant multitenant;

		/**
	 * The cached value of the '{@link #getAdditionalCriteria() <em>Additional Criteria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCriteria()
	 * @generated
	 * @ordered
	 */
	protected AdditionalCriteria additionalCriteria;

		/**
	 * The cached value of the '{@link #getCustomizer() <em>Customizer</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getTable() <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
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
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
	protected Struct struct;

		/**
	 * The cached value of the '{@link #getPrimaryKeyJoinColumn() <em>Primary Key Join Column</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrimaryKeyJoinColumn()
	 * @generated
	 * @ordered
	 */
  protected EList<PrimaryKeyJoinColumn> primaryKeyJoinColumn;

  /**
	 * The default value of the '{@link #isCascadeOnDelete() <em>Cascade On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCascadeOnDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASCADE_ON_DELETE_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isCascadeOnDelete() <em>Cascade On Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCascadeOnDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean cascadeOnDelete = CASCADE_ON_DELETE_EDEFAULT;

		/**
	 * This is true if the Cascade On Delete attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cascadeOnDeleteESet;

		/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> index;

		/**
	 * The cached value of the '{@link #getIdClass() <em>Id Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIdClass()
	 * @generated
	 * @ordered
	 */
  protected IdClass idClass;

  /**
	 * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getPrimaryKey()
	 * @generated
	 * @ordered
	 */
  protected PrimaryKey primaryKey;

  /**
	 * The cached value of the '{@link #getInheritance() <em>Inheritance</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
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
	 * @see #getDiscriminatorColumn()
	 * @generated
	 * @ordered
	 */
  protected DiscriminatorColumn discriminatorColumn;

  /**
	 * The cached value of the '{@link #getClassExtractor() <em>Class Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtractor()
	 * @generated
	 * @ordered
	 */
	protected ClassExtractor classExtractor;

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
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
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
	 * The cached value of the '{@link #getFetchGroup() <em>Fetch Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<FetchGroup> fetchGroup;

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
	 * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getCopyPolicy() <em>Copy Policy</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getCopyPolicy()
	 * @generated
	 * @ordered
	 */
  protected CopyPolicy copyPolicy;

  /**
	 * The cached value of the '{@link #getInstantiationCopyPolicy() <em>Instantiation Copy Policy</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioning()
	 * @generated
	 * @ordered
	 */
	protected Partitioning partitioning;

		/**
	 * The cached value of the '{@link #getReplicationPartitioning() <em>Replication Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplicationPartitioning()
	 * @generated
	 * @ordered
	 */
	protected ReplicationPartitioning replicationPartitioning;

		/**
	 * The cached value of the '{@link #getRoundRobinPartitioning() <em>Round Robin Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoundRobinPartitioning()
	 * @generated
	 * @ordered
	 */
	protected RoundRobinPartitioning roundRobinPartitioning;

		/**
	 * The cached value of the '{@link #getPinnedPartitioning() <em>Pinned Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinnedPartitioning()
	 * @generated
	 * @ordered
	 */
	protected PinnedPartitioning pinnedPartitioning;

		/**
	 * The cached value of the '{@link #getRangePartitioning() <em>Range Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangePartitioning()
	 * @generated
	 * @ordered
	 */
	protected RangePartitioning rangePartitioning;

		/**
	 * The cached value of the '{@link #getValuePartitioning() <em>Value Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuePartitioning()
	 * @generated
	 * @ordered
	 */
	protected ValuePartitioning valuePartitioning;

		/**
	 * The cached value of the '{@link #getHashPartitioning() <em>Hash Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHashPartitioning()
	 * @generated
	 * @ordered
	 */
	protected HashPartitioning hashPartitioning;

		/**
	 * The cached value of the '{@link #getUnionPartitioning() <em>Union Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnionPartitioning()
	 * @generated
	 * @ordered
	 */
	protected UnionPartitioning unionPartitioning;

		/**
	 * The default value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioned()
	 * @generated
	 * @ordered
	 */
	protected static final String PARTITIONED_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitioned()
	 * @generated
	 * @ordered
	 */
	protected String partitioned = PARTITIONED_EDEFAULT;

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
	 * @see #getNamedNativeQuery()
	 * @generated
	 * @ordered
	 */
  protected EList<NamedNativeQuery> namedNativeQuery;

  /**
	 * The cached value of the '{@link #getNamedStoredProcedureQuery() <em>Named Stored Procedure Query</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNamedStoredProcedureQuery()
	 * @generated
	 * @ordered
	 */
  protected EList<NamedStoredProcedureQuery> namedStoredProcedureQuery;

  /**
	 * The cached value of the '{@link #getNamedStoredFunctionQuery() <em>Named Stored Function Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedStoredFunctionQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedStoredFunctionQuery> namedStoredFunctionQuery;

		/**
	 * The cached value of the '{@link #getNamedPlsqlStoredProcedureQuery() <em>Named Plsql Stored Procedure Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedPlsqlStoredProcedureQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedPlsqlStoredProcedureQuery> namedPlsqlStoredProcedureQuery;

		/**
	 * The cached value of the '{@link #getNamedPlsqlStoredFunctionQuery() <em>Named Plsql Stored Function Query</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedPlsqlStoredFunctionQuery()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedPlsqlStoredFunctionQuery> namedPlsqlStoredFunctionQuery;

		/**
	 * The cached value of the '{@link #getPlsqlRecord() <em>Plsql Record</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlsqlRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<PlsqlRecord> plsqlRecord;

		/**
	 * The cached value of the '{@link #getPlsqlTable() <em>Plsql Table</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlsqlTable()
	 * @generated
	 * @ordered
	 */
	protected EList<PlsqlTable> plsqlTable;

		/**
	 * The cached value of the '{@link #getSqlResultSetMapping() <em>Sql Result Set Mapping</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getExcludeDefaultListeners() <em>Exclude Default Listeners</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExcludeDefaultListeners()
	 * @generated
	 * @ordered
	 */
  protected EmptyType excludeDefaultListeners;

  /**
	 * The cached value of the '{@link #getExcludeSuperclassListeners() <em>Exclude Superclass Listeners</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getPrePersist() <em>Pre Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrePersist()
	 * @generated
	 * @ordered
	 */
	protected PrePersist prePersist;

		/**
	 * The cached value of the '{@link #getPostPersist() <em>Post Persist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostPersist()
	 * @generated
	 * @ordered
	 */
	protected PostPersist postPersist;

		/**
	 * The cached value of the '{@link #getPreRemove() <em>Pre Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreRemove()
	 * @generated
	 * @ordered
	 */
	protected PreRemove preRemove;

		/**
	 * The cached value of the '{@link #getPostRemove() <em>Post Remove</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostRemove()
	 * @generated
	 * @ordered
	 */
	protected PostRemove postRemove;

		/**
	 * The cached value of the '{@link #getPreUpdate() <em>Pre Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreUpdate()
	 * @generated
	 * @ordered
	 */
	protected PreUpdate preUpdate;

		/**
	 * The cached value of the '{@link #getPostUpdate() <em>Post Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostUpdate()
	 * @generated
	 * @ordered
	 */
	protected PostUpdate postUpdate;

		/**
	 * The cached value of the '{@link #getPostLoad() <em>Post Load</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostLoad()
	 * @generated
	 * @ordered
	 */
	protected PostLoad postLoad;

		/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
  protected EList<Property> property;

  /**
	 * The cached value of the '{@link #getAttributeOverride() <em>Attribute Override</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributeOverride()
	 * @generated
	 * @ordered
	 */
  protected EList<AttributeOverride> attributeOverride;

  /**
	 * The cached value of the '{@link #getAssociationOverride() <em>Association Override</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAssociationOverride()
	 * @generated
	 * @ordered
	 */
  protected EList<AssociationOverride> associationOverride;

  /**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
  protected Attributes attributes;

  /**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
  protected static final AccessType ACCESS_EDEFAULT = AccessType.PROPERTY;

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
	 * This is true if the Access attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean accessESet;

  /**
	 * The default value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isCacheable()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CACHEABLE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isCacheable() <em>Cacheable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isCacheable()
	 * @generated
	 * @ordered
	 */
  protected boolean cacheable = CACHEABLE_EDEFAULT;

  /**
	 * This is true if the Cacheable attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * This is true if the Exclude Default Mappings attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * This is true if the Existence Checking attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean existenceCheckingESet;

  /**
	 * The default value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
  protected static final boolean METADATA_COMPLETE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMetadataComplete() <em>Metadata Complete</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #isMetadataComplete()
	 * @generated
	 * @ordered
	 */
  protected boolean metadataComplete = METADATA_COMPLETE_EDEFAULT;

  /**
	 * This is true if the Metadata Complete attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getParentClass() <em>Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_CLASS_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getParentClass() <em>Parent Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentClass()
	 * @generated
	 * @ordered
	 */
	protected String parentClass = PARENT_CLASS_EDEFAULT;

		/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
  protected static final boolean READ_ONLY_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
  protected boolean readOnly = READ_ONLY_EDEFAULT;

  /**
	 * This is true if the Read Only attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean readOnlyESet;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected EntityImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getEntity();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription() {
		return description;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMethods getAccessMethods() {
		return accessMethods;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
		AccessMethods oldAccessMethods = accessMethods;
		accessMethods = newAccessMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessMethods(AccessMethods newAccessMethods) {
		if (newAccessMethods != accessMethods) {
			NotificationChain msgs = null;
			if (accessMethods != null)
				msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ACCESS_METHODS, null, msgs);
			if (newAccessMethods != null)
				msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ACCESS_METHODS, null, msgs);
			msgs = basicSetAccessMethods(newAccessMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ACCESS_METHODS, newAccessMethods, newAccessMethods));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multitenant getMultitenant() {
		return multitenant;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultitenant(Multitenant newMultitenant, NotificationChain msgs) {
		Multitenant oldMultitenant = multitenant;
		multitenant = newMultitenant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__MULTITENANT, oldMultitenant, newMultitenant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultitenant(Multitenant newMultitenant) {
		if (newMultitenant != multitenant) {
			NotificationChain msgs = null;
			if (multitenant != null)
				msgs = ((InternalEObject)multitenant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__MULTITENANT, null, msgs);
			if (newMultitenant != null)
				msgs = ((InternalEObject)newMultitenant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__MULTITENANT, null, msgs);
			msgs = basicSetMultitenant(newMultitenant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__MULTITENANT, newMultitenant, newMultitenant));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalCriteria getAdditionalCriteria() {
		return additionalCriteria;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalCriteria(AdditionalCriteria newAdditionalCriteria, NotificationChain msgs) {
		AdditionalCriteria oldAdditionalCriteria = additionalCriteria;
		additionalCriteria = newAdditionalCriteria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ADDITIONAL_CRITERIA, oldAdditionalCriteria, newAdditionalCriteria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalCriteria(AdditionalCriteria newAdditionalCriteria) {
		if (newAdditionalCriteria != additionalCriteria) {
			NotificationChain msgs = null;
			if (additionalCriteria != null)
				msgs = ((InternalEObject)additionalCriteria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ADDITIONAL_CRITERIA, null, msgs);
			if (newAdditionalCriteria != null)
				msgs = ((InternalEObject)newAdditionalCriteria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ADDITIONAL_CRITERIA, null, msgs);
			msgs = basicSetAdditionalCriteria(newAdditionalCriteria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ADDITIONAL_CRITERIA, newAdditionalCriteria, newAdditionalCriteria));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Customizer getCustomizer() {
		return customizer;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCustomizer(Customizer newCustomizer, NotificationChain msgs) {
		Customizer oldCustomizer = customizer;
		customizer = newCustomizer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CUSTOMIZER, oldCustomizer, newCustomizer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCustomizer(Customizer newCustomizer) {
		if (newCustomizer != customizer) {
			NotificationChain msgs = null;
			if (customizer != null)
				msgs = ((InternalEObject)customizer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CUSTOMIZER, null, msgs);
			if (newCustomizer != null)
				msgs = ((InternalEObject)newCustomizer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CUSTOMIZER, null, msgs);
			msgs = basicSetCustomizer(newCustomizer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CUSTOMIZER, newCustomizer, newCustomizer));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ChangeTracking getChangeTracking() {
		return changeTracking;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetChangeTracking(ChangeTracking newChangeTracking, NotificationChain msgs) {
		ChangeTracking oldChangeTracking = changeTracking;
		changeTracking = newChangeTracking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CHANGE_TRACKING, oldChangeTracking, newChangeTracking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setChangeTracking(ChangeTracking newChangeTracking) {
		if (newChangeTracking != changeTracking) {
			NotificationChain msgs = null;
			if (changeTracking != null)
				msgs = ((InternalEObject)changeTracking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CHANGE_TRACKING, null, msgs);
			if (newChangeTracking != null)
				msgs = ((InternalEObject)newChangeTracking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CHANGE_TRACKING, null, msgs);
			msgs = basicSetChangeTracking(newChangeTracking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CHANGE_TRACKING, newChangeTracking, newChangeTracking));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Table getTable() {
		return table;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		Table oldTable = table;
		table = newTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE, oldTable, newTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setTable(Table newTable) {
		if (newTable != table) {
			NotificationChain msgs = null;
			if (table != null)
				msgs = ((InternalEObject)table).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE, null, msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE, null, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE, newTable, newTable));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<SecondaryTable> getSecondaryTable() {
		if (secondaryTable == null) {
			secondaryTable = new EObjectContainmentEList<SecondaryTable>(SecondaryTable.class, this, OrmPackage.ENTITY__SECONDARY_TABLE);
		}
		return secondaryTable;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Struct getStruct() {
		return struct;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Struct newStruct, NotificationChain msgs) {
		Struct oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStruct(Struct newStruct) {
		if (newStruct != struct) {
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__STRUCT, newStruct, newStruct));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<PrimaryKeyJoinColumn> getPrimaryKeyJoinColumn() {
		if (primaryKeyJoinColumn == null) {
			primaryKeyJoinColumn = new EObjectContainmentEList<PrimaryKeyJoinColumn>(PrimaryKeyJoinColumn.class, this, OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN);
		}
		return primaryKeyJoinColumn;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCascadeOnDelete() {
		return cascadeOnDelete;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascadeOnDelete(boolean newCascadeOnDelete) {
		boolean oldCascadeOnDelete = cascadeOnDelete;
		cascadeOnDelete = newCascadeOnDelete;
		boolean oldCascadeOnDeleteESet = cascadeOnDeleteESet;
		cascadeOnDeleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CASCADE_ON_DELETE, oldCascadeOnDelete, cascadeOnDelete, !oldCascadeOnDeleteESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCascadeOnDelete() {
		boolean oldCascadeOnDelete = cascadeOnDelete;
		boolean oldCascadeOnDeleteESet = cascadeOnDeleteESet;
		cascadeOnDelete = CASCADE_ON_DELETE_EDEFAULT;
		cascadeOnDeleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__CASCADE_ON_DELETE, oldCascadeOnDelete, CASCADE_ON_DELETE_EDEFAULT, oldCascadeOnDeleteESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCascadeOnDelete() {
		return cascadeOnDeleteESet;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndex() {
		if (index == null) {
			index = new EObjectContainmentEList<Index>(Index.class, this, OrmPackage.ENTITY__INDEX);
		}
		return index;
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public IdClass getIdClass() {
		return idClass;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetIdClass(IdClass newIdClass, NotificationChain msgs) {
		IdClass oldIdClass = idClass;
		idClass = newIdClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ID_CLASS, oldIdClass, newIdClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setIdClass(IdClass newIdClass) {
		if (newIdClass != idClass) {
			NotificationChain msgs = null;
			if (idClass != null)
				msgs = ((InternalEObject)idClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ID_CLASS, null, msgs);
			if (newIdClass != null)
				msgs = ((InternalEObject)newIdClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ID_CLASS, null, msgs);
			msgs = basicSetIdClass(newIdClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ID_CLASS, newIdClass, newIdClass));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
		PrimaryKey oldPrimaryKey = primaryKey;
		primaryKey = newPrimaryKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPrimaryKey(PrimaryKey newPrimaryKey) {
		if (newPrimaryKey != primaryKey) {
			NotificationChain msgs = null;
			if (primaryKey != null)
				msgs = ((InternalEObject)primaryKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRIMARY_KEY, null, msgs);
			if (newPrimaryKey != null)
				msgs = ((InternalEObject)newPrimaryKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRIMARY_KEY, null, msgs);
			msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRIMARY_KEY, newPrimaryKey, newPrimaryKey));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Inheritance getInheritance() {
		return inheritance;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInheritance(Inheritance newInheritance, NotificationChain msgs) {
		Inheritance oldInheritance = inheritance;
		inheritance = newInheritance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INHERITANCE, oldInheritance, newInheritance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setInheritance(Inheritance newInheritance) {
		if (newInheritance != inheritance) {
			NotificationChain msgs = null;
			if (inheritance != null)
				msgs = ((InternalEObject)inheritance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__INHERITANCE, null, msgs);
			if (newInheritance != null)
				msgs = ((InternalEObject)newInheritance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__INHERITANCE, null, msgs);
			msgs = basicSetInheritance(newInheritance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INHERITANCE, newInheritance, newInheritance));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getDiscriminatorValue() {
		return discriminatorValue;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setDiscriminatorValue(String newDiscriminatorValue) {
		String oldDiscriminatorValue = discriminatorValue;
		discriminatorValue = newDiscriminatorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_VALUE, oldDiscriminatorValue, discriminatorValue));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public DiscriminatorColumn getDiscriminatorColumn() {
		return discriminatorColumn;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn,
      NotificationChain msgs) {
		DiscriminatorColumn oldDiscriminatorColumn = discriminatorColumn;
		discriminatorColumn = newDiscriminatorColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, oldDiscriminatorColumn, newDiscriminatorColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setDiscriminatorColumn(DiscriminatorColumn newDiscriminatorColumn) {
		if (newDiscriminatorColumn != discriminatorColumn) {
			NotificationChain msgs = null;
			if (discriminatorColumn != null)
				msgs = ((InternalEObject)discriminatorColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, null, msgs);
			if (newDiscriminatorColumn != null)
				msgs = ((InternalEObject)newDiscriminatorColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, null, msgs);
			msgs = basicSetDiscriminatorColumn(newDiscriminatorColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__DISCRIMINATOR_COLUMN, newDiscriminatorColumn, newDiscriminatorColumn));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassExtractor getClassExtractor() {
		return classExtractor;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassExtractor(ClassExtractor newClassExtractor, NotificationChain msgs) {
		ClassExtractor oldClassExtractor = classExtractor;
		classExtractor = newClassExtractor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLASS_EXTRACTOR, oldClassExtractor, newClassExtractor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassExtractor(ClassExtractor newClassExtractor) {
		if (newClassExtractor != classExtractor) {
			NotificationChain msgs = null;
			if (classExtractor != null)
				msgs = ((InternalEObject)classExtractor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CLASS_EXTRACTOR, null, msgs);
			if (newClassExtractor != null)
				msgs = ((InternalEObject)newClassExtractor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CLASS_EXTRACTOR, null, msgs);
			msgs = basicSetClassExtractor(newClassExtractor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLASS_EXTRACTOR, newClassExtractor, newClassExtractor));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public OptimisticLocking getOptimisticLocking() {
		return optimisticLocking;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOptimisticLocking(OptimisticLocking newOptimisticLocking, NotificationChain msgs) {
		OptimisticLocking oldOptimisticLocking = optimisticLocking;
		optimisticLocking = newOptimisticLocking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__OPTIMISTIC_LOCKING, oldOptimisticLocking, newOptimisticLocking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setOptimisticLocking(OptimisticLocking newOptimisticLocking) {
		if (newOptimisticLocking != optimisticLocking) {
			NotificationChain msgs = null;
			if (optimisticLocking != null)
				msgs = ((InternalEObject)optimisticLocking).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__OPTIMISTIC_LOCKING, null, msgs);
			if (newOptimisticLocking != null)
				msgs = ((InternalEObject)newOptimisticLocking).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__OPTIMISTIC_LOCKING, null, msgs);
			msgs = basicSetOptimisticLocking(newOptimisticLocking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__OPTIMISTIC_LOCKING, newOptimisticLocking, newOptimisticLocking));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Cache getCache() {
		return cache;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCache(Cache newCache, NotificationChain msgs) {
		Cache oldCache = cache;
		cache = newCache;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE, oldCache, newCache);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCache(Cache newCache) {
		if (newCache != cache) {
			NotificationChain msgs = null;
			if (cache != null)
				msgs = ((InternalEObject)cache).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CACHE, null, msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CACHE, null, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE, newCache, newCache));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CacheInterceptor getCacheInterceptor() {
		return cacheInterceptor;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCacheInterceptor(CacheInterceptor newCacheInterceptor, NotificationChain msgs) {
		CacheInterceptor oldCacheInterceptor = cacheInterceptor;
		cacheInterceptor = newCacheInterceptor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE_INTERCEPTOR, oldCacheInterceptor, newCacheInterceptor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCacheInterceptor(CacheInterceptor newCacheInterceptor) {
		if (newCacheInterceptor != cacheInterceptor) {
			NotificationChain msgs = null;
			if (cacheInterceptor != null)
				msgs = ((InternalEObject)cacheInterceptor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CACHE_INTERCEPTOR, null, msgs);
			if (newCacheInterceptor != null)
				msgs = ((InternalEObject)newCacheInterceptor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CACHE_INTERCEPTOR, null, msgs);
			msgs = basicSetCacheInterceptor(newCacheInterceptor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHE_INTERCEPTOR, newCacheInterceptor, newCacheInterceptor));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FetchGroup> getFetchGroup() {
		if (fetchGroup == null) {
			fetchGroup = new EObjectContainmentEList<FetchGroup>(FetchGroup.class, this, OrmPackage.ENTITY__FETCH_GROUP);
		}
		return fetchGroup;
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
  public EList<TypeConverter> getTypeConverter() {
		if (typeConverter == null) {
			typeConverter = new EObjectContainmentEList<TypeConverter>(TypeConverter.class, this, OrmPackage.ENTITY__TYPE_CONVERTER);
		}
		return typeConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<ObjectTypeConverter> getObjectTypeConverter() {
		if (objectTypeConverter == null) {
			objectTypeConverter = new EObjectContainmentEList<ObjectTypeConverter>(ObjectTypeConverter.class, this, OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER);
		}
		return objectTypeConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<StructConverter> getStructConverter() {
		if (structConverter == null) {
			structConverter = new EObjectContainmentEList<StructConverter>(StructConverter.class, this, OrmPackage.ENTITY__STRUCT_CONVERTER);
		}
		return structConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CopyPolicy getCopyPolicy() {
		return copyPolicy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCopyPolicy(CopyPolicy newCopyPolicy, NotificationChain msgs) {
		CopyPolicy oldCopyPolicy = copyPolicy;
		copyPolicy = newCopyPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__COPY_POLICY, oldCopyPolicy, newCopyPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCopyPolicy(CopyPolicy newCopyPolicy) {
		if (newCopyPolicy != copyPolicy) {
			NotificationChain msgs = null;
			if (copyPolicy != null)
				msgs = ((InternalEObject)copyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__COPY_POLICY, null, msgs);
			if (newCopyPolicy != null)
				msgs = ((InternalEObject)newCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__COPY_POLICY, null, msgs);
			msgs = basicSetCopyPolicy(newCopyPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__COPY_POLICY, newCopyPolicy, newCopyPolicy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public InstantiationCopyPolicy getInstantiationCopyPolicy() {
		return instantiationCopyPolicy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy,
      NotificationChain msgs) {
		InstantiationCopyPolicy oldInstantiationCopyPolicy = instantiationCopyPolicy;
		instantiationCopyPolicy = newInstantiationCopyPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, oldInstantiationCopyPolicy, newInstantiationCopyPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setInstantiationCopyPolicy(InstantiationCopyPolicy newInstantiationCopyPolicy) {
		if (newInstantiationCopyPolicy != instantiationCopyPolicy) {
			NotificationChain msgs = null;
			if (instantiationCopyPolicy != null)
				msgs = ((InternalEObject)instantiationCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, null, msgs);
			if (newInstantiationCopyPolicy != null)
				msgs = ((InternalEObject)newInstantiationCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, null, msgs);
			msgs = basicSetInstantiationCopyPolicy(newInstantiationCopyPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY, newInstantiationCopyPolicy, newInstantiationCopyPolicy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CloneCopyPolicy getCloneCopyPolicy() {
		return cloneCopyPolicy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy, NotificationChain msgs) {
		CloneCopyPolicy oldCloneCopyPolicy = cloneCopyPolicy;
		cloneCopyPolicy = newCloneCopyPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLONE_COPY_POLICY, oldCloneCopyPolicy, newCloneCopyPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCloneCopyPolicy(CloneCopyPolicy newCloneCopyPolicy) {
		if (newCloneCopyPolicy != cloneCopyPolicy) {
			NotificationChain msgs = null;
			if (cloneCopyPolicy != null)
				msgs = ((InternalEObject)cloneCopyPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CLONE_COPY_POLICY, null, msgs);
			if (newCloneCopyPolicy != null)
				msgs = ((InternalEObject)newCloneCopyPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__CLONE_COPY_POLICY, null, msgs);
			msgs = basicSetCloneCopyPolicy(newCloneCopyPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CLONE_COPY_POLICY, newCloneCopyPolicy, newCloneCopyPolicy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public SequenceGenerator getSequenceGenerator() {
		return sequenceGenerator;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSequenceGenerator(SequenceGenerator newSequenceGenerator, NotificationChain msgs) {
		SequenceGenerator oldSequenceGenerator = sequenceGenerator;
		sequenceGenerator = newSequenceGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__SEQUENCE_GENERATOR, oldSequenceGenerator, newSequenceGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setSequenceGenerator(SequenceGenerator newSequenceGenerator) {
		if (newSequenceGenerator != sequenceGenerator) {
			NotificationChain msgs = null;
			if (sequenceGenerator != null)
				msgs = ((InternalEObject)sequenceGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__SEQUENCE_GENERATOR, null, msgs);
			if (newSequenceGenerator != null)
				msgs = ((InternalEObject)newSequenceGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__SEQUENCE_GENERATOR, null, msgs);
			msgs = basicSetSequenceGenerator(newSequenceGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__SEQUENCE_GENERATOR, newSequenceGenerator, newSequenceGenerator));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public TableGenerator getTableGenerator() {
		return tableGenerator;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTableGenerator(TableGenerator newTableGenerator, NotificationChain msgs) {
		TableGenerator oldTableGenerator = tableGenerator;
		tableGenerator = newTableGenerator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE_GENERATOR, oldTableGenerator, newTableGenerator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setTableGenerator(TableGenerator newTableGenerator) {
		if (newTableGenerator != tableGenerator) {
			NotificationChain msgs = null;
			if (tableGenerator != null)
				msgs = ((InternalEObject)tableGenerator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE_GENERATOR, null, msgs);
			if (newTableGenerator != null)
				msgs = ((InternalEObject)newTableGenerator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__TABLE_GENERATOR, null, msgs);
			msgs = basicSetTableGenerator(newTableGenerator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__TABLE_GENERATOR, newTableGenerator, newTableGenerator));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partitioning getPartitioning() {
		return partitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartitioning(Partitioning newPartitioning, NotificationChain msgs) {
		Partitioning oldPartitioning = partitioning;
		partitioning = newPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PARTITIONING, oldPartitioning, newPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitioning(Partitioning newPartitioning) {
		if (newPartitioning != partitioning) {
			NotificationChain msgs = null;
			if (partitioning != null)
				msgs = ((InternalEObject)partitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PARTITIONING, null, msgs);
			if (newPartitioning != null)
				msgs = ((InternalEObject)newPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PARTITIONING, null, msgs);
			msgs = basicSetPartitioning(newPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PARTITIONING, newPartitioning, newPartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicationPartitioning getReplicationPartitioning() {
		return replicationPartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning, NotificationChain msgs) {
		ReplicationPartitioning oldReplicationPartitioning = replicationPartitioning;
		replicationPartitioning = newReplicationPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__REPLICATION_PARTITIONING, oldReplicationPartitioning, newReplicationPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning) {
		if (newReplicationPartitioning != replicationPartitioning) {
			NotificationChain msgs = null;
			if (replicationPartitioning != null)
				msgs = ((InternalEObject)replicationPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__REPLICATION_PARTITIONING, null, msgs);
			if (newReplicationPartitioning != null)
				msgs = ((InternalEObject)newReplicationPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__REPLICATION_PARTITIONING, null, msgs);
			msgs = basicSetReplicationPartitioning(newReplicationPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__REPLICATION_PARTITIONING, newReplicationPartitioning, newReplicationPartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundRobinPartitioning getRoundRobinPartitioning() {
		return roundRobinPartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning, NotificationChain msgs) {
		RoundRobinPartitioning oldRoundRobinPartitioning = roundRobinPartitioning;
		roundRobinPartitioning = newRoundRobinPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING, oldRoundRobinPartitioning, newRoundRobinPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning) {
		if (newRoundRobinPartitioning != roundRobinPartitioning) {
			NotificationChain msgs = null;
			if (roundRobinPartitioning != null)
				msgs = ((InternalEObject)roundRobinPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING, null, msgs);
			if (newRoundRobinPartitioning != null)
				msgs = ((InternalEObject)newRoundRobinPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING, null, msgs);
			msgs = basicSetRoundRobinPartitioning(newRoundRobinPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING, newRoundRobinPartitioning, newRoundRobinPartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinnedPartitioning getPinnedPartitioning() {
		return pinnedPartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPinnedPartitioning(PinnedPartitioning newPinnedPartitioning, NotificationChain msgs) {
		PinnedPartitioning oldPinnedPartitioning = pinnedPartitioning;
		pinnedPartitioning = newPinnedPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PINNED_PARTITIONING, oldPinnedPartitioning, newPinnedPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinnedPartitioning(PinnedPartitioning newPinnedPartitioning) {
		if (newPinnedPartitioning != pinnedPartitioning) {
			NotificationChain msgs = null;
			if (pinnedPartitioning != null)
				msgs = ((InternalEObject)pinnedPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PINNED_PARTITIONING, null, msgs);
			if (newPinnedPartitioning != null)
				msgs = ((InternalEObject)newPinnedPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PINNED_PARTITIONING, null, msgs);
			msgs = basicSetPinnedPartitioning(newPinnedPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PINNED_PARTITIONING, newPinnedPartitioning, newPinnedPartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangePartitioning getRangePartitioning() {
		return rangePartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangePartitioning(RangePartitioning newRangePartitioning, NotificationChain msgs) {
		RangePartitioning oldRangePartitioning = rangePartitioning;
		rangePartitioning = newRangePartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__RANGE_PARTITIONING, oldRangePartitioning, newRangePartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangePartitioning(RangePartitioning newRangePartitioning) {
		if (newRangePartitioning != rangePartitioning) {
			NotificationChain msgs = null;
			if (rangePartitioning != null)
				msgs = ((InternalEObject)rangePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__RANGE_PARTITIONING, null, msgs);
			if (newRangePartitioning != null)
				msgs = ((InternalEObject)newRangePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__RANGE_PARTITIONING, null, msgs);
			msgs = basicSetRangePartitioning(newRangePartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__RANGE_PARTITIONING, newRangePartitioning, newRangePartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePartitioning getValuePartitioning() {
		return valuePartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuePartitioning(ValuePartitioning newValuePartitioning, NotificationChain msgs) {
		ValuePartitioning oldValuePartitioning = valuePartitioning;
		valuePartitioning = newValuePartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__VALUE_PARTITIONING, oldValuePartitioning, newValuePartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuePartitioning(ValuePartitioning newValuePartitioning) {
		if (newValuePartitioning != valuePartitioning) {
			NotificationChain msgs = null;
			if (valuePartitioning != null)
				msgs = ((InternalEObject)valuePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__VALUE_PARTITIONING, null, msgs);
			if (newValuePartitioning != null)
				msgs = ((InternalEObject)newValuePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__VALUE_PARTITIONING, null, msgs);
			msgs = basicSetValuePartitioning(newValuePartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__VALUE_PARTITIONING, newValuePartitioning, newValuePartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashPartitioning getHashPartitioning() {
		return hashPartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHashPartitioning(HashPartitioning newHashPartitioning, NotificationChain msgs) {
		HashPartitioning oldHashPartitioning = hashPartitioning;
		hashPartitioning = newHashPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__HASH_PARTITIONING, oldHashPartitioning, newHashPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHashPartitioning(HashPartitioning newHashPartitioning) {
		if (newHashPartitioning != hashPartitioning) {
			NotificationChain msgs = null;
			if (hashPartitioning != null)
				msgs = ((InternalEObject)hashPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__HASH_PARTITIONING, null, msgs);
			if (newHashPartitioning != null)
				msgs = ((InternalEObject)newHashPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__HASH_PARTITIONING, null, msgs);
			msgs = basicSetHashPartitioning(newHashPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__HASH_PARTITIONING, newHashPartitioning, newHashPartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnionPartitioning getUnionPartitioning() {
		return unionPartitioning;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnionPartitioning(UnionPartitioning newUnionPartitioning, NotificationChain msgs) {
		UnionPartitioning oldUnionPartitioning = unionPartitioning;
		unionPartitioning = newUnionPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__UNION_PARTITIONING, oldUnionPartitioning, newUnionPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnionPartitioning(UnionPartitioning newUnionPartitioning) {
		if (newUnionPartitioning != unionPartitioning) {
			NotificationChain msgs = null;
			if (unionPartitioning != null)
				msgs = ((InternalEObject)unionPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__UNION_PARTITIONING, null, msgs);
			if (newUnionPartitioning != null)
				msgs = ((InternalEObject)newUnionPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__UNION_PARTITIONING, null, msgs);
			msgs = basicSetUnionPartitioning(newUnionPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__UNION_PARTITIONING, newUnionPartitioning, newUnionPartitioning));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPartitioned() {
		return partitioned;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitioned(String newPartitioned) {
		String oldPartitioned = partitioned;
		partitioned = newPartitioned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PARTITIONED, oldPartitioned, partitioned));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
  public EList<NamedNativeQuery> getNamedNativeQuery() {
		if (namedNativeQuery == null) {
			namedNativeQuery = new EObjectContainmentEList<NamedNativeQuery>(NamedNativeQuery.class, this, OrmPackage.ENTITY__NAMED_NATIVE_QUERY);
		}
		return namedNativeQuery;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<NamedStoredProcedureQuery> getNamedStoredProcedureQuery() {
		if (namedStoredProcedureQuery == null) {
			namedStoredProcedureQuery = new EObjectContainmentEList<NamedStoredProcedureQuery>(NamedStoredProcedureQuery.class, this, OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY);
		}
		return namedStoredProcedureQuery;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedStoredFunctionQuery> getNamedStoredFunctionQuery() {
		if (namedStoredFunctionQuery == null) {
			namedStoredFunctionQuery = new EObjectContainmentEList<NamedStoredFunctionQuery>(NamedStoredFunctionQuery.class, this, OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY);
		}
		return namedStoredFunctionQuery;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedPlsqlStoredProcedureQuery> getNamedPlsqlStoredProcedureQuery() {
		if (namedPlsqlStoredProcedureQuery == null) {
			namedPlsqlStoredProcedureQuery = new EObjectContainmentEList<NamedPlsqlStoredProcedureQuery>(NamedPlsqlStoredProcedureQuery.class, this, OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY);
		}
		return namedPlsqlStoredProcedureQuery;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedPlsqlStoredFunctionQuery> getNamedPlsqlStoredFunctionQuery() {
		if (namedPlsqlStoredFunctionQuery == null) {
			namedPlsqlStoredFunctionQuery = new EObjectContainmentEList<NamedPlsqlStoredFunctionQuery>(NamedPlsqlStoredFunctionQuery.class, this, OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY);
		}
		return namedPlsqlStoredFunctionQuery;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlsqlRecord> getPlsqlRecord() {
		if (plsqlRecord == null) {
			plsqlRecord = new EObjectContainmentEList<PlsqlRecord>(PlsqlRecord.class, this, OrmPackage.ENTITY__PLSQL_RECORD);
		}
		return plsqlRecord;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlsqlTable> getPlsqlTable() {
		if (plsqlTable == null) {
			plsqlTable = new EObjectContainmentEList<PlsqlTable>(PlsqlTable.class, this, OrmPackage.ENTITY__PLSQL_TABLE);
		}
		return plsqlTable;
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<SqlResultSetMapping> getSqlResultSetMapping() {
		if (sqlResultSetMapping == null) {
			sqlResultSetMapping = new EObjectContainmentEList<SqlResultSetMapping>(SqlResultSetMapping.class, this, OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING);
		}
		return sqlResultSetMapping;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public QueryRedirectors getQueryRedirectors() {
		return queryRedirectors;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetQueryRedirectors(QueryRedirectors newQueryRedirectors, NotificationChain msgs) {
		QueryRedirectors oldQueryRedirectors = queryRedirectors;
		queryRedirectors = newQueryRedirectors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__QUERY_REDIRECTORS, oldQueryRedirectors, newQueryRedirectors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setQueryRedirectors(QueryRedirectors newQueryRedirectors) {
		if (newQueryRedirectors != queryRedirectors) {
			NotificationChain msgs = null;
			if (queryRedirectors != null)
				msgs = ((InternalEObject)queryRedirectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__QUERY_REDIRECTORS, null, msgs);
			if (newQueryRedirectors != null)
				msgs = ((InternalEObject)newQueryRedirectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__QUERY_REDIRECTORS, null, msgs);
			msgs = basicSetQueryRedirectors(newQueryRedirectors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__QUERY_REDIRECTORS, newQueryRedirectors, newQueryRedirectors));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmptyType getExcludeDefaultListeners() {
		return excludeDefaultListeners;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExcludeDefaultListeners(EmptyType newExcludeDefaultListeners, NotificationChain msgs) {
		EmptyType oldExcludeDefaultListeners = excludeDefaultListeners;
		excludeDefaultListeners = newExcludeDefaultListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, oldExcludeDefaultListeners, newExcludeDefaultListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExcludeDefaultListeners(EmptyType newExcludeDefaultListeners) {
		if (newExcludeDefaultListeners != excludeDefaultListeners) {
			NotificationChain msgs = null;
			if (excludeDefaultListeners != null)
				msgs = ((InternalEObject)excludeDefaultListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			if (newExcludeDefaultListeners != null)
				msgs = ((InternalEObject)newExcludeDefaultListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, null, msgs);
			msgs = basicSetExcludeDefaultListeners(newExcludeDefaultListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS, newExcludeDefaultListeners, newExcludeDefaultListeners));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmptyType getExcludeSuperclassListeners() {
		return excludeSuperclassListeners;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners,
      NotificationChain msgs) {
		EmptyType oldExcludeSuperclassListeners = excludeSuperclassListeners;
		excludeSuperclassListeners = newExcludeSuperclassListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, oldExcludeSuperclassListeners, newExcludeSuperclassListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExcludeSuperclassListeners(EmptyType newExcludeSuperclassListeners) {
		if (newExcludeSuperclassListeners != excludeSuperclassListeners) {
			NotificationChain msgs = null;
			if (excludeSuperclassListeners != null)
				msgs = ((InternalEObject)excludeSuperclassListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			if (newExcludeSuperclassListeners != null)
				msgs = ((InternalEObject)newExcludeSuperclassListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, null, msgs);
			msgs = basicSetExcludeSuperclassListeners(newExcludeSuperclassListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS, newExcludeSuperclassListeners, newExcludeSuperclassListeners));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EntityListeners getEntityListeners() {
		return entityListeners;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEntityListeners(EntityListeners newEntityListeners, NotificationChain msgs) {
		EntityListeners oldEntityListeners = entityListeners;
		entityListeners = newEntityListeners;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ENTITY_LISTENERS, oldEntityListeners, newEntityListeners);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setEntityListeners(EntityListeners newEntityListeners) {
		if (newEntityListeners != entityListeners) {
			NotificationChain msgs = null;
			if (entityListeners != null)
				msgs = ((InternalEObject)entityListeners).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ENTITY_LISTENERS, null, msgs);
			if (newEntityListeners != null)
				msgs = ((InternalEObject)newEntityListeners).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ENTITY_LISTENERS, null, msgs);
			msgs = basicSetEntityListeners(newEntityListeners, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ENTITY_LISTENERS, newEntityListeners, newEntityListeners));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrePersist getPrePersist() {
		return prePersist;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrePersist(PrePersist newPrePersist, NotificationChain msgs) {
		PrePersist oldPrePersist = prePersist;
		prePersist = newPrePersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_PERSIST, oldPrePersist, newPrePersist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrePersist(PrePersist newPrePersist) {
		if (newPrePersist != prePersist) {
			NotificationChain msgs = null;
			if (prePersist != null)
				msgs = ((InternalEObject)prePersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_PERSIST, null, msgs);
			if (newPrePersist != null)
				msgs = ((InternalEObject)newPrePersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_PERSIST, null, msgs);
			msgs = basicSetPrePersist(newPrePersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_PERSIST, newPrePersist, newPrePersist));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostPersist getPostPersist() {
		return postPersist;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostPersist(PostPersist newPostPersist, NotificationChain msgs) {
		PostPersist oldPostPersist = postPersist;
		postPersist = newPostPersist;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_PERSIST, oldPostPersist, newPostPersist);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostPersist(PostPersist newPostPersist) {
		if (newPostPersist != postPersist) {
			NotificationChain msgs = null;
			if (postPersist != null)
				msgs = ((InternalEObject)postPersist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_PERSIST, null, msgs);
			if (newPostPersist != null)
				msgs = ((InternalEObject)newPostPersist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_PERSIST, null, msgs);
			msgs = basicSetPostPersist(newPostPersist, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_PERSIST, newPostPersist, newPostPersist));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreRemove getPreRemove() {
		return preRemove;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreRemove(PreRemove newPreRemove, NotificationChain msgs) {
		PreRemove oldPreRemove = preRemove;
		preRemove = newPreRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_REMOVE, oldPreRemove, newPreRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreRemove(PreRemove newPreRemove) {
		if (newPreRemove != preRemove) {
			NotificationChain msgs = null;
			if (preRemove != null)
				msgs = ((InternalEObject)preRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_REMOVE, null, msgs);
			if (newPreRemove != null)
				msgs = ((InternalEObject)newPreRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_REMOVE, null, msgs);
			msgs = basicSetPreRemove(newPreRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_REMOVE, newPreRemove, newPreRemove));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostRemove getPostRemove() {
		return postRemove;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostRemove(PostRemove newPostRemove, NotificationChain msgs) {
		PostRemove oldPostRemove = postRemove;
		postRemove = newPostRemove;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_REMOVE, oldPostRemove, newPostRemove);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostRemove(PostRemove newPostRemove) {
		if (newPostRemove != postRemove) {
			NotificationChain msgs = null;
			if (postRemove != null)
				msgs = ((InternalEObject)postRemove).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_REMOVE, null, msgs);
			if (newPostRemove != null)
				msgs = ((InternalEObject)newPostRemove).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_REMOVE, null, msgs);
			msgs = basicSetPostRemove(newPostRemove, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_REMOVE, newPostRemove, newPostRemove));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreUpdate getPreUpdate() {
		return preUpdate;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreUpdate(PreUpdate newPreUpdate, NotificationChain msgs) {
		PreUpdate oldPreUpdate = preUpdate;
		preUpdate = newPreUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_UPDATE, oldPreUpdate, newPreUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreUpdate(PreUpdate newPreUpdate) {
		if (newPreUpdate != preUpdate) {
			NotificationChain msgs = null;
			if (preUpdate != null)
				msgs = ((InternalEObject)preUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_UPDATE, null, msgs);
			if (newPreUpdate != null)
				msgs = ((InternalEObject)newPreUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__PRE_UPDATE, null, msgs);
			msgs = basicSetPreUpdate(newPreUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PRE_UPDATE, newPreUpdate, newPreUpdate));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostUpdate getPostUpdate() {
		return postUpdate;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostUpdate(PostUpdate newPostUpdate, NotificationChain msgs) {
		PostUpdate oldPostUpdate = postUpdate;
		postUpdate = newPostUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_UPDATE, oldPostUpdate, newPostUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostUpdate(PostUpdate newPostUpdate) {
		if (newPostUpdate != postUpdate) {
			NotificationChain msgs = null;
			if (postUpdate != null)
				msgs = ((InternalEObject)postUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_UPDATE, null, msgs);
			if (newPostUpdate != null)
				msgs = ((InternalEObject)newPostUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_UPDATE, null, msgs);
			msgs = basicSetPostUpdate(newPostUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_UPDATE, newPostUpdate, newPostUpdate));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostLoad getPostLoad() {
		return postLoad;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostLoad(PostLoad newPostLoad, NotificationChain msgs) {
		PostLoad oldPostLoad = postLoad;
		postLoad = newPostLoad;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_LOAD, oldPostLoad, newPostLoad);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostLoad(PostLoad newPostLoad) {
		if (newPostLoad != postLoad) {
			NotificationChain msgs = null;
			if (postLoad != null)
				msgs = ((InternalEObject)postLoad).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_LOAD, null, msgs);
			if (newPostLoad != null)
				msgs = ((InternalEObject)newPostLoad).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__POST_LOAD, null, msgs);
			msgs = basicSetPostLoad(newPostLoad, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__POST_LOAD, newPostLoad, newPostLoad));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
  public EList<AttributeOverride> getAttributeOverride() {
		if (attributeOverride == null) {
			attributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE);
		}
		return attributeOverride;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AssociationOverride> getAssociationOverride() {
		if (associationOverride == null) {
			associationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.ENTITY__ASSOCIATION_OVERRIDE);
		}
		return associationOverride;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Attributes getAttributes() {
		return attributes;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAttributes(Attributes newAttributes, NotificationChain msgs) {
		Attributes oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setAttributes(Attributes newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ENTITY__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ATTRIBUTES, newAttributes, newAttributes));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AccessType getAccess() {
		return access;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setAccess(AccessType newAccess) {
		AccessType oldAccess = access;
		access = newAccess == null ? ACCESS_EDEFAULT : newAccess;
		boolean oldAccessESet = accessESet;
		accessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__ACCESS, oldAccess, access, !oldAccessESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetAccess() {
		AccessType oldAccess = access;
		boolean oldAccessESet = accessESet;
		access = ACCESS_EDEFAULT;
		accessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetAccess() {
		return accessESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isCacheable() {
		return cacheable;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCacheable(boolean newCacheable) {
		boolean oldCacheable = cacheable;
		cacheable = newCacheable;
		boolean oldCacheableESet = cacheableESet;
		cacheableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__CACHEABLE, oldCacheable, cacheable, !oldCacheableESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetCacheable() {
		boolean oldCacheable = cacheable;
		boolean oldCacheableESet = cacheableESet;
		cacheable = CACHEABLE_EDEFAULT;
		cacheableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__CACHEABLE, oldCacheable, CACHEABLE_EDEFAULT, oldCacheableESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetCacheable() {
		return cacheableESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getClass_() {
		return class_;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
  public boolean isExcludeDefaultMappings() {
		return excludeDefaultMappings;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExcludeDefaultMappings(boolean newExcludeDefaultMappings) {
		boolean oldExcludeDefaultMappings = excludeDefaultMappings;
		excludeDefaultMappings = newExcludeDefaultMappings;
		boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
		excludeDefaultMappingsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS, oldExcludeDefaultMappings, excludeDefaultMappings, !oldExcludeDefaultMappingsESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetExcludeDefaultMappings() {
		boolean oldExcludeDefaultMappings = excludeDefaultMappings;
		boolean oldExcludeDefaultMappingsESet = excludeDefaultMappingsESet;
		excludeDefaultMappings = EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT;
		excludeDefaultMappingsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS, oldExcludeDefaultMappings, EXCLUDE_DEFAULT_MAPPINGS_EDEFAULT, oldExcludeDefaultMappingsESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetExcludeDefaultMappings() {
		return excludeDefaultMappingsESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ExistenceType getExistenceChecking() {
		return existenceChecking;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setExistenceChecking(ExistenceType newExistenceChecking) {
		ExistenceType oldExistenceChecking = existenceChecking;
		existenceChecking = newExistenceChecking == null ? EXISTENCE_CHECKING_EDEFAULT : newExistenceChecking;
		boolean oldExistenceCheckingESet = existenceCheckingESet;
		existenceCheckingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__EXISTENCE_CHECKING, oldExistenceChecking, existenceChecking, !oldExistenceCheckingESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetExistenceChecking() {
		ExistenceType oldExistenceChecking = existenceChecking;
		boolean oldExistenceCheckingESet = existenceCheckingESet;
		existenceChecking = EXISTENCE_CHECKING_EDEFAULT;
		existenceCheckingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__EXISTENCE_CHECKING, oldExistenceChecking, EXISTENCE_CHECKING_EDEFAULT, oldExistenceCheckingESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetExistenceChecking() {
		return existenceCheckingESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMetadataComplete() {
		return metadataComplete;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMetadataComplete(boolean newMetadataComplete) {
		boolean oldMetadataComplete = metadataComplete;
		metadataComplete = newMetadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataCompleteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__METADATA_COMPLETE, oldMetadataComplete, metadataComplete, !oldMetadataCompleteESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetMetadataComplete() {
		boolean oldMetadataComplete = metadataComplete;
		boolean oldMetadataCompleteESet = metadataCompleteESet;
		metadataComplete = METADATA_COMPLETE_EDEFAULT;
		metadataCompleteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__METADATA_COMPLETE, oldMetadataComplete, METADATA_COMPLETE_EDEFAULT, oldMetadataCompleteESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetMetadataComplete() {
		return metadataCompleteESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getName() {
		return name;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentClass() {
		return parentClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentClass(String newParentClass) {
		String oldParentClass = parentClass;
		parentClass = newParentClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__PARENT_CLASS, oldParentClass, parentClass));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isReadOnly() {
		return readOnly;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnlyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ENTITY__READ_ONLY, oldReadOnly, readOnly, !oldReadOnlyESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetReadOnly() {
		boolean oldReadOnly = readOnly;
		boolean oldReadOnlyESet = readOnlyESet;
		readOnly = READ_ONLY_EDEFAULT;
		readOnlyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ENTITY__READ_ONLY, oldReadOnly, READ_ONLY_EDEFAULT, oldReadOnlyESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetReadOnly() {
		return readOnlyESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ENTITY__ACCESS_METHODS:
				return basicSetAccessMethods(null, msgs);
			case OrmPackage.ENTITY__MULTITENANT:
				return basicSetMultitenant(null, msgs);
			case OrmPackage.ENTITY__ADDITIONAL_CRITERIA:
				return basicSetAdditionalCriteria(null, msgs);
			case OrmPackage.ENTITY__CUSTOMIZER:
				return basicSetCustomizer(null, msgs);
			case OrmPackage.ENTITY__CHANGE_TRACKING:
				return basicSetChangeTracking(null, msgs);
			case OrmPackage.ENTITY__TABLE:
				return basicSetTable(null, msgs);
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				return ((InternalEList<?>)getSecondaryTable()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__STRUCT:
				return basicSetStruct(null, msgs);
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				return ((InternalEList<?>)getPrimaryKeyJoinColumn()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__INDEX:
				return ((InternalEList<?>)getIndex()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ID_CLASS:
				return basicSetIdClass(null, msgs);
			case OrmPackage.ENTITY__PRIMARY_KEY:
				return basicSetPrimaryKey(null, msgs);
			case OrmPackage.ENTITY__INHERITANCE:
				return basicSetInheritance(null, msgs);
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				return basicSetDiscriminatorColumn(null, msgs);
			case OrmPackage.ENTITY__CLASS_EXTRACTOR:
				return basicSetClassExtractor(null, msgs);
			case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
				return basicSetOptimisticLocking(null, msgs);
			case OrmPackage.ENTITY__CACHE:
				return basicSetCache(null, msgs);
			case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
				return basicSetCacheInterceptor(null, msgs);
			case OrmPackage.ENTITY__FETCH_GROUP:
				return ((InternalEList<?>)getFetchGroup()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__CONVERTER:
				return ((InternalEList<?>)getConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__TYPE_CONVERTER:
				return ((InternalEList<?>)getTypeConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
				return ((InternalEList<?>)getObjectTypeConverter()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__STRUCT_CONVERTER:
				return ((InternalEList<?>)getStructConverter()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.ENTITY__PARTITIONING:
				return basicSetPartitioning(null, msgs);
			case OrmPackage.ENTITY__REPLICATION_PARTITIONING:
				return basicSetReplicationPartitioning(null, msgs);
			case OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING:
				return basicSetRoundRobinPartitioning(null, msgs);
			case OrmPackage.ENTITY__PINNED_PARTITIONING:
				return basicSetPinnedPartitioning(null, msgs);
			case OrmPackage.ENTITY__RANGE_PARTITIONING:
				return basicSetRangePartitioning(null, msgs);
			case OrmPackage.ENTITY__VALUE_PARTITIONING:
				return basicSetValuePartitioning(null, msgs);
			case OrmPackage.ENTITY__HASH_PARTITIONING:
				return basicSetHashPartitioning(null, msgs);
			case OrmPackage.ENTITY__UNION_PARTITIONING:
				return basicSetUnionPartitioning(null, msgs);
			case OrmPackage.ENTITY__NAMED_QUERY:
				return ((InternalEList<?>)getNamedQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				return ((InternalEList<?>)getNamedNativeQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
				return ((InternalEList<?>)getNamedStoredProcedureQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY:
				return ((InternalEList<?>)getNamedStoredFunctionQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
				return ((InternalEList<?>)getNamedPlsqlStoredProcedureQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY:
				return ((InternalEList<?>)getNamedPlsqlStoredFunctionQuery()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__PLSQL_RECORD:
				return ((InternalEList<?>)getPlsqlRecord()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__PLSQL_TABLE:
				return ((InternalEList<?>)getPlsqlTable()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				return ((InternalEList<?>)getSqlResultSetMapping()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__QUERY_REDIRECTORS:
				return basicSetQueryRedirectors(null, msgs);
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				return basicSetExcludeDefaultListeners(null, msgs);
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				return basicSetExcludeSuperclassListeners(null, msgs);
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				return basicSetEntityListeners(null, msgs);
			case OrmPackage.ENTITY__PRE_PERSIST:
				return basicSetPrePersist(null, msgs);
			case OrmPackage.ENTITY__POST_PERSIST:
				return basicSetPostPersist(null, msgs);
			case OrmPackage.ENTITY__PRE_REMOVE:
				return basicSetPreRemove(null, msgs);
			case OrmPackage.ENTITY__POST_REMOVE:
				return basicSetPostRemove(null, msgs);
			case OrmPackage.ENTITY__PRE_UPDATE:
				return basicSetPreUpdate(null, msgs);
			case OrmPackage.ENTITY__POST_UPDATE:
				return basicSetPostUpdate(null, msgs);
			case OrmPackage.ENTITY__POST_LOAD:
				return basicSetPostLoad(null, msgs);
			case OrmPackage.ENTITY__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				return ((InternalEList<?>)getAttributeOverride()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				return ((InternalEList<?>)getAssociationOverride()).basicRemove(otherEnd, msgs);
			case OrmPackage.ENTITY__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				return getDescription();
			case OrmPackage.ENTITY__ACCESS_METHODS:
				return getAccessMethods();
			case OrmPackage.ENTITY__MULTITENANT:
				return getMultitenant();
			case OrmPackage.ENTITY__ADDITIONAL_CRITERIA:
				return getAdditionalCriteria();
			case OrmPackage.ENTITY__CUSTOMIZER:
				return getCustomizer();
			case OrmPackage.ENTITY__CHANGE_TRACKING:
				return getChangeTracking();
			case OrmPackage.ENTITY__TABLE:
				return getTable();
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				return getSecondaryTable();
			case OrmPackage.ENTITY__STRUCT:
				return getStruct();
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				return getPrimaryKeyJoinColumn();
			case OrmPackage.ENTITY__CASCADE_ON_DELETE:
				return isCascadeOnDelete();
			case OrmPackage.ENTITY__INDEX:
				return getIndex();
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
			case OrmPackage.ENTITY__CLASS_EXTRACTOR:
				return getClassExtractor();
			case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
				return getOptimisticLocking();
			case OrmPackage.ENTITY__CACHE:
				return getCache();
			case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
				return getCacheInterceptor();
			case OrmPackage.ENTITY__FETCH_GROUP:
				return getFetchGroup();
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
			case OrmPackage.ENTITY__PARTITIONING:
				return getPartitioning();
			case OrmPackage.ENTITY__REPLICATION_PARTITIONING:
				return getReplicationPartitioning();
			case OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING:
				return getRoundRobinPartitioning();
			case OrmPackage.ENTITY__PINNED_PARTITIONING:
				return getPinnedPartitioning();
			case OrmPackage.ENTITY__RANGE_PARTITIONING:
				return getRangePartitioning();
			case OrmPackage.ENTITY__VALUE_PARTITIONING:
				return getValuePartitioning();
			case OrmPackage.ENTITY__HASH_PARTITIONING:
				return getHashPartitioning();
			case OrmPackage.ENTITY__UNION_PARTITIONING:
				return getUnionPartitioning();
			case OrmPackage.ENTITY__PARTITIONED:
				return getPartitioned();
			case OrmPackage.ENTITY__NAMED_QUERY:
				return getNamedQuery();
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				return getNamedNativeQuery();
			case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
				return getNamedStoredProcedureQuery();
			case OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY:
				return getNamedStoredFunctionQuery();
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
				return getNamedPlsqlStoredProcedureQuery();
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY:
				return getNamedPlsqlStoredFunctionQuery();
			case OrmPackage.ENTITY__PLSQL_RECORD:
				return getPlsqlRecord();
			case OrmPackage.ENTITY__PLSQL_TABLE:
				return getPlsqlTable();
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
			case OrmPackage.ENTITY__PRE_PERSIST:
				return getPrePersist();
			case OrmPackage.ENTITY__POST_PERSIST:
				return getPostPersist();
			case OrmPackage.ENTITY__PRE_REMOVE:
				return getPreRemove();
			case OrmPackage.ENTITY__POST_REMOVE:
				return getPostRemove();
			case OrmPackage.ENTITY__PRE_UPDATE:
				return getPreUpdate();
			case OrmPackage.ENTITY__POST_UPDATE:
				return getPostUpdate();
			case OrmPackage.ENTITY__POST_LOAD:
				return getPostLoad();
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
			case OrmPackage.ENTITY__PARENT_CLASS:
				return getParentClass();
			case OrmPackage.ENTITY__READ_ONLY:
				return isReadOnly();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OrmPackage.ENTITY__ACCESS_METHODS:
				setAccessMethods((AccessMethods)newValue);
				return;
			case OrmPackage.ENTITY__MULTITENANT:
				setMultitenant((Multitenant)newValue);
				return;
			case OrmPackage.ENTITY__ADDITIONAL_CRITERIA:
				setAdditionalCriteria((AdditionalCriteria)newValue);
				return;
			case OrmPackage.ENTITY__CUSTOMIZER:
				setCustomizer((Customizer)newValue);
				return;
			case OrmPackage.ENTITY__CHANGE_TRACKING:
				setChangeTracking((ChangeTracking)newValue);
				return;
			case OrmPackage.ENTITY__TABLE:
				setTable((Table)newValue);
				return;
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				getSecondaryTable().clear();
				getSecondaryTable().addAll((Collection<? extends SecondaryTable>)newValue);
				return;
			case OrmPackage.ENTITY__STRUCT:
				setStruct((Struct)newValue);
				return;
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				getPrimaryKeyJoinColumn().clear();
				getPrimaryKeyJoinColumn().addAll((Collection<? extends PrimaryKeyJoinColumn>)newValue);
				return;
			case OrmPackage.ENTITY__CASCADE_ON_DELETE:
				setCascadeOnDelete((Boolean)newValue);
				return;
			case OrmPackage.ENTITY__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Index>)newValue);
				return;
			case OrmPackage.ENTITY__ID_CLASS:
				setIdClass((IdClass)newValue);
				return;
			case OrmPackage.ENTITY__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)newValue);
				return;
			case OrmPackage.ENTITY__INHERITANCE:
				setInheritance((Inheritance)newValue);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				setDiscriminatorValue((String)newValue);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((DiscriminatorColumn)newValue);
				return;
			case OrmPackage.ENTITY__CLASS_EXTRACTOR:
				setClassExtractor((ClassExtractor)newValue);
				return;
			case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
				setOptimisticLocking((OptimisticLocking)newValue);
				return;
			case OrmPackage.ENTITY__CACHE:
				setCache((Cache)newValue);
				return;
			case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
				setCacheInterceptor((CacheInterceptor)newValue);
				return;
			case OrmPackage.ENTITY__FETCH_GROUP:
				getFetchGroup().clear();
				getFetchGroup().addAll((Collection<? extends FetchGroup>)newValue);
				return;
			case OrmPackage.ENTITY__CONVERTER:
				getConverter().clear();
				getConverter().addAll((Collection<? extends Converter>)newValue);
				return;
			case OrmPackage.ENTITY__TYPE_CONVERTER:
				getTypeConverter().clear();
				getTypeConverter().addAll((Collection<? extends TypeConverter>)newValue);
				return;
			case OrmPackage.ENTITY__OBJECT_TYPE_CONVERTER:
				getObjectTypeConverter().clear();
				getObjectTypeConverter().addAll((Collection<? extends ObjectTypeConverter>)newValue);
				return;
			case OrmPackage.ENTITY__STRUCT_CONVERTER:
				getStructConverter().clear();
				getStructConverter().addAll((Collection<? extends StructConverter>)newValue);
				return;
			case OrmPackage.ENTITY__COPY_POLICY:
				setCopyPolicy((CopyPolicy)newValue);
				return;
			case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
				setInstantiationCopyPolicy((InstantiationCopyPolicy)newValue);
				return;
			case OrmPackage.ENTITY__CLONE_COPY_POLICY:
				setCloneCopyPolicy((CloneCopyPolicy)newValue);
				return;
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)newValue);
				return;
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)newValue);
				return;
			case OrmPackage.ENTITY__PARTITIONING:
				setPartitioning((Partitioning)newValue);
				return;
			case OrmPackage.ENTITY__REPLICATION_PARTITIONING:
				setReplicationPartitioning((ReplicationPartitioning)newValue);
				return;
			case OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING:
				setRoundRobinPartitioning((RoundRobinPartitioning)newValue);
				return;
			case OrmPackage.ENTITY__PINNED_PARTITIONING:
				setPinnedPartitioning((PinnedPartitioning)newValue);
				return;
			case OrmPackage.ENTITY__RANGE_PARTITIONING:
				setRangePartitioning((RangePartitioning)newValue);
				return;
			case OrmPackage.ENTITY__VALUE_PARTITIONING:
				setValuePartitioning((ValuePartitioning)newValue);
				return;
			case OrmPackage.ENTITY__HASH_PARTITIONING:
				setHashPartitioning((HashPartitioning)newValue);
				return;
			case OrmPackage.ENTITY__UNION_PARTITIONING:
				setUnionPartitioning((UnionPartitioning)newValue);
				return;
			case OrmPackage.ENTITY__PARTITIONED:
				setPartitioned((String)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_QUERY:
				getNamedQuery().clear();
				getNamedQuery().addAll((Collection<? extends NamedQuery>)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				getNamedNativeQuery().clear();
				getNamedNativeQuery().addAll((Collection<? extends NamedNativeQuery>)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
				getNamedStoredProcedureQuery().clear();
				getNamedStoredProcedureQuery().addAll((Collection<? extends NamedStoredProcedureQuery>)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY:
				getNamedStoredFunctionQuery().clear();
				getNamedStoredFunctionQuery().addAll((Collection<? extends NamedStoredFunctionQuery>)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
				getNamedPlsqlStoredProcedureQuery().clear();
				getNamedPlsqlStoredProcedureQuery().addAll((Collection<? extends NamedPlsqlStoredProcedureQuery>)newValue);
				return;
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY:
				getNamedPlsqlStoredFunctionQuery().clear();
				getNamedPlsqlStoredFunctionQuery().addAll((Collection<? extends NamedPlsqlStoredFunctionQuery>)newValue);
				return;
			case OrmPackage.ENTITY__PLSQL_RECORD:
				getPlsqlRecord().clear();
				getPlsqlRecord().addAll((Collection<? extends PlsqlRecord>)newValue);
				return;
			case OrmPackage.ENTITY__PLSQL_TABLE:
				getPlsqlTable().clear();
				getPlsqlTable().addAll((Collection<? extends PlsqlTable>)newValue);
				return;
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				getSqlResultSetMapping().clear();
				getSqlResultSetMapping().addAll((Collection<? extends SqlResultSetMapping>)newValue);
				return;
			case OrmPackage.ENTITY__QUERY_REDIRECTORS:
				setQueryRedirectors((QueryRedirectors)newValue);
				return;
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((EmptyType)newValue);
				return;
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((EmptyType)newValue);
				return;
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				setEntityListeners((EntityListeners)newValue);
				return;
			case OrmPackage.ENTITY__PRE_PERSIST:
				setPrePersist((PrePersist)newValue);
				return;
			case OrmPackage.ENTITY__POST_PERSIST:
				setPostPersist((PostPersist)newValue);
				return;
			case OrmPackage.ENTITY__PRE_REMOVE:
				setPreRemove((PreRemove)newValue);
				return;
			case OrmPackage.ENTITY__POST_REMOVE:
				setPostRemove((PostRemove)newValue);
				return;
			case OrmPackage.ENTITY__PRE_UPDATE:
				setPreUpdate((PreUpdate)newValue);
				return;
			case OrmPackage.ENTITY__POST_UPDATE:
				setPostUpdate((PostUpdate)newValue);
				return;
			case OrmPackage.ENTITY__POST_LOAD:
				setPostLoad((PostLoad)newValue);
				return;
			case OrmPackage.ENTITY__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case OrmPackage.ENTITY__ATTRIBUTE_OVERRIDE:
				getAttributeOverride().clear();
				getAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
				return;
			case OrmPackage.ENTITY__ASSOCIATION_OVERRIDE:
				getAssociationOverride().clear();
				getAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
				return;
			case OrmPackage.ENTITY__ATTRIBUTES:
				setAttributes((Attributes)newValue);
				return;
			case OrmPackage.ENTITY__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.ENTITY__CACHEABLE:
				setCacheable((Boolean)newValue);
				return;
			case OrmPackage.ENTITY__CLASS:
				setClass((String)newValue);
				return;
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_MAPPINGS:
				setExcludeDefaultMappings((Boolean)newValue);
				return;
			case OrmPackage.ENTITY__EXISTENCE_CHECKING:
				setExistenceChecking((ExistenceType)newValue);
				return;
			case OrmPackage.ENTITY__METADATA_COMPLETE:
				setMetadataComplete((Boolean)newValue);
				return;
			case OrmPackage.ENTITY__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.ENTITY__PARENT_CLASS:
				setParentClass((String)newValue);
				return;
			case OrmPackage.ENTITY__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OrmPackage.ENTITY__ACCESS_METHODS:
				setAccessMethods((AccessMethods)null);
				return;
			case OrmPackage.ENTITY__MULTITENANT:
				setMultitenant((Multitenant)null);
				return;
			case OrmPackage.ENTITY__ADDITIONAL_CRITERIA:
				setAdditionalCriteria((AdditionalCriteria)null);
				return;
			case OrmPackage.ENTITY__CUSTOMIZER:
				setCustomizer((Customizer)null);
				return;
			case OrmPackage.ENTITY__CHANGE_TRACKING:
				setChangeTracking((ChangeTracking)null);
				return;
			case OrmPackage.ENTITY__TABLE:
				setTable((Table)null);
				return;
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				getSecondaryTable().clear();
				return;
			case OrmPackage.ENTITY__STRUCT:
				setStruct((Struct)null);
				return;
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				getPrimaryKeyJoinColumn().clear();
				return;
			case OrmPackage.ENTITY__CASCADE_ON_DELETE:
				unsetCascadeOnDelete();
				return;
			case OrmPackage.ENTITY__INDEX:
				getIndex().clear();
				return;
			case OrmPackage.ENTITY__ID_CLASS:
				setIdClass((IdClass)null);
				return;
			case OrmPackage.ENTITY__PRIMARY_KEY:
				setPrimaryKey((PrimaryKey)null);
				return;
			case OrmPackage.ENTITY__INHERITANCE:
				setInheritance((Inheritance)null);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				setDiscriminatorValue(DISCRIMINATOR_VALUE_EDEFAULT);
				return;
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				setDiscriminatorColumn((DiscriminatorColumn)null);
				return;
			case OrmPackage.ENTITY__CLASS_EXTRACTOR:
				setClassExtractor((ClassExtractor)null);
				return;
			case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
				setOptimisticLocking((OptimisticLocking)null);
				return;
			case OrmPackage.ENTITY__CACHE:
				setCache((Cache)null);
				return;
			case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
				setCacheInterceptor((CacheInterceptor)null);
				return;
			case OrmPackage.ENTITY__FETCH_GROUP:
				getFetchGroup().clear();
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
				setCopyPolicy((CopyPolicy)null);
				return;
			case OrmPackage.ENTITY__INSTANTIATION_COPY_POLICY:
				setInstantiationCopyPolicy((InstantiationCopyPolicy)null);
				return;
			case OrmPackage.ENTITY__CLONE_COPY_POLICY:
				setCloneCopyPolicy((CloneCopyPolicy)null);
				return;
			case OrmPackage.ENTITY__SEQUENCE_GENERATOR:
				setSequenceGenerator((SequenceGenerator)null);
				return;
			case OrmPackage.ENTITY__TABLE_GENERATOR:
				setTableGenerator((TableGenerator)null);
				return;
			case OrmPackage.ENTITY__PARTITIONING:
				setPartitioning((Partitioning)null);
				return;
			case OrmPackage.ENTITY__REPLICATION_PARTITIONING:
				setReplicationPartitioning((ReplicationPartitioning)null);
				return;
			case OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING:
				setRoundRobinPartitioning((RoundRobinPartitioning)null);
				return;
			case OrmPackage.ENTITY__PINNED_PARTITIONING:
				setPinnedPartitioning((PinnedPartitioning)null);
				return;
			case OrmPackage.ENTITY__RANGE_PARTITIONING:
				setRangePartitioning((RangePartitioning)null);
				return;
			case OrmPackage.ENTITY__VALUE_PARTITIONING:
				setValuePartitioning((ValuePartitioning)null);
				return;
			case OrmPackage.ENTITY__HASH_PARTITIONING:
				setHashPartitioning((HashPartitioning)null);
				return;
			case OrmPackage.ENTITY__UNION_PARTITIONING:
				setUnionPartitioning((UnionPartitioning)null);
				return;
			case OrmPackage.ENTITY__PARTITIONED:
				setPartitioned(PARTITIONED_EDEFAULT);
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
			case OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY:
				getNamedStoredFunctionQuery().clear();
				return;
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
				getNamedPlsqlStoredProcedureQuery().clear();
				return;
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY:
				getNamedPlsqlStoredFunctionQuery().clear();
				return;
			case OrmPackage.ENTITY__PLSQL_RECORD:
				getPlsqlRecord().clear();
				return;
			case OrmPackage.ENTITY__PLSQL_TABLE:
				getPlsqlTable().clear();
				return;
			case OrmPackage.ENTITY__SQL_RESULT_SET_MAPPING:
				getSqlResultSetMapping().clear();
				return;
			case OrmPackage.ENTITY__QUERY_REDIRECTORS:
				setQueryRedirectors((QueryRedirectors)null);
				return;
			case OrmPackage.ENTITY__EXCLUDE_DEFAULT_LISTENERS:
				setExcludeDefaultListeners((EmptyType)null);
				return;
			case OrmPackage.ENTITY__EXCLUDE_SUPERCLASS_LISTENERS:
				setExcludeSuperclassListeners((EmptyType)null);
				return;
			case OrmPackage.ENTITY__ENTITY_LISTENERS:
				setEntityListeners((EntityListeners)null);
				return;
			case OrmPackage.ENTITY__PRE_PERSIST:
				setPrePersist((PrePersist)null);
				return;
			case OrmPackage.ENTITY__POST_PERSIST:
				setPostPersist((PostPersist)null);
				return;
			case OrmPackage.ENTITY__PRE_REMOVE:
				setPreRemove((PreRemove)null);
				return;
			case OrmPackage.ENTITY__POST_REMOVE:
				setPostRemove((PostRemove)null);
				return;
			case OrmPackage.ENTITY__PRE_UPDATE:
				setPreUpdate((PreUpdate)null);
				return;
			case OrmPackage.ENTITY__POST_UPDATE:
				setPostUpdate((PostUpdate)null);
				return;
			case OrmPackage.ENTITY__POST_LOAD:
				setPostLoad((PostLoad)null);
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
				setAttributes((Attributes)null);
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
			case OrmPackage.ENTITY__PARENT_CLASS:
				setParentClass(PARENT_CLASS_EDEFAULT);
				return;
			case OrmPackage.ENTITY__READ_ONLY:
				unsetReadOnly();
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OrmPackage.ENTITY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OrmPackage.ENTITY__ACCESS_METHODS:
				return accessMethods != null;
			case OrmPackage.ENTITY__MULTITENANT:
				return multitenant != null;
			case OrmPackage.ENTITY__ADDITIONAL_CRITERIA:
				return additionalCriteria != null;
			case OrmPackage.ENTITY__CUSTOMIZER:
				return customizer != null;
			case OrmPackage.ENTITY__CHANGE_TRACKING:
				return changeTracking != null;
			case OrmPackage.ENTITY__TABLE:
				return table != null;
			case OrmPackage.ENTITY__SECONDARY_TABLE:
				return secondaryTable != null && !secondaryTable.isEmpty();
			case OrmPackage.ENTITY__STRUCT:
				return struct != null;
			case OrmPackage.ENTITY__PRIMARY_KEY_JOIN_COLUMN:
				return primaryKeyJoinColumn != null && !primaryKeyJoinColumn.isEmpty();
			case OrmPackage.ENTITY__CASCADE_ON_DELETE:
				return isSetCascadeOnDelete();
			case OrmPackage.ENTITY__INDEX:
				return index != null && !index.isEmpty();
			case OrmPackage.ENTITY__ID_CLASS:
				return idClass != null;
			case OrmPackage.ENTITY__PRIMARY_KEY:
				return primaryKey != null;
			case OrmPackage.ENTITY__INHERITANCE:
				return inheritance != null;
			case OrmPackage.ENTITY__DISCRIMINATOR_VALUE:
				return DISCRIMINATOR_VALUE_EDEFAULT == null ? discriminatorValue != null : !DISCRIMINATOR_VALUE_EDEFAULT.equals(discriminatorValue);
			case OrmPackage.ENTITY__DISCRIMINATOR_COLUMN:
				return discriminatorColumn != null;
			case OrmPackage.ENTITY__CLASS_EXTRACTOR:
				return classExtractor != null;
			case OrmPackage.ENTITY__OPTIMISTIC_LOCKING:
				return optimisticLocking != null;
			case OrmPackage.ENTITY__CACHE:
				return cache != null;
			case OrmPackage.ENTITY__CACHE_INTERCEPTOR:
				return cacheInterceptor != null;
			case OrmPackage.ENTITY__FETCH_GROUP:
				return fetchGroup != null && !fetchGroup.isEmpty();
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
			case OrmPackage.ENTITY__PARTITIONING:
				return partitioning != null;
			case OrmPackage.ENTITY__REPLICATION_PARTITIONING:
				return replicationPartitioning != null;
			case OrmPackage.ENTITY__ROUND_ROBIN_PARTITIONING:
				return roundRobinPartitioning != null;
			case OrmPackage.ENTITY__PINNED_PARTITIONING:
				return pinnedPartitioning != null;
			case OrmPackage.ENTITY__RANGE_PARTITIONING:
				return rangePartitioning != null;
			case OrmPackage.ENTITY__VALUE_PARTITIONING:
				return valuePartitioning != null;
			case OrmPackage.ENTITY__HASH_PARTITIONING:
				return hashPartitioning != null;
			case OrmPackage.ENTITY__UNION_PARTITIONING:
				return unionPartitioning != null;
			case OrmPackage.ENTITY__PARTITIONED:
				return PARTITIONED_EDEFAULT == null ? partitioned != null : !PARTITIONED_EDEFAULT.equals(partitioned);
			case OrmPackage.ENTITY__NAMED_QUERY:
				return namedQuery != null && !namedQuery.isEmpty();
			case OrmPackage.ENTITY__NAMED_NATIVE_QUERY:
				return namedNativeQuery != null && !namedNativeQuery.isEmpty();
			case OrmPackage.ENTITY__NAMED_STORED_PROCEDURE_QUERY:
				return namedStoredProcedureQuery != null && !namedStoredProcedureQuery.isEmpty();
			case OrmPackage.ENTITY__NAMED_STORED_FUNCTION_QUERY:
				return namedStoredFunctionQuery != null && !namedStoredFunctionQuery.isEmpty();
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_PROCEDURE_QUERY:
				return namedPlsqlStoredProcedureQuery != null && !namedPlsqlStoredProcedureQuery.isEmpty();
			case OrmPackage.ENTITY__NAMED_PLSQL_STORED_FUNCTION_QUERY:
				return namedPlsqlStoredFunctionQuery != null && !namedPlsqlStoredFunctionQuery.isEmpty();
			case OrmPackage.ENTITY__PLSQL_RECORD:
				return plsqlRecord != null && !plsqlRecord.isEmpty();
			case OrmPackage.ENTITY__PLSQL_TABLE:
				return plsqlTable != null && !plsqlTable.isEmpty();
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
			case OrmPackage.ENTITY__PRE_PERSIST:
				return prePersist != null;
			case OrmPackage.ENTITY__POST_PERSIST:
				return postPersist != null;
			case OrmPackage.ENTITY__PRE_REMOVE:
				return preRemove != null;
			case OrmPackage.ENTITY__POST_REMOVE:
				return postRemove != null;
			case OrmPackage.ENTITY__PRE_UPDATE:
				return preUpdate != null;
			case OrmPackage.ENTITY__POST_UPDATE:
				return postUpdate != null;
			case OrmPackage.ENTITY__POST_LOAD:
				return postLoad != null;
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
			case OrmPackage.ENTITY__PARENT_CLASS:
				return PARENT_CLASS_EDEFAULT == null ? parentClass != null : !PARENT_CLASS_EDEFAULT.equals(parentClass);
			case OrmPackage.ENTITY__READ_ONLY:
				return isSetReadOnly();
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", cascadeOnDelete: ");
		if (cascadeOnDeleteESet) result.append(cascadeOnDelete); else result.append("<unset>");
		result.append(", discriminatorValue: ");
		result.append(discriminatorValue);
		result.append(", partitioned: ");
		result.append(partitioned);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", cacheable: ");
		if (cacheableESet) result.append(cacheable); else result.append("<unset>");
		result.append(", class: ");
		result.append(class_);
		result.append(", excludeDefaultMappings: ");
		if (excludeDefaultMappingsESet) result.append(excludeDefaultMappings); else result.append("<unset>");
		result.append(", existenceChecking: ");
		if (existenceCheckingESet) result.append(existenceChecking); else result.append("<unset>");
		result.append(", metadataComplete: ");
		if (metadataCompleteESet) result.append(metadataComplete); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", parentClass: ");
		result.append(parentClass);
		result.append(", readOnly: ");
		if (readOnlyESet) result.append(readOnly); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getEntity_Name());

    final String jAnnotation = ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
    if (getDiscriminatorValue() != null) {
      return "@javax.persistence.DiscriminatorValue(\"" + getDiscriminatorValue() + "\")\n" + jAnnotation; //$NON-NLS-1$//$NON-NLS-2$
    }
    return jAnnotation;
  }
} // EntityImpl
