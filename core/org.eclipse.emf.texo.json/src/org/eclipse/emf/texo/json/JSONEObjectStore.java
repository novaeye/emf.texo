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
package org.eclipse.emf.texo.json;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.store.EObjectStore;

/**
 * {@link EObjectStore} concrete class which communicates with a remote server using json.
 * 
 * UNDER DEVELOPMENT
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class JSONEObjectStore extends EObjectStore {

  @Override
  public void persist(List<EObject> toInsertUpdate, List<EObject> toDelete) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED");
  }

  /**
   * Query for a list of EObjects.
   */
  @Override
  public List<EObject> query(String qryStr, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED");
  }

  /**
   * Execute a count query in the database.
   */
  public long count(String qry, Map<String, Object> namedParameters) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED");
  }

  @Override
  protected EObject loadEObject(EClass eClass, String idString) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED");
  }

  @Override
  public void refresh(EObject eObject) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED");
  }

  @Override
  public List<EObject> getReferingObjects(EObject eTarget, int maxResult, boolean includeContainmentReferences) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED");
  }

}
