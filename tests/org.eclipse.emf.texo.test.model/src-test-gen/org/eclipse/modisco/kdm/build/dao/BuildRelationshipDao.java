package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.BuildRelationship;

/**
 * The Dao implementation for the model object '<em><b>BuildRelationship</b></em>'.
 * 
 * @generated
 */
public class BuildRelationshipDao extends BaseDao<BuildRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<BuildRelationship> getEntityClass() {
    return BuildRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildRelationshipEClass();
  }
}
