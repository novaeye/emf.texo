package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.Consumes;

/** 
 * The Dao implementation for the model object '<em><b>Consumes</b></em>'.
 * 
 * @generated 
 */
public class ConsumesDao extends BaseDao<Consumes> {

  /**
   * @generated
   */
  @Override
  public Class<Consumes> getEntityClass() {
    return Consumes.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getConsumesEClass();
  }
}
