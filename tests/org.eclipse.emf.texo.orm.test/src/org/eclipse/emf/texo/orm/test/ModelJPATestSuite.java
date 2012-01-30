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
 * $Id: ModelJPATestSuite.java,v 1.7 2011/08/25 12:42:40 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.test.model.samples.accounting.AccountingModelPackage;
import org.eclipse.emf.texo.test.model.samples.emap.EmapsampleModelPackage;
import org.eclipse.emf.texo.test.model.samples.extendedpo2.Epo2ModelPackage;
import org.eclipse.emf.texo.test.model.samples.featuremaptest.FeaturemaptestModelPackage;
import org.eclipse.emf.texo.test.model.samples.inventory.InvModelPackage;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.music.MusicModelPackage;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;
import org.eclipse.emf.texo.test.model.samples.schoollibrary.SchoollibraryModelPackage;
import org.eclipse.emf.texo.test.model.samples.types.TypesModelPackage;
import org.eclipse.emf.texo.test.model.samples.workflow.WorkflowModelPackage;

/**
 * Creates the JPA test cases for several model packages.
 * 
 * @author mtaal
 */
public class ModelJPATestSuite {

  private static String[] persistenceUnitPostFixes = new String[] { "-hsqldb" }; // {"-hsqldb", "-mysql"}; //$NON-NLS-1$

  public static Test suite() {
    TestSuite suite = new TestSuite("Model JPA Test Suite"); //$NON-NLS-1$

    // note: if test models use the same tables then sometimes they can interfere with
    // eachother as the drop not always succeeds.
    addTest(EmapsampleModelPackage.INSTANCE, suite);
    addTest(RentalModelPackage.INSTANCE, suite);
    addTest(FeaturemaptestModelPackage.INSTANCE, suite);
    addTest(Epo2ModelPackage.INSTANCE, suite);
    addTest(TypesModelPackage.INSTANCE, suite);
    addTest(WorkflowModelPackage.INSTANCE, suite);
    addTest(AccountingModelPackage.INSTANCE, suite);
    addTest(LibraryModelPackage.INSTANCE, suite);
    addTest(InvModelPackage.INSTANCE, suite);
    addTest(MusicModelPackage.INSTANCE, suite);

    {
      final List<ModelPackage> modelPackages = new ArrayList<ModelPackage>();
      modelPackages.add(SchoollibraryModelPackage.INSTANCE);
      modelPackages.add(LibraryModelPackage.INSTANCE);
      addTest(modelPackages, suite, "special-schoollibrary"); //$NON-NLS-1$
    }

    // this one fails as it contains inherited interfaces
    // addTest(InterfacesModelPackage.INSTANCE, suite);

    // extlibrary works with interfaces and multiple inheritance
    // this does not work nicely with JPA/ORM
    // addTest(ExtlibraryModelPackage.INSTANCE, suite);

    return suite;
  }

  private static void addTest(ModelPackage modelPackage, TestSuite suite) {
    for (String postFix : persistenceUnitPostFixes) {
      final DataGenCompareModelJPATest test = new DataGenCompareModelJPATest(modelPackage);
      test.setPersistenceUnitPostFix(postFix);
      suite.addTest(test);
    }
  }

  private static void addTest(List<ModelPackage> modelPackages, TestSuite suite, String persistenceXMLPrefix) {
    for (String postFix : persistenceUnitPostFixes) {
      final DataGenCompareModelJPATest test = new DataGenCompareModelJPATest(modelPackages);
      test.setPersistenceUnitPostFix(postFix);
      test.setPersistenceXMLPrefix(persistenceXMLPrefix);
      suite.addTest(test);
    }
  }
}
