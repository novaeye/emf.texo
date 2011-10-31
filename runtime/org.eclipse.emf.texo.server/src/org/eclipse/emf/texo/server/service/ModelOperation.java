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
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: ModelOperation.java,v 1.6 2011/08/29 05:22:24 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service;

import org.eclipse.emf.texo.server.store.ObjectStore;

/**
 * The base abstract class for model operations. Model operations can for example be crud operations on model instances.
 * 
 * @author <a href="mailto:zmicer.harachka@gmail.com">Dzmitry [zmicer] Harachka</a>
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public abstract class ModelOperation {

  private ServiceContext serviceContext;

  /**
   * Execute the model operation, if an object store is set then the operation is executed within an object store
   * transaction. The {@link ObjectStore#begin()} method is called before the operation, {@link ObjectStore#commit()} is
   * called after the operation.
   * 
   * This method calls the method {@link ModelOperation#internalExecute()} which is implemented by a specific subclass.
   * 
   * If an exception occurs the transaction is rolledback ({@link ObjectStore#rollback()} and an error result is
   * returned (see {@link ServiceContext#createErrorResult(Throwable)}).
   */
  public void execute() {
    try {
      if (getObjectStore() != null) {
        getObjectStore().begin();
      }
      internalExecute();
      if (getObjectStore() != null) {
        getObjectStore().commit();
      }
    } catch (Throwable t) {
      t.printStackTrace(System.err);
      getServiceContext().createErrorResult(t);
      if (getObjectStore() != null) {
        getObjectStore().rollback();
      }
    }
  }

  /**
   * Method implemented by the subclass to actually execute the operation.
   */
  protected abstract void internalExecute();

  public ServiceContext getServiceContext() {
    return serviceContext;
  }

  public void setServiceContext(ServiceContext serviceContext) {
    this.serviceContext = serviceContext;
  }

  public ObjectStore getObjectStore() {
    return getServiceContext().getObjectStore();
  }

  /**
   * @return the value of the {@link ServiceConstants#PARAM_FIRST_RESULT} parameter, if not set -1 is returned.
   */
  protected int getFirstResult() {
    return getNumberParameter(ServiceConstants.PARAM_FIRST_RESULT);
  }

  /**
   * @return the value of the {@link ServiceConstants#PARAM_MAX_RESULTS} parameter, if not set -1 is returned.
   */
  protected int getMaxResults() {
    return getNumberParameter(ServiceConstants.PARAM_MAX_RESULTS);
  }

  private int getNumberParameter(String paramName) {
    if (getServiceContext().getRequestParameters().containsKey(paramName)) {
      try {
        return Integer.parseInt((String) getServiceContext().getRequestParameters().get(paramName));
      } catch (NumberFormatException e) {
        // ignore on purpose
        return -1;
      }
    }
    return -1;
  }

  /**
   * Closes the underlying objectstore, if it was set.
   */
  public void close() {
    if (getObjectStore() != null) {
      getObjectStore().close();
    }
  }
}