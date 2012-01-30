package capua._1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>capua</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 * 
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CapuaModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://capua/1.0";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final CapuaModelFactory MODELFACTORY = new CapuaModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NAMEDOBJECT_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NAMEDOBJECT_NAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NAMEDOBJECT_ID_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_INLINKS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_OUTLINKS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_PARTICIPATEDASSOCIATIONS_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_ATTRIBUTEINSTANCES_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_COLLECTIONS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_CHILDREN_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEDOBJECT_PARENT_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINK_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINK_TARGET_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINK_SOURCE_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINK_ASSOCIATIONS_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_LINK_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_ASSOCIATEDOBJECT_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_INLINKS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_OUTLINKS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_PARTICIPATEDASSOCIATIONS_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_ATTRIBUTEINSTANCES_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_COLLECTIONS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_CHILDREN_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATION_PARENT_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEINSTANCE_CLASSIFIER_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEINSTANCE_INSTANTIATES_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTEINSTANCE_VALUE_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTCOLLECTION_CLASSIFIER_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTCOLLECTION_OBJECTS_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTCOLLECTION_ROOT_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTCOLLECTION_ATTRIBUTES_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int OBJECTCOLLECTION_TYPES_FEATURE_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ELEMENTANDELEMENTLINK_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ELEMENTANDCOLLECTIONLINK_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int COLLECTIONANDCOLLECTIONLINK_CLASSIFIER_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINKANDLINKASSOCIATION_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINKANDELEMENTASSOCIATION_CLASSIFIER_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINKANDCOLLECTIONASSOCIATION_CLASSIFIER_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ELEMENTCOLLECTION_CLASSIFIER_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ELEMENTCOLLECTION_ELEMENTS_FEATURE_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ELEMENT_CLASSIFIER_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ELEMENT_OWNERCOLLECTION_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTE_CLASSIFIER_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTE_TYPE_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTE_OWNER_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTE_DEFAULTVALUE_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTETYPE_CLASSIFIER_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTETYPE_OWNER_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTETYPE_DEFINITION_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ASSOCIATIONCOLLECTION_CLASSIFIER_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LINKCOLLECTION_CLASSIFIER_ID = 17;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BACKGROUNDINFO_CLASSIFIER_ID = 18;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_CLASSIFIER_ID = 19;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int INTERFACE_CLASSIFIER_ID = 20;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PRIORITY_CLASSIFIER_ID = 21;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int RATIONALE_CLASSIFIER_ID = 22;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MEASUREMENT_CLASSIFIER_ID = 23;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DEFINITION_CLASSIFIER_ID = 24;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int GOAL_CLASSIFIER_ID = 25;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int STAKEHOLDER_CLASSIFIER_ID = 26;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REQUIREMENT_CLASSIFIER_ID = 27;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int FUNCTIONALREQUIREMENT_CLASSIFIER_ID = 28;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int QUALITYREQUIREMENT_CLASSIFIER_ID = 29;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CONSTRAINTREQUIREMENT_CLASSIFIER_ID = 30;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int DOCUMENT_CLASSIFIER_ID = 31;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HEADING_CLASSIFIER_ID = 32;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PARAGRAPH_CLASSIFIER_ID = 33;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SENTENCE_CLASSIFIER_ID = 34;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CONFIGURATIONITEM_CLASSIFIER_ID = 35;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENARIO_CLASSIFIER_ID = 36;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCENARIOSTEP_CLASSIFIER_ID = 37;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ATTRIBUTECOLLECTION_CLASSIFIER_ID = 38;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MODELINFO_CLASSIFIER_ID = 39;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MODELINFO_VERSION_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MODELINFO_NOTES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int MODELINFO_DESCRIPTION_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUDIO_CLASSIFIER_ID = 40;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int VIDEO_CLASSIFIER_ID = 41;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TEXT_CLASSIFIER_ID = 42;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int ENUMERATION_CLASSIFIER_ID = 43;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int IMAGE_CLASSIFIER_ID = 44;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int BOOLEAN_CLASSIFIER_ID = 45;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int REQUIREMENTSDOCUMENT_CLASSIFIER_ID = 46;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCEDOCUMENT_CLASSIFIER_ID = 47;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PLAINDOCUMENT_CLASSIFIER_ID = 48;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final CapuaModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static CapuaModelPackage initialize() {

		if (isInitialized) {
			return (CapuaModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final CapuaModelPackage modelPackage = new CapuaModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		isInitialized = true;

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				NamedObject.class, modelPackage.getNamedObjectEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AttributedObject.class,
				modelPackage.getAttributedObjectEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Link.class,
				modelPackage.getLinkEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Association.class, modelPackage.getAssociationEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AttributeInstance.class,
				modelPackage.getAttributeInstanceEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ObjectCollection.class,
				modelPackage.getObjectCollectionEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ElementAndElementLink.class,
				modelPackage.getElementAndElementLinkEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ElementAndCollectionLink.class,
				modelPackage.getElementAndCollectionLinkEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				CollectionAndCollectionLink.class,
				modelPackage.getCollectionAndCollectionLinkEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				LinkAndLinkAssociation.class,
				modelPackage.getLinkAndLinkAssociationEClass(), modelPackage);
		ModelResolver.getInstance()
				.registerClassModelMapping(LinkAndElementAssociation.class,
						modelPackage.getLinkAndElementAssociationEClass(),
						modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				LinkAndCollectionAssociation.class,
				modelPackage.getLinkAndCollectionAssociationEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ElementCollection.class,
				modelPackage.getElementCollectionEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Element.class,
				modelPackage.getElementEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Attribute.class,
				modelPackage.getAttributeEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AttributeType.class, modelPackage.getAttributeTypeEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AssociationCollection.class,
				modelPackage.getAssociationCollectionEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				LinkCollection.class, modelPackage.getLinkCollectionEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				BackgroundInfo.class, modelPackage.getBackgroundInfoEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Evidence.class,
				modelPackage.getEvidenceEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Interface.class,
				modelPackage.getInterfaceEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Priority.class,
				modelPackage.getPriorityEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Rationale.class,
				modelPackage.getRationaleEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Measurement.class, modelPackage.getMeasurementEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Definition.class,
				modelPackage.getDefinitionEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Goal.class,
				modelPackage.getGoalEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Stakeholder.class, modelPackage.getStakeholderEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Requirement.class, modelPackage.getRequirementEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				FunctionalRequirement.class,
				modelPackage.getFunctionalRequirementEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				QualityRequirement.class,
				modelPackage.getQualityRequirementEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ConstraintRequirement.class,
				modelPackage.getConstraintRequirementEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Document.class,
				modelPackage.getDocumentEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Heading.class,
				modelPackage.getHeadingEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Paragraph.class,
				modelPackage.getParagraphEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Sentence.class,
				modelPackage.getSentenceEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ConfigurationItem.class,
				modelPackage.getConfigurationItemEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Scenario.class,
				modelPackage.getScenarioEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ScenarioStep.class, modelPackage.getScenarioStepEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AttributeCollection.class,
				modelPackage.getAttributeCollectionEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(ModelInfo.class,
				modelPackage.getModelInfoEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Audio.class,
				modelPackage.getAudioEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Video.class,
				modelPackage.getVideoEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Text.class,
				modelPackage.getTextEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Enumeration.class, modelPackage.getEnumerationEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Image.class,
				modelPackage.getImageEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Boolean.class,
				modelPackage.getBooleanEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				RequirementsDocument.class,
				modelPackage.getRequirementsDocumentEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				EvidenceDocument.class,
				modelPackage.getEvidenceDocumentEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				PlainDocument.class, modelPackage.getPlainDocumentEClass(),
				modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the {@link CapuaModelFactory} instance.
	 * @generated
	 */
	@Override
	public CapuaModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "capua.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>NamedObject</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>NamedObject</b></em>'
	 * @generated
	 */
	public EClass getNamedObjectEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				NAMEDOBJECT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>NamedObject.name</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>NamedObject.name</b></em>'.
	 * @generated
	 */
	public EAttribute getNamedObject_Name() {
		return (EAttribute) getNamedObjectEClass().getEAllStructuralFeatures()
				.get(NAMEDOBJECT_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>NamedObject.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>NamedObject.id</b></em>'.
	 * @generated
	 */
	public EAttribute getNamedObject_Id() {
		return (EAttribute) getNamedObjectEClass().getEAllStructuralFeatures()
				.get(NAMEDOBJECT_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AttributedObject</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>AttributedObject</b></em>'
	 * @generated
	 */
	public EClass getAttributedObjectEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ATTRIBUTEDOBJECT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.inLinks</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.inLinks</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_InLinks() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_INLINKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.outLinks</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.outLinks</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_OutLinks() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_OUTLINKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.participatedAssociations</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.participatedAssociations</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_ParticipatedAssociations() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_PARTICIPATEDASSOCIATIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.attributeInstances</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.attributeInstances</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_AttributeInstances() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_ATTRIBUTEINSTANCES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.collections</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.collections</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_Collections() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_COLLECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.children</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.children</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_Children() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_CHILDREN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributedObject.parent</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributedObject.parent</b></em>'.
	 * @generated
	 */
	public EReference getAttributedObject_Parent() {
		return (EReference) getAttributedObjectEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEDOBJECT_PARENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Link</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Link</b></em>'
	 * @generated
	 */
	public EClass getLinkEClass() {
		return (EClass) getEPackage().getEClassifiers().get(LINK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Link.target</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Link.target</b></em>'.
	 * @generated
	 */
	public EReference getLink_Target() {
		return (EReference) getLinkEClass().getEAllStructuralFeatures().get(
				LINK_TARGET_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Link.source</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Link.source</b></em>'.
	 * @generated
	 */
	public EReference getLink_Source() {
		return (EReference) getLinkEClass().getEAllStructuralFeatures().get(
				LINK_SOURCE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Link.associations</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Link.associations</b></em>'.
	 * @generated
	 */
	public EReference getLink_Associations() {
		return (EReference) getLinkEClass().getEAllStructuralFeatures().get(
				LINK_ASSOCIATIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Association</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Association</b></em>'
	 * @generated
	 */
	public EClass getAssociationEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ASSOCIATION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Association.link</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.link</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_Link() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_LINK_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.associatedObject</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.associatedObject</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_AssociatedObject() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_ASSOCIATEDOBJECT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.inLinks</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.inLinks</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_InLinks() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_INLINKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.outLinks</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.outLinks</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_OutLinks() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_OUTLINKS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.participatedAssociations</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.participatedAssociations</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_ParticipatedAssociations() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_PARTICIPATEDASSOCIATIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.attributeInstances</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.attributeInstances</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_AttributeInstances() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_ATTRIBUTEINSTANCES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.collections</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.collections</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_Collections() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_COLLECTIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.children</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.children</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_Children() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_CHILDREN_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Association.parent</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Association.parent</b></em>'.
	 * @generated
	 */
	public EReference getAssociation_Parent() {
		return (EReference) getAssociationEClass().getEAllStructuralFeatures()
				.get(ASSOCIATION_PARENT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AttributeInstance</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>AttributeInstance</b></em>'
	 * @generated
	 */
	public EClass getAttributeInstanceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ATTRIBUTEINSTANCE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributeInstance.instantiates</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributeInstance.instantiates</b></em>'.
	 * @generated
	 */
	public EReference getAttributeInstance_Instantiates() {
		return (EReference) getAttributeInstanceEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEINSTANCE_INSTANTIATES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributeInstance.value</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributeInstance.value</b></em>'.
	 * @generated
	 */
	public EReference getAttributeInstance_Value() {
		return (EReference) getAttributeInstanceEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTEINSTANCE_VALUE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ObjectCollection</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ObjectCollection</b></em>'
	 * @generated
	 */
	public EClass getObjectCollectionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				OBJECTCOLLECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectCollection.objects</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectCollection.objects</b></em>'.
	 * @generated
	 */
	public EReference getObjectCollection_Objects() {
		return (EReference) getObjectCollectionEClass()
				.getEAllStructuralFeatures().get(
						OBJECTCOLLECTION_OBJECTS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectCollection.root</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectCollection.root</b></em>'.
	 * @generated
	 */
	public EAttribute getObjectCollection_Root() {
		return (EAttribute) getObjectCollectionEClass()
				.getEAllStructuralFeatures().get(
						OBJECTCOLLECTION_ROOT_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectCollection.attributes</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectCollection.attributes</b></em>'.
	 * @generated
	 */
	public EReference getObjectCollection_Attributes() {
		return (EReference) getObjectCollectionEClass()
				.getEAllStructuralFeatures().get(
						OBJECTCOLLECTION_ATTRIBUTES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ObjectCollection.types</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ObjectCollection.types</b></em>'.
	 * @generated
	 */
	public EReference getObjectCollection_Types() {
		return (EReference) getObjectCollectionEClass()
				.getEAllStructuralFeatures().get(
						OBJECTCOLLECTION_TYPES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ElementAndElementLink</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ElementAndElementLink</b></em>'
	 * @generated
	 */
	public EClass getElementAndElementLinkEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ELEMENTANDELEMENTLINK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ElementAndCollectionLink</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ElementAndCollectionLink</b></em>'
	 * @generated
	 */
	public EClass getElementAndCollectionLinkEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ELEMENTANDCOLLECTIONLINK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>CollectionAndCollectionLink</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>CollectionAndCollectionLink</b></em>'
	 * @generated
	 */
	public EClass getCollectionAndCollectionLinkEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				COLLECTIONANDCOLLECTIONLINK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>LinkAndLinkAssociation</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>LinkAndLinkAssociation</b></em>'
	 * @generated
	 */
	public EClass getLinkAndLinkAssociationEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LINKANDLINKASSOCIATION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>LinkAndElementAssociation</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>LinkAndElementAssociation</b></em>'
	 * @generated
	 */
	public EClass getLinkAndElementAssociationEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LINKANDELEMENTASSOCIATION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>LinkAndCollectionAssociation</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>LinkAndCollectionAssociation</b></em>'
	 * @generated
	 */
	public EClass getLinkAndCollectionAssociationEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LINKANDCOLLECTIONASSOCIATION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ElementCollection</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ElementCollection</b></em>'
	 * @generated
	 */
	public EClass getElementCollectionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ELEMENTCOLLECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ElementCollection.elements</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ElementCollection.elements</b></em>'.
	 * @generated
	 */
	public EReference getElementCollection_Elements() {
		return (EReference) getElementCollectionEClass()
				.getEAllStructuralFeatures().get(
						ELEMENTCOLLECTION_ELEMENTS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Element</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Element</b></em>'
	 * @generated
	 */
	public EClass getElementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ELEMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Element.ownerCollection</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Element.ownerCollection</b></em>'.
	 * @generated
	 */
	public EReference getElement_OwnerCollection() {
		return (EReference) getElementEClass().getEAllStructuralFeatures().get(
				ELEMENT_OWNERCOLLECTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Attribute</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Attribute</b></em>'
	 * @generated
	 */
	public EClass getAttributeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ATTRIBUTE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Attribute.type</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Attribute.type</b></em>'.
	 * @generated
	 */
	public EReference getAttribute_Type() {
		return (EReference) getAttributeEClass().getEAllStructuralFeatures()
				.get(ATTRIBUTE_TYPE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Attribute.owner</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Attribute.owner</b></em>'.
	 * @generated
	 */
	public EReference getAttribute_Owner() {
		return (EReference) getAttributeEClass().getEAllStructuralFeatures()
				.get(ATTRIBUTE_OWNER_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Attribute.defaultValue</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Attribute.defaultValue</b></em>'.
	 * @generated
	 */
	public EReference getAttribute_DefaultValue() {
		return (EReference) getAttributeEClass().getEAllStructuralFeatures()
				.get(ATTRIBUTE_DEFAULTVALUE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AttributeType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>AttributeType</b></em>'
	 * @generated
	 */
	public EClass getAttributeTypeEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ATTRIBUTETYPE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributeType.owner</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributeType.owner</b></em>'.
	 * @generated
	 */
	public EReference getAttributeType_Owner() {
		return (EReference) getAttributeTypeEClass()
				.getEAllStructuralFeatures()
				.get(ATTRIBUTETYPE_OWNER_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AttributeType.definition</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AttributeType.definition</b></em>'.
	 * @generated
	 */
	public EAttribute getAttributeType_Definition() {
		return (EAttribute) getAttributeTypeEClass()
				.getEAllStructuralFeatures().get(
						ATTRIBUTETYPE_DEFINITION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AssociationCollection</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>AssociationCollection</b></em>'
	 * @generated
	 */
	public EClass getAssociationCollectionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ASSOCIATIONCOLLECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>LinkCollection</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>LinkCollection</b></em>
	 *         '
	 * @generated
	 */
	public EClass getLinkCollectionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LINKCOLLECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>BackgroundInfo</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>BackgroundInfo</b></em>
	 *         '
	 * @generated
	 */
	public EClass getBackgroundInfoEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				BACKGROUNDINFO_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Evidence</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Evidence</b></em>'
	 * @generated
	 */
	public EClass getEvidenceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				EVIDENCE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Interface</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Interface</b></em>'
	 * @generated
	 */
	public EClass getInterfaceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				INTERFACE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Priority</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Priority</b></em>'
	 * @generated
	 */
	public EClass getPriorityEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PRIORITY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Rationale</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Rationale</b></em>'
	 * @generated
	 */
	public EClass getRationaleEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				RATIONALE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Measurement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Measurement</b></em>'
	 * @generated
	 */
	public EClass getMeasurementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				MEASUREMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Definition</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Definition</b></em>'
	 * @generated
	 */
	public EClass getDefinitionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				DEFINITION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Goal</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Goal</b></em>'
	 * @generated
	 */
	public EClass getGoalEClass() {
		return (EClass) getEPackage().getEClassifiers().get(GOAL_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Stakeholder</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Stakeholder</b></em>'
	 * @generated
	 */
	public EClass getStakeholderEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				STAKEHOLDER_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Requirement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Requirement</b></em>'
	 * @generated
	 */
	public EClass getRequirementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				REQUIREMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>FunctionalRequirement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>FunctionalRequirement</b></em>'
	 * @generated
	 */
	public EClass getFunctionalRequirementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				FUNCTIONALREQUIREMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>QualityRequirement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>QualityRequirement</b></em>'
	 * @generated
	 */
	public EClass getQualityRequirementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				QUALITYREQUIREMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ConstraintRequirement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ConstraintRequirement</b></em>'
	 * @generated
	 */
	public EClass getConstraintRequirementEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				CONSTRAINTREQUIREMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Document</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Document</b></em>'
	 * @generated
	 */
	public EClass getDocumentEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				DOCUMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Heading</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Heading</b></em>'
	 * @generated
	 */
	public EClass getHeadingEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				HEADING_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Paragraph</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Paragraph</b></em>'
	 * @generated
	 */
	public EClass getParagraphEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PARAGRAPH_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Sentence</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Sentence</b></em>'
	 * @generated
	 */
	public EClass getSentenceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SENTENCE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ConfigurationItem</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ConfigurationItem</b></em>'
	 * @generated
	 */
	public EClass getConfigurationItemEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				CONFIGURATIONITEM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Scenario</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Scenario</b></em>'
	 * @generated
	 */
	public EClass getScenarioEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SCENARIO_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ScenarioStep</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ScenarioStep</b></em>'
	 * @generated
	 */
	public EClass getScenarioStepEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SCENARIOSTEP_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AttributeCollection</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>AttributeCollection</b></em>'
	 * @generated
	 */
	public EClass getAttributeCollectionEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ATTRIBUTECOLLECTION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ModelInfo</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ModelInfo</b></em>'
	 * @generated
	 */
	public EClass getModelInfoEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				MODELINFO_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ModelInfo.version</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ModelInfo.version</b></em>'.
	 * @generated
	 */
	public EAttribute getModelInfo_Version() {
		return (EAttribute) getModelInfoEClass().getEAllStructuralFeatures()
				.get(MODELINFO_VERSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ModelInfo.notes</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ModelInfo.notes</b></em>'.
	 * @generated
	 */
	public EAttribute getModelInfo_Notes() {
		return (EAttribute) getModelInfoEClass().getEAllStructuralFeatures()
				.get(MODELINFO_NOTES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ModelInfo.description</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ModelInfo.description</b></em>'.
	 * @generated
	 */
	public EAttribute getModelInfo_Description() {
		return (EAttribute) getModelInfoEClass().getEAllStructuralFeatures()
				.get(MODELINFO_DESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Audio</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Audio</b></em>'
	 * @generated
	 */
	public EClass getAudioEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(AUDIO_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Video</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Video</b></em>'
	 * @generated
	 */
	public EClass getVideoEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(VIDEO_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Text</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Text</b></em>'
	 * @generated
	 */
	public EClass getTextEClass() {
		return (EClass) getEPackage().getEClassifiers().get(TEXT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Enumeration</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Enumeration</b></em>'
	 * @generated
	 */
	public EClass getEnumerationEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				ENUMERATION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Image</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Image</b></em>'
	 * @generated
	 */
	public EClass getImageEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(IMAGE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Boolean</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Boolean</b></em>'
	 * @generated
	 */
	public EClass getBooleanEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				BOOLEAN_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>RequirementsDocument</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>RequirementsDocument</b></em>'
	 * @generated
	 */
	public EClass getRequirementsDocumentEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				REQUIREMENTSDOCUMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>EvidenceDocument</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>EvidenceDocument</b></em>'
	 * @generated
	 */
	public EClass getEvidenceDocumentEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				EVIDENCEDOCUMENT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PlainDocument</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>PlainDocument</b></em>'
	 * @generated
	 */
	public EClass getPlainDocumentEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PLAINDOCUMENT_CLASSIFIER_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case NAMEDOBJECT_CLASSIFIER_ID:
			return NamedObject.class;
		case ATTRIBUTEDOBJECT_CLASSIFIER_ID:
			return AttributedObject.class;
		case LINK_CLASSIFIER_ID:
			return Link.class;
		case ASSOCIATION_CLASSIFIER_ID:
			return Association.class;
		case ATTRIBUTEINSTANCE_CLASSIFIER_ID:
			return AttributeInstance.class;
		case OBJECTCOLLECTION_CLASSIFIER_ID:
			return ObjectCollection.class;
		case ELEMENTANDELEMENTLINK_CLASSIFIER_ID:
			return ElementAndElementLink.class;
		case ELEMENTANDCOLLECTIONLINK_CLASSIFIER_ID:
			return ElementAndCollectionLink.class;
		case COLLECTIONANDCOLLECTIONLINK_CLASSIFIER_ID:
			return CollectionAndCollectionLink.class;
		case LINKANDLINKASSOCIATION_CLASSIFIER_ID:
			return LinkAndLinkAssociation.class;
		case LINKANDELEMENTASSOCIATION_CLASSIFIER_ID:
			return LinkAndElementAssociation.class;
		case LINKANDCOLLECTIONASSOCIATION_CLASSIFIER_ID:
			return LinkAndCollectionAssociation.class;
		case ELEMENTCOLLECTION_CLASSIFIER_ID:
			return ElementCollection.class;
		case ELEMENT_CLASSIFIER_ID:
			return Element.class;
		case ATTRIBUTE_CLASSIFIER_ID:
			return Attribute.class;
		case ATTRIBUTETYPE_CLASSIFIER_ID:
			return AttributeType.class;
		case ASSOCIATIONCOLLECTION_CLASSIFIER_ID:
			return AssociationCollection.class;
		case LINKCOLLECTION_CLASSIFIER_ID:
			return LinkCollection.class;
		case BACKGROUNDINFO_CLASSIFIER_ID:
			return BackgroundInfo.class;
		case EVIDENCE_CLASSIFIER_ID:
			return Evidence.class;
		case INTERFACE_CLASSIFIER_ID:
			return Interface.class;
		case PRIORITY_CLASSIFIER_ID:
			return Priority.class;
		case RATIONALE_CLASSIFIER_ID:
			return Rationale.class;
		case MEASUREMENT_CLASSIFIER_ID:
			return Measurement.class;
		case DEFINITION_CLASSIFIER_ID:
			return Definition.class;
		case GOAL_CLASSIFIER_ID:
			return Goal.class;
		case STAKEHOLDER_CLASSIFIER_ID:
			return Stakeholder.class;
		case REQUIREMENT_CLASSIFIER_ID:
			return Requirement.class;
		case FUNCTIONALREQUIREMENT_CLASSIFIER_ID:
			return FunctionalRequirement.class;
		case QUALITYREQUIREMENT_CLASSIFIER_ID:
			return QualityRequirement.class;
		case CONSTRAINTREQUIREMENT_CLASSIFIER_ID:
			return ConstraintRequirement.class;
		case DOCUMENT_CLASSIFIER_ID:
			return Document.class;
		case HEADING_CLASSIFIER_ID:
			return Heading.class;
		case PARAGRAPH_CLASSIFIER_ID:
			return Paragraph.class;
		case SENTENCE_CLASSIFIER_ID:
			return Sentence.class;
		case CONFIGURATIONITEM_CLASSIFIER_ID:
			return ConfigurationItem.class;
		case SCENARIO_CLASSIFIER_ID:
			return Scenario.class;
		case SCENARIOSTEP_CLASSIFIER_ID:
			return ScenarioStep.class;
		case ATTRIBUTECOLLECTION_CLASSIFIER_ID:
			return AttributeCollection.class;
		case MODELINFO_CLASSIFIER_ID:
			return ModelInfo.class;
		case AUDIO_CLASSIFIER_ID:
			return Audio.class;
		case VIDEO_CLASSIFIER_ID:
			return Video.class;
		case TEXT_CLASSIFIER_ID:
			return Text.class;
		case ENUMERATION_CLASSIFIER_ID:
			return Enumeration.class;
		case IMAGE_CLASSIFIER_ID:
			return Image.class;
		case BOOLEAN_CLASSIFIER_ID:
			return Boolean.class;
		case REQUIREMENTSDOCUMENT_CLASSIFIER_ID:
			return RequirementsDocument.class;
		case EVIDENCEDOCUMENT_CLASSIFIER_ID:
			return EvidenceDocument.class;
		case PLAINDOCUMENT_CLASSIFIER_ID:
			return PlainDocument.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
