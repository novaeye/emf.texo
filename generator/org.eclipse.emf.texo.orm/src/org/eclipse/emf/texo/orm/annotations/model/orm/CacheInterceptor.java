/**
 * <copyright>
 * </copyright>
 *
 * $Id: CacheInterceptor.java,v 1.5 2011/10/25 13:21:26 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotations.model.orm;

import org.eclipse.emf.texo.orm.annotator.BaseOrmAnnotation;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Cache Interceptor</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <!-- begin-model-doc -->
 * 
 * 
 * @Target({TYPE ) @Retention(RUNTIME) public @interface CacheInterceptor { Class value(); }
 * 
 * 
 *               <!-- end-model-doc -->
 * 
 *               <p>
 *               The following features are supported:
 *               <ul>
 *               <li>{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor#getClass_ <em>Class</em>}</li>
 *               </ul>
 *               </p>
 * 
 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCacheInterceptor()
 * @model extendedMetaData="name='cache-interceptor' kind='empty'"
 * @generated
 */
public interface CacheInterceptor extends BaseOrmAnnotation {
  /**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear, there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.eclipse.emf.texo.orm.annotations.model.orm.OrmPackage#getCacheInterceptor_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
  String getClass_();

  /**
	 * Sets the value of the '{@link org.eclipse.emf.texo.orm.annotations.model.orm.CacheInterceptor#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
  void setClass(String value);

} // CacheInterceptor
