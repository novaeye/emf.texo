/**
 * <copyright>
 * </copyright>
 *
 * $Id: ManyToOneImpl.java,v 1.7 2011/10/25 22:27:57 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.BatchFetch;
import org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.HashPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.ManyToOne;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Partitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.PinnedPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.RangePartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ReplicationPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.RoundRobinPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.UnionPartitioning;
import org.eclipse.emf.texo.orm.annotations.model.orm.ValuePartitioning;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Many To One</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getBatchFetch <em>Batch Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getNoncacheable <em>Noncacheable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getPartitioning <em>Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getReplicationPartitioning <em>Replication Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getRoundRobinPartitioning <em>Round Robin Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getPinnedPartitioning <em>Pinned Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getRangePartitioning <em>Range Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getValuePartitioning <em>Value Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getHashPartitioning <em>Hash Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getUnionPartitioning <em>Union Partitioning</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getPartitioned <em>Partitioned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#isId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getMapsId <em>Maps Id</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.ManyToOneImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyToOneImpl extends BaseOrmAnnotationImpl implements ManyToOne {
  /**
   * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> joinColumn;

  /**
	 * The cached value of the '{@link #getJoinTable() <em>Join Table</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getJoinTable()
	 * @generated
	 * @ordered
	 */
  protected JoinTable joinTable;

  /**
	 * The cached value of the '{@link #getCascade() <em>Cascade</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCascade()
	 * @generated
	 * @ordered
	 */
  protected CascadeType cascade;

  /**
	 * The default value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getJoinFetch()
	 * @generated
	 * @ordered
	 */
  protected static final JoinFetchType JOIN_FETCH_EDEFAULT = JoinFetchType.INNER;

  /**
	 * The cached value of the '{@link #getJoinFetch() <em>Join Fetch</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getJoinFetch()
	 * @generated
	 * @ordered
	 */
  protected JoinFetchType joinFetch = JOIN_FETCH_EDEFAULT;

  /**
	 * This is true if the Join Fetch attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean joinFetchESet;

  /**
	 * The cached value of the '{@link #getBatchFetch() <em>Batch Fetch</em>}' containment reference.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getBatchFetch()
	 * @generated
	 * @ordered
	 */
  protected BatchFetch batchFetch;

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
   * The cached value of the '{@link #getAccessMethods() <em>Access Methods</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getAccessMethods()
   * @generated
   * @ordered
   */
  protected AccessMethods accessMethods;

  /**
   * The cached value of the '{@link #getNoncacheable() <em>Noncacheable</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getNoncacheable()
   * @generated
   * @ordered
   */
  protected EmptyType noncacheable;

  /**
   * The cached value of the '{@link #getPartitioning() <em>Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPartitioning()
   * @generated
   * @ordered
   */
  protected Partitioning partitioning;

  /**
	 * The cached value of the '{@link #getReplicationPartitioning() <em>Replication Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReplicationPartitioning()
	 * @generated
	 * @ordered
	 */
  protected ReplicationPartitioning replicationPartitioning;

  /**
	 * The cached value of the '{@link #getRoundRobinPartitioning() <em>Round Robin Partitioning</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoundRobinPartitioning()
	 * @generated
	 * @ordered
	 */
  protected RoundRobinPartitioning roundRobinPartitioning;

  /**
   * The cached value of the '{@link #getPinnedPartitioning() <em>Pinned Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPinnedPartitioning()
   * @generated
   * @ordered
   */
  protected PinnedPartitioning pinnedPartitioning;

  /**
   * The cached value of the '{@link #getRangePartitioning() <em>Range Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getRangePartitioning()
   * @generated
   * @ordered
   */
  protected RangePartitioning rangePartitioning;

  /**
   * The cached value of the '{@link #getValuePartitioning() <em>Value Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getValuePartitioning()
   * @generated
   * @ordered
   */
  protected ValuePartitioning valuePartitioning;

  /**
   * The cached value of the '{@link #getHashPartitioning() <em>Hash Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getHashPartitioning()
   * @generated
   * @ordered
   */
  protected HashPartitioning hashPartitioning;

  /**
   * The cached value of the '{@link #getUnionPartitioning() <em>Union Partitioning</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getUnionPartitioning()
   * @generated
   * @ordered
   */
  protected UnionPartitioning unionPartitioning;

  /**
	 * The default value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getPartitioned()
	 * @generated
	 * @ordered
	 */
  protected static final String PARTITIONED_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getPartitioned() <em>Partitioned</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getPartitioned()
	 * @generated
	 * @ordered
	 */
  protected String partitioned = PARTITIONED_EDEFAULT;

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
   * The default value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected static final FetchType FETCH_EDEFAULT = FetchType.LAZY;

  /**
   * The cached value of the '{@link #getFetch() <em>Fetch</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @see #getFetch()
   * @generated
   * @ordered
   */
  protected FetchType fetch = FETCH_EDEFAULT;

  /**
	 * This is true if the Fetch attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean fetchESet;

  /**
	 * The default value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ID_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isId()
	 * @generated
	 * @ordered
	 */
  protected boolean id = ID_EDEFAULT;

  /**
	 * This is true if the Id attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean idESet;

  /**
	 * The default value of the '{@link #getMapsId() <em>Maps Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getMapsId()
	 * @generated
	 * @ordered
	 */
  protected static final String MAPS_ID_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMapsId() <em>Maps Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getMapsId()
	 * @generated
	 * @ordered
	 */
  protected String mapsId = MAPS_ID_EDEFAULT;

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
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean optionalESet;

  /**
	 * The default value of the '{@link #getTargetEntity() <em>Target Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
  protected static final String TARGET_ENTITY_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTargetEntity() <em>Target Entity</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getTargetEntity()
	 * @generated
	 * @ordered
	 */
  protected String targetEntity = TARGET_ENTITY_EDEFAULT;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected ManyToOneImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getManyToOne();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<JoinColumn> getJoinColumn() {
		if (joinColumn == null) {
			joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.MANY_TO_ONE__JOIN_COLUMN);
		}
		return joinColumn;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public JoinTable getJoinTable() {
		return joinTable;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetJoinTable(JoinTable newJoinTable, NotificationChain msgs) {
		JoinTable oldJoinTable = joinTable;
		joinTable = newJoinTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__JOIN_TABLE, oldJoinTable, newJoinTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setJoinTable(JoinTable newJoinTable) {
		if (newJoinTable != joinTable) {
			NotificationChain msgs = null;
			if (joinTable != null)
				msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__JOIN_TABLE, null, msgs);
			if (newJoinTable != null)
				msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__JOIN_TABLE, null, msgs);
			msgs = basicSetJoinTable(newJoinTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__JOIN_TABLE, newJoinTable, newJoinTable));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public CascadeType getCascade() {
		return cascade;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCascade(CascadeType newCascade, NotificationChain msgs) {
		CascadeType oldCascade = cascade;
		cascade = newCascade;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__CASCADE, oldCascade, newCascade);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setCascade(CascadeType newCascade) {
		if (newCascade != cascade) {
			NotificationChain msgs = null;
			if (cascade != null)
				msgs = ((InternalEObject)cascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__CASCADE, null, msgs);
			if (newCascade != null)
				msgs = ((InternalEObject)newCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__CASCADE, null, msgs);
			msgs = basicSetCascade(newCascade, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__CASCADE, newCascade, newCascade));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public JoinFetchType getJoinFetch() {
		return joinFetch;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setJoinFetch(JoinFetchType newJoinFetch) {
		JoinFetchType oldJoinFetch = joinFetch;
		joinFetch = newJoinFetch == null ? JOIN_FETCH_EDEFAULT : newJoinFetch;
		boolean oldJoinFetchESet = joinFetchESet;
		joinFetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__JOIN_FETCH, oldJoinFetch, joinFetch, !oldJoinFetchESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetJoinFetch() {
		JoinFetchType oldJoinFetch = joinFetch;
		boolean oldJoinFetchESet = joinFetchESet;
		joinFetch = JOIN_FETCH_EDEFAULT;
		joinFetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_ONE__JOIN_FETCH, oldJoinFetch, JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetJoinFetch() {
		return joinFetchESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public BatchFetch getBatchFetch() {
		return batchFetch;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetBatchFetch(BatchFetch newBatchFetch, NotificationChain msgs) {
		BatchFetch oldBatchFetch = batchFetch;
		batchFetch = newBatchFetch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__BATCH_FETCH, oldBatchFetch, newBatchFetch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setBatchFetch(BatchFetch newBatchFetch) {
		if (newBatchFetch != batchFetch) {
			NotificationChain msgs = null;
			if (batchFetch != null)
				msgs = ((InternalEObject)batchFetch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__BATCH_FETCH, null, msgs);
			if (newBatchFetch != null)
				msgs = ((InternalEObject)newBatchFetch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__BATCH_FETCH, null, msgs);
			msgs = basicSetBatchFetch(newBatchFetch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__BATCH_FETCH, newBatchFetch, newBatchFetch));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.MANY_TO_ONE__PROPERTY);
		}
		return property;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public AccessMethods getAccessMethods() {
		return accessMethods;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetAccessMethods(AccessMethods newAccessMethods, NotificationChain msgs) {
		AccessMethods oldAccessMethods = accessMethods;
		accessMethods = newAccessMethods;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setAccessMethods(AccessMethods newAccessMethods) {
		if (newAccessMethods != accessMethods) {
			NotificationChain msgs = null;
			if (accessMethods != null)
				msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__ACCESS_METHODS, null, msgs);
			if (newAccessMethods != null)
				msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__ACCESS_METHODS, null, msgs);
			msgs = basicSetAccessMethods(newAccessMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__ACCESS_METHODS, newAccessMethods, newAccessMethods));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmptyType getNoncacheable() {
		return noncacheable;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetNoncacheable(EmptyType newNoncacheable, NotificationChain msgs) {
		EmptyType oldNoncacheable = noncacheable;
		noncacheable = newNoncacheable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__NONCACHEABLE, oldNoncacheable, newNoncacheable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setNoncacheable(EmptyType newNoncacheable) {
		if (newNoncacheable != noncacheable) {
			NotificationChain msgs = null;
			if (noncacheable != null)
				msgs = ((InternalEObject)noncacheable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__NONCACHEABLE, null, msgs);
			if (newNoncacheable != null)
				msgs = ((InternalEObject)newNoncacheable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__NONCACHEABLE, null, msgs);
			msgs = basicSetNoncacheable(newNoncacheable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__NONCACHEABLE, newNoncacheable, newNoncacheable));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Partitioning getPartitioning() {
		return partitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPartitioning(Partitioning newPartitioning, NotificationChain msgs) {
		Partitioning oldPartitioning = partitioning;
		partitioning = newPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__PARTITIONING, oldPartitioning, newPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPartitioning(Partitioning newPartitioning) {
		if (newPartitioning != partitioning) {
			NotificationChain msgs = null;
			if (partitioning != null)
				msgs = ((InternalEObject)partitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__PARTITIONING, null, msgs);
			if (newPartitioning != null)
				msgs = ((InternalEObject)newPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__PARTITIONING, null, msgs);
			msgs = basicSetPartitioning(newPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__PARTITIONING, newPartitioning, newPartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ReplicationPartitioning getReplicationPartitioning() {
		return replicationPartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning,
      NotificationChain msgs) {
		ReplicationPartitioning oldReplicationPartitioning = replicationPartitioning;
		replicationPartitioning = newReplicationPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING, oldReplicationPartitioning, newReplicationPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setReplicationPartitioning(ReplicationPartitioning newReplicationPartitioning) {
		if (newReplicationPartitioning != replicationPartitioning) {
			NotificationChain msgs = null;
			if (replicationPartitioning != null)
				msgs = ((InternalEObject)replicationPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING, null, msgs);
			if (newReplicationPartitioning != null)
				msgs = ((InternalEObject)newReplicationPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING, null, msgs);
			msgs = basicSetReplicationPartitioning(newReplicationPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING, newReplicationPartitioning, newReplicationPartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public RoundRobinPartitioning getRoundRobinPartitioning() {
		return roundRobinPartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning,
      NotificationChain msgs) {
		RoundRobinPartitioning oldRoundRobinPartitioning = roundRobinPartitioning;
		roundRobinPartitioning = newRoundRobinPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING, oldRoundRobinPartitioning, newRoundRobinPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setRoundRobinPartitioning(RoundRobinPartitioning newRoundRobinPartitioning) {
		if (newRoundRobinPartitioning != roundRobinPartitioning) {
			NotificationChain msgs = null;
			if (roundRobinPartitioning != null)
				msgs = ((InternalEObject)roundRobinPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING, null, msgs);
			if (newRoundRobinPartitioning != null)
				msgs = ((InternalEObject)newRoundRobinPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING, null, msgs);
			msgs = basicSetRoundRobinPartitioning(newRoundRobinPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING, newRoundRobinPartitioning, newRoundRobinPartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public PinnedPartitioning getPinnedPartitioning() {
		return pinnedPartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPinnedPartitioning(PinnedPartitioning newPinnedPartitioning, NotificationChain msgs) {
		PinnedPartitioning oldPinnedPartitioning = pinnedPartitioning;
		pinnedPartitioning = newPinnedPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING, oldPinnedPartitioning, newPinnedPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPinnedPartitioning(PinnedPartitioning newPinnedPartitioning) {
		if (newPinnedPartitioning != pinnedPartitioning) {
			NotificationChain msgs = null;
			if (pinnedPartitioning != null)
				msgs = ((InternalEObject)pinnedPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING, null, msgs);
			if (newPinnedPartitioning != null)
				msgs = ((InternalEObject)newPinnedPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING, null, msgs);
			msgs = basicSetPinnedPartitioning(newPinnedPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING, newPinnedPartitioning, newPinnedPartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public RangePartitioning getRangePartitioning() {
		return rangePartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRangePartitioning(RangePartitioning newRangePartitioning, NotificationChain msgs) {
		RangePartitioning oldRangePartitioning = rangePartitioning;
		rangePartitioning = newRangePartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING, oldRangePartitioning, newRangePartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setRangePartitioning(RangePartitioning newRangePartitioning) {
		if (newRangePartitioning != rangePartitioning) {
			NotificationChain msgs = null;
			if (rangePartitioning != null)
				msgs = ((InternalEObject)rangePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING, null, msgs);
			if (newRangePartitioning != null)
				msgs = ((InternalEObject)newRangePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING, null, msgs);
			msgs = basicSetRangePartitioning(newRangePartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING, newRangePartitioning, newRangePartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ValuePartitioning getValuePartitioning() {
		return valuePartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValuePartitioning(ValuePartitioning newValuePartitioning, NotificationChain msgs) {
		ValuePartitioning oldValuePartitioning = valuePartitioning;
		valuePartitioning = newValuePartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING, oldValuePartitioning, newValuePartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setValuePartitioning(ValuePartitioning newValuePartitioning) {
		if (newValuePartitioning != valuePartitioning) {
			NotificationChain msgs = null;
			if (valuePartitioning != null)
				msgs = ((InternalEObject)valuePartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING, null, msgs);
			if (newValuePartitioning != null)
				msgs = ((InternalEObject)newValuePartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING, null, msgs);
			msgs = basicSetValuePartitioning(newValuePartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING, newValuePartitioning, newValuePartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public HashPartitioning getHashPartitioning() {
		return hashPartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetHashPartitioning(HashPartitioning newHashPartitioning, NotificationChain msgs) {
		HashPartitioning oldHashPartitioning = hashPartitioning;
		hashPartitioning = newHashPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__HASH_PARTITIONING, oldHashPartitioning, newHashPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setHashPartitioning(HashPartitioning newHashPartitioning) {
		if (newHashPartitioning != hashPartitioning) {
			NotificationChain msgs = null;
			if (hashPartitioning != null)
				msgs = ((InternalEObject)hashPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__HASH_PARTITIONING, null, msgs);
			if (newHashPartitioning != null)
				msgs = ((InternalEObject)newHashPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__HASH_PARTITIONING, null, msgs);
			msgs = basicSetHashPartitioning(newHashPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__HASH_PARTITIONING, newHashPartitioning, newHashPartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public UnionPartitioning getUnionPartitioning() {
		return unionPartitioning;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetUnionPartitioning(UnionPartitioning newUnionPartitioning, NotificationChain msgs) {
		UnionPartitioning oldUnionPartitioning = unionPartitioning;
		unionPartitioning = newUnionPartitioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__UNION_PARTITIONING, oldUnionPartitioning, newUnionPartitioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setUnionPartitioning(UnionPartitioning newUnionPartitioning) {
		if (newUnionPartitioning != unionPartitioning) {
			NotificationChain msgs = null;
			if (unionPartitioning != null)
				msgs = ((InternalEObject)unionPartitioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__UNION_PARTITIONING, null, msgs);
			if (newUnionPartitioning != null)
				msgs = ((InternalEObject)newUnionPartitioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.MANY_TO_ONE__UNION_PARTITIONING, null, msgs);
			msgs = basicSetUnionPartitioning(newUnionPartitioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__UNION_PARTITIONING, newUnionPartitioning, newUnionPartitioning));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getPartitioned() {
		return partitioned;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPartitioned(String newPartitioned) {
		String oldPartitioned = partitioned;
		partitioned = newPartitioned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__PARTITIONED, oldPartitioned, partitioned));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__ACCESS, oldAccess, access, !oldAccessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_ONE__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
  public FetchType getFetch() {
		return fetch;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setFetch(FetchType newFetch) {
		FetchType oldFetch = fetch;
		fetch = newFetch == null ? FETCH_EDEFAULT : newFetch;
		boolean oldFetchESet = fetchESet;
		fetchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__FETCH, oldFetch, fetch, !oldFetchESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetFetch() {
		FetchType oldFetch = fetch;
		boolean oldFetchESet = fetchESet;
		fetch = FETCH_EDEFAULT;
		fetchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_ONE__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetFetch() {
		return fetchESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isId() {
		return id;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setId(boolean newId) {
		boolean oldId = id;
		id = newId;
		boolean oldIdESet = idESet;
		idESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__ID, oldId, id, !oldIdESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetId() {
		boolean oldId = id;
		boolean oldIdESet = idESet;
		id = ID_EDEFAULT;
		idESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_ONE__ID, oldId, ID_EDEFAULT, oldIdESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetId() {
		return idESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getMapsId() {
		return mapsId;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapsId(String newMapsId) {
		String oldMapsId = mapsId;
		mapsId = newMapsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__MAPS_ID, oldMapsId, mapsId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isOptional() {
		return optional;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.MANY_TO_ONE__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetOptional() {
		return optionalESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getTargetEntity() {
		return targetEntity;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setTargetEntity(String newTargetEntity) {
		String oldTargetEntity = targetEntity;
		targetEntity = newTargetEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.MANY_TO_ONE__TARGET_ENTITY, oldTargetEntity, targetEntity));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.MANY_TO_ONE__JOIN_COLUMN:
				return ((InternalEList<?>)getJoinColumn()).basicRemove(otherEnd, msgs);
			case OrmPackage.MANY_TO_ONE__JOIN_TABLE:
				return basicSetJoinTable(null, msgs);
			case OrmPackage.MANY_TO_ONE__CASCADE:
				return basicSetCascade(null, msgs);
			case OrmPackage.MANY_TO_ONE__BATCH_FETCH:
				return basicSetBatchFetch(null, msgs);
			case OrmPackage.MANY_TO_ONE__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case OrmPackage.MANY_TO_ONE__ACCESS_METHODS:
				return basicSetAccessMethods(null, msgs);
			case OrmPackage.MANY_TO_ONE__NONCACHEABLE:
				return basicSetNoncacheable(null, msgs);
			case OrmPackage.MANY_TO_ONE__PARTITIONING:
				return basicSetPartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING:
				return basicSetReplicationPartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING:
				return basicSetRoundRobinPartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING:
				return basicSetPinnedPartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING:
				return basicSetRangePartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING:
				return basicSetValuePartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__HASH_PARTITIONING:
				return basicSetHashPartitioning(null, msgs);
			case OrmPackage.MANY_TO_ONE__UNION_PARTITIONING:
				return basicSetUnionPartitioning(null, msgs);
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
			case OrmPackage.MANY_TO_ONE__JOIN_COLUMN:
				return getJoinColumn();
			case OrmPackage.MANY_TO_ONE__JOIN_TABLE:
				return getJoinTable();
			case OrmPackage.MANY_TO_ONE__CASCADE:
				return getCascade();
			case OrmPackage.MANY_TO_ONE__JOIN_FETCH:
				return getJoinFetch();
			case OrmPackage.MANY_TO_ONE__BATCH_FETCH:
				return getBatchFetch();
			case OrmPackage.MANY_TO_ONE__PROPERTY:
				return getProperty();
			case OrmPackage.MANY_TO_ONE__ACCESS_METHODS:
				return getAccessMethods();
			case OrmPackage.MANY_TO_ONE__NONCACHEABLE:
				return getNoncacheable();
			case OrmPackage.MANY_TO_ONE__PARTITIONING:
				return getPartitioning();
			case OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING:
				return getReplicationPartitioning();
			case OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING:
				return getRoundRobinPartitioning();
			case OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING:
				return getPinnedPartitioning();
			case OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING:
				return getRangePartitioning();
			case OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING:
				return getValuePartitioning();
			case OrmPackage.MANY_TO_ONE__HASH_PARTITIONING:
				return getHashPartitioning();
			case OrmPackage.MANY_TO_ONE__UNION_PARTITIONING:
				return getUnionPartitioning();
			case OrmPackage.MANY_TO_ONE__PARTITIONED:
				return getPartitioned();
			case OrmPackage.MANY_TO_ONE__ACCESS:
				return getAccess();
			case OrmPackage.MANY_TO_ONE__FETCH:
				return getFetch();
			case OrmPackage.MANY_TO_ONE__ID:
				return isId();
			case OrmPackage.MANY_TO_ONE__MAPS_ID:
				return getMapsId();
			case OrmPackage.MANY_TO_ONE__NAME:
				return getName();
			case OrmPackage.MANY_TO_ONE__OPTIONAL:
				return isOptional();
			case OrmPackage.MANY_TO_ONE__TARGET_ENTITY:
				return getTargetEntity();
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
			case OrmPackage.MANY_TO_ONE__JOIN_COLUMN:
				getJoinColumn().clear();
				getJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__JOIN_TABLE:
				setJoinTable((JoinTable)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__CASCADE:
				setCascade((CascadeType)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__JOIN_FETCH:
				setJoinFetch((JoinFetchType)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__BATCH_FETCH:
				setBatchFetch((BatchFetch)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__ACCESS_METHODS:
				setAccessMethods((AccessMethods)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__NONCACHEABLE:
				setNoncacheable((EmptyType)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__PARTITIONING:
				setPartitioning((Partitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING:
				setReplicationPartitioning((ReplicationPartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING:
				setRoundRobinPartitioning((RoundRobinPartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING:
				setPinnedPartitioning((PinnedPartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING:
				setRangePartitioning((RangePartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING:
				setValuePartitioning((ValuePartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__HASH_PARTITIONING:
				setHashPartitioning((HashPartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__UNION_PARTITIONING:
				setUnionPartitioning((UnionPartitioning)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__PARTITIONED:
				setPartitioned((String)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__FETCH:
				setFetch((FetchType)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__ID:
				setId((Boolean)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__MAPS_ID:
				setMapsId((String)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case OrmPackage.MANY_TO_ONE__TARGET_ENTITY:
				setTargetEntity((String)newValue);
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
			case OrmPackage.MANY_TO_ONE__JOIN_COLUMN:
				getJoinColumn().clear();
				return;
			case OrmPackage.MANY_TO_ONE__JOIN_TABLE:
				setJoinTable((JoinTable)null);
				return;
			case OrmPackage.MANY_TO_ONE__CASCADE:
				setCascade((CascadeType)null);
				return;
			case OrmPackage.MANY_TO_ONE__JOIN_FETCH:
				unsetJoinFetch();
				return;
			case OrmPackage.MANY_TO_ONE__BATCH_FETCH:
				setBatchFetch((BatchFetch)null);
				return;
			case OrmPackage.MANY_TO_ONE__PROPERTY:
				getProperty().clear();
				return;
			case OrmPackage.MANY_TO_ONE__ACCESS_METHODS:
				setAccessMethods((AccessMethods)null);
				return;
			case OrmPackage.MANY_TO_ONE__NONCACHEABLE:
				setNoncacheable((EmptyType)null);
				return;
			case OrmPackage.MANY_TO_ONE__PARTITIONING:
				setPartitioning((Partitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING:
				setReplicationPartitioning((ReplicationPartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING:
				setRoundRobinPartitioning((RoundRobinPartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING:
				setPinnedPartitioning((PinnedPartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING:
				setRangePartitioning((RangePartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING:
				setValuePartitioning((ValuePartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__HASH_PARTITIONING:
				setHashPartitioning((HashPartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__UNION_PARTITIONING:
				setUnionPartitioning((UnionPartitioning)null);
				return;
			case OrmPackage.MANY_TO_ONE__PARTITIONED:
				setPartitioned(PARTITIONED_EDEFAULT);
				return;
			case OrmPackage.MANY_TO_ONE__ACCESS:
				unsetAccess();
				return;
			case OrmPackage.MANY_TO_ONE__FETCH:
				unsetFetch();
				return;
			case OrmPackage.MANY_TO_ONE__ID:
				unsetId();
				return;
			case OrmPackage.MANY_TO_ONE__MAPS_ID:
				setMapsId(MAPS_ID_EDEFAULT);
				return;
			case OrmPackage.MANY_TO_ONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrmPackage.MANY_TO_ONE__OPTIONAL:
				unsetOptional();
				return;
			case OrmPackage.MANY_TO_ONE__TARGET_ENTITY:
				setTargetEntity(TARGET_ENTITY_EDEFAULT);
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
			case OrmPackage.MANY_TO_ONE__JOIN_COLUMN:
				return joinColumn != null && !joinColumn.isEmpty();
			case OrmPackage.MANY_TO_ONE__JOIN_TABLE:
				return joinTable != null;
			case OrmPackage.MANY_TO_ONE__CASCADE:
				return cascade != null;
			case OrmPackage.MANY_TO_ONE__JOIN_FETCH:
				return isSetJoinFetch();
			case OrmPackage.MANY_TO_ONE__BATCH_FETCH:
				return batchFetch != null;
			case OrmPackage.MANY_TO_ONE__PROPERTY:
				return property != null && !property.isEmpty();
			case OrmPackage.MANY_TO_ONE__ACCESS_METHODS:
				return accessMethods != null;
			case OrmPackage.MANY_TO_ONE__NONCACHEABLE:
				return noncacheable != null;
			case OrmPackage.MANY_TO_ONE__PARTITIONING:
				return partitioning != null;
			case OrmPackage.MANY_TO_ONE__REPLICATION_PARTITIONING:
				return replicationPartitioning != null;
			case OrmPackage.MANY_TO_ONE__ROUND_ROBIN_PARTITIONING:
				return roundRobinPartitioning != null;
			case OrmPackage.MANY_TO_ONE__PINNED_PARTITIONING:
				return pinnedPartitioning != null;
			case OrmPackage.MANY_TO_ONE__RANGE_PARTITIONING:
				return rangePartitioning != null;
			case OrmPackage.MANY_TO_ONE__VALUE_PARTITIONING:
				return valuePartitioning != null;
			case OrmPackage.MANY_TO_ONE__HASH_PARTITIONING:
				return hashPartitioning != null;
			case OrmPackage.MANY_TO_ONE__UNION_PARTITIONING:
				return unionPartitioning != null;
			case OrmPackage.MANY_TO_ONE__PARTITIONED:
				return PARTITIONED_EDEFAULT == null ? partitioned != null : !PARTITIONED_EDEFAULT.equals(partitioned);
			case OrmPackage.MANY_TO_ONE__ACCESS:
				return isSetAccess();
			case OrmPackage.MANY_TO_ONE__FETCH:
				return isSetFetch();
			case OrmPackage.MANY_TO_ONE__ID:
				return isSetId();
			case OrmPackage.MANY_TO_ONE__MAPS_ID:
				return MAPS_ID_EDEFAULT == null ? mapsId != null : !MAPS_ID_EDEFAULT.equals(mapsId);
			case OrmPackage.MANY_TO_ONE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrmPackage.MANY_TO_ONE__OPTIONAL:
				return isSetOptional();
			case OrmPackage.MANY_TO_ONE__TARGET_ENTITY:
				return TARGET_ENTITY_EDEFAULT == null ? targetEntity != null : !TARGET_ENTITY_EDEFAULT.equals(targetEntity);
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
		result.append(" (joinFetch: ");
		if (joinFetchESet) result.append(joinFetch); else result.append("<unset>");
		result.append(", partitioned: ");
		result.append(partitioned);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", id: ");
		if (idESet) result.append(id); else result.append("<unset>");
		result.append(", mapsId: ");
		result.append(mapsId);
		result.append(", name: ");
		result.append(name);
		result.append(", optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(", targetEntity: ");
		result.append(targetEntity);
		result.append(')');
		return result.toString();
	}

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getManyToOne_Cascade());
    features.add(OrmPackage.eINSTANCE.getManyToOne_Fetch());
    features.add(OrmPackage.eINSTANCE.getManyToOne_Optional());
    features.add(OrmPackage.eINSTANCE.getManyToOne_TargetEntity());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }

} // ManyToOneImpl
