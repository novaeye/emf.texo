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
 * </copyright>
 *
 * $Id: DaoRegistry.java,v 1.1 2011/09/24 04:00:25 mtaal Exp $
 */
package org.eclipse.emf.texo.server.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.xml.EMFModelConverter;
import org.eclipse.emf.texo.xml.ModelEMFConverter;

/**
 * An implementation of a persistence service which can be used as an OSGI service.
 * 
 * This persistence service is capable of persisting EObjects by converting them to Texo model objects. The Texo pojos
 * are standard JPA annotated java classes which can be persisted by the ORM.
 * 
 * After updating/inserting the EObjects are updated with the values from the database/ORM layer. This is needed to pass
 * the id back to the previous layer. Also other values may have been set in the object.
 * 
 * You can set the entity manager provider to be used by this persistence service. If none is set then the one from the
 * {@link EntityManagerProvider} is used.
 * 
 * @see EMFModelConverter
 * @see ModelEMFConverter
 * @see ObjectStore
 * @see EntityManagerProvider
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class EPersistenceService implements TexoComponent {

  private EntityManagerFactory entityManagerFactory;

  /**
   * Performs several persistence actions, the insert and updates are done in the order in the toInsertUpdate list, the
   * toDelete are done after the insert/updates.
   * 
   * Note that in general it makes sense to first have the new objects in the toInsertUpdate and then the to-be-updated
   * objects.
   * 
   * NOTE: After the persist action the {@link EObject} instances in toInsertUpdate are updated with the data returned
   * from the database. So id's for new objects and other computed information is set back in the passed EObjects.
   */
  public void persist(List<EObject> toInsertUpdate, List<EObject> toDelete) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final EMFModelConverter converter = ComponentProvider.getInstance().newInstance(EMFModelConverter.class);
      converter.setUriResolver(os);
      final List<Object> allObjects = new ArrayList<Object>();
      int i = 0;
      final Map<Object, InternalEObject> objectMapping = new HashMap<Object, InternalEObject>();
      for (Object object : converter.convert(toInsertUpdate)) {
        allObjects.add(object);
        final Object id = IdProvider.getInstance().getId(object);
        if (id == null) {
          os.insert(object);
        } else {
          os.update(object);
        }
        objectMapping.put(object, (InternalEObject) toInsertUpdate.get(i));
        i++;
      }

      for (Object delete : converter.convert(toDelete)) {
        os.remove(delete);
      }
      os.flush();

      // and convert back
      final ModelEMFConverter m2eConverter = ComponentProvider.getInstance().newInstance(ModelEMFConverter.class);
      m2eConverter.setUriResolver(os);
      m2eConverter.setObjectMapping(objectMapping);
      final List<EObject> result = m2eConverter.convert(allObjects);
      i = 0;
      // the result should have the exact same objects
      for (EObject eObject : result) {
        if (eObject != toInsertUpdate.get(i)) {
          throw new IllegalStateException("Invalid conversion"); //$NON-NLS-1$
        }
        i++;
      }

      err = false;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }

      os.close();
    }
  }

  /**
   * Query for a list of EObjects.
   */
  public List<EObject> query(String qryStr, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final List<?> objects = os.query(qryStr, namedParameters, firstResult, maxResults);

      final ModelEMFConverter converter = ComponentProvider.getInstance().newInstance(ModelEMFConverter.class);
      converter.setUriResolver(os);
      @SuppressWarnings("unchecked")
      final List<EObject> result = converter.convert((List<Object>) objects);
      err = false;
      return result;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  /**
   * Execute a count query in the database.
   */
  public long count(String qry, Map<String, Object> namedParameters) {
    final ObjectStore os = getObjectStore();
    boolean err = true;
    os.begin();
    try {
      final long result = os.count(qry, namedParameters);
      err = false;
      return result;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  /**
   * Return a single instance of the eClass with the passed in id. If the object does not exist then null is returned.
   */
  public EObject get(EClass eClass, Object id) {
    final ObjectStore os = getObjectStore();
    final ModelEMFConverter converter = ComponentProvider.getInstance().newInstance(ModelEMFConverter.class);
    converter.setUriResolver(os);

    boolean err = true;
    os.begin();
    try {
      final Object object = os.get(eClass, id);
      if (object == null) {
        return null;
      }
      EObject result = null;
      result = converter.convert(Collections.singletonList(object)).get(0);
      err = false;
      return result;
    } finally {
      if (err) {
        os.rollback();
      } else {
        os.commit();
      }
      os.close();
    }
  }

  protected ObjectStore getObjectStore() {
    final EntityManagerObjectStore emStore = ComponentProvider.getInstance()
        .newInstance(EntityManagerObjectStore.class);
    emStore.setEntityManager(getEntityManager());
    emStore.setUri("jpa://org.eclipse.emf.texo/"); //$NON-NLS-1$
    return emStore;
  }

  protected synchronized EntityManager getEntityManager() {
    if (entityManagerFactory == null) {
      return EntityManagerProvider.getInstance().getEntityManager();
    }
    return entityManagerFactory.createEntityManager();
  }

  /**
   * Set the {@link EntityManagerFactory} to use for this persistence service. If this persistence service does not have
   * an {@link EntityManagerFactory} then it is read from the {@link EntityManagerProvider}.
   * 
   * @see EntityManagerProvider
   */
  public void setEntityManagerFactory(EntityManagerFactory emf) {
    entityManagerFactory = emf;
  }
}
