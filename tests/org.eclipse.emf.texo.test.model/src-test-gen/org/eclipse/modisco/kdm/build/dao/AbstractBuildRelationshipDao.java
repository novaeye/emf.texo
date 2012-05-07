package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.AbstractBuildRelationship;
import org.eclipse.modisco.kdm.build.BuildModelPackage;

/**
 * The Dao implementation for the model object '<em><b>AbstractBuildRelationship</b></em>'.
 * 
 * @generated
 */
public class AbstractBuildRelationshipDao extends BaseDao<AbstractBuildRelationship> {

  /**
   * @generated
   */
  @Override
  public Class<AbstractBuildRelationship> getEntityClass() {
    return AbstractBuildRelationship.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getAbstractBuildRelationshipEClass();
  }
}
