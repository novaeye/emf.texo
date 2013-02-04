/**
 */
package identifiable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see identifiable.IdentifiableFactory
 * @model kind="package"
 * @generated
 */
public interface IdentifiablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "identifiable";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model/base/identifiable";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "identifiable";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentifiablePackage eINSTANCE = identifiable.impl.IdentifiablePackageImpl.init();

	/**
	 * The meta object id for the '{@link identifiable.impl.IdentifiableImpl <em>Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see identifiable.impl.IdentifiableImpl
	 * @see identifiable.impl.IdentifiablePackageImpl#getIdentifiable()
	 * @generated
	 */
	int IDENTIFIABLE = 0;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DB_ID = 0;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE__DB_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link identifiable.IdentifiableInterface <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see identifiable.IdentifiableInterface
	 * @see identifiable.impl.IdentifiablePackageImpl#getIdentifiableInterface()
	 * @generated
	 */
	int IDENTIFIABLE_INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Db Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_INTERFACE__DB_ID = 0;

	/**
	 * The feature id for the '<em><b>Db version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_INTERFACE__DB_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_INTERFACE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link identifiable.impl.NotIdentifiableImpl <em>Not Identifiable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see identifiable.impl.NotIdentifiableImpl
	 * @see identifiable.impl.IdentifiablePackageImpl#getNotIdentifiable()
	 * @generated
	 */
	int NOT_IDENTIFIABLE = 2;

	/**
	 * The number of structural features of the '<em>Not Identifiable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_IDENTIFIABLE_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link identifiable.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable</em>'.
	 * @see identifiable.Identifiable
	 * @generated
	 */
	EClass getIdentifiable();

	/**
	 * Returns the meta object for the attribute '{@link identifiable.Identifiable#getDb_Id <em>Db Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Id</em>'.
	 * @see identifiable.Identifiable#getDb_Id()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Db_Id();

	/**
	 * Returns the meta object for the attribute '{@link identifiable.Identifiable#getDb_version <em>Db version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db version</em>'.
	 * @see identifiable.Identifiable#getDb_version()
	 * @see #getIdentifiable()
	 * @generated
	 */
	EAttribute getIdentifiable_Db_version();

	/**
	 * Returns the meta object for class '{@link identifiable.IdentifiableInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see identifiable.IdentifiableInterface
	 * @generated
	 */
	EClass getIdentifiableInterface();

	/**
	 * Returns the meta object for the attribute '{@link identifiable.IdentifiableInterface#getDb_Id <em>Db Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db Id</em>'.
	 * @see identifiable.IdentifiableInterface#getDb_Id()
	 * @see #getIdentifiableInterface()
	 * @generated
	 */
	EAttribute getIdentifiableInterface_Db_Id();

	/**
	 * Returns the meta object for the attribute '{@link identifiable.IdentifiableInterface#getDb_version <em>Db version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Db version</em>'.
	 * @see identifiable.IdentifiableInterface#getDb_version()
	 * @see #getIdentifiableInterface()
	 * @generated
	 */
	EAttribute getIdentifiableInterface_Db_version();

	/**
	 * Returns the meta object for class '{@link identifiable.NotIdentifiable <em>Not Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Identifiable</em>'.
	 * @see identifiable.NotIdentifiable
	 * @generated
	 */
	EClass getNotIdentifiable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IdentifiableFactory getIdentifiableFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link identifiable.impl.IdentifiableImpl <em>Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see identifiable.impl.IdentifiableImpl
		 * @see identifiable.impl.IdentifiablePackageImpl#getIdentifiable()
		 * @generated
		 */
		EClass IDENTIFIABLE = eINSTANCE.getIdentifiable();

		/**
		 * The meta object literal for the '<em><b>Db Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__DB_ID = eINSTANCE.getIdentifiable_Db_Id();

		/**
		 * The meta object literal for the '<em><b>Db version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE__DB_VERSION = eINSTANCE.getIdentifiable_Db_version();

		/**
		 * The meta object literal for the '{@link identifiable.IdentifiableInterface <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see identifiable.IdentifiableInterface
		 * @see identifiable.impl.IdentifiablePackageImpl#getIdentifiableInterface()
		 * @generated
		 */
		EClass IDENTIFIABLE_INTERFACE = eINSTANCE.getIdentifiableInterface();

		/**
		 * The meta object literal for the '<em><b>Db Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_INTERFACE__DB_ID = eINSTANCE.getIdentifiableInterface_Db_Id();

		/**
		 * The meta object literal for the '<em><b>Db version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_INTERFACE__DB_VERSION = eINSTANCE.getIdentifiableInterface_Db_version();

		/**
		 * The meta object literal for the '{@link identifiable.impl.NotIdentifiableImpl <em>Not Identifiable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see identifiable.impl.NotIdentifiableImpl
		 * @see identifiable.impl.IdentifiablePackageImpl#getNotIdentifiable()
		 * @generated
		 */
		EClass NOT_IDENTIFIABLE = eINSTANCE.getNotIdentifiable();

	}

} //IdentifiablePackage
