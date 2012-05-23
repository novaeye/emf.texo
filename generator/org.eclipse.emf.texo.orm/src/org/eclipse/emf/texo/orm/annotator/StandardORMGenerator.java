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
 * $Id: StandardORMGenerator.java,v 1.2 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.annotations.annotationsmodel.AnnotatedModel;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.orm.annotations.model.orm.DocumentRoot;
import org.eclipse.emf.texo.orm.annotations.model.orm.EntityMappingsType;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.util.OrmResourceFactoryImpl;
import org.eclipse.emf.texo.orm.annotations.model.orm.util.OrmResourceImpl;

/**
 * Generates an ORM model on the basis of an annotated model and then replaces the namespace and version to let it work
 * correctly with other ORM's. This class also sets a ThreadLocal flag which can be checked by the orm generator in
 * which mode the generation runs.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class StandardORMGenerator extends ORMGenerator {
  private static final String STANDARD_ORM_NS = "http://java.sun.com/xml/ns/persistence/orm"; //$NON-NLS-1$
  private static final String ECLIPSELINK_ORM_NS = "http://www.eclipse.org/eclipselink/xsds/persistence/orm"; //$NON-NLS-1$

  @Override
  public ModelController generateStoreORM(List<EPackage> ePackages, URI ormUri) {
    try {
      ORMGenerator.setInStandardsCompliantMode(true);
      return super.generateStoreORM(ePackages, ormUri);
    } finally {
      ORMGenerator.setInStandardsCompliantMode(null);
    }
  }

  @Override
  protected void storeORM(URI fileUri, AnnotatedModel annotatedModel, AnnotationManager annotationManager,
      EntityMappingsType entityMappings) {
    entityMappings.setVersion("2.0"); //$NON-NLS-1$
    final OrmResourceImpl ormResource = (OrmResourceImpl) new OrmResourceFactoryImpl().createResource(fileUri);
    try {
      final File file = new File(fileUri.toFileString());
      if (file.exists()) {
        file.delete();
      }
      file.createNewFile();

      final DocumentRoot docRoot = OrmFactory.eINSTANCE.createDocumentRoot();
      docRoot.setEntityMappings(entityMappings);
      ormResource.getContents().add(docRoot);
      final StringWriter sw = new StringWriter();
      ormResource.save(sw, Collections.emptyMap());
      final FileWriter fw = new FileWriter(file);
      String result = sw.toString();
      while (result.contains(ECLIPSELINK_ORM_NS)) {
        result = result.replace(ECLIPSELINK_ORM_NS, STANDARD_ORM_NS);
      }
      fw.write(result);
      fw.close();
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }

}