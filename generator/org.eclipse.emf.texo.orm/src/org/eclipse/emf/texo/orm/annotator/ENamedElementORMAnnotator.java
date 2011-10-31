/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: ENamedElementORMAnnotator.java,v 1.5 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * Base class of the ORM Annotators.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public abstract class ENamedElementORMAnnotator {

  private AnnotationManager annotationManager;

  public AnnotationManager getAnnotationManager() {
    return annotationManager;
  }

  public void setAnnotationManager(AnnotationManager annotationManager) {
    this.annotationManager = annotationManager;
  }

  public ORMNamingStrategy getOrmNamingStrategy(EPackage ePackage) {
    final EPackageORMAnnotation annotation = (EPackageORMAnnotation) getAnnotationManager().getAnnotation(ePackage,
        OrmannotationsPackage.eINSTANCE.getEPackageORMAnnotation());

    return annotation.getNamingStrategy();
  }
}
