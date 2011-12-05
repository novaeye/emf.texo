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
 * $Id: JSONServiceContext.java,v 1.4 2011/08/25 14:34:45 mtaal Exp $
 */
package org.eclipse.emf.texo.server.service.json;

import java.util.List;

import org.eclipse.emf.texo.server.service.ServiceContext;

/**
 * Contains JSON specific implementations of the {@link ServiceContext}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class JSONServiceContext extends ServiceContext {

  public static final String CONTENT_TYPE = "application/json;charset=UTF-8"; //$NON-NLS-1$

  public JSONServiceContext() {
    // set some defaults here
    setResponseContentType(CONTENT_TYPE);
  }

  @Override
  protected String convertToResultFormat(Object object) {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED"); //$NON-NLS-1$
  }

  @Override
  public List<Object> getRequestData() {
    throw new UnsupportedOperationException("TO BE IMPLEMENTED"); //$NON-NLS-1$
  }
}
