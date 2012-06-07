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
 * $Id: GenerateModelJPADaoCode.java,v 1.1 2011/10/26 05:29:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotator;

import java.net.URI;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Generates model jpa annotated and dao code.
 * 
 * @author mtaal
 */
public class GenerateModelJPADaoCode extends GenerateModelJPACode {

  @Override
  protected void generateFromUris(IProgressMonitor monitor, IProject project, List<URI> uris) {
    try {
      setDoJpa(true);
      setDoDao(true);
      ORMUtils.setORMMappingOptionsFromProjectProperties(project);
      super.generateFromUris(monitor, project, uris);
    } finally {
      setDoJpa(false);
      setDoDao(false);
      ORMMappingOptions.setDefaultOptions(null);
    }
  }
}
