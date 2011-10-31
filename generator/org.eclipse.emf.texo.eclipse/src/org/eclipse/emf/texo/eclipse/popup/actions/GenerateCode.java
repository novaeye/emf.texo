/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: GenerateCode.java,v 1.17 2011/10/26 09:00:30 mtaal Exp $
 */
package org.eclipse.emf.texo.eclipse.popup.actions;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.eclipse.Messages;
import org.eclipse.emf.texo.eclipse.ProjectPropertyUtil;
import org.eclipse.emf.texo.generator.ArtifactGenerator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.generator.ModelAnnotator;
import org.eclipse.emf.texo.generator.ModelController;

/**
 * The generate code menu option. Collects the selected files and their projects and generates code for the packages in
 * the selected files.
 * 
 * @author mtaal
 */
public class GenerateCode extends BaseGenerateAction {

  @Override
  protected void generateFromUris(IProgressMonitor monitor, IProject project, List<URI> uris) {
    // always start with a fresh epackage registry
    final List<EPackage> ePackages = GeneratorUtils.readEPackages(uris, GeneratorUtils.createEPackageRegistry());

    validateEPackages(ePackages);

    final ModelController modelController = new ModelController();
    modelController.setEPackages(ePackages);
    monitor.subTask(Messages.getString("generate.Annotating")); //$NON-NLS-1$
    modelController.annotate(new ArrayList<ModelAnnotator>());

    final ArtifactGenerator artifactGenerator = new ArtifactGenerator();
    artifactGenerator.setMonitor(monitor);
    artifactGenerator.setOutputFolder(ProjectPropertyUtil.getGenOutputFolder(project));
    artifactGenerator.setModelController(modelController);
    artifactGenerator.setProjectName(project.getName());
    artifactGenerator.setDoDao(isDoDao());

    int eClassifierCount = 0;
    for (EPackage ePackage : ePackages) {
      eClassifierCount += ePackage.getEClassifiers().size();
      eClassifierCount++;
    }

    monitor.beginTask(Messages.getString("generate.Initialize"), eClassifierCount); //$NON-NLS-1$

    artifactGenerator.run();
  }

  protected boolean isDoDao() {
    return false;
  }

  private void validateEPackages(List<EPackage> ePackages) {
    Diagnostician diagnostician = new Diagnostician(EValidator.Registry.INSTANCE) {
      @Override
      public String getObjectLabel(EObject object) {
        return EcoreUtil.getURI(object).toString();
      }
    };

    // do not check validaty of java names, this is solved often in the code generation
    final Map<Object, Object> context = new HashMap<Object, Object>();
    // https://bugs.eclipse.org/bugs/show_bug.cgi?id=349942
    // context.put(EcoreValidator.STRICT_NAMED_ELEMENT_NAMES, false);

    for (EPackage ePackage : ePackages) {
      // https://bugs.eclipse.org/bugs/show_bug.cgi?id=349942
      final List<String> notWellFormedPackageNames = getNotWellFormedPackageNames(ePackage);

      Diagnostic diagnostic = diagnostician.validate(ePackage, context);
      final StringBuilder sb = new StringBuilder("Invalid EPackage: " + ePackage.getName()); //$NON-NLS-1$
      sb.append("\n" + diagnostic.getMessage()); //$NON-NLS-1$
      boolean realError = false;
      for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
        if (notWellFormedPackageNames.contains(childDiagnostic.getMessage())) {
          // ignore
          continue;
        }
        realError = true;
        sb.append("\n" + childDiagnostic.getMessage()); //$NON-NLS-1$
      }
      if (!realError) {
        continue;
      }
      if (diagnostic.getSeverity() == Diagnostic.ERROR) {
        throw new IllegalStateException(sb.toString(), diagnostic.getException());
      }
    }
  }

  private List<String> getNotWellFormedPackageNames(EPackage ePackage) {
    final List<String> result = new ArrayList<String>();
    result.add("The name '" + ePackage.getName() + "' is not well formed"); //$NON-NLS-1$ //$NON-NLS-2$
    for (EPackage subEPackage : ePackage.getESubpackages()) {
      result.addAll(getNotWellFormedPackageNames(subEPackage));
    }
    return result;
  }
}
