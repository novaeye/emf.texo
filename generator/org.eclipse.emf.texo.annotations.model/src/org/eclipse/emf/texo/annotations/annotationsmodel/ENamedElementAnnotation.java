/**
 * <copyright>
 * </copyright>
 *
 * $Id: ENamedElementAnnotation.java,v 1.12 2011/10/25 13:19:44 mtaal Exp $
 */
package org.eclipse.emf.texo.annotations.annotationsmodel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.texo.annotations.AnnotationProvider;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ENamed Element Annotation</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getENamedElement <em>ENamed
 * Element</em>}</li>
 * <li>{@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getDescription <em>Description
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getENamedElementAnnotation()
 * @model kind="class" abstract="true"
 * @generated
 */
public abstract class ENamedElementAnnotation extends EObjectImpl implements EObject {

  public static final String TEXO_JAVA_ANNOTATION = "texo.java.annotation";
  public static final String TEXO_JAVA_ANNOTATION_DETAIL_KEY = "value";

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
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected ENamedElementAnnotation() {
    super();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return AnnotationsmodelPackage.Literals.ENAMED_ELEMENT_ANNOTATION;
  }

  /**
   * Returns the value of the '<em><b>ENamed Element</b></em>' reference. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>ENamed Element</em>' reference isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>ENamed Element</em>' reference.
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getENamedElementAnnotation_ENamedElement()
   * @model transient="true" changeable="false" volatile="true"
   * @generated
   */
  public ENamedElement getENamedElement() {
    ENamedElement eNamedElement = basicGetENamedElement();
    return eNamedElement != null && eNamedElement.eIsProxy() ? (ENamedElement) eResolveProxy((InternalEObject) eNamedElement)
        : eNamedElement;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generatedNOT
   */
  public abstract ENamedElement basicGetENamedElement();

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute. <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
   * here...
   * </p>
   * <!-- end-user-doc -->
   * 
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.eclipse.emf.texo.annotations.annotationsmodel.AnnotationsmodelPackage#getENamedElementAnnotation_Description()
   * @model
   * @generated
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the value of the '
   * {@link org.eclipse.emf.texo.annotations.annotationsmodel.ENamedElementAnnotation#getDescription
   * <em>Description</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param value
   *          the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  public void setDescription(String newDescription) {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired()) {
      eNotify(new ENotificationImpl(this, Notification.SET,
          AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__DESCRIPTION, oldDescription, description));
    }
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @model identifierRequired="true"
   * @generatedNOT
   */
  public String getJavaAnnotation(AnnotationProvider annotationProvider, String identifier) {
    return "";
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
    case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT:
      if (resolve) {
        return getENamedElement();
      }
      return basicGetENamedElement();
    case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__DESCRIPTION:
      return getDescription();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
    case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__DESCRIPTION:
      setDescription((String) newValue);
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
    case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__DESCRIPTION:
      setDescription(DESCRIPTION_EDEFAULT);
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
    case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__ENAMED_ELEMENT:
      return basicGetENamedElement() != null;
    case AnnotationsmodelPackage.ENAMED_ELEMENT_ANNOTATION__DESCRIPTION:
      return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    if (eIsProxy()) {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

  protected String getJavaAnnotationFromEAnnotation(AnnotationProvider annotationProvider, String identifier) {
    return getJavaAnnotationFromEAnnotation(annotationProvider, getENamedElement(), identifier);
  }

  protected String getJavaAnnotationFromEAnnotation(AnnotationProvider annotationProvider, EModelElement eModelElement,
      String identifier) {
    final EAnnotation eAnnotation = eModelElement.getEAnnotation(TEXO_JAVA_ANNOTATION);
    if (eAnnotation != null && eAnnotation.getDetails().get(TEXO_JAVA_ANNOTATION_DETAIL_KEY) != null) {
      return eAnnotation.getDetails().get(TEXO_JAVA_ANNOTATION_DETAIL_KEY);
    }
    if (eAnnotation != null && eAnnotation.getDetails().get(identifier) != null) {
      return eAnnotation.getDetails().get(identifier);
    }
    if (eModelElement.eContainer() instanceof EModelElement) {
      return getJavaAnnotationFromEAnnotation(annotationProvider, (EModelElement) eModelElement.eContainer(),
          identifier);
    }
    return "";
  }
} // ENamedElementAnnotation
