/**
 * <copyright>
 * </copyright>
 *
 * $Id: VersionImpl.java,v 1.10 2011/10/25 22:27:57 mtaal Exp $
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
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.Converter;
import org.eclipse.emf.texo.orm.annotations.model.orm.Index;
import org.eclipse.emf.texo.orm.annotations.model.orm.ObjectTypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Property;
import org.eclipse.emf.texo.orm.annotations.model.orm.StructConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.TemporalType;
import org.eclipse.emf.texo.orm.annotations.model.orm.Temporal;
import org.eclipse.emf.texo.orm.annotations.model.orm.TypeConverter;
import org.eclipse.emf.texo.orm.annotations.model.orm.Version;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;
import org.eclipse.emf.texo.orm.annotator.ORMJavaAnnotationGenerator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Version</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getConvert <em>Convert</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getConverter <em>Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getTypeConverter <em>Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getObjectTypeConverter <em>Object Type Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getStructConverter <em>Struct Converter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getAccessMethods <em>Access Methods</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getAttributeType <em>Attribute Type</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#isMutable <em>Mutable</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.VersionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VersionImpl extends BaseOrmAnnotationImpl implements Version {
  /**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
  protected Column column;

  /**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Index index;

		/**
	 * The default value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
  protected static final TemporalType TEMPORAL_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTemporal() <em>Temporal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getTemporal()
	 * @generated
	 * @ordered
	 */
  protected TemporalType temporal = TEMPORAL_EDEFAULT;

  /**
	 * The default value of the '{@link #getConvert() <em>Convert</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getConvert()
	 * @generated
	 * @ordered
	 */
  protected static final String CONVERT_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getConvert() <em>Convert</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getConvert()
	 * @generated
	 * @ordered
	 */
  protected String convert = CONVERT_EDEFAULT;

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
	 * The default value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRIBUTE_TYPE_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getAttributeType() <em>Attribute Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeType()
	 * @generated
	 * @ordered
	 */
	protected String attributeType = ATTRIBUTE_TYPE_EDEFAULT;

		/**
	 * The default value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
  protected static final boolean MUTABLE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMutable() <em>Mutable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #isMutable()
	 * @generated
	 * @ordered
	 */
  protected boolean mutable = MUTABLE_EDEFAULT;

  /**
	 * This is true if the Mutable attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean mutableESet;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected VersionImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getVersion();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public Column getColumn() {
		return column;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetColumn(Column newColumn, NotificationChain msgs) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__COLUMN, oldColumn, newColumn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setColumn(Column newColumn) {
		if (newColumn != column) {
			NotificationChain msgs = null;
			if (column != null)
				msgs = ((InternalEObject)column).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__COLUMN, null, msgs);
			if (newColumn != null)
				msgs = ((InternalEObject)newColumn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__COLUMN, null, msgs);
			msgs = basicSetColumn(newColumn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__COLUMN, newColumn, newColumn));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index getIndex() {
		return index;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(Index newIndex, NotificationChain msgs) {
		Index oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Index newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__INDEX, newIndex, newIndex));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public TemporalType getTemporal() {
		return temporal;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemporal(TemporalType newTemporal) {
		TemporalType oldTemporal = temporal;
		temporal = newTemporal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__TEMPORAL, oldTemporal, temporal));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getConvert() {
		return convert;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setConvert(String newConvert) {
		String oldConvert = convert;
		convert = newConvert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__CONVERT, oldConvert, convert));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__CONVERTER, oldConverter, newConverter);
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
				msgs = ((InternalEObject)converter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__CONVERTER, null, msgs);
			if (newConverter != null)
				msgs = ((InternalEObject)newConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__CONVERTER, null, msgs);
			msgs = basicSetConverter(newConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__CONVERTER, newConverter, newConverter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__TYPE_CONVERTER, oldTypeConverter, newTypeConverter);
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
				msgs = ((InternalEObject)typeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__TYPE_CONVERTER, null, msgs);
			if (newTypeConverter != null)
				msgs = ((InternalEObject)newTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__TYPE_CONVERTER, null, msgs);
			msgs = basicSetTypeConverter(newTypeConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__TYPE_CONVERTER, newTypeConverter, newTypeConverter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__OBJECT_TYPE_CONVERTER, oldObjectTypeConverter, newObjectTypeConverter);
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
				msgs = ((InternalEObject)objectTypeConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__OBJECT_TYPE_CONVERTER, null, msgs);
			if (newObjectTypeConverter != null)
				msgs = ((InternalEObject)newObjectTypeConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__OBJECT_TYPE_CONVERTER, null, msgs);
			msgs = basicSetObjectTypeConverter(newObjectTypeConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__OBJECT_TYPE_CONVERTER, newObjectTypeConverter, newObjectTypeConverter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__STRUCT_CONVERTER, oldStructConverter, newStructConverter);
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
				msgs = ((InternalEObject)structConverter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__STRUCT_CONVERTER, null, msgs);
			if (newStructConverter != null)
				msgs = ((InternalEObject)newStructConverter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__STRUCT_CONVERTER, null, msgs);
			msgs = basicSetStructConverter(newStructConverter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__STRUCT_CONVERTER, newStructConverter, newStructConverter));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Property> getProperty() {
		if (property == null) {
			property = new EObjectContainmentEList<Property>(Property.class, this, OrmPackage.VERSION__PROPERTY);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__ACCESS_METHODS, oldAccessMethods, newAccessMethods);
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
				msgs = ((InternalEObject)accessMethods).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__ACCESS_METHODS, null, msgs);
			if (newAccessMethods != null)
				msgs = ((InternalEObject)newAccessMethods).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrmPackage.VERSION__ACCESS_METHODS, null, msgs);
			msgs = basicSetAccessMethods(newAccessMethods, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__ACCESS_METHODS, newAccessMethods, newAccessMethods));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__ACCESS, oldAccess, access, !oldAccessESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.VERSION__ACCESS, oldAccess, ACCESS_EDEFAULT, oldAccessESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetAccess() {
		return accessESet;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttributeType() {
		return attributeType;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeType(String newAttributeType) {
		String oldAttributeType = attributeType;
		attributeType = newAttributeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__ATTRIBUTE_TYPE, oldAttributeType, attributeType));
	}

		/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMutable() {
		return mutable;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setMutable(boolean newMutable) {
		boolean oldMutable = mutable;
		mutable = newMutable;
		boolean oldMutableESet = mutableESet;
		mutableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__MUTABLE, oldMutable, mutable, !oldMutableESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetMutable() {
		boolean oldMutable = mutable;
		boolean oldMutableESet = mutableESet;
		mutable = MUTABLE_EDEFAULT;
		mutableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.VERSION__MUTABLE, oldMutable, MUTABLE_EDEFAULT, oldMutableESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetMutable() {
		return mutableESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.VERSION__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.VERSION__COLUMN:
				return basicSetColumn(null, msgs);
			case OrmPackage.VERSION__INDEX:
				return basicSetIndex(null, msgs);
			case OrmPackage.VERSION__CONVERTER:
				return basicSetConverter(null, msgs);
			case OrmPackage.VERSION__TYPE_CONVERTER:
				return basicSetTypeConverter(null, msgs);
			case OrmPackage.VERSION__OBJECT_TYPE_CONVERTER:
				return basicSetObjectTypeConverter(null, msgs);
			case OrmPackage.VERSION__STRUCT_CONVERTER:
				return basicSetStructConverter(null, msgs);
			case OrmPackage.VERSION__PROPERTY:
				return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
			case OrmPackage.VERSION__ACCESS_METHODS:
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
			case OrmPackage.VERSION__COLUMN:
				return getColumn();
			case OrmPackage.VERSION__INDEX:
				return getIndex();
			case OrmPackage.VERSION__TEMPORAL:
				return getTemporal();
			case OrmPackage.VERSION__CONVERT:
				return getConvert();
			case OrmPackage.VERSION__CONVERTER:
				return getConverter();
			case OrmPackage.VERSION__TYPE_CONVERTER:
				return getTypeConverter();
			case OrmPackage.VERSION__OBJECT_TYPE_CONVERTER:
				return getObjectTypeConverter();
			case OrmPackage.VERSION__STRUCT_CONVERTER:
				return getStructConverter();
			case OrmPackage.VERSION__PROPERTY:
				return getProperty();
			case OrmPackage.VERSION__ACCESS_METHODS:
				return getAccessMethods();
			case OrmPackage.VERSION__ACCESS:
				return getAccess();
			case OrmPackage.VERSION__ATTRIBUTE_TYPE:
				return getAttributeType();
			case OrmPackage.VERSION__MUTABLE:
				return isMutable();
			case OrmPackage.VERSION__NAME:
				return getName();
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
			case OrmPackage.VERSION__COLUMN:
				setColumn((Column)newValue);
				return;
			case OrmPackage.VERSION__INDEX:
				setIndex((Index)newValue);
				return;
			case OrmPackage.VERSION__TEMPORAL:
				setTemporal((TemporalType)newValue);
				return;
			case OrmPackage.VERSION__CONVERT:
				setConvert((String)newValue);
				return;
			case OrmPackage.VERSION__CONVERTER:
				setConverter((Converter)newValue);
				return;
			case OrmPackage.VERSION__TYPE_CONVERTER:
				setTypeConverter((TypeConverter)newValue);
				return;
			case OrmPackage.VERSION__OBJECT_TYPE_CONVERTER:
				setObjectTypeConverter((ObjectTypeConverter)newValue);
				return;
			case OrmPackage.VERSION__STRUCT_CONVERTER:
				setStructConverter((StructConverter)newValue);
				return;
			case OrmPackage.VERSION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case OrmPackage.VERSION__ACCESS_METHODS:
				setAccessMethods((AccessMethods)newValue);
				return;
			case OrmPackage.VERSION__ACCESS:
				setAccess((AccessType)newValue);
				return;
			case OrmPackage.VERSION__ATTRIBUTE_TYPE:
				setAttributeType((String)newValue);
				return;
			case OrmPackage.VERSION__MUTABLE:
				setMutable((Boolean)newValue);
				return;
			case OrmPackage.VERSION__NAME:
				setName((String)newValue);
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
			case OrmPackage.VERSION__COLUMN:
				setColumn((Column)null);
				return;
			case OrmPackage.VERSION__INDEX:
				setIndex((Index)null);
				return;
			case OrmPackage.VERSION__TEMPORAL:
				setTemporal(TEMPORAL_EDEFAULT);
				return;
			case OrmPackage.VERSION__CONVERT:
				setConvert(CONVERT_EDEFAULT);
				return;
			case OrmPackage.VERSION__CONVERTER:
				setConverter((Converter)null);
				return;
			case OrmPackage.VERSION__TYPE_CONVERTER:
				setTypeConverter((TypeConverter)null);
				return;
			case OrmPackage.VERSION__OBJECT_TYPE_CONVERTER:
				setObjectTypeConverter((ObjectTypeConverter)null);
				return;
			case OrmPackage.VERSION__STRUCT_CONVERTER:
				setStructConverter((StructConverter)null);
				return;
			case OrmPackage.VERSION__PROPERTY:
				getProperty().clear();
				return;
			case OrmPackage.VERSION__ACCESS_METHODS:
				setAccessMethods((AccessMethods)null);
				return;
			case OrmPackage.VERSION__ACCESS:
				unsetAccess();
				return;
			case OrmPackage.VERSION__ATTRIBUTE_TYPE:
				setAttributeType(ATTRIBUTE_TYPE_EDEFAULT);
				return;
			case OrmPackage.VERSION__MUTABLE:
				unsetMutable();
				return;
			case OrmPackage.VERSION__NAME:
				setName(NAME_EDEFAULT);
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
			case OrmPackage.VERSION__COLUMN:
				return column != null;
			case OrmPackage.VERSION__INDEX:
				return index != null;
			case OrmPackage.VERSION__TEMPORAL:
				return TEMPORAL_EDEFAULT == null ? temporal != null : !TEMPORAL_EDEFAULT.equals(temporal);
			case OrmPackage.VERSION__CONVERT:
				return CONVERT_EDEFAULT == null ? convert != null : !CONVERT_EDEFAULT.equals(convert);
			case OrmPackage.VERSION__CONVERTER:
				return converter != null;
			case OrmPackage.VERSION__TYPE_CONVERTER:
				return typeConverter != null;
			case OrmPackage.VERSION__OBJECT_TYPE_CONVERTER:
				return objectTypeConverter != null;
			case OrmPackage.VERSION__STRUCT_CONVERTER:
				return structConverter != null;
			case OrmPackage.VERSION__PROPERTY:
				return property != null && !property.isEmpty();
			case OrmPackage.VERSION__ACCESS_METHODS:
				return accessMethods != null;
			case OrmPackage.VERSION__ACCESS:
				return isSetAccess();
			case OrmPackage.VERSION__ATTRIBUTE_TYPE:
				return ATTRIBUTE_TYPE_EDEFAULT == null ? attributeType != null : !ATTRIBUTE_TYPE_EDEFAULT.equals(attributeType);
			case OrmPackage.VERSION__MUTABLE:
				return isSetMutable();
			case OrmPackage.VERSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (temporal: ");
		result.append(temporal);
		result.append(", convert: ");
		result.append(convert);
		result.append(", access: ");
		if (accessESet) result.append(access); else result.append("<unset>");
		result.append(", attributeType: ");
		result.append(attributeType);
		result.append(", mutable: ");
		if (mutableESet) result.append(mutable); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

  @Override
  public String getJavaAnnotation(String identifier) {
    final List<EStructuralFeature> features = new ArrayList<EStructuralFeature>();
    // add just any feature to force all eattributes to be ignored
    features.add(OrmPackage.eINSTANCE.getManyToOne_Cascade());

    return ORMJavaAnnotationGenerator.getInstance().generateJavaAnnotation(this, features, true, identifier);
  }

} // VersionImpl
