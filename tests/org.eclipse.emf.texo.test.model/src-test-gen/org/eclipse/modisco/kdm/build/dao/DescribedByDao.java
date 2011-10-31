package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.DescribedBy;

/** 
 * The Dao implementation for the model object '<em><b>DescribedBy</b></em>'.
 * 
 * @generated 
 */
public class DescribedByDao extends BaseDao<DescribedBy> {

  /**
   * @generated
   */
  @Override
  public Class<DescribedBy> getEntityClass() {
    return DescribedBy.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getDescribedByEClass();
  }
}
