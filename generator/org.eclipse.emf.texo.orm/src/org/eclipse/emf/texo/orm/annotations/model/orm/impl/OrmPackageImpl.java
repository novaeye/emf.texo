/**
 * <copyright>
 * </copyright>
 *
 * $Id: OrmPackageImpl.java,v 1.6 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage;

import org.eclipse.emf.texo.orm.annotations.model.orm.util.OrmValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class OrmPackageImpl extends EPackageImpl implements OrmPackage {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected String packageFilename = "orm.ecore";

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass accessMethodsEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass associationOverrideEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass attributeOverrideEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass attributesEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass basicEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass basicCollectionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass basicMapEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass cacheEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass cacheInterceptorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass cascadeTypeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass changeTrackingEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass cloneCopyPolicyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass collectionTableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass columnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass columnResultEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass conversionValueEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass converterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass copyPolicyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass customizerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass discriminatorClassEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass discriminatorColumnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass eclipselinkCollectionTableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass elementCollectionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass embeddableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass embeddedEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass embeddedIdEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass emptyTypeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass entityListenerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass entityListenersEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass entityMappingsTypeEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass entityResultEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass fieldResultEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass generatedValueEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass idEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass idClassEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass inheritanceEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass instantiationCopyPolicyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass joinColumnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass joinTableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass lobEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass manyToManyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass manyToOneEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass mapKeyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass mapKeyClassEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass mapKeyColumnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass mapKeyJoinColumnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass mappedSuperclassEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass namedNativeQueryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass namedQueryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass namedStoredProcedureQueryEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass objectTypeConverterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass oneToManyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass oneToOneEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass optimisticLockingEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass orderColumnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass persistenceUnitDefaultsEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass persistenceUnitMetadataEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass postLoadEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass postPersistEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass postRemoveEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass postUpdateEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass prePersistEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass preRemoveEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass preUpdateEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass primaryKeyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass primaryKeyJoinColumnEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass queryHintEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass queryRedirectorsEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass readTransformerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass secondaryTableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass sequenceGeneratorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass sqlResultSetMappingEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass storedProcedureParameterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass structConverterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass tableEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass tableGeneratorEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass timeOfDayEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass transformationEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass transientEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass typeConverterEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass uniqueConstraintEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass variableOneToOneEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass versionEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EClass writeTransformerEClass = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum accessTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum cacheCoordinationTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum cacheTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum changeTrackingTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum directionTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum discriminatorTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum enumeratedEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum enumTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum existenceTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum fetchTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum generationTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum idValidationEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum inheritanceTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum joinFetchTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum lockModeTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum optimisticLockingTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum orderColumnCorrectionTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum temporalEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EEnum temporalTypeEEnum = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType accessTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType cacheCoordinationTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType cacheTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType changeTrackingTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType directionTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType discriminatorTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType discriminatorValueEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType enumeratedObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType enumTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType existenceTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType fetchTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType generationTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType idValidationObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType inheritanceTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType joinFetchTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType lockModeTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType optimisticLockingTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType orderByEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType orderColumnCorrectionTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType temporalObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType temporalTypeObjectEDataType = null;

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private EDataType versionTypeEDataType = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
   * EPackage.Registry} by the package package URI value.
   * <p>
   * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
   * performs initialization of the package, or returns the registered package, if one already exists. <!--
   * begin-user-doc --> <!-- end-user-doc -->
   * 
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OrmPackageImpl() {
    super(eNS_URI, OrmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>
   * This method is used to initialize {@link OrmPackage#eINSTANCE} when that field is accessed. Clients should not
   * invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @see #eNS_URI
   * @generated
   */
  public static OrmPackage init() {
    if (isInited)
      return (OrmPackage) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI);

    // Obtain or create and register package
    OrmPackageImpl theOrmPackage = (OrmPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OrmPackageImpl ? EPackage.Registry.INSTANCE
        .get(eNS_URI) : new OrmPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Load packages
    theOrmPackage.loadPackage();

    // Fix loaded packages
    theOrmPackage.fixPackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put(theOrmPackage, new EValidator.Descriptor() {
      public EValidator getEValidator() {
        return OrmValidator.INSTANCE;
      }
    });

    // Mark meta-data to indicate it can't be changed
    theOrmPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OrmPackage.eNS_URI, theOrmPackage);
    return theOrmPackage;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAccessMethods() {
    if (accessMethodsEClass == null) {
      accessMethodsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(0);
    }
    return accessMethodsEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAccessMethods_GetMethod() {
    return (EAttribute) getAccessMethods().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAccessMethods_SetMethod() {
    return (EAttribute) getAccessMethods().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAssociationOverride() {
    if (associationOverrideEClass == null) {
      associationOverrideEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(3);
    }
    return associationOverrideEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAssociationOverride_Description() {
    return (EAttribute) getAssociationOverride().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAssociationOverride_JoinColumn() {
    return (EReference) getAssociationOverride().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAssociationOverride_JoinTable() {
    return (EReference) getAssociationOverride().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAssociationOverride_Name() {
    return (EAttribute) getAssociationOverride().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAttributeOverride() {
    if (attributeOverrideEClass == null) {
      attributeOverrideEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(4);
    }
    return attributeOverrideEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAttributeOverride_Description() {
    return (EAttribute) getAttributeOverride().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributeOverride_Column() {
    return (EReference) getAttributeOverride().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAttributeOverride_Name() {
    return (EAttribute) getAttributeOverride().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getAttributes() {
    if (attributesEClass == null) {
      attributesEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(5);
    }
    return attributesEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getAttributes_Description() {
    return (EAttribute) getAttributes().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_Id() {
    return (EReference) getAttributes().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_EmbeddedId() {
    return (EReference) getAttributes().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_Basic() {
    return (EReference) getAttributes().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_BasicCollection() {
    return (EReference) getAttributes().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_BasicMap() {
    return (EReference) getAttributes().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_Version() {
    return (EReference) getAttributes().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_ManyToOne() {
    return (EReference) getAttributes().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_OneToMany() {
    return (EReference) getAttributes().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_OneToOne() {
    return (EReference) getAttributes().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_VariableOneToOne() {
    return (EReference) getAttributes().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_ManyToMany() {
    return (EReference) getAttributes().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_ElementCollection() {
    return (EReference) getAttributes().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_Embedded() {
    return (EReference) getAttributes().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_Transformation() {
    return (EReference) getAttributes().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getAttributes_Transient() {
    return (EReference) getAttributes().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getBasic() {
    if (basicEClass == null) {
      basicEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(6);
    }
    return basicEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_Column() {
    return (EReference) getBasic().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_GeneratedValue() {
    return (EReference) getBasic().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_Lob() {
    return (EReference) getBasic().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Temporal() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Enumerated() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Convert() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_Converter() {
    return (EReference) getBasic().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_TypeConverter() {
    return (EReference) getBasic().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_ObjectTypeConverter() {
    return (EReference) getBasic().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_StructConverter() {
    return (EReference) getBasic().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_TableGenerator() {
    return (EReference) getBasic().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_SequenceGenerator() {
    return (EReference) getBasic().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_Property() {
    return (EReference) getBasic().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasic_AccessMethods() {
    return (EReference) getBasic().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Access() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Fetch() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Mutable() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Name() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasic_Optional() {
    return (EAttribute) getBasic().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getBasicCollection() {
    if (basicCollectionEClass == null) {
      basicCollectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(7);
    }
    return basicCollectionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_ValueColumn() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicCollection_Convert() {
    return (EAttribute) getBasicCollection().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_Converter() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_TypeConverter() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_ObjectTypeConverter() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_StructConverter() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_CollectionTable() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicCollection_JoinFetch() {
    return (EAttribute) getBasicCollection().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_Property() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicCollection_AccessMethods() {
    return (EReference) getBasicCollection().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicCollection_Access() {
    return (EAttribute) getBasicCollection().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicCollection_Fetch() {
    return (EAttribute) getBasicCollection().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicCollection_Name() {
    return (EAttribute) getBasicCollection().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getBasicMap() {
    if (basicMapEClass == null) {
      basicMapEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(8);
    }
    return basicMapEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_KeyColumn() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_KeyConverter() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_ValueColumn() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_ValueConverter() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_Group() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_Converter() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_TypeConverter() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_ObjectTypeConverter() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_StructConverter() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_CollectionTable() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_JoinFetch() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_Property() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getBasicMap_AccessMethods() {
    return (EReference) getBasicMap().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_Access() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_Fetch() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getBasicMap_Name() {
    return (EAttribute) getBasicMap().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCache() {
    if (cacheEClass == null) {
      cacheEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(9);
    }
    return cacheEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_Expiry() {
    return (EAttribute) getCache().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCache_ExpiryTimeOfDay() {
    return (EReference) getCache().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_AlwaysRefresh() {
    return (EAttribute) getCache().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_CoordinationType() {
    return (EAttribute) getCache().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_DisableHits() {
    return (EAttribute) getCache().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_RefreshOnlyIfNewer() {
    return (EAttribute) getCache().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_Shared() {
    return (EAttribute) getCache().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_Size() {
    return (EAttribute) getCache().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCache_Type() {
    return (EAttribute) getCache().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCacheInterceptor() {
    if (cacheInterceptorEClass == null) {
      cacheInterceptorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(12);
    }
    return cacheInterceptorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCacheInterceptor_Class() {
    return (EAttribute) getCacheInterceptor().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCascadeType() {
    if (cascadeTypeEClass == null) {
      cascadeTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(15);
    }
    return cascadeTypeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCascadeType_CascadeAll() {
    return (EReference) getCascadeType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCascadeType_CascadePersist() {
    return (EReference) getCascadeType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCascadeType_CascadeMerge() {
    return (EReference) getCascadeType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCascadeType_CascadeRemove() {
    return (EReference) getCascadeType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCascadeType_CascadeRefresh() {
    return (EReference) getCascadeType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getChangeTracking() {
    if (changeTrackingEClass == null) {
      changeTrackingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(16);
    }
    return changeTrackingEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getChangeTracking_Type() {
    return (EAttribute) getChangeTracking().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCloneCopyPolicy() {
    if (cloneCopyPolicyEClass == null) {
      cloneCopyPolicyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(19);
    }
    return cloneCopyPolicyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCloneCopyPolicy_Method() {
    return (EAttribute) getCloneCopyPolicy().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCloneCopyPolicy_WorkingCopyMethod() {
    return (EAttribute) getCloneCopyPolicy().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCollectionTable() {
    if (collectionTableEClass == null) {
      collectionTableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(20);
    }
    return collectionTableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCollectionTable_JoinColumn() {
    return (EReference) getCollectionTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getCollectionTable_UniqueConstraint() {
    return (EReference) getCollectionTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCollectionTable_Catalog() {
    return (EAttribute) getCollectionTable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCollectionTable_Name() {
    return (EAttribute) getCollectionTable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCollectionTable_Schema() {
    return (EAttribute) getCollectionTable().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getColumn() {
    if (columnEClass == null) {
      columnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(21);
    }
    return columnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_ColumnDefinition() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Insertable() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Length() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Name() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Nullable() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Precision() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Scale() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Table() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Unique() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumn_Updatable() {
    return (EAttribute) getColumn().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getColumnResult() {
    if (columnResultEClass == null) {
      columnResultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(22);
    }
    return columnResultEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getColumnResult_Name() {
    return (EAttribute) getColumnResult().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getConversionValue() {
    if (conversionValueEClass == null) {
      conversionValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(23);
    }
    return conversionValueEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getConversionValue_DataValue() {
    return (EAttribute) getConversionValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getConversionValue_ObjectValue() {
    return (EAttribute) getConversionValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getConverter() {
    if (converterEClass == null) {
      converterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(24);
    }
    return converterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getConverter_Class() {
    return (EAttribute) getConverter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getConverter_Name() {
    return (EAttribute) getConverter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCopyPolicy() {
    if (copyPolicyEClass == null) {
      copyPolicyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(25);
    }
    return copyPolicyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCopyPolicy_Class() {
    return (EAttribute) getCopyPolicy().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getCustomizer() {
    if (customizerEClass == null) {
      customizerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(26);
    }
    return customizerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getCustomizer_Class() {
    return (EAttribute) getCustomizer().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getDiscriminatorClass() {
    if (discriminatorClassEClass == null) {
      discriminatorClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(29);
    }
    return discriminatorClassEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDiscriminatorClass_Discriminator() {
    return (EAttribute) getDiscriminatorClass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDiscriminatorClass_Value() {
    return (EAttribute) getDiscriminatorClass().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getDiscriminatorColumn() {
    if (discriminatorColumnEClass == null) {
      discriminatorColumnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(30);
    }
    return discriminatorColumnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDiscriminatorColumn_ColumnDefinition() {
    return (EAttribute) getDiscriminatorColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDiscriminatorColumn_DiscriminatorType() {
    return (EAttribute) getDiscriminatorColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDiscriminatorColumn_Length() {
    return (EAttribute) getDiscriminatorColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDiscriminatorColumn_Name() {
    return (EAttribute) getDiscriminatorColumn().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getDocumentRoot() {
    if (documentRootEClass == null) {
      documentRootEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(34);
    }
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed() {
    return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap() {
    return (EReference) getDocumentRoot().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation() {
    return (EReference) getDocumentRoot().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getDocumentRoot_EntityMappings() {
    return (EReference) getDocumentRoot().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEclipselinkCollectionTable() {
    if (eclipselinkCollectionTableEClass == null) {
      eclipselinkCollectionTableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(35);
    }
    return eclipselinkCollectionTableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEclipselinkCollectionTable_PrimaryKeyJoinColumn() {
    return (EReference) getEclipselinkCollectionTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEclipselinkCollectionTable_UniqueConstraint() {
    return (EReference) getEclipselinkCollectionTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEclipselinkCollectionTable_Catalog() {
    return (EAttribute) getEclipselinkCollectionTable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEclipselinkCollectionTable_Name() {
    return (EAttribute) getEclipselinkCollectionTable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEclipselinkCollectionTable_Schema() {
    return (EAttribute) getEclipselinkCollectionTable().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getElementCollection() {
    if (elementCollectionEClass == null) {
      elementCollectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(36);
    }
    return elementCollectionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_OrderBy() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_OrderColumn() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_MapKey() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_MapKeyClass() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_MapKeyTemporal() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_MapKeyEnumerated() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_MapKeyConvert() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_MapKeyAttributeOverride() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_MapKeyAssociationOverride() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_MapKeyColumn() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_MapKeyJoinColumn() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_Column() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Temporal() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Enumerated() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_Lob() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Convert() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_AttributeOverride() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_AssociationOverride() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Group() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_Converter() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_TypeConverter() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_ObjectTypeConverter() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_StructConverter() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_CollectionTable() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_Property() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getElementCollection_AccessMethods() {
    return (EReference) getElementCollection().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Access() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Fetch() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_Name() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getElementCollection_TargetClass() {
    return (EAttribute) getElementCollection().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEmbeddable() {
    if (embeddableEClass == null) {
      embeddableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(37);
    }
    return embeddableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddable_Description() {
    return (EAttribute) getEmbeddable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_Customizer() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_ChangeTracking() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_Converter() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_TypeConverter() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_ObjectTypeConverter() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_StructConverter() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_Property() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_Attributes() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_CopyPolicy() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_InstantiationCopyPolicy() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddable_CloneCopyPolicy() {
    return (EReference) getEmbeddable().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddable_Access() {
    return (EAttribute) getEmbeddable().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddable_Class() {
    return (EAttribute) getEmbeddable().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddable_ExcludeDefaultMappings() {
    return (EAttribute) getEmbeddable().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddable_MetadataComplete() {
    return (EAttribute) getEmbeddable().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEmbedded() {
    if (embeddedEClass == null) {
      embeddedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(38);
    }
    return embeddedEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbedded_AttributeOverride() {
    return (EReference) getEmbedded().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbedded_AssociationOverride() {
    return (EReference) getEmbedded().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbedded_Property() {
    return (EReference) getEmbedded().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbedded_AccessMethods() {
    return (EReference) getEmbedded().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbedded_Access() {
    return (EAttribute) getEmbedded().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbedded_Name() {
    return (EAttribute) getEmbedded().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEmbeddedId() {
    if (embeddedIdEClass == null) {
      embeddedIdEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(39);
    }
    return embeddedIdEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddedId_AttributeOverride() {
    return (EReference) getEmbeddedId().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddedId_Property() {
    return (EReference) getEmbeddedId().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEmbeddedId_AccessMethods() {
    return (EReference) getEmbeddedId().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddedId_Access() {
    return (EAttribute) getEmbeddedId().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEmbeddedId_Name() {
    return (EAttribute) getEmbeddedId().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEmptyType() {
    if (emptyTypeEClass == null) {
      emptyTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(40);
    }
    return emptyTypeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEntity() {
    if (entityEClass == null) {
      entityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(41);
    }
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_Description() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Customizer() {
    return (EReference) getEntity().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_ChangeTracking() {
    return (EReference) getEntity().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Table() {
    return (EReference) getEntity().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_SecondaryTable() {
    return (EReference) getEntity().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_PrimaryKeyJoinColumn() {
    return (EReference) getEntity().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_IdClass() {
    return (EReference) getEntity().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_PrimaryKey() {
    return (EReference) getEntity().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Inheritance() {
    return (EReference) getEntity().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_DiscriminatorValue() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_DiscriminatorColumn() {
    return (EReference) getEntity().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_OptimisticLocking() {
    return (EReference) getEntity().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Cache() {
    return (EReference) getEntity().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_CacheInterceptor() {
    return (EReference) getEntity().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Converter() {
    return (EReference) getEntity().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_TypeConverter() {
    return (EReference) getEntity().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_ObjectTypeConverter() {
    return (EReference) getEntity().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_StructConverter() {
    return (EReference) getEntity().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_CopyPolicy() {
    return (EReference) getEntity().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_InstantiationCopyPolicy() {
    return (EReference) getEntity().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_CloneCopyPolicy() {
    return (EReference) getEntity().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_SequenceGenerator() {
    return (EReference) getEntity().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_TableGenerator() {
    return (EReference) getEntity().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_NamedQuery() {
    return (EReference) getEntity().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_NamedNativeQuery() {
    return (EReference) getEntity().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_NamedStoredProcedureQuery() {
    return (EReference) getEntity().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_SqlResultSetMapping() {
    return (EReference) getEntity().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_QueryRedirectors() {
    return (EReference) getEntity().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_ExcludeDefaultListeners() {
    return (EReference) getEntity().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_ExcludeSuperclassListeners() {
    return (EReference) getEntity().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_EntityListeners() {
    return (EReference) getEntity().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Property() {
    return (EReference) getEntity().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_AttributeOverride() {
    return (EReference) getEntity().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_AssociationOverride() {
    return (EReference) getEntity().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntity_Attributes() {
    return (EReference) getEntity().getEStructuralFeatures().get(34);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_Access() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(35);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_Cacheable() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(36);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_Class() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(37);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_ExcludeDefaultMappings() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(38);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_ExistenceChecking() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(39);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_MetadataComplete() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(40);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_Name() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(41);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntity_ReadOnly() {
    return (EAttribute) getEntity().getEStructuralFeatures().get(42);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEntityListener() {
    if (entityListenerEClass == null) {
      entityListenerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(42);
    }
    return entityListenerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityListener_Description() {
    return (EAttribute) getEntityListener().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PrePersist() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PostPersist() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PreRemove() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PostRemove() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PreUpdate() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PostUpdate() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListener_PostLoad() {
    return (EReference) getEntityListener().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityListener_Class() {
    return (EAttribute) getEntityListener().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEntityListeners() {
    if (entityListenersEClass == null) {
      entityListenersEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(43);
    }
    return entityListenersEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityListeners_EntityListener() {
    return (EReference) getEntityListeners().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEntityMappingsType() {
    if (entityMappingsTypeEClass == null) {
      entityMappingsTypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(44);
    }
    return entityMappingsTypeEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityMappingsType_Description() {
    return (EAttribute) getEntityMappingsType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_PersistenceUnitMetadata() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityMappingsType_Package() {
    return (EAttribute) getEntityMappingsType().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityMappingsType_Schema() {
    return (EAttribute) getEntityMappingsType().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityMappingsType_Catalog() {
    return (EAttribute) getEntityMappingsType().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityMappingsType_Access() {
    return (EAttribute) getEntityMappingsType().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_Converter() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_TypeConverter() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_ObjectTypeConverter() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_StructConverter() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_SequenceGenerator() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_TableGenerator() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_NamedQuery() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_NamedNativeQuery() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_NamedStoredProcedureQuery() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_SqlResultSetMapping() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_MappedSuperclass() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_Entity() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityMappingsType_Embeddable() {
    return (EReference) getEntityMappingsType().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityMappingsType_Version() {
    return (EAttribute) getEntityMappingsType().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getEntityResult() {
    if (entityResultEClass == null) {
      entityResultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(45);
    }
    return entityResultEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getEntityResult_FieldResult() {
    return (EReference) getEntityResult().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityResult_DiscriminatorColumn() {
    return (EAttribute) getEntityResult().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getEntityResult_EntityClass() {
    return (EAttribute) getEntityResult().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getFieldResult() {
    if (fieldResultEClass == null) {
      fieldResultEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(54);
    }
    return fieldResultEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getFieldResult_Column() {
    return (EAttribute) getFieldResult().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getFieldResult_Name() {
    return (EAttribute) getFieldResult().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getGeneratedValue() {
    if (generatedValueEClass == null) {
      generatedValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(55);
    }
    return generatedValueEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getGeneratedValue_Generator() {
    return (EAttribute) getGeneratedValue().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getGeneratedValue_Strategy() {
    return (EAttribute) getGeneratedValue().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getId() {
    if (idEClass == null) {
      idEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(58);
    }
    return idEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_Column() {
    return (EReference) getId().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_GeneratedValue() {
    return (EReference) getId().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getId_Temporal() {
    return (EAttribute) getId().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getId_Convert() {
    return (EAttribute) getId().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_Converter() {
    return (EReference) getId().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_TypeConverter() {
    return (EReference) getId().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_ObjectTypeConverter() {
    return (EReference) getId().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_StructConverter() {
    return (EReference) getId().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_TableGenerator() {
    return (EReference) getId().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_SequenceGenerator() {
    return (EReference) getId().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_Property() {
    return (EReference) getId().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getId_AccessMethods() {
    return (EReference) getId().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getId_Access() {
    return (EAttribute) getId().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getId_Mutable() {
    return (EAttribute) getId().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getId_Name() {
    return (EAttribute) getId().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getIdClass() {
    if (idClassEClass == null) {
      idClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(59);
    }
    return idClassEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getIdClass_Class() {
    return (EAttribute) getIdClass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getInheritance() {
    if (inheritanceEClass == null) {
      inheritanceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(62);
    }
    return inheritanceEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getInheritance_Strategy() {
    return (EAttribute) getInheritance().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getInstantiationCopyPolicy() {
    if (instantiationCopyPolicyEClass == null) {
      instantiationCopyPolicyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(65);
    }
    return instantiationCopyPolicyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getJoinColumn() {
    if (joinColumnEClass == null) {
      joinColumnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(66);
    }
    return joinColumnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_ColumnDefinition() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_Insertable() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_Name() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_Nullable() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_ReferencedColumnName() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_Table() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_Unique() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinColumn_Updatable() {
    return (EAttribute) getJoinColumn().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getJoinTable() {
    if (joinTableEClass == null) {
      joinTableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(69);
    }
    return joinTableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getJoinTable_JoinColumn() {
    return (EReference) getJoinTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getJoinTable_InverseJoinColumn() {
    return (EReference) getJoinTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getJoinTable_UniqueConstraint() {
    return (EReference) getJoinTable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinTable_Catalog() {
    return (EAttribute) getJoinTable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinTable_Name() {
    return (EAttribute) getJoinTable().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getJoinTable_Schema() {
    return (EAttribute) getJoinTable().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getLob() {
    if (lobEClass == null) {
      lobEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(70);
    }
    return lobEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getManyToMany() {
    if (manyToManyEClass == null) {
      manyToManyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(73);
    }
    return manyToManyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_OrderBy() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_OrderColumn() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_MapKey() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_MapKeyClass() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_MapKeyTemporal() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_MapKeyEnumerated() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_MapKeyConvert() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_MapKeyAttributeOverride() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_MapKeyAssociationOverride() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_MapKeyColumn() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_MapKeyJoinColumn() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_Converter() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_TypeConverter() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_ObjectTypeConverter() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_StructConverter() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_JoinTable() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_Cascade() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_JoinFetch() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_Property() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToMany_AccessMethods() {
    return (EReference) getManyToMany().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_Access() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_Fetch() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_MappedBy() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_Name() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToMany_TargetEntity() {
    return (EAttribute) getManyToMany().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getManyToOne() {
    if (manyToOneEClass == null) {
      manyToOneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(74);
    }
    return manyToOneEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToOne_JoinColumn() {
    return (EReference) getManyToOne().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToOne_JoinTable() {
    return (EReference) getManyToOne().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToOne_Cascade() {
    return (EReference) getManyToOne().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_JoinFetch() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToOne_Property() {
    return (EReference) getManyToOne().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getManyToOne_AccessMethods() {
    return (EReference) getManyToOne().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_Access() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_Fetch() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_Id() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_MapsId() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_Name() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_Optional() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getManyToOne_TargetEntity() {
    return (EAttribute) getManyToOne().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getMapKey() {
    if (mapKeyEClass == null) {
      mapKeyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(75);
    }
    return mapKeyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKey_Name() {
    return (EAttribute) getMapKey().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getMapKeyClass() {
    if (mapKeyClassEClass == null) {
      mapKeyClassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(76);
    }
    return mapKeyClassEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyClass_Class() {
    return (EAttribute) getMapKeyClass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getMapKeyColumn() {
    if (mapKeyColumnEClass == null) {
      mapKeyColumnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(77);
    }
    return mapKeyColumnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_ColumnDefinition() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Insertable() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Length() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Name() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Nullable() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Precision() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Scale() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Table() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Unique() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyColumn_Updatable() {
    return (EAttribute) getMapKeyColumn().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getMapKeyJoinColumn() {
    if (mapKeyJoinColumnEClass == null) {
      mapKeyJoinColumnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(78);
    }
    return mapKeyJoinColumnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_ColumnDefinition() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_Insertable() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_Name() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_Nullable() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_ReferencedColumnName() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_Table() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_Unique() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMapKeyJoinColumn_Updatable() {
    return (EAttribute) getMapKeyJoinColumn().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getMappedSuperclass() {
    if (mappedSuperclassEClass == null) {
      mappedSuperclassEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(79);
    }
    return mappedSuperclassEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_Description() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_Customizer() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_ChangeTracking() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_IdClass() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PrimaryKey() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_OptimisticLocking() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_Cache() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_CacheInterceptor() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_Converter() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_TypeConverter() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_ObjectTypeConverter() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_StructConverter() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_CopyPolicy() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_InstantiationCopyPolicy() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_CloneCopyPolicy() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_ExcludeDefaultListeners() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_ExcludeSuperclassListeners() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_EntityListeners() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PrePersist() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PostPersist() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PreRemove() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PostRemove() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PreUpdate() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PostUpdate() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_PostLoad() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_Property() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getMappedSuperclass_Attributes() {
    return (EReference) getMappedSuperclass().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_Access() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_Cacheable() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(28);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_Class() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(29);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_ExcludeDefaultMappings() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(30);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_ExistenceChecking() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(31);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_MetadataComplete() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(32);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getMappedSuperclass_ReadOnly() {
    return (EAttribute) getMappedSuperclass().getEStructuralFeatures().get(33);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getNamedNativeQuery() {
    if (namedNativeQueryEClass == null) {
      namedNativeQueryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(80);
    }
    return namedNativeQueryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedNativeQuery_Description() {
    return (EAttribute) getNamedNativeQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedNativeQuery_Query() {
    return (EAttribute) getNamedNativeQuery().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getNamedNativeQuery_Hint() {
    return (EReference) getNamedNativeQuery().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedNativeQuery_Name() {
    return (EAttribute) getNamedNativeQuery().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedNativeQuery_ResultClass() {
    return (EAttribute) getNamedNativeQuery().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedNativeQuery_ResultSetMapping() {
    return (EAttribute) getNamedNativeQuery().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getNamedQuery() {
    if (namedQueryEClass == null) {
      namedQueryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(81);
    }
    return namedQueryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedQuery_Description() {
    return (EAttribute) getNamedQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedQuery_Query() {
    return (EAttribute) getNamedQuery().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedQuery_LockMode() {
    return (EAttribute) getNamedQuery().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getNamedQuery_Hint() {
    return (EReference) getNamedQuery().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedQuery_Name() {
    return (EAttribute) getNamedQuery().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getNamedStoredProcedureQuery() {
    if (namedStoredProcedureQueryEClass == null) {
      namedStoredProcedureQueryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(82);
    }
    return namedStoredProcedureQueryEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getNamedStoredProcedureQuery_Hint() {
    return (EReference) getNamedStoredProcedureQuery().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getNamedStoredProcedureQuery_Parameter() {
    return (EReference) getNamedStoredProcedureQuery().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedStoredProcedureQuery_Name() {
    return (EAttribute) getNamedStoredProcedureQuery().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedStoredProcedureQuery_ProcedureName() {
    return (EAttribute) getNamedStoredProcedureQuery().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedStoredProcedureQuery_ResultClass() {
    return (EAttribute) getNamedStoredProcedureQuery().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedStoredProcedureQuery_ResultSetMapping() {
    return (EAttribute) getNamedStoredProcedureQuery().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getNamedStoredProcedureQuery_ReturnsResultSet() {
    return (EAttribute) getNamedStoredProcedureQuery().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getObjectTypeConverter() {
    if (objectTypeConverterEClass == null) {
      objectTypeConverterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(83);
    }
    return objectTypeConverterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getObjectTypeConverter_ConversionValue() {
    return (EReference) getObjectTypeConverter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getObjectTypeConverter_DefaultObjectValue() {
    return (EAttribute) getObjectTypeConverter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getObjectTypeConverter_DataType() {
    return (EAttribute) getObjectTypeConverter().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getObjectTypeConverter_Name() {
    return (EAttribute) getObjectTypeConverter().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getObjectTypeConverter_ObjectType() {
    return (EAttribute) getObjectTypeConverter().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getOneToMany() {
    if (oneToManyEClass == null) {
      oneToManyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(84);
    }
    return oneToManyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_OrderBy() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_OrderColumn() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_MapKey() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_MapKeyClass() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_MapKeyTemporal() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_MapKeyEnumerated() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_MapKeyConvert() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_MapKeyAttributeOverride() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_MapKeyAssociationOverride() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_MapKeyColumn() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_MapKeyJoinColumn() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_Converter() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_TypeConverter() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_ObjectTypeConverter() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_StructConverter() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_JoinTable() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_JoinColumn() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_Cascade() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_PrivateOwned() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_JoinFetch() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_Property() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(20);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToMany_AccessMethods() {
    return (EReference) getOneToMany().getEStructuralFeatures().get(21);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_Access() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(22);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_Fetch() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(23);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_MappedBy() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(24);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_Name() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(25);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_OrphanRemoval() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(26);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToMany_TargetEntity() {
    return (EAttribute) getOneToMany().getEStructuralFeatures().get(27);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getOneToOne() {
    if (oneToOneEClass == null) {
      oneToOneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(85);
    }
    return oneToOneEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_PrimaryKeyJoinColumn() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_JoinColumn() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_JoinTable() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_Cascade() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_PrivateOwned() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_JoinFetch() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_Property() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOneToOne_AccessMethods() {
    return (EReference) getOneToOne().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_Access() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_Fetch() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_Id() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_MappedBy() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_MapsId() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_Name() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_Optional() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_OrphanRemoval() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOneToOne_TargetEntity() {
    return (EAttribute) getOneToOne().getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getOptimisticLocking() {
    if (optimisticLockingEClass == null) {
      optimisticLockingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(86);
    }
    return optimisticLockingEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getOptimisticLocking_SelectedColumn() {
    return (EReference) getOptimisticLocking().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOptimisticLocking_Cascade() {
    return (EAttribute) getOptimisticLocking().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOptimisticLocking_Type() {
    return (EAttribute) getOptimisticLocking().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getOrderColumn() {
    if (orderColumnEClass == null) {
      orderColumnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(90);
    }
    return orderColumnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOrderColumn_ColumnDefinition() {
    return (EAttribute) getOrderColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOrderColumn_CorrectionType() {
    return (EAttribute) getOrderColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOrderColumn_Insertable() {
    return (EAttribute) getOrderColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOrderColumn_Name() {
    return (EAttribute) getOrderColumn().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOrderColumn_Nullable() {
    return (EAttribute) getOrderColumn().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getOrderColumn_Updatable() {
    return (EAttribute) getOrderColumn().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPersistenceUnitDefaults() {
    if (persistenceUnitDefaultsEClass == null) {
      persistenceUnitDefaultsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(93);
    }
    return persistenceUnitDefaultsEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPersistenceUnitDefaults_Description() {
    return (EAttribute) getPersistenceUnitDefaults().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPersistenceUnitDefaults_Schema() {
    return (EAttribute) getPersistenceUnitDefaults().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPersistenceUnitDefaults_Catalog() {
    return (EAttribute) getPersistenceUnitDefaults().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPersistenceUnitDefaults_DelimitedIdentifiers() {
    return (EReference) getPersistenceUnitDefaults().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPersistenceUnitDefaults_Access() {
    return (EAttribute) getPersistenceUnitDefaults().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPersistenceUnitDefaults_CascadePersist() {
    return (EReference) getPersistenceUnitDefaults().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPersistenceUnitDefaults_EntityListeners() {
    return (EReference) getPersistenceUnitDefaults().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPersistenceUnitMetadata() {
    if (persistenceUnitMetadataEClass == null) {
      persistenceUnitMetadataEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(94);
    }
    return persistenceUnitMetadataEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPersistenceUnitMetadata_Description() {
    return (EAttribute) getPersistenceUnitMetadata().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPersistenceUnitMetadata_XmlMappingMetadataComplete() {
    return (EReference) getPersistenceUnitMetadata().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPersistenceUnitMetadata_ExcludeDefaultMappings() {
    return (EReference) getPersistenceUnitMetadata().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPersistenceUnitMetadata_PersistenceUnitDefaults() {
    return (EReference) getPersistenceUnitMetadata().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPostLoad() {
    if (postLoadEClass == null) {
      postLoadEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(95);
    }
    return postLoadEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostLoad_Description() {
    return (EAttribute) getPostLoad().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostLoad_MethodName() {
    return (EAttribute) getPostLoad().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPostPersist() {
    if (postPersistEClass == null) {
      postPersistEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(96);
    }
    return postPersistEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostPersist_Description() {
    return (EAttribute) getPostPersist().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostPersist_MethodName() {
    return (EAttribute) getPostPersist().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPostRemove() {
    if (postRemoveEClass == null) {
      postRemoveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(97);
    }
    return postRemoveEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostRemove_Description() {
    return (EAttribute) getPostRemove().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostRemove_MethodName() {
    return (EAttribute) getPostRemove().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPostUpdate() {
    if (postUpdateEClass == null) {
      postUpdateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(98);
    }
    return postUpdateEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostUpdate_Description() {
    return (EAttribute) getPostUpdate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPostUpdate_MethodName() {
    return (EAttribute) getPostUpdate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPrePersist() {
    if (prePersistEClass == null) {
      prePersistEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(99);
    }
    return prePersistEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPrePersist_Description() {
    return (EAttribute) getPrePersist().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPrePersist_MethodName() {
    return (EAttribute) getPrePersist().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPreRemove() {
    if (preRemoveEClass == null) {
      preRemoveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(100);
    }
    return preRemoveEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPreRemove_Description() {
    return (EAttribute) getPreRemove().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPreRemove_MethodName() {
    return (EAttribute) getPreRemove().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPreUpdate() {
    if (preUpdateEClass == null) {
      preUpdateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(101);
    }
    return preUpdateEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPreUpdate_Description() {
    return (EAttribute) getPreUpdate().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPreUpdate_MethodName() {
    return (EAttribute) getPreUpdate().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPrimaryKey() {
    if (primaryKeyEClass == null) {
      primaryKeyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(102);
    }
    return primaryKeyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getPrimaryKey_Column() {
    return (EReference) getPrimaryKey().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPrimaryKey_Validation() {
    return (EAttribute) getPrimaryKey().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getPrimaryKeyJoinColumn() {
    if (primaryKeyJoinColumnEClass == null) {
      primaryKeyJoinColumnEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(103);
    }
    return primaryKeyJoinColumnEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPrimaryKeyJoinColumn_ColumnDefinition() {
    return (EAttribute) getPrimaryKeyJoinColumn().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPrimaryKeyJoinColumn_Name() {
    return (EAttribute) getPrimaryKeyJoinColumn().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getPrimaryKeyJoinColumn_ReferencedColumnName() {
    return (EAttribute) getPrimaryKeyJoinColumn().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getProperty() {
    if (propertyEClass == null) {
      propertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(104);
    }
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getProperty_Name() {
    return (EAttribute) getProperty().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getProperty_Value() {
    return (EAttribute) getProperty().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getProperty_ValueType() {
    return (EAttribute) getProperty().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getQueryHint() {
    if (queryHintEClass == null) {
      queryHintEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(105);
    }
    return queryHintEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryHint_Description() {
    return (EAttribute) getQueryHint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryHint_Name() {
    return (EAttribute) getQueryHint().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryHint_Value() {
    return (EAttribute) getQueryHint().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getQueryRedirectors() {
    if (queryRedirectorsEClass == null) {
      queryRedirectorsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(106);
    }
    return queryRedirectorsEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_AllQueries() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_Delete() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_Insert() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_ReadAll() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_ReadObject() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_Report() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getQueryRedirectors_Update() {
    return (EAttribute) getQueryRedirectors().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getReadTransformer() {
    if (readTransformerEClass == null) {
      readTransformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(107);
    }
    return readTransformerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getReadTransformer_Method() {
    return (EAttribute) getReadTransformer().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getReadTransformer_TransformerClass() {
    return (EAttribute) getReadTransformer().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getSecondaryTable() {
    if (secondaryTableEClass == null) {
      secondaryTableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(108);
    }
    return secondaryTableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getSecondaryTable_PrimaryKeyJoinColumn() {
    return (EReference) getSecondaryTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getSecondaryTable_UniqueConstraint() {
    return (EReference) getSecondaryTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSecondaryTable_Catalog() {
    return (EAttribute) getSecondaryTable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSecondaryTable_Name() {
    return (EAttribute) getSecondaryTable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSecondaryTable_Schema() {
    return (EAttribute) getSecondaryTable().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getSequenceGenerator() {
    if (sequenceGeneratorEClass == null) {
      sequenceGeneratorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(109);
    }
    return sequenceGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_Description() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_AllocationSize() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_Catalog() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_InitialValue() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_Name() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_Schema() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSequenceGenerator_SequenceName() {
    return (EAttribute) getSequenceGenerator().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getSqlResultSetMapping() {
    if (sqlResultSetMappingEClass == null) {
      sqlResultSetMappingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(110);
    }
    return sqlResultSetMappingEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSqlResultSetMapping_Description() {
    return (EAttribute) getSqlResultSetMapping().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getSqlResultSetMapping_EntityResult() {
    return (EReference) getSqlResultSetMapping().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getSqlResultSetMapping_ColumnResult() {
    return (EReference) getSqlResultSetMapping().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getSqlResultSetMapping_Name() {
    return (EAttribute) getSqlResultSetMapping().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getStoredProcedureParameter() {
    if (storedProcedureParameterEClass == null) {
      storedProcedureParameterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(111);
    }
    return storedProcedureParameterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStoredProcedureParameter_Direction() {
    return (EAttribute) getStoredProcedureParameter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStoredProcedureParameter_JdbcType() {
    return (EAttribute) getStoredProcedureParameter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStoredProcedureParameter_JdbcTypeName() {
    return (EAttribute) getStoredProcedureParameter().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStoredProcedureParameter_Name() {
    return (EAttribute) getStoredProcedureParameter().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStoredProcedureParameter_QueryParameter() {
    return (EAttribute) getStoredProcedureParameter().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStoredProcedureParameter_Type() {
    return (EAttribute) getStoredProcedureParameter().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getStructConverter() {
    if (structConverterEClass == null) {
      structConverterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(112);
    }
    return structConverterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStructConverter_Converter() {
    return (EAttribute) getStructConverter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getStructConverter_Name() {
    return (EAttribute) getStructConverter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTable() {
    if (tableEClass == null) {
      tableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(113);
    }
    return tableEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTable_UniqueConstraint() {
    return (EReference) getTable().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTable_Catalog() {
    return (EAttribute) getTable().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTable_Name() {
    return (EAttribute) getTable().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTable_Schema() {
    return (EAttribute) getTable().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTableGenerator() {
    if (tableGeneratorEClass == null) {
      tableGeneratorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(114);
    }
    return tableGeneratorEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_Description() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTableGenerator_UniqueConstraint() {
    return (EReference) getTableGenerator().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_AllocationSize() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_Catalog() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_InitialValue() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_Name() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_PkColumnName() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_PkColumnValue() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_Schema() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_Table() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTableGenerator_ValueColumnName() {
    return (EAttribute) getTableGenerator().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTimeOfDay() {
    if (timeOfDayEClass == null) {
      timeOfDayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(119);
    }
    return timeOfDayEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTimeOfDay_Hour() {
    return (EAttribute) getTimeOfDay().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTimeOfDay_Millisecond() {
    return (EAttribute) getTimeOfDay().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTimeOfDay_Minute() {
    return (EAttribute) getTimeOfDay().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTimeOfDay_Second() {
    return (EAttribute) getTimeOfDay().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTransformation() {
    if (transformationEClass == null) {
      transformationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(120);
    }
    return transformationEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTransformation_ReadTransformer() {
    return (EReference) getTransformation().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTransformation_WriteTransformer() {
    return (EReference) getTransformation().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransformation_Access() {
    return (EAttribute) getTransformation().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTransformation_Property() {
    return (EReference) getTransformation().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getTransformation_AccessMethods() {
    return (EReference) getTransformation().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransformation_Access1() {
    return (EAttribute) getTransformation().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransformation_Fetch() {
    return (EAttribute) getTransformation().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransformation_Mutable() {
    return (EAttribute) getTransformation().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransformation_Name() {
    return (EAttribute) getTransformation().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransformation_Optional() {
    return (EAttribute) getTransformation().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTransient() {
    if (transientEClass == null) {
      transientEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(121);
    }
    return transientEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTransient_Name() {
    return (EAttribute) getTransient().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getTypeConverter() {
    if (typeConverterEClass == null) {
      typeConverterEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(122);
    }
    return typeConverterEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTypeConverter_DataType() {
    return (EAttribute) getTypeConverter().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTypeConverter_Name() {
    return (EAttribute) getTypeConverter().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getTypeConverter_ObjectType() {
    return (EAttribute) getTypeConverter().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getUniqueConstraint() {
    if (uniqueConstraintEClass == null) {
      uniqueConstraintEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(123);
    }
    return uniqueConstraintEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getUniqueConstraint_ColumnName() {
    return (EAttribute) getUniqueConstraint().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getUniqueConstraint_Name() {
    return (EAttribute) getUniqueConstraint().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getVariableOneToOne() {
    if (variableOneToOneEClass == null) {
      variableOneToOneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(124);
    }
    return variableOneToOneEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_Cascade() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_DiscriminatorColumn() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_DiscriminatorClass() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_JoinColumn() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_PrivateOwned() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_Property() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVariableOneToOne_AccessMethods() {
    return (EReference) getVariableOneToOne().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVariableOneToOne_Access() {
    return (EAttribute) getVariableOneToOne().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVariableOneToOne_Fetch() {
    return (EAttribute) getVariableOneToOne().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVariableOneToOne_Name() {
    return (EAttribute) getVariableOneToOne().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVariableOneToOne_Optional() {
    return (EAttribute) getVariableOneToOne().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVariableOneToOne_OrphanRemoval() {
    return (EAttribute) getVariableOneToOne().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVariableOneToOne_TargetInterface() {
    return (EAttribute) getVariableOneToOne().getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getVersion() {
    if (versionEClass == null) {
      versionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(125);
    }
    return versionEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_Column() {
    return (EReference) getVersion().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVersion_Temporal() {
    return (EAttribute) getVersion().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVersion_Convert() {
    return (EAttribute) getVersion().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_Converter() {
    return (EReference) getVersion().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_TypeConverter() {
    return (EReference) getVersion().getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_ObjectTypeConverter() {
    return (EReference) getVersion().getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_StructConverter() {
    return (EReference) getVersion().getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_Property() {
    return (EReference) getVersion().getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getVersion_AccessMethods() {
    return (EReference) getVersion().getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVersion_Access() {
    return (EAttribute) getVersion().getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVersion_Mutable() {
    return (EAttribute) getVersion().getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getVersion_Name() {
    return (EAttribute) getVersion().getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EClass getWriteTransformer() {
    if (writeTransformerEClass == null) {
      writeTransformerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(127);
    }
    return writeTransformerEClass;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EReference getWriteTransformer_Column() {
    return (EReference) getWriteTransformer().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getWriteTransformer_Method() {
    return (EAttribute) getWriteTransformer().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EAttribute getWriteTransformer_TransformerClass() {
    return (EAttribute) getWriteTransformer().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getAccessType() {
    if (accessTypeEEnum == null) {
      accessTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(1);
    }
    return accessTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getCacheCoordinationType() {
    if (cacheCoordinationTypeEEnum == null) {
      cacheCoordinationTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(10);
    }
    return cacheCoordinationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getCacheType() {
    if (cacheTypeEEnum == null) {
      cacheTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(13);
    }
    return cacheTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getChangeTrackingType() {
    if (changeTrackingTypeEEnum == null) {
      changeTrackingTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(17);
    }
    return changeTrackingTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getDirectionType() {
    if (directionTypeEEnum == null) {
      directionTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(27);
    }
    return directionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getDiscriminatorType() {
    if (discriminatorTypeEEnum == null) {
      discriminatorTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(31);
    }
    return discriminatorTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getEnumType() {
    if (enumTypeEEnum == null) {
      enumTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(48);
    }
    return enumTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getExistenceType() {
    if (existenceTypeEEnum == null) {
      existenceTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(50);
    }
    return existenceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getFetchType() {
    if (fetchTypeEEnum == null) {
      fetchTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(52);
    }
    return fetchTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getGenerationType() {
    if (generationTypeEEnum == null) {
      generationTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(56);
    }
    return generationTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getIdValidation() {
    if (idValidationEEnum == null) {
      idValidationEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(60);
    }
    return idValidationEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getInheritanceType() {
    if (inheritanceTypeEEnum == null) {
      inheritanceTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(63);
    }
    return inheritanceTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getJoinFetchType() {
    if (joinFetchTypeEEnum == null) {
      joinFetchTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(67);
    }
    return joinFetchTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getLockModeType() {
    if (lockModeTypeEEnum == null) {
      lockModeTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(71);
    }
    return lockModeTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getOptimisticLockingType() {
    if (optimisticLockingTypeEEnum == null) {
      optimisticLockingTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(87);
    }
    return optimisticLockingTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getOrderColumnCorrectionType() {
    if (orderColumnCorrectionTypeEEnum == null) {
      orderColumnCorrectionTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(91);
    }
    return orderColumnCorrectionTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getTemporalType() {
    if (temporalTypeEEnum == null) {
      temporalTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(117);
    }
    return temporalTypeEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getAccessTypeObject() {
    if (accessTypeObjectEDataType == null) {
      accessTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(2);
    }
    return accessTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getCacheCoordinationTypeObject() {
    if (cacheCoordinationTypeObjectEDataType == null) {
      cacheCoordinationTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(11);
    }
    return cacheCoordinationTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getCacheTypeObject() {
    if (cacheTypeObjectEDataType == null) {
      cacheTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(14);
    }
    return cacheTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getChangeTrackingTypeObject() {
    if (changeTrackingTypeObjectEDataType == null) {
      changeTrackingTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(18);
    }
    return changeTrackingTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getDirectionTypeObject() {
    if (directionTypeObjectEDataType == null) {
      directionTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(28);
    }
    return directionTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getDiscriminatorTypeObject() {
    if (discriminatorTypeObjectEDataType == null) {
      discriminatorTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(32);
    }
    return discriminatorTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getDiscriminatorValue() {
    if (discriminatorValueEDataType == null) {
      discriminatorValueEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(33);
    }
    return discriminatorValueEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getEnumeratedObject() {
    if (enumeratedObjectEDataType == null) {
      enumeratedObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(47);
    }
    return enumeratedObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getEnumerated() {
    if (enumeratedEEnum == null) {
      enumeratedEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(46);
    }
    return enumeratedEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getEnumTypeObject() {
    if (enumTypeObjectEDataType == null) {
      enumTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(49);
    }
    return enumTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getExistenceTypeObject() {
    if (existenceTypeObjectEDataType == null) {
      existenceTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(51);
    }
    return existenceTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getFetchTypeObject() {
    if (fetchTypeObjectEDataType == null) {
      fetchTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(53);
    }
    return fetchTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getGenerationTypeObject() {
    if (generationTypeObjectEDataType == null) {
      generationTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(57);
    }
    return generationTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getIdValidationObject() {
    if (idValidationObjectEDataType == null) {
      idValidationObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(61);
    }
    return idValidationObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getInheritanceTypeObject() {
    if (inheritanceTypeObjectEDataType == null) {
      inheritanceTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(64);
    }
    return inheritanceTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getJoinFetchTypeObject() {
    if (joinFetchTypeObjectEDataType == null) {
      joinFetchTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(68);
    }
    return joinFetchTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getLockModeTypeObject() {
    if (lockModeTypeObjectEDataType == null) {
      lockModeTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(72);
    }
    return lockModeTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getOptimisticLockingTypeObject() {
    if (optimisticLockingTypeObjectEDataType == null) {
      optimisticLockingTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(88);
    }
    return optimisticLockingTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getOrderBy() {
    if (orderByEDataType == null) {
      orderByEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(89);
    }
    return orderByEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getOrderColumnCorrectionTypeObject() {
    if (orderColumnCorrectionTypeObjectEDataType == null) {
      orderColumnCorrectionTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(92);
    }
    return orderColumnCorrectionTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getTemporalObject() {
    if (temporalObjectEDataType == null) {
      temporalObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(116);
    }
    return temporalObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EEnum getTemporal() {
    if (temporalEEnum == null) {
      temporalEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers().get(115);
    }
    return temporalEEnum;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getTemporalTypeObject() {
    if (temporalTypeObjectEDataType == null) {
      temporalTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI)
          .getEClassifiers().get(118);
    }
    return temporalTypeObjectEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public EDataType getVersionType() {
    if (versionTypeEDataType == null) {
      versionTypeEDataType = (EDataType) EPackage.Registry.INSTANCE.getEPackage(OrmPackage.eNS_URI).getEClassifiers()
          .get(126);
    }
    return versionTypeEDataType;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public OrmFactory getOrmFactory() {
    return (OrmFactory) getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public void loadPackage() {
    if (isLoaded)
      return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null) {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try {
      resource.load(null);
    } catch (IOException exception) {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
    createResource(eNS_URI);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built. <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * 
   * @generated
   */
  public void fixPackageContents() {
    if (isFixed)
      return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier) {
    if (eClassifier.getInstanceClassName() == null) {
      eClassifier.setInstanceClassName("org.eclipse.emf.texo.orm.annotations.model.orm." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} // OrmPackageImpl
