/**
 * <copyright>
 * </copyright>
 *
 * $Id: Transient.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Transient</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * 
 * 				@Target({METHOD, FIELD}) @Retention(RUNTIME)
 * 				public @interface Transient {}
 * 
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transient#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransient()
 * @model extendedMetaData="name='transient' kind='empty'"
 * @extends BaseOrmAnnotation
 * @generated
 */
public interface Transient extends BaseOrmAnnotation {
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getTransient_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.Transient#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

} // Transient
