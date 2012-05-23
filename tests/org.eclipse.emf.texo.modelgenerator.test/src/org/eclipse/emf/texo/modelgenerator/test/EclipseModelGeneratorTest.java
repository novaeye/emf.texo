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
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.EclipseGeneratorUtils;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.generator.TexoResourceManager;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EPackageModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;

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
  private static final String DEFAULT_EXTENDS = "org.eclipse.emf.texo.test.model.base.identifiable.Identifiable"; //$NON-NLS-1$

  private static final String TEST_MODEL_PROJECT = "org.eclipse.emf.texo.test.model"; //$NON-NLS-1$

  private static final EPackage.Registry SHARED_REGISTRY = GeneratorUtils.createEPackageRegistry();

  public void testGenerateModels() throws Exception {
    // force initialization
    ModelAnnotatorRegistry.getInstance().getModelAnnotators();
    // let everyone have orm annotations..
    AnnotationManager.enableAnnotationSystem(AnnotationManager.JPA_ANNOTATION_SYSTEM_ID);

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

      boolean hasIdentifiable = false;
      for (EPackage ePackage : ePackages) {
        hasIdentifiable = hasIdentifiable
            || ePackage.getNsURI().equals("http://www.eclipse.org/emf/texo/test/model/base/identifiable"); //$NON-NLS-1$
      }

      // give everyone the identifiable as super, except the identifiable
      // package
      if (hasIdentifiable) {
        EPackageModelGenAnnotation.setDefaultExtends(null);
      } else {
        EPackageModelGenAnnotation.setDefaultExtends(DEFAULT_EXTENDS);
      }
      try {
        final ModelController modelController = new ModelController();
        modelController.setEPackages(ePackages);
        modelController.getAnnotationManager().getAnnotatedModel().setGeneratingSources(true);
        modelController.annotate(new ArrayList<ModelAnnotator>());

        final ArtifactGenerator artifactGenerator = new ArtifactGenerator();
        artifactGenerator.setModelController(modelController);
        artifactGenerator.setOutputFolder("src-test-gen"); //$NON-NLS-1$
        artifactGenerator.setProjectName(TEST_MODEL_PROJECT);
        artifactGenerator.setDoDao(true);
        artifactGenerator.run();
      } finally {
        EPackageModelGenAnnotation.setDefaultExtends(null);
      }

    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  protected List<String> getModelFileRelativePaths() {
    return TestModel.getAllSpecifiedModelRelativePaths();
  }
}