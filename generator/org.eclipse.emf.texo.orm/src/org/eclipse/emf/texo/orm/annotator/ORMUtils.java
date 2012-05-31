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
 * $Id: GenerateModelJPACode.java,v 1.1 2011/10/26 05:29:39 mtaal Exp $
 */
package org.eclipse.emf.texo.orm.annotator;

import java.util.Properties;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.texo.component.ComponentProvider;
import org.eclipse.emf.texo.eclipse.ProjectPropertyUtil;
import org.eclipse.emf.texo.orm.ormannotations.EPackageORMAnnotation;

/**
 * ORM utility methods
 * 
 * @author mtaal
 */
public class ORMUtils {

  /**
   * Reads project properties and creates a {@link ORMMappingOptions} object and sets it in the
   * {@link ORMMappingOptions#setDefaultOptions(ORMMappingOptions)}. This is picked up during ORM and JPA code
   * generation if there is no {@link EPackageORMAnnotation} for an {@link EPackage}.
   */
  public static void setORMMappingOptionsFromProjectProperties(IProject project) {
    final Properties props = ProjectPropertyUtil.getProjectProperties(project);
    final ORMMappingOptions options = ComponentProvider.getInstance().newInstance(ORMMappingOptions.class);
    options.setAddOrderColumnToListMappings(isTrue(props.getProperty(ProjectPropertyUtil.ORM_ADD_ORDER_COLUMN)));
    options.setEnforceUniqueNames(isTrue(props.getProperty(ProjectPropertyUtil.ORM_ENFORCE_UNIQUE_NAMES)));
    options.setGenerateFullDbSchemaNames(isTrue(props
        .getProperty(ProjectPropertyUtil.ORM_GENERATE_FULL_DB_SCHEMA_NAMES)));
    options.setRenameSQLReservedNames(isTrue(props.getProperty(ProjectPropertyUtil.ORM_RENAME_SQL_RESERVED_NAMES)));
    if (props.getProperty(ProjectPropertyUtil.ORM_MAX_SQL_NAME_LENGTH) != null) {
      try {
        int val = Integer.parseInt(props.getProperty(ProjectPropertyUtil.ORM_MAX_SQL_NAME_LENGTH));
        if (val > 0) {
          options.setMaximumSqlNameLength(val);
        }
      } catch (NumberFormatException e) {
        // do nothing
      }
    }
    ORMMappingOptions.setDefaultOptions(options);
  }

  private static boolean isTrue(String value) {
    return value != null && value.equals("true");
  }
}
