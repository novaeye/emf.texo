/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKeyImpl.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
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

import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.IdValidation;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.PrimaryKey;
import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Primary Key</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl#getColumn <em>Column</em>}</li>
 * <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.impl.PrimaryKeyImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PrimaryKeyImpl extends BaseOrmAnnotationImpl implements PrimaryKey {
  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected EList<Column> column;

  /**
   * The default value of the '{@link #getValidation() <em>Validation</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getValidation()
   * @generated
   * @ordered
   */
  protected static final IdValidation VALIDATION_EDEFAULT = IdValidation.NULL;

  /**
   * The cached value of the '{@link #getValidation() <em>Validation</em>}' attribute. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @see #getValidation()
   * @generated
   * @ordered
   */
  protected IdValidation validation = VALIDATION_EDEFAULT;

  /**
   * This is true if the Validation attribute has been set. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   * @ordered
   */
  protected boolean validationESet;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected PrimaryKeyImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return OrmPackage.eINSTANCE.getPrimaryKey();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EList<Column> getColumn() {
    if (column == null) {
      column = new EObjectContainmentEList<Column>(Column.class, this, OrmPackage.PRIMARY_KEY__COLUMN);
    }
    return column;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public IdValidation getValidation() {
    return validation;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void setValidation(IdValidation newValidation) {
    IdValidation oldValidation = validation;
    validation = newValidation == null ? VALIDATION_EDEFAULT : newValidation;
    boolean oldValidationESet = validationESet;
    validationESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OrmPackage.PRIMARY_KEY__VALIDATION, oldValidation,
          validation, !oldValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void unsetValidation() {
    IdValidation oldValidation = validation;
    boolean oldValidationESet = validationESet;
    validation = VALIDATION_EDEFAULT;
    validationESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, OrmPackage.PRIMARY_KEY__VALIDATION, oldValidation,
          VALIDATION_EDEFAULT, oldValidationESet));
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public boolean isSetValidation() {
    return validationESet;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case OrmPackage.PRIMARY_KEY__COLUMN:
      return ((InternalEList<?>) getColumn()).basicRemove(otherEnd, msgs);
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
    case OrmPackage.PRIMARY_KEY__COLUMN:
      return getColumn();
    case OrmPackage.PRIMARY_KEY__VALIDATION:
      return getValidation();
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
    case OrmPackage.PRIMARY_KEY__COLUMN:
      getColumn().clear();
      getColumn().addAll((Collection<? extends Column>) newValue);
      return;
    case OrmPackage.PRIMARY_KEY__VALIDATION:
      setValidation((IdValidation) newValue);
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
    case OrmPackage.PRIMARY_KEY__COLUMN:
      getColumn().clear();
      return;
    case OrmPackage.PRIMARY_KEY__VALIDATION:
      unsetValidation();
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
    case OrmPackage.PRIMARY_KEY__COLUMN:
      return column != null && !column.isEmpty();
    case OrmPackage.PRIMARY_KEY__VALIDATION:
      return isSetValidation();
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
    result.append(" (validation: ");
    if (validationESet)
      result.append(validation);
    else
      result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} // PrimaryKeyImpl
