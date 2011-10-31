package org.eclipse.emf.texo.test.model.schemaconstructs.emap;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: org.eclipse.emf.texo.test.model.schemaconstructs.emap.
 * It contains code to create instances {@link ModelObject} wrappers and instances for EClasses and convert objects back and forth from their String (XML) representation.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EmapModelFactory implements ModelFactory {

  /**
   * Creates an instance for an {@link EClass}
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param eClass creates a Object instance for this EClass
   * @return an object representing the eClass
   * @generated
   */
  public Object create(EClass eClass) {
    switch (eClass.getClassifierID()) {
    case EmapModelPackage.BOOK_CLASSIFIER_ID:
      return createBook();
    case EmapModelPackage.WRITER_CLASSIFIER_ID:
      return createWriter();
    case EmapModelPackage.BOOKSTORE_CLASSIFIER_ID:
      return createBookStore();
    }
    throw new IllegalArgumentException("The EClass '" + eClass.getName() + "' is not a valid EClass for this EPackage");
  }

  /**
   * Wraps an object in a {@link ModelObject}.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   *
   * @param eClass
   *            the EClass of the object
   * @param adaptee
   *            the object being wrapped/adapted
   * @return the wrapper {@link ModelObject}
   * @generated
   */
  @SuppressWarnings({ "unchecked", "rawtypes" })
  public ModelObject createModelObject(EClass eClass, Object adaptee) {
    ModelObject<Object> modelObject = null;
    switch (eClass.getClassifierID()) {
    case EmapModelPackage.BOOK_CLASSIFIER_ID:
      modelObject = new BookModelObject();
      break;
    case EmapModelPackage.WRITER_CLASSIFIER_ID:
      modelObject = new WriterModelObject();
      break;
    case EmapModelPackage.BOOKSTORE_CLASSIFIER_ID:
      modelObject = new BookStoreModelObject();
      break;
    default:
      throw new IllegalArgumentException("The EClass '" + eClass + "' is not defined in this EPackage");
    }
    modelObject.setTarget(adaptee);
    return modelObject;
  }

  /**
   * Creates a feature map entry instance for a certain EStructuralFeature.
   * 
   * @param eStructuralFeature
   *          the feature map feature
   * @return the pojo feature map entry
   * @generated
   */
  public Object createFeatureMapEntry(EStructuralFeature eFeature) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}. If the feature map
   * entry is null then a new one is created and <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @param eStructuralFeature
   *          the feature map feature of the object
   * @param adaptee
   *          the pojo feature map entry being wrapped/adapted
   * @return the wrapper {@link ModelFeatureMapEntry}
   * @generated
   */
  public ModelFeatureMapEntry<?> createModelFeatureMapEntry(EStructuralFeature eFeature, Object adaptee) {
    throw new IllegalArgumentException("The EStructuralFeature '" + eFeature
        + "' is not a valid feature map in this EPackage");
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the model object representing the EClass Book
   * @generated
   */
  public Book createBook() {
    return new Book();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the model object representing the EClass BookStore
   * @generated
   */
  public BookStore createBookStore() {
    return new BookStore();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @return an instance of the model object representing the EClass Writer
   * @generated
   */
  public Writer createWriter() {
    return new Writer();
  }

  /**
   * Converts an instance of an {@link EDataType} to a String.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param eDataType the {@link EDataType} defining the type
   * @param value the object to convert, if the value is null then null is returned.
   * @generated
   */
  public Object createFromString(EDataType eDataType, String value) {
    switch (eDataType.getClassifierID()) {
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage");
  }

  /**
   * Converts an instance of an {@link EDataType} to a String.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @param eDataType the {@link EDataType} defining the type
   * @param value the object to convert, if value == null then null is returned
   * @generated
   */
  public String convertToString(EDataType eDataType, Object value) {
    switch (eDataType.getClassifierID()) {
    }
    throw new IllegalArgumentException("The EDatatype '" + eDataType + "' is not defined in this EPackage.");
  }

  /** 
   * The adapter/wrapper for the EClass '<em><b>Book</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  public static class BookModelObject<E extends Book> extends AbstractModelObject<E> {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the {@link EClass}
     * @generated
     */
    public EClass eClass() {
      return EmapModelPackage.INSTANCE.getBookEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return EmapModelPackage.INSTANCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param eStructuralFeature
     *          the {@link EStructuralFeature} for which the value is returned.
     * @return the value of a certain {@link EStructuralFeature}.
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmapModelPackage.BOOK_TITLE_FEATURE_ID:
        return getTarget().getTitle();
      case EmapModelPackage.BOOK_WRITERS_FEATURE_ID:
        return getTarget().getWriters();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param eStructuralFeature
     *          the {@link EStructuralFeature} for which the value is set
     * @param value
     *          the value to set.
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmapModelPackage.BOOK_TITLE_FEATURE_ID:
        getTarget().setTitle((String) value);
        return;
      case EmapModelPackage.BOOK_WRITERS_FEATURE_ID:
        getTarget().setWriters((Map<String, Writer>) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /** 
   * The adapter/wrapper for the EClass '<em><b>BookStore</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  public static class BookStoreModelObject<E extends BookStore> extends AbstractModelObject<E> {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the {@link EClass}
     * @generated
     */
    public EClass eClass() {
      return EmapModelPackage.INSTANCE.getBookStoreEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return EmapModelPackage.INSTANCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param eStructuralFeature
     *          the {@link EStructuralFeature} for which the value is returned.
     * @return the value of a certain {@link EStructuralFeature}.
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmapModelPackage.BOOKSTORE_NAME_FEATURE_ID:
        return getTarget().getName();
      case EmapModelPackage.BOOKSTORE_WRITERSBYBOOK_FEATURE_ID:
        return getTarget().getWritersByBook();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param eStructuralFeature
     *          the {@link EStructuralFeature} for which the value is set
     * @param value
     *          the value to set.
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmapModelPackage.BOOKSTORE_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      case EmapModelPackage.BOOKSTORE_WRITERSBYBOOK_FEATURE_ID:
        getTarget().setWritersByBook((Map<Writer, Book>) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

  /** 
   * The adapter/wrapper for the EClass '<em><b>Writer</b></em>'.
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * @generated 
   */
  public static class WriterModelObject<E extends Writer> extends AbstractModelObject<E> {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the {@link EClass}
     * @generated
     */
    public EClass eClass() {
      return EmapModelPackage.INSTANCE.getWriterEClass();
    }

    /**
     * @generated
     */
    public ModelPackage getModelPackage() {
      return EmapModelPackage.INSTANCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param eStructuralFeature
     *          the {@link EStructuralFeature} for which the value is returned.
     * @return the value of a certain {@link EStructuralFeature}.
     * @generated
     */
    @Override
    public Object eGet(EStructuralFeature eStructuralFeature) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmapModelPackage.WRITER_NAME_FEATURE_ID:
        return getTarget().getName();
      }
      return super.eGet(eStructuralFeature);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param eStructuralFeature
     *          the {@link EStructuralFeature} for which the value is set
     * @param value
     *          the value to set.
     * @generated
     */

    @Override
    public void eSet(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {
      case EmapModelPackage.WRITER_NAME_FEATURE_ID:
        getTarget().setName((String) value);
        return;
      }
      super.eSet(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eAddTo(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }

    /**
     * @generated
     */
    @Override
    public void eRemoveFrom(EStructuralFeature eStructuralFeature, Object value) {
      final int featureID = eClass().getFeatureID(eStructuralFeature);
      switch (featureID) {

      }
      super.eAddTo(eStructuralFeature, value);
    }
  }

}
