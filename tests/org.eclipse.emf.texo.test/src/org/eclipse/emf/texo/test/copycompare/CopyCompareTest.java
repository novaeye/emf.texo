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

package org.eclipse.emf.texo.test.copycompare;

import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.converter.EMFModelConverter;
import org.eclipse.emf.texo.converter.ObjectComparator;
import org.eclipse.emf.texo.converter.ObjectCopier;
import org.eclipse.emf.texo.datagenerator.DataGeneratorUtils;
import org.eclipse.emf.texo.json.ModelJSONConverter;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.store.MemoryObjectStore;
import org.eclipse.emf.texo.test.TestUtils;
import org.junit.Assert;

/**
 * Test copy and compare for an unnamed model package.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.16 $
 */
public class CopyCompareTest extends TestCase {

  private ModelPackage modelPackage;

  public CopyCompareTest(ModelPackage modelPackage) {
    super(modelPackage.getNsURI());
    this.modelPackage = modelPackage;
  }

  @Override
  public void runTest() throws Exception {
    final MemoryObjectStore memObjectStore = ComponentProvider.getInstance().newInstance(MemoryObjectStore.class);

    final List<EObject> eObjects = TestUtils.generateTestSet(1, 3, 3, 10000,
        Collections.singletonList(modelPackage.getEPackage()), getEClasses());
    final EMFModelConverter emfModelConverter = new EMFModelConverter();
    emfModelConverter.setUriResolver(memObjectStore);
    final List<Object> objects = emfModelConverter.convert(eObjects);
    memObjectStore.addData(emfModelConverter.getAllConvertedObjects());

    for (Object m1 : objects) {
      final Object m2 = getObjectCopier().copy(m1);
      Assert.assertTrue(m1 != m2);
      getObjectComparator().compare(m1, m2);
      final Object json1 = getToJsonConverter(memObjectStore).convert(m1);
      final Object json2 = getToJsonConverter(memObjectStore).convert(m2);
      Assert.assertEquals(json1.toString(), json2.toString());
    }
  }

  private ModelJSONConverter getToJsonConverter(MemoryObjectStore store) {
    final ModelJSONConverter toJsonConverter = ComponentProvider.getInstance().newInstance(ModelJSONConverter.class);
    toJsonConverter.setObjectResolver(store);
    toJsonConverter.setConvertNonContainedReferencedObjects(false);
    toJsonConverter.setMaxChildLevelsToConvert(1);
    toJsonConverter.setPreSortManyValues(true);
    toJsonConverter.setSerializeTitleProperty(false);
    return toJsonConverter;
  }

  private ObjectCopier getObjectCopier() {
    final ObjectCopier objectCopier = ComponentProvider.getInstance().newInstance(ObjectCopier.class);
    objectCopier.setCopyChildren(true);
    objectCopier.setCopyReferences(true);
    return objectCopier;
  }

  private ObjectComparator getObjectComparator() {
    final ObjectComparator objectComparator = ComponentProvider.getInstance().newInstance(ObjectComparator.class);
    return objectComparator;
  }

  public List<EClass> getEClasses() {
    return DataGeneratorUtils.getRootEClasses(Collections.singletonList(modelPackage.getEPackage()));
  }
}
