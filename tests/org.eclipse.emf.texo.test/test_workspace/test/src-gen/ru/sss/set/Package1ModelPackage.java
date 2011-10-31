package ru.sss.set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * The <b>Package</b> for the model '<em><b>package1</b></em>'.
 * It contains initialization code and access to the Factory to instantiate types of this package.
 * 
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Package1ModelPackage extends ModelPackage {

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
	public static final String NS_URI = "http://sss.ru/set";

	/**
	 * The {@link ModelFactory} for this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Package1ModelFactory MODELFACTORY = new Package1ModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASS1_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CLASS1_ATTR1_FEATURE_ID = 0;

	/**
	 * The static member with the instance of this {@link ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Package1ModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Package1ModelPackage initialize() {

		if (isInitialized) {
			return (Package1ModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final Package1ModelPackage modelPackage = new Package1ModelPackage();

		// read the model from the ecore file, the EPackage is registered in the EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(Class1.class,
				modelPackage.getClass1EClass(), modelPackage);

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		isInitialized = true;

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the {@link Package1ModelFactory} instance.
	 * @generated
	 */
	@Override
	public Package1ModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/** 
	 * Returns the nsUri of the {@link EPackage} managed by this Package instance.
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
	 * Returns the name of the ecore file containing the ecore model of the {@link EPackage} managed here.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the name of the ecore file 
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "package1.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Class1</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EClass} '<em><b>Class1</b></em>' 
	 * @generated
	 */
	public EClass getClass1EClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				CLASS1_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Class1.attr1</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return an instance of the {@link EStructuralFeature}: '<em><b>Class1.attr1</b></em>'.
	 * @generated
	 */
	public EAttribute getClass1_Attr1() {
		return (EAttribute) getClass1EClass().getEAllStructuralFeatures().get(
				CLASS1_ATTR1_FEATURE_ID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case CLASS1_CLASSIFIER_ID:
			return Class1.class;
		}
		throw new IllegalArgumentException("The EClassifier '" + eClassifier
				+ "' is not defined in this EPackage");
	}
}
