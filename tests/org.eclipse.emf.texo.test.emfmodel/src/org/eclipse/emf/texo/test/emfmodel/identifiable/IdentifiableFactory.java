/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.test.emfmodel.identifiable;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.texo.test.emfmodel.identifiable.IdentifiablePackage
 * @generated
 */
public interface IdentifiableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IdentifiableFactory eINSTANCE = org.eclipse.emf.texo.test.emfmodel.identifiable.impl.IdentifiableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Not Identifiable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Identifiable</em>'.
	 * @generated
	 */
	NotIdentifiable createNotIdentifiable();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IdentifiablePackage getIdentifiablePackage();

} //IdentifiableFactory
