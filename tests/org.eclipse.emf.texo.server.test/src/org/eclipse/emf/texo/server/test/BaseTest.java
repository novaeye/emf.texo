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
 * $Id: BaseTest.java,v 1.9 2011/09/24 04:56:39 mtaal Exp $
 */
package org.eclipse.emf.texo.server.test;

import java.util.Calendar;
import java.util.HashMap;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.server.store.EntityManagerObjectStore;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.store.ObjectStore;
import org.eclipse.emf.texo.test.model.base.identifiable.IdentifiableModelPackage;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.eclipse.persistence.jpa.osgi.PersistenceProvider;
import org.junit.After;
import org.junit.Before;

/**
 * Base test case for the server environment.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.9 $
 */
public abstract class BaseTest {
  protected static final String STORE_URI = "jpa://test.com"; //$NON-NLS-1$

  private String persistenceXMLPrefix;
  private String persistenceUnitName;
  private String persistenceUnitPostFix = "-hsqldb"; //$NON-NLS-1$
  private EntityManagerFactory entityManagerFactory;
  private ObjectStore objectStore;

  public BaseTest(String name) {
    persistenceXMLPrefix = name;
    persistenceUnitName = name;
  }

  protected String getPersistenceUnitName() {
    return persistenceUnitName + persistenceUnitPostFix;
  }

  @Before
  public void setUp() throws Exception {
    if (objectStore != null) {
      objectStore.close();
    }
    objectStore = null;
    EntityManagerProvider.getInstance().clearCurrentEntityManager();
    EntityManagerProvider.getInstance().setUseCurrentEntityManagerPattern(true);
    createEntityManagerFactory();
    EntityManagerProvider.getInstance().setEntityManagerFactory(entityManagerFactory);
  }

  protected synchronized void createEntityManagerFactory() {
    String persistenceUnit = getPersistenceUnitName();
    if (persistenceUnit == null) {
      persistenceUnit = "jpa"; //$NON-NLS-1$
    }

    final HashMap<String, Object> properties = new HashMap<String, Object>();
    // on purpose using the IdentifiableModelPackage as it is in the plugin
    // which contains the persistence.xml files
    // the test.model plugin has Eclipse-BuddyPolicy set
    final ClassLoader classLoader = IdentifiableModelPackage.class.getClassLoader();
    properties.put(PersistenceUnitProperties.CLASSLOADER, classLoader);
    properties.put(PersistenceUnitProperties.ECLIPSELINK_PERSISTENCE_XML, "META-INF/" //$NON-NLS-1$
        + getPersistenceXMLPrefix() + "-persistence.xml"); //$NON-NLS-1$
    entityManagerFactory = new PersistenceProvider().createEntityManagerFactory(persistenceUnit, properties);
  }

  protected void beginTransaction() {
    getObjectStore().begin();
  }

  protected void commitTransaction() {
    getObjectStore().commit();
  }

  protected void rollbackTransaction() {
    getObjectStore().rollback();
  }

  @After
  public void tearDown() throws Exception {

    EntityManagerProvider.getInstance().clearCurrentEntityManager();

    if (objectStore != null) {
      try {
        objectStore.close();
        objectStore = null;
      } catch (RuntimeException e) {
        System.out.println("Exception closing ObjectStore: " + e.getMessage()); //$NON-NLS-1$
        e.printStackTrace();
        // not supposed to fail in tearDown
      } finally {
      }
    }
    if (entityManagerFactory != null) {
      entityManagerFactory.close();
      entityManagerFactory = null;
    }
  }

  protected static long nextTitleInt = Calendar.getInstance().getTimeInMillis();

  /**
   * Utility method used to generate Strings for "don't care" attribute values of test objects: DON'T HARD WIRE VALUES
   * IN TESTS
   * 
   * @return String
   */
  protected String getAnonymousString() {
    return String.valueOf(nextTitleInt++);
  }

  protected void clearObjectStore() {
    if (objectStore != null) {
      objectStore.close();
      objectStore = null;
    }
  }

  protected ObjectStore getObjectStore() {
    if (objectStore == null) {
      objectStore = getNewObjectStore();
    }
    return objectStore;
  }

  protected ObjectStore getNewObjectStore() {
    EntityManagerObjectStore localObjectStore = new EntityManagerObjectStore();
    // create a new entity manager
    localObjectStore.setEntityManager(EntityManagerProvider.getInstance().createEntityManager());
    localObjectStore.setUri(URI.createURI(STORE_URI));
    return localObjectStore;
  }

  protected EntityManager getEntityManager() {
    return (EntityManager) getObjectStore().getDelegate();
  }

  public String getPersistenceUnitPostFix() {
    return persistenceUnitPostFix;
  }

  public void setPersistenceUnitPostFix(String persistenceUnitPostFix) {
    this.persistenceUnitPostFix = persistenceUnitPostFix;
  }

  public String getPersistenceXMLPrefix() {
    return persistenceXMLPrefix;
  }

  public void setPersistenceXMLPrefix(String persistenceXMLPrefix) {
    this.persistenceXMLPrefix = persistenceXMLPrefix;
  }

}
