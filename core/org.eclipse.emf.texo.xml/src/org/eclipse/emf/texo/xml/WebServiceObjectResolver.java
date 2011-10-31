package org.eclipse.emf.texo.xml;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.texo.ComponentProvider;

/**
 * An {@link ObjectResolver} which reads referenced objects using the url, through a webservice.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class WebServiceObjectResolver extends DefaultObjectResolver {

  final Map<String, Object> objectCache = new HashMap<String, Object>();

  public WebServiceObjectResolver() {
    this.setUseWebServiceUriFormat(true);
  }

  @Override
  public Object fromUri(URI objectUri) {
    final String urlStr = objectUri.toString();
    if (objectCache.containsKey(urlStr)) {
      return objectCache.get(urlStr);
    }

    try {
      final Object result = readObject(urlStr);
      if (result != null) {
        objectCache.put(urlStr, result);
        return result;
      }
    } catch (Exception e) {
      throw new IllegalStateException(e);
    }
    return super.fromUri(objectUri);
  }

  protected Object readObject(String urlStr) throws Exception {
    final HttpURLConnection hc = createConnection(urlStr);
    final InputStream is = hc.getInputStream();
    final StringBuilder sb = new StringBuilder();
    BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8")); //$NON-NLS-1$
    String line;
    while ((line = reader.readLine()) != null) {
      sb.append(line).append("\n"); //$NON-NLS-1$
    }

    final ModelXMLLoader xmlLoader = ComponentProvider.getInstance().newInstance(ModelXMLLoader.class);
    xmlLoader.setLoadAsXMI(urlStr.contains("xmi=true")); //$NON-NLS-1$
    xmlLoader.setReader(new StringReader(sb.toString()));
    xmlLoader.getEMFModelConverter().setUriResolver(this);
    return xmlLoader.read().get(0);
  }

  protected HttpURLConnection createConnection(String urlStr) throws Exception {
    final URL url = new URL(urlStr);
    final HttpURLConnection hc = (HttpURLConnection) url.openConnection();
    hc.setRequestMethod("GET"); //$NON-NLS-1$
    hc.setAllowUserInteraction(false);
    hc.setDefaultUseCaches(false);
    hc.setDoOutput(true);
    hc.setDoInput(true);
    hc.setInstanceFollowRedirects(true);
    hc.setUseCaches(false);
    return hc;
  }

}
