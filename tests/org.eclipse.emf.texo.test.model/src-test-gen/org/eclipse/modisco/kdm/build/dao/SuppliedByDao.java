package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.SuppliedBy;

/** 
 * The Dao implementation for the model object '<em><b>SuppliedBy</b></em>'.
 * 
 * @generated 
 */
public class SuppliedByDao extends BaseDao<SuppliedBy> {

  /**
   * @generated
   */
  @Override
  public Class<SuppliedBy> getEntityClass() {
    return SuppliedBy.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getSuppliedByEClass();
  }
}
