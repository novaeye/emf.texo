/**
 * <copyright>
 * </copyright>
 *
 * $Id: NamedStoredProcedureQueryImpl.java,v 1.5 2011/10/25 13:25:23 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.texo.orm.annotations.model.orm.NamedStoredProcedureQuery;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.QueryHint;
import org.eclipse.emf.texo.orm.annotations.model.orm.StoredProcedureParameter;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Named Stored Procedure Query</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#getHint <em>Hint</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#isCallByIndex <em>Call By Index</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#isMultipleResultSets <em>Multiple Result Sets</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#getProcedureName <em>Procedure Name</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#getResultClass <em>Result Class</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#getResultSetMapping <em>Result Set Mapping</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.NamedStoredProcedureQueryImpl#isReturnsResultSet <em>Returns Result Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedStoredProcedureQueryImpl extends BaseOrmAnnotationImpl implements NamedStoredProcedureQuery {
  /**
	 * The cached value of the '{@link #getHint() <em>Hint</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getHint()
	 * @generated
	 * @ordered
	 */
  protected EList<QueryHint> hint;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<StoredProcedureParameter> parameter;

  /**
	 * The default value of the '{@link #isCallByIndex() <em>Call By Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallByIndex()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALL_BY_INDEX_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isCallByIndex() <em>Call By Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallByIndex()
	 * @generated
	 * @ordered
	 */
	protected boolean callByIndex = CALL_BY_INDEX_EDEFAULT;

		/**
	 * This is true if the Call By Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean callByIndexESet;

		/**
	 * The default value of the '{@link #isMultipleResultSets() <em>Multiple Result Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleResultSets()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIPLE_RESULT_SETS_EDEFAULT = false;

		/**
	 * The cached value of the '{@link #isMultipleResultSets() <em>Multiple Result Sets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultipleResultSets()
	 * @generated
	 * @ordered
	 */
	protected boolean multipleResultSets = MULTIPLE_RESULT_SETS_EDEFAULT;

		/**
	 * This is true if the Multiple Result Sets attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multipleResultSetsESet;

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
	 * The default value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcedureName()
	 * @generated
	 * @ordered
	 */
  protected static final String PROCEDURE_NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getProcedureName() <em>Procedure Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcedureName()
	 * @generated
	 * @ordered
	 */
  protected String procedureName = PROCEDURE_NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getResultClass()
	 * @generated
	 * @ordered
	 */
  protected static final String RESULT_CLASS_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getResultClass() <em>Result Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
   * end-user-doc -->
	 * @see #getResultClass()
	 * @generated
	 * @ordered
	 */
  protected String resultClass = RESULT_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see #getResultSetMapping()
   * @generated
   * @ordered
   */
  protected static final String RESULT_SET_MAPPING_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getResultSetMapping() <em>Result Set Mapping</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #getResultSetMapping()
	 * @generated
	 * @ordered
	 */
  protected String resultSetMapping = RESULT_SET_MAPPING_EDEFAULT;

  /**
	 * The default value of the '{@link #isReturnsResultSet() <em>Returns Result Set</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #isReturnsResultSet()
	 * @generated
	 * @ordered
	 */
  protected static final boolean RETURNS_RESULT_SET_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isReturnsResultSet() <em>Returns Result Set</em>}' attribute.
	 * <!-- begin-user-doc
   * --> <!-- end-user-doc -->
	 * @see #isReturnsResultSet()
	 * @generated
	 * @ordered
	 */
  protected boolean returnsResultSet = RETURNS_RESULT_SET_EDEFAULT;

  /**
	 * This is true if the Returns Result Set attribute has been set.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  protected boolean returnsResultSetESet;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  protected NamedStoredProcedureQueryImpl() {
		super();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass() {
		return OrmPackage.eINSTANCE.getNamedStoredProcedureQuery();
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<QueryHint> getHint() {
		if (hint == null) {
			hint = new EObjectContainmentEList<QueryHint>(QueryHint.class, this, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT);
		}
		return hint;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public EList<StoredProcedureParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<StoredProcedureParameter>(StoredProcedureParameter.class, this, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER);
		}
		return parameter;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallByIndex() {
		return callByIndex;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallByIndex(boolean newCallByIndex) {
		boolean oldCallByIndex = callByIndex;
		callByIndex = newCallByIndex;
		boolean oldCallByIndexESet = callByIndexESet;
		callByIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX, oldCallByIndex, callByIndex, !oldCallByIndexESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCallByIndex() {
		boolean oldCallByIndex = callByIndex;
		boolean oldCallByIndexESet = callByIndexESet;
		callByIndex = CALL_BY_INDEX_EDEFAULT;
		callByIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX, oldCallByIndex, CALL_BY_INDEX_EDEFAULT, oldCallByIndexESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCallByIndex() {
		return callByIndexESet;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultipleResultSets() {
		return multipleResultSets;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleResultSets(boolean newMultipleResultSets) {
		boolean oldMultipleResultSets = multipleResultSets;
		multipleResultSets = newMultipleResultSets;
		boolean oldMultipleResultSetsESet = multipleResultSetsESet;
		multipleResultSetsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS, oldMultipleResultSets, multipleResultSets, !oldMultipleResultSetsESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultipleResultSets() {
		boolean oldMultipleResultSets = multipleResultSets;
		boolean oldMultipleResultSetsESet = multipleResultSetsESet;
		multipleResultSets = MULTIPLE_RESULT_SETS_EDEFAULT;
		multipleResultSetsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS, oldMultipleResultSets, MULTIPLE_RESULT_SETS_EDEFAULT, oldMultipleResultSetsESet));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultipleResultSets() {
		return multipleResultSetsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getProcedureName() {
		return procedureName;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setProcedureName(String newProcedureName) {
		String oldProcedureName = procedureName;
		procedureName = newProcedureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME, oldProcedureName, procedureName));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getResultClass() {
		return resultClass;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setResultClass(String newResultClass) {
		String oldResultClass = resultClass;
		resultClass = newResultClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS, oldResultClass, resultClass));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public String getResultSetMapping() {
		return resultSetMapping;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setResultSetMapping(String newResultSetMapping) {
		String oldResultSetMapping = resultSetMapping;
		resultSetMapping = newResultSetMapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING, oldResultSetMapping, resultSetMapping));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isReturnsResultSet() {
		return returnsResultSet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void setReturnsResultSet(boolean newReturnsResultSet) {
		boolean oldReturnsResultSet = returnsResultSet;
		returnsResultSet = newReturnsResultSet;
		boolean oldReturnsResultSetESet = returnsResultSetESet;
		returnsResultSetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET, oldReturnsResultSet, returnsResultSet, !oldReturnsResultSetESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public void unsetReturnsResultSet() {
		boolean oldReturnsResultSet = returnsResultSet;
		boolean oldReturnsResultSetESet = returnsResultSetESet;
		returnsResultSet = RETURNS_RESULT_SET_EDEFAULT;
		returnsResultSetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET, oldReturnsResultSet, RETURNS_RESULT_SET_EDEFAULT, oldReturnsResultSetESet));
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isSetReturnsResultSet() {
		return returnsResultSetESet;
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT:
				return ((InternalEList<?>)getHint()).basicRemove(otherEnd, msgs);
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT:
				return getHint();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER:
				return getParameter();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX:
				return isCallByIndex();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS:
				return isMultipleResultSets();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__NAME:
				return getName();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
				return getProcedureName();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS:
				return getResultClass();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
				return getResultSetMapping();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET:
				return isReturnsResultSet();
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
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT:
				getHint().clear();
				getHint().addAll((Collection<? extends QueryHint>)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends StoredProcedureParameter>)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX:
				setCallByIndex((Boolean)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS:
				setMultipleResultSets((Boolean)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__NAME:
				setName((String)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
				setProcedureName((String)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS:
				setResultClass((String)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
				setResultSetMapping((String)newValue);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET:
				setReturnsResultSet((Boolean)newValue);
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
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT:
				getHint().clear();
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER:
				getParameter().clear();
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX:
				unsetCallByIndex();
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS:
				unsetMultipleResultSets();
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
				setProcedureName(PROCEDURE_NAME_EDEFAULT);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS:
				setResultClass(RESULT_CLASS_EDEFAULT);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
				setResultSetMapping(RESULT_SET_MAPPING_EDEFAULT);
				return;
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET:
				unsetReturnsResultSet();
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
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__HINT:
				return hint != null && !hint.isEmpty();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__CALL_BY_INDEX:
				return isSetCallByIndex();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__MULTIPLE_RESULT_SETS:
				return isSetMultipleResultSets();
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__PROCEDURE_NAME:
				return PROCEDURE_NAME_EDEFAULT == null ? procedureName != null : !PROCEDURE_NAME_EDEFAULT.equals(procedureName);
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_CLASS:
				return RESULT_CLASS_EDEFAULT == null ? resultClass != null : !RESULT_CLASS_EDEFAULT.equals(resultClass);
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RESULT_SET_MAPPING:
				return RESULT_SET_MAPPING_EDEFAULT == null ? resultSetMapping != null : !RESULT_SET_MAPPING_EDEFAULT.equals(resultSetMapping);
			case OrmPackage.NAMED_STORED_PROCEDURE_QUERY__RETURNS_RESULT_SET:
				return isSetReturnsResultSet();
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
		result.append(" (callByIndex: ");
		if (callByIndexESet) result.append(callByIndex); else result.append("<unset>");
		result.append(", multipleResultSets: ");
		if (multipleResultSetsESet) result.append(multipleResultSets); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", procedureName: ");
		result.append(procedureName);
		result.append(", resultClass: ");
		result.append(resultClass);
		result.append(", resultSetMapping: ");
		result.append(resultSetMapping);
		result.append(", returnsResultSet: ");
		if (returnsResultSetESet) result.append(returnsResultSet); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} // NamedStoredProcedureQueryImpl
