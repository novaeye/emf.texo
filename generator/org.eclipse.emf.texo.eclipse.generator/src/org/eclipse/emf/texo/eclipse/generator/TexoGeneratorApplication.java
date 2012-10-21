/**
 * <copyright>
 *
 * Copyright (c) 2012 Springsite BV (The Netherlands) and others
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
 * $Id: TexoGeneratorApplication.java,v 1.6 2011/08/25 12:34:30 mtaal Exp $
 */

package org.eclipse.emf.texo.eclipse.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.generator.AnnotationManager;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.EclipseGeneratorUtils;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelAnnotatorRegistry;
import org.eclipse.emf.texo.generator.ModelController;
import org.eclipse.emf.texo.modelgenerator.xtend.ModelTemplate;
import org.eclipse.emf.texo.orm.annotator.ORMMappingOptions;
import org.eclipse.emf.texo.orm.annotator.ORMUtils;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;

/**
 * Starting point of headless code generation.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class TexoGeneratorApplication implements IApplication {

	private static final String ARG_PROJECT = "-project";
	private static final String ARG_JPA = "-jpa";
	private static final String ARG_DAO = "-dao";
	private static final String ARG_MODEL_LOCATION = "-modelLocation";
	private static final String JAVA_PROJECT_NAME = "org.eclipse.emf.texo.tempgenproject";;

	public Object start(IApplicationContext context) throws Exception {

		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		System.err.println(workspace.getRoot().getLocation().toOSString());
		final String[] args = (String[]) context.getArguments().get(
				IApplicationContext.APPLICATION_ARGS);
		String projectName = null;
		boolean nextArgIsProject = false;
		boolean nextArgIsModelLocation = false;
		boolean doDao = false;
		boolean doJpa = false;
		String modelLocation = null;
		for (String arg : args) {
			if (nextArgIsProject) {
				projectName = arg;
				nextArgIsProject = false;
			}
			if (nextArgIsModelLocation) {
				modelLocation = arg;
				nextArgIsModelLocation = false;
			}
			if (ARG_PROJECT.equals(arg)) {
				nextArgIsProject = true;
			} else if (ARG_MODEL_LOCATION.equals(arg)) {
				nextArgIsModelLocation = true;
			} else if (ARG_DAO.equals(arg)) {
				doDao = true;
			} else if (ARG_JPA.equals(arg)) {
				doJpa = true;
			}
		}
		if (modelLocation == null) {
			throw new IllegalArgumentException(
					"Missing parameter: modelLocation");
		}
		if (doJpa) {
			if (projectName != null) {
				ORMUtils.setORMMappingOptionsFromProjectProperties(EclipseGeneratorUtils
						.getProject(projectName));
			} else {
				final ORMMappingOptions ormOptions = getORMMappingsOptions();
				ORMMappingOptions.setDefaultOptions(ormOptions);
			}
		}
		try {
			if (projectName == null) {
				createJavaProject();
				projectName = JAVA_PROJECT_NAME;
			}
			generateCode(projectName, modelLocation, doDao, doJpa);
		} finally {
			ORMMappingOptions.setDefaultOptions(null);
		}
		return null;
	}

	public void stop() {
		// TODO Auto-generated method stub

	}

	private void generateCode(String projectName, String modelLocation,
			boolean doDao, boolean doJpa) {
		// force initialization
		ModelAnnotatorRegistry.getInstance().getModelAnnotators();

		final List<URI> uris = getURIs(modelLocation);

		if (doJpa) {
			AnnotationManager
					.enableAnnotationSystem(AnnotationManager.JPA_ANNOTATION_SYSTEM_ID);
		}

		for (URI uri : uris) {
			generateCode(projectName, uri, doDao);
		}
	}

	private void generateCode(String projectName, URI uri, boolean doDao) {
		final EPackage.Registry packageRegistry = GeneratorUtils
				.createEPackageRegistry();
		final List<EPackage> ePackages = GeneratorUtils.readEPackagesUsingEMFURI(
				Collections.singletonList(uri), packageRegistry);
		final ModelController modelController = new ModelController();
		modelController.setEPackages(ePackages);
		modelController.getAnnotationManager().getAnnotatedModel()
				.setGeneratingSources(true);
		modelController.annotate(new ArrayList<ModelAnnotator>());

		final ArtifactGenerator artifactGenerator = new ArtifactGenerator();
		artifactGenerator.setModelController(modelController);
		artifactGenerator.setOutputFolder("src-test-gen"); //$NON-NLS-1$
		artifactGenerator.setProjectName(projectName);
		if (doDao) {
			artifactGenerator.setDoDao(true);
		}
		artifactGenerator.setXTendTemplate(new ModelTemplate());
		artifactGenerator.run();
	}

	private List<URI> getURIs(String modelLocation) {

		final File modelFile = new File(modelLocation);
		final List<File> files = new ArrayList<File>();
		if (modelFile.isDirectory()) {
			for (File file : modelFile.listFiles()) {
				if (file.getName().endsWith("xsd")
						|| file.getName().endsWith("ecore")) {
					files.add(file);
				}
			}
		} else {
			files.add(modelFile);
		}

		final List<URI> uris = new ArrayList<URI>();
		for (File file : files) {
			try {
				uris.add(URI.createFileURI(file.getPath()));
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return uris;
	}

	private ORMMappingOptions getORMMappingsOptions() {
		final ORMMappingOptions ormOptions = new ORMMappingOptions();
		ormOptions.setAddOrderColumnToListMappings(true);
		ormOptions.setRenameSQLReservedNames(true);
		ormOptions.setEnforceUniqueNames(true);
		ormOptions.setGenerateFullDbSchemaNames(true);
		return ormOptions;
	}

	private IJavaProject createJavaProject() {
		try {
			final IWorkspaceRoot root = ResourcesPlugin.getWorkspace()
					.getRoot();
			final IProgressMonitor progressMonitor = new NullProgressMonitor();
			
			final IProject project = root.getProject(JAVA_PROJECT_NAME);
			if (project.exists()) {
				project.delete(true, progressMonitor);
			}
			project.create(progressMonitor);
			project.open(progressMonitor);

			// swt the java nature
			final IProjectDescription description = project.getDescription();
			String[] natures = description.getNatureIds();
			String[] newNatures = new String[natures.length + 1];
			System.arraycopy(natures, 0, newNatures, 0, natures.length);
			newNatures[natures.length] = JavaCore.NATURE_ID;
			description.setNatureIds(newNatures);
			project.setDescription(description, progressMonitor);

			// create the javaproject
			final IJavaProject javaProject = JavaCore.create(project);

			// set the classpath
			final Set<IClasspathEntry> entries = new HashSet<IClasspathEntry>();
			entries.addAll(Arrays.asList(javaProject.getRawClasspath()));
			entries.add(JavaRuntime.getDefaultJREContainerEntry());
			javaProject.setRawClasspath(
					entries.toArray(new IClasspathEntry[entries.size()]),
					progressMonitor);

			return javaProject;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
