package capua._1;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: capua. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CapuaModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CapuaModelPackage.LINK_CLASSIFIER_ID:
			return createLink();
		case CapuaModelPackage.ASSOCIATION_CLASSIFIER_ID:
			return createAssociation();
		case CapuaModelPackage.ATTRIBUTEINSTANCE_CLASSIFIER_ID:
			return createAttributeInstance();
		case CapuaModelPackage.ELEMENTANDELEMENTLINK_CLASSIFIER_ID:
			return createElementAndElementLink();
		case CapuaModelPackage.ELEMENTANDCOLLECTIONLINK_CLASSIFIER_ID:
			return createElementAndCollectionLink();
		case CapuaModelPackage.COLLECTIONANDCOLLECTIONLINK_CLASSIFIER_ID:
			return createCollectionAndCollectionLink();
		case CapuaModelPackage.LINKANDLINKASSOCIATION_CLASSIFIER_ID:
			return createLinkAndLinkAssociation();
		case CapuaModelPackage.LINKANDELEMENTASSOCIATION_CLASSIFIER_ID:
			return createLinkAndElementAssociation();
		case CapuaModelPackage.LINKANDCOLLECTIONASSOCIATION_CLASSIFIER_ID:
			return createLinkAndCollectionAssociation();
		case CapuaModelPackage.ATTRIBUTE_CLASSIFIER_ID:
			return createAttribute();
		case CapuaModelPackage.ATTRIBUTETYPE_CLASSIFIER_ID:
			return createAttributeType();
		case CapuaModelPackage.ASSOCIATIONCOLLECTION_CLASSIFIER_ID:
			return createAssociationCollection();
		case CapuaModelPackage.LINKCOLLECTION_CLASSIFIER_ID:
			return createLinkCollection();
		case CapuaModelPackage.BACKGROUNDINFO_CLASSIFIER_ID:
			return createBackgroundInfo();
		case CapuaModelPackage.EVIDENCE_CLASSIFIER_ID:
			return createEvidence();
		case CapuaModelPackage.INTERFACE_CLASSIFIER_ID:
			return createInterface();
		case CapuaModelPackage.PRIORITY_CLASSIFIER_ID:
			return createPriority();
		case CapuaModelPackage.RATIONALE_CLASSIFIER_ID:
			return createRationale();
		case CapuaModelPackage.MEASUREMENT_CLASSIFIER_ID:
			return createMeasurement();
		case CapuaModelPackage.DEFINITION_CLASSIFIER_ID:
			return createDefinition();
		case CapuaModelPackage.GOAL_CLASSIFIER_ID:
			return createGoal();
		case CapuaModelPackage.STAKEHOLDER_CLASSIFIER_ID:
			return createStakeholder();
		case CapuaModelPackage.REQUIREMENT_CLASSIFIER_ID:
			return createRequirement();
		case CapuaModelPackage.FUNCTIONALREQUIREMENT_CLASSIFIER_ID:
			return createFunctionalRequirement();
		case CapuaModelPackage.QUALITYREQUIREMENT_CLASSIFIER_ID:
			return createQualityRequirement();
		case CapuaModelPackage.CONSTRAINTREQUIREMENT_CLASSIFIER_ID:
			return createConstraintRequirement();
		case CapuaModelPackage.HEADING_CLASSIFIER_ID:
			return createHeading();
		case CapuaModelPackage.PARAGRAPH_CLASSIFIER_ID:
			return createParagraph();
		case CapuaModelPackage.SENTENCE_CLASSIFIER_ID:
			return createSentence();
		case CapuaModelPackage.CONFIGURATIONITEM_CLASSIFIER_ID:
			return createConfigurationItem();
		case CapuaModelPackage.SCENARIO_CLASSIFIER_ID:
			return createScenario();
		case CapuaModelPackage.SCENARIOSTEP_CLASSIFIER_ID:
			return createScenarioStep();
		case CapuaModelPackage.ATTRIBUTECOLLECTION_CLASSIFIER_ID:
			return createAttributeCollection();
		case CapuaModelPackage.MODELINFO_CLASSIFIER_ID:
			return createModelInfo();
		case CapuaModelPackage.AUDIO_CLASSIFIER_ID:
			return createAudio();
		case CapuaModelPackage.VIDEO_CLASSIFIER_ID:
			return createVideo();
		case CapuaModelPackage.TEXT_CLASSIFIER_ID:
			return createText();
		case CapuaModelPackage.ENUMERATION_CLASSIFIER_ID:
			return createEnumeration();
		case CapuaModelPackage.IMAGE_CLASSIFIER_ID:
			return createImage();
		case CapuaModelPackage.BOOLEAN_CLASSIFIER_ID:
			return createBoolean();
		case CapuaModelPackage.REQUIREMENTSDOCUMENT_CLASSIFIER_ID:
			return createRequirementsDocument();
		case CapuaModelPackage.EVIDENCEDOCUMENT_CLASSIFIER_ID:
			return createEvidenceDocument();
		case CapuaModelPackage.PLAINDOCUMENT_CLASSIFIER_ID:
			return createPlainDocument();
		}
		throw new IllegalArgumentException("The EClass '" + eClass.getName()
				+ "' is not a valid EClass for this EPackage");
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
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
		case CapuaModelPackage.NAMEDOBJECT_CLASSIFIER_ID:
			modelObject = new NamedObjectModelObject();
			break;
		case CapuaModelPackage.ATTRIBUTEDOBJECT_CLASSIFIER_ID:
			modelObject = new AttributedObjectModelObject();
			break;
		case CapuaModelPackage.LINK_CLASSIFIER_ID:
			modelObject = new LinkModelObject();
			break;
		case CapuaModelPackage.ASSOCIATION_CLASSIFIER_ID:
			modelObject = new AssociationModelObject();
			break;
		case CapuaModelPackage.ATTRIBUTEINSTANCE_CLASSIFIER_ID:
			modelObject = new AttributeInstanceModelObject();
			break;
		case CapuaModelPackage.OBJECTCOLLECTION_CLASSIFIER_ID:
			modelObject = new ObjectCollectionModelObject();
			break;
		case CapuaModelPackage.ELEMENTANDELEMENTLINK_CLASSIFIER_ID:
			modelObject = new ElementAndElementLinkModelObject();
			break;
		case CapuaModelPackage.ELEMENTANDCOLLECTIONLINK_CLASSIFIER_ID:
			modelObject = new ElementAndCollectionLinkModelObject();
			break;
		case CapuaModelPackage.COLLECTIONANDCOLLECTIONLINK_CLASSIFIER_ID:
			modelObject = new CollectionAndCollectionLinkModelObject();
			break;
		case CapuaModelPackage.LINKANDLINKASSOCIATION_CLASSIFIER_ID:
			modelObject = new LinkAndLinkAssociationModelObject();
			break;
		case CapuaModelPackage.LINKANDELEMENTASSOCIATION_CLASSIFIER_ID:
			modelObject = new LinkAndElementAssociationModelObject();
			break;
		case CapuaModelPackage.LINKANDCOLLECTIONASSOCIATION_CLASSIFIER_ID:
			modelObject = new LinkAndCollectionAssociationModelObject();
			break;
		case CapuaModelPackage.ELEMENTCOLLECTION_CLASSIFIER_ID:
			modelObject = new ElementCollectionModelObject();
			break;
		case CapuaModelPackage.ELEMENT_CLASSIFIER_ID:
			modelObject = new ElementModelObject();
			break;
		case CapuaModelPackage.ATTRIBUTE_CLASSIFIER_ID:
			modelObject = new AttributeModelObject();
			break;
		case CapuaModelPackage.ATTRIBUTETYPE_CLASSIFIER_ID:
			modelObject = new AttributeTypeModelObject();
			break;
		case CapuaModelPackage.ASSOCIATIONCOLLECTION_CLASSIFIER_ID:
			modelObject = new AssociationCollectionModelObject();
			break;
		case CapuaModelPackage.LINKCOLLECTION_CLASSIFIER_ID:
			modelObject = new LinkCollectionModelObject();
			break;
		case CapuaModelPackage.BACKGROUNDINFO_CLASSIFIER_ID:
			modelObject = new BackgroundInfoModelObject();
			break;
		case CapuaModelPackage.EVIDENCE_CLASSIFIER_ID:
			modelObject = new EvidenceModelObject();
			break;
		case CapuaModelPackage.INTERFACE_CLASSIFIER_ID:
			modelObject = new InterfaceModelObject();
			break;
		case CapuaModelPackage.PRIORITY_CLASSIFIER_ID:
			modelObject = new PriorityModelObject();
			break;
		case CapuaModelPackage.RATIONALE_CLASSIFIER_ID:
			modelObject = new RationaleModelObject();
			break;
		case CapuaModelPackage.MEASUREMENT_CLASSIFIER_ID:
			modelObject = new MeasurementModelObject();
			break;
		case CapuaModelPackage.DEFINITION_CLASSIFIER_ID:
			modelObject = new DefinitionModelObject();
			break;
		case CapuaModelPackage.GOAL_CLASSIFIER_ID:
			modelObject = new GoalModelObject();
			break;
		case CapuaModelPackage.STAKEHOLDER_CLASSIFIER_ID:
			modelObject = new StakeholderModelObject();
			break;
		case CapuaModelPackage.REQUIREMENT_CLASSIFIER_ID:
			modelObject = new RequirementModelObject();
			break;
		case CapuaModelPackage.FUNCTIONALREQUIREMENT_CLASSIFIER_ID:
			modelObject = new FunctionalRequirementModelObject();
			break;
		case CapuaModelPackage.QUALITYREQUIREMENT_CLASSIFIER_ID:
			modelObject = new QualityRequirementModelObject();
			break;
		case CapuaModelPackage.CONSTRAINTREQUIREMENT_CLASSIFIER_ID:
			modelObject = new ConstraintRequirementModelObject();
			break;
		case CapuaModelPackage.DOCUMENT_CLASSIFIER_ID:
			modelObject = new DocumentModelObject();
			break;
		case CapuaModelPackage.HEADING_CLASSIFIER_ID:
			modelObject = new HeadingModelObject();
			break;
		case CapuaModelPackage.PARAGRAPH_CLASSIFIER_ID:
			modelObject = new ParagraphModelObject();
			break;
		case CapuaModelPackage.SENTENCE_CLASSIFIER_ID:
			modelObject = new SentenceModelObject();
			break;
		case CapuaModelPackage.CONFIGURATIONITEM_CLASSIFIER_ID:
			modelObject = new ConfigurationItemModelObject();
			break;
		case CapuaModelPackage.SCENARIO_CLASSIFIER_ID:
			modelObject = new ScenarioModelObject();
			break;
		case CapuaModelPackage.SCENARIOSTEP_CLASSIFIER_ID:
			modelObject = new ScenarioStepModelObject();
			break;
		case CapuaModelPackage.ATTRIBUTECOLLECTION_CLASSIFIER_ID:
			modelObject = new AttributeCollectionModelObject();
			break;
		case CapuaModelPackage.MODELINFO_CLASSIFIER_ID:
			modelObject = new ModelInfoModelObject();
			break;
		case CapuaModelPackage.AUDIO_CLASSIFIER_ID:
			modelObject = new AudioModelObject();
			break;
		case CapuaModelPackage.VIDEO_CLASSIFIER_ID:
			modelObject = new VideoModelObject();
			break;
		case CapuaModelPackage.TEXT_CLASSIFIER_ID:
			modelObject = new TextModelObject();
			break;
		case CapuaModelPackage.ENUMERATION_CLASSIFIER_ID:
			modelObject = new EnumerationModelObject();
			break;
		case CapuaModelPackage.IMAGE_CLASSIFIER_ID:
			modelObject = new ImageModelObject();
			break;
		case CapuaModelPackage.BOOLEAN_CLASSIFIER_ID:
			modelObject = new BooleanModelObject();
			break;
		case CapuaModelPackage.REQUIREMENTSDOCUMENT_CLASSIFIER_ID:
			modelObject = new RequirementsDocumentModelObject();
			break;
		case CapuaModelPackage.EVIDENCEDOCUMENT_CLASSIFIER_ID:
			modelObject = new EvidenceDocumentModelObject();
			break;
		case CapuaModelPackage.PLAINDOCUMENT_CLASSIFIER_ID:
			modelObject = new PlainDocumentModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eStructuralFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Link
	 * @generated
	 */
	public Link createLink() {
		return new Link();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Association
	 * @generated
	 */
	public Association createAssociation() {
		return new Association();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         AttributeInstance
	 * @generated
	 */
	public AttributeInstance createAttributeInstance() {
		return new AttributeInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ElementAndElementLink
	 * @generated
	 */
	public ElementAndElementLink createElementAndElementLink() {
		return new ElementAndElementLink();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ElementAndCollectionLink
	 * @generated
	 */
	public ElementAndCollectionLink createElementAndCollectionLink() {
		return new ElementAndCollectionLink();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         CollectionAndCollectionLink
	 * @generated
	 */
	public CollectionAndCollectionLink createCollectionAndCollectionLink() {
		return new CollectionAndCollectionLink();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         LinkAndLinkAssociation
	 * @generated
	 */
	public LinkAndLinkAssociation createLinkAndLinkAssociation() {
		return new LinkAndLinkAssociation();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         LinkAndElementAssociation
	 * @generated
	 */
	public LinkAndElementAssociation createLinkAndElementAssociation() {
		return new LinkAndElementAssociation();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         LinkAndCollectionAssociation
	 * @generated
	 */
	public LinkAndCollectionAssociation createLinkAndCollectionAssociation() {
		return new LinkAndCollectionAssociation();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Attribute
	 * @generated
	 */
	public Attribute createAttribute() {
		return new Attribute();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         AttributeType
	 * @generated
	 */
	public AttributeType createAttributeType() {
		return new AttributeType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         AssociationCollection
	 * @generated
	 */
	public AssociationCollection createAssociationCollection() {
		return new AssociationCollection();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         LinkCollection
	 * @generated
	 */
	public LinkCollection createLinkCollection() {
		return new LinkCollection();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         BackgroundInfo
	 * @generated
	 */
	public BackgroundInfo createBackgroundInfo() {
		return new BackgroundInfo();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Evidence
	 * @generated
	 */
	public Evidence createEvidence() {
		return new Evidence();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Interface
	 * @generated
	 */
	public Interface createInterface() {
		return new Interface();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Priority
	 * @generated
	 */
	public Priority createPriority() {
		return new Priority();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Rationale
	 * @generated
	 */
	public Rationale createRationale() {
		return new Rationale();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Measurement
	 * @generated
	 */
	public Measurement createMeasurement() {
		return new Measurement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Definition
	 * @generated
	 */
	public Definition createDefinition() {
		return new Definition();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Goal
	 * @generated
	 */
	public Goal createGoal() {
		return new Goal();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Stakeholder
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		return new Stakeholder();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Requirement
	 * @generated
	 */
	public Requirement createRequirement() {
		return new Requirement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         FunctionalRequirement
	 * @generated
	 */
	public FunctionalRequirement createFunctionalRequirement() {
		return new FunctionalRequirement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         QualityRequirement
	 * @generated
	 */
	public QualityRequirement createQualityRequirement() {
		return new QualityRequirement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ConstraintRequirement
	 * @generated
	 */
	public ConstraintRequirement createConstraintRequirement() {
		return new ConstraintRequirement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Heading
	 * @generated
	 */
	public Heading createHeading() {
		return new Heading();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Paragraph
	 * @generated
	 */
	public Paragraph createParagraph() {
		return new Paragraph();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Sentence
	 * @generated
	 */
	public Sentence createSentence() {
		return new Sentence();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ConfigurationItem
	 * @generated
	 */
	public ConfigurationItem createConfigurationItem() {
		return new ConfigurationItem();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Scenario
	 * @generated
	 */
	public Scenario createScenario() {
		return new Scenario();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ScenarioStep
	 * @generated
	 */
	public ScenarioStep createScenarioStep() {
		return new ScenarioStep();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         AttributeCollection
	 * @generated
	 */
	public AttributeCollection createAttributeCollection() {
		return new AttributeCollection();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass ModelInfo
	 * @generated
	 */
	public ModelInfo createModelInfo() {
		return new ModelInfo();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Audio
	 * @generated
	 */
	public Audio createAudio() {
		return new Audio();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Video
	 * @generated
	 */
	public Video createVideo() {
		return new Video();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Text
	 * @generated
	 */
	public Text createText() {
		return new Text();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Enumeration
	 * @generated
	 */
	public Enumeration createEnumeration() {
		return new Enumeration();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Image
	 * @generated
	 */
	public Image createImage() {
		return new Image();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Boolean
	 * @generated
	 */
	public Boolean createBoolean() {
		return new Boolean();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         RequirementsDocument
	 * @generated
	 */
	public RequirementsDocument createRequirementsDocument() {
		return new RequirementsDocument();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         EvidenceDocument
	 * @generated
	 */
	public EvidenceDocument createEvidenceDocument() {
		return new EvidenceDocument();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         PlainDocument
	 * @generated
	 */
	public PlainDocument createPlainDocument() {
		return new PlainDocument();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage");
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		}
		throw new IllegalArgumentException("The EDatatype '" + eDataType
				+ "' is not defined in this EPackage.");
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>NamedObject</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class NamedObjectModelObject<E extends NamedObject> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getNamedObjectEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.NAMEDOBJECT_NAME_FEATURE_ID:
				return getTarget().getName();
			case CapuaModelPackage.NAMEDOBJECT_ID_FEATURE_ID:
				return getTarget().getId();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.NAMEDOBJECT_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case CapuaModelPackage.NAMEDOBJECT_ID_FEATURE_ID:
				getTarget().setId((String) value);
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AttributedObject</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AttributedObjectModelObject<E extends AttributedObject>
			extends NamedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAttributedObjectEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTEDOBJECT_INLINKS_FEATURE_ID:
				return getTarget().getInLinks();
			case CapuaModelPackage.ATTRIBUTEDOBJECT_OUTLINKS_FEATURE_ID:
				return getTarget().getOutLinks();
			case CapuaModelPackage.ATTRIBUTEDOBJECT_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				return getTarget().getParticipatedAssociations();
			case CapuaModelPackage.ATTRIBUTEDOBJECT_ATTRIBUTEINSTANCES_FEATURE_ID:
				return getTarget().getAttributeInstances();
			case CapuaModelPackage.ATTRIBUTEDOBJECT_COLLECTIONS_FEATURE_ID:
				return getTarget().getCollections();
			case CapuaModelPackage.ATTRIBUTEDOBJECT_CHILDREN_FEATURE_ID:
				return getTarget().getChildren();
			case CapuaModelPackage.ATTRIBUTEDOBJECT_PARENT_FEATURE_ID:
				return getTarget().getParent();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTEDOBJECT_INLINKS_FEATURE_ID:
				getTarget().setInLinks((List<Link>) value);
				return;
			case CapuaModelPackage.ATTRIBUTEDOBJECT_OUTLINKS_FEATURE_ID:
				getTarget().setOutLinks((List<Link>) value);
				return;
			case CapuaModelPackage.ATTRIBUTEDOBJECT_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				getTarget().setParticipatedAssociations(
						(List<Association>) value);
				return;
			case CapuaModelPackage.ATTRIBUTEDOBJECT_ATTRIBUTEINSTANCES_FEATURE_ID:
				getTarget().setAttributeInstances(
						(List<AttributeInstance>) value);
				return;
			case CapuaModelPackage.ATTRIBUTEDOBJECT_COLLECTIONS_FEATURE_ID:
				getTarget().setCollections((List<ObjectCollection>) value);
				return;
			case CapuaModelPackage.ATTRIBUTEDOBJECT_CHILDREN_FEATURE_ID:
				getTarget().setChildren((List<AttributedObject>) value);
				return;
			case CapuaModelPackage.ATTRIBUTEDOBJECT_PARENT_FEATURE_ID:
				getTarget().setParent((AttributedObject) value);
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

			case CapuaModelPackage.ATTRIBUTEDOBJECT_INLINKS_FEATURE_ID:
				getTarget().getInLinks().add((Link) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_OUTLINKS_FEATURE_ID:
				getTarget().getOutLinks().add((Link) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				getTarget().getParticipatedAssociations().add(
						(Association) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_ATTRIBUTEINSTANCES_FEATURE_ID:
				getTarget().getAttributeInstances().add(
						(AttributeInstance) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_COLLECTIONS_FEATURE_ID:
				getTarget().getCollections().add((ObjectCollection) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_CHILDREN_FEATURE_ID:
				getTarget().getChildren().add((AttributedObject) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CapuaModelPackage.ATTRIBUTEDOBJECT_INLINKS_FEATURE_ID:
				getTarget().getInLinks().remove((Link) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_OUTLINKS_FEATURE_ID:
				getTarget().getOutLinks().remove((Link) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				getTarget().getParticipatedAssociations().remove(
						(Association) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_ATTRIBUTEINSTANCES_FEATURE_ID:
				getTarget().getAttributeInstances().remove(
						(AttributeInstance) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_COLLECTIONS_FEATURE_ID:
				getTarget().getCollections().remove((ObjectCollection) value);
				return;

			case CapuaModelPackage.ATTRIBUTEDOBJECT_CHILDREN_FEATURE_ID:
				getTarget().getChildren().remove((AttributedObject) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Link</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class LinkModelObject<E extends Link> extends
			AttributedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getLinkEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.LINK_TARGET_FEATURE_ID:
				return getTarget().getTarget();
			case CapuaModelPackage.LINK_SOURCE_FEATURE_ID:
				return getTarget().getSource();
			case CapuaModelPackage.LINK_ASSOCIATIONS_FEATURE_ID:
				return getTarget().getAssociations();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.LINK_TARGET_FEATURE_ID:
				getTarget().setTarget((AttributedObject) value);
				return;
			case CapuaModelPackage.LINK_SOURCE_FEATURE_ID:
				getTarget().setSource((AttributedObject) value);
				return;
			case CapuaModelPackage.LINK_ASSOCIATIONS_FEATURE_ID:
				getTarget().setAssociations((List<Association>) value);
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

			case CapuaModelPackage.LINK_ASSOCIATIONS_FEATURE_ID:
				getTarget().getAssociations().add((Association) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CapuaModelPackage.LINK_ASSOCIATIONS_FEATURE_ID:
				getTarget().getAssociations().remove((Association) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Association</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AssociationModelObject<E extends Association> extends
			LinkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAssociationEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ASSOCIATION_LINK_FEATURE_ID:
				return getTarget().getLink();
			case CapuaModelPackage.ASSOCIATION_ASSOCIATEDOBJECT_FEATURE_ID:
				return getTarget().getAssociatedObject();
			case CapuaModelPackage.ASSOCIATION_INLINKS_FEATURE_ID:
				return getTarget().getInLinks();
			case CapuaModelPackage.ASSOCIATION_OUTLINKS_FEATURE_ID:
				return getTarget().getOutLinks();
			case CapuaModelPackage.ASSOCIATION_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				return getTarget().getParticipatedAssociations();
			case CapuaModelPackage.ASSOCIATION_ATTRIBUTEINSTANCES_FEATURE_ID:
				return getTarget().getAttributeInstances();
			case CapuaModelPackage.ASSOCIATION_COLLECTIONS_FEATURE_ID:
				return getTarget().getCollections();
			case CapuaModelPackage.ASSOCIATION_CHILDREN_FEATURE_ID:
				return getTarget().getChildren();
			case CapuaModelPackage.ASSOCIATION_PARENT_FEATURE_ID:
				return getTarget().getParent();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ASSOCIATION_LINK_FEATURE_ID:
				getTarget().setLink((Link) value);
				return;
			case CapuaModelPackage.ASSOCIATION_ASSOCIATEDOBJECT_FEATURE_ID:
				getTarget().setAssociatedObject((AttributedObject) value);
				return;
			case CapuaModelPackage.ASSOCIATION_INLINKS_FEATURE_ID:
				getTarget().setInLinks((List<Link>) value);
				return;
			case CapuaModelPackage.ASSOCIATION_OUTLINKS_FEATURE_ID:
				getTarget().setOutLinks((List<Link>) value);
				return;
			case CapuaModelPackage.ASSOCIATION_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				getTarget().setParticipatedAssociations(
						(List<Association>) value);
				return;
			case CapuaModelPackage.ASSOCIATION_ATTRIBUTEINSTANCES_FEATURE_ID:
				getTarget().setAttributeInstances(
						(List<AttributeInstance>) value);
				return;
			case CapuaModelPackage.ASSOCIATION_COLLECTIONS_FEATURE_ID:
				getTarget().setCollections((List<ObjectCollection>) value);
				return;
			case CapuaModelPackage.ASSOCIATION_CHILDREN_FEATURE_ID:
				getTarget().setChildren((List<AttributedObject>) value);
				return;
			case CapuaModelPackage.ASSOCIATION_PARENT_FEATURE_ID:
				getTarget().setParent((AttributedObject) value);
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

			case CapuaModelPackage.ASSOCIATION_INLINKS_FEATURE_ID:
				getTarget().getInLinks().add((Link) value);
				return;

			case CapuaModelPackage.ASSOCIATION_OUTLINKS_FEATURE_ID:
				getTarget().getOutLinks().add((Link) value);
				return;

			case CapuaModelPackage.ASSOCIATION_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				getTarget().getParticipatedAssociations().add(
						(Association) value);
				return;

			case CapuaModelPackage.ASSOCIATION_ATTRIBUTEINSTANCES_FEATURE_ID:
				getTarget().getAttributeInstances().add(
						(AttributeInstance) value);
				return;

			case CapuaModelPackage.ASSOCIATION_COLLECTIONS_FEATURE_ID:
				getTarget().getCollections().add((ObjectCollection) value);
				return;

			case CapuaModelPackage.ASSOCIATION_CHILDREN_FEATURE_ID:
				getTarget().getChildren().add((AttributedObject) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CapuaModelPackage.ASSOCIATION_INLINKS_FEATURE_ID:
				getTarget().getInLinks().remove((Link) value);
				return;

			case CapuaModelPackage.ASSOCIATION_OUTLINKS_FEATURE_ID:
				getTarget().getOutLinks().remove((Link) value);
				return;

			case CapuaModelPackage.ASSOCIATION_PARTICIPATEDASSOCIATIONS_FEATURE_ID:
				getTarget().getParticipatedAssociations().remove(
						(Association) value);
				return;

			case CapuaModelPackage.ASSOCIATION_ATTRIBUTEINSTANCES_FEATURE_ID:
				getTarget().getAttributeInstances().remove(
						(AttributeInstance) value);
				return;

			case CapuaModelPackage.ASSOCIATION_COLLECTIONS_FEATURE_ID:
				getTarget().getCollections().remove((ObjectCollection) value);
				return;

			case CapuaModelPackage.ASSOCIATION_CHILDREN_FEATURE_ID:
				getTarget().getChildren().remove((AttributedObject) value);
				return;

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AttributeInstance</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AttributeInstanceModelObject<E extends AttributeInstance>
			extends AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAttributeInstanceEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTEINSTANCE_INSTANTIATES_FEATURE_ID:
				return getTarget().getInstantiates();
			case CapuaModelPackage.ATTRIBUTEINSTANCE_VALUE_FEATURE_ID:
				return getTarget().getValue();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTEINSTANCE_INSTANTIATES_FEATURE_ID:
				getTarget().setInstantiates((Attribute) value);
				return;
			case CapuaModelPackage.ATTRIBUTEINSTANCE_VALUE_FEATURE_ID:
				getTarget().setValue((Element) value);
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ObjectCollection</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ObjectCollectionModelObject<E extends ObjectCollection>
			extends AttributedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getObjectCollectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.OBJECTCOLLECTION_OBJECTS_FEATURE_ID:
				return getTarget().getObjects();
			case CapuaModelPackage.OBJECTCOLLECTION_ROOT_FEATURE_ID:
				return getTarget().getRoot();
			case CapuaModelPackage.OBJECTCOLLECTION_ATTRIBUTES_FEATURE_ID:
				return getTarget().getAttributes();
			case CapuaModelPackage.OBJECTCOLLECTION_TYPES_FEATURE_ID:
				return getTarget().getTypes();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.OBJECTCOLLECTION_OBJECTS_FEATURE_ID:
				getTarget().setObjects((List<AttributedObject>) value);
				return;
			case CapuaModelPackage.OBJECTCOLLECTION_ROOT_FEATURE_ID:
				getTarget().setRoot((Boolean) value);
				return;
			case CapuaModelPackage.OBJECTCOLLECTION_ATTRIBUTES_FEATURE_ID:
				getTarget().setAttributes((List<Attribute>) value);
				return;
			case CapuaModelPackage.OBJECTCOLLECTION_TYPES_FEATURE_ID:
				getTarget().setTypes((List<AttributeType>) value);
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

			case CapuaModelPackage.OBJECTCOLLECTION_OBJECTS_FEATURE_ID:
				getTarget().getObjects().add((AttributedObject) value);
				return;

			case CapuaModelPackage.OBJECTCOLLECTION_ATTRIBUTES_FEATURE_ID:
				getTarget().getAttributes().add((Attribute) value);
				return;

			case CapuaModelPackage.OBJECTCOLLECTION_TYPES_FEATURE_ID:
				getTarget().getTypes().add((AttributeType) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CapuaModelPackage.OBJECTCOLLECTION_OBJECTS_FEATURE_ID:
				getTarget().getObjects().remove((AttributedObject) value);
				return;

			case CapuaModelPackage.OBJECTCOLLECTION_ATTRIBUTES_FEATURE_ID:
				getTarget().getAttributes().remove((Attribute) value);
				return;

			case CapuaModelPackage.OBJECTCOLLECTION_TYPES_FEATURE_ID:
				getTarget().getTypes().remove((AttributeType) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ElementAndElementLink</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ElementAndElementLinkModelObject<E extends ElementAndElementLink>
			extends LinkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getElementAndElementLinkEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '
	 * <em><b>ElementAndCollectionLink</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ElementAndCollectionLinkModelObject<E extends ElementAndCollectionLink>
			extends LinkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE
					.getElementAndCollectionLinkEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '
	 * <em><b>CollectionAndCollectionLink</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class CollectionAndCollectionLinkModelObject<E extends CollectionAndCollectionLink>
			extends LinkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE
					.getCollectionAndCollectionLinkEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '
	 * <em><b>LinkAndLinkAssociation</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static class LinkAndLinkAssociationModelObject<E extends LinkAndLinkAssociation>
			extends AssociationModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getLinkAndLinkAssociationEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '
	 * <em><b>LinkAndElementAssociation</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static class LinkAndElementAssociationModelObject<E extends LinkAndElementAssociation>
			extends AssociationModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE
					.getLinkAndElementAssociationEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '
	 * <em><b>LinkAndCollectionAssociation</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class LinkAndCollectionAssociationModelObject<E extends LinkAndCollectionAssociation>
			extends AssociationModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE
					.getLinkAndCollectionAssociationEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ElementCollection</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ElementCollectionModelObject<E extends ElementCollection>
			extends ObjectCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getElementCollectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ELEMENTCOLLECTION_ELEMENTS_FEATURE_ID:
				return getTarget().getElements();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ELEMENTCOLLECTION_ELEMENTS_FEATURE_ID:
				getTarget().setElements((List<Element>) value);
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

			case CapuaModelPackage.ELEMENTCOLLECTION_ELEMENTS_FEATURE_ID:
				getTarget().getElements().add((Element) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}

		/**
		 * @generated
		 */
		@Override
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case CapuaModelPackage.ELEMENTCOLLECTION_ELEMENTS_FEATURE_ID:
				getTarget().getElements().remove((Element) value);
				return;
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Element</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ElementModelObject<E extends Element> extends
			AttributedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getElementEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ELEMENT_OWNERCOLLECTION_FEATURE_ID:
				return getTarget().getOwnerCollection();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ELEMENT_OWNERCOLLECTION_FEATURE_ID:
				getTarget().setOwnerCollection((ElementCollection) value);
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Attribute</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AttributeModelObject<E extends Attribute> extends
			NamedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAttributeEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTE_TYPE_FEATURE_ID:
				return getTarget().getType();
			case CapuaModelPackage.ATTRIBUTE_OWNER_FEATURE_ID:
				return getTarget().getOwner();
			case CapuaModelPackage.ATTRIBUTE_DEFAULTVALUE_FEATURE_ID:
				return getTarget().getDefaultValue();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTE_TYPE_FEATURE_ID:
				getTarget().setType((AttributeType) value);
				return;
			case CapuaModelPackage.ATTRIBUTE_OWNER_FEATURE_ID:
				getTarget().setOwner((ObjectCollection) value);
				return;
			case CapuaModelPackage.ATTRIBUTE_DEFAULTVALUE_FEATURE_ID:
				getTarget().setDefaultValue((Element) value);
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AttributeType</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AttributeTypeModelObject<E extends AttributeType>
			extends NamedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAttributeTypeEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTETYPE_OWNER_FEATURE_ID:
				return getTarget().getOwner();
			case CapuaModelPackage.ATTRIBUTETYPE_DEFINITION_FEATURE_ID:
				return getTarget().getDefinition();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.ATTRIBUTETYPE_OWNER_FEATURE_ID:
				getTarget().setOwner((ObjectCollection) value);
				return;
			case CapuaModelPackage.ATTRIBUTETYPE_DEFINITION_FEATURE_ID:
				getTarget().setDefinition((String) value);
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AssociationCollection</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AssociationCollectionModelObject<E extends AssociationCollection>
			extends ObjectCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAssociationCollectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>LinkCollection</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class LinkCollectionModelObject<E extends LinkCollection>
			extends ObjectCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getLinkCollectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>BackgroundInfo</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class BackgroundInfoModelObject<E extends BackgroundInfo>
			extends ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getBackgroundInfoEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Evidence</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class EvidenceModelObject<E extends Evidence> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getEvidenceEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Interface</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class InterfaceModelObject<E extends Interface> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getInterfaceEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Priority</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class PriorityModelObject<E extends Priority> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getPriorityEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Rationale</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class RationaleModelObject<E extends Rationale> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getRationaleEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Measurement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class MeasurementModelObject<E extends Measurement> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getMeasurementEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Definition</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class DefinitionModelObject<E extends Definition> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getDefinitionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Goal</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class GoalModelObject<E extends Goal> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getGoalEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Stakeholder</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class StakeholderModelObject<E extends Stakeholder> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getStakeholderEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Requirement</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class RequirementModelObject<E extends Requirement> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getRequirementEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>FunctionalRequirement</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class FunctionalRequirementModelObject<E extends FunctionalRequirement>
			extends RequirementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getFunctionalRequirementEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>QualityRequirement</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class QualityRequirementModelObject<E extends QualityRequirement>
			extends RequirementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getQualityRequirementEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ConstraintRequirement</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ConstraintRequirementModelObject<E extends ConstraintRequirement>
			extends RequirementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getConstraintRequirementEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Document</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class DocumentModelObject<E extends Document> extends
			ElementCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getDocumentEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Heading</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class HeadingModelObject<E extends Heading> extends
			ElementCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getHeadingEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Paragraph</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ParagraphModelObject<E extends Paragraph> extends
			ElementCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getParagraphEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Sentence</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class SentenceModelObject<E extends Sentence> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getSentenceEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ConfigurationItem</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ConfigurationItemModelObject<E extends ConfigurationItem>
			extends ElementCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getConfigurationItemEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Scenario</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ScenarioModelObject<E extends Scenario> extends
			ElementCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getScenarioEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ScenarioStep</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ScenarioStepModelObject<E extends ScenarioStep> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getScenarioStepEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AttributeCollection</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AttributeCollectionModelObject<E extends AttributeCollection>
			extends ObjectCollectionModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAttributeCollectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ModelInfo</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ModelInfoModelObject<E extends ModelInfo> extends
			NamedObjectModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getModelInfoEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.MODELINFO_VERSION_FEATURE_ID:
				return getTarget().getVersion();
			case CapuaModelPackage.MODELINFO_NOTES_FEATURE_ID:
				return getTarget().getNotes();
			case CapuaModelPackage.MODELINFO_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case CapuaModelPackage.MODELINFO_VERSION_FEATURE_ID:
				getTarget().setVersion((String) value);
				return;
			case CapuaModelPackage.MODELINFO_NOTES_FEATURE_ID:
				getTarget().setNotes((List<String>) value);
				return;
			case CapuaModelPackage.MODELINFO_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Audio</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class AudioModelObject<E extends Audio> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getAudioEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Video</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class VideoModelObject<E extends Video> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getVideoEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Text</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class TextModelObject<E extends Text> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getTextEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Enumeration</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class EnumerationModelObject<E extends Enumeration> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getEnumerationEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Image</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class ImageModelObject<E extends Image> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getImageEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Boolean</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class BooleanModelObject<E extends Boolean> extends
			ElementModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getBooleanEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>RequirementsDocument</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class RequirementsDocumentModelObject<E extends RequirementsDocument>
			extends DocumentModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getRequirementsDocumentEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>EvidenceDocument</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class EvidenceDocumentModelObject<E extends EvidenceDocument>
			extends DocumentModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getEvidenceDocumentEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>PlainDocument</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static class PlainDocumentModelObject<E extends PlainDocument>
			extends DocumentModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return CapuaModelPackage.INSTANCE.getPlainDocumentEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return CapuaModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			return super.eGet(eStructuralFeature);
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
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
		public void eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			}
			super.eAddTo(eStructuralFeature, value);
		}
	}

}
