/**
 * <copyright>
 *
 * Copyright (c) 2011 Springsite BV (The Netherlands) and others
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
 * $Id: GenerateModelJPACode.java,v 1.1 2011/10/26 05:29:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotator;

import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.texo.eclipse.popup.actions.GenerateCode;
import org.eclipse.emf.texo.generator.AnnotationManager;

/**
 * Generates jpa annotated model code.
 * 
 * @author mtaal
 */
public class GenerateModelJPACode extends GenerateCode {

  @Override
  protected void generateFromUris(IProgressMonitor monitor, IProject project, List<URI> uris) {
    try {
      AnnotationManager.enableAnnotationSystem(AnnotationManager.JPA_ANNOTATION_SYSTEM_ID);
      super.generateFromUris(monitor, project, uris);
    } finally {
      AnnotationManager.removeEnabledAnnotationSystem(AnnotationManager.JPA_ANNOTATION_SYSTEM_ID);
    }
  }
}
