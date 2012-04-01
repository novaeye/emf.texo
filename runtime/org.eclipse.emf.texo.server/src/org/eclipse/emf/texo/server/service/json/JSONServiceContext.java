/**
 * <copyright>
 *
 * Copyright (c) 2009, 2010, 2012 Springsite BV (The Netherlands) and others
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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.texo.ComponentProvider;
import org.eclipse.emf.texo.json.JSONModelConverter;
import org.eclipse.emf.texo.json.JSONWebServiceObjectResolver;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.server.service.ServiceConstants;
import org.eclipse.emf.texo.server.service.ServiceContext;
import org.eclipse.emf.texo.server.store.ObjectStore;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Contains JSON specific implementations of the {@link ServiceContext}.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class JSONServiceContext extends ServiceContext {

  public JSONServiceContext() {
    // set some defaults here
    setResponseContentType(JSONWebServiceObjectResolver.JSON_CONTENT_TYPE);
  }

  @Override
  public void setObjectStore(ObjectStore objectStore) {
    objectStore.setUseWebServiceUriFormat(true);
    super.setObjectStore(objectStore);
  }

  @Override
  protected String convertToResultFormat(Object object) {
    final ModelJSONConverter converter = ComponentProvider.getInstance().newInstance(ModelJSONConverter.class);
    if (getRequestParameters().containsKey(ServiceConstants.PARAM_CHILD_LEVELS)) {
      try {
        converter.setMaxChildLevelsToConvert(Integer.parseInt((String) getRequestParameters().get(
            ServiceConstants.PARAM_CHILD_LEVELS)));
      } catch (NumberFormatException e) {
        // ignore on purpose...
        converter.setMaxChildLevelsToConvert(2);
      }
    } else {
      converter.setMaxChildLevelsToConvert(2);
    }
    converter.setUriResolver(getObjectStore());
    final JSONObject jsonObject = converter.convert(object);
    return jsonObject.toString();
  }

  @Override
  public List<Object> getRequestData() {
    try {
      final JSONObject jsonObject = new JSONObject(getRequestContent());
      final JSONModelConverter converter = ComponentProvider.getInstance().newInstance(JSONModelConverter.class);
      converter.setUriResolver(getObjectStore());
      final Object result = converter.convert(jsonObject);
      final List<Object> resultList = new ArrayList<Object>();
      resultList.add(result);
      return resultList;
    } catch (JSONException e) {
      throw new RuntimeException(e.getMessage() + getRequestContent(), e);
    }
  }
}
