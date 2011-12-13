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
 * $Id: EAttributeORMAnnotator.java,v 1.19 2011/08/26 05:34:12 mtaal Exp $
 */

package org.eclipse.emf.texo.orm.annotator;

import java.sql.Timestamp;
import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.texo.generator.Annotator;
import org.eclipse.emf.texo.generator.GeneratorUtils;
import org.eclipse.emf.texo.modelgenerator.modelannotations.EAttributeModelGenAnnotation;
import org.eclipse.emf.texo.modelgenerator.modelannotations.ModelcodegeneratorPackage;
import org.eclipse.emf.texo.orm.annotations.model.orm.Basic;
import org.eclipse.emf.texo.orm.annotations.model.orm.CollectionTable;
import org.eclipse.emf.texo.orm.annotations.model.orm.Column;
import org.eclipse.emf.texo.orm.annotations.model.orm.ElementCollection;
import org.eclipse.emf.texo.orm.annotations.model.orm.Entity;
import org.eclipse.emf.texo.orm.annotations.model.orm.Enumerated;
import org.eclipse.emf.texo.orm.annotations.model.orm.Id;
import org.eclipse.emf.texo.orm.annotations.model.orm.Lob;
import org.eclipse.emf.texo.orm.annotations.model.orm.OneToMany;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrderColumn;
import org.eclipse.emf.texo.orm.annotations.model.orm.OrmFactory;
import org.eclipse.emf.texo.orm.annotations.model.orm.Temporal;
import org.eclipse.emf.texo.orm.annotations.model.orm.UniqueConstraint;
import org.eclipse.emf.texo.orm.annotations.model.orm.Version;
import org.eclipse.emf.texo.orm.ormannotations.EAttributeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EDataTypeORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.EEnumORMAnnotation;
import org.eclipse.emf.texo.orm.ormannotations.OrmannotationsPackage;

/**
 * Responsible for creating the {@link EAttributeORMAnnotation}.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.19 $
 */

public class EAttributeORMAnnotator extends EStructuralFeatureORMAnnotator implements
    Annotator<EAttributeORMAnnotation> {

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#annotate(org.eclipse.emf.texo.annotations.annotationsmodel
   * .ENamedElementAnnotation)
   */
  public void setAnnotationFeatures(EAttributeORMAnnotation annotation) {

    final EAttribute eAttribute = annotation.getEAttribute();
    final ORMNamingStrategy namingStrategy = getOrmNamingStrategy(eAttribute.getEContainingClass().getEPackage());
    if (eAttribute.getEAttributeType() instanceof EEnum) {
      copyAnnotationsFromEEnum(annotation);
    } else {
      copyAnnotationsFromDataType(annotation);
    }

    // don't do anything anymore if transient
    if (annotation.getTransient() != null) {
      if (GeneratorUtils.isEmptyOrNull(annotation.getTransient().getName())) {
        annotation.getTransient().setName(getName(eAttribute));
      }
      return;
    }

    if (annotation.getId() != null) {
      final Id id = annotation.getId();

      if (GeneratorUtils.isEmptyOrNull(id.getName())) {
        id.setName(getName(eAttribute));
      }

      return;
    }

    if (annotation.getVersion() != null) {
      final Version version = annotation.getVersion();

      if (GeneratorUtils.isEmptyOrNull(version.getName())) {
        version.setName(getName(eAttribute));
      }
      return;
    }

    final EAttributeModelGenAnnotation eAttributeModelGen = (EAttributeModelGenAnnotation) getAnnotationManager()
        .getAnnotation(eAttribute, ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation());
    // features which are part of a featuremap are never mapped as many features
    final boolean isPartOfFeatureMap = GeneratorUtils.isPartOfGroup(eAttribute);

    if (annotation.getTransient() != null) {
      if (GeneratorUtils.isEmptyOrNull(annotation.getTransient().getName())) {
        annotation.getTransient().setName(eAttributeModelGen.getValidJavaMemberName());
      }
      return;
    }

    if (FeatureMapUtil.isFeatureMap(eAttribute)) {
      if (annotation.getOneToMany() == null) {
        annotation.setOneToMany(OrmFactory.eINSTANCE.createOneToMany());
      }

      if (annotation.getFeatureMapEntity() == null) {
        annotation.setFeatureMapEntity(OrmFactory.eINSTANCE.createEntity());
      }
      final Entity featureMapEntity = annotation.getFeatureMapEntity();
      if (GeneratorUtils.isEmptyOrNull(featureMapEntity.getClass_())) {
        featureMapEntity.setClass(eAttributeModelGen.getFeatureMapQualifiedClassName());
      }
      if (GeneratorUtils.isEmptyOrNull(featureMapEntity.getName())) {
        featureMapEntity.setName(namingStrategy.getFeatureMapEntityName(eAttribute));
      }

      final OneToMany oneToMany = annotation.getOneToMany();
      oneToMany.setTargetEntity(eAttributeModelGen.getFeatureMapQualifiedClassName());
      oneToMany.setCascade(OrmFactory.eINSTANCE.createCascadeType());
      oneToMany.setOrphanRemoval(true);
      oneToMany.getCascade().setCascadeAll(OrmFactory.eINSTANCE.createEmptyType());
      oneToMany.setJoinTable(OrmFactory.eINSTANCE.createJoinTable());
      oneToMany.setOrphanRemoval(true);
      oneToMany.setName(getName(eAttribute));
      return;
    }

    final EDataType eDataType = eAttribute.getEAttributeType();
    boolean isLob = false;
    boolean isTime = false;
    boolean isDate = false;
    if (eDataType.getInstanceClass() != null) {
      isLob = eDataType.getInstanceClass().isArray() && eDataType.getInstanceClass().getComponentType() == byte.class;
      isTime = Timestamp.class == eDataType.getInstanceClass() || eDataType == XMLTypePackage.eINSTANCE.getDateTime();
      isDate = eDataType == XMLTypePackage.eINSTANCE.getDate() || eDataType.getInstanceClass() != null
          && Date.class.isAssignableFrom(eDataType.getInstanceClass());
    }
    final boolean isEnum = eDataType instanceof EEnum;

    if (!isPartOfFeatureMap && eAttribute.isMany()) {
      final ElementCollection elementCollection;
      if (annotation.getElementCollection() == null) {
        elementCollection = OrmFactory.eINSTANCE.createElementCollection();
        annotation.setElementCollection(elementCollection);
      } else {
        elementCollection = annotation.getElementCollection();
      }

      if (isLob) {
        final Lob lob = OrmFactory.eINSTANCE.createLob();
        elementCollection.setLob(lob);
      } else if (isTime && !elementCollection.isSetTemporal()) {
        elementCollection.setTemporal(Temporal.TIMESTAMP);
      } else if (!elementCollection.isSetTemporal() && isDate) {
        elementCollection.setTemporal(Temporal.DATE);
      }

      if (isEnum && elementCollection.getEnumerated() == null) {
        elementCollection.setEnumerated(Enumerated.STRING);
      }

      if (elementCollection.getCollectionTable() == null) {
        final CollectionTable collectionTable = OrmFactory.eINSTANCE.createCollectionTable();
        elementCollection.setCollectionTable(collectionTable);
      }
      if (GeneratorUtils.isEmptyOrNull(elementCollection.getCollectionTable().getName())) {
        elementCollection.getCollectionTable().setName(namingStrategy.getJoinTableName(eAttribute));
      }

      if (namingStrategy.isGenerateAllDBSchemaNames()) {
        if (elementCollection.getColumn() == null) {
          elementCollection.setColumn(OrmFactory.eINSTANCE.createColumn());
        }
        if (elementCollection.getColumn().getName() == null) {
          elementCollection.getColumn().setName(namingStrategy.getCollectionElementColumnName(eAttribute));
        }

        if (elementCollection.getCollectionTable().getJoinColumn().isEmpty()) {
          elementCollection.getCollectionTable().getJoinColumn().add(OrmFactory.eINSTANCE.createJoinColumn());
          elementCollection.getCollectionTable().getJoinColumn().get(0)
              .setName(namingStrategy.getJoinColumnName(eAttribute));
        }
        if (eAttribute.isUnique()) {
          final UniqueConstraint uniqueConstraint = OrmFactory.eINSTANCE.createUniqueConstraint();
          uniqueConstraint.getColumnName().add(elementCollection.getColumn().getName());
          uniqueConstraint.getColumnName().add(elementCollection.getCollectionTable().getJoinColumn().get(0).getName());
        }
      }

      final EAttributeModelGenAnnotation eAttributeModelGenAnnotation = (EAttributeModelGenAnnotation) getAnnotationManager()
          .getAnnotation(eAttribute, ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation());
      OrderColumn orderColumn = elementCollection.getOrderColumn();
      if (eAttributeModelGenAnnotation.isUseList() && elementCollection.getOrderBy() == null
          && elementCollection.getOrderColumn() == null) {
        orderColumn = OrmFactory.eINSTANCE.createOrderColumn();
        elementCollection.setOrderColumn(orderColumn);
      }

      if (orderColumn != null && GeneratorUtils.isEmptyOrNull(orderColumn.getName())
          && namingStrategy.isGenerateAllDBSchemaNames()) {
        orderColumn.setName(namingStrategy.getIndexColumnName(eAttribute));
      }

      if (GeneratorUtils.isEmptyOrNull(elementCollection.getName())) {
        elementCollection.setName(getName(eAttribute));
      }
      return;
    }

    if (annotation.getBasic() == null) {
      annotation.setBasic(OrmFactory.eINSTANCE.createBasic());
    }
    final Basic basic = annotation.getBasic();

    if (GeneratorUtils.isEmptyOrNull(basic.getName())) {
      basic.setName(getName(eAttribute));
    }

    if (isLob) {
      final Lob lob = OrmFactory.eINSTANCE.createLob();
      basic.setLob(lob);
    } else if (isTime && !basic.isSetTemporal()) {
      basic.setTemporal(Temporal.TIMESTAMP);
    } else if (!basic.isSetTemporal() && isDate) {
      basic.setTemporal(Temporal.DATE);
    }

    basic.setOptional(!eAttribute.isRequired());

    if (isEnum && basic.getEnumerated() == null) {
      basic.setEnumerated(Enumerated.STRING);
    }

    if (namingStrategy.isGenerateAllDBSchemaNames()) {
      if (basic.getColumn() == null) {
        basic.setColumn(OrmFactory.eINSTANCE.createColumn());
      }
      final Column column = basic.getColumn();
      if (column.getName() == null) {
        column.setName(namingStrategy.getColumnName(annotation.getEStructuralFeature()));
      }
    }
  }

  private void copyAnnotationsFromDataType(EAttributeORMAnnotation annotation) {
    final EDataTypeORMAnnotation eDataTypeORMAnnotation = (EDataTypeORMAnnotation) getAnnotationManager()
        .getAnnotation(annotation.getEAttribute().getEAttributeType(),
            OrmannotationsPackage.eINSTANCE.getEDataTypeORMAnnotation());
    // if the main features are already set return
    if (annotation.getId() != null || annotation.getVersion() != null || annotation.getBasic() != null
        || annotation.getElementCollection() != null) {
      return;
    }
    if (eDataTypeORMAnnotation.getId() != null) {
      annotation.setId(EcoreUtil.copy(eDataTypeORMAnnotation.getId()));
      return;
    }
    if (eDataTypeORMAnnotation.getBasic() != null) {
      annotation.setBasic(EcoreUtil.copy(eDataTypeORMAnnotation.getBasic()));
      return;
    }
    if (eDataTypeORMAnnotation.getTransient() != null) {
      annotation.setTransient(EcoreUtil.copy(eDataTypeORMAnnotation.getTransient()));
      return;
    }
    if (eDataTypeORMAnnotation.getVersion() != null) {
      annotation.setVersion(EcoreUtil.copy(eDataTypeORMAnnotation.getVersion()));
      return;
    }
    if (annotation.getEAttribute().isMany() && annotation.getElementCollection() == null) {
      if (eDataTypeORMAnnotation.getElementCollection() != null) {
        annotation.setElementCollection(EcoreUtil.copy(eDataTypeORMAnnotation.getElementCollection()));
      }
    }
  }

  private void copyAnnotationsFromEEnum(EAttributeORMAnnotation annotation) {
    final EEnumORMAnnotation eEnumORMAnnotation = (EEnumORMAnnotation) getAnnotationManager().getAnnotation(
        annotation.getEAttribute().getEAttributeType(), OrmannotationsPackage.eINSTANCE.getEEnumORMAnnotation());
    // if the main features are already set return
    if (annotation.getId() != null || annotation.getVersion() != null || annotation.getBasic() != null
        || annotation.getElementCollection() != null) {
      return;
    }
    if (eEnumORMAnnotation.getBasic() != null) {
      annotation.setBasic(EcoreUtil.copy(eEnumORMAnnotation.getBasic()));
      return;
    }
    if (eEnumORMAnnotation.getTransient() != null) {
      annotation.setTransient(EcoreUtil.copy(eEnumORMAnnotation.getTransient()));
      return;
    }
    if (eEnumORMAnnotation.getVersion() != null) {
      annotation.setVersion(EcoreUtil.copy(eEnumORMAnnotation.getVersion()));
      return;
    }
    if (annotation.getEAttribute().isMany() && annotation.getElementCollection() == null) {
      if (eEnumORMAnnotation.getElementCollection() != null) {
        annotation.setElementCollection(EcoreUtil.copy(eEnumORMAnnotation.getElementCollection()));
      }
    }
  }

  /*
   * (non-Javadoc)
   * 
   * @seeorg.eclipse.emf.texo.generator.Annotator#postAnnotating(org.eclipse.emf.texo.annotations.
   * annotationsmodel.ENamedElementAnnotation)
   */
  public void postAnnotating(EAttributeORMAnnotation annotation) {
  }

  private String getName(EAttribute eAttribute) {
    final EAttributeModelGenAnnotation modelGenAnnotation = (EAttributeModelGenAnnotation) getAnnotationManager()
        .getAnnotation(eAttribute, ModelcodegeneratorPackage.eINSTANCE.getEAttributeModelGenAnnotation());
    return modelGenAnnotation.getValidJavaMemberName();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.eclipse.emf.texo.generator.Annotator#getAnnotationEClass()
   */
  public EClass getAnnotationEClass() {
    return OrmannotationsPackage.eINSTANCE.getEAttributeORMAnnotation();
  }
}