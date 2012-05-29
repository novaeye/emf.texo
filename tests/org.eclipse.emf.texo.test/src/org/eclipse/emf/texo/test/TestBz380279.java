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
 * $Id: EClassInstanceClassSetTest.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.test.model.samples.library.Book;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Assert;
import org.junit.Test;

public class TestBz380279 {

  @Test
  public void test() throws Exception {
    LibraryModelPackage.initialize();

    Assert.assertNotNull(ModelResolver.getInstance().getImplementationClass(
        LibraryModelPackage.INSTANCE.getBookEClass()));
    Assert.assertNotNull(ModelResolver.getInstance().getImplementationClass(
        LibraryModelPackage.INSTANCE.getLibraryEClass()));
    Assert.assertNotNull(ModelResolver.getInstance().getModelDescriptor(Book.class, false));
    Assert.assertNotNull(ModelResolver.getInstance().getModelPackage(LibraryModelPackage.NS_URI));
    Assert.assertNotNull(ModelResolver.getInstance().getEPackageRegistry().get(LibraryModelPackage.NS_URI));

    ModelResolver.getInstance().deregister(LibraryModelPackage.INSTANCE);

    try {
      ModelResolver.getInstance().getImplementationClass(LibraryModelPackage.INSTANCE.getBookEClass());
      Assert.fail();
    } catch (IllegalArgumentException e) {
    }
    try {
      ModelResolver.getInstance().getImplementationClass(LibraryModelPackage.INSTANCE.getLibraryEClass());
      Assert.fail();
    } catch (IllegalArgumentException e) {
    }
    Assert.assertNull(ModelResolver.getInstance().getModelDescriptor(Book.class, false));
    Assert.assertNull(ModelResolver.getInstance().getModelPackage(LibraryModelPackage.NS_URI));
    Assert.assertNull(ModelResolver.getInstance().getEPackageRegistry().get(LibraryModelPackage.NS_URI));
  }
}
