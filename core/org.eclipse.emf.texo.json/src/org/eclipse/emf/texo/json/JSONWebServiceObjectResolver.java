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
 *   Dzmitry [zmicer] Harachka - implementation
 * </copyright>
 *
 * $Id: XMLServiceContext.java,v 1.6 2011/08/27 05:40:32 mtaal Exp $
 */
package org.eclipse.emf.texo.json;

import org.eclipse.emf.texo.ComponentProvider;
import org.eclipse.emf.texo.resolver.ObjectResolver;
import org.eclipse.emf.texo.resolver.WebServiceObjectResolver;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * An {@link ObjectResolver} which reads referenced objects using the url, through a webservice.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class JSONWebServiceObjectResolver extends WebServiceObjectResolver {
  public static final String JSON_CONTENT_TYPE = "application/json;charset=UTF-8"; //$NON-NLS-1$

  @Override
  protected Object deserialize(String urlStr, String content) {
    if (true) {
      return null;
    }
    try {
      final JSONModelConverter converter = ComponentProvider.getInstance().newInstance(JSONModelConverter.class);
      converter.setUriResolver(this);
      return converter.convert(new JSONObject(content));
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }
}
