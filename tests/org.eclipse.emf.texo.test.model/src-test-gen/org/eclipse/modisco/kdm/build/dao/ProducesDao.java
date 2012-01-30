package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.Produces;

/**
 * The Dao implementation for the model object '<em><b>Produces</b></em>'.
 * 
 * @generated
 */
public class ProducesDao extends BaseDao<Produces> {

  /**
   * @generated
   */
  @Override
  public Class<Produces> getEntityClass() {
    return Produces.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getProducesEClass();
  }
}
