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

import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.JSONTexoResource;
import org.eclipse.emf.texo.resolver.DefaultObjectResolver;
import org.eclipse.emf.texo.server.store.CurrentEntityManagerRequestFilter;
import org.eclipse.emf.texo.server.store.EntityManagerProvider;
import org.eclipse.emf.texo.server.test.ws.TestEntityManagerCleanUpServlet;
import org.eclipse.emf.texo.server.test.ws.TestEntityManagerRequestFilter;
import org.eclipse.emf.texo.server.web.JSONRestWebServiceServlet;
import org.eclipse.emf.texo.store.TexoResource;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.junit.After;
import org.junit.Before;

/**
 * Tests the {@link JSONTexoResource}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.4 $
 */
public class JSONTexoResourceTest extends TexoResourceTest {

  private Server server;

  private static final int PORT = 8080;
  private static final String CONTEXTNAME = "texo"; //$NON-NLS-1$
  protected static final String JSONWS = "jsonws"; //$NON-NLS-1$

  /**
   * @return the base url of the webservice
   */
  protected String getBaseURL() {
    return "http://localhost:" + PORT + "/" + CONTEXTNAME + "/" + JSONWS; //$NON-NLS-1$//$NON-NLS-2$
  }

  @Before
  @Override
  public void setUp() throws Exception {
    super.setUp();

    DefaultObjectResolver.setServerUri(getBaseURL());

    server = new Server(PORT);

    ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
    context.setContextPath("/" + CONTEXTNAME); //$NON-NLS-1$
    server.setHandler(context);

    EntityManagerProvider.getInstance().setUseCurrentEntityManagerPattern(true);

    final JSONRestWebServiceServlet jsonRestWebServiceServlet = new JSONRestWebServiceServlet();
    context.addServlet(new ServletHolder(jsonRestWebServiceServlet), "/" + JSONWS + "/*"); //$NON-NLS-1$ //$NON-NLS-2$

    final TestEntityManagerCleanUpServlet testEMServlet = new TestEntityManagerCleanUpServlet();
    context.addServlet(new ServletHolder(testEMServlet), "/testEM"); //$NON-NLS-1$ 

    final EnumSet<DispatcherType> all = EnumSet.of(DispatcherType.ASYNC, DispatcherType.ERROR, DispatcherType.FORWARD,
        DispatcherType.INCLUDE, DispatcherType.REQUEST);

    context.addFilter(TestEntityManagerRequestFilter.class, "/*", all); //$NON-NLS-1$
    context.addFilter(CurrentEntityManagerRequestFilter.class, "/*", all); //$NON-NLS-1$

    server.start();
  }

  @Override
  @After
  public void tearDown() throws Exception {
    super.tearDown();
    server.stop();
    server.destroy();
    server = null;
  }

  @Override
  protected TexoResource createResource() {
    return createResource(getBaseURL());
  }

  @Override
  protected TexoResource createResource(String uriString) {
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put("http", new JSONTexoResourceFactory());
    return (TexoResource) resourceSet.createResource(URI.createURI(uriString));
  }

  private static class JSONTexoResourceFactory implements Resource.Factory {

    public Resource createResource(URI uri) {
      final JSONTexoResource resource = ComponentProvider.getInstance().newInstance(JSONTexoResource.class);
      resource.setURI(uri);
      return resource;
    }
  }
}
