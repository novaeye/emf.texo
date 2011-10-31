package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.SupportedBy;

/** 
 * The Dao implementation for the model object '<em><b>SupportedBy</b></em>'.
 * 
 * @generated 
 */
public class SupportedByDao extends BaseDao<SupportedBy> {

  /**
   * @generated
   */
  @Override
  public Class<SupportedBy> getEntityClass() {
    return SupportedBy.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getSupportedByEClass();
  }
}
