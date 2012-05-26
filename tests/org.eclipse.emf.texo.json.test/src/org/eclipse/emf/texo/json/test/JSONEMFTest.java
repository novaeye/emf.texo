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
 * $Id: XMLTest.java,v 1.16 2011/08/25 12:42:34 mtaal Exp $
 */

package org.eclipse.emf.texo.json.test;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.json.EMFJSONConverter;
import org.eclipse.emf.texo.json.JSONEMFConverter;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.test.TestUtils;
import org.json.JSONObject;
import org.junit.Assert;

/**
 * Test the conversion to and from JSON and EMF. For each test the following steps are done:
 * <ol>
 * <li>Generate test data set</li>
 * <li>Convert the test data set to json (json1)</li>
 * <li>Convert the json back to a {@link EObject} instance</li>
 * <li>Convert this list back to json (json22)</li>
 * <li>then the following should be true: json1.equals(json2)</li>
 * </ol>
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */
public class JSONEMFTest extends BaseJSONTest {

  public JSONEMFTest(String name) {
    super(name);
  }

  public void doRunTest() throws Exception {
    final MemoryObjectStore memObjectStore = ComponentProvider.getInstance().newInstance(MemoryObjectStore.class);

    final List<EObject> m1 = TestUtils.generateTestSet(1, 3, 3, 10000, getEPackages(), getEClasses());

    final EMFJSONConverter toJsonConverter = ComponentProvider.getInstance().newInstance(EMFJSONConverter.class);
    toJsonConverter.setObjectResolver(memObjectStore);
    toJsonConverter.setConvertNonContainedReferencedObjects(true);
    toJsonConverter.setMaxChildLevelsToConvert(-1);

    final Object json1 = toJsonConverter.convert(m1.get(0));

    final JSONEMFConverter fromJsonConverter = ComponentProvider.getInstance().newInstance(JSONEMFConverter.class);
    fromJsonConverter.setObjectResolver(memObjectStore);

    final EObject m2 = fromJsonConverter.convert((JSONObject) json1);

    final Object json2 = toJsonConverter.convert(m2);

    System.err.println(json1);
    System.err.println("---------------------------------------------");
    System.err.println(json2);

    Assert.assertEquals(json1.toString(), json2.toString());

    final EObject m3 = fromJsonConverter.convert((JSONObject) json2);
    final Object json3 = toJsonConverter.convert(m3);

    Assert.assertEquals(json2.toString(), json3.toString());
  }
}