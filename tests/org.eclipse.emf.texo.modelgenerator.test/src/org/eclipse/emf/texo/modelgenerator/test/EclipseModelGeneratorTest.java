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
 * $Id: EclipseModelGeneratorTest.java,v 1.24 2011/10/25 13:19:13 mtaal Exp $
 */

package org.eclipse.emf.texo.modelgenerator.test;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.EclipseGeneratorUtils;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.generator.TexoResourceManager;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;

/**
 * Test the generation of model code through the Eclipse plugin. Needs to be run as a junit plugin test.
 * 
 * Generates all models present in the test model project in the org.eclipse.emf.texo.test.model package in the src
 * directory.
 * 
 * @see TestModel
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.24 $
 */

public class EclipseModelGeneratorTest extends TestCase {

  private static final String TEST_MODEL_PROJECT = "org.eclipse.emf.texo.test.model"; //$NON-NLS-1$

  private static final EPackage.Registry SHARED_REGISTRY = GeneratorUtils.createEPackageRegistry();

  public void testGenerateModels() throws Exception {
    // force initialization
    ModelAnnotatorRegistry.getInstance().getModelAnnotators();
    // let everyone have orm annotations..
    EPackageORMAnnotation.setAlwaysGenerateJPAAnnotations(true);

    for (String modelFile : getModelFileRelativePaths()) {
      System.err.println("Generating modelfile " + modelFile); //$NON-NLS-1$
      final IProject project = EclipseGeneratorUtils.getProject(TEST_MODEL_PROJECT);
      if (modelFile.contains("employee.xsd")) { //$NON-NLS-1$
        project.setPersistentProperty(TexoResourceManager.TEMPLATE_FOLDER_PROPERTY, "templates"); //$NON-NLS-1$
      } else {
        project.setPersistentProperty(TexoResourceManager.TEMPLATE_FOLDER_PROPERTY, null);
      }
      generate(new String[] { modelFile });
    }
  }

  protected boolean useSharedEPackageRegistry() {
    return false;
  }

  private void generate(final String[] ecoreFileNames) {
    try {
      final List<URI> uris = new ArrayList<URI>();
      for (final String ecoreFileName : ecoreFileNames) {
        final URL url = TestModel.getModelUrl(ecoreFileName);
        uris.add(url.toURI());
      }
      final List<EPackage> ePackages = GeneratorUtils.readEPackages(uris, useSharedEPackageRegistry() ? SHARED_REGISTRY
          : GeneratorUtils.createEPackageRegistry());

      final ModelController modelController = new ModelController();
      modelController.setEPackages(ePackages);
      modelController.annotate(new ArrayList<ModelAnnotator>());

      final ArtifactGenerator artifactGenerator = new ArtifactGenerator();
      artifactGenerator.setModelController(modelController);
      artifactGenerator.setOutputFolder("src-test-gen"); //$NON-NLS-1$
      artifactGenerator.setProjectName(TEST_MODEL_PROJECT);
      artifactGenerator.setDoDao(true);
      artifactGenerator.run();
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  protected List<String> getModelFileRelativePaths() {
    return TestModel.getAllSpecifiedModelRelativePaths();
  }
}