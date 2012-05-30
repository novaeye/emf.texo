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
 * $Id: EMFModelConverter.java,v 1.23 2011/08/29 05:16:04 mtaal Exp $
 */

package org.eclipse.emf.texo.converter;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.texo.component.TexoComponent;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;

/**
 * Compares {@link ModelObject} objects and reports the first encountered difference.
 * 
 * @author <a href="mtaal@elver.org">Martin Taal</a>
 * @see ModelObject
 */
public class ObjectComparator implements TexoComponent {

  private Stack<String> path = new Stack<String>();

  /**
   * Clears internal datastructure, must be called when doing subsequent compare calls.
   */
  public void clear() {
    path.clear();
  }

  public void compare(Object o1, Object o2) {
    if (o1 == o2) {
      return;
    }
    if (ModelResolver.getInstance().isModelEnabled(o1) != ModelResolver.getInstance().isModelEnabled(o2)) {
      throw new ObjectComparatorException(o1, o2, "One of these 2 is not model enabled: " + o1 + "/" + o2 + getPath());
    }
    final ModelObject<?> m1 = ModelResolver.getInstance().getModelObject(o1);
    final ModelObject<?> m2 = ModelResolver.getInstance().getModelObject(o2);
    compareType(m1, m2);

    for (EStructuralFeature eFeature : m1.eClass().getEAllStructuralFeatures()) {
      if (eFeature.isVolatile() || eFeature.isDerived()) {
        continue;
      }
      if (FeatureMapUtil.isFeatureMap(eFeature)) {
        copyFeatureMap(sourceModelObject, targetModelObject, eFeature);
      } else if (ModelUtils.isEMap(eFeature)) {
        copyMap(sourceModelObject, targetModelObject, (EReference) eFeature);
      } else if (eFeature.isMany()) {
        if (eFeature instanceof EAttribute) {
          copyManyEAttribute(sourceModelObject, targetModelObject, (EAttribute) eFeature);
        } else {
          copyManyEReference(sourceModelObject, targetModelObject, (EReference) eFeature);
        }
      } else if (eFeature instanceof EAttribute) {
        copySingleEAttribute(sourceModelObject, targetModelObject, (EAttribute) eFeature);
      } else {
        copySingleEReference(sourceModelObject, targetModelObject, (EReference) eFeature);
      }
    }
  }

  protected void compareManyEFeature(ModelObject<?> m1, ModelObject<?> m2, EStructuralFeature eFeature) {
    final Object v1 = m1.eGet(eFeature);
    final Object v2 = m2.eGet(eFeature);

    if (v1.getClass() != v2.getClass()) {
      throw new ObjectComparatorException(v1, v2, "Different many efeature value types " + v1 + "/" + v2 + getPath()); //$NON-NLS-1$//$NON-NLS-2$
    }

    if (ModelUtils.isEMap(eFeature)) {
      compareMapEFeature(m1, m2, eFeature);
    } else if (v1 instanceof Set<?>) {
    } else if (v2 instanceof List<?>) {
      compareListEFeature(m1, m2, eFeature);
    }
  }

  protected void compareMapEFeature(ModelObject<?> m1, ModelObject<?> m2, EStructuralFeature eFeature) {
    path.push(eFeature.getName());
    final Map<?, ?> c1 = (Map<?, ?>) m1.eGet(eFeature);
    final Map<?, ?> c2 = (Map<?, ?>) m2.eGet(eFeature);
    if (c1.size() != c2.size()) {
      throw new ObjectComparatorException(m1, m2, "Different collection sizes " + c1.size() + "/" + c2.size() //$NON-NLS-1$ //$NON-NLS-2$
          + getPath());
    }
    for (Object key : c1.keySet()) {
      final Object o1 = c1.get(key);
      final Object o2 = c2.get(key);
      path.push("[" + key + "]"); //$NON-NLS-1$//$NON-NLS-2$
      if (ModelResolver.getInstance().isModelEnabled(o1)) {
        compare(o1, o2);
      } else {
        compareValue(o1, o2, (EAttribute) eFeature);
      }
      path.pop();
    }
    path.pop();
  }

  protected void compareListEFeature(ModelObject<?> m1, ModelObject<?> m2, EStructuralFeature eFeature) {
    path.push(eFeature.getName());
    final Collection<?> c1 = (Collection<?>) m1.eGet(eFeature);
    final Collection<?> c2 = (Collection<?>) m2.eGet(eFeature);
    if (c1.size() != c2.size()) {
      throw new ObjectComparatorException(m1, m2, "Different collection sizes " + c1.size() + "/" + c2.size()
          + getPath());
    }
    final Iterator<?> i1 = c1.iterator();
    final Iterator<?> i2 = c2.iterator();
    int cnt = 0;
    while (i1.hasNext()) {
      final Object o1 = i1.next();
      final Object o2 = i2.next();
      path.push("[" + cnt + "]");
      if (eFeature instanceof EReference) {
        compare(o1, o2);
      } else {
        compareValue(o1, o2, (EAttribute) eFeature);
      }
      path.pop();
      cnt++;
    }
    path.pop();
  }

  protected void compareSingleEAttribute(ModelObject<?> m1, ModelObject<?> m2, EAttribute eAttribute) {
    path.push(eAttribute.getName());
    compareValue(m1.eGet(eAttribute), m2.eGet(eAttribute), eAttribute);
    path.pop();
  }

  protected void compareSingleEReference(ModelObject<?> m1, ModelObject<?> m2, EReference eReference) {
    path.push(eReference.getName());
    try {
      final Object o1 = m1.eGet(eReference);
      final Object o2 = m2.eGet(eReference);
      if (o1 == o2) {
        return;
      }
      if (o1 != null && o2 == null) {
        throw new ObjectComparatorException(o1, o2, "Different Values " + o1 + "/" + o2 + getPath());
      } else if (o1 == null && o2 != null) {
        throw new ObjectComparatorException(o1, o2, "Different Values " + o1 + "/" + o2 + getPath());
      }
      compare(o1, o2);
    } finally {
      path.pop();
    }

  }

  protected void compareValue(Object v1, Object v2, EAttribute eAttribute) {
    if (v1 == v2) {
      return;
    }
    if (v1 != null && !v1.equals(v2)) {
      throw new ObjectComparatorException(v1, v2, "Different values " + v1 + "/" + v2 + getPath());
    }

  }

  protected void compareType(ModelObject<?> m1, ModelObject<?> m2) {
    if (m1.eClass() != m2.eClass()) {
      throw new ObjectComparatorException(m1, m2, "Different EClasses " + m1.eClass().getName() + "/"
          + m2.eClass().getName() + getPath());
    }
  }

  protected String getPath() {
    final StringBuilder sb = new StringBuilder(" - path: ");
    for (String part : path) {
      sb.append("/" + part);
    }
    return sb.toString();
  }

  public class ObjectComparatorException extends RuntimeException {
    private Object o1;
    private Object o2;

    public ObjectComparatorException(Object o1, Object o2, String msg) {
      super(msg);
      this.o1 = o1;
      this.o2 = o2;
    }

    protected Object getO1() {
      return o1;
    }

    protected Object getO2() {
      return o2;
    }
  }
}