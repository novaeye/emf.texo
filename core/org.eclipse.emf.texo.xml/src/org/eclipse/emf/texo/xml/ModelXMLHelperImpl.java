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
 * $Id: ModelXMLHelperImpl.java,v 1.9 2011/08/25 12:39:16 mtaal Exp $
 */

package org.eclipse.emf.texo.xml;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.model.ModelFactory;

/**
 * Extends the {@link XMLHelperImpl} instance. This redirect createFromString/convertToString methods to use the
 * generated {@link ModelFactory} to convert data types.
 * 
 * TODO: use the {@link ModelFactory#getId(org.eclipse.emf.texo.model.ModelObject)} to compute the id and href of an
 * object.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 */
public class ModelXMLHelperImpl extends XMLHelperImpl {

  public ModelXMLHelperImpl(final XMLResource resource) {
    super(resource);
  }

  @Override
  protected Object createFromString(final EFactory eFactory, final EDataType eDataType, final String value) {
    // for EENum the literal is stored in the xml, the standard call to the
    // super.createFromString
    // uses the EENumLiteral.name() which does not match the literal.
    if (eDataType instanceof EEnum) {
      final EEnum eeNum = (EEnum) eDataType;
      // TODO: checks both literal and name, should only be one of the two
      // is there for backwards compatibility
      EEnumLiteral eeNumLiteral = eeNum.getEEnumLiteralByLiteral(value);
      if (eeNumLiteral == null) {
        eeNumLiteral = eeNum.getEEnumLiteral(value);
      }
      if (eeNumLiteral == null) {
        throw new IllegalArgumentException("The value '" + value //$NON-NLS-1$
            + "' is not a valid enumerator of '" //$NON-NLS-1$
            + eDataType.getName() + "'"); //$NON-NLS-1$
      }
      return eeNumLiteral;
    }

    // to prevent an error when the string is empty, should be handled
    // through an option!
    // TODO: optionize this
    final boolean isString = eDataType == XMLTypePackage.eINSTANCE.getString()
        || eDataType == XMLTypePackage.eINSTANCE.getNormalizedString();
    if (value != null && value.length() == 0 && !isString) {
      return null;
    }
    return super.createFromString(eFactory, eDataType, value);
  }
}