/**
 * <copyright>
 * </copyright>
 *
 * $Id: OneToManyImpl.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.AssociationOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.AttributeOverride;
import org.eclipse.emf.texo.orm.annotations.model.orm.CascadeType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.EmptyType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated;
import org.eclipse.emf.texo.orm.annotations.model.orm.FetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinFetchType;
import org.eclipse.emf.texo.orm.annotations.model.orm.JoinTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKey;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyClass;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.MapKeyJoinColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.Temporal;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>One To Many</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getOrderBy <em>Order By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getOrderColumn <em>Order Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKey <em>Map Key</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyClass <em>Map Key Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyTemporal <em>Map Key Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyEnumerated <em>Map Key Enumerated</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyConvert <em>Map Key Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyAttributeOverride <em>Map Key Attribute Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyAssociationOverride <em>Map Key Association Override</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyColumn <em>Map Key Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMapKeyJoinColumn <em>Map Key Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getJoinTable <em>Join Table</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getJoinColumn <em>Join Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getCascade <em>Cascade</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getPrivateOwned <em>Private Owned</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getJoinFetch <em>Join Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getFetch <em>Fetch</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getMappedBy <em>Mapped By</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#isOrphanRemoval <em>Orphan Removal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.OneToManyImpl#getTargetEntity <em>Target Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OneToManyImpl extends BaseOrmAnnotationImpl implements OneToMany {
  /**
	 * The default value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
  protected static final String ORDER_BY_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getOrderBy()
	 * @generated
	 * @ordered
	 */
  protected String orderBy = ORDER_BY_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrderColumn() <em>Order Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getOrderColumn()
   * @generated
   * @ordered
   */
  protected OrderColumn orderColumn;

  /**
	 * The cached value of the '{@link #getMapKey() <em>Map Key</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getMapKey()
	 * @generated
	 * @ordered
	 */
  protected MapKey mapKey;

  /**
   * The cached value of the '{@link #getMapKeyClass() <em>Map Key Class</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyClass()
   * @generated
   * @ordered
   */
  protected MapKeyClass mapKeyClass;

  /**
	 * The default value of the '{@link #getMapKeyTemporal() <em>Map Key Temporal</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getMapKeyTemporal()
	 * @generated
	 * @ordered
	 */
  protected static final Temporal MAP_KEY_TEMPORAL_EDEFAULT = Temporal.DATE;

  /**
	 * The cached value of the '{@link #getMapKeyTemporal() <em>Map Key Temporal</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapKeyTemporal()
	 * @generated
	 * @ordered
	 */
  protected Temporal mapKeyTemporal = MAP_KEY_TEMPORAL_EDEFAULT;

  /**
	 * This is true if the Map Key Temporal attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean mapKeyTemporalESet;

  /**
   * The default value of the '{@link #getMapKeyEnumerated() <em>Map Key Enumerated</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyEnumerated()
   * @generated
   * @ordered
   */
  protected static final Enumerated MAP_KEY_ENUMERATED_EDEFAULT = Enumerated.ORDINAL;

  /**
	 * The cached value of the '{@link #getMapKeyEnumerated() <em>Map Key Enumerated</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getMapKeyEnumerated()
	 * @generated
	 * @ordered
	 */
  protected Enumerated mapKeyEnumerated = MAP_KEY_ENUMERATED_EDEFAULT;

  /**
	 * This is true if the Map Key Enumerated attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean mapKeyEnumeratedESet;

  /**
	 * The default value of the '{@link #getMapKeyConvert() <em>Map Key Convert</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapKeyConvert()
	 * @generated
	 * @ordered
	 */
  protected static final String MAP_KEY_CONVERT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMapKeyConvert() <em>Map Key Convert</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapKeyConvert()
	 * @generated
	 * @ordered
	 */
  protected String mapKeyConvert = MAP_KEY_CONVERT_EDEFAULT;

  /**
	 * The cached value of the '{@link #getMapKeyAttributeOverride() <em>Map Key Attribute Override</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMapKeyAttributeOverride()
	 * @generated
	 * @ordered
	 */
  protected EList<AttributeOverride> mapKeyAttributeOverride;

  /**
	 * The cached value of the '{@link #getMapKeyAssociationOverride() <em>Map Key Association Override</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMapKeyAssociationOverride()
	 * @generated
	 * @ordered
	 */
  protected EList<AssociationOverride> mapKeyAssociationOverride;

  /**
   * The cached value of the '{@link #getMapKeyColumn() <em>Map Key Column</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getMapKeyColumn()
   * @generated
   * @ordered
   */
  protected MapKeyColumn mapKeyColumn;

  /**
	 * The cached value of the '{@link #getMapKeyJoinColumn() <em>Map Key Join Column</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMapKeyJoinColumn()
	 * @generated
	 * @ordered
	 */
  protected EList<MapKeyJoinColumn> mapKeyJoinColumn;

  /**
	 * The cached value of the '{@link #getConverter() <em>Converter</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getConverter()
	 * @generated
	 * @ordered
	 */
  protected Converter converter;

  /**
   * The cached value of the '{@link #getTypeConverter() <em>Type Converter</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getTypeConverter()
   * @generated
   * @ordered
   */
  protected TypeConverter typeConverter;

  /**
	 * The cached value of the '{@link #getObjectTypeConverter() <em>Object Type Converter</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getObjectTypeConverter()
	 * @generated
	 * @ordered
	 */
  protected ObjectTypeConverter objectTypeConverter;

  /**
   * The cached value of the '{@link #getStructConverter() <em>Struct Converter</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getStructConverter()
   * @generated
   * @ordered
   */
  protected StructConverter structConverter;

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
   * The cached value of the '{@link #getJoinColumn() <em>Join Column</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getJoinColumn()
   * @generated
   * @ordered
   */
  protected EList<JoinColumn> joinColumn;

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
   * The cached value of the '{@link #getPrivateOwned() <em>Private Owned</em>}' containment reference. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getPrivateOwned()
   * @generated
   * @ordered
   */
  protected EmptyType privateOwned;

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
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
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
	 * The default value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getMappedBy()
	 * @generated
	 * @ordered
	 */
  protected static final String MAPPED_BY_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getMappedBy() <em>Mapped By</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getMappedBy()
	 * @generated
	 * @ordered
	 */
  protected String mappedBy = MAPPED_BY_EDEFAULT;

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
	 * The default value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isOrphanRemoval()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ORPHAN_REMOVAL_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isOrphanRemoval() <em>Orphan Removal</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isOrphanRemoval()
	 * @generated
	 * @ordered
	 */
  protected boolean orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;

  /**
	 * This is true if the Orphan Removal attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean orphanRemovalESet;

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
  protected OneToManyImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getOneToMany();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getOrderBy() {
		return orderBy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrderBy(String newOrderBy) {
		String oldOrderBy = orderBy;
		orderBy = newOrderBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ORDER_BY, oldOrderBy, orderBy));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public OrderColumn getOrderColumn() {
		return orderColumn;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetOrderColumn(OrderColumn newOrderColumn, NotificationChain msgs) {
		OrderColumn oldOrderColumn = orderColumn;
		orderColumn = newOrderColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ORDER_COLUMN, oldOrderColumn, newOrderColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrderColumn(OrderColumn newOrderColumn) {
		if (newOrderColumn != orderColumn) {
			NotificationChain msgs = null;
			if (orderColumn != null)
				msgs = ((InternalEObject)orderColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__ORDER_COLUMN, null, msgs);
			if (newOrderColumn != null)
				msgs = ((InternalEObject)newOrderColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__ORDER_COLUMN, null, msgs);
			msgs = basicSetOrderColumn(newOrderColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ORDER_COLUMN, newOrderColumn, newOrderColumn));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public MapKey getMapKey() {
		return mapKey;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMapKey(MapKey newMapKey, NotificationChain msgs) {
		MapKey oldMapKey = mapKey;
		mapKey = newMapKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY, oldMapKey, newMapKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapKey(MapKey newMapKey) {
		if (newMapKey != mapKey) {
			NotificationChain msgs = null;
			if (mapKey != null)
				msgs = ((InternalEObject)mapKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__MAP_KEY, null, msgs);
			if (newMapKey != null)
				msgs = ((InternalEObject)newMapKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__MAP_KEY, null, msgs);
			msgs = basicSetMapKey(newMapKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY, newMapKey, newMapKey));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public MapKeyClass getMapKeyClass() {
		return mapKeyClass;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMapKeyClass(MapKeyClass newMapKeyClass, NotificationChain msgs) {
		MapKeyClass oldMapKeyClass = mapKeyClass;
		mapKeyClass = newMapKeyClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS, oldMapKeyClass, newMapKeyClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapKeyClass(MapKeyClass newMapKeyClass) {
		if (newMapKeyClass != mapKeyClass) {
			NotificationChain msgs = null;
			if (mapKeyClass != null)
				msgs = ((InternalEObject)mapKeyClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS, null, msgs);
			if (newMapKeyClass != null)
				msgs = ((InternalEObject)newMapKeyClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS, null, msgs);
			msgs = basicSetMapKeyClass(newMapKeyClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS, newMapKeyClass, newMapKeyClass));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Temporal getMapKeyTemporal() {
		return mapKeyTemporal;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapKeyTemporal(Temporal newMapKeyTemporal) {
		Temporal oldMapKeyTemporal = mapKeyTemporal;
		mapKeyTemporal = newMapKeyTemporal == null ? MAP_KEY_TEMPORAL_EDEFAULT : newMapKeyTemporal;
		boolean oldMapKeyTemporalESet = mapKeyTemporalESet;
		mapKeyTemporalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL, oldMapKeyTemporal, mapKeyTemporal, !oldMapKeyTemporalESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetMapKeyTemporal() {
		Temporal oldMapKeyTemporal = mapKeyTemporal;
		boolean oldMapKeyTemporalESet = mapKeyTemporalESet;
		mapKeyTemporal = MAP_KEY_TEMPORAL_EDEFAULT;
		mapKeyTemporalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL, oldMapKeyTemporal, MAP_KEY_TEMPORAL_EDEFAULT, oldMapKeyTemporalESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetMapKeyTemporal() {
		return mapKeyTemporalESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Enumerated getMapKeyEnumerated() {
		return mapKeyEnumerated;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapKeyEnumerated(Enumerated newMapKeyEnumerated) {
		Enumerated oldMapKeyEnumerated = mapKeyEnumerated;
		mapKeyEnumerated = newMapKeyEnumerated == null ? MAP_KEY_ENUMERATED_EDEFAULT : newMapKeyEnumerated;
		boolean oldMapKeyEnumeratedESet = mapKeyEnumeratedESet;
		mapKeyEnumeratedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED, oldMapKeyEnumerated, mapKeyEnumerated, !oldMapKeyEnumeratedESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetMapKeyEnumerated() {
		Enumerated oldMapKeyEnumerated = mapKeyEnumerated;
		boolean oldMapKeyEnumeratedESet = mapKeyEnumeratedESet;
		mapKeyEnumerated = MAP_KEY_ENUMERATED_EDEFAULT;
		mapKeyEnumeratedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED, oldMapKeyEnumerated, MAP_KEY_ENUMERATED_EDEFAULT, oldMapKeyEnumeratedESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetMapKeyEnumerated() {
		return mapKeyEnumeratedESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getMapKeyConvert() {
		return mapKeyConvert;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapKeyConvert(String newMapKeyConvert) {
		String oldMapKeyConvert = mapKeyConvert;
		mapKeyConvert = newMapKeyConvert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_CONVERT, oldMapKeyConvert, mapKeyConvert));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AttributeOverride> getMapKeyAttributeOverride() {
		if (mapKeyAttributeOverride == null) {
			mapKeyAttributeOverride = new EObjectContainmentEList<AttributeOverride>(AttributeOverride.class, this, OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE);
		}
		return mapKeyAttributeOverride;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AssociationOverride> getMapKeyAssociationOverride() {
		if (mapKeyAssociationOverride == null) {
			mapKeyAssociationOverride = new EObjectContainmentEList<AssociationOverride>(AssociationOverride.class, this, OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE);
		}
		return mapKeyAssociationOverride;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public MapKeyColumn getMapKeyColumn() {
		return mapKeyColumn;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMapKeyColumn(MapKeyColumn newMapKeyColumn, NotificationChain msgs) {
		MapKeyColumn oldMapKeyColumn = mapKeyColumn;
		mapKeyColumn = newMapKeyColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN, oldMapKeyColumn, newMapKeyColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapKeyColumn(MapKeyColumn newMapKeyColumn) {
		if (newMapKeyColumn != mapKeyColumn) {
			NotificationChain msgs = null;
			if (mapKeyColumn != null)
				msgs = ((InternalEObject)mapKeyColumn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN, null, msgs);
			if (newMapKeyColumn != null)
				msgs = ((InternalEObject)newMapKeyColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN, null, msgs);
			msgs = basicSetMapKeyColumn(newMapKeyColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN, newMapKeyColumn, newMapKeyColumn));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MapKeyJoinColumn> getMapKeyJoinColumn() {
		if (mapKeyJoinColumn == null) {
			mapKeyJoinColumn = new EObjectContainmentEList<MapKeyJoinColumn>(MapKeyJoinColumn.class, this, OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN);
		}
		return mapKeyJoinColumn;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Converter getConverter() {
		return converter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetConverter(Converter newConverter, NotificationChain msgs) {
		Converter oldConverter = converter;
		converter = newConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__CONVERTER, oldConverter, newConverter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setConverter(Converter newConverter) {
		if (newConverter != converter) {
			NotificationChain msgs = null;
			if (converter != null)
				msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__CONVERTER, null, msgs);
			if (newConverter != null)
				msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__CONVERTER, null, msgs);
			msgs = basicSetConverter(newConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__CONVERTER, newConverter, newConverter));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public TypeConverter getTypeConverter() {
		return typeConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypeConverter(TypeConverter newTypeConverter, NotificationChain msgs) {
		TypeConverter oldTypeConverter = typeConverter;
		typeConverter = newTypeConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__TYPE_CONVERTER, oldTypeConverter, newTypeConverter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeConverter(TypeConverter newTypeConverter) {
		if (newTypeConverter != typeConverter) {
			NotificationChain msgs = null;
			if (typeConverter != null)
				msgs = ((InternalEObject)typeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__TYPE_CONVERTER, null, msgs);
			if (newTypeConverter != null)
				msgs = ((InternalEObject)newTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__TYPE_CONVERTER, null, msgs);
			msgs = basicSetTypeConverter(newTypeConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__TYPE_CONVERTER, newTypeConverter, newTypeConverter));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public ObjectTypeConverter getObjectTypeConverter() {
		return objectTypeConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetObjectTypeConverter(ObjectTypeConverter newObjectTypeConverter,
      NotificationChain msgs) {
		ObjectTypeConverter oldObjectTypeConverter = objectTypeConverter;
		objectTypeConverter = newObjectTypeConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER, oldObjectTypeConverter, newObjectTypeConverter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setObjectTypeConverter(ObjectTypeConverter newObjectTypeConverter) {
		if (newObjectTypeConverter != objectTypeConverter) {
			NotificationChain msgs = null;
			if (objectTypeConverter != null)
				msgs = ((InternalEObject)objectTypeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER, null, msgs);
			if (newObjectTypeConverter != null)
				msgs = ((InternalEObject)newObjectTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER, null, msgs);
			msgs = basicSetObjectTypeConverter(newObjectTypeConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER, newObjectTypeConverter, newObjectTypeConverter));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public StructConverter getStructConverter() {
		return structConverter;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetStructConverter(StructConverter newStructConverter, NotificationChain msgs) {
		StructConverter oldStructConverter = structConverter;
		structConverter = newStructConverter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER, oldStructConverter, newStructConverter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setStructConverter(StructConverter newStructConverter) {
		if (newStructConverter != structConverter) {
			NotificationChain msgs = null;
			if (structConverter != null)
				msgs = ((InternalEObject)structConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER, null, msgs);
			if (newStructConverter != null)
				msgs = ((InternalEObject)newStructConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER, null, msgs);
			msgs = basicSetStructConverter(newStructConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER, newStructConverter, newStructConverter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__JOIN_TABLE, oldJoinTable, newJoinTable);
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
				msgs = ((InternalEObject)joinTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__JOIN_TABLE, null, msgs);
			if (newJoinTable != null)
				msgs = ((InternalEObject)newJoinTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__JOIN_TABLE, null, msgs);
			msgs = basicSetJoinTable(newJoinTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__JOIN_TABLE, newJoinTable, newJoinTable));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<JoinColumn> getJoinColumn() {
		if (joinColumn == null) {
			joinColumn = new EObjectContainmentEList<JoinColumn>(JoinColumn.class, this, OrmPackage.ONE_TO_MANY__JOIN_COLUMN);
		}
		return joinColumn;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__CASCADE, oldCascade, newCascade);
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
				msgs = ((InternalEObject)cascade).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__CASCADE, null, msgs);
			if (newCascade != null)
				msgs = ((InternalEObject)newCascade).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__CASCADE, null, msgs);
			msgs = basicSetCascade(newCascade, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__CASCADE, newCascade, newCascade));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EmptyType getPrivateOwned() {
		return privateOwned;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPrivateOwned(EmptyType newPrivateOwned, NotificationChain msgs) {
		EmptyType oldPrivateOwned = privateOwned;
		privateOwned = newPrivateOwned;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__PRIVATE_OWNED, oldPrivateOwned, newPrivateOwned);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setPrivateOwned(EmptyType newPrivateOwned) {
		if (newPrivateOwned != privateOwned) {
			NotificationChain msgs = null;
			if (privateOwned != null)
				msgs = ((InternalEObject)privateOwned).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__PRIVATE_OWNED, null, msgs);
			if (newPrivateOwned != null)
				msgs = ((InternalEObject)newPrivateOwned).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__PRIVATE_OWNED, null, msgs);
			msgs = basicSetPrivateOwned(newPrivateOwned, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__PRIVATE_OWNED, newPrivateOwned, newPrivateOwned));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__JOIN_FETCH, oldJoinFetch, joinFetch, !oldJoinFetchESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_MANY__JOIN_FETCH, oldJoinFetch, JOIN_FETCH_EDEFAULT, oldJoinFetchESet));
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
  public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.ONE_TO_MANY__PROPERTY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
				msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__ACCESS_METHODS, null, msgs);
			if (newAccessMethods != null)
				msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.ONE_TO_MANY__ACCESS_METHODS, null, msgs);
			msgs = basicSetAccessMethods(newAccessMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ACCESS_METHODS, newAccessMethods, newAccessMethods));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ACCESS, oldAccess, access, !oldAccessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_MANY__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__FETCH, oldFetch, fetch, !oldFetchESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_MANY__FETCH, oldFetch, FETCH_EDEFAULT, oldFetchESet));
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
  public String getMappedBy() {
		return mappedBy;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMappedBy(String newMappedBy) {
		String oldMappedBy = mappedBy;
		mappedBy = newMappedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__MAPPED_BY, oldMappedBy, mappedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isOrphanRemoval() {
		return orphanRemoval;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setOrphanRemoval(boolean newOrphanRemoval) {
		boolean oldOrphanRemoval = orphanRemoval;
		orphanRemoval = newOrphanRemoval;
		boolean oldOrphanRemovalESet = orphanRemovalESet;
		orphanRemovalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL, oldOrphanRemoval, orphanRemoval, !oldOrphanRemovalESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetOrphanRemoval() {
		boolean oldOrphanRemoval = orphanRemoval;
		boolean oldOrphanRemovalESet = orphanRemovalESet;
		orphanRemoval = ORPHAN_REMOVAL_EDEFAULT;
		orphanRemovalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL, oldOrphanRemoval, ORPHAN_REMOVAL_EDEFAULT, oldOrphanRemovalESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetOrphanRemoval() {
		return orphanRemovalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.ONE_TO_MANY__TARGET_ENTITY, oldTargetEntity, targetEntity));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.ONE_TO_MANY__ORDER_COLUMN:
				return basicSetOrderColumn(null, msgs);
			case OrmPackage.ONE_TO_MANY__MAP_KEY:
				return basicSetMapKey(null, msgs);
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS:
				return basicSetMapKeyClass(null, msgs);
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
				return ((InternalEList<?>)getMapKeyAttributeOverride()).basicRemove(otherEnd, msgs);
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
				return ((InternalEList<?>)getMapKeyAssociationOverride()).basicRemove(otherEnd, msgs);
			case OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN:
				return basicSetMapKeyColumn(null, msgs);
			case OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN:
				return ((InternalEList<?>)getMapKeyJoinColumn()).basicRemove(otherEnd, msgs);
			case OrmPackage.ONE_TO_MANY__CONVERTER:
				return basicSetConverter(null, msgs);
			case OrmPackage.ONE_TO_MANY__TYPE_CONVERTER:
				return basicSetTypeConverter(null, msgs);
			case OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER:
				return basicSetObjectTypeConverter(null, msgs);
			case OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER:
				return basicSetStructConverter(null, msgs);
			case OrmPackage.ONE_TO_MANY__JOIN_TABLE:
				return basicSetJoinTable(null, msgs);
			case OrmPackage.ONE_TO_MANY__JOIN_COLUMN:
				return ((InternalEList<?>)getJoinColumn()).basicRemove(otherEnd, msgs);
			case OrmPackage.ONE_TO_MANY__CASCADE:
				return basicSetCascade(null, msgs);
			case OrmPackage.ONE_TO_MANY__PRIVATE_OWNED:
				return basicSetPrivateOwned(null, msgs);
			case OrmPackage.ONE_TO_MANY__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case OrmPackage.ONE_TO_MANY__ACCESS_METHODS:
				return basicSetAccessMethods(null, msgs);
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
			case OrmPackage.ONE_TO_MANY__ORDER_BY:
				return getOrderBy();
			case OrmPackage.ONE_TO_MANY__ORDER_COLUMN:
				return getOrderColumn();
			case OrmPackage.ONE_TO_MANY__MAP_KEY:
				return getMapKey();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS:
				return getMapKeyClass();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL:
				return getMapKeyTemporal();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED:
				return getMapKeyEnumerated();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CONVERT:
				return getMapKeyConvert();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
				return getMapKeyAttributeOverride();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
				return getMapKeyAssociationOverride();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN:
				return getMapKeyColumn();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN:
				return getMapKeyJoinColumn();
			case OrmPackage.ONE_TO_MANY__CONVERTER:
				return getConverter();
			case OrmPackage.ONE_TO_MANY__TYPE_CONVERTER:
				return getTypeConverter();
			case OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER:
				return getObjectTypeConverter();
			case OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER:
				return getStructConverter();
			case OrmPackage.ONE_TO_MANY__JOIN_TABLE:
				return getJoinTable();
			case OrmPackage.ONE_TO_MANY__JOIN_COLUMN:
				return getJoinColumn();
			case OrmPackage.ONE_TO_MANY__CASCADE:
				return getCascade();
			case OrmPackage.ONE_TO_MANY__PRIVATE_OWNED:
				return getPrivateOwned();
			case OrmPackage.ONE_TO_MANY__JOIN_FETCH:
				return getJoinFetch();
			case OrmPackage.ONE_TO_MANY__PROPERTY:
				return getProperty();
			case OrmPackage.ONE_TO_MANY__ACCESS_METHODS:
				return getAccessMethods();
			case OrmPackage.ONE_TO_MANY__ACCESS:
				return getAccess();
			case OrmPackage.ONE_TO_MANY__FETCH:
				return getFetch();
			case OrmPackage.ONE_TO_MANY__MAPPED_BY:
				return getMappedBy();
			case OrmPackage.ONE_TO_MANY__NAME:
				return getName();
			case OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL:
				return isOrphanRemoval();
			case OrmPackage.ONE_TO_MANY__TARGET_ENTITY:
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
			case OrmPackage.ONE_TO_MANY__ORDER_BY:
				setOrderBy((String)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__ORDER_COLUMN:
				setOrderColumn((OrderColumn)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY:
				setMapKey((MapKey)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS:
				setMapKeyClass((MapKeyClass)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL:
				setMapKeyTemporal((Temporal)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED:
				setMapKeyEnumerated((Enumerated)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CONVERT:
				setMapKeyConvert((String)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
				getMapKeyAttributeOverride().clear();
				getMapKeyAttributeOverride().addAll((Collection<? extends AttributeOverride>)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
				getMapKeyAssociationOverride().clear();
				getMapKeyAssociationOverride().addAll((Collection<? extends AssociationOverride>)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN:
				setMapKeyColumn((MapKeyColumn)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN:
				getMapKeyJoinColumn().clear();
				getMapKeyJoinColumn().addAll((Collection<? extends MapKeyJoinColumn>)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__CONVERTER:
				setConverter((Converter)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__TYPE_CONVERTER:
				setTypeConverter((TypeConverter)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER:
				setObjectTypeConverter((ObjectTypeConverter)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER:
				setStructConverter((StructConverter)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__JOIN_TABLE:
				setJoinTable((JoinTable)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__JOIN_COLUMN:
				getJoinColumn().clear();
				getJoinColumn().addAll((Collection<? extends JoinColumn>)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__CASCADE:
				setCascade((CascadeType)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__PRIVATE_OWNED:
				setPrivateOwned((EmptyType)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__JOIN_FETCH:
				setJoinFetch((JoinFetchType)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__ACCESS_METHODS:
				setAccessMethods((AccessMethods)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__FETCH:
				setFetch((FetchType)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__MAPPED_BY:
				setMappedBy((String)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL:
				setOrphanRemoval((Boolean)newValue);
				return;
			case OrmPackage.ONE_TO_MANY__TARGET_ENTITY:
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
			case OrmPackage.ONE_TO_MANY__ORDER_BY:
				setOrderBy(ORDER_BY_EDEFAULT);
				return;
			case OrmPackage.ONE_TO_MANY__ORDER_COLUMN:
				setOrderColumn((OrderColumn)null);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY:
				setMapKey((MapKey)null);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS:
				setMapKeyClass((MapKeyClass)null);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL:
				unsetMapKeyTemporal();
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED:
				unsetMapKeyEnumerated();
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CONVERT:
				setMapKeyConvert(MAP_KEY_CONVERT_EDEFAULT);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
				getMapKeyAttributeOverride().clear();
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
				getMapKeyAssociationOverride().clear();
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN:
				setMapKeyColumn((MapKeyColumn)null);
				return;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN:
				getMapKeyJoinColumn().clear();
				return;
			case OrmPackage.ONE_TO_MANY__CONVERTER:
				setConverter((Converter)null);
				return;
			case OrmPackage.ONE_TO_MANY__TYPE_CONVERTER:
				setTypeConverter((TypeConverter)null);
				return;
			case OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER:
				setObjectTypeConverter((ObjectTypeConverter)null);
				return;
			case OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER:
				setStructConverter((StructConverter)null);
				return;
			case OrmPackage.ONE_TO_MANY__JOIN_TABLE:
				setJoinTable((JoinTable)null);
				return;
			case OrmPackage.ONE_TO_MANY__JOIN_COLUMN:
				getJoinColumn().clear();
				return;
			case OrmPackage.ONE_TO_MANY__CASCADE:
				setCascade((CascadeType)null);
				return;
			case OrmPackage.ONE_TO_MANY__PRIVATE_OWNED:
				setPrivateOwned((EmptyType)null);
				return;
			case OrmPackage.ONE_TO_MANY__JOIN_FETCH:
				unsetJoinFetch();
				return;
			case OrmPackage.ONE_TO_MANY__PROPERTY:
				getProperty().clear();
				return;
			case OrmPackage.ONE_TO_MANY__ACCESS_METHODS:
				setAccessMethods((AccessMethods)null);
				return;
			case OrmPackage.ONE_TO_MANY__ACCESS:
				unsetAccess();
				return;
			case OrmPackage.ONE_TO_MANY__FETCH:
				unsetFetch();
				return;
			case OrmPackage.ONE_TO_MANY__MAPPED_BY:
				setMappedBy(MAPPED_BY_EDEFAULT);
				return;
			case OrmPackage.ONE_TO_MANY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL:
				unsetOrphanRemoval();
				return;
			case OrmPackage.ONE_TO_MANY__TARGET_ENTITY:
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
			case OrmPackage.ONE_TO_MANY__ORDER_BY:
				return ORDER_BY_EDEFAULT == null ? orderBy != null : !ORDER_BY_EDEFAULT.equals(orderBy);
			case OrmPackage.ONE_TO_MANY__ORDER_COLUMN:
				return orderColumn != null;
			case OrmPackage.ONE_TO_MANY__MAP_KEY:
				return mapKey != null;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CLASS:
				return mapKeyClass != null;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_TEMPORAL:
				return isSetMapKeyTemporal();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ENUMERATED:
				return isSetMapKeyEnumerated();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_CONVERT:
				return MAP_KEY_CONVERT_EDEFAULT == null ? mapKeyConvert != null : !MAP_KEY_CONVERT_EDEFAULT.equals(mapKeyConvert);
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ATTRIBUTE_OVERRIDE:
				return mapKeyAttributeOverride != null && !mapKeyAttributeOverride.isEmpty();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_ASSOCIATION_OVERRIDE:
				return mapKeyAssociationOverride != null && !mapKeyAssociationOverride.isEmpty();
			case OrmPackage.ONE_TO_MANY__MAP_KEY_COLUMN:
				return mapKeyColumn != null;
			case OrmPackage.ONE_TO_MANY__MAP_KEY_JOIN_COLUMN:
				return mapKeyJoinColumn != null && !mapKeyJoinColumn.isEmpty();
			case OrmPackage.ONE_TO_MANY__CONVERTER:
				return converter != null;
			case OrmPackage.ONE_TO_MANY__TYPE_CONVERTER:
				return typeConverter != null;
			case OrmPackage.ONE_TO_MANY__OBJECT_TYPE_CONVERTER:
				return objectTypeConverter != null;
			case OrmPackage.ONE_TO_MANY__STRUCT_CONVERTER:
				return structConverter != null;
			case OrmPackage.ONE_TO_MANY__JOIN_TABLE:
				return joinTable != null;
			case OrmPackage.ONE_TO_MANY__JOIN_COLUMN:
				return joinColumn != null && !joinColumn.isEmpty();
			case OrmPackage.ONE_TO_MANY__CASCADE:
				return cascade != null;
			case OrmPackage.ONE_TO_MANY__PRIVATE_OWNED:
				return privateOwned != null;
			case OrmPackage.ONE_TO_MANY__JOIN_FETCH:
				return isSetJoinFetch();
			case OrmPackage.ONE_TO_MANY__PROPERTY:
				return property != null && !property.isEmpty();
			case OrmPackage.ONE_TO_MANY__ACCESS_METHODS:
				return accessMethods != null;
			case OrmPackage.ONE_TO_MANY__ACCESS:
				return isSetAccess();
			case OrmPackage.ONE_TO_MANY__FETCH:
				return isSetFetch();
			case OrmPackage.ONE_TO_MANY__MAPPED_BY:
				return MAPPED_BY_EDEFAULT == null ? mappedBy != null : !MAPPED_BY_EDEFAULT.equals(mappedBy);
			case OrmPackage.ONE_TO_MANY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrmPackage.ONE_TO_MANY__ORPHAN_REMOVAL:
				return isSetOrphanRemoval();
			case OrmPackage.ONE_TO_MANY__TARGET_ENTITY:
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
		result.append(" (orderBy: ");
		result.append(orderBy);
		result.append(", mapKeyTemporal: ");
		if (mapKeyTemporalESet) result.append(mapKeyTemporal); else result.append("<unset>");
		result.append(", mapKeyEnumerated: ");
		if (mapKeyEnumeratedESet) result.append(mapKeyEnumerated); else result.append("<unset>");
		result.append(", mapKeyConvert: ");
		result.append(mapKeyConvert);
		result.append(", joinFetch: ");
		if (joinFetchESet) result.append(joinFetch); else result.append("<unset>");
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", fetch: ");
		if (fetchESet) result.append(fetch); else result.append("<unset>");
		result.append(", mappedBy: ");
		result.append(mappedBy);
		result.append(", name: ");
		result.append(name);
		result.append(", orphanRemoval: ");
		if (orphanRemovalESet) result.append(orphanRemoval); else result.append("<unset>");
		result.append(", targetEntity: ");
		result.append(targetEntity);
		result.append(')');
		return result.toString();
	}

  @Override
  public String getJavaAnnotation() {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    features.add(OrmPackage.eINSTANCE.getOneToMany_Cascade());
    features.add(OrmPackage.eINSTANCE.getOneToMany_Fetch());
    features.add(OrmPackage.eINSTANCE.getOneToMany_MappedBy());
    features.add(OrmPackage.eINSTANCE.getOneToMany_OrphanRemoval());
    features.add(OrmPackage.eINSTANCE.getOneToMany_TargetEntity());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true);
  }

} // OneToManyImpl
