package texo.test;

/**
 * The <b>Package</b> for the model '<em><b>test</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestModelPackage extends org.eclipse.emf.texo.model.ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String NS_URI = "http://www.eclipse.org/emf/texo/test/model/issues/bz325429";

	/**
	 * The {@link org.eclipse.emf.texo.model.ModelFactory} for this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestModelFactory MODELFACTORY = new TestModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTACTTYPE_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON_FIRSTNAME_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON_LASTNAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON_ADDRESS_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERSON_CONTACTS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDRESS_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDRESS_STREET_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADDRESS_CITY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTACT_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTACT_VALUE_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTACT_TYPE_FEATURE_ID = 1;

	/**
	 * The static member with the instance of this {@link ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link org.eclipse.emf.texo.model.ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestModelPackage initialize() {

		if (isInitialized) {
			return (TestModelPackage) org.eclipse.emf.texo.model.ModelResolver
					.getInstance().getModelPackage(NS_URI);
		}

		final TestModelPackage modelPackage = new TestModelPackage();

		// read the model from the ecore file, the EPackage is registered in the EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		org.eclipse.emf.texo.utils.ModelUtils
				.readEPackagesFromFile(modelPackage);

		// register the relation between a Class and its EClassifier
		org.eclipse.emf.texo.model.ModelResolver.getInstance()
				.registerClassModelMapping(texo.test.Person.class,
						modelPackage.getPersonEClass(), modelPackage);
		org.eclipse.emf.texo.model.ModelResolver.getInstance()
				.registerClassModelMapping(texo.test.Address.class,
						modelPackage.getAddressEClass(), modelPackage);
		org.eclipse.emf.texo.model.ModelResolver.getInstance()
				.registerClassModelMapping(texo.test.Contact.class,
						modelPackage.getContactEClass(), modelPackage);

		org.eclipse.emf.texo.model.ModelResolver.getInstance()
				.registerClassModelMapping(texo.test.ContactType.class,
						modelPackage.getContactTypeEEnum(), modelPackage);

		org.eclipse.emf.texo.model.ModelResolver.getInstance()
				.registerModelPackage(modelPackage);

		isInitialized = true;

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link org.eclipse.emf.texo.model.ModelFactory} of this ModelPackage.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the {@link TestModelFactory} instance.
	 * @generated
	 */
	@Override
	public TestModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/** 
	 * Returns the nsUri of the {@link org.eclipse.emf.ecore.EPackage} managed by this Package instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the nsUri of the EPackage 
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/** 
	 * Returns the name of the ecore file containing the ecore model of the {@link org.eclipse.emf.ecore.EPackage} managed here.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the name of the ecore file 
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "test.ecore";
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EClass} '<em><b>Person</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EClass} '<em><b>Person</b></em>' 
	 * @generated
	 */
	public org.eclipse.emf.ecore.EClass getPersonEClass() {
		return (org.eclipse.emf.ecore.EClass) getEPackage().getEClassifiers()
				.get(PERSON_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Person.firstname</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Person.firstname</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EAttribute getPerson_Firstname() {
		return (org.eclipse.emf.ecore.EAttribute) getPersonEClass()
				.getEAllStructuralFeatures().get(PERSON_FIRSTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Person.lastname</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Person.lastname</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EAttribute getPerson_Lastname() {
		return (org.eclipse.emf.ecore.EAttribute) getPersonEClass()
				.getEAllStructuralFeatures().get(PERSON_LASTNAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Person.address</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Person.address</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EReference getPerson_Address() {
		return (org.eclipse.emf.ecore.EReference) getPersonEClass()
				.getEAllStructuralFeatures().get(PERSON_ADDRESS_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Person.contacts</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Person.contacts</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EReference getPerson_Contacts() {
		return (org.eclipse.emf.ecore.EReference) getPersonEClass()
				.getEAllStructuralFeatures().get(PERSON_CONTACTS_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EClass} '<em><b>Address</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EClass} '<em><b>Address</b></em>' 
	 * @generated
	 */
	public org.eclipse.emf.ecore.EClass getAddressEClass() {
		return (org.eclipse.emf.ecore.EClass) getEPackage().getEClassifiers()
				.get(ADDRESS_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Address.street</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Address.street</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EAttribute getAddress_Street() {
		return (org.eclipse.emf.ecore.EAttribute) getAddressEClass()
				.getEAllStructuralFeatures().get(ADDRESS_STREET_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Address.city</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Address.city</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EAttribute getAddress_City() {
		return (org.eclipse.emf.ecore.EAttribute) getAddressEClass()
				.getEAllStructuralFeatures().get(ADDRESS_CITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EClass} '<em><b>Contact</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EClass} '<em><b>Contact</b></em>' 
	 * @generated
	 */
	public org.eclipse.emf.ecore.EClass getContactEClass() {
		return (org.eclipse.emf.ecore.EClass) getEPackage().getEClassifiers()
				.get(CONTACT_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Contact.value</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Contact.value</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EAttribute getContact_Value() {
		return (org.eclipse.emf.ecore.EAttribute) getContactEClass()
				.getEAllStructuralFeatures().get(CONTACT_VALUE_FEATURE_ID);
	}

	/**
	 * Returns the {@link org.eclipse.emf.ecore.EStructuralFeature} '<em><b>Contact.type</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link org.eclipse.emf.ecore.EStructuralFeature}: '<em><b>Contact.type</b></em>'.
	 * @generated
	 */
	public org.eclipse.emf.ecore.EAttribute getContact_Type() {
		return (org.eclipse.emf.ecore.EAttribute) getContactEClass()
				.getEAllStructuralFeatures().get(CONTACT_TYPE_FEATURE_ID);
	}

	/**
	 * Returns the EEnum '<em><b>ContactType</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the EEnum representing '<em><b>ContactType</b></em>'
	 * @generated
	 */
	public org.eclipse.emf.ecore.EEnum getContactTypeEEnum() {
		return (org.eclipse.emf.ecore.EEnum) getEPackage().getEClassifiers()
				.get(CONTACTTYPE_CLASSIFIER_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClassifier
	 *            the {@link org.eclipse.emf.ecore.EClassifier}
	 * @return the class implementing a specific {@link org.eclipse.emf.ecore.EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(
			org.eclipse.emf.ecore.EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case PERSON_CLASSIFIER_ID:
			return texo.test.Person.class;
		case ADDRESS_CLASSIFIER_ID:
			return texo.test.Address.class;
		case CONTACT_CLASSIFIER_ID:
			return texo.test.Contact.class;
		case CONTACTTYPE_CLASSIFIER_ID:
			return texo.test.ContactType.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
