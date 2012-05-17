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
 *
 * </copyright>
 *
 * $Id: EClassInstanceClassSetTest.java,v 1.4 2011/08/25 12:42:19 mtaal Exp $
 */
package org.eclipse.emf.texo.test;

import org.eclipse.emf.texo.test.model.issues.bz379796.Bz379796ModelPackage;
import org.eclipse.emf.texo.test.model.issues.bz379796.PriceType;
import org.junit.Assert;
import org.junit.Test;

public class TestBz379796 {

  @Test
  public void test() throws Exception {
    final PriceType priceType = Bz379796ModelPackage.INSTANCE.getModelFactory().createPriceType();
    Assert.assertTrue(priceType.getValue() == null);
    priceType.setValue(5);
    Assert.assertTrue(priceType.getValue() == 5);
    final Integer newInteger = new Integer(6);
    priceType.setValue(newInteger);
    Assert.assertTrue(priceType.getValue() == newInteger);
    priceType.setValue(null);
    Assert.assertTrue(priceType.getValue() == null);
  }
}
