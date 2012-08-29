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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.texo.client.model.request.ActionType;
import org.eclipse.emf.texo.client.model.request.Parameter;
import org.eclipse.emf.texo.client.model.request.QueryReferingObjectsType;
import org.eclipse.emf.texo.client.model.request.QueryType;
import org.eclipse.emf.texo.client.model.request.RequestFactory;
import org.eclipse.emf.texo.client.model.request.RequestPackage;
import org.eclipse.emf.texo.client.model.response.ResponsePackage;
import org.eclipse.emf.texo.client.model.response.ResponseType;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.provider.IdProvider;
import org.eclipse.emf.texo.store.EObjectStore;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * {@link EObjectStore} concrete class which communicates with a remote server using json.
 * 
 * UNDER DEVELOPMENT
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class JSONEObjectStore extends EObjectStore {

  private static final String UTF8 = "UTF-8"; //$NON-NLS-1$
  private static final String POST_METHOD = "POST"; //$NON-NLS-1$
  private static final String GET_METHOD = "GET"; //$NON-NLS-1$

  public JSONEObjectStore() {
    setUseWebServiceUriFormat(true);
    // dummy calls to initialize
    RequestPackage.eINSTANCE.getActionType();
    ResponsePackage.eINSTANCE.getDocumentRoot();
  }

  protected String doHTTPRequest(String urlStr, String method, String content) throws Exception {
    String localUrlStr = urlStr == null ? getUri().toString() : urlStr;
    final URL url = new URL(localUrlStr);
    final HttpURLConnection conn = (HttpURLConnection) url.openConnection();

    conn.setRequestMethod(method);
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setUseCaches(false);
    conn.setRequestProperty("Accept-Charset", UTF8);

    if (content != null) {
      final byte[] bytes = content.getBytes(UTF8);
      conn.setRequestProperty("Content-Type", JSONWebServiceObjectResolver.JSON_CONTENT_TYPE);
      conn.setRequestProperty("Content-Length", String.valueOf(bytes.length));

      final OutputStream os = conn.getOutputStream();
      os.write(bytes);
      os.flush();
      os.close();
    }

    final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
    final StringBuilder sb = new StringBuilder();
    String line;
    while ((line = rd.readLine()) != null) {
      sb.append(line + "\n");
    }
    rd.close();
    return sb.toString();
  }

  @Override
  public void persist(List<EObject> toInsert, List<EObject> toUpdate, List<EObject> toDelete) {

    // do some sensible things...
    toUpdate.removeAll(toDelete);
    toInsert.removeAll(toDelete);
    toUpdate.removeAll(toInsert);

    // create a temporary proxy uri for the to insert ones
    // do this before the copyAll below
    // this ensures that the references are handled correctly
    // when converting to and from json
    for (EObject eObject : toInsert) {
      final URI tempURI = ModelUtils.makeTempURI(toURI(eObject.eClass(), "" + System.currentTimeMillis()));
      ((InternalEObject) eObject).eSetProxyURI(tempURI);
      addToCache(eObject);
    }

    final ActionType actionType = RequestFactory.eINSTANCE.createActionType();
    // make a copy to prevent change of the eContainer
    actionType.getDelete().addAll(EcoreUtil.copyAll(toDelete));
    actionType.getInsert().addAll(EcoreUtil.copyAll(toInsert));
    actionType.getUpdate().addAll(EcoreUtil.copyAll(toUpdate));

    final JSONObject jsonObject = doRequest(actionType, POST_METHOD);

    final JSONEMFConverter jsonEmfConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    jsonEmfConverter.setObjectResolver(this);
    try {
      // get the id of the inserted objects and link the previous eobject to them
      final JSONArray insertedJsonArray = jsonObject.getJSONArray(ResponsePackage.eINSTANCE
          .getResultType_Inserted().getName());
      int i = 0;
      for (EObject insertedEObject : toInsert) {
        final EAttribute idEAttribute = IdProvider.getInstance().getIdEAttribute(insertedEObject.eClass());
        
        final JSONObject insertedJsonObject = insertedJsonArray.getJSONObject(i++);
        // get the id from the jsonObject
        final Object id = insertedJsonObject.get(idEAttribute.getName());
        removeFromCache(((InternalEObject) insertedEObject).eProxyURI());
        ((InternalEObject) insertedEObject).eSetProxyURI(null);
        // use the eclass and id to create a URI
        // and add back to the cache
        // as now the correct uri can be computed
        final URI newUri = toURI(insertedEObject.eClass(), id + "");
        addToCache(newUri.toString(), insertedEObject);
      }
        
      // now the inserted objects can be converted safely

      // don't convert the outer object, otherwise the inner objects
      // will have a change in container
      final List<EObject> inserted = jsonEmfConverter.convert(insertedJsonArray);
      // also convert the updated objects as the server may have changed
      // their state
      jsonEmfConverter.convert(jsonObject.getJSONArray(ResponsePackage.eINSTANCE
          .getResultType_Updated().getName()));

      // remove the deleted ones
      for (EObject eObject : toDelete) {
        removeFromCache(toUri(eObject));
      }
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  protected JSONObject doRequest(EObject requestObject, String method) {
    try {
      final EMFJSONConverter emfJsonConverter = ComponentProvider.getInstance().newInstance(EMFJSONConverter.class);
      emfJsonConverter.setObjectResolver(this);
      String json = null;
      if (requestObject != null) {
        json = emfJsonConverter.convert(requestObject).toString();
      }
      final String result = doHTTPRequest(null, method, json);
      return new JSONObject(result);
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage(), e);
    }
  }

  /**
   * Query for a list of EObjects.
   */
  @Override
  public List<EObject> query(String qryStr, Map<String, Object> namedParameters, int firstResult, int maxResults) {
    final QueryType queryType = RequestFactory.eINSTANCE.createQueryType();

    for (String key : namedParameters.keySet()) {
      final Object value = namedParameters.get(key);
      if (value == null) {
        continue;
      }
      final Parameter parameter = RequestFactory.eINSTANCE.createParameter();
      parameter.setName(key);
      if (value instanceof java.sql.Timestamp) {
        parameter.setType("dateTime");
      } else if (value instanceof Date) {
        parameter.setType("date");
      }
      parameter.setValue(value);
      queryType.getParameters().add(parameter);
    }

    queryType.setQuery(qryStr);
    queryType.setFirstResult(firstResult);
    queryType.setMaxResults(maxResults);

    final JSONObject jsonObject = doRequest(queryType, POST_METHOD);

    final JSONEMFConverter jsonEmfConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    jsonEmfConverter.setObjectResolver(this);
    try {
      // don't convert the outer object, otherwise the inner objects
      // will have a change in container
      final List<EObject> data = jsonEmfConverter.convert(jsonObject.getJSONArray(ResponsePackage.eINSTANCE
          .getResponseType_Data().getName()));
      for (EObject eObject : data) {
        addToCache(eObject);
      }
      return data;
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Execute a count query in the database.
   */
  public long count(String qry, Map<String, Object> namedParameters) {
    final QueryType queryType = RequestFactory.eINSTANCE.createQueryType();

    for (String key : namedParameters.keySet()) {
      final Object value = namedParameters.get(key);
      if (value == null) {
        continue;
      }
      final Parameter parameter = RequestFactory.eINSTANCE.createParameter();
      parameter.setName(key);
      if (value instanceof java.sql.Timestamp) {
        parameter.setType("dateTime");
      } else if (value instanceof Date) {
        parameter.setType("date");
      } else {
        parameter.setType(value.getClass().toString());
      }
    }

    queryType.setQuery(qry);
    queryType.setDoCount(true);
    final JSONObject jsonObject = doRequest(queryType, POST_METHOD);
    final JSONEMFConverter jsonEmfConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    jsonEmfConverter.setObjectResolver(this);
    final ResponseType response = (ResponseType) jsonEmfConverter.convert(jsonObject);
    return response.getTotalRows();
  }

  @Override
  protected EObject loadEObject(EClass eClass, String idString) {
    try {
      final URI uri = toURI(eClass, idString);
      final String json = doHTTPRequest(uri.toString(), GET_METHOD, null);
      final JSONEMFConverter jsonEmfConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
      jsonEmfConverter.setObjectResolver(this);
      final EObject response = jsonEmfConverter.convert(new JSONObject(json));
      addToCache(response);
      return response;
    } catch (FileNotFoundException f) {
      return null;
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage(), e);
    }
  }

  @Override
  public void refresh(EObject eObject) {
    final EClass eClass = eObject.eClass();
    if (!IdProvider.getInstance().hasIdEAttribute(eClass)) {
      return;
    }
    final String idString = "" + eObject.eGet(IdProvider.getInstance().getIdEAttribute(eClass)); //$NON-NLS-1$
    loadEObject(eClass, idString);
  }

  @Override
  public List<EObject> getReferingObjects(EObject eTarget, int maxResult, boolean includeContainmentReferences) {
    final URI uri = toUri(eTarget);
    if (uri == null) {
      return Collections.emptyList();
    }
    final QueryReferingObjectsType queryType = RequestFactory.eINSTANCE.createQueryReferingObjectsType();

    queryType.setMaxResults(maxResult);
    queryType.setTargetUri(uri.toString());
    queryType.setIncludeContainment(includeContainmentReferences);

    final JSONObject jsonObject = doRequest(queryType, POST_METHOD);

    final JSONEMFConverter jsonEmfConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    jsonEmfConverter.setObjectResolver(this);
    try {
      // don't convert the outer object, otherwise the inner objects
      // will have a change in container
      final List<EObject> data = jsonEmfConverter.convert(jsonObject.getJSONArray(ResponsePackage.eINSTANCE
          .getResponseType_Data().getName()));
      for (EObject eObject : data) {
        addToCache(eObject);
      }
      return data;
    } catch (JSONException e) {
      throw new RuntimeException(e);
    }
  }
}
