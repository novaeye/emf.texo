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
 * $Id: ORMGeneratorTest.java,v 1.7 2011/09/24 09:07:25 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.EclipseGeneratorUtils;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.test.models.TestModel;
import org.eclipse.emf.texo.orm.annotator.ORMGenerator;

/**
 * Generates the ORM for specified models. The generated orm files are stored in the src/META-INF folder.
 * 
 * @see TestModel
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.7 $
 */
public class ORMGeneratorTest extends TestCase {

  private static final String TEST_ORM_PROJECT = "org.eclipse.emf.texo.orm.test"; //$NON-NLS-1$
  private static final String TEST_MODEL_PROJECT = "org.eclipse.emf.texo.test.model"; //$NON-NLS-1$

  private static final String SRC_GEN = "src-test-gen"; //$NON-NLS-1$
  private static final String SRC = "src"; //$NON-NLS-1$
  private static final String META_INF = "META-INF"; //$NON-NLS-1$
  private static final String MAPPING_FILES = "mapping-files"; //$NON-NLS-1$
  private static final String ORM_SUFFIX = "-orm.xml"; //$NON-NLS-1$
  private static final String PERSISTENCE_SUFFIX = "-persistence.xml"; //$NON-NLS-1$
  private static final String PERSISTENCE_XML_TEMPLATE = "template-persistence.xml"; //$NON-NLS-1$
  private static final String PERSISTENCE_UNIT_PARAM = "{persistenceUnitName}"; //$NON-NLS-1$
  private static final String MAPPING_FILE_PARAM = "{mappingFile}"; //$NON-NLS-1$

  private static final EPackage.Registry SHARED_REGISTRY = GeneratorUtils.createEPackageRegistry();

  public void testGenerateModels() throws Exception {
    final IProject modelTestProject = EclipseGeneratorUtils.getProject(TEST_MODEL_PROJECT);
    final IPath projectPath = modelTestProject.getLocation();
    final File modelTestProjectDir = projectPath.toFile();

    final IProject ormTestProject = EclipseGeneratorUtils.getProject(TEST_ORM_PROJECT);
    final File ormTestProjectDir = new File(ormTestProject.getRawLocation().toOSString());

    final File ormSrcDir = new File(ormTestProjectDir, SRC);
    final File modelSrcGenDir = new File(modelTestProjectDir, SRC_GEN);
    final File ormMetaInfDir = new File(ormSrcDir, META_INF);
    final File modelMetaInfDir = new File(modelSrcGenDir, META_INF);
    if (!modelMetaInfDir.exists()) {
      modelMetaInfDir.mkdir();
    }
    final File targetMappingFileDir = new File(modelMetaInfDir, MAPPING_FILES);

    for (String modelFile : getModelFileRelativePaths()) {
      System.err.println("Generating orm for " + modelFile); //$NON-NLS-1$
      generate(modelFile, ormMetaInfDir, modelMetaInfDir, targetMappingFileDir);
    }
  }

  protected boolean useSharedEPackageRegistry() {
    return false;
  }

  private void generate(String modelFilePath, File ormMetaInfDir, File modelMetaInfDir, File targetMappingFileDir) {
    try {
      final File mappingFileDir = new File(targetMappingFileDir, modelFilePath).getParentFile();

      final URL url = TestModel.getModelUrl(modelFilePath);
      final List<EPackage> ePackages = GeneratorUtils.readEPackages(Collections.singletonList(url.toURI()),
          useSharedEPackageRegistry() ? SHARED_REGISTRY : GeneratorUtils.createEPackageRegistry());

      // create the uri to store the mapping file
      final String ormFileName = ePackages.get(0).getName() + ORM_SUFFIX;
      final File ormFile = new File(mappingFileDir, ormFileName);
      if (ormFile.exists()) {
        ormFile.delete();
      }
      if (!ormFile.getParentFile().exists()) {
        ormFile.getParentFile().mkdirs();
      }

      final URI uri = URI.createFileURI(ormFile.getAbsolutePath());
      final ORMGenerator ormGenerator = new ORMGenerator();
      ormGenerator.generateStoreORM(ePackages, uri);

      // generate the persistence xml
      generatePersistenceXML(ormMetaInfDir, modelMetaInfDir, ormFile, ePackages.get(0).getName());
    } catch (final Exception e) {
      throw new IllegalStateException(e);
    }
  }

  private void generatePersistenceXML(File ormMetaInfDir, File modelMetaInfDir, File mappingFile, String ePackageName)
      throws IOException {
    final File persistenceXMLFile = new File(modelMetaInfDir, ePackageName + PERSISTENCE_SUFFIX);
    if (persistenceXMLFile.exists()) {
      persistenceXMLFile.delete();
    }

    String persistenceXMLTemplate = readFileAsString(new File(ormMetaInfDir, PERSISTENCE_XML_TEMPLATE)
        .getAbsolutePath());

    persistenceXMLTemplate = persistenceXMLTemplate.replace(PERSISTENCE_UNIT_PARAM, ePackageName);

    final String mappingFileLocation = mappingFile.getAbsolutePath();
    // strip the first part
    final String relativeMappingFileLocation = mappingFileLocation.substring(mappingFileLocation.indexOf(META_INF));
    persistenceXMLTemplate = persistenceXMLTemplate.replace(MAPPING_FILE_PARAM, relativeMappingFileLocation);
    final FileWriter fileWriter = new FileWriter(persistenceXMLFile);
    fileWriter.write(persistenceXMLTemplate);
    fileWriter.close();
  }

  private static String readFileAsString(String filePath) throws java.io.IOException {
    StringBuffer fileData = new StringBuffer(1000);
    BufferedReader reader = new BufferedReader(new FileReader(filePath));
    char[] buf = new char[1024];
    int numRead = 0;
    while ((numRead = reader.read(buf)) != -1) {
      String readData = String.valueOf(buf, 0, numRead);
      fileData.append(readData);
      buf = new char[1024];
    }
    reader.close();
    return fileData.toString();
  }

  protected List<String> getModelFileRelativePaths() {
    return TestModel.getAllSpecifiedModelRelativePaths();
  }
}