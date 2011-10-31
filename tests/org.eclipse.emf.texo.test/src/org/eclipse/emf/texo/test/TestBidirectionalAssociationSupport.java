/**
 * <copyright>
 *
 * Copyright (c) 2010 Springsite BV (The Netherlands) and others
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
 * $Id: TestBidirectionalAssociationSupport.java,v 1.2 2011/08/25 12:42:19 mtaal Exp $
 */

package org.eclipse.emf.texo.test;

import junit.framework.TestCase;

import org.eclipse.emf.texo.test.model.samples.rental.RentalCar;
import org.eclipse.emf.texo.test.model.samples.rental.RentalCarDriver;
import org.eclipse.emf.texo.test.model.samples.rental.RentalContract;
import org.eclipse.emf.texo.test.model.samples.rental.RentalContractLine;
import org.eclipse.emf.texo.test.model.samples.rental.RentalModelPackage;

/**
 * Tests support of bi-directional associations.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class TestBidirectionalAssociationSupport extends TestCase {

  public void testManyBidirectionalAssociations() {
    final RentalContract rentalContract1 = RentalModelPackage.INSTANCE.getModelFactory().createRentalContract();
    final RentalContract rentalContract2 = RentalModelPackage.INSTANCE.getModelFactory().createRentalContract();
    final RentalContractLine rentalContractLine1 = RentalModelPackage.INSTANCE.getModelFactory()
        .createRentalContractLine();
    final RentalContractLine rentalContractLine2 = RentalModelPackage.INSTANCE.getModelFactory()
        .createRentalContractLine();

    // add to a list
    rentalContract1.addToRentalContractLines(rentalContractLine1);
    rentalContract1.addToRentalContractLines(rentalContractLine2);
    assertTrue(rentalContractLine1.getRentalContract() == rentalContract1);
    assertTrue(rentalContract1.getRentalContractLines().contains(rentalContractLine1));

    // move to another list
    rentalContract2.addToRentalContractLines(rentalContractLine1);
    assertTrue(rentalContractLine1.getRentalContract() == rentalContract2);
    assertFalse(rentalContract1.getRentalContractLines().contains(rentalContractLine1));
    assertTrue(rentalContract2.getRentalContractLines().contains(rentalContractLine1));

    // remove from a list
    rentalContract1.removeFromRentalContractLines(rentalContractLine2);
    assertNull(rentalContractLine2.getRentalContract());
    assertFalse(rentalContract1.getRentalContractLines().contains(rentalContractLine2));

    // and add it again to the other
    rentalContract2.addToRentalContractLines(rentalContractLine2);
    assertTrue(rentalContractLine2.getRentalContract() == rentalContract2);
    assertTrue(rentalContract2.getRentalContractLines().contains(rentalContractLine2));
  }

  public void testSingleBidirectionalAssociations() {
    final RentalCar rentalCar1 = RentalModelPackage.INSTANCE.getModelFactory().createRentalCar();
    final RentalCar rentalCar2 = RentalModelPackage.INSTANCE.getModelFactory().createRentalCar();
    final RentalCarDriver rentalCarDriver1 = RentalModelPackage.INSTANCE.getModelFactory().createRentalCarDriver();

    rentalCar1.setCurrentDriver(rentalCarDriver1);
    assertTrue(rentalCar1.getCurrentDriver() == rentalCarDriver1);
    assertTrue(rentalCarDriver1.getCurrentRentalCar() == rentalCar1);
    rentalCar2.setCurrentDriver(rentalCarDriver1);
    assertTrue(rentalCar1.getCurrentDriver() == null);
    assertTrue(rentalCar2.getCurrentDriver() == rentalCarDriver1);
    assertTrue(rentalCarDriver1.getCurrentRentalCar() == rentalCar2);
    rentalCar2.setCurrentDriver(null);
    assertTrue(rentalCarDriver1.getCurrentRentalCar() == null);
  }
}