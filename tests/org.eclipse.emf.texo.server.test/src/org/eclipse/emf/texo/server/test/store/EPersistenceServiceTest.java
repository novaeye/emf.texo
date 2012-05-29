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
 * $Id: ReferersTest.java,v 1.4 2011/08/26 07:58:32 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONEObjectStore;
import org.eclipse.emf.texo.server.store.EPersistenceService;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.server.test.BaseTest;
import org.eclipse.emf.texo.test.emfmodel.library.Book;
import org.eclipse.emf.texo.test.emfmodel.library.Library;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryFactory;
import org.eclipse.emf.texo.test.emfmodel.library.LibraryPackage;
import org.eclipse.emf.texo.test.emfmodel.library.Writer;
import org.eclipse.emf.texo.test.model.samples.librarymodelclasses.model.LibraryModelPackage;
import org.junit.Test;

/**
 * Tests the {@link JSONEObjectStore} api.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class EPersistenceServiceTest extends BaseTest {

  public EPersistenceServiceTest() {
    super("library"); //$NON-NLS-1$

  }

  @Override
  public void setUp() throws Exception {
    super.setUp();

    // set to false
    // is set to true in super
    EntityManagerProvider.getInstance().setUseCurrentEntityManagerPattern(false);
  }

  @Test
  public void testPersistGetCountQuery() {
    final LibraryFactory factory = LibraryFactory.eINSTANCE;
    LibraryModelPackage.initialize();
    final int COUNT = 5;

    long libId = -1;
    // Persist
    {
      final List<EObject> toInsertUpdate = new ArrayList<EObject>();
      for (int i = 0; i < COUNT; i++) {
        // create testdata
        final Library lib = factory.createLibrary();
        toInsertUpdate.add(lib);
        lib.setName("name" + i); //$NON-NLS-1$

        for (int w = 0; w < COUNT; w++) {
          final Writer writer = factory.createWriter();
          lib.getWriters().add(writer);
          writer.setName(i + "_" + w);

          for (int b = 0; b < COUNT; b++) {
            final Book bk = factory.createBook();
            bk.setAuthor(writer);
            writer.getBooks().add(bk);
            lib.getBooks().add(bk);
          }
        }
      }
      final EPersistenceService service = getEPersistenceService();
      service.persist(toInsertUpdate, Collections.<EObject> emptyList());
      libId = ((Library) toInsertUpdate.get(0)).getDb_Id();
    }

    // Get
    {
      final EPersistenceService service = getEPersistenceService();
      final Library lib = (Library) service.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib.getName().equals("name0"));
    }

    // Count
    {
      final EPersistenceService service = getEPersistenceService();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final long cnt = service.count("select count(w) from library_Writer w where w.name like :name", namedParams);
      Assert.assertEquals(COUNT, cnt);
    }

    // Query
    {
      final EPersistenceService service = getEPersistenceService();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = service.query("select w from library_Writer w where w.name like :name",
          namedParams, 0, -1);
      Assert.assertEquals(COUNT, writers.size());

      int i = 0;
      for (EObject w : writers) {
        final Writer writer = (Writer) w;
        Assert.assertEquals("1_" + i++, writer.getName());
        for (Book bk : writer.getBooks()) {
          Assert.assertTrue(bk.eIsProxy());
        }
        Assert.assertTrue(writer.eContainer() == null);
      }
    }

    // query paging 1
    {
      final EPersistenceService service = getEPersistenceService();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = service.query("select w from library_Writer w where w.name like :name",
          namedParams, 0, 2);
      Assert.assertEquals(2, writers.size());
    }

    // query paging 2
    {
      final EPersistenceService service = getEPersistenceService();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      namedParams.put("name", "1_%");
      final List<EObject> writers = service.query("select w from library_Writer w where w.name like :name",
          namedParams, 3, -1);
      Assert.assertEquals(2, writers.size());
    }

    // Refresh
    {
      final EPersistenceService s1 = getEPersistenceService();
      final EPersistenceService s2 = getEPersistenceService();
      final Library lib1 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      final Library lib2 = (Library) s2.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib2.getName().equals(lib1.getName()));
      Assert.assertTrue(lib1 != lib2);
      lib1.setName("newname");
      Assert.assertFalse(lib2.getName().equals(lib1.getName()));
      s1.persist(Collections.<EObject> singletonList(lib1), Collections.<EObject> emptyList());
      Assert.assertFalse(lib2.getName().equals(lib1.getName()));
      s2.refresh(lib2);
      Assert.assertTrue(lib2.getName().equals(lib1.getName()));
    }

    // Resolve objects
    {
      final EPersistenceService s1 = getEPersistenceService();
      final Library lib1 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      final Library lib2 = (Library) s1.get(LibraryPackage.eINSTANCE.getLibrary(), libId);
      Assert.assertTrue(lib1 != lib2);
    }

    // Insert/Update and delete
    {
      final EPersistenceService service = getEPersistenceService();
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      final List<EObject> libs = service.query("select l from library_Library l", namedParams, 0, -1);
      final EObject toDel = libs.remove(4);
      final Library lib = factory.createLibrary();
      lib.setName("name10"); //$NON-NLS-1$
      libs.add(2, lib);
      service.persist(libs, Collections.<EObject> singletonList(toDel));

      Assert.assertTrue(null == service.get(LibraryPackage.eINSTANCE.getLibrary(), ((Library) toDel).getDb_Id()));
      Assert.assertTrue(lib.getDb_Id() > 0);
    }

    // same objects
    {
      final EPersistenceService service = getEPersistenceService();
      service.setCacheEObjects(true);
      final Map<String, Object> namedParams = new HashMap<String, Object>();
      final List<EObject> libs1 = service.query("select l from library_Library l", namedParams, 0, -1);
      final List<EObject> libs2 = service.query("select l from library_Library l", namedParams, 0, -1);
      final Iterator<EObject> it2 = libs2.iterator();
      for (EObject eObject : libs1) {
        Assert.assertTrue(eObject == it2.next());
      }
      final Library lib = (Library) service.get(LibraryPackage.eINSTANCE.getLibrary(),
          ((Library) libs1.get(0)).getDb_Id());
      Assert.assertTrue(libs1.contains(lib));
      Assert.assertTrue(libs2.contains(lib));
    }
  }

  protected EPersistenceService getEPersistenceService() {
    final EPersistenceService ePersistenceService = ComponentProvider.getInstance().newInstance(
        EPersistenceService.class);
    ePersistenceService.setUri(URI.createURI(STORE_URI));
    return ePersistenceService;
  }
}
