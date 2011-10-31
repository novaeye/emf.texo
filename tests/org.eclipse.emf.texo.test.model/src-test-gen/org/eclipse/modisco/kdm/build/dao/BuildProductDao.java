package org.eclipse.modisco.kdm.build.dao;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.texo.server.store.BaseDao;
import org.eclipse.modisco.kdm.build.BuildModelPackage;
import org.eclipse.modisco.kdm.build.BuildProduct;

/** 
 * The Dao implementation for the model object '<em><b>BuildProduct</b></em>'.
 * 
 * @generated 
 */
public class BuildProductDao extends BaseDao<BuildProduct> {

  /**
   * @generated
   */
  @Override
  public Class<BuildProduct> getEntityClass() {
    return BuildProduct.class;
  }

  /**
   * @generated
   */
  @Override
  public EClass getEClass() {
    return BuildModelPackage.INSTANCE.getBuildProductEClass();
  }
}
